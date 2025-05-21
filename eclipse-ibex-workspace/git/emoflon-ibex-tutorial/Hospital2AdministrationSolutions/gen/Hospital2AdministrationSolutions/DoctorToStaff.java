/**
 */
package Hospital2AdministrationSolutions;

import AdministrationExample.Staff;

import HospitalExample.Doctor;

import org.eclipse.emf.ecore.EObject;

import runtime.CorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor To Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2AdministrationSolutions.DoctorToStaff#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.DoctorToStaff#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getDoctorToStaff()
 * @model
 * @generated
 */
public interface DoctorToStaff extends EObject, CorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Doctor)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getDoctorToStaff_Source()
	 * @model
	 * @generated
	 */
	Doctor getSource();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.DoctorToStaff#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Doctor value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Staff)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getDoctorToStaff_Target()
	 * @model
	 * @generated
	 */
	Staff getTarget();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.DoctorToStaff#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Staff value);

} // DoctorToStaff
