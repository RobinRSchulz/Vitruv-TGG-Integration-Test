package tools.vitruv.methodologisttemplate.vsum;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.emoflon.ibex.common.emf.EMFEdge;
import runtime.CorrespondenceNode;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationResult;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGIbexRedInterpreter.RevokedCorrespondenceNodeWrapper;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    public static void assertStructure(VitruviusTGGChangePropagationResult actual, CPSResultExpectation expected) {
        expected.assertMatches(actual);
    }

    public static class CPSResultExpectation {
        private List<CorrExpectation> addedCorrExpectations;
        private List<CorrExpectation> revokedCorrsExpectation;
        private List<EMFEdgeTypeExpectation> revokedEMFEdgesExpectation;
        private List<EObjectExpectation> revokedModelNodesExpectation;

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
        public CPSResultExpectation expectRevokedModelNodes(EObjectExpectation... revokedModelNodes) {
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

    public static class EObjectExpectation {
        private final EClass eClass;

        public EObjectExpectation(EClass eClass) {
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
        private final EObjectExpectation source;
        private final EObjectExpectation target;

        public CorrExpectation(EClass eClass, EObjectExpectation source, EObjectExpectation target) {
            this.eClass = eClass;
            this.source = source;
            this.target = target;
        }
        public CorrExpectation(String eClassName, EObjectExpectation source, EObjectExpectation target) {
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
