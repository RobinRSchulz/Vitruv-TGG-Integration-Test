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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.impl.CommentableImpl;

import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.MemberContainer;
import org.emftext.language.java.members.MembersPackage;
import org.emftext.language.java.members.Method;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.members.impl.MemberContainerImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.MemberContainerImpl#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MemberContainerImpl extends CommentableImpl implements MemberContainer
{
  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

  /**
   * The cached value of the '{@link #getDefaultMembers() <em>Default Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> defaultMembers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemberContainerImpl()
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
    return MembersPackage.Literals.MEMBER_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList.Resolving<Member>(Member.class, this, MembersPackage.MEMBER_CONTAINER__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getDefaultMembers()
  {
    if (defaultMembers == null)
    {
      defaultMembers = new EObjectContainmentEList.Resolving<Member>(Member.class, this, MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS);
    }
    return defaultMembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteClassifier getContainedClassifier(String name)
  {
    for( org.emftext.language.java.members.Member member : getMembers()) {
      if (member instanceof org.emftext.language.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {
        return ( org.emftext.language.java.classifiers.ConcreteClassifier) member;
      }
     		}
    for( org.emftext.language.java.members.Member member : getDefaultMembers()) {
      if (member instanceof org.emftext.language.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {
        return ( org.emftext.language.java.classifiers.ConcreteClassifier) member;
      }
     		}
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field getContainedField(String name)
  {
    for( org.emftext.language.java.members.Member member : getMembers()) {
      if (member instanceof org.emftext.language.java.members.Field && name.equals(member.getName())) {
        return ( org.emftext.language.java.members.Field) member;
      }
     		}
    for( org.emftext.language.java.members.Member member : getDefaultMembers()) {
      if (member instanceof org.emftext.language.java.members.Field && name.equals(member.getName())) {
        return ( org.emftext.language.java.members.Field) member;
      }
     		}
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getContainedMethod(String name)
  {
    org.emftext.language.java.members.Method found = null;
    for( org.emftext.language.java.members.Member member : getMembers()) {
      if (member instanceof org.emftext.language.java.members.Method && name.equals(member.getName())) {
        if(found != null) {
          return null;
        }
        else {
          found = ( org.emftext.language.java.members.Method) member;
        }
      }
     		}
     		for( org.emftext.language.java.members.Member member : getDefaultMembers()) {
      if (member instanceof org.emftext.language.java.members.Method && name.equals(member.getName())) {
        if(found != null) {
          return null;
        }
        else {
          found = ( org.emftext.language.java.members.Method) member;
        }
      }
     		}
    return found;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethods()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Method> methodList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Method>();
    
    for ( org.emftext.language.java.members.Member member : getMembers()) {
      if (member instanceof org.emftext.language.java.members.Method) {
        methodList.add(( org.emftext.language.java.members.Method) member);
      }
    }	
    return methodList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeMethods(String name)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Method> methodsToRemove = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Method>();
    
    for ( org.emftext.language.java.members.Member member : getMembers()) {
      if (member instanceof org.emftext.language.java.members.Method) {
        if (name.equals(member.getName())) {
          methodsToRemove.add(( org.emftext.language.java.members.Method) member);
        }
      }
    }
    getMembers().removeAll(methodsToRemove);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembersByName(String name)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Member> matchingMembers = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Member>();
    
    for ( org.emftext.language.java.members.Member member : getMembers()) {
      if (name.equals(member.getName())) {
        matchingMembers.add(member);
      }
    }	
    return matchingMembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField(String name, String qualifiedTypeName)
  {
    org.emftext.language.java.members.Field field = org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();
    field.setName(name);
    org.emftext.language.java.types.ClassifierReference typeRef = org.emftext.language.java.types.TypesFactory.eINSTANCE.createClassifierReference();
    typeRef.setTarget(getConcreteClassifier(qualifiedTypeName));
    field.setTypeReference(typeRef);
    getMembers().add(field);
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Field> fieldList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Field>();
    
    for ( org.emftext.language.java.members.Member member : getMembers()) {
      if (member instanceof org.emftext.language.java.members.Field) {
        fieldList.add(( org.emftext.language.java.members.Field) member);
      }
    }	
    return fieldList;
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
      case MembersPackage.MEMBER_CONTAINER__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
        return ((InternalEList<?>)getDefaultMembers()).basicRemove(otherEnd, msgs);
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
      case MembersPackage.MEMBER_CONTAINER__MEMBERS:
        return getMembers();
      case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
        return getDefaultMembers();
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
      case MembersPackage.MEMBER_CONTAINER__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
        return;
      case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
        getDefaultMembers().clear();
        getDefaultMembers().addAll((Collection<? extends Member>)newValue);
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
      case MembersPackage.MEMBER_CONTAINER__MEMBERS:
        getMembers().clear();
        return;
      case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
        getDefaultMembers().clear();
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
      case MembersPackage.MEMBER_CONTAINER__MEMBERS:
        return members != null && !members.isEmpty();
      case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS:
        return defaultMembers != null && !defaultMembers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MemberContainerImpl
