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
   * The feature id for the '<em><b>Concept</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__CONCEPT = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Feature List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT__CONDITION = 2;

  /**
   * The number of structural features of the '<em>Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConditionImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 3;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.RefImpl <em>Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.RefImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getRef()
   * @generated
   */
  int REF = 4;

  /**
   * The number of structural features of the '<em>Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.FeatureImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 5;

  /**
   * The feature id for the '<em><b>Verb</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VERB = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__REF = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.DotExpressionImpl <em>Dot Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.DotExpressionImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getDotExpression()
   * @generated
   */
  int DOT_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_EXPRESSION__REF = REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_EXPRESSION__TAIL = REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dot Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_EXPRESSION_FEATURE_COUNT = REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptRefImpl <em>Concept Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptRefImpl
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getConceptRef()
   * @generated
   */
  int CONCEPT_REF = 7;

  /**
   * The feature id for the '<em><b>Concept</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_REF__CONCEPT = REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Concept Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Verb <em>Verb</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Verb
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getVerb()
   * @generated
   */
  int VERB = 8;


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
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concept</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConcept()
   * @see #getFeatureList()
   * @generated
   */
  EReference getFeatureList_Concept();

  /**
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getFeature()
   * @see #getFeatureList()
   * @generated
   */
  EReference getFeatureList_Feature();

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
   * Returns the meta object for the containment reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Concept#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Concept#getCondition()
   * @see #getConcept()
   * @generated
   */
  EReference getConcept_Condition();

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
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the reference list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Condition#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attribute</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Condition#getAttribute()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Attribute();

  /**
   * Returns the meta object for the attribute list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Value();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Ref
   * @generated
   */
  EClass getRef();

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
   * Returns the meta object for the attribute list '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getVerb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Verb</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getVerb()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Verb();

  /**
   * Returns the meta object for the containment reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.Feature#getRef()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Ref();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.DotExpression <em>Dot Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dot Expression</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.DotExpression
   * @generated
   */
  EClass getDotExpression();

  /**
   * Returns the meta object for the containment reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.DotExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.DotExpression#getRef()
   * @see #getDotExpression()
   * @generated
   */
  EReference getDotExpression_Ref();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.DotExpression#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tail</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.DotExpression#getTail()
   * @see #getDotExpression()
   * @generated
   */
  EReference getDotExpression_Tail();

  /**
   * Returns the meta object for class '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.ConceptRef <em>Concept Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Ref</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.ConceptRef
   * @generated
   */
  EClass getConceptRef();

  /**
   * Returns the meta object for the reference '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.ConceptRef#getConcept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Concept</em>'.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.ConceptRef#getConcept()
   * @see #getConceptRef()
   * @generated
   */
  EReference getConceptRef_Concept();

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
     * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LIST__CONCEPT = eINSTANCE.getFeatureList_Concept();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_LIST__FEATURE = eINSTANCE.getFeatureList_Feature();

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
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT__CONDITION = eINSTANCE.getConcept_Condition();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

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
     * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ATTRIBUTE = eINSTANCE.getCondition_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.RefImpl <em>Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.RefImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getRef()
     * @generated
     */
    EClass REF = eINSTANCE.getRef();

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
     * The meta object literal for the '<em><b>Verb</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__VERB = eINSTANCE.getFeature_Verb();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__REF = eINSTANCE.getFeature_Ref();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.DotExpressionImpl <em>Dot Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.DotExpressionImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getDotExpression()
     * @generated
     */
    EClass DOT_EXPRESSION = eINSTANCE.getDotExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_EXPRESSION__REF = eINSTANCE.getDotExpression_Ref();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_EXPRESSION__TAIL = eINSTANCE.getDotExpression_Tail();

    /**
     * The meta object literal for the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptRefImpl <em>Concept Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.ConceptRefImpl
     * @see my.xtext.featurelist.myfeaturelist.myFeatureList.impl.MyFeatureListPackageImpl#getConceptRef()
     * @generated
     */
    EClass CONCEPT_REF = eINSTANCE.getConceptRef();

    /**
     * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT_REF__CONCEPT = eINSTANCE.getConceptRef_Concept();

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
