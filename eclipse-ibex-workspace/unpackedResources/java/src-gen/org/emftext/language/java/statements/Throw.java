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
package org.emftext.language.java.statements;

import org.emftext.language.java.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.Throw#getThrowable <em>Throwable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.statements.StatementsPackage#getThrow()
 * @model
 * @generated
 */
public interface Throw extends Statement
{
  /**
   * Returns the value of the '<em><b>Throwable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Throwable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Throwable</em>' containment reference.
   * @see #setThrowable(Expression)
   * @see org.emftext.language.java.statements.StatementsPackage#getThrow_Throwable()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  Expression getThrowable();

  /**
   * Sets the value of the '{@link org.emftext.language.java.statements.Throw#getThrowable <em>Throwable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Throwable</em>' containment reference.
   * @see #getThrowable()
   * @generated
   */
  void setThrowable(Expression value);

} // Throw
