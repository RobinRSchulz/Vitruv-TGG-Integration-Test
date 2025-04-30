package tools.vitruv.methodologisttemplate.vsum.util;


import com.google.common.base.Preconditions;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import tools.vitruv.change.atomic.EChange;
import tools.vitruv.change.atomic.TypeInferringAtomicEChangeFactory;
import tools.vitruv.change.atomic.eobject.CreateEObject;
import tools.vitruv.change.atomic.eobject.DeleteEObject;
import tools.vitruv.change.atomic.feature.UnsetFeature;
import tools.vitruv.change.atomic.feature.attribute.InsertEAttributeValue;
import tools.vitruv.change.atomic.feature.attribute.RemoveEAttributeValue;
import tools.vitruv.change.atomic.feature.attribute.ReplaceSingleValuedEAttribute;
import tools.vitruv.change.atomic.feature.reference.InsertEReference;
import tools.vitruv.change.atomic.feature.reference.RemoveEReference;
import tools.vitruv.change.atomic.feature.reference.ReplaceSingleValuedEReference;
import tools.vitruv.change.atomic.hid.HierarchicalId;
import tools.vitruv.change.atomic.hid.internal.HierarchicalIdResolver;
import tools.vitruv.change.atomic.resolve.AtomicEChangeResolverHelper;
import tools.vitruv.change.atomic.root.InsertRootEObject;
import tools.vitruv.change.atomic.root.RemoveRootEObject;
import tools.vitruv.change.composite.description.VitruviusChange;
import tools.vitruv.change.composite.description.VitruviusChangeFactory;
import tools.vitruv.change.composite.description.VitruviusChangeResolver;
import tools.vitruv.framework.views.changederivation.DefaultStateBasedChangeResolutionStrategy;

import java.io.IOException;
import java.util.List;

public class TGGModelAndChangeSequenceGenerator extends MODELGEN {

    private TGGModelGenRegistrationHelper registrationHelper;

    public TGGModelAndChangeSequenceGenerator(TGGModelGenRegistrationHelper registrationHelper) throws IOException {
        super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
            @Override
            public void saveModels() throws IOException {
                //TODO bey Bedarf implementieren
                super.saveModels();
            }
            @Override
            public void loadModels() throws IOException {
                //TODO bey Bedarf implementieren
                super.loadModels();
            }
        }));
    }


    public TGGModelAndChangeSequenceGenerator generateModels(int size, String rootRule, List<String> concreteNonRootRules) throws IOException {
        //TODO somehow generate EChange sequence out of this. IDEA maybe use protocol and my Vitruv-TGG stuff!
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);

        MODELGENStopCriterion stopCriterion = new MODELGENStopCriterion(this.getTGG());

        stopCriterion.setMaxSrcCount(size);

        // we use one root todo maybe change
        stopCriterion.setMaxRuleCount(rootRule, 1);
        // we need to do it because the modelgenerator otherwise always applies the same rule...
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

    public VitruviusChange<EObject> generateChangeSequence() throws IOException {
        Resource generatedModel = this.getResourceHandler()
                .loadResource(this.options.project.path() + "/instances/src.xmi");


        return new EObjectChangeResolutionStrategy().getEObjectChangeSequenceForCreated(generatedModel);

//        VitruviusChange<HierarchicalId> vitruviusChangeHierarchicalId = new DefaultStateBasedChangeResolutionStrategy().getChangeSequenceForCreated(generatedModel);
//
//
////        return VitruviusChangeResolver.forHierarchicalIds(this.getResourceHandler().getModelResourceSet()).resolveAndApply(vitruviusChangeHierarchicalId);
//        return VitruviusChangeFactory.getInstance().createTransactionalChange(
//                vitruviusChangeHierarchicalId.getEChanges().stream()
////                        .map(hierarchicalIdEChange -> eObjectEChangeFromHierarchicalIdEChange(hierarchicalIdEChange))
//                        .map(hierarchicalIdEChange -> resolve(hierarchicalIdEChange))
//                        .toList()
//        );
    }

    public Resource getSourceModel() throws IOException {
        return this.getResourceHandler()
                .loadResource(this.options.project.path() + "/instances/src.xmi");
    }
    public Resource getTargetModel() throws IOException {
        return this.getResourceHandler()
                .loadResource(this.options.project.path() + "/instances/src.xmi");
    }




    private EChange<EObject> resolve(EChange<HierarchicalId> unresolvedChange) {
        HierarchicalIdResolver idResolver = HierarchicalIdResolver.create(this.getResourceHandler().getModelResourceSet());
        return AtomicEChangeResolverHelper.resolveChange(unresolvedChange, (id) -> {
            if (unresolvedChange instanceof CreateEObject<HierarchicalId> createChange) {
                EObject createdElement = EcoreUtil.create(createChange.getAffectedEObjectType());
                HierarchicalId createdId = idResolver.getAndUpdateId(createdElement);
                Preconditions.checkState(createdId.equals(id), "generated ID %s does not match the original ID %s on element creation", createdId, id);
                return createdElement;
            } else {
                return idResolver.getEObject(id);
            }
        }, (resource) -> idResolver.getResource(resource.getURI()));
    }

    /**
     *
     * @return a copy of everything but with EObject but with HierarchicalId ...
     */
    private EChange<EObject> eObjectEChangeFromHierarchicalIdEChange(EChange<HierarchicalId> hierarchicalIdEchange) {
        return switch (hierarchicalIdEchange) {
            case CreateEObject<HierarchicalId> createEObject ->
                    TypeInferringAtomicEChangeFactory.getInstance().createCreateEObjectChange(createEObject.getAffectedElement());
            case DeleteEObject<HierarchicalId> deleteEObject ->
                    TypeInferringAtomicEChangeFactory.getInstance().createDeleteEObjectChange(deleteEObject.getAffectedElement());
            case InsertRootEObject<HierarchicalId> insertRootEObject ->
                    TypeInferringAtomicEChangeFactory.getInstance().createInsertRootChange(insertRootEObject.getNewValue(), insertRootEObject.getResource(), insertRootEObject.getIndex());
            case RemoveRootEObject<HierarchicalId> removeRootEObject ->
                    TypeInferringAtomicEChangeFactory.getInstance().createRemoveRootChange(removeRootEObject.getOldValue(), removeRootEObject.getResource(), removeRootEObject.getIndex());
            case UnsetFeature<HierarchicalId, ?> unsetFeature ->
                    TypeInferringAtomicEChangeFactory.getInstance().createUnsetFeatureChange(unsetFeature.getAffectedElement(), unsetFeature.getAffectedFeature());
            case InsertEAttributeValue<HierarchicalId, ?> insertEAttributeValue ->
                    TypeInferringAtomicEChangeFactory.getInstance().createInsertAttributeChange(insertEAttributeValue.getAffectedElement(), insertEAttributeValue.getAffectedFeature(),
                            insertEAttributeValue.getIndex(), insertEAttributeValue.getNewValue());
            case RemoveEAttributeValue<HierarchicalId, ?> removeEAttributeValue ->
                    TypeInferringAtomicEChangeFactory.getInstance().createRemoveAttributeChange(removeEAttributeValue.getAffectedElement(), removeEAttributeValue.getAffectedFeature(),
                            removeEAttributeValue.getIndex(), removeEAttributeValue.getOldValue());
            case ReplaceSingleValuedEAttribute<HierarchicalId, ?> replaceSingleValuedEAttribute ->
                    TypeInferringAtomicEChangeFactory.getInstance().createReplaceSingleAttributeChange(replaceSingleValuedEAttribute.getAffectedElement(), replaceSingleValuedEAttribute.getAffectedFeature(),
                            replaceSingleValuedEAttribute.getOldValue(), replaceSingleValuedEAttribute.getNewValue());
            case InsertEReference<HierarchicalId> insertEReference ->
                    TypeInferringAtomicEChangeFactory.getInstance().createInsertReferenceChange(insertEReference.getAffectedElement(), insertEReference.getAffectedFeature(), insertEReference.getNewValue(), insertEReference.getIndex());
            case RemoveEReference<HierarchicalId> removeEReference ->
                    TypeInferringAtomicEChangeFactory.getInstance().createRemoveReferenceChange(removeEReference.getAffectedElement(), removeEReference.getAffectedFeature(), removeEReference.getOldValue(), removeEReference.getIndex());
            case ReplaceSingleValuedEReference<HierarchicalId> replaceSingleValuedEReference ->
                    TypeInferringAtomicEChangeFactory.getInstance().createReplaceSingleReferenceChange(replaceSingleValuedEReference.getAffectedElement(), replaceSingleValuedEReference.getAffectedFeature(),
                            replaceSingleValuedEReference.getOldValue(), replaceSingleValuedEReference.getNewValue());
            case EChange<HierarchicalId> eChange1 -> null;
        };
    }
}
