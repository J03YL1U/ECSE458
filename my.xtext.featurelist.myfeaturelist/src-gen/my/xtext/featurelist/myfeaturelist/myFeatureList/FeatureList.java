/**
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.myFeatureList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConcept <em>Concept</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getKey <em>Key</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getProperty <em>Property</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList()
 * @model
 * @generated
 */
public interface FeatureList extends EObject
{
  /**
   * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Concept}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Concept()
   * @model containment="true"
   * @generated
   */
  EList<Concept> getConcept();

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Constraint()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraint();

  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Key}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Key()
   * @model containment="true"
   * @generated
   */
  EList<Key> getKey();

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Property()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

} // FeatureList
