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

import org.emftext.language.java.annotations.AnnotationValue;

import org.emftext.language.java.arrays.ArrayInitializationValue;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.expressions.ExpressionsPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends ArrayInitializationValue, AnnotationValue
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns the type of the expression considering all concrete
   *  subtypes of Expression.
   *  
   *  @return type of expression
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getOneType(false);'"
   * @generated
   */
  Type getType();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getOneType(true);'"
   * @generated
   */
  Type getAlternativeType();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.classifiers.Class stringClass = getStringClass();\n\norg.emftext.language.java.types.Type type = null;\n\nif (this instanceof org.emftext.language.java.references.Reference) {\n\torg.emftext.language.java.references.Reference reference = ( org.emftext.language.java.references.Reference) this;\n\t//navigate down references\n\twhile(reference.getNext() != null) {\n\t\treference = reference.getNext();\n\t}\n\ttype = reference.getReferencedType();\n}\nelse if (this instanceof org.emftext.language.java.literals.Literal) {\n\ttype = (( org.emftext.language.java.literals.Literal) this).getType();\n}\nelse if (this instanceof org.emftext.language.java.expressions.CastExpression) {\n\ttype = (( org.emftext.language.java.expressions.CastExpression)this).getTypeReference().getTarget();\n}\nelse if (this instanceof org.emftext.language.java.expressions.AssignmentExpression) {\n\ttype = (( org.emftext.language.java.expressions.AssignmentExpression) this).getChild().getOneType(alternative);\n}\nelse if (this instanceof org.emftext.language.java.expressions.ConditionalExpression &&\n\t\t(( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {\n\tif (alternative) {\n\t\ttype = (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionElse().getOneType(alternative);\n\t}\n\telse {\n\t\ttype = (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf().getOneType(alternative);\n\t}\n\t\n}\nelse if (this instanceof org.emftext.language.java.expressions.EqualityExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.RelationExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.ConditionalOrExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.ConditionalAndExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.InstanceOfExpression ) {\n\ttype = getLibClass(\"Boolean\");\n}\nelse if (this instanceof org.emftext.language.java.expressions.AdditiveExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.MultiplicativeExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.InclusiveOrExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.ExclusiveOrExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.AndExpression ||\n\t\tthis instanceof org.emftext.language.java.expressions.ShiftExpression ) {\n\t\n\tif (this instanceof org.emftext.language.java.expressions.AdditiveExpression) {\n\t\torg.emftext.language.java.expressions.AdditiveExpression additiveExpression = ( org.emftext.language.java.expressions.AdditiveExpression) this;\n\t\tfor( org.emftext.language.java.expressions.Expression subExp : additiveExpression.getChildren()) {\n\t\t\tif (stringClass.equals(subExp.getOneType(alternative))) {\n\t\t\t\t//special case: string concatenation\n\t\t\t\treturn stringClass;\n\t\t\t}\n\t\t}\n\t}\n\t\n\t@SuppressWarnings(\"unchecked\")\n\torg.emftext.language.java.expressions.Expression subExp = (( org.eclipse.emf.common.util.EList< org.emftext.language.java.expressions.Expression>) \n\t\t\tthis.eGet(this.eClass().getEStructuralFeature(\"children\"))).get(0);\n\t\n\treturn subExp.getOneType(alternative);\n}\nelse if (this instanceof org.emftext.language.java.expressions.UnaryExpression) {\n\torg.emftext.language.java.expressions.Expression subExp = (( org.emftext.language.java.expressions.UnaryExpression)this).getChild();\n\t\n\treturn subExp.getOneType(alternative);\n}\nelse for( org.eclipse.emf.common.util.TreeIterator< org.eclipse.emf.ecore.EObject> i = this.eAllContents(); i.hasNext(); ) {\n\torg.eclipse.emf.ecore.EObject next = i.next();\n\torg.emftext.language.java.types.Type nextType = null;\n\n\tif (next instanceof org.emftext.language.java.expressions.PrimaryExpression) {\n\n\t\tif (next instanceof org.emftext.language.java.references.Reference) {\n\t\t\torg.emftext.language.java.references.Reference ref = ( org.emftext.language.java.references.Reference) next;\n\t\t\t//navigate down references\n\t\t\twhile(ref.getNext() != null) {\n\t\t\t\tref = ref.getNext();\n\t\t\t}\n\t\t\tnext = ref;\n\t\t}\n\t\tif (next instanceof org.emftext.language.java.literals.Literal) {\n\t\t\tnextType = (( org.emftext.language.java.literals.Literal) next).getType();\n\t\t}\n\t\telse if (next instanceof org.emftext.language.java.expressions.CastExpression) {\n\t\t\tnextType = (( org.emftext.language.java.expressions.CastExpression)next).getTypeReference().getTarget();\n\t\t}\n\t\telse {\n\t\t\tnextType = (( org.emftext.language.java.references.Reference) next).getReferencedType();\n\t\t}\n\t\ti.prune();\n\n\t}\n\tif (nextType != null) {\n\t\ttype = nextType;\n\t\t//in the special case that this is an expression with\n\t\t//some string included, everything is converted to string\n\t\tif (stringClass.equals(type)) {\n\t\t\tbreak;\n\t\t}\n\t}\n}\n//type can be null in cases of unresolved/unresolvable proxies\nreturn type;'"
   * @generated
   */
  Type getOneType(boolean alternative);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long size = 0;\norg.emftext.language.java.arrays.ArrayTypeable arrayType = null;\nif (this instanceof org.emftext.language.java.expressions.NestedExpression && \n\t\t(( org.emftext.language.java.expressions.NestedExpression)this).getNext() == null) {\n\treturn (( org.emftext.language.java.expressions.NestedExpression) this).getExpression().getArrayDimension()\n\t\t- (( org.emftext.language.java.expressions.NestedExpression)this).getArraySelectors().size();\n}\nif (this instanceof org.emftext.language.java.expressions.ConditionalExpression &&\n\t\t(( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {\t\t\n\treturn (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf().getArrayDimension();\n}\nif (this instanceof org.emftext.language.java.expressions.AssignmentExpression) {\n\torg.emftext.language.java.expressions.Expression value = (( org.emftext.language.java.expressions.AssignmentExpression) this).getValue();\n\tif (value == null) {\n\t\treturn 0;\n\t}\n\treturn value.getArrayDimension();\n}\nif (this instanceof org.emftext.language.java.expressions.InstanceOfExpression) {\n\treturn 0;\n}\nif (this instanceof org.emftext.language.java.references.Reference) {\n\torg.emftext.language.java.references.Reference reference = ( org.emftext.language.java.references.Reference) this;\n\twhile (reference.getNext() != null) {\n\t\treference = reference.getNext();\n\t}\n\t//an array clone? -> dimension defined by cloned array\n\tif (reference instanceof org.emftext.language.java.references.ElementReference && \n\t\t\treference.getPrevious() != null) {\n\t\torg.emftext.language.java.references.ReferenceableElement target = (( org.emftext.language.java.references.ElementReference)reference).getTarget();\n\t\tif (target instanceof org.emftext.language.java.members.Method) {\n\t\t\tif(\"clone\".equals((( org.emftext.language.java.members.Method)target).getName())) {\n\t\t\t\treference = ( org.emftext.language.java.references.Reference) reference.eContainer();\n\t\t\t}\n\t\t}\n\t}\n\t\n\tif (reference instanceof org.emftext.language.java.references.ElementReference) {\n\t\torg.emftext.language.java.references.ElementReference elementReference = ( org.emftext.language.java.references.ElementReference) reference;\n\t\tif (elementReference.getTarget() instanceof org.emftext.language.java.arrays.ArrayTypeable) {\n\t\t\tarrayType = ( org.emftext.language.java.arrays.ArrayTypeable) elementReference.getTarget();\n\t\t}\n\t\tif (elementReference.getTarget() instanceof org.emftext.language.java.variables.AdditionalLocalVariable) {\n\t\t\torg.emftext.language.java.variables.AdditionalLocalVariable additionalLocalVariable = ( org.emftext.language.java.variables.AdditionalLocalVariable) elementReference.getTarget();\n\t\t\tarrayType = ( org.emftext.language.java.variables.LocalVariable) additionalLocalVariable.eContainer();\n\t\t\tsize += additionalLocalVariable.getArrayDimensionsAfter().size();\n\t\t\tsize -= arrayType.getArrayDimensionsAfter().size();\n\t\t}\n\t\tif (elementReference.getTarget() instanceof org.emftext.language.java.members.AdditionalField) {\n\t\t\torg.emftext.language.java.members.AdditionalField additionalField = ( org.emftext.language.java.members.AdditionalField) elementReference.getTarget();\n\t\t\tarrayType = ( org.emftext.language.java.members.Field) additionalField.eContainer();\n\t\t\tsize += additionalField.getArrayDimensionsAfter().size();\n\t\t\tsize -= arrayType.getArrayDimensionsAfter().size();\n\t\t}\n\t}\n\telse if (this instanceof org.emftext.language.java.arrays.ArrayTypeable) {\n\t\tsize += (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();\n\t\tif (this instanceof org.emftext.language.java.parameters.VariableLengthParameter) {\n\t\t\tsize++;\n\t\t}\n\t}\n\tsize -= reference.getArraySelectors().size();\n}\nelse if (this instanceof org.emftext.language.java.arrays.ArrayTypeable) {\n\tsize += (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();\n\tif (this instanceof org.emftext.language.java.parameters.VariableLengthParameter) {\n\t\tsize++;\n\t}\n}\n\nif(this instanceof org.emftext.language.java.arrays.ArrayInstantiationBySize) {\n\tsize += (( org.emftext.language.java.arrays.ArrayInstantiationBySize)this).getSizes().size();\n}\n\nif(arrayType != null) {\n\tsize += arrayType.getArrayDimension();\n}\n\nreturn size;'"
   * @generated
   */
  long getArrayDimension();

} // Expression
