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

import org.emftext.language.java.parameters.OrdinaryParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.ForEachLoop#getNext <em>Next</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.ForEachLoop#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.statements.StatementsPackage#getForEachLoop()
 * @model
 * @generated
 */
public interface ForEachLoop extends Statement, StatementContainer
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(OrdinaryParameter)
   * @see org.emftext.language.java.statements.StatementsPackage#getForEachLoop_Next()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  OrdinaryParameter getNext();

  /**
   * Sets the value of the '{@link org.emftext.language.java.statements.ForEachLoop#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(OrdinaryParameter value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' containment reference.
   * @see #setCollection(Expression)
   * @see org.emftext.language.java.statements.StatementsPackage#getForEachLoop_Collection()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  Expression getCollection();

  /**
   * Sets the value of the '{@link org.emftext.language.java.statements.ForEachLoop#getCollection <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' containment reference.
   * @see #getCollection()
   * @generated
   */
  void setCollection(Expression value);

} // ForEachLoop
