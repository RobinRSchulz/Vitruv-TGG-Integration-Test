package Hospital2AdministrationSolutions.cc.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2AdministrationSolutions.cc.hipe.engine.actor.NotificationActor;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.DispatchActor;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.DepartmentRule__CC_1_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_4_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_8_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.DocToStaffRule__CC_12_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.DoctorShiftplanRule__CC_21_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_30_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.DoctorToPatient__CC_34_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_44_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.NurseShiftplanRule__CC_54_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.NurseToRoomRule__CC_64_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_73_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_77_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.NurseToStaffRule__CC_81_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_90_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.PatientInReception__CC_93_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_100_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.PatientInRoom__CC_103_localSearch;
import Hospital2AdministrationSolutions.cc.hipe.engine.actor.localsearch.RoomRule__CC_111_localSearch;

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
		classes.put("DocToStaffRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__CC_production", "DocToStaffRule__CC");
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("DoctorShiftplanRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CC_production", "DoctorShiftplanRule__CC");
		classes.put("DoctorToPatient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CC_production", "DoctorToPatient__CC");
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG");
		classes.put("HospitaltoAdministrationRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule__CC_production", "HospitaltoAdministrationRule__CC");
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_production", "HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("NurseShiftplanRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CC_production", "NurseShiftplanRule__CC");
		classes.put("NurseToRoomRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CC_production", "NurseToRoomRule__CC");
		classes.put("NurseToStaffRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__CC_production", "NurseToStaffRule__CC");
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_production", "NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG");
		classes.put("PatientInReception__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__CC_production", "PatientInReception__CC");
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_production", "PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC");
		classes.put("PatientInRoom__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CC_production", "PatientInRoom__CC");
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_production", "PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC");
		classes.put("RoomRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__CC_production", "RoomRule__CC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DepartmentRule__CC_1_localSearch", DepartmentRule__CC_1_localSearch.class);
		classes.put("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_4_localSearch", DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_4_localSearch.class);
		classes.put("DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_8_localSearch", DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_8_localSearch.class);
		classes.put("DocToStaffRule__CC_12_localSearch", DocToStaffRule__CC_12_localSearch.class);
		classes.put("DoctorShiftplanRule__CC_21_localSearch", DoctorShiftplanRule__CC_21_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_30_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_30_localSearch.class);
		classes.put("DoctorToPatient__CC_34_localSearch", DoctorToPatient__CC_34_localSearch.class);
		classes.put("HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_44_localSearch", HospitaltoAdministrationRule_h_reception_outgoing_SRC__FILTER_NAC_SRC_44_localSearch.class);
		classes.put("HospitaltoAdministrationRule__CC_50_nacjunction", GenericNACJunctionActor.class);
		classes.put("HospitaltoAdministrationRule__CC_48_junction", GenericJunctionActor.class);
		classes.put("NurseShiftplanRule__CC_54_localSearch", NurseShiftplanRule__CC_54_localSearch.class);
		classes.put("NurseToRoomRule__CC_64_localSearch", NurseToRoomRule__CC_64_localSearch.class);
		classes.put("NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_73_localSearch", NurseToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_73_localSearch.class);
		classes.put("NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_77_localSearch", NurseToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_77_localSearch.class);
		classes.put("NurseToStaffRule__CC_81_localSearch", NurseToStaffRule__CC_81_localSearch.class);
		classes.put("PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_90_localSearch", PatientInReception_p1_lies_incoming_SRC__FILTER_NAC_SRC_90_localSearch.class);
		classes.put("PatientInReception__CC_93_localSearch", PatientInReception__CC_93_localSearch.class);
		classes.put("PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_100_localSearch", PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_100_localSearch.class);
		classes.put("PatientInRoom__CC_103_localSearch", PatientInRoom__CC_103_localSearch.class);
		classes.put("RoomRule__CC_111_localSearch", RoomRule__CC_111_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("Hospital_reception_0_reference",Hospital_reception_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("HospitalToAdministration_object",HospitalToAdministration_object.class);
		classes.put("Doctor_object",Doctor_object.class);
		classes.put("PatientToPatient_object",PatientToPatient_object.class);
		classes.put("StaffToStaff_object",StaffToStaff_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("Reception_object",Reception_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Hospital_object_SP0",Hospital_object_SP0.class);
		classes.put("Hospital_object_SP1",Hospital_object_SP1.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("Administration_object_SP0",Administration_object_SP0.class);
		classes.put("Administration_object_SP1",Administration_object_SP1.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("Staff_object_SP2",Staff_object_SP2.class);
		classes.put("Shift_object_SP0",Shift_object_SP0.class);
		classes.put("Shift_object_SP1",Shift_object_SP1.class);
		classes.put("Shiftplan_object_SP0",Shiftplan_object_SP0.class);
		classes.put("Shiftplan_object_SP1",Shiftplan_object_SP1.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("Hospital_reception_0_reference", new InitGenReferenceActor<HospitalExample.Hospital,HospitalExample.Reception>(name2actor, name2node.get("Hospital_reception_0_reference"), (o) -> o instanceof HospitalExample.Hospital, (o) -> o.getReception(), null, false, prodUtil, incUtil));
	}
}

class HospitalToAdministration_object extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class Doctor_object extends GenericObjectActor<HospitalExample.Doctor> { }
class PatientToPatient_object extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class StaffToStaff_object extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class Reception_object extends GenericObjectActor<HospitalExample.Reception> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Hospital_object_SP0 extends GenericObjectActor<HospitalExample.Hospital> { }
class Hospital_object_SP1 extends GenericObjectActor<HospitalExample.Hospital> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class Administration_object_SP0 extends GenericObjectActor<AdministrationExample.Administration> { }
class Administration_object_SP1 extends GenericObjectActor<AdministrationExample.Administration> { }
class Staff_object_SP0 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP1 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP2 extends GenericObjectActor<AdministrationExample.Staff> { }
class Shift_object_SP0 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shift_object_SP1 extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object_SP0 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Shiftplan_object_SP1 extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }

class Hospital_reception_0_reference extends GenericReferenceActor<HospitalExample.Hospital, HospitalExample.Reception> { }

