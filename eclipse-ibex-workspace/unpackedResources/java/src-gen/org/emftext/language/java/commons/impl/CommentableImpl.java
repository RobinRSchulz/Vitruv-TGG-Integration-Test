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
package org.emftext.language.java.commons.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.commons.layout.LayoutInformation;

import org.emftext.language.java.annotations.AnnotationInstance;

import org.emftext.language.java.classifiers.AnonymousClass;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.containers.CompilationUnit;

import org.emftext.language.java.statements.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commentable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.commons.impl.CommentableImpl#getLayoutInformations <em>Layout Informations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CommentableImpl extends MinimalEObjectImpl implements Commentable
{
  /**
   * The cached value of the '{@link #getLayoutInformations() <em>Layout Informations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutInformations()
   * @generated
   * @ordered
   */
  protected EList<LayoutInformation> layoutInformations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommentableImpl()
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
    return CommonsPackage.Literals.COMMENTABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LayoutInformation> getLayoutInformations()
  {
    if (layoutInformations == null)
    {
      layoutInformations = new EObjectContainmentEList.Resolving<LayoutInformation>(LayoutInformation.class, this, CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS);
    }
    return layoutInformations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteClassifier getConcreteClassifier(String name)
  {
    return ( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
      org.emftext.language.java.JavaClasspath.get(this).getClassifier(name), this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteClassifier getConcreteClassifierProxy(String name)
  {
    return ( org.emftext.language.java.classifiers.ConcreteClassifier) org.emftext.language.java.JavaClasspath.get(this).getClassifier(name);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteClassifier> getConcreteClassifiers(String packageName, String classifierQuery)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
    for( org.eclipse.emf.ecore.EObject classifier : org.emftext.language.java.JavaClasspath.get(this).getClassifiers(packageName, classifierQuery)) {
      result.add(( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(classifier, this));
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteClassifier> getConcreteClassifierProxies(String packageName, String classifierQuery)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
    for( org.eclipse.emf.ecore.EObject classifier : org.emftext.language.java.JavaClasspath.get(this).getClassifiers(packageName, classifierQuery)) {
      result.add(( org.emftext.language.java.classifiers.ConcreteClassifier)classifier);
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.emftext.language.java.classifiers.Class getLibClass(String name)
  {
    org.emftext.language.java.classifiers.Class classClass = ( org.emftext.language.java.classifiers.Class) getConcreteClassifierProxy(
        "java.lang." + name);
    org.eclipse.emf.ecore.EObject resolved = ( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(classClass, this);
    if (resolved instanceof org.emftext.language.java.classifiers.Class) {
      return ( org.emftext.language.java.classifiers.Class) resolved;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getLibInterface(String name)
  {
    org.emftext.language.java.classifiers.ConcreteClassifier interfaceClass = getConcreteClassifierProxy(
        "java.lang." + name);
    org.eclipse.emf.ecore.EObject resolved = org.eclipse.emf.ecore.util.EcoreUtil.resolve(interfaceClass, this);
    if (resolved instanceof org.emftext.language.java.classifiers.Interface) {
      return ( org.emftext.language.java.classifiers.Interface) resolved;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.emftext.language.java.classifiers.Class getClassClass()
  {
    return getLibClass("Class");
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.emftext.language.java.classifiers.Class getObjectClass()
  {
    return getLibClass("Object");
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.emftext.language.java.classifiers.Class getStringClass()
  {
    return getLibClass("String");
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getAnnotationInterface()
  {
    org.emftext.language.java.classifiers.Interface annotationClass = ( org.emftext.language.java.classifiers.Interface) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
        getConcreteClassifierProxy("java.lang.annotation.Annotation"), this);
    org.eclipse.emf.ecore.EObject resolved = org.eclipse.emf.ecore.util.EcoreUtil.resolve(annotationClass, this);
    if (resolved instanceof org.emftext.language.java.classifiers.Interface) {
      return ( org.emftext.language.java.classifiers.Interface) resolved;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationInstance getContainingAnnotationInstance()
  {
    org.eclipse.emf.ecore.EObject value = this;
    while (!(value instanceof org.emftext.language.java.annotations.AnnotationInstance) && value != null) {
      value = value.eContainer();
    }
    return ( org.emftext.language.java.annotations.AnnotationInstance) value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousClass getContainingAnonymousClass()
  {
    org.eclipse.emf.ecore.EObject value = this;
    while (!(value instanceof org.emftext.language.java.classifiers.AnonymousClass) 
        && !(value instanceof org.emftext.language.java.classifiers.ConcreteClassifier) //do not jump over other classifiers 
        && value != null) {
      value = value.eContainer();
    }
    if (!(value instanceof org.emftext.language.java.classifiers.AnonymousClass)) {
      return null;
    }
    return ( org.emftext.language.java.classifiers.AnonymousClass) value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteClassifier getContainingConcreteClassifier()
  {
    org.eclipse.emf.ecore.EObject value = this;
    while (!(value instanceof org.emftext.language.java.classifiers.ConcreteClassifier) && value != null) {
      value = value.eContainer();
    }
    return ( org.emftext.language.java.classifiers.ConcreteClassifier) value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilationUnit getContainingCompilationUnit()
  {
    org.eclipse.emf.ecore.EObject value = this;
    while (!(value instanceof org.emftext.language.java.containers.CompilationUnit) && value != null) {
      value = value.eContainer();
    }
    return ( org.emftext.language.java.containers.CompilationUnit) value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getContainingPackageName()
  {
    org.emftext.language.java.containers.CompilationUnit cu = getContainingCompilationUnit();
    if (cu == null) {
      return null;
    }
    
    int idx = cu.getNamespaces().size();
    if(cu.getName() != null) {
      char[] fullName = cu.getName().toCharArray();
      for(int i = 0; i < fullName.length; i++) {
        if (fullName[i] == '$') {
          idx--;
        }
      }
    }
    return new org.eclipse.emf.common.util.BasicEList< java.lang.String>(cu.getNamespaces().subList(0, idx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteClassifier getParentConcreteClassifier()
  {
    org.emftext.language.java.classifiers.ConcreteClassifier classifier = getContainingConcreteClassifier();
    if(classifier == null) {
      org.emftext.language.java.containers.CompilationUnit cu = getContainingCompilationUnit();
      //maybe the outer classifier is in an extra cu
      if (cu != null && cu.getName() != null && cu.getName().contains("$")) {
        classifier = ( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(
        getConcreteClassifierProxy(cu.getNamespacesAsString()), this);
        if(classifier.eIsProxy())  {
          classifier = null;
        }
      }
    }
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getParentByEType(EClass type)
  {
    org.eclipse.emf.ecore.EObject container = this.eContainer();
    while (container != null) {
      if (type.isInstance(container)) {
        return container;
      }
      container = container.eContainer();
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getFirstChildByEType(EClass type)
  {
    java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
    while (it.hasNext()) {
      org.eclipse.emf.ecore.EObject next = it.next();
      if (type.isInstance(next)) {
        return next;
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> T getParentByType(Class<T> type)
  {
    org.eclipse.emf.ecore.EObject container = this.eContainer();
    while (container != null) {
      if (type.isInstance(container)) {
        return type.cast(container);
      }
      container = container.eContainer();
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> T getFirstChildByType(Class<T> type)
  {
    java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
    while (it.hasNext()) {
      org.eclipse.emf.ecore.EObject next = it.next();
      if (type.isInstance(next)) {
        return type.cast(next);
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getChildrenByEType(EClass type)
  {
    org.eclipse.emf.common.util.EList< org.eclipse.emf.ecore.EObject> children = new org.eclipse.emf.common.util.BasicEList< org.eclipse.emf.ecore.EObject>();
    java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
    while (it.hasNext()) {
      org.eclipse.emf.ecore.EObject next = it.next();
      if (type.isInstance(next)) {
        children.add(next);
      }
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T> EList<T> getChildrenByType(Class<T> type)
  {
    org.eclipse.emf.common.util.EList<T> children = new org.eclipse.emf.common.util.BasicEList<T>();
    java.util.Iterator< org.eclipse.emf.ecore.EObject> it = this.eAllContents();
    while (it.hasNext()) {
      org.eclipse.emf.ecore.EObject next = it.next();
      if (type.isInstance(next)) {
        children.add(type.cast(next));
      }
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getComments()
  {
    org.eclipse.emf.common.util.EList< java.lang.String> comments = new org.eclipse.emf.common.util.BasicEList< java.lang.String>();
    if (this instanceof org.emftext.language.java.modifiers.AnnotableAndModifiable) {
      for ( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier aom : (( org.emftext.language.java.modifiers.AnnotableAndModifiable) this).getAnnotationsAndModifiers()) {
        comments.addAll(aom.getComments());
      }
    }
    for ( org.emftext.commons.layout.LayoutInformation layoutInformation : getLayoutInformations()) {
      java.lang.String text = layoutInformation.getHiddenTokenText();
      if (text.contains("/*") || text.contains("//")) {
        comments.add(layoutInformation.getHiddenTokenText().trim());
      }
    }
    return org.eclipse.emf.common.util.ECollections.unmodifiableEList(comments);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addBeforeContainingStatement(Statement statementToAdd)
  {
    org.eclipse.emf.ecore.EObject container = this.eContainer();
    org.eclipse.emf.ecore.EObject statement = this;
    while (container != null) {
      if (container instanceof org.emftext.language.java.statements.StatementListContainer) {
        break;
      }
      container = container.eContainer();
      statement = statement.eContainer();
    }
    if (container == null) {
      throw new java.lang.IllegalArgumentException("Element " + this + " is not contained in a StatementListContainer.");
    }
    org.emftext.language.java.statements.StatementListContainer statementListContainer = ( org.emftext.language.java.statements.StatementListContainer) container;
    org.eclipse.emf.common.util.EList< org.emftext.language.java.statements.Statement> statements = statementListContainer.getStatements();
    int index = statements.indexOf(statement);
    
    statements.add(index, statementToAdd);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addAfterContainingStatement(Statement statementToAdd)
  {
    org.eclipse.emf.ecore.EObject container = this.eContainer();
    org.eclipse.emf.ecore.EObject statement = this;
    while (container != null) {
      if (container instanceof org.emftext.language.java.statements.StatementListContainer) {
        break;
      }
      container = container.eContainer();
      statement = statement.eContainer();
    }
    if (container == null) {
      throw new java.lang.IllegalArgumentException("Element " + this + " is not contained in a StatementListContainer.");
    }
    org.emftext.language.java.statements.StatementListContainer statementListContainer = ( org.emftext.language.java.statements.StatementListContainer) container;
    org.eclipse.emf.common.util.EList< org.emftext.language.java.statements.Statement> statements = statementListContainer.getStatements();
    int index = statements.indexOf(statement);
    
    if (index == statements.size() - 1) {
      // statement is the last one
      statements.add(statementToAdd);
    } else {
      statements.add(index + 1, statementToAdd);
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
      case CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
        return ((InternalEList<?>)getLayoutInformations()).basicRemove(otherEnd, msgs);
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
      case CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
        return getLayoutInformations();
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
      case CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
        getLayoutInformations().clear();
        getLayoutInformations().addAll((Collection<? extends LayoutInformation>)newValue);
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
      case CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
        getLayoutInformations().clear();
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
      case CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS:
        return layoutInformations != null && !layoutInformations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CommentableImpl
