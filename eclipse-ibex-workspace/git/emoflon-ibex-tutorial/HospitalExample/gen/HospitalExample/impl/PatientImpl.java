/**
 */
package HospitalExample.impl;

import HospitalExample.Carelevel;
import HospitalExample.Doctor;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.Patient;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.impl.PatientImpl#getPatientID <em>Patient ID</em>}</li>
 *   <li>{@link HospitalExample.impl.PatientImpl#getName <em>Name</em>}</li>
 *   <li>{@link HospitalExample.impl.PatientImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link HospitalExample.impl.PatientImpl#getDoctor <em>Doctor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends MinimalEObjectImpl.Container implements Patient {
	/**
	 * The default value of the '{@link #getPatientID() <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientID()
	 * @generated
	 * @ordered
	 */
	protected static final int PATIENT_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getPatientID() <em>Patient ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientID()
	 * @generated
	 * @ordered
	 */
	protected int patientID = PATIENT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Carelevel LEVEL_EDEFAULT = Carelevel.PENDING;

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
	 * The cached value of the '{@link #getDoctor() <em>Doctor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctor()
	 * @generated
	 * @ordered
	 */
	protected Doctor doctor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HospitalExamplePackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPatientID() {
		return patientID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientID(int newPatientID) {
		int oldPatientID = patientID;
		patientID = newPatientID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.PATIENT__PATIENT_ID, oldPatientID, patientID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.PATIENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.PATIENT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Doctor getDoctor() {
		if (doctor != null && doctor.eIsProxy()) {
			InternalEObject oldDoctor = (InternalEObject)doctor;
			doctor = (Doctor)eResolveProxy(oldDoctor);
			if (doctor != oldDoctor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HospitalExamplePackage.PATIENT__DOCTOR, oldDoctor, doctor));
			}
		}
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor basicGetDoctor() {
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoctor(Doctor newDoctor, NotificationChain msgs) {
		Doctor oldDoctor = doctor;
		doctor = newDoctor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.PATIENT__DOCTOR, oldDoctor, newDoctor);
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
	public void setDoctor(Doctor newDoctor) {
		if (newDoctor != doctor) {
			NotificationChain msgs = null;
			if (doctor != null)
				msgs = ((InternalEObject)doctor).eInverseRemove(this, HospitalExamplePackage.DOCTOR__CARESFOR, Doctor.class, msgs);
			if (newDoctor != null)
				msgs = ((InternalEObject)newDoctor).eInverseAdd(this, HospitalExamplePackage.DOCTOR__CARESFOR, Doctor.class, msgs);
			msgs = basicSetDoctor(newDoctor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.PATIENT__DOCTOR, newDoctor, newDoctor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HospitalExamplePackage.PATIENT__DOCTOR:
				if (doctor != null)
					msgs = ((InternalEObject)doctor).eInverseRemove(this, HospitalExamplePackage.DOCTOR__CARESFOR, Doctor.class, msgs);
				return basicSetDoctor((Doctor)otherEnd, msgs);
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
			case HospitalExamplePackage.PATIENT__DOCTOR:
				return basicSetDoctor(null, msgs);
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
			case HospitalExamplePackage.PATIENT__PATIENT_ID:
				return getPatientID();
			case HospitalExamplePackage.PATIENT__NAME:
				return getName();
			case HospitalExamplePackage.PATIENT__LEVEL:
				return getLevel();
			case HospitalExamplePackage.PATIENT__DOCTOR:
				if (resolve) return getDoctor();
				return basicGetDoctor();
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
			case HospitalExamplePackage.PATIENT__PATIENT_ID:
				setPatientID((Integer)newValue);
				return;
			case HospitalExamplePackage.PATIENT__NAME:
				setName((String)newValue);
				return;
			case HospitalExamplePackage.PATIENT__LEVEL:
				setLevel((Carelevel)newValue);
				return;
			case HospitalExamplePackage.PATIENT__DOCTOR:
				setDoctor((Doctor)newValue);
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
			case HospitalExamplePackage.PATIENT__PATIENT_ID:
				setPatientID(PATIENT_ID_EDEFAULT);
				return;
			case HospitalExamplePackage.PATIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HospitalExamplePackage.PATIENT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case HospitalExamplePackage.PATIENT__DOCTOR:
				setDoctor((Doctor)null);
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
			case HospitalExamplePackage.PATIENT__PATIENT_ID:
				return patientID != PATIENT_ID_EDEFAULT;
			case HospitalExamplePackage.PATIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HospitalExamplePackage.PATIENT__LEVEL:
				return level != LEVEL_EDEFAULT;
			case HospitalExamplePackage.PATIENT__DOCTOR:
				return doctor != null;
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
		result.append(" (patientID: ");
		result.append(patientID);
		result.append(", name: ");
		result.append(name);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
