/**
 */
package diet_mdse_reserach.util;

import diet_mdse_reserach.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage
 * @generated
 */
public class Diet_mdse_reserachSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Diet_mdse_reserachPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet_mdse_reserachSwitch() {
		if (modelPackage == null) {
			modelPackage = Diet_mdse_reserachPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM: {
			DietRecommendationSystem dietRecommendationSystem = (DietRecommendationSystem) theEObject;
			T result = caseDietRecommendationSystem(dietRecommendationSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.PATIENT: {
			Patient patient = (Patient) theEObject;
			T result = casePatient(patient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.NUTRITIONIST: {
			Nutritionist nutritionist = (Nutritionist) theEObject;
			T result = caseNutritionist(nutritionist);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.APPOINTMENT: {
			Appointment appointment = (Appointment) theEObject;
			T result = caseAppointment(appointment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.PAYMENT: {
			Payment payment = (Payment) theEObject;
			T result = casePayment(payment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.DOCTOR: {
			Doctor doctor = (Doctor) theEObject;
			T result = caseDoctor(doctor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.MEDICINE: {
			Medicine medicine = (Medicine) theEObject;
			T result = caseMedicine(medicine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.ML_ALGO: {
			ML_algo mL_algo = (ML_algo) theEObject;
			T result = caseML_algo(mL_algo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.RANDOM_FOREST: {
			RandomForest randomForest = (RandomForest) theEObject;
			T result = caseRandomForest(randomForest);
			if (result == null)
				result = caseML_algo(randomForest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN: {
			PredictedDietplan predictedDietplan = (PredictedDietplan) theEObject;
			T result = casePredictedDietplan(predictedDietplan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.KMEANS: {
			K_means k_means = (K_means) theEObject;
			T result = caseK_means(k_means);
			if (result == null)
				result = caseML_algo(k_means);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.DATASET: {
			Dataset dataset = (Dataset) theEObject;
			T result = caseDataset(dataset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE: {
			SupportVectorMachine supportVectorMachine = (SupportVectorMachine) theEObject;
			T result = caseSupportVectorMachine(supportVectorMachine);
			if (result == null)
				result = caseML_algo(supportVectorMachine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.SYMPTOMS: {
			Symptoms symptoms = (Symptoms) theEObject;
			T result = caseSymptoms(symptoms);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC: {
			PerformanceMetric performanceMetric = (PerformanceMetric) theEObject;
			T result = casePerformanceMetric(performanceMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diet Recommendation System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diet Recommendation System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDietRecommendationSystem(DietRecommendationSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutritionist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutritionist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionist(Nutritionist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appointment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppointment(Appointment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(Payment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doctor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoctor(Doctor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medicine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medicine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicine(Medicine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML algo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML algo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseML_algo(ML_algo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Forest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Forest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomForest(RandomForest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicted Dietplan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicted Dietplan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredictedDietplan(PredictedDietplan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kmeans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kmeans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseK_means(K_means object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataset(Dataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Vector Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Vector Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportVectorMachine(SupportVectorMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symptoms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymptoms(Symptoms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceMetric(PerformanceMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Diet_mdse_reserachSwitch
