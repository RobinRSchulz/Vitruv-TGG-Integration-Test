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
package org.emftext.language.java.imports;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Importing Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.imports.ImportingElement#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.imports.ImportsPackage#getImportingElement()
 * @model abstract="true"
 * @generated
 */
public interface ImportingElement extends Commentable
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.imports.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.emftext.language.java.imports.ImportsPackage#getImportingElement_Imports()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\nfor( org.eclipse.emf.ecore.EObject classifier : org.emftext.language.java.JavaClasspath.get(this).getDefaultImports()) {\n\tresult.add(( org.emftext.language.java.classifiers.ConcreteClassifier)classifier);\n}\nreturn result;'"
   * @generated
   */
  EList<ConcreteClassifier> getDefaultImports();

} // ImportingElement
