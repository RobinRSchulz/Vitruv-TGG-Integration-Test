package Hospital2AdministrationSolutions.modelgen.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.NotificationActor;
import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.DispatchActor;
import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.localsearch.DoctorShiftplanRule__GEN_10_localSearch;
import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.localsearch.DoctorToPatient__GEN_19_localSearch;
import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.localsearch.NurseShiftplanRule__GEN_28_localSearch;
import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.localsearch.NurseToRoomRule__GEN_38_localSearch;
import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.localsearch.PatientInReception__GEN_55_localSearch;
import Hospital2AdministrationSolutions.modelgen.hipe.engine.actor.localsearch.PatientInRoom__GEN_60_localSearch;

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
		classes.put("DepartmentRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DepartmentRule__GEN_production", "DepartmentRule__GEN");
		classes.put("DocToStaffRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DocToStaffRule__GEN_production", "DocToStaffRule__GEN");
		classes.put("DoctorShiftplanRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__GEN_production", "DoctorShiftplanRule__GEN");
		classes.put("DoctorToPatient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__GEN_production", "DoctorToPatient__GEN");
		classes.put("NurseShiftplanRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__GEN_production", "NurseShiftplanRule__GEN");
		classes.put("NurseToRoomRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__GEN_production", "NurseToRoomRule__GEN");
		classes.put("NurseToStaffRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToStaffRule__GEN_production", "NurseToStaffRule__GEN");
		classes.put("PatientInReception__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInReception__GEN_production", "PatientInReception__GEN");
		classes.put("PatientInRoom__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__GEN_production", "PatientInRoom__GEN");
		classes.put("RoomRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("RoomRule__GEN_production", "RoomRule__GEN");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DocToStaffRule__GEN_4_junction", GenericJunctionActor.class);
		classes.put("DocToStaffRule__GEN_2_junction", GenericJunctionActor.class);
		classes.put("DoctorShiftplanRule__GEN_10_localSearch", DoctorShiftplanRule__GEN_10_localSearch.class);
		classes.put("DoctorToPatient__GEN_19_localSearch", DoctorToPatient__GEN_19_localSearch.class);
		classes.put("NurseShiftplanRule__GEN_28_localSearch", NurseShiftplanRule__GEN_28_localSearch.class);
		classes.put("NurseToRoomRule__GEN_38_localSearch", NurseToRoomRule__GEN_38_localSearch.class);
		classes.put("NurseToStaffRule__GEN_49_junction", GenericJunctionActor.class);
		classes.put("NurseToStaffRule__GEN_47_junction", GenericJunctionActor.class);
		classes.put("PatientInReception__GEN_55_localSearch", PatientInReception__GEN_55_localSearch.class);
		classes.put("PatientInRoom__GEN_60_localSearch", PatientInRoom__GEN_60_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("HospitalToAdministration_source_0_reference",HospitalToAdministration_source_0_reference.class);
		classes.put("HospitalToAdministration_target_0_reference",HospitalToAdministration_target_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Hospital_object",Hospital_object.class);
		classes.put("HospitalToAdministration_object",HospitalToAdministration_object.class);
		classes.put("Administration_object",Administration_object.class);
		classes.put("Patient_object",Patient_object.class);
		classes.put("Patient_1_object",Patient_1_object.class);
		classes.put("PatientToPatient_object",PatientToPatient_object.class);
		classes.put("Doctor_object",Doctor_object.class);
		classes.put("Staff_object",Staff_object.class);
		classes.put("StaffToStaff_object",StaffToStaff_object.class);
		classes.put("Shift_object",Shift_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("Room_object",Room_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Reception_object",Reception_object.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("HospitalToAdministration_source_0_reference", new InitGenReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration,HospitalExample.Hospital>(name2actor, name2node.get("HospitalToAdministration_source_0_reference"), (o) -> o instanceof Hospital2AdministrationSolutions.HospitalToAdministration, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("HospitalToAdministration_target_0_reference", new InitGenReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration,AdministrationExample.Administration>(name2actor, name2node.get("HospitalToAdministration_target_0_reference"), (o) -> o instanceof Hospital2AdministrationSolutions.HospitalToAdministration, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
	}
}

class Hospital_object extends GenericObjectActor<HospitalExample.Hospital> { }
class HospitalToAdministration_object extends GenericObjectActor<Hospital2AdministrationSolutions.HospitalToAdministration> { }
class Administration_object extends GenericObjectActor<AdministrationExample.Administration> { }
class Patient_object extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object extends GenericObjectActor<AdministrationExample.Patient> { }
class PatientToPatient_object extends GenericObjectActor<Hospital2AdministrationSolutions.PatientToPatient> { }
class Doctor_object extends GenericObjectActor<HospitalExample.Doctor> { }
class Staff_object extends GenericObjectActor<AdministrationExample.Staff> { }
class StaffToStaff_object extends GenericObjectActor<Hospital2AdministrationSolutions.StaffToStaff> { }
class Shift_object extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Room_object extends GenericObjectActor<HospitalExample.Room> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Reception_object extends GenericObjectActor<HospitalExample.Reception> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }

class HospitalToAdministration_source_0_reference extends GenericReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration, HospitalExample.Hospital> { }
class HospitalToAdministration_target_0_reference extends GenericReferenceActor<Hospital2AdministrationSolutions.HospitalToAdministration, AdministrationExample.Administration> { }

