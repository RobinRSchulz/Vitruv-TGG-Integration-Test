/**
 */
package Hospital2AdministrationSolutions;

import HospitalExample.Staff;

import org.eclipse.emf.ecore.EObject;

import runtime.CorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff To Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2AdministrationSolutions.StaffToStaff#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.StaffToStaff#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getStaffToStaff()
 * @model
 * @generated
 */
public interface StaffToStaff extends EObject, CorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Staff)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getStaffToStaff_Source()
	 * @model
	 * @generated
	 */
	Staff getSource();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.StaffToStaff#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Staff value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AdministrationExample.Staff)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getStaffToStaff_Target()
	 * @model
	 * @generated
	 */
	AdministrationExample.Staff getTarget();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.StaffToStaff#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AdministrationExample.Staff value);

} // StaffToStaff
