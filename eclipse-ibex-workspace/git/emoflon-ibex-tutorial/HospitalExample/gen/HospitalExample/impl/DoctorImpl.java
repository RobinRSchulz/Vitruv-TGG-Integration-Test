/**
 */
package HospitalExample.impl;

import HospitalExample.Doctor;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.Patient;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HospitalExample.impl.DoctorImpl#getCaresfor <em>Caresfor</em>}</li>
 *   <li>{@link HospitalExample.impl.DoctorImpl#getPatientCapacity <em>Patient Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorImpl extends StaffImpl implements Doctor {
	/**
	 * The cached value of the '{@link #getCaresfor() <em>Caresfor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaresfor()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> caresfor;

	/**
	 * The default value of the '{@link #getPatientCapacity() <em>Patient Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int PATIENT_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatientCapacity() <em>Patient Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCapacity()
	 * @generated
	 * @ordered
	 */
	protected int patientCapacity = PATIENT_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HospitalExamplePackage.Literals.DOCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getCaresfor() {
		if (caresfor == null) {
			caresfor = new EObjectWithInverseResolvingEList<Patient>(Patient.class, this, HospitalExamplePackage.DOCTOR__CARESFOR, HospitalExamplePackage.PATIENT__DOCTOR);
		}
		return caresfor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPatientCapacity() {
		return patientCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientCapacity(int newPatientCapacity) {
		int oldPatientCapacity = patientCapacity;
		patientCapacity = newPatientCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HospitalExamplePackage.DOCTOR__PATIENT_CAPACITY, oldPatientCapacity, patientCapacity));
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
			case HospitalExamplePackage.DOCTOR__CARESFOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCaresfor()).basicAdd(otherEnd, msgs);
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
			case HospitalExamplePackage.DOCTOR__CARESFOR:
				return ((InternalEList<?>)getCaresfor()).basicRemove(otherEnd, msgs);
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
			case HospitalExamplePackage.DOCTOR__CARESFOR:
				return getCaresfor();
			case HospitalExamplePackage.DOCTOR__PATIENT_CAPACITY:
				return getPatientCapacity();
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
			case HospitalExamplePackage.DOCTOR__CARESFOR:
				getCaresfor().clear();
				getCaresfor().addAll((Collection<? extends Patient>)newValue);
				return;
			case HospitalExamplePackage.DOCTOR__PATIENT_CAPACITY:
				setPatientCapacity((Integer)newValue);
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
			case HospitalExamplePackage.DOCTOR__CARESFOR:
				getCaresfor().clear();
				return;
			case HospitalExamplePackage.DOCTOR__PATIENT_CAPACITY:
				setPatientCapacity(PATIENT_CAPACITY_EDEFAULT);
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
			case HospitalExamplePackage.DOCTOR__CARESFOR:
				return caresfor != null && !caresfor.isEmpty();
			case HospitalExamplePackage.DOCTOR__PATIENT_CAPACITY:
				return patientCapacity != PATIENT_CAPACITY_EDEFAULT;
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
		result.append(" (patientCapacity: ");
		result.append(patientCapacity);
		result.append(')');
		return result.toString();
	}

} //DoctorImpl
