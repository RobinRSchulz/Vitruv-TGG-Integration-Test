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
import org.emftext.language.java.expressions.RelationExpression;
import org.emftext.language.java.expressions.RelationExpressionChild;

import org.emftext.language.java.operators.RelationOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.RelationExpressionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.RelationExpressionImpl#getRelationOperators <em>Relation Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationExpressionImpl extends InstanceOfExpressionChildImpl implements RelationExpression
{
  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<RelationExpressionChild> children;

  /**
   * The cached value of the '{@link #getRelationOperators() <em>Relation Operators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationOperators()
   * @generated
   * @ordered
   */
  protected EList<RelationOperator> relationOperators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationExpressionImpl()
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
    return ExpressionsPackage.Literals.RELATION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationExpressionChild> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList.Resolving<RelationExpressionChild>(RelationExpressionChild.class, this, ExpressionsPackage.RELATION_EXPRESSION__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationOperator> getRelationOperators()
  {
    if (relationOperators == null)
    {
      relationOperators = new EObjectContainmentEList.Resolving<RelationOperator>(RelationOperator.class, this, ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS);
    }
    return relationOperators;
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
      case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
        return ((InternalEList<?>)getRelationOperators()).basicRemove(otherEnd, msgs);
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
      case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
        return getChildren();
      case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
        return getRelationOperators();
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
      case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends RelationExpressionChild>)newValue);
        return;
      case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
        getRelationOperators().clear();
        getRelationOperators().addAll((Collection<? extends RelationOperator>)newValue);
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
      case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
        getChildren().clear();
        return;
      case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
        getRelationOperators().clear();
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
      case ExpressionsPackage.RELATION_EXPRESSION__CHILDREN:
        return children != null && !children.isEmpty();
      case ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS:
        return relationOperators != null && !relationOperators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelationExpressionImpl
