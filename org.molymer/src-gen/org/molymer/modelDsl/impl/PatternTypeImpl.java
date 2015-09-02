/**
 */
package org.molymer.modelDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.molymer.modelDsl.ModelDslPackage;
import org.molymer.modelDsl.PatternType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.PatternTypeImpl#getREGEX <em>REGEX</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.PatternTypeImpl#getDATE <em>DATE</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.PatternTypeImpl#getNUMBER <em>NUMBER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternTypeImpl extends MinimalEObjectImpl.Container implements PatternType
{
  /**
   * The default value of the '{@link #getREGEX() <em>REGEX</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getREGEX()
   * @generated
   * @ordered
   */
  protected static final String REGEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getREGEX() <em>REGEX</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getREGEX()
   * @generated
   * @ordered
   */
  protected String regex = REGEX_EDEFAULT;

  /**
   * The default value of the '{@link #getDATE() <em>DATE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATE()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDATE() <em>DATE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATE()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getNUMBER() <em>NUMBER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNUMBER()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNUMBER() <em>NUMBER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNUMBER()
   * @generated
   * @ordered
   */
  protected String number = NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternTypeImpl()
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
    return ModelDslPackage.Literals.PATTERN_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getREGEX()
  {
    return regex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setREGEX(String newREGEX)
  {
    String oldREGEX = regex;
    regex = newREGEX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.PATTERN_TYPE__REGEX, oldREGEX, regex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDATE()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDATE(String newDATE)
  {
    String oldDATE = date;
    date = newDATE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.PATTERN_TYPE__DATE, oldDATE, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNUMBER()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNUMBER(String newNUMBER)
  {
    String oldNUMBER = number;
    number = newNUMBER;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.PATTERN_TYPE__NUMBER, oldNUMBER, number));
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
      case ModelDslPackage.PATTERN_TYPE__REGEX:
        return getREGEX();
      case ModelDslPackage.PATTERN_TYPE__DATE:
        return getDATE();
      case ModelDslPackage.PATTERN_TYPE__NUMBER:
        return getNUMBER();
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
      case ModelDslPackage.PATTERN_TYPE__REGEX:
        setREGEX((String)newValue);
        return;
      case ModelDslPackage.PATTERN_TYPE__DATE:
        setDATE((String)newValue);
        return;
      case ModelDslPackage.PATTERN_TYPE__NUMBER:
        setNUMBER((String)newValue);
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
      case ModelDslPackage.PATTERN_TYPE__REGEX:
        setREGEX(REGEX_EDEFAULT);
        return;
      case ModelDslPackage.PATTERN_TYPE__DATE:
        setDATE(DATE_EDEFAULT);
        return;
      case ModelDslPackage.PATTERN_TYPE__NUMBER:
        setNUMBER(NUMBER_EDEFAULT);
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
      case ModelDslPackage.PATTERN_TYPE__REGEX:
        return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
      case ModelDslPackage.PATTERN_TYPE__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case ModelDslPackage.PATTERN_TYPE__NUMBER:
        return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
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
    result.append(" (REGEX: ");
    result.append(regex);
    result.append(", DATE: ");
    result.append(date);
    result.append(", NUMBER: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //PatternTypeImpl
