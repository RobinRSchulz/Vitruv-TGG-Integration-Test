/**
 */
package Hospital2AdministrationSolutions;

import AdministrationExample.Shift;
import AdministrationExample.Shiftplan;
import AdministrationExample.Staff;

import HospitalExample.Nurse;
import HospitalExample.Patient;
import HospitalExample.Room;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nurse Shiftplan Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__SRC__s1 <em>CONTEXT SRC s1</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__s2 <em>CONTEXT TRG s2</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__sh <em>CONTEXT TRG sh</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__sp <em>CONTEXT TRG sp</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__CORR__sToS <em>CONTEXT CORR sTo S</em>}</li>
 * </ul>
 *
 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker()
 * @model
 * @generated
 */
public interface NurseShiftplanRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC p1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC p1</em>' reference.
	 * @see #setCONTEXT__SRC__p1(Patient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__SRC__p1()
	 * @model required="true"
	 * @generated
	 */
	Patient getCONTEXT__SRC__p1();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__SRC__p1 <em>CONTEXT SRC p1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC p1</em>' reference.
	 * @see #getCONTEXT__SRC__p1()
	 * @generated
	 */
	void setCONTEXT__SRC__p1(Patient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC ro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC ro</em>' reference.
	 * @see #setCONTEXT__SRC__ro(Room)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__SRC__ro()
	 * @model required="true"
	 * @generated
	 */
	Room getCONTEXT__SRC__ro();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__SRC__ro <em>CONTEXT SRC ro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC ro</em>' reference.
	 * @see #getCONTEXT__SRC__ro()
	 * @generated
	 */
	void setCONTEXT__SRC__ro(Room value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC s1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC s1</em>' reference.
	 * @see #setCONTEXT__SRC__s1(Nurse)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__SRC__s1()
	 * @model required="true"
	 * @generated
	 */
	Nurse getCONTEXT__SRC__s1();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__SRC__s1 <em>CONTEXT SRC s1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC s1</em>' reference.
	 * @see #getCONTEXT__SRC__s1()
	 * @generated
	 */
	void setCONTEXT__SRC__s1(Nurse value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG p2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG p2</em>' reference.
	 * @see #setCONTEXT__TRG__p2(AdministrationExample.Patient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__TRG__p2()
	 * @model required="true"
	 * @generated
	 */
	AdministrationExample.Patient getCONTEXT__TRG__p2();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__p2 <em>CONTEXT TRG p2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG p2</em>' reference.
	 * @see #getCONTEXT__TRG__p2()
	 * @generated
	 */
	void setCONTEXT__TRG__p2(AdministrationExample.Patient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG s2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG s2</em>' reference.
	 * @see #setCONTEXT__TRG__s2(Staff)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__TRG__s2()
	 * @model required="true"
	 * @generated
	 */
	Staff getCONTEXT__TRG__s2();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__s2 <em>CONTEXT TRG s2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG s2</em>' reference.
	 * @see #getCONTEXT__TRG__s2()
	 * @generated
	 */
	void setCONTEXT__TRG__s2(Staff value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG sh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG sh</em>' reference.
	 * @see #setCONTEXT__TRG__sh(Shift)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__TRG__sh()
	 * @model required="true"
	 * @generated
	 */
	Shift getCONTEXT__TRG__sh();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__sh <em>CONTEXT TRG sh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG sh</em>' reference.
	 * @see #getCONTEXT__TRG__sh()
	 * @generated
	 */
	void setCONTEXT__TRG__sh(Shift value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG sp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG sp</em>' reference.
	 * @see #setCONTEXT__TRG__sp(Shiftplan)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__TRG__sp()
	 * @model required="true"
	 * @generated
	 */
	Shiftplan getCONTEXT__TRG__sp();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__TRG__sp <em>CONTEXT TRG sp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG sp</em>' reference.
	 * @see #getCONTEXT__TRG__sp()
	 * @generated
	 */
	void setCONTEXT__TRG__sp(Shiftplan value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR pTo P</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR pTo P</em>' reference.
	 * @see #setCONTEXT__CORR__pToP(PatientToPatient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__CORR__pToP()
	 * @model required="true"
	 * @generated
	 */
	PatientToPatient getCONTEXT__CORR__pToP();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__CORR__pToP <em>CONTEXT CORR pTo P</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR pTo P</em>' reference.
	 * @see #getCONTEXT__CORR__pToP()
	 * @generated
	 */
	void setCONTEXT__CORR__pToP(PatientToPatient value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR sTo S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR sTo S</em>' reference.
	 * @see #setCONTEXT__CORR__sToS(StaffToStaff)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getNurseShiftplanRule__Marker_CONTEXT__CORR__sToS()
	 * @model required="true"
	 * @generated
	 */
	StaffToStaff getCONTEXT__CORR__sToS();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.NurseShiftplanRule__Marker#getCONTEXT__CORR__sToS <em>CONTEXT CORR sTo S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR sTo S</em>' reference.
	 * @see #getCONTEXT__CORR__sToS()
	 * @generated
	 */
	void setCONTEXT__CORR__sToS(StaffToStaff value);

} // NurseShiftplanRule__Marker
