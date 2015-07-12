/**
 */
package com.bundleDsl.bundleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.Car#getName <em>Name</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.Car#getType <em>Type</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.Car#isUsed <em>Used</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.Car#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends EObject
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
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCar_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.Car#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCar_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.Car#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Used</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Used</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Used</em>' attribute.
   * @see #setUsed(boolean)
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCar_Used()
   * @model
   * @generated
   */
  boolean isUsed();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.Car#isUsed <em>Used</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Used</em>' attribute.
   * @see #isUsed()
   * @generated
   */
  void setUsed(boolean value);

  /**
   * Returns the value of the '<em><b>Extras</b></em>' containment reference list.
   * The list contents are of type {@link com.bundleDsl.bundleDsl.Extra}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extras</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extras</em>' containment reference list.
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getCar_Extras()
   * @model containment="true"
   * @generated
   */
  EList<Extra> getExtras();

} // Car
