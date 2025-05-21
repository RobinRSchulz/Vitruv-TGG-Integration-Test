/**
 */
package HospitalExample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.Patient#getPatientID <em>Patient ID</em>}</li>
 *   <li>{@link HospitalExample.Patient#getName <em>Name</em>}</li>
 *   <li>{@link HospitalExample.Patient#getLevel <em>Level</em>}</li>
 *   <li>{@link HospitalExample.Patient#getDoctor <em>Doctor</em>}</li>
 * </ul>
 *
 * @see HospitalExample.HospitalExamplePackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends EObject {
	/**
	 * Returns the value of the '<em><b>Patient ID</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient ID</em>' attribute.
	 * @see #setPatientID(int)
	 * @see HospitalExample.HospitalExamplePackage#getPatient_PatientID()
	 * @model default="-1"
	 * @generated
	 */
	int getPatientID();

	/**
	 * Sets the value of the '{@link HospitalExample.Patient#getPatientID <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient ID</em>' attribute.
	 * @see #getPatientID()
	 * @generated
	 */
	void setPatientID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see HospitalExample.HospitalExamplePackage#getPatient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link HospitalExample.Patient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"PENDING"</code>.
	 * The literals are from the enumeration {@link HospitalExample.Carelevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see HospitalExample.Carelevel
	 * @see #setLevel(Carelevel)
	 * @see HospitalExample.HospitalExamplePackage#getPatient_Level()
	 * @model default="PENDING"
	 * @generated
	 */
	Carelevel getLevel();

	/**
	 * Sets the value of the '{@link HospitalExample.Patient#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see HospitalExample.Carelevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Carelevel value);

	/**
	 * Returns the value of the '<em><b>Doctor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link HospitalExample.Doctor#getCaresfor <em>Caresfor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor</em>' reference.
	 * @see #setDoctor(Doctor)
	 * @see HospitalExample.HospitalExamplePackage#getPatient_Doctor()
	 * @see HospitalExample.Doctor#getCaresfor
	 * @model opposite="caresfor" required="true"
	 * @generated
	 */
	Doctor getDoctor();

	/**
	 * Sets the value of the '{@link HospitalExample.Patient#getDoctor <em>Doctor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctor</em>' reference.
	 * @see #getDoctor()
	 * @generated
	 */
	void setDoctor(Doctor value);

} // Patient
