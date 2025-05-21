/**
 */
package HospitalExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Hospital#getReception <em>Reception</em>}</li>
 *   <li>{@link HospitalExample.Hospital#getStaff <em>Staff</em>}</li>
 *   <li>{@link HospitalExample.Hospital#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getHospital()
 * @model
 * @generated
 */
public interface Hospital extends EObject {
	/**
	 * Returns the value of the '<em><b>Reception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reception</em>' containment reference.
	 * @see #setReception(Reception)
	 * @see HospitalExample.HospitalExamplePackage#getHospital_Reception()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reception getReception();

	/**
	 * Sets the value of the '{@link HospitalExample.Hospital#getReception <em>Reception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reception</em>' containment reference.
	 * @see #getReception()
	 * @generated
	 */
	void setReception(Reception value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link HospitalExample.Staff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see HospitalExample.HospitalExamplePackage#getHospital_Staff()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Staff> getStaff();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference list.
	 * The list contents are of type {@link HospitalExample.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' containment reference list.
	 * @see HospitalExample.HospitalExamplePackage#getHospital_Department()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartment();

} // Hospital
