/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Diet_mdse_reserachFactoryImpl extends EFactoryImpl implements Diet_mdse_reserachFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Diet_mdse_reserachFactory init() {
		try {
			Diet_mdse_reserachFactory theDiet_mdse_reserachFactory = (Diet_mdse_reserachFactory) EPackage.Registry.INSTANCE
					.getEFactory(Diet_mdse_reserachPackage.eNS_URI);
			if (theDiet_mdse_reserachFactory != null) {
				return theDiet_mdse_reserachFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Diet_mdse_reserachFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet_mdse_reserachFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM:
			return createDietRecommendationSystem();
		case Diet_mdse_reserachPackage.PATIENT:
			return createPatient();
		case Diet_mdse_reserachPackage.NUTRITIONIST:
			return createNutritionist();
		case Diet_mdse_reserachPackage.APPOINTMENT:
			return createAppointment();
		case Diet_mdse_reserachPackage.PAYMENT:
			return createPayment();
		case Diet_mdse_reserachPackage.DOCTOR:
			return createDoctor();
		case Diet_mdse_reserachPackage.MEDICINE:
			return createMedicine();
		case Diet_mdse_reserachPackage.RANDOM_FOREST:
			return createRandomForest();
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN:
			return createPredictedDietplan();
		case Diet_mdse_reserachPackage.KMEANS:
			return createK_means();
		case Diet_mdse_reserachPackage.DATASET:
			return createDataset();
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE:
			return createSupportVectorMachine();
		case Diet_mdse_reserachPackage.SYMPTOMS:
			return createSymptoms();
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC:
			return createPerformanceMetric();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_TYPE:
			return createDietRecommendationTypeFromString(eDataType, initialValue);
		case Diet_mdse_reserachPackage.GLUCOSE:
			return createGlucoseFromString(eDataType, initialValue);
		case Diet_mdse_reserachPackage.FOOD_TYPE:
			return createFoodTypeFromString(eDataType, initialValue);
		case Diet_mdse_reserachPackage.MONEY:
			return createMoneyFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_TYPE:
			return convertDietRecommendationTypeToString(eDataType, instanceValue);
		case Diet_mdse_reserachPackage.GLUCOSE:
			return convertGlucoseToString(eDataType, instanceValue);
		case Diet_mdse_reserachPackage.FOOD_TYPE:
			return convertFoodTypeToString(eDataType, instanceValue);
		case Diet_mdse_reserachPackage.MONEY:
			return convertMoneyToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DietRecommendationSystem createDietRecommendationSystem() {
		DietRecommendationSystemImpl dietRecommendationSystem = new DietRecommendationSystemImpl();
		return dietRecommendationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nutritionist createNutritionist() {
		NutritionistImpl nutritionist = new NutritionistImpl();
		return nutritionist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appointment createAppointment() {
		AppointmentImpl appointment = new AppointmentImpl();
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Doctor createDoctor() {
		DoctorImpl doctor = new DoctorImpl();
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medicine createMedicine() {
		MedicineImpl medicine = new MedicineImpl();
		return medicine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomForest createRandomForest() {
		RandomForestImpl randomForest = new RandomForestImpl();
		return randomForest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredictedDietplan createPredictedDietplan() {
		PredictedDietplanImpl predictedDietplan = new PredictedDietplanImpl();
		return predictedDietplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public K_means createK_means() {
		K_meansImpl k_means = new K_meansImpl();
		return k_means;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportVectorMachine createSupportVectorMachine() {
		SupportVectorMachineImpl supportVectorMachine = new SupportVectorMachineImpl();
		return supportVectorMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Symptoms createSymptoms() {
		SymptomsImpl symptoms = new SymptomsImpl();
		return symptoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceMetric createPerformanceMetric() {
		PerformanceMetricImpl performanceMetric = new PerformanceMetricImpl();
		return performanceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DietRecommendationType createDietRecommendationTypeFromString(EDataType eDataType, String initialValue) {
		DietRecommendationType result = DietRecommendationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDietRecommendationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glucose createGlucoseFromString(EDataType eDataType, String initialValue) {
		Glucose result = Glucose.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlucoseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoodType createFoodTypeFromString(EDataType eDataType, String initialValue) {
		FoodType result = FoodType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFoodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createMoneyFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoneyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diet_mdse_reserachPackage getDiet_mdse_reserachPackage() {
		return (Diet_mdse_reserachPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Diet_mdse_reserachPackage getPackage() {
		return Diet_mdse_reserachPackage.eINSTANCE;
	}

} //Diet_mdse_reserachFactoryImpl
