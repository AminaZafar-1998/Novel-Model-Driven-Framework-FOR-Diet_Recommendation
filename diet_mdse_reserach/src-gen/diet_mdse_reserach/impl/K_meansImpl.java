/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.K_means;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kmeans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.K_meansImpl#getNumber_Of_Cluster <em>Number Of Cluster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class K_meansImpl extends ML_algoImpl implements K_means {
	/**
	 * The default value of the '{@link #getNumber_Of_Cluster() <em>Number Of Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_Of_Cluster()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_CLUSTER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumber_Of_Cluster() <em>Number Of Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_Of_Cluster()
	 * @generated
	 * @ordered
	 */
	protected String number_Of_Cluster = NUMBER_OF_CLUSTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected K_meansImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.KMEANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber_Of_Cluster() {
		return number_Of_Cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber_Of_Cluster(String newNumber_Of_Cluster) {
		String oldNumber_Of_Cluster = number_Of_Cluster;
		number_Of_Cluster = newNumber_Of_Cluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.KMEANS__NUMBER_OF_CLUSTER,
					oldNumber_Of_Cluster, number_Of_Cluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.KMEANS__NUMBER_OF_CLUSTER:
			return getNumber_Of_Cluster();
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
		case Diet_mdse_reserachPackage.KMEANS__NUMBER_OF_CLUSTER:
			setNumber_Of_Cluster((String) newValue);
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
		case Diet_mdse_reserachPackage.KMEANS__NUMBER_OF_CLUSTER:
			setNumber_Of_Cluster(NUMBER_OF_CLUSTER_EDEFAULT);
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
		case Diet_mdse_reserachPackage.KMEANS__NUMBER_OF_CLUSTER:
			return NUMBER_OF_CLUSTER_EDEFAULT == null ? number_Of_Cluster != null
					: !NUMBER_OF_CLUSTER_EDEFAULT.equals(number_Of_Cluster);
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
		result.append(" (number_Of_Cluster: ");
		result.append(number_Of_Cluster);
		result.append(')');
		return result.toString();
	}

} //K_meansImpl
