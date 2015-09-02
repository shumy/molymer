/**
 */
package org.molymer.modelDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.molymer.modelDsl.Container;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.molymer.modelDsl.ModelDslPackage
 * @generated
 */
public class ModelDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModelDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ModelDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ModelDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseAnnotated(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseElement(type);
        if (result == null) result = caseAnnotated(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.PACKAGE:
      {
        org.molymer.modelDsl.Package package_ = (org.molymer.modelDsl.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseElement(package_);
        if (result == null) result = caseAnnotated(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = caseType(dataType);
        if (result == null) result = caseElement(dataType);
        if (result == null) result = caseAnnotated(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DATA_TYPE_FIELD:
      {
        DataTypeField dataTypeField = (DataTypeField)theEObject;
        T result = caseDataTypeField(dataTypeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.PATTERN_TYPE:
      {
        PatternType patternType = (PatternType)theEObject;
        T result = casePatternType(patternType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseType(entity);
        if (result == null) result = caseElement(entity);
        if (result == null) result = caseAnnotated(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ENTITY_GROUP:
      {
        EntityGroup entityGroup = (EntityGroup)theEObject;
        T result = caseEntityGroup(entityGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ENTITY_ELEMENTS:
      {
        EntityElements entityElements = (EntityElements)theEObject;
        T result = caseEntityElements(entityElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.CONTAINER:
      {
        Container container = (Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = caseAnnotated(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = caseAnnotated(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.PARENT:
      {
        Parent parent = (Parent)theEObject;
        T result = caseParent(parent);
        if (result == null) result = caseContainer(parent);
        if (result == null) result = caseAnnotated(parent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.CHILD:
      {
        Child child = (Child)theEObject;
        T result = caseChild(child);
        if (result == null) result = caseContainer(child);
        if (result == null) result = caseAnnotated(child);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseField(property);
        if (result == null) result = caseAnnotated(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseField(reference);
        if (result == null) result = caseAnnotated(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.REFERENCE_LIST:
      {
        ReferenceList referenceList = (ReferenceList)theEObject;
        T result = caseReferenceList(referenceList);
        if (result == null) result = caseField(referenceList);
        if (result == null) result = caseAnnotated(referenceList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = caseElement(annotation);
        if (result == null) result = caseAnnotated(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATION_PROPERTY:
      {
        AnnotationProperty annotationProperty = (AnnotationProperty)theEObject;
        T result = caseAnnotationProperty(annotationProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATION_GROUP:
      {
        AnnotationGroup annotationGroup = (AnnotationGroup)theEObject;
        T result = caseAnnotationGroup(annotationGroup);
        if (result == null) result = caseAnnotationValue(annotationGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATION_INSTANCE:
      {
        AnnotationInstance annotationInstance = (AnnotationInstance)theEObject;
        T result = caseAnnotationInstance(annotationInstance);
        if (result == null) result = caseAnnotated(annotationInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATION_HIDDEN_PROPERTY:
      {
        AnnotationHiddenProperty annotationHiddenProperty = (AnnotationHiddenProperty)theEObject;
        T result = caseAnnotationHiddenProperty(annotationHiddenProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATION_VALUE:
      {
        AnnotationValue annotationValue = (AnnotationValue)theEObject;
        T result = caseAnnotationValue(annotationValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATED:
      {
        Annotated annotated = (Annotated)theEObject;
        T result = caseAnnotated(annotated);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.GROUP_TYPE:
      {
        GroupType groupType = (GroupType)theEObject;
        T result = caseGroupType(groupType);
        if (result == null) result = caseAnnoTypes(groupType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.PACKAGE_TYPE:
      {
        PackageType packageType = (PackageType)theEObject;
        T result = casePackageType(packageType);
        if (result == null) result = caseAnnoTypes(packageType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DATA_TYPE_TYPE:
      {
        DataTypeType dataTypeType = (DataTypeType)theEObject;
        T result = caseDataTypeType(dataTypeType);
        if (result == null) result = caseAnnoTypes(dataTypeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNOTATION_TYPE:
      {
        AnnotationType annotationType = (AnnotationType)theEObject;
        T result = caseAnnotationType(annotationType);
        if (result == null) result = caseAnnoTypes(annotationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ENTITY_TYPE:
      {
        EntityType entityType = (EntityType)theEObject;
        T result = caseEntityType(entityType);
        if (result == null) result = caseAnnoTypes(entityType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.PROPERTY_TYPE:
      {
        PropertyType propertyType = (PropertyType)theEObject;
        T result = casePropertyType(propertyType);
        if (result == null) result = caseAnnoTypes(propertyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.REFERENCE_TYPE:
      {
        ReferenceType referenceType = (ReferenceType)theEObject;
        T result = caseReferenceType(referenceType);
        if (result == null) result = caseAnnoTypes(referenceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.REFERENCE_LIST_TYPE:
      {
        ReferenceListType referenceListType = (ReferenceListType)theEObject;
        T result = caseReferenceListType(referenceListType);
        if (result == null) result = caseAnnoTypes(referenceListType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.PARENT_TYPE:
      {
        ParentType parentType = (ParentType)theEObject;
        T result = caseParentType(parentType);
        if (result == null) result = caseAnnoTypes(parentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.CHILD_TYPE:
      {
        ChildType childType = (ChildType)theEObject;
        T result = caseChildType(childType);
        if (result == null) result = caseAnnoTypes(childType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.ANNO_TYPES:
      {
        AnnoTypes annoTypes = (AnnoTypes)theEObject;
        T result = caseAnnoTypes(annoTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseValue(stringValue);
        if (result == null) result = caseAnnotationValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.INTEGER_VALUE:
      {
        IntegerValue integerValue = (IntegerValue)theEObject;
        T result = caseIntegerValue(integerValue);
        if (result == null) result = caseValue(integerValue);
        if (result == null) result = caseAnnotationValue(integerValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.DOUBLE_VALUE:
      {
        DoubleValue doubleValue = (DoubleValue)theEObject;
        T result = caseDoubleValue(doubleValue);
        if (result == null) result = caseValue(doubleValue);
        if (result == null) result = caseAnnotationValue(doubleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.RANGE_VALUE:
      {
        RangeValue rangeValue = (RangeValue)theEObject;
        T result = caseRangeValue(rangeValue);
        if (result == null) result = caseValue(rangeValue);
        if (result == null) result = caseAnnotationValue(rangeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.FORMAT_RANGE_VALUE:
      {
        FormatRangeValue formatRangeValue = (FormatRangeValue)theEObject;
        T result = caseFormatRangeValue(formatRangeValue);
        if (result == null) result = caseValue(formatRangeValue);
        if (result == null) result = caseAnnotationValue(formatRangeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ModelDslPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseAnnotationValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(org.molymer.modelDsl.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeField(DataTypeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternType(PatternType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityGroup(EntityGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityElements(EntityElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainer(Container object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParent(Parent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChild(Child object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceList(ReferenceList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationProperty(AnnotationProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationGroup(AnnotationGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationInstance(AnnotationInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Hidden Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Hidden Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationHiddenProperty(AnnotationHiddenProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationValue(AnnotationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotated(Annotated object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupType(GroupType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageType(PackageType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeType(DataTypeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationType(AnnotationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityType(EntityType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyType(PropertyType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceType(ReferenceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference List Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference List Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceListType(ReferenceListType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParentType(ParentType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Child Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Child Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildType(ChildType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anno Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anno Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnoTypes(AnnoTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValue(IntegerValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleValue(DoubleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeValue(RangeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Format Range Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Format Range Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormatRangeValue(FormatRangeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ModelDslSwitch
