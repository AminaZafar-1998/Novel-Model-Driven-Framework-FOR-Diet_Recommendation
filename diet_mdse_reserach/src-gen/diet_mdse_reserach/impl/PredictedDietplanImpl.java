/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.PredictedDietplan;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicted Dietplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.PredictedDietplanImpl#getFood_name <em>Food name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictedDietplanImpl extends MinimalEObjectImpl.Container implements PredictedDietplan {
	/**
	 * The default value of the '{@link #getFood_name() <em>Food name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFood_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFood_name() <em>Food name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFood_name()
	 * @generated
	 * @ordered
	 */
	protected String food_name = FOOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictedDietplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.PREDICTED_DIETPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFood_name() {
		return food_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFood_name(String newFood_name) {
		String oldFood_name = food_name;
		food_name = newFood_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.PREDICTED_DIETPLAN__FOOD_NAME, oldFood_name, food_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void normalize_blood_sugar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void weightloss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN__FOOD_NAME:
			return getFood_name();
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
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN__FOOD_NAME:
			setFood_name((String) newValue);
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
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN__FOOD_NAME:
			setFood_name(FOOD_NAME_EDEFAULT);
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
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN__FOOD_NAME:
			return FOOD_NAME_EDEFAULT == null ? food_name != null : !FOOD_NAME_EDEFAULT.equals(food_name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN___NORMALIZE_BLOOD_SUGAR:
			normalize_blood_sugar();
			return null;
		case Diet_mdse_reserachPackage.PREDICTED_DIETPLAN___WEIGHTLOSS:
			weightloss();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (food_name: ");
		result.append(food_name);
		result.append(')');
		return result.toString();
	}

} //PredictedDietplanImpl
