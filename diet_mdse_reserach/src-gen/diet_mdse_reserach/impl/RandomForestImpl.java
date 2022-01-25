/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.RandomForest;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Forest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.RandomForestImpl#getCreteria <em>Creteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomForestImpl extends ML_algoImpl implements RandomForest {
	/**
	 * The default value of the '{@link #getCreteria() <em>Creteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreteria()
	 * @generated
	 * @ordered
	 */
	protected static final String CRETERIA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreteria() <em>Creteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreteria()
	 * @generated
	 * @ordered
	 */
	protected String creteria = CRETERIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomForestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.RANDOM_FOREST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreteria() {
		return creteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreteria(String newCreteria) {
		String oldCreteria = creteria;
		creteria = newCreteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.RANDOM_FOREST__CRETERIA,
					oldCreteria, creteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.RANDOM_FOREST__CRETERIA:
			return getCreteria();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.RANDOM_FOREST__CRETERIA:
			setCreteria((String) newValue);
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
		case Diet_mdse_reserachPackage.RANDOM_FOREST__CRETERIA:
			setCreteria(CRETERIA_EDEFAULT);
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
		case Diet_mdse_reserachPackage.RANDOM_FOREST__CRETERIA:
			return CRETERIA_EDEFAULT == null ? creteria != null : !CRETERIA_EDEFAULT.equals(creteria);
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
		result.append(" (creteria: ");
		result.append(creteria);
		result.append(')');
		return result.toString();
	}

} //RandomForestImpl
