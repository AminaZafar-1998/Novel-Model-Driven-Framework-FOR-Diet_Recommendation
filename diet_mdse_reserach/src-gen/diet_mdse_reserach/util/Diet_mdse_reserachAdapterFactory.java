/**
 */
package diet_mdse_reserach.util;

import diet_mdse_reserach.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage
 * @generated
 */
public class Diet_mdse_reserachAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Diet_mdse_reserachPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diet_mdse_reserachAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Diet_mdse_reserachPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Diet_mdse_reserachSwitch<Adapter> modelSwitch = new Diet_mdse_reserachSwitch<Adapter>() {
		@Override
		public Adapter caseDietRecommendationSystem(DietRecommendationSystem object) {
			return createDietRecommendationSystemAdapter();
		}

		@Override
		public Adapter casePatient(Patient object) {
			return createPatientAdapter();
		}

		@Override
		public Adapter caseNutritionist(Nutritionist object) {
			return createNutritionistAdapter();
		}

		@Override
		public Adapter caseAppointment(Appointment object) {
			return createAppointmentAdapter();
		}

		@Override
		public Adapter casePayment(Payment object) {
			return createPaymentAdapter();
		}

		@Override
		public Adapter caseDoctor(Doctor object) {
			return createDoctorAdapter();
		}

		@Override
		public Adapter caseMedicine(Medicine object) {
			return createMedicineAdapter();
		}

		@Override
		public Adapter caseML_algo(ML_algo object) {
			return createML_algoAdapter();
		}

		@Override
		public Adapter caseRandomForest(RandomForest object) {
			return createRandomForestAdapter();
		}

		@Override
		public Adapter casePredictedDietplan(PredictedDietplan object) {
			return createPredictedDietplanAdapter();
		}

		@Override
		public Adapter caseK_means(K_means object) {
			return createK_meansAdapter();
		}

		@Override
		public Adapter caseDataset(Dataset object) {
			return createDatasetAdapter();
		}

		@Override
		public Adapter caseSupportVectorMachine(SupportVectorMachine object) {
			return createSupportVectorMachineAdapter();
		}

		@Override
		public Adapter caseSymptoms(Symptoms object) {
			return createSymptomsAdapter();
		}

		@Override
		public Adapter casePerformanceMetric(PerformanceMetric object) {
			return createPerformanceMetricAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.DietRecommendationSystem <em>Diet Recommendation System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.DietRecommendationSystem
	 * @generated
	 */
	public Adapter createDietRecommendationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Nutritionist <em>Nutritionist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Nutritionist
	 * @generated
	 */
	public Adapter createNutritionistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Appointment
	 * @generated
	 */
	public Adapter createAppointmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Doctor
	 * @generated
	 */
	public Adapter createDoctorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Medicine <em>Medicine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Medicine
	 * @generated
	 */
	public Adapter createMedicineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.ML_algo <em>ML algo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.ML_algo
	 * @generated
	 */
	public Adapter createML_algoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.RandomForest <em>Random Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.RandomForest
	 * @generated
	 */
	public Adapter createRandomForestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.PredictedDietplan <em>Predicted Dietplan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.PredictedDietplan
	 * @generated
	 */
	public Adapter createPredictedDietplanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.K_means <em>Kmeans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.K_means
	 * @generated
	 */
	public Adapter createK_meansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Dataset
	 * @generated
	 */
	public Adapter createDatasetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.SupportVectorMachine <em>Support Vector Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.SupportVectorMachine
	 * @generated
	 */
	public Adapter createSupportVectorMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.Symptoms <em>Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.Symptoms
	 * @generated
	 */
	public Adapter createSymptomsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diet_mdse_reserach.PerformanceMetric <em>Performance Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diet_mdse_reserach.PerformanceMetric
	 * @generated
	 */
	public Adapter createPerformanceMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Diet_mdse_reserachAdapterFactory
