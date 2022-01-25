/**
 */
package diet_mdse_reserach;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Forest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.RandomForest#getCreteria <em>Creteria</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getRandomForest()
 * @model
 * @generated
 */
public interface RandomForest extends ML_algo {

	/**
	 * Returns the value of the '<em><b>Creteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creteria</em>' attribute.
	 * @see #setCreteria(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getRandomForest_Creteria()
	 * @model
	 * @generated
	 */
	String getCreteria();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.RandomForest#getCreteria <em>Creteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creteria</em>' attribute.
	 * @see #getCreteria()
	 * @generated
	 */
	void setCreteria(String value);
} // RandomForest
