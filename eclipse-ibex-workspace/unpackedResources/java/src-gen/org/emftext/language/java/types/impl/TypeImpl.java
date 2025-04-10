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
package org.emftext.language.java.types.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.java.arrays.ArrayTypeable;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.commons.impl.CommentableImpl;

import org.emftext.language.java.members.Member;

import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends CommentableImpl implements Type
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TypesPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean equalsType(long arrayDimension, Type otherType, long otherArrayDimension)
  {
    org.emftext.language.java.types.Type _this = this;
    //comparison for type parameters
    if (_this instanceof org.emftext.language.java.generics.TypeParameter) {
      org.emftext.language.java.generics.TypeParameter typeParameter = ( org.emftext.language.java.generics.TypeParameter) _this;
      for ( org.emftext.language.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {
        if (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && referencedType.getTarget().equalsType(arrayDimension, otherType, otherArrayDimension)) {
          return true;
        }
      }
      if (typeParameter.getExtendTypes().isEmpty()) {
        if (getObjectClass().equalsType(arrayDimension, otherType, otherArrayDimension)) {
          return true;
        }
      }
    } 
    if (otherType instanceof org.emftext.language.java.generics.TypeParameter) {
      org.emftext.language.java.generics.TypeParameter typeParameter = ( org.emftext.language.java.generics.TypeParameter) otherType;
      for ( org.emftext.language.java.types.TypeReference referencedType : typeParameter.getExtendTypes()) {
        if (referencedType.getTarget() != null && !referencedType.getTarget().eIsProxy() && equalsType(arrayDimension, referencedType.getTarget(), otherArrayDimension)) {
          return true;
        }
      }
      if (typeParameter.getExtendTypes().isEmpty()) {
        if (equalsType(arrayDimension, getObjectClass(), otherArrayDimension)) {
          return true;
        }
      }
    }
    
    //do comparison on the classifier level
    if (_this instanceof org.emftext.language.java.types.PrimitiveType) {
      _this = (( org.emftext.language.java.types.PrimitiveType)_this).wrapPrimitiveType();
    }
    if (otherType instanceof org.emftext.language.java.types.PrimitiveType) {
      otherType = (( org.emftext.language.java.types.PrimitiveType) otherType).wrapPrimitiveType();
    }
    
    if (arrayDimension == otherArrayDimension &&
        otherType instanceof org.emftext.language.java.classifiers.Classifier && _this instanceof org.emftext.language.java.classifiers.Classifier &&
        (otherType.equals(_this))) {	
      return true;
    }
    
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSuperType(long arrayDimension, Type otherType, ArrayTypeable otherArrayType)
  {
    if(otherType == null) {
      return false;
    }
    
    org.emftext.language.java.types.Type _this = this;
    
    if (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier || otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
      org.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> _thisTypeList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.Type>();
      org.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> otherTypeList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.Type>();
      if (_this instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
        for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)_this).getSuperTypes()) {
          _thisTypeList.add(( org.emftext.language.java.types.Type)aType);
        }
      }
      else {
        _thisTypeList.add(_this);
      }
      if (otherType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
        for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)otherType).getSuperTypes()) {
          otherTypeList.add(( org.emftext.language.java.types.Type)aType);
        }
      }
      else {
        otherTypeList.add(_this);
      }
      
      
      for( org.emftext.language.java.types.Type one_thisType : _thisTypeList) {
        for( org.emftext.language.java.types.Type oneOtherType : otherTypeList) {
          boolean result = one_thisType.isSuperType(arrayDimension, oneOtherType, otherArrayType);
          if (result) {
            return true;
          }	
        }
      }
      return false;
    }
    
    //if I am a void, I am of every type
    if (_this.equals(getLibClass("Void"))) {
      return true;
    }
    
    //if the other is Object I am a subtype in any case (also array dimensions do not matter)
    if (otherType.equals(getObjectClass())) {
      return true;
    }
    
    //String, primitives, and arrays are serializable
    org.emftext.language.java.classifiers.ConcreteClassifier serializableClass = ( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
        getConcreteClassifierProxy("java.io.Serializable"), _this);
    if (otherType.equals(serializableClass)) {
      if (_this.equals(serializableClass)) {
       			return true;
      }
      else if (_this.equals(getStringClass())) {
       			return true;
      }
      else if (_this instanceof org.emftext.language.java.types.PrimitiveType) {
        return true;
      }
      else if (arrayDimension > 0) {
        //all arrays are serializable
        return true;
      }
    }
    
    //if one of us is a parameter to the best of my knowledge, we might match
    if(_this instanceof org.emftext.language.java.generics.TypeParameter) {
      return true;
    }
    if(otherType instanceof org.emftext.language.java.generics.TypeParameter ) {
      return true;
    }
    
    //if array dimensions do not match, I am no subtype
    boolean isTypeParameter = false;		
    if (otherArrayType instanceof org.emftext.language.java.types.TypedElement) {
      org.emftext.language.java.types.Type type = (( org.emftext.language.java.types.TypedElement)otherArrayType).getTypeReference().getTarget();
      isTypeParameter = type instanceof org.emftext.language.java.generics.TypeParameter;
    }
    boolean isVariableLengthParameter = otherArrayType instanceof org.emftext.language.java.parameters.VariableLengthParameter;
    
    long otherArrayDim = 0;
    if(otherArrayType != null) {
      otherArrayDim = otherArrayType.getArrayDimension();
    }
    
    if (isTypeParameter && isVariableLengthParameter) {
      if(arrayDimension != otherArrayDim && 
        arrayDimension != otherArrayDim- 1 && 
        arrayDimension < otherArrayDim) {
        
        return false;
      }
    }
    else if (isTypeParameter) {
      if(arrayDimension < otherArrayDim) {
        return false;
      }
    }
    else if (isVariableLengthParameter) {
      if(arrayDimension != otherArrayDim && arrayDimension != otherArrayDim- 1) {
        return false;
      }
    }
    else {
      if(arrayDimension != otherArrayDim) {
        return false;
      }
    }
    
    //annotations
    if(_this instanceof org.emftext.language.java.classifiers.Annotation && 
        (otherType.equals(getAnnotationInterface()) ||
            (( org.emftext.language.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(
              ).contains(getAnnotationInterface()))) {
      return true;
    }
    
    //do comparison on the classifier level
    if (_this instanceof org.emftext.language.java.types.PrimitiveType) {
      _this = (( org.emftext.language.java.types.PrimitiveType) _this).wrapPrimitiveType();
    }
    if (otherType instanceof org.emftext.language.java.types.PrimitiveType) {
      otherType = (( org.emftext.language.java.types.PrimitiveType) otherType).wrapPrimitiveType();
    }
    
    //compare in type hierarchy
    if (otherType instanceof org.emftext.language.java.classifiers.ConcreteClassifier && _this instanceof org.emftext.language.java.classifiers.ConcreteClassifier &&
        (otherType.equals(_this) || 
            (( org.emftext.language.java.classifiers.ConcreteClassifier)_this).getAllSuperClassifiers(
                ).contains(otherType))) {
      return true;
    }
    
    if (otherType instanceof org.emftext.language.java.classifiers.ConcreteClassifier && _this instanceof org.emftext.language.java.classifiers.AnonymousClass &&
        (( org.emftext.language.java.classifiers.AnonymousClass)_this).getAllSuperClassifiers(
            ).contains(otherType)) {
      
      return true;
    }
    
    //everything can be implicitly casted to CharSequence, so I match when the other type is a CharSequence
    org.emftext.language.java.classifiers.Interface charSequenceClass = getLibInterface("CharSequence");
    
    if (otherType instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
      if(otherType.equals(charSequenceClass) ||
          (( org.emftext.language.java.classifiers.ConcreteClassifier)otherType).getAllSuperClassifiers(
              ).contains(charSequenceClass)) {
        return true;
      }
    }
    
    //there are some specifics for primitive types not reflected in the type hierarchy
    if (otherType instanceof org.emftext.language.java.classifiers.Class) {
      org.emftext.language.java.types.PrimitiveType primitiveType = (( org.emftext.language.java.classifiers.Class) otherType).unWrapPrimitiveType();
      if(primitiveType == null) {
        return false;
      }
      otherType = primitiveType;
    }
    
    if (_this instanceof org.emftext.language.java.classifiers.Class) {
      org.emftext.language.java.types.PrimitiveType primitiveType = (( org.emftext.language.java.classifiers.Class) _this).unWrapPrimitiveType();
      if(primitiveType == null) {
        return false;
      }
      _this = primitiveType;
    }
    
    if (_this instanceof org.emftext.language.java.types.Boolean) {
      if (otherType instanceof org.emftext.language.java.types.Boolean) {
        return true;
      }
      else {
        return false;
      }
    }
    if (_this instanceof org.emftext.language.java.types.Byte ||
        _this instanceof org.emftext.language.java.types.Int ||
        _this instanceof org.emftext.language.java.types.Short ||
        _this instanceof org.emftext.language.java.types.Long ||
        _this instanceof org.emftext.language.java.types.Char) {
      if (otherType instanceof org.emftext.language.java.types.Byte ||
          otherType instanceof org.emftext.language.java.types.Int ||
          otherType instanceof org.emftext.language.java.types.Short ||
          otherType instanceof org.emftext.language.java.types.Long ||
          otherType instanceof org.emftext.language.java.types.Char ||
          otherType instanceof org.emftext.language.java.types.Float ||
          otherType instanceof org.emftext.language.java.types.Double) {
        return true;
      }
      else {
        return false;
      }
    }
    if (_this instanceof org.emftext.language.java.types.Float ||
        _this instanceof org.emftext.language.java.types.Double) {
      if (otherType instanceof org.emftext.language.java.types.Float ||
          otherType instanceof org.emftext.language.java.types.Double) {
        return true;
      }
      else {
        return false;
      }
    }
    
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getAllMembers(Commentable context)
  {
    //method has to be specified in subclasses
    throw new java.lang.UnsupportedOperationException();
  }

} //TypeImpl
