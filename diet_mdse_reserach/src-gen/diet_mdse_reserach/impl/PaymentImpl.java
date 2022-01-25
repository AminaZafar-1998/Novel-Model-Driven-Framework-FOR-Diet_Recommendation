/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Patient;
import diet_mdse_reserach.Payment;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.PaymentImpl#getPayment_Id <em>Payment Id</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PaymentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PaymentImpl#getCardType <em>Card Type</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PaymentImpl#getCardNo <em>Card No</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PaymentImpl#getPaid <em>Paid</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PaymentImpl#getPayment_amount <em>Payment amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getPayment_Id() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_Id()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment_Id() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_Id()
	 * @generated
	 * @ordered
	 */
	protected String payment_Id = PAYMENT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCardType() <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardType() <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType()
	 * @generated
	 * @ordered
	 */
	protected String cardType = CARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardNo() <em>Card No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNo()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardNo() <em>Card No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNo()
	 * @generated
	 * @ordered
	 */
	protected String cardNo = CARD_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaid()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaid()
	 * @generated
	 * @ordered
	 */
	protected Date paid = PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayment_amount() <em>Payment amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_amount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PAYMENT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayment_amount() <em>Payment amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment_amount()
	 * @generated
	 * @ordered
	 */
	protected Integer payment_amount = PAYMENT_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayment_Id() {
		return payment_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_Id(String newPayment_Id) {
		String oldPayment_Id = payment_Id;
		payment_Id = newPayment_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PAYMENT__PAYMENT_ID,
					oldPayment_Id, payment_Id));
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
							Diet_mdse_reserachPackage.PAYMENT__PATIENT, oldPatient, patient));
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
					Diet_mdse_reserachPackage.PAYMENT__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject) patient).eInverseRemove(this, Diet_mdse_reserachPackage.PATIENT__PAYMENTS,
						Patient.class, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject) newPatient).eInverseAdd(this, Diet_mdse_reserachPackage.PATIENT__PAYMENTS,
						Patient.class, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PAYMENT__PATIENT,
					newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardType() {
		return cardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardType(String newCardType) {
		String oldCardType = cardType;
		cardType = newCardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PAYMENT__CARD_TYPE,
					oldCardType, cardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardNo(String newCardNo) {
		String oldCardNo = cardNo;
		cardNo = newCardNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PAYMENT__CARD_NO, oldCardNo,
					cardNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPaid() {
		return paid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaid(Date newPaid) {
		Date oldPaid = paid;
		paid = newPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PAYMENT__PAID, oldPaid,
					paid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPayment_amount() {
		return payment_amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayment_amount(Integer newPayment_amount) {
		Integer oldPayment_amount = payment_amount;
		payment_amount = newPayment_amount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PAYMENT__PAYMENT_AMOUNT,
					oldPayment_amount, payment_amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.PAYMENT__PATIENT:
			if (patient != null)
				msgs = ((InternalEObject) patient).eInverseRemove(this, Diet_mdse_reserachPackage.PATIENT__PAYMENTS,
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
		case Diet_mdse_reserachPackage.PAYMENT__PATIENT:
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
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_ID:
			return getPayment_Id();
		case Diet_mdse_reserachPackage.PAYMENT__PATIENT:
			if (resolve)
				return getPatient();
			return basicGetPatient();
		case Diet_mdse_reserachPackage.PAYMENT__CARD_TYPE:
			return getCardType();
		case Diet_mdse_reserachPackage.PAYMENT__CARD_NO:
			return getCardNo();
		case Diet_mdse_reserachPackage.PAYMENT__PAID:
			return getPaid();
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_AMOUNT:
			return getPayment_amount();
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
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_ID:
			setPayment_Id((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__PATIENT:
			setPatient((Patient) newValue);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__CARD_TYPE:
			setCardType((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__CARD_NO:
			setCardNo((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__PAID:
			setPaid((Date) newValue);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_AMOUNT:
			setPayment_amount((Integer) newValue);
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
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_ID:
			setPayment_Id(PAYMENT_ID_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__PATIENT:
			setPatient((Patient) null);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__CARD_TYPE:
			setCardType(CARD_TYPE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__CARD_NO:
			setCardNo(CARD_NO_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__PAID:
			setPaid(PAID_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_AMOUNT:
			setPayment_amount(PAYMENT_AMOUNT_EDEFAULT);
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
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_ID:
			return PAYMENT_ID_EDEFAULT == null ? payment_Id != null : !PAYMENT_ID_EDEFAULT.equals(payment_Id);
		case Diet_mdse_reserachPackage.PAYMENT__PATIENT:
			return patient != null;
		case Diet_mdse_reserachPackage.PAYMENT__CARD_TYPE:
			return CARD_TYPE_EDEFAULT == null ? cardType != null : !CARD_TYPE_EDEFAULT.equals(cardType);
		case Diet_mdse_reserachPackage.PAYMENT__CARD_NO:
			return CARD_NO_EDEFAULT == null ? cardNo != null : !CARD_NO_EDEFAULT.equals(cardNo);
		case Diet_mdse_reserachPackage.PAYMENT__PAID:
			return PAID_EDEFAULT == null ? paid != null : !PAID_EDEFAULT.equals(paid);
		case Diet_mdse_reserachPackage.PAYMENT__PAYMENT_AMOUNT:
			return PAYMENT_AMOUNT_EDEFAULT == null ? payment_amount != null
					: !PAYMENT_AMOUNT_EDEFAULT.equals(payment_amount);
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
		result.append(" (Payment_Id: ");
		result.append(payment_Id);
		result.append(", cardType: ");
		result.append(cardType);
		result.append(", cardNo: ");
		result.append(cardNo);
		result.append(", paid: ");
		result.append(paid);
		result.append(", Payment_amount: ");
		result.append(payment_amount);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
