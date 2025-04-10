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
package org.emftext.language.java.references;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.Argumentable#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.references.ReferencesPackage#getArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface Argumentable extends Commentable
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.expressions.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.emftext.language.java.references.ReferencesPackage#getArgumentable_Arguments()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Expression> getArguments();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return list of types of my arguments
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> resultList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.types.Type>();\n\nfor( org.emftext.language.java.expressions.Expression exp : getArguments()) {\n\torg.emftext.language.java.types.Type type = exp.getType();\n\tresultList.add(type);\n}\nreturn resultList;'"
   * @generated
   */
  EList<Type> getArgumentTypes();

} // Argumentable
