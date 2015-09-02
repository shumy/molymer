/**
 */
package org.molymer.modelDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.molymer.modelDsl.ModelDslPackage;
import org.molymer.modelDsl.RangeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.RangeValueImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.RangeValueImpl#isFromInf <em>From Inf</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.RangeValueImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.RangeValueImpl#isToInf <em>To Inf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeValueImpl extends ValueImpl implements RangeValue
{
  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final int FROM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected int from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #isFromInf() <em>From Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFromInf()
   * @generated
   * @ordered
   */
  protected static final boolean FROM_INF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFromInf() <em>From Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFromInf()
   * @generated
   * @ordered
   */
  protected boolean fromInf = FROM_INF_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final int TO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected int to = TO_EDEFAULT;

  /**
   * The default value of the '{@link #isToInf() <em>To Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToInf()
   * @generated
   * @ordered
   */
  protected static final boolean TO_INF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isToInf() <em>To Inf</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isToInf()
   * @generated
   * @ordered
   */
  protected boolean toInf = TO_INF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeValueImpl()
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
    return ModelDslPackage.Literals.RANGE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(int newFrom)
  {
    int oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.RANGE_VALUE__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFromInf()
  {
    return fromInf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromInf(boolean newFromInf)
  {
    boolean oldFromInf = fromInf;
    fromInf = newFromInf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.RANGE_VALUE__FROM_INF, oldFromInf, fromInf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(int newTo)
  {
    int oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.RANGE_VALUE__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isToInf()
  {
    return toInf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToInf(boolean newToInf)
  {
    boolean oldToInf = toInf;
    toInf = newToInf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.RANGE_VALUE__TO_INF, oldToInf, toInf));
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
      case ModelDslPackage.RANGE_VALUE__FROM:
        return getFrom();
      case ModelDslPackage.RANGE_VALUE__FROM_INF:
        return isFromInf();
      case ModelDslPackage.RANGE_VALUE__TO:
        return getTo();
      case ModelDslPackage.RANGE_VALUE__TO_INF:
        return isToInf();
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
      case ModelDslPackage.RANGE_VALUE__FROM:
        setFrom((Integer)newValue);
        return;
      case ModelDslPackage.RANGE_VALUE__FROM_INF:
        setFromInf((Boolean)newValue);
        return;
      case ModelDslPackage.RANGE_VALUE__TO:
        setTo((Integer)newValue);
        return;
      case ModelDslPackage.RANGE_VALUE__TO_INF:
        setToInf((Boolean)newValue);
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
      case ModelDslPackage.RANGE_VALUE__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case ModelDslPackage.RANGE_VALUE__FROM_INF:
        setFromInf(FROM_INF_EDEFAULT);
        return;
      case ModelDslPackage.RANGE_VALUE__TO:
        setTo(TO_EDEFAULT);
        return;
      case ModelDslPackage.RANGE_VALUE__TO_INF:
        setToInf(TO_INF_EDEFAULT);
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
      case ModelDslPackage.RANGE_VALUE__FROM:
        return from != FROM_EDEFAULT;
      case ModelDslPackage.RANGE_VALUE__FROM_INF:
        return fromInf != FROM_INF_EDEFAULT;
      case ModelDslPackage.RANGE_VALUE__TO:
        return to != TO_EDEFAULT;
      case ModelDslPackage.RANGE_VALUE__TO_INF:
        return toInf != TO_INF_EDEFAULT;
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
    result.append(", fromInf: ");
    result.append(fromInf);
    result.append(", to: ");
    result.append(to);
    result.append(", toInf: ");
    result.append(toInf);
    result.append(')');
    return result.toString();
  }

} //RangeValueImpl
