/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML algo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.ML_algo#getPerformancemetrices <em>Performancemetrices</em>}</li>
 *   <li>{@link diet_mdse_reserach.ML_algo#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.ML_algo#getGenerate_diet_plans <em>Generate diet plans</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getML_algo()
 * @model abstract="true"
 * @generated
 */
public interface ML_algo extends EObject {
	/**
	 * Returns the value of the '<em><b>Performancemetrices</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.PerformanceMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performancemetrices</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getML_algo_Performancemetrices()
	 * @model
	 * @generated
	 */
	EList<PerformanceMetric> getPerformancemetrices();

	/**
	 * Returns the value of the '<em><b>Generate diet plans</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.PredictedDietplan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate diet plans</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getML_algo_Generate_diet_plans()
	 * @model required="true"
	 * @generated
	 */
	EList<PredictedDietplan> getGenerate_diet_plans();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getML_algo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.ML_algo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RandomForest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void k_means();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void svm();

} // ML_algo
