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
package org.emftext.language.java.members.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.annotations.Annotable;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.classifiers.AnonymousClass;

import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.members.EnumConstant;
import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.references.Argumentable;
import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.references.impl.ReferenceableElementImpl;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.members.impl.EnumConstantImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.EnumConstantImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.EnumConstantImpl#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumConstantImpl extends ReferenceableElementImpl implements EnumConstant
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
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<AnnotationInstance> annotations;

  /**
   * The cached value of the '{@link #getAnonymousClass() <em>Anonymous Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousClass()
   * @generated
   * @ordered
   */
  protected AnonymousClass anonymousClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumConstantImpl()
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
    return MembersPackage.Literals.ENUM_CONSTANT;
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
      arguments = new EObjectContainmentEList.Resolving<Expression>(Expression.class, this, MembersPackage.ENUM_CONSTANT__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationInstance> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList.Resolving<AnnotationInstance>(AnnotationInstance.class, this, MembersPackage.ENUM_CONSTANT__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousClass getAnonymousClass()
  {
    if (anonymousClass != null && anonymousClass.eIsProxy())
    {
      InternalEObject oldAnonymousClass = (InternalEObject)anonymousClass;
      anonymousClass = (AnonymousClass)eResolveProxy(oldAnonymousClass);
      if (anonymousClass != oldAnonymousClass)
      {
        InternalEObject newAnonymousClass = (InternalEObject)anonymousClass;
        NotificationChain msgs = oldAnonymousClass.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, null, null);
        if (newAnonymousClass.eInternalContainer() == null)
        {
          msgs = newAnonymousClass.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, null, msgs);
        }
        if (msgs != null) msgs.dispatch();
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, oldAnonymousClass, anonymousClass));
      }
    }
    return anonymousClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousClass basicGetAnonymousClass()
  {
    return anonymousClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonymousClass(AnonymousClass newAnonymousClass, NotificationChain msgs)
  {
    AnonymousClass oldAnonymousClass = anonymousClass;
    anonymousClass = newAnonymousClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, oldAnonymousClass, newAnonymousClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymousClass(AnonymousClass newAnonymousClass)
  {
    if (newAnonymousClass != anonymousClass)
    {
      NotificationChain msgs = null;
      if (anonymousClass != null)
        msgs = ((InternalEObject)anonymousClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, null, msgs);
      if (newAnonymousClass != null)
        msgs = ((InternalEObject)newAnonymousClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, null, msgs);
      msgs = basicSetAnonymousClass(newAnonymousClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS, newAnonymousClass, newAnonymousClass));
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
      case MembersPackage.ENUM_CONSTANT__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case MembersPackage.ENUM_CONSTANT__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
        return basicSetAnonymousClass(null, msgs);
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
      case MembersPackage.ENUM_CONSTANT__ARGUMENTS:
        return getArguments();
      case MembersPackage.ENUM_CONSTANT__ANNOTATIONS:
        return getAnnotations();
      case MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
        if (resolve) return getAnonymousClass();
        return basicGetAnonymousClass();
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
      case MembersPackage.ENUM_CONSTANT__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Expression>)newValue);
        return;
      case MembersPackage.ENUM_CONSTANT__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends AnnotationInstance>)newValue);
        return;
      case MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
        setAnonymousClass((AnonymousClass)newValue);
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
      case MembersPackage.ENUM_CONSTANT__ARGUMENTS:
        getArguments().clear();
        return;
      case MembersPackage.ENUM_CONSTANT__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
        setAnonymousClass((AnonymousClass)null);
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
      case MembersPackage.ENUM_CONSTANT__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case MembersPackage.ENUM_CONSTANT__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS:
        return anonymousClass != null;
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
        case MembersPackage.ENUM_CONSTANT__ARGUMENTS: return ReferencesPackage.ARGUMENTABLE__ARGUMENTS;
        default: return -1;
      }
    }
    if (baseClass == Annotable.class)
    {
      switch (derivedFeatureID)
      {
        case MembersPackage.ENUM_CONSTANT__ANNOTATIONS: return AnnotationsPackage.ANNOTABLE__ANNOTATIONS;
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
        case ReferencesPackage.ARGUMENTABLE__ARGUMENTS: return MembersPackage.ENUM_CONSTANT__ARGUMENTS;
        default: return -1;
      }
    }
    if (baseClass == Annotable.class)
    {
      switch (baseFeatureID)
      {
        case AnnotationsPackage.ANNOTABLE__ANNOTATIONS: return MembersPackage.ENUM_CONSTANT__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //EnumConstantImpl
