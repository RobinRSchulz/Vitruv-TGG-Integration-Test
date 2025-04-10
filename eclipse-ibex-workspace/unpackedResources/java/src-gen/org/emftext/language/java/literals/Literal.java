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
package org.emftext.language.java.literals;

import org.emftext.language.java.expressions.PrimaryExpression;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.literals.LiteralsPackage#getLiteral()
 * @model abstract="true"
 * @generated
 */
public interface Literal extends PrimaryExpression
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return type of the literal
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//Overrides implementation in Expression\norg.emftext.language.java.classifiers.Class javaClass = null;\n\nif (this instanceof org.emftext.language.java.literals.NullLiteral) {\n\tjavaClass = getLibClass(\"Void\");\n}\nelse if (this instanceof org.emftext.language.java.literals.BooleanLiteral) {\n\tjavaClass = getLibClass(\"Boolean\");\n}\nelse if (this instanceof org.emftext.language.java.literals.DoubleLiteral) {\n\tjavaClass = getLibClass(\"Double\");\n}\nelse if (this instanceof org.emftext.language.java.literals.FloatLiteral) {\n\tjavaClass = getLibClass(\"Float\");\n}\nelse if (this instanceof org.emftext.language.java.literals.IntegerLiteral) {\n\tjavaClass = getLibClass(\"Integer\");\n}\nelse if (this instanceof org.emftext.language.java.literals.LongLiteral) {\n\tjavaClass = getLibClass(\"Long\");\n}\nelse if (this instanceof org.emftext.language.java.literals.CharacterLiteral) {\n\tjavaClass = getLibClass(\"Character\");\n}\n\nreturn javaClass;'"
   * @generated
   */
  Type getOneType(boolean alternative);

} // Literal
