/**
 */
package Hospital2AdministrationSolutions.impl;

import Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage;
import Hospital2AdministrationSolutions.PatientToPatient;

import HospitalExample.Patient;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.CorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient To Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2AdministrationSolutions.impl.PatientToPatientImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.impl.PatientToPatientImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientToPatientImpl extends CorrespondenceNodeImpl implements PatientToPatient {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Patient source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AdministrationExample.Patient target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientToPatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationSolutionsPackage.Literals.PATIENT_TO_PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Patient)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Patient newSource) {
		Patient oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrationExample.Patient getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (AdministrationExample.Patient)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationExample.Patient basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(AdministrationExample.Patient newTarget) {
		AdministrationExample.Patient oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__SOURCE:
				setSource((Patient)newValue);
				return;
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__TARGET:
				setTarget((AdministrationExample.Patient)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__SOURCE:
				setSource((Patient)null);
				return;
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__TARGET:
				setTarget((AdministrationExample.Patient)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__SOURCE:
				return source != null;
			case Hospital2AdministrationSolutionsPackage.PATIENT_TO_PATIENT__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //PatientToPatientImpl
