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
package org.emftext.language.java.containers;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.annotations.Annotable;

import org.emftext.language.java.classifiers.ConcreteClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.containers.Package#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.containers.ContainersPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends JavaRoot, Annotable
{
  /**
   * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.containers.CompilationUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compilation Units</em>' containment reference list.
   * @see org.emftext.language.java.containers.ContainersPackage#getPackage_CompilationUnits()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<CompilationUnit> getCompilationUnits();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String packageName = \"\"; \nfor( java.util.Iterator< java.lang.String> it = getNamespaces().iterator(); it.hasNext(); ) {\n\tjava.lang.String namespaceFragment = it.next();\n\tpackageName = packageName + namespaceFragment + org.emftext.language.java.JavaUniquePathConstructor.PACKAGE_SEPARATOR;\n}\nreturn packageName;'"
   * @generated
   */
  String getNamespacesAsString();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return all classes in the same package
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\n\njava.lang.String packageName = getNamespacesAsString();\n\ndefaultImportList.addAll(getConcreteClassifierProxies(\n\t\tpackageName + getName(), \"*\"));\n\nreturn defaultImportList;'"
   * @generated
   */
  EList<ConcreteClassifier> getClassifiersInSamePackage();

} // Package
