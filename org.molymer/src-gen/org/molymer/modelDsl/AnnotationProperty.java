/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.AnnotationProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.molymer.modelDsl.AnnotationProperty#getGroup <em>Group</em>}</li>
 *   <li>{@link org.molymer.modelDsl.AnnotationProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.molymer.modelDsl.AnnotationProperty#isMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationProperty()
 * @model
 * @generated
 */
public interface AnnotationProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.AnnotationProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' containment reference.
   * @see #setGroup(GroupType)
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationProperty_Group()
   * @model containment="true"
   * @generated
   */
  GroupType getGroup();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.AnnotationProperty#getGroup <em>Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group</em>' containment reference.
   * @see #getGroup()
   * @generated
   */
  void setGroup(GroupType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.molymer.modelDsl.ValueType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.molymer.modelDsl.ValueType
   * @see #setType(ValueType)
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationProperty_Type()
   * @model
   * @generated
   */
  ValueType getType();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.AnnotationProperty#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.molymer.modelDsl.ValueType
   * @see #getType()
   * @generated
   */
  void setType(ValueType value);

  /**
   * Returns the value of the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi</em>' attribute.
   * @see #setMulti(boolean)
   * @see org.molymer.modelDsl.ModelDslPackage#getAnnotationProperty_Multi()
   * @model
   * @generated
   */
  boolean isMulti();

  /**
   * Sets the value of the '{@link org.molymer.modelDsl.AnnotationProperty#isMulti <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi</em>' attribute.
   * @see #isMulti()
   * @generated
   */
  void setMulti(boolean value);

} // AnnotationProperty
