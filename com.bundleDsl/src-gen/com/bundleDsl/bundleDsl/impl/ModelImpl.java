/**
 */
package com.bundleDsl.bundleDsl.impl;

import com.bundleDsl.bundleDsl.Bundle;
import com.bundleDsl.bundleDsl.BundleDslPackage;
import com.bundleDsl.bundleDsl.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.impl.ModelImpl#getBundle <em>Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getBundle() <em>Bundle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBundle()
   * @generated
   * @ordered
   */
  protected Bundle bundle;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return BundleDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bundle getBundle()
  {
    return bundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBundle(Bundle newBundle, NotificationChain msgs)
  {
    Bundle oldBundle = bundle;
    bundle = newBundle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BundleDslPackage.MODEL__BUNDLE, oldBundle, newBundle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBundle(Bundle newBundle)
  {
    if (newBundle != bundle)
    {
      NotificationChain msgs = null;
      if (bundle != null)
        msgs = ((InternalEObject)bundle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BundleDslPackage.MODEL__BUNDLE, null, msgs);
      if (newBundle != null)
        msgs = ((InternalEObject)newBundle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BundleDslPackage.MODEL__BUNDLE, null, msgs);
      msgs = basicSetBundle(newBundle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BundleDslPackage.MODEL__BUNDLE, newBundle, newBundle));
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
      case BundleDslPackage.MODEL__BUNDLE:
        return basicSetBundle(null, msgs);
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
      case BundleDslPackage.MODEL__BUNDLE:
        return getBundle();
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
      case BundleDslPackage.MODEL__BUNDLE:
        setBundle((Bundle)newValue);
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
      case BundleDslPackage.MODEL__BUNDLE:
        setBundle((Bundle)null);
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
      case BundleDslPackage.MODEL__BUNDLE:
        return bundle != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
