package Something2Else.sync.hipe.engine.actor.localsearch;

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

public class LinkToEntity__CONSISTENCY_96_localSearch extends GenericLocalSearchActor{
	CachedEdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	NACExplorer nac_checker;
	NACExplorer nac_checker_0;
	NACExplorer nac_checker_1;
	NACExplorer nac_checker_2;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_6_1_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration nac_checker_orchestration;
	SearchOrchestration nac_checker_0_orchestration;
	SearchOrchestration nac_checker_1_orchestration;
	SearchOrchestration nac_checker_2_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_1 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_2 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_3 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntity__Marker) o).getCONTEXT__SRC__protocol(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Protocol ? result : null);};
						edge_explorer = new CachedEdgeExplorer(this, 4, 1, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntity__Marker) o).getCREATE__SRC__link(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Link ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 4, 0, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntity__Marker) o).getCREATE__TRG__entity(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 4, 2, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> ((tools.vitruv.methodologisttemplate.model.model.Link) o).getProtocol();
						edge_explorer_5 = new CachedEdgeExplorer(this, 0, 1, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntity) o).getSource(); return (result instanceof tools.vitruv.methodologisttemplate.model.model.Link ? result : null);};
						edge_explorer_6 = new CachedEdgeExplorer(this, 3, 0, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.LinkToEntity) o).getTarget(); return (result instanceof tools.vitruv.methodologisttemplate.model.model2.Entity ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 3, 2, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> ((Something2Else.LinkToEntity__Marker) o).getCREATE__CORR__ltoe();
						edge_explorer_8 = new CachedEdgeExplorer(this, 4, 3, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {0}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
		nac_checker_0 = new NACExplorer(this, Arrays.asList(new Integer[] {0,1}), node.getAllOverlaps().get(1));
		name2explorer.put("nac_checker_0", nac_checker_0);
		nac_checker_1 = new NACExplorer(this, Arrays.asList(new Integer[] {0}), node.getAllOverlaps().get(2));
		name2explorer.put("nac_checker_1", nac_checker_1);
		nac_checker_2 = new NACExplorer(this, Arrays.asList(new Integer[] {2}), node.getAllOverlaps().get(3));
		name2explorer.put("nac_checker_2", nac_checker_2);
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
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_6_1_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		nac_checker_0_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		nac_checker_1_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		nac_checker_2_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("LinkToEntity__CONSISTENCY_production"), this::returnTrue  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Link_object_SP1": 
				{
					edge_explorer_5.registerSourceObject(objs[0]);
					
					// link
					HMatch match_0 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_3_1_orchestration, match_0);
				}
				break;
			case "Protocol_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// protocol
						HMatch match_1 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
						match_1.getNodes()[1] = objs[0];
						start(edge_explorer_2_orchestration, match_1);
					}
				}
				break;
			case "Entity_object_SP3": 
				{
					if(!lazy_initialization) {
						
						// entity
						HMatch match_2 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
						match_2.getNodes()[2] = objs[0];
						start(edge_explorer_4_1_orchestration, match_2);
					}
				}
				break;
			case "LinkToEntity_object": 
				{
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					
					// ltoe
					HMatch match_3 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_6_1_orchestration, match_3);
				}
				break;
			case "LinkToEntity__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					
					// LinkToEntity_eMoflon_ProtocolNode
					HMatch match_4 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_1_orchestration, match_4);
				}
				break;
			case "LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_86_localSearch": 
				{
					if(nac_checker.register(match)) {
						OverlapMatch acMatch_0 = new OverlapMatch(1);
						Object[] acMatch_nodes_0 = acMatch_0.getNodes();
						acMatch_nodes_0[0] = objs[0];
						
						Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
						if(o2Matches_0 != null && !o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			case "LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_89_localSearch": 
				{
					if(nac_checker_0.register(match)) {
						OverlapMatch acMatch_1 = new OverlapMatch(2);
						Object[] acMatch_nodes_1 = acMatch_1.getNodes();
						acMatch_nodes_1[0] = objs[0];
						acMatch_nodes_1[1] = objs[1];
						
						Collection<HMatch> o2Matches_1 = overlap2matches_1.get(acMatch_1);
						if(o2Matches_1 != null && !o2Matches_1.isEmpty()) {
							sendDeletedMatches(o2Matches_1);
							o2Matches_1.clear();
						}
					}
				}
				break;
			case "LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_93_localSearch": 
				{
					if(nac_checker_1.register(match)) {
						OverlapMatch acMatch_2 = new OverlapMatch(1);
						Object[] acMatch_nodes_2 = acMatch_2.getNodes();
						acMatch_nodes_2[0] = objs[1];
						
						Collection<HMatch> o2Matches_2 = overlap2matches_2.get(acMatch_2);
						if(o2Matches_2 != null && !o2Matches_2.isEmpty()) {
							sendDeletedMatches(o2Matches_2);
							o2Matches_2.clear();
						}
					}
				}
				break;
			case "LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_79_localSearch": 
				{
					if(nac_checker_2.register(match)) {
						OverlapMatch acMatch_3 = new OverlapMatch(1);
						Object[] acMatch_nodes_3 = acMatch_3.getNodes();
						acMatch_nodes_3[0] = objs[1];
						
						Collection<HMatch> o2Matches_3 = overlap2matches_3.get(acMatch_3);
						if(o2Matches_3 != null && !o2Matches_3.isEmpty()) {
							sendDeletedMatches(o2Matches_3);
							o2Matches_3.clear();
						}
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
			case "Link_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "Protocol_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "Entity_object_SP3": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "LinkToEntity_object": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "LinkToEntity__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_86_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[0] = objs_0[0];
					start(nac_checker_orchestration, acMatch_0);
				}
				break;
			case "LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_89_localSearch": 
				if(nac_checker_0.deregister(match)) {
					HMatch acMatch_1 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] acMatch_nodes_1 = acMatch_1.getNodes();
					Object[] objs_1 = match.getNodes();
					acMatch_nodes_1[0] = objs_1[0];
					acMatch_nodes_1[1] = objs_1[1];
					start(nac_checker_0_orchestration, acMatch_1);
				}
				break;
			case "LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_93_localSearch": 
				if(nac_checker_1.deregister(match)) {
					HMatch acMatch_2 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] acMatch_nodes_2 = acMatch_2.getNodes();
					Object[] objs_2 = match.getNodes();
					acMatch_nodes_2[0] = objs_2[1];
					start(nac_checker_1_orchestration, acMatch_2);
				}
				break;
			case "LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_79_localSearch": 
				if(nac_checker_2.deregister(match)) {
					HMatch acMatch_3 = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] acMatch_nodes_3 = acMatch_3.getNodes();
					Object[] objs_3 = match.getNodes();
					acMatch_nodes_3[2] = objs_3[1];
					start(nac_checker_2_orchestration, acMatch_3);
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
		case "Something2Else.LinkToEntity__Marker_CONTEXT__SRC__protocol_Protocol": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntity__Marker_CREATE__SRC__link_Link": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntity__Marker_CREATE__TRG__entity_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
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
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
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
		case "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol": 
			if(!lazy_initialization) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.LinkToEntity_source_Link": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntity_target_Entity": 
			if(!lazy_initialization) {
				if(msg.target instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.LinkToEntity__Marker_CREATE__CORR__ltoe_LinkToEntity": 
			if(!lazy_initialization) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("LinkToEntity__CONSISTENCY_96_localSearch", 5);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
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
		case "Something2Else.LinkToEntity__Marker_CONTEXT__SRC__protocol_Protocol": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
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
				edge_explorer.deregisterEdge(msg.source, msg.target);
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
				edge_explorer.deregisterEdge(msg.source, msg.target);
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
		case "Something2Else.LinkToEntity__Marker_CREATE__SRC__link_Link": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
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
		case "Something2Else.LinkToEntity__Marker_CREATE__TRG__entity_Entity": 
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
		case "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol": 
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
				break;
		case "Something2Else.LinkToEntity_source_Link": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[0].equals(msg.target))
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
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				break;
		case "Something2Else.LinkToEntity_target_Entity": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "Something2Else.LinkToEntity__Marker_CREATE__CORR__ltoe_LinkToEntity": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
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
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		// register LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_1 = new OverlapMatch(2);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[1];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		// register LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_2 = new OverlapMatch(1);
		Object[] oMatch_Nodes_2 = oMatch_2.getNodes();
		oMatch_Nodes_2[0] = objs[0];
		Collection<HMatch> oMatches_2 = overlap2matches_2.get(oMatch_2);
		if(oMatches_2 == null) {
			oMatches_2 = new HashSet<>();
			overlap2matches_2.put(oMatch_2, oMatches_2);
		}
		oMatches_2.add(match);
		
		// register LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_3 = new OverlapMatch(1);
		Object[] oMatch_Nodes_3 = oMatch_3.getNodes();
		oMatch_Nodes_3[0] = objs[2];
		Collection<HMatch> oMatches_3 = overlap2matches_3.get(oMatch_3);
		if(oMatches_3 == null) {
			oMatches_3 = new HashSet<>();
			overlap2matches_3.put(oMatch_3, oMatches_3);
		}
		oMatches_3.add(match);
		
		
		// register link
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register protocol
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
		
		// register ltoe
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register LinkToEntity_eMoflon_ProtocolNode
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
		// deregister LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_1 = new OverlapMatch(2);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[1];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
		}
		
		// deregister LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_2 = new OverlapMatch(1);
		Object[] oMatch_Nodes_2 = oMatch_2.getNodes();
		oMatch_Nodes_2[0] = objs[0];
		Collection<HMatch> oMatches_2 = overlap2matches_2.get(oMatch_2);
		if(oMatches_2 != null) {
			oMatches_2.remove(match);
		}
		
		// deregister LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_3 = new OverlapMatch(1);
		Object[] oMatch_Nodes_3 = oMatch_3.getNodes();
		oMatch_Nodes_3[0] = objs[2];
		Collection<HMatch> oMatches_3 = overlap2matches_3.get(oMatch_3);
		if(oMatches_3 != null) {
			oMatches_3.remove(match);
		}
		
		// deregister link
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister protocol
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister entity
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister ltoe
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister LinkToEntity_eMoflon_ProtocolNode
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
		
		message.initialMessage.decrement();
	}
				
	
}

