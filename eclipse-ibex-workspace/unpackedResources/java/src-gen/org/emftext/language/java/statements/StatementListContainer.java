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

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.StatementListContainer#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.statements.StatementsPackage#getStatementListContainer()
 * @model abstract="true"
 * @generated
 */
public interface StatementListContainer extends Commentable
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.statements.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.emftext.language.java.statements.StatementsPackage#getStatementListContainer_Statements()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model required="true" nameRequired="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.variables.LocalVariable> localVariables = getChildrenByType( org.emftext.language.java.variables.LocalVariable.class);\nfor ( org.emftext.language.java.variables.LocalVariable localVariable : localVariables) {\n\tif (localVariable.getName().equals(name)) {\n\t\treturn localVariable;\n\t}\n}\nreturn null;'"
   * @generated
   */
  LocalVariable getLocalVariable(String name);

} // StatementListContainer
