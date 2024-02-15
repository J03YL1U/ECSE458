/**
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.featureLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Key Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.featurelanguage.featureLanguage.FeatureLanguagePackage#getKeyType()
 * @model
 * @generated
 */
public enum KeyType implements Enumerator
{
  /**
   * The '<em><b>Unique</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIQUE_VALUE
   * @generated
   * @ordered
   */
  UNIQUE(0, "unique", "unique"),

  /**
   * The '<em><b>Autounique</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUTOUNIQUE_VALUE
   * @generated
   * @ordered
   */
  AUTOUNIQUE(1, "autounique", "autounique"),

  /**
   * The '<em><b>Index</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INDEX_VALUE
   * @generated
   * @ordered
   */
  INDEX(2, "index", "index");

  /**
   * The '<em><b>Unique</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIQUE
   * @model name="unique"
   * @generated
   * @ordered
   */
  public static final int UNIQUE_VALUE = 0;

  /**
   * The '<em><b>Autounique</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUTOUNIQUE
   * @model name="autounique"
   * @generated
   * @ordered
   */
  public static final int AUTOUNIQUE_VALUE = 1;

  /**
   * The '<em><b>Index</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INDEX
   * @model name="index"
   * @generated
   * @ordered
   */
  public static final int INDEX_VALUE = 2;

  /**
   * An array of all the '<em><b>Key Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final KeyType[] VALUES_ARRAY =
    new KeyType[]
    {
      UNIQUE,
      AUTOUNIQUE,
      INDEX,
    };

  /**
   * A public read-only list of all the '<em><b>Key Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<KeyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Key Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static KeyType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KeyType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Key Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static KeyType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KeyType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Key Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static KeyType get(int value)
  {
    switch (value)
    {
      case UNIQUE_VALUE: return UNIQUE;
      case AUTOUNIQUE_VALUE: return AUTOUNIQUE;
      case INDEX_VALUE: return INDEX;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private KeyType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //KeyType