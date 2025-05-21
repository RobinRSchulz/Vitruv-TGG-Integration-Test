package Hospital2Administration.integrate.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Hospital2Administration.integrate.hipe.engine.actor.NotificationActor;
import Hospital2Administration.integrate.hipe.engine.actor.DispatchActor;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__TRG_1_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__BWD_6_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__CC_11_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorShiftplanRule__CONSISTENCY_20_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_22_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorToPatient__TRG_26_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorToPatient__BWD_30_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorToPatient__CC_37_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorToPatient__SRC_47_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorToPatient__FWD_52_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.DoctorToPatient__CONSISTENCY_57_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__TRG_59_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__BWD_64_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__CC_70_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseShiftplanRule__CONSISTENCY_80_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__CC_82_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__SRC_91_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__FWD_96_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.NurseToRoomRule__CONSISTENCY_101_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.PatientInRoom__TRG_103_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.PatientInRoom__BWD_106_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.PatientInRoom__CC_111_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.PatientInRoom__SRC_119_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.PatientInRoom__FWD_124_localSearch;
import Hospital2Administration.integrate.hipe.engine.actor.localsearch.PatientInRoom__CONSISTENCY_127_localSearch;

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
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DoctorShiftplanRule__TRG_1_localSearch", DoctorShiftplanRule__TRG_1_localSearch.class);
		classes.put("DoctorShiftplanRule__BWD_6_localSearch", DoctorShiftplanRule__BWD_6_localSearch.class);
		classes.put("DoctorShiftplanRule__CC_11_localSearch", DoctorShiftplanRule__CC_11_localSearch.class);
		classes.put("DoctorShiftplanRule__CONSISTENCY_20_localSearch", DoctorShiftplanRule__CONSISTENCY_20_localSearch.class);
		classes.put("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_22_localSearch", DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_22_localSearch.class);
		classes.put("DoctorToPatient__TRG_26_localSearch", DoctorToPatient__TRG_26_localSearch.class);
		classes.put("DoctorToPatient__BWD_30_localSearch", DoctorToPatient__BWD_30_localSearch.class);
		classes.put("DoctorToPatient__CC_37_localSearch", DoctorToPatient__CC_37_localSearch.class);
		classes.put("DoctorToPatient__SRC_47_localSearch", DoctorToPatient__SRC_47_localSearch.class);
		classes.put("DoctorToPatient__FWD_52_localSearch", DoctorToPatient__FWD_52_localSearch.class);
		classes.put("DoctorToPatient__CONSISTENCY_57_localSearch", DoctorToPatient__CONSISTENCY_57_localSearch.class);
		classes.put("NurseShiftplanRule__TRG_59_localSearch", NurseShiftplanRule__TRG_59_localSearch.class);
		classes.put("NurseShiftplanRule__BWD_64_localSearch", NurseShiftplanRule__BWD_64_localSearch.class);
		classes.put("NurseShiftplanRule__CC_70_localSearch", NurseShiftplanRule__CC_70_localSearch.class);
		classes.put("NurseShiftplanRule__CONSISTENCY_80_localSearch", NurseShiftplanRule__CONSISTENCY_80_localSearch.class);
		classes.put("NurseToRoomRule__CC_82_localSearch", NurseToRoomRule__CC_82_localSearch.class);
		classes.put("NurseToRoomRule__SRC_91_localSearch", NurseToRoomRule__SRC_91_localSearch.class);
		classes.put("NurseToRoomRule__FWD_96_localSearch", NurseToRoomRule__FWD_96_localSearch.class);
		classes.put("NurseToRoomRule__CONSISTENCY_101_localSearch", NurseToRoomRule__CONSISTENCY_101_localSearch.class);
		classes.put("PatientInRoom__TRG_103_localSearch", PatientInRoom__TRG_103_localSearch.class);
		classes.put("PatientInRoom__BWD_106_localSearch", PatientInRoom__BWD_106_localSearch.class);
		classes.put("PatientInRoom__CC_111_localSearch", PatientInRoom__CC_111_localSearch.class);
		classes.put("PatientInRoom__SRC_119_localSearch", PatientInRoom__SRC_119_localSearch.class);
		classes.put("PatientInRoom__FWD_124_localSearch", PatientInRoom__FWD_124_localSearch.class);
		classes.put("PatientInRoom__CONSISTENCY_127_localSearch", PatientInRoom__CONSISTENCY_127_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Shift_object",Shift_object.class);
		classes.put("Shiftplan_object",Shiftplan_object.class);
		classes.put("DoctorShiftplanRule__Marker_object",DoctorShiftplanRule__Marker_object.class);
		classes.put("Treatment_object",Treatment_object.class);
		classes.put("DoctorToPatient__Marker_object",DoctorToPatient__Marker_object.class);
		classes.put("Nurse_object",Nurse_object.class);
		classes.put("NurseShiftplanRule__Marker_object",NurseShiftplanRule__Marker_object.class);
		classes.put("NurseToRoomRule__Marker_object",NurseToRoomRule__Marker_object.class);
		classes.put("Hospital_object",Hospital_object.class);
		classes.put("HospitalToAdministration_object",HospitalToAdministration_object.class);
		classes.put("Administration_object",Administration_object.class);
		classes.put("PatientInRoom__Marker_object",PatientInRoom__Marker_object.class);
		classes.put("Patient_object_SP0",Patient_object_SP0.class);
		classes.put("Patient_object_SP1",Patient_object_SP1.class);
		classes.put("Patient_object_SP2",Patient_object_SP2.class);
		classes.put("PatientToPatient_object_SP0",PatientToPatient_object_SP0.class);
		classes.put("PatientToPatient_object_SP1",PatientToPatient_object_SP1.class);
		classes.put("PatientToPatient_object_SP2",PatientToPatient_object_SP2.class);
		classes.put("Doctor_object_SP0",Doctor_object_SP0.class);
		classes.put("Doctor_object_SP1",Doctor_object_SP1.class);
		classes.put("StaffToStaff_object_SP0",StaffToStaff_object_SP0.class);
		classes.put("StaffToStaff_object_SP1",StaffToStaff_object_SP1.class);
		classes.put("StaffToStaff_object_SP2",StaffToStaff_object_SP2.class);
		classes.put("Patient_1_object_SP0",Patient_1_object_SP0.class);
		classes.put("Patient_1_object_SP1",Patient_1_object_SP1.class);
		classes.put("Patient_1_object_SP2",Patient_1_object_SP2.class);
		classes.put("Staff_object_SP0",Staff_object_SP0.class);
		classes.put("Staff_object_SP1",Staff_object_SP1.class);
		classes.put("Staff_object_SP2",Staff_object_SP2.class);
		classes.put("Department_object_SP0",Department_object_SP0.class);
		classes.put("Department_object_SP1",Department_object_SP1.class);
		classes.put("Room_object_SP0",Room_object_SP0.class);
		classes.put("Room_object_SP1",Room_object_SP1.class);
		classes.put("Room_object_SP2",Room_object_SP2.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class Shift_object extends GenericObjectActor<AdministrationExample.Shift> { }
class Shiftplan_object extends GenericObjectActor<AdministrationExample.Shiftplan> { }
class DoctorShiftplanRule__Marker_object extends GenericObjectActor<Hospital2Administration.DoctorShiftplanRule__Marker> { }
class Treatment_object extends GenericObjectActor<AdministrationExample.Treatment> { }
class DoctorToPatient__Marker_object extends GenericObjectActor<Hospital2Administration.DoctorToPatient__Marker> { }
class Nurse_object extends GenericObjectActor<HospitalExample.Nurse> { }
class NurseShiftplanRule__Marker_object extends GenericObjectActor<Hospital2Administration.NurseShiftplanRule__Marker> { }
class NurseToRoomRule__Marker_object extends GenericObjectActor<Hospital2Administration.NurseToRoomRule__Marker> { }
class Hospital_object extends GenericObjectActor<HospitalExample.Hospital> { }
class HospitalToAdministration_object extends GenericObjectActor<Hospital2Administration.HospitalToAdministration> { }
class Administration_object extends GenericObjectActor<AdministrationExample.Administration> { }
class PatientInRoom__Marker_object extends GenericObjectActor<Hospital2Administration.PatientInRoom__Marker> { }
class Patient_object_SP0 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP1 extends GenericObjectActor<HospitalExample.Patient> { }
class Patient_object_SP2 extends GenericObjectActor<HospitalExample.Patient> { }
class PatientToPatient_object_SP0 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class PatientToPatient_object_SP1 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class PatientToPatient_object_SP2 extends GenericObjectActor<Hospital2Administration.PatientToPatient> { }
class Doctor_object_SP0 extends GenericObjectActor<HospitalExample.Doctor> { }
class Doctor_object_SP1 extends GenericObjectActor<HospitalExample.Doctor> { }
class StaffToStaff_object_SP0 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class StaffToStaff_object_SP1 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class StaffToStaff_object_SP2 extends GenericObjectActor<Hospital2Administration.StaffToStaff> { }
class Patient_1_object_SP0 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP1 extends GenericObjectActor<AdministrationExample.Patient> { }
class Patient_1_object_SP2 extends GenericObjectActor<AdministrationExample.Patient> { }
class Staff_object_SP0 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP1 extends GenericObjectActor<AdministrationExample.Staff> { }
class Staff_object_SP2 extends GenericObjectActor<AdministrationExample.Staff> { }
class Department_object_SP0 extends GenericObjectActor<HospitalExample.Department> { }
class Department_object_SP1 extends GenericObjectActor<HospitalExample.Department> { }
class Room_object_SP0 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP1 extends GenericObjectActor<HospitalExample.Room> { }
class Room_object_SP2 extends GenericObjectActor<HospitalExample.Room> { }


