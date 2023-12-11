/**
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.myFeatureList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getConcept <em>Concept</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Concept</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept</em>' reference.
   * @see #setConcept(Concept)
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getProperty_Concept()
   * @model
   * @generated
   */
  Concept getConcept();

  /**
   * Sets the value of the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getConcept <em>Concept</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept</em>' reference.
   * @see #getConcept()
   * @generated
   */
  void setConcept(Concept value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage#getProperty_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link my.xtext.featurelist.myfeaturelist.myFeatureList.Property#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // Property
