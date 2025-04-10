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
package org.emftext.language.java.variables.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.arrays.ArrayDimension;
import org.emftext.language.java.arrays.ArrayTypeable;
import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.commons.impl.NamedElementImpl;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeArgument;
import org.emftext.language.java.generics.TypeArgumentable;

import org.emftext.language.java.references.ReferenceableElement;

import org.emftext.language.java.statements.Statement;

import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypedElement;
import org.emftext.language.java.types.TypesPackage;

import org.emftext.language.java.variables.Variable;
import org.emftext.language.java.variables.VariablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.variables.impl.VariableImpl#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link org.emftext.language.java.variables.impl.VariableImpl#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.emftext.language.java.variables.impl.VariableImpl#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 *   <li>{@link org.emftext.language.java.variables.impl.VariableImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableImpl extends NamedElementImpl implements Variable
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
   * The cached value of the '{@link #getArrayDimensionsBefore() <em>Array Dimensions Before</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayDimensionsBefore()
   * @generated
   * @ordered
   */
  protected EList<ArrayDimension> arrayDimensionsBefore;

  /**
   * The cached value of the '{@link #getArrayDimensionsAfter() <em>Array Dimensions After</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayDimensionsAfter()
   * @generated
   * @ordered
   */
  protected EList<ArrayDimension> arrayDimensionsAfter;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return VariablesPackage.Literals.VARIABLE;
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
        NotificationChain msgs = oldTypeReference.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__TYPE_REFERENCE, null, null);
        if (newTypeReference.eInternalContainer() == null)
        {
          msgs = newTypeReference.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__TYPE_REFERENCE, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariablesPackage.VARIABLE__TYPE_REFERENCE, oldTypeReference, typeReference));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
        msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__TYPE_REFERENCE, null, msgs);
      if (newTypeReference != null)
        msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.VARIABLE__TYPE_REFERENCE, null, msgs);
      msgs = basicSetTypeReference(newTypeReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.VARIABLE__TYPE_REFERENCE, newTypeReference, newTypeReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayDimension> getArrayDimensionsBefore()
  {
    if (arrayDimensionsBefore == null)
    {
      arrayDimensionsBefore = new EObjectContainmentEList.Resolving<ArrayDimension>(ArrayDimension.class, this, VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE);
    }
    return arrayDimensionsBefore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayDimension> getArrayDimensionsAfter()
  {
    if (arrayDimensionsAfter == null)
    {
      arrayDimensionsAfter = new EObjectContainmentEList.Resolving<ArrayDimension>(ArrayDimension.class, this, VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER);
    }
    return arrayDimensionsAfter;
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
      typeArguments = new EObjectContainmentEList.Resolving<TypeArgument>(TypeArgument.class, this, VariablesPackage.VARIABLE__TYPE_ARGUMENTS);
    }
    return typeArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getArrayDimension()
  {
    long size = this.getArrayDimensionsBefore().size() + this.getArrayDimensionsAfter().size();
    if (this instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
      size++;
    }
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createMethodCallStatement(String methodName, EList<Expression> arguments)
  {
    org.emftext.language.java.statements.ExpressionStatement callStatement = org.emftext.language.java.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
    callStatement.setExpression(createMethodCall(methodName, arguments));
    return callStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createMethodCall(String methodName, EList<Expression> arguments)
  {
    org.emftext.language.java.references.IdentifierReference thisRef = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createIdentifierReference();
    thisRef.setTarget(this);
    org.emftext.language.java.references.MethodCall methodCall = org.emftext.language.java.references.ReferencesFactory.eINSTANCE.createMethodCall();
    org.emftext.language.java.types.Type thisType = getTypeReference().getTarget();
    if (thisType instanceof org.emftext.language.java.members.MemberContainer) {
      org.emftext.language.java.members.MemberContainer castedType = ( org.emftext.language.java.members.MemberContainer) thisType;
      org.emftext.language.java.members.Method method = castedType.getContainedMethod(methodName);
      if (method == null) {
        return null;
      }
      methodCall.setTarget(method);
      // add arguments
      methodCall.getArguments().addAll(arguments);
      thisRef.setNext(methodCall);
      return thisRef;
    } else {
      return null;
    }
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
      case VariablesPackage.VARIABLE__TYPE_REFERENCE:
        return basicSetTypeReference(null, msgs);
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
        return ((InternalEList<?>)getArrayDimensionsBefore()).basicRemove(otherEnd, msgs);
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
        return ((InternalEList<?>)getArrayDimensionsAfter()).basicRemove(otherEnd, msgs);
      case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
        return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
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
      case VariablesPackage.VARIABLE__TYPE_REFERENCE:
        if (resolve) return getTypeReference();
        return basicGetTypeReference();
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
        return getArrayDimensionsBefore();
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
        return getArrayDimensionsAfter();
      case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
        return getTypeArguments();
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
      case VariablesPackage.VARIABLE__TYPE_REFERENCE:
        setTypeReference((TypeReference)newValue);
        return;
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
        getArrayDimensionsBefore().clear();
        getArrayDimensionsBefore().addAll((Collection<? extends ArrayDimension>)newValue);
        return;
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
        getArrayDimensionsAfter().clear();
        getArrayDimensionsAfter().addAll((Collection<? extends ArrayDimension>)newValue);
        return;
      case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
        getTypeArguments().clear();
        getTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
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
      case VariablesPackage.VARIABLE__TYPE_REFERENCE:
        setTypeReference((TypeReference)null);
        return;
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
        getArrayDimensionsBefore().clear();
        return;
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
        getArrayDimensionsAfter().clear();
        return;
      case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
        getTypeArguments().clear();
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
      case VariablesPackage.VARIABLE__TYPE_REFERENCE:
        return typeReference != null;
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE:
        return arrayDimensionsBefore != null && !arrayDimensionsBefore.isEmpty();
      case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER:
        return arrayDimensionsAfter != null && !arrayDimensionsAfter.isEmpty();
      case VariablesPackage.VARIABLE__TYPE_ARGUMENTS:
        return typeArguments != null && !typeArguments.isEmpty();
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
        case VariablesPackage.VARIABLE__TYPE_REFERENCE: return TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;
        default: return -1;
      }
    }
    if (baseClass == ArrayTypeable.class)
    {
      switch (derivedFeatureID)
      {
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE: return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;
        case VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER: return ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;
        default: return -1;
      }
    }
    if (baseClass == ReferenceableElement.class)
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
        case VariablesPackage.VARIABLE__TYPE_ARGUMENTS: return GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS;
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
        case TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE: return VariablesPackage.VARIABLE__TYPE_REFERENCE;
        default: return -1;
      }
    }
    if (baseClass == ArrayTypeable.class)
    {
      switch (baseFeatureID)
      {
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE: return VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE;
        case ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER: return VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER;
        default: return -1;
      }
    }
    if (baseClass == ReferenceableElement.class)
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
        case GenericsPackage.TYPE_ARGUMENTABLE__TYPE_ARGUMENTS: return VariablesPackage.VARIABLE__TYPE_ARGUMENTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //VariableImpl
