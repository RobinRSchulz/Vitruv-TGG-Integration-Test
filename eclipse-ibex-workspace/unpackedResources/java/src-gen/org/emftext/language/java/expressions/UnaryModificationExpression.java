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
package org.emftext.language.java.expressions;

import org.emftext.language.java.operators.UnaryModificationOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Modification Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.UnaryModificationExpression#getChild <em>Child</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.UnaryModificationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getUnaryModificationExpression()
 * @model abstract="true"
 * @generated
 */
public interface UnaryModificationExpression extends UnaryExpressionChild
{
  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Child</em>' containment reference.
   * @see #setChild(UnaryModificationExpressionChild)
   * @see org.emftext.language.java.expressions.ExpressionsPackage#getUnaryModificationExpression_Child()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  UnaryModificationExpressionChild getChild();

  /**
   * Sets the value of the '{@link org.emftext.language.java.expressions.UnaryModificationExpression#getChild <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' containment reference.
   * @see #getChild()
   * @generated
   */
  void setChild(UnaryModificationExpressionChild value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(UnaryModificationOperator)
   * @see org.emftext.language.java.expressions.ExpressionsPackage#getUnaryModificationExpression_Operator()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  UnaryModificationOperator getOperator();

  /**
   * Sets the value of the '{@link org.emftext.language.java.expressions.UnaryModificationExpression#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(UnaryModificationOperator value);

} // UnaryModificationExpression
