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

import org.emftext.language.java.expressions.ExpressionsPackage;
import org.emftext.language.java.expressions.ShiftExpression;
import org.emftext.language.java.expressions.ShiftExpressionChild;

import org.emftext.language.java.operators.ShiftOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.ShiftExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.ShiftExpressionImpl#getShiftOperators <em>Shift Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShiftExpressionImpl extends RelationExpressionChildImpl implements ShiftExpression
{
  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<ShiftExpressionChild> children;

  /**
   * The cached value of the '{@link #getShiftOperators() <em>Shift Operators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShiftOperators()
   * @generated
   * @ordered
   */
  protected EList<ShiftOperator> shiftOperators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShiftExpressionImpl()
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
    return ExpressionsPackage.Literals.SHIFT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ShiftExpressionChild> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList.Resolving<ShiftExpressionChild>(ShiftExpressionChild.class, this, ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ShiftOperator> getShiftOperators()
  {
    if (shiftOperators == null)
    {
      shiftOperators = new EObjectContainmentEList.Resolving<ShiftOperator>(ShiftOperator.class, this, ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS);
    }
    return shiftOperators;
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
      case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
        return ((InternalEList<?>)getShiftOperators()).basicRemove(otherEnd, msgs);
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
      case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
        return getChildren();
      case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
        return getShiftOperators();
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
      case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends ShiftExpressionChild>)newValue);
        return;
      case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
        getShiftOperators().clear();
        getShiftOperators().addAll((Collection<? extends ShiftOperator>)newValue);
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
      case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
        getChildren().clear();
        return;
      case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
        getShiftOperators().clear();
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
      case ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN:
        return children != null && !children.isEmpty();
      case ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS:
        return shiftOperators != null && !shiftOperators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ShiftExpressionImpl
