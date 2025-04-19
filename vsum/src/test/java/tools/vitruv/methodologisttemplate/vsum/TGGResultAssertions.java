package tools.vitruv.methodologisttemplate.vsum;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;
import org.emoflon.ibex.common.emf.EMFEdge;
import runtime.CorrespondenceNode;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationResult;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGIbexRedInterpreter.RevokedCorrespondenceNodeWrapper;
import tools.vitruv.framework.views.View;
import tools.vitruv.framework.views.ViewTypeFactory;
import tools.vitruv.framework.vsum.VirtualModel;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TGGResultAssertions {

    public static void assertFileContainsLines(Path filePath, String string) {
        try {
//            String fileString = Files.readString(filePath, StandardCharsets.UTF_8);
            String[] testLines = string.trim().split("\n|\r\n");
            List<String> fileLines = Files.readAllLines(filePath, StandardCharsets.UTF_8);

//            System.out.println("fileLines------------------");
//            fileLines.forEach(line -> System.out.println(line));
//            System.out.println("\n\ntestLines------------------");
//            Arrays.asList(testLines).forEach(line -> System.out.println(line));
//
//            System.out.println("MÄTSCGHING--------------");
            int linesIndex = 0;
            String currentTestLine = testLines[0].trim();
            boolean found = false;
            for (String line : fileLines) {
//                System.out.println(" matching " + currentTestLine + " AGAINST " + line);
                if (line.trim().equals(currentTestLine)) {
                    //start matching
                    if (linesIndex == testLines.length-1) {
                        //found the match
                        found = true;
                        break;
                    }
                    currentTestLine = testLines[++linesIndex].trim();
                } else {
                    if (linesIndex == testLines.length-1) {
                        //matching failed --> reset
                        linesIndex = 0;
                        currentTestLine = testLines[0].trim();
                    }
                }
            }
            assertTrue(found);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static View getDefaultView(VirtualModel vsum) {
        var selector = vsum.createSelector(ViewTypeFactory.createIdentityMappingViewType("default"));
        selector.getSelectableElements().forEach(it -> selector.setSelected(it, true));
        return selector.createView();
    }
    private static void onlyView(View view, Consumer<View> viewFunction) {
        viewFunction.accept(view);
    }
    public static void assertView(VirtualModel vsum, EObjectExpectation... eObjectExpectations) {
        onlyView(getDefaultView(vsum), (View v) -> {
            List<EObjectExpectation> rootExpectations = List.of(eObjectExpectations);

            for (EObjectExpectation eObjectExpectation : eObjectExpectations) {
                Set<EObject> possibleRoots = v.getRootObjects().stream()
                        .filter(eObjectExpectation::checkFieldExpectationsMatches)
                        .collect(Collectors.toSet());
                if (possibleRoots.size() != 1) {
                    fail("multiple matching roots for expectation: " + eObjectExpectation);
                }
                // unambiguous --> assert
                eObjectExpectation.assertMatches(possibleRoots.iterator().next());
            }
        });
    }

    public static class EObjectExpectation {

        EClass eClass;
        private List<StrucFeatExpectation> childExpectations;
        private List<FieldExpectation> fieldExpectations;

        public EObjectExpectation(EClass eClass) {
            this.eClass = eClass;
        }

        public EObjectExpectation expectChildren(StrucFeatExpectation... eObjectExpectations) {
            this.childExpectations = List.of(eObjectExpectations);
            return this;
        }

        public EObjectExpectation expectFields(FieldExpectation... fieldExpectations) {
            this.fieldExpectations = List.of(fieldExpectations);
            return this;
        }

        public void assertMatches(EObject actualEObject) {
            assertNotNull(actualEObject, "Expected to find an object. this: " + this);
            assertEquals(eClass, actualEObject.eClass());
            if (childExpectations != null) {

//                for (StrucFeatExpectation childExpectation : childExpectations) {
//                    try {
//                        childExpectation.assertChildMatches(actualEObject);
//                    } catch (AssertionError e) {
//
//                    }
//                }
                childExpectations.forEach(strucFeatExpectation -> {
                    strucFeatExpectation.assertChildMatches(actualEObject);
                });
            }
            if (fieldExpectations != null) {
                fieldExpectations.forEach(fieldExpectation -> fieldExpectation.assertMatches(actualEObject));
            }
        }

        public void assertMatchesNot(EObject actualEObject) {
            assertThrows(AssertionError.class, () -> {
                this.assertMatches(actualEObject);
            });
        }

        /**
         * Helper to find the right expectation for the given EObject.
         */
        public boolean checkFieldExpectationsMatches(EObject actualEObject) {
            assertNotNull(actualEObject);
            if (!eClass.equals(actualEObject.eClass())) return false;
            if (fieldExpectations != null) {
                return fieldExpectations.stream().allMatch(fieldExpectation -> fieldExpectation.checkMatches(actualEObject));
            } else return true;
        }

        @Override
        public String toString() {
            return "[EObjectInViewExpectation] " + this.eClass.getName() +" Field expectations:\n    "
                    + ((this.fieldExpectations != null)
                        ? this.fieldExpectations.stream().map(FieldExpectation::toString).collect(Collectors.joining(",\n    "))
                        : "none");
        }
    }

    public static class StrucFeatExpectation {

        private List<EObjectExpectation> valuesExpectations = List.of();
        private List<EObjectExpectation> negativeValuesExpectations = List.of();
        public String referenceNameInParent;

        public StrucFeatExpectation(String referenceNameInParent) {
            this.referenceNameInParent = referenceNameInParent;
        }

        /**
         * Check whether the parent object
         * @param parentEObject
         */
        public void assertChildMatches(EObject parentEObject) {
            EStructuralFeature eStructuralFeature = parentEObject.eClass().getEStructuralFeature(this.referenceNameInParent);
            assertNotNull(eStructuralFeature, "EStructuralFeature " + this.referenceNameInParent + " is not present in " + parentEObject.eClass());
            System.out.println("assertChildMatches for StrucFeatExpectation " + this);
            switch (eStructuralFeature) {
                case EReference eReference -> {
                    if (eReference.isMany()) {
                        EList<EObject> actualEList  = (EList<EObject>) parentEObject.eGet(eReference);
                        actualEList.forEach(actualEObject -> {
                            Optional<EObjectExpectation> matchingExpectation = this.valuesExpectations.stream()
                                    .filter(valuesExpectation -> valuesExpectation.checkFieldExpectationsMatches(actualEObject))
                                    .findAny();
                            if (matchingExpectation.isPresent()) {
                                matchingExpectation.get().assertMatches(actualEObject);
                            } else fail("expectation could not be fulfilled. No matching expectations for actualEObject. This=" + this.toString() + "parentEObject=" + parentEObject + ", actualEObject=" + actualEObject);

                            //negative expecatations, none must match!
                            Optional<EObjectExpectation> negativeExpectationMatching = negativeValuesExpectations.stream()
                                    .filter(negativeValuesExpectations -> negativeValuesExpectations.checkFieldExpectationsMatches(actualEObject))
                                    .findAny();
                            if (negativeExpectationMatching.isPresent()) {
                                negativeExpectationMatching.get().assertMatchesNot(actualEObject);
                            } // else not fail, but continue!

                        });
                    } else {
                        EObject actualEObject = (EObject) parentEObject.eGet(eReference);
                        this.valuesExpectations.get(0).assertMatches(actualEObject);
                    }
                }
                case EAttribute eAttribute -> throw new IllegalStateException("Use FieldExpectations for attributes!");
                default -> throw new IllegalStateException("Unexpected value: " + eStructuralFeature);
            }
        }

        public StrucFeatExpectation expectValues(EObjectExpectation... valuesExpectations) {
            this.valuesExpectations = List.of(valuesExpectations);
            return this;
        }

        public StrucFeatExpectation expectValuesNotPresent(EObjectExpectation... negativeValuesExpectations) {
            this.negativeValuesExpectations = List.of(negativeValuesExpectations);
            return this;
        }

        @Override
        public String toString() {
            return "[StrucFeatExpectation] " + this.referenceNameInParent;
        }
    }

    public static class FieldExpectation {
        private String referenceNameInParent;

        private Object expectedValue;

        public FieldExpectation(String referenceNameInParent) {
            this.referenceNameInParent = referenceNameInParent;
        }

        public FieldExpectation expectValue(Object expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }

        public void assertMatches(EObject parentEObject) {
            assertEquals(expectedValue, parentEObject.eGet(parentEObject.eClass().getEStructuralFeature(this.referenceNameInParent)));
        }

        public boolean checkMatches(EObject parentEObject) {
            return expectedValue.equals(parentEObject.eGet(parentEObject.eClass().getEStructuralFeature(this.referenceNameInParent)));
        }

        @Override
        public String toString() {
            return "[FieldExpectation] ref=" + this.referenceNameInParent + ", expectedValue= " + this.expectedValue;
        }
    }

    public static void assertStructure(VitruviusTGGChangePropagationResult actual, CPSResultExpectation expected) {
        expected.assertMatches(actual);
    }

    public static class CPSResultExpectation {
        private List<CorrExpectation> addedCorrExpectations;
        private List<CorrExpectation> revokedCorrsExpectation;
        private List<EMFEdgeTypeExpectation> revokedEMFEdgesExpectation;
        private List<CPSResultEObjectExpectation> revokedModelNodesExpectation;

        public CPSResultExpectation() {}

         public CPSResultExpectation expectAddedCorrs(CorrExpectation... corrTypesExpectation) {
             this.addedCorrExpectations = List.of(corrTypesExpectation);
             return this;
         }
         public CPSResultExpectation expectRemovedCorrs(CorrExpectation... removedCorrTypesExpectation) {
             this.revokedCorrsExpectation = List.of(removedCorrTypesExpectation);
             return this;
         }
        public CPSResultExpectation expectRevokedEMFEdges(EMFEdgeTypeExpectation... revokedEMFEdgesExpectation) {
            this.revokedEMFEdgesExpectation = List.of(revokedEMFEdgesExpectation);
            return this;
        }
        public CPSResultExpectation expectRevokedModelNodes(CPSResultEObjectExpectation... revokedModelNodes) {
            this.revokedModelNodesExpectation = List.of(revokedModelNodes);
            return this;
        }

        public void assertMatches(VitruviusTGGChangePropagationResult actual) {
            if (addedCorrExpectations != null) {
                List<CorrespondenceNode> addedCorrs = actual.getAddedCorrespondences().stream().toList();
                assertEquals(addedCorrExpectations.size(), addedCorrs.size());
                for (int i = 0; i < addedCorrExpectations.size(); i++) {
                    addedCorrExpectations.get(i).assertMatch(addedCorrs.get(i));
                }
            }

            if (revokedCorrsExpectation != null) {
                List<RevokedCorrespondenceNodeWrapper> revokedCorrs = actual.getRevokedCorrespondences().stream().toList();
                assertEquals(this.revokedCorrsExpectation.size(), revokedCorrs.size());
                for (int i = 0; i < revokedCorrsExpectation.size(); i++) {
                    revokedCorrsExpectation.get(i).assertMatch(revokedCorrs.get(i));
                }
            }

            if (revokedEMFEdgesExpectation != null) {
                List<EMFEdge> revokedEdges = actual.getRevokedEMFEdges().stream().toList();
                assertEquals(this.revokedEMFEdgesExpectation.size(), revokedEdges.size(),
                        "Unexptected size: " + revokedEdges);
                for (int i = 0; i < revokedEMFEdgesExpectation.size(); i++) {
                    revokedEMFEdgesExpectation.get(i).assertMatch(revokedEdges.get(i));
                }
            }

            if (revokedModelNodesExpectation != null) {
                List<EObject> revokedNodes = actual.getRevokedModelNodes().stream().toList();
                assertEquals(this.revokedModelNodesExpectation.size(), revokedNodes.size());
                for (int i = 0; i < revokedModelNodesExpectation.size(); i++) {
                    revokedModelNodesExpectation.get(i).assertMatch(revokedNodes.get(i));
                }
            }
        }
    }

    public static class CPSResultEObjectExpectation {
        private final EClass eClass;

        public CPSResultEObjectExpectation(EClass eClass) {
            this.eClass = eClass;
        }

        public void assertMatch(EObject actual) {
            assertEquals(eClass, actual.eClass());
        }
    }

    public static class EMFEdgeTypeExpectation {
        private final EReference eReference;
        public EMFEdgeTypeExpectation(EReference eReference) {
            this.eReference = eReference;
        }

        public void assertMatch(EMFEdge actual) {
            assertEquals(eReference, actual.getType());
            //TODO add source and target
        }
    }

    public static class CorrExpectation {
        private EClass eClass;
        private String eClassName;
        private final CPSResultEObjectExpectation source;
        private final CPSResultEObjectExpectation target;

        public CorrExpectation(EClass eClass, CPSResultEObjectExpectation source, CPSResultEObjectExpectation target) {
            this.eClass = eClass;
            this.source = source;
            this.target = target;
        }
        public CorrExpectation(String eClassName, CPSResultEObjectExpectation source, CPSResultEObjectExpectation target) {
            this.eClassName = eClassName;
            this.source = source;
            this.target = target;
        }

        public void assertMatch(CorrespondenceNode actual) {
            if (eClass != null) {
                assertEquals(this.eClass, actual.eClass());
            } else {
                assertEquals(this.eClassName, actual.eClass().getName());
            }
            System.out.println(actual.eClass().getEAllStructuralFeatures().stream()
                    .map(eStructuralFeature -> eStructuralFeature.getName() +":"
                            + actual.eGet(eStructuralFeature))
                    .collect(Collectors.joining(", ")));
            this.source.assertMatch((EObject) actual.eGet(actual.eClass().getEStructuralFeature("source")));
            this.target.assertMatch((EObject) actual.eGet(actual.eClass().getEStructuralFeature("target")));
        }

        public void assertMatch(RevokedCorrespondenceNodeWrapper actual) {
            if (eClass != null) {
                assertEquals(this.eClass, actual.getCorrespondenceNode().eClass());
            } else {
                assertEquals(this.eClassName, actual.getCorrespondenceNode().eClass().getName());
            }
            System.out.println("actual.source= " + actual.getSourceEObject());
            System.out.println("actual.target= " + actual.getTargetEObject());
            this.source.assertMatch(actual.getSourceEObject());
            this.target.assertMatch(actual.getTargetEObject());
        }
    }
}
