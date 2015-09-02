/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.molymer.modelDsl.DataType#getFormatedFields <em>Formated Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.molymer.modelDsl.ModelDslPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Type
{
  /**
   * Returns the value of the '<em><b>Formated Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.molymer.modelDsl.DataTypeField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formated Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formated Fields</em>' containment reference list.
   * @see org.molymer.modelDsl.ModelDslPackage#getDataType_FormatedFields()
   * @model containment="true"
   * @generated
   */
  EList<DataTypeField> getFormatedFields();

} // DataType
