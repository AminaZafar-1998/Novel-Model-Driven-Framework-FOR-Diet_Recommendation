/**
 */
package diet_mdse_reserach.impl;

import diet_mdse_reserach.Dataset;
import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.FoodType;
import diet_mdse_reserach.ML_algo;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diet_mdse_reserach.impl.DatasetImpl#getName <em>Name</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DatasetImpl#getType <em>Type</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DatasetImpl#getFoodcalories <em>Foodcalories</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DatasetImpl#getFood_type <em>Food type</em>}</li>
 *   <li>{@link diet_mdse_reserach.impl.DatasetImpl#getMl_algos <em>Ml algos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetImpl extends MinimalEObjectImpl.Container implements Dataset {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFoodcalories() <em>Foodcalories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodcalories()
	 * @generated
	 * @ordered
	 */
	protected static final String FOODCALORIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFoodcalories() <em>Foodcalories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodcalories()
	 * @generated
	 * @ordered
	 */
	protected String foodcalories = FOODCALORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFood_type() <em>Food type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFood_type()
	 * @generated
	 * @ordered
	 */
	protected static final FoodType FOOD_TYPE_EDEFAULT = FoodType.PROTIEN;

	/**
	 * The cached value of the '{@link #getFood_type() <em>Food type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFood_type()
	 * @generated
	 * @ordered
	 */
	protected FoodType food_type = FOOD_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMl_algos() <em>Ml algos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMl_algos()
	 * @generated
	 * @ordered
	 */
	protected EList<ML_algo> ml_algos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diet_mdse_reserachPackage.Literals.DATASET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.DATASET__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.DATASET__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFoodcalories() {
		return foodcalories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFoodcalories(String newFoodcalories) {
		String oldFoodcalories = foodcalories;
		foodcalories = newFoodcalories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.DATASET__FOODCALORIES,
					oldFoodcalories, foodcalories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FoodType getFood_type() {
		return food_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFood_type(FoodType newFood_type) {
		FoodType oldFood_type = food_type;
		food_type = newFood_type == null ? FOOD_TYPE_EDEFAULT : newFood_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diet_mdse_reserachPackage.DATASET__FOOD_TYPE,
					oldFood_type, food_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ML_algo> getMl_algos() {
		if (ml_algos == null) {
			ml_algos = new EObjectResolvingEList<ML_algo>(ML_algo.class, this,
					Diet_mdse_reserachPackage.DATASET__ML_ALGOS);
		}
		return ml_algos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Diet_mdse_reserachPackage.DATASET__NAME:
			return getName();
		case Diet_mdse_reserachPackage.DATASET__TYPE:
			return getType();
		case Diet_mdse_reserachPackage.DATASET__FOODCALORIES:
			return getFoodcalories();
		case Diet_mdse_reserachPackage.DATASET__FOOD_TYPE:
			return getFood_type();
		case Diet_mdse_reserachPackage.DATASET__ML_ALGOS:
			return getMl_algos();
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
		case Diet_mdse_reserachPackage.DATASET__NAME:
			setName((String) newValue);
			return;
		case Diet_mdse_reserachPackage.DATASET__TYPE:
			setType((String) newValue);
			return;
		case Diet_mdse_reserachPackage.DATASET__FOODCALORIES:
			setFoodcalories((String) newValue);
			return;
		case Diet_mdse_reserachPackage.DATASET__FOOD_TYPE:
			setFood_type((FoodType) newValue);
			return;
		case Diet_mdse_reserachPackage.DATASET__ML_ALGOS:
			getMl_algos().clear();
			getMl_algos().addAll((Collection<? extends ML_algo>) newValue);
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
		case Diet_mdse_reserachPackage.DATASET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.DATASET__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.DATASET__FOODCALORIES:
			setFoodcalories(FOODCALORIES_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.DATASET__FOOD_TYPE:
			setFood_type(FOOD_TYPE_EDEFAULT);
			return;
		case Diet_mdse_reserachPackage.DATASET__ML_ALGOS:
			getMl_algos().clear();
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
		case Diet_mdse_reserachPackage.DATASET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Diet_mdse_reserachPackage.DATASET__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case Diet_mdse_reserachPackage.DATASET__FOODCALORIES:
			return FOODCALORIES_EDEFAULT == null ? foodcalories != null : !FOODCALORIES_EDEFAULT.equals(foodcalories);
		case Diet_mdse_reserachPackage.DATASET__FOOD_TYPE:
			return food_type != FOOD_TYPE_EDEFAULT;
		case Diet_mdse_reserachPackage.DATASET__ML_ALGOS:
			return ml_algos != null && !ml_algos.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", foodcalories: ");
		result.append(foodcalories);
		result.append(", Food_type: ");
		result.append(food_type);
		result.append(')');
		return result.toString();
	}

} //DatasetImpl
