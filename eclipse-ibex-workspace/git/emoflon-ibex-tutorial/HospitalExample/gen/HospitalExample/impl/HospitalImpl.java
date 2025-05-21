/**
 */
package HospitalExample.impl;

import HospitalExample.Department;
import HospitalExample.Hospital;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.Reception;
import HospitalExample.Staff;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.impl.HospitalImpl#getReception <em>Reception</em>}</li>
 *   <li>{@link HospitalExample.impl.HospitalImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link HospitalExample.impl.HospitalImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HospitalImpl extends MinimalEObjectImpl.Container implements Hospital {
	/**
	 * The cached value of the '{@link #getReception() <em>Reception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReception()
	 * @generated
	 * @ordered
	 */
	protected Reception reception;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staff;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> department;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HospitalExamplePackage.Literals.HOSPITAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reception getReception() {
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReception(Reception newReception, NotificationChain msgs) {
		Reception oldReception = reception;
		reception = newReception;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.HOSPITAL__RECEPTION, oldReception, newReception);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReception(Reception newReception) {
		if (newReception != reception) {
			NotificationChain msgs = null;
			if (reception != null)
				msgs = ((InternalEObject)reception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HospitalExamplePackage.HOSPITAL__RECEPTION, null, msgs);
			if (newReception != null)
				msgs = ((InternalEObject)newReception).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HospitalExamplePackage.HOSPITAL__RECEPTION, null, msgs);
			msgs = basicSetReception(newReception, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.HOSPITAL__RECEPTION, newReception, newReception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Staff> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<Staff>(Staff.class, this, HospitalExamplePackage.HOSPITAL__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Department> getDepartment() {
		if (department == null) {
			department = new EObjectContainmentEList<Department>(Department.class, this, HospitalExamplePackage.HOSPITAL__DEPARTMENT);
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HospitalExamplePackage.HOSPITAL__RECEPTION:
				return basicSetReception(null, msgs);
			case HospitalExamplePackage.HOSPITAL__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
			case HospitalExamplePackage.HOSPITAL__DEPARTMENT:
				return ((InternalEList<?>)getDepartment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HospitalExamplePackage.HOSPITAL__RECEPTION:
				return getReception();
			case HospitalExamplePackage.HOSPITAL__STAFF:
				return getStaff();
			case HospitalExamplePackage.HOSPITAL__DEPARTMENT:
				return getDepartment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HospitalExamplePackage.HOSPITAL__RECEPTION:
				setReception((Reception)newValue);
				return;
			case HospitalExamplePackage.HOSPITAL__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Staff>)newValue);
				return;
			case HospitalExamplePackage.HOSPITAL__DEPARTMENT:
				getDepartment().clear();
				getDepartment().addAll((Collection<? extends Department>)newValue);
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
			case HospitalExamplePackage.HOSPITAL__RECEPTION:
				setReception((Reception)null);
				return;
			case HospitalExamplePackage.HOSPITAL__STAFF:
				getStaff().clear();
				return;
			case HospitalExamplePackage.HOSPITAL__DEPARTMENT:
				getDepartment().clear();
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
			case HospitalExamplePackage.HOSPITAL__RECEPTION:
				return reception != null;
			case HospitalExamplePackage.HOSPITAL__STAFF:
				return staff != null && !staff.isEmpty();
			case HospitalExamplePackage.HOSPITAL__DEPARTMENT:
				return department != null && !department.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HospitalImpl
