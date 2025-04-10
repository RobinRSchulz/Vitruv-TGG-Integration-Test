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
package org.emftext.language.java.instantiations.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.instantiations.ExplicitConstructorCall;
import org.emftext.language.java.instantiations.InstantiationsPackage;

import org.emftext.language.java.literals.Self;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.instantiations.impl.ExplicitConstructorCallImpl#getCallTarget <em>Call Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExplicitConstructorCallImpl extends InstantiationImpl implements ExplicitConstructorCall
{
  /**
   * The cached value of the '{@link #getCallTarget() <em>Call Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallTarget()
   * @generated
   * @ordered
   */
  protected Self callTarget;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExplicitConstructorCallImpl()
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
    return InstantiationsPackage.Literals.EXPLICIT_CONSTRUCTOR_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Self getCallTarget()
  {
    if (callTarget != null && callTarget.eIsProxy())
    {
      InternalEObject oldCallTarget = (InternalEObject)callTarget;
      callTarget = (Self)eResolveProxy(oldCallTarget);
      if (callTarget != oldCallTarget)
      {
        InternalEObject newCallTarget = (InternalEObject)callTarget;
        NotificationChain msgs = oldCallTarget.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null, null);
        if (newCallTarget.eInternalContainer() == null)
        {
          msgs = newCallTarget.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, oldCallTarget, callTarget));
      }
    }
    return callTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Self basicGetCallTarget()
  {
    return callTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCallTarget(Self newCallTarget, NotificationChain msgs)
  {
    Self oldCallTarget = callTarget;
    callTarget = newCallTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, oldCallTarget, newCallTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallTarget(Self newCallTarget)
  {
    if (newCallTarget != callTarget)
    {
      NotificationChain msgs = null;
      if (callTarget != null)
        msgs = ((InternalEObject)callTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null, msgs);
      if (newCallTarget != null)
        msgs = ((InternalEObject)newCallTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, null, msgs);
      msgs = basicSetCallTarget(newCallTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET, newCallTarget, newCallTarget));
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
      case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
        return basicSetCallTarget(null, msgs);
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
      case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
        if (resolve) return getCallTarget();
        return basicGetCallTarget();
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
      case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
        setCallTarget((Self)newValue);
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
      case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
        setCallTarget((Self)null);
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
      case InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET:
        return callTarget != null;
    }
    return super.eIsSet(featureID);
  }

} //ExplicitConstructorCallImpl
