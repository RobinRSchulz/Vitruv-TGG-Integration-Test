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
package org.emftext.language.java.references.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.references.PrimitiveTypeReference;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.types.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.impl.PrimitiveTypeReferenceImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeReferenceImpl extends ReferenceImpl implements PrimitiveTypeReference
{
  /**
   * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected PrimitiveType primitiveType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveTypeReferenceImpl()
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
    return ReferencesPackage.Literals.PRIMITIVE_TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType getPrimitiveType()
  {
    if (primitiveType != null && primitiveType.eIsProxy())
    {
      InternalEObject oldPrimitiveType = (InternalEObject)primitiveType;
      primitiveType = (PrimitiveType)eResolveProxy(oldPrimitiveType);
      if (primitiveType != oldPrimitiveType)
      {
        InternalEObject newPrimitiveType = (InternalEObject)primitiveType;
        NotificationChain msgs = oldPrimitiveType.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, null, null);
        if (newPrimitiveType.eInternalContainer() == null)
        {
          msgs = newPrimitiveType.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
      }
    }
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType basicGetPrimitiveType()
  {
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimitiveType(PrimitiveType newPrimitiveType, NotificationChain msgs)
  {
    PrimitiveType oldPrimitiveType = primitiveType;
    primitiveType = newPrimitiveType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, oldPrimitiveType, newPrimitiveType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitiveType(PrimitiveType newPrimitiveType)
  {
    if (newPrimitiveType != primitiveType)
    {
      NotificationChain msgs = null;
      if (primitiveType != null)
        msgs = ((InternalEObject)primitiveType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, null, msgs);
      if (newPrimitiveType != null)
        msgs = ((InternalEObject)newPrimitiveType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, null, msgs);
      msgs = basicSetPrimitiveType(newPrimitiveType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE, newPrimitiveType, newPrimitiveType));
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
      case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
        return basicSetPrimitiveType(null, msgs);
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
      case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
        if (resolve) return getPrimitiveType();
        return basicGetPrimitiveType();
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
      case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
        setPrimitiveType((PrimitiveType)newValue);
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
      case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
        setPrimitiveType((PrimitiveType)null);
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
      case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE:
        return primitiveType != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimitiveTypeReferenceImpl
