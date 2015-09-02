/**
 */
package org.molymer.conf.configDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.molymer.conf.configDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigDslFactoryImpl extends EFactoryImpl implements ConfigDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConfigDslFactory init()
  {
    try
    {
      ConfigDslFactory theConfigDslFactory = (ConfigDslFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigDslPackage.eNS_URI);
      if (theConfigDslFactory != null)
      {
        return theConfigDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ConfigDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ConfigDslPackage.CONFIG: return createConfig();
      case ConfigDslPackage.GENERATOR: return createGenerator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Config createConfig()
  {
    ConfigImpl config = new ConfigImpl();
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator createGenerator()
  {
    GeneratorImpl generator = new GeneratorImpl();
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigDslPackage getConfigDslPackage()
  {
    return (ConfigDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ConfigDslPackage getPackage()
  {
    return ConfigDslPackage.eINSTANCE;
  }

} //ConfigDslFactoryImpl
