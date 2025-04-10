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
package org.emftext.language.java.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.annotations.AnnotationValue;

import org.emftext.language.java.arrays.ArrayInitializationValue;

import org.emftext.language.java.arrays.impl.ArrayTypeableImpl;

import org.emftext.language.java.expressions.AndExpressionChild;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalAndExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExclusiveOrExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.ExpressionsPackage;
import org.emftext.language.java.expressions.InclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InstanceOfExpression;
import org.emftext.language.java.expressions.InstanceOfExpressionChild;

import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElement;
import org.emftext.language.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.expressions.impl.InstanceOfExpressionImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.emftext.language.java.expressions.impl.InstanceOfExpressionImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceOfExpressionImpl extends ArrayTypeableImpl implements InstanceOfExpression
{
  /**
   * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeReference()
   * @generated
   * @ordered
   */
  protected TypeReference typeReference;

  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected InstanceOfExpressionChild child;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceOfExpressionImpl()
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
    return ExpressionsPackage.Literals.INSTANCE_OF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getTypeReference()
  {
    if (typeReference != null && typeReference.eIsProxy())
    {
      InternalEObject oldTypeReference = (InternalEObject)typeReference;
      typeReference = (TypeReference)eResolveProxy(oldTypeReference);
      if (typeReference != oldTypeReference)
      {
        InternalEObject newTypeReference = (InternalEObject)typeReference;
        NotificationChain msgs = oldTypeReference.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, null);
        if (newTypeReference.eInternalContainer() == null)
        {
          msgs = newTypeReference.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, oldTypeReference, typeReference));
      }
    }
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference basicGetTypeReference()
  {
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeReference(TypeReference newTypeReference, NotificationChain msgs)
  {
    TypeReference oldTypeReference = typeReference;
    typeReference = newTypeReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, oldTypeReference, newTypeReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeReference(TypeReference newTypeReference)
  {
    if (newTypeReference != typeReference)
    {
      NotificationChain msgs = null;
      if (typeReference != null)
        msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
      if (newTypeReference != null)
        msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, null, msgs);
      msgs = basicSetTypeReference(newTypeReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE, newTypeReference, newTypeReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOfExpressionChild getChild()
  {
    if (child != null && child.eIsProxy())
    {
      InternalEObject oldChild = (InternalEObject)child;
      child = (InstanceOfExpressionChild)eResolveProxy(oldChild);
      if (child != oldChild)
      {
        InternalEObject newChild = (InternalEObject)child;
        NotificationChain msgs = oldChild.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, null);
        if (newChild.eInternalContainer() == null)
        {
          msgs = newChild.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, oldChild, child));
      }
    }
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOfExpressionChild basicGetChild()
  {
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChild(InstanceOfExpressionChild newChild, NotificationChain msgs)
  {
    InstanceOfExpressionChild oldChild = child;
    child = newChild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, oldChild, newChild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChild(InstanceOfExpressionChild newChild)
  {
    if (newChild != child)
    {
      NotificationChain msgs = null;
      if (child != null)
        msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
      if (newChild != null)
        msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, null, msgs);
      msgs = basicSetChild(newChild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD, newChild, newChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return getOneType(false);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getAlternativeType()
  {
    return getOneType(true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getOneType(boolean alternative)
  {
    org.emftext.language.java.classifiers.Class stringClass = getStringClass();
    
    org.emftext.language.java.types.Type type = null;
    
    if (this instanceof org.emftext.language.java.references.Reference) {
      org.emftext.language.java.references.Reference reference = ( org.emftext.language.java.references.Reference) this;
      //navigate down references
      while(reference.getNext() != null) {
        reference = reference.getNext();
      }
      type = reference.getReferencedType();
    }
    else if (this instanceof org.emftext.language.java.literals.Literal) {
      type = (( org.emftext.language.java.literals.Literal) this).getType();
    }
    else if (this instanceof org.emftext.language.java.expressions.CastExpression) {
      type = (( org.emftext.language.java.expressions.CastExpression)this).getTypeReference().getTarget();
    }
    else if (this instanceof org.emftext.language.java.expressions.AssignmentExpression) {
      type = (( org.emftext.language.java.expressions.AssignmentExpression) this).getChild().getOneType(alternative);
    }
    else if (this instanceof org.emftext.language.java.expressions.ConditionalExpression &&
        (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {
      if (alternative) {
        type = (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionElse().getOneType(alternative);
      }
      else {
        type = (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf().getOneType(alternative);
      }
      
    }
    else if (this instanceof org.emftext.language.java.expressions.EqualityExpression ||
        this instanceof org.emftext.language.java.expressions.RelationExpression ||
        this instanceof org.emftext.language.java.expressions.ConditionalOrExpression ||
        this instanceof org.emftext.language.java.expressions.ConditionalAndExpression ||
        this instanceof org.emftext.language.java.expressions.InstanceOfExpression ) {
      type = getLibClass("Boolean");
    }
    else if (this instanceof org.emftext.language.java.expressions.AdditiveExpression ||
        this instanceof org.emftext.language.java.expressions.MultiplicativeExpression ||
        this instanceof org.emftext.language.java.expressions.InclusiveOrExpression ||
        this instanceof org.emftext.language.java.expressions.ExclusiveOrExpression ||
        this instanceof org.emftext.language.java.expressions.AndExpression ||
        this instanceof org.emftext.language.java.expressions.ShiftExpression ) {
      
      if (this instanceof org.emftext.language.java.expressions.AdditiveExpression) {
        org.emftext.language.java.expressions.AdditiveExpression additiveExpression = ( org.emftext.language.java.expressions.AdditiveExpression) this;
        for( org.emftext.language.java.expressions.Expression subExp : additiveExpression.getChildren()) {
          if (stringClass.equals(subExp.getOneType(alternative))) {
            //special case: string concatenation
            return stringClass;
          }
        }
      }
      
      @SuppressWarnings("unchecked")
      org.emftext.language.java.expressions.Expression subExp = (( org.eclipse.emf.common.util.EList< org.emftext.language.java.expressions.Expression>) 
          this.eGet(this.eClass().getEStructuralFeature("children"))).get(0);
      
      return subExp.getOneType(alternative);
    }
    else if (this instanceof org.emftext.language.java.expressions.UnaryExpression) {
      org.emftext.language.java.expressions.Expression subExp = (( org.emftext.language.java.expressions.UnaryExpression)this).getChild();
      
      return subExp.getOneType(alternative);
    }
    else for( org.eclipse.emf.common.util.TreeIterator< org.eclipse.emf.ecore.EObject> i = this.eAllContents(); i.hasNext(); ) {
      org.eclipse.emf.ecore.EObject next = i.next();
      org.emftext.language.java.types.Type nextType = null;
    
      if (next instanceof org.emftext.language.java.expressions.PrimaryExpression) {
    
        if (next instanceof org.emftext.language.java.references.Reference) {
          org.emftext.language.java.references.Reference ref = ( org.emftext.language.java.references.Reference) next;
          //navigate down references
          while(ref.getNext() != null) {
            ref = ref.getNext();
          }
          next = ref;
        }
        if (next instanceof org.emftext.language.java.literals.Literal) {
          nextType = (( org.emftext.language.java.literals.Literal) next).getType();
        }
        else if (next instanceof org.emftext.language.java.expressions.CastExpression) {
          nextType = (( org.emftext.language.java.expressions.CastExpression)next).getTypeReference().getTarget();
        }
        else {
          nextType = (( org.emftext.language.java.references.Reference) next).getReferencedType();
        }
        i.prune();
    
      }
      if (nextType != null) {
        type = nextType;
        //in the special case that this is an expression with
        //some string included, everything is converted to string
        if (stringClass.equals(type)) {
          break;
        }
      }
    }
    //type can be null in cases of unresolved/unresolvable proxies
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getArrayDimension()
  {
    long size = 0;
    org.emftext.language.java.arrays.ArrayTypeable arrayType = null;
    if (this instanceof org.emftext.language.java.expressions.NestedExpression && 
        (( org.emftext.language.java.expressions.NestedExpression)this).getNext() == null) {
      return (( org.emftext.language.java.expressions.NestedExpression) this).getExpression().getArrayDimension()
        - (( org.emftext.language.java.expressions.NestedExpression)this).getArraySelectors().size();
    }
    if (this instanceof org.emftext.language.java.expressions.ConditionalExpression &&
        (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf() != null) {		
      return (( org.emftext.language.java.expressions.ConditionalExpression)this).getExpressionIf().getArrayDimension();
    }
    if (this instanceof org.emftext.language.java.expressions.AssignmentExpression) {
      org.emftext.language.java.expressions.Expression value = (( org.emftext.language.java.expressions.AssignmentExpression) this).getValue();
      if (value == null) {
        return 0;
      }
      return value.getArrayDimension();
    }
    if (this instanceof org.emftext.language.java.expressions.InstanceOfExpression) {
      return 0;
    }
    if (this instanceof org.emftext.language.java.references.Reference) {
      org.emftext.language.java.references.Reference reference = ( org.emftext.language.java.references.Reference) this;
      while (reference.getNext() != null) {
        reference = reference.getNext();
      }
      //an array clone? -> dimension defined by cloned array
      if (reference instanceof org.emftext.language.java.references.ElementReference && 
          reference.getPrevious() != null) {
        org.emftext.language.java.references.ReferenceableElement target = (( org.emftext.language.java.references.ElementReference)reference).getTarget();
        if (target instanceof org.emftext.language.java.members.Method) {
          if("clone".equals((( org.emftext.language.java.members.Method)target).getName())) {
            reference = ( org.emftext.language.java.references.Reference) reference.eContainer();
          }
        }
      }
      
      if (reference instanceof org.emftext.language.java.references.ElementReference) {
        org.emftext.language.java.references.ElementReference elementReference = ( org.emftext.language.java.references.ElementReference) reference;
        if (elementReference.getTarget() instanceof org.emftext.language.java.arrays.ArrayTypeable) {
          arrayType = ( org.emftext.language.java.arrays.ArrayTypeable) elementReference.getTarget();
        }
        if (elementReference.getTarget() instanceof org.emftext.language.java.variables.AdditionalLocalVariable) {
          org.emftext.language.java.variables.AdditionalLocalVariable additionalLocalVariable = ( org.emftext.language.java.variables.AdditionalLocalVariable) elementReference.getTarget();
          arrayType = ( org.emftext.language.java.variables.LocalVariable) additionalLocalVariable.eContainer();
          size += additionalLocalVariable.getArrayDimensionsAfter().size();
          size -= arrayType.getArrayDimensionsAfter().size();
        }
        if (elementReference.getTarget() instanceof org.emftext.language.java.members.AdditionalField) {
          org.emftext.language.java.members.AdditionalField additionalField = ( org.emftext.language.java.members.AdditionalField) elementReference.getTarget();
          arrayType = ( org.emftext.language.java.members.Field) additionalField.eContainer();
          size += additionalField.getArrayDimensionsAfter().size();
          size -= arrayType.getArrayDimensionsAfter().size();
        }
      }
      else if (this instanceof org.emftext.language.java.arrays.ArrayTypeable) {
        size += (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();
        if (this instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
          size++;
        }
      }
      size -= reference.getArraySelectors().size();
    }
    else if (this instanceof org.emftext.language.java.arrays.ArrayTypeable) {
      size += (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsBefore().size() + (( org.emftext.language.java.arrays.ArrayTypeable)this).getArrayDimensionsAfter().size();
      if (this instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
        size++;
      }
    }
    
    if(this instanceof org.emftext.language.java.arrays.ArrayInstantiationBySize) {
      size += (( org.emftext.language.java.arrays.ArrayInstantiationBySize)this).getSizes().size();
    }
    
    if(arrayType != null) {
      size += arrayType.getArrayDimension();
    }
    
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
        return basicSetTypeReference(null, msgs);
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
        return basicSetChild(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
        if (resolve) return getTypeReference();
        return basicGetTypeReference();
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
        if (resolve) return getChild();
        return basicGetChild();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
        setTypeReference((TypeReference)newValue);
        return;
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
        setChild((InstanceOfExpressionChild)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
        setTypeReference((TypeReference)null);
        return;
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
        setChild((InstanceOfExpressionChild)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE:
        return typeReference != null;
      case ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD:
        return child != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypedElement.class)
    {
      switch (derivedFeatureID)
      {
        case ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE: return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
        default: return -1;
      }
    }
    if (baseClass == ArrayInitializationValue.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AnnotationValue.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AssignmentExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConditionalExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConditionalOrExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConditionalAndExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == InclusiveOrExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExclusiveOrExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AndExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EqualityExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypedElement.class)
    {
      switch (baseFeatureID)
      {
        case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE: return ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE;
        default: return -1;
      }
    }
    if (baseClass == ArrayInitializationValue.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AnnotationValue.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AssignmentExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConditionalExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConditionalOrExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ConditionalAndExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == InclusiveOrExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExclusiveOrExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AndExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EqualityExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //InstanceOfExpressionImpl
