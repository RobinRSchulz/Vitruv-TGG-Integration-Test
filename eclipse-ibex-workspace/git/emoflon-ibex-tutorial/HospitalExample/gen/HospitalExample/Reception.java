/**
 */
package HospitalExample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Reception#getWaits <em>Waits</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getReception()
 * @model
 * @generated
 */
public interface Reception extends EObject {
	/**
	 * Returns the value of the '<em><b>Waits</b></em>' containment reference list.
	 * The list contents are of type {@link HospitalExample.Patient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waits</em>' containment reference list.
	 * @see HospitalExample.HospitalExamplePackage#getReception_Waits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Patient> getWaits();

} // Reception
