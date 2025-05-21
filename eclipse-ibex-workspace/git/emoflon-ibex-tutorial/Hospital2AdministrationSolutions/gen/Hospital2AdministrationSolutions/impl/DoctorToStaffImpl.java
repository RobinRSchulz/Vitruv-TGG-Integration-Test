/**
 */
package Hospital2AdministrationSolutions.impl;

import AdministrationExample.Staff;

import Hospital2AdministrationSolutions.DoctorToStaff;
import Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage;

import HospitalExample.Doctor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.CorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor To Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Hospital2AdministrationSolutions.impl.DoctorToStaffImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Hospital2AdministrationSolutions.impl.DoctorToStaffImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorToStaffImpl extends CorrespondenceNodeImpl implements DoctorToStaff {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Doctor source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Staff target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorToStaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hospital2AdministrationSolutionsPackage.Literals.DOCTOR_TO_STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Doctor getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Doctor)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Doctor newSource) {
		Doctor oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Staff getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Staff)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Staff newTarget) {
		Staff oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__TARGET:
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
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__SOURCE:
				setSource((Doctor)newValue);
				return;
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__TARGET:
				setTarget((Staff)newValue);
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
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__SOURCE:
				setSource((Doctor)null);
				return;
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__TARGET:
				setTarget((Staff)null);
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
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__SOURCE:
				return source != null;
			case Hospital2AdministrationSolutionsPackage.DOCTOR_TO_STAFF__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //DoctorToStaffImpl
