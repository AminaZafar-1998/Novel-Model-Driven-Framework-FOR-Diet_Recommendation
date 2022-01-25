/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diet Recommendation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getPatients <em>Patients</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getNutritionists <em>Nutritionists</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getMedicines <em>Medicines</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getDoctors <em>Doctors</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getPayments <em>Payments</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getMl_algos <em>Ml algos</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getHas_predict_diet_plans <em>Has predict diet plans</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getPerformancemetric <em>Performancemetric</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getSymptoms <em>Symptoms</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getDataset <em>Dataset</em>}</li>
 *   <li>{@link diet_mdse_reserach.DietRecommendationSystem#getDiet_plan_recommendation <em>Diet plan recommendation</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patient_forbidden_food'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patient_forbidden_food='\n       self.patients.patient_type-&gt;includes(\'Type 2 diabetes\') implies self.has_predict_diet_plans.food_name-&gt;excludes(\'fried eggs\')'"
 * @generated
 */
public interface DietRecommendationSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Patients</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Patient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patients</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Patients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Patient> getPatients();

	/**
	 * Returns the value of the '<em><b>Nutritionists</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Nutritionist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nutritionists</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Nutritionists()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nutritionist> getNutritionists();

	/**
	 * Returns the value of the '<em><b>Medicines</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Medicine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicines</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Medicines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Medicine> getMedicines();

	/**
	 * Returns the value of the '<em><b>Doctors</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Doctor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctors</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Doctors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Doctor> getDoctors();

	/**
	 * Returns the value of the '<em><b>Appointments</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Appointment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointments</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Appointments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Appointment> getAppointments();

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Payments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Payment> getPayments();

	/**
	 * Returns the value of the '<em><b>Ml algos</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.ML_algo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ml algos</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Ml_algos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ML_algo> getMl_algos();

	/**
	 * Returns the value of the '<em><b>Has predict diet plans</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.PredictedDietplan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has predict diet plans</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Has_predict_diet_plans()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PredictedDietplan> getHas_predict_diet_plans();

	/**
	 * Returns the value of the '<em><b>Performancemetric</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.PerformanceMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performancemetric</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Performancemetric()
	 * @model containment="true"
	 * @generated
	 */
	EList<PerformanceMetric> getPerformancemetric();

	/**
	 * Returns the value of the '<em><b>Symptoms</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Symptoms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptoms</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Symptoms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symptoms> getSymptoms();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Dataset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dataset> getDataset();

	/**
	 * Returns the value of the '<em><b>Diet plan recommendation</b></em>' attribute.
	 * The literals are from the enumeration {@link diet_mdse_reserach.DietRecommendationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diet plan recommendation</em>' attribute.
	 * @see diet_mdse_reserach.DietRecommendationType
	 * @see #setDiet_plan_recommendation(DietRecommendationType)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationSystem_Diet_plan_recommendation()
	 * @model
	 * @generated
	 */
	DietRecommendationType getDiet_plan_recommendation();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.DietRecommendationSystem#getDiet_plan_recommendation <em>Diet plan recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diet plan recommendation</em>' attribute.
	 * @see diet_mdse_reserach.DietRecommendationType
	 * @see #getDiet_plan_recommendation()
	 * @generated
	 */
	void setDiet_plan_recommendation(DietRecommendationType value);

} // DietRecommendationSystem
