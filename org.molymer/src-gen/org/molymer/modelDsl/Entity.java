/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.Entity#getParent <em>Parent</em>}</li>
 *   <li>{@link org.molymer.modelDsl.Entity#getElements <em>Elements</em>}</li>
 *   <li>{@link org.molymer.modelDsl.Entity#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' containment reference.
   * @see #setParent(Parent)
   * @see org.molymer.modelDsl.ModelDslPackage#getEntity_Parent()
   * @model containment="true"
   * @generated
   */
  Parent getParent();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.Entity#getParent <em>Parent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' containment reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Parent value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference.
   * @see #setElements(EntityElements)
   * @see org.molymer.modelDsl.ModelDslPackage#getEntity_Elements()
   * @model containment="true"
   * @generated
   */
  EntityElements getElements();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.Entity#getElements <em>Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elements</em>' containment reference.
   * @see #getElements()
   * @generated
   */
  void setElements(EntityElements value);

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.EntityGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getEntity_Groups()
   * @model containment="true"
   * @generated
   */
  EList<EntityGroup> getGroups();

} // Entity
