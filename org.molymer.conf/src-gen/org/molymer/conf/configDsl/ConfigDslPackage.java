/**
 */
package org.molymer.conf.configDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.molymer.conf.configDsl.ConfigDslFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "configDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.molymer.org/conf/ConfigDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "configDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ConfigDslPackage eINSTANCE = org.molymer.conf.configDsl.impl.ConfigDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.molymer.conf.configDsl.impl.ConfigImpl <em>Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.conf.configDsl.impl.ConfigImpl
   * @see org.molymer.conf.configDsl.impl.ConfigDslPackageImpl#getConfig()
   * @generated
   */
  int CONFIG = 0;

  /**
   * The feature id for the '<em><b>App Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__APP_NAME = 0;

  /**
   * The feature id for the '<em><b>Main Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__MAIN_CLASS = 1;

  /**
   * The feature id for the '<em><b>Src Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__SRC_FOLDER = 2;

  /**
   * The feature id for the '<em><b>Out Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__OUT_FOLDER = 3;

  /**
   * The feature id for the '<em><b>Selectors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__SELECTORS = 4;

  /**
   * The feature id for the '<em><b>Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG__GENERATORS = 5;

  /**
   * The number of structural features of the '<em>Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.molymer.conf.configDsl.impl.GeneratorImpl <em>Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.conf.configDsl.impl.GeneratorImpl
   * @see org.molymer.conf.configDsl.impl.ConfigDslPackageImpl#getGenerator()
   * @generated
   */
  int GENERATOR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__BUNDLE = 1;

  /**
   * The feature id for the '<em><b>Gen Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__GEN_CLASS = 2;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.molymer.conf.configDsl.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config</em>'.
   * @see org.molymer.conf.configDsl.Config
   * @generated
   */
  EClass getConfig();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.conf.configDsl.Config#getAppName <em>App Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>App Name</em>'.
   * @see org.molymer.conf.configDsl.Config#getAppName()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_AppName();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.conf.configDsl.Config#getMainClass <em>Main Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Main Class</em>'.
   * @see org.molymer.conf.configDsl.Config#getMainClass()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_MainClass();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.conf.configDsl.Config#getSrcFolder <em>Src Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Src Folder</em>'.
   * @see org.molymer.conf.configDsl.Config#getSrcFolder()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_SrcFolder();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.conf.configDsl.Config#getOutFolder <em>Out Folder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Folder</em>'.
   * @see org.molymer.conf.configDsl.Config#getOutFolder()
   * @see #getConfig()
   * @generated
   */
  EAttribute getConfig_OutFolder();

  /**
   * Returns the meta object for the reference list '{@link org.molymer.conf.configDsl.Config#getSelectors <em>Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Selectors</em>'.
   * @see org.molymer.conf.configDsl.Config#getSelectors()
   * @see #getConfig()
   * @generated
   */
  EReference getConfig_Selectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.conf.configDsl.Config#getGenerators <em>Generators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generators</em>'.
   * @see org.molymer.conf.configDsl.Config#getGenerators()
   * @see #getConfig()
   * @generated
   */
  EReference getConfig_Generators();

  /**
   * Returns the meta object for class '{@link org.molymer.conf.configDsl.Generator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator</em>'.
   * @see org.molymer.conf.configDsl.Generator
   * @generated
   */
  EClass getGenerator();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.conf.configDsl.Generator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.molymer.conf.configDsl.Generator#getName()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_Name();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.conf.configDsl.Generator#getBundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bundle</em>'.
   * @see org.molymer.conf.configDsl.Generator#getBundle()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_Bundle();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.conf.configDsl.Generator#getGenClass <em>Gen Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen Class</em>'.
   * @see org.molymer.conf.configDsl.Generator#getGenClass()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_GenClass();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ConfigDslFactory getConfigDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.molymer.conf.configDsl.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.conf.configDsl.impl.ConfigImpl
     * @see org.molymer.conf.configDsl.impl.ConfigDslPackageImpl#getConfig()
     * @generated
     */
    EClass CONFIG = eINSTANCE.getConfig();

    /**
     * The meta object literal for the '<em><b>App Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__APP_NAME = eINSTANCE.getConfig_AppName();

    /**
     * The meta object literal for the '<em><b>Main Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__MAIN_CLASS = eINSTANCE.getConfig_MainClass();

    /**
     * The meta object literal for the '<em><b>Src Folder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__SRC_FOLDER = eINSTANCE.getConfig_SrcFolder();

    /**
     * The meta object literal for the '<em><b>Out Folder</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIG__OUT_FOLDER = eINSTANCE.getConfig_OutFolder();

    /**
     * The meta object literal for the '<em><b>Selectors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG__SELECTORS = eINSTANCE.getConfig_Selectors();

    /**
     * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG__GENERATORS = eINSTANCE.getConfig_Generators();

    /**
     * The meta object literal for the '{@link org.molymer.conf.configDsl.impl.GeneratorImpl <em>Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.conf.configDsl.impl.GeneratorImpl
     * @see org.molymer.conf.configDsl.impl.ConfigDslPackageImpl#getGenerator()
     * @generated
     */
    EClass GENERATOR = eINSTANCE.getGenerator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__NAME = eINSTANCE.getGenerator_Name();

    /**
     * The meta object literal for the '<em><b>Bundle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__BUNDLE = eINSTANCE.getGenerator_Bundle();

    /**
     * The meta object literal for the '<em><b>Gen Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__GEN_CLASS = eINSTANCE.getGenerator_GenClass();

  }

} //ConfigDslPackage
