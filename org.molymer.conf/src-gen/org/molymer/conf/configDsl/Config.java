/**
 */
package org.molymer.conf.configDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.conf.configDsl.Config#getAppName <em>App Name</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.Config#getMainClass <em>Main Class</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.Config#getSrcFolder <em>Src Folder</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.Config#getOutFolder <em>Out Folder</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.Config#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.Config#getGenerators <em>Generators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.conf.configDsl.ConfigDslPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject
{
  /**
   * Returns the value of the '<em><b>App Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>App Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>App Name</em>' attribute.
   * @see #setAppName(String)
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getConfig_AppName()
   * @model
   * @generated
   */
  String getAppName();

  /**
   * Sets the value of the '{@link org.molymer.conf.configDsl.Config#getAppName <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App Name</em>' attribute.
   * @see #getAppName()
   * @generated
   */
  void setAppName(String value);

  /**
   * Returns the value of the '<em><b>Main Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Class</em>' attribute.
   * @see #setMainClass(String)
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getConfig_MainClass()
   * @model
   * @generated
   */
  String getMainClass();

  /**
   * Sets the value of the '{@link org.molymer.conf.configDsl.Config#getMainClass <em>Main Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Class</em>' attribute.
   * @see #getMainClass()
   * @generated
   */
  void setMainClass(String value);

  /**
   * Returns the value of the '<em><b>Src Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src Folder</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src Folder</em>' attribute.
   * @see #setSrcFolder(String)
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getConfig_SrcFolder()
   * @model
   * @generated
   */
  String getSrcFolder();

  /**
   * Sets the value of the '{@link org.molymer.conf.configDsl.Config#getSrcFolder <em>Src Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src Folder</em>' attribute.
   * @see #getSrcFolder()
   * @generated
   */
  void setSrcFolder(String value);

  /**
   * Returns the value of the '<em><b>Out Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Folder</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Folder</em>' attribute.
   * @see #setOutFolder(String)
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getConfig_OutFolder()
   * @model
   * @generated
   */
  String getOutFolder();

  /**
   * Sets the value of the '{@link org.molymer.conf.configDsl.Config#getOutFolder <em>Out Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Folder</em>' attribute.
   * @see #getOutFolder()
   * @generated
   */
  void setOutFolder(String value);

  /**
   * Returns the value of the '<em><b>Selectors</b></em>' reference list.
   * The list contents are of type {@link org.molymer.conf.configDsl.Generator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectors</em>' reference list.
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getConfig_Selectors()
   * @model
   * @generated
   */
  EList<Generator> getSelectors();

  /**
   * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.conf.configDsl.Generator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generators</em>' containment reference list.
   * @see org.molymer.conf.configDsl.ConfigDslPackage#getConfig_Generators()
   * @model containment="true"
   * @generated
   */
  EList<Generator> getGenerators();

} // Config
