/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.Dataset#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.Dataset#getType <em>Type</em>}</li>
 *   <li>{@link diet_mdse_reserach.Dataset#getFoodcalories <em>Foodcalories</em>}</li>
 *   <li>{@link diet_mdse_reserach.Dataset#getFood_type <em>Food type</em>}</li>
 *   <li>{@link diet_mdse_reserach.Dataset#getMl_algos <em>Ml algos</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDataset_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Dataset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDataset_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Dataset#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Foodcalories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foodcalories</em>' attribute.
	 * @see #setFoodcalories(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDataset_Foodcalories()
	 * @model
	 * @generated
	 */
	String getFoodcalories();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Dataset#getFoodcalories <em>Foodcalories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foodcalories</em>' attribute.
	 * @see #getFoodcalories()
	 * @generated
	 */
	void setFoodcalories(String value);

	/**
	 * Returns the value of the '<em><b>Food type</b></em>' attribute.
	 * The literals are from the enumeration {@link diet_mdse_reserach.FoodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food type</em>' attribute.
	 * @see diet_mdse_reserach.FoodType
	 * @see #setFood_type(FoodType)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDataset_Food_type()
	 * @model
	 * @generated
	 */
	FoodType getFood_type();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Dataset#getFood_type <em>Food type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Food type</em>' attribute.
	 * @see diet_mdse_reserach.FoodType
	 * @see #getFood_type()
	 * @generated
	 */
	void setFood_type(FoodType value);

	/**
	 * Returns the value of the '<em><b>Ml algos</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.ML_algo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ml algos</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDataset_Ml_algos()
	 * @model required="true"
	 * @generated
	 */
	EList<ML_algo> getMl_algos();

} // Dataset
