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
package org.emftext.language.java.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.expressions.EqualityExpression;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.operators.EqualityOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.EqualityExpressionImpl#getEqualityOperators <em>Equality Operators</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.EqualityExpressionImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EqualityExpressionImpl extends AndExpressionChildImpl implements EqualityExpression
{
  /**
   * The cached value of the '{@link #getEqualityOperators() <em>Equality Operators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqualityOperators()
   * @generated
   * @ordered
   */
  protected EList<EqualityOperator> equalityOperators;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<EqualityExpressionChild> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EqualityExpressionImpl()
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
    return ExpressionsPackage.Literals.EQUALITY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EqualityOperator> getEqualityOperators()
  {
    if (equalityOperators == null)
    {
      equalityOperators = new EObjectContainmentEList.Resolving<EqualityOperator>(EqualityOperator.class, this, ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS);
    }
    return equalityOperators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EqualityExpressionChild> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList.Resolving<EqualityExpressionChild>(EqualityExpressionChild.class, this, ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN);
    }
    return children;
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
      case ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
        return ((InternalEList<?>)getEqualityOperators()).basicRemove(otherEnd, msgs);
      case ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
        return getEqualityOperators();
      case ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN:
        return getChildren();
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
      case ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
        getEqualityOperators().clear();
        getEqualityOperators().addAll((Collection<? extends EqualityOperator>)newValue);
        return;
      case ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends EqualityExpressionChild>)newValue);
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
      case ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
        getEqualityOperators().clear();
        return;
      case ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN:
        getChildren().clear();
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
      case ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS:
        return equalityOperators != null && !equalityOperators.isEmpty();
      case ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN:
        return children != null && !children.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EqualityExpressionImpl
