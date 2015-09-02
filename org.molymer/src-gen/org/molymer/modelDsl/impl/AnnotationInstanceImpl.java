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

import org.molymer.modelDsl.Annotation;
import org.molymer.modelDsl.AnnotationHiddenProperty;
import org.molymer.modelDsl.AnnotationInstance;
import org.molymer.modelDsl.AnnotationValue;
import org.molymer.modelDsl.ModelDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationInstanceImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationInstanceImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationInstanceImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationInstanceImpl extends AnnotatedImpl implements AnnotationInstance
{
  /**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected Annotation annotation;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<AnnotationValue> values;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<AnnotationHiddenProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationInstanceImpl()
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
    return ModelDslPackage.Literals.ANNOTATION_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation getAnnotation()
  {
    if (annotation != null && annotation.eIsProxy())
    {
      InternalEObject oldAnnotation = (InternalEObject)annotation;
      annotation = (Annotation)eResolveProxy(oldAnnotation);
      if (annotation != oldAnnotation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelDslPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
      }
    }
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation basicGetAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(Annotation newAnnotation)
  {
    Annotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelDslPackage.ANNOTATION_INSTANCE__ANNOTATION, oldAnnotation, annotation));
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
      values = new EObjectContainmentEList<AnnotationValue>(AnnotationValue.class, this, ModelDslPackage.ANNOTATION_INSTANCE__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationHiddenProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<AnnotationHiddenProperty>(AnnotationHiddenProperty.class, this, ModelDslPackage.ANNOTATION_INSTANCE__PROPERTIES);
    }
    return properties;
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
      case ModelDslPackage.ANNOTATION_INSTANCE__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
      case ModelDslPackage.ANNOTATION_INSTANCE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case ModelDslPackage.ANNOTATION_INSTANCE__ANNOTATION:
        if (resolve) return getAnnotation();
        return basicGetAnnotation();
      case ModelDslPackage.ANNOTATION_INSTANCE__VALUES:
        return getValues();
      case ModelDslPackage.ANNOTATION_INSTANCE__PROPERTIES:
        return getProperties();
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
      case ModelDslPackage.ANNOTATION_INSTANCE__ANNOTATION:
        setAnnotation((Annotation)newValue);
        return;
      case ModelDslPackage.ANNOTATION_INSTANCE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends AnnotationValue>)newValue);
        return;
      case ModelDslPackage.ANNOTATION_INSTANCE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends AnnotationHiddenProperty>)newValue);
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
      case ModelDslPackage.ANNOTATION_INSTANCE__ANNOTATION:
        setAnnotation((Annotation)null);
        return;
      case ModelDslPackage.ANNOTATION_INSTANCE__VALUES:
        getValues().clear();
        return;
      case ModelDslPackage.ANNOTATION_INSTANCE__PROPERTIES:
        getProperties().clear();
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
      case ModelDslPackage.ANNOTATION_INSTANCE__ANNOTATION:
        return annotation != null;
      case ModelDslPackage.ANNOTATION_INSTANCE__VALUES:
        return values != null && !values.isEmpty();
      case ModelDslPackage.ANNOTATION_INSTANCE__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AnnotationInstanceImpl
