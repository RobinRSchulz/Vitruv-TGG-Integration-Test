/**
 */
package HospitalExample.impl;

import HospitalExample.Department;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.Room;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.impl.DepartmentImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link HospitalExample.impl.DepartmentImpl#getDID <em>DID</em>}</li>
 *   <li>{@link HospitalExample.impl.DepartmentImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link HospitalExample.impl.DepartmentImpl#getMaxRoomCount <em>Max Room Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The default value of the '{@link #getDID() <em>DID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDID()
	 * @generated
	 * @ordered
	 */
	protected static final int DID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getDID() <em>DID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDID()
	 * @generated
	 * @ordered
	 */
	protected int dID = DID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staff;

	/**
	 * The default value of the '{@link #getMaxRoomCount() <em>Max Room Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRoomCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ROOM_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRoomCount() <em>Max Room Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRoomCount()
	 * @generated
	 * @ordered
	 */
	protected int maxRoomCount = MAX_ROOM_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HospitalExamplePackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, HospitalExamplePackage.DEPARTMENT__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDID() {
		return dID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDID(int newDID) {
		int oldDID = dID;
		dID = newDID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.DEPARTMENT__DID, oldDID, dID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Staff> getStaff() {
		if (staff == null) {
			staff = new EObjectWithInverseResolvingEList<Staff>(Staff.class, this, HospitalExamplePackage.DEPARTMENT__STAFF, HospitalExamplePackage.STAFF__WORKS);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxRoomCount() {
		return maxRoomCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRoomCount(int newMaxRoomCount) {
		int oldMaxRoomCount = maxRoomCount;
		maxRoomCount = newMaxRoomCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.DEPARTMENT__MAX_ROOM_COUNT, oldMaxRoomCount, maxRoomCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HospitalExamplePackage.DEPARTMENT__STAFF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStaff()).basicAdd(otherEnd, msgs);
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
			case HospitalExamplePackage.DEPARTMENT__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case HospitalExamplePackage.DEPARTMENT__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
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
			case HospitalExamplePackage.DEPARTMENT__ROOMS:
				return getRooms();
			case HospitalExamplePackage.DEPARTMENT__DID:
				return getDID();
			case HospitalExamplePackage.DEPARTMENT__STAFF:
				return getStaff();
			case HospitalExamplePackage.DEPARTMENT__MAX_ROOM_COUNT:
				return getMaxRoomCount();
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
			case HospitalExamplePackage.DEPARTMENT__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case HospitalExamplePackage.DEPARTMENT__DID:
				setDID((Integer)newValue);
				return;
			case HospitalExamplePackage.DEPARTMENT__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Staff>)newValue);
				return;
			case HospitalExamplePackage.DEPARTMENT__MAX_ROOM_COUNT:
				setMaxRoomCount((Integer)newValue);
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
			case HospitalExamplePackage.DEPARTMENT__ROOMS:
				getRooms().clear();
				return;
			case HospitalExamplePackage.DEPARTMENT__DID:
				setDID(DID_EDEFAULT);
				return;
			case HospitalExamplePackage.DEPARTMENT__STAFF:
				getStaff().clear();
				return;
			case HospitalExamplePackage.DEPARTMENT__MAX_ROOM_COUNT:
				setMaxRoomCount(MAX_ROOM_COUNT_EDEFAULT);
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
			case HospitalExamplePackage.DEPARTMENT__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case HospitalExamplePackage.DEPARTMENT__DID:
				return dID != DID_EDEFAULT;
			case HospitalExamplePackage.DEPARTMENT__STAFF:
				return staff != null && !staff.isEmpty();
			case HospitalExamplePackage.DEPARTMENT__MAX_ROOM_COUNT:
				return maxRoomCount != MAX_ROOM_COUNT_EDEFAULT;
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
		result.append(" (dID: ");
		result.append(dID);
		result.append(", maxRoomCount: ");
		result.append(maxRoomCount);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
