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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.expressions.AssignmentExpression;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.operators.AssignmentOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.AssignmentExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.AssignmentExpressionImpl#getAssignmentOperator <em>Assignment Operator</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.AssignmentExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends ExpressionImpl implements AssignmentExpression
{
  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected AssignmentExpressionChild child;

  /**
   * The cached value of the '{@link #getAssignmentOperator() <em>Assignment Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignmentOperator()
   * @generated
   * @ordered
   */
  protected AssignmentOperator assignmentOperator;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentExpressionImpl()
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
    return ExpressionsPackage.Literals.ASSIGNMENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpressionChild getChild()
  {
    if (child != null && child.eIsProxy())
    {
      InternalEObject oldChild = (InternalEObject)child;
      child = (AssignmentExpressionChild)eResolveProxy(oldChild);
      if (child != oldChild)
      {
        InternalEObject newChild = (InternalEObject)child;
        NotificationChain msgs = oldChild.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, null, null);
        if (newChild.eInternalContainer() == null)
        {
          msgs = newChild.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, oldChild, child));
      }
    }
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpressionChild basicGetChild()
  {
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChild(AssignmentExpressionChild newChild, NotificationChain msgs)
  {
    AssignmentExpressionChild oldChild = child;
    child = newChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, oldChild, newChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChild(AssignmentExpressionChild newChild)
  {
    if (newChild != child)
    {
      NotificationChain msgs = null;
      if (child != null)
        msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, null, msgs);
      if (newChild != null)
        msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, null, msgs);
      msgs = basicSetChild(newChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD, newChild, newChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentOperator getAssignmentOperator()
  {
    if (assignmentOperator != null && assignmentOperator.eIsProxy())
    {
      InternalEObject oldAssignmentOperator = (InternalEObject)assignmentOperator;
      assignmentOperator = (AssignmentOperator)eResolveProxy(oldAssignmentOperator);
      if (assignmentOperator != oldAssignmentOperator)
      {
        InternalEObject newAssignmentOperator = (InternalEObject)assignmentOperator;
        NotificationChain msgs = oldAssignmentOperator.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null, null);
        if (newAssignmentOperator.eInternalContainer() == null)
        {
          msgs = newAssignmentOperator.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, oldAssignmentOperator, assignmentOperator));
      }
    }
    return assignmentOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentOperator basicGetAssignmentOperator()
  {
    return assignmentOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignmentOperator(AssignmentOperator newAssignmentOperator, NotificationChain msgs)
  {
    AssignmentOperator oldAssignmentOperator = assignmentOperator;
    assignmentOperator = newAssignmentOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, oldAssignmentOperator, newAssignmentOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignmentOperator(AssignmentOperator newAssignmentOperator)
  {
    if (newAssignmentOperator != assignmentOperator)
    {
      NotificationChain msgs = null;
      if (assignmentOperator != null)
        msgs = ((InternalEObject)assignmentOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null, msgs);
      if (newAssignmentOperator != null)
        msgs = ((InternalEObject)newAssignmentOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, null, msgs);
      msgs = basicSetAssignmentOperator(newAssignmentOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, newAssignmentOperator, newAssignmentOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (Expression)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        InternalEObject newValue = (InternalEObject)value;
        NotificationChain msgs = oldValue.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, null);
        if (newValue.eInternalContainer() == null)
        {
          msgs = newValue.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE, newValue, newValue));
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
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
        return basicSetChild(null, msgs);
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        return basicSetAssignmentOperator(null, msgs);
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
        return basicSetValue(null, msgs);
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
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
        if (resolve) return getChild();
        return basicGetChild();
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        if (resolve) return getAssignmentOperator();
        return basicGetAssignmentOperator();
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
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
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
        setChild((AssignmentExpressionChild)newValue);
        return;
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        setAssignmentOperator((AssignmentOperator)newValue);
        return;
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
        setValue((Expression)newValue);
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
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
        setChild((AssignmentExpressionChild)null);
        return;
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        setAssignmentOperator((AssignmentOperator)null);
        return;
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
        setValue((Expression)null);
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
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD:
        return child != null;
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        return assignmentOperator != null;
      case ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignmentExpressionImpl
