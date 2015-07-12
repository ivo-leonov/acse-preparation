/**
 */
package com.bundleDsl.bundleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car Extra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.CarExtra#getCar <em>Car</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.CarExtra#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCarExtra()
 * @model
 * @generated
 */
public interface CarExtra extends EObject
{
  /**
   * Returns the value of the '<em><b>Car</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Car</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Car</em>' reference.
   * @see #setCar(Car)
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCarExtra_Car()
   * @model
   * @generated
   */
  Car getCar();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.CarExtra#getCar <em>Car</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Car</em>' reference.
   * @see #getCar()
   * @generated
   */
  void setCar(Car value);

  /**
   * Returns the value of the '<em><b>Extras</b></em>' reference list.
   * The list contents are of type {@link com.bundleDsl.bundleDsl.Extra}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extras</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extras</em>' reference list.
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCarExtra_Extras()
   * @model
   * @generated
   */
  EList<Extra> getExtras();

} // CarExtra
