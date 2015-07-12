/**
 */
package com.bundleDsl.bundleDsl.impl;

import com.bundleDsl.bundleDsl.BundleDslPackage;
import com.bundleDsl.bundleDsl.Car;
import com.bundleDsl.bundleDsl.Extra;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bundleDsl.bundleDsl.impl.CarImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.impl.CarImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.impl.CarImpl#isUsed <em>Used</em>}</li>
 *   <li>{@link com.bundleDsl.bundleDsl.impl.CarImpl#getExtras <em>Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarImpl extends MinimalEObjectImpl.Container implements Car
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isUsed() <em>Used</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUsed()
   * @generated
   * @ordered
   */
  protected static final boolean USED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUsed() <em>Used</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUsed()
   * @generated
   * @ordered
   */
  protected boolean used = USED_EDEFAULT;

  /**
   * The cached value of the '{@link #getExtras() <em>Extras</em>}' containment reference list.
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
  protected CarImpl()
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
    return BundleDslPackage.Literals.CAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BundleDslPackage.CAR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BundleDslPackage.CAR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUsed()
  {
    return used;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsed(boolean newUsed)
  {
    boolean oldUsed = used;
    used = newUsed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BundleDslPackage.CAR__USED, oldUsed, used));
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
      extras = new EObjectContainmentEList<Extra>(Extra.class, this, BundleDslPackage.CAR__EXTRAS);
    }
    return extras;
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
      case BundleDslPackage.CAR__EXTRAS:
        return ((InternalEList<?>)getExtras()).basicRemove(otherEnd, msgs);
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
      case BundleDslPackage.CAR__NAME:
        return getName();
      case BundleDslPackage.CAR__TYPE:
        return getType();
      case BundleDslPackage.CAR__USED:
        return isUsed();
      case BundleDslPackage.CAR__EXTRAS:
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
      case BundleDslPackage.CAR__NAME:
        setName((String)newValue);
        return;
      case BundleDslPackage.CAR__TYPE:
        setType((String)newValue);
        return;
      case BundleDslPackage.CAR__USED:
        setUsed((Boolean)newValue);
        return;
      case BundleDslPackage.CAR__EXTRAS:
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
      case BundleDslPackage.CAR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BundleDslPackage.CAR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case BundleDslPackage.CAR__USED:
        setUsed(USED_EDEFAULT);
        return;
      case BundleDslPackage.CAR__EXTRAS:
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
      case BundleDslPackage.CAR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BundleDslPackage.CAR__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case BundleDslPackage.CAR__USED:
        return used != USED_EDEFAULT;
      case BundleDslPackage.CAR__EXTRAS:
        return extras != null && !extras.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", used: ");
    result.append(used);
    result.append(')');
    return result.toString();
  }

} //CarImpl
