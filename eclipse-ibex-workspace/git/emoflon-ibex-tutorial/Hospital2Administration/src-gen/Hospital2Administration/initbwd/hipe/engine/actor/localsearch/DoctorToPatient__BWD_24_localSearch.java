package Hospital2Administration.initbwd.hipe.engine.actor.localsearch;

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

public class DoctorToPatient__BWD_24_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	EdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	EdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	EdgeExplorer edge_explorer_7;
	EdgeExplorer edge_explorer_8;
	CachedEdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	NACExplorer nac_checker;
	
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
	SearchOrchestration edge_explorer_5_2_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_8_1_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration nac_checker_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> ((AdministrationExample.Patient) o).getTreatment();
						edge_explorer_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof AdministrationExample.Patient) return o.equals(edge_explorer_methods.unique_lookup.apply(result)) ? result : null; else return null;};
						edge_explorer = new EdgeExplorer(this, 4, 8, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Hospital2Administration.PatientToPatient) o).getTarget(); return (result instanceof AdministrationExample.Patient ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 5, 4, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Hospital2Administration.StaffToStaff) o).getTarget(); return (result instanceof AdministrationExample.Staff ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 1, 7, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.multi_lookup = (o) -> ((HospitalExample.Department) o).getRooms();
						edge_explorer_5_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Department) return edge_explorer_5_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_5 = new EdgeExplorer(this, 2, 6, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.multi_lookup = (o) -> ((AdministrationExample.Staff) o).getTreatment();
						edge_explorer_6 = new CachedEdgeExplorer(this, 7, 8, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.multi_lookup = (o) -> ((HospitalExample.Room) o).getLies();
						edge_explorer_7_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Room) return edge_explorer_7_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_7 = new EdgeExplorer(this, 6, 3, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> ((HospitalExample.Staff) o).getWorks();
						edge_explorer_8_methods.multi_opposite_lookup = (o) -> ((HospitalExample.Department) o).getStaff().stream().filter(obj -> obj instanceof HospitalExample.Doctor).collect(Collectors.toList());
						edge_explorer_8 = new EdgeExplorer(this, 0, 2, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> {EObject result = ((Hospital2Administration.StaffToStaff) o).getSource(); return (result instanceof HospitalExample.Doctor ? result : null);};
						edge_explorer_9 = new CachedEdgeExplorer(this, 1, 0, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> {EObject result = ((Hospital2Administration.PatientToPatient) o).getSource(); return (result instanceof HospitalExample.Patient ? result : null);};
						edge_explorer_10 = new CachedEdgeExplorer(this, 5, 3, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {7,8}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
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
		edge_explorer_5_2_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_8_1_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("DoctorToPatient__BWD_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Doctor_object": 
				{
					
					// d
					HMatch match_0 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_8_1_orchestration, match_0);
				}
				break;
			case "StaffToStaff_object_SP0": 
				{
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_9.registerSourceObject(objs[0]);
					
					// dToS
					HMatch match_1 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_4_1_orchestration, match_1);
				}
				break;
			case "Department_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// dep
						HMatch match_2 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
						match_2.getNodes()[2] = objs[0];
						start(edge_explorer_5_1_orchestration, match_2);
					}
				}
				break;
			case "Patient_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// p1
						HMatch match_3 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
						match_3.getNodes()[3] = objs[0];
						start(edge_explorer_7_1_orchestration, match_3);
					}
				}
				break;
			case "Patient_1_object_SP2": 
				{
					if(!lazy_initialization) {
						
						// p2
						HMatch match_4 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
						match_4.getNodes()[4] = objs[0];
						start(edge_explorer_1_orchestration, match_4);
					}
				}
				break;
			case "PatientToPatient_object_SP0": 
				{
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_10.registerSourceObject(objs[0]);
					
					// pToP
					HMatch match_5 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_3_1_orchestration, match_5);
				}
				break;
			case "Room_object_SP0": 
				{
					if(!lazy_initialization) {
						
						// ro
						HMatch match_6 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
						match_6.getNodes()[6] = objs[0];
						start(edge_explorer_5_2_orchestration, match_6);
					}
				}
				break;
			case "Staff_object_SP0": 
				{
					edge_explorer_6.registerSourceObject(objs[0]);
					
					// s
					HMatch match_7 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					match_7.getNodes()[7] = objs[0];
					start(edge_explorer_4_2_orchestration, match_7);
				}
				break;
			case "Treatment_object": 
				{
					if(!lazy_initialization) {
						
						// t
						HMatch match_8 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
						match_8.getNodes()[8] = objs[0];
						start(edge_explorer_2_orchestration, match_8);
					}
				}
				break;
			case "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_20_localSearch": 
				{
					if(nac_checker.register(match)) {
						OverlapMatch acMatch_0 = new OverlapMatch(2);
						Object[] acMatch_nodes_0 = acMatch_0.getNodes();
						acMatch_nodes_0[0] = objs[1];
						acMatch_nodes_0[1] = objs[0];
						
						Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
						if(o2Matches_0 != null && !o2Matches_0.isEmpty()) {
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
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "Doctor_object": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "StaffToStaff_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "Department_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Patient_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "Patient_1_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "PatientToPatient_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "Room_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			case "Staff_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 7);
				break;
			case "Treatment_object": 
				removeMatchesUsedBy(match.getNodes()[0], 8);
				break;
			case "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_20_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[7] = objs_0[1];
					acMatch_nodes_0[8] = objs_0[0];
					start(nac_checker_orchestration, acMatch_0);
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
		case "AdministrationExample.Patient_treatment_Treatment": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Hospital2Administration.PatientToPatient_target_Patient": 
			if(!lazy_initialization) {
				if(msg.target instanceof AdministrationExample.Patient) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof AdministrationExample.Patient) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2Administration.StaffToStaff_target_Staff": 
			if(!lazy_initialization) {
				if(msg.target instanceof AdministrationExample.Staff) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof AdministrationExample.Staff) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof AdministrationExample.Staff) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "HospitalExample.Department_rooms_Room": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "AdministrationExample.Staff_treatment_Treatment": 
			if(!lazy_initialization) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "HospitalExample.Room_lies_Patient": 
			if(!lazy_initialization) {
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "HospitalExample.Staff_works_Department": 
			if(!lazy_initialization) {
				if(msg.source instanceof HospitalExample.Doctor) {
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.source instanceof HospitalExample.Doctor) {
				{
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2Administration.StaffToStaff_source_Staff": 
			if(!lazy_initialization) {
				if(msg.target instanceof HospitalExample.Doctor) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2Administration.PatientToPatient_source_Patient": 
			if(!lazy_initialization) {
				if(msg.target instanceof HospitalExample.Patient) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[3] = msg.target;
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
		case "AdministrationExample.Patient_treatment_Treatment": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[8].equals(msg.target))
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
						if(m.getNodes()[8].equals(msg.target))
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
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Hospital2Administration.PatientToPatient_target_Patient": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[4].equals(msg.target))
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
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "Hospital2Administration.StaffToStaff_target_Staff": 
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
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				break;
		case "HospitalExample.Department_rooms_Room": 
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[6].equals(msg.target))
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
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
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
		case "AdministrationExample.Staff_treatment_Treatment": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				break;
		case "HospitalExample.Room_lies_Patient": 
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				break;
		case "HospitalExample.Staff_works_Department": 
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
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				break;
		case "Hospital2Administration.StaffToStaff_source_Staff": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
				break;
		case "Hospital2Administration.PatientToPatient_source_Patient": 
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_17 = obj2matches.get(msg.source);
				if(matches_17 != null && !matches_17.isEmpty()) {
					Collection<HMatch> toBeRemoved_17 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_17) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_17.add(m);
					}
					if(!toBeRemoved_17.isEmpty()) {
						sendDeletedMatches(toBeRemoved_17);
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
		// register DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[7];
		oMatch_Nodes_0[1] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		
		// register d
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register dToS
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register dep
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register p1
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register p2
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register pToP
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register ro
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register s
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 == null) {
			matches_7 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[7], matches_7);
		}
		matches_7.add(match);
		
		// register t
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
		// deregister DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[7];
		oMatch_Nodes_0[1] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister d
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister dToS
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister dep
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister p1
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister p2
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister pToP
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister ro
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister s
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 != null) {
			matches_7.remove(match);
		}
		
		// deregister t
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
		if(obj instanceof AdministrationExample.Treatment) {
			HMatch match_8 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
			match_8.getNodes()[8] = obj;
			Collection<HMatch> formerMatches_8 = obj2matches.get(obj);
			if(formerMatches_8 != null) {
				
				formerMatches_8 = formerMatches_8.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_8);
			}
			start(edge_explorer_2_orchestration, match_8);
		}
		if(obj instanceof HospitalExample.Patient) {
			HMatch match_3 = new LocalSearchMatch("DoctorToPatient__BWD_24_localSearch", 9);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_7_1_orchestration, match_3);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		HospitalExample.Patient p1 = (HospitalExample.Patient) match.getNodes()[3];
		AdministrationExample.Treatment t = (AdministrationExample.Treatment) match.getNodes()[8];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_carelevelToMedication csp_0 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_carelevelToMedication();
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, p1.getLevel(), "Enum::Carelevel"));
		csp_0.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, t.getMedication(), "Enum::Medication"));
		csp_0.solve();
		
		boolean predicate = csp_0.isSatisfied();
		return predicate;
	}
	
	
}

