/**
 */
package org.molymer.conf.configDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.molymer.conf.configDsl.ConfigDslPackage;
import org.molymer.conf.configDsl.Generator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.conf.configDsl.impl.GeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.impl.GeneratorImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.impl.GeneratorImpl#getGenClass <em>Gen Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorImpl extends MinimalEObjectImpl.Container implements Generator
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBundle()
   * @generated
   * @ordered
   */
  protected static final String BUNDLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBundle() <em>Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBundle()
   * @generated
   * @ordered
   */
  protected String bundle = BUNDLE_EDEFAULT;

  /**
   * The default value of the '{@link #getGenClass() <em>Gen Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenClass()
   * @generated
   * @ordered
   */
  protected static final String GEN_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenClass() <em>Gen Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenClass()
   * @generated
   * @ordered
   */
  protected String genClass = GEN_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneratorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ConfigDslPackage.Literals.GENERATOR;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.GENERATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBundle()
  {
    return bundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBundle(String newBundle)
  {
    String oldBundle = bundle;
    bundle = newBundle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.GENERATOR__BUNDLE, oldBundle, bundle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenClass()
  {
    return genClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenClass(String newGenClass)
  {
    String oldGenClass = genClass;
    genClass = newGenClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.GENERATOR__GEN_CLASS, oldGenClass, genClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ConfigDslPackage.GENERATOR__NAME:
        return getName();
      case ConfigDslPackage.GENERATOR__BUNDLE:
        return getBundle();
      case ConfigDslPackage.GENERATOR__GEN_CLASS:
        return getGenClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ConfigDslPackage.GENERATOR__NAME:
        setName((String)newValue);
        return;
      case ConfigDslPackage.GENERATOR__BUNDLE:
        setBundle((String)newValue);
        return;
      case ConfigDslPackage.GENERATOR__GEN_CLASS:
        setGenClass((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ConfigDslPackage.GENERATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ConfigDslPackage.GENERATOR__BUNDLE:
        setBundle(BUNDLE_EDEFAULT);
        return;
      case ConfigDslPackage.GENERATOR__GEN_CLASS:
        setGenClass(GEN_CLASS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ConfigDslPackage.GENERATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ConfigDslPackage.GENERATOR__BUNDLE:
        return BUNDLE_EDEFAULT == null ? bundle != null : !BUNDLE_EDEFAULT.equals(bundle);
      case ConfigDslPackage.GENERATOR__GEN_CLASS:
        return GEN_CLASS_EDEFAULT == null ? genClass != null : !GEN_CLASS_EDEFAULT.equals(genClass);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", bundle: ");
    result.append(bundle);
    result.append(", genClass: ");
    result.append(genClass);
    result.append(')');
    return result.toString();
  }

} //GeneratorImpl
