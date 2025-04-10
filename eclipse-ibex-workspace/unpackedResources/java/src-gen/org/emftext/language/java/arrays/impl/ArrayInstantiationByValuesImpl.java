/**
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 *  
 */
package org.emftext.language.java.arrays.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.arrays.ArrayInitializer;
import org.emftext.language.java.arrays.ArrayInstantiationByValues;
import org.emftext.language.java.arrays.ArraysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Instantiation By Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesImpl#getArrayInitializer <em>Array Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArrayInstantiationByValuesImpl extends ArrayInstantiationImpl implements ArrayInstantiationByValues
{
  /**
   * The cached value of the '{@link #getArrayInitializer() <em>Array Initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayInitializer()
   * @generated
   * @ordered
   */
  protected ArrayInitializer arrayInitializer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayInstantiationByValuesImpl()
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
    return ArraysPackage.Literals.ARRAY_INSTANTIATION_BY_VALUES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInitializer getArrayInitializer()
  {
    if (arrayInitializer != null && arrayInitializer.eIsProxy())
    {
      InternalEObject oldArrayInitializer = (InternalEObject)arrayInitializer;
      arrayInitializer = (ArrayInitializer)eResolveProxy(oldArrayInitializer);
      if (arrayInitializer != oldArrayInitializer)
      {
        InternalEObject newArrayInitializer = (InternalEObject)arrayInitializer;
        NotificationChain msgs = oldArrayInitializer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, null, null);
        if (newArrayInitializer.eInternalContainer() == null)
        {
          msgs = newArrayInitializer.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, oldArrayInitializer, arrayInitializer));
      }
    }
    return arrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInitializer basicGetArrayInitializer()
  {
    return arrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayInitializer(ArrayInitializer newArrayInitializer, NotificationChain msgs)
  {
    ArrayInitializer oldArrayInitializer = arrayInitializer;
    arrayInitializer = newArrayInitializer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, oldArrayInitializer, newArrayInitializer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayInitializer(ArrayInitializer newArrayInitializer)
  {
    if (newArrayInitializer != arrayInitializer)
    {
      NotificationChain msgs = null;
      if (arrayInitializer != null)
        msgs = ((InternalEObject)arrayInitializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, null, msgs);
      if (newArrayInitializer != null)
        msgs = ((InternalEObject)newArrayInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, null, msgs);
      msgs = basicSetArrayInitializer(newArrayInitializer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER, newArrayInitializer, newArrayInitializer));
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
      case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
        return basicSetArrayInitializer(null, msgs);
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
      case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
        if (resolve) return getArrayInitializer();
        return basicGetArrayInitializer();
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
      case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
        setArrayInitializer((ArrayInitializer)newValue);
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
      case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
        setArrayInitializer((ArrayInitializer)null);
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
      case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER:
        return arrayInitializer != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayInstantiationByValuesImpl
