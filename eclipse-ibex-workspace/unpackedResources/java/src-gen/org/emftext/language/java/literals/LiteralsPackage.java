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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.literals.LiteralsFactory
 * @model kind="package"
 * @generated
 */
public interface LiteralsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "literals";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/literals";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "literals";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LiteralsPackage eINSTANCE = org.emftext.language.java.literals.impl.LiteralsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.LiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LAYOUT_INFORMATIONS = ExpressionsPackage.PRIMARY_EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.SelfImpl <em>Self</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.SelfImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getSelf()
   * @generated
   */
  int SELF = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Self</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.BooleanLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LAYOUT_INFORMATIONS = LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.CharacterLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
   * @generated
   */
  int CHARACTER_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__LAYOUT_INFORMATIONS = LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Character Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.FloatLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__LAYOUT_INFORMATIONS = LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.DecimalFloatLiteralImpl <em>Decimal Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.DecimalFloatLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalFloatLiteral()
   * @generated
   */
  int DECIMAL_FLOAT_LITERAL = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_FLOAT_LITERAL__LAYOUT_INFORMATIONS = FLOAT_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE = FLOAT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_FLOAT_LITERAL_FEATURE_COUNT = FLOAT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.HexFloatLiteralImpl <em>Hex Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.HexFloatLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexFloatLiteral()
   * @generated
   */
  int HEX_FLOAT_LITERAL = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_FLOAT_LITERAL__LAYOUT_INFORMATIONS = FLOAT_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Hex Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_FLOAT_LITERAL__HEX_VALUE = FLOAT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hex Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_FLOAT_LITERAL_FEATURE_COUNT = FLOAT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.DoubleLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDoubleLiteral()
   * @generated
   */
  int DOUBLE_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__LAYOUT_INFORMATIONS = LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.DecimalDoubleLiteralImpl <em>Decimal Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.DecimalDoubleLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalDoubleLiteral()
   * @generated
   */
  int DECIMAL_DOUBLE_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_DOUBLE_LITERAL__LAYOUT_INFORMATIONS = DOUBLE_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_DOUBLE_LITERAL__DECIMAL_VALUE = DOUBLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_DOUBLE_LITERAL_FEATURE_COUNT = DOUBLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.HexDoubleLiteralImpl <em>Hex Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.HexDoubleLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexDoubleLiteral()
   * @generated
   */
  int HEX_DOUBLE_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_DOUBLE_LITERAL__LAYOUT_INFORMATIONS = DOUBLE_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Hex Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_DOUBLE_LITERAL__HEX_VALUE = DOUBLE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hex Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_DOUBLE_LITERAL_FEATURE_COUNT = DOUBLE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.IntegerLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__LAYOUT_INFORMATIONS = LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.DecimalIntegerLiteralImpl <em>Decimal Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.DecimalIntegerLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalIntegerLiteral()
   * @generated
   */
  int DECIMAL_INTEGER_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_INTEGER_LITERAL__LAYOUT_INFORMATIONS = INTEGER_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE = INTEGER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_INTEGER_LITERAL_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.HexIntegerLiteralImpl <em>Hex Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.HexIntegerLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexIntegerLiteral()
   * @generated
   */
  int HEX_INTEGER_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_INTEGER_LITERAL__LAYOUT_INFORMATIONS = INTEGER_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Hex Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_INTEGER_LITERAL__HEX_VALUE = INTEGER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hex Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_INTEGER_LITERAL_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.OctalIntegerLiteralImpl <em>Octal Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.OctalIntegerLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getOctalIntegerLiteral()
   * @generated
   */
  int OCTAL_INTEGER_LITERAL = 13;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAL_INTEGER_LITERAL__LAYOUT_INFORMATIONS = INTEGER_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Octal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAL_INTEGER_LITERAL__OCTAL_VALUE = INTEGER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Octal Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAL_INTEGER_LITERAL_FEATURE_COUNT = INTEGER_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.LongLiteralImpl <em>Long Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.LongLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getLongLiteral()
   * @generated
   */
  int LONG_LITERAL = 14;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_LITERAL__LAYOUT_INFORMATIONS = LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Long Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.DecimalLongLiteralImpl <em>Decimal Long Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.DecimalLongLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalLongLiteral()
   * @generated
   */
  int DECIMAL_LONG_LITERAL = 15;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LONG_LITERAL__LAYOUT_INFORMATIONS = LONG_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LONG_LITERAL__DECIMAL_VALUE = LONG_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Long Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_LONG_LITERAL_FEATURE_COUNT = LONG_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.HexLongLiteralImpl <em>Hex Long Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.HexLongLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexLongLiteral()
   * @generated
   */
  int HEX_LONG_LITERAL = 16;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_LONG_LITERAL__LAYOUT_INFORMATIONS = LONG_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Hex Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_LONG_LITERAL__HEX_VALUE = LONG_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hex Long Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEX_LONG_LITERAL_FEATURE_COUNT = LONG_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.OctalLongLiteralImpl <em>Octal Long Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.OctalLongLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getOctalLongLiteral()
   * @generated
   */
  int OCTAL_LONG_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAL_LONG_LITERAL__LAYOUT_INFORMATIONS = LONG_LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Octal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAL_LONG_LITERAL__OCTAL_VALUE = LONG_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Octal Long Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAL_LONG_LITERAL_FEATURE_COUNT = LONG_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.NullLiteralImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__LAYOUT_INFORMATIONS = LITERAL__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.SuperImpl <em>Super</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.SuperImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getSuper()
   * @generated
   */
  int SUPER = 19;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER__LAYOUT_INFORMATIONS = SELF__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Super</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_FEATURE_COUNT = SELF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.literals.impl.ThisImpl <em>This</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.literals.impl.ThisImpl
   * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getThis()
   * @generated
   */
  int THIS = 20;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__LAYOUT_INFORMATIONS = SELF__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_FEATURE_COUNT = SELF_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.emftext.language.java.literals.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.Self <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self</em>'.
   * @see org.emftext.language.java.literals.Self
   * @generated
   */
  EClass getSelf();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.emftext.language.java.literals.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.emftext.language.java.literals.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.CharacterLiteral <em>Character Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character Literal</em>'.
   * @see org.emftext.language.java.literals.CharacterLiteral
   * @generated
   */
  EClass getCharacterLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.CharacterLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.emftext.language.java.literals.CharacterLiteral#getValue()
   * @see #getCharacterLiteral()
   * @generated
   */
  EAttribute getCharacterLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see org.emftext.language.java.literals.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.DecimalFloatLiteral <em>Decimal Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Float Literal</em>'.
   * @see org.emftext.language.java.literals.DecimalFloatLiteral
   * @generated
   */
  EClass getDecimalFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.DecimalFloatLiteral#getDecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal Value</em>'.
   * @see org.emftext.language.java.literals.DecimalFloatLiteral#getDecimalValue()
   * @see #getDecimalFloatLiteral()
   * @generated
   */
  EAttribute getDecimalFloatLiteral_DecimalValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.HexFloatLiteral <em>Hex Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hex Float Literal</em>'.
   * @see org.emftext.language.java.literals.HexFloatLiteral
   * @generated
   */
  EClass getHexFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.HexFloatLiteral#getHexValue <em>Hex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex Value</em>'.
   * @see org.emftext.language.java.literals.HexFloatLiteral#getHexValue()
   * @see #getHexFloatLiteral()
   * @generated
   */
  EAttribute getHexFloatLiteral_HexValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Literal</em>'.
   * @see org.emftext.language.java.literals.DoubleLiteral
   * @generated
   */
  EClass getDoubleLiteral();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.DecimalDoubleLiteral <em>Decimal Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Double Literal</em>'.
   * @see org.emftext.language.java.literals.DecimalDoubleLiteral
   * @generated
   */
  EClass getDecimalDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.DecimalDoubleLiteral#getDecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal Value</em>'.
   * @see org.emftext.language.java.literals.DecimalDoubleLiteral#getDecimalValue()
   * @see #getDecimalDoubleLiteral()
   * @generated
   */
  EAttribute getDecimalDoubleLiteral_DecimalValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.HexDoubleLiteral <em>Hex Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hex Double Literal</em>'.
   * @see org.emftext.language.java.literals.HexDoubleLiteral
   * @generated
   */
  EClass getHexDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.HexDoubleLiteral#getHexValue <em>Hex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex Value</em>'.
   * @see org.emftext.language.java.literals.HexDoubleLiteral#getHexValue()
   * @see #getHexDoubleLiteral()
   * @generated
   */
  EAttribute getHexDoubleLiteral_HexValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.emftext.language.java.literals.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.DecimalIntegerLiteral <em>Decimal Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Integer Literal</em>'.
   * @see org.emftext.language.java.literals.DecimalIntegerLiteral
   * @generated
   */
  EClass getDecimalIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.DecimalIntegerLiteral#getDecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal Value</em>'.
   * @see org.emftext.language.java.literals.DecimalIntegerLiteral#getDecimalValue()
   * @see #getDecimalIntegerLiteral()
   * @generated
   */
  EAttribute getDecimalIntegerLiteral_DecimalValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.HexIntegerLiteral <em>Hex Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hex Integer Literal</em>'.
   * @see org.emftext.language.java.literals.HexIntegerLiteral
   * @generated
   */
  EClass getHexIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.HexIntegerLiteral#getHexValue <em>Hex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex Value</em>'.
   * @see org.emftext.language.java.literals.HexIntegerLiteral#getHexValue()
   * @see #getHexIntegerLiteral()
   * @generated
   */
  EAttribute getHexIntegerLiteral_HexValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.OctalIntegerLiteral <em>Octal Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Octal Integer Literal</em>'.
   * @see org.emftext.language.java.literals.OctalIntegerLiteral
   * @generated
   */
  EClass getOctalIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.OctalIntegerLiteral#getOctalValue <em>Octal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octal Value</em>'.
   * @see org.emftext.language.java.literals.OctalIntegerLiteral#getOctalValue()
   * @see #getOctalIntegerLiteral()
   * @generated
   */
  EAttribute getOctalIntegerLiteral_OctalValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.LongLiteral <em>Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Literal</em>'.
   * @see org.emftext.language.java.literals.LongLiteral
   * @generated
   */
  EClass getLongLiteral();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.DecimalLongLiteral <em>Decimal Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Long Literal</em>'.
   * @see org.emftext.language.java.literals.DecimalLongLiteral
   * @generated
   */
  EClass getDecimalLongLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.DecimalLongLiteral#getDecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal Value</em>'.
   * @see org.emftext.language.java.literals.DecimalLongLiteral#getDecimalValue()
   * @see #getDecimalLongLiteral()
   * @generated
   */
  EAttribute getDecimalLongLiteral_DecimalValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.HexLongLiteral <em>Hex Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hex Long Literal</em>'.
   * @see org.emftext.language.java.literals.HexLongLiteral
   * @generated
   */
  EClass getHexLongLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.HexLongLiteral#getHexValue <em>Hex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex Value</em>'.
   * @see org.emftext.language.java.literals.HexLongLiteral#getHexValue()
   * @see #getHexLongLiteral()
   * @generated
   */
  EAttribute getHexLongLiteral_HexValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.OctalLongLiteral <em>Octal Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Octal Long Literal</em>'.
   * @see org.emftext.language.java.literals.OctalLongLiteral
   * @generated
   */
  EClass getOctalLongLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.literals.OctalLongLiteral#getOctalValue <em>Octal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octal Value</em>'.
   * @see org.emftext.language.java.literals.OctalLongLiteral#getOctalValue()
   * @see #getOctalLongLiteral()
   * @generated
   */
  EAttribute getOctalLongLiteral_OctalValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.emftext.language.java.literals.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.Super <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super</em>'.
   * @see org.emftext.language.java.literals.Super
   * @generated
   */
  EClass getSuper();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.literals.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This</em>'.
   * @see org.emftext.language.java.literals.This
   * @generated
   */
  EClass getThis();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LiteralsFactory getLiteralsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.LiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.SelfImpl <em>Self</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.SelfImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getSelf()
     * @generated
     */
    EClass SELF = eINSTANCE.getSelf();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.BooleanLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.CharacterLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getCharacterLiteral()
     * @generated
     */
    EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER_LITERAL__VALUE = eINSTANCE.getCharacterLiteral_Value();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.FloatLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.DecimalFloatLiteralImpl <em>Decimal Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.DecimalFloatLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalFloatLiteral()
     * @generated
     */
    EClass DECIMAL_FLOAT_LITERAL = eINSTANCE.getDecimalFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalFloatLiteral_DecimalValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.HexFloatLiteralImpl <em>Hex Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.HexFloatLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexFloatLiteral()
     * @generated
     */
    EClass HEX_FLOAT_LITERAL = eINSTANCE.getHexFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEX_FLOAT_LITERAL__HEX_VALUE = eINSTANCE.getHexFloatLiteral_HexValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.DoubleLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDoubleLiteral()
     * @generated
     */
    EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.DecimalDoubleLiteralImpl <em>Decimal Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.DecimalDoubleLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalDoubleLiteral()
     * @generated
     */
    EClass DECIMAL_DOUBLE_LITERAL = eINSTANCE.getDecimalDoubleLiteral();

    /**
     * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_DOUBLE_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalDoubleLiteral_DecimalValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.HexDoubleLiteralImpl <em>Hex Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.HexDoubleLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexDoubleLiteral()
     * @generated
     */
    EClass HEX_DOUBLE_LITERAL = eINSTANCE.getHexDoubleLiteral();

    /**
     * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEX_DOUBLE_LITERAL__HEX_VALUE = eINSTANCE.getHexDoubleLiteral_HexValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.IntegerLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.DecimalIntegerLiteralImpl <em>Decimal Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.DecimalIntegerLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalIntegerLiteral()
     * @generated
     */
    EClass DECIMAL_INTEGER_LITERAL = eINSTANCE.getDecimalIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalIntegerLiteral_DecimalValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.HexIntegerLiteralImpl <em>Hex Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.HexIntegerLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexIntegerLiteral()
     * @generated
     */
    EClass HEX_INTEGER_LITERAL = eINSTANCE.getHexIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEX_INTEGER_LITERAL__HEX_VALUE = eINSTANCE.getHexIntegerLiteral_HexValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.OctalIntegerLiteralImpl <em>Octal Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.OctalIntegerLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getOctalIntegerLiteral()
     * @generated
     */
    EClass OCTAL_INTEGER_LITERAL = eINSTANCE.getOctalIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Octal Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCTAL_INTEGER_LITERAL__OCTAL_VALUE = eINSTANCE.getOctalIntegerLiteral_OctalValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.LongLiteralImpl <em>Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.LongLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getLongLiteral()
     * @generated
     */
    EClass LONG_LITERAL = eINSTANCE.getLongLiteral();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.DecimalLongLiteralImpl <em>Decimal Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.DecimalLongLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getDecimalLongLiteral()
     * @generated
     */
    EClass DECIMAL_LONG_LITERAL = eINSTANCE.getDecimalLongLiteral();

    /**
     * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_LONG_LITERAL__DECIMAL_VALUE = eINSTANCE.getDecimalLongLiteral_DecimalValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.HexLongLiteralImpl <em>Hex Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.HexLongLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getHexLongLiteral()
     * @generated
     */
    EClass HEX_LONG_LITERAL = eINSTANCE.getHexLongLiteral();

    /**
     * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEX_LONG_LITERAL__HEX_VALUE = eINSTANCE.getHexLongLiteral_HexValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.OctalLongLiteralImpl <em>Octal Long Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.OctalLongLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getOctalLongLiteral()
     * @generated
     */
    EClass OCTAL_LONG_LITERAL = eINSTANCE.getOctalLongLiteral();

    /**
     * The meta object literal for the '<em><b>Octal Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCTAL_LONG_LITERAL__OCTAL_VALUE = eINSTANCE.getOctalLongLiteral_OctalValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.NullLiteralImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.SuperImpl <em>Super</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.SuperImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getSuper()
     * @generated
     */
    EClass SUPER = eINSTANCE.getSuper();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.literals.impl.ThisImpl <em>This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.literals.impl.ThisImpl
     * @see org.emftext.language.java.literals.impl.LiteralsPackageImpl#getThis()
     * @generated
     */
    EClass THIS = eINSTANCE.getThis();

  }

} //LiteralsPackage
