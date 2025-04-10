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

import java.lang.Class;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.classifiers.ClassifiersPackage;
import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeParameter;
import org.emftext.language.java.generics.TypeParametrizable;

import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.MemberContainer;
import org.emftext.language.java.members.MembersPackage;
import org.emftext.language.java.members.Method;

import org.emftext.language.java.modifiers.AnnotableAndModifiable;
import org.emftext.language.java.modifiers.AnnotationInstanceOrModifier;
import org.emftext.language.java.modifiers.Modifier;
import org.emftext.language.java.modifiers.ModifiersPackage;

import org.emftext.language.java.statements.Statement;

import org.emftext.language.java.types.ClassifierReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl#getDefaultMembers <em>Default Members</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConcreteClassifierImpl extends ClassifierImpl implements ConcreteClassifier
{
  /**
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected EList<TypeParameter> typeParameters;

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
   * The cached value of the '{@link #getAnnotationsAndModifiers() <em>Annotations And Modifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationsAndModifiers()
   * @generated
   * @ordered
   */
  protected EList<AnnotationInstanceOrModifier> annotationsAndModifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcreteClassifierImpl()
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
    return ClassifiersPackage.Literals.CONCRETE_CLASSIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeParameter> getTypeParameters()
  {
    if (typeParameters == null)
    {
      typeParameters = new EObjectContainmentEList.Resolving<TypeParameter>(TypeParameter.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS);
    }
    return typeParameters;
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
      members = new EObjectContainmentEList.Resolving<Member>(Member.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS);
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
      defaultMembers = new EObjectContainmentEList.Resolving<Member>(Member.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS);
    }
    return defaultMembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers()
  {
    if (annotationsAndModifiers == null)
    {
      annotationsAndModifiers = new EObjectContainmentEList.Resolving<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS);
    }
    return annotationsAndModifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteClassifier> getInnerClassifiers()
  {
    if (this.eIsProxy()) {
       java.lang.String uriString = (( org.eclipse.emf.ecore.InternalEObject)this).eProxyURI().trimFragment().toString();
       java.lang.String fullName = uriString.substring( org.emftext.language.java.JavaUniquePathConstructor.JAVA_CLASSIFIER_PATHMAP.length(), 
           uriString.length() - ".java".length()) + "$";
       return getConcreteClassifierProxies(fullName, "*");
    }
    else {
      java.lang.String suffix = "";
      org.emftext.language.java.classifiers.ConcreteClassifier containingClass = this;
      while (containingClass.eContainer() instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
        containingClass = ( org.emftext.language.java.classifiers.ConcreteClassifier) containingClass.eContainer();
        suffix = containingClass.getName() + org.emftext.language.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR + suffix;
      }
      if (containingClass.eContainer() instanceof org.emftext.language.java.containers.CompilationUnit) {
        org.emftext.language.java.containers.CompilationUnit compilationUnit = ( org.emftext.language.java.containers.CompilationUnit) containingClass.eContainer();
          java.lang.String fullName = compilationUnit.getNamespacesAsString() + suffix + 
          	getName() + org.emftext.language.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR;
          return getConcreteClassifierProxies(fullName, "*");
      }
    }
    
    //for classes declared locally inside methods that are not registered in the class path
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
    //can not call ClassifierUtil.getAllMembers, because it will try to call this method!
    for( org.emftext.language.java.members.Member member : getMembers()) {
      if(member instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
        result.add(( org.emftext.language.java.classifiers.ConcreteClassifier) member);
      }
    }
    for( org.emftext.language.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
      for( org.emftext.language.java.members.Member member : superClassifier.getMembers()) {
        if(member instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
          result.add(( org.emftext.language.java.classifiers.ConcreteClassifier) member);
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
  public EList<ConcreteClassifier> getAllInnerClassifiers()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> innerClassifierList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
    
    innerClassifierList.addAll(getInnerClassifiers());
    
    for ( org.emftext.language.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
      org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> superInnerList = superClassifier
          .getInnerClassifiers();
    
      for ( org.emftext.language.java.classifiers.ConcreteClassifier superInner : superInnerList) {
        if (superInner.eIsProxy()) {
          superInner = ( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
              superInner, this);
        }
        if (!superInner.isHidden(this)) {
          innerClassifierList.add(superInner);
        }
      }
    }	
    return innerClassifierList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassifierReference> getSuperTypeReferences()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.types.ClassifierReference> typeReferenceList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.ClassifierReference>();
    if(this == null) {
      return typeReferenceList;
    }
    
    if (this instanceof org.emftext.language.java.classifiers.Class) {
      org.emftext.language.java.classifiers.Class javaClass = ( org.emftext.language.java.classifiers.Class) this;
      if (javaClass.getExtends() != null) {
        org.emftext.language.java.types.ClassifierReference classifierReference = javaClass.getExtends().getPureClassifierReference();
        typeReferenceList.add(classifierReference);
        org.emftext.language.java.classifiers.ConcreteClassifier target = ( org.emftext.language.java.classifiers.ConcreteClassifier) classifierReference.getTarget();
        if (!target.equals(getObjectClass())) {
          typeReferenceList.addAll(target.getSuperTypeReferences());
        }
      }	
      for( org.emftext.language.java.types.TypeReference interfaceReference : javaClass.getImplements()) {
        org.emftext.language.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();
        typeReferenceList.add(classifierReference);
        typeReferenceList.addAll((( org.emftext.language.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());
      }
    } else if (this instanceof org.emftext.language.java.classifiers.Interface) {
      org.emftext.language.java.classifiers.Interface javaInterface = ( org.emftext.language.java.classifiers.Interface) this;
      for( org.emftext.language.java.types.TypeReference interfaceReference : javaInterface.getExtends()) {
        org.emftext.language.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();
        typeReferenceList.add(classifierReference);
        typeReferenceList.addAll((( org.emftext.language.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());
      }
    }
    return typeReferenceList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getAllMembers(Commentable context)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Member> memberList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.members.Member>();
    
    org.emftext.language.java.classifiers.ConcreteClassifier concreteClassifier = ( org.emftext.language.java.classifiers.ConcreteClassifier) this;
    memberList.addAll(concreteClassifier.getMembers());
    memberList.addAll(concreteClassifier.getDefaultMembers());
    //because inner classes are found in separate class files
    memberList.addAll(concreteClassifier.getAllInnerClassifiers());
    
    for ( org.emftext.language.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
      for( org.emftext.language.java.members.Member member : superClassifier.getMembers()) {
        if(member instanceof org.emftext.language.java.modifiers.AnnotableAndModifiable) {					
          org.emftext.language.java.modifiers.AnnotableAndModifiable modifiable = ( org.emftext.language.java.modifiers.AnnotableAndModifiable) member;
    
          if(!modifiable.isHidden(context)) {
            memberList.add(member);
          }
        }
        else {
          memberList.add(member);
        }
      }
      memberList.addAll(superClassifier.getDefaultMembers());
    }
    return memberList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHidden(Commentable context)
  {
    if (this.eIsProxy()) {
      return false;
    }
    //all members of an interface are public by default
    if (this.eContainer() instanceof org.emftext.language.java.classifiers.Interface) {
      return false;
    }
    
    if(context.eIsProxy()) {
      context = ( org.emftext.language.java.commons.Commentable) org.eclipse.emf.ecore.util.EcoreUtil.resolve(context, this);
    }
    
    org.emftext.language.java.classifiers.ConcreteClassifier contextClassifier = context.getContainingConcreteClassifier(); 
    if (!(eContainer() instanceof org.emftext.language.java.commons.Commentable)) {
      return true;
    }
    org.emftext.language.java.classifiers.ConcreteClassifier myClassifier = (( org.emftext.language.java.commons.Commentable) eContainer()).getParentConcreteClassifier();
    //special case: self reference to outer instance
    if(context instanceof org.emftext.language.java.references.Reference) {
      if ((( org.emftext.language.java.references.Reference)context).getPrevious() instanceof org.emftext.language.java.references.SelfReference) {
        org.emftext.language.java.references.SelfReference selfReference = ( org.emftext.language.java.references.SelfReference) (( org.emftext.language.java.references.Reference)context).getPrevious();
        if (selfReference.getSelf() instanceof org.emftext.language.java.literals.Self) {
          if(selfReference.getPrevious() != null) {
            org.emftext.language.java.types.Type type = selfReference.getPrevious().getReferencedType();
            if (type instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
              contextClassifier = ( org.emftext.language.java.classifiers.ConcreteClassifier) type;
            }
          }
        }
      }
    }
    
    for( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
      if(modifier instanceof org.emftext.language.java.modifiers.Private) {
        if (myClassifier.equalsType(0, contextClassifier,0)) {
          return false;
        }
        return true;
      }
      if(modifier instanceof org.emftext.language.java.modifiers.Public) {
        return false;
      }
      if(modifier instanceof org.emftext.language.java.modifiers.Protected) {
        //package visibility
        if (getContainingPackageName() != null && 
            getContainingPackageName().equals(context.getContainingPackageName())) {
          return false;
        }
        //try outer classifiers as well 
        while(contextClassifier instanceof org.emftext.language.java.classifiers.Classifier) {
          if (contextClassifier.isSuperType(0, myClassifier, null)) {
            return false;
          }
          
          org.eclipse.emf.ecore.EObject container = contextClassifier.eContainer();
          if (container instanceof org.emftext.language.java.commons.Commentable) {
            contextClassifier = (( org.emftext.language.java.commons.Commentable) container).getParentConcreteClassifier();
          } else {
            contextClassifier = null;
          }
          
          if (contextClassifier != null && !contextClassifier.eIsProxy() && 
              contextClassifier.isSuperType(0, myClassifier, null)) {
            return false;
          }
        }
        //visibility through anonymous subclass
        org.emftext.language.java.classifiers.AnonymousClass anonymousClass = context.getContainingAnonymousClass();
        while (anonymousClass != null) {
          contextClassifier = anonymousClass.getSuperClassifier();
          if (contextClassifier == null) {
            return true;
          }
          if (contextClassifier.isSuperType(0, myClassifier, null)) {
            return false;
          }
          
          org.eclipse.emf.ecore.EObject container = anonymousClass.eContainer();
          if (container instanceof org.emftext.language.java.commons.Commentable) {
            anonymousClass = (( org.emftext.language.java.commons.Commentable) container).getContainingAnonymousClass();
          } else {
            anonymousClass = null;
          }
        }
        return true;
      }
    }
    //package visibility?
    if (getContainingPackageName() != null && 
        getContainingPackageName().equals(context.getContainingPackageName())) {
      return false;
    }
    
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    //all members of an interface are static by default
    if (this.eContainer() instanceof org.emftext.language.java.classifiers.Interface) {
      return true;
    }
    
    for( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {
      if(modifier instanceof org.emftext.language.java.modifiers.Static) {
        return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeModifier(Class<?> modifierType)
  {
    java.util.List< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
    java.util.List< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> modifiersToRemove = new java.util.ArrayList< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier>();
    for ( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {
      if (modifierType.isInstance(modifier)) {
        modifiersToRemove.add(modifier);
      }
    }
    modifiers.removeAll(modifiersToRemove);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void makePublic()
  {
    if (isPublic()) {
      return;
    }
    removeModifier( org.emftext.language.java.modifiers.Private.class);
    removeModifier( org.emftext.language.java.modifiers.Protected.class);
    getAnnotationsAndModifiers().add( org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPublic());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void makePrivate()
  {
    if (isPrivate()) {
      return;
    }
    removeModifier( org.emftext.language.java.modifiers.Public.class);
    removeModifier( org.emftext.language.java.modifiers.Protected.class);
    getAnnotationsAndModifiers().add( org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPrivate());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void makeProtected()
  {
    if (isProtected()) {
      return;
    }
    removeModifier( org.emftext.language.java.modifiers.Private.class);
    removeModifier( org.emftext.language.java.modifiers.Public.class);
    getAnnotationsAndModifiers().add( org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createProtected());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Modifier> getModifiers()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
    org.eclipse.emf.common.util.EList< org.emftext.language.java.modifiers.Modifier> modifiers = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.modifiers.Modifier>(); 
    for ( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier next : elements) {
      if (next instanceof org.emftext.language.java.modifiers.Modifier) {
        modifiers.add(( org.emftext.language.java.modifiers.Modifier) next);
      }
    }
    return org.eclipse.emf.common.util.ECollections.unmodifiableEList(modifiers);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeAllModifiers()
  {
    java.util.List< org.emftext.language.java.modifiers.Modifier> modifiers = getModifiers();
    org.eclipse.emf.common.util.EList< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();
    elements.removeAll(modifiers);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean hasModifier(Class<?> type)
  {
    java.util.List< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();
    for ( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {
      if (type.isInstance(modifier)) {
        return true;
      }
    }
    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPublic()
  {
    return hasModifier( org.emftext.language.java.modifiers.Public.class);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrivate()
  {
    return hasModifier( org.emftext.language.java.modifiers.Private.class);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProtected()
  {
    return hasModifier( org.emftext.language.java.modifiers.Protected.class);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addModifier(Modifier newModifier)
  {
    getAnnotationsAndModifiers().add(newModifier);
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
      case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
        return ((InternalEList<?>)getDefaultMembers()).basicRemove(otherEnd, msgs);
      case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
        return ((InternalEList<?>)getAnnotationsAndModifiers()).basicRemove(otherEnd, msgs);
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
      case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
        return getTypeParameters();
      case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
        return getMembers();
      case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
        return getDefaultMembers();
      case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
        return getAnnotationsAndModifiers();
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
      case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
        return;
      case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
        return;
      case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
        getDefaultMembers().clear();
        getDefaultMembers().addAll((Collection<? extends Member>)newValue);
        return;
      case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
        getAnnotationsAndModifiers().clear();
        getAnnotationsAndModifiers().addAll((Collection<? extends AnnotationInstanceOrModifier>)newValue);
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
      case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
        getMembers().clear();
        return;
      case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
        getDefaultMembers().clear();
        return;
      case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
        getAnnotationsAndModifiers().clear();
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
      case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS:
        return members != null && !members.isEmpty();
      case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS:
        return defaultMembers != null && !defaultMembers.isEmpty();
      case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS:
        return annotationsAndModifiers != null && !annotationsAndModifiers.isEmpty();
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
    if (baseClass == TypeParametrizable.class)
    {
      switch (derivedFeatureID)
      {
        case ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS: return GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == MemberContainer.class)
    {
      switch (derivedFeatureID)
      {
        case ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS: return MembersPackage.MEMBER_CONTAINER__MEMBERS;
        case ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS: return MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS;
        default: return -1;
      }
    }
    if (baseClass == Member.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AnnotableAndModifiable.class)
    {
      switch (derivedFeatureID)
      {
        case ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS: return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
    if (baseClass == TypeParametrizable.class)
    {
      switch (baseFeatureID)
      {
        case GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__TYPE_PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == MemberContainer.class)
    {
      switch (baseFeatureID)
      {
        case MembersPackage.MEMBER_CONTAINER__MEMBERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__MEMBERS;
        case MembersPackage.MEMBER_CONTAINER__DEFAULT_MEMBERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;
        default: return -1;
      }
    }
    if (baseClass == Member.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AnnotableAndModifiable.class)
    {
      switch (baseFeatureID)
      {
        case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return ClassifiersPackage.CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ConcreteClassifierImpl
