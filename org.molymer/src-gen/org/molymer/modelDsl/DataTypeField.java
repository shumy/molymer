/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.DataTypeField#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.molymer.modelDsl.DataTypeField#getFormat <em>Format</em>}</li>
 *   <li>{@link org.molymer.modelDsl.DataTypeField#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getDataTypeField()
 * @model
 * @generated
 */
public interface DataTypeField extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(PatternType)
   * @see org.molymer.modelDsl.ModelDslPackage#getDataTypeField_Pattern()
   * @model containment="true"
   * @generated
   */
  PatternType getPattern();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.DataTypeField#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(PatternType value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see org.molymer.modelDsl.ModelDslPackage#getDataTypeField_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.DataTypeField#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DataType)
   * @see org.molymer.modelDsl.ModelDslPackage#getDataTypeField_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.DataTypeField#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

} // DataTypeField
