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
package org.emftext.language.java.references;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.arrays.ArraySelector;

import org.emftext.language.java.expressions.PrimaryExpression;

import org.emftext.language.java.generics.TypeArgumentable;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.Reference#getNext <em>Next</em>}</li>
 *   <li>{@link org.emftext.language.java.references.Reference#getArraySelectors <em>Array Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.references.ReferencesPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends PrimaryExpression, TypeArgumentable
{
  /**
   * Returns the value of the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' containment reference.
   * @see #setNext(Reference)
   * @see org.emftext.language.java.references.ReferencesPackage#getReference_Next()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  Reference getNext();

  /**
   * Sets the value of the '{@link org.emftext.language.java.references.Reference#getNext <em>Next</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' containment reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Reference value);

  /**
   * Returns the value of the '<em><b>Array Selectors</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.arrays.ArraySelector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Selectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Selectors</em>' containment reference list.
   * @see org.emftext.language.java.references.ReferencesPackage#getReference_ArraySelectors()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<ArraySelector> getArraySelectors();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Determines the <code>Type</code> of the reference. That is,
   *  either the type to which the reference points directly, or the
   *  type of the element to which the reference points.
   *  
   *  @return the determined type
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this instanceof org.emftext.language.java.literals.Literal) {\n\treturn (( org.emftext.language.java.literals.Literal) this).getType();\n}\n\norg.emftext.language.java.types.Type type = null;\n\n//referenced element point to a type\nif (this instanceof org.emftext.language.java.types.TypedElement) {\n\torg.emftext.language.java.types.TypeReference typeRef = (( org.emftext.language.java.types.TypedElement) this).getTypeReference();\n\ttype = typeRef.getBoundTarget(this);\n}\n//element points to this or super\nelse if (this instanceof org.emftext.language.java.references.SelfReference) {\n\torg.emftext.language.java.types.Type thisClass = null;\n\tif (this.getPrevious() != null) {\n\t\tthisClass = this.getPrevious().getReferencedType();\n\t}\n\telse {\n\t\torg.emftext.language.java.classifiers.AnonymousClass anonymousContainer = getContainingAnonymousClass();\n\t\tif (anonymousContainer != null) {\n\t\t\tthisClass = anonymousContainer;\n\t\t}\n\t\telse {\n\t\t\tthisClass = getContainingConcreteClassifier();\t\n\t\t}\n\t}\n\t\n\t//find super class if \"self\" is \"super\"\n\tif ((( org.emftext.language.java.references.SelfReference) this).getSelf() instanceof org.emftext.language.java.literals.Super) {\n\t\tif (thisClass instanceof org.emftext.language.java.classifiers.Class) {\n\t\t\treturn (( org.emftext.language.java.classifiers.Class)thisClass).getSuperClass();\n\t\t}\n\t\tif (thisClass instanceof org.emftext.language.java.classifiers.AnonymousClass) {\n\t\t\treturn (( org.emftext.language.java.classifiers.AnonymousClass)thisClass).getSuperClassifier();\n\t\t}\n\t}\n\t\n\treturn thisClass;\n}\n//element points to the object\'s class object\nelse if(this instanceof org.emftext.language.java.references.ReflectiveClassReference) {\n\treturn getClassClass();\n}\n//referenced element points to an element with a type\nelse if (this instanceof org.emftext.language.java.references.ElementReference) {\n\torg.emftext.language.java.references.ReferenceableElement target = \n\t\t( org.emftext.language.java.references.ReferenceableElement) (( org.emftext.language.java.references.ElementReference) this).getTarget();\n\tif (target.eIsProxy()) {\n\t\ttype = null;\n\t}\n\t\n\t//Navigate through AdditionalLocalVariable or Field\n\tif(target instanceof org.emftext.language.java.variables.AdditionalLocalVariable) {\n\t\ttarget = ( org.emftext.language.java.references.ReferenceableElement) target.eContainer();\n\t}\n\tif(target instanceof org.emftext.language.java.members.AdditionalField) {\n\t\ttarget = ( org.emftext.language.java.references.ReferenceableElement) target.eContainer();\n\t}\n\tif (target instanceof org.emftext.language.java.types.TypedElement) {\n\t\torg.emftext.language.java.types.TypeReference typeRef = (( org.emftext.language.java.types.TypedElement) target).getTypeReference();\n\t\tif (typeRef != null) {\n\t\t\ttype = typeRef.getBoundTarget(this);\n\t\t}\n\t}\n\telse if (target instanceof org.emftext.language.java.types.Type /*e.g. Annotation\052/ ) {\n\t\treturn ( org.emftext.language.java.types.Type) target;\n\t}\n\telse if(target instanceof org.emftext.language.java.members.EnumConstant) {\n\t\ttype = ( org.emftext.language.java.classifiers.Enumeration)target.eContainer();\n\t}\t\n}\n//Strings may also appear as reference\nelse if (this instanceof org.emftext.language.java.references.StringReference) {\n\treturn getStringClass();\n}\nelse if (this instanceof org.emftext.language.java.expressions.NestedExpression) {\n\ttype = (( org.emftext.language.java.expressions.NestedExpression) this).getExpression().getType();\n}\nelse if (this instanceof org.emftext.language.java.references.PrimitiveTypeReference) {\n\ttype = (( org.emftext.language.java.references.PrimitiveTypeReference)this).getPrimitiveType();\n}\nelse {\n\tassert(false);\n}\nreturn type;'"
   * @generated
   */
  Type getReferencedType();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eContainer() instanceof org.emftext.language.java.references.Reference) { \n\t org.emftext.language.java.references.Reference container = ( org.emftext.language.java.references.Reference) eContainer( ) ; \n\t  if (this.equals(container.getNext())) {\n\t\t return container;\n\t }\n}\nreturn null;'"
   * @generated
   */
  Reference getPrevious();

} // Reference
