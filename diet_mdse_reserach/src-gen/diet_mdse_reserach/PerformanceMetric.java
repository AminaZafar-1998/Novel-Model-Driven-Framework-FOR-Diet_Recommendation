/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.PerformanceMetric#getMetrices <em>Metrices</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPerformanceMetric()
 * @model
 * @generated
 */
public interface PerformanceMetric extends EObject {
	/**
	 * Returns the value of the '<em><b>Metrices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrices</em>' attribute.
	 * @see #setMetrices(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPerformanceMetric_Metrices()
	 * @model
	 * @generated
	 */
	String getMetrices();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.PerformanceMetric#getMetrices <em>Metrices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrices</em>' attribute.
	 * @see #getMetrices()
	 * @generated
	 */
	void setMetrices(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void confusionmatrix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accuracy_score();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void classification_report();

} // PerformanceMetric
