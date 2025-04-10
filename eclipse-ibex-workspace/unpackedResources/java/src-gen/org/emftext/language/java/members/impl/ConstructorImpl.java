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

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeParameter;
import org.emftext.language.java.generics.TypeParametrizable;

import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.ExceptionThrower;
import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.modifiers.AnnotableAndModifiable;
import org.emftext.language.java.modifiers.AnnotationInstanceOrModifier;
import org.emftext.language.java.modifiers.Modifier;
import org.emftext.language.java.modifiers.ModifiersPackage;

import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.ParametersPackage;
import org.emftext.language.java.parameters.Parametrizable;

import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;
import org.emftext.language.java.statements.StatementsPackage;

import org.emftext.language.java.types.NamespaceClassifierReference;

import org.emftext.language.java.variables.LocalVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.members.impl.ConstructorImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.ConstructorImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.ConstructorImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.emftext.language.java.members.impl.ConstructorImpl#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends MemberImpl implements Constructor
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

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
   * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptions()
   * @generated
   * @ordered
   */
  protected EList<NamespaceClassifierReference> exceptions;

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
  protected ConstructorImpl()
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
    return MembersPackage.Literals.CONSTRUCTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList.Resolving<Statement>(Statement.class, this, MembersPackage.CONSTRUCTOR__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList.Resolving<Parameter>(Parameter.class, this, MembersPackage.CONSTRUCTOR__PARAMETERS);
    }
    return parameters;
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
      typeParameters = new EObjectContainmentEList.Resolving<TypeParameter>(TypeParameter.class, this, MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS);
    }
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamespaceClassifierReference> getExceptions()
  {
    if (exceptions == null)
    {
      exceptions = new EObjectContainmentEList.Resolving<NamespaceClassifierReference>(NamespaceClassifierReference.class, this, MembersPackage.CONSTRUCTOR__EXCEPTIONS);
    }
    return exceptions;
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
      annotationsAndModifiers = new EObjectContainmentEList.Resolving<AnnotationInstanceOrModifier>(AnnotationInstanceOrModifier.class, this, MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS);
    }
    return annotationsAndModifiers;
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
  public LocalVariable getLocalVariable(String name)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.variables.LocalVariable> localVariables = getChildrenByType( org.emftext.language.java.variables.LocalVariable.class);
    for ( org.emftext.language.java.variables.LocalVariable localVariable : localVariables) {
      if (localVariable.getName().equals(name)) {
        return localVariable;
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
      case MembersPackage.CONSTRUCTOR__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case MembersPackage.CONSTRUCTOR__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
        return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
      case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
      case MembersPackage.CONSTRUCTOR__STATEMENTS:
        return getStatements();
      case MembersPackage.CONSTRUCTOR__PARAMETERS:
        return getParameters();
      case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
        return getTypeParameters();
      case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
        return getExceptions();
      case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
      case MembersPackage.CONSTRUCTOR__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case MembersPackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
        return;
      case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
        getExceptions().clear();
        getExceptions().addAll((Collection<? extends NamespaceClassifierReference>)newValue);
        return;
      case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
      case MembersPackage.CONSTRUCTOR__STATEMENTS:
        getStatements().clear();
        return;
      case MembersPackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        return;
      case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
        getExceptions().clear();
        return;
      case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
      case MembersPackage.CONSTRUCTOR__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case MembersPackage.CONSTRUCTOR__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case MembersPackage.CONSTRUCTOR__EXCEPTIONS:
        return exceptions != null && !exceptions.isEmpty();
      case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS:
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
    if (baseClass == StatementListContainer.class)
    {
      switch (derivedFeatureID)
      {
        case MembersPackage.CONSTRUCTOR__STATEMENTS: return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
        default: return -1;
      }
    }
    if (baseClass == Parametrizable.class)
    {
      switch (derivedFeatureID)
      {
        case MembersPackage.CONSTRUCTOR__PARAMETERS: return ParametersPackage.PARAMETRIZABLE__PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == TypeParametrizable.class)
    {
      switch (derivedFeatureID)
      {
        case MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS: return GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == ExceptionThrower.class)
    {
      switch (derivedFeatureID)
      {
        case MembersPackage.CONSTRUCTOR__EXCEPTIONS: return MembersPackage.EXCEPTION_THROWER__EXCEPTIONS;
        default: return -1;
      }
    }
    if (baseClass == AnnotableAndModifiable.class)
    {
      switch (derivedFeatureID)
      {
        case MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS: return ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS;
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
    if (baseClass == StatementListContainer.class)
    {
      switch (baseFeatureID)
      {
        case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS: return MembersPackage.CONSTRUCTOR__STATEMENTS;
        default: return -1;
      }
    }
    if (baseClass == Parametrizable.class)
    {
      switch (baseFeatureID)
      {
        case ParametersPackage.PARAMETRIZABLE__PARAMETERS: return MembersPackage.CONSTRUCTOR__PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == TypeParametrizable.class)
    {
      switch (baseFeatureID)
      {
        case GenericsPackage.TYPE_PARAMETRIZABLE__TYPE_PARAMETERS: return MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == ExceptionThrower.class)
    {
      switch (baseFeatureID)
      {
        case MembersPackage.EXCEPTION_THROWER__EXCEPTIONS: return MembersPackage.CONSTRUCTOR__EXCEPTIONS;
        default: return -1;
      }
    }
    if (baseClass == AnnotableAndModifiable.class)
    {
      switch (baseFeatureID)
      {
        case ModifiersPackage.ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS: return MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ConstructorImpl
