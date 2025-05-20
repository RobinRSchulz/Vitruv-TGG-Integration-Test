package tools.vitruv.methodologisttemplate.vsum.util;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import tools.vitruv.change.composite.description.VitruviusChange;

import java.io.IOException;
import java.util.List;

public class TGGModelAndChangeSequenceGenerator extends MODELGEN {

    public TGGModelAndChangeSequenceGenerator(TGGModelGenRegistrationHelper registrationHelper) throws IOException {
        super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
            @Override
            public void saveModels() throws IOException {
                super.saveModels();
            }
            @Override
            public void loadModels() throws IOException {
                super.loadModels();
            }
        }));
    }


    public TGGModelAndChangeSequenceGenerator generateModels(int size, String rootRule, List<String> concreteNonRootRules) throws IOException {
        MODELGENStopCriterion stopCriterion = new MODELGENStopCriterion(this.getTGG());
        stopCriterion.setMaxSrcCount(size);

        // we use one root
        stopCriterion.setMaxRuleCount(rootRule, 1);
        // we need to do that because the modelgenerator otherwise always applies the same rule...
        concreteNonRootRules.forEach(rule -> stopCriterion.setMaxRuleCount(rule, (size-1)/(concreteNonRootRules.size())));

        this.setStopCriterion(stopCriterion);
        long startTime = System.currentTimeMillis();
        this.run();
        long endTime = System.currentTimeMillis();
        logger.info("Completed IBeX modelgen in " + (endTime - startTime) + "ms");

        this.saveModels();
        this.terminate();

        return this;
    }

    public VitruviusChange<EObject> generateChangeSequenceForCreated() throws IOException {
        Resource generatedModel = this.getResourceHandler()
                .loadResource(this.options.project.path() + "/instances/src.xmi");
        return new EObjectChangeResolutionStrategy().getEObjectChangeSequenceForCreated(generatedModel);
    }

    public Resource getSourceModel() throws IOException {
        return this.getResourceHandler()
                .loadResource(this.options.project.path() + "/instances/src.xmi");
    }
    public Resource getTargetModel() throws IOException {
        return this.getResourceHandler()
                .loadResource(this.options.project.path() + "/instances/src.xmi");
    }
}
