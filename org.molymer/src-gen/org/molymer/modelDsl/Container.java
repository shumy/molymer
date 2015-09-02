/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.Container#getType <em>Type</em>}</li>
 *   <li>{@link org.molymer.modelDsl.Container#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends Annotated
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see org.molymer.modelDsl.ModelDslPackage#getContainer_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.Container#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.AnnotationGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getContainer_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationGroup> getAnnotations();

} // Container
