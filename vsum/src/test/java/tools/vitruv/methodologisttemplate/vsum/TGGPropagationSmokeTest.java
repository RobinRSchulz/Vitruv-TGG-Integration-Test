package tools.vitruv.methodologisttemplate.vsum;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;
import tools.vitruv.change.propagation.ChangePropagationSpecification;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.VitruviusTGGChangePropagationResult;
import tools.vitruv.framework.vsum.VirtualModelBuilder;
import tools.vitruv.methodologisttemplate.model.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
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
import tools.vitruv.methodologisttemplate.model.model2.Model2Factory;
import tools.vitruv.methodologisttemplate.model.model2.Model2Package;
import tools.vitruv.methodologisttemplate.model.model2.Root;

import tools.vitruv.methodologisttemplate.vsum.ChangePropSpec.Model1ToModel2TGGCPS;
import tools.vitruv.methodologisttemplate.vsum.ChangePropSpec.Model2ToModel1TGGCPS;
import tools.vitruv.methodologisttemplate.vsum.TGGResultAssertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tools.vitruv.methodologisttemplate.vsum.TGGResultAssertions.assertStructure;

/**
 * This class provides an example how to define and use a VSUM.
 */
public class TGGPropagationSmokeTest {
  public static final Path IBEX_PROJECT_ROOT = Path.of("../eclipse-ibex-workspace/Something2Else");
  public static final Path CORR_RELATIVE_PATH =     Path.of("instances/corr.xmi");
  public static final Path PROTOCOL_RELATIVE_PATH = Path.of("instances/protocol.xmi");
  static Logger logger = Logger.getLogger(TGGPropagationSmokeTest.class);

  final Path VITRUVIUS_PROJECT_PATH = Path.of("target/vsumexample/" + this.getClass().getSimpleName());

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
  }

  @Test
  void testTRGToSRC() throws Exception {
    TGGChangePropagationSpecification tggCps = new Model2ToModel1TGGCPS(
            IBEX_PROJECT_ROOT.toFile(),
            ModelPackage.eINSTANCE.getSystem(), //TODO check if in metamodel (in
            URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("model_instance.model").toString()));
    VirtualModel vsum = createVirtualModel(tggCps);
    // since we can only access the models in the VSUM via views, we create a trivial view that represents the identity mapping.
    // This commitableView includes the strategy to generate the change sequence

    CommittableView view = getDefaultView(vsum).withChangeDerivingTrait();
    // create changes and trigger change propagation
    logger.info("##################################### first change commit: Few changes!");
    assertTrue(tggCps.getVitruviusTGGChangePropagationResults().isEmpty());
    modifyView(view, (CommittableView v) -> {
      Root root = Model2Factory.eINSTANCE.createRoot();

      v.registerRoot(
              root,
              URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("model2_instance.model").toString()));

      // multiple possibilities! what to do, i say! --> TODO need attribute condition support for such ambiguities??
      root.getEntities().add(Model2Factory.eINSTANCE.createEntity());
    });
    view.update();
    view.close();
    assertEquals(1, tggCps.getVitruviusTGGChangePropagationResults().size()); // one run has been made
    assertEquals(2, tggCps.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
    assertEquals(0, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
    assertEquals(0, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
    logger.info("after testTRGToSRC()");
  }

  @Test
  void testSRCToTRGWithRepair() throws Exception {
    List<VitruviusTGGChangePropagationResult> results = testSRCToTRG(true);
    assertStructure(results.getLast(),
            new CPSResultExpectation()
                    .expectAddedCorrs(
                            new CorrExpectation("LinkToEntity",
                                    new EObjectExpectation(ModelPackage.eINSTANCE.getLink()),
                                    new EObjectExpectation(Model2Package.eINSTANCE.getEntity())))
                    .expectRemovedCorrs(
                            new CorrExpectation("LinkToEntity",
                                    new EObjectExpectation(ModelPackage.eINSTANCE.getLink()),
                                    new EObjectExpectation(Model2Package.eINSTANCE.getEntity())))
                    .expectRevokedModelNodes(
                            new EObjectExpectation(Model2Package.eINSTANCE.getEntity()))
    );
  }

  @Test
  void testSRCToTRGWithoutRepair() throws Exception {
    List<VitruviusTGGChangePropagationResult> results = testSRCToTRG(false);
    assertStructure(results.getLast(),
            new CPSResultExpectation()
                    .expectAddedCorrs() // no added corrs expected
                    .expectRemovedCorrs(
                            new CorrExpectation("LinkToEntity",
                                    new EObjectExpectation(ModelPackage.eINSTANCE.getLink()),
                                    new EObjectExpectation(Model2Package.eINSTANCE.getEntity())))
                    .expectRevokedModelNodes(
                            new EObjectExpectation(Model2Package.eINSTANCE.getEntity()))
    );
  }

  List<VitruviusTGGChangePropagationResult> testSRCToTRG(boolean withRepair) throws Exception {
    TGGChangePropagationSpecification tggCps = new Model1ToModel2TGGCPS(
            IBEX_PROJECT_ROOT.toFile(),
            Model2Package.eINSTANCE.getRoot(),
            URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("model2_instance.model").toString()));
    VirtualModel vsum = createVirtualModel(tggCps);
    // since we can only access the models in the VSUM via views, we create a trivial view that represents the identity mapping.
    // This commitableView includes the strategy to generate the change sequence
    CommittableView view = getDefaultView(vsum).withChangeDerivingTrait();

    // create changes and trigger change propagation
    logger.info("##################################### first change commit: Few changes!");

    assertTrue(tggCps.getVitruviusTGGChangePropagationResults().isEmpty());
    modifyView(view, (CommittableView v) -> {
      System root = ModelFactory.eINSTANCE.createSystem();
      v.registerRoot(
              root,
              URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("model_instance.model").toString()));

      root.getProtocols().add(ModelFactory.eINSTANCE.createProtocol());   // ProtocolToEntity
      root.getComponents().add(ModelFactory.eINSTANCE.createComponent());
      root.getComponents().add(ModelFactory.eINSTANCE.createComponent());
      root.getComponents().add(ModelFactory.eINSTANCE.createComponent());

      root.getComponents().getFirst().setName("firscht");
    });
    view.update();
    view.close();
    assertEquals(1, tggCps.getVitruviusTGGChangePropagationResults().size()); // one run has been made
    assertEquals(5, tggCps.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
    assertEquals(0, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
    assertEquals(0, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());

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
      root.getComponents().get(1).setName("sekend");
      root.getComponents().getLast().setName("lascht");

      root.getComponents().remove(root.getComponents().getLast());
    });
    view2.update();
    view2.close();
    assertEquals(2, tggCps.getVitruviusTGGChangePropagationResults().size()); // one run has been made
    assertEquals(3, tggCps.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size()); //two corrs have been created + apparently a third because of the attribute change(?)
    assertEquals(2, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size()); // 1 delete, 1 because of attr change
    assertEquals(2, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size()); // the corr with the attribute change
    // this counts all deleted nodes that the RedInterpreter deletes.
    // That explicitly doesn't encompass nodes deleted directly by the source change
    assertEquals(2, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedModelNodes().size());
    //TODO assert deletion somehow! WE ALSO NEED THIS TO DELETE CORRESPONDENCES IN VITRUVIUS!

    //TODO add checking number of markers (as assertion!)
    logger.info("##################################### third change commit: RemoveRootEChange!");
    CommittableView view3 = getDefaultView(vsum).withChangeRecordingTrait();
    modifyView(view3, (CommittableView v) -> {
      System root = (System) v.getRootObjects().stream().findAny().orElseThrow();
      // remove but not delete (since it is contained in root
      Link link = root.getLinks().getFirst();
      link.getComponents().removeFirst();

      //TODO remove SCR application test
      if (withRepair) {
        link.getComponents().add(root.getComponents().getLast()); //sekend
      }

    });

    Assertions.assertFalse(getDefaultView(vsum).getRootObjects().isEmpty(),"Modification of view failed");
    return tggCps.getVitruviusTGGChangePropagationResults();
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
