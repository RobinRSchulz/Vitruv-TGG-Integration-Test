/**
 */
package HospitalExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Room#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link HospitalExample.Room#getLevel <em>Level</em>}</li>
 *   <li>{@link HospitalExample.Room#getLies <em>Lies</em>}</li>
 *   <li>{@link HospitalExample.Room#getNurses <em>Nurses</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see HospitalExample.HospitalExamplePackage#getRoom_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link HospitalExample.Room#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link HospitalExample.Carelevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see HospitalExample.Carelevel
	 * @see #setLevel(Carelevel)
	 * @see HospitalExample.HospitalExamplePackage#getRoom_Level()
	 * @model required="true"
	 * @generated
	 */
	Carelevel getLevel();

	/**
	 * Sets the value of the '{@link HospitalExample.Room#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see HospitalExample.Carelevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Carelevel value);

	/**
	 * Returns the value of the '<em><b>Lies</b></em>' containment reference list.
	 * The list contents are of type {@link HospitalExample.Patient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lies</em>' containment reference list.
	 * @see HospitalExample.HospitalExamplePackage#getRoom_Lies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Patient> getLies();

	/**
	 * Returns the value of the '<em><b>Nurses</b></em>' reference list.
	 * The list contents are of type {@link HospitalExample.Nurse}.
	 * It is bidirectional and its opposite is '{@link HospitalExample.Nurse#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nurses</em>' reference list.
	 * @see HospitalExample.HospitalExamplePackage#getRoom_Nurses()
	 * @see HospitalExample.Nurse#getResponsible
	 * @model opposite="responsible"
	 * @generated
	 */
	EList<Nurse> getNurses();

} // Room
