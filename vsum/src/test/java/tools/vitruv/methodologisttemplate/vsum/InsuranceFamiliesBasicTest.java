package tools.vitruv.methodologisttemplate.vsum;

import edu.kit.ipd.sdq.metamodels.families.*;
import edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage;
import mir.reactions.model2Model2.Model2Model2ChangePropagationSpecification;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tools.vitruv.change.propagation.ChangePropagationSpecification;
import tools.vitruv.change.testutils.TestUserInteraction;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;
import tools.vitruv.framework.views.CommittableView;
import tools.vitruv.framework.views.View;
import tools.vitruv.framework.views.ViewTypeFactory;
import tools.vitruv.framework.vsum.VirtualModel;
import tools.vitruv.framework.vsum.VirtualModelBuilder;
import tools.vitruv.methodologisttemplate.model.model.ModelPackage;
import tools.vitruv.methodologisttemplate.model.model2.Model2Factory;
import tools.vitruv.methodologisttemplate.model.model2.Root;
import tools.vitruv.methodologisttemplate.vsum.ChangePropSpec.FamiliesToInsuranceCPS;
import tools.vitruv.methodologisttemplate.vsum.ChangePropSpec.Model2ToModel1TGGCPS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsuranceFamiliesBasicTest {


    public static final Path IBEX_PROJECT_ROOT = Path.of("../eclipse-ibex-workspace/Families2Insurance");
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
    void testSRCtoTRG() throws Exception {
        TGGChangePropagationSpecification tggCps = new FamiliesToInsuranceCPS(
                IBEX_PROJECT_ROOT.toFile(),
                InsurancePackage.eINSTANCE.getInsuranceDatabase(),
                URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("insurance_instance.model").toString()));
        VirtualModel vsum = createVirtualModel(tggCps);
        // since we can only access the models in the VSUM via views, we create a trivial view that represents the identity mapping.
        // This commitableView includes the strategy to generate the change sequence

        CommittableView view = getDefaultView(vsum).withChangeRecordingTrait();
        // create changes and trigger change propagation
        logger.info("##################################### first change commit: Few changes!");
        assertTrue(tggCps.getVitruviusTGGChangePropagationResults().isEmpty());
        modifyView(view, (CommittableView v) -> {
            FamilyRegister familyRegister = FamiliesFactory.eINSTANCE.createFamilyRegister();

            v.registerRoot(
                    familyRegister,
                    URI.createURI(VITRUVIUS_PROJECT_PATH.resolve("families_instance.model").toString()));

            Family family = FamiliesFactory.eINSTANCE.createFamily();
            family.setLastName("Schmitz");
            familyRegister.getFamilies().add(family);

            Member father = FamiliesFactory.eINSTANCE.createMember();
            father.setFirstName("Adalbert");
            father.setFamilyFather(family);
            family.setFather(father);

            Member son = FamiliesFactory.eINSTANCE.createMember();
            son.setFamilySon(family);
            family.getSons().add(son);

            Member daughter = FamiliesFactory.eINSTANCE.createMember();
            daughter.setFirstName("Berta");
            daughter.setFamilyDaughter(family);
            family.getDaughters().add(daughter);

        });
        view.update();
        view.close();
        assertEquals(1, tggCps.getVitruviusTGGChangePropagationResults().size()); // one run has been made
        assertEquals(7, tggCps.getVitruviusTGGChangePropagationResults().getLast().getAddedCorrespondences().size());
        assertEquals(0, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedMatches().size());
        assertEquals(0, tggCps.getVitruviusTGGChangePropagationResults().getLast().getRevokedCorrespondences().size());
        logger.info("after testTRGToSRC()");
    }
    /*
2025-04-01 14:00:02 DEBUG Started synchronizing change: TransactionalChangeImpl: [
        create Uuid(ord__1-TukA7wEfCAkPPwErZpDg)
        insert Uuid(ord__1-TukA7wEfCAkPPwErZpDg) at target\vsumexample\InsuranceFamiliesBasicTest\families_instance.model (index 0)
        create Uuid(ord__1-UVoA7wEfCAkPPwErZpDg)
        Uuid(ord__1-TukA7wEfCAkPPwErZpDg).families += Uuid(ord__1-UVoA7wEfCAkPPwErZpDg) (index 0)
        create Uuid(ord__1-U8sA7wEfCAkPPwErZpDg)
        Uuid(ord__1-UVoA7wEfCAkPPwErZpDg).father = Uuid(ord__1-U8sA7wEfCAkPPwErZpDg) (was )
        create Uuid(ord__1-U8sQ7wEfCAkPPwErZpDg)
        Uuid(ord__1-UVoA7wEfCAkPPwErZpDg).sons += Uuid(ord__1-U8sQ7wEfCAkPPwErZpDg) (index 0)
]

     */

    private VirtualModel createVirtualModel(ChangePropagationSpecification cps) {
        return new VirtualModelBuilder()
                .withStorageFolder(VITRUVIUS_PROJECT_PATH)
                .withUserInteractorForResultProvider(new TestUserInteraction.ResultProvider(new TestUserInteraction()))
                .withChangePropagationSpecifications(cps)
                .buildAndInitialize();
    }
//    private VirtualModel createDefaultVirtualModel() {
//        return createVirtualModel(new Model2Model2ChangePropagationSpecification());
//    }

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
