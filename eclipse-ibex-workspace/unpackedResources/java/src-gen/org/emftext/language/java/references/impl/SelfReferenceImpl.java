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

import org.emftext.language.java.literals.Self;

import org.emftext.language.java.references.ReferencesPackage;
import org.emftext.language.java.references.SelfReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.impl.SelfReferenceImpl#getSelf <em>Self</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfReferenceImpl extends ReferenceImpl implements SelfReference
{
  /**
   * The cached value of the '{@link #getSelf() <em>Self</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelf()
   * @generated
   * @ordered
   */
  protected Self self;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfReferenceImpl()
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
    return ReferencesPackage.Literals.SELF_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Self getSelf()
  {
    if (self != null && self.eIsProxy())
    {
      InternalEObject oldSelf = (InternalEObject)self;
      self = (Self)eResolveProxy(oldSelf);
      if (self != oldSelf)
      {
        InternalEObject newSelf = (InternalEObject)self;
        NotificationChain msgs = oldSelf.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.SELF_REFERENCE__SELF, null, null);
        if (newSelf.eInternalContainer() == null)
        {
          msgs = newSelf.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.SELF_REFERENCE__SELF, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencesPackage.SELF_REFERENCE__SELF, oldSelf, self));
      }
    }
    return self;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Self basicGetSelf()
  {
    return self;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelf(Self newSelf, NotificationChain msgs)
  {
    Self oldSelf = self;
    self = newSelf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReferencesPackage.SELF_REFERENCE__SELF, oldSelf, newSelf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelf(Self newSelf)
  {
    if (newSelf != self)
    {
      NotificationChain msgs = null;
      if (self != null)
        msgs = ((InternalEObject)self).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.SELF_REFERENCE__SELF, null, msgs);
      if (newSelf != null)
        msgs = ((InternalEObject)newSelf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReferencesPackage.SELF_REFERENCE__SELF, null, msgs);
      msgs = basicSetSelf(newSelf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.SELF_REFERENCE__SELF, newSelf, newSelf));
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
      case ReferencesPackage.SELF_REFERENCE__SELF:
        return basicSetSelf(null, msgs);
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
      case ReferencesPackage.SELF_REFERENCE__SELF:
        if (resolve) return getSelf();
        return basicGetSelf();
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
      case ReferencesPackage.SELF_REFERENCE__SELF:
        setSelf((Self)newValue);
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
      case ReferencesPackage.SELF_REFERENCE__SELF:
        setSelf((Self)null);
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
      case ReferencesPackage.SELF_REFERENCE__SELF:
        return self != null;
    }
    return super.eIsSet(featureID);
  }

} //SelfReferenceImpl
