package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.*;
import tools.vitruv.change.propagation.ChangePropagationSpecification;
import tools.vitruv.dsls.tgg.emoflonintegration.Util;
import tools.vitruv.framework.vsum.VirtualModelBuilder;
import tools.vitruv.methodologisttemplate.model.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import mir.reactions.model2Model2.Model2Model2ChangePropagationSpecification;
import tools.vitruv.change.testutils.TestUserInteraction;
import tools.vitruv.framework.views.CommittableView;
import tools.vitruv.framework.views.View;
import tools.vitruv.framework.views.ViewTypeFactory;
import tools.vitruv.framework.vsum.VirtualModel;
import tools.vitruv.methodologisttemplate.model.model.System;
import tools.vitruv.methodologisttemplate.model.model2.Model2Package;

/**
 * This class provides an example how to define and use a VSUM.
 */
public class VSUMExampleTest {
  public static final Path IBEX_PROJECT_ROOT = Path.of("C:\\Users\\XPS-15\\IdeaProjects\\Vitruv-TGG-Integration-Test\\eclipse-ibex-workspace\\Something2Else");
  public static final Path CORR_RELATIVE_PATH =     Path.of("instances\\corr.xmi");
  public static final Path PROTOCOL_RELATIVE_PATH = Path.of("instances\\protocol.xmi");
  static Logger logger = Logger.getLogger(VSUMExampleTest.class);

  static final Path VITRUVIUS_PROJECT_PATH = Path.of("target/vsumexample");

  @BeforeAll
  static void setup() {
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
  }

  @BeforeEach
  void setupCorrAndProtocol() {
    // wipe corr and protocol This is done before, not afterwards, to be able to debug.
    logger.info("setupCorrAndProtocol: Wiping corr.xmi and protocol.xmi");
    try {
      Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(CORR_RELATIVE_PATH));
      Files.deleteIfExists(IBEX_PROJECT_ROOT.resolve(PROTOCOL_RELATIVE_PATH));
    } catch (IOException e) {
      throw new RuntimeException("Could not wipe CORR or PROTOCOL:" + e.getMessage(), e);
    }
//    sleepKSeconds(30, "sleeping to check if corr and protocol have been deleted...");
  }

  @Disabled
  @Test
  void testReactions() {
    VirtualModel vsum = createDefaultVirtualModel();
    CommittableView view = getDefaultView(vsum).withChangeDerivingTrait();
    modifyView(view, (CommittableView v) -> {
      v.registerRoot(
        ModelFactory.eINSTANCE.createSystem(),
        URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("example.model").toString()));
    });
    Assertions.assertFalse(getDefaultView(vsum).getRootObjects().isEmpty(),"Modification of view failed");
  }

  @Test
  void testCreateSaveAndDelete() throws Exception {
    VirtualModel vsum = createVirtualModel(new Model1Model2TGGChangePropagationSpecification(
            IBEX_PROJECT_ROOT.toFile(),
//            new File("C:\\Users\\XPS-15\\eclipse-workspace\\Model2Model2"),
            Model2Package.eINSTANCE.getRoot(),
            URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("exampleTarget.model").toString())));
    // since we can only access the models in the VSUM via views, we create a trivial view that represents the identity mapping.
    // This commitableView includes the strategy to generate the change sequence
    CommittableView view = getDefaultView(vsum).withChangeDerivingTrait();

    // create changes and trigger change propagation
    logger.info("##################################### first change commit: Few changes!");

    modifyView(view, (CommittableView v) -> {
      System root = ModelFactory.eINSTANCE.createSystem();
      v.registerRoot(
              root,
              URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("example.model").toString()));

//      root.getProtocols().add(ModelFactory.eINSTANCE.createProtocol());   // ProtocolToEntity
      root.getComponents().add(ModelFactory.eINSTANCE.createComponent());

      root.getComponents().add(ModelFactory.eINSTANCE.createComponent());
    });
    view.update();
    view.close();

//    sleepKSeconds(40, "after View update and close. Protocol should be there.");
    // 4 created, 7 found, 4 applied

    logger.info("##################################### second change commit: Deleting changes!");
    CommittableView view2 = getDefaultView(vsum).withChangeRecordingTrait();
    modifyView(view2, (CommittableView v) -> {
      System root = (System) v.getRootObjects().stream().findAny().orElseThrow();

      // Test if ProtocolToEntity is executed if we do it in this (new) instance!
      root.getProtocols().add(ModelFactory.eINSTANCE.createProtocol());


      // this should be covered by LinkToEntityEmbedded
      Protocol protocolFromRoot = root.getProtocols().getFirst();
      Link link = ModelFactory.eINSTANCE.createLink();
      root.getLinks().add(link);
      link.setProtocol(protocolFromRoot);
      link.getComponents().add(root.getComponents().getFirst());
//      root.getProtocols().add(link.getProtocol());

      // component stuff
      root.getComponents().getFirst().setName("firscht");
      root.getComponents().getLast().setName("lascht");

      root.getComponents().remove(root.getComponents().getLast());
    });
    view2.update();
    view2.close();

    //TODO add checking number of markers (as assertion!)
    logger.info("##################################### third change commit: RemoveRootEChange!");
    CommittableView view3 = getDefaultView(vsum).withChangeRecordingTrait();
    modifyView(view3, (CommittableView v) -> {
      System root = (System) v.getRootObjects().stream().findAny().orElseThrow();
      //TODO delete newroot->component
      // remove but not delete (since it is contained in root
      Link link = root.getLinks().getFirst();
      link.getComponents().removeFirst();

    });


    Assertions.assertFalse(getDefaultView(vsum).getRootObjects().isEmpty(),"Modification of view failed");
  }

  private VirtualModel createVirtualModel(ChangePropagationSpecification cps) {
    return new VirtualModelBuilder()
            .withStorageFolder(VITRUVIUS_PROJECT_PATH)
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

  private void sleepKSeconds(long seconds, String message) {
    logger.info("Sleeping " + seconds + " seconds:" + message);
      try {
          Thread.sleep(seconds * 1000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
  }
}
