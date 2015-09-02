/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.AnnotationGroup#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationGroup()
 * @model
 * @generated
 */
public interface AnnotationGroup extends AnnotationValue
{
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
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationGroup_Instances()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationInstance> getInstances();

} // AnnotationGroup
