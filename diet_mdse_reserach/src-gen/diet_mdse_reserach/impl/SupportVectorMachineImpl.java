/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.SupportVectorMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Support Vector Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.SupportVectorMachineImpl#getKernel <em>Kernel</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.SupportVectorMachineImpl#getC_value <em>Cvalue</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.SupportVectorMachineImpl#getGamma_value <em>Gamma value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportVectorMachineImpl extends ML_algoImpl implements SupportVectorMachine {
	/**
	 * The default value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel()
	 * @generated
	 * @ordered
	 */
	protected static final String KERNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernel() <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel()
	 * @generated
	 * @ordered
	 */
	protected String kernel = KERNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getC_value() <em>Cvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_value()
	 * @generated
	 * @ordered
	 */
	protected static final String CVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC_value() <em>Cvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC_value()
	 * @generated
	 * @ordered
	 */
	protected String c_value = CVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGamma_value() <em>Gamma value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma_value()
	 * @generated
	 * @ordered
	 */
	protected static final String GAMMA_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGamma_value() <em>Gamma value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma_value()
	 * @generated
	 * @ordered
	 */
	protected String gamma_value = GAMMA_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportVectorMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.SUPPORT_VECTOR_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKernel() {
		return kernel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKernel(String newKernel) {
		String oldKernel = kernel;
		kernel = newKernel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__KERNEL, oldKernel, kernel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getC_value() {
		return c_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setC_value(String newC_value) {
		String oldC_value = c_value;
		c_value = newC_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__CVALUE, oldC_value, c_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGamma_value() {
		return gamma_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGamma_value(String newGamma_value) {
		String oldGamma_value = gamma_value;
		gamma_value = newGamma_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__GAMMA_VALUE, oldGamma_value, gamma_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__KERNEL:
			return getKernel();
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__CVALUE:
			return getC_value();
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__GAMMA_VALUE:
			return getGamma_value();
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
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__KERNEL:
			setKernel((String) newValue);
			return;
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__CVALUE:
			setC_value((String) newValue);
			return;
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__GAMMA_VALUE:
			setGamma_value((String) newValue);
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
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__KERNEL:
			setKernel(KERNEL_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__CVALUE:
			setC_value(CVALUE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__GAMMA_VALUE:
			setGamma_value(GAMMA_VALUE_EDEFAULT);
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
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__KERNEL:
			return KERNEL_EDEFAULT == null ? kernel != null : !KERNEL_EDEFAULT.equals(kernel);
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__CVALUE:
			return CVALUE_EDEFAULT == null ? c_value != null : !CVALUE_EDEFAULT.equals(c_value);
		case Diet_mdse_reserachPackage.SUPPORT_VECTOR_MACHINE__GAMMA_VALUE:
			return GAMMA_VALUE_EDEFAULT == null ? gamma_value != null : !GAMMA_VALUE_EDEFAULT.equals(gamma_value);
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
		result.append(" (Kernel: ");
		result.append(kernel);
		result.append(", c_value: ");
		result.append(c_value);
		result.append(", gamma_value: ");
		result.append(gamma_value);
		result.append(')');
		return result.toString();
	}

} //SupportVectorMachineImpl
