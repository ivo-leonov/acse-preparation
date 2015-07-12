/**
 */
package com.bundleDsl.bundleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.Service#getName <em>Name</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.Service#getCarExtras <em>Car Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bundleDsl.bundleDsl.BundleDslPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Car Extras</b></em>' containment reference list.
   * The list contents are of type {@link com.bundleDsl.bundleDsl.CarExtra}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Car Extras</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Car Extras</em>' containment reference list.
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getService_CarExtras()
   * @model containment="true"
   * @generated
   */
  EList<CarExtra> getCarExtras();

} // Service
