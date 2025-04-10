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
package org.emftext.language.java.types;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.members.Member;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.types.TypesPackage#getPrimitiveType()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveType extends Type, TypeReference
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param context to check protected visibility
   *  @return all members (including super type members)
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.classifiers.Class javaClass = wrapPrimitiveType();\t\nreturn javaClass.getAllMembers(context);'"
   * @generated
   */
  EList<Member> getAllMembers(Commentable context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return primitive type as a class representation
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.classifiers.Class javaClass = null;\n\nif (this instanceof org.emftext.language.java.types.Boolean) {\n\tjavaClass = getLibClass(\"Boolean\");\n}\nif (this instanceof org.emftext.language.java.types.Byte) {\n\tjavaClass = getLibClass(\"Byte\");\n}\nif (this instanceof org.emftext.language.java.types.Char) {\n\tjavaClass = getLibClass(\"Character\");\n}\nif (this instanceof org.emftext.language.java.types.Double) {\n\tjavaClass = getLibClass(\"Double\");\n}\nif (this instanceof org.emftext.language.java.types.Float) {\n\tjavaClass = getLibClass(\"Float\");\n}\nif (this instanceof org.emftext.language.java.types.Int) {\n\tjavaClass = getLibClass(\"Integer\");\n}\nif (this instanceof org.emftext.language.java.types.Long) {\n\tjavaClass = getLibClass(\"Long\");\n}\nif (this instanceof org.emftext.language.java.types.Short) {\n\tjavaClass = getLibClass(\"Short\");\n}\nif (this instanceof org.emftext.language.java.types.Void) {\n\tjavaClass = getLibClass(\"Void\");\n}\nreturn javaClass;'"
   * @generated
   */
  org.emftext.language.java.classifiers.Class wrapPrimitiveType();

} // PrimitiveType
