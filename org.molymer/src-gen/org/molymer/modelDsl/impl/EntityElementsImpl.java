/**
 */
package org.molymer.modelDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.molymer.modelDsl.Child;
import org.molymer.modelDsl.EntityElements;
import org.molymer.modelDsl.ModelDslPackage;
import org.molymer.modelDsl.Property;
import org.molymer.modelDsl.Reference;
import org.molymer.modelDsl.ReferenceList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.EntityElementsImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.EntityElementsImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.EntityElementsImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.EntityElementsImpl#getReferenceLists <em>Reference Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityElementsImpl extends MinimalEObjectImpl.Container implements EntityElements
{
  /**
   * The cached value of the '{@link #getChilds() <em>Childs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChilds()
   * @generated
   * @ordered
   */
  protected EList<Child> childs;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<Reference> references;

  /**
   * The cached value of the '{@link #getReferenceLists() <em>Reference Lists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceLists()
   * @generated
   * @ordered
   */
  protected EList<ReferenceList> referenceLists;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityElementsImpl()
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
    return ModelDslPackage.Literals.ENTITY_ELEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Child> getChilds()
  {
    if (childs == null)
    {
      childs = new EObjectContainmentEList<Child>(Child.class, this, ModelDslPackage.ENTITY_ELEMENTS__CHILDS);
    }
    return childs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, ModelDslPackage.ENTITY_ELEMENTS__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Reference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<Reference>(Reference.class, this, ModelDslPackage.ENTITY_ELEMENTS__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceList> getReferenceLists()
  {
    if (referenceLists == null)
    {
      referenceLists = new EObjectContainmentEList<ReferenceList>(ReferenceList.class, this, ModelDslPackage.ENTITY_ELEMENTS__REFERENCE_LISTS);
    }
    return referenceLists;
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
      case ModelDslPackage.ENTITY_ELEMENTS__CHILDS:
        return ((InternalEList<?>)getChilds()).basicRemove(otherEnd, msgs);
      case ModelDslPackage.ENTITY_ELEMENTS__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCE_LISTS:
        return ((InternalEList<?>)getReferenceLists()).basicRemove(otherEnd, msgs);
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
      case ModelDslPackage.ENTITY_ELEMENTS__CHILDS:
        return getChilds();
      case ModelDslPackage.ENTITY_ELEMENTS__PROPERTIES:
        return getProperties();
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCES:
        return getReferences();
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCE_LISTS:
        return getReferenceLists();
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
      case ModelDslPackage.ENTITY_ELEMENTS__CHILDS:
        getChilds().clear();
        getChilds().addAll((Collection<? extends Child>)newValue);
        return;
      case ModelDslPackage.ENTITY_ELEMENTS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends Reference>)newValue);
        return;
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCE_LISTS:
        getReferenceLists().clear();
        getReferenceLists().addAll((Collection<? extends ReferenceList>)newValue);
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
      case ModelDslPackage.ENTITY_ELEMENTS__CHILDS:
        getChilds().clear();
        return;
      case ModelDslPackage.ENTITY_ELEMENTS__PROPERTIES:
        getProperties().clear();
        return;
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCES:
        getReferences().clear();
        return;
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCE_LISTS:
        getReferenceLists().clear();
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
      case ModelDslPackage.ENTITY_ELEMENTS__CHILDS:
        return childs != null && !childs.isEmpty();
      case ModelDslPackage.ENTITY_ELEMENTS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCES:
        return references != null && !references.isEmpty();
      case ModelDslPackage.ENTITY_ELEMENTS__REFERENCE_LISTS:
        return referenceLists != null && !referenceLists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityElementsImpl
