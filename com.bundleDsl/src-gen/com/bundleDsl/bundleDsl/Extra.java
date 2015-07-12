/**
 */
package com.bundleDsl.bundleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.Extra#getName <em>Name</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.Extra#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bundleDsl.bundleDsl.BundleDslPackage#getExtra()
 * @model
 * @generated
 */
public interface Extra extends EObject
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
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getExtra_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.Extra#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getExtra_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.Extra#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Extra
