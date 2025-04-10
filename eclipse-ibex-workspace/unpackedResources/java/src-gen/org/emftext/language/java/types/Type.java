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
package org.emftext.language.java.types;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.arrays.ArrayTypeable;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.members.Member;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.types.TypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Commentable
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param arrayDimension
   *  @param otherType
   *  @param otherArrayDimension
   *  @return if both type are equal
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.types.Type _this = this;\n//comparison for type parameters\nif (_this instanceof org.emftext.language.java.generics.TypeParameter) {\n\torg.emftext.language.java.generics.TypeParameter typeParameter = ( org.emftext.language.java.generics.TypeParameter) _this;\n\tfor ( org.emftext.language.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {\n\t\tif (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && referencedType.getTarget().equalsType(arrayDimension, otherType, otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n\tif (typeParameter.getExtendTypes().isEmpty()) {\n\t\tif (getObjectClass().equalsType(arrayDimension, otherType, otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n} \nif (otherType instanceof org.emftext.language.java.generics.TypeParameter) {\n\torg.emftext.language.java.generics.TypeParameter typeParameter = ( org.emftext.language.java.generics.TypeParameter) otherType;\n\tfor ( org.emftext.language.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {\n\t\tif (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && equalsType(arrayDimension, referencedType.getTarget(), otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n\tif (typeParameter.getExtendTypes().isEmpty()) {\n\t\tif (equalsType(arrayDimension, getObjectClass(), otherArrayDimension)) {\n\t\t\treturn true;\n\t\t}\n\t}\n}\n\n//do comparison on the classifier level\nif (_this instanceof org.emftext.language.java.types.PrimitiveType) {\n\t_this = (( org.emftext.language.java.types.PrimitiveType)_this).wrapPrimitiveType();\n}\nif (otherType instanceof org.emftext.language.java.types.PrimitiveType) {\n\totherType = (( org.emftext.language.java.types.PrimitiveType) otherType).wrapPrimitiveType();\n}\n\nif (arrayDimension == otherArrayDimension &&\n\t\totherType instanceof org.emftext.language.java.classifiers.Classifier && _this instanceof org.emftext.language.java.classifiers.Classifier &&\n\t\t(otherType.equals(_this))) {\t\n\treturn true;\n}\n\nreturn false;'"
   * @generated
   */
  boolean equalsType(long arrayDimension, Type otherType, long otherArrayDimension);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param arrayDimension
   *  @param otherType
   *  @param otherArrayType
   *  @return if the other type is equal to me or a super type of me
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(otherType == null) {\n\treturn false;\n}\n\norg.emftext.language.java.types.Type _this = this;\n\nif (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier || otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {\n\torg.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> _thisTypeList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.Type>();\n\torg.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> otherTypeList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.Type>();\n\tif (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {\n\t\tfor( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)_this).getSuperTypes()) {\n\t\t\t_thisTypeList.add(( org.emftext.language.java.types.Type)aType);\n\t\t}\n\t}\n\telse {\n\t\t_thisTypeList.add(_this);\n\t}\n\tif (otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {\n\t\tfor( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)otherType).getSuperTypes()) {\n\t\t\totherTypeList.add(( org.emftext.language.java.types.Type)aType);\n\t\t}\n\t}\n\telse {\n\t\totherTypeList.add(_this);\n\t}\n\t\n\t\n\tfor( org.emftext.language.java.types.Type one_thisType : _thisTypeList) {\n\t\tfor( org.emftext.language.java.types.Type oneOtherType : otherTypeList) {\n\t\t\tboolean result = one_thisType.isSuperType(arrayDimension, oneOtherType, otherArrayType);\n\t\t\tif (result) {\n\t\t\t\treturn true;\n\t\t\t}\t\n\t\t}\n\t}\n\treturn false;\n}\n\n//if I am a void, I am of every type\nif (_this.equals(getLibClass(\"Void\"))) {\n\treturn true;\n}\n\n//if the other is Object I am a subtype in any case (also array dimensions do not matter)\nif (otherType.equals(getObjectClass())) {\n\treturn true;\n}\n\n//String, primitives, and arrays are serializable\norg.emftext.language.java.classifiers.ConcreteClassifier serializableClass = ( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\tgetConcreteClassifierProxy(\"java.io.Serializable\"), _this);\nif (otherType.equals(serializableClass)) {\n\tif (_this.equals(serializableClass)) {\n\t \t\t\treturn true;\n\t}\n\telse if (_this.equals(getStringClass())) {\n\t \t\t\treturn true;\n\t}\n\telse if (_this instanceof org.emftext.language.java.types.PrimitiveType) {\n\t\treturn true;\n\t}\n\telse if (arrayDimension > 0) {\n\t\t//all arrays are serializable\n\t\treturn true;\n\t}\n}\n\n//if one of us is a parameter to the best of my knowledge, we might match\nif(_this instanceof org.emftext.language.java.generics.TypeParameter) {\n\treturn true;\n}\nif(otherType instanceof org.emftext.language.java.generics.TypeParameter ) {\n\treturn true;\n}\n\n//if array dimensions do not match, I am no subtype\nboolean isTypeParameter = false;\t\t\nif (otherArrayType instanceof org.emftext.language.java.types.TypedElement) {\n\torg.emftext.language.java.types.Type type = (( org.emftext.language.java.types.TypedElement)otherArrayType).getTypeReference().getTarget();\n\tisTypeParameter = type instanceof org.emftext.language.java.generics.TypeParameter;\n}\nboolean isVariableLengthParameter = otherArrayType instanceof org.emftext.language.java.parameters.VariableLengthParameter;\n\nlong otherArrayDim = 0;\nif(otherArrayType != null) {\n\totherArrayDim = otherArrayType.getArrayDimension();\n}\n\nif (isTypeParameter && isVariableLengthParameter) {\n\tif(arrayDimension != otherArrayDim && \n\t\tarrayDimension != otherArrayDim- 1 && \n\t\tarrayDimension < otherArrayDim) {\n\t\t\n\t\treturn false;\n\t}\n}\nelse if (isTypeParameter) {\n\tif(arrayDimension < otherArrayDim) {\n\t\treturn false;\n\t}\n}\nelse if (isVariableLengthParameter) {\n\tif(arrayDimension != otherArrayDim && arrayDimension != otherArrayDim- 1) {\n\t\treturn false;\n\t}\n}\nelse {\n\tif(arrayDimension != otherArrayDim) {\n\t\treturn false;\n\t}\n}\n\n//annotations\nif(_this instanceof org.emftext.language.java.classifiers.Annotation && \n\t\t(otherType.equals(getAnnotationInterface()) ||\n\t\t\t\t(( org.emftext.language.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(\n\t\t\t\t\t).contains(getAnnotationInterface()))) {\n\treturn true;\n}\n\n//do comparison on the classifier level\nif (_this instanceof org.emftext.language.java.types.PrimitiveType) {\n\t_this = (( org.emftext.language.java.types.PrimitiveType) _this).wrapPrimitiveType();\n}\nif (otherType instanceof org.emftext.language.java.types.PrimitiveType) {\n\totherType = (( org.emftext.language.java.types.PrimitiveType) otherType).wrapPrimitiveType();\n}\n\n//compare in type hierarchy\nif (otherType instanceof org.emftext.language.java.classifiers.ConcreteClassifier && _this instanceof org.emftext.language.java.classifiers.ConcreteClassifier &&\n\t\t(otherType.equals(_this) || \n\t\t\t\t(( org.emftext.language.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(\n\t\t\t\t\t\t).contains(otherType))) {\n\treturn true;\n}\n\nif (otherType instanceof org.emftext.language.java.classifiers.ConcreteClassifier && _this instanceof org.emftext.language.java.classifiers.AnonymousClass &&\n\t\t(( org.emftext.language.java.classifiers.AnonymousClass)_this).getAllSuperClassifiers(\n\t\t\t\t).contains(otherType)) {\n\t\n\treturn true;\n}\n\n//everything can be implicitly casted to CharSequence, so I match when the other type is a CharSequence\norg.emftext.language.java.classifiers.Interface charSequenceClass = getLibInterface(\"CharSequence\");\n\nif (otherType instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {\n\tif(otherType.equals(charSequenceClass) ||\n\t\t\t(( org.emftext.language.java.classifiers.ConcreteClassifier)otherType).getAllSuperClassifiers(\n\t\t\t\t\t).contains(charSequenceClass)) {\n\t\treturn true;\n\t}\n}\n\n//there are some specifics for primitive types not reflected in the type hierarchy\nif (otherType instanceof org.emftext.language.java.classifiers.Class) {\n\torg.emftext.language.java.types.PrimitiveType primitiveType = (( org.emftext.language.java.classifiers.Class) otherType).unWrapPrimitiveType();\n\tif(primitiveType == null) {\n\t\treturn false;\n\t}\n\totherType = primitiveType;\n}\n\nif (_this instanceof org.emftext.language.java.classifiers.Class) {\n\torg.emftext.language.java.types.PrimitiveType primitiveType = (( org.emftext.language.java.classifiers.Class) _this).unWrapPrimitiveType();\n\tif(primitiveType == null) {\n\t\treturn false;\n\t}\n\t_this = primitiveType;\n}\n\nif (_this instanceof org.emftext.language.java.types.Boolean) {\n\tif (otherType instanceof org.emftext.language.java.types.Boolean) {\n\t\treturn true;\n\t}\n\telse {\n\t\treturn false;\n\t}\n}\nif (_this instanceof org.emftext.language.java.types.Byte ||\n\t\t_this instanceof org.emftext.language.java.types.Int ||\n\t\t_this instanceof org.emftext.language.java.types.Short ||\n\t\t_this instanceof org.emftext.language.java.types.Long ||\n\t\t_this instanceof org.emftext.language.java.types.Char) {\n\tif (otherType instanceof org.emftext.language.java.types.Byte ||\n\t\t\totherType instanceof org.emftext.language.java.types.Int ||\n\t\t\totherType instanceof org.emftext.language.java.types.Short ||\n\t\t\totherType instanceof org.emftext.language.java.types.Long ||\n\t\t\totherType instanceof org.emftext.language.java.types.Char ||\n\t\t\totherType instanceof org.emftext.language.java.types.Float ||\n\t\t\totherType instanceof org.emftext.language.java.types.Double) {\n\t\treturn true;\n\t}\n\telse {\n\t\treturn false;\n\t}\n}\nif (_this instanceof org.emftext.language.java.types.Float ||\n\t\t_this instanceof org.emftext.language.java.types.Double) {\n\tif (otherType instanceof org.emftext.language.java.types.Float ||\n\t\t\totherType instanceof org.emftext.language.java.types.Double) {\n\t\treturn true;\n\t}\n\telse {\n\t\treturn false;\n\t}\n}\n\nreturn false;'"
   * @generated
   */
  boolean isSuperType(long arrayDimension, Type otherType, ArrayTypeable otherArrayType);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//method has to be specified in subclasses\nthrow new java.lang.UnsupportedOperationException();'"
   * @generated
   */
  EList<Member> getAllMembers(Commentable context);

} // Type
