package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import org.eclipse.uml2.uml.UMLPackage;

import java.nio.file.Path;
import java.util.Set;

public class Java2UmlEvaluationGoal3Test extends AbstractEvaluationTest {
    static Logger logger = Logger.getLogger(Java2UmlEvaluationGoal3Test.class);
    private static final UMLPackage UML = UMLPackage.eINSTANCE;

    public Java2UmlEvaluationGoal3Test() {
        super("Java2UmlEvaluationGoal3", Set.of(UML.getPackage()));
        IBEX_PROJECT_ROOT = Path.of("../eclipse-ibex-workspace/Java2Uml");
    }


//    void generateModel()

}
