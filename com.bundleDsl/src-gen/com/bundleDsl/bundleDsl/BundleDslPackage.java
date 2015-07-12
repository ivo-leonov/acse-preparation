/**
 */
package com.bundleDsl.bundleDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.bundleDsl.bundleDsl.BundleDslFactory
 * @model kind="package"
 * @generated
 */
public interface BundleDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bundleDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bundleDsl.com/BundleDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bundleDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BundleDslPackage eINSTANCE = com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.bundleDsl.bundleDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bundleDsl.bundleDsl.impl.ModelImpl
   * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Bundle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BUNDLE = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.bundleDsl.bundleDsl.impl.BundleImpl <em>Bundle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bundleDsl.bundleDsl.impl.BundleImpl
   * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getBundle()
   * @generated
   */
  int BUNDLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Cars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__CARS = 1;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE__SERVICES = 2;

  /**
   * The number of structural features of the '<em>Bundle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUNDLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.bundleDsl.bundleDsl.impl.CarImpl <em>Car</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bundleDsl.bundleDsl.impl.CarImpl
   * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getCar()
   * @generated
   */
  int CAR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__TYPE = 1;

  /**
   * The feature id for the '<em><b>Used</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__USED = 2;

  /**
   * The feature id for the '<em><b>Extras</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR__EXTRAS = 3;

  /**
   * The number of structural features of the '<em>Car</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.bundleDsl.bundleDsl.impl.ExtraImpl <em>Extra</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bundleDsl.bundleDsl.impl.ExtraImpl
   * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getExtra()
   * @generated
   */
  int EXTRA = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRA__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRA__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Extra</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.bundleDsl.bundleDsl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bundleDsl.bundleDsl.impl.ServiceImpl
   * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getService()
   * @generated
   */
  int SERVICE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Car Extras</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CAR_EXTRAS = 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.bundleDsl.bundleDsl.impl.CarExtraImpl <em>Car Extra</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bundleDsl.bundleDsl.impl.CarExtraImpl
   * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getCarExtra()
   * @generated
   */
  int CAR_EXTRA = 5;

  /**
   * The feature id for the '<em><b>Car</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR_EXTRA__CAR = 0;

  /**
   * The feature id for the '<em><b>Extras</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR_EXTRA__EXTRAS = 1;

  /**
   * The number of structural features of the '<em>Car Extra</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAR_EXTRA_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.bundleDsl.bundleDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.bundleDsl.bundleDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link com.bundleDsl.bundleDsl.Model#getBundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bundle</em>'.
   * @see com.bundleDsl.bundleDsl.Model#getBundle()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Bundle();

  /**
   * Returns the meta object for class '{@link com.bundleDsl.bundleDsl.Bundle <em>Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bundle</em>'.
   * @see com.bundleDsl.bundleDsl.Bundle
   * @generated
   */
  EClass getBundle();

  /**
   * Returns the meta object for the attribute '{@link com.bundleDsl.bundleDsl.Bundle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.bundleDsl.bundleDsl.Bundle#getName()
   * @see #getBundle()
   * @generated
   */
  EAttribute getBundle_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.bundleDsl.bundleDsl.Bundle#getCars <em>Cars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cars</em>'.
   * @see com.bundleDsl.bundleDsl.Bundle#getCars()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Cars();

  /**
   * Returns the meta object for the containment reference list '{@link com.bundleDsl.bundleDsl.Bundle#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see com.bundleDsl.bundleDsl.Bundle#getServices()
   * @see #getBundle()
   * @generated
   */
  EReference getBundle_Services();

  /**
   * Returns the meta object for class '{@link com.bundleDsl.bundleDsl.Car <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Car</em>'.
   * @see com.bundleDsl.bundleDsl.Car
   * @generated
   */
  EClass getCar();

  /**
   * Returns the meta object for the attribute '{@link com.bundleDsl.bundleDsl.Car#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.bundleDsl.bundleDsl.Car#getName()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Name();

  /**
   * Returns the meta object for the attribute '{@link com.bundleDsl.bundleDsl.Car#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.bundleDsl.bundleDsl.Car#getType()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Type();

  /**
   * Returns the meta object for the attribute '{@link com.bundleDsl.bundleDsl.Car#isUsed <em>Used</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used</em>'.
   * @see com.bundleDsl.bundleDsl.Car#isUsed()
   * @see #getCar()
   * @generated
   */
  EAttribute getCar_Used();

  /**
   * Returns the meta object for the containment reference list '{@link com.bundleDsl.bundleDsl.Car#getExtras <em>Extras</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extras</em>'.
   * @see com.bundleDsl.bundleDsl.Car#getExtras()
   * @see #getCar()
   * @generated
   */
  EReference getCar_Extras();

  /**
   * Returns the meta object for class '{@link com.bundleDsl.bundleDsl.Extra <em>Extra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extra</em>'.
   * @see com.bundleDsl.bundleDsl.Extra
   * @generated
   */
  EClass getExtra();

  /**
   * Returns the meta object for the attribute '{@link com.bundleDsl.bundleDsl.Extra#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.bundleDsl.bundleDsl.Extra#getName()
   * @see #getExtra()
   * @generated
   */
  EAttribute getExtra_Name();

  /**
   * Returns the meta object for the attribute '{@link com.bundleDsl.bundleDsl.Extra#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.bundleDsl.bundleDsl.Extra#getDescription()
   * @see #getExtra()
   * @generated
   */
  EAttribute getExtra_Description();

  /**
   * Returns the meta object for class '{@link com.bundleDsl.bundleDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see com.bundleDsl.bundleDsl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link com.bundleDsl.bundleDsl.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.bundleDsl.bundleDsl.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.bundleDsl.bundleDsl.Service#getCarExtras <em>Car Extras</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Car Extras</em>'.
   * @see com.bundleDsl.bundleDsl.Service#getCarExtras()
   * @see #getService()
   * @generated
   */
  EReference getService_CarExtras();

  /**
   * Returns the meta object for class '{@link com.bundleDsl.bundleDsl.CarExtra <em>Car Extra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Car Extra</em>'.
   * @see com.bundleDsl.bundleDsl.CarExtra
   * @generated
   */
  EClass getCarExtra();

  /**
   * Returns the meta object for the reference '{@link com.bundleDsl.bundleDsl.CarExtra#getCar <em>Car</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Car</em>'.
   * @see com.bundleDsl.bundleDsl.CarExtra#getCar()
   * @see #getCarExtra()
   * @generated
   */
  EReference getCarExtra_Car();

  /**
   * Returns the meta object for the reference list '{@link com.bundleDsl.bundleDsl.CarExtra#getExtras <em>Extras</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Extras</em>'.
   * @see com.bundleDsl.bundleDsl.CarExtra#getExtras()
   * @see #getCarExtra()
   * @generated
   */
  EReference getCarExtra_Extras();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BundleDslFactory getBundleDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.bundleDsl.bundleDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bundleDsl.bundleDsl.impl.ModelImpl
     * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Bundle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BUNDLE = eINSTANCE.getModel_Bundle();

    /**
     * The meta object literal for the '{@link com.bundleDsl.bundleDsl.impl.BundleImpl <em>Bundle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bundleDsl.bundleDsl.impl.BundleImpl
     * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getBundle()
     * @generated
     */
    EClass BUNDLE = eINSTANCE.getBundle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUNDLE__NAME = eINSTANCE.getBundle_Name();

    /**
     * The meta object literal for the '<em><b>Cars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__CARS = eINSTANCE.getBundle_Cars();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUNDLE__SERVICES = eINSTANCE.getBundle_Services();

    /**
     * The meta object literal for the '{@link com.bundleDsl.bundleDsl.impl.CarImpl <em>Car</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bundleDsl.bundleDsl.impl.CarImpl
     * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getCar()
     * @generated
     */
    EClass CAR = eINSTANCE.getCar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__NAME = eINSTANCE.getCar_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__TYPE = eINSTANCE.getCar_Type();

    /**
     * The meta object literal for the '<em><b>Used</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAR__USED = eINSTANCE.getCar_Used();

    /**
     * The meta object literal for the '<em><b>Extras</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAR__EXTRAS = eINSTANCE.getCar_Extras();

    /**
     * The meta object literal for the '{@link com.bundleDsl.bundleDsl.impl.ExtraImpl <em>Extra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bundleDsl.bundleDsl.impl.ExtraImpl
     * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getExtra()
     * @generated
     */
    EClass EXTRA = eINSTANCE.getExtra();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTRA__NAME = eINSTANCE.getExtra_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTRA__DESCRIPTION = eINSTANCE.getExtra_Description();

    /**
     * The meta object literal for the '{@link com.bundleDsl.bundleDsl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bundleDsl.bundleDsl.impl.ServiceImpl
     * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Car Extras</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__CAR_EXTRAS = eINSTANCE.getService_CarExtras();

    /**
     * The meta object literal for the '{@link com.bundleDsl.bundleDsl.impl.CarExtraImpl <em>Car Extra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bundleDsl.bundleDsl.impl.CarExtraImpl
     * @see com.bundleDsl.bundleDsl.impl.BundleDslPackageImpl#getCarExtra()
     * @generated
     */
    EClass CAR_EXTRA = eINSTANCE.getCarExtra();

    /**
     * The meta object literal for the '<em><b>Car</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAR_EXTRA__CAR = eINSTANCE.getCarExtra_Car();

    /**
     * The meta object literal for the '<em><b>Extras</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAR_EXTRA__EXTRAS = eINSTANCE.getCarExtra_Extras();

  }

} //BundleDslPackage
