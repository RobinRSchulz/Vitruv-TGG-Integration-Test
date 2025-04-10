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

import org.emftext.language.java.statements.Block;
import org.emftext.language.java.statements.CatchBlock;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;
import org.emftext.language.java.statements.StatementsPackage;
import org.emftext.language.java.statements.TryBlock;

import org.emftext.language.java.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.impl.TryBlockImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.impl.TryBlockImpl#getCatcheBlocks <em>Catche Blocks</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.impl.TryBlockImpl#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TryBlockImpl extends StatementImpl implements TryBlock
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
   * The cached value of the '{@link #getCatcheBlocks() <em>Catche Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatcheBlocks()
   * @generated
   * @ordered
   */
  protected EList<CatchBlock> catcheBlocks;

  /**
   * The cached value of the '{@link #getFinallyBlock() <em>Finally Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinallyBlock()
   * @generated
   * @ordered
   */
  protected Block finallyBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TryBlockImpl()
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
    return StatementsPackage.Literals.TRY_BLOCK;
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
      statements = new EObjectContainmentEList.Resolving<Statement>(Statement.class, this, StatementsPackage.TRY_BLOCK__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CatchBlock> getCatcheBlocks()
  {
    if (catcheBlocks == null)
    {
      catcheBlocks = new EObjectContainmentEList.Resolving<CatchBlock>(CatchBlock.class, this, StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS);
    }
    return catcheBlocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getFinallyBlock()
  {
    if (finallyBlock != null && finallyBlock.eIsProxy())
    {
      InternalEObject oldFinallyBlock = (InternalEObject)finallyBlock;
      finallyBlock = (Block)eResolveProxy(oldFinallyBlock);
      if (finallyBlock != oldFinallyBlock)
      {
        InternalEObject newFinallyBlock = (InternalEObject)finallyBlock;
        NotificationChain msgs = oldFinallyBlock.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, null);
        if (newFinallyBlock.eInternalContainer() == null)
        {
          msgs = newFinallyBlock.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, oldFinallyBlock, finallyBlock));
      }
    }
    return finallyBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block basicGetFinallyBlock()
  {
    return finallyBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinallyBlock(Block newFinallyBlock, NotificationChain msgs)
  {
    Block oldFinallyBlock = finallyBlock;
    finallyBlock = newFinallyBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, oldFinallyBlock, newFinallyBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinallyBlock(Block newFinallyBlock)
  {
    if (newFinallyBlock != finallyBlock)
    {
      NotificationChain msgs = null;
      if (finallyBlock != null)
        msgs = ((InternalEObject)finallyBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
      if (newFinallyBlock != null)
        msgs = ((InternalEObject)newFinallyBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, null, msgs);
      msgs = basicSetFinallyBlock(newFinallyBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.TRY_BLOCK__FINALLY_BLOCK, newFinallyBlock, newFinallyBlock));
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
      case StatementsPackage.TRY_BLOCK__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
        return ((InternalEList<?>)getCatcheBlocks()).basicRemove(otherEnd, msgs);
      case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
        return basicSetFinallyBlock(null, msgs);
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
      case StatementsPackage.TRY_BLOCK__STATEMENTS:
        return getStatements();
      case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
        return getCatcheBlocks();
      case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
        if (resolve) return getFinallyBlock();
        return basicGetFinallyBlock();
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
      case StatementsPackage.TRY_BLOCK__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
        getCatcheBlocks().clear();
        getCatcheBlocks().addAll((Collection<? extends CatchBlock>)newValue);
        return;
      case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
        setFinallyBlock((Block)newValue);
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
      case StatementsPackage.TRY_BLOCK__STATEMENTS:
        getStatements().clear();
        return;
      case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
        getCatcheBlocks().clear();
        return;
      case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
        setFinallyBlock((Block)null);
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
      case StatementsPackage.TRY_BLOCK__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS:
        return catcheBlocks != null && !catcheBlocks.isEmpty();
      case StatementsPackage.TRY_BLOCK__FINALLY_BLOCK:
        return finallyBlock != null;
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
        case StatementsPackage.TRY_BLOCK__STATEMENTS: return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
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
        case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS: return StatementsPackage.TRY_BLOCK__STATEMENTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //TryBlockImpl
