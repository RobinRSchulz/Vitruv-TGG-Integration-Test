/**
 */
package Hospital2AdministrationSolutions;

import AdministrationExample.Administration;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalExample.Patient;
import HospitalExample.Room;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient In Room Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCREATE__SRC__p1 <em>CREATE SRC p1</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCREATE__TRG__p2 <em>CREATE TRG p2</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCREATE__CORR__pTop <em>CREATE CORR pTop</em>}</li>
 * </ul>
 *
 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker()
 * @model
 * @generated
 */
public interface PatientInRoom__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #setCONTEXT__SRC__d(Department)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CONTEXT__SRC__d()
	 * @model required="true"
	 * @generated
	 */
	Department getCONTEXT__SRC__d();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__SRC__d <em>CONTEXT SRC d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC d</em>' reference.
	 * @see #getCONTEXT__SRC__d()
	 * @generated
	 */
	void setCONTEXT__SRC__d(Department value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC h</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC h</em>' reference.
	 * @see #setCONTEXT__SRC__h(Hospital)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CONTEXT__SRC__h()
	 * @model required="true"
	 * @generated
	 */
	Hospital getCONTEXT__SRC__h();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__SRC__h <em>CONTEXT SRC h</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC h</em>' reference.
	 * @see #getCONTEXT__SRC__h()
	 * @generated
	 */
	void setCONTEXT__SRC__h(Hospital value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC p1</em>' reference.
	 * @see #setCREATE__SRC__p1(Patient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CREATE__SRC__p1()
	 * @model required="true"
	 * @generated
	 */
	Patient getCREATE__SRC__p1();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCREATE__SRC__p1 <em>CREATE SRC p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC p1</em>' reference.
	 * @see #getCREATE__SRC__p1()
	 * @generated
	 */
	void setCREATE__SRC__p1(Patient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC ro</em>' reference.
	 * @see #setCONTEXT__SRC__ro(Room)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CONTEXT__SRC__ro()
	 * @model required="true"
	 * @generated
	 */
	Room getCONTEXT__SRC__ro();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC ro</em>' reference.
	 * @see #getCONTEXT__SRC__ro()
	 * @generated
	 */
	void setCONTEXT__SRC__ro(Room value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG p2</em>' reference.
	 * @see #setCREATE__TRG__p2(AdministrationExample.Patient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CREATE__TRG__p2()
	 * @model required="true"
	 * @generated
	 */
	AdministrationExample.Patient getCREATE__TRG__p2();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCREATE__TRG__p2 <em>CREATE TRG p2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG p2</em>' reference.
	 * @see #getCREATE__TRG__p2()
	 * @generated
	 */
	void setCREATE__TRG__p2(AdministrationExample.Patient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG v</em>' reference.
	 * @see #setCONTEXT__TRG__v(Administration)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CONTEXT__TRG__v()
	 * @model required="true"
	 * @generated
	 */
	Administration getCONTEXT__TRG__v();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__TRG__v <em>CONTEXT TRG v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG v</em>' reference.
	 * @see #getCONTEXT__TRG__v()
	 * @generated
	 */
	void setCONTEXT__TRG__v(Administration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR htov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR htov</em>' reference.
	 * @see #setCONTEXT__CORR__htov(HospitalToAdministration)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CONTEXT__CORR__htov()
	 * @model required="true"
	 * @generated
	 */
	HospitalToAdministration getCONTEXT__CORR__htov();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCONTEXT__CORR__htov <em>CONTEXT CORR htov</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR htov</em>' reference.
	 * @see #getCONTEXT__CORR__htov()
	 * @generated
	 */
	void setCONTEXT__CORR__htov(HospitalToAdministration value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR pTop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR pTop</em>' reference.
	 * @see #setCREATE__CORR__pTop(PatientToPatient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientInRoom__Marker_CREATE__CORR__pTop()
	 * @model required="true"
	 * @generated
	 */
	PatientToPatient getCREATE__CORR__pTop();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientInRoom__Marker#getCREATE__CORR__pTop <em>CREATE CORR pTop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR pTop</em>' reference.
	 * @see #getCREATE__CORR__pTop()
	 * @generated
	 */
	void setCREATE__CORR__pTop(PatientToPatient value);

} // PatientInRoom__Marker
