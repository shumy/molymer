/**
 */
package org.molymer.modelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Range Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.FormatRangeValue#getFrom <em>From</em>}</li>
 *   <li>{@link org.molymer.modelDsl.FormatRangeValue#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getFormatRangeValue()
 * @model
 * @generated
 */
public interface FormatRangeValue extends Value
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see org.molymer.modelDsl.ModelDslPackage#getFormatRangeValue_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.FormatRangeValue#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(String)
   * @see org.molymer.modelDsl.ModelDslPackage#getFormatRangeValue_To()
   * @model
   * @generated
   */
  String getTo();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.FormatRangeValue#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(String value);

} // FormatRangeValue
