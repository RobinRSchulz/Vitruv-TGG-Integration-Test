package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.UMLPackageImpl;
import org.emftext.language.java.JavaPackage;
import org.emftext.language.java.impl.JavaPackageImpl;
import org.emoflon.ibex.tgg.operational.strategies.PropagationDirectionHolder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tools.vitruv.change.composite.description.VitruviusChange;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusBackwardConversionTGGEngine;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationIbexEntrypoint;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationRegistrationHelper;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationResult;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.hipe.VitruviusHiPETGGEngine;
import tools.vitruv.methodologisttemplate.vsum.util.ModelgenDemoclesTGGEngine;
import tools.vitruv.methodologisttemplate.vsum.util.TGGModelAndChangeSequenceGenerator;
import tools.vitruv.methodologisttemplate.vsum.util.TGGModelGenRegistrationHelper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Java2UmlEvaluationGoal3Test extends AbstractEvaluationTest {
    static Logger logger = Logger.getLogger(Java2UmlEvaluationGoal3Test.class);

    private static final UMLPackage UML = UMLPackage.eINSTANCE;
    private static final JavaPackage JAVA = JavaPackage.eINSTANCE;

    private TGGModelAndChangeSequenceGenerator modelAndChangeSequenceGenerator;
    private List<VitruviusTGGChangePropagationResult> changePropagationResults;

    private String SOURCE_RELATIVE_PATH = "instances/src.xmi";
    private String TARGET_RELATIVE_PATH = "instances/trg.xmi";


    public Java2UmlEvaluationGoal3Test() {
//        super("Java2UmlEvaluationGoal3", Set.of(UML.getPackage()));
//        IBEX_PROJECT_ROOT = Path.of("../eclipse-ibex-workspace/Java2Uml");
        super("Java2UmlEvaluationGoal3", Set.of(UML.getPackage()));
        this.changePropagationResults =  new LinkedList<>();
        IBEX_PROJECT_ROOT = Path.of("../eclipse-ibex-workspace/Java2Uml");
    }

//    @Override
//    void createNewCPSAndVSUM(TestInfo testInfo) {
//        logger.info("setupCorrAndProtocol: Wiping corr.xmi and protocol.xmi");
//        vitruviusProjectPath = VITRUVIUS_PROJECTS_PATH.resolve(testInfo.getDisplayName().replaceAll("\\(\\)", ""));
//        TARGET_MODEL_PATH = vitruviusProjectPath.resolve("hospital_instance.model");
//        SOURCE_MODEL_PATH_STRING = vitruviusProjectPath.resolve("administration_instance.model").toString();
//        currentCPS = new JavaToUmlCPS(
//                IBEX_PROJECT_ROOT.toFile(),
//                AdministrationExamplePackage.eINSTANCE.getAdministration(),
//                URI.createURI(TARGET_MODEL_PATH.toString()));
//        currentVsum = createVirtualModel(currentCPS, vitruviusProjectPath);
//    }

    @BeforeEach
    void wipeCPResults() {
        changePropagationResults = new LinkedList<>();
    }

    @BeforeEach
    void prepareModelGen() throws IOException {
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
//                        .withBlackInterpeter(new ModelgenVitruviusHiPETGGEngine())
//                        .withBlackInterpeter(new DemoclesTGGEngine())
                        .withBlackInterpeter(new ModelgenDemoclesTGGEngine())
                        .withIbexProjectPath(IBEX_PROJECT_ROOT.toFile())
                        .withSRCMetamodelPackage(JAVA)
                        .withSRCMetamodelPlatformUri(JavaPackageImpl.eNS_URI)
                        .withTRGMetamodelPackage(UML)
                        .withTRGMetamodelPlatformUri(UMLPackageImpl.eNS_URI)
        );
    }


    void testSingleRun(int size, boolean useHipe) throws IOException {
        VitruviusChange<EObject> vitruviusChange = modelAndChangeSequenceGenerator
                .generateModels(size, "RootJavaPackageToUmlPackage", List.of(
                        "ClassImplementToClassImplement",
                        "InterfaceMethodToMethod",
                        "JavaCompilationUnitToExistingUmlModel",
                        "ClassAttributeToProperty",
                        "ClassToUmlClass",
                        "ExistingSuperClassToSuperClass",
                        "InterfaceToUmlInterface",
                        "OrdinaryConstructorParameterToParameter",
                        "EnumConstantToEnumConstant",
//                        "RootJavaPackageToUmlPackage",
                        "SuperInterfaceToSuperInterface",
                        "EnumToUmlEnum",
                        "InterfaceConstructorToConstructor",
                        "OrdinaryMethodParameterToParameter",
                        "VariableLengthMethodParameterToParameter",
                        "ExistingSuperInterfaceToSuperInterface",
                        "SuperClassToSuperClass",
                        "JavaFirstCompilationUnitToUmlModel",
                        "ClassMethodToMethod",
                        "ExistingClassImplementToClassImplement",
                        "VariableLengthConstructorParameterToParameter",
                        "ClassConstructorToConstructor",
                        "EnumAttributeToProperty"
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
                .withSRCMetamodelPlatformUri("platform:/plugin/org.emftext.language.java/metamodel/java.ecore")
                .withTRGMetamodelPlatformUri("platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore")
                .withSRCMetamodelPackage(JAVA)
                .withTRGMetamodelPackage(UML)
                .withUseShortcutRules(false)
        ).propagateChanges());

    }

    void test(int size, boolean useHipe) throws IOException {
        System.out.println("\n\n\n----[ Running " + Thread.currentThread().getStackTrace()[2].getMethodName() + " ]----");;
        for (int i = 0; i < 5; i++) {
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

//    @Test
//    void test_001warmupIgnoreme() throws IOException { test(69); }

    @Test
    void test_8() throws IOException { test(8, false);  }
    @Test
    void test_8_hipe() throws IOException { test(8, true);  }

    @Test
    void test_16() throws IOException { test(16, false);  }
    @Test
    void test_16_hipe() throws IOException { test(16, true);  }

    @Test
    void test_32() throws IOException { test(32, false);  }
    @Test
    void test_32_hipe() throws IOException { test(32, true);  }

    @Test
    void test_64() throws IOException { test(64, false);  }
    @Test
    void test_64_hipe() throws IOException { test(64, true);  }

    @Test
    void test_128() throws IOException { test(128, false);  }
    @Test
    void test_128_hipe() throws IOException { test(128, true);  }

    @Test
    void test_256() throws IOException { test(256, false);  }
    @Test
    void test_256_hipe() throws IOException { test(256, true);  }

    @Test
    void test_512() throws IOException { test(512, false);  }
    @Test
    void test_512_hipe() throws IOException { test(512, true);  }
//
//    @Test
//    void test_1024() throws IOException { test(1024, false);  }
//    @Test
//    void test_1024_hipe() throws IOException { test(1024, true);  }

    // takes too long (over 20 mins)
//    @Test
//    void test_2048() throws IOException { test(2048, false);  }
//    @Test
//    void test_2048_hipe() throws IOException { test(2048, true);  }
//    @Test
//    void test_4096() throws IOException { test(4096);  }

    @Override
    List<VitruviusTGGChangePropagationResult> getCurrentChangePropagationResults() {
        return changePropagationResults;
    }

    private void wipeCorrProtocolAndTarget() throws IOException {
        //TODO also wipe target if necessary...
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH));
        Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH));
    }


}
