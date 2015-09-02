/**
 */
package org.molymer.conf.configDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.molymer.conf.configDsl.Config;
import org.molymer.conf.configDsl.ConfigDslPackage;
import org.molymer.conf.configDsl.Generator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.conf.configDsl.impl.ConfigImpl#getAppName <em>App Name</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.impl.ConfigImpl#getMainClass <em>Main Class</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.impl.ConfigImpl#getSrcFolder <em>Src Folder</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.impl.ConfigImpl#getOutFolder <em>Out Folder</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.impl.ConfigImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.molymer.conf.configDsl.impl.ConfigImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config
{
  /**
   * The default value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected static final String APP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppName() <em>App Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppName()
   * @generated
   * @ordered
   */
  protected String appName = APP_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMainClass() <em>Main Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainClass()
   * @generated
   * @ordered
   */
  protected static final String MAIN_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMainClass() <em>Main Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainClass()
   * @generated
   * @ordered
   */
  protected String mainClass = MAIN_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getSrcFolder() <em>Src Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcFolder()
   * @generated
   * @ordered
   */
  protected static final String SRC_FOLDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSrcFolder() <em>Src Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcFolder()
   * @generated
   * @ordered
   */
  protected String srcFolder = SRC_FOLDER_EDEFAULT;

  /**
   * The default value of the '{@link #getOutFolder() <em>Out Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutFolder()
   * @generated
   * @ordered
   */
  protected static final String OUT_FOLDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutFolder() <em>Out Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutFolder()
   * @generated
   * @ordered
   */
  protected String outFolder = OUT_FOLDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelectors() <em>Selectors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectors()
   * @generated
   * @ordered
   */
  protected EList<Generator> selectors;

  /**
   * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerators()
   * @generated
   * @ordered
   */
  protected EList<Generator> generators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigImpl()
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
    return ConfigDslPackage.Literals.CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppName()
  {
    return appName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppName(String newAppName)
  {
    String oldAppName = appName;
    appName = newAppName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.CONFIG__APP_NAME, oldAppName, appName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMainClass()
  {
    return mainClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainClass(String newMainClass)
  {
    String oldMainClass = mainClass;
    mainClass = newMainClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.CONFIG__MAIN_CLASS, oldMainClass, mainClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSrcFolder()
  {
    return srcFolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrcFolder(String newSrcFolder)
  {
    String oldSrcFolder = srcFolder;
    srcFolder = newSrcFolder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.CONFIG__SRC_FOLDER, oldSrcFolder, srcFolder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutFolder()
  {
    return outFolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutFolder(String newOutFolder)
  {
    String oldOutFolder = outFolder;
    outFolder = newOutFolder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.CONFIG__OUT_FOLDER, oldOutFolder, outFolder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Generator> getSelectors()
  {
    if (selectors == null)
    {
      selectors = new EObjectResolvingEList<Generator>(Generator.class, this, ConfigDslPackage.CONFIG__SELECTORS);
    }
    return selectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Generator> getGenerators()
  {
    if (generators == null)
    {
      generators = new EObjectContainmentEList<Generator>(Generator.class, this, ConfigDslPackage.CONFIG__GENERATORS);
    }
    return generators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ConfigDslPackage.CONFIG__GENERATORS:
        return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ConfigDslPackage.CONFIG__APP_NAME:
        return getAppName();
      case ConfigDslPackage.CONFIG__MAIN_CLASS:
        return getMainClass();
      case ConfigDslPackage.CONFIG__SRC_FOLDER:
        return getSrcFolder();
      case ConfigDslPackage.CONFIG__OUT_FOLDER:
        return getOutFolder();
      case ConfigDslPackage.CONFIG__SELECTORS:
        return getSelectors();
      case ConfigDslPackage.CONFIG__GENERATORS:
        return getGenerators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ConfigDslPackage.CONFIG__APP_NAME:
        setAppName((String)newValue);
        return;
      case ConfigDslPackage.CONFIG__MAIN_CLASS:
        setMainClass((String)newValue);
        return;
      case ConfigDslPackage.CONFIG__SRC_FOLDER:
        setSrcFolder((String)newValue);
        return;
      case ConfigDslPackage.CONFIG__OUT_FOLDER:
        setOutFolder((String)newValue);
        return;
      case ConfigDslPackage.CONFIG__SELECTORS:
        getSelectors().clear();
        getSelectors().addAll((Collection<? extends Generator>)newValue);
        return;
      case ConfigDslPackage.CONFIG__GENERATORS:
        getGenerators().clear();
        getGenerators().addAll((Collection<? extends Generator>)newValue);
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
      case ConfigDslPackage.CONFIG__APP_NAME:
        setAppName(APP_NAME_EDEFAULT);
        return;
      case ConfigDslPackage.CONFIG__MAIN_CLASS:
        setMainClass(MAIN_CLASS_EDEFAULT);
        return;
      case ConfigDslPackage.CONFIG__SRC_FOLDER:
        setSrcFolder(SRC_FOLDER_EDEFAULT);
        return;
      case ConfigDslPackage.CONFIG__OUT_FOLDER:
        setOutFolder(OUT_FOLDER_EDEFAULT);
        return;
      case ConfigDslPackage.CONFIG__SELECTORS:
        getSelectors().clear();
        return;
      case ConfigDslPackage.CONFIG__GENERATORS:
        getGenerators().clear();
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
      case ConfigDslPackage.CONFIG__APP_NAME:
        return APP_NAME_EDEFAULT == null ? appName != null : !APP_NAME_EDEFAULT.equals(appName);
      case ConfigDslPackage.CONFIG__MAIN_CLASS:
        return MAIN_CLASS_EDEFAULT == null ? mainClass != null : !MAIN_CLASS_EDEFAULT.equals(mainClass);
      case ConfigDslPackage.CONFIG__SRC_FOLDER:
        return SRC_FOLDER_EDEFAULT == null ? srcFolder != null : !SRC_FOLDER_EDEFAULT.equals(srcFolder);
      case ConfigDslPackage.CONFIG__OUT_FOLDER:
        return OUT_FOLDER_EDEFAULT == null ? outFolder != null : !OUT_FOLDER_EDEFAULT.equals(outFolder);
      case ConfigDslPackage.CONFIG__SELECTORS:
        return selectors != null && !selectors.isEmpty();
      case ConfigDslPackage.CONFIG__GENERATORS:
        return generators != null && !generators.isEmpty();
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
    result.append(" (appName: ");
    result.append(appName);
    result.append(", mainClass: ");
    result.append(mainClass);
    result.append(", srcFolder: ");
    result.append(srcFolder);
    result.append(", outFolder: ");
    result.append(outFolder);
    result.append(')');
    return result.toString();
  }

} //ConfigImpl
