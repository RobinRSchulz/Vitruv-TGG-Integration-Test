package Something2Else.integrate.hipe.engine.actor.localsearch;

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

public class LinkToEntityEmbedded__CONSISTENCY_111_localSearch extends GenericLocalSearchActor{
	ConstraintChecker node_constraint;
	CachedEdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	CachedEdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	CachedEdgeExplorer edge_explorer_11;
	CachedEdgeExplorer edge_explorer_12;
	CachedEdgeExplorer edge_explorer_13;
	CachedEdgeExplorer edge_explorer_14;
	CachedEdgeExplorer edge_explorer_15;
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
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_8_1_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_9_1_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration edge_explorer_11_0_orchestration;
	SearchOrchestration edge_explorer_11_1_orchestration;
	SearchOrchestration edge_explorer_12_0_orchestration;
	SearchOrchestration edge_explorer_12_1_orchestration;
	SearchOrchestration edge_explorer_13_0_orchestration;
	SearchOrchestration edge_explorer_14_0_orchestration;
	SearchOrchestration edge_explorer_14_1_orchestration;
	SearchOrchestration edge_explorer_15_0_orchestration;
	SearchOrchestration edge_explorer_15_1_orchestration;
	SearchOrchestration pac_explorer_orchestration;
	SearchOrchestration pac_explorer_0_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_1 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		node_constraint = new ConstraintChecker(this, this::node_constraint_method);
		name2explorer.put("node_constraint", node_constraint);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__CORR__stor();
						edge_explorer = new CachedEdgeExplorer(this, 12, 11, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCREATE__SRC__link(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Link ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 12, 1, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__TRG__root(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Root ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 12, 7, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCREATE__TRG__linkEntity(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 12, 5, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__CORR__ptoe();
						edge_explorer_6 = new CachedEdgeExplorer(this, 12, 10, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__TRG__protEntity(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 12, 6, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__SRC__protocol(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Protocol ? result : null);};
						edge_explorer_8 = new CachedEdgeExplorer(this, 12, 2, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> ((Something2Else.LinkToEntityEmbedded__Marker) o).getCREATE__CORR__ltoe();
						edge_explorer_9 = new CachedEdgeExplorer(this, 12, 9, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntity) o).getTarget(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_10 = new CachedEdgeExplorer(this, 9, 5, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		EdgeLookupMethods edge_explorer_11_methods = new EdgeLookupMethods();
						edge_explorer_11_methods.unique_lookup = (o) -> ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__CORR__ctoe();
						edge_explorer_11 = new CachedEdgeExplorer(this, 12, 8, edge_explorer_11_methods);
		name2explorer.put("edge_explorer_11", edge_explorer_11);
		EdgeLookupMethods edge_explorer_12_methods = new EdgeLookupMethods();
						edge_explorer_12_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__SRC__component(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Component ? result : null);};
						edge_explorer_12 = new CachedEdgeExplorer(this, 12, 0, edge_explorer_12_methods);
		name2explorer.put("edge_explorer_12", edge_explorer_12);
		EdgeLookupMethods edge_explorer_13_methods = new EdgeLookupMethods();
						edge_explorer_13_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntity) o).getSource(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Link ? result : null);};
						edge_explorer_13 = new CachedEdgeExplorer(this, 9, 1, edge_explorer_13_methods);
		name2explorer.put("edge_explorer_13", edge_explorer_13);
		EdgeLookupMethods edge_explorer_14_methods = new EdgeLookupMethods();
						edge_explorer_14_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__TRG__compEntity(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_14 = new CachedEdgeExplorer(this, 12, 4, edge_explorer_14_methods);
		name2explorer.put("edge_explorer_14", edge_explorer_14);
		EdgeLookupMethods edge_explorer_15_methods = new EdgeLookupMethods();
						edge_explorer_15_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntityEmbedded__Marker) o).getCONTEXT__SRC__system(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.System ? result : null);};
						edge_explorer_15 = new CachedEdgeExplorer(this, 12, 3, edge_explorer_15_methods);
		name2explorer.put("edge_explorer_15", edge_explorer_15);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {0,1,2,3,4,6,7,8,10,11}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
		pac_explorer_0 = new PACExplorer(this, Arrays.asList(new Integer[] {0,2,3,4,5,6,7,8,10,11}), node.getAllOverlaps().get(1));
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
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_8_1_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_9_1_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		edge_explorer_11_0_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
		edge_explorer_11_1_orchestration = initializeOrchestration(node.getOrchestrations().get(19).getPlan());
		edge_explorer_12_0_orchestration = initializeOrchestration(node.getOrchestrations().get(20).getPlan());
		edge_explorer_12_1_orchestration = initializeOrchestration(node.getOrchestrations().get(21).getPlan());
		edge_explorer_13_0_orchestration = initializeOrchestration(node.getOrchestrations().get(22).getPlan());
		edge_explorer_14_0_orchestration = initializeOrchestration(node.getOrchestrations().get(23).getPlan());
		edge_explorer_14_1_orchestration = initializeOrchestration(node.getOrchestrations().get(24).getPlan());
		edge_explorer_15_0_orchestration = initializeOrchestration(node.getOrchestrations().get(25).getPlan());
		edge_explorer_15_1_orchestration = initializeOrchestration(node.getOrchestrations().get(26).getPlan());
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(27).getPlan());
		pac_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(28).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("LinkToEntityEmbedded__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "LinkToEntity_object": 
				{
					edge_explorer_10.registerSourceObject(objs[0]);
					edge_explorer_13.registerSourceObject(objs[0]);
					
					// ltoe
					HMatch match_9 = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					match_9.getNodes()[9] = objs[0];
					start(edge_explorer_9_1_orchestration, match_9);
				}
				break;
			case "LinkToEntityEmbedded__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					edge_explorer_9.registerSourceObject(objs[0]);
					edge_explorer_11.registerSourceObject(objs[0]);
					edge_explorer_12.registerSourceObject(objs[0]);
					edge_explorer_14.registerSourceObject(objs[0]);
					edge_explorer_15.registerSourceObject(objs[0]);
					
					// LinkToEntityEmbedded_eMoflon_ProtocolNode
					HMatch match_12 = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					match_12.getNodes()[12] = objs[0];
					start(edge_explorer_1_orchestration, match_12);
				}
				break;
			case "LinkToEntityEmbedded__FWD_104_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
						acMatch_0.getNodes()[0] = objs[1];
						acMatch_0.getNodes()[1] = objs[9];
						acMatch_0.getNodes()[2] = objs[4];
						acMatch_0.getNodes()[3] = objs[8];
						acMatch_0.getNodes()[4] = objs[0];
						acMatch_0.getNodes()[6] = objs[3];
						acMatch_0.getNodes()[7] = objs[6];
						acMatch_0.getNodes()[8] = objs[2];
						acMatch_0.getNodes()[10] = objs[5];
						acMatch_0.getNodes()[11] = objs[7];
						
						// start search
						currentDepth++;
						start(pac_explorer_orchestration, acMatch_0);
						currentDepth--;
					}
				}
				break;
			case "LinkToEntityEmbedded__BWD_30_junction": 
				{
					if(pac_explorer_0.register(match)) {
						HMatch acMatch_1 = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
						acMatch_1.getNodes()[0] = objs[9];
						acMatch_1.getNodes()[2] = objs[1];
						acMatch_1.getNodes()[3] = objs[7];
						acMatch_1.getNodes()[4] = objs[3];
						acMatch_1.getNodes()[5] = objs[5];
						acMatch_1.getNodes()[6] = objs[2];
						acMatch_1.getNodes()[7] = objs[4];
						acMatch_1.getNodes()[8] = objs[8];
						acMatch_1.getNodes()[10] = objs[0];
						acMatch_1.getNodes()[11] = objs[6];
						
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
			case "LinkToEntity_object": 
				removeMatchesUsedBy(match.getNodes()[0], 9);
				break;
			case "LinkToEntityEmbedded__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 12);
				break;
			case "LinkToEntityEmbedded__FWD_104_localSearch": 
				if(pac_explorer.deregister(match)) {
					OverlapMatch acMatch_0 = new OverlapMatch(10);
					acMatch_0.getNodes()[0] = match.getNodes()[1];
					acMatch_0.getNodes()[1] = match.getNodes()[9];
					acMatch_0.getNodes()[2] = match.getNodes()[4];
					acMatch_0.getNodes()[3] = match.getNodes()[8];
					acMatch_0.getNodes()[4] = match.getNodes()[0];
					acMatch_0.getNodes()[5] = match.getNodes()[3];
					acMatch_0.getNodes()[6] = match.getNodes()[6];
					acMatch_0.getNodes()[7] = match.getNodes()[2];
					acMatch_0.getNodes()[8] = match.getNodes()[5];
					acMatch_0.getNodes()[9] = match.getNodes()[7];
					Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
					if(o2Matches_0 != null) {
						if(!o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			case "LinkToEntityEmbedded__BWD_30_junction": 
				if(pac_explorer_0.deregister(match)) {
					OverlapMatch acMatch_1 = new OverlapMatch(10);
					acMatch_1.getNodes()[0] = match.getNodes()[9];
					acMatch_1.getNodes()[1] = match.getNodes()[1];
					acMatch_1.getNodes()[2] = match.getNodes()[7];
					acMatch_1.getNodes()[3] = match.getNodes()[3];
					acMatch_1.getNodes()[4] = match.getNodes()[5];
					acMatch_1.getNodes()[5] = match.getNodes()[2];
					acMatch_1.getNodes()[6] = match.getNodes()[4];
					acMatch_1.getNodes()[7] = match.getNodes()[8];
					acMatch_1.getNodes()[8] = match.getNodes()[0];
					acMatch_1.getNodes()[9] = match.getNodes()[6];
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
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__stor_SystemToRoot": 
			if(!lazy_initialization) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[11] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[11] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[11] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CREATE__SRC__link_Link": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__root_Root": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe_ProtocolToEntity": 
			if(!lazy_initialization) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[10] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[10] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol_Protocol": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CREATE__CORR__ltoe_LinkToEntity": 
			if(!lazy_initialization) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.LinkToEntity_target_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe_ComponentToEntity": 
			if(!lazy_initialization) {
				{
					edge_explorer_11.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_11.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__component_Component": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				{
					edge_explorer_12.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_12_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				{
					edge_explorer_12.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_12_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntity_source_Link": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
				{
					edge_explorer_13.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_13_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_14.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_14_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_14.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_14_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__system_System": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.System) {
				{
					edge_explorer_15.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_15_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.System) {
				{
					edge_explorer_15.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntityEmbedded__CONSISTENCY_111_localSearch", 13);
					Object[] objs = match.getNodes();
					objs[12] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_15_0_orchestration, match);
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
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__stor_SystemToRoot": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[11].equals(msg.target))
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
						if(m.getNodes()[11].equals(msg.target))
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
						if(m.getNodes()[11].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CREATE__SRC__link_Link": 
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
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__root_Root": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[7].equals(msg.target))
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
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity_Entity": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[5].equals(msg.target))
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
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe_ProtocolToEntity": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[10].equals(msg.target))
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
						if(m.getNodes()[10].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity_Entity": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[6].equals(msg.target))
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
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol_Protocol": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CREATE__CORR__ltoe_LinkToEntity": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
				break;
		case "Something2Else.LinkToEntity_target_Entity": 
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_17 = obj2matches.get(msg.source);
				if(matches_17 != null && !matches_17.isEmpty()) {
					Collection<HMatch> toBeRemoved_17 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_17) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_17.add(m);
					}
					if(!toBeRemoved_17.isEmpty()) {
						sendDeletedMatches(toBeRemoved_17);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe_ComponentToEntity": 
				edge_explorer_11.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_18 = obj2matches.get(msg.source);
				if(matches_18 != null && !matches_18.isEmpty()) {
					Collection<HMatch> toBeRemoved_18 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_18) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_18.add(m);
					}
					if(!toBeRemoved_18.isEmpty()) {
						sendDeletedMatches(toBeRemoved_18);
					}
				}
				edge_explorer_11.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_19 = obj2matches.get(msg.source);
				if(matches_19 != null && !matches_19.isEmpty()) {
					Collection<HMatch> toBeRemoved_19 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_19) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_19.add(m);
					}
					if(!toBeRemoved_19.isEmpty()) {
						sendDeletedMatches(toBeRemoved_19);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__component_Component": 
				edge_explorer_12.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_20 = obj2matches.get(msg.source);
				if(matches_20 != null && !matches_20.isEmpty()) {
					Collection<HMatch> toBeRemoved_20 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_20) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_20.add(m);
					}
					if(!toBeRemoved_20.isEmpty()) {
						sendDeletedMatches(toBeRemoved_20);
					}
				}
				edge_explorer_12.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_21 = obj2matches.get(msg.source);
				if(matches_21 != null && !matches_21.isEmpty()) {
					Collection<HMatch> toBeRemoved_21 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_21) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_21.add(m);
					}
					if(!toBeRemoved_21.isEmpty()) {
						sendDeletedMatches(toBeRemoved_21);
					}
				}
				break;
		case "Something2Else.LinkToEntity_source_Link": 
				edge_explorer_13.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_22 = obj2matches.get(msg.source);
				if(matches_22 != null && !matches_22.isEmpty()) {
					Collection<HMatch> toBeRemoved_22 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_22) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_22.add(m);
					}
					if(!toBeRemoved_22.isEmpty()) {
						sendDeletedMatches(toBeRemoved_22);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity_Entity": 
				edge_explorer_14.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_23 = obj2matches.get(msg.source);
				if(matches_23 != null && !matches_23.isEmpty()) {
					Collection<HMatch> toBeRemoved_23 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_23) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_23.add(m);
					}
					if(!toBeRemoved_23.isEmpty()) {
						sendDeletedMatches(toBeRemoved_23);
					}
				}
				edge_explorer_14.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_24 = obj2matches.get(msg.source);
				if(matches_24 != null && !matches_24.isEmpty()) {
					Collection<HMatch> toBeRemoved_24 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_24) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_24.add(m);
					}
					if(!toBeRemoved_24.isEmpty()) {
						sendDeletedMatches(toBeRemoved_24);
					}
				}
				break;
		case "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__system_System": 
				edge_explorer_15.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_25 = obj2matches.get(msg.source);
				if(matches_25 != null && !matches_25.isEmpty()) {
					Collection<HMatch> toBeRemoved_25 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_25) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_25.add(m);
					}
					if(!toBeRemoved_25.isEmpty()) {
						sendDeletedMatches(toBeRemoved_25);
					}
				}
				edge_explorer_15.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_26 = obj2matches.get(msg.source);
				if(matches_26 != null && !matches_26.isEmpty()) {
					Collection<HMatch> toBeRemoved_26 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_26) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_26.add(m);
					}
					if(!toBeRemoved_26.isEmpty()) {
						sendDeletedMatches(toBeRemoved_26);
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
		// register LinkToEntityEmbedded__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(10);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[3];
		oMatch_Nodes_0[4] = objs[4];
		oMatch_Nodes_0[5] = objs[6];
		oMatch_Nodes_0[6] = objs[7];
		oMatch_Nodes_0[7] = objs[8];
		oMatch_Nodes_0[8] = objs[10];
		oMatch_Nodes_0[9] = objs[11];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register LinkToEntityEmbedded__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(10);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[2];
		oMatch_Nodes_1[2] = objs[3];
		oMatch_Nodes_1[3] = objs[4];
		oMatch_Nodes_1[4] = objs[5];
		oMatch_Nodes_1[5] = objs[6];
		oMatch_Nodes_1[6] = objs[7];
		oMatch_Nodes_1[7] = objs[8];
		oMatch_Nodes_1[8] = objs[10];
		oMatch_Nodes_1[9] = objs[11];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		
		// register ltoe
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 == null) {
			matches_9 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[9], matches_9);
		}
		matches_9.add(match);
		
		// register LinkToEntityEmbedded_eMoflon_ProtocolNode
		Collection<HMatch> matches_12 = obj2matches.get(objs[12]);
		if(matches_12 == null) {
			matches_12 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[12], matches_12);
		}
		matches_12.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister LinkToEntityEmbedded__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(10);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[3];
		oMatch_Nodes_0[4] = objs[4];
		oMatch_Nodes_0[5] = objs[6];
		oMatch_Nodes_0[6] = objs[7];
		oMatch_Nodes_0[7] = objs[8];
		oMatch_Nodes_0[8] = objs[10];
		oMatch_Nodes_0[9] = objs[11];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister LinkToEntityEmbedded__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(10);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[2];
		oMatch_Nodes_1[2] = objs[3];
		oMatch_Nodes_1[3] = objs[4];
		oMatch_Nodes_1[4] = objs[5];
		oMatch_Nodes_1[5] = objs[6];
		oMatch_Nodes_1[6] = objs[7];
		oMatch_Nodes_1[7] = objs[8];
		oMatch_Nodes_1[8] = objs[10];
		oMatch_Nodes_1[9] = objs[11];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
		}
		
		// deregister ltoe
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 != null) {
			matches_9.remove(match);
		}
		
		// deregister LinkToEntityEmbedded_eMoflon_ProtocolNode
		Collection<HMatch> matches_12 = obj2matches.get(objs[12]);
		if(matches_12 != null) {
			matches_12.remove(match);
		}
		
	}
	
	@Override
	protected void changeAttribute(AttributeChanged message) {
		initialMessage = message.initialMessage;

		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean node_constraint_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[6]);;
		return predicate;
	}
	
	
}

