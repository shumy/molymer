/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.Package#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.molymer.modelDsl.Package#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Element
{
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
   * @see org.molymer.modelDsl.ModelDslPackage#getPackage_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationGroup> getAnnotations();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getPackage_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Package
