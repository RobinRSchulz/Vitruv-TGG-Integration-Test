package Hospital2Administration.cc.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2Administration.cc.hipe.engine.actor.NotificationActor;
import Hospital2Administration.cc.hipe.engine.actor.DispatchActor;
import Hospital2Administration.cc.hipe.engine.actor.localsearch.DoctorShiftplanRule__CC_1_localSearch;
import Hospital2Administration.cc.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_10_localSearch;
import Hospital2Administration.cc.hipe.engine.actor.localsearch.DoctorToPatient__CC_14_localSearch;
import Hospital2Administration.cc.hipe.engine.actor.localsearch.NurseShiftplanRule__CC_24_localSearch;
import Hospital2Administration.cc.hipe.engine.actor.localsearch.NurseToRoomRule__CC_34_localSearch;
import Hospital2Administration.cc.hipe.engine.actor.localsearch.PatientInRoom__CC_43_localSearch;

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
		classes.put("DoctorShiftplanRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorShiftplanRule__CC_production", "DoctorShiftplanRule__CC");
		classes.put("DoctorToPatient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient__CC_production", "DoctorToPatient__CC");
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_production", "DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG");
		classes.put("NurseShiftplanRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseShiftplanRule__CC_production", "NurseShiftplanRule__CC");
		classes.put("NurseToRoomRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("NurseToRoomRule__CC_production", "NurseToRoomRule__CC");
		classes.put("PatientInRoom__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PatientInRoom__CC_production", "PatientInRoom__CC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DoctorShiftplanRule__CC_1_localSearch", DoctorShiftplanRule__CC_1_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_10_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_10_localSearch.class);
		classes.put("DoctorToPatient__CC_14_localSearch", DoctorToPatient__CC_14_localSearch.class);
		classes.put("NurseShiftplanRule__CC_24_localSearch", NurseShiftplanRule__CC_24_localSearch.class);
		classes.put("NurseToRoomRule__CC_34_localSearch", NurseToRoomRule__CC_34_localSearch.class);
		classes.put("PatientInRoom__CC_43_localSearch", PatientInRoom__CC_43_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("PatientToPatient_object",PatientToPatient_object.class);
		classes.put("Doctor_object",Doctor_object.class);
		classes.put("StaffToStaff_object",StaffToStaff_object.class);
		classes.put("Shift_object",Shift_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("Department_object",Department_object.class);
		classes.put("Room_object",Room_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("Hospital_object",Hospital_object.class);
		classes.put("HospitalToAdministration_object",HospitalToAdministration_object.class);
		classes.put("Administration_object",Administration_object.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class PatientToPatient_object extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class Doctor_object extends GenericObjectActor<HospitalExample.Doctor> { }
class StaffToStaff_object extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class Shift_object extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class Department_object extends GenericObjectActor<HospitalExample.Department> { }
class Room_object extends GenericObjectActor<HospitalExample.Room> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class Hospital_object extends GenericObjectActor<HospitalExample.Hospital> { }
class HospitalToAdministration_object extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class Administration_object extends GenericObjectActor<AdministrationExample.Administration> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class Staff_object_SP0 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP1 extends GenericObjectActor<AdministrationExample.Staff> { }


