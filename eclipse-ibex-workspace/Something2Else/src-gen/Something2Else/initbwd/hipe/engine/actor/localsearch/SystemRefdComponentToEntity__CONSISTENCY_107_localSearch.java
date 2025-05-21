package Something2Else.initbwd.hipe.engine.actor.localsearch;

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

public class SystemRefdComponentToEntity__CONSISTENCY_107_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	CachedEdgeExplorer edge_explorer;
	EdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	EdgeExplorer edge_explorer_8;
	CachedEdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	CachedEdgeExplorer edge_explorer_11;
	CachedEdgeExplorer edge_explorer_12;
	CachedEdgeExplorer edge_explorer_13;
	
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
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration edge_explorer_11_0_orchestration;
	SearchOrchestration edge_explorer_12_0_orchestration;
	SearchOrchestration edge_explorer_13_0_orchestration;
	
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.ComponentToEntity) o).getSource(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Component ? result : null);};
						edge_explorer = new CachedEdgeExplorer(this, 4, 0, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.multi_lookup = (o) -> ((tools.vitruv.methodologisttemplate.model.model.System) o).getComponents();
						edge_explorer_3_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof tools.vitruv.methodologisttemplate.model.model.System) return edge_explorer_3_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_3 = new EdgeExplorer(this, 1, 0, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.ComponentToEntity) o).getTarget(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 4, 2, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.SystemToRoot) o).getSource(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.System ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 5, 1, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.SystemToRoot) o).getTarget(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Root ? result : null);};
						edge_explorer_6 = new CachedEdgeExplorer(this, 5, 3, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.SystemRefdComponentToEntity__Marker) o).getCREATE__TRG__entity(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 6, 2, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.multi_lookup = (o) -> ((tools.vitruv.methodologisttemplate.model.model2.Root) o).getEntities();
						edge_explorer_8_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof tools.vitruv.methodologisttemplate.model.model2.Root) return edge_explorer_8_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_8 = new EdgeExplorer(this, 3, 2, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.SystemRefdComponentToEntity__Marker) o).getCONTEXT__TRG__root(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Root ? result : null);};
						edge_explorer_9 = new CachedEdgeExplorer(this, 6, 3, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> ((Something2Else.SystemRefdComponentToEntity__Marker) o).getCREATE__CORR__ctoe();
						edge_explorer_10 = new CachedEdgeExplorer(this, 6, 4, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		EdgeLookupMethods edge_explorer_11_methods = new EdgeLookupMethods();
						edge_explorer_11_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.SystemRefdComponentToEntity__Marker) o).getCONTEXT__SRC__system(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.System ? result : null);};
						edge_explorer_11 = new CachedEdgeExplorer(this, 6, 1, edge_explorer_11_methods);
		name2explorer.put("edge_explorer_11", edge_explorer_11);
		EdgeLookupMethods edge_explorer_12_methods = new EdgeLookupMethods();
						edge_explorer_12_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.SystemRefdComponentToEntity__Marker) o).getCREATE__SRC__comp(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Component ? result : null);};
						edge_explorer_12 = new CachedEdgeExplorer(this, 6, 0, edge_explorer_12_methods);
		name2explorer.put("edge_explorer_12", edge_explorer_12);
		EdgeLookupMethods edge_explorer_13_methods = new EdgeLookupMethods();
						edge_explorer_13_methods.unique_lookup = (o) -> ((Something2Else.SystemRefdComponentToEntity__Marker) o).getCONTEXT__CORR__stor();
						edge_explorer_13 = new CachedEdgeExplorer(this, 6, 5, edge_explorer_13_methods);
		name2explorer.put("edge_explorer_13", edge_explorer_13);
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
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_11_0_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		edge_explorer_12_0_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		edge_explorer_13_0_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Component_object_SP1": 
				{
					
					// comp
					HMatch match_0 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_2_orchestration, match_0);
				}
				break;
			case "System_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// system
						HMatch match_1 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
						match_1.getNodes()[1] = objs[0];
						start(edge_explorer_3_1_orchestration, match_1);
					}
				}
				break;
			case "Entity_object_SP2": 
				{
					if(!lazy_initialization) {
						
						// entity
						HMatch match_2 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
						match_2.getNodes()[2] = objs[0];
						start(edge_explorer_4_1_orchestration, match_2);
					}
				}
				break;
			case "Root_object_SP2": 
				{
					if(!lazy_initialization) {
						
						// root
						HMatch match_3 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
						match_3.getNodes()[3] = objs[0];
						start(edge_explorer_6_1_orchestration, match_3);
					}
				}
				break;
			case "ComponentToEntity_object_SP0": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					
					// ctoe
					HMatch match_4 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_1_orchestration, match_4);
				}
				break;
			case "SystemToRoot_object_SP0": 
				{
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					
					// stor
					HMatch match_5 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_5_1_orchestration, match_5);
				}
				break;
			case "SystemRefdComponentToEntity__Marker_object": 
				{
					edge_explorer_7.registerSourceObject(objs[0]);
					edge_explorer_9.registerSourceObject(objs[0]);
					edge_explorer_10.registerSourceObject(objs[0]);
					edge_explorer_11.registerSourceObject(objs[0]);
					edge_explorer_12.registerSourceObject(objs[0]);
					edge_explorer_13.registerSourceObject(objs[0]);
					
					// SystemRefdComponentToEntity_eMoflon_ProtocolNode
					HMatch match_6 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_7_1_orchestration, match_6);
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
			case "Component_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "System_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "Entity_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Root_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "ComponentToEntity_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "SystemToRoot_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "SystemRefdComponentToEntity__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Something2Else.ComponentToEntity_source_Component": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "tools.vitruv.methodologisttemplate.model.model.System_components_Component": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.ComponentToEntity_target_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.SystemToRoot_source_System": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.System) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.System) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.SystemToRoot_target_Root": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__TRG__entity_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__TRG__root_Root": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe_ComponentToEntity": 
			if(!lazy_initialization) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__SRC__system_System": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.System) {
				{
					edge_explorer_11.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__SRC__comp_Component": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				{
					edge_explorer_12.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_12_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor_SystemToRoot": 
			if(!lazy_initialization) {
				{
					edge_explorer_13.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_13_0_orchestration, match);
					currentDepth--;
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
		case "Something2Else.ComponentToEntity_source_Component": 
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
		case "tools.vitruv.methodologisttemplate.model.model.System_components_Component": 
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "Something2Else.ComponentToEntity_target_Entity": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[2].equals(msg.target))
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
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				break;
		case "Something2Else.SystemToRoot_source_System": 
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
		case "Something2Else.SystemToRoot_target_Root": 
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
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__TRG__entity_Entity": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				break;
		case "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity": 
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__TRG__root_Root": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe_ComponentToEntity": 
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
				break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__SRC__system_System": 
				edge_explorer_11.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
				break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__SRC__comp_Component": 
				edge_explorer_12.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_17 = obj2matches.get(msg.source);
				if(matches_17 != null && !matches_17.isEmpty()) {
					Collection<HMatch> toBeRemoved_17 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_17) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_17.add(m);
					}
					if(!toBeRemoved_17.isEmpty()) {
						sendDeletedMatches(toBeRemoved_17);
					}
				}
				break;
		case "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor_SystemToRoot": 
				edge_explorer_13.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_18 = obj2matches.get(msg.source);
				if(matches_18 != null && !matches_18.isEmpty()) {
					Collection<HMatch> toBeRemoved_18 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_18) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_18.add(m);
					}
					if(!toBeRemoved_18.isEmpty()) {
						sendDeletedMatches(toBeRemoved_18);
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
		
		// register comp
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register system
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register entity
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register root
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register ctoe
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register stor
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register SystemRefdComponentToEntity_eMoflon_ProtocolNode
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister comp
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister system
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister entity
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister root
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister ctoe
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister stor
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister SystemRefdComponentToEntity_eMoflon_ProtocolNode
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
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
		if(obj instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
			HMatch match_2 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(edge_explorer_4_1_orchestration, match_2);
		}
		if(obj instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
			HMatch match_0 = new LocalSearchMatch("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", 7);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(edge_explorer_2_orchestration, match_0);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		tools.vitruv.methodologisttemplate.model.model.Component comp = (tools.vitruv.methodologisttemplate.model.model.Component) match.getNodes()[0];
		tools.vitruv.methodologisttemplate.model.model2.Entity entity = (tools.vitruv.methodologisttemplate.model.model2.Entity) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_0 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, comp.getName(), "java.lang.String"));
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, entity.getName(), "java.lang.String"));
		csp_0.solve();
		
		boolean predicate = csp_0.isSatisfied();
		return predicate;
	}
	
	
}

