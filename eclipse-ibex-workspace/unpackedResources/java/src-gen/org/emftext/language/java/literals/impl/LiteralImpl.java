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
package org.emftext.language.java.literals.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.java.expressions.impl.PrimaryExpressionImpl;

import org.emftext.language.java.literals.Literal;
import org.emftext.language.java.literals.LiteralsPackage;

import org.emftext.language.java.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LiteralImpl extends PrimaryExpressionImpl implements Literal
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LiteralsPackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getOneType(boolean alternative)
  {
    //Overrides implementation in Expression
    org.emftext.language.java.classifiers.Class javaClass = null;
    
    if (this instanceof org.emftext.language.java.literals.NullLiteral) {
      javaClass = getLibClass("Void");
    }
    else if (this instanceof org.emftext.language.java.literals.BooleanLiteral) {
      javaClass = getLibClass("Boolean");
    }
    else if (this instanceof org.emftext.language.java.literals.DoubleLiteral) {
      javaClass = getLibClass("Double");
    }
    else if (this instanceof org.emftext.language.java.literals.FloatLiteral) {
      javaClass = getLibClass("Float");
    }
    else if (this instanceof org.emftext.language.java.literals.IntegerLiteral) {
      javaClass = getLibClass("Integer");
    }
    else if (this instanceof org.emftext.language.java.literals.LongLiteral) {
      javaClass = getLibClass("Long");
    }
    else if (this instanceof org.emftext.language.java.literals.CharacterLiteral) {
      javaClass = getLibClass("Character");
    }
    
    return javaClass;
  }

} //LiteralImpl
