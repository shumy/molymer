/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.molymer.modelDsl.ModelDslPackage
 * @generated
 */
public interface ModelDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelDslFactory eINSTANCE = org.molymer.modelDsl.impl.ModelDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Data Type Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Field</em>'.
   * @generated
   */
  DataTypeField createDataTypeField();

  /**
   * Returns a new object of class '<em>Pattern Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Type</em>'.
   * @generated
   */
  PatternType createPatternType();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Entity Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Group</em>'.
   * @generated
   */
  EntityGroup createEntityGroup();

  /**
   * Returns a new object of class '<em>Entity Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Elements</em>'.
   * @generated
   */
  EntityElements createEntityElements();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Parent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent</em>'.
   * @generated
   */
  Parent createParent();

  /**
   * Returns a new object of class '<em>Child</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Child</em>'.
   * @generated
   */
  Child createChild();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Reference List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference List</em>'.
   * @generated
   */
  ReferenceList createReferenceList();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Annotation Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Property</em>'.
   * @generated
   */
  AnnotationProperty createAnnotationProperty();

  /**
   * Returns a new object of class '<em>Annotation Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Group</em>'.
   * @generated
   */
  AnnotationGroup createAnnotationGroup();

  /**
   * Returns a new object of class '<em>Annotation Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Instance</em>'.
   * @generated
   */
  AnnotationInstance createAnnotationInstance();

  /**
   * Returns a new object of class '<em>Annotation Hidden Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Hidden Property</em>'.
   * @generated
   */
  AnnotationHiddenProperty createAnnotationHiddenProperty();

  /**
   * Returns a new object of class '<em>Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Value</em>'.
   * @generated
   */
  AnnotationValue createAnnotationValue();

  /**
   * Returns a new object of class '<em>Annotated</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotated</em>'.
   * @generated
   */
  Annotated createAnnotated();

  /**
   * Returns a new object of class '<em>Group Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Type</em>'.
   * @generated
   */
  GroupType createGroupType();

  /**
   * Returns a new object of class '<em>Package Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Type</em>'.
   * @generated
   */
  PackageType createPackageType();

  /**
   * Returns a new object of class '<em>Data Type Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Type</em>'.
   * @generated
   */
  DataTypeType createDataTypeType();

  /**
   * Returns a new object of class '<em>Annotation Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Type</em>'.
   * @generated
   */
  AnnotationType createAnnotationType();

  /**
   * Returns a new object of class '<em>Entity Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Type</em>'.
   * @generated
   */
  EntityType createEntityType();

  /**
   * Returns a new object of class '<em>Property Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Type</em>'.
   * @generated
   */
  PropertyType createPropertyType();

  /**
   * Returns a new object of class '<em>Reference Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Type</em>'.
   * @generated
   */
  ReferenceType createReferenceType();

  /**
   * Returns a new object of class '<em>Reference List Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference List Type</em>'.
   * @generated
   */
  ReferenceListType createReferenceListType();

  /**
   * Returns a new object of class '<em>Parent Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Type</em>'.
   * @generated
   */
  ParentType createParentType();

  /**
   * Returns a new object of class '<em>Child Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Child Type</em>'.
   * @generated
   */
  ChildType createChildType();

  /**
   * Returns a new object of class '<em>Anno Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anno Types</em>'.
   * @generated
   */
  AnnoTypes createAnnoTypes();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Value</em>'.
   * @generated
   */
  IntegerValue createIntegerValue();

  /**
   * Returns a new object of class '<em>Double Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Value</em>'.
   * @generated
   */
  DoubleValue createDoubleValue();

  /**
   * Returns a new object of class '<em>Range Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Value</em>'.
   * @generated
   */
  RangeValue createRangeValue();

  /**
   * Returns a new object of class '<em>Format Range Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Format Range Value</em>'.
   * @generated
   */
  FormatRangeValue createFormatRangeValue();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModelDslPackage getModelDslPackage();

} //ModelDslFactory
