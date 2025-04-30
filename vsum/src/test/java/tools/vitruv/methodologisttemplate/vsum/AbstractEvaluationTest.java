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
    void storeEvalData() throws IOException {
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

        //TODO time (?)
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
                        + "\n\n============================================= [AVERAGE over all " + getCurrentChangePropagationResults().size() + " runs] =============================================\n"
                        + getAverageTimesString()
                        + "\n\n============================================= [MEDIAN over all " + getCurrentChangePropagationResults().size() + " runs] =============================================\n"
                        + getMedianTimesString()
        );

    }

    private String getAverageTimesString() {
        Set<String> keys =  getCurrentChangePropagationResults().getLast().getTimeMeasurements().keySet();
        Map<String, Timer> measurementKeyToAverageTimer = new HashMap<>();
        for (String key : keys) {// add all timers
            long summedNanos = getCurrentChangePropagationResults().stream()
                    .map(result -> result.getTimeMeasurements().get(key))
                    .reduce(Timer::add)
                    .get().getTime(TimeUnit.NANOSECONDS);
            measurementKeyToAverageTimer.put(key, new Timer(0, summedNanos / getCurrentChangePropagationResults().size()));
        }
        return measurementKeyToAverageTimer.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
    }

    private String getMedianTimesString() {
        Set<String> keys =  getCurrentChangePropagationResults().getLast().getTimeMeasurements().keySet();
        Map<String, Timer> measurementKeyToAverageTimer = new HashMap<>();
        for (String key : keys) {// add all timers
            List<Long> sortedNanos = getCurrentChangePropagationResults().stream()
                    .map(result -> result.getTimeMeasurements().get(key))
                    .map(timer -> timer.getTime(TimeUnit.NANOSECONDS))
                    .sorted()
                    .toList();
            int size = sortedNanos.size();
            measurementKeyToAverageTimer.put(key, new Timer(
                    0,
                    (size % 2 == 0)
                            ? (sortedNanos.get(size/2) + sortedNanos.get(size/2 - 1)) / 2
                            : sortedNanos.get(size/2)
            ));
        }
        return measurementKeyToAverageTimer.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> "  - " + entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining("\n"));
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
//        Path ibexFilesPath = vitruviusProjectPath.resolve("ibexFiles/");
//        Files.createDirectories(ibexFilesPath);
//        Files.copy(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH), ibexFilesPath.resolve("corr.xmi"));
//        Files.copy(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH), ibexFilesPath.resolve("protocol.xmi"));
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
//    private VirtualModel createDefaultVirtualModel() {
//        return createVirtualModel(new Model2Model2ChangePropagationSpecification());
//    }

    public View getDefaultView(VirtualModel vsum) {
        var selector = vsum.createSelector(ViewTypeFactory.createIdentityMappingViewType("default"));
        selector.getSelectableElements().forEach(it -> selector.setSelected(it, true));
        return selector.createView();
    }

    /**
     * Applies modifications from the given modificationFunction and commits the changes afterwards, triggering the change propagation
     * @param view
     * @param modificationFunction
     */
    public void modifyView(CommittableView view, Consumer<CommittableView> modificationFunction) {
        modificationFunction.accept(view);
        view.commitChanges();
    }

    void onlyView(View view, Consumer<View> viewFunction) {
        viewFunction.accept(view);
    }

    public void sleepKSeconds(long seconds, String message) {
        logger.info("Sleeping " + seconds + " seconds:" + message);
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
