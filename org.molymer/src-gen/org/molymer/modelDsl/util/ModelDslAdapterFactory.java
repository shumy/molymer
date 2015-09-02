/**
 */
package org.molymer.modelDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.molymer.modelDsl.ModelDslPackage
 * @generated
 */
public class ModelDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModelDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ModelDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelDslSwitch<Adapter> modelSwitch =
    new ModelDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePackage(org.molymer.modelDsl.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseDataTypeField(DataTypeField object)
      {
        return createDataTypeFieldAdapter();
      }
      @Override
      public Adapter casePatternType(PatternType object)
      {
        return createPatternTypeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEntityGroup(EntityGroup object)
      {
        return createEntityGroupAdapter();
      }
      @Override
      public Adapter caseEntityElements(EntityElements object)
      {
        return createEntityElementsAdapter();
      }
      @Override
      public Adapter caseContainer(Container object)
      {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseParent(Parent object)
      {
        return createParentAdapter();
      }
      @Override
      public Adapter caseChild(Child object)
      {
        return createChildAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseReferenceList(ReferenceList object)
      {
        return createReferenceListAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationProperty(AnnotationProperty object)
      {
        return createAnnotationPropertyAdapter();
      }
      @Override
      public Adapter caseAnnotationGroup(AnnotationGroup object)
      {
        return createAnnotationGroupAdapter();
      }
      @Override
      public Adapter caseAnnotationInstance(AnnotationInstance object)
      {
        return createAnnotationInstanceAdapter();
      }
      @Override
      public Adapter caseAnnotationHiddenProperty(AnnotationHiddenProperty object)
      {
        return createAnnotationHiddenPropertyAdapter();
      }
      @Override
      public Adapter caseAnnotationValue(AnnotationValue object)
      {
        return createAnnotationValueAdapter();
      }
      @Override
      public Adapter caseAnnotated(Annotated object)
      {
        return createAnnotatedAdapter();
      }
      @Override
      public Adapter caseGroupType(GroupType object)
      {
        return createGroupTypeAdapter();
      }
      @Override
      public Adapter casePackageType(PackageType object)
      {
        return createPackageTypeAdapter();
      }
      @Override
      public Adapter caseDataTypeType(DataTypeType object)
      {
        return createDataTypeTypeAdapter();
      }
      @Override
      public Adapter caseAnnotationType(AnnotationType object)
      {
        return createAnnotationTypeAdapter();
      }
      @Override
      public Adapter caseEntityType(EntityType object)
      {
        return createEntityTypeAdapter();
      }
      @Override
      public Adapter casePropertyType(PropertyType object)
      {
        return createPropertyTypeAdapter();
      }
      @Override
      public Adapter caseReferenceType(ReferenceType object)
      {
        return createReferenceTypeAdapter();
      }
      @Override
      public Adapter caseReferenceListType(ReferenceListType object)
      {
        return createReferenceListTypeAdapter();
      }
      @Override
      public Adapter caseParentType(ParentType object)
      {
        return createParentTypeAdapter();
      }
      @Override
      public Adapter caseChildType(ChildType object)
      {
        return createChildTypeAdapter();
      }
      @Override
      public Adapter caseAnnoTypes(AnnoTypes object)
      {
        return createAnnoTypesAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntegerValue(IntegerValue object)
      {
        return createIntegerValueAdapter();
      }
      @Override
      public Adapter caseDoubleValue(DoubleValue object)
      {
        return createDoubleValueAdapter();
      }
      @Override
      public Adapter caseRangeValue(RangeValue object)
      {
        return createRangeValueAdapter();
      }
      @Override
      public Adapter caseFormatRangeValue(FormatRangeValue object)
      {
        return createFormatRangeValueAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.DataTypeField <em>Data Type Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.DataTypeField
   * @generated
   */
  public Adapter createDataTypeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.PatternType <em>Pattern Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.PatternType
   * @generated
   */
  public Adapter createPatternTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.EntityGroup <em>Entity Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.EntityGroup
   * @generated
   */
  public Adapter createEntityGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.EntityElements <em>Entity Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.EntityElements
   * @generated
   */
  public Adapter createEntityElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Container
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Parent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Parent
   * @generated
   */
  public Adapter createParentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Child <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Child
   * @generated
   */
  public Adapter createChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.ReferenceList <em>Reference List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.ReferenceList
   * @generated
   */
  public Adapter createReferenceListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.AnnotationProperty <em>Annotation Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.AnnotationProperty
   * @generated
   */
  public Adapter createAnnotationPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.AnnotationGroup <em>Annotation Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.AnnotationGroup
   * @generated
   */
  public Adapter createAnnotationGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.AnnotationInstance <em>Annotation Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.AnnotationInstance
   * @generated
   */
  public Adapter createAnnotationInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.AnnotationHiddenProperty <em>Annotation Hidden Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.AnnotationHiddenProperty
   * @generated
   */
  public Adapter createAnnotationHiddenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.AnnotationValue
   * @generated
   */
  public Adapter createAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Annotated <em>Annotated</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Annotated
   * @generated
   */
  public Adapter createAnnotatedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.GroupType <em>Group Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.GroupType
   * @generated
   */
  public Adapter createGroupTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.PackageType <em>Package Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.PackageType
   * @generated
   */
  public Adapter createPackageTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.DataTypeType <em>Data Type Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.DataTypeType
   * @generated
   */
  public Adapter createDataTypeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.AnnotationType <em>Annotation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.AnnotationType
   * @generated
   */
  public Adapter createAnnotationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.EntityType
   * @generated
   */
  public Adapter createEntityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.PropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.PropertyType
   * @generated
   */
  public Adapter createPropertyTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.ReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.ReferenceType
   * @generated
   */
  public Adapter createReferenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.ReferenceListType <em>Reference List Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.ReferenceListType
   * @generated
   */
  public Adapter createReferenceListTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.ParentType <em>Parent Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.ParentType
   * @generated
   */
  public Adapter createParentTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.ChildType <em>Child Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.ChildType
   * @generated
   */
  public Adapter createChildTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.AnnoTypes <em>Anno Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.AnnoTypes
   * @generated
   */
  public Adapter createAnnoTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.IntegerValue
   * @generated
   */
  public Adapter createIntegerValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.DoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.DoubleValue
   * @generated
   */
  public Adapter createDoubleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.RangeValue <em>Range Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.RangeValue
   * @generated
   */
  public Adapter createRangeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.FormatRangeValue <em>Format Range Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.FormatRangeValue
   * @generated
   */
  public Adapter createFormatRangeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.molymer.modelDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.molymer.modelDsl.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ModelDslAdapterFactory
