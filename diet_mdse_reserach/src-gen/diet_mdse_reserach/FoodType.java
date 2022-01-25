/**
 */
package diet_mdse_reserach;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Food Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getFoodType()
 * @model
 * @generated
 */
public enum FoodType implements Enumerator {
	/**
	 * The '<em><b>Protien</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTIEN_VALUE
	 * @generated
	 * @ordered
	 */
	PROTIEN(0, "Protien", "Protien"),

	/**
	 * The '<em><b>Carbohydrate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBOHYDRATE_VALUE
	 * @generated
	 * @ordered
	 */
	CARBOHYDRATE(1, "Carbohydrate", "Carbohydrate");

	/**
	 * The '<em><b>Protien</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTIEN
	 * @model name="Protien"
	 * @generated
	 * @ordered
	 */
	public static final int PROTIEN_VALUE = 0;

	/**
	 * The '<em><b>Carbohydrate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARBOHYDRATE
	 * @model name="Carbohydrate"
	 * @generated
	 * @ordered
	 */
	public static final int CARBOHYDRATE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Food Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FoodType[] VALUES_ARRAY = new FoodType[] { PROTIEN, CARBOHYDRATE, };

	/**
	 * A public read-only list of all the '<em><b>Food Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FoodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Food Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FoodType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FoodType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Food Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FoodType get(int value) {
		switch (value) {
		case PROTIEN_VALUE:
			return PROTIEN;
		case CARBOHYDRATE_VALUE:
			return CARBOHYDRATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FoodType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //FoodType
