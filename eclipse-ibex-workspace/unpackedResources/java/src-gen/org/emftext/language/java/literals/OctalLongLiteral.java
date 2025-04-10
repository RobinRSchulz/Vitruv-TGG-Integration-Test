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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Octal Long Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.literals.OctalLongLiteral#getOctalValue <em>Octal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.literals.LiteralsPackage#getOctalLongLiteral()
 * @model
 * @generated
 */
public interface OctalLongLiteral extends LongLiteral
{
  /**
   * Returns the value of the '<em><b>Octal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Octal Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Octal Value</em>' attribute.
   * @see #setOctalValue(BigInteger)
   * @see org.emftext.language.java.literals.LiteralsPackage#getOctalLongLiteral_OctalValue()
   * @model required="true"
   * @generated
   */
  BigInteger getOctalValue();

  /**
   * Sets the value of the '{@link org.emftext.language.java.literals.OctalLongLiteral#getOctalValue <em>Octal Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Octal Value</em>' attribute.
   * @see #getOctalValue()
   * @generated
   */
  void setOctalValue(BigInteger value);

} // OctalLongLiteral
