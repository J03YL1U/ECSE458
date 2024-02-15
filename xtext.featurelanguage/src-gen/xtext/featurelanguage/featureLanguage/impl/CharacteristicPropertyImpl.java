/**
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.featureLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.featurelanguage.featureLanguage.Characteristic;
import xtext.featurelanguage.featureLanguage.CharacteristicProperty;
import xtext.featurelanguage.featureLanguage.FeatureLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.featurelanguage.featureLanguage.impl.CharacteristicPropertyImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link xtext.featurelanguage.featureLanguage.impl.CharacteristicPropertyImpl#isIsLazy <em>Is Lazy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicPropertyImpl extends PropertyImpl implements CharacteristicProperty
{
  /**
   * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristic()
   * @generated
   * @ordered
   */
  protected Characteristic characteristic;

  /**
   * The default value of the '{@link #isIsLazy() <em>Is Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLazy()
   * @generated
   * @ordered
   */
  protected static final boolean IS_LAZY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsLazy() <em>Is Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLazy()
   * @generated
   * @ordered
   */
  protected boolean isLazy = IS_LAZY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacteristicPropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FeatureLanguagePackage.Literals.CHARACTERISTIC_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Characteristic getCharacteristic()
  {
    if (characteristic != null && characteristic.eIsProxy())
    {
      InternalEObject oldCharacteristic = (InternalEObject)characteristic;
      characteristic = (Characteristic)eResolveProxy(oldCharacteristic);
      if (characteristic != oldCharacteristic)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__CHARACTERISTIC, oldCharacteristic, characteristic));
      }
    }
    return characteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characteristic basicGetCharacteristic()
  {
    return characteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristic(Characteristic newCharacteristic)
  {
    Characteristic oldCharacteristic = characteristic;
    characteristic = newCharacteristic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__CHARACTERISTIC, oldCharacteristic, characteristic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIsLazy()
  {
    return isLazy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIsLazy(boolean newIsLazy)
  {
    boolean oldIsLazy = isLazy;
    isLazy = newIsLazy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__IS_LAZY, oldIsLazy, isLazy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__CHARACTERISTIC:
        if (resolve) return getCharacteristic();
        return basicGetCharacteristic();
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__IS_LAZY:
        return isIsLazy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__CHARACTERISTIC:
        setCharacteristic((Characteristic)newValue);
        return;
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__IS_LAZY:
        setIsLazy((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__CHARACTERISTIC:
        setCharacteristic((Characteristic)null);
        return;
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__IS_LAZY:
        setIsLazy(IS_LAZY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__CHARACTERISTIC:
        return characteristic != null;
      case FeatureLanguagePackage.CHARACTERISTIC_PROPERTY__IS_LAZY:
        return isLazy != IS_LAZY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (isLazy: ");
    result.append(isLazy);
    result.append(')');
    return result.toString();
  }

} //CharacteristicPropertyImpl