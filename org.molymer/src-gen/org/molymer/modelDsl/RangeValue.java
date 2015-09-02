/**
 */
package org.molymer.modelDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.RangeValue#getFrom <em>From</em>}</li>
 *   <li>{@link org.molymer.modelDsl.RangeValue#isFromInf <em>From Inf</em>}</li>
 *   <li>{@link org.molymer.modelDsl.RangeValue#getTo <em>To</em>}</li>
 *   <li>{@link org.molymer.modelDsl.RangeValue#isToInf <em>To Inf</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getRangeValue()
 * @model
 * @generated
 */
public interface RangeValue extends Value
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
   * @see #setFrom(int)
   * @see org.molymer.modelDsl.ModelDslPackage#getRangeValue_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.RangeValue#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(int value);

  /**
   * Returns the value of the '<em><b>From Inf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Inf</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Inf</em>' attribute.
   * @see #setFromInf(boolean)
   * @see org.molymer.modelDsl.ModelDslPackage#getRangeValue_FromInf()
   * @model
   * @generated
   */
  boolean isFromInf();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.RangeValue#isFromInf <em>From Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Inf</em>' attribute.
   * @see #isFromInf()
   * @generated
   */
  void setFromInf(boolean value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(int)
   * @see org.molymer.modelDsl.ModelDslPackage#getRangeValue_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.RangeValue#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

  /**
   * Returns the value of the '<em><b>To Inf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Inf</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Inf</em>' attribute.
   * @see #setToInf(boolean)
   * @see org.molymer.modelDsl.ModelDslPackage#getRangeValue_ToInf()
   * @model
   * @generated
   */
  boolean isToInf();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.RangeValue#isToInf <em>To Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Inf</em>' attribute.
   * @see #isToInf()
   * @generated
   */
  void setToInf(boolean value);

} // RangeValue
