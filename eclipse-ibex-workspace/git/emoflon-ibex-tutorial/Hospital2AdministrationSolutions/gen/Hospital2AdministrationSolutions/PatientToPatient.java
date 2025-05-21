/**
 */
package Hospital2AdministrationSolutions;

import HospitalExample.Patient;

import org.eclipse.emf.ecore.EObject;

import runtime.CorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient To Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Hospital2AdministrationSolutions.PatientToPatient#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.PatientToPatient#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientToPatient()
 * @model
 * @generated
 */
public interface PatientToPatient extends EObject, CorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Patient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientToPatient_Source()
	 * @model
	 * @generated
	 */
	Patient getSource();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientToPatient#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Patient value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AdministrationExample.Patient)
	 * @see Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage#getPatientToPatient_Target()
	 * @model
	 * @generated
	 */
	AdministrationExample.Patient getTarget();

	/**
	 * Sets the value of the '{@link Hospital2AdministrationSolutions.PatientToPatient#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AdministrationExample.Patient value);

} // PatientToPatient
