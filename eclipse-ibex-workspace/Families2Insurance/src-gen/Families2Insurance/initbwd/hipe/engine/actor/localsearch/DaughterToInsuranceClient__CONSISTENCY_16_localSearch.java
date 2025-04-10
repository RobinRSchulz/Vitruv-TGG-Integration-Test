package Families2Insurance.initbwd.hipe.engine.actor.localsearch;

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

public class DaughterToInsuranceClient__CONSISTENCY_16_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	CachedEdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	EdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	EdgeExplorer edge_explorer_11;
	CachedEdgeExplorer edge_explorer_12;
	EdgeExplorer edge_explorer_13;
	CachedEdgeExplorer edge_explorer_14;
	CachedEdgeExplorer edge_explorer_15;
	CachedEdgeExplorer edge_explorer_16;
	CachedEdgeExplorer edge_explorer_17;
	CachedEdgeExplorer edge_explorer_18;
	NACExplorer nac_checker;
	NACExplorer nac_checker_0;
	NACExplorer nac_checker_1;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
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
	SearchOrchestration edge_explorer_8_1_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration edge_explorer_11_0_orchestration;
	SearchOrchestration edge_explorer_12_0_orchestration;
	SearchOrchestration edge_explorer_13_0_orchestration;
	SearchOrchestration edge_explorer_14_0_orchestration;
	SearchOrchestration edge_explorer_15_0_orchestration;
	SearchOrchestration edge_explorer_16_0_orchestration;
	SearchOrchestration edge_explorer_17_0_orchestration;
	SearchOrchestration edge_explorer_18_0_orchestration;
	SearchOrchestration nac_checker_orchestration;
	SearchOrchestration nac_checker_0_orchestration;
	SearchOrchestration nac_checker_1_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_1 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_2 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		constraint_checker_0 = new ConstraintChecker(this, this::constraint_checker_0_method);
		name2explorer.put("constraint_checker_0", constraint_checker_0);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.DaughterToInsuranceClient__Marker) o).getCREATE__SRC__daughter(); return (result instanceof edu.kit.ipd.sdq.metamodels.families.Member ? result : null);};
						edge_explorer = new CachedEdgeExplorer(this, 8, 0, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.MemberToInsuranceClient) o).getSource(); return (result instanceof edu.kit.ipd.sdq.metamodels.families.Member ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 7, 0, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.FamilyToInsuranceClient) o).getSource(); return (result instanceof edu.kit.ipd.sdq.metamodels.families.Family ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 6, 1, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.DaughterToInsuranceClient__Marker) o).getCREATE__TRG__insuranceClient(); return (result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 8, 3, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.DaughterToInsuranceClient__Marker) o).getCONTEXT__SRC__familyRegister(); return (result instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister ? result : null);};
						edge_explorer_6 = new CachedEdgeExplorer(this, 8, 2, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.DaughterToInsuranceClient__Marker) o).getCONTEXT__TRG__insuranceDB(); return (result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 8, 4, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> ((Something2Else.DaughterToInsuranceClient__Marker) o).getCONTEXT__CORR__familyRegisterToInsuranceDB();
						edge_explorer_8 = new CachedEdgeExplorer(this, 8, 5, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.families.Member) o).getFamilyDaughter();
						edge_explorer_9_methods.multi_opposite_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.families.Family) o).getDaughters();
						edge_explorer_9 = new EdgeExplorer(this, 0, 1, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> ((Something2Else.DaughterToInsuranceClient__Marker) o).getCREATE__CORR__memberToInsuranceClient();
						edge_explorer_10 = new CachedEdgeExplorer(this, 8, 7, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		EdgeLookupMethods edge_explorer_11_methods = new EdgeLookupMethods();
						edge_explorer_11_methods.multi_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) o).getInsuranceclient();
						edge_explorer_11_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) return edge_explorer_11_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_11 = new EdgeExplorer(this, 4, 3, edge_explorer_11_methods);
		name2explorer.put("edge_explorer_11", edge_explorer_11);
		EdgeLookupMethods edge_explorer_12_methods = new EdgeLookupMethods();
						edge_explorer_12_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.FamilyRegisterToInsuranceDatabase) o).getSource(); return (result instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister ? result : null);};
						edge_explorer_12 = new CachedEdgeExplorer(this, 5, 2, edge_explorer_12_methods);
		name2explorer.put("edge_explorer_12", edge_explorer_12);
		EdgeLookupMethods edge_explorer_13_methods = new EdgeLookupMethods();
						edge_explorer_13_methods.multi_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.families.FamilyRegister) o).getFamilies();
						edge_explorer_13_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) return edge_explorer_13_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_13 = new EdgeExplorer(this, 2, 1, edge_explorer_13_methods);
		name2explorer.put("edge_explorer_13", edge_explorer_13);
		EdgeLookupMethods edge_explorer_14_methods = new EdgeLookupMethods();
						edge_explorer_14_methods.unique_lookup = (o) -> ((Something2Else.DaughterToInsuranceClient__Marker) o).getCREATE__CORR__familyToInsuranceClient();
						edge_explorer_14 = new CachedEdgeExplorer(this, 8, 6, edge_explorer_14_methods);
		name2explorer.put("edge_explorer_14", edge_explorer_14);
		EdgeLookupMethods edge_explorer_15_methods = new EdgeLookupMethods();
						edge_explorer_15_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.FamilyToInsuranceClient) o).getTarget(); return (result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient ? result : null);};
						edge_explorer_15 = new CachedEdgeExplorer(this, 6, 3, edge_explorer_15_methods);
		name2explorer.put("edge_explorer_15", edge_explorer_15);
		EdgeLookupMethods edge_explorer_16_methods = new EdgeLookupMethods();
						edge_explorer_16_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.MemberToInsuranceClient) o).getTarget(); return (result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient ? result : null);};
						edge_explorer_16 = new CachedEdgeExplorer(this, 7, 3, edge_explorer_16_methods);
		name2explorer.put("edge_explorer_16", edge_explorer_16);
		EdgeLookupMethods edge_explorer_17_methods = new EdgeLookupMethods();
						edge_explorer_17_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.DaughterToInsuranceClient__Marker) o).getCONTEXT__SRC__family(); return (result instanceof edu.kit.ipd.sdq.metamodels.families.Family ? result : null);};
						edge_explorer_17 = new CachedEdgeExplorer(this, 8, 1, edge_explorer_17_methods);
		name2explorer.put("edge_explorer_17", edge_explorer_17);
		EdgeLookupMethods edge_explorer_18_methods = new EdgeLookupMethods();
						edge_explorer_18_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.FamilyRegisterToInsuranceDatabase) o).getTarget(); return (result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase ? result : null);};
						edge_explorer_18 = new CachedEdgeExplorer(this, 5, 4, edge_explorer_18_methods);
		name2explorer.put("edge_explorer_18", edge_explorer_18);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {0}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
		nac_checker_0 = new NACExplorer(this, Arrays.asList(new Integer[] {0}), node.getAllOverlaps().get(1));
		name2explorer.put("nac_checker_0", nac_checker_0);
		nac_checker_1 = new NACExplorer(this, Arrays.asList(new Integer[] {0}), node.getAllOverlaps().get(2));
		name2explorer.put("nac_checker_1", nac_checker_1);
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
		edge_explorer_4_2_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_6_1_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_8_1_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		edge_explorer_11_0_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
		edge_explorer_12_0_orchestration = initializeOrchestration(node.getOrchestrations().get(19).getPlan());
		edge_explorer_13_0_orchestration = initializeOrchestration(node.getOrchestrations().get(20).getPlan());
		edge_explorer_14_0_orchestration = initializeOrchestration(node.getOrchestrations().get(21).getPlan());
		edge_explorer_15_0_orchestration = initializeOrchestration(node.getOrchestrations().get(22).getPlan());
		edge_explorer_16_0_orchestration = initializeOrchestration(node.getOrchestrations().get(23).getPlan());
		edge_explorer_17_0_orchestration = initializeOrchestration(node.getOrchestrations().get(24).getPlan());
		edge_explorer_18_0_orchestration = initializeOrchestration(node.getOrchestrations().get(25).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(26).getPlan());
		nac_checker_0_orchestration = initializeOrchestration(node.getOrchestrations().get(27).getPlan());
		nac_checker_1_orchestration = initializeOrchestration(node.getOrchestrations().get(28).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("DaughterToInsuranceClient__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Member_object_SP0": 
				{
					
					// daughter
					HMatch match_0 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_2_orchestration, match_0);
				}
				break;
			case "Family_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// family
						HMatch match_1 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
						match_1.getNodes()[1] = objs[0];
						start(edge_explorer_4_2_orchestration, match_1);
					}
				}
				break;
			case "FamilyRegister_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// familyRegister
						HMatch match_2 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
						match_2.getNodes()[2] = objs[0];
						start(edge_explorer_6_1_orchestration, match_2);
					}
				}
				break;
			case "InsuranceClient_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// insuranceClient
						HMatch match_3 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
						match_3.getNodes()[3] = objs[0];
						start(edge_explorer_5_1_orchestration, match_3);
					}
				}
				break;
			case "InsuranceDatabase_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// insuranceDB
						HMatch match_4 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
						match_4.getNodes()[4] = objs[0];
						start(edge_explorer_7_1_orchestration, match_4);
					}
				}
				break;
			case "FamilyRegisterToInsuranceDatabase_object_SP1": 
				{
					edge_explorer_12.registerSourceObject(objs[0]);
					edge_explorer_18.registerSourceObject(objs[0]);
					
					// familyRegisterToInsuranceDB
					HMatch match_5 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_8_1_orchestration, match_5);
				}
				break;
			case "FamilyToInsuranceClient_object_SP0": 
				{
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_15.registerSourceObject(objs[0]);
					
					// familyToInsuranceClient
					HMatch match_6 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_4_1_orchestration, match_6);
				}
				break;
			case "MemberToInsuranceClient_object_SP0": 
				{
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_16.registerSourceObject(objs[0]);
					
					// memberToInsuranceClient
					HMatch match_7 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					match_7.getNodes()[7] = objs[0];
					start(edge_explorer_3_1_orchestration, match_7);
				}
				break;
			case "DaughterToInsuranceClient__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					edge_explorer_10.registerSourceObject(objs[0]);
					edge_explorer_14.registerSourceObject(objs[0]);
					edge_explorer_17.registerSourceObject(objs[0]);
					
					// DaughterToInsuranceClient_eMoflon_ProtocolNode
					HMatch match_8 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					match_8.getNodes()[8] = objs[0];
					start(edge_explorer_1_orchestration, match_8);
				}
				break;
			case "DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_7_localSearch": 
				{
					if(nac_checker.register(match)) {
						OverlapMatch acMatch_0 = new OverlapMatch(1);
						Object[] acMatch_nodes_0 = acMatch_0.getNodes();
						acMatch_nodes_0[0] = objs[1];
						
						Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
						if(o2Matches_0 != null && !o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			case "DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_10_localSearch": 
				{
					if(nac_checker_0.register(match)) {
						OverlapMatch acMatch_1 = new OverlapMatch(1);
						Object[] acMatch_nodes_1 = acMatch_1.getNodes();
						acMatch_nodes_1[0] = objs[1];
						
						Collection<HMatch> o2Matches_1 = overlap2matches_1.get(acMatch_1);
						if(o2Matches_1 != null && !o2Matches_1.isEmpty()) {
							sendDeletedMatches(o2Matches_1);
							o2Matches_1.clear();
						}
					}
				}
				break;
			case "DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_13_localSearch": 
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
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "Member_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "Family_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "FamilyRegister_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "InsuranceClient_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "InsuranceDatabase_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "FamilyRegisterToInsuranceDatabase_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "FamilyToInsuranceClient_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			case "MemberToInsuranceClient_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 7);
				break;
			case "DaughterToInsuranceClient__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 8);
				break;
			case "DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_7_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[0] = objs_0[1];
					start(nac_checker_orchestration, acMatch_0);
				}
				break;
			case "DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_10_localSearch": 
				if(nac_checker_0.deregister(match)) {
					HMatch acMatch_1 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] acMatch_nodes_1 = acMatch_1.getNodes();
					Object[] objs_1 = match.getNodes();
					acMatch_nodes_1[0] = objs_1[1];
					start(nac_checker_0_orchestration, acMatch_1);
				}
				break;
			case "DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_13_localSearch": 
				if(nac_checker_1.deregister(match)) {
					HMatch acMatch_2 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] acMatch_nodes_2 = acMatch_2.getNodes();
					Object[] objs_2 = match.getNodes();
					acMatch_nodes_2[0] = objs_2[1];
					start(nac_checker_1_orchestration, acMatch_2);
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
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__SRC__daughter_Member": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.MemberToInsuranceClient_source_Member": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.FamilyToInsuranceClient_source_Family": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase": 
			if(!lazy_initialization) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient": 
			if(!lazy_initialization) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
				{
					edge_explorer_12.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_12_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_13_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient": 
			if(!lazy_initialization) {
				{
					edge_explorer_14.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_14_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.FamilyToInsuranceClient_target_InsuranceClient": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				{
					edge_explorer_15.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_15_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.MemberToInsuranceClient_target_InsuranceClient": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				{
					edge_explorer_16.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_16_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__family_Family": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				{
					edge_explorer_17.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_17_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
				{
					edge_explorer_18.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_18_0_orchestration, match);
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
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__SRC__daughter_Member": 
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
		case "Something2Else.MemberToInsuranceClient_source_Member": 
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
		case "Something2Else.FamilyToInsuranceClient_source_Family": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[1].equals(msg.target))
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
						if(m.getNodes()[1].equals(msg.target))
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
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
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
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
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
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				break;
		case "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family": 
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
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient": 
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_17 = obj2matches.get(msg.source);
				if(matches_17 != null && !matches_17.isEmpty()) {
					Collection<HMatch> toBeRemoved_17 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_17) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_17.add(m);
					}
					if(!toBeRemoved_17.isEmpty()) {
						sendDeletedMatches(toBeRemoved_17);
					}
				}
				break;
		case "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient": 
				Collection<HMatch> matches_18 = obj2matches.get(msg.source);
				if(matches_18 != null && !matches_18.isEmpty()) {
					Collection<HMatch> toBeRemoved_18 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_18) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_18.add(m);
					}
					if(!toBeRemoved_18.isEmpty()) {
						sendDeletedMatches(toBeRemoved_18);
					}
				}
				break;
		case "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister": 
				edge_explorer_12.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_19 = obj2matches.get(msg.source);
				if(matches_19 != null && !matches_19.isEmpty()) {
					Collection<HMatch> toBeRemoved_19 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_19) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_19.add(m);
					}
					if(!toBeRemoved_19.isEmpty()) {
						sendDeletedMatches(toBeRemoved_19);
					}
				}
				break;
		case "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family": 
				Collection<HMatch> matches_20 = obj2matches.get(msg.source);
				if(matches_20 != null && !matches_20.isEmpty()) {
					Collection<HMatch> toBeRemoved_20 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_20) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_20.add(m);
					}
					if(!toBeRemoved_20.isEmpty()) {
						sendDeletedMatches(toBeRemoved_20);
					}
				}
				break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient": 
				edge_explorer_14.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_21 = obj2matches.get(msg.source);
				if(matches_21 != null && !matches_21.isEmpty()) {
					Collection<HMatch> toBeRemoved_21 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_21) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_21.add(m);
					}
					if(!toBeRemoved_21.isEmpty()) {
						sendDeletedMatches(toBeRemoved_21);
					}
				}
				break;
		case "Something2Else.FamilyToInsuranceClient_target_InsuranceClient": 
				edge_explorer_15.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_22 = obj2matches.get(msg.source);
				if(matches_22 != null && !matches_22.isEmpty()) {
					Collection<HMatch> toBeRemoved_22 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_22) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_22.add(m);
					}
					if(!toBeRemoved_22.isEmpty()) {
						sendDeletedMatches(toBeRemoved_22);
					}
				}
				break;
		case "Something2Else.MemberToInsuranceClient_target_InsuranceClient": 
				edge_explorer_16.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_23 = obj2matches.get(msg.source);
				if(matches_23 != null && !matches_23.isEmpty()) {
					Collection<HMatch> toBeRemoved_23 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_23) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_23.add(m);
					}
					if(!toBeRemoved_23.isEmpty()) {
						sendDeletedMatches(toBeRemoved_23);
					}
				}
				break;
		case "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__family_Family": 
				edge_explorer_17.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_24 = obj2matches.get(msg.source);
				if(matches_24 != null && !matches_24.isEmpty()) {
					Collection<HMatch> toBeRemoved_24 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_24) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_24.add(m);
					}
					if(!toBeRemoved_24.isEmpty()) {
						sendDeletedMatches(toBeRemoved_24);
					}
				}
				break;
		case "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase": 
				edge_explorer_18.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_25 = obj2matches.get(msg.source);
				if(matches_25 != null && !matches_25.isEmpty()) {
					Collection<HMatch> toBeRemoved_25 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_25) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_25.add(m);
					}
					if(!toBeRemoved_25.isEmpty()) {
						sendDeletedMatches(toBeRemoved_25);
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
		// register DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_1 = new OverlapMatch(1);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		// register DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_2 = new OverlapMatch(1);
		Object[] oMatch_Nodes_2 = oMatch_2.getNodes();
		oMatch_Nodes_2[0] = objs[0];
		Collection<HMatch> oMatches_2 = overlap2matches_2.get(oMatch_2);
		if(oMatches_2 == null) {
			oMatches_2 = new HashSet<>();
			overlap2matches_2.put(oMatch_2, oMatches_2);
		}
		oMatches_2.add(match);
		
		
		// register daughter
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register family
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register familyRegister
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register insuranceClient
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register insuranceDB
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register familyRegisterToInsuranceDB
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register familyToInsuranceClient
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register memberToInsuranceClient
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 == null) {
			matches_7 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[7], matches_7);
		}
		matches_7.add(match);
		
		// register DaughterToInsuranceClient_eMoflon_ProtocolNode
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
		// deregister DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_1 = new OverlapMatch(1);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
		}
		
		// deregister DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_2 = new OverlapMatch(1);
		Object[] oMatch_Nodes_2 = oMatch_2.getNodes();
		oMatch_Nodes_2[0] = objs[0];
		Collection<HMatch> oMatches_2 = overlap2matches_2.get(oMatch_2);
		if(oMatches_2 != null) {
			oMatches_2.remove(match);
		}
		
		// deregister daughter
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister family
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister familyRegister
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister insuranceClient
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister insuranceDB
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister familyRegisterToInsuranceDB
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister familyToInsuranceClient
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister memberToInsuranceClient
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 != null) {
			matches_7.remove(match);
		}
		
		// deregister DaughterToInsuranceClient_eMoflon_ProtocolNode
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
		if(obj instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			HMatch match_1 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
			match_1.getNodes()[1] = obj;
			Collection<HMatch> formerMatches_1 = obj2matches.get(obj);
			if(formerMatches_1 != null) {
				
				formerMatches_1 = formerMatches_1.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_1);
			}
			start(edge_explorer_4_2_orchestration, match_1);
		}
		if(obj instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			HMatch match_0 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(edge_explorer_2_orchestration, match_0);
		}
		if(obj instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
			HMatch match_3 = new LocalSearchMatch("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", 9);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker.check(m) || !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_5_1_orchestration, match_3);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		edu.kit.ipd.sdq.metamodels.families.Member daughter = (edu.kit.ipd.sdq.metamodels.families.Member) match.getNodes()[0];
		edu.kit.ipd.sdq.metamodels.families.Family family = (edu.kit.ipd.sdq.metamodels.families.Family) match.getNodes()[1];
		edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient insuranceClient = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Concat csp_1 = new org.emoflon.ibex.tgg.operational.csp.constraints.Concat();
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, " ", "java.lang.String"));
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, daughter.getFirstName(), "java.lang.String"));
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, family.getLastName(), "java.lang.String"));
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, insuranceClient.getName(), "java.lang.String"));
		csp_1.solve();
		
		boolean predicate = csp_1.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient insuranceClient = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.families2insurance.UserDefined_expectFemale csp_2 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.families2insurance.UserDefined_expectFemale();
		csp_2.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, insuranceClient.getGender(), "Enum::Gender"));
		csp_2.solve();
		
		boolean predicate = csp_2.isSatisfied();
		return predicate;
	}
	
	
}

