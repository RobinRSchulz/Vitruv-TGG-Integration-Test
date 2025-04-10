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

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.operators.EqualityOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.EqualityExpression#getEqualityOperators <em>Equality Operators</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.EqualityExpression#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getEqualityExpression()
 * @model
 * @generated
 */
public interface EqualityExpression extends AndExpressionChild
{
  /**
   * Returns the value of the '<em><b>Equality Operators</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.operators.EqualityOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equality Operators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equality Operators</em>' containment reference list.
   * @see org.emftext.language.java.expressions.ExpressionsPackage#getEqualityExpression_EqualityOperators()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<EqualityOperator> getEqualityOperators();

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.expressions.EqualityExpressionChild}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.emftext.language.java.expressions.ExpressionsPackage#getEqualityExpression_Children()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  EList<EqualityExpressionChild> getChildren();

} // EqualityExpression
