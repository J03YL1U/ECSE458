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
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getKeys <em>Keys</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getProperties <em>Properties</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.FeatureList#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList()
 * @model
 * @generated
 */
public interface FeatureList extends EObject
{
  /**
   * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Concept}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concepts</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Concepts()
   * @model containment="true"
   * @generated
   */
  EList<Concept> getConcepts();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Key}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keys</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Keys()
   * @model containment="true"
   * @generated
   */
  EList<Key> getKeys();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link my.xtext.featurelist.myfeaturelist.myFeatureList.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getFeatureList_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // FeatureList
