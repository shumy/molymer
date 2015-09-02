/**
 */
package org.molymer.modelDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.molymer.modelDsl.AnnoTypes;
import org.molymer.modelDsl.Annotation;
import org.molymer.modelDsl.AnnotationInstance;
import org.molymer.modelDsl.AnnotationProperty;
import org.molymer.modelDsl.ModelDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationImpl#getMandatories <em>Mandatories</em>}</li>
 *   <li>{@link org.molymer.modelDsl.impl.AnnotationImpl#getOptionals <em>Optionals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends ElementImpl implements Annotation
{
  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<AnnoTypes> types;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<AnnotationInstance> instances;

  /**
   * The cached value of the '{@link #getMandatories() <em>Mandatories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatories()
   * @generated
   * @ordered
   */
  protected EList<AnnotationProperty> mandatories;

  /**
   * The cached value of the '{@link #getOptionals() <em>Optionals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionals()
   * @generated
   * @ordered
   */
  protected EList<AnnotationProperty> optionals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationImpl()
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
    return ModelDslPackage.Literals.ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnoTypes> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<AnnoTypes>(AnnoTypes.class, this, ModelDslPackage.ANNOTATION__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationInstance> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<AnnotationInstance>(AnnotationInstance.class, this, ModelDslPackage.ANNOTATION__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationProperty> getMandatories()
  {
    if (mandatories == null)
    {
      mandatories = new EObjectContainmentEList<AnnotationProperty>(AnnotationProperty.class, this, ModelDslPackage.ANNOTATION__MANDATORIES);
    }
    return mandatories;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationProperty> getOptionals()
  {
    if (optionals == null)
    {
      optionals = new EObjectContainmentEList<AnnotationProperty>(AnnotationProperty.class, this, ModelDslPackage.ANNOTATION__OPTIONALS);
    }
    return optionals;
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
      case ModelDslPackage.ANNOTATION__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case ModelDslPackage.ANNOTATION__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case ModelDslPackage.ANNOTATION__MANDATORIES:
        return ((InternalEList<?>)getMandatories()).basicRemove(otherEnd, msgs);
      case ModelDslPackage.ANNOTATION__OPTIONALS:
        return ((InternalEList<?>)getOptionals()).basicRemove(otherEnd, msgs);
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
      case ModelDslPackage.ANNOTATION__TYPES:
        return getTypes();
      case ModelDslPackage.ANNOTATION__INSTANCES:
        return getInstances();
      case ModelDslPackage.ANNOTATION__MANDATORIES:
        return getMandatories();
      case ModelDslPackage.ANNOTATION__OPTIONALS:
        return getOptionals();
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
      case ModelDslPackage.ANNOTATION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends AnnoTypes>)newValue);
        return;
      case ModelDslPackage.ANNOTATION__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends AnnotationInstance>)newValue);
        return;
      case ModelDslPackage.ANNOTATION__MANDATORIES:
        getMandatories().clear();
        getMandatories().addAll((Collection<? extends AnnotationProperty>)newValue);
        return;
      case ModelDslPackage.ANNOTATION__OPTIONALS:
        getOptionals().clear();
        getOptionals().addAll((Collection<? extends AnnotationProperty>)newValue);
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
      case ModelDslPackage.ANNOTATION__TYPES:
        getTypes().clear();
        return;
      case ModelDslPackage.ANNOTATION__INSTANCES:
        getInstances().clear();
        return;
      case ModelDslPackage.ANNOTATION__MANDATORIES:
        getMandatories().clear();
        return;
      case ModelDslPackage.ANNOTATION__OPTIONALS:
        getOptionals().clear();
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
      case ModelDslPackage.ANNOTATION__TYPES:
        return types != null && !types.isEmpty();
      case ModelDslPackage.ANNOTATION__INSTANCES:
        return instances != null && !instances.isEmpty();
      case ModelDslPackage.ANNOTATION__MANDATORIES:
        return mandatories != null && !mandatories.isEmpty();
      case ModelDslPackage.ANNOTATION__OPTIONALS:
        return optionals != null && !optionals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AnnotationImpl
