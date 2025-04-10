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

import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpression;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl#getExpressionIf <em>Expression If</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl#getExpressionElse <em>Expression Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends AssignmentExpressionChildImpl implements ConditionalExpression
{
  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected ConditionalExpressionChild child;

  /**
   * The cached value of the '{@link #getExpressionIf() <em>Expression If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionIf()
   * @generated
   * @ordered
   */
  protected Expression expressionIf;

  /**
   * The cached value of the '{@link #getExpressionElse() <em>Expression Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionElse()
   * @generated
   * @ordered
   */
  protected AssignmentExpressionChild expressionElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalExpressionImpl()
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
    return ExpressionsPackage.Literals.CONDITIONAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpressionChild getChild()
  {
    if (child != null && child.eIsProxy())
    {
      InternalEObject oldChild = (InternalEObject)child;
      child = (ConditionalExpressionChild)eResolveProxy(oldChild);
      if (child != oldChild)
      {
        InternalEObject newChild = (InternalEObject)child;
        NotificationChain msgs = oldChild.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, null);
        if (newChild.eInternalContainer() == null)
        {
          msgs = newChild.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, oldChild, child));
      }
    }
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpressionChild basicGetChild()
  {
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChild(ConditionalExpressionChild newChild, NotificationChain msgs)
  {
    ConditionalExpressionChild oldChild = child;
    child = newChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, oldChild, newChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChild(ConditionalExpressionChild newChild)
  {
    if (newChild != child)
    {
      NotificationChain msgs = null;
      if (child != null)
        msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
      if (newChild != null)
        msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, null, msgs);
      msgs = basicSetChild(newChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD, newChild, newChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpressionIf()
  {
    if (expressionIf != null && expressionIf.eIsProxy())
    {
      InternalEObject oldExpressionIf = (InternalEObject)expressionIf;
      expressionIf = (Expression)eResolveProxy(oldExpressionIf);
      if (expressionIf != oldExpressionIf)
      {
        InternalEObject newExpressionIf = (InternalEObject)expressionIf;
        NotificationChain msgs = oldExpressionIf.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, null);
        if (newExpressionIf.eInternalContainer() == null)
        {
          msgs = newExpressionIf.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, oldExpressionIf, expressionIf));
      }
    }
    return expressionIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetExpressionIf()
  {
    return expressionIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionIf(Expression newExpressionIf, NotificationChain msgs)
  {
    Expression oldExpressionIf = expressionIf;
    expressionIf = newExpressionIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, oldExpressionIf, newExpressionIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionIf(Expression newExpressionIf)
  {
    if (newExpressionIf != expressionIf)
    {
      NotificationChain msgs = null;
      if (expressionIf != null)
        msgs = ((InternalEObject)expressionIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
      if (newExpressionIf != null)
        msgs = ((InternalEObject)newExpressionIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, null, msgs);
      msgs = basicSetExpressionIf(newExpressionIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF, newExpressionIf, newExpressionIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpressionChild getExpressionElse()
  {
    if (expressionElse != null && expressionElse.eIsProxy())
    {
      InternalEObject oldExpressionElse = (InternalEObject)expressionElse;
      expressionElse = (AssignmentExpressionChild)eResolveProxy(oldExpressionElse);
      if (expressionElse != oldExpressionElse)
      {
        InternalEObject newExpressionElse = (InternalEObject)expressionElse;
        NotificationChain msgs = oldExpressionElse.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, null);
        if (newExpressionElse.eInternalContainer() == null)
        {
          msgs = newExpressionElse.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, oldExpressionElse, expressionElse));
      }
    }
    return expressionElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentExpressionChild basicGetExpressionElse()
  {
    return expressionElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionElse(AssignmentExpressionChild newExpressionElse, NotificationChain msgs)
  {
    AssignmentExpressionChild oldExpressionElse = expressionElse;
    expressionElse = newExpressionElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, oldExpressionElse, newExpressionElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionElse(AssignmentExpressionChild newExpressionElse)
  {
    if (newExpressionElse != expressionElse)
    {
      NotificationChain msgs = null;
      if (expressionElse != null)
        msgs = ((InternalEObject)expressionElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, msgs);
      if (newExpressionElse != null)
        msgs = ((InternalEObject)newExpressionElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, null, msgs);
      msgs = basicSetExpressionElse(newExpressionElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE, newExpressionElse, newExpressionElse));
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
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
        return basicSetChild(null, msgs);
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        return basicSetExpressionIf(null, msgs);
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        return basicSetExpressionElse(null, msgs);
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
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
        if (resolve) return getChild();
        return basicGetChild();
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        if (resolve) return getExpressionIf();
        return basicGetExpressionIf();
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        if (resolve) return getExpressionElse();
        return basicGetExpressionElse();
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
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
        setChild((ConditionalExpressionChild)newValue);
        return;
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        setExpressionIf((Expression)newValue);
        return;
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        setExpressionElse((AssignmentExpressionChild)newValue);
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
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
        setChild((ConditionalExpressionChild)null);
        return;
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        setExpressionIf((Expression)null);
        return;
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        setExpressionElse((AssignmentExpressionChild)null);
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
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD:
        return child != null;
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF:
        return expressionIf != null;
      case ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE:
        return expressionElse != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionalExpressionImpl
