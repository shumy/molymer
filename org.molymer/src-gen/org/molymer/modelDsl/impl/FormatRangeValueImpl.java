/**
 */
package org.molymer.modelDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.molymer.modelDsl.FormatRangeValue;
import org.molymer.modelDsl.ModelDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Format Range Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.FormatRangeValueImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.FormatRangeValueImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormatRangeValueImpl extends ValueImpl implements FormatRangeValue
{
  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final String TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected String to = TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormatRangeValueImpl()
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
    return ModelDslPackage.Literals.FORMAT_RANGE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.FORMAT_RANGE_VALUE__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(String newTo)
  {
    String oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.FORMAT_RANGE_VALUE__TO, oldTo, to));
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
      case ModelDslPackage.FORMAT_RANGE_VALUE__FROM:
        return getFrom();
      case ModelDslPackage.FORMAT_RANGE_VALUE__TO:
        return getTo();
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
      case ModelDslPackage.FORMAT_RANGE_VALUE__FROM:
        setFrom((String)newValue);
        return;
      case ModelDslPackage.FORMAT_RANGE_VALUE__TO:
        setTo((String)newValue);
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
      case ModelDslPackage.FORMAT_RANGE_VALUE__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case ModelDslPackage.FORMAT_RANGE_VALUE__TO:
        setTo(TO_EDEFAULT);
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
      case ModelDslPackage.FORMAT_RANGE_VALUE__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case ModelDslPackage.FORMAT_RANGE_VALUE__TO:
        return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
    result.append(" (from: ");
    result.append(from);
    result.append(", to: ");
    result.append(to);
    result.append(')');
    return result.toString();
  }

} //FormatRangeValueImpl
