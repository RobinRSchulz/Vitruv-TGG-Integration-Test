package tools.vitruv.methodologisttemplate.vsum;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.emftext.language.java.classifiers.Class;
import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersFactory;
import org.emftext.language.java.containers.Package;
import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.MembersFactory;
import org.emftext.language.java.modifiers.Final;
import org.emftext.language.java.modifiers.ModifiersFactory;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.TypesFactory;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;
import tools.vitruv.framework.views.CommittableView;
import tools.vitruv.framework.vsum.VirtualModel;
import tools.vitruv.methodologisttemplate.vsum.ChangePropSpec.JavaToUmlCPS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tools.vitruv.methodologisttemplate.vsum.TGGResultAssertions.assertFileContainsLines;

/**
 * This represents (parts of) the evaluation, which for convenience, is implemented with junit.
 * Tests correctness of the application of each pattern.
 */
public class Java2UmlEvaluationTest extends AbstractTest {

    private static Path TARGET_MODEL_PATH;

    public Java2UmlEvaluationTest() {
        super("Java2UmlEvaluation");
    }

    public void testBasicEvaluation() {
//        Model2Factory.eINSTANCE.createEntity().
//        UMLPackage.Literals.MODEL
//        JavaFactory
//        MembersFactory.eINSTANCE.createField()
//        ClassifiersFactory.eINSTANCE.createClass().getAnnotationsAndModifiers();
//        UMLFactory.eINSTANCE.createClass().createGeneralization(null);
        UMLFactory.eINSTANCE.createParameter().getUpper();
        UMLFactory.eINSTANCE.createLiteralBoolean();
        UMLPackage.eINSTANCE.getPackage();
    }


    public static final Path IBEX_PROJECT_ROOT = Path.of("C:\\Users\\XPS-15\\IdeaProjects\\Vitruv-TGG-Integration-Test\\eclipse-ibex-workspace\\Java2Uml");
    public static final Path CORR_RELATIVE_PATH =     Path.of("instances\\corr.xmi");
    public static final Path PROTOCOL_RELATIVE_PATH = Path.of("instances\\protocol.xmi");
    static Logger logger = Logger.getLogger(Java2UmlEvaluationTest.class);


    private TGGChangePropagationSpecification currentCPS;
    private VirtualModel currentVsum;

    @BeforeAll
    static void setup() {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
    }

    @BeforeEach
    void wipeVsumCorrAndProtocol() {
        // wipe corr and protocol This is done before, not afterwards, to be able to debug.
        logger.info("setupCorrAndProtocol: Wiping corr.xmi and protocol.xmi");
        try {
            Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH));
            Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH));

            FileUtils.deleteDirectory(VITRUVIUS_PROJECT_PATH.toFile());
        } catch (IOException e) {
            throw new RuntimeException("Could not wipe the VSUM data, CORR or PROTOCOL file:" + e.getMessage(), e);
        }

        createNewCPSAndVSUM();
    }

    void createNewCPSAndVSUM() {
        logger.info("setupCorrAndProtocol: Wiping corr.xmi and protocol.xmi");
        TARGET_MODEL_PATH = VITRUVIUS_PROJECT_PATH.resolve("uml_instance.model");
        currentCPS = new JavaToUmlCPS(
                IBEX_PROJECT_ROOT.toFile(),
                UMLPackage.eINSTANCE.getPackage(),
                URI.createURI(TARGET_MODEL_PATH.toString()));
        currentVsum = createVirtualModel(currentCPS);
    }

    @Test
    void testJavaPackageToUmlPackage() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());

    }
    @Test
    void testJavaCompilationUnitToUmlModel() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());

    }

    @Test
    void testClassToUmlClass() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(3, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
    }
    @Test
    void testInterfaceToUmlInterface() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Interface javaInterface = ClassifiersFactory.eINSTANCE.createInterface();
            javaInterface.setName("interfees");
            compilationUnit.getClassifiers().add(javaInterface);

        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(3, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
    }
    @Test
    void testEnumToUmlEnum() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Enumeration javaEnum = ClassifiersFactory.eINSTANCE.createEnumeration();
            javaEnum.setName("ehnumm");
            compilationUnit.getClassifiers().add(javaEnum);

        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(3, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
    }

    @Test
    void testClassAttributeToProperty() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Field field = MembersFactory.eINSTANCE.createField();
            field.setName("myField");
            javaClass.getMembers().add(field);
            Field field2 = MembersFactory.eINSTANCE.createField();
            field2.setName("myField2");
            javaClass.getMembers().add(field2);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
    }

    @Test
    void testEnumAttributeToProperty() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Enumeration javaEnum = ClassifiersFactory.eINSTANCE.createEnumeration();
            javaEnum.setName("ehnumm");
            compilationUnit.getClassifiers().add(javaEnum);

            Field field = MembersFactory.eINSTANCE.createField();
            field.setName("myField");
            javaEnum.getMembers().add(field);
            Field field2 = MembersFactory.eINSTANCE.createField();
            field2.setName("myField2");
            javaEnum.getMembers().add(field2);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
    }

    @Test
    void testAttributeTypeToPropertyType() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Field field = MembersFactory.eINSTANCE.createField();
            field.setName("myField");
            javaClass.getMembers().add(field);

            ClassifierReference typeReference = TypesFactory.eINSTANCE.createClassifierReference();
            typeReference.setTarget(javaClass);
            field.setTypeReference(typeReference);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        //TODO Problem: EReference "typeReference" of Field (which extends TypedElement) only shows up as a proxy and cannot be resolved!
    }

    @Test
    void testFieldFinalToFinal() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Field field = MembersFactory.eINSTANCE.createField();
            field.setName("myField");
            javaClass.getMembers().add(field);

            Final finalModifier = ModifiersFactory.eINSTANCE.createFinal();
            field.getAnnotationsAndModifiers().add(finalModifier);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(4, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        //TODO Problem: EClass "Final" only shows up as a proxy and cannot be resolved!
        UMLFactory.eINSTANCE.createClass().createGeneralization(null);
    }

    @Test
    void testSuperClassToSuperClass() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            CompilationUnit superClassCompilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(superClassCompilationUnit);

            Class javaSuperClass = ClassifiersFactory.eINSTANCE.createClass();
            javaSuperClass.setName("superKless");
            superClassCompilationUnit.getClassifiers().add(javaSuperClass);

            ClassifierReference superClassReference = TypesFactory.eINSTANCE.createClassifierReference();
            javaClass.setExtends(superClassReference);
            superClassReference.setTarget(javaSuperClass);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        //TODO Problem: EClass "Final" only shows up as a proxy and cannot be resolved!
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
              <packagedElement xsi:type="uml:Class" name="kless">
                <generalization general="/0/superKless"/>
              </packagedElement>
              <packagedElement xsi:type="uml:Class" name="superKless"/>
            </uml:Package>""");
    }

    @Test
    void testSuperInterfaceToSuperInterface() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Interface javaInterface = ClassifiersFactory.eINSTANCE.createInterface();
            javaInterface.setName("interfees");
            compilationUnit.getClassifiers().add(javaInterface);

            CompilationUnit superClassCompilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(superClassCompilationUnit);

            Interface javaSuperInterface = ClassifiersFactory.eINSTANCE.createInterface();
            javaSuperInterface.setName("superInterfees");
            superClassCompilationUnit.getClassifiers().add(javaSuperInterface);

            ClassifierReference superInterfaceReference = TypesFactory.eINSTANCE.createClassifierReference();
            javaInterface.getExtends().add(superInterfaceReference);
            superInterfaceReference.setTarget(javaSuperInterface);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
              <packagedElement xsi:type="uml:Interface" name="interfees">
                <generalization general="/0/superInterfees"/>
              </packagedElement>
              <packagedElement xsi:type="uml:Interface" name="superInterfees"/>
            </uml:Package>""");
    }

    @Test
    void testClassImplementToClassImplement() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            CompilationUnit interfaceCompilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(interfaceCompilationUnit);

            Interface javaInterface = ClassifiersFactory.eINSTANCE.createInterface();
            javaInterface.setName("interfees");
            interfaceCompilationUnit.getClassifiers().add(javaInterface);

            ClassifierReference interfaceTypeRef = TypesFactory.eINSTANCE.createClassifierReference();
            javaClass.getImplements().add(interfaceTypeRef);
            interfaceTypeRef.setTarget(javaInterface);

        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
              <packagedElement xsi:type="uml:Interface" name="interfees"/>
              <packagedElement xsi:type="uml:Class" name="kless">
                <interfaceRealization client="/0/kless" supplier="/0/interfees" contract="/0/interfees"/>
              </packagedElement>
            </uml:Package>""");
    }

    @Test
    void testEnumConstantToEnumLiteral() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("java_instance.model").toString()));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Enumeration javaEnum = ClassifiersFactory.eINSTANCE.createEnumeration();
            javaEnum.setName("ehnumm");
            compilationUnit.getClassifiers().add(javaEnum);

            EnumConstant enumConstant = MembersFactory.eINSTANCE.createEnumConstant();
            enumConstant.setName("ehnummKonschtant");
            javaEnum.getConstants().add(enumConstant);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(4, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
              <packagedElement xsi:type="uml:Enumeration" name="ehnumm">
                <ownedLiteral name="ehnummKonschtant" classifier="/0/ehnumm"/>
              </packagedElement>
            </uml:Package>""");
    }
}
