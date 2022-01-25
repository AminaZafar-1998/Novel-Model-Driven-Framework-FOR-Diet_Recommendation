/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Appointment;
import diet_mdse_reserach.Dataset;
import diet_mdse_reserach.DietRecommendationSystem;
import diet_mdse_reserach.DietRecommendationType;
import diet_mdse_reserach.Diet_mdse_reserachFactory;
import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Doctor;
import diet_mdse_reserach.FoodType;
import diet_mdse_reserach.Glucose;
import diet_mdse_reserach.K_means;
import diet_mdse_reserach.ML_algo;
import diet_mdse_reserach.Medicine;
import diet_mdse_reserach.Nutritionist;
import diet_mdse_reserach.Patient;
import diet_mdse_reserach.Payment;
import diet_mdse_reserach.PerformanceMetric;
import diet_mdse_reserach.PredictedDietplan;
import diet_mdse_reserach.RandomForest;
import diet_mdse_reserach.SupportVectorMachine;
import diet_mdse_reserach.Symptoms;

import diet_mdse_reserach.util.Diet_mdse_reserachValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Diet_mdse_reserachPackageImpl extends EPackageImpl implements Diet_mdse_reserachPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dietRecommendationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mL_algoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomForestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictedDietplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass k_meansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportVectorMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symptomsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dietRecommendationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glucoseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum foodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType moneyEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Diet_mdse_reserachPackageImpl() {
		super(eNS_URI, Diet_mdse_reserachFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Diet_mdse_reserachPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Diet_mdse_reserachPackage init() {
		if (isInited)
			return (Diet_mdse_reserachPackage) EPackage.Registry.INSTANCE
					.getEPackage(Diet_mdse_reserachPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDiet_mdse_reserachPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Diet_mdse_reserachPackageImpl theDiet_mdse_reserachPackage = registeredDiet_mdse_reserachPackage instanceof Diet_mdse_reserachPackageImpl
				? (Diet_mdse_reserachPackageImpl) registeredDiet_mdse_reserachPackage
				: new Diet_mdse_reserachPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDiet_mdse_reserachPackage.createPackageContents();

		// Initialize created meta-data
		theDiet_mdse_reserachPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDiet_mdse_reserachPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return Diet_mdse_reserachValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theDiet_mdse_reserachPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Diet_mdse_reserachPackage.eNS_URI, theDiet_mdse_reserachPackage);
		return theDiet_mdse_reserachPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDietRecommendationSystem() {
		return dietRecommendationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Patients() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Nutritionists() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Medicines() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Doctors() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Appointments() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Payments() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Ml_algos() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Has_predict_diet_plans() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Performancemetric() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Symptoms() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDietRecommendationSystem_Dataset() {
		return (EReference) dietRecommendationSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDietRecommendationSystem_Diet_plan_recommendation() {
		return (EAttribute) dietRecommendationSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Name() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Height() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Weight() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Bmi() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Activity_level() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Gender() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Patient_type() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Glucose() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Glucose_level() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Payments() {
		return (EReference) patientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Appointments() {
		return (EReference) patientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Doctors() {
		return (EReference) patientEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Medicines() {
		return (EReference) patientEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Nutritionists() {
		return (EReference) patientEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Age() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Symptoms() {
		return (EReference) patientEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_Other_diseases() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Access_topredicteddietplans() {
		return (EReference) patientEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNutritionist() {
		return nutritionistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNutritionist_Name() {
		return (EAttribute) nutritionistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNutritionist_Address() {
		return (EAttribute) nutritionistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNutritionist_Phone_no() {
		return (EAttribute) nutritionistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNutritionist_Clinictimings() {
		return (EAttribute) nutritionistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutritionist_Patients() {
		return (EReference) nutritionistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutritionist_Fees() {
		return (EReference) nutritionistEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutritionist_Appointments() {
		return (EReference) nutritionistEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNutritionist_Predicteddietplans() {
		return (EReference) nutritionistEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppointment() {
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_Appointment_details() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_Appointment_Date() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_Time_taken() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppointment_Patient() {
		return (EReference) appointmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_Apointment_booking_mode() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppointment_Payment() {
		return (EReference) appointmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Payment_Id() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_Patient() {
		return (EReference) paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_CardType() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_CardNo() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Paid() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Payment_amount() {
		return (EAttribute) paymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoctor() {
		return doctorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Name() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Address() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Phone_no() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Clinictimings() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_Doctor_specailization() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Patients() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Medicines() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Fees() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Appointments() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Symptoms() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Access_to_predicteddietplan() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedicine() {
		return medicineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicine_Medicine_name() {
		return (EAttribute) medicineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedicine_Medicine_dossage() {
		return (EAttribute) medicineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedicine_Datasets() {
		return (EReference) medicineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getML_algo() {
		return mL_algoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getML_algo_Performancemetrices() {
		return (EReference) mL_algoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getML_algo_Generate_diet_plans() {
		return (EReference) mL_algoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getML_algo_Name() {
		return (EAttribute) mL_algoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getML_algo__RandomForest() {
		return mL_algoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getML_algo__K_means() {
		return mL_algoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getML_algo__Svm() {
		return mL_algoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRandomForest() {
		return randomForestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomForest_Creteria() {
		return (EAttribute) randomForestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredictedDietplan() {
		return predictedDietplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredictedDietplan_Food_name() {
		return (EAttribute) predictedDietplanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPredictedDietplan__Normalize_blood_sugar() {
		return predictedDietplanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPredictedDietplan__Weightloss() {
		return predictedDietplanEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getK_means() {
		return k_meansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getK_means_Number_Of_Cluster() {
		return (EAttribute) k_meansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataset() {
		return datasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Name() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Type() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Foodcalories() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataset_Food_type() {
		return (EAttribute) datasetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataset_Ml_algos() {
		return (EReference) datasetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportVectorMachine() {
		return supportVectorMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportVectorMachine_Kernel() {
		return (EAttribute) supportVectorMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportVectorMachine_C_value() {
		return (EAttribute) supportVectorMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportVectorMachine_Gamma_value() {
		return (EAttribute) supportVectorMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymptoms() {
		return symptomsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymptoms_Symptom_name() {
		return (EAttribute) symptomsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymptoms_Severitylevel() {
		return (EAttribute) symptomsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymptoms_Datasets() {
		return (EReference) symptomsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceMetric() {
		return performanceMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceMetric_Metrices() {
		return (EAttribute) performanceMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformanceMetric__Confusionmatrix() {
		return performanceMetricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformanceMetric__Accuracy_score() {
		return performanceMetricEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerformanceMetric__Classification_report() {
		return performanceMetricEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDietRecommendationType() {
		return dietRecommendationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGlucose() {
		return glucoseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFoodType() {
		return foodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMoney() {
		return moneyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diet_mdse_reserachFactory getDiet_mdse_reserachFactory() {
		return (Diet_mdse_reserachFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dietRecommendationSystemEClass = createEClass(DIET_RECOMMENDATION_SYSTEM);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__PATIENTS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__MEDICINES);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__DOCTORS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__PAYMENTS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__ML_ALGOS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__SYMPTOMS);
		createEReference(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__DATASET);
		createEAttribute(dietRecommendationSystemEClass, DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION);

		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__NAME);
		createEAttribute(patientEClass, PATIENT__HEIGHT);
		createEAttribute(patientEClass, PATIENT__WEIGHT);
		createEAttribute(patientEClass, PATIENT__BMI);
		createEAttribute(patientEClass, PATIENT__ACTIVITY_LEVEL);
		createEAttribute(patientEClass, PATIENT__GENDER);
		createEAttribute(patientEClass, PATIENT__PATIENT_TYPE);
		createEAttribute(patientEClass, PATIENT__GLUCOSE);
		createEAttribute(patientEClass, PATIENT__GLUCOSE_LEVEL);
		createEReference(patientEClass, PATIENT__PAYMENTS);
		createEReference(patientEClass, PATIENT__APPOINTMENTS);
		createEReference(patientEClass, PATIENT__DOCTORS);
		createEReference(patientEClass, PATIENT__MEDICINES);
		createEReference(patientEClass, PATIENT__NUTRITIONISTS);
		createEAttribute(patientEClass, PATIENT__AGE);
		createEReference(patientEClass, PATIENT__SYMPTOMS);
		createEAttribute(patientEClass, PATIENT__OTHER_DISEASES);
		createEReference(patientEClass, PATIENT__ACCESS_TOPREDICTEDDIETPLANS);

		nutritionistEClass = createEClass(NUTRITIONIST);
		createEAttribute(nutritionistEClass, NUTRITIONIST__NAME);
		createEAttribute(nutritionistEClass, NUTRITIONIST__ADDRESS);
		createEAttribute(nutritionistEClass, NUTRITIONIST__PHONE_NO);
		createEAttribute(nutritionistEClass, NUTRITIONIST__CLINICTIMINGS);
		createEReference(nutritionistEClass, NUTRITIONIST__PATIENTS);
		createEReference(nutritionistEClass, NUTRITIONIST__FEES);
		createEReference(nutritionistEClass, NUTRITIONIST__APPOINTMENTS);
		createEReference(nutritionistEClass, NUTRITIONIST__PREDICTEDDIETPLANS);

		appointmentEClass = createEClass(APPOINTMENT);
		createEAttribute(appointmentEClass, APPOINTMENT__APPOINTMENT_DETAILS);
		createEAttribute(appointmentEClass, APPOINTMENT__APPOINTMENT_DATE);
		createEAttribute(appointmentEClass, APPOINTMENT__TIME_TAKEN);
		createEReference(appointmentEClass, APPOINTMENT__PATIENT);
		createEAttribute(appointmentEClass, APPOINTMENT__APOINTMENT_BOOKING_MODE);
		createEReference(appointmentEClass, APPOINTMENT__PAYMENT);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_ID);
		createEReference(paymentEClass, PAYMENT__PATIENT);
		createEAttribute(paymentEClass, PAYMENT__CARD_TYPE);
		createEAttribute(paymentEClass, PAYMENT__CARD_NO);
		createEAttribute(paymentEClass, PAYMENT__PAID);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_AMOUNT);

		doctorEClass = createEClass(DOCTOR);
		createEAttribute(doctorEClass, DOCTOR__NAME);
		createEAttribute(doctorEClass, DOCTOR__ADDRESS);
		createEAttribute(doctorEClass, DOCTOR__PHONE_NO);
		createEAttribute(doctorEClass, DOCTOR__CLINICTIMINGS);
		createEAttribute(doctorEClass, DOCTOR__DOCTOR_SPECAILIZATION);
		createEReference(doctorEClass, DOCTOR__PATIENTS);
		createEReference(doctorEClass, DOCTOR__MEDICINES);
		createEReference(doctorEClass, DOCTOR__FEES);
		createEReference(doctorEClass, DOCTOR__APPOINTMENTS);
		createEReference(doctorEClass, DOCTOR__SYMPTOMS);
		createEReference(doctorEClass, DOCTOR__ACCESS_TO_PREDICTEDDIETPLAN);

		medicineEClass = createEClass(MEDICINE);
		createEAttribute(medicineEClass, MEDICINE__MEDICINE_NAME);
		createEAttribute(medicineEClass, MEDICINE__MEDICINE_DOSSAGE);
		createEReference(medicineEClass, MEDICINE__DATASETS);

		mL_algoEClass = createEClass(ML_ALGO);
		createEReference(mL_algoEClass, ML_ALGO__PERFORMANCEMETRICES);
		createEAttribute(mL_algoEClass, ML_ALGO__NAME);
		createEReference(mL_algoEClass, ML_ALGO__GENERATE_DIET_PLANS);
		createEOperation(mL_algoEClass, ML_ALGO___RANDOM_FOREST);
		createEOperation(mL_algoEClass, ML_ALGO___KMEANS);
		createEOperation(mL_algoEClass, ML_ALGO___SVM);

		randomForestEClass = createEClass(RANDOM_FOREST);
		createEAttribute(randomForestEClass, RANDOM_FOREST__CRETERIA);

		predictedDietplanEClass = createEClass(PREDICTED_DIETPLAN);
		createEAttribute(predictedDietplanEClass, PREDICTED_DIETPLAN__FOOD_NAME);
		createEOperation(predictedDietplanEClass, PREDICTED_DIETPLAN___NORMALIZE_BLOOD_SUGAR);
		createEOperation(predictedDietplanEClass, PREDICTED_DIETPLAN___WEIGHTLOSS);

		k_meansEClass = createEClass(KMEANS);
		createEAttribute(k_meansEClass, KMEANS__NUMBER_OF_CLUSTER);

		datasetEClass = createEClass(DATASET);
		createEAttribute(datasetEClass, DATASET__NAME);
		createEAttribute(datasetEClass, DATASET__TYPE);
		createEAttribute(datasetEClass, DATASET__FOODCALORIES);
		createEAttribute(datasetEClass, DATASET__FOOD_TYPE);
		createEReference(datasetEClass, DATASET__ML_ALGOS);

		supportVectorMachineEClass = createEClass(SUPPORT_VECTOR_MACHINE);
		createEAttribute(supportVectorMachineEClass, SUPPORT_VECTOR_MACHINE__KERNEL);
		createEAttribute(supportVectorMachineEClass, SUPPORT_VECTOR_MACHINE__CVALUE);
		createEAttribute(supportVectorMachineEClass, SUPPORT_VECTOR_MACHINE__GAMMA_VALUE);

		symptomsEClass = createEClass(SYMPTOMS);
		createEAttribute(symptomsEClass, SYMPTOMS__SYMPTOM_NAME);
		createEAttribute(symptomsEClass, SYMPTOMS__SEVERITYLEVEL);
		createEReference(symptomsEClass, SYMPTOMS__DATASETS);

		performanceMetricEClass = createEClass(PERFORMANCE_METRIC);
		createEAttribute(performanceMetricEClass, PERFORMANCE_METRIC__METRICES);
		createEOperation(performanceMetricEClass, PERFORMANCE_METRIC___CONFUSIONMATRIX);
		createEOperation(performanceMetricEClass, PERFORMANCE_METRIC___ACCURACY_SCORE);
		createEOperation(performanceMetricEClass, PERFORMANCE_METRIC___CLASSIFICATION_REPORT);

		// Create enums
		dietRecommendationTypeEEnum = createEEnum(DIET_RECOMMENDATION_TYPE);
		glucoseEEnum = createEEnum(GLUCOSE);
		foodTypeEEnum = createEEnum(FOOD_TYPE);

		// Create data types
		moneyEDataType = createEDataType(MONEY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		randomForestEClass.getESuperTypes().add(this.getML_algo());
		k_meansEClass.getESuperTypes().add(this.getML_algo());
		supportVectorMachineEClass.getESuperTypes().add(this.getML_algo());

		// Initialize classes, features, and operations; add parameters
		initEClass(dietRecommendationSystemEClass, DietRecommendationSystem.class, "DietRecommendationSystem",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDietRecommendationSystem_Patients(), this.getPatient(), null, "patients", null, 0, -1,
				DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Nutritionists(), this.getNutritionist(), null, "nutritionists", null,
				0, -1, DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Medicines(), this.getMedicine(), null, "medicines", null, 0, -1,
				DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Doctors(), this.getDoctor(), null, "doctors", null, 0, -1,
				DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Appointments(), this.getAppointment(), null, "appointments", null, 0,
				-1, DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Payments(), this.getPayment(), null, "payments", null, 0, -1,
				DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Ml_algos(), this.getML_algo(), null, "ml_algos", null, 1, -1,
				DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Has_predict_diet_plans(), this.getPredictedDietplan(), null,
				"has_predict_diet_plans", null, 1, -1, DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Performancemetric(), this.getPerformanceMetric(), null,
				"performancemetric", null, 0, -1, DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Symptoms(), this.getSymptoms(), null, "symptoms", null, 0, -1,
				DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDietRecommendationSystem_Dataset(), this.getDataset(), null, "dataset", null, 0, -1,
				DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDietRecommendationSystem_Diet_plan_recommendation(), this.getDietRecommendationType(),
				"Diet_plan_recommendation", null, 0, 1, DietRecommendationSystem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Height(), ecorePackage.getEString(), "height", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Bmi(), ecorePackage.getEString(), "bmi", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Activity_level(), ecorePackage.getEString(), "activity_level", null, 0, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Gender(), ecorePackage.getEString(), "gender", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Patient_type(), ecorePackage.getEString(), "patient_type", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Glucose(), this.getGlucose(), "glucose", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Glucose_level(), ecorePackage.getEString(), "glucose_level", null, 0, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Payments(), this.getPayment(), this.getPayment_Patient(), "payments", null, 0, -1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Appointments(), this.getAppointment(), this.getAppointment_Patient(), "appointments",
				null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Doctors(), this.getDoctor(), this.getDoctor_Patients(), "doctors", null, 0, -1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Medicines(), this.getMedicine(), null, "medicines", null, 0, -1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Nutritionists(), this.getNutritionist(), this.getNutritionist_Patients(),
				"nutritionists", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Symptoms(), this.getSymptoms(), null, "symptoms", null, 0, -1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Other_diseases(), ecorePackage.getEInt(), "other_diseases", "0", 1, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Access_topredicteddietplans(), this.getPredictedDietplan(), null,
				"access_topredicteddietplans", null, 1, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nutritionistEClass, Nutritionist.class, "Nutritionist", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNutritionist_Name(), ecorePackage.getEString(), "name", null, 0, 1, Nutritionist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNutritionist_Address(), ecorePackage.getEString(), "address", null, 0, 1, Nutritionist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNutritionist_Phone_no(), ecorePackage.getEInt(), "phone_no", null, 1, 1, Nutritionist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNutritionist_Clinictimings(), ecorePackage.getEString(), "clinictimings", null, 0, 1,
				Nutritionist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNutritionist_Patients(), this.getPatient(), this.getPatient_Nutritionists(), "patients", null,
				0, -1, Nutritionist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutritionist_Fees(), this.getPayment(), null, "fees", null, 0, -1, Nutritionist.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutritionist_Appointments(), this.getAppointment(), null, "appointments", null, 0, -1,
				Nutritionist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNutritionist_Predicteddietplans(), this.getPredictedDietplan(), null, "predicteddietplans",
				null, 1, -1, Nutritionist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appointmentEClass, Appointment.class, "Appointment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppointment_Appointment_details(), ecorePackage.getEString(), "Appointment_details", null, 0,
				1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Appointment_Date(), ecorePackage.getEDate(), "Appointment_Date", null, 0, 1,
				Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Time_taken(), ecorePackage.getEString(), "time_taken", null, 0, 1,
				Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Patient(), this.getPatient(), this.getPatient_Appointments(), "patient", null, 1,
				1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_Apointment_booking_mode(), ecorePackage.getEString(), "apointment_booking_mode",
				null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Payment(), this.getPayment(), null, "payment", null, 0, -1, Appointment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_Payment_Id(), ecorePackage.getEString(), "Payment_Id", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_Patient(), this.getPatient(), this.getPatient_Payments(), "patient", null, 1, 1,
				Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_CardType(), ecorePackage.getEString(), "cardType", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_CardNo(), ecorePackage.getEString(), "cardNo", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Paid(), ecorePackage.getEDate(), "paid", null, 0, 1, Payment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Payment_amount(), this.getMoney(), "Payment_amount", null, 0, 1, Payment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Address(), ecorePackage.getEString(), "address", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Phone_no(), ecorePackage.getEInt(), "phone_no", null, 1, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Clinictimings(), ecorePackage.getEString(), "clinictimings", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_Doctor_specailization(), ecorePackage.getEString(), "doctor_specailization", null, 0,
				1, Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Patients(), this.getPatient(), this.getPatient_Doctors(), "patients", null, 0, -1,
				Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Medicines(), this.getMedicine(), null, "medicines", null, 0, -1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Fees(), this.getPayment(), null, "fees", null, 0, -1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDoctor_Appointments(), this.getAppointment(), null, "appointments", null, 0, -1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Symptoms(), this.getSymptoms(), null, "symptoms", null, 0, -1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Access_to_predicteddietplan(), this.getPredictedDietplan(), null,
				"access_to_predicteddietplan", null, 1, -1, Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(medicineEClass, Medicine.class, "Medicine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedicine_Medicine_name(), ecorePackage.getEString(), "medicine_name", null, 0, 1,
				Medicine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicine_Medicine_dossage(), ecorePackage.getEString(), "medicine_dossage", null, 0, 1,
				Medicine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMedicine_Datasets(), this.getDataset(), null, "datasets", null, 1, -1, Medicine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mL_algoEClass, ML_algo.class, "ML_algo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getML_algo_Performancemetrices(), this.getPerformanceMetric(), null, "performancemetrices", null,
				0, -1, ML_algo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getML_algo_Name(), ecorePackage.getEString(), "name", null, 0, 1, ML_algo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getML_algo_Generate_diet_plans(), this.getPredictedDietplan(), null, "generate_diet_plans", null,
				1, -1, ML_algo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getML_algo__RandomForest(), null, "RandomForest", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getML_algo__K_means(), null, "k_means", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getML_algo__Svm(), null, "svm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(randomForestEClass, RandomForest.class, "RandomForest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandomForest_Creteria(), ecorePackage.getEString(), "creteria", null, 0, 1,
				RandomForest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(predictedDietplanEClass, PredictedDietplan.class, "PredictedDietplan", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredictedDietplan_Food_name(), ecorePackage.getEString(), "food_name", null, 0, 1,
				PredictedDietplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getPredictedDietplan__Normalize_blood_sugar(), null, "normalize_blood_sugar", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPredictedDietplan__Weightloss(), null, "weightloss", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(k_meansEClass, K_means.class, "K_means", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getK_means_Number_Of_Cluster(), ecorePackage.getEString(), "number_Of_Cluster", null, 0, 1,
				K_means.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(datasetEClass, Dataset.class, "Dataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dataset.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Type(), ecorePackage.getEString(), "type", null, 0, 1, Dataset.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Foodcalories(), ecorePackage.getEString(), "foodcalories", null, 0, 1, Dataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataset_Food_type(), this.getFoodType(), "Food_type", null, 0, 1, Dataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataset_Ml_algos(), this.getML_algo(), null, "ml_algos", null, 1, -1, Dataset.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportVectorMachineEClass, SupportVectorMachine.class, "SupportVectorMachine", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupportVectorMachine_Kernel(), ecorePackage.getEString(), "Kernel", null, 0, 1,
				SupportVectorMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportVectorMachine_C_value(), ecorePackage.getEString(), "c_value", null, 0, 1,
				SupportVectorMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportVectorMachine_Gamma_value(), ecorePackage.getEString(), "gamma_value", null, 0, 1,
				SupportVectorMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symptomsEClass, Symptoms.class, "Symptoms", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymptoms_Symptom_name(), ecorePackage.getEString(), "symptom_name", null, 0, 1,
				Symptoms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymptoms_Severitylevel(), ecorePackage.getEString(), "severitylevel", null, 0, 1,
				Symptoms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSymptoms_Datasets(), this.getDataset(), null, "datasets", null, 1, -1, Symptoms.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceMetricEClass, PerformanceMetric.class, "PerformanceMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceMetric_Metrices(), ecorePackage.getEString(), "metrices", null, 0, 1,
				PerformanceMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getPerformanceMetric__Confusionmatrix(), null, "confusionmatrix", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerformanceMetric__Accuracy_score(), null, "accuracy_score", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerformanceMetric__Classification_report(), null, "classification_report", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dietRecommendationTypeEEnum, DietRecommendationType.class, "DietRecommendationType");
		addEEnumLiteral(dietRecommendationTypeEEnum, DietRecommendationType.WEIGHT_LOSS);
		addEEnumLiteral(dietRecommendationTypeEEnum, DietRecommendationType.WEIGHT_GAIN);
		addEEnumLiteral(dietRecommendationTypeEEnum, DietRecommendationType.WEIGHT_MAINTAINENCE);

		initEEnum(glucoseEEnum, Glucose.class, "Glucose");
		addEEnumLiteral(glucoseEEnum, Glucose.FASTING);
		addEEnumLiteral(glucoseEEnum, Glucose.RANDOM);

		initEEnum(foodTypeEEnum, FoodType.class, "FoodType");
		addEEnumLiteral(foodTypeEEnum, FoodType.PROTIEN);
		addEEnumLiteral(foodTypeEEnum, FoodType.CARBOHYDRATE);

		// Initialize data types
		initEDataType(moneyEDataType, Integer.class, "Money", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(dietRecommendationSystemEClass, source, new String[] { "constraints", "patient_forbidden_food" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(dietRecommendationSystemEClass, source, new String[] { "patient_forbidden_food",
				"\n       self.patients.patient_type->includes(\'Type 2 diabetes\') implies self.has_predict_diet_plans.food_name->excludes(\'fried eggs\')" });
	}

} //Diet_mdse_reserachPackageImpl
