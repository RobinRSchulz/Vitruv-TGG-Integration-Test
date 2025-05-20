package tools.vitruv.methodologisttemplate.vsum.util;

import language.TGGNamedElement;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.common.operational.IMatchObserver;
import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;
import org.emoflon.ibex.gt.democles.runtime.IBeXToDemoclesPatternTransformation;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXContextPattern;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXModel;
import org.emoflon.ibex.patternmodel.IBeXPatternModel.IBeXPatternSet;
import org.emoflon.ibex.tgg.compiler.transformations.patterns.ContextPatternTransformation;
import org.emoflon.ibex.tgg.operational.IBlackInterpreter;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.modules.MatchDistributor;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGMatch;
import org.emoflon.ibex.tgg.runtime.democles.TGGIBeXToDemoclesPatternTransformation;
import org.emoflon.ibex.tgg.runtime.democles.csp.nativeOps.*;
import org.gervarro.democles.common.DataFrame;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.plan.incremental.leaf.Component;
import org.gervarro.democles.plan.incremental.leaf.ReteSearchPlanAlgorithm;
import org.gervarro.democles.runtime.GenericOperationBuilder;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.TypeModule;

import java.util.*;
import java.util.stream.Collectors;

public class ModelgenDemoclesTGGEngine extends DemoclesGTEngine implements IBlackInterpreter {
    private static final Logger log = Logger.getLogger(ModelgenDemoclesTGGEngine.class);
    private IbexOptions ibexOptions;
    private IBeXPatternSet ibexPatterns;
    private Map<IBeXContextPattern, TGGNamedElement> patternToRuleMap;

    @Override
    public void initialise(IbexExecutable executable, IbexOptions options, EPackage.Registry registry, IMatchObserver matchObserver) {
        super.initialise(registry, matchObserver);
        this.ibexOptions = options;
        ContextPatternTransformation compiler = new ContextPatternTransformation(options, (MatchDistributor)matchObserver);

        IBeXModel ibexModel = compiler.transform();
        this.ibexPatterns = ibexModel.getPatternSet();
        this.ibexPatterns.getContextPatterns().removeAll(
                this.ibexPatterns.getContextPatterns().stream()
                        .filter(IBeXContextPattern.class::isInstance)
                        .map(IBeXContextPattern.class::cast)
                        .filter(iBeXContextPattern ->
                                iBeXContextPattern.getLocalNodes().stream().anyMatch(iBeXNode -> iBeXNode.getType() == null)
                                || iBeXContextPattern.getLocalEdges().stream().anyMatch(iBeXEdge -> iBeXEdge.getType() == null))
                        .collect(Collectors.toSet())
        );
        this.ibexOptions.tgg.flattenedTGG().getRules().removeAll(
                this.ibexOptions.tgg.getFlattenedConcreteTGGRules().stream()
                        .filter(tggRule -> tggRule.getNodes().stream().anyMatch(tggRuleNode -> tggRuleNode.getType() == null || tggRuleNode.getType().eIsProxy())
                                || tggRule.getEdges().stream().anyMatch(tggRuleEdge -> tggRuleEdge.getType() == null || tggRuleEdge.getType().eIsProxy()))
                        .collect(Collectors.toSet())
        );
        this.ibexOptions.tgg.tgg().getRules().removeAll(
                this.ibexOptions.tgg.getFlattenedConcreteTGGRules().stream()
                        .filter(tggRule -> tggRule.getNodes().stream().anyMatch(tggRuleNode -> tggRuleNode.getType() == null || tggRuleNode.getType().eIsProxy())
                                || tggRule.getEdges().stream().anyMatch(tggRuleEdge -> tggRuleEdge.getType() == null || tggRuleEdge.getType().eIsProxy()))
                        .collect(Collectors.toSet())
        );

        this.patternToRuleMap = getPatternToRuleMap(this.ibexPatterns);
        this.initPatterns(this.ibexPatterns);
    }

    @Override
    public void initPatterns(IBeXPatternSet ibexPatternSet) {
        IBeXToDemoclesPatternTransformation transformation = new TGGIBeXToDemoclesPatternTransformation(this.ibexOptions, this.patternToRuleMap);
        this.setPatterns(transformation.transform(ibexPatternSet));
        this.savePatternsForDebugging();
        this.createAndRegisterPatterns();
    }

    @Override
    protected ReteSearchPlanAlgorithm initReteSearchPlanAlgorithm(Collection<OperationBuilder<Component, Component, VariableRuntime>> builders) {
        ReteSearchPlanAlgorithm algorithm = super.initReteSearchPlanAlgorithm(builders);
        this.handleTGGAttributeConstraints().ifPresent((b) -> algorithm.addComponentBuilder(b));
        return algorithm;
    }

    private Optional<TGGConstraintComponentBuilder<VariableRuntime>> handleTGGAttributeConstraints() {
        TGGAttributeConstraintModule.INSTANCE.registerConstraintTypes(this.ibexOptions.csp.constraintProvider());
        TypeModule<TGGAttributeConstraintModule> tggAttributeConstraintTypeModule = new TGGAttributeConstraintTypeModule(TGGAttributeConstraintModule.INSTANCE);
        this.patternBuilder.addConstraintTypeSwitch(tggAttributeConstraintTypeModule.getConstraintTypeSwitch());
        TGGNativeOperationBuilder<VariableRuntime> tggNativeOperationModule = new TGGNativeOperationBuilder(this.ibexOptions.csp.constraintProvider());
        GenericOperationBuilder<VariableRuntime> tggBatchOperationModule = new GenericOperationBuilder(tggNativeOperationModule, TGGAttributeConstraintAdornmentStrategy.INSTANCE);
        this.retePatternMatcherModule.addOperationBuilder(tggBatchOperationModule);
        return Optional.of(new TGGConstraintComponentBuilder(tggNativeOperationModule));
    }

    @Override
    public void monitor(Collection<Resource> resources) {
        if (this.ibexOptions.debug.ibexDebug()) {
            this.savePatterns(this.resourceSet, this.ibexOptions.project.path() + "/debug/democles-patterns.xmi", (Collection)this.patterns.values().stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList()));
            this.savePatterns(this.resourceSet, this.ibexOptions.project.path() + "/debug/ibex-patterns.xmi", Arrays.asList(this.ibexPatterns));
        }

        super.monitor(resources);
    }

    private void savePatterns(ResourceSet rs, String path, Collection<EObject> patterns) {
        Resource democlesPatterns = rs.createResource(URI.createPlatformResourceURI(path, true));
        democlesPatterns.getContents().addAll(patterns);

        try {
            democlesPatterns.save((Map)null);
            rs.getResources().remove(democlesPatterns);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected IMatch createMatch(DataFrame frame, Pattern pattern) {
        return new DemoclesTGGMatch(frame, pattern);
    }

    private Map<IBeXContextPattern, TGGNamedElement> getPatternToRuleMap(IBeXPatternSet ibexPatterns) {
        return ibexPatterns.getContextPatterns().stream()
                .filter(IBeXContextPattern.class::isInstance)
                .map(IBeXContextPattern.class::cast)
                .collect(Collectors.toMap(
                        ibexContextPattern -> ibexContextPattern,
                        iBeXContextPattern -> getRuleForPattern(iBeXContextPattern)
                ));
    }

    private TGGNamedElement getRuleForPattern(IBeXContextPattern iBeXContextPattern) {
        return this.ibexOptions.tgg.getFlattenedConcreteTGGRules().stream()
                .filter(tggRule -> iBeXContextPattern.getName().startsWith(tggRule.getName()))
                .findAny()
                .orElse(null);
    }
}
