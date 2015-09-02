/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.AnnotationInstance#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.molymer.modelDsl.AnnotationInstance#getValues <em>Values</em>}</li>
 *   <li>{@link org.molymer.modelDsl.AnnotationInstance#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationInstance()
 * @model
 * @generated
 */
public interface AnnotationInstance extends Annotated
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' reference.
   * @see #setAnnotation(Annotation)
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationInstance_Annotation()
   * @model
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.AnnotationInstance#getAnnotation <em>Annotation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnotationValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationInstance_Values()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationValue> getValues();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnotationHiddenProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationInstance_Properties()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationHiddenProperty> getProperties();

} // AnnotationInstance
