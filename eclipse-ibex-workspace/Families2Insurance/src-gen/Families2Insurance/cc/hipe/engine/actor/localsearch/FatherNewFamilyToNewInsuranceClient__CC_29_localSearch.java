package Families2Insurance.cc.hipe.engine.actor.localsearch;

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

public class FatherNewFamilyToNewInsuranceClient__CC_29_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	EdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	EdgeExplorer edge_explorer_5;
	EdgeExplorer edge_explorer_6;
	NACExplorer nac_checker;
	NACExplorer nac_checker_0;
	NACExplorer nac_checker_1;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_3_2_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
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
						edge_explorer_methods.unique_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.families.Family) o).getFather();
						edge_explorer_methods.unique_opposite_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.families.Member) o).getFamilyFather();
						edge_explorer = new EdgeExplorer(this, 3, 4, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.FamilyRegisterToInsuranceDatabase) o).getSource(); return (result instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 1, 0, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Something2Else.FamilyRegisterToInsuranceDatabase) o).getTarget(); return (result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 1, 2, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.multi_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) o).getInsuranceclient();
						edge_explorer_5_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) return edge_explorer_5_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_5 = new EdgeExplorer(this, 2, 5, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.multi_lookup = (o) -> ((edu.kit.ipd.sdq.metamodels.families.FamilyRegister) o).getFamilies();
						edge_explorer_6_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) return edge_explorer_6_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_6 = new EdgeExplorer(this, 0, 3, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {4}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
		nac_checker_0 = new NACExplorer(this, Arrays.asList(new Integer[] {4}), node.getAllOverlaps().get(1));
		name2explorer.put("nac_checker_0", nac_checker_0);
		nac_checker_1 = new NACExplorer(this, Arrays.asList(new Integer[] {4}), node.getAllOverlaps().get(2));
		name2explorer.put("nac_checker_1", nac_checker_1);
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
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		nac_checker_0_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		nac_checker_1_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "FamilyRegister_object_SP0": 
				{
					
					// familyRegister
					HMatch match_0 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_3_2_orchestration, match_0);
				}
				break;
			case "FamilyRegisterToInsuranceDatabase_object_SP1": 
				{
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					
					// familyRegisterToInsuranceDB
					HMatch match_1 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_3_1_orchestration, match_1);
				}
				break;
			case "InsuranceDatabase_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// insuranceDB
						HMatch match_2 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
						match_2.getNodes()[2] = objs[0];
						start(edge_explorer_4_1_orchestration, match_2);
					}
				}
				break;
			case "Family_object_SP4": 
				{
					if(!lazy_initialization) {
						
						// family
						HMatch match_3 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
						match_3.getNodes()[3] = objs[0];
						start(edge_explorer_1_orchestration, match_3);
					}
				}
				break;
			case "Member_object_SP4": 
				{
					if(!lazy_initialization) {
						
						// father
						HMatch match_4 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
						match_4.getNodes()[4] = objs[0];
						start(edge_explorer_2_orchestration, match_4);
					}
				}
				break;
			case "InsuranceClient_object_SP1": 
				{
					if(!lazy_initialization) {
						
						// insuranceClient
						HMatch match_5 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
						match_5.getNodes()[5] = objs[0];
						start(edge_explorer_5_1_orchestration, match_5);
					}
				}
				break;
			case "FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_20_localSearch": 
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
			case "FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_23_localSearch": 
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
			case "FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_26_localSearch": 
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
			case "FamilyRegister_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "FamilyRegisterToInsuranceDatabase_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "InsuranceDatabase_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Family_object_SP4": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "Member_object_SP4": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "InsuranceClient_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_20_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[4] = objs_0[1];
					start(nac_checker_orchestration, acMatch_0);
				}
				break;
			case "FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_23_localSearch": 
				if(nac_checker_0.deregister(match)) {
					HMatch acMatch_1 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] acMatch_nodes_1 = acMatch_1.getNodes();
					Object[] objs_1 = match.getNodes();
					acMatch_nodes_1[4] = objs_1[1];
					start(nac_checker_0_orchestration, acMatch_1);
				}
				break;
			case "FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_26_localSearch": 
				if(nac_checker_1.deregister(match)) {
					HMatch acMatch_2 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] acMatch_nodes_2 = acMatch_2.getNodes();
					Object[] objs_2 = match.getNodes();
					acMatch_nodes_2[4] = objs_2[1];
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
		case "edu.kit.ipd.sdq.metamodels.families.Family_father_Member": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase": 
			if(!lazy_initialization) {
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
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
		case "edu.kit.ipd.sdq.metamodels.families.Family_father_Member": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[4].equals(msg.target))
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
						if(m.getNodes()[4].equals(msg.target))
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
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister": 
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
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
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
		case "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase": 
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
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
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
		case "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient": 
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
				break;
		case "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family": 
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
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		// register FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[4];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_1 = new OverlapMatch(1);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[4];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		// register FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_2 = new OverlapMatch(1);
		Object[] oMatch_Nodes_2 = oMatch_2.getNodes();
		oMatch_Nodes_2[0] = objs[4];
		Collection<HMatch> oMatches_2 = overlap2matches_2.get(oMatch_2);
		if(oMatches_2 == null) {
			oMatches_2 = new HashSet<>();
			overlap2matches_2.put(oMatch_2, oMatches_2);
		}
		oMatches_2.add(match);
		
		
		// register familyRegister
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register familyRegisterToInsuranceDB
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register insuranceDB
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register family
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register father
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register insuranceClient
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[4];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_1 = new OverlapMatch(1);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[4];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
		}
		
		// deregister FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_2 = new OverlapMatch(1);
		Object[] oMatch_Nodes_2 = oMatch_2.getNodes();
		oMatch_Nodes_2[0] = objs[4];
		Collection<HMatch> oMatches_2 = overlap2matches_2.get(oMatch_2);
		if(oMatches_2 != null) {
			oMatches_2.remove(match);
		}
		
		// deregister familyRegister
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister familyRegisterToInsuranceDB
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister insuranceDB
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister family
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister father
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister insuranceClient
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
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
		if(obj instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			HMatch match_4 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
			match_4.getNodes()[4] = obj;
			Collection<HMatch> formerMatches_4 = obj2matches.get(obj);
			if(formerMatches_4 != null) {
				
				formerMatches_4 = formerMatches_4.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_4);
			}
			start(edge_explorer_2_orchestration, match_4);
		}
		if(obj instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			HMatch match_3 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_1_orchestration, match_3);
		}
		if(obj instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
			HMatch match_5 = new LocalSearchMatch("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", 6);
			match_5.getNodes()[5] = obj;
			Collection<HMatch> formerMatches_5 = obj2matches.get(obj);
			if(formerMatches_5 != null) {
				
				formerMatches_5 = formerMatches_5.stream().filter(m -> !constraint_checker.check(m) || !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_5);
			}
			start(edge_explorer_5_1_orchestration, match_5);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		edu.kit.ipd.sdq.metamodels.families.Member father = (edu.kit.ipd.sdq.metamodels.families.Member) match.getNodes()[4];
		edu.kit.ipd.sdq.metamodels.families.Family family = (edu.kit.ipd.sdq.metamodels.families.Family) match.getNodes()[3];
		edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient insuranceClient = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Concat csp_2 = new org.emoflon.ibex.tgg.operational.csp.constraints.Concat();
		csp_2.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, " ", "java.lang.String"));
		csp_2.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, father.getFirstName(), "java.lang.String"));
		csp_2.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, family.getLastName(), "java.lang.String"));
		csp_2.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, insuranceClient.getName(), "java.lang.String"));
		csp_2.solve();
		
		boolean predicate = csp_2.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient insuranceClient = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.families2insurance.UserDefined_expectMale csp_3 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.families2insurance.UserDefined_expectMale();
		csp_3.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, insuranceClient.getGender(), "Enum::Gender"));
		csp_3.solve();
		
		boolean predicate = csp_3.isSatisfied();
		return predicate;
	}
	
	
}

