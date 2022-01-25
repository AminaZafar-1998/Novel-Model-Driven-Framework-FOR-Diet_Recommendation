/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Dataset;
import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Symptoms;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symptoms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.SymptomsImpl#getSymptom_name <em>Symptom name</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.SymptomsImpl#getSeveritylevel <em>Severitylevel</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.SymptomsImpl#getDatasets <em>Datasets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymptomsImpl extends MinimalEObjectImpl.Container implements Symptoms {
	/**
	 * The default value of the '{@link #getSymptom_name() <em>Symptom name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptom_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMPTOM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymptom_name() <em>Symptom name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymptom_name()
	 * @generated
	 * @ordered
	 */
	protected String symptom_name = SYMPTOM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeveritylevel() <em>Severitylevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeveritylevel()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITYLEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeveritylevel() <em>Severitylevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeveritylevel()
	 * @generated
	 * @ordered
	 */
	protected String severitylevel = SEVERITYLEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatasets() <em>Datasets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasets()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> datasets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymptomsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.SYMPTOMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymptom_name() {
		return symptom_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymptom_name(String newSymptom_name) {
		String oldSymptom_name = symptom_name;
		symptom_name = newSymptom_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.SYMPTOMS__SYMPTOM_NAME,
					oldSymptom_name, symptom_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeveritylevel() {
		return severitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeveritylevel(String newSeveritylevel) {
		String oldSeveritylevel = severitylevel;
		severitylevel = newSeveritylevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.SYMPTOMS__SEVERITYLEVEL,
					oldSeveritylevel, severitylevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dataset> getDatasets() {
		if (datasets == null) {
			datasets = new EObjectResolvingEList<Dataset>(Dataset.class, this,
					Diet_mdse_reserachPackage.SYMPTOMS__DATASETS);
		}
		return datasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.SYMPTOMS__SYMPTOM_NAME:
			return getSymptom_name();
		case Diet_mdse_reserachPackage.SYMPTOMS__SEVERITYLEVEL:
			return getSeveritylevel();
		case Diet_mdse_reserachPackage.SYMPTOMS__DATASETS:
			return getDatasets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.SYMPTOMS__SYMPTOM_NAME:
			setSymptom_name((String) newValue);
			return;
		case Diet_mdse_reserachPackage.SYMPTOMS__SEVERITYLEVEL:
			setSeveritylevel((String) newValue);
			return;
		case Diet_mdse_reserachPackage.SYMPTOMS__DATASETS:
			getDatasets().clear();
			getDatasets().addAll((Collection<? extends Dataset>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.SYMPTOMS__SYMPTOM_NAME:
			setSymptom_name(SYMPTOM_NAME_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.SYMPTOMS__SEVERITYLEVEL:
			setSeveritylevel(SEVERITYLEVEL_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.SYMPTOMS__DATASETS:
			getDatasets().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.SYMPTOMS__SYMPTOM_NAME:
			return SYMPTOM_NAME_EDEFAULT == null ? symptom_name != null : !SYMPTOM_NAME_EDEFAULT.equals(symptom_name);
		case Diet_mdse_reserachPackage.SYMPTOMS__SEVERITYLEVEL:
			return SEVERITYLEVEL_EDEFAULT == null ? severitylevel != null
					: !SEVERITYLEVEL_EDEFAULT.equals(severitylevel);
		case Diet_mdse_reserachPackage.SYMPTOMS__DATASETS:
			return datasets != null && !datasets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (symptom_name: ");
		result.append(symptom_name);
		result.append(", severitylevel: ");
		result.append(severitylevel);
		result.append(')');
		return result.toString();
	}

} //SymptomsImpl
