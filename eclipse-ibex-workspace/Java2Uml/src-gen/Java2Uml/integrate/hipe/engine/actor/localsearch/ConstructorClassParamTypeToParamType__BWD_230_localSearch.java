package Java2Uml.integrate.hipe.engine.actor.localsearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.match.OverlapMatch;
import hipe.engine.match.LocalSearchMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.production.MatchAdded;
import hipe.engine.message.production.MatchDeleted;
import hipe.engine.util.HiPEMultiUtil;

import hipe.network.LocalSearchNode;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;
import hipe.generic.actor.local.GenericLocalSearchActor;
import hipe.generic.actor.local.search.*;
import hipe.generic.actor.local.search.misc.*;

import org.eclipse.emf.ecore.EObject;

public class ConstructorClassParamTypeToParamType__BWD_230_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	CachedEdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	EdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	PACExplorer pac_explorer;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_3_2_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_4_2_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_6_1_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration pac_explorer_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaClassifierToUmlClassifier) o).getSource(); return (result instanceof org.emftext.language.java.classifiers.Class ? result : null);};
						edge_explorer = new CachedEdgeExplorer(this, 1, 0, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaParameterToParameter) o).getTarget(); return (result instanceof uml.Parameter ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 5, 8, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaConstructorToOperation) o).getSource(); return (result instanceof org.emftext.language.java.members.Constructor ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 2, 3, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaClassifierToUmlClassifier) o).getTarget(); return (result instanceof uml.Class ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 1, 6, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.multi_lookup = (o) -> ((org.emftext.language.java.parameters.Parametrizable) o).getParameters();
						edge_explorer_6_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.emftext.language.java.members.Constructor) return edge_explorer_6_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_6 = new EdgeExplorer(this, 3, 4, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaConstructorToOperation) o).getTarget(); return (result instanceof uml.Operation ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 2, 7, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaParameterToParameter) o).getSource(); return (result instanceof org.emftext.language.java.parameters.Parameter ? result : null);};
						edge_explorer_8 = new CachedEdgeExplorer(this, 5, 4, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {6,7,8}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_3_2_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		edge_explorer_4_1_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_4_2_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_6_1_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("ConstructorClassParamTypeToParamType__BWD_production"), this::returnTrue , 0  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("ConstructorClassParamTypeToParamType__CONSISTENCY_264_localSearch"), this::returnTrue  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Class_object_SP2": 
				{
					
					// classifier
					HMatch match_0 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_2_orchestration, match_0);
				}
				break;
			case "JavaClassifierToUmlClassifier_object_SP27": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_5.registerSourceObject(objs[0]);
					
					// javaClassifierToUmlClassifier
					HMatch match_1 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_1_orchestration, match_1);
				}
				break;
			case "JavaConstructorToOperation_object_SP1": 
				{
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					
					// javaConstructorToOperation
					HMatch match_2 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					match_2.getNodes()[2] = objs[0];
					start(edge_explorer_4_1_orchestration, match_2);
				}
				break;
			case "Constructor_object_SP2": 
				{
					if(!lazy_initialization) {
						
						// javaParametrizable
						HMatch match_3 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
						match_3.getNodes()[3] = objs[0];
						start(edge_explorer_4_2_orchestration, match_3);
					}
				}
				break;
			case "Parameter_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// parameter
						HMatch match_4 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
						match_4.getNodes()[4] = objs[0];
						start(edge_explorer_6_1_orchestration, match_4);
					}
				}
				break;
			case "JavaParameterToParameter_object_SP0": 
				{
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					
					// parameterToParameter
					HMatch match_5 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_3_1_orchestration, match_5);
				}
				break;
			case "ConstructorClassParamTypeToParamType__TRG_226_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
						acMatch_0.getNodes()[6] = objs[0];
						acMatch_0.getNodes()[7] = objs[1];
						acMatch_0.getNodes()[8] = objs[2];
						
						// start search
						currentDepth++;
						start(pac_explorer_orchestration, acMatch_0);
						currentDepth--;
					}
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "Class_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "JavaClassifierToUmlClassifier_object_SP27": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "JavaConstructorToOperation_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Constructor_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "Parameter_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "JavaParameterToParameter_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "ConstructorClassParamTypeToParamType__TRG_226_localSearch": 
				if(pac_explorer.deregister(match)) {
					OverlapMatch acMatch_0 = new OverlapMatch(3);
					acMatch_0.getNodes()[0] = match.getNodes()[0];
					acMatch_0.getNodes()[1] = match.getNodes()[1];
					acMatch_0.getNodes()[2] = match.getNodes()[2];
					Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
					if(o2Matches_0 != null) {
						if(!o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.classifiers.Class) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.classifiers.Class) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.classifiers.Class) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaParameterToParameter_target_Parameter": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Parameter) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Parameter) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Parameter) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaConstructorToOperation_source_Constructor": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.members.Constructor) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.members.Constructor) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.members.Constructor) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Class) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Class) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "org.emftext.language.java.parameters.Parametrizable_parameters_Parameter": 
			if(!lazy_initialization) {
				if(msg.source instanceof org.emftext.language.java.members.Constructor) {
				{
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.source instanceof org.emftext.language.java.members.Constructor) {
				{
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaConstructorToOperation_target_Operation": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Operation) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Operation) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaParameterToParameter_source_Parameter": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.parameters.Parameter) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removeReference(ReferenceDeleted msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Java2Uml.JavaParameterToParameter_target_Parameter": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				break;
		case "Java2Uml.JavaConstructorToOperation_source_Constructor": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				break;
		case "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "org.emftext.language.java.parameters.Parametrizable_parameters_Parameter": 
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				break;
		case "Java2Uml.JavaConstructorToOperation_target_Operation": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "Java2Uml.JavaParameterToParameter_source_Parameter": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				break;
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		// register ConstructorClassParamTypeToParamType__TRG
		OverlapMatch oMatch_0 = new OverlapMatch(3);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[6];
		oMatch_Nodes_0[1] = objs[7];
		oMatch_Nodes_0[2] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		
		// register classifier
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register javaClassifierToUmlClassifier
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register javaConstructorToOperation
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register javaParametrizable
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register parameter
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register parameterToParameter
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register umlParameter
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 == null) {
			matches_8 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[8], matches_8);
		}
		matches_8.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister ConstructorClassParamTypeToParamType__TRG
		OverlapMatch oMatch_0 = new OverlapMatch(3);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[6];
		oMatch_Nodes_0[1] = objs[7];
		oMatch_Nodes_0[2] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister classifier
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister javaClassifierToUmlClassifier
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister javaConstructorToOperation
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister javaParametrizable
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister parameter
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister parameterToParameter
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister umlParameter
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 != null) {
			matches_8.remove(match);
		}
		
	}
	
	@Override
	protected void changeAttribute(AttributeChanged message) {
		initialMessage = message.initialMessage;

		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof uml.Parameter) {
			HMatch match_8 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
			match_8.getNodes()[8] = obj;
			Collection<HMatch> formerMatches_8 = obj2matches.get(obj);
			if(formerMatches_8 != null) {
				
				formerMatches_8 = formerMatches_8.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_8);
			}
			start(edge_explorer_3_2_orchestration, match_8);
		}
		if(obj instanceof org.emftext.language.java.parameters.Parameter) {
			HMatch match_4 = new LocalSearchMatch("ConstructorClassParamTypeToParamType__BWD_230_localSearch", 9);
			match_4.getNodes()[4] = obj;
			Collection<HMatch> formerMatches_4 = obj2matches.get(obj);
			if(formerMatches_4 != null) {
				
				formerMatches_4 = formerMatches_4.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_4);
			}
			start(edge_explorer_6_1_orchestration, match_4);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		org.emftext.language.java.parameters.Parameter parameter = (org.emftext.language.java.parameters.Parameter) match.getNodes()[4];
		uml.Parameter umlParameter = (uml.Parameter) match.getNodes()[8];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_27 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_27.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, parameter.getName(), "java.lang.String"));
		csp_27.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlParameter.getName(), "java.lang.String"));
		csp_27.solve();
		
		boolean predicate = csp_27.isSatisfied();
		return predicate;
	}
	
	
}

