/**
 */
package diet_mdse_reserach.util;

import diet_mdse_reserach.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage
 * @generated
 */
public class Diet_mdse_reserachValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Diet_mdse_reserachValidator INSTANCE = new Diet_mdse_reserachValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "diet_mdse_reserach";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet_mdse_reserachValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Diet_mdse_reserachPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM:
			return validateDietRecommendationSystem((DietRecommendationSystem) value, diagnostics, context);
		case Diet_mdse_reserachPackage.PATIENT:
			return validatePatient((Patient) value, diagnostics, context);
		case Diet_mdse_reserachPackage.NUTRITIONIST:
			return validateNutritionist((Nutritionist) value, diagnostics, context);
		case Diet_mdse_reserachPackage.APPOINTMENT:
			return validateAppointment((Appointment) value, diagnostics, context);
		case Diet_mdse_reserachPackage.PAYMENT:
			return validatePayment((Payment) value, diagnostics, context);
		case Diet_mdse_reserachPackage.DOCTOR:
			return validateDoctor((Doctor) value, diagnostics, context);
		case Diet_mdse_reserachPackage.MEDICINE:
			return validateMedicine((Medicine) value, diagnostics, context);
		case Diet_mdse_reserachPackage.ML_ALGO:
			return validateML_algo((ML_algo) value, diagnostics, context);
		case Diet_mdse_reserachPackage.RANDOM_FOREST:
			return validateRandomForest((RandomForest) value, diagnostics, context);
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN:
			return validatePredictedDietplan((PredictedDietplan) value, diagnostics, context);
		case Diet_mdse_reserachPackage.KMEANS:
			return validateK_means((K_means) value, diagnostics, context);
		case Diet_mdse_reserachPackage.DATASET:
			return validateDataset((Dataset) value, diagnostics, context);
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE:
			return validateSupportVectorMachine((SupportVectorMachine) value, diagnostics, context);
		case Diet_mdse_reserachPackage.SYMPTOMS:
			return validateSymptoms((Symptoms) value, diagnostics, context);
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC:
			return validatePerformanceMetric((PerformanceMetric) value, diagnostics, context);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_TYPE:
			return validateDietRecommendationType((DietRecommendationType) value, diagnostics, context);
		case Diet_mdse_reserachPackage.GLUCOSE:
			return validateGlucose((Glucose) value, diagnostics, context);
		case Diet_mdse_reserachPackage.FOOD_TYPE:
			return validateFoodType((FoodType) value, diagnostics, context);
		case Diet_mdse_reserachPackage.MONEY:
			return validateMoney((Integer) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDietRecommendationSystem(DietRecommendationSystem dietRecommendationSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dietRecommendationSystem, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dietRecommendationSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDietRecommendationSystem_patient_forbidden_food(dietRecommendationSystem, diagnostics,
					context);
		return result;
	}

	/**
	 * The cached validation expression for the patient_forbidden_food constraint of '<em>Diet Recommendation System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DIET_RECOMMENDATION_SYSTEM__PATIENT_FORBIDDEN_FOOD__EEXPRESSION = "\n"
			+ "       self.patients.patient_type->includes('Type 2 diabetes') implies self.has_predict_diet_plans.food_name->excludes('fried eggs')";

	/**
	 * Validates the patient_forbidden_food constraint of '<em>Diet Recommendation System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDietRecommendationSystem_patient_forbidden_food(
			DietRecommendationSystem dietRecommendationSystem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM, dietRecommendationSystem,
				diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "patient_forbidden_food",
				DIET_RECOMMENDATION_SYSTEM__PATIENT_FORBIDDEN_FOOD__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNutritionist(Nutritionist nutritionist, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nutritionist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppointment(Appointment appointment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appointment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoctor(Doctor doctor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doctor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicine(Medicine medicine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medicine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateML_algo(ML_algo mL_algo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mL_algo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRandomForest(RandomForest randomForest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(randomForest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredictedDietplan(PredictedDietplan predictedDietplan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predictedDietplan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateK_means(K_means k_means, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(k_means, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataset(Dataset dataset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportVectorMachine(SupportVectorMachine supportVectorMachine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportVectorMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymptoms(Symptoms symptoms, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symptoms, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceMetric(PerformanceMetric performanceMetric, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceMetric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDietRecommendationType(DietRecommendationType dietRecommendationType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlucose(Glucose glucose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFoodType(FoodType foodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoney(Integer money, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Diet_mdse_reserachValidator
