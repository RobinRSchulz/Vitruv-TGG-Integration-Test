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
package org.emftext.language.java.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.annotations.Annotable;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.containers.impl.PackageImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.emftext.language.java.containers.impl.PackageImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends JavaRootImpl implements org.emftext.language.java.containers.Package
{
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
   * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompilationUnits()
   * @generated
   * @ordered
   */
  protected EList<CompilationUnit> compilationUnits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return ContainersPackage.Literals.PACKAGE;
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
      annotations = new EObjectContainmentEList.Resolving<AnnotationInstance>(AnnotationInstance.class, this, ContainersPackage.PACKAGE__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompilationUnit> getCompilationUnits()
  {
    if (compilationUnits == null)
    {
      compilationUnits = new EObjectContainmentEList.Resolving<CompilationUnit>(CompilationUnit.class, this, ContainersPackage.PACKAGE__COMPILATION_UNITS);
    }
    return compilationUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespacesAsString()
  {
    java.lang.String packageName = ""; 
    for( java.util.Iterator< java.lang.String> it = getNamespaces().iterator(); it.hasNext(); ) {
      java.lang.String namespaceFragment = it.next();
      packageName = packageName + namespaceFragment + org.emftext.language.java.JavaUniquePathConstructor.PACKAGE_SEPARATOR;
    }
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteClassifier> getClassifiersInSamePackage()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
    
    java.lang.String packageName = getNamespacesAsString();
    
    defaultImportList.addAll(getConcreteClassifierProxies(
        packageName + getName(), "*"));
    
    return defaultImportList;
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
      case ContainersPackage.PACKAGE__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case ContainersPackage.PACKAGE__COMPILATION_UNITS:
        return ((InternalEList<?>)getCompilationUnits()).basicRemove(otherEnd, msgs);
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
      case ContainersPackage.PACKAGE__ANNOTATIONS:
        return getAnnotations();
      case ContainersPackage.PACKAGE__COMPILATION_UNITS:
        return getCompilationUnits();
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
      case ContainersPackage.PACKAGE__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends AnnotationInstance>)newValue);
        return;
      case ContainersPackage.PACKAGE__COMPILATION_UNITS:
        getCompilationUnits().clear();
        getCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
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
      case ContainersPackage.PACKAGE__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case ContainersPackage.PACKAGE__COMPILATION_UNITS:
        getCompilationUnits().clear();
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
      case ContainersPackage.PACKAGE__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case ContainersPackage.PACKAGE__COMPILATION_UNITS:
        return compilationUnits != null && !compilationUnits.isEmpty();
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
    if (baseClass == Annotable.class)
    {
      switch (derivedFeatureID)
      {
        case ContainersPackage.PACKAGE__ANNOTATIONS: return AnnotationsPackage.ANNOTABLE__ANNOTATIONS;
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
    if (baseClass == Annotable.class)
    {
      switch (baseFeatureID)
      {
        case AnnotationsPackage.ANNOTABLE__ANNOTATIONS: return ContainersPackage.PACKAGE__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //PackageImpl
