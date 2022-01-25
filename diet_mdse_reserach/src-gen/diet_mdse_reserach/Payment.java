/**
 */
package diet_mdse_reserach;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.Payment#getPayment_Id <em>Payment Id</em>}</li>
 *   <li>{@link diet_mdse_reserach.Payment#getPatient <em>Patient</em>}</li>
 *   <li>{@link diet_mdse_reserach.Payment#getCardType <em>Card Type</em>}</li>
 *   <li>{@link diet_mdse_reserach.Payment#getCardNo <em>Card No</em>}</li>
 *   <li>{@link diet_mdse_reserach.Payment#getPaid <em>Paid</em>}</li>
 *   <li>{@link diet_mdse_reserach.Payment#getPayment_amount <em>Payment amount</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' attribute.
	 * @see #setPayment_Id(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPayment_Payment_Id()
	 * @model
	 * @generated
	 */
	String getPayment_Id();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Payment#getPayment_Id <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPayment_Id()
	 * @generated
	 */
	void setPayment_Id(String value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link diet_mdse_reserach.Patient#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPayment_Patient()
	 * @see diet_mdse_reserach.Patient#getPayments
	 * @model opposite="payments" required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Payment#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Type</em>' attribute.
	 * @see #setCardType(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPayment_CardType()
	 * @model
	 * @generated
	 */
	String getCardType();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Payment#getCardType <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Type</em>' attribute.
	 * @see #getCardType()
	 * @generated
	 */
	void setCardType(String value);

	/**
	 * Returns the value of the '<em><b>Card No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card No</em>' attribute.
	 * @see #setCardNo(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPayment_CardNo()
	 * @model
	 * @generated
	 */
	String getCardNo();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Payment#getCardNo <em>Card No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card No</em>' attribute.
	 * @see #getCardNo()
	 * @generated
	 */
	void setCardNo(String value);

	/**
	 * Returns the value of the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid</em>' attribute.
	 * @see #setPaid(Date)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPayment_Paid()
	 * @model
	 * @generated
	 */
	Date getPaid();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Payment#getPaid <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid</em>' attribute.
	 * @see #getPaid()
	 * @generated
	 */
	void setPaid(Date value);

	/**
	 * Returns the value of the '<em><b>Payment amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment amount</em>' attribute.
	 * @see #setPayment_amount(Integer)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPayment_Payment_amount()
	 * @model dataType="diet_mdse_reserach.Money"
	 * @generated
	 */
	Integer getPayment_amount();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Payment#getPayment_amount <em>Payment amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment amount</em>' attribute.
	 * @see #getPayment_amount()
	 * @generated
	 */
	void setPayment_amount(Integer value);

} // Payment
