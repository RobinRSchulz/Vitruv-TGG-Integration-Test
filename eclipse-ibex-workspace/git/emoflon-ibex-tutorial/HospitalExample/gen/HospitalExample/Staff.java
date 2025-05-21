/**
 */
package HospitalExample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Staff#getStaffID <em>Staff ID</em>}</li>
 *   <li>{@link HospitalExample.Staff#getWorks <em>Works</em>}</li>
 *   <li>{@link HospitalExample.Staff#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getStaff()
 * @model abstract="true"
 * @generated
 */
public interface Staff extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff ID</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff ID</em>' attribute.
	 * @see #setStaffID(int)
	 * @see HospitalExample.HospitalExamplePackage#getStaff_StaffID()
	 * @model default="-1"
	 * @generated
	 */
	int getStaffID();

	/**
	 * Sets the value of the '{@link HospitalExample.Staff#getStaffID <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff ID</em>' attribute.
	 * @see #getStaffID()
	 * @generated
	 */
	void setStaffID(int value);

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link HospitalExample.Department#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference.
	 * @see #setWorks(Department)
	 * @see HospitalExample.HospitalExamplePackage#getStaff_Works()
	 * @see HospitalExample.Department#getStaff
	 * @model opposite="staff"
	 * @generated
	 */
	Department getWorks();

	/**
	 * Sets the value of the '{@link HospitalExample.Staff#getWorks <em>Works</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Works</em>' reference.
	 * @see #getWorks()
	 * @generated
	 */
	void setWorks(Department value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see HospitalExample.HospitalExamplePackage#getStaff_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link HospitalExample.Staff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Staff
