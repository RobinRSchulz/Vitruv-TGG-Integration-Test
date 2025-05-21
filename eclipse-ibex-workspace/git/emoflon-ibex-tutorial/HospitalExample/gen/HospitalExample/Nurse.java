/**
 */
package HospitalExample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nurse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Nurse#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getNurse()
 * @model
 * @generated
 */
public interface Nurse extends Staff {
	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link HospitalExample.Room#getNurses <em>Nurses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Room)
	 * @see HospitalExample.HospitalExamplePackage#getNurse_Responsible()
	 * @see HospitalExample.Room#getNurses
	 * @model opposite="nurses"
	 * @generated
	 */
	Room getResponsible();

	/**
	 * Sets the value of the '{@link HospitalExample.Nurse#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Room value);

} // Nurse
