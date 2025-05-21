/**
 */
package HospitalExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Department#getRooms <em>Rooms</em>}</li>
 *   <li>{@link HospitalExample.Department#getDID <em>DID</em>}</li>
 *   <li>{@link HospitalExample.Department#getStaff <em>Staff</em>}</li>
 *   <li>{@link HospitalExample.Department#getMaxRoomCount <em>Max Room Count</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link HospitalExample.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see HospitalExample.HospitalExamplePackage#getDepartment_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>DID</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DID</em>' attribute.
	 * @see #setDID(int)
	 * @see HospitalExample.HospitalExamplePackage#getDepartment_DID()
	 * @model default="-1" id="true"
	 * @generated
	 */
	int getDID();

	/**
	 * Sets the value of the '{@link HospitalExample.Department#getDID <em>DID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DID</em>' attribute.
	 * @see #getDID()
	 * @generated
	 */
	void setDID(int value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link HospitalExample.Staff}.
	 * It is bidirectional and its opposite is '{@link HospitalExample.Staff#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see HospitalExample.HospitalExamplePackage#getDepartment_Staff()
	 * @see HospitalExample.Staff#getWorks
	 * @model opposite="works"
	 * @generated
	 */
	EList<Staff> getStaff();

	/**
	 * Returns the value of the '<em><b>Max Room Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Room Count</em>' attribute.
	 * @see #setMaxRoomCount(int)
	 * @see HospitalExample.HospitalExamplePackage#getDepartment_MaxRoomCount()
	 * @model
	 * @generated
	 */
	int getMaxRoomCount();

	/**
	 * Sets the value of the '{@link HospitalExample.Department#getMaxRoomCount <em>Max Room Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Room Count</em>' attribute.
	 * @see #getMaxRoomCount()
	 * @generated
	 */
	void setMaxRoomCount(int value);

} // Department
