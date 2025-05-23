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

public class VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	ConstraintChecker constraint_checker_1;
	CachedEdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	CachedEdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	PACExplorer pac_explorer;
	PACExplorer pac_explorer_0;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_6_1_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_8_1_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration edge_explorer_10_1_orchestration;
	SearchOrchestration pac_explorer_orchestration;
	SearchOrchestration pac_explorer_0_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_1 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		constraint_checker_0 = new ConstraintChecker(this, this::constraint_checker_0_method);
		name2explorer.put("constraint_checker_0", constraint_checker_0);
		constraint_checker_1 = new ConstraintChecker(this, this::constraint_checker_1_method);
		name2explorer.put("constraint_checker_1", constraint_checker_1);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.VariableLengthConstructorParameterToParameter__Marker) o).getCREATE__TRG__umlParameter(); return (result instanceof uml.Parameter ? result : null);};
						edge_explorer = new CachedEdgeExplorer(this, 7, 3, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.VariableLengthConstructorParameterToParameter__Marker) o).getCONTEXT__TRG__umlOperation(); return (result instanceof uml.Operation ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 7, 2, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> ((Java2Uml.VariableLengthConstructorParameterToParameter__Marker) o).getCREATE__CORR__parameterToParameter();
						edge_explorer_4 = new CachedEdgeExplorer(this, 7, 6, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaParameterToParameter) o).getSource(); return (result instanceof org.emftext.language.java.parameters.VariableLengthParameter ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 6, 1, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> ((Java2Uml.VariableLengthConstructorParameterToParameter__Marker) o).getCONTEXT__CORR__javaConstructorToOperation();
						edge_explorer_6 = new CachedEdgeExplorer(this, 7, 5, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaParameterToParameter) o).getTarget(); return (result instanceof uml.Parameter ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 6, 3, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.VariableLengthConstructorParameterToParameter__Marker) o).getCONTEXT__SRC__javaParametrizable(); return (result instanceof org.emftext.language.java.members.Constructor ? result : null);};
						edge_explorer_8 = new CachedEdgeExplorer(this, 7, 0, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.VariableLengthConstructorParameterToParameter__Marker) o).getCREATE__SRC__parameter(); return (result instanceof org.emftext.language.java.parameters.VariableLengthParameter ? result : null);};
						edge_explorer_9 = new CachedEdgeExplorer(this, 7, 1, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.VariableLengthConstructorParameterToParameter__Marker) o).getCREATE__TRG__upperValue(); return (result instanceof uml.LiteralUnlimitedNatural ? result : null);};
						edge_explorer_10 = new CachedEdgeExplorer(this, 7, 4, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {0,1,2,5}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
		pac_explorer_0 = new PACExplorer(this, Arrays.asList(new Integer[] {0,2,3,4,5}), node.getAllOverlaps().get(1));
		name2explorer.put("pac_explorer_0", pac_explorer_0);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_4_1_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_6_1_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_8_1_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_10_1_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		pac_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("VariableLengthConstructorParameterToParameter__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "JavaParameterToParameter_object_SP2": 
				{
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					
					// parameterToParameter
					HMatch match_6 = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_4_1_orchestration, match_6);
				}
				break;
			case "VariableLengthConstructorParameterToParameter__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					edge_explorer_9.registerSourceObject(objs[0]);
					edge_explorer_10.registerSourceObject(objs[0]);
					
					// VariableLengthConstructorParameterToParameter_eMoflon_ProtocolNode
					HMatch match_7 = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					match_7.getNodes()[7] = objs[0];
					start(edge_explorer_1_orchestration, match_7);
				}
				break;
			case "VariableLengthConstructorParameterToParameter__FWD_1288_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
						acMatch_0.getNodes()[0] = objs[1];
						acMatch_0.getNodes()[1] = objs[3];
						acMatch_0.getNodes()[2] = objs[2];
						acMatch_0.getNodes()[5] = objs[0];
						
						// start search
						currentDepth++;
						start(pac_explorer_orchestration, acMatch_0);
						currentDepth--;
					}
				}
				break;
			case "VariableLengthConstructorParameterToParameter__BWD_1275_localSearch": 
				{
					if(pac_explorer_0.register(match)) {
						HMatch acMatch_1 = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
						acMatch_1.getNodes()[0] = objs[1];
						acMatch_1.getNodes()[2] = objs[2];
						acMatch_1.getNodes()[3] = objs[3];
						acMatch_1.getNodes()[4] = objs[4];
						acMatch_1.getNodes()[5] = objs[0];
						
						// start search
						currentDepth++;
						start(pac_explorer_0_orchestration, acMatch_1);
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
			case "JavaParameterToParameter_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			case "VariableLengthConstructorParameterToParameter__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 7);
				break;
			case "VariableLengthConstructorParameterToParameter__FWD_1288_localSearch": 
				if(pac_explorer.deregister(match)) {
					OverlapMatch acMatch_0 = new OverlapMatch(4);
					acMatch_0.getNodes()[0] = match.getNodes()[1];
					acMatch_0.getNodes()[1] = match.getNodes()[3];
					acMatch_0.getNodes()[2] = match.getNodes()[2];
					acMatch_0.getNodes()[3] = match.getNodes()[0];
					Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
					if(o2Matches_0 != null) {
						if(!o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			case "VariableLengthConstructorParameterToParameter__BWD_1275_localSearch": 
				if(pac_explorer_0.deregister(match)) {
					OverlapMatch acMatch_1 = new OverlapMatch(5);
					acMatch_1.getNodes()[0] = match.getNodes()[1];
					acMatch_1.getNodes()[1] = match.getNodes()[2];
					acMatch_1.getNodes()[2] = match.getNodes()[3];
					acMatch_1.getNodes()[3] = match.getNodes()[4];
					acMatch_1.getNodes()[4] = match.getNodes()[0];
					Collection<HMatch> o2Matches_1 = overlap2matches_1.get(acMatch_1);
					if(o2Matches_1 != null) {
						if(!o2Matches_1.isEmpty()) {
							sendDeletedMatches(o2Matches_1);
							o2Matches_1.clear();
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
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__TRG__umlParameter_Parameter": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Parameter) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Parameter) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Parameter) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CONTEXT__TRG__umlOperation_Operation": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Operation) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Operation) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__CORR__parameterToParameter_JavaParameterToParameter": 
			if(!lazy_initialization) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Java2Uml.JavaParameterToParameter_source_Parameter": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CONTEXT__CORR__javaConstructorToOperation_JavaConstructorToOperation": 
			if(!lazy_initialization) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Java2Uml.JavaParameterToParameter_target_Parameter": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Parameter) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CONTEXT__SRC__javaParametrizable_Constructor": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.members.Constructor) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.members.Constructor) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__SRC__parameter_VariableLengthParameter": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__TRG__upperValue_LiteralUnlimitedNatural": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.LiteralUnlimitedNatural) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.LiteralUnlimitedNatural) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
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
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__TRG__umlParameter_Parameter": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[3].equals(msg.target))
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
						if(m.getNodes()[3].equals(msg.target))
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
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CONTEXT__TRG__umlOperation_Operation": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[2].equals(msg.target))
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
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__CORR__parameterToParameter_JavaParameterToParameter": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				break;
		case "Java2Uml.JavaParameterToParameter_source_Parameter": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CONTEXT__CORR__javaConstructorToOperation_JavaConstructorToOperation": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "Java2Uml.JavaParameterToParameter_target_Parameter": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CONTEXT__SRC__javaParametrizable_Constructor": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__SRC__parameter_VariableLengthParameter": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "Java2Uml.VariableLengthConstructorParameterToParameter__Marker_CREATE__TRG__upperValue_LiteralUnlimitedNatural": 
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
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
		// register VariableLengthConstructorParameterToParameter__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[5];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register VariableLengthConstructorParameterToParameter__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(5);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[2];
		oMatch_Nodes_1[2] = objs[3];
		oMatch_Nodes_1[3] = objs[4];
		oMatch_Nodes_1[4] = objs[5];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		
		// register parameter
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register umlParameter
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register upperValue
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register parameterToParameter
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register VariableLengthConstructorParameterToParameter_eMoflon_ProtocolNode
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 == null) {
			matches_7 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[7], matches_7);
		}
		matches_7.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister VariableLengthConstructorParameterToParameter__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[5];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister VariableLengthConstructorParameterToParameter__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(5);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[2];
		oMatch_Nodes_1[2] = objs[3];
		oMatch_Nodes_1[3] = objs[4];
		oMatch_Nodes_1[4] = objs[5];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
		}
		
		// deregister parameter
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister umlParameter
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister upperValue
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister parameterToParameter
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister VariableLengthConstructorParameterToParameter_eMoflon_ProtocolNode
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 != null) {
			matches_7.remove(match);
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
			HMatch match_3 = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker.check(m) || !constraint_checker_1.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_2_orchestration, match_3);
		}
		if(obj instanceof uml.LiteralUnlimitedNatural) {
			HMatch match_4 = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
			match_4.getNodes()[4] = obj;
			Collection<HMatch> formerMatches_4 = obj2matches.get(obj);
			if(formerMatches_4 != null) {
				
				formerMatches_4 = formerMatches_4.stream().filter(m -> !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_4);
			}
			start(edge_explorer_10_1_orchestration, match_4);
		}
		if(obj instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
			HMatch match_1 = new LocalSearchMatch("VariableLengthConstructorParameterToParameter__CONSISTENCY_1291_localSearch", 8);
			match_1.getNodes()[1] = obj;
			Collection<HMatch> formerMatches_1 = obj2matches.get(obj);
			if(formerMatches_1 != null) {
				
				formerMatches_1 = formerMatches_1.stream().filter(m -> !constraint_checker_1.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_1);
			}
			start(edge_explorer_5_1_orchestration, match_1);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		uml.Parameter umlParameter = (uml.Parameter) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_204 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_204.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, 0, "java.lang.String"));
		csp_204.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlParameter.getLower(), "int"));
		csp_204.solve();
		
		boolean predicate = csp_204.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		uml.LiteralUnlimitedNatural upperValue = (uml.LiteralUnlimitedNatural) match.getNodes()[4];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_205 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_205.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, -1, "java.lang.String"));
		csp_205.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, upperValue.getValue(), "int"));
		csp_205.solve();
		
		boolean predicate = csp_205.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_1_method(HMatch match) {
		org.emftext.language.java.parameters.VariableLengthParameter parameter = (org.emftext.language.java.parameters.VariableLengthParameter) match.getNodes()[1];
		uml.Parameter umlParameter = (uml.Parameter) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_206 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_206.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, parameter.getName(), "java.lang.String"));
		csp_206.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlParameter.getName(), "java.lang.String"));
		csp_206.solve();
		
		boolean predicate = csp_206.isSatisfied();
		return predicate;
	}
	
	
}

