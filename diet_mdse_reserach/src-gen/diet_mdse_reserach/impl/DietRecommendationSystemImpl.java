/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Appointment;
import diet_mdse_reserach.Dataset;
import diet_mdse_reserach.DietRecommendationSystem;
import diet_mdse_reserach.DietRecommendationType;
import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Doctor;
import diet_mdse_reserach.ML_algo;
import diet_mdse_reserach.Medicine;
import diet_mdse_reserach.Nutritionist;
import diet_mdse_reserach.Patient;
import diet_mdse_reserach.Payment;
import diet_mdse_reserach.PerformanceMetric;
import diet_mdse_reserach.PredictedDietplan;
import diet_mdse_reserach.Symptoms;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diet Recommendation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getPatients <em>Patients</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getNutritionists <em>Nutritionists</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getMedicines <em>Medicines</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getDoctors <em>Doctors</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getPayments <em>Payments</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getMl_algos <em>Ml algos</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getHas_predict_diet_plans <em>Has predict diet plans</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getPerformancemetric <em>Performancemetric</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getSymptoms <em>Symptoms</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DietRecommendationSystemImpl#getDiet_plan_recommendation <em>Diet plan recommendation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DietRecommendationSystemImpl extends MinimalEObjectImpl.Container implements DietRecommendationSystem {
	/**
	 * The cached value of the '{@link #getPatients() <em>Patients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatients()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patients;

	/**
	 * The cached value of the '{@link #getNutritionists() <em>Nutritionists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionists()
	 * @generated
	 * @ordered
	 */
	protected EList<Nutritionist> nutritionists;

	/**
	 * The cached value of the '{@link #getMedicines() <em>Medicines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicines()
	 * @generated
	 * @ordered
	 */
	protected EList<Medicine> medicines;

	/**
	 * The cached value of the '{@link #getDoctors() <em>Doctors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctors()
	 * @generated
	 * @ordered
	 */
	protected EList<Doctor> doctors;

	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointments;

	/**
	 * The cached value of the '{@link #getPayments() <em>Payments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payments;

	/**
	 * The cached value of the '{@link #getMl_algos() <em>Ml algos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMl_algos()
	 * @generated
	 * @ordered
	 */
	protected EList<ML_algo> ml_algos;

	/**
	 * The cached value of the '{@link #getHas_predict_diet_plans() <em>Has predict diet plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_predict_diet_plans()
	 * @generated
	 * @ordered
	 */
	protected EList<PredictedDietplan> has_predict_diet_plans;

	/**
	 * The cached value of the '{@link #getPerformancemetric() <em>Performancemetric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformancemetric()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceMetric> performancemetric;

	/**
	 * The cached value of the '{@link #getSymptoms() <em>Symptoms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptoms()
	 * @generated
	 * @ordered
	 */
	protected EList<Symptoms> symptoms;

	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> dataset;

	/**
	 * The default value of the '{@link #getDiet_plan_recommendation() <em>Diet plan recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiet_plan_recommendation()
	 * @generated
	 * @ordered
	 */
	protected static final DietRecommendationType DIET_PLAN_RECOMMENDATION_EDEFAULT = DietRecommendationType.WEIGHT_LOSS;

	/**
	 * The cached value of the '{@link #getDiet_plan_recommendation() <em>Diet plan recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiet_plan_recommendation()
	 * @generated
	 * @ordered
	 */
	protected DietRecommendationType diet_plan_recommendation = DIET_PLAN_RECOMMENDATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DietRecommendationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getPatients() {
		if (patients == null) {
			patients = new EObjectContainmentEList<Patient>(Patient.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PATIENTS);
		}
		return patients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Nutritionist> getNutritionists() {
		if (nutritionists == null) {
			nutritionists = new EObjectContainmentEList<Nutritionist>(Nutritionist.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS);
		}
		return nutritionists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Medicine> getMedicines() {
		if (medicines == null) {
			medicines = new EObjectContainmentEList<Medicine>(Medicine.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__MEDICINES);
		}
		return medicines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doctor> getDoctors() {
		if (doctors == null) {
			doctors = new EObjectContainmentEList<Doctor>(Doctor.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DOCTORS);
		}
		return doctors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new EObjectContainmentEList<Appointment>(Appointment.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS);
		}
		return appointments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getPayments() {
		if (payments == null) {
			payments = new EObjectContainmentEList<Payment>(Payment.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PAYMENTS);
		}
		return payments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ML_algo> getMl_algos() {
		if (ml_algos == null) {
			ml_algos = new EObjectContainmentEList<ML_algo>(ML_algo.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS);
		}
		return ml_algos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredictedDietplan> getHas_predict_diet_plans() {
		if (has_predict_diet_plans == null) {
			has_predict_diet_plans = new EObjectContainmentEList<PredictedDietplan>(PredictedDietplan.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS);
		}
		return has_predict_diet_plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PerformanceMetric> getPerformancemetric() {
		if (performancemetric == null) {
			performancemetric = new EObjectContainmentEList<PerformanceMetric>(PerformanceMetric.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC);
		}
		return performancemetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Symptoms> getSymptoms() {
		if (symptoms == null) {
			symptoms = new EObjectContainmentEList<Symptoms>(Symptoms.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS);
		}
		return symptoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dataset> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<Dataset>(Dataset.class, this,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DietRecommendationType getDiet_plan_recommendation() {
		return diet_plan_recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiet_plan_recommendation(DietRecommendationType newDiet_plan_recommendation) {
		DietRecommendationType oldDiet_plan_recommendation = diet_plan_recommendation;
		diet_plan_recommendation = newDiet_plan_recommendation == null ? DIET_PLAN_RECOMMENDATION_EDEFAULT
				: newDiet_plan_recommendation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION,
					oldDiet_plan_recommendation, diet_plan_recommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PATIENTS:
			return ((InternalEList<?>) getPatients()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS:
			return ((InternalEList<?>) getNutritionists()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__MEDICINES:
			return ((InternalEList<?>) getMedicines()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DOCTORS:
			return ((InternalEList<?>) getDoctors()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS:
			return ((InternalEList<?>) getAppointments()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PAYMENTS:
			return ((InternalEList<?>) getPayments()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS:
			return ((InternalEList<?>) getMl_algos()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS:
			return ((InternalEList<?>) getHas_predict_diet_plans()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC:
			return ((InternalEList<?>) getPerformancemetric()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS:
			return ((InternalEList<?>) getSymptoms()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DATASET:
			return ((InternalEList<?>) getDataset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PATIENTS:
			return getPatients();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS:
			return getNutritionists();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__MEDICINES:
			return getMedicines();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DOCTORS:
			return getDoctors();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS:
			return getAppointments();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PAYMENTS:
			return getPayments();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS:
			return getMl_algos();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS:
			return getHas_predict_diet_plans();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC:
			return getPerformancemetric();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS:
			return getSymptoms();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DATASET:
			return getDataset();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION:
			return getDiet_plan_recommendation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PATIENTS:
			getPatients().clear();
			getPatients().addAll((Collection<? extends Patient>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS:
			getNutritionists().clear();
			getNutritionists().addAll((Collection<? extends Nutritionist>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__MEDICINES:
			getMedicines().clear();
			getMedicines().addAll((Collection<? extends Medicine>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DOCTORS:
			getDoctors().clear();
			getDoctors().addAll((Collection<? extends Doctor>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS:
			getAppointments().clear();
			getAppointments().addAll((Collection<? extends Appointment>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PAYMENTS:
			getPayments().clear();
			getPayments().addAll((Collection<? extends Payment>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS:
			getMl_algos().clear();
			getMl_algos().addAll((Collection<? extends ML_algo>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS:
			getHas_predict_diet_plans().clear();
			getHas_predict_diet_plans().addAll((Collection<? extends PredictedDietplan>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC:
			getPerformancemetric().clear();
			getPerformancemetric().addAll((Collection<? extends PerformanceMetric>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS:
			getSymptoms().clear();
			getSymptoms().addAll((Collection<? extends Symptoms>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DATASET:
			getDataset().clear();
			getDataset().addAll((Collection<? extends Dataset>) newValue);
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION:
			setDiet_plan_recommendation((DietRecommendationType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PATIENTS:
			getPatients().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS:
			getNutritionists().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__MEDICINES:
			getMedicines().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DOCTORS:
			getDoctors().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS:
			getAppointments().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PAYMENTS:
			getPayments().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS:
			getMl_algos().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS:
			getHas_predict_diet_plans().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC:
			getPerformancemetric().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS:
			getSymptoms().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DATASET:
			getDataset().clear();
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION:
			setDiet_plan_recommendation(DIET_PLAN_RECOMMENDATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PATIENTS:
			return patients != null && !patients.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS:
			return nutritionists != null && !nutritionists.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__MEDICINES:
			return medicines != null && !medicines.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DOCTORS:
			return doctors != null && !doctors.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS:
			return appointments != null && !appointments.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PAYMENTS:
			return payments != null && !payments.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS:
			return ml_algos != null && !ml_algos.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS:
			return has_predict_diet_plans != null && !has_predict_diet_plans.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC:
			return performancemetric != null && !performancemetric.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS:
			return symptoms != null && !symptoms.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DATASET:
			return dataset != null && !dataset.isEmpty();
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION:
			return diet_plan_recommendation != DIET_PLAN_RECOMMENDATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Diet_plan_recommendation: ");
		result.append(diet_plan_recommendation);
		result.append(')');
		return result.toString();
	}

} //DietRecommendationSystemImpl
