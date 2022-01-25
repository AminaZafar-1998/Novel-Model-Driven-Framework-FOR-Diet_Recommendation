/**
 */
package diet_mdse_reserach;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Vector Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.SupportVectorMachine#getKernel <em>Kernel</em>}</li>
 *   <li>{@link diet_mdse_reserach.SupportVectorMachine#getC_value <em>Cvalue</em>}</li>
 *   <li>{@link diet_mdse_reserach.SupportVectorMachine#getGamma_value <em>Gamma value</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSupportVectorMachine()
 * @model
 * @generated
 */
public interface SupportVectorMachine extends ML_algo {
	/**
	 * Returns the value of the '<em><b>Kernel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel</em>' attribute.
	 * @see #setKernel(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSupportVectorMachine_Kernel()
	 * @model
	 * @generated
	 */
	String getKernel();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.SupportVectorMachine#getKernel <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel</em>' attribute.
	 * @see #getKernel()
	 * @generated
	 */
	void setKernel(String value);

	/**
	 * Returns the value of the '<em><b>Cvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvalue</em>' attribute.
	 * @see #setC_value(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSupportVectorMachine_C_value()
	 * @model
	 * @generated
	 */
	String getC_value();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.SupportVectorMachine#getC_value <em>Cvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvalue</em>' attribute.
	 * @see #getC_value()
	 * @generated
	 */
	void setC_value(String value);

	/**
	 * Returns the value of the '<em><b>Gamma value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamma value</em>' attribute.
	 * @see #setGamma_value(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSupportVectorMachine_Gamma_value()
	 * @model
	 * @generated
	 */
	String getGamma_value();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.SupportVectorMachine#getGamma_value <em>Gamma value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma value</em>' attribute.
	 * @see #getGamma_value()
	 * @generated
	 */
	void setGamma_value(String value);

} // SupportVectorMachine
