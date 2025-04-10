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
package org.emftext.language.java.arrays.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.arrays.ArrayInstantiation;
import org.emftext.language.java.arrays.ArraySelector;
import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.AndExpressionChild;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalAndExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InstanceOfExpressionChild;
import org.emftext.language.java.expressions.MultiplicativeExpressionChild;
import org.emftext.language.java.expressions.PrimaryExpression;
import org.emftext.language.java.expressions.RelationExpressionChild;
import org.emftext.language.java.expressions.ShiftExpressionChild;
import org.emftext.language.java.expressions.UnaryExpressionChild;
import org.emftext.language.java.expressions.UnaryModificationExpressionChild;

import org.emftext.language.java.expressions.impl.ExpressionImpl;

import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeArgument;
import org.emftext.language.java.generics.TypeArgumentable;

import org.emftext.language.java.references.Reference;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.arrays.impl.ArrayInstantiationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.emftext.language.java.arrays.impl.ArrayInstantiationImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.emftext.language.java.arrays.impl.ArrayInstantiationImpl#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArrayInstantiationImpl extends ExpressionImpl implements ArrayInstantiation
{
  /**
   * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeArguments()
   * @generated
   * @ordered
   */
  protected EList<TypeArgument> typeArguments;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected Reference next;

  /**
   * The cached value of the '{@link #getArraySelectors() <em>Array Selectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraySelectors()
   * @generated
   * @ordered
   */
  protected EList<ArraySelector> arraySelectors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayInstantiationImpl()
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
    return ArraysPackage.Literals.ARRAY_INSTANTIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeArgument> getTypeArguments()
  {
    if (typeArguments == null)
    {
      typeArguments = new EObjectContainmentEList.Resolving<TypeArgument>(TypeArgument.class, this, ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS);
    }
    return typeArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getNext()
  {
    if (next != null && next.eIsProxy())
    {
      InternalEObject oldNext = (InternalEObject)next;
      next = (Reference)eResolveProxy(oldNext);
      if (next != oldNext)
      {
        InternalEObject newNext = (InternalEObject)next;
        NotificationChain msgs = oldNext.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION__NEXT, null, null);
        if (newNext.eInternalContainer() == null)
        {
          msgs = newNext.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION__NEXT, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArraysPackage.ARRAY_INSTANTIATION__NEXT, oldNext, next));
      }
    }
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference basicGetNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNext(Reference newNext, NotificationChain msgs)
  {
    Reference oldNext = next;
    next = newNext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_INSTANTIATION__NEXT, oldNext, newNext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(Reference newNext)
  {
    if (newNext != next)
    {
      NotificationChain msgs = null;
      if (next != null)
        msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION__NEXT, null, msgs);
      if (newNext != null)
        msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArraysPackage.ARRAY_INSTANTIATION__NEXT, null, msgs);
      msgs = basicSetNext(newNext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArraysPackage.ARRAY_INSTANTIATION__NEXT, newNext, newNext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArraySelector> getArraySelectors()
  {
    if (arraySelectors == null)
    {
      arraySelectors = new EObjectContainmentEList.Resolving<ArraySelector>(ArraySelector.class, this, ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS);
    }
    return arraySelectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReferencedType()
  {
    if (this instanceof org.emftext.language.java.literals.Literal) {
      return (( org.emftext.language.java.literals.Literal) this).getType();
    }
    
    org.emftext.language.java.types.Type type = null;
    
    //referenced element point to a type
    if (this instanceof org.emftext.language.java.types.TypedElement) {
      org.emftext.language.java.types.TypeReference typeRef = (( org.emftext.language.java.types.TypedElement) this).getTypeReference();
      type = typeRef.getBoundTarget(this);
    }
    //element points to this or super
    else if (this instanceof org.emftext.language.java.references.SelfReference) {
      org.emftext.language.java.types.Type thisClass = null;
      if (this.getPrevious() != null) {
        thisClass = this.getPrevious().getReferencedType();
      }
      else {
        org.emftext.language.java.classifiers.AnonymousClass anonymousContainer = getContainingAnonymousClass();
        if (anonymousContainer != null) {
          thisClass = anonymousContainer;
        }
        else {
          thisClass = getContainingConcreteClassifier();	
        }
      }
      
      //find super class if "self" is "super"
      if ((( org.emftext.language.java.references.SelfReference) this).getSelf() instanceof org.emftext.language.java.literals.Super) {
        if (thisClass instanceof org.emftext.language.java.classifiers.Class) {
          return (( org.emftext.language.java.classifiers.Class)thisClass).getSuperClass();
        }
        if (thisClass instanceof org.emftext.language.java.classifiers.AnonymousClass) {
          return (( org.emftext.language.java.classifiers.AnonymousClass)thisClass).getSuperClassifier();
        }
      }
      
      return thisClass;
    }
    //element points to the object's class object
    else if(this instanceof org.emftext.language.java.references.ReflectiveClassReference) {
      return getClassClass();
    }
    //referenced element points to an element with a type
    else if (this instanceof org.emftext.language.java.references.ElementReference) {
      org.emftext.language.java.references.ReferenceableElement target = 
        ( org.emftext.language.java.references.ReferenceableElement) (( org.emftext.language.java.references.ElementReference) this).getTarget();
      if (target.eIsProxy()) {
        type = null;
      }
      
      //Navigate through AdditionalLocalVariable or Field
      if(target instanceof org.emftext.language.java.variables.AdditionalLocalVariable) {
        target = ( org.emftext.language.java.references.ReferenceableElement) target.eContainer();
      }
      if(target instanceof org.emftext.language.java.members.AdditionalField) {
        target = ( org.emftext.language.java.references.ReferenceableElement) target.eContainer();
      }
      if (target instanceof org.emftext.language.java.types.TypedElement) {
        org.emftext.language.java.types.TypeReference typeRef = (( org.emftext.language.java.types.TypedElement) target).getTypeReference();
        if (typeRef != null) {
          type = typeRef.getBoundTarget(this);
        }
      }
      else if (target instanceof org.emftext.language.java.types.Type /*e.g. Annotation*/ ) {
        return ( org.emftext.language.java.types.Type) target;
      }
      else if(target instanceof org.emftext.language.java.members.EnumConstant) {
        type = ( org.emftext.language.java.classifiers.Enumeration)target.eContainer();
      }	
    }
    //Strings may also appear as reference
    else if (this instanceof org.emftext.language.java.references.StringReference) {
      return getStringClass();
    }
    else if (this instanceof org.emftext.language.java.expressions.NestedExpression) {
      type = (( org.emftext.language.java.expressions.NestedExpression) this).getExpression().getType();
    }
    else if (this instanceof org.emftext.language.java.references.PrimitiveTypeReference) {
      type = (( org.emftext.language.java.references.PrimitiveTypeReference)this).getPrimitiveType();
    }
    else {
      assert(false);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getPrevious()
  {
    if (eContainer() instanceof org.emftext.language.java.references.Reference) { 
       org.emftext.language.java.references.Reference container = ( org.emftext.language.java.references.Reference) eContainer( ) ; 
        if (this.equals(container.getNext())) {
         return container;
       }
    }
    return null;
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
      case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
        return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
      case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
        return basicSetNext(null, msgs);
      case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
        return ((InternalEList<?>)getArraySelectors()).basicRemove(otherEnd, msgs);
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
      case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
        return getTypeArguments();
      case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
        if (resolve) return getNext();
        return basicGetNext();
      case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
        return getArraySelectors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        getTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
        return;
      case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
        setNext((Reference)newValue);
        return;
      case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
        getArraySelectors().clear();
        getArraySelectors().addAll((Collection<? extends ArraySelector>)newValue);
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
      case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        return;
      case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
        setNext((Reference)null);
        return;
      case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
        getArraySelectors().clear();
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
      case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS:
        return typeArguments != null && !typeArguments.isEmpty();
      case ArraysPackage.ARRAY_INSTANTIATION__NEXT:
        return next != null;
      case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS:
        return arraySelectors != null && !arraySelectors.isEmpty();
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
    if (baseClass == InstanceOfExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RelationExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ShiftExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AdditiveExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == MultiplicativeExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == UnaryExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == UnaryModificationExpressionChild.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PrimaryExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TypeArgumentable.class)
    {
      switch (derivedFeatureID)
      {
        case ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS: return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
        default: return -1;
      }
    }
    if (baseClass == Reference.class)
    {
      switch (derivedFeatureID)
      {
        case ArraysPackage.ARRAY_INSTANTIATION__NEXT: return ReferencesPackage.REFERENCE__NEXT;
        case ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS: return ReferencesPackage.REFERENCE__ARRAY_SELECTORS;
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
    if (baseClass == InstanceOfExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == RelationExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ShiftExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AdditiveExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == MultiplicativeExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == UnaryExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == UnaryModificationExpressionChild.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PrimaryExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TypeArgumentable.class)
    {
      switch (baseFeatureID)
      {
        case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS: return ArraysPackage.ARRAY_INSTANTIATION__TYPE_ARGUMENTS;
        default: return -1;
      }
    }
    if (baseClass == Reference.class)
    {
      switch (baseFeatureID)
      {
        case ReferencesPackage.REFERENCE__NEXT: return ArraysPackage.ARRAY_INSTANTIATION__NEXT;
        case ReferencesPackage.REFERENCE__ARRAY_SELECTORS: return ArraysPackage.ARRAY_INSTANTIATION__ARRAY_SELECTORS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ArrayInstantiationImpl
