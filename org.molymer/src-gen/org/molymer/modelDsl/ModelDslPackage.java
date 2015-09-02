/**
 */
package org.molymer.modelDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.molymer.modelDsl.ModelDslFactory
 * @model kind="package"
 * @generated
 */
public interface ModelDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "modelDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.molymer.org/ModelDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "modelDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelDslPackage eINSTANCE = org.molymer.modelDsl.impl.ModelDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ModelImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ImportImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotatedImpl <em>Annotated</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotatedImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotated()
   * @generated
   */
  int ANNOTATED = 24;

  /**
   * The number of structural features of the '<em>Annotated</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ElementImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = ANNOTATED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.TypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ANNOTATIONS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.PackageImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ANNOTATIONS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ELEMENTS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.DataTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Formated Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__FORMATED_FIELDS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.DataTypeFieldImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDataTypeField()
   * @generated
   */
  int DATA_TYPE_FIELD = 6;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FIELD__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FIELD__FORMAT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FIELD__TYPE = 2;

  /**
   * The number of structural features of the '<em>Data Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.PatternTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPatternType()
   * @generated
   */
  int PATTERN_TYPE = 7;

  /**
   * The feature id for the '<em><b>REGEX</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_TYPE__REGEX = 0;

  /**
   * The feature id for the '<em><b>DATE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_TYPE__DATE = 1;

  /**
   * The feature id for the '<em><b>NUMBER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_TYPE__NUMBER = 2;

  /**
   * The number of structural features of the '<em>Pattern Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.EntityImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Parent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PARENT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ELEMENTS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__GROUPS = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.EntityGroupImpl <em>Entity Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.EntityGroupImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntityGroup()
   * @generated
   */
  int ENTITY_GROUP = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_GROUP__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Entity Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.EntityElementsImpl <em>Entity Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.EntityElementsImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntityElements()
   * @generated
   */
  int ENTITY_ELEMENTS = 10;

  /**
   * The feature id for the '<em><b>Childs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ELEMENTS__CHILDS = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ELEMENTS__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ELEMENTS__REFERENCES = 2;

  /**
   * The feature id for the '<em><b>Reference Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ELEMENTS__REFERENCE_LISTS = 3;

  /**
   * The number of structural features of the '<em>Entity Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ELEMENTS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ContainerImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__TYPE = ANNOTATED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ANNOTATIONS = ANNOTATED_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.FieldImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getField()
   * @generated
   */
  int FIELD = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = ANNOTATED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATIONS = ANNOTATED_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ParentImpl <em>Parent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ParentImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getParent()
   * @generated
   */
  int PARENT = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT__TYPE = CONTAINER__TYPE;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT__ANNOTATIONS = CONTAINER__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Parent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ChildImpl <em>Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ChildImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getChild()
   * @generated
   */
  int CHILD = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD__TYPE = CONTAINER__TYPE;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD__ANNOTATIONS = CONTAINER__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.PropertyImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ANNOTATIONS = FIELD__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__OPTIONAL = FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = FIELD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ReferenceImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ANNOTATIONS = FIELD__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OPTIONAL = FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ENTITY = FIELD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ReferenceListImpl <em>Reference List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ReferenceListImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReferenceList()
   * @generated
   */
  int REFERENCE_LIST = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_LIST__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_LIST__ANNOTATIONS = FIELD__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_LIST__REFERENCE = FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_LIST__ENTITY = FIELD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_LIST_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotationImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TYPES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__INSTANCES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mandatories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__MANDATORIES = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Optionals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__OPTIONALS = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotationPropertyImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationProperty()
   * @generated
   */
  int ANNOTATION_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY__GROUP = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY__MULTI = 3;

  /**
   * The number of structural features of the '<em>Annotation Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PROPERTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotationValueImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationValue()
   * @generated
   */
  int ANNOTATION_VALUE = 23;

  /**
   * The number of structural features of the '<em>Annotation Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotationGroupImpl <em>Annotation Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotationGroupImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationGroup()
   * @generated
   */
  int ANNOTATION_GROUP = 20;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_GROUP__INSTANCES = ANNOTATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_GROUP_FEATURE_COUNT = ANNOTATION_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotationInstanceImpl <em>Annotation Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotationInstanceImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationInstance()
   * @generated
   */
  int ANNOTATION_INSTANCE = 21;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__ANNOTATION = ANNOTATED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__VALUES = ANNOTATED_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__PROPERTIES = ANNOTATED_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Annotation Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE_FEATURE_COUNT = ANNOTATED_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotationHiddenPropertyImpl <em>Annotation Hidden Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotationHiddenPropertyImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationHiddenProperty()
   * @generated
   */
  int ANNOTATION_HIDDEN_PROPERTY = 22;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_HIDDEN_PROPERTY__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_HIDDEN_PROPERTY__VALUES = 1;

  /**
   * The number of structural features of the '<em>Annotation Hidden Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_HIDDEN_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnoTypesImpl <em>Anno Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnoTypesImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnoTypes()
   * @generated
   */
  int ANNO_TYPES = 35;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNO_TYPES__TYPE = 0;

  /**
   * The number of structural features of the '<em>Anno Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNO_TYPES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.GroupTypeImpl <em>Group Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.GroupTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getGroupType()
   * @generated
   */
  int GROUP_TYPE = 25;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__NAME = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.PackageTypeImpl <em>Package Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.PackageTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPackageType()
   * @generated
   */
  int PACKAGE_TYPE = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Package Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.DataTypeTypeImpl <em>Data Type Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.DataTypeTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDataTypeType()
   * @generated
   */
  int DATA_TYPE_TYPE = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Data Type Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.AnnotationTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationType()
   * @generated
   */
  int ANNOTATION_TYPE = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Annotation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.EntityTypeImpl <em>Entity Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.EntityTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 29;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.PropertyTypeImpl <em>Property Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.PropertyTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPropertyType()
   * @generated
   */
  int PROPERTY_TYPE = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Property Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ReferenceTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReferenceType()
   * @generated
   */
  int REFERENCE_TYPE = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Reference Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ReferenceListTypeImpl <em>Reference List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ReferenceListTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReferenceListType()
   * @generated
   */
  int REFERENCE_LIST_TYPE = 32;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_LIST_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Reference List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_LIST_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ParentTypeImpl <em>Parent Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ParentTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getParentType()
   * @generated
   */
  int PARENT_TYPE = 33;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Parent Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ChildTypeImpl <em>Child Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ChildTypeImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getChildType()
   * @generated
   */
  int CHILD_TYPE = 34;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_TYPE__TYPE = ANNO_TYPES__TYPE;

  /**
   * The number of structural features of the '<em>Child Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_TYPE_FEATURE_COUNT = ANNO_TYPES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.ValueImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getValue()
   * @generated
   */
  int VALUE = 41;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = ANNOTATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.StringValueImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.IntegerValueImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.DoubleValueImpl <em>Double Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.DoubleValueImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDoubleValue()
   * @generated
   */
  int DOUBLE_VALUE = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.RangeValueImpl <em>Range Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.RangeValueImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getRangeValue()
   * @generated
   */
  int RANGE_VALUE = 39;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALUE__FROM = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From Inf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALUE__FROM_INF = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALUE__TO = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To Inf</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALUE__TO_INF = VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Range Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.impl.FormatRangeValueImpl <em>Format Range Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.impl.FormatRangeValueImpl
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getFormatRangeValue()
   * @generated
   */
  int FORMAT_RANGE_VALUE = 40;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_RANGE_VALUE__FROM = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_RANGE_VALUE__TO = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Format Range Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_RANGE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.molymer.modelDsl.ValueType <em>Value Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.molymer.modelDsl.ValueType
   * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getValueType()
   * @generated
   */
  int VALUE_TYPE = 42;


  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.molymer.modelDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.molymer.modelDsl.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.molymer.modelDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.molymer.modelDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.molymer.modelDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.molymer.modelDsl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.molymer.modelDsl.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.molymer.modelDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Type#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.molymer.modelDsl.Type#getAnnotations()
   * @see #getType()
   * @generated
   */
  EReference getType_Annotations();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.molymer.modelDsl.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Package#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.molymer.modelDsl.Package#getAnnotations()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Annotations();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Package#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.molymer.modelDsl.Package#getElements()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Elements();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.molymer.modelDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.DataType#getFormatedFields <em>Formated Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formated Fields</em>'.
   * @see org.molymer.modelDsl.DataType#getFormatedFields()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_FormatedFields();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.DataTypeField <em>Data Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Field</em>'.
   * @see org.molymer.modelDsl.DataTypeField
   * @generated
   */
  EClass getDataTypeField();

  /**
   * Returns the meta object for the containment reference '{@link org.molymer.modelDsl.DataTypeField#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see org.molymer.modelDsl.DataTypeField#getPattern()
   * @see #getDataTypeField()
   * @generated
   */
  EReference getDataTypeField_Pattern();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.DataTypeField#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.molymer.modelDsl.DataTypeField#getFormat()
   * @see #getDataTypeField()
   * @generated
   */
  EAttribute getDataTypeField_Format();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.DataTypeField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.molymer.modelDsl.DataTypeField#getType()
   * @see #getDataTypeField()
   * @generated
   */
  EReference getDataTypeField_Type();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.PatternType <em>Pattern Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Type</em>'.
   * @see org.molymer.modelDsl.PatternType
   * @generated
   */
  EClass getPatternType();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.PatternType#getREGEX <em>REGEX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>REGEX</em>'.
   * @see org.molymer.modelDsl.PatternType#getREGEX()
   * @see #getPatternType()
   * @generated
   */
  EAttribute getPatternType_REGEX();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.PatternType#getDATE <em>DATE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>DATE</em>'.
   * @see org.molymer.modelDsl.PatternType#getDATE()
   * @see #getPatternType()
   * @generated
   */
  EAttribute getPatternType_DATE();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.PatternType#getNUMBER <em>NUMBER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>NUMBER</em>'.
   * @see org.molymer.modelDsl.PatternType#getNUMBER()
   * @see #getPatternType()
   * @generated
   */
  EAttribute getPatternType_NUMBER();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.molymer.modelDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.molymer.modelDsl.Entity#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parent</em>'.
   * @see org.molymer.modelDsl.Entity#getParent()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Parent();

  /**
   * Returns the meta object for the containment reference '{@link org.molymer.modelDsl.Entity#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elements</em>'.
   * @see org.molymer.modelDsl.Entity#getElements()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Entity#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.molymer.modelDsl.Entity#getGroups()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Groups();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.EntityGroup <em>Entity Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Group</em>'.
   * @see org.molymer.modelDsl.EntityGroup
   * @generated
   */
  EClass getEntityGroup();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.EntityGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.molymer.modelDsl.EntityGroup#getName()
   * @see #getEntityGroup()
   * @generated
   */
  EAttribute getEntityGroup_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.molymer.modelDsl.EntityGroup#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elements</em>'.
   * @see org.molymer.modelDsl.EntityGroup#getElements()
   * @see #getEntityGroup()
   * @generated
   */
  EReference getEntityGroup_Elements();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.EntityElements <em>Entity Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Elements</em>'.
   * @see org.molymer.modelDsl.EntityElements
   * @generated
   */
  EClass getEntityElements();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.EntityElements#getChilds <em>Childs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Childs</em>'.
   * @see org.molymer.modelDsl.EntityElements#getChilds()
   * @see #getEntityElements()
   * @generated
   */
  EReference getEntityElements_Childs();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.EntityElements#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.molymer.modelDsl.EntityElements#getProperties()
   * @see #getEntityElements()
   * @generated
   */
  EReference getEntityElements_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.EntityElements#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see org.molymer.modelDsl.EntityElements#getReferences()
   * @see #getEntityElements()
   * @generated
   */
  EReference getEntityElements_References();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.EntityElements#getReferenceLists <em>Reference Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Lists</em>'.
   * @see org.molymer.modelDsl.EntityElements#getReferenceLists()
   * @see #getEntityElements()
   * @generated
   */
  EReference getEntityElements_ReferenceLists();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.molymer.modelDsl.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.Container#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.molymer.modelDsl.Container#getType()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Container#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.molymer.modelDsl.Container#getAnnotations()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Annotations();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.molymer.modelDsl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.molymer.modelDsl.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Field#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.molymer.modelDsl.Field#getAnnotations()
   * @see #getField()
   * @generated
   */
  EReference getField_Annotations();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Parent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent</em>'.
   * @see org.molymer.modelDsl.Parent
   * @generated
   */
  EClass getParent();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Child <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child</em>'.
   * @see org.molymer.modelDsl.Child
   * @generated
   */
  EClass getChild();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.molymer.modelDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.Property#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.molymer.modelDsl.Property#isOptional()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Optional();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.molymer.modelDsl.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.molymer.modelDsl.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.Reference#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.molymer.modelDsl.Reference#isOptional()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Optional();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.Reference#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.molymer.modelDsl.Reference#getEntity()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Entity();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.ReferenceList <em>Reference List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference List</em>'.
   * @see org.molymer.modelDsl.ReferenceList
   * @generated
   */
  EClass getReferenceList();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.ReferenceList#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.molymer.modelDsl.ReferenceList#getReference()
   * @see #getReferenceList()
   * @generated
   */
  EReference getReferenceList_Reference();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.ReferenceList#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.molymer.modelDsl.ReferenceList#getEntity()
   * @see #getReferenceList()
   * @generated
   */
  EReference getReferenceList_Entity();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.molymer.modelDsl.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Annotation#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.molymer.modelDsl.Annotation#getTypes()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Annotation#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.molymer.modelDsl.Annotation#getInstances()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Annotation#getMandatories <em>Mandatories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mandatories</em>'.
   * @see org.molymer.modelDsl.Annotation#getMandatories()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Mandatories();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.Annotation#getOptionals <em>Optionals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Optionals</em>'.
   * @see org.molymer.modelDsl.Annotation#getOptionals()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Optionals();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.AnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Property</em>'.
   * @see org.molymer.modelDsl.AnnotationProperty
   * @generated
   */
  EClass getAnnotationProperty();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.AnnotationProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.molymer.modelDsl.AnnotationProperty#getName()
   * @see #getAnnotationProperty()
   * @generated
   */
  EAttribute getAnnotationProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.molymer.modelDsl.AnnotationProperty#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group</em>'.
   * @see org.molymer.modelDsl.AnnotationProperty#getGroup()
   * @see #getAnnotationProperty()
   * @generated
   */
  EReference getAnnotationProperty_Group();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.AnnotationProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.molymer.modelDsl.AnnotationProperty#getType()
   * @see #getAnnotationProperty()
   * @generated
   */
  EAttribute getAnnotationProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.AnnotationProperty#isMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi</em>'.
   * @see org.molymer.modelDsl.AnnotationProperty#isMulti()
   * @see #getAnnotationProperty()
   * @generated
   */
  EAttribute getAnnotationProperty_Multi();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.AnnotationGroup <em>Annotation Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Group</em>'.
   * @see org.molymer.modelDsl.AnnotationGroup
   * @generated
   */
  EClass getAnnotationGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.AnnotationGroup#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.molymer.modelDsl.AnnotationGroup#getInstances()
   * @see #getAnnotationGroup()
   * @generated
   */
  EReference getAnnotationGroup_Instances();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.AnnotationInstance <em>Annotation Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Instance</em>'.
   * @see org.molymer.modelDsl.AnnotationInstance
   * @generated
   */
  EClass getAnnotationInstance();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.AnnotationInstance#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see org.molymer.modelDsl.AnnotationInstance#getAnnotation()
   * @see #getAnnotationInstance()
   * @generated
   */
  EReference getAnnotationInstance_Annotation();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.AnnotationInstance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.molymer.modelDsl.AnnotationInstance#getValues()
   * @see #getAnnotationInstance()
   * @generated
   */
  EReference getAnnotationInstance_Values();

  /**
   * Returns the meta object for the containment reference list '{@link org.molymer.modelDsl.AnnotationInstance#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.molymer.modelDsl.AnnotationInstance#getProperties()
   * @see #getAnnotationInstance()
   * @generated
   */
  EReference getAnnotationInstance_Properties();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.AnnotationHiddenProperty <em>Annotation Hidden Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Hidden Property</em>'.
   * @see org.molymer.modelDsl.AnnotationHiddenProperty
   * @generated
   */
  EClass getAnnotationHiddenProperty();

  /**
   * Returns the meta object for the reference '{@link org.molymer.modelDsl.AnnotationHiddenProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.molymer.modelDsl.AnnotationHiddenProperty#getProperty()
   * @see #getAnnotationHiddenProperty()
   * @generated
   */
  EReference getAnnotationHiddenProperty_Property();

  /**
   * Returns the meta object for the reference list '{@link org.molymer.modelDsl.AnnotationHiddenProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Values</em>'.
   * @see org.molymer.modelDsl.AnnotationHiddenProperty#getValues()
   * @see #getAnnotationHiddenProperty()
   * @generated
   */
  EReference getAnnotationHiddenProperty_Values();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Value</em>'.
   * @see org.molymer.modelDsl.AnnotationValue
   * @generated
   */
  EClass getAnnotationValue();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Annotated <em>Annotated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated</em>'.
   * @see org.molymer.modelDsl.Annotated
   * @generated
   */
  EClass getAnnotated();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.GroupType <em>Group Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Type</em>'.
   * @see org.molymer.modelDsl.GroupType
   * @generated
   */
  EClass getGroupType();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.GroupType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.molymer.modelDsl.GroupType#getName()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Name();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.PackageType <em>Package Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Type</em>'.
   * @see org.molymer.modelDsl.PackageType
   * @generated
   */
  EClass getPackageType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.DataTypeType <em>Data Type Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Type</em>'.
   * @see org.molymer.modelDsl.DataTypeType
   * @generated
   */
  EClass getDataTypeType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.AnnotationType <em>Annotation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Type</em>'.
   * @see org.molymer.modelDsl.AnnotationType
   * @generated
   */
  EClass getAnnotationType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type</em>'.
   * @see org.molymer.modelDsl.EntityType
   * @generated
   */
  EClass getEntityType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.PropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Type</em>'.
   * @see org.molymer.modelDsl.PropertyType
   * @generated
   */
  EClass getPropertyType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.ReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Type</em>'.
   * @see org.molymer.modelDsl.ReferenceType
   * @generated
   */
  EClass getReferenceType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.ReferenceListType <em>Reference List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference List Type</em>'.
   * @see org.molymer.modelDsl.ReferenceListType
   * @generated
   */
  EClass getReferenceListType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.ParentType <em>Parent Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Type</em>'.
   * @see org.molymer.modelDsl.ParentType
   * @generated
   */
  EClass getParentType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.ChildType <em>Child Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child Type</em>'.
   * @see org.molymer.modelDsl.ChildType
   * @generated
   */
  EClass getChildType();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.AnnoTypes <em>Anno Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anno Types</em>'.
   * @see org.molymer.modelDsl.AnnoTypes
   * @generated
   */
  EClass getAnnoTypes();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.AnnoTypes#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.molymer.modelDsl.AnnoTypes#getType()
   * @see #getAnnoTypes()
   * @generated
   */
  EAttribute getAnnoTypes_Type();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.molymer.modelDsl.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.molymer.modelDsl.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see org.molymer.modelDsl.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.IntegerValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.molymer.modelDsl.IntegerValue#getValue()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Value();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.DoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Value</em>'.
   * @see org.molymer.modelDsl.DoubleValue
   * @generated
   */
  EClass getDoubleValue();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.DoubleValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.molymer.modelDsl.DoubleValue#getValue()
   * @see #getDoubleValue()
   * @generated
   */
  EAttribute getDoubleValue_Value();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.RangeValue <em>Range Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Value</em>'.
   * @see org.molymer.modelDsl.RangeValue
   * @generated
   */
  EClass getRangeValue();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.RangeValue#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see org.molymer.modelDsl.RangeValue#getFrom()
   * @see #getRangeValue()
   * @generated
   */
  EAttribute getRangeValue_From();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.RangeValue#isFromInf <em>From Inf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From Inf</em>'.
   * @see org.molymer.modelDsl.RangeValue#isFromInf()
   * @see #getRangeValue()
   * @generated
   */
  EAttribute getRangeValue_FromInf();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.RangeValue#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see org.molymer.modelDsl.RangeValue#getTo()
   * @see #getRangeValue()
   * @generated
   */
  EAttribute getRangeValue_To();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.RangeValue#isToInf <em>To Inf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To Inf</em>'.
   * @see org.molymer.modelDsl.RangeValue#isToInf()
   * @see #getRangeValue()
   * @generated
   */
  EAttribute getRangeValue_ToInf();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.FormatRangeValue <em>Format Range Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Format Range Value</em>'.
   * @see org.molymer.modelDsl.FormatRangeValue
   * @generated
   */
  EClass getFormatRangeValue();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.FormatRangeValue#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see org.molymer.modelDsl.FormatRangeValue#getFrom()
   * @see #getFormatRangeValue()
   * @generated
   */
  EAttribute getFormatRangeValue_From();

  /**
   * Returns the meta object for the attribute '{@link org.molymer.modelDsl.FormatRangeValue#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see org.molymer.modelDsl.FormatRangeValue#getTo()
   * @see #getFormatRangeValue()
   * @generated
   */
  EAttribute getFormatRangeValue_To();

  /**
   * Returns the meta object for class '{@link org.molymer.modelDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.molymer.modelDsl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for enum '{@link org.molymer.modelDsl.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Type</em>'.
   * @see org.molymer.modelDsl.ValueType
   * @generated
   */
  EEnum getValueType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelDslFactory getModelDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ModelImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ImportImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ElementImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.TypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ANNOTATIONS = eINSTANCE.getType_Annotations();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.PackageImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ANNOTATIONS = eINSTANCE.getPackage_Annotations();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.DataTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Formated Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__FORMATED_FIELDS = eINSTANCE.getDataType_FormatedFields();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.DataTypeFieldImpl <em>Data Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.DataTypeFieldImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDataTypeField()
     * @generated
     */
    EClass DATA_TYPE_FIELD = eINSTANCE.getDataTypeField();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_FIELD__PATTERN = eINSTANCE.getDataTypeField_Pattern();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_FIELD__FORMAT = eINSTANCE.getDataTypeField_Format();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE_FIELD__TYPE = eINSTANCE.getDataTypeField_Type();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.PatternTypeImpl <em>Pattern Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.PatternTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPatternType()
     * @generated
     */
    EClass PATTERN_TYPE = eINSTANCE.getPatternType();

    /**
     * The meta object literal for the '<em><b>REGEX</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_TYPE__REGEX = eINSTANCE.getPatternType_REGEX();

    /**
     * The meta object literal for the '<em><b>DATE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_TYPE__DATE = eINSTANCE.getPatternType_DATE();

    /**
     * The meta object literal for the '<em><b>NUMBER</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN_TYPE__NUMBER = eINSTANCE.getPatternType_NUMBER();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.EntityImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PARENT = eINSTANCE.getEntity_Parent();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ELEMENTS = eINSTANCE.getEntity_Elements();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__GROUPS = eINSTANCE.getEntity_Groups();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.EntityGroupImpl <em>Entity Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.EntityGroupImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntityGroup()
     * @generated
     */
    EClass ENTITY_GROUP = eINSTANCE.getEntityGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_GROUP__NAME = eINSTANCE.getEntityGroup_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_GROUP__ELEMENTS = eINSTANCE.getEntityGroup_Elements();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.EntityElementsImpl <em>Entity Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.EntityElementsImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntityElements()
     * @generated
     */
    EClass ENTITY_ELEMENTS = eINSTANCE.getEntityElements();

    /**
     * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ELEMENTS__CHILDS = eINSTANCE.getEntityElements_Childs();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ELEMENTS__PROPERTIES = eINSTANCE.getEntityElements_Properties();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ELEMENTS__REFERENCES = eINSTANCE.getEntityElements_References();

    /**
     * The meta object literal for the '<em><b>Reference Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ELEMENTS__REFERENCE_LISTS = eINSTANCE.getEntityElements_ReferenceLists();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ContainerImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__TYPE = eINSTANCE.getContainer_Type();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__ANNOTATIONS = eINSTANCE.getContainer_Annotations();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.FieldImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ANNOTATIONS = eINSTANCE.getField_Annotations();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ParentImpl <em>Parent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ParentImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getParent()
     * @generated
     */
    EClass PARENT = eINSTANCE.getParent();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ChildImpl <em>Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ChildImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getChild()
     * @generated
     */
    EClass CHILD = eINSTANCE.getChild();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.PropertyImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__OPTIONAL = eINSTANCE.getProperty_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ReferenceImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__OPTIONAL = eINSTANCE.getReference_Optional();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ENTITY = eINSTANCE.getReference_Entity();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ReferenceListImpl <em>Reference List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ReferenceListImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReferenceList()
     * @generated
     */
    EClass REFERENCE_LIST = eINSTANCE.getReferenceList();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_LIST__REFERENCE = eINSTANCE.getReferenceList_Reference();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_LIST__ENTITY = eINSTANCE.getReferenceList_Entity();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotationImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__TYPES = eINSTANCE.getAnnotation_Types();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__INSTANCES = eINSTANCE.getAnnotation_Instances();

    /**
     * The meta object literal for the '<em><b>Mandatories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__MANDATORIES = eINSTANCE.getAnnotation_Mandatories();

    /**
     * The meta object literal for the '<em><b>Optionals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__OPTIONALS = eINSTANCE.getAnnotation_Optionals();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotationPropertyImpl <em>Annotation Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotationPropertyImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationProperty()
     * @generated
     */
    EClass ANNOTATION_PROPERTY = eINSTANCE.getAnnotationProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_PROPERTY__NAME = eINSTANCE.getAnnotationProperty_Name();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_PROPERTY__GROUP = eINSTANCE.getAnnotationProperty_Group();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_PROPERTY__TYPE = eINSTANCE.getAnnotationProperty_Type();

    /**
     * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_PROPERTY__MULTI = eINSTANCE.getAnnotationProperty_Multi();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotationGroupImpl <em>Annotation Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotationGroupImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationGroup()
     * @generated
     */
    EClass ANNOTATION_GROUP = eINSTANCE.getAnnotationGroup();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_GROUP__INSTANCES = eINSTANCE.getAnnotationGroup_Instances();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotationInstanceImpl <em>Annotation Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotationInstanceImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationInstance()
     * @generated
     */
    EClass ANNOTATION_INSTANCE = eINSTANCE.getAnnotationInstance();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_INSTANCE__ANNOTATION = eINSTANCE.getAnnotationInstance_Annotation();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_INSTANCE__VALUES = eINSTANCE.getAnnotationInstance_Values();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_INSTANCE__PROPERTIES = eINSTANCE.getAnnotationInstance_Properties();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotationHiddenPropertyImpl <em>Annotation Hidden Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotationHiddenPropertyImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationHiddenProperty()
     * @generated
     */
    EClass ANNOTATION_HIDDEN_PROPERTY = eINSTANCE.getAnnotationHiddenProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_HIDDEN_PROPERTY__PROPERTY = eINSTANCE.getAnnotationHiddenProperty_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_HIDDEN_PROPERTY__VALUES = eINSTANCE.getAnnotationHiddenProperty_Values();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotationValueImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationValue()
     * @generated
     */
    EClass ANNOTATION_VALUE = eINSTANCE.getAnnotationValue();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotatedImpl <em>Annotated</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotatedImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotated()
     * @generated
     */
    EClass ANNOTATED = eINSTANCE.getAnnotated();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.GroupTypeImpl <em>Group Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.GroupTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getGroupType()
     * @generated
     */
    EClass GROUP_TYPE = eINSTANCE.getGroupType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_TYPE__NAME = eINSTANCE.getGroupType_Name();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.PackageTypeImpl <em>Package Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.PackageTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPackageType()
     * @generated
     */
    EClass PACKAGE_TYPE = eINSTANCE.getPackageType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.DataTypeTypeImpl <em>Data Type Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.DataTypeTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDataTypeType()
     * @generated
     */
    EClass DATA_TYPE_TYPE = eINSTANCE.getDataTypeType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnotationTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnotationType()
     * @generated
     */
    EClass ANNOTATION_TYPE = eINSTANCE.getAnnotationType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.EntityTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getEntityType()
     * @generated
     */
    EClass ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.PropertyTypeImpl <em>Property Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.PropertyTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getPropertyType()
     * @generated
     */
    EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ReferenceTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReferenceType()
     * @generated
     */
    EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ReferenceListTypeImpl <em>Reference List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ReferenceListTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getReferenceListType()
     * @generated
     */
    EClass REFERENCE_LIST_TYPE = eINSTANCE.getReferenceListType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ParentTypeImpl <em>Parent Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ParentTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getParentType()
     * @generated
     */
    EClass PARENT_TYPE = eINSTANCE.getParentType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ChildTypeImpl <em>Child Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ChildTypeImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getChildType()
     * @generated
     */
    EClass CHILD_TYPE = eINSTANCE.getChildType();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.AnnoTypesImpl <em>Anno Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.AnnoTypesImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getAnnoTypes()
     * @generated
     */
    EClass ANNO_TYPES = eINSTANCE.getAnnoTypes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNO_TYPES__TYPE = eINSTANCE.getAnnoTypes_Type();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.StringValueImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.IntegerValueImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getIntegerValue()
     * @generated
     */
    EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.DoubleValueImpl <em>Double Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.DoubleValueImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getDoubleValue()
     * @generated
     */
    EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_VALUE__VALUE = eINSTANCE.getDoubleValue_Value();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.RangeValueImpl <em>Range Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.RangeValueImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getRangeValue()
     * @generated
     */
    EClass RANGE_VALUE = eINSTANCE.getRangeValue();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE_VALUE__FROM = eINSTANCE.getRangeValue_From();

    /**
     * The meta object literal for the '<em><b>From Inf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE_VALUE__FROM_INF = eINSTANCE.getRangeValue_FromInf();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE_VALUE__TO = eINSTANCE.getRangeValue_To();

    /**
     * The meta object literal for the '<em><b>To Inf</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANGE_VALUE__TO_INF = eINSTANCE.getRangeValue_ToInf();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.FormatRangeValueImpl <em>Format Range Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.FormatRangeValueImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getFormatRangeValue()
     * @generated
     */
    EClass FORMAT_RANGE_VALUE = eINSTANCE.getFormatRangeValue();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAT_RANGE_VALUE__FROM = eINSTANCE.getFormatRangeValue_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAT_RANGE_VALUE__TO = eINSTANCE.getFormatRangeValue_To();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.impl.ValueImpl
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.molymer.modelDsl.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.molymer.modelDsl.ValueType
     * @see org.molymer.modelDsl.impl.ModelDslPackageImpl#getValueType()
     * @generated
     */
    EEnum VALUE_TYPE = eINSTANCE.getValueType();

  }

} //ModelDslPackage
