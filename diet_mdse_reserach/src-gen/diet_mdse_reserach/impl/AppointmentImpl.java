/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Appointment;
import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Patient;

import diet_mdse_reserach.Payment;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.AppointmentImpl#getAppointment_details <em>Appointment details</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.AppointmentImpl#getAppointment_Date <em>Appointment Date</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.AppointmentImpl#getTime_taken <em>Time taken</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.AppointmentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.AppointmentImpl#getApointment_booking_mode <em>Apointment booking mode</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.AppointmentImpl#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends MinimalEObjectImpl.Container implements Appointment {
	/**
	 * The default value of the '{@link #getAppointment_details() <em>Appointment details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment_details()
	 * @generated
	 * @ordered
	 */
	protected static final String APPOINTMENT_DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppointment_details() <em>Appointment details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment_details()
	 * @generated
	 * @ordered
	 */
	protected String appointment_details = APPOINTMENT_DETAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppointment_Date() <em>Appointment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment_Date()
	 * @generated
	 * @ordered
	 */
	protected static final Date APPOINTMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppointment_Date() <em>Appointment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment_Date()
	 * @generated
	 * @ordered
	 */
	protected Date appointment_Date = APPOINTMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_taken() <em>Time taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_taken()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_TAKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_taken() <em>Time taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_taken()
	 * @generated
	 * @ordered
	 */
	protected String time_taken = TIME_TAKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The default value of the '{@link #getApointment_booking_mode() <em>Apointment booking mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApointment_booking_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String APOINTMENT_BOOKING_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApointment_booking_mode() <em>Apointment booking mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApointment_booking_mode()
	 * @generated
	 * @ordered
	 */
	protected String apointment_booking_mode = APOINTMENT_BOOKING_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.APPOINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAppointment_details() {
		return appointment_details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppointment_details(String newAppointment_details) {
		String oldAppointment_details = appointment_details;
		appointment_details = newAppointment_details;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DETAILS, oldAppointment_details,
					appointment_details));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAppointment_Date() {
		return appointment_Date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppointment_Date(Date newAppointment_Date) {
		Date oldAppointment_Date = appointment_Date;
		appointment_Date = newAppointment_Date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DATE, oldAppointment_Date, appointment_Date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime_taken() {
		return time_taken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime_taken(String newTime_taken) {
		String oldTime_taken = time_taken;
		time_taken = newTime_taken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.APPOINTMENT__TIME_TAKEN,
					oldTime_taken, time_taken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject) patient;
			patient = (Patient) eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Diet_mdse_reserachPackage.APPOINTMENT__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.APPOINTMENT__PATIENT, oldPatient, newPatient);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatient(Patient newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject) patient).eInverseRemove(this, Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS,
						Patient.class, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject) newPatient).eInverseAdd(this, Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS,
						Patient.class, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.APPOINTMENT__PATIENT,
					newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApointment_booking_mode() {
		return apointment_booking_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApointment_booking_mode(String newApointment_booking_mode) {
		String oldApointment_booking_mode = apointment_booking_mode;
		apointment_booking_mode = newApointment_booking_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.APPOINTMENT__APOINTMENT_BOOKING_MODE, oldApointment_booking_mode,
					apointment_booking_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getPayment() {
		if (payment == null) {
			payment = new EObjectResolvingEList<Payment>(Payment.class, this,
					Diet_mdse_reserachPackage.APPOINTMENT__PAYMENT);
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.APPOINTMENT__PATIENT:
			if (patient != null)
				msgs = ((InternalEObject) patient).eInverseRemove(this, Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS,
						Patient.class, msgs);
			return basicSetPatient((Patient) otherEnd, msgs);
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
		case Diet_mdse_reserachPackage.APPOINTMENT__PATIENT:
			return basicSetPatient(null, msgs);
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
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DETAILS:
			return getAppointment_details();
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DATE:
			return getAppointment_Date();
		case Diet_mdse_reserachPackage.APPOINTMENT__TIME_TAKEN:
			return getTime_taken();
		case Diet_mdse_reserachPackage.APPOINTMENT__PATIENT:
			if (resolve)
				return getPatient();
			return basicGetPatient();
		case Diet_mdse_reserachPackage.APPOINTMENT__APOINTMENT_BOOKING_MODE:
			return getApointment_booking_mode();
		case Diet_mdse_reserachPackage.APPOINTMENT__PAYMENT:
			return getPayment();
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
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DETAILS:
			setAppointment_details((String) newValue);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DATE:
			setAppointment_Date((Date) newValue);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__TIME_TAKEN:
			setTime_taken((String) newValue);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__PATIENT:
			setPatient((Patient) newValue);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__APOINTMENT_BOOKING_MODE:
			setApointment_booking_mode((String) newValue);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__PAYMENT:
			getPayment().clear();
			getPayment().addAll((Collection<? extends Payment>) newValue);
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
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DETAILS:
			setAppointment_details(APPOINTMENT_DETAILS_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DATE:
			setAppointment_Date(APPOINTMENT_DATE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__TIME_TAKEN:
			setTime_taken(TIME_TAKEN_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__PATIENT:
			setPatient((Patient) null);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__APOINTMENT_BOOKING_MODE:
			setApointment_booking_mode(APOINTMENT_BOOKING_MODE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.APPOINTMENT__PAYMENT:
			getPayment().clear();
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
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DETAILS:
			return APPOINTMENT_DETAILS_EDEFAULT == null ? appointment_details != null
					: !APPOINTMENT_DETAILS_EDEFAULT.equals(appointment_details);
		case Diet_mdse_reserachPackage.APPOINTMENT__APPOINTMENT_DATE:
			return APPOINTMENT_DATE_EDEFAULT == null ? appointment_Date != null
					: !APPOINTMENT_DATE_EDEFAULT.equals(appointment_Date);
		case Diet_mdse_reserachPackage.APPOINTMENT__TIME_TAKEN:
			return TIME_TAKEN_EDEFAULT == null ? time_taken != null : !TIME_TAKEN_EDEFAULT.equals(time_taken);
		case Diet_mdse_reserachPackage.APPOINTMENT__PATIENT:
			return patient != null;
		case Diet_mdse_reserachPackage.APPOINTMENT__APOINTMENT_BOOKING_MODE:
			return APOINTMENT_BOOKING_MODE_EDEFAULT == null ? apointment_booking_mode != null
					: !APOINTMENT_BOOKING_MODE_EDEFAULT.equals(apointment_booking_mode);
		case Diet_mdse_reserachPackage.APPOINTMENT__PAYMENT:
			return payment != null && !payment.isEmpty();
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
		result.append(" (Appointment_details: ");
		result.append(appointment_details);
		result.append(", Appointment_Date: ");
		result.append(appointment_Date);
		result.append(", time_taken: ");
		result.append(time_taken);
		result.append(", apointment_booking_mode: ");
		result.append(apointment_booking_mode);
		result.append(')');
		return result.toString();
	}

} //AppointmentImpl
