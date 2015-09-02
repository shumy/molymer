/**
 */
package org.molymer.modelDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.molymer.modelDsl.Entity;
import org.molymer.modelDsl.EntityElements;
import org.molymer.modelDsl.EntityGroup;
import org.molymer.modelDsl.ModelDslPackage;
import org.molymer.modelDsl.Parent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.EntityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.EntityImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.EntityImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends TypeImpl implements Entity
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Parent parent;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EntityElements elements;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<EntityGroup> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return ModelDslPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parent getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Parent newParent, NotificationChain msgs)
  {
    Parent oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelDslPackage.ENTITY__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Parent newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelDslPackage.ENTITY__PARENT, null, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelDslPackage.ENTITY__PARENT, null, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ENTITY__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityElements getElements()
  {
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElements(EntityElements newElements, NotificationChain msgs)
  {
    EntityElements oldElements = elements;
    elements = newElements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelDslPackage.ENTITY__ELEMENTS, oldElements, newElements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElements(EntityElements newElements)
  {
    if (newElements != elements)
    {
      NotificationChain msgs = null;
      if (elements != null)
        msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelDslPackage.ENTITY__ELEMENTS, null, msgs);
      if (newElements != null)
        msgs = ((InternalEObject)newElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelDslPackage.ENTITY__ELEMENTS, null, msgs);
      msgs = basicSetElements(newElements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ENTITY__ELEMENTS, newElements, newElements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityGroup> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<EntityGroup>(EntityGroup.class, this, ModelDslPackage.ENTITY__GROUPS);
    }
    return groups;
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
      case ModelDslPackage.ENTITY__PARENT:
        return basicSetParent(null, msgs);
      case ModelDslPackage.ENTITY__ELEMENTS:
        return basicSetElements(null, msgs);
      case ModelDslPackage.ENTITY__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
      case ModelDslPackage.ENTITY__PARENT:
        return getParent();
      case ModelDslPackage.ENTITY__ELEMENTS:
        return getElements();
      case ModelDslPackage.ENTITY__GROUPS:
        return getGroups();
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
      case ModelDslPackage.ENTITY__PARENT:
        setParent((Parent)newValue);
        return;
      case ModelDslPackage.ENTITY__ELEMENTS:
        setElements((EntityElements)newValue);
        return;
      case ModelDslPackage.ENTITY__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends EntityGroup>)newValue);
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
      case ModelDslPackage.ENTITY__PARENT:
        setParent((Parent)null);
        return;
      case ModelDslPackage.ENTITY__ELEMENTS:
        setElements((EntityElements)null);
        return;
      case ModelDslPackage.ENTITY__GROUPS:
        getGroups().clear();
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
      case ModelDslPackage.ENTITY__PARENT:
        return parent != null;
      case ModelDslPackage.ENTITY__ELEMENTS:
        return elements != null;
      case ModelDslPackage.ENTITY__GROUPS:
        return groups != null && !groups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityImpl
