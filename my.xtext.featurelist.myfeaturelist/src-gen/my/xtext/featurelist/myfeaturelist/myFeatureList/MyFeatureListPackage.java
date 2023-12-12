/**
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.myFeatureList;

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
 * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListFactory
 * @model kind="package"
 * @generated
 */
public interface MyFeatureListPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myFeatureList";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.my/featurelist/myfeaturelist/MyFeatureList";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myFeatureList";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyFeatureListPackage eINSTANCE = my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl.init();

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureListImpl <em>Feature List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureListImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getFeatureList()
   * @generated
   */
  int FEATURE_LIST = 0;

  /**
   * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__CONCEPTS = 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__CONSTRAINTS = 1;

  /**
   * The feature id for the '<em><b>Keys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__KEYS = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__PROPERTIES = 3;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__FEATURES = 4;

  /**
   * The number of structural features of the '<em>Feature List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptImpl <em>Concept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getConcept()
   * @generated
   */
  int CONCEPT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.AttributeImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MULTIPLICITY = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.TypeImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getType()
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
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConditionImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConstraintImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 5;

  /**
   * The feature id for the '<em><b>Concept</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__CONCEPT = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__CONDITION = 2;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.KeyImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getKey()
   * @generated
   */
  int KEY = 6;

  /**
   * The feature id for the '<em><b>Concept</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__CONCEPT = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.PropertyImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Concept</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__CONCEPT = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 8;

  /**
   * The feature id for the '<em><b>Verb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VERB = 0;

  /**
   * The feature id for the '<em><b>Concept</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__CONCEPT = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Verb <em>Verb</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Verb
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getVerb()
   * @generated
   */
  int VERB = 9;


  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList <em>Feature List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature List</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList
   * @generated
   */
  EClass getFeatureList();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConcepts <em>Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concepts</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConcepts()
   * @see #getFeatureList()
   * @generated
   */
  EReference getFeatureList_Concepts();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConstraints()
   * @see #getFeatureList()
   * @generated
   */
  EReference getFeatureList_Constraints();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Keys</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getKeys()
   * @see #getFeatureList()
   * @generated
   */
  EReference getFeatureList_Keys();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getProperties()
   * @see #getFeatureList()
   * @generated
   */
  EReference getFeatureList_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getFeatures()
   * @see #getFeatureList()
   * @generated
   */
  EReference getFeatureList_Features();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Concept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Concept
   * @generated
   */
  EClass getConcept();

  /**
   * Returns the meta object for the attribute '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Concept#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Concept#getName()
   * @see #getConcept()
   * @generated
   */
  EAttribute getConcept_Name();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Concept#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Concept#getAttributes()
   * @see #getConcept()
   * @generated
   */
  EReference getConcept_Attributes();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute#getMultiplicity()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Multiplicity();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Concept</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint#getConcept()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Concept();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint#getAttribute()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint#getCondition()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Condition();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Key#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Concept</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Key#getConcept()
   * @see #getKey()
   * @generated
   */
  EReference getKey_Concept();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Key#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Key#getAttribute()
   * @see #getKey()
   * @generated
   */
  EReference getKey_Attribute();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Concept</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getConcept()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Concept();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getAttribute()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Attribute();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getVerb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verb</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getVerb()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Verb();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Concept</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getConcept()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Concept();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getAttribute()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Attribute();

  /**
   * Returns the meta object for enum '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Verb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verb</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Verb
   * @generated
   */
  EEnum getVerb();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyFeatureListFactory getMyFeatureListFactory();

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
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureListImpl <em>Feature List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureListImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getFeatureList()
     * @generated
     */
    EClass FEATURE_LIST = eINSTANCE.getFeatureList();

    /**
     * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LIST__CONCEPTS = eINSTANCE.getFeatureList_Concepts();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LIST__CONSTRAINTS = eINSTANCE.getFeatureList_Constraints();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LIST__KEYS = eINSTANCE.getFeatureList_Keys();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LIST__PROPERTIES = eINSTANCE.getFeatureList_Properties();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LIST__FEATURES = eINSTANCE.getFeatureList_Features();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptImpl <em>Concept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getConcept()
     * @generated
     */
    EClass CONCEPT = eINSTANCE.getConcept();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT__NAME = eINSTANCE.getConcept_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT__ATTRIBUTES = eINSTANCE.getConcept_Attributes();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.AttributeImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MULTIPLICITY = eINSTANCE.getAttribute_Multiplicity();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.TypeImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConditionImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConstraintImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__CONCEPT = eINSTANCE.getConstraint_Concept();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__ATTRIBUTE = eINSTANCE.getConstraint_Attribute();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__CONDITION = eINSTANCE.getConstraint_Condition();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.KeyImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY__CONCEPT = eINSTANCE.getKey_Concept();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY__ATTRIBUTE = eINSTANCE.getKey_Attribute();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.PropertyImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__CONCEPT = eINSTANCE.getProperty_Concept();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ATTRIBUTE = eINSTANCE.getProperty_Attribute();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__VERB = eINSTANCE.getFeature_Verb();

    /**
     * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__CONCEPT = eINSTANCE.getFeature_Concept();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__ATTRIBUTE = eINSTANCE.getFeature_Attribute();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Verb <em>Verb</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Verb
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getVerb()
     * @generated
     */
    EEnum VERB = eINSTANCE.getVerb();

  }

} //MyFeatureListPackage
