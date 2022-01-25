/**
 */
package diet_mdse_reserach;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Diet Recommendation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diet_mdse_reserach.Diet_mdse_reserachPackage#getDietRecommendationType()
 * @model
 * @generated
 */
public enum DietRecommendationType implements Enumerator {
	/**
	 * The '<em><b>Weight loss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_LOSS(0, "weight_loss", "weight_loss"),

	/**
	 * The '<em><b>Weight gain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_GAIN_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_GAIN(1, "weight_gain", "weight_gain"),

	/**
	 * The '<em><b>Weight maintainence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_MAINTAINENCE_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT_MAINTAINENCE(2, "weight_maintainence", "weight_maintainence");

	/**
	 * The '<em><b>Weight loss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_LOSS
	 * @model name="weight_loss"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_LOSS_VALUE = 0;

	/**
	 * The '<em><b>Weight gain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_GAIN
	 * @model name="weight_gain"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_GAIN_VALUE = 1;

	/**
	 * The '<em><b>Weight maintainence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_MAINTAINENCE
	 * @model name="weight_maintainence"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_MAINTAINENCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Diet Recommendation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DietRecommendationType[] VALUES_ARRAY = new DietRecommendationType[] { WEIGHT_LOSS,
			WEIGHT_GAIN, WEIGHT_MAINTAINENCE, };

	/**
	 * A public read-only list of all the '<em><b>Diet Recommendation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DietRecommendationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Diet Recommendation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DietRecommendationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DietRecommendationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diet Recommendation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DietRecommendationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DietRecommendationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Diet Recommendation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DietRecommendationType get(int value) {
		switch (value) {
		case WEIGHT_LOSS_VALUE:
			return WEIGHT_LOSS;
		case WEIGHT_GAIN_VALUE:
			return WEIGHT_GAIN;
		case WEIGHT_MAINTAINENCE_VALUE:
			return WEIGHT_MAINTAINENCE;
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
	private DietRecommendationType(int value, String name, String literal) {
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

} //DietRecommendationType
