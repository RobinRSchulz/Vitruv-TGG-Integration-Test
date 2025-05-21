package Hospital2Administration.modelgen.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2Administration.modelgen.hipe.engine.actor.NotificationActor;
import Hospital2Administration.modelgen.hipe.engine.actor.DispatchActor;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.DoctorShiftplanRule__GEN_1_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.DoctorToPatient__GEN_10_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.NurseShiftplanRule__GEN_19_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.NurseToRoomRule__GEN_29_localSearch;
import Hospital2Administration.modelgen.hipe.engine.actor.localsearch.PatientInRoom__GEN_38_localSearch;

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
		classes.put("DoctorShiftplanRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__GEN_production", "DoctorShiftplanRule__GEN");
		classes.put("DoctorToPatient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__GEN_production", "DoctorToPatient__GEN");
		classes.put("NurseShiftplanRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__GEN_production", "NurseShiftplanRule__GEN");
		classes.put("NurseToRoomRule__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__GEN_production", "NurseToRoomRule__GEN");
		classes.put("PatientInRoom__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__GEN_production", "PatientInRoom__GEN");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DoctorShiftplanRule__GEN_1_localSearch", DoctorShiftplanRule__GEN_1_localSearch.class);
		classes.put("DoctorToPatient__GEN_10_localSearch", DoctorToPatient__GEN_10_localSearch.class);
		classes.put("NurseShiftplanRule__GEN_19_localSearch", NurseShiftplanRule__GEN_19_localSearch.class);
		classes.put("NurseToRoomRule__GEN_29_localSearch", NurseToRoomRule__GEN_29_localSearch.class);
		classes.put("PatientInRoom__GEN_38_localSearch", PatientInRoom__GEN_38_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Patient_object",Patient_object.class);
		classes.put("Patient_1_object",Patient_1_object.class);
		classes.put("PatientToPatient_object",PatientToPatient_object.class);
		classes.put("Doctor_object",Doctor_object.class);
		classes.put("Staff_object",Staff_object.class);
		classes.put("StaffToStaff_object",StaffToStaff_object.class);
		classes.put("Shift_object",Shift_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("Department_object",Department_object.class);
		classes.put("Room_object",Room_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Hospital_object",Hospital_object.class);
		classes.put("HospitalToAdministration_object",HospitalToAdministration_object.class);
		classes.put("Administration_object",Administration_object.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class Patient_object extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object extends GenericObjectActor<AdministrationExample.Patient> { }
class PatientToPatient_object extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class Doctor_object extends GenericObjectActor<HospitalExample.Doctor> { }
class Staff_object extends GenericObjectActor<AdministrationExample.Staff> { }
class StaffToStaff_object extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class Shift_object extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Department_object extends GenericObjectActor<HospitalExample.Department> { }
class Room_object extends GenericObjectActor<HospitalExample.Room> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Hospital_object extends GenericObjectActor<HospitalExample.Hospital> { }
class HospitalToAdministration_object extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class Administration_object extends GenericObjectActor<AdministrationExample.Administration> { }


