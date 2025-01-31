package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.Disabled;
import tools.vitruv.change.propagation.ChangePropagationSpecification;
import tools.vitruv.framework.vsum.VirtualModelBuilder;
import tools.vitruv.methodologisttemplate.model.model.Link;
import tools.vitruv.methodologisttemplate.model.model.ModelFactory;

import java.io.File;
import java.nio.file.Path;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mir.reactions.model2Model2.Model2Model2ChangePropagationSpecification;
import tools.vitruv.change.testutils.TestUserInteraction;
import tools.vitruv.framework.views.CommittableView;
import tools.vitruv.framework.views.View;
import tools.vitruv.framework.views.ViewTypeFactory;
import tools.vitruv.framework.vsum.VirtualModel;
import tools.vitruv.methodologisttemplate.model.model.System;
import tools.vitruv.methodologisttemplate.model.model2.Model2Factory;
import tools.vitruv.methodologisttemplate.model.model2.Model2Package;

/**
 * This class provides an example how to define and use a VSUM.
 */
public class VSUMExampleTest {
  static Logger logger = Logger.getLogger(VSUMExampleTest.class);

  static final Path projectPath = Path.of("target/vsumexample");

  @BeforeAll
  static void setup() {
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
  }

  @Disabled
  @Test
  void testReactions() {
    VirtualModel vsum = createDefaultVirtualModel();
    CommittableView view = getDefaultView(vsum).withChangeDerivingTrait();
    modifyView(view, (CommittableView v) -> {
      v.registerRoot(
        ModelFactory.eINSTANCE.createSystem(),
        URI.createURI(projectPath.resolve("example.model").toString()));
    });
    Assertions.assertFalse(getDefaultView(vsum).getRootObjects().isEmpty(),"Modification of view failed");
  }

  @Test
  void testTGGChangePropagationSpecification() {
    VirtualModel vsum = createVirtualModel(new Model1Model2TGGChangePropagationSpecification(
            new File("C:\\Users\\XPS-15\\IdeaProjects\\Vitruv-TGG-Integration-Test\\eclipse-ibex-workspace\\Something2Else"),
//            new File("C:\\Users\\XPS-15\\eclipse-workspace\\Model2Model2"),
            Model2Package.eINSTANCE.getRoot(),
            URI.createURI(projectPath.resolve("exampleTarget.model").toString())));
    // since we can only access the models in the VSUM via views, we create a trivial view that represents the identity mapping.
    // This commitableView includes the strategy to generate the change sequence
    CommittableView view = getDefaultView(vsum).withChangeDerivingTrait();

    // create changes and trigger change propagation
    logger.info("##################################### first change commit: Few changes!");

    modifyView(view, (CommittableView v) -> {
      System system = ModelFactory.eINSTANCE.createSystem();
      v.registerRoot(
              system,
              URI.createURI(projectPath.resolve("example.model").toString()));

      //TODO revert commenting-out these changes
//      system.getComponents().add(ModelFactory.eINSTANCE.createComponent());
//      Link link = ModelFactory.eINSTANCE.createLink();
//      system.getLinks().add(link);
    });


    java.lang.System.exit(0);


    logger.info("##################################### second change commit: More changes!");
    CommittableView view2 = getDefaultView(vsum).withChangeDerivingTrait();
    modifyView(view2, (CommittableView v) -> {
      System root = (System) v.getRootObjects().stream().findAny().orElseThrow();

      // add protocol to a link and to root
      Link link = root.getLinks().get(0);
      link.setProtocol(ModelFactory.eINSTANCE.createProtocol());
//      v.registerRoot(link,
//              URI.createURI(projectPath.resolve("example.model").toString()));
      // TODO warum muss man das machen, wenn protocol schon zu link zugeordnet ist?
      //  (auch wenn man im Ecore die Kompositionsbeziehung entfernt...) -> liegt das an dem .genmodel file
      root.getProtocols().add(link.getProtocol());

      // component stuff
      root.getComponents().get(0).setName("näim");
//      root.getComponents().add(ModelFactory.eINSTANCE.createComponent());
//      root.getComponents().add(ModelFactory.eINSTANCE.createComponent());
    });
//    vsum.createSelector(ViewTypeFactory.createIdentityMappingViewType("default"));

    Assertions.assertFalse(getDefaultView(vsum).getRootObjects().isEmpty(),"Modification of view failed");
  }

  private VirtualModel createVirtualModel(ChangePropagationSpecification cps) {
    return new VirtualModelBuilder()
            .withStorageFolder(projectPath)
            .withUserInteractorForResultProvider(new TestUserInteraction.ResultProvider(new TestUserInteraction()))
            .withChangePropagationSpecifications(cps)
            .buildAndInitialize();
  }
  private VirtualModel createDefaultVirtualModel() {
    return createVirtualModel(new Model2Model2ChangePropagationSpecification());
  }

  private View getDefaultView(VirtualModel vsum) {
    var selector = vsum.createSelector(ViewTypeFactory.createIdentityMappingViewType("default"));
    selector.getSelectableElements().forEach(it -> selector.setSelected(it, true));
    return selector.createView();
  }

  /**
   * Applies modifications from the given modificationFunction and commits the changes afterwards, triggering the change propagation
   * @param view
   * @param modificationFunction
   */
  private void modifyView(CommittableView view, Consumer<CommittableView> modificationFunction) {
    modificationFunction.accept(view);
    view.commitChanges();
  }

}
