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

import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.MemberContainer;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getAnonymousClass()
 * @model
 * @generated
 */
public interface AnonymousClass extends Type, MemberContainer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return a view on all super classifiers
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> superClassifierList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\n\norg.emftext.language.java.classifiers.ConcreteClassifier superClassifier = getSuperClassifier();\n\nif (superClassifier != null) {\n\tsuperClassifierList.add(superClassifier);\n\tsuperClassifierList.addAll(superClassifier.getAllSuperClassifiers());\n}\nelse {\n\tsuperClassifierList.add(getObjectClass());\n}\nreturn superClassifierList;'"
   * @generated
   */
  EList<ConcreteClassifier> getAllSuperClassifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return the direct super classifier
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.instantiations.NewConstructorCall ncCall = null;\nif (this.eContainer() instanceof org.emftext.language.java.instantiations.NewConstructorCall) {\n\tncCall = ( org.emftext.language.java.instantiations.NewConstructorCall) this.eContainer();\n\torg.emftext.language.java.classifiers.ConcreteClassifier superClassifier = ( org.emftext.language.java.classifiers.ConcreteClassifier) ncCall.getTypeReference().getTarget();\n\treturn superClassifier;\n}\nelse if (this.eContainer() instanceof org.emftext.language.java.members.EnumConstant) {\n\tif (this.eContainer().eContainer() instanceof org.emftext.language.java.classifiers.Enumeration) {\n\t\treturn ( org.emftext.language.java.classifiers.Enumeration) this.eContainer().eContainer();\n\t}\n}\nreturn null;'"
   * @generated
   */
  ConcreteClassifier getSuperClassifier();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param context to check protected visibility
   *  @return a view on all members including super classifiers' members
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Member> memberList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.members.Member>();\nmemberList.addAll(this.getMembers());\nmemberList.addAll(this.getDefaultMembers());\n\norg.emftext.language.java.instantiations.NewConstructorCall ncCall = null;\nif (this.eContainer() instanceof org.emftext.language.java.instantiations.NewConstructorCall) {\n\tncCall = ( org.emftext.language.java.instantiations.NewConstructorCall) this.eContainer();;\n}\nif (ncCall == null) {\n\treturn memberList;\n}\nelse {\n\torg.emftext.language.java.classifiers.ConcreteClassifier classifier = ( org.emftext.language.java.classifiers.ConcreteClassifier) ncCall.getTypeReference().getTarget();\n\tif (classifier != null) {\n\t\torg.eclipse.emf.common.util.EList< org.emftext.language.java.members.Member> superMemberList = classifier.getAllMembers(context);\n\t\tfor( org.emftext.language.java.members.Member superMember : superMemberList) {\n\t\t\t//exclude private members\n\t\t\tif(superMember instanceof org.emftext.language.java.modifiers.AnnotableAndModifiable) {\t\t\t\t\t\n\t\t\t\tif (superMember.eIsProxy()) {\n\t\t\t\t\tsuperMember = ( org.emftext.language.java.members.Member) org.eclipse.emf.ecore.util.EcoreUtil.resolve(superMember, this);\n\t\t\t\t}\n\t\t\t\torg.emftext.language.java.modifiers.AnnotableAndModifiable modifiable = ( org.emftext.language.java.modifiers.AnnotableAndModifiable) superMember;\n\t\t\t\tif(!modifiable.isHidden(context)) {\n\t\t\t\t\tmemberList.add(superMember);\n\t\t\t\t}\n\t\t\t}\n\t\t\telse {\n\t\t\t\tmemberList.add(superMember);\n\t\t\t}\n\t\t}\n\t}\n\treturn memberList;\n}'"
   * @generated
   */
  EList<Member> getAllMembers(Commentable context);

} // AnonymousClass
