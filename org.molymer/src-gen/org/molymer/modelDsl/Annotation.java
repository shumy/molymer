/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.Annotation#getTypes <em>Types</em>}</li>
 *   <li>{@link org.molymer.modelDsl.Annotation#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.molymer.modelDsl.Annotation#getMandatories <em>Mandatories</em>}</li>
 *   <li>{@link org.molymer.modelDsl.Annotation#getOptionals <em>Optionals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Element
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnoTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotation_Types()
   * @model containment="true"
   * @generated
   */
  EList<AnnoTypes> getTypes();

  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnotationInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotation_Instances()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationInstance> getInstances();

  /**
   * Returns the value of the '<em><b>Mandatories</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnotationProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatories</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatories</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotation_Mandatories()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationProperty> getMandatories();

  /**
   * Returns the value of the '<em><b>Optionals</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnotationProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optionals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optionals</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotation_Optionals()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationProperty> getOptionals();

} // Annotation
