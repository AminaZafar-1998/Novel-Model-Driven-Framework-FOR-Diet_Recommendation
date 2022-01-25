/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.Medicine#getMedicine_name <em>Medicine name</em>}</li>
 *   <li>{@link diet_mdse_reserach.Medicine#getMedicine_dossage <em>Medicine dossage</em>}</li>
 *   <li>{@link diet_mdse_reserach.Medicine#getDatasets <em>Datasets</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getMedicine()
 * @model
 * @generated
 */
public interface Medicine extends EObject {
	/**
	 * Returns the value of the '<em><b>Medicine name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicine name</em>' attribute.
	 * @see #setMedicine_name(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getMedicine_Medicine_name()
	 * @model
	 * @generated
	 */
	String getMedicine_name();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Medicine#getMedicine_name <em>Medicine name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicine name</em>' attribute.
	 * @see #getMedicine_name()
	 * @generated
	 */
	void setMedicine_name(String value);

	/**
	 * Returns the value of the '<em><b>Medicine dossage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicine dossage</em>' attribute.
	 * @see #setMedicine_dossage(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getMedicine_Medicine_dossage()
	 * @model
	 * @generated
	 */
	String getMedicine_dossage();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Medicine#getMedicine_dossage <em>Medicine dossage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicine dossage</em>' attribute.
	 * @see #getMedicine_dossage()
	 * @generated
	 */
	void setMedicine_dossage(String value);

	/**
	 * Returns the value of the '<em><b>Datasets</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasets</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getMedicine_Datasets()
	 * @model required="true"
	 * @generated
	 */
	EList<Dataset> getDatasets();

} // Medicine
