/**
 */
package org.molymer.modelDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.molymer.modelDsl.ModelDslPackage#getValueType()
 * @model
 * @generated
 */
public enum ValueType implements Enumerator
{
  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "STRING", "#string"),

  /**
   * The '<em><b>INTEGER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(1, "INTEGER", "#integer"),

  /**
   * The '<em><b>DOUBLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE(2, "DOUBLE", "#double"),

  /**
   * The '<em><b>INT RANGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_RANGE_VALUE
   * @generated
   * @ordered
   */
  INT_RANGE(3, "INT_RANGE", "#int-range"),

  /**
   * The '<em><b>FORMAT RANGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FORMAT_RANGE_VALUE
   * @generated
   * @ordered
   */
  FORMAT_RANGE(4, "FORMAT_RANGE", "#format-range");

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model literal="#string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>INTEGER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model literal="#integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 1;

  /**
   * The '<em><b>DOUBLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE
   * @model literal="#double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_VALUE = 2;

  /**
   * The '<em><b>INT RANGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INT RANGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT_RANGE
   * @model literal="#int-range"
   * @generated
   * @ordered
   */
  public static final int INT_RANGE_VALUE = 3;

  /**
   * The '<em><b>FORMAT RANGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FORMAT RANGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FORMAT_RANGE
   * @model literal="#format-range"
   * @generated
   * @ordered
   */
  public static final int FORMAT_RANGE_VALUE = 4;

  /**
   * An array of all the '<em><b>Value Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ValueType[] VALUES_ARRAY =
    new ValueType[]
    {
      STRING,
      INTEGER,
      DOUBLE,
      INT_RANGE,
      FORMAT_RANGE,
    };

  /**
   * A public read-only list of all the '<em><b>Value Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ValueType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Value Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ValueType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Value Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ValueType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Value Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ValueType get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case INTEGER_VALUE: return INTEGER;
      case DOUBLE_VALUE: return DOUBLE;
      case INT_RANGE_VALUE: return INT_RANGE;
      case FORMAT_RANGE_VALUE: return FORMAT_RANGE;
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
  private ValueType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ValueType
