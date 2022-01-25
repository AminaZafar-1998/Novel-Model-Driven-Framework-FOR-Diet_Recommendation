/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nutritionist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getAddress <em>Address</em>}</li>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getClinictimings <em>Clinictimings</em>}</li>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getPatients <em>Patients</em>}</li>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getFees <em>Fees</em>}</li>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link diet_mdse_reserach.Nutritionist#getPredicteddietplans <em>Predicteddietplans</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist()
 * @model
 * @generated
 */
public interface Nutritionist extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Nutritionist#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Nutritionist#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone no</em>' attribute.
	 * @see #setPhone_no(int)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Phone_no()
	 * @model required="true"
	 * @generated
	 */
	int getPhone_no();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Nutritionist#getPhone_no <em>Phone no</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone no</em>' attribute.
	 * @see #getPhone_no()
	 * @generated
	 */
	void setPhone_no(int value);

	/**
	 * Returns the value of the '<em><b>Clinictimings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinictimings</em>' attribute.
	 * @see #setClinictimings(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Clinictimings()
	 * @model
	 * @generated
	 */
	String getClinictimings();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Nutritionist#getClinictimings <em>Clinictimings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinictimings</em>' attribute.
	 * @see #getClinictimings()
	 * @generated
	 */
	void setClinictimings(String value);

	/**
	 * Returns the value of the '<em><b>Patients</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Patient}.
	 * It is bidirectional and its opposite is '{@link diet_mdse_reserach.Patient#getNutritionists <em>Nutritionists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patients</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Patients()
	 * @see diet_mdse_reserach.Patient#getNutritionists
	 * @model opposite="nutritionists"
	 * @generated
	 */
	EList<Patient> getPatients();

	/**
	 * Returns the value of the '<em><b>Fees</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fees</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Fees()
	 * @model
	 * @generated
	 */
	EList<Payment> getFees();

	/**
	 * Returns the value of the '<em><b>Appointments</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Appointment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointments</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Appointments()
	 * @model
	 * @generated
	 */
	EList<Appointment> getAppointments();

	/**
	 * Returns the value of the '<em><b>Predicteddietplans</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.PredictedDietplan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicteddietplans</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getNutritionist_Predicteddietplans()
	 * @model required="true"
	 * @generated
	 */
	EList<PredictedDietplan> getPredicteddietplans();

} // Nutritionist
