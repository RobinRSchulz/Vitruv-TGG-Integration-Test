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
package org.emftext.language.java.references.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.generics.CallTypeArgumentable;
import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeArgument;

import org.emftext.language.java.references.Argumentable;
import org.emftext.language.java.references.MethodCall;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.impl.MethodCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.emftext.language.java.references.impl.MethodCallImpl#getCallTypeArguments <em>Call Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallImpl extends ElementReferenceImpl implements MethodCall
{
  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Expression> arguments;

  /**
   * The cached value of the '{@link #getCallTypeArguments() <em>Call Type Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallTypeArguments()
   * @generated
   * @ordered
   */
  protected EList<TypeArgument> callTypeArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodCallImpl()
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
    return ReferencesPackage.Literals.METHOD_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this, ReferencesPackage.METHOD_CALL__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeArgument> getCallTypeArguments()
  {
    if (callTypeArguments == null)
    {
      callTypeArguments = new EObjectContainmentEList.Resolving<TypeArgument>(TypeArgument.class, this, ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS);
    }
    return callTypeArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getArgumentTypes()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> resultList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.types.Type>();
    
    for( org.emftext.language.java.expressions.Expression exp : getArguments()) {
      org.emftext.language.java.types.Type type = exp.getType();
      resultList.add(type);
    }
    return resultList;
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
      case ReferencesPackage.METHOD_CALL__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
        return ((InternalEList<?>)getCallTypeArguments()).basicRemove(otherEnd, msgs);
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
      case ReferencesPackage.METHOD_CALL__ARGUMENTS:
        return getArguments();
      case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
        return getCallTypeArguments();
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
      case ReferencesPackage.METHOD_CALL__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Expression>)newValue);
        return;
      case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
        getCallTypeArguments().clear();
        getCallTypeArguments().addAll((Collection<? extends TypeArgument>)newValue);
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
      case ReferencesPackage.METHOD_CALL__ARGUMENTS:
        getArguments().clear();
        return;
      case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
        getCallTypeArguments().clear();
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
      case ReferencesPackage.METHOD_CALL__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS:
        return callTypeArguments != null && !callTypeArguments.isEmpty();
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
    if (baseClass == Argumentable.class)
    {
      switch (derivedFeatureID)
      {
        case ReferencesPackage.METHOD_CALL__ARGUMENTS: return ReferencesPackage.ARGUMENTABLE__ARGUMENTS;
        default: return -1;
      }
    }
    if (baseClass == CallTypeArgumentable.class)
    {
      switch (derivedFeatureID)
      {
        case ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS: return GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS;
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
    if (baseClass == Argumentable.class)
    {
      switch (baseFeatureID)
      {
        case ReferencesPackage.ARGUMENTABLE__ARGUMENTS: return ReferencesPackage.METHOD_CALL__ARGUMENTS;
        default: return -1;
      }
    }
    if (baseClass == CallTypeArgumentable.class)
    {
      switch (baseFeatureID)
      {
        case GenericsPackage.CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS: return ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //MethodCallImpl
