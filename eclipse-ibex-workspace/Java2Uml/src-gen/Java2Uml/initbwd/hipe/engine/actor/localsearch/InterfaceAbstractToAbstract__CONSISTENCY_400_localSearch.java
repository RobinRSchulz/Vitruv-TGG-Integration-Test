package Java2Uml.initbwd.hipe.engine.actor.localsearch;

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

public class InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	EdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_6_1_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.multi_lookup = (o) -> ((org.emftext.language.java.modifiers.AnnotableAndModifiable) o).getAnnotationsAndModifiers().stream().filter(obj -> obj instanceof org.emftext.language.java.modifiers.Abstract).collect(Collectors.toList());
						edge_explorer_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof org.emftext.language.java.classifiers.Interface) return edge_explorer_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer = new EdgeExplorer(this, 0, 1, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.InterfaceAbstractToAbstract__Marker) o).getCREATE__SRC__modifier(); return (result instanceof org.emftext.language.java.modifiers.Abstract ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 4, 1, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.InterfaceAbstractToAbstract__Marker) o).getCONTEXT__SRC__javaConcreteClassifier(); return (result instanceof org.emftext.language.java.classifiers.Interface ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 4, 0, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.InterfaceAbstractToAbstract__Marker) o).getCONTEXT__TRG__umlClassifier(); return (result instanceof uml.Interface ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 4, 2, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> ((Java2Uml.InterfaceAbstractToAbstract__Marker) o).getCONTEXT__CORR__javaClassifierToUmlClassifier();
						edge_explorer_6 = new CachedEdgeExplorer(this, 4, 3, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaClassifierToUmlClassifier) o).getSource(); return (result instanceof org.emftext.language.java.classifiers.Interface ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 3, 0, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaClassifierToUmlClassifier) o).getTarget(); return (result instanceof uml.Interface ? result : null);};
						edge_explorer_8 = new CachedEdgeExplorer(this, 3, 2, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_6_1_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("InterfaceAbstractToAbstract__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Interface_1_object_SP2": 
				{
					
					// javaConcreteClassifier
					HMatch match_0 = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_1_orchestration, match_0);
				}
				break;
			case "Abstract_object": 
				{
					if(!lazy_initialization) {
						
						// modifier
						HMatch match_1 = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
						match_1.getNodes()[1] = objs[0];
						start(edge_explorer_2_orchestration, match_1);
					}
				}
				break;
			case "Interface_object_SP4": 
				{
					if(!lazy_initialization) {
						
						// umlClassifier
						HMatch match_2 = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
						match_2.getNodes()[2] = objs[0];
						start(edge_explorer_5_1_orchestration, match_2);
					}
				}
				break;
			case "JavaClassifierToUmlClassifier_object_SP6": 
				{
					edge_explorer_7.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					
					// javaClassifierToUmlClassifier
					HMatch match_3 = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_6_1_orchestration, match_3);
				}
				break;
			case "InterfaceAbstractToAbstract__Marker_object": 
				{
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					
					// InterfaceAbstractToAbstract_eMoflon_ProtocolNode
					HMatch match_4 = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_3_1_orchestration, match_4);
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
			case "Interface_1_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "Abstract_object": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "Interface_object_SP4": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "JavaClassifierToUmlClassifier_object_SP6": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "InterfaceAbstractToAbstract__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "org.emftext.language.java.modifiers.AnnotableAndModifiable_annotationsAndModifiers_AnnotationInstanceOrModifier": 
			if(!lazy_initialization) {
				if(msg.source instanceof org.emftext.language.java.classifiers.Interface) {
				if(msg.target instanceof org.emftext.language.java.modifiers.Abstract) {
				{
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof org.emftext.language.java.classifiers.Interface) {
				if(msg.target instanceof org.emftext.language.java.modifiers.Abstract) {
				{
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof org.emftext.language.java.classifiers.Interface) {
				if(msg.target instanceof org.emftext.language.java.modifiers.Abstract) {
				{
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
			}
			break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CREATE__SRC__modifier_Abstract": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.modifiers.Abstract) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.modifiers.Abstract) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CONTEXT__SRC__javaConcreteClassifier_Interface": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.classifiers.Interface) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CONTEXT__TRG__umlClassifier_Interface": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Interface) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Interface) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CONTEXT__CORR__javaClassifierToUmlClassifier_JavaClassifierToUmlClassifier": 
			if(!lazy_initialization) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.classifiers.Interface) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Interface) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[2] = msg.target;
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
		case "org.emftext.language.java.modifiers.AnnotableAndModifiable_annotationsAndModifiers_AnnotationInstanceOrModifier": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CREATE__SRC__modifier_Abstract": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[1].equals(msg.target))
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
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CONTEXT__SRC__javaConcreteClassifier_Interface": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CONTEXT__TRG__umlClassifier_Interface": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				break;
		case "Java2Uml.InterfaceAbstractToAbstract__Marker_CONTEXT__CORR__javaClassifierToUmlClassifier_JavaClassifierToUmlClassifier": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				break;
		case "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
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
		
		// register javaConcreteClassifier
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register modifier
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register umlClassifier
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register javaClassifierToUmlClassifier
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register InterfaceAbstractToAbstract_eMoflon_ProtocolNode
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister javaConcreteClassifier
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister modifier
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister umlClassifier
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister javaClassifierToUmlClassifier
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister InterfaceAbstractToAbstract_eMoflon_ProtocolNode
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
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
		if(obj instanceof uml.Interface) {
			HMatch match_2 = new LocalSearchMatch("InterfaceAbstractToAbstract__CONSISTENCY_400_localSearch", 5);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(edge_explorer_5_1_orchestration, match_2);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		uml.Interface umlClassifier = (uml.Interface) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_29 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_29.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, true, "java.lang.String"));
		csp_29.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlClassifier.isIsAbstract(), "boolean"));
		csp_29.solve();
		
		boolean predicate = csp_29.isSatisfied();
		return predicate;
	}
	
	
}

