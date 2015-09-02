/**
 */
package org.molymer.modelDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.molymer.modelDsl.AnnotationProperty;
import org.molymer.modelDsl.GroupType;
import org.molymer.modelDsl.ModelDslPackage;
import org.molymer.modelDsl.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationPropertyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationPropertyImpl#isMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationPropertyImpl extends MinimalEObjectImpl.Container implements AnnotationProperty
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
   * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected GroupType group;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ValueType TYPE_EDEFAULT = ValueType.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ValueType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isMulti() <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMulti()
   * @generated
   * @ordered
   */
  protected static final boolean MULTI_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMulti() <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMulti()
   * @generated
   * @ordered
   */
  protected boolean multi = MULTI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationPropertyImpl()
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
    return ModelDslPackage.Literals.ANNOTATION_PROPERTY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ANNOTATION_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupType getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroup(GroupType newGroup, NotificationChain msgs)
  {
    GroupType oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelDslPackage.ANNOTATION_PROPERTY__GROUP, oldGroup, newGroup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroup(GroupType newGroup)
  {
    if (newGroup != group)
    {
      NotificationChain msgs = null;
      if (group != null)
        msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelDslPackage.ANNOTATION_PROPERTY__GROUP, null, msgs);
      if (newGroup != null)
        msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelDslPackage.ANNOTATION_PROPERTY__GROUP, null, msgs);
      msgs = basicSetGroup(newGroup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ANNOTATION_PROPERTY__GROUP, newGroup, newGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ValueType newType)
  {
    ValueType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ANNOTATION_PROPERTY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMulti()
  {
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMulti(boolean newMulti)
  {
    boolean oldMulti = multi;
    multi = newMulti;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ANNOTATION_PROPERTY__MULTI, oldMulti, multi));
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
      case ModelDslPackage.ANNOTATION_PROPERTY__GROUP:
        return basicSetGroup(null, msgs);
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
      case ModelDslPackage.ANNOTATION_PROPERTY__NAME:
        return getName();
      case ModelDslPackage.ANNOTATION_PROPERTY__GROUP:
        return getGroup();
      case ModelDslPackage.ANNOTATION_PROPERTY__TYPE:
        return getType();
      case ModelDslPackage.ANNOTATION_PROPERTY__MULTI:
        return isMulti();
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
      case ModelDslPackage.ANNOTATION_PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ModelDslPackage.ANNOTATION_PROPERTY__GROUP:
        setGroup((GroupType)newValue);
        return;
      case ModelDslPackage.ANNOTATION_PROPERTY__TYPE:
        setType((ValueType)newValue);
        return;
      case ModelDslPackage.ANNOTATION_PROPERTY__MULTI:
        setMulti((Boolean)newValue);
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
      case ModelDslPackage.ANNOTATION_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelDslPackage.ANNOTATION_PROPERTY__GROUP:
        setGroup((GroupType)null);
        return;
      case ModelDslPackage.ANNOTATION_PROPERTY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ModelDslPackage.ANNOTATION_PROPERTY__MULTI:
        setMulti(MULTI_EDEFAULT);
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
      case ModelDslPackage.ANNOTATION_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelDslPackage.ANNOTATION_PROPERTY__GROUP:
        return group != null;
      case ModelDslPackage.ANNOTATION_PROPERTY__TYPE:
        return type != TYPE_EDEFAULT;
      case ModelDslPackage.ANNOTATION_PROPERTY__MULTI:
        return multi != MULTI_EDEFAULT;
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
    result.append(", type: ");
    result.append(type);
    result.append(", multi: ");
    result.append(multi);
    result.append(')');
    return result.toString();
  }

} //AnnotationPropertyImpl
