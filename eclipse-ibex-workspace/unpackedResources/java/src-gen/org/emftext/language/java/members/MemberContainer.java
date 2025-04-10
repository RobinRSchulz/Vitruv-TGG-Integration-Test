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
package org.emftext.language.java.members;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getMembers <em>Members</em>}</li>
 *   <li>{@link org.emftext.language.java.members.MemberContainer#getDefaultMembers <em>Default Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.members.MembersPackage#getMemberContainer()
 * @model abstract="true"
 * @generated
 */
public interface MemberContainer extends Commentable
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.members.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.emftext.language.java.members.MembersPackage#getMemberContainer_Members()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Member> getMembers();

  /**
   * Returns the value of the '<em><b>Default Members</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.members.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Members</em>' containment reference list.
   * @see org.emftext.language.java.members.MembersPackage#getMemberContainer_DefaultMembers()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<Member> getDefaultMembers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param name
   *  @return classifier with the given name defined in this member container
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for( org.emftext.language.java.members.Member member : getMembers()) {\n\tif (member instanceof org.emftext.language.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {\n\t\treturn ( org.emftext.language.java.classifiers.ConcreteClassifier) member;\n\t}\n \t\t}\nfor( org.emftext.language.java.members.Member member : getDefaultMembers()) {\n\tif (member instanceof org.emftext.language.java.classifiers.ConcreteClassifier && name.equals(member.getName())) {\n\t\treturn ( org.emftext.language.java.classifiers.ConcreteClassifier) member;\n\t}\n \t\t}\nreturn null;'"
   * @generated
   */
  ConcreteClassifier getContainedClassifier(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param name
   *  @return field with the given name defined in this member container
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for( org.emftext.language.java.members.Member member : getMembers()) {\n\tif (member instanceof org.emftext.language.java.members.Field && name.equals(member.getName())) {\n\t\treturn ( org.emftext.language.java.members.Field) member;\n\t}\n \t\t}\nfor( org.emftext.language.java.members.Member member : getDefaultMembers()) {\n\tif (member instanceof org.emftext.language.java.members.Field && name.equals(member.getName())) {\n\t\treturn ( org.emftext.language.java.members.Field) member;\n\t}\n \t\t}\nreturn null;'"
   * @generated
   */
  Field getContainedField(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param name
   *  @return method with the given name defined in this member container;
   *          null, if there is no such method 
   *          or if there are multiple methods with the same name
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.members.Method found = null;\nfor( org.emftext.language.java.members.Member member : getMembers()) {\n\tif (member instanceof org.emftext.language.java.members.Method && name.equals(member.getName())) {\n\t\tif(found != null) {\n\t\t\treturn null;\n\t\t}\n\t\telse {\n\t\t\tfound = ( org.emftext.language.java.members.Method) member;\n\t\t}\n\t}\n \t\t}\n \t\tfor( org.emftext.language.java.members.Member member : getDefaultMembers()) {\n\tif (member instanceof org.emftext.language.java.members.Method && name.equals(member.getName())) {\n\t\tif(found != null) {\n\t\t\treturn null;\n\t\t}\n\t\telse {\n\t\t\tfound = ( org.emftext.language.java.members.Method) member;\n\t\t}\n\t}\n \t\t}\nreturn found;'"
   * @generated
   */
  Method getContainedMethod(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Method> methodList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Method>();\n\nfor ( org.emftext.language.java.members.Member member : getMembers()) {\n\tif (member instanceof org.emftext.language.java.members.Method) {\n\t\tmethodList.add(( org.emftext.language.java.members.Method) member);\n\t}\n}\t\nreturn methodList;'"
   * @generated
   */
  EList<Method> getMethods();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model nameRequired="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Method> methodsToRemove = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Method>();\n\nfor ( org.emftext.language.java.members.Member member : getMembers()) {\n\tif (member instanceof org.emftext.language.java.members.Method) {\n\t\tif (name.equals(member.getName())) {\n\t\t\tmethodsToRemove.add(( org.emftext.language.java.members.Method) member);\n\t\t}\n\t}\n}\ngetMembers().removeAll(methodsToRemove);'"
   * @generated
   */
  void removeMethods(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model nameRequired="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Member> matchingMembers = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Member>();\n\nfor ( org.emftext.language.java.members.Member member : getMembers()) {\n\tif (name.equals(member.getName())) {\n\t\tmatchingMembers.add(member);\n\t}\n}\t\nreturn matchingMembers;'"
   * @generated
   */
  EList<Member> getMembersByName(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model nameRequired="true" qualifiedTypeNameRequired="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.members.Field field = org.emftext.language.java.members.MembersFactory.eINSTANCE.createField();\nfield.setName(name);\norg.emftext.language.java.types.ClassifierReference typeRef = org.emftext.language.java.types.TypesFactory.eINSTANCE.createClassifierReference();\ntypeRef.setTarget(getConcreteClassifier(qualifiedTypeName));\nfield.setTypeReference(typeRef);\ngetMembers().add(field);\nreturn field;'"
   * @generated
   */
  Field createField(String name, String qualifiedTypeName);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Field> fieldList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.members.Field>();\n\nfor ( org.emftext.language.java.members.Member member : getMembers()) {\n\tif (member instanceof org.emftext.language.java.members.Field) {\n\t\tfieldList.add(( org.emftext.language.java.members.Field) member);\n\t}\n}\t\nreturn fieldList;'"
   * @generated
   */
  EList<Field> getFields();

} // MemberContainer
