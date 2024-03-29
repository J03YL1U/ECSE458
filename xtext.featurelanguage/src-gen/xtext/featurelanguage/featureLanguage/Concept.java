/**
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.featureLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.featurelanguage.featureLanguage.Concept#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 *
 * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends NamedElement
{
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
