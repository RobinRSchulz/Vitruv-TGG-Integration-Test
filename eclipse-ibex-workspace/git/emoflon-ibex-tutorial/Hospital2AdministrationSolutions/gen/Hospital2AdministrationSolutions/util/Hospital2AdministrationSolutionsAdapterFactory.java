/**
 */
package Hospital2AdministrationSolutions.util;

import Hospital2AdministrationSolutions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import runtime.CorrespondenceNode;
import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage
 * @generated
 */
public class Hospital2AdministrationSolutionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hospital2AdministrationSolutionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hospital2AdministrationSolutionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Hospital2AdministrationSolutionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hospital2AdministrationSolutionsSwitch<Adapter> modelSwitch =
		new Hospital2AdministrationSolutionsSwitch<Adapter>() {
			@Override
			public Adapter caseHospitalToAdministration(HospitalToAdministration object) {
				return createHospitalToAdministrationAdapter();
			}
			@Override
			public Adapter caseStaffToStaff(StaffToStaff object) {
				return createStaffToStaffAdapter();
			}
			@Override
			public Adapter casePatientToPatient(PatientToPatient object) {
				return createPatientToPatientAdapter();
			}
			@Override
			public Adapter caseRoomToShiftplan(RoomToShiftplan object) {
				return createRoomToShiftplanAdapter();
			}
			@Override
			public Adapter caseDoctorToStaff(DoctorToStaff object) {
				return createDoctorToStaffAdapter();
			}
			@Override
			public Adapter caseNurseToStaff(NurseToStaff object) {
				return createNurseToStaffAdapter();
			}
			@Override
			public Adapter caseDepartmentRule__Marker(DepartmentRule__Marker object) {
				return createDepartmentRule__MarkerAdapter();
			}
			@Override
			public Adapter caseDocToStaffRule__Marker(DocToStaffRule__Marker object) {
				return createDocToStaffRule__MarkerAdapter();
			}
			@Override
			public Adapter caseDoctorShiftplanRule__Marker(DoctorShiftplanRule__Marker object) {
				return createDoctorShiftplanRule__MarkerAdapter();
			}
			@Override
			public Adapter caseDoctorToPatient__Marker(DoctorToPatient__Marker object) {
				return createDoctorToPatient__MarkerAdapter();
			}
			@Override
			public Adapter caseHospitaltoAdministrationRule__Marker(HospitaltoAdministrationRule__Marker object) {
				return createHospitaltoAdministrationRule__MarkerAdapter();
			}
			@Override
			public Adapter caseNurseShiftplanRule__Marker(NurseShiftplanRule__Marker object) {
				return createNurseShiftplanRule__MarkerAdapter();
			}
			@Override
			public Adapter caseNurseToRoomRule__Marker(NurseToRoomRule__Marker object) {
				return createNurseToRoomRule__MarkerAdapter();
			}
			@Override
			public Adapter caseNurseToStaffRule__Marker(NurseToStaffRule__Marker object) {
				return createNurseToStaffRule__MarkerAdapter();
			}
			@Override
			public Adapter casePatientInReception__Marker(PatientInReception__Marker object) {
				return createPatientInReception__MarkerAdapter();
			}
			@Override
			public Adapter casePatientInRoom__Marker(PatientInRoom__Marker object) {
				return createPatientInRoom__MarkerAdapter();
			}
			@Override
			public Adapter caseRoomRule__Marker(RoomRule__Marker object) {
				return createRoomRule__MarkerAdapter();
			}
			@Override
			public Adapter caseCorrespondenceNode(CorrespondenceNode object) {
				return createCorrespondenceNodeAdapter();
			}
			@Override
			public Adapter caseTGGRuleApplication(TGGRuleApplication object) {
				return createTGGRuleApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.HospitalToAdministration <em>Hospital To Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.HospitalToAdministration
	 * @generated
	 */
	public Adapter createHospitalToAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.StaffToStaff <em>Staff To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.StaffToStaff
	 * @generated
	 */
	public Adapter createStaffToStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.PatientToPatient <em>Patient To Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.PatientToPatient
	 * @generated
	 */
	public Adapter createPatientToPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.RoomToShiftplan <em>Room To Shiftplan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.RoomToShiftplan
	 * @generated
	 */
	public Adapter createRoomToShiftplanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.DoctorToStaff <em>Doctor To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.DoctorToStaff
	 * @generated
	 */
	public Adapter createDoctorToStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.NurseToStaff <em>Nurse To Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.NurseToStaff
	 * @generated
	 */
	public Adapter createNurseToStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.DepartmentRule__Marker <em>Department Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.DepartmentRule__Marker
	 * @generated
	 */
	public Adapter createDepartmentRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.DocToStaffRule__Marker <em>Doc To Staff Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.DocToStaffRule__Marker
	 * @generated
	 */
	public Adapter createDocToStaffRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.DoctorShiftplanRule__Marker <em>Doctor Shiftplan Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.DoctorShiftplanRule__Marker
	 * @generated
	 */
	public Adapter createDoctorShiftplanRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.DoctorToPatient__Marker <em>Doctor To Patient Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.DoctorToPatient__Marker
	 * @generated
	 */
	public Adapter createDoctorToPatient__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.HospitaltoAdministrationRule__Marker <em>Hospitalto Administration Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.HospitaltoAdministrationRule__Marker
	 * @generated
	 */
	public Adapter createHospitaltoAdministrationRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker <em>Nurse Shiftplan Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.NurseShiftplanRule__Marker
	 * @generated
	 */
	public Adapter createNurseShiftplanRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.NurseToRoomRule__Marker <em>Nurse To Room Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.NurseToRoomRule__Marker
	 * @generated
	 */
	public Adapter createNurseToRoomRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.NurseToStaffRule__Marker <em>Nurse To Staff Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.NurseToStaffRule__Marker
	 * @generated
	 */
	public Adapter createNurseToStaffRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.PatientInReception__Marker <em>Patient In Reception Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.PatientInReception__Marker
	 * @generated
	 */
	public Adapter createPatientInReception__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker <em>Patient In Room Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.PatientInRoom__Marker
	 * @generated
	 */
	public Adapter createPatientInRoom__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hospital2AdministrationSolutions.RoomRule__Marker <em>Room Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hospital2AdministrationSolutions.RoomRule__Marker
	 * @generated
	 */
	public Adapter createRoomRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link runtime.CorrespondenceNode <em>Correspondence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see runtime.CorrespondenceNode
	 * @generated
	 */
	public Adapter createCorrespondenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link runtime.TGGRuleApplication <em>TGG Rule Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see runtime.TGGRuleApplication
	 * @generated
	 */
	public Adapter createTGGRuleApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Hospital2AdministrationSolutionsAdapterFactory
