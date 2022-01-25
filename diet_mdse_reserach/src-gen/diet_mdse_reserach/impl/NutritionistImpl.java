/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Appointment;
import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Nutritionist;
import diet_mdse_reserach.Patient;
import diet_mdse_reserach.Payment;
import diet_mdse_reserach.PredictedDietplan;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutritionist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getClinictimings <em>Clinictimings</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getPatients <em>Patients</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getFees <em>Fees</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.NutritionistImpl#getPredicteddietplans <em>Predicteddietplans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionistImpl extends MinimalEObjectImpl.Container implements Nutritionist {
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
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone_no() <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_no()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhone_no() <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone_no()
	 * @generated
	 * @ordered
	 */
	protected int phone_no = PHONE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getClinictimings() <em>Clinictimings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinictimings()
	 * @generated
	 * @ordered
	 */
	protected static final String CLINICTIMINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClinictimings() <em>Clinictimings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinictimings()
	 * @generated
	 * @ordered
	 */
	protected String clinictimings = CLINICTIMINGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatients() <em>Patients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatients()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patients;

	/**
	 * The cached value of the '{@link #getFees() <em>Fees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFees()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> fees;

	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointments;

	/**
	 * The cached value of the '{@link #getPredicteddietplans() <em>Predicteddietplans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicteddietplans()
	 * @generated
	 * @ordered
	 */
	protected EList<PredictedDietplan> predicteddietplans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.NUTRITIONIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.NUTRITIONIST__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.NUTRITIONIST__ADDRESS,
					oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhone_no() {
		return phone_no;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone_no(int newPhone_no) {
		int oldPhone_no = phone_no;
		phone_no = newPhone_no;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.NUTRITIONIST__PHONE_NO,
					oldPhone_no, phone_no));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClinictimings() {
		return clinictimings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClinictimings(String newClinictimings) {
		String oldClinictimings = clinictimings;
		clinictimings = newClinictimings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.NUTRITIONIST__CLINICTIMINGS,
					oldClinictimings, clinictimings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getPatients() {
		if (patients == null) {
			patients = new EObjectWithInverseResolvingEList.ManyInverse<Patient>(Patient.class, this,
					Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS, Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS);
		}
		return patients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getFees() {
		if (fees == null) {
			fees = new EObjectResolvingEList<Payment>(Payment.class, this,
					Diet_mdse_reserachPackage.NUTRITIONIST__FEES);
		}
		return fees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new EObjectResolvingEList<Appointment>(Appointment.class, this,
					Diet_mdse_reserachPackage.NUTRITIONIST__APPOINTMENTS);
		}
		return appointments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredictedDietplan> getPredicteddietplans() {
		if (predicteddietplans == null) {
			predicteddietplans = new EObjectResolvingEList<PredictedDietplan>(PredictedDietplan.class, this,
					Diet_mdse_reserachPackage.NUTRITIONIST__PREDICTEDDIETPLANS);
		}
		return predicteddietplans;
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
		case Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPatients()).basicAdd(otherEnd, msgs);
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
		case Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS:
			return ((InternalEList<?>) getPatients()).basicRemove(otherEnd, msgs);
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
		case Diet_mdse_reserachPackage.NUTRITIONIST__NAME:
			return getName();
		case Diet_mdse_reserachPackage.NUTRITIONIST__ADDRESS:
			return getAddress();
		case Diet_mdse_reserachPackage.NUTRITIONIST__PHONE_NO:
			return getPhone_no();
		case Diet_mdse_reserachPackage.NUTRITIONIST__CLINICTIMINGS:
			return getClinictimings();
		case Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS:
			return getPatients();
		case Diet_mdse_reserachPackage.NUTRITIONIST__FEES:
			return getFees();
		case Diet_mdse_reserachPackage.NUTRITIONIST__APPOINTMENTS:
			return getAppointments();
		case Diet_mdse_reserachPackage.NUTRITIONIST__PREDICTEDDIETPLANS:
			return getPredicteddietplans();
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
		case Diet_mdse_reserachPackage.NUTRITIONIST__NAME:
			setName((String) newValue);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__ADDRESS:
			setAddress((String) newValue);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__PHONE_NO:
			setPhone_no((Integer) newValue);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__CLINICTIMINGS:
			setClinictimings((String) newValue);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS:
			getPatients().clear();
			getPatients().addAll((Collection<? extends Patient>) newValue);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__FEES:
			getFees().clear();
			getFees().addAll((Collection<? extends Payment>) newValue);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__APPOINTMENTS:
			getAppointments().clear();
			getAppointments().addAll((Collection<? extends Appointment>) newValue);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__PREDICTEDDIETPLANS:
			getPredicteddietplans().clear();
			getPredicteddietplans().addAll((Collection<? extends PredictedDietplan>) newValue);
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
		case Diet_mdse_reserachPackage.NUTRITIONIST__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__PHONE_NO:
			setPhone_no(PHONE_NO_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__CLINICTIMINGS:
			setClinictimings(CLINICTIMINGS_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS:
			getPatients().clear();
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__FEES:
			getFees().clear();
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__APPOINTMENTS:
			getAppointments().clear();
			return;
		case Diet_mdse_reserachPackage.NUTRITIONIST__PREDICTEDDIETPLANS:
			getPredicteddietplans().clear();
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
		case Diet_mdse_reserachPackage.NUTRITIONIST__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Diet_mdse_reserachPackage.NUTRITIONIST__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case Diet_mdse_reserachPackage.NUTRITIONIST__PHONE_NO:
			return phone_no != PHONE_NO_EDEFAULT;
		case Diet_mdse_reserachPackage.NUTRITIONIST__CLINICTIMINGS:
			return CLINICTIMINGS_EDEFAULT == null ? clinictimings != null
					: !CLINICTIMINGS_EDEFAULT.equals(clinictimings);
		case Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS:
			return patients != null && !patients.isEmpty();
		case Diet_mdse_reserachPackage.NUTRITIONIST__FEES:
			return fees != null && !fees.isEmpty();
		case Diet_mdse_reserachPackage.NUTRITIONIST__APPOINTMENTS:
			return appointments != null && !appointments.isEmpty();
		case Diet_mdse_reserachPackage.NUTRITIONIST__PREDICTEDDIETPLANS:
			return predicteddietplans != null && !predicteddietplans.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", phone_no: ");
		result.append(phone_no);
		result.append(", clinictimings: ");
		result.append(clinictimings);
		result.append(')');
		return result.toString();
	}

} //NutritionistImpl
