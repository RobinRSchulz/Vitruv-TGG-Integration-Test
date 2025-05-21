/**
 */
package HospitalExample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * TODO: Add documentation for HospitalExample. Hint: You may copy this element in the Ecore editor to add documentation to EClasses, EOperations, ...
 * <!-- end-model-doc -->
 * @see HospitalExample.HospitalExampleFactory
 * @model kind="package"
 * @generated
 */
public interface HospitalExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HospitalExample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/HospitalExample/model/HospitalExample.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HospitalExample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HospitalExamplePackage eINSTANCE = HospitalExample.impl.HospitalExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link HospitalExample.impl.HospitalImpl <em>Hospital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.HospitalImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getHospital()
	 * @generated
	 */
	int HOSPITAL = 0;

	/**
	 * The feature id for the '<em><b>Reception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__RECEPTION = 0;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__STAFF = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__DEPARTMENT = 2;

	/**
	 * The number of structural features of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HospitalExample.impl.ReceptionImpl <em>Reception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.ReceptionImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getReception()
	 * @generated
	 */
	int RECEPTION = 1;

	/**
	 * The feature id for the '<em><b>Waits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION__WAITS = 0;

	/**
	 * The number of structural features of the '<em>Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HospitalExample.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.StaffImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 2;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__STAFF_ID = 0;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__WORKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__NAME = 2;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HospitalExample.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.DoctorImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 3;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__STAFF_ID = STAFF__STAFF_ID;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__WORKS = STAFF__WORKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__NAME = STAFF__NAME;

	/**
	 * The feature id for the '<em><b>Caresfor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__CARESFOR = STAFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Patient Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PATIENT_CAPACITY = STAFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = STAFF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = STAFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HospitalExample.impl.NurseImpl <em>Nurse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.NurseImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getNurse()
	 * @generated
	 */
	int NURSE = 4;

	/**
	 * The feature id for the '<em><b>Staff ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__STAFF_ID = STAFF__STAFF_ID;

	/**
	 * The feature id for the '<em><b>Works</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__WORKS = STAFF__WORKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__NAME = STAFF__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE__RESPONSIBLE = STAFF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nurse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_FEATURE_COUNT = STAFF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nurse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSE_OPERATION_COUNT = STAFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HospitalExample.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.DepartmentImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__ROOMS = 0;

	/**
	 * The feature id for the '<em><b>DID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DID = 1;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STAFF = 2;

	/**
	 * The feature id for the '<em><b>Max Room Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__MAX_ROOM_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HospitalExample.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.PatientImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 6;

	/**
	 * The feature id for the '<em><b>Patient ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Doctor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DOCTOR = 3;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HospitalExample.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.impl.RoomImpl
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 7;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CAPACITY = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Lies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LIES = 2;

	/**
	 * The feature id for the '<em><b>Nurses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NURSES = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HospitalExample.Carelevel <em>Carelevel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HospitalExample.Carelevel
	 * @see HospitalExample.impl.HospitalExamplePackageImpl#getCarelevel()
	 * @generated
	 */
	int CARELEVEL = 8;


	/**
	 * Returns the meta object for class '{@link HospitalExample.Hospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital</em>'.
	 * @see HospitalExample.Hospital
	 * @generated
	 */
	EClass getHospital();

	/**
	 * Returns the meta object for the containment reference '{@link HospitalExample.Hospital#getReception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reception</em>'.
	 * @see HospitalExample.Hospital#getReception()
	 * @see #getHospital()
	 * @generated
	 */
	EReference getHospital_Reception();

	/**
	 * Returns the meta object for the containment reference list '{@link HospitalExample.Hospital#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see HospitalExample.Hospital#getStaff()
	 * @see #getHospital()
	 * @generated
	 */
	EReference getHospital_Staff();

	/**
	 * Returns the meta object for the containment reference list '{@link HospitalExample.Hospital#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see HospitalExample.Hospital#getDepartment()
	 * @see #getHospital()
	 * @generated
	 */
	EReference getHospital_Department();

	/**
	 * Returns the meta object for class '{@link HospitalExample.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reception</em>'.
	 * @see HospitalExample.Reception
	 * @generated
	 */
	EClass getReception();

	/**
	 * Returns the meta object for the containment reference list '{@link HospitalExample.Reception#getWaits <em>Waits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waits</em>'.
	 * @see HospitalExample.Reception#getWaits()
	 * @see #getReception()
	 * @generated
	 */
	EReference getReception_Waits();

	/**
	 * Returns the meta object for class '{@link HospitalExample.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see HospitalExample.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Staff#getStaffID <em>Staff ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff ID</em>'.
	 * @see HospitalExample.Staff#getStaffID()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_StaffID();

	/**
	 * Returns the meta object for the reference '{@link HospitalExample.Staff#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Works</em>'.
	 * @see HospitalExample.Staff#getWorks()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Works();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Staff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see HospitalExample.Staff#getName()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Name();

	/**
	 * Returns the meta object for class '{@link HospitalExample.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see HospitalExample.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the reference list '{@link HospitalExample.Doctor#getCaresfor <em>Caresfor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Caresfor</em>'.
	 * @see HospitalExample.Doctor#getCaresfor()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Caresfor();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Doctor#getPatientCapacity <em>Patient Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Capacity</em>'.
	 * @see HospitalExample.Doctor#getPatientCapacity()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_PatientCapacity();

	/**
	 * Returns the meta object for class '{@link HospitalExample.Nurse <em>Nurse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nurse</em>'.
	 * @see HospitalExample.Nurse
	 * @generated
	 */
	EClass getNurse();

	/**
	 * Returns the meta object for the reference '{@link HospitalExample.Nurse#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see HospitalExample.Nurse#getResponsible()
	 * @see #getNurse()
	 * @generated
	 */
	EReference getNurse_Responsible();

	/**
	 * Returns the meta object for class '{@link HospitalExample.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see HospitalExample.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link HospitalExample.Department#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see HospitalExample.Department#getRooms()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Department#getDID <em>DID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DID</em>'.
	 * @see HospitalExample.Department#getDID()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_DID();

	/**
	 * Returns the meta object for the reference list '{@link HospitalExample.Department#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff</em>'.
	 * @see HospitalExample.Department#getStaff()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Staff();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Department#getMaxRoomCount <em>Max Room Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Room Count</em>'.
	 * @see HospitalExample.Department#getMaxRoomCount()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_MaxRoomCount();

	/**
	 * Returns the meta object for class '{@link HospitalExample.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see HospitalExample.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Patient#getPatientID <em>Patient ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient ID</em>'.
	 * @see HospitalExample.Patient#getPatientID()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_PatientID();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Patient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see HospitalExample.Patient#getName()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Name();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Patient#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see HospitalExample.Patient#getLevel()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Level();

	/**
	 * Returns the meta object for the reference '{@link HospitalExample.Patient#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Doctor</em>'.
	 * @see HospitalExample.Patient#getDoctor()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Doctor();

	/**
	 * Returns the meta object for class '{@link HospitalExample.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see HospitalExample.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Room#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see HospitalExample.Room#getCapacity()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link HospitalExample.Room#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see HospitalExample.Room#getLevel()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link HospitalExample.Room#getLies <em>Lies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lies</em>'.
	 * @see HospitalExample.Room#getLies()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Lies();

	/**
	 * Returns the meta object for the reference list '{@link HospitalExample.Room#getNurses <em>Nurses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nurses</em>'.
	 * @see HospitalExample.Room#getNurses()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Nurses();

	/**
	 * Returns the meta object for enum '{@link HospitalExample.Carelevel <em>Carelevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Carelevel</em>'.
	 * @see HospitalExample.Carelevel
	 * @generated
	 */
	EEnum getCarelevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HospitalExampleFactory getHospitalExampleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link HospitalExample.impl.HospitalImpl <em>Hospital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.HospitalImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getHospital()
		 * @generated
		 */
		EClass HOSPITAL = eINSTANCE.getHospital();

		/**
		 * The meta object literal for the '<em><b>Reception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITAL__RECEPTION = eINSTANCE.getHospital_Reception();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITAL__STAFF = eINSTANCE.getHospital_Staff();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSPITAL__DEPARTMENT = eINSTANCE.getHospital_Department();

		/**
		 * The meta object literal for the '{@link HospitalExample.impl.ReceptionImpl <em>Reception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.ReceptionImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getReception()
		 * @generated
		 */
		EClass RECEPTION = eINSTANCE.getReception();

		/**
		 * The meta object literal for the '<em><b>Waits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTION__WAITS = eINSTANCE.getReception_Waits();

		/**
		 * The meta object literal for the '{@link HospitalExample.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.StaffImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Staff ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__STAFF_ID = eINSTANCE.getStaff_StaffID();

		/**
		 * The meta object literal for the '<em><b>Works</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__WORKS = eINSTANCE.getStaff_Works();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__NAME = eINSTANCE.getStaff_Name();

		/**
		 * The meta object literal for the '{@link HospitalExample.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.DoctorImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Caresfor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__CARESFOR = eINSTANCE.getDoctor_Caresfor();

		/**
		 * The meta object literal for the '<em><b>Patient Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__PATIENT_CAPACITY = eINSTANCE.getDoctor_PatientCapacity();

		/**
		 * The meta object literal for the '{@link HospitalExample.impl.NurseImpl <em>Nurse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.NurseImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getNurse()
		 * @generated
		 */
		EClass NURSE = eINSTANCE.getNurse();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSE__RESPONSIBLE = eINSTANCE.getNurse_Responsible();

		/**
		 * The meta object literal for the '{@link HospitalExample.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.DepartmentImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__ROOMS = eINSTANCE.getDepartment_Rooms();

		/**
		 * The meta object literal for the '<em><b>DID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__DID = eINSTANCE.getDepartment_DID();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STAFF = eINSTANCE.getDepartment_Staff();

		/**
		 * The meta object literal for the '<em><b>Max Room Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__MAX_ROOM_COUNT = eINSTANCE.getDepartment_MaxRoomCount();

		/**
		 * The meta object literal for the '{@link HospitalExample.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.PatientImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Patient ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_ID = eINSTANCE.getPatient_PatientID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__NAME = eINSTANCE.getPatient_Name();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__LEVEL = eINSTANCE.getPatient_Level();

		/**
		 * The meta object literal for the '<em><b>Doctor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DOCTOR = eINSTANCE.getPatient_Doctor();

		/**
		 * The meta object literal for the '{@link HospitalExample.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.impl.RoomImpl
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__LEVEL = eINSTANCE.getRoom_Level();

		/**
		 * The meta object literal for the '<em><b>Lies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__LIES = eINSTANCE.getRoom_Lies();

		/**
		 * The meta object literal for the '<em><b>Nurses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__NURSES = eINSTANCE.getRoom_Nurses();

		/**
		 * The meta object literal for the '{@link HospitalExample.Carelevel <em>Carelevel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HospitalExample.Carelevel
		 * @see HospitalExample.impl.HospitalExamplePackageImpl#getCarelevel()
		 * @generated
		 */
		EEnum CARELEVEL = eINSTANCE.getCarelevel();

	}

} //HospitalExamplePackage
