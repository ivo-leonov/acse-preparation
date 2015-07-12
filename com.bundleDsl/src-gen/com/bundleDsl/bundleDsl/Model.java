/**
 */
package com.bundleDsl.bundleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.Model#getBundle <em>Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bundleDsl.bundleDsl.BundleDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Bundle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle</em>' containment reference.
   * @see #setBundle(Bundle)
   * @see com.bundleDsl.bundleDsl.BundleDslPackage#getModel_Bundle()
   * @model containment="true"
   * @generated
   */
  Bundle getBundle();

  /**
   * Sets the value of the '{@link com.bundleDsl.bundleDsl.Model#getBundle <em>Bundle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bundle</em>' containment reference.
   * @see #getBundle()
   * @generated
   */
  void setBundle(Bundle value);

} // Model
