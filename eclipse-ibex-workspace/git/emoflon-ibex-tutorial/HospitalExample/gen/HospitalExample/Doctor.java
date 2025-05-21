/**
 */
package HospitalExample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Doctor#getCaresfor <em>Caresfor</em>}</li>
 *   <li>{@link HospitalExample.Doctor#getPatientCapacity <em>Patient Capacity</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getDoctor()
 * @model
 * @generated
 */
public interface Doctor extends Staff {
	/**
	 * Returns the value of the '<em><b>Caresfor</b></em>' reference list.
	 * The list contents are of type {@link HospitalExample.Patient}.
	 * It is bidirectional and its opposite is '{@link HospitalExample.Patient#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caresfor</em>' reference list.
	 * @see HospitalExample.HospitalExamplePackage#getDoctor_Caresfor()
	 * @see HospitalExample.Patient#getDoctor
	 * @model opposite="doctor"
	 * @generated
	 */
	EList<Patient> getCaresfor();

	/**
	 * Returns the value of the '<em><b>Patient Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Capacity</em>' attribute.
	 * @see #setPatientCapacity(int)
	 * @see HospitalExample.HospitalExamplePackage#getDoctor_PatientCapacity()
	 * @model
	 * @generated
	 */
	int getPatientCapacity();

	/**
	 * Sets the value of the '{@link HospitalExample.Doctor#getPatientCapacity <em>Patient Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Capacity</em>' attribute.
	 * @see #getPatientCapacity()
	 * @generated
	 */
	void setPatientCapacity(int value);

} // Doctor
