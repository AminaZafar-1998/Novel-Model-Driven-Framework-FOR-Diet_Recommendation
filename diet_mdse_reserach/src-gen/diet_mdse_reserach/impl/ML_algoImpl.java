/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.ML_algo;
import diet_mdse_reserach.PerformanceMetric;
import diet_mdse_reserach.PredictedDietplan;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML algo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.ML_algoImpl#getPerformancemetrices <em>Performancemetrices</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.ML_algoImpl#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.ML_algoImpl#getGenerate_diet_plans <em>Generate diet plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ML_algoImpl extends MinimalEObjectImpl.Container implements ML_algo {
	/**
	 * The cached value of the '{@link #getPerformancemetrices() <em>Performancemetrices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformancemetrices()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceMetric> performancemetrices;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerate_diet_plans() <em>Generate diet plans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerate_diet_plans()
	 * @generated
	 * @ordered
	 */
	protected EList<PredictedDietplan> generate_diet_plans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ML_algoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.ML_ALGO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PerformanceMetric> getPerformancemetrices() {
		if (performancemetrices == null) {
			performancemetrices = new EObjectResolvingEList<PerformanceMetric>(PerformanceMetric.class, this,
					Diet_mdse_reserachPackage.ML_ALGO__PERFORMANCEMETRICES);
		}
		return performancemetrices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PredictedDietplan> getGenerate_diet_plans() {
		if (generate_diet_plans == null) {
			generate_diet_plans = new EObjectResolvingEList<PredictedDietplan>(PredictedDietplan.class, this,
					Diet_mdse_reserachPackage.ML_ALGO__GENERATE_DIET_PLANS);
		}
		return generate_diet_plans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.ML_ALGO__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void RandomForest() {
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
	public void k_means() {
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
	public void svm() {
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
		case Diet_mdse_reserachPackage.ML_ALGO__PERFORMANCEMETRICES:
			return getPerformancemetrices();
		case Diet_mdse_reserachPackage.ML_ALGO__NAME:
			return getName();
		case Diet_mdse_reserachPackage.ML_ALGO__GENERATE_DIET_PLANS:
			return getGenerate_diet_plans();
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
		case Diet_mdse_reserachPackage.ML_ALGO__PERFORMANCEMETRICES:
			getPerformancemetrices().clear();
			getPerformancemetrices().addAll((Collection<? extends PerformanceMetric>) newValue);
			return;
		case Diet_mdse_reserachPackage.ML_ALGO__NAME:
			setName((String) newValue);
			return;
		case Diet_mdse_reserachPackage.ML_ALGO__GENERATE_DIET_PLANS:
			getGenerate_diet_plans().clear();
			getGenerate_diet_plans().addAll((Collection<? extends PredictedDietplan>) newValue);
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
		case Diet_mdse_reserachPackage.ML_ALGO__PERFORMANCEMETRICES:
			getPerformancemetrices().clear();
			return;
		case Diet_mdse_reserachPackage.ML_ALGO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.ML_ALGO__GENERATE_DIET_PLANS:
			getGenerate_diet_plans().clear();
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
		case Diet_mdse_reserachPackage.ML_ALGO__PERFORMANCEMETRICES:
			return performancemetrices != null && !performancemetrices.isEmpty();
		case Diet_mdse_reserachPackage.ML_ALGO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Diet_mdse_reserachPackage.ML_ALGO__GENERATE_DIET_PLANS:
			return generate_diet_plans != null && !generate_diet_plans.isEmpty();
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
		case Diet_mdse_reserachPackage.ML_ALGO___RANDOM_FOREST:
			RandomForest();
			return null;
		case Diet_mdse_reserachPackage.ML_ALGO___KMEANS:
			k_means();
			return null;
		case Diet_mdse_reserachPackage.ML_ALGO___SVM:
			svm();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ML_algoImpl
