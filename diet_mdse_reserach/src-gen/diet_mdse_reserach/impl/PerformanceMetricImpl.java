/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.PerformanceMetric;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.PerformanceMetricImpl#getMetrices <em>Metrices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceMetricImpl extends MinimalEObjectImpl.Container implements PerformanceMetric {
	/**
	 * The default value of the '{@link #getMetrices() <em>Metrices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrices()
	 * @generated
	 * @ordered
	 */
	protected static final String METRICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetrices() <em>Metrices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrices()
	 * @generated
	 * @ordered
	 */
	protected String metrices = METRICES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.PERFORMANCE_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetrices() {
		return metrices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetrices(String newMetrices) {
		String oldMetrices = metrices;
		metrices = newMetrices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.PERFORMANCE_METRIC__METRICES, oldMetrices, metrices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void confusionmatrix() {
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
	public void accuracy_score() {
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
	public void classification_report() {
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
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC__METRICES:
			return getMetrices();
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
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC__METRICES:
			setMetrices((String) newValue);
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
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC__METRICES:
			setMetrices(METRICES_EDEFAULT);
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
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC__METRICES:
			return METRICES_EDEFAULT == null ? metrices != null : !METRICES_EDEFAULT.equals(metrices);
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
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC___CONFUSIONMATRIX:
			confusionmatrix();
			return null;
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC___ACCURACY_SCORE:
			accuracy_score();
			return null;
		case Diet_mdse_reserachPackage.PERFORMANCE_METRIC___CLASSIFICATION_REPORT:
			classification_report();
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
		result.append(" (metrices: ");
		result.append(metrices);
		result.append(')');
		return result.toString();
	}

} //PerformanceMetricImpl
