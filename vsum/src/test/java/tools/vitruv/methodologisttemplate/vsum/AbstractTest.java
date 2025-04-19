package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import tools.vitruv.change.propagation.ChangePropagationSpecification;
import tools.vitruv.change.testutils.TestUserInteraction;
import tools.vitruv.framework.views.CommittableView;
import tools.vitruv.framework.views.View;
import tools.vitruv.framework.views.ViewTypeFactory;
import tools.vitruv.framework.vsum.VirtualModel;
import tools.vitruv.framework.vsum.VirtualModelBuilder;

import java.nio.file.Path;
import java.util.function.Consumer;

public class AbstractTest {
    static Logger logger = Logger.getLogger(AbstractTest.class);

    public final String VITRUVIUS_PROJECT_NAME;
    public final Path VITRUVIUS_PROJECTS_PATH;

    public AbstractTest(String vitruviusProjectName) {
        VITRUVIUS_PROJECT_NAME = vitruviusProjectName;
        VITRUVIUS_PROJECTS_PATH = Path.of("target/vsumexample/" + VITRUVIUS_PROJECT_NAME);
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
