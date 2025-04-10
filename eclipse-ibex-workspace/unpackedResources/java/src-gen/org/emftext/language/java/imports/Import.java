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

import org.emftext.language.java.commons.NamedElement;
import org.emftext.language.java.commons.NamespaceAwareElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.imports.ImportsPackage#getImport()
 * @model abstract="true"
 * @generated
 */
public interface Import extends NamespaceAwareElement
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns the classifier with the given name 
   *  located in the namespace defined by the import.
   *  
   *  @param name the name of the classifier
   *  @return imported classifier (proxy)
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String containerName = getNamespacesAsString();\nif (containerName == null) {\n\treturn null;\n}\n\njava.lang.String fullQualifiedName = containerName + name;\nreturn getConcreteClassifierProxy(fullQualifiedName);'"
   * @generated
   */
  ConcreteClassifier getImportedClassifier(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns a list of imported classifiers assuming the import's namespace
   *  identifies a package.
   *  
   *  @param _this 
   *  @return imported classifier (proxy)
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.String containerName = getNamespacesAsString();\nif (containerName == null) {\n\treturn org.eclipse.emf.common.util.ECollections.emptyEList();\n}\n\nreturn getConcreteClassifierProxies(containerName, \"*\");'"
   * @generated
   */
  EList<ConcreteClassifier> getImportedClassifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns all imported members assuming the import's namespace
   *  identifies a classifier.
   *  
   *  @param _this 
   *  @return list of imported classifiers (proxies)
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.classifiers.ConcreteClassifier concreteClassifier = getClassifierAtNamespaces();\n\nif(concreteClassifier == null || concreteClassifier.eIsProxy()) {\n\treturn org.eclipse.emf.common.util.ECollections.emptyEList();\n}\n\norg.eclipse.emf.common.util.EList< org.emftext.language.java.commons.NamedElement> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.commons.NamedElement>();\nresult.addAll(concreteClassifier.getAllMembers(this));\nif (concreteClassifier instanceof org.emftext.language.java.classifiers.Enumeration) {\n\tresult.addAll((( org.emftext.language.java.classifiers.Enumeration)concreteClassifier).getConstants());\n}\n\nreturn result;'"
   * @generated
   */
  EList<NamedElement> getImportedMembers();

} // Import
