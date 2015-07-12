/**
 */
package com.bundleDsl.bundleDsl.impl;

import com.bundleDsl.bundleDsl.BundleDslPackage;
import com.bundleDsl.bundleDsl.Car;
import com.bundleDsl.bundleDsl.CarExtra;
import com.bundleDsl.bundleDsl.Extra;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car Extra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.impl.CarExtraImpl#getCar <em>Car</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.impl.CarExtraImpl#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarExtraImpl extends MinimalEObjectImpl.Container implements CarExtra
{
  /**
   * The cached value of the '{@link #getCar() <em>Car</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCar()
   * @generated
   * @ordered
   */
  protected Car car;

  /**
   * The cached value of the '{@link #getExtras() <em>Extras</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtras()
   * @generated
   * @ordered
   */
  protected EList<Extra> extras;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CarExtraImpl()
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
    return BundleDslPackage.Literals.CAR_EXTRA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Car getCar()
  {
    if (car != null && car.eIsProxy())
    {
      InternalEObject oldCar = (InternalEObject)car;
      car = (Car)eResolveProxy(oldCar);
      if (car != oldCar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BundleDslPackage.CAR_EXTRA__CAR, oldCar, car));
      }
    }
    return car;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Car basicGetCar()
  {
    return car;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCar(Car newCar)
  {
    Car oldCar = car;
    car = newCar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BundleDslPackage.CAR_EXTRA__CAR, oldCar, car));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Extra> getExtras()
  {
    if (extras == null)
    {
      extras = new EObjectResolvingEList<Extra>(Extra.class, this, BundleDslPackage.CAR_EXTRA__EXTRAS);
    }
    return extras;
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
      case BundleDslPackage.CAR_EXTRA__CAR:
        if (resolve) return getCar();
        return basicGetCar();
      case BundleDslPackage.CAR_EXTRA__EXTRAS:
        return getExtras();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BundleDslPackage.CAR_EXTRA__CAR:
        setCar((Car)newValue);
        return;
      case BundleDslPackage.CAR_EXTRA__EXTRAS:
        getExtras().clear();
        getExtras().addAll((Collection<? extends Extra>)newValue);
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
      case BundleDslPackage.CAR_EXTRA__CAR:
        setCar((Car)null);
        return;
      case BundleDslPackage.CAR_EXTRA__EXTRAS:
        getExtras().clear();
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
      case BundleDslPackage.CAR_EXTRA__CAR:
        return car != null;
      case BundleDslPackage.CAR_EXTRA__EXTRAS:
        return extras != null && !extras.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CarExtraImpl
