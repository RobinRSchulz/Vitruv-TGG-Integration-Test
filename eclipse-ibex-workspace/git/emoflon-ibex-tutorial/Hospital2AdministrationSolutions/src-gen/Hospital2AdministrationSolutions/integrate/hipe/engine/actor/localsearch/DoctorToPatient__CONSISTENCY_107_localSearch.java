package Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch;

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

public class DoctorToPatient__CONSISTENCY_107_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
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
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_8_1_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_9_1_orchestration;
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
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__SRC__d(); return (result instanceof HospitalExample.Doctor ? result : null);};
						edge_explorer = new CachedEdgeExplorer(this, 9, 0, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__SRC__p1(); return (result instanceof HospitalExample.Patient ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 9, 2, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCREATE__TRG__t(); return (result instanceof AdministrationExample.Treatment ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 9, 6, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__CORR__pToP();
						edge_explorer_5 = new CachedEdgeExplorer(this, 9, 8, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> {EObject result = ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__SRC__dep(); return (result instanceof HospitalExample.Department ? result : null);};
						edge_explorer_6 = new CachedEdgeExplorer(this, 9, 1, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__SRC__ro(); return (result instanceof HospitalExample.Room ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 9, 3, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> {EObject result = ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__TRG__p2(); return (result instanceof AdministrationExample.Patient ? result : null);};
						edge_explorer_8 = new CachedEdgeExplorer(this, 9, 4, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> {EObject result = ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__TRG__s(); return (result instanceof AdministrationExample.Staff ? result : null);};
						edge_explorer_9 = new CachedEdgeExplorer(this, 9, 5, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> ((Hospital2AdministrationSolutions.DoctorToPatient__Marker) o).getCONTEXT__CORR__dToS();
						edge_explorer_10 = new CachedEdgeExplorer(this, 9, 7, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {0,1,2,3,4,5,7,8}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
		pac_explorer_0 = new PACExplorer(this, Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8}), node.getAllOverlaps().get(1));
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
		edge_explorer_10_1_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(19).getPlan());
		pac_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(20).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("DoctorToPatient__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "DoctorToPatient__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					edge_explorer_9.registerSourceObject(objs[0]);
					edge_explorer_10.registerSourceObject(objs[0]);
					
					// DoctorToPatient_eMoflon_ProtocolNode
					HMatch match_9 = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					match_9.getNodes()[9] = objs[0];
					start(edge_explorer_1_orchestration, match_9);
				}
				break;
			case "DoctorToPatient__FWD_102_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
						acMatch_0.getNodes()[0] = objs[0];
						acMatch_0.getNodes()[1] = objs[2];
						acMatch_0.getNodes()[2] = objs[3];
						acMatch_0.getNodes()[3] = objs[6];
						acMatch_0.getNodes()[4] = objs[4];
						acMatch_0.getNodes()[5] = objs[7];
						acMatch_0.getNodes()[7] = objs[1];
						acMatch_0.getNodes()[8] = objs[5];
						
						// start search
						currentDepth++;
						start(pac_explorer_orchestration, acMatch_0);
						currentDepth--;
					}
				}
				break;
			case "DoctorToPatient__BWD_80_localSearch": 
				{
					if(pac_explorer_0.register(match)) {
						HMatch acMatch_1 = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
						acMatch_1.getNodes()[0] = objs[0];
						acMatch_1.getNodes()[1] = objs[2];
						acMatch_1.getNodes()[2] = objs[3];
						acMatch_1.getNodes()[3] = objs[6];
						acMatch_1.getNodes()[4] = objs[4];
						acMatch_1.getNodes()[5] = objs[7];
						acMatch_1.getNodes()[6] = objs[8];
						acMatch_1.getNodes()[7] = objs[1];
						acMatch_1.getNodes()[8] = objs[5];
						
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
			case "DoctorToPatient__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 9);
				break;
			case "DoctorToPatient__FWD_102_localSearch": 
				if(pac_explorer.deregister(match)) {
					OverlapMatch acMatch_0 = new OverlapMatch(8);
					acMatch_0.getNodes()[0] = match.getNodes()[0];
					acMatch_0.getNodes()[1] = match.getNodes()[2];
					acMatch_0.getNodes()[2] = match.getNodes()[3];
					acMatch_0.getNodes()[3] = match.getNodes()[6];
					acMatch_0.getNodes()[4] = match.getNodes()[4];
					acMatch_0.getNodes()[5] = match.getNodes()[7];
					acMatch_0.getNodes()[6] = match.getNodes()[1];
					acMatch_0.getNodes()[7] = match.getNodes()[5];
					Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
					if(o2Matches_0 != null) {
						if(!o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			case "DoctorToPatient__BWD_80_localSearch": 
				if(pac_explorer_0.deregister(match)) {
					OverlapMatch acMatch_1 = new OverlapMatch(9);
					acMatch_1.getNodes()[0] = match.getNodes()[0];
					acMatch_1.getNodes()[1] = match.getNodes()[2];
					acMatch_1.getNodes()[2] = match.getNodes()[3];
					acMatch_1.getNodes()[3] = match.getNodes()[6];
					acMatch_1.getNodes()[4] = match.getNodes()[4];
					acMatch_1.getNodes()[5] = match.getNodes()[7];
					acMatch_1.getNodes()[6] = match.getNodes()[8];
					acMatch_1.getNodes()[7] = match.getNodes()[1];
					acMatch_1.getNodes()[8] = match.getNodes()[5];
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
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__d_Doctor": 
			if(!lazy_initialization) {
				if(msg.target instanceof HospitalExample.Doctor) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof HospitalExample.Doctor) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof HospitalExample.Doctor) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__p1_Patient": 
			if(!lazy_initialization) {
				if(msg.target instanceof HospitalExample.Patient) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof HospitalExample.Patient) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CREATE__TRG__t_Treatment": 
			if(!lazy_initialization) {
				if(msg.target instanceof AdministrationExample.Treatment) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof AdministrationExample.Treatment) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__CORR__pToP_PatientToPatient": 
			if(!lazy_initialization) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__dep_Department": 
			if(!lazy_initialization) {
				if(msg.target instanceof HospitalExample.Department) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof HospitalExample.Department) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__ro_Room": 
			if(!lazy_initialization) {
				if(msg.target instanceof HospitalExample.Room) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof HospitalExample.Room) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__TRG__p2_Patient": 
			if(!lazy_initialization) {
				if(msg.target instanceof AdministrationExample.Patient) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof AdministrationExample.Patient) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__TRG__s_Staff": 
			if(!lazy_initialization) {
				if(msg.target instanceof AdministrationExample.Staff) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof AdministrationExample.Staff) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__CORR__dToS_StaffToStaff": 
			if(!lazy_initialization) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
					Object[] objs = match.getNodes();
					objs[9] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
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
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__d_Doctor": 
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
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__p1_Patient": 
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
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CREATE__TRG__t_Treatment": 
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
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__CORR__pToP_PatientToPatient": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[8].equals(msg.target))
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
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__dep_Department": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[1].equals(msg.target))
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
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__SRC__ro_Room": 
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
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
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
				break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__TRG__p2_Patient": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__TRG__s_Staff": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
				break;
		case "Hospital2AdministrationSolutions.DoctorToPatient__Marker_CONTEXT__CORR__dToS_StaffToStaff": 
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
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_18 = obj2matches.get(msg.source);
				if(matches_18 != null && !matches_18.isEmpty()) {
					Collection<HMatch> toBeRemoved_18 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_18) {
						if(m.getNodes()[7].equals(msg.target))
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
		// register DoctorToPatient__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(8);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[3];
		oMatch_Nodes_0[4] = objs[4];
		oMatch_Nodes_0[5] = objs[5];
		oMatch_Nodes_0[6] = objs[7];
		oMatch_Nodes_0[7] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register DoctorToPatient__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(9);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[1];
		oMatch_Nodes_1[2] = objs[2];
		oMatch_Nodes_1[3] = objs[3];
		oMatch_Nodes_1[4] = objs[4];
		oMatch_Nodes_1[5] = objs[5];
		oMatch_Nodes_1[6] = objs[6];
		oMatch_Nodes_1[7] = objs[7];
		oMatch_Nodes_1[8] = objs[8];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		
		// register p1
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register t
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register DoctorToPatient_eMoflon_ProtocolNode
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 == null) {
			matches_9 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[9], matches_9);
		}
		matches_9.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister DoctorToPatient__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(8);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		oMatch_Nodes_0[2] = objs[2];
		oMatch_Nodes_0[3] = objs[3];
		oMatch_Nodes_0[4] = objs[4];
		oMatch_Nodes_0[5] = objs[5];
		oMatch_Nodes_0[6] = objs[7];
		oMatch_Nodes_0[7] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister DoctorToPatient__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(9);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[0];
		oMatch_Nodes_1[1] = objs[1];
		oMatch_Nodes_1[2] = objs[2];
		oMatch_Nodes_1[3] = objs[3];
		oMatch_Nodes_1[4] = objs[4];
		oMatch_Nodes_1[5] = objs[5];
		oMatch_Nodes_1[6] = objs[6];
		oMatch_Nodes_1[7] = objs[7];
		oMatch_Nodes_1[8] = objs[8];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
		}
		
		// deregister p1
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister t
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister DoctorToPatient_eMoflon_ProtocolNode
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 != null) {
			matches_9.remove(match);
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
		if(obj instanceof HospitalExample.Patient) {
			HMatch match_2 = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(edge_explorer_3_1_orchestration, match_2);
		}
		if(obj instanceof AdministrationExample.Treatment) {
			HMatch match_6 = new LocalSearchMatch("DoctorToPatient__CONSISTENCY_107_localSearch", 10);
			match_6.getNodes()[6] = obj;
			Collection<HMatch> formerMatches_6 = obj2matches.get(obj);
			if(formerMatches_6 != null) {
				
				formerMatches_6 = formerMatches_6.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_6);
			}
			start(edge_explorer_4_1_orchestration, match_6);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		HospitalExample.Patient p1 = (HospitalExample.Patient) match.getNodes()[2];
		AdministrationExample.Treatment t = (AdministrationExample.Treatment) match.getNodes()[6];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.UserDefined_carelevelToMedication csp_21 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions.UserDefined_carelevelToMedication();
		csp_21.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, p1.getLevel(), "Enum::Carelevel"));
		csp_21.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, t.getMedication(), "Enum::Medication"));
		csp_21.solve();
		
		boolean predicate = csp_21.isSatisfied();
		return predicate;
	}
	
	
}

