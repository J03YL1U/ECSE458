/**
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.featureLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.featurelanguage.featureLanguage.Concept#getName <em>Name</em>}</li>
 *   <li>{@link xtext.featurelanguage.featureLanguage.Concept#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#getConcept_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.featurelanguage.featureLanguage.Concept#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
   * The list contents are of type {@link xtext.featurelanguage.featureLanguage.Characteristic}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristics</em>' containment reference list.
   * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#getConcept_Characteristics()
   * @model containment="true"
   * @generated
   */
  EList<Characteristic> getCharacteristics();

} // Concept
