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
package org.emftext.language.java.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.statements.StatementsPackage;
import org.emftext.language.java.statements.Throw;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.impl.ThrowImpl#getThrowable <em>Throwable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThrowImpl extends StatementImpl implements Throw
{
  /**
   * The cached value of the '{@link #getThrowable() <em>Throwable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrowable()
   * @generated
   * @ordered
   */
  protected Expression throwable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThrowImpl()
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
    return StatementsPackage.Literals.THROW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThrowable()
  {
    if (throwable != null && throwable.eIsProxy())
    {
      InternalEObject oldThrowable = (InternalEObject)throwable;
      throwable = (Expression)eResolveProxy(oldThrowable);
      if (throwable != oldThrowable)
      {
        InternalEObject newThrowable = (InternalEObject)throwable;
        NotificationChain msgs = oldThrowable.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.THROW__THROWABLE, null, null);
        if (newThrowable.eInternalContainer() == null)
        {
          msgs = newThrowable.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.THROW__THROWABLE, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.THROW__THROWABLE, oldThrowable, throwable));
      }
    }
    return throwable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetThrowable()
  {
    return throwable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrowable(Expression newThrowable, NotificationChain msgs)
  {
    Expression oldThrowable = throwable;
    throwable = newThrowable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.THROW__THROWABLE, oldThrowable, newThrowable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrowable(Expression newThrowable)
  {
    if (newThrowable != throwable)
    {
      NotificationChain msgs = null;
      if (throwable != null)
        msgs = ((InternalEObject)throwable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.THROW__THROWABLE, null, msgs);
      if (newThrowable != null)
        msgs = ((InternalEObject)newThrowable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.THROW__THROWABLE, null, msgs);
      msgs = basicSetThrowable(newThrowable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.THROW__THROWABLE, newThrowable, newThrowable));
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
      case StatementsPackage.THROW__THROWABLE:
        return basicSetThrowable(null, msgs);
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
      case StatementsPackage.THROW__THROWABLE:
        if (resolve) return getThrowable();
        return basicGetThrowable();
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
      case StatementsPackage.THROW__THROWABLE:
        setThrowable((Expression)newValue);
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
      case StatementsPackage.THROW__THROWABLE:
        setThrowable((Expression)null);
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
      case StatementsPackage.THROW__THROWABLE:
        return throwable != null;
    }
    return super.eIsSet(featureID);
  }

} //ThrowImpl
