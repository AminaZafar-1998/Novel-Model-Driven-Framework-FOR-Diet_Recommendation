/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.Doctor#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getAddress <em>Address</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getPhone_no <em>Phone no</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getClinictimings <em>Clinictimings</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getDoctor_specailization <em>Doctor specailization</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getPatients <em>Patients</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getMedicines <em>Medicines</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getFees <em>Fees</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getSymptoms <em>Symptoms</em>}</li>
 *   <li>{@link diet_mdse_reserach.Doctor#getAccess_to_predicteddietplan <em>Access to predicteddietplan</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor()
 * @model
 * @generated
 */
public interface Doctor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Doctor#getName <em>Name</em>}' attribute.
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
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Doctor#getAddress <em>Address</em>}' attribute.
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
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Phone_no()
	 * @model required="true"
	 * @generated
	 */
	int getPhone_no();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Doctor#getPhone_no <em>Phone no</em>}' attribute.
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
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Clinictimings()
	 * @model
	 * @generated
	 */
	String getClinictimings();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Doctor#getClinictimings <em>Clinictimings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinictimings</em>' attribute.
	 * @see #getClinictimings()
	 * @generated
	 */
	void setClinictimings(String value);

	/**
	 * Returns the value of the '<em><b>Doctor specailization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor specailization</em>' attribute.
	 * @see #setDoctor_specailization(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Doctor_specailization()
	 * @model
	 * @generated
	 */
	String getDoctor_specailization();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Doctor#getDoctor_specailization <em>Doctor specailization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctor specailization</em>' attribute.
	 * @see #getDoctor_specailization()
	 * @generated
	 */
	void setDoctor_specailization(String value);

	/**
	 * Returns the value of the '<em><b>Patients</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Patient}.
	 * It is bidirectional and its opposite is '{@link diet_mdse_reserach.Patient#getDoctors <em>Doctors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patients</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Patients()
	 * @see diet_mdse_reserach.Patient#getDoctors
	 * @model opposite="doctors"
	 * @generated
	 */
	EList<Patient> getPatients();

	/**
	 * Returns the value of the '<em><b>Medicines</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Medicine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicines</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Medicines()
	 * @model
	 * @generated
	 */
	EList<Medicine> getMedicines();

	/**
	 * Returns the value of the '<em><b>Fees</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fees</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Fees()
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
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Appointments()
	 * @model
	 * @generated
	 */
	EList<Appointment> getAppointments();

	/**
	 * Returns the value of the '<em><b>Symptoms</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Symptoms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptoms</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Symptoms()
	 * @model
	 * @generated
	 */
	EList<Symptoms> getSymptoms();

	/**
	 * Returns the value of the '<em><b>Access to predicteddietplan</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.PredictedDietplan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access to predicteddietplan</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDoctor_Access_to_predicteddietplan()
	 * @model required="true"
	 * @generated
	 */
	EList<PredictedDietplan> getAccess_to_predicteddietplan();

} // Doctor
