/**
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.featureLanguage;

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
 *   <li>{@link xtext.featurelanguage.featureLanguage.Property#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#getProperty()
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
   * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#getProperty_Concept()
   * @model
   * @generated
   */
  Concept getConcept();

  /**
   * Sets the value of the '{@link xtext.featurelanguage.featureLanguage.Property#getConcept <em>Concept</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept</em>' reference.
   * @see #getConcept()
   * @generated
   */
  void setConcept(Concept value);

} // Property