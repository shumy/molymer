/**
 */
package org.molymer.modelDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.molymer.modelDsl.AnnotationHiddenProperty;
import org.molymer.modelDsl.AnnotationProperty;
import org.molymer.modelDsl.AnnotationValue;
import org.molymer.modelDsl.ModelDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Hidden Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationHiddenPropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationHiddenPropertyImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationHiddenPropertyImpl extends MinimalEObjectImpl.Container implements AnnotationHiddenProperty
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected AnnotationProperty property;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<AnnotationValue> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationHiddenPropertyImpl()
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
    return ModelDslPackage.Literals.ANNOTATION_HIDDEN_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (AnnotationProperty)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(AnnotationProperty newProperty)
  {
    AnnotationProperty oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectResolvingEList<AnnotationValue>(AnnotationValue.class, this, ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__VALUES);
    }
    return values;
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
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__VALUES:
        return getValues();
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
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__PROPERTY:
        setProperty((AnnotationProperty)newValue);
        return;
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends AnnotationValue>)newValue);
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
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__PROPERTY:
        setProperty((AnnotationProperty)null);
        return;
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__VALUES:
        getValues().clear();
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
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__PROPERTY:
        return property != null;
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AnnotationHiddenPropertyImpl
