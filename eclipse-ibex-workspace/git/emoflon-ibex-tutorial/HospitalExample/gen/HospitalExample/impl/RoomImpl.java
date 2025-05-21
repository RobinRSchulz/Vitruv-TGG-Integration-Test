/**
 */
package HospitalExample.impl;

import HospitalExample.Carelevel;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.Nurse;
import HospitalExample.Patient;
import HospitalExample.Room;

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
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.impl.RoomImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link HospitalExample.impl.RoomImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link HospitalExample.impl.RoomImpl#getLies <em>Lies</em>}</li>
 *   <li>{@link HospitalExample.impl.RoomImpl#getNurses <em>Nurses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Carelevel LEVEL_EDEFAULT = Carelevel.WEAK;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Carelevel level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLies() <em>Lies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLies()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> lies;

	/**
	 * The cached value of the '{@link #getNurses() <em>Nurses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNurses()
	 * @generated
	 * @ordered
	 */
	protected EList<Nurse> nurses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HospitalExamplePackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.ROOM__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Carelevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(Carelevel newLevel) {
		Carelevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.ROOM__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getLies() {
		if (lies == null) {
			lies = new EObjectContainmentEList<Patient>(Patient.class, this, HospitalExamplePackage.ROOM__LIES);
		}
		return lies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Nurse> getNurses() {
		if (nurses == null) {
			nurses = new EObjectWithInverseResolvingEList<Nurse>(Nurse.class, this, HospitalExamplePackage.ROOM__NURSES, HospitalExamplePackage.NURSE__RESPONSIBLE);
		}
		return nurses;
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
			case HospitalExamplePackage.ROOM__NURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNurses()).basicAdd(otherEnd, msgs);
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
			case HospitalExamplePackage.ROOM__LIES:
				return ((InternalEList<?>)getLies()).basicRemove(otherEnd, msgs);
			case HospitalExamplePackage.ROOM__NURSES:
				return ((InternalEList<?>)getNurses()).basicRemove(otherEnd, msgs);
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
			case HospitalExamplePackage.ROOM__CAPACITY:
				return getCapacity();
			case HospitalExamplePackage.ROOM__LEVEL:
				return getLevel();
			case HospitalExamplePackage.ROOM__LIES:
				return getLies();
			case HospitalExamplePackage.ROOM__NURSES:
				return getNurses();
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
			case HospitalExamplePackage.ROOM__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case HospitalExamplePackage.ROOM__LEVEL:
				setLevel((Carelevel)newValue);
				return;
			case HospitalExamplePackage.ROOM__LIES:
				getLies().clear();
				getLies().addAll((Collection<? extends Patient>)newValue);
				return;
			case HospitalExamplePackage.ROOM__NURSES:
				getNurses().clear();
				getNurses().addAll((Collection<? extends Nurse>)newValue);
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
			case HospitalExamplePackage.ROOM__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case HospitalExamplePackage.ROOM__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case HospitalExamplePackage.ROOM__LIES:
				getLies().clear();
				return;
			case HospitalExamplePackage.ROOM__NURSES:
				getNurses().clear();
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
			case HospitalExamplePackage.ROOM__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case HospitalExamplePackage.ROOM__LEVEL:
				return level != LEVEL_EDEFAULT;
			case HospitalExamplePackage.ROOM__LIES:
				return lies != null && !lies.isEmpty();
			case HospitalExamplePackage.ROOM__NURSES:
				return nurses != null && !nurses.isEmpty();
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
