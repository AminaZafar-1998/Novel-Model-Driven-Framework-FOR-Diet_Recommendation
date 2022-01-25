/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage
 * @generated
 */
public interface Diet_mdse_reserachFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Diet_mdse_reserachFactory eINSTANCE = diet_mdse_reserach.impl.Diet_mdse_reserachFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diet Recommendation System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diet Recommendation System</em>'.
	 * @generated
	 */
	DietRecommendationSystem createDietRecommendationSystem();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Nutritionist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutritionist</em>'.
	 * @generated
	 */
	Nutritionist createNutritionist();

	/**
	 * Returns a new object of class '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appointment</em>'.
	 * @generated
	 */
	Appointment createAppointment();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor</em>'.
	 * @generated
	 */
	Doctor createDoctor();

	/**
	 * Returns a new object of class '<em>Medicine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medicine</em>'.
	 * @generated
	 */
	Medicine createMedicine();

	/**
	 * Returns a new object of class '<em>Random Forest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Forest</em>'.
	 * @generated
	 */
	RandomForest createRandomForest();

	/**
	 * Returns a new object of class '<em>Predicted Dietplan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicted Dietplan</em>'.
	 * @generated
	 */
	PredictedDietplan createPredictedDietplan();

	/**
	 * Returns a new object of class '<em>Kmeans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kmeans</em>'.
	 * @generated
	 */
	K_means createK_means();

	/**
	 * Returns a new object of class '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset</em>'.
	 * @generated
	 */
	Dataset createDataset();

	/**
	 * Returns a new object of class '<em>Support Vector Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Vector Machine</em>'.
	 * @generated
	 */
	SupportVectorMachine createSupportVectorMachine();

	/**
	 * Returns a new object of class '<em>Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symptoms</em>'.
	 * @generated
	 */
	Symptoms createSymptoms();

	/**
	 * Returns a new object of class '<em>Performance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Metric</em>'.
	 * @generated
	 */
	PerformanceMetric createPerformanceMetric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Diet_mdse_reserachPackage getDiet_mdse_reserachPackage();

} //Diet_mdse_reserachFactory
