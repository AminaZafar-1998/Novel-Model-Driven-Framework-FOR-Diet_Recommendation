/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Appointment;
import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Doctor;
import diet_mdse_reserach.Glucose;
import diet_mdse_reserach.Medicine;
import diet_mdse_reserach.Nutritionist;
import diet_mdse_reserach.Patient;
import diet_mdse_reserach.Payment;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getBmi <em>Bmi</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getActivity_level <em>Activity level</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getPatient_type <em>Patient type</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getGlucose <em>Glucose</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getGlucose_level <em>Glucose level</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getPayments <em>Payments</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getDoctors <em>Doctors</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getMedicines <em>Medicines</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getNutritionists <em>Nutritionists</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getAge <em>Age</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getSymptoms <em>Symptoms</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getOther_diseases <em>Other diseases</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.PatientImpl#getAccess_topredicteddietplans <em>Access topredicteddietplans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends MinimalEObjectImpl.Container implements Patient {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBmi() <em>Bmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmi()
	 * @generated
	 * @ordered
	 */
	protected static final String BMI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBmi() <em>Bmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmi()
	 * @generated
	 * @ordered
	 */
	protected String bmi = BMI_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivity_level() <em>Activity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_level()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivity_level() <em>Activity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_level()
	 * @generated
	 * @ordered
	 */
	protected String activity_level = ACTIVITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final String GENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected String gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatient_type() <em>Patient type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient_type()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatient_type() <em>Patient type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient_type()
	 * @generated
	 * @ordered
	 */
	protected String patient_type = PATIENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlucose() <em>Glucose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlucose()
	 * @generated
	 * @ordered
	 */
	protected static final Glucose GLUCOSE_EDEFAULT = Glucose.FASTING;

	/**
	 * The cached value of the '{@link #getGlucose() <em>Glucose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlucose()
	 * @generated
	 * @ordered
	 */
	protected Glucose glucose = GLUCOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlucose_level() <em>Glucose level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlucose_level()
	 * @generated
	 * @ordered
	 */
	protected static final String GLUCOSE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlucose_level() <em>Glucose level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlucose_level()
	 * @generated
	 * @ordered
	 */
	protected String glucose_level = GLUCOSE_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayments() <em>Payments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payments;

	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointments;

	/**
	 * The cached value of the '{@link #getDoctors() <em>Doctors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctors()
	 * @generated
	 * @ordered
	 */
	protected EList<Doctor> doctors;

	/**
	 * The cached value of the '{@link #getMedicines() <em>Medicines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicines()
	 * @generated
	 * @ordered
	 */
	protected EList<Medicine> medicines;

	/**
	 * The cached value of the '{@link #getNutritionists() <em>Nutritionists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionists()
	 * @generated
	 * @ordered
	 */
	protected EList<Nutritionist> nutritionists;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymptoms() <em>Symptoms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptoms()
	 * @generated
	 * @ordered
	 */
	protected EList<Symptoms> symptoms;

	/**
	 * The default value of the '{@link #getOther_diseases() <em>Other diseases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_diseases()
	 * @generated
	 * @ordered
	 */
	protected static final int OTHER_DISEASES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOther_diseases() <em>Other diseases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_diseases()
	 * @generated
	 * @ordered
	 */
	protected int other_diseases = OTHER_DISEASES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccess_topredicteddietplans() <em>Access topredicteddietplans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess_topredicteddietplans()
	 * @generated
	 * @ordered
	 */
	protected EList<PredictedDietplan> access_topredicteddietplans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__WEIGHT, oldWeight,
					weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBmi() {
		return bmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBmi(String newBmi) {
		String oldBmi = bmi;
		bmi = newBmi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__BMI, oldBmi, bmi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivity_level() {
		return activity_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity_level(String newActivity_level) {
		String oldActivity_level = activity_level;
		activity_level = newActivity_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__ACTIVITY_LEVEL,
					oldActivity_level, activity_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(String newGender) {
		String oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__GENDER, oldGender,
					gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatient_type() {
		return patient_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatient_type(String newPatient_type) {
		String oldPatient_type = patient_type;
		patient_type = newPatient_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__PATIENT_TYPE,
					oldPatient_type, patient_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glucose getGlucose() {
		return glucose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlucose(Glucose newGlucose) {
		Glucose oldGlucose = glucose;
		glucose = newGlucose == null ? GLUCOSE_EDEFAULT : newGlucose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__GLUCOSE,
					oldGlucose, glucose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlucose_level() {
		return glucose_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlucose_level(String newGlucose_level) {
		String oldGlucose_level = glucose_level;
		glucose_level = newGlucose_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__GLUCOSE_LEVEL,
					oldGlucose_level, glucose_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Payment> getPayments() {
		if (payments == null) {
			payments = new EObjectWithInverseResolvingEList<Payment>(Payment.class, this,
					Diet_mdse_reserachPackage.PATIENT__PAYMENTS, Diet_mdse_reserachPackage.PAYMENT__PATIENT);
		}
		return payments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new EObjectWithInverseResolvingEList<Appointment>(Appointment.class, this,
					Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS, Diet_mdse_reserachPackage.APPOINTMENT__PATIENT);
		}
		return appointments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doctor> getDoctors() {
		if (doctors == null) {
			doctors = new EObjectWithInverseResolvingEList.ManyInverse<Doctor>(Doctor.class, this,
					Diet_mdse_reserachPackage.PATIENT__DOCTORS, Diet_mdse_reserachPackage.DOCTOR__PATIENTS);
		}
		return doctors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Medicine> getMedicines() {
		if (medicines == null) {
			medicines = new EObjectResolvingEList<Medicine>(Medicine.class, this,
					Diet_mdse_reserachPackage.PATIENT__MEDICINES);
		}
		return medicines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Nutritionist> getNutritionists() {
		if (nutritionists == null) {
			nutritionists = new EObjectWithInverseResolvingEList.ManyInverse<Nutritionist>(Nutritionist.class, this,
					Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS, Diet_mdse_reserachPackage.NUTRITIONIST__PATIENTS);
		}
		return nutritionists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Symptoms> getSymptoms() {
		if (symptoms == null) {
			symptoms = new EObjectResolvingEList<Symptoms>(Symptoms.class, this,
					Diet_mdse_reserachPackage.PATIENT__SYMPTOMS);
		}
		return symptoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOther_diseases() {
		return other_diseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOther_diseases(int newOther_diseases) {
		int oldOther_diseases = other_diseases;
		other_diseases = newOther_diseases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.PATIENT__OTHER_DISEASES,
					oldOther_diseases, other_diseases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredictedDietplan> getAccess_topredicteddietplans() {
		if (access_topredicteddietplans == null) {
			access_topredicteddietplans = new EObjectResolvingEList<PredictedDietplan>(PredictedDietplan.class, this,
					Diet_mdse_reserachPackage.PATIENT__ACCESS_TOPREDICTEDDIETPLANS);
		}
		return access_topredicteddietplans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.PATIENT__PAYMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPayments()).basicAdd(otherEnd, msgs);
		case Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAppointments()).basicAdd(otherEnd, msgs);
		case Diet_mdse_reserachPackage.PATIENT__DOCTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDoctors()).basicAdd(otherEnd, msgs);
		case Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNutritionists()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.PATIENT__PAYMENTS:
			return ((InternalEList<?>) getPayments()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS:
			return ((InternalEList<?>) getAppointments()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.PATIENT__DOCTORS:
			return ((InternalEList<?>) getDoctors()).basicRemove(otherEnd, msgs);
		case Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS:
			return ((InternalEList<?>) getNutritionists()).basicRemove(otherEnd, msgs);
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
		case Diet_mdse_reserachPackage.PATIENT__NAME:
			return getName();
		case Diet_mdse_reserachPackage.PATIENT__HEIGHT:
			return getHeight();
		case Diet_mdse_reserachPackage.PATIENT__WEIGHT:
			return getWeight();
		case Diet_mdse_reserachPackage.PATIENT__BMI:
			return getBmi();
		case Diet_mdse_reserachPackage.PATIENT__ACTIVITY_LEVEL:
			return getActivity_level();
		case Diet_mdse_reserachPackage.PATIENT__GENDER:
			return getGender();
		case Diet_mdse_reserachPackage.PATIENT__PATIENT_TYPE:
			return getPatient_type();
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE:
			return getGlucose();
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE_LEVEL:
			return getGlucose_level();
		case Diet_mdse_reserachPackage.PATIENT__PAYMENTS:
			return getPayments();
		case Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS:
			return getAppointments();
		case Diet_mdse_reserachPackage.PATIENT__DOCTORS:
			return getDoctors();
		case Diet_mdse_reserachPackage.PATIENT__MEDICINES:
			return getMedicines();
		case Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS:
			return getNutritionists();
		case Diet_mdse_reserachPackage.PATIENT__AGE:
			return getAge();
		case Diet_mdse_reserachPackage.PATIENT__SYMPTOMS:
			return getSymptoms();
		case Diet_mdse_reserachPackage.PATIENT__OTHER_DISEASES:
			return getOther_diseases();
		case Diet_mdse_reserachPackage.PATIENT__ACCESS_TOPREDICTEDDIETPLANS:
			return getAccess_topredicteddietplans();
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
		case Diet_mdse_reserachPackage.PATIENT__NAME:
			setName((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__HEIGHT:
			setHeight((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__WEIGHT:
			setWeight((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__BMI:
			setBmi((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__ACTIVITY_LEVEL:
			setActivity_level((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__GENDER:
			setGender((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__PATIENT_TYPE:
			setPatient_type((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE:
			setGlucose((Glucose) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE_LEVEL:
			setGlucose_level((String) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__PAYMENTS:
			getPayments().clear();
			getPayments().addAll((Collection<? extends Payment>) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS:
			getAppointments().clear();
			getAppointments().addAll((Collection<? extends Appointment>) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__DOCTORS:
			getDoctors().clear();
			getDoctors().addAll((Collection<? extends Doctor>) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__MEDICINES:
			getMedicines().clear();
			getMedicines().addAll((Collection<? extends Medicine>) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS:
			getNutritionists().clear();
			getNutritionists().addAll((Collection<? extends Nutritionist>) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__AGE:
			setAge((Integer) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__SYMPTOMS:
			getSymptoms().clear();
			getSymptoms().addAll((Collection<? extends Symptoms>) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__OTHER_DISEASES:
			setOther_diseases((Integer) newValue);
			return;
		case Diet_mdse_reserachPackage.PATIENT__ACCESS_TOPREDICTEDDIETPLANS:
			getAccess_topredicteddietplans().clear();
			getAccess_topredicteddietplans().addAll((Collection<? extends PredictedDietplan>) newValue);
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
		case Diet_mdse_reserachPackage.PATIENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__BMI:
			setBmi(BMI_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__ACTIVITY_LEVEL:
			setActivity_level(ACTIVITY_LEVEL_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__PATIENT_TYPE:
			setPatient_type(PATIENT_TYPE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE:
			setGlucose(GLUCOSE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE_LEVEL:
			setGlucose_level(GLUCOSE_LEVEL_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__PAYMENTS:
			getPayments().clear();
			return;
		case Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS:
			getAppointments().clear();
			return;
		case Diet_mdse_reserachPackage.PATIENT__DOCTORS:
			getDoctors().clear();
			return;
		case Diet_mdse_reserachPackage.PATIENT__MEDICINES:
			getMedicines().clear();
			return;
		case Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS:
			getNutritionists().clear();
			return;
		case Diet_mdse_reserachPackage.PATIENT__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__SYMPTOMS:
			getSymptoms().clear();
			return;
		case Diet_mdse_reserachPackage.PATIENT__OTHER_DISEASES:
			setOther_diseases(OTHER_DISEASES_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.PATIENT__ACCESS_TOPREDICTEDDIETPLANS:
			getAccess_topredicteddietplans().clear();
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
		case Diet_mdse_reserachPackage.PATIENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Diet_mdse_reserachPackage.PATIENT__HEIGHT:
			return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
		case Diet_mdse_reserachPackage.PATIENT__WEIGHT:
			return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
		case Diet_mdse_reserachPackage.PATIENT__BMI:
			return BMI_EDEFAULT == null ? bmi != null : !BMI_EDEFAULT.equals(bmi);
		case Diet_mdse_reserachPackage.PATIENT__ACTIVITY_LEVEL:
			return ACTIVITY_LEVEL_EDEFAULT == null ? activity_level != null
					: !ACTIVITY_LEVEL_EDEFAULT.equals(activity_level);
		case Diet_mdse_reserachPackage.PATIENT__GENDER:
			return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
		case Diet_mdse_reserachPackage.PATIENT__PATIENT_TYPE:
			return PATIENT_TYPE_EDEFAULT == null ? patient_type != null : !PATIENT_TYPE_EDEFAULT.equals(patient_type);
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE:
			return glucose != GLUCOSE_EDEFAULT;
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE_LEVEL:
			return GLUCOSE_LEVEL_EDEFAULT == null ? glucose_level != null
					: !GLUCOSE_LEVEL_EDEFAULT.equals(glucose_level);
		case Diet_mdse_reserachPackage.PATIENT__PAYMENTS:
			return payments != null && !payments.isEmpty();
		case Diet_mdse_reserachPackage.PATIENT__APPOINTMENTS:
			return appointments != null && !appointments.isEmpty();
		case Diet_mdse_reserachPackage.PATIENT__DOCTORS:
			return doctors != null && !doctors.isEmpty();
		case Diet_mdse_reserachPackage.PATIENT__MEDICINES:
			return medicines != null && !medicines.isEmpty();
		case Diet_mdse_reserachPackage.PATIENT__NUTRITIONISTS:
			return nutritionists != null && !nutritionists.isEmpty();
		case Diet_mdse_reserachPackage.PATIENT__AGE:
			return age != AGE_EDEFAULT;
		case Diet_mdse_reserachPackage.PATIENT__SYMPTOMS:
			return symptoms != null && !symptoms.isEmpty();
		case Diet_mdse_reserachPackage.PATIENT__OTHER_DISEASES:
			return other_diseases != OTHER_DISEASES_EDEFAULT;
		case Diet_mdse_reserachPackage.PATIENT__ACCESS_TOPREDICTEDDIETPLANS:
			return access_topredicteddietplans != null && !access_topredicteddietplans.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", height: ");
		result.append(height);
		result.append(", weight: ");
		result.append(weight);
		result.append(", bmi: ");
		result.append(bmi);
		result.append(", activity_level: ");
		result.append(activity_level);
		result.append(", gender: ");
		result.append(gender);
		result.append(", patient_type: ");
		result.append(patient_type);
		result.append(", glucose: ");
		result.append(glucose);
		result.append(", glucose_level: ");
		result.append(glucose_level);
		result.append(", age: ");
		result.append(age);
		result.append(", other_diseases: ");
		result.append(other_diseases);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
