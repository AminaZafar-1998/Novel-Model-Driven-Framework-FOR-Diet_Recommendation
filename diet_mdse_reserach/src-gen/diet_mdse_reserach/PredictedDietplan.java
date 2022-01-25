/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicted Dietplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.PredictedDietplan#getFood_name <em>Food name</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPredictedDietplan()
 * @model
 * @generated
 */
public interface PredictedDietplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Food name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food name</em>' attribute.
	 * @see #setFood_name(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getPredictedDietplan_Food_name()
	 * @model
	 * @generated
	 */
	String getFood_name();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.PredictedDietplan#getFood_name <em>Food name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food name</em>' attribute.
	 * @see #getFood_name()
	 * @generated
	 */
	void setFood_name(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void normalize_blood_sugar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void weightloss();

} // PredictedDietplan
