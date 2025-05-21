package Hospital2AdministrationSolutions.initbwd.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.NotificationActor;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.DispatchActor;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DepartmentRule__CONSISTENCY_1_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_9_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_5_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.junction.DocToStaffRule__BWD_13_junction;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DocToStaffRule__CONSISTENCY_32_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DoctorShiftplanRule__BWD_43_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DoctorShiftplanRule__CONSISTENCY_52_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_62_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DoctorToPatient__BWD_66_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.DoctorToPatient__CONSISTENCY_76_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_88_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__CONSISTENCY_92_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.NurseShiftplanRule__BWD_98_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.NurseShiftplanRule__CONSISTENCY_108_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.NurseToRoomRule__CONSISTENCY_119_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_133_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_129_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.junction.NurseToStaffRule__BWD_137_junction;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.NurseToStaffRule__CONSISTENCY_156_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.PatientInReception__BWD_167_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_173_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.PatientInReception__CONSISTENCY_176_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.PatientInRoom__BWD_185_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_192_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.PatientInRoom__CONSISTENCY_195_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.localsearch.RoomRule__CONSISTENCY_205_localSearch;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.node.Staff_object_SP0;
import Hospital2AdministrationSolutions.initbwd.hipe.engine.actor.node.Staff_object_SP1;

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
		classes.put("DepartmentRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__CONSISTENCY_production", "DepartmentRule__CONSISTENCY");
		classes.put("DocToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__BWD_production", "DocToStaffRule__BWD");
		classes.put("DocToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__CONSISTENCY_production", "DocToStaffRule__CONSISTENCY");
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DoctorShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__BWD_production", "DoctorShiftplanRule__BWD");
		classes.put("DoctorShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CONSISTENCY_production", "DoctorShiftplanRule__CONSISTENCY");
		classes.put("DoctorToPatient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__BWD_production", "DoctorToPatient__BWD");
		classes.put("DoctorToPatient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CONSISTENCY_production", "DoctorToPatient__CONSISTENCY");
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG");
		classes.put("HospitaltoAdministrationRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__BWD_production", "HospitaltoAdministrationRule__BWD");
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__CONSISTENCY_production", "HospitaltoAdministrationRule__CONSISTENCY");
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", "HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("NurseShiftplanRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__BWD_production", "NurseShiftplanRule__BWD");
		classes.put("NurseShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CONSISTENCY_production", "NurseShiftplanRule__CONSISTENCY");
		classes.put("NurseToRoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CONSISTENCY_production", "NurseToRoomRule__CONSISTENCY");
		classes.put("NurseToStaffRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__BWD_production", "NurseToStaffRule__BWD");
		classes.put("NurseToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__CONSISTENCY_production", "NurseToStaffRule__CONSISTENCY");
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("PatientInReception__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__BWD_production", "PatientInReception__BWD");
		classes.put("PatientInReception__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__CONSISTENCY_production", "PatientInReception__CONSISTENCY");
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", "PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC");
		classes.put("PatientInRoom__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__BWD_production", "PatientInRoom__BWD");
		classes.put("PatientInRoom__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CONSISTENCY_production", "PatientInRoom__CONSISTENCY");
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", "PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC");
		classes.put("RoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__CONSISTENCY_production", "RoomRule__CONSISTENCY");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DepartmentRule__CONSISTENCY_1_localSearch", DepartmentRule__CONSISTENCY_1_localSearch.class);
		classes.put("DocToStaffRule__BWD_16_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_9_localSearch", DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_9_localSearch.class);
		classes.put("DocToStaffRule__BWD_20_nacjunction", GenericNACJunctionActor.class);
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_5_localSearch", DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_5_localSearch.class);
		classes.put("DocToStaffRule__BWD_27_nacjunction", GenericNACJunctionActor.class);
		classes.put("DocToStaffRule__BWD_21_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_17_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_15_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__BWD_13_junction", DocToStaffRule__BWD_13_junction.class);
		classes.put("DocToStaffRule__CONSISTENCY_32_localSearch", DocToStaffRule__CONSISTENCY_32_localSearch.class);
		classes.put("DoctorShiftplanRule__BWD_43_localSearch", DoctorShiftplanRule__BWD_43_localSearch.class);
		classes.put("DoctorShiftplanRule__CONSISTENCY_52_localSearch", DoctorShiftplanRule__CONSISTENCY_52_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_62_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_62_localSearch.class);
		classes.put("DoctorToPatient__BWD_66_localSearch", DoctorToPatient__BWD_66_localSearch.class);
		classes.put("DoctorToPatient__CONSISTENCY_76_localSearch", DoctorToPatient__CONSISTENCY_76_localSearch.class);
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_88_localSearch", HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_88_localSearch.class);
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_92_localSearch", HospitaltoAdministrationRule__CONSISTENCY_92_localSearch.class);
		classes.put("NurseShiftplanRule__BWD_98_localSearch", NurseShiftplanRule__BWD_98_localSearch.class);
		classes.put("NurseShiftplanRule__CONSISTENCY_108_localSearch", NurseShiftplanRule__CONSISTENCY_108_localSearch.class);
		classes.put("NurseToRoomRule__CONSISTENCY_119_localSearch", NurseToRoomRule__CONSISTENCY_119_localSearch.class);
		classes.put("NurseToStaffRule__BWD_140_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_133_localSearch", NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_133_localSearch.class);
		classes.put("NurseToStaffRule__BWD_144_nacjunction", GenericNACJunctionActor.class);
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_129_localSearch", NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_129_localSearch.class);
		classes.put("NurseToStaffRule__BWD_151_nacjunction", GenericNACJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_145_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_141_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_139_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__BWD_137_junction", NurseToStaffRule__BWD_137_junction.class);
		classes.put("NurseToStaffRule__CONSISTENCY_156_localSearch", NurseToStaffRule__CONSISTENCY_156_localSearch.class);
		classes.put("PatientInReception__BWD_167_localSearch", PatientInReception__BWD_167_localSearch.class);
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_173_localSearch", PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_173_localSearch.class);
		classes.put("PatientInReception__CONSISTENCY_176_localSearch", PatientInReception__CONSISTENCY_176_localSearch.class);
		classes.put("PatientInRoom__BWD_185_localSearch", PatientInRoom__BWD_185_localSearch.class);
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_192_localSearch", PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_192_localSearch.class);
		classes.put("PatientInRoom__CONSISTENCY_195_localSearch", PatientInRoom__CONSISTENCY_195_localSearch.class);
		classes.put("RoomRule__CONSISTENCY_205_localSearch", RoomRule__CONSISTENCY_205_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("HospitalToAdministration_source_0_reference",HospitalToAdministration_source_0_reference.class);
		classes.put("HospitalToAdministration_target_0_reference",HospitalToAdministration_target_0_reference.class);
		classes.put("Shiftplan_shifts_0_reference",Shiftplan_shifts_0_reference.class);
		classes.put("Administration_staff_0_reference",Administration_staff_0_reference.class);
		classes.put("Staff_shiftPlan_0_reference",Staff_shiftPlan_0_reference.class);
		classes.put("Administration_staff_1_reference",Administration_staff_1_reference.class);
		classes.put("Staff_shiftPlan_1_reference",Staff_shiftPlan_1_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("DepartmentRule__Marker_object",DepartmentRule__Marker_object.class);
		classes.put("DocToStaffRule__Marker_object",DocToStaffRule__Marker_object.class);
		classes.put("DoctorShiftplanRule__Marker_object",DoctorShiftplanRule__Marker_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("DoctorToPatient__Marker_object",DoctorToPatient__Marker_object.class);
		classes.put("HospitaltoAdministrationRule__Marker_object",HospitaltoAdministrationRule__Marker_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("NurseShiftplanRule__Marker_object",NurseShiftplanRule__Marker_object.class);
		classes.put("NurseToRoomRule__Marker_object",NurseToRoomRule__Marker_object.class);
		classes.put("NurseToStaffRule__Marker_object",NurseToStaffRule__Marker_object.class);
		classes.put("PatientInReception__Marker_object",PatientInReception__Marker_object.class);
		classes.put("PatientInRoom__Marker_object",PatientInRoom__Marker_object.class);
		classes.put("RoomRule__Marker_object",RoomRule__Marker_object.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("Department_object_SP2",Department_object_SP2.class);
		classes.put("Hospital_object_SP0",Hospital_object_SP0.class);
		classes.put("Hospital_object_SP1",Hospital_object_SP1.class);
		classes.put("Hospital_object_SP2",Hospital_object_SP2.class);
		classes.put("HospitalToAdministration_object_SP0",HospitalToAdministration_object_SP0.class);
		classes.put("HospitalToAdministration_object_SP1",HospitalToAdministration_object_SP1.class);
		classes.put("HospitalToAdministration_object_SP2",HospitalToAdministration_object_SP2.class);
		classes.put("Administration_object_SP0",Administration_object_SP0.class);
		classes.put("Administration_object_SP1",Administration_object_SP1.class);
		classes.put("Administration_object_SP2",Administration_object_SP2.class);
		classes.put("Shiftplan_object_SP0",Shiftplan_object_SP0.class);
		classes.put("Shiftplan_object_SP1",Shiftplan_object_SP1.class);
		classes.put("Shiftplan_object_SP2",Shiftplan_object_SP2.class);
		classes.put("Shiftplan_object_SP3",Shiftplan_object_SP3.class);
		classes.put("Shift_object_SP0",Shift_object_SP0.class);
		classes.put("Shift_object_SP1",Shift_object_SP1.class);
		classes.put("Shift_object_SP2",Shift_object_SP2.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("Staff_object_SP2",Staff_object_SP2.class);
		classes.put("Staff_object_SP3",Staff_object_SP3.class);
		classes.put("Doctor_object_SP0",Doctor_object_SP0.class);
		classes.put("Doctor_object_SP1",Doctor_object_SP1.class);
		classes.put("StaffToStaff_object_SP0",StaffToStaff_object_SP0.class);
		classes.put("StaffToStaff_object_SP1",StaffToStaff_object_SP1.class);
		classes.put("StaffToStaff_object_SP2",StaffToStaff_object_SP2.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_object_SP2",Patient_object_SP2.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("Patient_1_object_SP2",Patient_1_object_SP2.class);
		classes.put("PatientToPatient_object_SP0",PatientToPatient_object_SP0.class);
		classes.put("PatientToPatient_object_SP1",PatientToPatient_object_SP1.class);
		classes.put("PatientToPatient_object_SP2",PatientToPatient_object_SP2.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		classes.put("Room_object_SP2",Room_object_SP2.class);
		classes.put("Reception_object_SP0",Reception_object_SP0.class);
		classes.put("Reception_object_SP1",Reception_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("HospitalToAdministration_source_0_reference", new InitGenReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration,HospitalExample.Hospital>(name2actor, name2node.get("HospitalToAdministration_source_0_reference"), (o) -> o instanceof Hospital2AdministrationSolutions.HospitalToAdministration, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("HospitalToAdministration_target_0_reference", new InitGenReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration,AdministrationExample.Administration>(name2actor, name2node.get("HospitalToAdministration_target_0_reference"), (o) -> o instanceof Hospital2AdministrationSolutions.HospitalToAdministration, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Shiftplan_shifts_0_reference", new InitGenReferenceActor<AdministrationExample.Shiftplan,AdministrationExample.Shift>(name2actor, name2node.get("Shiftplan_shifts_0_reference"), (o) -> o instanceof AdministrationExample.Shiftplan, null, (o) -> o.getShifts(), false, prodUtil, incUtil));
		name2initRefGen.put("Administration_staff_0_reference", new InitGenReferenceActor<AdministrationExample.Administration,AdministrationExample.Staff>(name2actor, name2node.get("Administration_staff_0_reference"), (o) -> o instanceof AdministrationExample.Administration, null, (o) -> o.getStaff(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_shiftPlan_0_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Shiftplan>(name2actor, name2node.get("Staff_shiftPlan_0_reference"), (o) -> o instanceof AdministrationExample.Staff, (o) -> o.getShiftPlan(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Administration_staff_1_reference", new InitGenReferenceActor<AdministrationExample.Administration,AdministrationExample.Staff>(name2actor, name2node.get("Administration_staff_1_reference"), (o) -> o instanceof AdministrationExample.Administration, null, (o) -> o.getStaff(), false, prodUtil, incUtil));
		name2initRefGen.put("Staff_shiftPlan_1_reference", new InitGenReferenceActor<AdministrationExample.Staff,AdministrationExample.Shiftplan>(name2actor, name2node.get("Staff_shiftPlan_1_reference"), (o) -> o instanceof AdministrationExample.Staff, (o) -> o.getShiftPlan(), null, false, prodUtil, incUtil));
	}
}

class DepartmentRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DepartmentRule__Marker> { }
class DocToStaffRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DocToStaffRule__Marker> { }
class DoctorShiftplanRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DoctorShiftplanRule__Marker> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class DoctorToPatient__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.DoctorToPatient__Marker> { }
class HospitaltoAdministrationRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.HospitaltoAdministrationRule__Marker> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class NurseShiftplanRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.NurseShiftplanRule__Marker> { }
class NurseToRoomRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.NurseToRoomRule__Marker> { }
class NurseToStaffRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.NurseToStaffRule__Marker> { }
class PatientInReception__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.PatientInReception__Marker> { }
class PatientInRoom__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.PatientInRoom__Marker> { }
class RoomRule__Marker_object extends GenericObjectActor<Hospital2AdministrationSolutions.RoomRule__Marker> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP2 extends GenericObjectActor<HospitalExample.Department> { }
class Hospital_object_SP0 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP1 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP2 extends GenericObjectActor<HospitalExample.Hospital> { }
class HospitalToAdministration_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class HospitalToAdministration_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class HospitalToAdministration_object_SP2 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class Administration_object_SP0 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP1 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP2 extends GenericObjectActor<AdministrationExample.Administration> { }
class Shiftplan_object_SP0 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP1 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP2 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP3 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shift_object_SP0 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP1 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP2 extends GenericObjectActor<AdministrationExample.Shift> { }
class Staff_object_SP2 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP3 extends GenericObjectActor<AdministrationExample.Staff> { }
class Doctor_object_SP0 extends GenericObjectActor<HospitalExample.Doctor> { }
class Doctor_object_SP1 extends GenericObjectActor<HospitalExample.Doctor> { }
class StaffToStaff_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class StaffToStaff_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class StaffToStaff_object_SP2 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP2 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP2 extends GenericObjectActor<AdministrationExample.Patient> { }
class PatientToPatient_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class PatientToPatient_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class PatientToPatient_object_SP2 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP2 extends GenericObjectActor<HospitalExample.Room> { }
class Reception_object_SP0 extends GenericObjectActor<HospitalExample.Reception> { }
class Reception_object_SP1 extends GenericObjectActor<HospitalExample.Reception> { }

class HospitalToAdministration_source_0_reference extends GenericReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration, HospitalExample.Hospital> { }
class HospitalToAdministration_target_0_reference extends GenericReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration, AdministrationExample.Administration> { }
class Shiftplan_shifts_0_reference extends GenericReferenceActor<AdministrationExample.Shiftplan, AdministrationExample.Shift> { }
class Administration_staff_0_reference extends GenericReferenceActor<AdministrationExample.Administration, AdministrationExample.Staff> { }
class Staff_shiftPlan_0_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Shiftplan> { }
class Administration_staff_1_reference extends GenericReferenceActor<AdministrationExample.Administration, AdministrationExample.Staff> { }
class Staff_shiftPlan_1_reference extends GenericReferenceActor<AdministrationExample.Staff, AdministrationExample.Shiftplan> { }

