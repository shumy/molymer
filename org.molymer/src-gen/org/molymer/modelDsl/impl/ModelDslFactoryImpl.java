/**
 */
package org.molymer.modelDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.molymer.modelDsl.AnnoTypes;
import org.molymer.modelDsl.Annotated;
import org.molymer.modelDsl.Annotation;
import org.molymer.modelDsl.AnnotationGroup;
import org.molymer.modelDsl.AnnotationHiddenProperty;
import org.molymer.modelDsl.AnnotationInstance;
import org.molymer.modelDsl.AnnotationProperty;
import org.molymer.modelDsl.AnnotationType;
import org.molymer.modelDsl.AnnotationValue;
import org.molymer.modelDsl.Child;
import org.molymer.modelDsl.ChildType;
import org.molymer.modelDsl.DataType;
import org.molymer.modelDsl.DataTypeField;
import org.molymer.modelDsl.DataTypeType;
import org.molymer.modelDsl.DoubleValue;
import org.molymer.modelDsl.Element;
import org.molymer.modelDsl.Entity;
import org.molymer.modelDsl.EntityElements;
import org.molymer.modelDsl.EntityGroup;
import org.molymer.modelDsl.EntityType;
import org.molymer.modelDsl.Field;
import org.molymer.modelDsl.FormatRangeValue;
import org.molymer.modelDsl.GroupType;
import org.molymer.modelDsl.Import;
import org.molymer.modelDsl.IntegerValue;
import org.molymer.modelDsl.Model;
import org.molymer.modelDsl.ModelDslFactory;
import org.molymer.modelDsl.ModelDslPackage;
import org.molymer.modelDsl.PackageType;
import org.molymer.modelDsl.Parent;
import org.molymer.modelDsl.ParentType;
import org.molymer.modelDsl.PatternType;
import org.molymer.modelDsl.Property;
import org.molymer.modelDsl.PropertyType;
import org.molymer.modelDsl.RangeValue;
import org.molymer.modelDsl.Reference;
import org.molymer.modelDsl.ReferenceList;
import org.molymer.modelDsl.ReferenceListType;
import org.molymer.modelDsl.ReferenceType;
import org.molymer.modelDsl.StringValue;
import org.molymer.modelDsl.Type;
import org.molymer.modelDsl.Value;
import org.molymer.modelDsl.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelDslFactoryImpl extends EFactoryImpl implements ModelDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelDslFactory init()
  {
    try
    {
      ModelDslFactory theModelDslFactory = (ModelDslFactory)EPackage.Registry.INSTANCE.getEFactory(ModelDslPackage.eNS_URI);
      if (theModelDslFactory != null)
      {
        return theModelDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelDslPackage.MODEL: return createModel();
      case ModelDslPackage.IMPORT: return createImport();
      case ModelDslPackage.ELEMENT: return createElement();
      case ModelDslPackage.TYPE: return createType();
      case ModelDslPackage.PACKAGE: return createPackage();
      case ModelDslPackage.DATA_TYPE: return createDataType();
      case ModelDslPackage.DATA_TYPE_FIELD: return createDataTypeField();
      case ModelDslPackage.PATTERN_TYPE: return createPatternType();
      case ModelDslPackage.ENTITY: return createEntity();
      case ModelDslPackage.ENTITY_GROUP: return createEntityGroup();
      case ModelDslPackage.ENTITY_ELEMENTS: return createEntityElements();
      case ModelDslPackage.CONTAINER: return createContainer();
      case ModelDslPackage.FIELD: return createField();
      case ModelDslPackage.PARENT: return createParent();
      case ModelDslPackage.CHILD: return createChild();
      case ModelDslPackage.PROPERTY: return createProperty();
      case ModelDslPackage.REFERENCE: return createReference();
      case ModelDslPackage.REFERENCE_LIST: return createReferenceList();
      case ModelDslPackage.ANNOTATION: return createAnnotation();
      case ModelDslPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
      case ModelDslPackage.ANNOTATION_GROUP: return createAnnotationGroup();
      case ModelDslPackage.ANNOTATION_INSTANCE: return createAnnotationInstance();
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY: return createAnnotationHiddenProperty();
      case ModelDslPackage.ANNOTATION_VALUE: return createAnnotationValue();
      case ModelDslPackage.ANNOTATED: return createAnnotated();
      case ModelDslPackage.GROUP_TYPE: return createGroupType();
      case ModelDslPackage.PACKAGE_TYPE: return createPackageType();
      case ModelDslPackage.DATA_TYPE_TYPE: return createDataTypeType();
      case ModelDslPackage.ANNOTATION_TYPE: return createAnnotationType();
      case ModelDslPackage.ENTITY_TYPE: return createEntityType();
      case ModelDslPackage.PROPERTY_TYPE: return createPropertyType();
      case ModelDslPackage.REFERENCE_TYPE: return createReferenceType();
      case ModelDslPackage.REFERENCE_LIST_TYPE: return createReferenceListType();
      case ModelDslPackage.PARENT_TYPE: return createParentType();
      case ModelDslPackage.CHILD_TYPE: return createChildType();
      case ModelDslPackage.ANNO_TYPES: return createAnnoTypes();
      case ModelDslPackage.STRING_VALUE: return createStringValue();
      case ModelDslPackage.INTEGER_VALUE: return createIntegerValue();
      case ModelDslPackage.DOUBLE_VALUE: return createDoubleValue();
      case ModelDslPackage.RANGE_VALUE: return createRangeValue();
      case ModelDslPackage.FORMAT_RANGE_VALUE: return createFormatRangeValue();
      case ModelDslPackage.VALUE: return createValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ModelDslPackage.VALUE_TYPE:
        return createValueTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ModelDslPackage.VALUE_TYPE:
        return convertValueTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.molymer.modelDsl.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeField createDataTypeField()
  {
    DataTypeFieldImpl dataTypeField = new DataTypeFieldImpl();
    return dataTypeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternType createPatternType()
  {
    PatternTypeImpl patternType = new PatternTypeImpl();
    return patternType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityGroup createEntityGroup()
  {
    EntityGroupImpl entityGroup = new EntityGroupImpl();
    return entityGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityElements createEntityElements()
  {
    EntityElementsImpl entityElements = new EntityElementsImpl();
    return entityElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.molymer.modelDsl.Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parent createParent()
  {
    ParentImpl parent = new ParentImpl();
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Child createChild()
  {
    ChildImpl child = new ChildImpl();
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceList createReferenceList()
  {
    ReferenceListImpl referenceList = new ReferenceListImpl();
    return referenceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty createAnnotationProperty()
  {
    AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
    return annotationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationGroup createAnnotationGroup()
  {
    AnnotationGroupImpl annotationGroup = new AnnotationGroupImpl();
    return annotationGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationInstance createAnnotationInstance()
  {
    AnnotationInstanceImpl annotationInstance = new AnnotationInstanceImpl();
    return annotationInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationHiddenProperty createAnnotationHiddenProperty()
  {
    AnnotationHiddenPropertyImpl annotationHiddenProperty = new AnnotationHiddenPropertyImpl();
    return annotationHiddenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValue createAnnotationValue()
  {
    AnnotationValueImpl annotationValue = new AnnotationValueImpl();
    return annotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotated createAnnotated()
  {
    AnnotatedImpl annotated = new AnnotatedImpl();
    return annotated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupType createGroupType()
  {
    GroupTypeImpl groupType = new GroupTypeImpl();
    return groupType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageType createPackageType()
  {
    PackageTypeImpl packageType = new PackageTypeImpl();
    return packageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeType createDataTypeType()
  {
    DataTypeTypeImpl dataTypeType = new DataTypeTypeImpl();
    return dataTypeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationType createAnnotationType()
  {
    AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
    return annotationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyType createPropertyType()
  {
    PropertyTypeImpl propertyType = new PropertyTypeImpl();
    return propertyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType createReferenceType()
  {
    ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
    return referenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceListType createReferenceListType()
  {
    ReferenceListTypeImpl referenceListType = new ReferenceListTypeImpl();
    return referenceListType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentType createParentType()
  {
    ParentTypeImpl parentType = new ParentTypeImpl();
    return parentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChildType createChildType()
  {
    ChildTypeImpl childType = new ChildTypeImpl();
    return childType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnoTypes createAnnoTypes()
  {
    AnnoTypesImpl annoTypes = new AnnoTypesImpl();
    return annoTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue createIntegerValue()
  {
    IntegerValueImpl integerValue = new IntegerValueImpl();
    return integerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleValue createDoubleValue()
  {
    DoubleValueImpl doubleValue = new DoubleValueImpl();
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeValue createRangeValue()
  {
    RangeValueImpl rangeValue = new RangeValueImpl();
    return rangeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatRangeValue createFormatRangeValue()
  {
    FormatRangeValueImpl formatRangeValue = new FormatRangeValueImpl();
    return formatRangeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType createValueTypeFromString(EDataType eDataType, String initialValue)
  {
    ValueType result = ValueType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDslPackage getModelDslPackage()
  {
    return (ModelDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelDslPackage getPackage()
  {
    return ModelDslPackage.eINSTANCE;
  }

} //ModelDslFactoryImpl
