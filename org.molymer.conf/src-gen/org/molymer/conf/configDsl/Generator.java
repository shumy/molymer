/**
 */
package org.molymer.conf.configDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.conf.configDsl.Generator#getName <em>Name</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.Generator#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.Generator#getGenClass <em>Gen Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.conf.configDsl.ConfigDslPackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getGenerator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.molymer.conf.configDsl.Generator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle</em>' attribute.
   * @see #setBundle(String)
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getGenerator_Bundle()
   * @model
   * @generated
   */
  String getBundle();

  /**
   * Sets the value of the '{@link org.molymer.conf.configDsl.Generator#getBundle <em>Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bundle</em>' attribute.
   * @see #getBundle()
   * @generated
   */
  void setBundle(String value);

  /**
   * Returns the value of the '<em><b>Gen Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen Class</em>' attribute.
   * @see #setGenClass(String)
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getGenerator_GenClass()
   * @model
   * @generated
   */
  String getGenClass();

  /**
   * Sets the value of the '{@link org.molymer.conf.configDsl.Generator#getGenClass <em>Gen Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen Class</em>' attribute.
   * @see #getGenClass()
   * @generated
   */
  void setGenClass(String value);

} // Generator
