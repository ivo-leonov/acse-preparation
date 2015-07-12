/**
 */
package com.bundleDsl.bundleDsl.impl;

import com.bundleDsl.bundleDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleDslFactoryImpl extends EFactoryImpl implements BundleDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BundleDslFactory init()
  {
    try
    {
      BundleDslFactory theBundleDslFactory = (BundleDslFactory)EPackage.Registry.INSTANCE.getEFactory(BundleDslPackage.eNS_URI);
      if (theBundleDslFactory != null)
      {
        return theBundleDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BundleDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BundleDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BundleDslPackage.MODEL: return createModel();
      case BundleDslPackage.BUNDLE: return createBundle();
      case BundleDslPackage.CAR: return createCar();
      case BundleDslPackage.EXTRA: return createExtra();
      case BundleDslPackage.SERVICE: return createService();
      case BundleDslPackage.CAR_EXTRA: return createCarExtra();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bundle createBundle()
  {
    BundleImpl bundle = new BundleImpl();
    return bundle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Car createCar()
  {
    CarImpl car = new CarImpl();
    return car;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extra createExtra()
  {
    ExtraImpl extra = new ExtraImpl();
    return extra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CarExtra createCarExtra()
  {
    CarExtraImpl carExtra = new CarExtraImpl();
    return carExtra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BundleDslPackage getBundleDslPackage()
  {
    return (BundleDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BundleDslPackage getPackage()
  {
    return BundleDslPackage.eINSTANCE;
  }

} //BundleDslFactoryImpl
