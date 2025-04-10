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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;
import org.emftext.language.java.statements.StatementsPackage;
import org.emftext.language.java.statements.SynchronizedBlock;

import org.emftext.language.java.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronized Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.impl.SynchronizedBlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.impl.SynchronizedBlockImpl#getLockProvider <em>Lock Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizedBlockImpl extends StatementImpl implements SynchronizedBlock
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getLockProvider() <em>Lock Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLockProvider()
   * @generated
   * @ordered
   */
  protected Expression lockProvider;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SynchronizedBlockImpl()
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
    return StatementsPackage.Literals.SYNCHRONIZED_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList.Resolving<Statement>(Statement.class, this, StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLockProvider()
  {
    if (lockProvider != null && lockProvider.eIsProxy())
    {
      InternalEObject oldLockProvider = (InternalEObject)lockProvider;
      lockProvider = (Expression)eResolveProxy(oldLockProvider);
      if (lockProvider != oldLockProvider)
      {
        InternalEObject newLockProvider = (InternalEObject)lockProvider;
        NotificationChain msgs = oldLockProvider.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, null, null);
        if (newLockProvider.eInternalContainer() == null)
        {
          msgs = newLockProvider.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, oldLockProvider, lockProvider));
      }
    }
    return lockProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetLockProvider()
  {
    return lockProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLockProvider(Expression newLockProvider, NotificationChain msgs)
  {
    Expression oldLockProvider = lockProvider;
    lockProvider = newLockProvider;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, oldLockProvider, newLockProvider);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLockProvider(Expression newLockProvider)
  {
    if (newLockProvider != lockProvider)
    {
      NotificationChain msgs = null;
      if (lockProvider != null)
        msgs = ((InternalEObject)lockProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, null, msgs);
      if (newLockProvider != null)
        msgs = ((InternalEObject)newLockProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, null, msgs);
      msgs = basicSetLockProvider(newLockProvider, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER, newLockProvider, newLockProvider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable getLocalVariable(String name)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.variables.LocalVariable> localVariables = getChildrenByType( org.emftext.language.java.variables.LocalVariable.class);
    for ( org.emftext.language.java.variables.LocalVariable localVariable : localVariables) {
      if (localVariable.getName().equals(name)) {
        return localVariable;
      }
    }
    return null;
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
      case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
        return basicSetLockProvider(null, msgs);
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
      case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
        return getStatements();
      case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
        if (resolve) return getLockProvider();
        return basicGetLockProvider();
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
      case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
        setLockProvider((Expression)newValue);
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
      case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
        getStatements().clear();
        return;
      case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
        setLockProvider((Expression)null);
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
      case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER:
        return lockProvider != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == StatementListContainer.class)
    {
      switch (derivedFeatureID)
      {
        case StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS: return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == StatementListContainer.class)
    {
      switch (baseFeatureID)
      {
        case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS: return StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //SynchronizedBlockImpl
