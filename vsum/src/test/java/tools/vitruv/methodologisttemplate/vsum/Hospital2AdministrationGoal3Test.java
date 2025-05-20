package tools.vitruv.methodologisttemplate.vsum;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.impl.AdministrationExamplePackageImpl;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.impl.HospitalExamplePackageImpl;
import edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.tgg.operational.strategies.PropagationDirectionHolder;
import org.junit.jupiter.api.*;
import tools.vitruv.change.composite.description.VitruviusChange;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusBackwardConversionTGGEngine;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationIbexEntrypoint;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationRegistrationHelper;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationResult;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.hipe.VitruviusHiPETGGEngine;
import tools.vitruv.methodologisttemplate.vsum.ChangePropSpec.HospitalToAdministrationCPS;
import tools.vitruv.methodologisttemplate.vsum.util.ModelgenVitruviusHiPETGGEngine;
import tools.vitruv.methodologisttemplate.vsum.util.TGGModelAndChangeSequenceGenerator;
import tools.vitruv.methodologisttemplate.vsum.util.TGGModelGenRegistrationHelper;

//import java.io.Exception;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Hospital2AdministrationGoal3Test extends AbstractEvaluationTest {

    static Logger logger = Logger.getLogger(Hospital2AdministrationGoal3Test.class);
    private static final HospitalExamplePackage HOSPITAL = HospitalExamplePackage.eINSTANCE;
    private static final AdministrationExamplePackage ADMINISTRATION = AdministrationExamplePackage.eINSTANCE;

    private TGGModelAndChangeSequenceGenerator modelAndChangeSequenceGenerator;
    private List<VitruviusTGGChangePropagationResult> changePropagationResults;

    private final String SOURCE_RELATIVE_PATH = "instances/src.xmi";
    private final String TARGET_RELATIVE_PATH = "instances/trg.xmi";


    public Hospital2AdministrationGoal3Test() {
        super("Hospital2AdministrationGoal3", Set.of(InsurancePackage.eINSTANCE.getInsuranceDatabase()));
        this.changePropagationResults =  new LinkedList<>();
        IBEX_PROJECT_ROOT = Path.of("../eclipse-ibex-workspace/git/emoflon-ibex-tutorial/Hospital2AdministrationSolutions");
    }

    @Override
    void createNewCPSAndVSUM(TestInfo testInfo) {
        logger.info("setupCorrAndProtocol: Wiping corr.xmi and protocol.xmi");
        vitruviusProjectPath = VITRUVIUS_PROJECTS_PATH.resolve(testInfo.getDisplayName().replaceAll("\\(\\)", ""));
        TARGET_MODEL_PATH = vitruviusProjectPath.resolve("hospital_instance.model");
        SOURCE_MODEL_PATH_STRING = vitruviusProjectPath.resolve("administration_instance.model").toString();
        currentCPS = new HospitalToAdministrationCPS(
                IBEX_PROJECT_ROOT.toFile(),
                AdministrationExamplePackage.eINSTANCE.getAdministration(),
                URI.createURI(TARGET_MODEL_PATH.toString()));
        currentVsum = createVirtualModel(currentCPS, vitruviusProjectPath);
    }

    @BeforeEach
    void wipeCPResults() {
        changePropagationResults = new LinkedList<>();
    }

    @BeforeEach
    void prepareModelGen() throws Exception {
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH));
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH));
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(SOURCE_RELATIVE_PATH));
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(TARGET_RELATIVE_PATH));

        Files.createFile(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH));
        Files.createFile(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH));
        Files.createFile(IBEX_PROJECT_ROOT.resolve(SOURCE_RELATIVE_PATH));
        Files.createFile(IBEX_PROJECT_ROOT.resolve(TARGET_RELATIVE_PATH));
        
        modelAndChangeSequenceGenerator = new TGGModelAndChangeSequenceGenerator(
                new TGGModelGenRegistrationHelper()
                        .withBlackInterpeter(new ModelgenVitruviusHiPETGGEngine())
                        .withIbexProjectPath(IBEX_PROJECT_ROOT.toFile())
                        .withSRCMetamodelPackage(HOSPITAL)
                        .withSRCMetamodelPlatformUri(HospitalExamplePackageImpl.eNS_URI)
                        .withTRGMetamodelPackage(ADMINISTRATION)
                        .withTRGMetamodelPlatformUri(AdministrationExamplePackageImpl.eNS_URI)
        );
    }


    void testSingleRun(int size, boolean useHipe) throws Exception {
        VitruviusChange<EObject> vitruviusChange = modelAndChangeSequenceGenerator
                .generateModels(size, "HospitaltoAdministrationRule", List.of(
                        "DepartmentRule",
                        "DoctorShiftplanRule",
                        "DoctorToPatient",
                        "NurseShiftplanRule",
                        "PatientInReception",
                        "PatientInRoom",
                        "RoomRule"
                ))
                .generateChangeSequenceForCreated();

        wipeCorrProtocolAndTarget();

//        currentCPS.propagateNonAtomicChange(vitruviusChange, null, null);
        changePropagationResults.add(new VitruviusTGGChangePropagationIbexEntrypoint(new VitruviusTGGChangePropagationRegistrationHelper()
                .withPropagationDirection(PropagationDirectionHolder.PropagationDirection.FORWARD)
                .withIbexProjectPath(IBEX_PROJECT_ROOT.toFile())
                .withPatternMatcher(
                        useHipe ? new VitruviusHiPETGGEngine()
                                : new VitruviusBackwardConversionTGGEngine(vitruviusChange, PropagationDirectionHolder.PropagationDirection.FORWARD)
                )
                .withSRCModel(modelAndChangeSequenceGenerator.getSourceModel())
                .withTRGModel(modelAndChangeSequenceGenerator.getTargetModel())
                .withSRCMetamodelPlatformUri("platform:/resource/HospitalExample/model/HospitalExample.ecore")
                .withTRGMetamodelPlatformUri("platform:/resource/AdministrationExample/model/AdministrationExample.ecore")
                .withSRCMetamodelPackage(HOSPITAL)
                .withTRGMetamodelPackage(ADMINISTRATION)
                .withUseShortcutRules(false)
        ).propagateChanges());
    }

    void test(int size, boolean useHipe) throws Exception {
        System.out.println("\n\n\n----[ Running " + Thread.currentThread().getStackTrace()[2].getMethodName() + " ]----");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(300); // for quick tests to avoid external influences to overspan multiple runs, which defeats the purpose of multiple runs.
            prepareModelGen();
            testSingleRun(size, useHipe);
            Path ibexFilesPath = vitruviusProjectPath.resolve("ibexFiles/run_" + i + "_vitruvTGG/");
            Files.createDirectories(ibexFilesPath);
            Files.copy(IBEX_PROJECT_ROOT.resolve(SOURCE_RELATIVE_PATH), ibexFilesPath.resolve("src.xmi"));
            Files.copy(IBEX_PROJECT_ROOT.resolve(TARGET_RELATIVE_PATH), ibexFilesPath.resolve("trg.xmi"));
            Files.copy(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH), ibexFilesPath.resolve("corr.xmi"));
            Files.copy(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH), ibexFilesPath.resolve("protocol.xmi"));
        }
    }

    @Test
    void test_8() throws Exception { test(8, false);  }
    @Test
    void test_8_hipe() throws Exception { test(8, true);  }

    @Test
    void test_16() throws Exception { test(16, false);  }
    @Test
    void test_16_hipe() throws Exception { test(16, true);  }

    @Test
    void test_32() throws Exception { test(32, false);  }
    @Test
    void test_32_hipe() throws Exception { test(32, true);  }

    @Test
    void test_64() throws Exception { test(64, false);  }
    @Test
    void test_64_hipe() throws Exception { test(64, true);  }

    @Test
    void test_128() throws Exception { test(128, false);  }
    @Test
    void test_128_hipe() throws Exception { test(128, true);  }

    @Test
    void test_256() throws Exception { test(256, false);  }
    @Test
    void test_256_hipe() throws Exception { test(256, true);  }

    @Test
    void test_512() throws Exception { test(512, false);  }
    @Test
    void test_512_hipe() throws Exception { test(512, true);  }

    @Test
    void test_1024() throws Exception { test(1024, false);  }
    @Test
    void test_1024_hipe() throws Exception { test(1024, true);  }

    @Test
    void test_2048() throws Exception { test(2048, false);  }
    @Test
    void test_2048_hipe() throws Exception { test(2048, true);  }

//    @Disabled("takes too long")
    @Test
    void test_4096() throws Exception { test(4096, false);  }

//    @Disabled("takes too long")
    @Test
    void test_4096_hipe() throws Exception { test(4096, true);  }

    @Override
    List<VitruviusTGGChangePropagationResult> getCurrentChangePropagationResults() {
        return changePropagationResults;
    }

    private void wipeCorrProtocolAndTarget() throws Exception {
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH));
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH));
    }
}
