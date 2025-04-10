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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.classifiers.ClassifiersPackage;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Implementor;

import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.classifiers.impl.ClassImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.impl.ClassImpl#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ConcreteClassifierImpl implements org.emftext.language.java.classifiers.Class
{
  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected EList<TypeReference> implements_;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected TypeReference extends_;

  /**
   * The cached value of the '{@link #getDefaultExtends() <em>Default Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultExtends()
   * @generated
   * @ordered
   */
  protected TypeReference defaultExtends;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return ClassifiersPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeReference> getImplements()
  {
    if (implements_ == null)
    {
      implements_ = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, ClassifiersPackage.CLASS__IMPLEMENTS);
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (TypeReference)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        InternalEObject newExtends = (InternalEObject)extends_;
        NotificationChain msgs = oldExtends.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__EXTENDS, null, null);
        if (newExtends.eInternalContainer() == null)
        {
          msgs = newExtends.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__EXTENDS, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassifiersPackage.CLASS__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(TypeReference newExtends, NotificationChain msgs)
  {
    TypeReference oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassifiersPackage.CLASS__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(TypeReference newExtends)
  {
    if (newExtends != extends_)
    {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassifiersPackage.CLASS__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference getDefaultExtends()
  {
    if (defaultExtends != null && defaultExtends.eIsProxy())
    {
      InternalEObject oldDefaultExtends = (InternalEObject)defaultExtends;
      defaultExtends = (TypeReference)eResolveProxy(oldDefaultExtends);
      if (defaultExtends != oldDefaultExtends)
      {
        InternalEObject newDefaultExtends = (InternalEObject)defaultExtends;
        NotificationChain msgs = oldDefaultExtends.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__DEFAULT_EXTENDS, null, null);
        if (newDefaultExtends.eInternalContainer() == null)
        {
          msgs = newDefaultExtends.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__DEFAULT_EXTENDS, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassifiersPackage.CLASS__DEFAULT_EXTENDS, oldDefaultExtends, defaultExtends));
      }
    }
    return defaultExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference basicGetDefaultExtends()
  {
    return defaultExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultExtends(TypeReference newDefaultExtends, NotificationChain msgs)
  {
    TypeReference oldDefaultExtends = defaultExtends;
    defaultExtends = newDefaultExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassifiersPackage.CLASS__DEFAULT_EXTENDS, oldDefaultExtends, newDefaultExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultExtends(TypeReference newDefaultExtends)
  {
    if (newDefaultExtends != defaultExtends)
    {
      NotificationChain msgs = null;
      if (defaultExtends != null)
        msgs = ((InternalEObject)defaultExtends).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__DEFAULT_EXTENDS, null, msgs);
      if (newDefaultExtends != null)
        msgs = ((InternalEObject)newDefaultExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassifiersPackage.CLASS__DEFAULT_EXTENDS, null, msgs);
      msgs = basicSetDefaultExtends(newDefaultExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassifiersPackage.CLASS__DEFAULT_EXTENDS, newDefaultExtends, newDefaultExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteClassifier> getAllSuperClassifiers()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = 
      new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
          
    //collects all superclasses first
    org.emftext.language.java.classifiers.Class superClass = this;
    while (superClass != null && !superClass.eIsProxy() && 
        !superClass.equals(getObjectClass())) {
      superClass = superClass.getSuperClass();
      if (superClass != null) {
        result.add(superClass);
      }
    }
    
    //collect all implemented interfaces
    for ( org.emftext.language.java.types.TypeReference typeArg : this.getImplements()) {
      org.emftext.language.java.classifiers.ConcreteClassifier superInterface = ( org.emftext.language.java.classifiers.ConcreteClassifier) typeArg.getTarget();
      if (superInterface != null) {
        result.add(superInterface);
        if (superInterface instanceof org.emftext.language.java.classifiers.Interface) {
          result.addAll((( org.emftext.language.java.classifiers.Interface)superInterface).getAllSuperClassifiers());
        }
      }
    }
    
    //collect all implemented interfaces of super classes
    superClass = this.getSuperClass();	
    if (superClass != null && !superClass.eIsProxy() && 
        !superClass.equals(getObjectClass())) {
      result.addAll(superClass.getAllSuperClassifiers());
    }	
    
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.emftext.language.java.classifiers.Class getSuperClass()
  {
    org.emftext.language.java.types.TypeReference superClassReference = this.getExtends();
    if (superClassReference == null) {
      superClassReference = this.getDefaultExtends();
    }
    if (superClassReference == null) {
      return null;
    }
    org.emftext.language.java.types.Type result = superClassReference.getTarget();
    if (result instanceof org.emftext.language.java.classifiers.Class) {
      return ( org.emftext.language.java.classifiers.Class) result;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType unWrapPrimitiveType()
  {
    if (getLibClass("Boolean").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createBoolean();
    }
    if (getLibClass("Byte").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createByte();
    }
    if (getLibClass("Character").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createChar();
    }
    if (getLibClass("Float").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createFloat();
    }
    if (getLibClass("Double").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createDouble();
    }
    if (getLibClass("Integer").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createInt();
    }
    if (getLibClass("Long").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createLong();
    }
    if (getLibClass("Short").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createShort();
    }
    if (getLibClass("Void").equals(this)) {
      return org.emftext.language.java.types.TypesFactory.eINSTANCE.createVoid();
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
      case ClassifiersPackage.CLASS__IMPLEMENTS:
        return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
      case ClassifiersPackage.CLASS__EXTENDS:
        return basicSetExtends(null, msgs);
      case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
        return basicSetDefaultExtends(null, msgs);
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
      case ClassifiersPackage.CLASS__IMPLEMENTS:
        return getImplements();
      case ClassifiersPackage.CLASS__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
        if (resolve) return getDefaultExtends();
        return basicGetDefaultExtends();
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
      case ClassifiersPackage.CLASS__IMPLEMENTS:
        getImplements().clear();
        getImplements().addAll((Collection<? extends TypeReference>)newValue);
        return;
      case ClassifiersPackage.CLASS__EXTENDS:
        setExtends((TypeReference)newValue);
        return;
      case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
        setDefaultExtends((TypeReference)newValue);
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
      case ClassifiersPackage.CLASS__IMPLEMENTS:
        getImplements().clear();
        return;
      case ClassifiersPackage.CLASS__EXTENDS:
        setExtends((TypeReference)null);
        return;
      case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
        setDefaultExtends((TypeReference)null);
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
      case ClassifiersPackage.CLASS__IMPLEMENTS:
        return implements_ != null && !implements_.isEmpty();
      case ClassifiersPackage.CLASS__EXTENDS:
        return extends_ != null;
      case ClassifiersPackage.CLASS__DEFAULT_EXTENDS:
        return defaultExtends != null;
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
    if (baseClass == Implementor.class)
    {
      switch (derivedFeatureID)
      {
        case ClassifiersPackage.CLASS__IMPLEMENTS: return ClassifiersPackage.IMPLEMENTOR__IMPLEMENTS;
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
    if (baseClass == Implementor.class)
    {
      switch (baseFeatureID)
      {
        case ClassifiersPackage.IMPLEMENTOR__IMPLEMENTS: return ClassifiersPackage.CLASS__IMPLEMENTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ClassImpl
