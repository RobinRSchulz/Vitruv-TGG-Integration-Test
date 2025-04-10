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

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.NamedElement;
import org.emftext.language.java.commons.NamespaceAwareElement;

import org.emftext.language.java.imports.ImportingElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Root</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.containers.ContainersPackage#getJavaRoot()
 * @model abstract="true"
 * @generated
 */
public interface JavaRoot extends NamedElement, NamespaceAwareElement, ImportingElement
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return all classes in the same package imports
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\n\njava.lang.String packageName = getNamespacesAsString();\n\ndefaultImportList.addAll(getConcreteClassifierProxies(\n\t\tpackageName, \"*\"));\n\nreturn defaultImportList;'"
   * @generated
   */
  EList<ConcreteClassifier> getClassifiersInSamePackage();

} // JavaRoot
