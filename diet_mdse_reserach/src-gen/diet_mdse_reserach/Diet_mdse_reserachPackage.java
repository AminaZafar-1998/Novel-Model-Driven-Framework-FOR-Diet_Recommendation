/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see diet_mdse_reserach.Diet_mdse_reserachFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Diet_mdse_reserachPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diet_mdse_reserach";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/diet_mdse_reserach";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diet_mdse_reserach";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Diet_mdse_reserachPackage eINSTANCE = diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl.init();

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl <em>Diet Recommendation System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.DietRecommendationSystemImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDietRecommendationSystem()
	 * @generated
	 */
	int DIET_RECOMMENDATION_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Patients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__PATIENTS = 0;

	/**
	 * The feature id for the '<em><b>Nutritionists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS = 1;

	/**
	 * The feature id for the '<em><b>Medicines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__MEDICINES = 2;

	/**
	 * The feature id for the '<em><b>Doctors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__DOCTORS = 3;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS = 4;

	/**
	 * The feature id for the '<em><b>Payments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__PAYMENTS = 5;

	/**
	 * The feature id for the '<em><b>Ml algos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__ML_ALGOS = 6;

	/**
	 * The feature id for the '<em><b>Has predict diet plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS = 7;

	/**
	 * The feature id for the '<em><b>Performancemetric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC = 8;

	/**
	 * The feature id for the '<em><b>Symptoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__SYMPTOMS = 9;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__DATASET = 10;

	/**
	 * The feature id for the '<em><b>Diet plan recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION = 11;

	/**
	 * The number of structural features of the '<em>Diet Recommendation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Diet Recommendation System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIET_RECOMMENDATION_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.PatientImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Bmi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BMI = 3;

	/**
	 * The feature id for the '<em><b>Activity level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTIVITY_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GENDER = 5;

	/**
	 * The feature id for the '<em><b>Patient type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Glucose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GLUCOSE = 7;

	/**
	 * The feature id for the '<em><b>Glucose level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GLUCOSE_LEVEL = 8;

	/**
	 * The feature id for the '<em><b>Payments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PAYMENTS = 9;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__APPOINTMENTS = 10;

	/**
	 * The feature id for the '<em><b>Doctors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DOCTORS = 11;

	/**
	 * The feature id for the '<em><b>Medicines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MEDICINES = 12;

	/**
	 * The feature id for the '<em><b>Nutritionists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__NUTRITIONISTS = 13;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__AGE = 14;

	/**
	 * The feature id for the '<em><b>Symptoms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__SYMPTOMS = 15;

	/**
	 * The feature id for the '<em><b>Other diseases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__OTHER_DISEASES = 16;

	/**
	 * The feature id for the '<em><b>Access topredicteddietplans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACCESS_TOPREDICTEDDIETPLANS = 17;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.NutritionistImpl <em>Nutritionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.NutritionistImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getNutritionist()
	 * @generated
	 */
	int NUTRITIONIST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__PHONE_NO = 2;

	/**
	 * The feature id for the '<em><b>Clinictimings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__CLINICTIMINGS = 3;

	/**
	 * The feature id for the '<em><b>Patients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__PATIENTS = 4;

	/**
	 * The feature id for the '<em><b>Fees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__FEES = 5;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__APPOINTMENTS = 6;

	/**
	 * The feature id for the '<em><b>Predicteddietplans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST__PREDICTEDDIETPLANS = 7;

	/**
	 * The number of structural features of the '<em>Nutritionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Nutritionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTRITIONIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.AppointmentImpl <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.AppointmentImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getAppointment()
	 * @generated
	 */
	int APPOINTMENT = 3;

	/**
	 * The feature id for the '<em><b>Appointment details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__APPOINTMENT_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Appointment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__APPOINTMENT_DATE = 1;

	/**
	 * The feature id for the '<em><b>Time taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__TIME_TAKEN = 2;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PATIENT = 3;

	/**
	 * The feature id for the '<em><b>Apointment booking mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__APOINTMENT_BOOKING_MODE = 4;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PAYMENT = 5;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.PaymentImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 4;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PATIENT = 1;

	/**
	 * The feature id for the '<em><b>Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__CARD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Card No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__CARD_NO = 3;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAID = 4;

	/**
	 * The feature id for the '<em><b>Payment amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_AMOUNT = 5;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.DoctorImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Phone no</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PHONE_NO = 2;

	/**
	 * The feature id for the '<em><b>Clinictimings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__CLINICTIMINGS = 3;

	/**
	 * The feature id for the '<em><b>Doctor specailization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__DOCTOR_SPECAILIZATION = 4;

	/**
	 * The feature id for the '<em><b>Patients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PATIENTS = 5;

	/**
	 * The feature id for the '<em><b>Medicines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__MEDICINES = 6;

	/**
	 * The feature id for the '<em><b>Fees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__FEES = 7;

	/**
	 * The feature id for the '<em><b>Appointments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__APPOINTMENTS = 8;

	/**
	 * The feature id for the '<em><b>Symptoms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__SYMPTOMS = 9;

	/**
	 * The feature id for the '<em><b>Access to predicteddietplan</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__ACCESS_TO_PREDICTEDDIETPLAN = 10;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.MedicineImpl <em>Medicine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.MedicineImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getMedicine()
	 * @generated
	 */
	int MEDICINE = 6;

	/**
	 * The feature id for the '<em><b>Medicine name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__MEDICINE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Medicine dossage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__MEDICINE_DOSSAGE = 1;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE__DATASETS = 2;

	/**
	 * The number of structural features of the '<em>Medicine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Medicine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.ML_algoImpl <em>ML algo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.ML_algoImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getML_algo()
	 * @generated
	 */
	int ML_ALGO = 7;

	/**
	 * The feature id for the '<em><b>Performancemetrices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO__PERFORMANCEMETRICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Generate diet plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO__GENERATE_DIET_PLANS = 2;

	/**
	 * The number of structural features of the '<em>ML algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Random Forest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO___RANDOM_FOREST = 0;

	/**
	 * The operation id for the '<em>Kmeans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO___KMEANS = 1;

	/**
	 * The operation id for the '<em>Svm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO___SVM = 2;

	/**
	 * The number of operations of the '<em>ML algo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGO_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.RandomForestImpl <em>Random Forest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.RandomForestImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getRandomForest()
	 * @generated
	 */
	int RANDOM_FOREST = 8;

	/**
	 * The feature id for the '<em><b>Performancemetrices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST__PERFORMANCEMETRICES = ML_ALGO__PERFORMANCEMETRICES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST__NAME = ML_ALGO__NAME;

	/**
	 * The feature id for the '<em><b>Generate diet plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST__GENERATE_DIET_PLANS = ML_ALGO__GENERATE_DIET_PLANS;

	/**
	 * The feature id for the '<em><b>Creteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST__CRETERIA = ML_ALGO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_FEATURE_COUNT = ML_ALGO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Random Forest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST___RANDOM_FOREST = ML_ALGO___RANDOM_FOREST;

	/**
	 * The operation id for the '<em>Kmeans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST___KMEANS = ML_ALGO___KMEANS;

	/**
	 * The operation id for the '<em>Svm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST___SVM = ML_ALGO___SVM;

	/**
	 * The number of operations of the '<em>Random Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_OPERATION_COUNT = ML_ALGO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.PredictedDietplanImpl <em>Predicted Dietplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.PredictedDietplanImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPredictedDietplan()
	 * @generated
	 */
	int PREDICTED_DIETPLAN = 9;

	/**
	 * The feature id for the '<em><b>Food name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DIETPLAN__FOOD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Predicted Dietplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DIETPLAN_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Normalize blood sugar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DIETPLAN___NORMALIZE_BLOOD_SUGAR = 0;

	/**
	 * The operation id for the '<em>Weightloss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DIETPLAN___WEIGHTLOSS = 1;

	/**
	 * The number of operations of the '<em>Predicted Dietplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTED_DIETPLAN_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.K_meansImpl <em>Kmeans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.K_meansImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getK_means()
	 * @generated
	 */
	int KMEANS = 10;

	/**
	 * The feature id for the '<em><b>Performancemetrices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__PERFORMANCEMETRICES = ML_ALGO__PERFORMANCEMETRICES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__NAME = ML_ALGO__NAME;

	/**
	 * The feature id for the '<em><b>Generate diet plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__GENERATE_DIET_PLANS = ML_ALGO__GENERATE_DIET_PLANS;

	/**
	 * The feature id for the '<em><b>Number Of Cluster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__NUMBER_OF_CLUSTER = ML_ALGO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kmeans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS_FEATURE_COUNT = ML_ALGO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Random Forest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS___RANDOM_FOREST = ML_ALGO___RANDOM_FOREST;

	/**
	 * The operation id for the '<em>Kmeans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS___KMEANS = ML_ALGO___KMEANS;

	/**
	 * The operation id for the '<em>Svm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS___SVM = ML_ALGO___SVM;

	/**
	 * The number of operations of the '<em>Kmeans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS_OPERATION_COUNT = ML_ALGO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.DatasetImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Foodcalories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__FOODCALORIES = 2;

	/**
	 * The feature id for the '<em><b>Food type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__FOOD_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Ml algos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__ML_ALGOS = 4;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.SupportVectorMachineImpl <em>Support Vector Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.SupportVectorMachineImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getSupportVectorMachine()
	 * @generated
	 */
	int SUPPORT_VECTOR_MACHINE = 12;

	/**
	 * The feature id for the '<em><b>Performancemetrices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE__PERFORMANCEMETRICES = ML_ALGO__PERFORMANCEMETRICES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE__NAME = ML_ALGO__NAME;

	/**
	 * The feature id for the '<em><b>Generate diet plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE__GENERATE_DIET_PLANS = ML_ALGO__GENERATE_DIET_PLANS;

	/**
	 * The feature id for the '<em><b>Kernel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE__KERNEL = ML_ALGO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE__CVALUE = ML_ALGO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gamma value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE__GAMMA_VALUE = ML_ALGO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Support Vector Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE_FEATURE_COUNT = ML_ALGO_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Random Forest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE___RANDOM_FOREST = ML_ALGO___RANDOM_FOREST;

	/**
	 * The operation id for the '<em>Kmeans</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE___KMEANS = ML_ALGO___KMEANS;

	/**
	 * The operation id for the '<em>Svm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE___SVM = ML_ALGO___SVM;

	/**
	 * The number of operations of the '<em>Support Vector Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_VECTOR_MACHINE_OPERATION_COUNT = ML_ALGO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.SymptomsImpl <em>Symptoms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.SymptomsImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getSymptoms()
	 * @generated
	 */
	int SYMPTOMS = 13;

	/**
	 * The feature id for the '<em><b>Symptom name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS__SYMPTOM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Severitylevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS__SEVERITYLEVEL = 1;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS__DATASETS = 2;

	/**
	 * The number of structural features of the '<em>Symptoms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Symptoms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPTOMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.impl.PerformanceMetricImpl <em>Performance Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.impl.PerformanceMetricImpl
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPerformanceMetric()
	 * @generated
	 */
	int PERFORMANCE_METRIC = 14;

	/**
	 * The feature id for the '<em><b>Metrices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC__METRICES = 0;

	/**
	 * The number of structural features of the '<em>Performance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Confusionmatrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC___CONFUSIONMATRIX = 0;

	/**
	 * The operation id for the '<em>Accuracy score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC___ACCURACY_SCORE = 1;

	/**
	 * The operation id for the '<em>Classification report</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC___CLASSIFICATION_REPORT = 2;

	/**
	 * The number of operations of the '<em>Performance Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_METRIC_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.DietRecommendationType <em>Diet Recommendation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.DietRecommendationType
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDietRecommendationType()
	 * @generated
	 */
	int DIET_RECOMMENDATION_TYPE = 15;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.Glucose <em>Glucose</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.Glucose
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getGlucose()
	 * @generated
	 */
	int GLUCOSE = 16;

	/**
	 * The meta object id for the '{@link diet_mdse_reserach.FoodType <em>Food Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diet_mdse_reserach.FoodType
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getFoodType()
	 * @generated
	 */
	int FOOD_TYPE = 17;

	/**
	 * The meta object id for the '<em>Money</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getMoney()
	 * @generated
	 */
	int MONEY = 18;

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.DietRecommendationSystem <em>Diet Recommendation System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diet Recommendation System</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem
	 * @generated
	 */
	EClass getDietRecommendationSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getPatients <em>Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patients</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getPatients()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Patients();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getNutritionists <em>Nutritionists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nutritionists</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getNutritionists()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Nutritionists();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getMedicines <em>Medicines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicines</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getMedicines()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Medicines();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getDoctors <em>Doctors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doctors</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getDoctors()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Doctors();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appointments</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getAppointments()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Appointments();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payments</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getPayments()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Payments();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getMl_algos <em>Ml algos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ml algos</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getMl_algos()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Ml_algos();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getHas_predict_diet_plans <em>Has predict diet plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has predict diet plans</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getHas_predict_diet_plans()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Has_predict_diet_plans();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getPerformancemetric <em>Performancemetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performancemetric</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getPerformancemetric()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Performancemetric();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getSymptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symptoms</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getSymptoms()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Symptoms();

	/**
	 * Returns the meta object for the containment reference list '{@link diet_mdse_reserach.DietRecommendationSystem#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataset</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getDataset()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EReference getDietRecommendationSystem_Dataset();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.DietRecommendationSystem#getDiet_plan_recommendation <em>Diet plan recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diet plan recommendation</em>'.
	 * @see diet_mdse_reserach.DietRecommendationSystem#getDiet_plan_recommendation()
	 * @see #getDietRecommendationSystem()
	 * @generated
	 */
	EAttribute getDietRecommendationSystem_Diet_plan_recommendation();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see diet_mdse_reserach.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diet_mdse_reserach.Patient#getName()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Name();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see diet_mdse_reserach.Patient#getHeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Height();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see diet_mdse_reserach.Patient#getWeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Weight();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getBmi <em>Bmi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bmi</em>'.
	 * @see diet_mdse_reserach.Patient#getBmi()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Bmi();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getActivity_level <em>Activity level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity level</em>'.
	 * @see diet_mdse_reserach.Patient#getActivity_level()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Activity_level();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see diet_mdse_reserach.Patient#getGender()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Gender();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getPatient_type <em>Patient type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient type</em>'.
	 * @see diet_mdse_reserach.Patient#getPatient_type()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Patient_type();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getGlucose <em>Glucose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glucose</em>'.
	 * @see diet_mdse_reserach.Patient#getGlucose()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Glucose();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getGlucose_level <em>Glucose level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glucose level</em>'.
	 * @see diet_mdse_reserach.Patient#getGlucose_level()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Glucose_level();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Patient#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payments</em>'.
	 * @see diet_mdse_reserach.Patient#getPayments()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Payments();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Patient#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointments</em>'.
	 * @see diet_mdse_reserach.Patient#getAppointments()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Appointments();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Patient#getDoctors <em>Doctors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doctors</em>'.
	 * @see diet_mdse_reserach.Patient#getDoctors()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Doctors();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Patient#getMedicines <em>Medicines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Medicines</em>'.
	 * @see diet_mdse_reserach.Patient#getMedicines()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Medicines();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Patient#getNutritionists <em>Nutritionists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nutritionists</em>'.
	 * @see diet_mdse_reserach.Patient#getNutritionists()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Nutritionists();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see diet_mdse_reserach.Patient#getAge()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Age();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Patient#getSymptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Symptoms</em>'.
	 * @see diet_mdse_reserach.Patient#getSymptoms()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Symptoms();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Patient#getOther_diseases <em>Other diseases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other diseases</em>'.
	 * @see diet_mdse_reserach.Patient#getOther_diseases()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Other_diseases();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Patient#getAccess_topredicteddietplans <em>Access topredicteddietplans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access topredicteddietplans</em>'.
	 * @see diet_mdse_reserach.Patient#getAccess_topredicteddietplans()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Access_topredicteddietplans();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Nutritionist <em>Nutritionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nutritionist</em>'.
	 * @see diet_mdse_reserach.Nutritionist
	 * @generated
	 */
	EClass getNutritionist();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Nutritionist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getName()
	 * @see #getNutritionist()
	 * @generated
	 */
	EAttribute getNutritionist_Name();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Nutritionist#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getAddress()
	 * @see #getNutritionist()
	 * @generated
	 */
	EAttribute getNutritionist_Address();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Nutritionist#getPhone_no <em>Phone no</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone no</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getPhone_no()
	 * @see #getNutritionist()
	 * @generated
	 */
	EAttribute getNutritionist_Phone_no();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Nutritionist#getClinictimings <em>Clinictimings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinictimings</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getClinictimings()
	 * @see #getNutritionist()
	 * @generated
	 */
	EAttribute getNutritionist_Clinictimings();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Nutritionist#getPatients <em>Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patients</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getPatients()
	 * @see #getNutritionist()
	 * @generated
	 */
	EReference getNutritionist_Patients();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Nutritionist#getFees <em>Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fees</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getFees()
	 * @see #getNutritionist()
	 * @generated
	 */
	EReference getNutritionist_Fees();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Nutritionist#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointments</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getAppointments()
	 * @see #getNutritionist()
	 * @generated
	 */
	EReference getNutritionist_Appointments();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Nutritionist#getPredicteddietplans <em>Predicteddietplans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicteddietplans</em>'.
	 * @see diet_mdse_reserach.Nutritionist#getPredicteddietplans()
	 * @see #getNutritionist()
	 * @generated
	 */
	EReference getNutritionist_Predicteddietplans();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see diet_mdse_reserach.Appointment
	 * @generated
	 */
	EClass getAppointment();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Appointment#getAppointment_details <em>Appointment details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appointment details</em>'.
	 * @see diet_mdse_reserach.Appointment#getAppointment_details()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Appointment_details();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Appointment#getAppointment_Date <em>Appointment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appointment Date</em>'.
	 * @see diet_mdse_reserach.Appointment#getAppointment_Date()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Appointment_Date();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Appointment#getTime_taken <em>Time taken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time taken</em>'.
	 * @see diet_mdse_reserach.Appointment#getTime_taken()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Time_taken();

	/**
	 * Returns the meta object for the reference '{@link diet_mdse_reserach.Appointment#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patient</em>'.
	 * @see diet_mdse_reserach.Appointment#getPatient()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Patient();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Appointment#getApointment_booking_mode <em>Apointment booking mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apointment booking mode</em>'.
	 * @see diet_mdse_reserach.Appointment#getApointment_booking_mode()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_Apointment_booking_mode();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Appointment#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment</em>'.
	 * @see diet_mdse_reserach.Appointment#getPayment()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Payment();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see diet_mdse_reserach.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Payment#getPayment_Id <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Id</em>'.
	 * @see diet_mdse_reserach.Payment#getPayment_Id()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Payment_Id();

	/**
	 * Returns the meta object for the reference '{@link diet_mdse_reserach.Payment#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patient</em>'.
	 * @see diet_mdse_reserach.Payment#getPatient()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_Patient();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Payment#getCardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Type</em>'.
	 * @see diet_mdse_reserach.Payment#getCardType()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_CardType();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Payment#getCardNo <em>Card No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card No</em>'.
	 * @see diet_mdse_reserach.Payment#getCardNo()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_CardNo();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Payment#getPaid <em>Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid</em>'.
	 * @see diet_mdse_reserach.Payment#getPaid()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Paid();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Payment#getPayment_amount <em>Payment amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment amount</em>'.
	 * @see diet_mdse_reserach.Payment#getPayment_amount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Payment_amount();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see diet_mdse_reserach.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Doctor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diet_mdse_reserach.Doctor#getName()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Name();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Doctor#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see diet_mdse_reserach.Doctor#getAddress()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Address();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Doctor#getPhone_no <em>Phone no</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone no</em>'.
	 * @see diet_mdse_reserach.Doctor#getPhone_no()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Phone_no();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Doctor#getClinictimings <em>Clinictimings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinictimings</em>'.
	 * @see diet_mdse_reserach.Doctor#getClinictimings()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Clinictimings();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Doctor#getDoctor_specailization <em>Doctor specailization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctor specailization</em>'.
	 * @see diet_mdse_reserach.Doctor#getDoctor_specailization()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Doctor_specailization();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Doctor#getPatients <em>Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patients</em>'.
	 * @see diet_mdse_reserach.Doctor#getPatients()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Patients();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Doctor#getMedicines <em>Medicines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Medicines</em>'.
	 * @see diet_mdse_reserach.Doctor#getMedicines()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Medicines();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Doctor#getFees <em>Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fees</em>'.
	 * @see diet_mdse_reserach.Doctor#getFees()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Fees();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Doctor#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointments</em>'.
	 * @see diet_mdse_reserach.Doctor#getAppointments()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Appointments();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Doctor#getSymptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Symptoms</em>'.
	 * @see diet_mdse_reserach.Doctor#getSymptoms()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Symptoms();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Doctor#getAccess_to_predicteddietplan <em>Access to predicteddietplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access to predicteddietplan</em>'.
	 * @see diet_mdse_reserach.Doctor#getAccess_to_predicteddietplan()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Access_to_predicteddietplan();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Medicine <em>Medicine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medicine</em>'.
	 * @see diet_mdse_reserach.Medicine
	 * @generated
	 */
	EClass getMedicine();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Medicine#getMedicine_name <em>Medicine name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medicine name</em>'.
	 * @see diet_mdse_reserach.Medicine#getMedicine_name()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Medicine_name();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Medicine#getMedicine_dossage <em>Medicine dossage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medicine dossage</em>'.
	 * @see diet_mdse_reserach.Medicine#getMedicine_dossage()
	 * @see #getMedicine()
	 * @generated
	 */
	EAttribute getMedicine_Medicine_dossage();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Medicine#getDatasets <em>Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datasets</em>'.
	 * @see diet_mdse_reserach.Medicine#getDatasets()
	 * @see #getMedicine()
	 * @generated
	 */
	EReference getMedicine_Datasets();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.ML_algo <em>ML algo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML algo</em>'.
	 * @see diet_mdse_reserach.ML_algo
	 * @generated
	 */
	EClass getML_algo();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.ML_algo#getPerformancemetrices <em>Performancemetrices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performancemetrices</em>'.
	 * @see diet_mdse_reserach.ML_algo#getPerformancemetrices()
	 * @see #getML_algo()
	 * @generated
	 */
	EReference getML_algo_Performancemetrices();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.ML_algo#getGenerate_diet_plans <em>Generate diet plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generate diet plans</em>'.
	 * @see diet_mdse_reserach.ML_algo#getGenerate_diet_plans()
	 * @see #getML_algo()
	 * @generated
	 */
	EReference getML_algo_Generate_diet_plans();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.ML_algo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diet_mdse_reserach.ML_algo#getName()
	 * @see #getML_algo()
	 * @generated
	 */
	EAttribute getML_algo_Name();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.ML_algo#RandomForest() <em>Random Forest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Random Forest</em>' operation.
	 * @see diet_mdse_reserach.ML_algo#RandomForest()
	 * @generated
	 */
	EOperation getML_algo__RandomForest();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.ML_algo#k_means() <em>Kmeans</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kmeans</em>' operation.
	 * @see diet_mdse_reserach.ML_algo#k_means()
	 * @generated
	 */
	EOperation getML_algo__K_means();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.ML_algo#svm() <em>Svm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Svm</em>' operation.
	 * @see diet_mdse_reserach.ML_algo#svm()
	 * @generated
	 */
	EOperation getML_algo__Svm();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.RandomForest <em>Random Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Forest</em>'.
	 * @see diet_mdse_reserach.RandomForest
	 * @generated
	 */
	EClass getRandomForest();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.RandomForest#getCreteria <em>Creteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creteria</em>'.
	 * @see diet_mdse_reserach.RandomForest#getCreteria()
	 * @see #getRandomForest()
	 * @generated
	 */
	EAttribute getRandomForest_Creteria();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.PredictedDietplan <em>Predicted Dietplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicted Dietplan</em>'.
	 * @see diet_mdse_reserach.PredictedDietplan
	 * @generated
	 */
	EClass getPredictedDietplan();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.PredictedDietplan#getFood_name <em>Food name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Food name</em>'.
	 * @see diet_mdse_reserach.PredictedDietplan#getFood_name()
	 * @see #getPredictedDietplan()
	 * @generated
	 */
	EAttribute getPredictedDietplan_Food_name();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.PredictedDietplan#normalize_blood_sugar() <em>Normalize blood sugar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Normalize blood sugar</em>' operation.
	 * @see diet_mdse_reserach.PredictedDietplan#normalize_blood_sugar()
	 * @generated
	 */
	EOperation getPredictedDietplan__Normalize_blood_sugar();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.PredictedDietplan#weightloss() <em>Weightloss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Weightloss</em>' operation.
	 * @see diet_mdse_reserach.PredictedDietplan#weightloss()
	 * @generated
	 */
	EOperation getPredictedDietplan__Weightloss();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.K_means <em>Kmeans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kmeans</em>'.
	 * @see diet_mdse_reserach.K_means
	 * @generated
	 */
	EClass getK_means();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.K_means#getNumber_Of_Cluster <em>Number Of Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cluster</em>'.
	 * @see diet_mdse_reserach.K_means#getNumber_Of_Cluster()
	 * @see #getK_means()
	 * @generated
	 */
	EAttribute getK_means_Number_Of_Cluster();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see diet_mdse_reserach.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Dataset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see diet_mdse_reserach.Dataset#getName()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Name();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Dataset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see diet_mdse_reserach.Dataset#getType()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Type();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Dataset#getFoodcalories <em>Foodcalories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foodcalories</em>'.
	 * @see diet_mdse_reserach.Dataset#getFoodcalories()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Foodcalories();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Dataset#getFood_type <em>Food type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Food type</em>'.
	 * @see diet_mdse_reserach.Dataset#getFood_type()
	 * @see #getDataset()
	 * @generated
	 */
	EAttribute getDataset_Food_type();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Dataset#getMl_algos <em>Ml algos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ml algos</em>'.
	 * @see diet_mdse_reserach.Dataset#getMl_algos()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Ml_algos();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.SupportVectorMachine <em>Support Vector Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Vector Machine</em>'.
	 * @see diet_mdse_reserach.SupportVectorMachine
	 * @generated
	 */
	EClass getSupportVectorMachine();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.SupportVectorMachine#getKernel <em>Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel</em>'.
	 * @see diet_mdse_reserach.SupportVectorMachine#getKernel()
	 * @see #getSupportVectorMachine()
	 * @generated
	 */
	EAttribute getSupportVectorMachine_Kernel();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.SupportVectorMachine#getC_value <em>Cvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvalue</em>'.
	 * @see diet_mdse_reserach.SupportVectorMachine#getC_value()
	 * @see #getSupportVectorMachine()
	 * @generated
	 */
	EAttribute getSupportVectorMachine_C_value();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.SupportVectorMachine#getGamma_value <em>Gamma value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gamma value</em>'.
	 * @see diet_mdse_reserach.SupportVectorMachine#getGamma_value()
	 * @see #getSupportVectorMachine()
	 * @generated
	 */
	EAttribute getSupportVectorMachine_Gamma_value();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.Symptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symptoms</em>'.
	 * @see diet_mdse_reserach.Symptoms
	 * @generated
	 */
	EClass getSymptoms();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Symptoms#getSymptom_name <em>Symptom name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symptom name</em>'.
	 * @see diet_mdse_reserach.Symptoms#getSymptom_name()
	 * @see #getSymptoms()
	 * @generated
	 */
	EAttribute getSymptoms_Symptom_name();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.Symptoms#getSeveritylevel <em>Severitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severitylevel</em>'.
	 * @see diet_mdse_reserach.Symptoms#getSeveritylevel()
	 * @see #getSymptoms()
	 * @generated
	 */
	EAttribute getSymptoms_Severitylevel();

	/**
	 * Returns the meta object for the reference list '{@link diet_mdse_reserach.Symptoms#getDatasets <em>Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datasets</em>'.
	 * @see diet_mdse_reserach.Symptoms#getDatasets()
	 * @see #getSymptoms()
	 * @generated
	 */
	EReference getSymptoms_Datasets();

	/**
	 * Returns the meta object for class '{@link diet_mdse_reserach.PerformanceMetric <em>Performance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Metric</em>'.
	 * @see diet_mdse_reserach.PerformanceMetric
	 * @generated
	 */
	EClass getPerformanceMetric();

	/**
	 * Returns the meta object for the attribute '{@link diet_mdse_reserach.PerformanceMetric#getMetrices <em>Metrices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrices</em>'.
	 * @see diet_mdse_reserach.PerformanceMetric#getMetrices()
	 * @see #getPerformanceMetric()
	 * @generated
	 */
	EAttribute getPerformanceMetric_Metrices();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.PerformanceMetric#confusionmatrix() <em>Confusionmatrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confusionmatrix</em>' operation.
	 * @see diet_mdse_reserach.PerformanceMetric#confusionmatrix()
	 * @generated
	 */
	EOperation getPerformanceMetric__Confusionmatrix();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.PerformanceMetric#accuracy_score() <em>Accuracy score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accuracy score</em>' operation.
	 * @see diet_mdse_reserach.PerformanceMetric#accuracy_score()
	 * @generated
	 */
	EOperation getPerformanceMetric__Accuracy_score();

	/**
	 * Returns the meta object for the '{@link diet_mdse_reserach.PerformanceMetric#classification_report() <em>Classification report</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Classification report</em>' operation.
	 * @see diet_mdse_reserach.PerformanceMetric#classification_report()
	 * @generated
	 */
	EOperation getPerformanceMetric__Classification_report();

	/**
	 * Returns the meta object for enum '{@link diet_mdse_reserach.DietRecommendationType <em>Diet Recommendation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Diet Recommendation Type</em>'.
	 * @see diet_mdse_reserach.DietRecommendationType
	 * @generated
	 */
	EEnum getDietRecommendationType();

	/**
	 * Returns the meta object for enum '{@link diet_mdse_reserach.Glucose <em>Glucose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Glucose</em>'.
	 * @see diet_mdse_reserach.Glucose
	 * @generated
	 */
	EEnum getGlucose();

	/**
	 * Returns the meta object for enum '{@link diet_mdse_reserach.FoodType <em>Food Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Food Type</em>'.
	 * @see diet_mdse_reserach.FoodType
	 * @generated
	 */
	EEnum getFoodType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Money</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getMoney();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Diet_mdse_reserachFactory getDiet_mdse_reserachFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl <em>Diet Recommendation System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.DietRecommendationSystemImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDietRecommendationSystem()
		 * @generated
		 */
		EClass DIET_RECOMMENDATION_SYSTEM = eINSTANCE.getDietRecommendationSystem();

		/**
		 * The meta object literal for the '<em><b>Patients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__PATIENTS = eINSTANCE.getDietRecommendationSystem_Patients();

		/**
		 * The meta object literal for the '<em><b>Nutritionists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS = eINSTANCE.getDietRecommendationSystem_Nutritionists();

		/**
		 * The meta object literal for the '<em><b>Medicines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__MEDICINES = eINSTANCE.getDietRecommendationSystem_Medicines();

		/**
		 * The meta object literal for the '<em><b>Doctors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__DOCTORS = eINSTANCE.getDietRecommendationSystem_Doctors();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS = eINSTANCE.getDietRecommendationSystem_Appointments();

		/**
		 * The meta object literal for the '<em><b>Payments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__PAYMENTS = eINSTANCE.getDietRecommendationSystem_Payments();

		/**
		 * The meta object literal for the '<em><b>Ml algos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__ML_ALGOS = eINSTANCE.getDietRecommendationSystem_Ml_algos();

		/**
		 * The meta object literal for the '<em><b>Has predict diet plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS = eINSTANCE
				.getDietRecommendationSystem_Has_predict_diet_plans();

		/**
		 * The meta object literal for the '<em><b>Performancemetric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC = eINSTANCE
				.getDietRecommendationSystem_Performancemetric();

		/**
		 * The meta object literal for the '<em><b>Symptoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__SYMPTOMS = eINSTANCE.getDietRecommendationSystem_Symptoms();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIET_RECOMMENDATION_SYSTEM__DATASET = eINSTANCE.getDietRecommendationSystem_Dataset();

		/**
		 * The meta object literal for the '<em><b>Diet plan recommendation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION = eINSTANCE
				.getDietRecommendationSystem_Diet_plan_recommendation();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.PatientImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__NAME = eINSTANCE.getPatient_Name();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__HEIGHT = eINSTANCE.getPatient_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__WEIGHT = eINSTANCE.getPatient_Weight();

		/**
		 * The meta object literal for the '<em><b>Bmi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__BMI = eINSTANCE.getPatient_Bmi();

		/**
		 * The meta object literal for the '<em><b>Activity level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__ACTIVITY_LEVEL = eINSTANCE.getPatient_Activity_level();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__GENDER = eINSTANCE.getPatient_Gender();

		/**
		 * The meta object literal for the '<em><b>Patient type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_TYPE = eINSTANCE.getPatient_Patient_type();

		/**
		 * The meta object literal for the '<em><b>Glucose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__GLUCOSE = eINSTANCE.getPatient_Glucose();

		/**
		 * The meta object literal for the '<em><b>Glucose level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__GLUCOSE_LEVEL = eINSTANCE.getPatient_Glucose_level();

		/**
		 * The meta object literal for the '<em><b>Payments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__PAYMENTS = eINSTANCE.getPatient_Payments();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__APPOINTMENTS = eINSTANCE.getPatient_Appointments();

		/**
		 * The meta object literal for the '<em><b>Doctors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DOCTORS = eINSTANCE.getPatient_Doctors();

		/**
		 * The meta object literal for the '<em><b>Medicines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__MEDICINES = eINSTANCE.getPatient_Medicines();

		/**
		 * The meta object literal for the '<em><b>Nutritionists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__NUTRITIONISTS = eINSTANCE.getPatient_Nutritionists();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__AGE = eINSTANCE.getPatient_Age();

		/**
		 * The meta object literal for the '<em><b>Symptoms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__SYMPTOMS = eINSTANCE.getPatient_Symptoms();

		/**
		 * The meta object literal for the '<em><b>Other diseases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__OTHER_DISEASES = eINSTANCE.getPatient_Other_diseases();

		/**
		 * The meta object literal for the '<em><b>Access topredicteddietplans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__ACCESS_TOPREDICTEDDIETPLANS = eINSTANCE.getPatient_Access_topredicteddietplans();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.NutritionistImpl <em>Nutritionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.NutritionistImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getNutritionist()
		 * @generated
		 */
		EClass NUTRITIONIST = eINSTANCE.getNutritionist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRITIONIST__NAME = eINSTANCE.getNutritionist_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRITIONIST__ADDRESS = eINSTANCE.getNutritionist_Address();

		/**
		 * The meta object literal for the '<em><b>Phone no</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRITIONIST__PHONE_NO = eINSTANCE.getNutritionist_Phone_no();

		/**
		 * The meta object literal for the '<em><b>Clinictimings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUTRITIONIST__CLINICTIMINGS = eINSTANCE.getNutritionist_Clinictimings();

		/**
		 * The meta object literal for the '<em><b>Patients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRITIONIST__PATIENTS = eINSTANCE.getNutritionist_Patients();

		/**
		 * The meta object literal for the '<em><b>Fees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRITIONIST__FEES = eINSTANCE.getNutritionist_Fees();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRITIONIST__APPOINTMENTS = eINSTANCE.getNutritionist_Appointments();

		/**
		 * The meta object literal for the '<em><b>Predicteddietplans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTRITIONIST__PREDICTEDDIETPLANS = eINSTANCE.getNutritionist_Predicteddietplans();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.AppointmentImpl <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.AppointmentImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getAppointment()
		 * @generated
		 */
		EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Appointment details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__APPOINTMENT_DETAILS = eINSTANCE.getAppointment_Appointment_details();

		/**
		 * The meta object literal for the '<em><b>Appointment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__APPOINTMENT_DATE = eINSTANCE.getAppointment_Appointment_Date();

		/**
		 * The meta object literal for the '<em><b>Time taken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__TIME_TAKEN = eINSTANCE.getAppointment_Time_taken();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__PATIENT = eINSTANCE.getAppointment_Patient();

		/**
		 * The meta object literal for the '<em><b>Apointment booking mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__APOINTMENT_BOOKING_MODE = eINSTANCE.getAppointment_Apointment_booking_mode();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__PAYMENT = eINSTANCE.getAppointment_Payment();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.PaymentImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_ID = eINSTANCE.getPayment_Payment_Id();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PATIENT = eINSTANCE.getPayment_Patient();

		/**
		 * The meta object literal for the '<em><b>Card Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__CARD_TYPE = eINSTANCE.getPayment_CardType();

		/**
		 * The meta object literal for the '<em><b>Card No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__CARD_NO = eINSTANCE.getPayment_CardNo();

		/**
		 * The meta object literal for the '<em><b>Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAID = eINSTANCE.getPayment_Paid();

		/**
		 * The meta object literal for the '<em><b>Payment amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_AMOUNT = eINSTANCE.getPayment_Payment_amount();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.DoctorImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__NAME = eINSTANCE.getDoctor_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__ADDRESS = eINSTANCE.getDoctor_Address();

		/**
		 * The meta object literal for the '<em><b>Phone no</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__PHONE_NO = eINSTANCE.getDoctor_Phone_no();

		/**
		 * The meta object literal for the '<em><b>Clinictimings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__CLINICTIMINGS = eINSTANCE.getDoctor_Clinictimings();

		/**
		 * The meta object literal for the '<em><b>Doctor specailization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__DOCTOR_SPECAILIZATION = eINSTANCE.getDoctor_Doctor_specailization();

		/**
		 * The meta object literal for the '<em><b>Patients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__PATIENTS = eINSTANCE.getDoctor_Patients();

		/**
		 * The meta object literal for the '<em><b>Medicines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__MEDICINES = eINSTANCE.getDoctor_Medicines();

		/**
		 * The meta object literal for the '<em><b>Fees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__FEES = eINSTANCE.getDoctor_Fees();

		/**
		 * The meta object literal for the '<em><b>Appointments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__APPOINTMENTS = eINSTANCE.getDoctor_Appointments();

		/**
		 * The meta object literal for the '<em><b>Symptoms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__SYMPTOMS = eINSTANCE.getDoctor_Symptoms();

		/**
		 * The meta object literal for the '<em><b>Access to predicteddietplan</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__ACCESS_TO_PREDICTEDDIETPLAN = eINSTANCE.getDoctor_Access_to_predicteddietplan();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.MedicineImpl <em>Medicine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.MedicineImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getMedicine()
		 * @generated
		 */
		EClass MEDICINE = eINSTANCE.getMedicine();

		/**
		 * The meta object literal for the '<em><b>Medicine name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__MEDICINE_NAME = eINSTANCE.getMedicine_Medicine_name();

		/**
		 * The meta object literal for the '<em><b>Medicine dossage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICINE__MEDICINE_DOSSAGE = eINSTANCE.getMedicine_Medicine_dossage();

		/**
		 * The meta object literal for the '<em><b>Datasets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICINE__DATASETS = eINSTANCE.getMedicine_Datasets();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.ML_algoImpl <em>ML algo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.ML_algoImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getML_algo()
		 * @generated
		 */
		EClass ML_ALGO = eINSTANCE.getML_algo();

		/**
		 * The meta object literal for the '<em><b>Performancemetrices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGO__PERFORMANCEMETRICES = eINSTANCE.getML_algo_Performancemetrices();

		/**
		 * The meta object literal for the '<em><b>Generate diet plans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGO__GENERATE_DIET_PLANS = eINSTANCE.getML_algo_Generate_diet_plans();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_ALGO__NAME = eINSTANCE.getML_algo_Name();

		/**
		 * The meta object literal for the '<em><b>Random Forest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML_ALGO___RANDOM_FOREST = eINSTANCE.getML_algo__RandomForest();

		/**
		 * The meta object literal for the '<em><b>Kmeans</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML_ALGO___KMEANS = eINSTANCE.getML_algo__K_means();

		/**
		 * The meta object literal for the '<em><b>Svm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML_ALGO___SVM = eINSTANCE.getML_algo__Svm();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.RandomForestImpl <em>Random Forest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.RandomForestImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getRandomForest()
		 * @generated
		 */
		EClass RANDOM_FOREST = eINSTANCE.getRandomForest();

		/**
		 * The meta object literal for the '<em><b>Creteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_FOREST__CRETERIA = eINSTANCE.getRandomForest_Creteria();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.PredictedDietplanImpl <em>Predicted Dietplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.PredictedDietplanImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPredictedDietplan()
		 * @generated
		 */
		EClass PREDICTED_DIETPLAN = eINSTANCE.getPredictedDietplan();

		/**
		 * The meta object literal for the '<em><b>Food name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDICTED_DIETPLAN__FOOD_NAME = eINSTANCE.getPredictedDietplan_Food_name();

		/**
		 * The meta object literal for the '<em><b>Normalize blood sugar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICTED_DIETPLAN___NORMALIZE_BLOOD_SUGAR = eINSTANCE.getPredictedDietplan__Normalize_blood_sugar();

		/**
		 * The meta object literal for the '<em><b>Weightloss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PREDICTED_DIETPLAN___WEIGHTLOSS = eINSTANCE.getPredictedDietplan__Weightloss();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.K_meansImpl <em>Kmeans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.K_meansImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getK_means()
		 * @generated
		 */
		EClass KMEANS = eINSTANCE.getK_means();

		/**
		 * The meta object literal for the '<em><b>Number Of Cluster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KMEANS__NUMBER_OF_CLUSTER = eINSTANCE.getK_means_Number_Of_Cluster();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.DatasetImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__NAME = eINSTANCE.getDataset_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__TYPE = eINSTANCE.getDataset_Type();

		/**
		 * The meta object literal for the '<em><b>Foodcalories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__FOODCALORIES = eINSTANCE.getDataset_Foodcalories();

		/**
		 * The meta object literal for the '<em><b>Food type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET__FOOD_TYPE = eINSTANCE.getDataset_Food_type();

		/**
		 * The meta object literal for the '<em><b>Ml algos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__ML_ALGOS = eINSTANCE.getDataset_Ml_algos();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.SupportVectorMachineImpl <em>Support Vector Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.SupportVectorMachineImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getSupportVectorMachine()
		 * @generated
		 */
		EClass SUPPORT_VECTOR_MACHINE = eINSTANCE.getSupportVectorMachine();

		/**
		 * The meta object literal for the '<em><b>Kernel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_VECTOR_MACHINE__KERNEL = eINSTANCE.getSupportVectorMachine_Kernel();

		/**
		 * The meta object literal for the '<em><b>Cvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_VECTOR_MACHINE__CVALUE = eINSTANCE.getSupportVectorMachine_C_value();

		/**
		 * The meta object literal for the '<em><b>Gamma value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_VECTOR_MACHINE__GAMMA_VALUE = eINSTANCE.getSupportVectorMachine_Gamma_value();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.SymptomsImpl <em>Symptoms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.SymptomsImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getSymptoms()
		 * @generated
		 */
		EClass SYMPTOMS = eINSTANCE.getSymptoms();

		/**
		 * The meta object literal for the '<em><b>Symptom name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPTOMS__SYMPTOM_NAME = eINSTANCE.getSymptoms_Symptom_name();

		/**
		 * The meta object literal for the '<em><b>Severitylevel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPTOMS__SEVERITYLEVEL = eINSTANCE.getSymptoms_Severitylevel();

		/**
		 * The meta object literal for the '<em><b>Datasets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPTOMS__DATASETS = eINSTANCE.getSymptoms_Datasets();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.impl.PerformanceMetricImpl <em>Performance Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.impl.PerformanceMetricImpl
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getPerformanceMetric()
		 * @generated
		 */
		EClass PERFORMANCE_METRIC = eINSTANCE.getPerformanceMetric();

		/**
		 * The meta object literal for the '<em><b>Metrices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_METRIC__METRICES = eINSTANCE.getPerformanceMetric_Metrices();

		/**
		 * The meta object literal for the '<em><b>Confusionmatrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_METRIC___CONFUSIONMATRIX = eINSTANCE.getPerformanceMetric__Confusionmatrix();

		/**
		 * The meta object literal for the '<em><b>Accuracy score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_METRIC___ACCURACY_SCORE = eINSTANCE.getPerformanceMetric__Accuracy_score();

		/**
		 * The meta object literal for the '<em><b>Classification report</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERFORMANCE_METRIC___CLASSIFICATION_REPORT = eINSTANCE.getPerformanceMetric__Classification_report();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.DietRecommendationType <em>Diet Recommendation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.DietRecommendationType
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getDietRecommendationType()
		 * @generated
		 */
		EEnum DIET_RECOMMENDATION_TYPE = eINSTANCE.getDietRecommendationType();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.Glucose <em>Glucose</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.Glucose
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getGlucose()
		 * @generated
		 */
		EEnum GLUCOSE = eINSTANCE.getGlucose();

		/**
		 * The meta object literal for the '{@link diet_mdse_reserach.FoodType <em>Food Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diet_mdse_reserach.FoodType
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getFoodType()
		 * @generated
		 */
		EEnum FOOD_TYPE = eINSTANCE.getFoodType();

		/**
		 * The meta object literal for the '<em>Money</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see diet_mdse_reserach.impl.Diet_mdse_reserachPackageImpl#getMoney()
		 * @generated
		 */
		EDataType MONEY = eINSTANCE.getMoney();

	}

} //Diet_mdse_reserachPackage
