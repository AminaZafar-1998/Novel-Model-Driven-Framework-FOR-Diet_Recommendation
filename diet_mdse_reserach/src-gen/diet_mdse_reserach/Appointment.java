/**
 */
package diet_mdse_reserach;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.Appointment#getAppointment_details <em>Appointment details</em>}</li>
 *   <li>{@link diet_mdse_reserach.Appointment#getAppointment_Date <em>Appointment Date</em>}</li>
 *   <li>{@link diet_mdse_reserach.Appointment#getTime_taken <em>Time taken</em>}</li>
 *   <li>{@link diet_mdse_reserach.Appointment#getPatient <em>Patient</em>}</li>
 *   <li>{@link diet_mdse_reserach.Appointment#getApointment_booking_mode <em>Apointment booking mode</em>}</li>
 *   <li>{@link diet_mdse_reserach.Appointment#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getAppointment()
 * @model
 * @generated
 */
public interface Appointment extends EObject {
	/**
	 * Returns the value of the '<em><b>Appointment details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment details</em>' attribute.
	 * @see #setAppointment_details(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getAppointment_Appointment_details()
	 * @model
	 * @generated
	 */
	String getAppointment_details();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Appointment#getAppointment_details <em>Appointment details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment details</em>' attribute.
	 * @see #getAppointment_details()
	 * @generated
	 */
	void setAppointment_details(String value);

	/**
	 * Returns the value of the '<em><b>Appointment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Date</em>' attribute.
	 * @see #setAppointment_Date(Date)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getAppointment_Appointment_Date()
	 * @model
	 * @generated
	 */
	Date getAppointment_Date();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Appointment#getAppointment_Date <em>Appointment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Date</em>' attribute.
	 * @see #getAppointment_Date()
	 * @generated
	 */
	void setAppointment_Date(Date value);

	/**
	 * Returns the value of the '<em><b>Time taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time taken</em>' attribute.
	 * @see #setTime_taken(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getAppointment_Time_taken()
	 * @model
	 * @generated
	 */
	String getTime_taken();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Appointment#getTime_taken <em>Time taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time taken</em>' attribute.
	 * @see #getTime_taken()
	 * @generated
	 */
	void setTime_taken(String value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link diet_mdse_reserach.Patient#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getAppointment_Patient()
	 * @see diet_mdse_reserach.Patient#getAppointments
	 * @model opposite="appointments" required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Appointment#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Apointment booking mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apointment booking mode</em>' attribute.
	 * @see #setApointment_booking_mode(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getAppointment_Apointment_booking_mode()
	 * @model
	 * @generated
	 */
	String getApointment_booking_mode();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Appointment#getApointment_booking_mode <em>Apointment booking mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apointment booking mode</em>' attribute.
	 * @see #getApointment_booking_mode()
	 * @generated
	 */
	void setApointment_booking_mode(String value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getAppointment_Payment()
	 * @model
	 * @generated
	 */
	EList<Payment> getPayment();

} // Appointment
