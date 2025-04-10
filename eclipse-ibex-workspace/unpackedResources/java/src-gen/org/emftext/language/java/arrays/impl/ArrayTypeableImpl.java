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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.arrays.ArrayDimension;
import org.emftext.language.java.arrays.ArrayTypeable;
import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.commons.impl.CommentableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Typeable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.arrays.impl.ArrayTypeableImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.emftext.language.java.arrays.impl.ArrayTypeableImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArrayTypeableImpl extends CommentableImpl implements ArrayTypeable
{
  /**
   * The cached value of the '{@link #getArrayDimensionsBefore() <em>Array Dimensions Before</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayDimensionsBefore()
   * @generated
   * @ordered
   */
  protected EList<ArrayDimension> arrayDimensionsBefore;

  /**
   * The cached value of the '{@link #getArrayDimensionsAfter() <em>Array Dimensions After</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayDimensionsAfter()
   * @generated
   * @ordered
   */
  protected EList<ArrayDimension> arrayDimensionsAfter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayTypeableImpl()
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
    return ArraysPackage.Literals.ARRAY_TYPEABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayDimension> getArrayDimensionsBefore()
  {
    if (arrayDimensionsBefore == null)
    {
      arrayDimensionsBefore = new EObjectContainmentEList.Resolving<ArrayDimension>(ArrayDimension.class, this, ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE);
    }
    return arrayDimensionsBefore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayDimension> getArrayDimensionsAfter()
  {
    if (arrayDimensionsAfter == null)
    {
      arrayDimensionsAfter = new EObjectContainmentEList.Resolving<ArrayDimension>(ArrayDimension.class, this, ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER);
    }
    return arrayDimensionsAfter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getArrayDimension()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
        return ((InternalEList<?>)getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
        return ((InternalEList<?>)getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
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
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
        return getArrayDimensionsBefore();
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
        return getArrayDimensionsAfter();
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
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
        getArrayDimensionsBefore().clear();
        getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>)newValue);
        return;
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
        getArrayDimensionsAfter().clear();
        getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>)newValue);
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
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
        getArrayDimensionsBefore().clear();
        return;
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
        getArrayDimensionsAfter().clear();
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
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE:
        return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
      case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER:
        return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrayTypeableImpl
