/**
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.myFeatureList.impl;

import my.xtext.featurelist.myfeaturelist.myFeatureList.Attribute;
import my.xtext.featurelist.myfeaturelist.myFeatureList.DotExpression;
import my.xtext.featurelist.myfeaturelist.myFeatureList.MyFeatureListPackage;
import my.xtext.featurelist.myfeaturelist.myFeatureList.Ref;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dot Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.DotExpressionImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link my.xtext.featurelist.myfeaturelist.myFeatureList.impl.DotExpressionImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DotExpressionImpl extends RefImpl implements DotExpression
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Ref ref;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected Attribute tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DotExpressionImpl()
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
    return MyFeatureListPackage.Literals.DOT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ref getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(Ref newRef, NotificationChain msgs)
  {
    Ref oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyFeatureListPackage.DOT_EXPRESSION__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(Ref newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyFeatureListPackage.DOT_EXPRESSION__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyFeatureListPackage.DOT_EXPRESSION__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyFeatureListPackage.DOT_EXPRESSION__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getTail()
  {
    if (tail != null && tail.eIsProxy())
    {
      InternalEObject oldTail = (InternalEObject)tail;
      tail = (Attribute)eResolveProxy(oldTail);
      if (tail != oldTail)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyFeatureListPackage.DOT_EXPRESSION__TAIL, oldTail, tail));
      }
    }
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetTail()
  {
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTail(Attribute newTail)
  {
    Attribute oldTail = tail;
    tail = newTail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyFeatureListPackage.DOT_EXPRESSION__TAIL, oldTail, tail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyFeatureListPackage.DOT_EXPRESSION__REF:
        return basicSetRef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyFeatureListPackage.DOT_EXPRESSION__REF:
        return getRef();
      case MyFeatureListPackage.DOT_EXPRESSION__TAIL:
        if (resolve) return getTail();
        return basicGetTail();
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
      case MyFeatureListPackage.DOT_EXPRESSION__REF:
        setRef((Ref)newValue);
        return;
      case MyFeatureListPackage.DOT_EXPRESSION__TAIL:
        setTail((Attribute)newValue);
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
      case MyFeatureListPackage.DOT_EXPRESSION__REF:
        setRef((Ref)null);
        return;
      case MyFeatureListPackage.DOT_EXPRESSION__TAIL:
        setTail((Attribute)null);
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
      case MyFeatureListPackage.DOT_EXPRESSION__REF:
        return ref != null;
      case MyFeatureListPackage.DOT_EXPRESSION__TAIL:
        return tail != null;
    }
    return super.eIsSet(featureID);
  }

} //DotExpressionImpl
