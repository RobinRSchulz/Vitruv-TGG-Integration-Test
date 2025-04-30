package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.UMLPackage;
import org.emftext.language.java.classifiers.Class;
import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.classifiers.Enumeration;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersFactory;
import org.emftext.language.java.containers.Package;
import org.emftext.language.java.members.*;
import org.emftext.language.java.modifiers.Final;
import org.emftext.language.java.modifiers.ModifiersFactory;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.ParametersFactory;
import org.emftext.language.java.parameters.VariableLengthParameter;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.TypesFactory;
import org.junit.jupiter.api.*;
import tools.vitruv.framework.views.CommittableView;

import java.nio.file.Path;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static tools.vitruv.methodologisttemplate.vsum.util.TGGResultAssertions.assertFileContainsLines;
import static tools.vitruv.methodologisttemplate.vsum.util.TGGResultAssertions.assertView;

import static tools.vitruv.methodologisttemplate.vsum.util.TGGResultAssertions.*;

/**
 * This represents (parts of) the evaluation, which for convenience, is implemented with junit.
 * Tests correctness of the application of each pattern.
 */
public class Java2UmlEvaluationGoal1Test extends AbstractEvaluationTest {
    static Logger logger = Logger.getLogger(Java2UmlEvaluationGoal1Test.class);

    public Java2UmlEvaluationGoal1Test() throws InterruptedException {
        super("Java2UmlEvaluationGoal1", Set.of(UML.getPackage()));
        IBEX_PROJECT_ROOT = Path.of("../eclipse-ibex-workspace/Java2Uml");
    }

    private static final UMLPackage UML = UMLPackage.eINSTANCE;

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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML" name="peketsch"/>
            """);
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch"/>""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Model name="UML_MODEL">
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
                <packagedElement xsi:type="uml:PrimitiveType" name="boolean"/>
            </uml:Model>""");
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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

        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
                <packagedElement xsi:type="uml:Class" name="kless"/>
            </uml:Package>""");
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
        assertFileContainsLines(TARGET_MODEL_PATH, """
                <uml:Package name="peketsch">
                    <packagedElement xsi:type="uml:Interface" name="interfees"/>
                </uml:Package>""");
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
                <packagedElement xsi:type="uml:Enumeration" name="ehnumm"/>
            </uml:Package>""");
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
        // split because serialization is not deterministic...
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
                <packagedElement xsi:type="uml:Class" name="kless">""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
                    <ownedAttribute name="myField2"/>""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
                    <ownedAttribute name="myField"/>""");
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
        // split because serialization is not deterministic...
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch">
                <packagedElement xsi:type="uml:Enumeration" name="ehnumm">""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
                    <ownedAttribute name="myField2"/>""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
                    <ownedAttribute name="myField"/>""");
    }

    @Test
    void testAttributeTypeToPropertyType() throws Exception {
        fail("EReference \"typeReference\" of Field (which extends TypedElement) only shows up as a proxy and cannot be resolved!");
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
    }

    @Test
    void testFieldFinalToFinal() throws Exception {
        fail("EClass Final cannot be loaded because of a proxy resolution bug in eMoflon");
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
//        assertFileContainsLines(TARGET_MODEL_PATH, """
//            <uml:Package name="peketsch">
//              <packagedElement xsi:type="uml:Class" name="kless">
//                <generalization general="/0/superKless"/>
//              </packagedElement>
//              <packagedElement xsi:type="uml:Class" name="superKless"/>
//            </uml:Package>""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
              <packagedElement xsi:type="uml:Class" name="kless">
                <generalization general="/0/superKless"/>
              </packagedElement>""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
              <packagedElement xsi:type="uml:Class" name="superKless"/>""");
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
//        assertFileContainsLines(TARGET_MODEL_PATH, """
//            <uml:Package name="peketsch">
//              <packagedElement xsi:type="uml:Interface" name="interfees">
//                <generalization general="/0/superInterfees"/>
//              </packagedElement>
//              <packagedElement xsi:type="uml:Interface" name="superInterfees"/>
//            </uml:Package>""");
//        assertFileContainsLines(TARGET_MODEL_PATH, """
//              <packagedElement xsi:type="uml:Interface" name="interfees">
//                <generalization general="/0/superInterfees"/>
//              </packagedElement>""");
//        assertFileContainsLines(TARGET_MODEL_PATH, """
//              <packagedElement xsi:type="uml:Interface" name="superInterfees"/>""");

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getInterface())
                                            .expectFields(new FieldExpectation("name").expectValue("interfees"))
                                            .expectChildren(new StrucFeatExpectation("generalization")
                                                    .expectValues(new EObjectExpectation(UML.getGeneralization())
                                                            .expectChildren(new StrucFeatExpectation("general")
                                                                    .expectValues(new EObjectExpectation(UML.getInterface())
                                                                            .expectFields(new FieldExpectation("name").expectValue("superInterfees"))
                                                                    )

                                                            )
                                                    )
                                            ),
                                        new EObjectExpectation(UML.getInterface())
                                                .expectFields(new FieldExpectation("name").expectValue("superInterfees"))
                                )
                        )
        );
        //TODO hat vor needs_paranoid_modifications=true noch funktioniert...
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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
//        assertFileContainsLines(TARGET_MODEL_PATH, """
//            <uml:Package name="peketsch">
//              <packagedElement xsi:type="uml:Interface" name="interfees"/>
//              <packagedElement xsi:type="uml:Class" name="kless">
//                <interfaceRealization client="/0/kless" supplier="/0/interfees" contract="/0/interfees"/>
//              </packagedElement>
//            </uml:Package>""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
              <packagedElement xsi:type="uml:Class" name="kless">
                <interfaceRealization client="/0/kless" supplier="/0/interfees" contract="/0/interfees"/>
              </packagedElement>""");
        assertFileContainsLines(TARGET_MODEL_PATH, """
              <packagedElement xsi:type="uml:Interface" name="interfees"/>""");
        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getClass_())
                                                .expectFields(new FieldExpectation("name").expectValue("kless"))
                                                .expectChildren(new StrucFeatExpectation("interfaceRealization")
                                                        .expectValues(new EObjectExpectation(UML.getInterfaceRealization())
                                                                .expectChildren(new StrucFeatExpectation("contract")
                                                                        .expectValues(new EObjectExpectation(UML.getInterface())
                                                                                .expectFields(new FieldExpectation("name").expectValue("interfees"))
                                                                        )

                                                                )
                                                        )
                                                ),
                                        new EObjectExpectation(UML.getInterface())
                                                .expectFields(new FieldExpectation("name").expectValue("interfees"))
                                )
                        )
        );
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
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
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

//        onlyView(getDefaultView(currentVsum), (View v) -> {
//            //TODO make lib out of that...
//
//            org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) v.getRootObjects().stream()
//                    .filter(eObject -> eObject instanceof org.eclipse.uml2.uml.Package)
//                    .findFirst().orElseThrow();
//
//            org.eclipse.uml2.uml.Enumeration umlEnum = (org.eclipse.uml2.uml.Enumeration) umlPackage.getPackagedElement("ehnumm");
//            assertNotNull(umlEnum);
//
//            EnumerationLiteral enumerationLiteral = umlEnum.getOwnedLiteral("ehnummKonschtant");
//            assertNotNull(enumerationLiteral);
//        });
        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(new EObjectExpectation(UML.getEnumeration())
                                        .expectFields(new FieldExpectation("name").expectValue("ehnumm"))
                                        .expectChildren(new StrucFeatExpectation("ownedLiteral")
                                                .expectValues(new EObjectExpectation(UML.getEnumerationLiteral())
                                                        .expectFields(new FieldExpectation("name").expectValue("ehnummKonschtant"))
                                                )
                                        )
                                )
                        )
        );
    }

    @Test
    void testClassMethodToMethod() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Method javaMethod = MembersFactory.eINSTANCE.createClassMethod();
            javaMethod.setName("methed");
            javaClass.getMembers().add(javaMethod);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(4, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Class" name="kless">
                <ownedOperation name="methed"/>
            </packagedElement>
        </uml:Package>""");
    }

    @Test
    void testInterfaceMethodToMethod() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Interface javaInterface = ClassifiersFactory.eINSTANCE.createInterface();
            javaInterface.setName("interfees");
            compilationUnit.getClassifiers().add(javaInterface);

            Method javaMethod = MembersFactory.eINSTANCE.createInterfaceMethod();
            javaMethod.setName("methed");
            javaInterface.getMembers().add(javaMethod);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(4, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Interface" name="interfees">
                <ownedOperation name="methed"/>
            </packagedElement>
        </uml:Package>""");
    }

    @Test
    void testClassConstructorToConstructor() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Constructor javaConstructor = MembersFactory.eINSTANCE.createConstructor();
            javaConstructor.setName("constructer");
            javaClass.getMembers().add(javaConstructor);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(4, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Class" name="kless">
                <ownedOperation name="constructer"/>
            </packagedElement>
        </uml:Package>""");
    }

    @Test
    void testVariableLengthConstructorParameter() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Constructor javaConstructor = MembersFactory.eINSTANCE.createConstructor();
            javaConstructor.setName("constructer");
            javaClass.getMembers().add(javaConstructor);

            VariableLengthParameter parameter = ParametersFactory.eINSTANCE.createVariableLengthParameter();
            parameter.setName("parrametr");
            javaConstructor.getParameters().add(parameter);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Class" name="kless">
                <ownedOperation name="constructer">
                    <ownedParameter name="parrametr">
                        <lowerValue xsi:type="uml:LiteralInteger"/>
                        <upperValue xsi:type="uml:LiteralUnlimitedNatural" value="*"/>
                    </ownedParameter>
                </ownedOperation>
            </packagedElement>
          </uml:Package>""");
    }

    @Test
    void testVariableLengthMethodParameter() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Method javaMethod = MembersFactory.eINSTANCE.createClassMethod();
            javaMethod.setName("methed");
            javaClass.getMembers().add(javaMethod);

            VariableLengthParameter parameter = ParametersFactory.eINSTANCE.createVariableLengthParameter();
            parameter.setName("parrametr");
            javaMethod.getParameters().add(parameter);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Class" name="kless">
                <ownedOperation name="methed">
                    <ownedParameter name="parrametr">
                        <lowerValue xsi:type="uml:LiteralInteger"/>
                        <upperValue xsi:type="uml:LiteralUnlimitedNatural" value="*"/>
                    </ownedParameter>
                </ownedOperation>
            </packagedElement>
          </uml:Package>""");
    }

    @Test
    void testOrdinaryConstructorParameter() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Constructor javaConstructor = MembersFactory.eINSTANCE.createConstructor();
            javaConstructor.setName("constructer");
            javaClass.getMembers().add(javaConstructor);

            OrdinaryParameter parameter = ParametersFactory.eINSTANCE.createOrdinaryParameter();
            parameter.setName("parrametr");
            javaConstructor.getParameters().add(parameter);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Class" name="kless">
                <ownedOperation name="constructer">
                    <ownedParameter name="parrametr"/>
                </ownedOperation>
            </packagedElement>
          </uml:Package>""");
    }

    @Test
    void testOrdinaryMethodParameter() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Method javaMethod = MembersFactory.eINSTANCE.createClassMethod();
            javaMethod.setName("methed");
            javaClass.getMembers().add(javaMethod);

            OrdinaryParameter parameter = ParametersFactory.eINSTANCE.createOrdinaryParameter();
            parameter.setName("parrametr");
            javaMethod.getParameters().add(parameter);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Class" name="kless">
                <ownedOperation name="methed">
                    <ownedParameter name="parrametr"/>
                </ownedOperation>
            </packagedElement>
          </uml:Package>""");
    }

    @Test
    void testConstructorClassParamType() throws Exception {
        fail("EReference \"typeReference\" of Parameter (which extends TypedElement) only shows up as a proxy and cannot be resolved!");
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Constructor javaConstructor = MembersFactory.eINSTANCE.createConstructor();
            javaConstructor.setName("constructer");
            javaClass.getMembers().add(javaConstructor);

            OrdinaryParameter parameter = ParametersFactory.eINSTANCE.createOrdinaryParameter();
            parameter.setName("parrametr");
            javaConstructor.getParameters().add(parameter);

            ClassifierReference typeReference = TypesFactory.eINSTANCE.createClassifierReference();
            parameter.setTypeReference(typeReference);
            typeReference.setTarget(javaClass);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(5, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
        <uml:Package name="peketsch">
            <packagedElement xsi:type="uml:Class" name="kless">
                <ownedOperation name="constructer">
                    <ownedParameter name="parrametr"/>
                    TODO
                </ownedOperation>
            </packagedElement>
          </uml:Package>""");
    }

    /*
        --------------------------------------------------------------------------------------------------------------------------------------------------
        -------------------------------------------- Subtractive Changes Test Cases ----------------------------------------------------------------------
        --------------------------------------------------------------------------------------------------------------------------------------------------
     */

    /**
     * Create a Package with a Class that contains
     * <ul>
     *     <li> a constructor with one parameter
     *     <li> a method with one parameter
     *     <li> a field
     * </ul>
     */
    void setupSubtractiveClassTestCaseBaseExample() throws Exception {
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            // should trigger RootJavaPackageToUmlPackage + ClassToUmlClass
            Package javaPackage = ContainersFactory.eINSTANCE.createPackage();
            javaPackage.setName("peketsch");
            v.registerRoot(
                    javaPackage,
                    URI.createURI(SOURCE_MODEL_PATH_STRING));
            CompilationUnit compilationUnit = ContainersFactory.eINSTANCE.createCompilationUnit();
            javaPackage.getCompilationUnits().add(compilationUnit);

            Class javaClass = ClassifiersFactory.eINSTANCE.createClass();
            javaClass.setName("kless");
            compilationUnit.getClassifiers().add(javaClass);

            Constructor javaConstructor = MembersFactory.eINSTANCE.createConstructor();
            javaConstructor.setName("constructer");
            javaClass.getMembers().add(javaConstructor);

            OrdinaryParameter constructorParameter = ParametersFactory.eINSTANCE.createOrdinaryParameter();
            constructorParameter.setName("parrametr");
            javaConstructor.getParameters().add(constructorParameter);

            Method javaMethod = MembersFactory.eINSTANCE.createClassMethod();
            javaMethod.setName("methed");
            javaClass.getMembers().add(javaMethod);

            OrdinaryParameter methodParameter = ParametersFactory.eINSTANCE.createOrdinaryParameter();
            constructorParameter.setName("parrametr");
            javaMethod.getParameters().add(methodParameter);

            Field field = MembersFactory.eINSTANCE.createField();
            field.setName("myField");
            javaClass.getMembers().add(field);
        });
        view.update();
        view.close();
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(8, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
    }

    @Test
    void testJavaCompilationUnitDeleted() throws Exception {
        setupSubtractiveClassTestCaseBaseExample();

        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            javaPackage.getCompilationUnits().remove(0);
        });
        view.update();
        view.close();
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(7, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(7, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML" name="peketsch"/>"""); // no idea but makes no real difference...
    }

    @Test
    void testJavaClassDeleted() throws Exception {
        setupSubtractiveClassTestCaseBaseExample();

        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);
            compilationUnit.getClassifiers().remove(0);
        });
        view.update();
        view.close();
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(6, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(6, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        assertFileContainsLines(TARGET_MODEL_PATH, """
            <uml:Package name="peketsch"/>""");
    }

    @Test
    void testJavaClassImplementRemoved() throws Exception {
        testClassImplementToClassImplement();

        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);
            Class javaClass = (Class) compilationUnit.getClassifiers().get(0);

            javaClass.getImplements().remove(0);
        });
        view.update();
        view.close();
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getClass_())
                                                .expectFields(new FieldExpectation("name").expectValue("kless")),
                                        new EObjectExpectation(UML.getInterface())
                                                .expectFields(new FieldExpectation("name").expectValue("interfees"))
                                )
                        )
        );
    }

    @Test
    void testSuperInterfaceRemoved() throws Exception {
        testSuperInterfaceToSuperInterface();

        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);

            Interface javaInterface = (Interface) compilationUnit.getClassifiers().get(0);
            javaInterface.getExtends().remove(0);

        });
        view.update();
        view.close();
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getInterface())
                                                .expectFields(new FieldExpectation("name").expectValue("interfees"))
                                                .expectChildren(new StrucFeatExpectation("generalization")
                                                        //this is the interesting part
                                                        .expectValuesNotPresent(new EObjectExpectation(UML.getGeneralization())
                                                                .expectChildren(new StrucFeatExpectation("general")
                                                                        .expectValues(new EObjectExpectation(UML.getInterface())
                                                                                .expectFields(new FieldExpectation("name").expectValue("superInterfees"))
                                                                        )

                                                                )
                                                        )
                                                ),
                                        new EObjectExpectation(UML.getInterface())
                                                .expectFields(new FieldExpectation("name").expectValue("superInterfees"))
                                )
                        )
        );
    }

    @Test
    void testEnumConstantDeleted() throws Exception {
        testEnumConstantToEnumLiteral();

        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);

            Enumeration javaEnum = (Enumeration) compilationUnit.getClassifiers().get(0);
            javaEnum.getConstants().remove(0);

        });
        view.update();
        view.close();
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(0, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
//        assertFileContainsLines(TARGET_MODEL_PATH, """
//            <uml:Package name="peketsch"/>""");

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(new EObjectExpectation(UML.getEnumeration())
                                        .expectFields(new FieldExpectation("name").expectValue("ehnumm"))
                                        .expectChildren(new StrucFeatExpectation("ownedLiteral")
                                                .expectValuesNotPresent(new EObjectExpectation(UML.getEnumerationLiteral())
                                                        .expectFields(new FieldExpectation("name").expectValue("ehnummKonschtant"))
                                                )
                                        )
                                )
                        )
        );
    }
    @Test
    void testEnumConstantRenamed() throws Exception {
        testEnumConstantToEnumLiteral();

        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);

            Enumeration javaEnum = (Enumeration) compilationUnit.getClassifiers().get(0);
            javaEnum.getConstants().get(0).setName("aCompletelyDifferentName");

        });
        view.update();
        view.close();
        assertEquals(2, currentCPS.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(1, currentCPS.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
//        assertFileContainsLines(TARGET_MODEL_PATH, """
//            <uml:Package name="peketsch"/>""");

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(new EObjectExpectation(UML.getEnumeration())
                                        .expectFields(new FieldExpectation("name").expectValue("ehnumm"))
                                        .expectChildren(new StrucFeatExpectation("ownedLiteral")
                                                .expectValues(new EObjectExpectation(UML.getEnumerationLiteral())
                                                        .expectFields(new FieldExpectation("name").expectValue("aCompletelyDifferentName"))
                                                )
                                        )
                                )
                        )
        );
    }

    @Test
    void testJavaMemberDeleted() throws Exception {
        setupSubtractiveClassTestCaseBaseExample();
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);

            Class javaClass = (Class) compilationUnit.getClassifiers().get(0);
            Field javaField = (Field) javaClass.getMembers().stream().filter(member -> member.getName().equals("myField")).findFirst().get();
            javaClass.getMembers().remove(javaField);
        });
        view.update();
        view.close();

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getClass_())
                                                .expectFields(new FieldExpectation("name").expectValue("kless"))
                                                .expectChildren(new StrucFeatExpectation("ownedOperation")
                                                        .expectValuesNotPresent(new EObjectExpectation(UML.getProperty())
                                                                .expectFields(new FieldExpectation("name").expectValue("myField"))
                                                        )
                                                        .expectValues(
                                                                new EObjectExpectation(UML.getOperation())
                                                                        .expectFields(new FieldExpectation("name").expectValue("constructer")),
                                                                new EObjectExpectation(UML.getOperation())
                                                                        .expectFields(new FieldExpectation("name").expectValue("methed"))
                                                        )
                                                )
                                )
                        )
        );
    }

    @Test
    void testJavaMemberDeletedComplex() throws Exception {
        setupSubtractiveClassTestCaseBaseExample();

        //TODO Problem
        /**
         * Folgende Situation:
         * Java-Modell:
             <classifiers xsi:type="classifiers:Class" name="kless">
                 <members xsi:type="members:Constructor" name="constructer">
                    <parameters xsi:type="parameters:OrdinaryParameter" name="parrametr"/>
                 </members>
                 <members xsi:type="members:ClassMethod" name="methed">
                    <parameters xsi:type="parameters:OrdinaryParameter"/>
                 </members>
                 <members xsi:type="members:Field" name="myField"/>
             </classifiers>
         * CORR-Modell:
             <Java2Uml:JavaConstructorToOperation>
                 <target xsi:type="uml:Operation" href="target\vsumexample\Java2UmlEvaluation\testJavaMemberDeleted\\uml_instance.model#/0/@packagedElement.0/@ownedOperation.0" />
                 <source xsi:type="members:Constructor" href="target\vsumexample\Java2UmlEvaluation\testJavaMemberDeleted\java_instance.model#//@compilationUnits.0/@classifiers.0/@members.0" />
             </Java2Uml:JavaConstructorToOperation>
         *
         * Wenn Man nun "constructer" löscht, versucht iBeX, die Korrespondenz, die zu constructor besteht, zu laden, und versucht,
         * da einfach nur stumpf über @compilationUnits.0/@classifiers.0/@members.0 referenziert wird,
         * die Methode methed als Constructor zu laden, was scheitert.
         *
         * Wären die beiden vom selben Typ, wäre die Correspondence jetzt verrutscht. --> Kapitaler Fehler in der Serialisierung der Korrespondenzen bei
         */
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);

            Class javaClass = (Class) compilationUnit.getClassifiers().get(0);
            Constructor javaConstructor = (Constructor) javaClass.getMembers().stream().filter(member -> member.getName().equals("constructer")).findFirst().get();
            javaClass.getMembers().remove(javaConstructor);
        });
        view.update();
        view.close();

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getClass_())
                                                .expectFields(new FieldExpectation("name").expectValue("kless"))
                                                .expectChildren(new StrucFeatExpectation("ownedOperation")
                                                        .expectValuesNotPresent(new EObjectExpectation(UML.getOperation())
                                                                .expectFields(new FieldExpectation("name").expectValue("constructer"))
                                                        )
                                                        .expectValues(
                                                                new EObjectExpectation(UML.getOperation())
                                                                        .expectFields(new FieldExpectation("name").expectValue("methed")),
                                                                new EObjectExpectation(UML.getProperty())
                                                                        .expectFields(new FieldExpectation("name").expectValue("myField"))
                                                        )
                                                )
                                )
                        )
        );
    }

    @Test
    void testJavaParameterDeleted() throws Exception {
        setupSubtractiveClassTestCaseBaseExample();
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);

            Class javaClass = (Class) compilationUnit.getClassifiers().get(0);
            Constructor javaConstructor = (Constructor) javaClass.getMembers().stream().filter(member -> member.getName().equals("constructer")).findFirst().get();

            javaConstructor.getParameters().remove(0);
        });
        view.update();
        view.close();

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getClass_())
                                                .expectFields(new FieldExpectation("name").expectValue("kless"))
                                                .expectChildren(new StrucFeatExpectation("ownedOperation")
                                                        .expectValuesNotPresent(
                                                        )
                                                        .expectValues(
                                                                new EObjectExpectation(UML.getOperation())
                                                                        .expectFields(new FieldExpectation("name").expectValue("constructer"))
                                                                        .expectChildren(new StrucFeatExpectation("ownedParameter")
                                                                                // here is the interesting part
                                                                                .expectValuesNotPresent(new EObjectExpectation(UML.getParameter())
                                                                                        .expectFields(new FieldExpectation("name").expectValue("parrametr"))
                                                                                )
                                                                        ),
                                                                new EObjectExpectation(UML.getOperation())
                                                                        .expectFields(new FieldExpectation("name").expectValue("methed")),
                                                                new EObjectExpectation(UML.getProperty())
                                                                        .expectFields(new FieldExpectation("name").expectValue("myField"))
                                                        )
                                                )
                                )
                        )
        );
    }

    @Test
    void testJavaNamedElementRenamed() throws Exception {
        setupSubtractiveClassTestCaseBaseExample();
        CommittableView view = getDefaultView(currentVsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        modifyView(view, (CommittableView v) -> {

            Package javaPackage = (Package) v.getRootObjects().stream().findAny().orElseThrow();
            CompilationUnit compilationUnit = javaPackage.getCompilationUnits().get(0);

            Class javaClass = (Class) compilationUnit.getClassifiers().get(0);
            javaClass.setName("kless_new_name");
            Constructor javaConstructor = (Constructor) javaClass.getMembers().stream().filter(member -> member.getName().equals("constructer")).findFirst().get();

            javaConstructor.getParameters().get(0).setName("parrametr_new_name");
        });
        view.update();
        view.close();

        assertView(currentVsum,
                new EObjectExpectation(UML.getPackage())
                        .expectChildren(new StrucFeatExpectation("packagedElement")
                                .expectValues(
                                        new EObjectExpectation(UML.getClass_())
                                                .expectFields(new FieldExpectation("name").expectValue("kless_new_name"))
                                                .expectChildren(new StrucFeatExpectation("ownedOperation")
                                                        .expectValuesNotPresent(
                                                        )
                                                        .expectValues(
                                                                new EObjectExpectation(UML.getOperation())
                                                                        .expectFields(new FieldExpectation("name").expectValue("constructer"))
                                                                        .expectChildren(new StrucFeatExpectation("ownedParameter")
                                                                                .expectValues(new EObjectExpectation(UML.getParameter())
                                                                                        .expectFields(new FieldExpectation("name").expectValue("parrametr_new_name"))
                                                                                )
                                                                        ),
                                                                new EObjectExpectation(UML.getOperation())
                                                                        .expectFields(new FieldExpectation("name").expectValue("methed")),
                                                                new EObjectExpectation(UML.getProperty())
                                                                        .expectFields(new FieldExpectation("name").expectValue("myField"))
                                                        )
                                                )
                                )
                        )
        );
    }
}
