package Hospital2AdministrationSolutions.initfwd.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.NotificationActor;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.DispatchActor;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DepartmentRule__CONSISTENCY_1_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DepartmentRule__FWD_5_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DocToStaffRule__CONSISTENCY_16_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DocToStaffRule__FWD_27_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DoctorShiftplanRule__CONSISTENCY_33_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_43_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DoctorToPatient__CONSISTENCY_47_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.DoctorToPatient__FWD_58_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_67_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__CONSISTENCY_71_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.HospitaltoAdministrationRule__FWD_77_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.NurseShiftplanRule__CONSISTENCY_80_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.NurseToRoomRule__CONSISTENCY_91_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.NurseToRoomRule__FWD_101_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_110_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_114_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.NurseToStaffRule__CONSISTENCY_118_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.NurseToStaffRule__FWD_129_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_135_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.PatientInReception__CONSISTENCY_138_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.PatientInReception__FWD_147_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_153_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.PatientInRoom__CONSISTENCY_156_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.PatientInRoom__FWD_166_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.RoomRule__CONSISTENCY_173_localSearch;
import Hospital2AdministrationSolutions.initfwd.hipe.engine.actor.localsearch.RoomRule__FWD_177_localSearch;

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
		classes.put("DepartmentRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__FWD_production", "DepartmentRule__FWD");
		classes.put("DocToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__CONSISTENCY_production", "DocToStaffRule__CONSISTENCY");
		classes.put("DocToStaffRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__FWD_production", "DocToStaffRule__FWD");
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DoctorShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CONSISTENCY_production", "DoctorShiftplanRule__CONSISTENCY");
		classes.put("DoctorToPatient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CONSISTENCY_production", "DoctorToPatient__CONSISTENCY");
		classes.put("DoctorToPatient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__FWD_production", "DoctorToPatient__FWD");
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG");
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__CONSISTENCY_production", "HospitaltoAdministrationRule__CONSISTENCY");
		classes.put("HospitaltoAdministrationRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__FWD_production", "HospitaltoAdministrationRule__FWD");
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", "HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("NurseShiftplanRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CONSISTENCY_production", "NurseShiftplanRule__CONSISTENCY");
		classes.put("NurseToRoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CONSISTENCY_production", "NurseToRoomRule__CONSISTENCY");
		classes.put("NurseToRoomRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__FWD_production", "NurseToRoomRule__FWD");
		classes.put("NurseToStaffRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__CONSISTENCY_production", "NurseToStaffRule__CONSISTENCY");
		classes.put("NurseToStaffRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__FWD_production", "NurseToStaffRule__FWD");
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("PatientInReception__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__CONSISTENCY_production", "PatientInReception__CONSISTENCY");
		classes.put("PatientInReception__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__FWD_production", "PatientInReception__FWD");
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", "PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC");
		classes.put("PatientInRoom__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CONSISTENCY_production", "PatientInRoom__CONSISTENCY");
		classes.put("PatientInRoom__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__FWD_production", "PatientInRoom__FWD");
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", "PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC");
		classes.put("RoomRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__CONSISTENCY_production", "RoomRule__CONSISTENCY");
		classes.put("RoomRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__FWD_production", "RoomRule__FWD");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DepartmentRule__CONSISTENCY_1_localSearch", DepartmentRule__CONSISTENCY_1_localSearch.class);
		classes.put("DepartmentRule__FWD_5_localSearch", DepartmentRule__FWD_5_localSearch.class);
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch", DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch.class);
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch", DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch.class);
		classes.put("DocToStaffRule__CONSISTENCY_16_localSearch", DocToStaffRule__CONSISTENCY_16_localSearch.class);
		classes.put("DocToStaffRule__FWD_27_localSearch", DocToStaffRule__FWD_27_localSearch.class);
		classes.put("DoctorShiftplanRule__CONSISTENCY_33_localSearch", DoctorShiftplanRule__CONSISTENCY_33_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_43_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_43_localSearch.class);
		classes.put("DoctorToPatient__CONSISTENCY_47_localSearch", DoctorToPatient__CONSISTENCY_47_localSearch.class);
		classes.put("DoctorToPatient__FWD_58_localSearch", DoctorToPatient__FWD_58_localSearch.class);
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_67_localSearch", HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_67_localSearch.class);
		classes.put("HospitaltoAdministrationRule__CONSISTENCY_71_localSearch", HospitaltoAdministrationRule__CONSISTENCY_71_localSearch.class);
		classes.put("HospitaltoAdministrationRule__FWD_77_localSearch", HospitaltoAdministrationRule__FWD_77_localSearch.class);
		classes.put("NurseShiftplanRule__CONSISTENCY_80_localSearch", NurseShiftplanRule__CONSISTENCY_80_localSearch.class);
		classes.put("NurseToRoomRule__CONSISTENCY_91_localSearch", NurseToRoomRule__CONSISTENCY_91_localSearch.class);
		classes.put("NurseToRoomRule__FWD_101_localSearch", NurseToRoomRule__FWD_101_localSearch.class);
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_110_localSearch", NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_110_localSearch.class);
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_114_localSearch", NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_114_localSearch.class);
		classes.put("NurseToStaffRule__CONSISTENCY_118_localSearch", NurseToStaffRule__CONSISTENCY_118_localSearch.class);
		classes.put("NurseToStaffRule__FWD_129_localSearch", NurseToStaffRule__FWD_129_localSearch.class);
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_135_localSearch", PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_135_localSearch.class);
		classes.put("PatientInReception__CONSISTENCY_138_localSearch", PatientInReception__CONSISTENCY_138_localSearch.class);
		classes.put("PatientInReception__FWD_147_localSearch", PatientInReception__FWD_147_localSearch.class);
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_153_localSearch", PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_153_localSearch.class);
		classes.put("PatientInRoom__CONSISTENCY_156_localSearch", PatientInRoom__CONSISTENCY_156_localSearch.class);
		classes.put("PatientInRoom__FWD_166_localSearch", PatientInRoom__FWD_166_localSearch.class);
		classes.put("RoomRule__CONSISTENCY_173_localSearch", RoomRule__CONSISTENCY_173_localSearch.class);
		classes.put("RoomRule__FWD_177_localSearch", RoomRule__FWD_177_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
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
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("Department_object_SP2",Department_object_SP2.class);
		classes.put("Department_object_SP3",Department_object_SP3.class);
		classes.put("Hospital_object_SP0",Hospital_object_SP0.class);
		classes.put("Hospital_object_SP1",Hospital_object_SP1.class);
		classes.put("Hospital_object_SP2",Hospital_object_SP2.class);
		classes.put("Hospital_object_SP3",Hospital_object_SP3.class);
		classes.put("Doctor_object_SP0",Doctor_object_SP0.class);
		classes.put("Doctor_object_SP1",Doctor_object_SP1.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("Staff_object_SP2",Staff_object_SP2.class);
		classes.put("Shift_object_SP0",Shift_object_SP0.class);
		classes.put("Shift_object_SP1",Shift_object_SP1.class);
		classes.put("Shiftplan_object_SP0",Shiftplan_object_SP0.class);
		classes.put("Shiftplan_object_SP1",Shiftplan_object_SP1.class);
		classes.put("Administration_object_SP0",Administration_object_SP0.class);
		classes.put("Administration_object_SP1",Administration_object_SP1.class);
		classes.put("Administration_object_SP2",Administration_object_SP2.class);
		classes.put("HospitalToAdministration_object_SP0",HospitalToAdministration_object_SP0.class);
		classes.put("HospitalToAdministration_object_SP1",HospitalToAdministration_object_SP1.class);
		classes.put("HospitalToAdministration_object_SP2",HospitalToAdministration_object_SP2.class);
		classes.put("StaffToStaff_object_SP0",StaffToStaff_object_SP0.class);
		classes.put("StaffToStaff_object_SP1",StaffToStaff_object_SP1.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_object_SP2",Patient_object_SP2.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("PatientToPatient_object_SP0",PatientToPatient_object_SP0.class);
		classes.put("PatientToPatient_object_SP1",PatientToPatient_object_SP1.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		classes.put("Room_object_SP2",Room_object_SP2.class);
		classes.put("Reception_object_SP0",Reception_object_SP0.class);
		classes.put("Reception_object_SP1",Reception_object_SP1.class);
		classes.put("Nurse_object_SP0",Nurse_object_SP0.class);
		classes.put("Nurse_object_SP1",Nurse_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
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
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP2 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP3 extends GenericObjectActor<HospitalExample.Department> { }
class Hospital_object_SP0 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP1 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP2 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP3 extends GenericObjectActor<HospitalExample.Hospital> { }
class Doctor_object_SP0 extends GenericObjectActor<HospitalExample.Doctor> { }
class Doctor_object_SP1 extends GenericObjectActor<HospitalExample.Doctor> { }
class Staff_object_SP0 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP1 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP2 extends GenericObjectActor<AdministrationExample.Staff> { }
class Shift_object_SP0 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP1 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object_SP0 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP1 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Administration_object_SP0 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP1 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP2 extends GenericObjectActor<AdministrationExample.Administration> { }
class HospitalToAdministration_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class HospitalToAdministration_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class HospitalToAdministration_object_SP2 extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class StaffToStaff_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class StaffToStaff_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP2 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class PatientToPatient_object_SP0 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class PatientToPatient_object_SP1 extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP2 extends GenericObjectActor<HospitalExample.Room> { }
class Reception_object_SP0 extends GenericObjectActor<HospitalExample.Reception> { }
class Reception_object_SP1 extends GenericObjectActor<HospitalExample.Reception> { }
class Nurse_object_SP0 extends GenericObjectActor<HospitalExample.Nurse> { }
class Nurse_object_SP1 extends GenericObjectActor<HospitalExample.Nurse> { }


