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
package org.emftext.language.java.classifiers;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.generics.TypeParametrizable;

import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.MemberContainer;

import org.emftext.language.java.modifiers.AnnotableAndModifiable;

import org.emftext.language.java.statements.Statement;

import org.emftext.language.java.types.ClassifierReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getConcreteClassifier()
 * @model abstract="true"
 * @generated
 */
public interface ConcreteClassifier extends Classifier, TypeParametrizable, MemberContainer, Member, Statement, AnnotableAndModifiable
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.eIsProxy()) {\n\t java.lang.String uriString = (( org.eclipse.emf.ecore.InternalEObject)this).eProxyURI().trimFragment().toString();\n\t java.lang.String fullName = uriString.substring( org.emftext.language.java.JavaUniquePathConstructor.JAVA_CLASSIFIER_PATHMAP.length(), \n\t\t\t uriString.length() - \".java\".length()) + \"$\";\n\t return getConcreteClassifierProxies(fullName, \"*\");\n}\nelse {\n\tjava.lang.String suffix = \"\";\n\torg.emftext.language.java.classifiers.ConcreteClassifier containingClass = this;\n\twhile (containingClass.eContainer() instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {\n\t\tcontainingClass = ( org.emftext.language.java.classifiers.ConcreteClassifier) containingClass.eContainer();\n\t\tsuffix = containingClass.getName() + org.emftext.language.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR + suffix;\n\t}\n\tif (containingClass.eContainer() instanceof org.emftext.language.java.containers.CompilationUnit) {\n\t\torg.emftext.language.java.containers.CompilationUnit compilationUnit = ( org.emftext.language.java.containers.CompilationUnit) containingClass.eContainer();\n\t    java.lang.String fullName = compilationUnit.getNamespacesAsString() + suffix + \n\t    \tgetName() + org.emftext.language.java.JavaUniquePathConstructor.CLASSIFIER_SEPARATOR;\n\t    return getConcreteClassifierProxies(fullName, \"*\");\n\t}\n}\n\n//for classes declared locally inside methods that are not registered in the class path\norg.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\n//can not call ClassifierUtil.getAllMembers, because it will try to call this method!\nfor( org.emftext.language.java.members.Member member : getMembers()) {\n\tif(member instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {\n\t\tresult.add(( org.emftext.language.java.classifiers.ConcreteClassifier) member);\n\t}\n}\nfor( org.emftext.language.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\tfor( org.emftext.language.java.members.Member member : superClassifier.getMembers()) {\n\t\tif(member instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {\n\t\t\tresult.add(( org.emftext.language.java.classifiers.ConcreteClassifier) member);\n\t\t}\n\t}\n}\n\nreturn result;'"
   * @generated
   */
  EList<ConcreteClassifier> getInnerClassifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> innerClassifierList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\n\ninnerClassifierList.addAll(getInnerClassifiers());\n\nfor ( org.emftext.language.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\torg.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> superInnerList = superClassifier\n\t\t\t.getInnerClassifiers();\n\n\tfor ( org.emftext.language.java.classifiers.ConcreteClassifier superInner : superInnerList) {\n\t\tif (superInner.eIsProxy()) {\n\t\t\tsuperInner = ( org.emftext.language.java.classifiers.ConcreteClassifier) org.eclipse.emf.ecore.util.EcoreUtil.resolve(\n\t\t\t\t\tsuperInner, this);\n\t\t}\n\t\tif (!superInner.isHidden(this)) {\n\t\t\tinnerClassifierList.add(superInner);\n\t\t}\n\t}\n}\t\nreturn innerClassifierList;'"
   * @generated
   */
  EList<ConcreteClassifier> getAllInnerClassifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.types.ClassifierReference> typeReferenceList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.ClassifierReference>();\nif(this == null) {\n\treturn typeReferenceList;\n}\n\nif (this instanceof org.emftext.language.java.classifiers.Class) {\n\torg.emftext.language.java.classifiers.Class javaClass = ( org.emftext.language.java.classifiers.Class) this;\n\tif (javaClass.getExtends() != null) {\n\t\torg.emftext.language.java.types.ClassifierReference classifierReference = javaClass.getExtends().getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\torg.emftext.language.java.classifiers.ConcreteClassifier target = ( org.emftext.language.java.classifiers.ConcreteClassifier) classifierReference.getTarget();\n\t\tif (!target.equals(getObjectClass())) {\n\t\t\ttypeReferenceList.addAll(target.getSuperTypeReferences());\n\t\t}\n\t}\t\n\tfor( org.emftext.language.java.types.TypeReference interfaceReference : javaClass.getImplements()) {\n\t\torg.emftext.language.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\ttypeReferenceList.addAll((( org.emftext.language.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());\n\t}\n} else if (this instanceof org.emftext.language.java.classifiers.Interface) {\n\torg.emftext.language.java.classifiers.Interface javaInterface = ( org.emftext.language.java.classifiers.Interface) this;\n\tfor( org.emftext.language.java.types.TypeReference interfaceReference : javaInterface.getExtends()) {\n\t\torg.emftext.language.java.types.ClassifierReference classifierReference = interfaceReference.getPureClassifierReference();\n\t\ttypeReferenceList.add(classifierReference);\n\t\ttypeReferenceList.addAll((( org.emftext.language.java.classifiers.ConcreteClassifier) classifierReference.getTarget()).getSuperTypeReferences());\n\t}\n}\nreturn typeReferenceList;'"
   * @generated
   */
  EList<ClassifierReference> getSuperTypeReferences();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns all members of the given classifier including inner classes and 
   *  all members of super types (extended classes and implemented interfaces).
   *  
   *  @param context to check protected visibility
   *  @return member list
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Member> memberList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.members.Member>();\n\norg.emftext.language.java.classifiers.ConcreteClassifier concreteClassifier = ( org.emftext.language.java.classifiers.ConcreteClassifier) this;\nmemberList.addAll(concreteClassifier.getMembers());\nmemberList.addAll(concreteClassifier.getDefaultMembers());\n//because inner classes are found in separate class files\nmemberList.addAll(concreteClassifier.getAllInnerClassifiers());\n\nfor ( org.emftext.language.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {\n\tfor( org.emftext.language.java.members.Member member : superClassifier.getMembers()) {\n\t\tif(member instanceof org.emftext.language.java.modifiers.AnnotableAndModifiable) {\t\t\t\t\t\n\t\t\torg.emftext.language.java.modifiers.AnnotableAndModifiable modifiable = ( org.emftext.language.java.modifiers.AnnotableAndModifiable) member;\n\n\t\t\tif(!modifiable.isHidden(context)) {\n\t\t\t\tmemberList.add(member);\n\t\t\t}\n\t\t}\n\t\telse {\n\t\t\tmemberList.add(member);\n\t\t}\n\t}\n\tmemberList.addAll(superClassifier.getDefaultMembers());\n}\nreturn memberList;'"
   * @generated
   */
  EList<Member> getAllMembers(Commentable context);

} // ConcreteClassifier
