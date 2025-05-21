/**
 */
package HospitalExample.impl;

import HospitalExample.Department;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.Staff;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.impl.StaffImpl#getStaffID <em>Staff ID</em>}</li>
 *   <li>{@link HospitalExample.impl.StaffImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link HospitalExample.impl.StaffImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StaffImpl extends MinimalEObjectImpl.Container implements Staff {
	/**
	 * The default value of the '{@link #getStaffID() <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffID()
	 * @generated
	 * @ordered
	 */
	protected static final int STAFF_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getStaffID() <em>Staff ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffID()
	 * @generated
	 * @ordered
	 */
	protected int staffID = STAFF_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected Department works;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HospitalExamplePackage.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStaffID() {
		return staffID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaffID(int newStaffID) {
		int oldStaffID = staffID;
		staffID = newStaffID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.STAFF__STAFF_ID, oldStaffID, staffID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getWorks() {
		if (works != null && works.eIsProxy()) {
			InternalEObject oldWorks = (InternalEObject)works;
			works = (Department)eResolveProxy(oldWorks);
			if (works != oldWorks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HospitalExamplePackage.STAFF__WORKS, oldWorks, works));
			}
		}
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetWorks() {
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorks(Department newWorks, NotificationChain msgs) {
		Department oldWorks = works;
		works = newWorks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.STAFF__WORKS, oldWorks, newWorks);
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
	public void setWorks(Department newWorks) {
		if (newWorks != works) {
			NotificationChain msgs = null;
			if (works != null)
				msgs = ((InternalEObject)works).eInverseRemove(this, HospitalExamplePackage.DEPARTMENT__STAFF, Department.class, msgs);
			if (newWorks != null)
				msgs = ((InternalEObject)newWorks).eInverseAdd(this, HospitalExamplePackage.DEPARTMENT__STAFF, Department.class, msgs);
			msgs = basicSetWorks(newWorks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.STAFF__WORKS, newWorks, newWorks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.STAFF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HospitalExamplePackage.STAFF__WORKS:
				if (works != null)
					msgs = ((InternalEObject)works).eInverseRemove(this, HospitalExamplePackage.DEPARTMENT__STAFF, Department.class, msgs);
				return basicSetWorks((Department)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HospitalExamplePackage.STAFF__WORKS:
				return basicSetWorks(null, msgs);
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
			case HospitalExamplePackage.STAFF__STAFF_ID:
				return getStaffID();
			case HospitalExamplePackage.STAFF__WORKS:
				if (resolve) return getWorks();
				return basicGetWorks();
			case HospitalExamplePackage.STAFF__NAME:
				return getName();
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
			case HospitalExamplePackage.STAFF__STAFF_ID:
				setStaffID((Integer)newValue);
				return;
			case HospitalExamplePackage.STAFF__WORKS:
				setWorks((Department)newValue);
				return;
			case HospitalExamplePackage.STAFF__NAME:
				setName((String)newValue);
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
			case HospitalExamplePackage.STAFF__STAFF_ID:
				setStaffID(STAFF_ID_EDEFAULT);
				return;
			case HospitalExamplePackage.STAFF__WORKS:
				setWorks((Department)null);
				return;
			case HospitalExamplePackage.STAFF__NAME:
				setName(NAME_EDEFAULT);
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
			case HospitalExamplePackage.STAFF__STAFF_ID:
				return staffID != STAFF_ID_EDEFAULT;
			case HospitalExamplePackage.STAFF__WORKS:
				return works != null;
			case HospitalExamplePackage.STAFF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (staffID: ");
		result.append(staffID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
