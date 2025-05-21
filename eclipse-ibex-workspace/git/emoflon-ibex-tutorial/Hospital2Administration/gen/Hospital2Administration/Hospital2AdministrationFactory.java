package Hospital2Administration;

import Hospital2Administration.HospitalToAdministration;
import Hospital2Administration.StaffToStaff;
import Hospital2Administration.PatientToPatient;
import Hospital2Administration.RoomToShiftplan;
import Hospital2Administration.DoctorToStaff;
import Hospital2Administration.NurseToStaff;
import Hospital2Administration.DoctorShiftplanRule__Marker;
import Hospital2Administration.DoctorToPatient__Marker;
import Hospital2Administration.NurseShiftplanRule__Marker;
import Hospital2Administration.NurseToRoomRule__Marker;
import Hospital2Administration.PatientInRoom__Marker;

import org.eclipse.emf.ecore.EFactory;

public interface Hospital2AdministrationFactory extends EFactory {

	Hospital2AdministrationFactory eINSTANCE = Hospital2Administration.impl.Hospital2AdministrationFactoryImpl.init();
	
	HospitalToAdministration createHospitalToAdministration();
	
	StaffToStaff createStaffToStaff();
	
	PatientToPatient createPatientToPatient();
	
	RoomToShiftplan createRoomToShiftplan();
	
	DoctorToStaff createDoctorToStaff();
	
	NurseToStaff createNurseToStaff();
	
	DoctorShiftplanRule__Marker createDoctorShiftplanRule__Marker();
	
	DoctorToPatient__Marker createDoctorToPatient__Marker();
	
	NurseShiftplanRule__Marker createNurseShiftplanRule__Marker();
	
	NurseToRoomRule__Marker createNurseToRoomRule__Marker();
	
	PatientInRoom__Marker createPatientInRoom__Marker();
	
	
	Hospital2AdministrationPackage getHospital2AdministrationPackage();

}
