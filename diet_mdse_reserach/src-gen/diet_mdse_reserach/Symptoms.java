/**
 */
package diet_mdse_reserach;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symptoms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.Symptoms#getSymptom_name <em>Symptom name</em>}</li>
 *   <li>{@link diet_mdse_reserach.Symptoms#getSeveritylevel <em>Severitylevel</em>}</li>
 *   <li>{@link diet_mdse_reserach.Symptoms#getDatasets <em>Datasets</em>}</li>
 * </ul>
 *
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSymptoms()
 * @model
 * @generated
 */
public interface Symptoms extends EObject {
	/**
	 * Returns the value of the '<em><b>Symptom name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symptom name</em>' attribute.
	 * @see #setSymptom_name(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSymptoms_Symptom_name()
	 * @model
	 * @generated
	 */
	String getSymptom_name();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Symptoms#getSymptom_name <em>Symptom name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symptom name</em>' attribute.
	 * @see #getSymptom_name()
	 * @generated
	 */
	void setSymptom_name(String value);

	/**
	 * Returns the value of the '<em><b>Severitylevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severitylevel</em>' attribute.
	 * @see #setSeveritylevel(String)
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSymptoms_Severitylevel()
	 * @model
	 * @generated
	 */
	String getSeveritylevel();

	/**
	 * Sets the value of the '{@link diet_mdse_reserach.Symptoms#getSeveritylevel <em>Severitylevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severitylevel</em>' attribute.
	 * @see #getSeveritylevel()
	 * @generated
	 */
	void setSeveritylevel(String value);

	/**
	 * Returns the value of the '<em><b>Datasets</b></em>' reference list.
	 * The list contents are of type {@link diet_mdse_reserach.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasets</em>' reference list.
	 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getSymptoms_Datasets()
	 * @model required="true"
	 * @generated
	 */
	EList<Dataset> getDatasets();

} // Symptoms
