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
package org.emftext.language.java.members;

import org.emftext.language.java.arrays.ArrayTypeable;

import org.emftext.language.java.generics.TypeParametrizable;

import org.emftext.language.java.modifiers.AnnotableAndModifiable;

import org.emftext.language.java.parameters.Parametrizable;

import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.references.ReferenceableElement;

import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.members.MembersPackage#getMethod()
 * @model abstract="true"
 * @generated
 */
public interface Method extends Member, TypedElement, ArrayTypeable, TypeParametrizable, Parametrizable, ReferenceableElement, ExceptionThrower, AnnotableAndModifiable
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> argumentTypeList = methodCall.getArgumentTypes();\norg.eclipse.emf.common.util.EList< org.emftext.language.java.parameters.Parameter> parameterList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.parameters.Parameter>(this.getParameters());\n\norg.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> parameterTypeList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.types.Type>();\nfor( org.emftext.language.java.parameters.Parameter parameter : parameterList)  {\n\t//determine types before messing with the parameters\n\tparameterTypeList.add(\n\t\t\tparameter.getTypeReference().getBoundTarget(methodCall));\n}\n\nif (!parameterList.isEmpty()) {\n\torg.emftext.language.java.parameters.Parameter lastParameter = parameterList.get(parameterList.size() - 1);\n\torg.emftext.language.java.types.Type lastParameterType  = parameterTypeList.get(parameterTypeList.size() - 1);;\n\tif (lastParameter instanceof org.emftext.language.java.parameters.VariableLengthParameter) {\n\t\t//in case of variable length add/remove some parameters\n\t\twhile(parameterList.size() < argumentTypeList.size()) {\n\t\t\tif (needsPerfectMatch) return false;\n\t\t\tparameterList.add(lastParameter);\n\t\t\tparameterTypeList.add(lastParameterType);\n\t\t}\n\t\tif(parameterList.size() > argumentTypeList.size()) {\n\t\t\tif (needsPerfectMatch) return false;\n\t\t\tparameterList.remove(lastParameter);\n\t\t\tparameterTypeList.remove(parameterTypeList.size() - 1);\n\t\t}\n\t\t\n\t}\n}\n\nif (parameterList.size() == argumentTypeList.size()) { \n\tboolean parametersMatch = true;\n\tfor (int i = 0; i < argumentTypeList.size(); i++) {\n\t\torg.emftext.language.java.parameters.Parameter  parameter = parameterList.get(i);\n\t\torg.emftext.language.java.expressions.Expression argument = methodCall.getArguments().get(i);\n\n\t\torg.emftext.language.java.types.Type parameterType = parameterTypeList.get(i);\n\t\torg.emftext.language.java.types.Type argumentType  = argumentTypeList.get(i);\n\t\t\n\t\tif (argumentType == null || parameterType == null) {\n\t\t\treturn false;\n\t\t}\n\t\t\n\t\tif (parameterType != null && argumentType != null) {\n\t\t\tif (!parameterType.eIsProxy() || !argumentType.eIsProxy()) {\n\t\t\t\tif (needsPerfectMatch) {\n\t\t\t\t\tparametersMatch = parametersMatch\n\t\t\t\t\t\t&& argumentType.equalsType(argument.getArrayDimension(),\n\t\t\t\t\t\t\t\tparameterType, parameter.getArrayDimension());\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tparametersMatch = parametersMatch \n\t\t\t\t\t\t&& argumentType.isSuperType(argument.getArrayDimension(),\n\t\t\t\t\t\t\t\tparameterType, parameter);\n\t\t\t\t}\n\t\t\t}\n\t\t\telse {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t\telse {\n\t\t\treturn false;\n\t\t}\n\t}\n\treturn parametersMatch; \n} \nreturn false;'"
   * @generated
   */
  boolean isMethodForCall(MethodCall methodCall, boolean needsPerfectMatch);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Decides if the given method matches the given call. 
   *  
   *  @param methodCall
   *  @return
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return isMethodForCall(methodCall, false);'"
   * @generated
   */
  boolean isSomeMethodForCall(MethodCall methodCall);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Only returns true if the given Method is a better match for the given calls than the
   *  otherMethod given.
   *  
   *  @param otherMethod
   *  @param methodCall
   *  @return
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (!isMethodForCall(methodCall, false)) {\n\treturn false;\n}\nif (otherMethod.isMethodForCall(methodCall, true)) {\n\tif (isMethodForCall(methodCall, true)) {\n\t\t//we both match perfectly; lets compare our return types\n\t\torg.emftext.language.java.types.Type target = getTypeReference().getTarget();\n\t\tif (target instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {\n\t\t\tif ((( org.emftext.language.java.classifiers.ConcreteClassifier) target).getAllSuperClassifiers().contains(\n\t\t\t\t\totherMethod.getTypeReference().getTarget())) {\n\t\t\t\t// I am the more concrete type\n\t\t\t\treturn true;\n\t\t\t}\n\t\t}\n\t}\n\t//the other already matches perfectly; I am not better\n\treturn false;\n}\nif (!otherMethod.isMethodForCall(methodCall, false)) {\n\t//I match, but the other does not\n\treturn true;\n}\n//we both match, I am only better if I match perfectly <- \n//TODO #763: this is not enough: we need to check for \"nearest subtype\" here\nreturn isMethodForCall(methodCall, true);'"
   * @generated
   */
  boolean isBetterMethodForCall(Method otherMethod, MethodCall methodCall);

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

} // Method
