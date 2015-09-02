/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.PatternType#getREGEX <em>REGEX</em>}</li>
 *   <li>{@link org.molymer.modelDsl.PatternType#getDATE <em>DATE</em>}</li>
 *   <li>{@link org.molymer.modelDsl.PatternType#getNUMBER <em>NUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getPatternType()
 * @model
 * @generated
 */
public interface PatternType extends EObject
{
  /**
   * Returns the value of the '<em><b>REGEX</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>REGEX</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>REGEX</em>' attribute.
   * @see #setREGEX(String)
   * @see org.molymer.modelDsl.ModelDslPackage#getPatternType_REGEX()
   * @model
   * @generated
   */
  String getREGEX();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.PatternType#getREGEX <em>REGEX</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>REGEX</em>' attribute.
   * @see #getREGEX()
   * @generated
   */
  void setREGEX(String value);

  /**
   * Returns the value of the '<em><b>DATE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DATE</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DATE</em>' attribute.
   * @see #setDATE(String)
   * @see org.molymer.modelDsl.ModelDslPackage#getPatternType_DATE()
   * @model
   * @generated
   */
  String getDATE();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.PatternType#getDATE <em>DATE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DATE</em>' attribute.
   * @see #getDATE()
   * @generated
   */
  void setDATE(String value);

  /**
   * Returns the value of the '<em><b>NUMBER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>NUMBER</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>NUMBER</em>' attribute.
   * @see #setNUMBER(String)
   * @see org.molymer.modelDsl.ModelDslPackage#getPatternType_NUMBER()
   * @model
   * @generated
   */
  String getNUMBER();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.PatternType#getNUMBER <em>NUMBER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>NUMBER</em>' attribute.
   * @see #getNUMBER()
   * @generated
   */
  void setNUMBER(String value);

} // PatternType
