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
package org.emftext.language.java.classifiers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.classifiers.ClassifiersPackage;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;

import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.classifiers.impl.InterfaceImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.impl.InterfaceImpl#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ConcreteClassifierImpl implements Interface
{
  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<TypeReference> extends_;

  /**
   * The cached value of the '{@link #getDefaultExtends() <em>Default Extends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultExtends()
   * @generated
   * @ordered
   */
  protected EList<TypeReference> defaultExtends;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceImpl()
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
    return ClassifiersPackage.Literals.INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeReference> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, ClassifiersPackage.INTERFACE__EXTENDS);
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeReference> getDefaultExtends()
  {
    if (defaultExtends == null)
    {
      defaultExtends = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS);
    }
    return defaultExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteClassifier> getAllSuperClassifiers()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
    
    for ( org.emftext.language.java.types.TypeReference typeArg : this.getExtends()) {
      //use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface
      org.emftext.language.java.classifiers.ConcreteClassifier superInterface = ( org.emftext.language.java.classifiers.ConcreteClassifier) typeArg.getTarget();
      if (superInterface != null) {
        result.add(superInterface);
        if (superInterface instanceof org.emftext.language.java.classifiers.Interface) {
          result.addAll((( org.emftext.language.java.classifiers.Interface)superInterface).getAllSuperClassifiers());
        }
      }
    }
    
    for ( org.emftext.language.java.types.TypeReference typeArg : this.getDefaultExtends()) {
      //use ConcreteClassifier instead of Interface because java.lang.Object can also act as implemented interface
      org.emftext.language.java.classifiers.ConcreteClassifier superInterface = ( org.emftext.language.java.classifiers.ConcreteClassifier) typeArg.getTarget();
      if (superInterface != null) {
        result.add(superInterface);
        if (superInterface instanceof org.emftext.language.java.classifiers.Interface) {
          result.addAll((( org.emftext.language.java.classifiers.Interface)superInterface).getAllSuperClassifiers());
        }
      }
    }
    return result;
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
      case ClassifiersPackage.INTERFACE__EXTENDS:
        return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
      case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
        return ((InternalEList<?>)getDefaultExtends()).basicRemove(otherEnd, msgs);
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
      case ClassifiersPackage.INTERFACE__EXTENDS:
        return getExtends();
      case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
        return getDefaultExtends();
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
      case ClassifiersPackage.INTERFACE__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends TypeReference>)newValue);
        return;
      case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
        getDefaultExtends().clear();
        getDefaultExtends().addAll((Collection<? extends TypeReference>)newValue);
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
      case ClassifiersPackage.INTERFACE__EXTENDS:
        getExtends().clear();
        return;
      case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
        getDefaultExtends().clear();
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
      case ClassifiersPackage.INTERFACE__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case ClassifiersPackage.INTERFACE__DEFAULT_EXTENDS:
        return defaultExtends != null && !defaultExtends.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceImpl
