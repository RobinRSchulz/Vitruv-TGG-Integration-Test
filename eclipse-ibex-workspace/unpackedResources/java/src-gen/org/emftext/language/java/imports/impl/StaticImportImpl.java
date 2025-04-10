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
package org.emftext.language.java.imports.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.imports.ImportsPackage;
import org.emftext.language.java.imports.StaticImport;

import org.emftext.language.java.modifiers.Static;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.imports.impl.StaticImportImpl#getStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StaticImportImpl extends ImportImpl implements StaticImport
{
  /**
   * The cached value of the '{@link #getStatic() <em>Static</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatic()
   * @generated
   * @ordered
   */
  protected Static static_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticImportImpl()
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
    return ImportsPackage.Literals.STATIC_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Static getStatic()
  {
    if (static_ != null && static_.eIsProxy())
    {
      InternalEObject oldStatic = (InternalEObject)static_;
      static_ = (Static)eResolveProxy(oldStatic);
      if (static_ != oldStatic)
      {
        InternalEObject newStatic = (InternalEObject)static_;
        NotificationChain msgs = oldStatic.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.STATIC_IMPORT__STATIC, null, null);
        if (newStatic.eInternalContainer() == null)
        {
          msgs = newStatic.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.STATIC_IMPORT__STATIC, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImportsPackage.STATIC_IMPORT__STATIC, oldStatic, static_));
      }
    }
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Static basicGetStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatic(Static newStatic, NotificationChain msgs)
  {
    Static oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImportsPackage.STATIC_IMPORT__STATIC, oldStatic, newStatic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(Static newStatic)
  {
    if (newStatic != static_)
    {
      NotificationChain msgs = null;
      if (static_ != null)
        msgs = ((InternalEObject)static_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.STATIC_IMPORT__STATIC, null, msgs);
      if (newStatic != null)
        msgs = ((InternalEObject)newStatic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.STATIC_IMPORT__STATIC, null, msgs);
      msgs = basicSetStatic(newStatic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.STATIC_IMPORT__STATIC, newStatic, newStatic));
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
      case ImportsPackage.STATIC_IMPORT__STATIC:
        return basicSetStatic(null, msgs);
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
      case ImportsPackage.STATIC_IMPORT__STATIC:
        if (resolve) return getStatic();
        return basicGetStatic();
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
      case ImportsPackage.STATIC_IMPORT__STATIC:
        setStatic((Static)newValue);
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
      case ImportsPackage.STATIC_IMPORT__STATIC:
        setStatic((Static)null);
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
      case ImportsPackage.STATIC_IMPORT__STATIC:
        return static_ != null;
    }
    return super.eIsSet(featureID);
  }

} //StaticImportImpl
