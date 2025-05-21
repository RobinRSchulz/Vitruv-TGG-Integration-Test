package Hospital2Administration;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EEnum;


import org.emoflon.smartemf.runtime.SmartPackage;

public interface Hospital2AdministrationPackage extends SmartPackage {

	String eNAME = "Hospital2Administration";
	String eNS_URI = "platform:/resource/Hospital2Administration/model/Hospital2Administration.ecore";
	String eNS_PREFIX = "Hospital2Administration";

	Hospital2AdministrationPackage eINSTANCE = Hospital2Administration.impl.Hospital2AdministrationPackageImpl.init();

	int HOSPITAL_TO_ADMINISTRATION = 0;
	int HOSPITAL_TO_ADMINISTRATION__SOURCE = 0;
	int HOSPITAL_TO_ADMINISTRATION__TARGET = 1;
	int HOSPITAL_TO_ADMINISTRATION_FEATURE_COUNT = 2;
	int HOSPITAL_TO_ADMINISTRATION_OPERATION_COUNT = 0;
	
	int STAFF_TO_STAFF = 1;
	int STAFF_TO_STAFF__SOURCE = 2;
	int STAFF_TO_STAFF__TARGET = 3;
	int STAFF_TO_STAFF_FEATURE_COUNT = 2;
	int STAFF_TO_STAFF_OPERATION_COUNT = 0;
	
	int PATIENT_TO_PATIENT = 2;
	int PATIENT_TO_PATIENT__SOURCE = 4;
	int PATIENT_TO_PATIENT__TARGET = 5;
	int PATIENT_TO_PATIENT_FEATURE_COUNT = 2;
	int PATIENT_TO_PATIENT_OPERATION_COUNT = 0;
	
	int ROOM_TO_SHIFTPLAN = 3;
	int ROOM_TO_SHIFTPLAN__SOURCE = 6;
	int ROOM_TO_SHIFTPLAN__TARGET = 7;
	int ROOM_TO_SHIFTPLAN_FEATURE_COUNT = 2;
	int ROOM_TO_SHIFTPLAN_OPERATION_COUNT = 0;
	
	int DOCTOR_TO_STAFF = 4;
	int DOCTOR_TO_STAFF__SOURCE = 8;
	int DOCTOR_TO_STAFF__TARGET = 9;
	int DOCTOR_TO_STAFF_FEATURE_COUNT = 2;
	int DOCTOR_TO_STAFF_OPERATION_COUNT = 0;
	
	int NURSE_TO_STAFF = 5;
	int NURSE_TO_STAFF__SOURCE = 10;
	int NURSE_TO_STAFF__TARGET = 11;
	int NURSE_TO_STAFF_FEATURE_COUNT = 2;
	int NURSE_TO_STAFF_OPERATION_COUNT = 0;
	
	int DOCTOR_SHIFTPLAN_RULE___MARKER = 6;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = 12;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = 13;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = 14;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = 15;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = 16;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = 17;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = 18;
	int DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = 19;
	int DOCTOR_SHIFTPLAN_RULE___MARKER_FEATURE_COUNT = 9;
	int DOCTOR_SHIFTPLAN_RULE___MARKER_OPERATION_COUNT = 0;
	
	int DOCTOR_TO_PATIENT___MARKER = 7;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__D = 20;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__DEP = 21;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__P1 = 22;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__RO = 23;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__P2 = 24;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__S = 25;
	int DOCTOR_TO_PATIENT___MARKER__CREAT_E__TR_G__T = 26;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__D_TOS = 27;
	int DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__P_TOP = 28;
	int DOCTOR_TO_PATIENT___MARKER_FEATURE_COUNT = 10;
	int DOCTOR_TO_PATIENT___MARKER_OPERATION_COUNT = 0;
	
	int NURSE_SHIFTPLAN_RULE___MARKER = 8;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = 29;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO = 30;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = 31;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = 32;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = 33;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = 34;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = 35;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = 36;
	int NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = 37;
	int NURSE_SHIFTPLAN_RULE___MARKER_FEATURE_COUNT = 10;
	int NURSE_SHIFTPLAN_RULE___MARKER_OPERATION_COUNT = 0;
	
	int NURSE_TO_ROOM_RULE___MARKER = 9;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP = 38;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N = 39;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1 = 40;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R = 41;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2 = 42;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S = 43;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS = 44;
	int NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP = 45;
	int NURSE_TO_ROOM_RULE___MARKER_FEATURE_COUNT = 9;
	int NURSE_TO_ROOM_RULE___MARKER_OPERATION_COUNT = 0;
	
	int PATIENT_IN_ROOM___MARKER = 10;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D = 46;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H = 47;
	int PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1 = 48;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO = 49;
	int PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2 = 50;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V = 51;
	int PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV = 52;
	int PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP = 53;
	int PATIENT_IN_ROOM___MARKER_FEATURE_COUNT = 9;
	int PATIENT_IN_ROOM___MARKER_OPERATION_COUNT = 0;
	
	

	EClass getHospitalToAdministration();
	EReference getHospitalToAdministration_Source();
	EReference getHospitalToAdministration_Target();
	
	EClass getStaffToStaff();
	EReference getStaffToStaff_Source();
	EReference getStaffToStaff_Target();
	
	EClass getPatientToPatient();
	EReference getPatientToPatient_Source();
	EReference getPatientToPatient_Target();
	
	EClass getRoomToShiftplan();
	EReference getRoomToShiftplan_Source();
	EReference getRoomToShiftplan_Target();
	
	EClass getDoctorToStaff();
	EReference getDoctorToStaff_Source();
	EReference getDoctorToStaff_Target();
	
	EClass getNurseToStaff();
	EReference getNurseToStaff_Source();
	EReference getNurseToStaff_Target();
	
	EClass getDoctorShiftplanRule__Marker();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP();
	EReference getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS();
	
	EClass getDoctorToPatient__Marker();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__d();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__dep();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__p1();
	EReference getDoctorToPatient__Marker_CONTEXT__SRC__ro();
	EReference getDoctorToPatient__Marker_CONTEXT__TRG__p2();
	EReference getDoctorToPatient__Marker_CONTEXT__TRG__s();
	EReference getDoctorToPatient__Marker_CREATE__TRG__t();
	EReference getDoctorToPatient__Marker_CONTEXT__CORR__dToS();
	EReference getDoctorToPatient__Marker_CONTEXT__CORR__pToP();
	
	EClass getNurseShiftplanRule__Marker();
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__p1();
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__ro();
	EReference getNurseShiftplanRule__Marker_CONTEXT__SRC__s1();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__p2();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__s2();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sh();
	EReference getNurseShiftplanRule__Marker_CONTEXT__TRG__sp();
	EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP();
	EReference getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS();
	
	EClass getNurseToRoomRule__Marker();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__dep();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__n();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__p1();
	EReference getNurseToRoomRule__Marker_CONTEXT__SRC__r();
	EReference getNurseToRoomRule__Marker_CONTEXT__TRG__p2();
	EReference getNurseToRoomRule__Marker_CONTEXT__TRG__s();
	EReference getNurseToRoomRule__Marker_CONTEXT__CORR__nToS();
	EReference getNurseToRoomRule__Marker_CONTEXT__CORR__pTop();
	
	EClass getPatientInRoom__Marker();
	EReference getPatientInRoom__Marker_CONTEXT__SRC__d();
	EReference getPatientInRoom__Marker_CONTEXT__SRC__h();
	EReference getPatientInRoom__Marker_CREATE__SRC__p1();
	EReference getPatientInRoom__Marker_CONTEXT__SRC__ro();
	EReference getPatientInRoom__Marker_CREATE__TRG__p2();
	EReference getPatientInRoom__Marker_CONTEXT__TRG__v();
	EReference getPatientInRoom__Marker_CONTEXT__CORR__htov();
	EReference getPatientInRoom__Marker_CREATE__CORR__pTop();
	
	
	Hospital2Administration.Hospital2AdministrationFactory getHospital2AdministrationFactory();

	interface Literals {
		
		EClass HOSPITAL_TO_ADMINISTRATION = eINSTANCE.getHospitalToAdministration();
		
		EReference HOSPITAL_TO_ADMINISTRATION__SOURCE = eINSTANCE.getHospitalToAdministration_Source();
		
		EReference HOSPITAL_TO_ADMINISTRATION__TARGET = eINSTANCE.getHospitalToAdministration_Target();
		
		EClass STAFF_TO_STAFF = eINSTANCE.getStaffToStaff();
		
		EReference STAFF_TO_STAFF__SOURCE = eINSTANCE.getStaffToStaff_Source();
		
		EReference STAFF_TO_STAFF__TARGET = eINSTANCE.getStaffToStaff_Target();
		
		EClass PATIENT_TO_PATIENT = eINSTANCE.getPatientToPatient();
		
		EReference PATIENT_TO_PATIENT__SOURCE = eINSTANCE.getPatientToPatient_Source();
		
		EReference PATIENT_TO_PATIENT__TARGET = eINSTANCE.getPatientToPatient_Target();
		
		EClass ROOM_TO_SHIFTPLAN = eINSTANCE.getRoomToShiftplan();
		
		EReference ROOM_TO_SHIFTPLAN__SOURCE = eINSTANCE.getRoomToShiftplan_Source();
		
		EReference ROOM_TO_SHIFTPLAN__TARGET = eINSTANCE.getRoomToShiftplan_Target();
		
		EClass DOCTOR_TO_STAFF = eINSTANCE.getDoctorToStaff();
		
		EReference DOCTOR_TO_STAFF__SOURCE = eINSTANCE.getDoctorToStaff_Source();
		
		EReference DOCTOR_TO_STAFF__TARGET = eINSTANCE.getDoctorToStaff_Target();
		
		EClass NURSE_TO_STAFF = eINSTANCE.getNurseToStaff();
		
		EReference NURSE_TO_STAFF__SOURCE = eINSTANCE.getNurseToStaff_Source();
		
		EReference NURSE_TO_STAFF__TARGET = eINSTANCE.getNurseToStaff_Target();
		
		EClass DOCTOR_SHIFTPLAN_RULE___MARKER = eINSTANCE.getDoctorShiftplanRule__Marker();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__SRC__p1();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__SRC__s1();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__p2();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__s2();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__sh();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__TRG__sp();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__CORR__pToP();
		
		EReference DOCTOR_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = eINSTANCE.getDoctorShiftplanRule__Marker_CONTEXT__CORR__sToS();
		
		EClass DOCTOR_TO_PATIENT___MARKER = eINSTANCE.getDoctorToPatient__Marker();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__D = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__d();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__DEP = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__dep();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__p1();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__SR_C__RO = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__SRC__ro();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__TRG__p2();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__TR_G__S = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__TRG__s();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CREAT_E__TR_G__T = eINSTANCE.getDoctorToPatient__Marker_CREATE__TRG__t();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__D_TOS = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__CORR__dToS();
		
		EReference DOCTOR_TO_PATIENT___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getDoctorToPatient__Marker_CONTEXT__CORR__pToP();
		
		EClass NURSE_SHIFTPLAN_RULE___MARKER = eINSTANCE.getNurseShiftplanRule__Marker();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__p1();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__RO = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__ro();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__SR_C__S1 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__SRC__s1();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__p2();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__S2 = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__s2();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SH = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__sh();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__TR_G__SP = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__TRG__sp();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP();
		
		EReference NURSE_SHIFTPLAN_RULE___MARKER__CONTEX_T__COR_R__S_TOS = eINSTANCE.getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS();
		
		EClass NURSE_TO_ROOM_RULE___MARKER = eINSTANCE.getNurseToRoomRule__Marker();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__DEP = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__dep();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__N = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__n();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__P1 = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__p1();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__SR_C__R = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__SRC__r();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__P2 = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__TRG__p2();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__TR_G__S = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__TRG__s();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__N_TOS = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__CORR__nToS();
		
		EReference NURSE_TO_ROOM_RULE___MARKER__CONTEX_T__COR_R__P_TOP = eINSTANCE.getNurseToRoomRule__Marker_CONTEXT__CORR__pTop();
		
		EClass PATIENT_IN_ROOM___MARKER = eINSTANCE.getPatientInRoom__Marker();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__d();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__h();
		
		EReference PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1 = eINSTANCE.getPatientInRoom__Marker_CREATE__SRC__p1();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO = eINSTANCE.getPatientInRoom__Marker_CONTEXT__SRC__ro();
		
		EReference PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2 = eINSTANCE.getPatientInRoom__Marker_CREATE__TRG__p2();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V = eINSTANCE.getPatientInRoom__Marker_CONTEXT__TRG__v();
		
		EReference PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV = eINSTANCE.getPatientInRoom__Marker_CONTEXT__CORR__htov();
		
		EReference PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP = eINSTANCE.getPatientInRoom__Marker_CREATE__CORR__pTop();
		
		
		
		
	}

} 
