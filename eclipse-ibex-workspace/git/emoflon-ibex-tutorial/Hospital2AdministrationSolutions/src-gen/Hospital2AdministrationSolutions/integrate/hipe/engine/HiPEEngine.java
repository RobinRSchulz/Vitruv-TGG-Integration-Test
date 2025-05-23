package Hospital2AdministrationSolutions.integrate.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.NotificationActor;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.DispatchActor;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DepartmentRule__CC_1_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DepartmentRule__SRC_4_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DepartmentRule__FWD_7_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DepartmentRule__CONSISTENCY_8_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_10_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_14_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DocToStaffRule__TRG_18_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.junction.DocToStaffRule__BWD_23_junction;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DocToStaffRule__CC_32_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DocToStaffRule__SRC_41_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DocToStaffRule__FWD_45_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DocToStaffRule__CONSISTENCY_48_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__TRG_51_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__BWD_56_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__CC_61_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__CONSISTENCY_70_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_72_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorToPatient__TRG_76_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorToPatient__BWD_80_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorToPatient__CC_87_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorToPatient__SRC_97_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorToPatient__FWD_102_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.DoctorToPatient__CONSISTENCY_107_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_110_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__SRC_120_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__FWD_123_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__CONSISTENCY_124_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__TRG_127_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__BWD_132_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__CC_138_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__CONSISTENCY_148_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__CC_150_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__SRC_159_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__FWD_164_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__CONSISTENCY_169_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_171_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_175_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToStaffRule__TRG_179_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.junction.NurseToStaffRule__BWD_184_junction;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToStaffRule__CC_193_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToStaffRule__SRC_202_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToStaffRule__FWD_206_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.NurseToStaffRule__CONSISTENCY_209_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInReception__TRG_212_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInReception__BWD_215_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_219_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInReception__CC_222_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInReception__SRC_229_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInReception__FWD_233_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInReception__CONSISTENCY_236_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInRoom__TRG_239_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInRoom__BWD_242_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_247_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInRoom__CC_250_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInRoom__SRC_258_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInRoom__FWD_263_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.PatientInRoom__CONSISTENCY_266_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.RoomRule__CC_269_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.RoomRule__SRC_272_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.RoomRule__FWD_275_localSearch;
import Hospital2AdministrationSolutions.integrate.hipe.engine.actor.localsearch.RoomRule__CONSISTENCY_276_localSearch;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitGenReferenceActor;

import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine extends IHiPEEngine{
	
	public HiPEEngine(HiPENetwork network) {
		super(network);
	}
	
	public HiPEEngine() {
		super();
	}
	
	@Override
	public String getClassLocation() {
		return getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString();
	}
	
	@Override
	public String getPackageName() {
		return getClass().getPackageName();
	}
	
	@Override
	protected ActorRef getDispatchActor() {
		return system.actorOf(
			Props.create(DispatchActor.class, () -> new DispatchActor(name2actor, incUtil)),
			"DispatchActor");
	}
	
	@Override
	protected ActorRef getNotificationActor(boolean cascadingNotifications) {
		return system.actorOf(
			Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher, incUtil, cascadingNotifications)), 
			"NotificationActor");
	}
	
	@Override
	public void createProductionNodes() {
		classes.put("DepartmentRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__CC_production", "DepartmentRule__CC");
		classes.put("DepartmentRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__CONSISTENCY_production", "DepartmentRule__CONSISTENCY");
		classes.put("DepartmentRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__FWD_production", "DepartmentRule__FWD");
		classes.put("DepartmentRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__SRC_production", "DepartmentRule__SRC");
		classes.put("DocToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__BWD_production", "DocToStaffRule__BWD");
		classes.put("DocToStaffRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__CC_production", "DocToStaffRule__CC");
		classes.put("DocToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__CONSISTENCY_production", "DocToStaffRule__CONSISTENCY");
		classes.put("DocToStaffRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__FWD_production", "DocToStaffRule__FWD");
		classes.put("DocToStaffRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__SRC_production", "DocToStaffRule__SRC");
		classes.put("DocToStaffRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__TRG_production", "DocToStaffRule__TRG");
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DoctorShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__BWD_production", "DoctorShiftplanRule__BWD");
		classes.put("DoctorShiftplanRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CC_production", "DoctorShiftplanRule__CC");
		classes.put("DoctorShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CONSISTENCY_production", "DoctorShiftplanRule__CONSISTENCY");
		classes.put("DoctorShiftplanRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__TRG_production", "DoctorShiftplanRule__TRG");
		classes.put("DoctorToPatient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__BWD_production", "DoctorToPatient__BWD");
		classes.put("DoctorToPatient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CC_production", "DoctorToPatient__CC");
		classes.put("DoctorToPatient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CONSISTENCY_production", "DoctorToPatient__CONSISTENCY");
		classes.put("DoctorToPatient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__FWD_production", "DoctorToPatient__FWD");
		classes.put("DoctorToPatient__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__SRC_production", "DoctorToPatient__SRC");
		classes.put("DoctorToPatient__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__TRG_production", "DoctorToPatient__TRG");
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG");
		classes.put("HospitaltoAdministrationRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__BWD_production", "HospitaltoAdministrationRule__BWD");
		classes.put("HospitaltoAdministrationRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__CC_production", "HospitaltoAdministrationRule__CC");
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__CONSISTENCY_production", "HospitaltoAdministrationRule__CONSISTENCY");
		classes.put("HospitaltoAdministrationRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__FWD_production", "HospitaltoAdministrationRule__FWD");
		classes.put("HospitaltoAdministrationRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__SRC_production", "HospitaltoAdministrationRule__SRC");
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", "HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("NurseShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__BWD_production", "NurseShiftplanRule__BWD");
		classes.put("NurseShiftplanRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CC_production", "NurseShiftplanRule__CC");
		classes.put("NurseShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CONSISTENCY_production", "NurseShiftplanRule__CONSISTENCY");
		classes.put("NurseShiftplanRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__TRG_production", "NurseShiftplanRule__TRG");
		classes.put("NurseToRoomRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CC_production", "NurseToRoomRule__CC");
		classes.put("NurseToRoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CONSISTENCY_production", "NurseToRoomRule__CONSISTENCY");
		classes.put("NurseToRoomRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__FWD_production", "NurseToRoomRule__FWD");
		classes.put("NurseToRoomRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__SRC_production", "NurseToRoomRule__SRC");
		classes.put("NurseToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__BWD_production", "NurseToStaffRule__BWD");
		classes.put("NurseToStaffRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__CC_production", "NurseToStaffRule__CC");
		classes.put("NurseToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__CONSISTENCY_production", "NurseToStaffRule__CONSISTENCY");
		classes.put("NurseToStaffRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__FWD_production", "NurseToStaffRule__FWD");
		classes.put("NurseToStaffRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__SRC_production", "NurseToStaffRule__SRC");
		classes.put("NurseToStaffRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__TRG_production", "NurseToStaffRule__TRG");
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("PatientInReception__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__BWD_production", "PatientInReception__BWD");
		classes.put("PatientInReception__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__CC_production", "PatientInReception__CC");
		classes.put("PatientInReception__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__CONSISTENCY_production", "PatientInReception__CONSISTENCY");
		classes.put("PatientInReception__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__FWD_production", "PatientInReception__FWD");
		classes.put("PatientInReception__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__SRC_production", "PatientInReception__SRC");
		classes.put("PatientInReception__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__TRG_production", "PatientInReception__TRG");
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", "PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC");
		classes.put("PatientInRoom__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__BWD_production", "PatientInRoom__BWD");
		classes.put("PatientInRoom__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CC_production", "PatientInRoom__CC");
		classes.put("PatientInRoom__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CONSISTENCY_production", "PatientInRoom__CONSISTENCY");
		classes.put("PatientInRoom__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__FWD_production", "PatientInRoom__FWD");
		classes.put("PatientInRoom__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__SRC_production", "PatientInRoom__SRC");
		classes.put("PatientInRoom__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__TRG_production", "PatientInRoom__TRG");
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", "PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC");
		classes.put("RoomRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__CC_production", "RoomRule__CC");
		classes.put("RoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__CONSISTENCY_production", "RoomRule__CONSISTENCY");
		classes.put("RoomRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__FWD_production", "RoomRule__FWD");
		classes.put("RoomRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__SRC_production", "RoomRule__SRC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DepartmentRule__CC_1_localSearch", DepartmentRule__CC_1_localSearch.class);
		classes.put("DepartmentRule__SRC_4_localSearch", DepartmentRule__SRC_4_localSearch.class);
		classes.put("DepartmentRule__FWD_7_localSearch", DepartmentRule__FWD_7_localSearch.class);
		classes.put("DepartmentRule__CONSISTENCY_8_localSearch", DepartmentRule__CONSISTENCY_8_localSearch.class);
		classes.put("DocToStaffRule__BWD_26_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_10_localSearch", DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_10_localSearch.class);
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_14_localSearch", DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_14_localSearch.class);
		classes.put("DocToStaffRule__TRG_18_localSearch", DocToStaffRule__TRG_18_localSearch.class);
		classes.put("DocToStaffRule__BWD_25_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_23_junction", DocToStaffRule__BWD_23_junction.class);
		classes.put("DocToStaffRule__CC_32_localSearch", DocToStaffRule__CC_32_localSearch.class);
		classes.put("DocToStaffRule__SRC_41_localSearch", DocToStaffRule__SRC_41_localSearch.class);
		classes.put("DocToStaffRule__FWD_45_localSearch", DocToStaffRule__FWD_45_localSearch.class);
		classes.put("DocToStaffRule__CONSISTENCY_48_localSearch", DocToStaffRule__CONSISTENCY_48_localSearch.class);
		classes.put("DoctorShiftplanRule__TRG_51_localSearch", DoctorShiftplanRule__TRG_51_localSearch.class);
		classes.put("DoctorShiftplanRule__BWD_56_localSearch", DoctorShiftplanRule__BWD_56_localSearch.class);
		classes.put("DoctorShiftplanRule__CC_61_localSearch", DoctorShiftplanRule__CC_61_localSearch.class);
		classes.put("DoctorShiftplanRule__CONSISTENCY_70_localSearch", DoctorShiftplanRule__CONSISTENCY_70_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_72_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_72_localSearch.class);
		classes.put("DoctorToPatient__TRG_76_localSearch", DoctorToPatient__TRG_76_localSearch.class);
		classes.put("DoctorToPatient__BWD_80_localSearch", DoctorToPatient__BWD_80_localSearch.class);
		classes.put("DoctorToPatient__CC_87_localSearch", DoctorToPatient__CC_87_localSearch.class);
		classes.put("DoctorToPatient__SRC_97_localSearch", DoctorToPatient__SRC_97_localSearch.class);
		classes.put("DoctorToPatient__FWD_102_localSearch", DoctorToPatient__FWD_102_localSearch.class);
		classes.put("DoctorToPatient__CONSISTENCY_107_localSearch", DoctorToPatient__CONSISTENCY_107_localSearch.class);
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_110_localSearch", HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_110_localSearch.class);
		classes.put("HospitaltoAdministrationRule__CC_116_nacjunction", GenericNACJunctionActor.class);
		classes.put("HospitaltoAdministrationRule__CC_114_junction", GenericJunctionActor.class);
		classes.put("HospitaltoAdministrationRule__SRC_120_localSearch", HospitaltoAdministrationRule__SRC_120_localSearch.class);
		classes.put("HospitaltoAdministrationRule__FWD_123_localSearch", HospitaltoAdministrationRule__FWD_123_localSearch.class);
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_124_localSearch", HospitaltoAdministrationRule__CONSISTENCY_124_localSearch.class);
		classes.put("NurseShiftplanRule__TRG_127_localSearch", NurseShiftplanRule__TRG_127_localSearch.class);
		classes.put("NurseShiftplanRule__BWD_132_localSearch", NurseShiftplanRule__BWD_132_localSearch.class);
		classes.put("NurseShiftplanRule__CC_138_localSearch", NurseShiftplanRule__CC_138_localSearch.class);
		classes.put("NurseShiftplanRule__CONSISTENCY_148_localSearch", NurseShiftplanRule__CONSISTENCY_148_localSearch.class);
		classes.put("NurseToRoomRule__CC_150_localSearch", NurseToRoomRule__CC_150_localSearch.class);
		classes.put("NurseToRoomRule__SRC_159_localSearch", NurseToRoomRule__SRC_159_localSearch.class);
		classes.put("NurseToRoomRule__FWD_164_localSearch", NurseToRoomRule__FWD_164_localSearch.class);
		classes.put("NurseToRoomRule__CONSISTENCY_169_localSearch", NurseToRoomRule__CONSISTENCY_169_localSearch.class);
		classes.put("NurseToStaffRule__BWD_187_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_171_localSearch", NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_171_localSearch.class);
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_175_localSearch", NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_175_localSearch.class);
		classes.put("NurseToStaffRule__TRG_179_localSearch", NurseToStaffRule__TRG_179_localSearch.class);
		classes.put("NurseToStaffRule__BWD_186_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_184_junction", NurseToStaffRule__BWD_184_junction.class);
		classes.put("NurseToStaffRule__CC_193_localSearch", NurseToStaffRule__CC_193_localSearch.class);
		classes.put("NurseToStaffRule__SRC_202_localSearch", NurseToStaffRule__SRC_202_localSearch.class);
		classes.put("NurseToStaffRule__FWD_206_localSearch", NurseToStaffRule__FWD_206_localSearch.class);
		classes.put("NurseToStaffRule__CONSISTENCY_209_localSearch", NurseToStaffRule__CONSISTENCY_209_localSearch.class);
		classes.put("PatientInReception__TRG_212_localSearch", PatientInReception__TRG_212_localSearch.class);
		classes.put("PatientInReception__BWD_215_localSearch", PatientInReception__BWD_215_localSearch.class);
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_219_localSearch", PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_219_localSearch.class);
		classes.put("PatientInReception__CC_222_localSearch", PatientInReception__CC_222_localSearch.class);
		classes.put("PatientInReception__SRC_229_localSearch", PatientInReception__SRC_229_localSearch.class);
		classes.put("PatientInReception__FWD_233_localSearch", PatientInReception__FWD_233_localSearch.class);
		classes.put("PatientInReception__CONSISTENCY_236_localSearch", PatientInReception__CONSISTENCY_236_localSearch.class);
		classes.put("PatientInRoom__TRG_239_localSearch", PatientInRoom__TRG_239_localSearch.class);
		classes.put("PatientInRoom__BWD_242_localSearch", PatientInRoom__BWD_242_localSearch.class);
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_247_localSearch", PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_247_localSearch.class);
		classes.put("PatientInRoom__CC_250_localSearch", PatientInRoom__CC_250_localSearch.class);
		classes.put("PatientInRoom__SRC_258_localSearch", PatientInRoom__SRC_258_localSearch.class);
		classes.put("PatientInRoom__FWD_263_localSearch", PatientInRoom__FWD_263_localSearch.class);
		classes.put("PatientInRoom__CONSISTENCY_266_localSearch", PatientInRoom__CONSISTENCY_266_localSearch.class);
		classes.put("RoomRule__CC_269_localSearch", RoomRule__CC_269_localSearch.class);
		classes.put("RoomRule__SRC_272_localSearch", RoomRule__SRC_272_localSearch.class);
		classes.put("RoomRule__FWD_275_localSearch", RoomRule__FWD_275_localSearch.class);
		classes.put("RoomRule__CONSISTENCY_276_localSearch", RoomRule__CONSISTENCY_276_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("HospitalToAdministration_source_0_reference",HospitalToAdministration_source_0_reference.class);
		classes.put("HospitalToAdministration_target_0_reference",HospitalToAdministration_target_0_reference.class);
		classes.put("Hospital_reception_0_reference",Hospital_reception_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("DepartmentRule__Marker_object",DepartmentRule__Marker_object.class);
		classes.put("DocToStaffRule__Marker_object",DocToStaffRule__Marker_object.class);
		classes.put("DoctorShiftplanRule__Marker_object",DoctorShiftplanRule__Marker_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("DoctorToPatient__Marker_object",DoctorToPatient__Marker_object.class);
		classes.put("HospitaltoAdministrationRule__Marker_object",HospitaltoAdministrationRule__Marker_object.class);
		classes.put("NurseShiftplanRule__Marker_object",NurseShiftplanRule__Marker_object.class);
		classes.put("NurseToRoomRule__Marker_object",NurseToRoomRule__Marker_object.class);
		classes.put("NurseToStaffRule__Marker_object",NurseToStaffRule__Marker_object.class);
		classes.put("PatientInReception__Marker_object",PatientInReception__Marker_object.class);
		classes.put("PatientInRoom__Marker_object",PatientInRoom__Marker_object.class);
		classes.put("RoomRule__Marker_object",RoomRule__Marker_object.class);
		classes.put("Hospital_object_SP0",Hospital_object_SP0.class);
		classes.put("Hospital_object_SP1",Hospital_object_SP1.class);
		classes.put("Hospital_object_SP2",Hospital_object_SP2.class);
		classes.put("Hospital_object_SP3",Hospital_object_SP3.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("Department_object_SP2",Department_object_SP2.class);
		classes.put("Department_object_SP3",Department_object_SP3.class);
		classes.put("Department_object_SP4",Department_object_SP4.class);
		classes.put("HospitalToAdministration_object_SP0",HospitalToAdministration_object_SP0.class);
		classes.put("HospitalToAdministration_object_SP1",HospitalToAdministration_object_SP1.class);
		classes.put("HospitalToAdministration_object_SP2",HospitalToAdministration_object_SP2.class);
		classes.put("HospitalToAdministration_object_SP3",HospitalToAdministration_object_SP3.class);
		classes.put("Administration_object_SP0",Administration_object_SP0.class);
		classes.put("Administration_object_SP1",Administration_object_SP1.class);
		classes.put("Administration_object_SP2",Administration_object_SP2.class);
		classes.put("Administration_object_SP3",Administration_object_SP3.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("Staff_object_SP2",Staff_object_SP2.class);
		classes.put("Staff_object_SP3",Staff_object_SP3.class);
		classes.put("Shift_object_SP0",Shift_object_SP0.class);
		classes.put("Shift_object_SP1",Shift_object_SP1.class);
		classes.put("Shift_object_SP2",Shift_object_SP2.class);
		classes.put("Shiftplan_object_SP0",Shiftplan_object_SP0.class);
		classes.put("Shiftplan_object_SP1",Shiftplan_object_SP1.class);
		classes.put("Shiftplan_object_SP2",Shiftplan_object_SP2.class);
		classes.put("Doctor_object_SP0",Doctor_object_SP0.class);
		classes.put("Doctor_object_SP1",Doctor_object_SP1.class);
		classes.put("StaffToStaff_object_SP0",StaffToStaff_object_SP0.class);
		classes.put("StaffToStaff_object_SP1",StaffToStaff_object_SP1.class);
		classes.put("StaffToStaff_object_SP2",StaffToStaff_object_SP2.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_object_SP2",Patient_object_SP2.class);
		classes.put("Patient_object_SP3",Patient_object_SP3.class);
		classes.put("PatientToPatient_object_SP0",PatientToPatient_object_SP0.class);
		classes.put("PatientToPatient_object_SP1",PatientToPatient_object_SP1.class);
		classes.put("PatientToPatient_object_SP2",PatientToPatient_object_SP2.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("Patient_1_object_SP2",Patient_1_object_SP2.class);
		classes.put("Patient_1_object_SP3",Patient_1_object_SP3.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		classes.put("Room_object_SP2",Room_object_SP2.class);
		classes.put("Room_object_SP3",Room_object_SP3.class);
		classes.put("Reception_object_SP0",Reception_object_SP0.class);
		classes.put("Reception_object_SP1",Reception_object_SP1.class);
		classes.put("Nurse_object_SP0",Nurse_object_SP0.class);
		classes.put("Nurse_object_SP1",Nurse_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("HospitalToAdministration_source_0_reference", new InitGenReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration,HospitalExample.Hospital>(name2actor, name2node.get("HospitalToAdministration_source_0_reference"), (o) -> o instanceof Hospital2AdministrationSolutions.HospitalToAdministration, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("HospitalToAdministration_target_0_reference", new InitGenReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration,AdministrationExample.Administration>(name2actor, name2node.get("HospitalToAdministration_target_0_reference"), (o) -> o instanceof Hospital2AdministrationSolutions.HospitalToAdministration, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Hospital_reception_0_reference", new InitGenReferenceActor<HospitalExample.Hospital,HospitalExample.Reception>(name2actor, name2node.get("Hospital_reception_0_reference"), (o) -> o instanceof HospitalExample.Hospital, (o) -> o.getReception(), null, false, prodUtil, incUtil));
	}
}

class DepartmentRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DepartmentRule__Marker> { }
class DocToStaffRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DocToStaffRule__Marker> { }
class DoctorShiftplanRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DoctorShiftplanRule__Marker> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class DoctorToPatient__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DoctorToPatient__Marker> { }
class HospitaltoAdministrationRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.HospitaltoAdministrationRule__Marker> { }
class NurseShiftplanRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.NurseShiftplanRule__Marker> { }
class NurseToRoomRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.NurseToRoomRule__Marker> { }
class NurseToStaffRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.NurseToStaffRule__Marker> { }
class PatientInReception__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.PatientInReception__Marker> { }
class PatientInRoom__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.PatientInRoom__Marker> { }
class RoomRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.RoomRule__Marker> { }
class Hospital_object_SP0 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP1 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP2 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP3 extends GenericObjectActor<HospitalExample.Hospital> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP2 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP3 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP4 extends GenericObjectActor<HospitalExample.Department> { }
class HospitalToAdministration_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class HospitalToAdministration_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class HospitalToAdministration_object_SP2 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class HospitalToAdministration_object_SP3 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class Administration_object_SP0 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP1 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP2 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP3 extends GenericObjectActor<AdministrationExample.Administration> { }
class Staff_object_SP0 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP1 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP2 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP3 extends GenericObjectActor<AdministrationExample.Staff> { }
class Shift_object_SP0 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP1 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP2 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object_SP0 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP1 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP2 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Doctor_object_SP0 extends GenericObjectActor<HospitalExample.Doctor> { }
class Doctor_object_SP1 extends GenericObjectActor<HospitalExample.Doctor> { }
class StaffToStaff_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class StaffToStaff_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class StaffToStaff_object_SP2 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP2 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP3 extends GenericObjectActor<HospitalExample.Patient> { }
class PatientToPatient_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class PatientToPatient_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class PatientToPatient_object_SP2 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP2 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP3 extends GenericObjectActor<AdministrationExample.Patient> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP2 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP3 extends GenericObjectActor<HospitalExample.Room> { }
class Reception_object_SP0 extends GenericObjectActor<HospitalExample.Reception> { }
class Reception_object_SP1 extends GenericObjectActor<HospitalExample.Reception> { }
class Nurse_object_SP0 extends GenericObjectActor<HospitalExample.Nurse> { }
class Nurse_object_SP1 extends GenericObjectActor<HospitalExample.Nurse> { }

class HospitalToAdministration_source_0_reference extends GenericReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration, HospitalExample.Hospital> { }
class HospitalToAdministration_target_0_reference extends GenericReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration, AdministrationExample.Administration> { }
class Hospital_reception_0_reference extends GenericReferenceActor<HospitalExample.Hospital, HospitalExample.Reception> { }

