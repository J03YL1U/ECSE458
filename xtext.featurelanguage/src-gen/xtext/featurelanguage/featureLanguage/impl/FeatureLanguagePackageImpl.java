/**
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.featureLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xtext.featurelanguage.featureLanguage.Characteristic;
import xtext.featurelanguage.featureLanguage.CharacteristicProperty;
import xtext.featurelanguage.featureLanguage.ComparisonOperator;
import xtext.featurelanguage.featureLanguage.Concept;
import xtext.featurelanguage.featureLanguage.ConceptProperty;
import xtext.featurelanguage.featureLanguage.Condition;
import xtext.featurelanguage.featureLanguage.Constraint;
import xtext.featurelanguage.featureLanguage.Feature;
import xtext.featurelanguage.featureLanguage.FeatureLanguage;
import xtext.featurelanguage.featureLanguage.FeatureLanguageFactory;
import xtext.featurelanguage.featureLanguage.FeatureLanguagePackage;
import xtext.featurelanguage.featureLanguage.Key;
import xtext.featurelanguage.featureLanguage.KeyType;
import xtext.featurelanguage.featureLanguage.NamedElement;
import xtext.featurelanguage.featureLanguage.Property;
import xtext.featurelanguage.featureLanguage.Type;
import xtext.featurelanguage.featureLanguage.Verb;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureLanguagePackageImpl extends EPackageImpl implements FeatureLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureLanguageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characteristicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conceptPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characteristicPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum verbEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum keyTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum comparisonOperatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FeatureLanguagePackageImpl()
  {
    super(eNS_URI, FeatureLanguageFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link FeatureLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FeatureLanguagePackage init()
  {
    if (isInited) return (FeatureLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(FeatureLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredFeatureLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    FeatureLanguagePackageImpl theFeatureLanguagePackage = registeredFeatureLanguagePackage instanceof FeatureLanguagePackageImpl ? (FeatureLanguagePackageImpl)registeredFeatureLanguagePackage : new FeatureLanguagePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theFeatureLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theFeatureLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFeatureLanguagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FeatureLanguagePackage.eNS_URI, theFeatureLanguagePackage);
    return theFeatureLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeatureLanguage()
  {
    return featureLanguageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeatureLanguage_Concepts()
  {
    return (EReference)featureLanguageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeatureLanguage_Constraints()
  {
    return (EReference)featureLanguageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeatureLanguage_Keys()
  {
    return (EReference)featureLanguageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeatureLanguage_Properties()
  {
    return (EReference)featureLanguageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeatureLanguage_Features()
  {
    return (EReference)featureLanguageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConcept()
  {
    return conceptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConcept_Characteristics()
  {
    return (EReference)conceptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacteristic()
  {
    return characteristicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacteristic_Type()
  {
    return (EReference)characteristicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacteristic_Multiplicity()
  {
    return (EAttribute)characteristicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacteristic_Literals()
  {
    return (EAttribute)characteristicEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCondition_Operator()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCondition_Value()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConstraint_Concept()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConstraint_Characteristic()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConstraint_Condition()
  {
    return (EReference)constraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConstraint_ErrorMsg()
  {
    return (EAttribute)constraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getKey()
  {
    return keyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getKey_Concept()
  {
    return (EReference)keyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getKey_Characteristic()
  {
    return (EReference)keyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getKey_KeyType()
  {
    return (EAttribute)keyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConceptProperty()
  {
    return conceptPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getConceptProperty_IsRoot()
  {
    return (EAttribute)conceptPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCharacteristicProperty()
  {
    return characteristicPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCharacteristicProperty_Characteristic()
  {
    return (EReference)characteristicPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCharacteristicProperty_IsLazy()
  {
    return (EAttribute)characteristicPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProperty_Concept()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFeature_Verb()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeature_Concept()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFeature_Characteristic()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getVerb()
  {
    return verbEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getKeyType()
  {
    return keyTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getComparisonOperator()
  {
    return comparisonOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeatureLanguageFactory getFeatureLanguageFactory()
  {
    return (FeatureLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    featureLanguageEClass = createEClass(FEATURE_LANGUAGE);
    createEReference(featureLanguageEClass, FEATURE_LANGUAGE__CONCEPTS);
    createEReference(featureLanguageEClass, FEATURE_LANGUAGE__CONSTRAINTS);
    createEReference(featureLanguageEClass, FEATURE_LANGUAGE__KEYS);
    createEReference(featureLanguageEClass, FEATURE_LANGUAGE__PROPERTIES);
    createEReference(featureLanguageEClass, FEATURE_LANGUAGE__FEATURES);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    conceptEClass = createEClass(CONCEPT);
    createEReference(conceptEClass, CONCEPT__CHARACTERISTICS);

    characteristicEClass = createEClass(CHARACTERISTIC);
    createEReference(characteristicEClass, CHARACTERISTIC__TYPE);
    createEAttribute(characteristicEClass, CHARACTERISTIC__MULTIPLICITY);
    createEAttribute(characteristicEClass, CHARACTERISTIC__LITERALS);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    conditionEClass = createEClass(CONDITION);
    createEAttribute(conditionEClass, CONDITION__OPERATOR);
    createEAttribute(conditionEClass, CONDITION__VALUE);

    constraintEClass = createEClass(CONSTRAINT);
    createEReference(constraintEClass, CONSTRAINT__CONCEPT);
    createEReference(constraintEClass, CONSTRAINT__CHARACTERISTIC);
    createEReference(constraintEClass, CONSTRAINT__CONDITION);
    createEAttribute(constraintEClass, CONSTRAINT__ERROR_MSG);

    keyEClass = createEClass(KEY);
    createEReference(keyEClass, KEY__CONCEPT);
    createEReference(keyEClass, KEY__CHARACTERISTIC);
    createEAttribute(keyEClass, KEY__KEY_TYPE);

    conceptPropertyEClass = createEClass(CONCEPT_PROPERTY);
    createEAttribute(conceptPropertyEClass, CONCEPT_PROPERTY__IS_ROOT);

    characteristicPropertyEClass = createEClass(CHARACTERISTIC_PROPERTY);
    createEReference(characteristicPropertyEClass, CHARACTERISTIC_PROPERTY__CHARACTERISTIC);
    createEAttribute(characteristicPropertyEClass, CHARACTERISTIC_PROPERTY__IS_LAZY);

    propertyEClass = createEClass(PROPERTY);
    createEReference(propertyEClass, PROPERTY__CONCEPT);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__VERB);
    createEReference(featureEClass, FEATURE__CONCEPT);
    createEReference(featureEClass, FEATURE__CHARACTERISTIC);

    // Create enums
    verbEEnum = createEEnum(VERB);
    keyTypeEEnum = createEEnum(KEY_TYPE);
    comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    conceptEClass.getESuperTypes().add(this.getNamedElement());
    characteristicEClass.getESuperTypes().add(this.getNamedElement());
    conceptPropertyEClass.getESuperTypes().add(this.getProperty());
    characteristicPropertyEClass.getESuperTypes().add(this.getProperty());

    // Initialize classes and features; add operations and parameters
    initEClass(featureLanguageEClass, FeatureLanguage.class, "FeatureLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureLanguage_Concepts(), this.getConcept(), null, "concepts", null, 0, -1, FeatureLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureLanguage_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, FeatureLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureLanguage_Keys(), this.getKey(), null, "keys", null, 0, -1, FeatureLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureLanguage_Properties(), this.getProperty(), null, "properties", null, 0, -1, FeatureLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureLanguage_Features(), this.getFeature(), null, "features", null, 0, -1, FeatureLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConcept_Characteristics(), this.getCharacteristic(), null, "characteristics", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacteristic_Type(), this.getType(), null, "type", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCharacteristic_Multiplicity(), ecorePackage.getEString(), "multiplicity", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCharacteristic_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCondition_Operator(), this.getComparisonOperator(), "operator", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCondition_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraint_Concept(), this.getConcept(), null, "concept", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Characteristic(), this.getCharacteristic(), null, "characteristic", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstraint_Condition(), this.getCondition(), null, "condition", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraint_ErrorMsg(), ecorePackage.getEString(), "errorMsg", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKey_Concept(), this.getConcept(), null, "concept", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKey_Characteristic(), this.getCharacteristic(), null, "characteristic", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKey_KeyType(), this.getKeyType(), "keyType", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptPropertyEClass, ConceptProperty.class, "ConceptProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConceptProperty_IsRoot(), ecorePackage.getEBoolean(), "isRoot", null, 0, 1, ConceptProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(characteristicPropertyEClass, CharacteristicProperty.class, "CharacteristicProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCharacteristicProperty_Characteristic(), this.getCharacteristic(), null, "characteristic", null, 0, 1, CharacteristicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCharacteristicProperty_IsLazy(), ecorePackage.getEBoolean(), "isLazy", null, 0, 1, CharacteristicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProperty_Concept(), this.getConcept(), null, "concept", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Verb(), this.getVerb(), "verb", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_Concept(), this.getConcept(), null, "concept", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_Characteristic(), this.getCharacteristic(), null, "characteristic", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(verbEEnum, Verb.class, "Verb");
    addEEnumLiteral(verbEEnum, Verb.ADD);
    addEEnumLiteral(verbEEnum, Verb.REMOVE);
    addEEnumLiteral(verbEEnum, Verb.UPDATE);
    addEEnumLiteral(verbEEnum, Verb.DISPLAY);

    initEEnum(keyTypeEEnum, KeyType.class, "KeyType");
    addEEnumLiteral(keyTypeEEnum, KeyType.UNIQUE);
    addEEnumLiteral(keyTypeEEnum, KeyType.AUTOUNIQUE);
    addEEnumLiteral(keyTypeEEnum, KeyType.INDEX);

    initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THAN);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THAN_OR_EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THAN_OR_EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THAN);

    // Create resource
    createResource(eNS_URI);
  }

} //FeatureLanguagePackageImpl
