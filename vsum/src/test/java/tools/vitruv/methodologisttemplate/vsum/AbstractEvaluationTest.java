package tools.vitruv.methodologisttemplate.vsum;

import language.TGGRule;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.*;
import tools.vitruv.change.propagation.ChangePropagationSpecification;
import tools.vitruv.change.testutils.TestUserInteraction;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;
import tools.vitruv.dsls.tgg.emoflonintegration.Timer;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationResult;
import tools.vitruv.dsls.tgg.emoflonintegration.patternmatching.VitruviusBackwardConversionMatch;
import tools.vitruv.framework.views.CommittableView;
import tools.vitruv.framework.views.View;
import tools.vitruv.framework.views.ViewTypeFactory;
import tools.vitruv.framework.vsum.VirtualModel;
import tools.vitruv.framework.vsum.VirtualModelBuilder;
import tools.vitruv.methodologisttemplate.vsum.ChangePropSpec.JavaToUmlCPS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class AbstractEvaluationTest {
    static Logger logger = Logger.getLogger(AbstractEvaluationTest.class);

    /*
     * Vitruivus configuration
     */
    public final String VITRUVIUS_PROJECT_NAME;
    public final Path VITRUVIUS_PROJECTS_PATH;
    public Path vitruviusProjectPath;
    public VirtualModel currentVsum;
    public TGGChangePropagationSpecification currentCPS;

    /*
     * IbeX Project configuration
     */
    public static Path IBEX_PROJECT_ROOT;
    public static final Path CORR_RELATIVE_PATH =     Path.of("instances/corr.xmi");
    public static final Path PROTOCOL_RELATIVE_PATH = Path.of("instances/protocol.xmi");

    /*
     * Model files
     */
    public static Path TARGET_MODEL_PATH;
    public static String SOURCE_MODEL_PATH_STRING;

    /*
     * TestClass -> testRunName -> TimerMap (Variable -> Timer)
     */
    private static final Map<Class<?>, Map<String,Map<String, Timer>>> testRun_averageTimers = new HashMap<>();
    private static final Map<Class<?>, Map<String,Map<String, Timer>>> testRun_medianTimers = new HashMap<>();

    public Set<EClass> targetRootEClasses;

    public AbstractEvaluationTest(String vitruviusProjectName, Set<EClass> targetRootEClasses) {
        VITRUVIUS_PROJECT_NAME = vitruviusProjectName;
        VITRUVIUS_PROJECTS_PATH = Path.of("target/" + VITRUVIUS_PROJECT_NAME);
        this.targetRootEClasses = targetRootEClasses;
    }



    @BeforeAll
    static void setup() {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
    }

    @BeforeEach
    void wipeVsumCorrAndProtocol(TestInfo testInfo) {
        // wipe corr and protocol This is done before, not afterwards, to be able to debug.
        logger.info("eclipse-ibex-workspace: " + IBEX_PROJECT_ROOT.toFile().getAbsoluteFile());
        logger.info("setupCorrAndProtocol: Wiping corr.xmi and protocol.xmi");

        try {
            Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH));
            Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH));

//            FileUtils.deleteDirectory(VITRUVIUS_PROJECT_PATH.toFile());
        } catch (IOException e) {
            throw new RuntimeException("Could not wipe the VSUM data, CORR or PROTOCOL file:" + e.getMessage(), e);
        }

        createNewCPSAndVSUM(testInfo);
    }

    @AfterEach
    void storeEvalData(TestInfo testInfo) throws IOException {
        // rule matches --> appliedRuleMatches.txt
        Path ruleApplicationMatchesFile = vitruviusProjectPath.resolve("appliedRuleMatches.txt");
        int currentRun = 0;
        Files.writeString(ruleApplicationMatchesFile,
                "============================================= [Change Propagation run " + ++currentRun + "] =============================================\n" +
                        getCurrentChangePropagationResults()
                                .stream().map(result ->
                                        result.getAppliedMatches().stream()
                                                .map(VitruviusBackwardConversionMatch::toEvalString)
                                                .collect(Collectors.joining("\n"))
                                ).collect(Collectors.joining("\n\n============================================= [Change Propagation run " + ++currentRun + "] =============================================\n")));

        // copy instances folder from ibex project
        Path ibexFilesPath = vitruviusProjectPath.resolve("ibexFiles/");
        Files.createDirectories(ibexFilesPath);
        Files.copy(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH), ibexFilesPath.resolve("corr.xmi"));
        Files.copy(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH), ibexFilesPath.resolve("protocol.xmi"));

        Path timeMeasurementsFile = vitruviusProjectPath.resolve("timeMeasurements");
        currentRun = 0;


        Files.writeString(timeMeasurementsFile,
                "============================================= [Change Propagation run " + ++currentRun + "] =============================================\n" +
                        getCurrentChangePropagationResults()
                                .stream()
                                .map(result -> result.getTimeMeasurements().entrySet().stream()
                                        .sorted(Map.Entry.comparingByKey())
                                        .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                                        .collect(Collectors.joining("\n"))
                                )
                                .collect(Collectors.joining("\n\n============================================= [Change Propagation run " + ++currentRun + "] =============================================\n"))
                        + "\n\n=======================================================================================================================================\n"
                        + "=======================================================================================================================================\n"
                        + "\n============================================= [AVERAGE over all " + getCurrentChangePropagationResults().size() + " runs] =============================================\n"
                        + setAverageTimesAndGetString(testInfo)
                        + "\n\n============================================= [MEDIAN over all " + getCurrentChangePropagationResults().size() + " runs] =============================================\n"
                        + setMedianTimesAndGetString(testInfo)
//                        + "\n\n============================================= [Standard Derivation over all " + getCurrentChangePropagationResults().size() + " runs] =============================================\n"
//                        + getStdDerivationTimesString()
        );

    }

    private String setAverageTimesAndGetString(TestInfo testInfo) {
        Set<String> keys =  getCurrentChangePropagationResults().getLast().getTimeMeasurements().keySet();
        Map<String, Timer> measurementKeyToAverageTimer = new HashMap<>();
        for (String key : keys) {// add all timers
            measurementKeyToAverageTimer.put(key, new Timer(0, getAverageNanos(getCurrentChangePropagationResults(), key)));
        }
        testRun_averageTimers.computeIfAbsent(testInfo.getTestClass().get(), testClass -> new HashMap<>())
                .put(testInfo.getDisplayName(), measurementKeyToAverageTimer);
        return measurementKeyToAverageTimer.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }

    private String setMedianTimesAndGetString(TestInfo testInfo) {
        Set<String> keys =  getCurrentChangePropagationResults().getLast().getTimeMeasurements().keySet();
        Map<String, Timer> measurementKeyToMedianTimer = new HashMap<>();
        for (String key : keys) {// add all timers
            List<Long> sortedNanos = getCurrentChangePropagationResults().stream()
                    .map(result -> result.getTimeMeasurements().get(key))
                    .map(timer -> timer.getTime(TimeUnit.NANOSECONDS))
                    .sorted()
                    .toList();
            int size = sortedNanos.size();
            measurementKeyToMedianTimer.put(key, new Timer(
                    0,
                    (size % 2 == 0)
                            ? (sortedNanos.get(size/2) + sortedNanos.get(size/2 - 1)) / 2
                            : sortedNanos.get(size/2)
            ));
        }
        testRun_medianTimers.computeIfAbsent(testInfo.getTestClass().get(), testClass -> new HashMap<>())
                .put(testInfo.getDisplayName(), measurementKeyToMedianTimer);
        return measurementKeyToMedianTimer.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }

    private String getStdDerivationTimesString() {

        Set<String> keys =  getCurrentChangePropagationResults().getLast().getTimeMeasurements().keySet();
        Map<String, Timer> measurementKeyToStdDerivationTimer = new HashMap<>();
        for (String key : keys) {// add all timers
            double divisor = getCurrentChangePropagationResults().size() - 1; // n - 1
            long average = getAverageNanos(getCurrentChangePropagationResults(), key);
            //
            double dividend = getCurrentChangePropagationResults().stream()
                    .map(result -> result.getTimeMeasurements().get(key).getTime(TimeUnit.NANOSECONDS))
                    .map(nanos -> Math.pow((nanos - average), 2))
                    .reduce(Double::sum).get();

            measurementKeyToStdDerivationTimer.put(
                    key, new Timer(0,
                            (long) Math.sqrt(dividend/divisor)) // sqrt( SUM((x_i - avg)²) / (n - 1))
            );
        }
        return measurementKeyToStdDerivationTimer.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }
    private long getAverageNanos(List<VitruviusTGGChangePropagationResult> stichprobe, String key) {
        long summedNanos = stichprobe.stream()
                .map(result -> result.getTimeMeasurements().get(key))
                .reduce(Timer::add)
                .get().getTime(TimeUnit.NANOSECONDS);
        return summedNanos / stichprobe.size();
    }

    List<VitruviusTGGChangePropagationResult> getCurrentChangePropagationResults() {
        return currentCPS.getVitruviusTGGChangePropagationResults();
    }

    // no problem if written multiple times, is always the same...
    @AfterEach
    void storeGlobalEvalData() throws IOException {
        Path tggRulesInfoPath = VITRUVIUS_PROJECTS_PATH.resolve("tggRulesInfo.txt");
        VitruviusTGGChangePropagationResult lastResult = getCurrentChangePropagationResults().getLast();
        String fileContent = "============================================= [ TGG Rule Info ] =============================================\n"
                + "Number of intact rules:  " + lastResult.getIntactRules().size() + "\n"
                + "Number of corrupt rules: " + lastResult.getCorruptRules().size() + "\n"
                + "Total number of rules:   " + (lastResult.getIntactRules().size() + lastResult.getCorruptRules().size()) + "\n"
                + "============================================= [Intact TGGRules] =============================================\n"
                + lastResult.getIntactRules().stream().map(TGGRule::getName).collect(Collectors.joining("\n"))
                +  "\n============================================= [Corrupt TGGRules] =============================================\n"
                + lastResult.getCorruptRules().stream().map(TGGRule::getName).collect(Collectors.joining("\n"));
        Files.writeString(tggRulesInfoPath, fileContent);

    }

    // no problem if written multiple times, the last one counts.
    @AfterEach
    void storeGlobalEvalDataAfterAll(TestInfo testInfo) throws IOException {
        // AVERAGE overview
        Path averageTimeMeasurementsAccumulationPath = VITRUVIUS_PROJECTS_PATH.resolve("averageTimeMeasurementsAccumulation.txt");
        Map<String, Map<String,Timer>> averageTimersForClass = testRun_averageTimers.get(testInfo.getTestClass().get());
        String averageTimeMeasurementsAcc_fileContent =
                "============================================= [ AVERAGE Time Measurements ] =============================================\n"
                        + averageTimersForClass.entrySet().stream()
                        .sorted((a, b) -> getNumberOutOfString(a.getKey()).compareTo(getNumberOutOfString(b.getKey())))
                        .map(testRunNameToTimersMap ->
                                "\n--------------------------------------------- [ " + testRunNameToTimersMap.getKey() + " ] ---------------------------------------------\n"
                                        + testRunNameToTimersMap.getValue().entrySet().stream()
                                        .sorted(Map.Entry.comparingByKey())
                                        .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                                        .collect(Collectors.joining("\n"))
                        ).collect(Collectors.joining("\n"));
        Files.writeString(averageTimeMeasurementsAccumulationPath, averageTimeMeasurementsAcc_fileContent);

        // MEDIAN overview
        Path medianTimeMeasurementsAccumulationPath = VITRUVIUS_PROJECTS_PATH.resolve("medianTimeMeasurementsAccumulation.txt");
        Map<String, Map<String,Timer>> medianTimersForClass = testRun_medianTimers.get(testInfo.getTestClass().get());
        String medianTimeMeasurementsAcc_fileContent =
                "============================================= [ MEDIAN Time Measurements ] =============================================\n"
                        + medianTimersForClass.entrySet().stream()
                        .sorted((a, b) -> compareTestMethodNames(a.getKey(), b.getKey()))
                        .map(testRunNameToTimersMap ->
                                "\n--------------------------------------------- [ " + testRunNameToTimersMap.getKey() + " ] ---------------------------------------------\n"
                                        + testRunNameToTimersMap.getValue().entrySet().stream()
                                        .sorted(Map.Entry.comparingByKey())
                                        .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                                        .collect(Collectors.joining("\n"))
                        ).collect(Collectors.joining("\n"));
        Files.writeString(medianTimeMeasurementsAccumulationPath, medianTimeMeasurementsAcc_fileContent);
    }

    /**
     * For sorting by size (and hipe or not hipe), not alphabetically
     */
    int compareTestMethodNames(String a, String b) {
        String hipeString = "_hipe";
        if (a.contains(hipeString) && !b.contains(hipeString)) {
            return 1;
        } else if (!a.contains(hipeString) && b.contains(hipeString)) {
            return -1;
        } else {
            return getNumberOutOfString(a).compareTo(getNumberOutOfString(b));
        }
    }

    Integer getNumberOutOfString(String s) {
        String numberString = s.replaceAll("[a-zA-Z()]|_","");
        return numberString.isEmpty() ? 0 : Integer.parseInt(numberString);
    }

    void createNewCPSAndVSUM(TestInfo testInfo) {
        logger.info("setupCorrAndProtocol: Wiping corr.xmi and protocol.xmi");
        vitruviusProjectPath = VITRUVIUS_PROJECTS_PATH.resolve(testInfo.getDisplayName().replaceAll("\\(\\)", ""));
        TARGET_MODEL_PATH = vitruviusProjectPath.resolve("uml_instance.model");
        SOURCE_MODEL_PATH_STRING = vitruviusProjectPath.resolve("java_instance.model").toString();
        currentCPS = new JavaToUmlCPS(
                IBEX_PROJECT_ROOT.toFile(),
                targetRootEClasses,
                URI.createURI(TARGET_MODEL_PATH.toString()));
        currentVsum = createVirtualModel(currentCPS, vitruviusProjectPath);
    }

    public VirtualModel createVirtualModel(ChangePropagationSpecification cps, Path vitruviusProjectPath) {
        return new VirtualModelBuilder()
                .withStorageFolder(vitruviusProjectPath)
                .withUserInteractorForResultProvider(new TestUserInteraction.ResultProvider(new TestUserInteraction()))
                .withChangePropagationSpecifications(cps)
                .buildAndInitialize();
    }

    public View getDefaultView(VirtualModel vsum) {
        var selector = vsum.createSelector(ViewTypeFactory.createIdentityMappingViewType("default"));
        selector.getSelectableElements().forEach(it -> selector.setSelected(it, true));
        return selector.createView();
    }

    /**
     * Applies modifications from the given modificationFunction and commits the changes afterwards, triggering the change propagation
     */
    public void modifyView(CommittableView view, Consumer<CommittableView> modificationFunction) {
        modificationFunction.accept(view);
        view.commitChanges();
    }
}
