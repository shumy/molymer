/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.EntityElements#getChilds <em>Childs</em>}</li>
 *   <li>{@link org.molymer.modelDsl.EntityElements#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.molymer.modelDsl.EntityElements#getReferences <em>References</em>}</li>
 *   <li>{@link org.molymer.modelDsl.EntityElements#getReferenceLists <em>Reference Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getEntityElements()
 * @model
 * @generated
 */
public interface EntityElements extends EObject
{
  /**
   * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.Child}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Childs</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getEntityElements_Childs()
   * @model containment="true"
   * @generated
   */
  EList<Child> getChilds();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getEntityElements_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getEntityElements_References()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getReferences();

  /**
   * Returns the value of the '<em><b>Reference Lists</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.ReferenceList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Lists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Lists</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getEntityElements_ReferenceLists()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceList> getReferenceLists();

} // EntityElements
