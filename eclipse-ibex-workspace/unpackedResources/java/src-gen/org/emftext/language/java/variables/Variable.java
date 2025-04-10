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
package org.emftext.language.java.variables;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.arrays.ArrayTypeable;

import org.emftext.language.java.commons.NamedElement;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.generics.TypeArgumentable;

import org.emftext.language.java.references.ReferenceableElement;

import org.emftext.language.java.statements.Statement;

import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.variables.VariablesPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends NamedElement, TypedElement, ArrayTypeable, ReferenceableElement, TypeArgumentable
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long size = this.getArrayDimensionsBefore().size() + this.getArrayDimensionsAfter().size();\nif (this instanceof org.emftext.language.java.parameters.VariableLengthParameter) {\n\tsize++;\n}\nreturn size;'"
   * @generated
   */
  long getArrayDimension();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Creates a statement that calls the method with the given name on this
   *  variable. If the variable's type does not offer such a method, null is
   *  returned.
   * 
   * <!-- end-model-doc -->
   * @model methodNameRequired="true" argumentsMany="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.statements.ExpressionStatement callStatement = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createExpressionStatement();\ncallStatement.setExpression(createMethodCall(methodName, arguments));\nreturn callStatement;'"
   * @generated
   */
  Statement createMethodCallStatement(String methodName, EList<Expression> arguments);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Creates an expression that calls the method with the given name on this
   *  variable. If the variable's type does not offer such a method, null is
   *  returned.
   * 
   * <!-- end-model-doc -->
   * @model methodNameRequired="true" argumentsMany="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.references.IdentifierReference thisRef = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();\nthisRef.setTarget(this);\norg.emftext.language.java.references.MethodCall methodCall = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createMethodCall();\norg.emftext.language.java.types.Type thisType = getTypeReference().getTarget();\nif (thisType instanceof org.emftext.language.java.members.MemberContainer) {\n\torg.emftext.language.java.members.MemberContainer castedType = ( org.emftext.language.java.members.MemberContainer) thisType;\n\torg.emftext.language.java.members.Method method = castedType.getContainedMethod(methodName);\n\tif (method == null) {\n\t\treturn null;\n\t}\n\tmethodCall.setTarget(method);\n\t// add arguments\n\tmethodCall.getArguments().addAll(arguments);\n\tthisRef.setNext(methodCall);\n\treturn thisRef;\n} else {\n\treturn null;\n}'"
   * @generated
   */
  Expression createMethodCall(String methodName, EList<Expression> arguments);

} // Variable
