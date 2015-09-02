/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Hidden Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.AnnotationHiddenProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link org.molymer.modelDsl.AnnotationHiddenProperty#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationHiddenProperty()
 * @model
 * @generated
 */
public interface AnnotationHiddenProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(AnnotationProperty)
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationHiddenProperty_Property()
   * @model
   * @generated
   */
  AnnotationProperty getProperty();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.AnnotationHiddenProperty#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(AnnotationProperty value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnotationValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationHiddenProperty_Values()
   * @model
   * @generated
   */
  EList<AnnotationValue> getValues();

} // AnnotationHiddenProperty
