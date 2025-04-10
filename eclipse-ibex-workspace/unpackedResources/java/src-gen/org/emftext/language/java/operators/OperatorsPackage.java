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
package org.emftext.language.java.operators;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.emftext.language.java.commons.CommonsPackage;

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
 * @see org.emftext.language.java.operators.OperatorsFactory
 * @model kind="package"
 * @generated
 */
public interface OperatorsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "operators";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/operators";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "operators";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OperatorsPackage eINSTANCE = org.emftext.language.java.operators.impl.OperatorsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.OperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AdditiveOperatorImpl <em>Additive Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AdditiveOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAdditiveOperator()
   * @generated
   */
  int ADDITIVE_OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Additive Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentOperatorImpl <em>Assignment Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentOperator()
   * @generated
   */
  int ASSIGNMENT_OPERATOR = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.EqualityOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getEqualityOperator()
   * @generated
   */
  int EQUALITY_OPERATOR = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Equality Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.MultiplicativeOperatorImpl <em>Multiplicative Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.MultiplicativeOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getMultiplicativeOperator()
   * @generated
   */
  int MULTIPLICATIVE_OPERATOR = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Multiplicative Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.RelationOperatorImpl <em>Relation Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.RelationOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getRelationOperator()
   * @generated
   */
  int RELATION_OPERATOR = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Relation Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.ShiftOperatorImpl <em>Shift Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.ShiftOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getShiftOperator()
   * @generated
   */
  int SHIFT_OPERATOR = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Shift Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.UnaryOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getUnaryOperator()
   * @generated
   */
  int UNARY_OPERATOR = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Unary Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.UnaryModificationOperatorImpl <em>Unary Modification Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.UnaryModificationOperatorImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getUnaryModificationOperator()
   * @generated
   */
  int UNARY_MODIFICATION_OPERATOR = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_OPERATOR__LAYOUT_INFORMATIONS = OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Unary Modification Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentAndImpl <em>Assignment And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentAndImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentAnd()
   * @generated
   */
  int ASSIGNMENT_AND = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_AND__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_AND_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentDivisionImpl <em>Assignment Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentDivisionImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentDivision()
   * @generated
   */
  int ASSIGNMENT_DIVISION = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_DIVISION__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_DIVISION_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentExclusiveOrImpl <em>Assignment Exclusive Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentExclusiveOrImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentExclusiveOr()
   * @generated
   */
  int ASSIGNMENT_EXCLUSIVE_OR = 12;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXCLUSIVE_OR__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Exclusive Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXCLUSIVE_OR_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentMinusImpl <em>Assignment Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentMinusImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentMinus()
   * @generated
   */
  int ASSIGNMENT_MINUS = 13;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_MINUS__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_MINUS_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentModuloImpl <em>Assignment Modulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentModuloImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentModulo()
   * @generated
   */
  int ASSIGNMENT_MODULO = 14;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_MODULO__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Modulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_MODULO_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentMultiplicationImpl <em>Assignment Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentMultiplicationImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentMultiplication()
   * @generated
   */
  int ASSIGNMENT_MULTIPLICATION = 15;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_MULTIPLICATION__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_MULTIPLICATION_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentLeftShiftImpl <em>Assignment Left Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentLeftShiftImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentLeftShift()
   * @generated
   */
  int ASSIGNMENT_LEFT_SHIFT = 16;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_LEFT_SHIFT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Left Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_LEFT_SHIFT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentOrImpl <em>Assignment Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentOrImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentOr()
   * @generated
   */
  int ASSIGNMENT_OR = 17;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OR__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OR_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentPlusImpl <em>Assignment Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentPlusImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentPlus()
   * @generated
   */
  int ASSIGNMENT_PLUS = 18;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_PLUS__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_PLUS_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentRightShiftImpl <em>Assignment Right Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentRightShiftImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentRightShift()
   * @generated
   */
  int ASSIGNMENT_RIGHT_SHIFT = 19;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_RIGHT_SHIFT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Right Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_RIGHT_SHIFT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AssignmentUnsignedRightShiftImpl <em>Assignment Unsigned Right Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AssignmentUnsignedRightShiftImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentUnsignedRightShift()
   * @generated
   */
  int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT = 20;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT__LAYOUT_INFORMATIONS = ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Unsigned Right Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_UNSIGNED_RIGHT_SHIFT_FEATURE_COUNT = ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.EqualImpl <em>Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.EqualImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getEqual()
   * @generated
   */
  int EQUAL = 21;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__LAYOUT_INFORMATIONS = EQUALITY_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.NotEqualImpl <em>Not Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.NotEqualImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getNotEqual()
   * @generated
   */
  int NOT_EQUAL = 22;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__LAYOUT_INFORMATIONS = EQUALITY_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Not Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_FEATURE_COUNT = EQUALITY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.GreaterThanImpl <em>Greater Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.GreaterThanImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getGreaterThan()
   * @generated
   */
  int GREATER_THAN = 23;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Greater Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.GreaterThanOrEqualImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getGreaterThanOrEqual()
   * @generated
   */
  int GREATER_THAN_OR_EQUAL = 24;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_OR_EQUAL__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.LessThanImpl <em>Less Than</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.LessThanImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getLessThan()
   * @generated
   */
  int LESS_THAN = 25;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_THAN__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Less Than</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_THAN_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.LessThanOrEqualImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getLessThanOrEqual()
   * @generated
   */
  int LESS_THAN_OR_EQUAL = 26;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_THAN_OR_EQUAL__LAYOUT_INFORMATIONS = RELATION_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Less Than Or Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_THAN_OR_EQUAL_FEATURE_COUNT = RELATION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.AdditionImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 27;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LAYOUT_INFORMATIONS = ADDITIVE_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = ADDITIVE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.SubtractionImpl <em>Subtraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.SubtractionImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getSubtraction()
   * @generated
   */
  int SUBTRACTION = 28;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION__LAYOUT_INFORMATIONS = ADDITIVE_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Subtraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_FEATURE_COUNT = ADDITIVE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.DivisionImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 29;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LAYOUT_INFORMATIONS = MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.MultiplicationImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 30;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LAYOUT_INFORMATIONS = MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.RemainderImpl <em>Remainder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.RemainderImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getRemainder()
   * @generated
   */
  int REMAINDER = 31;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMAINDER__LAYOUT_INFORMATIONS = MULTIPLICATIVE_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Remainder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMAINDER_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.ComplementImpl <em>Complement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.ComplementImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getComplement()
   * @generated
   */
  int COMPLEMENT = 32;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEMENT__LAYOUT_INFORMATIONS = UNARY_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Complement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEMENT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.MinusMinusImpl <em>Minus Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.MinusMinusImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getMinusMinus()
   * @generated
   */
  int MINUS_MINUS = 33;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_MINUS__LAYOUT_INFORMATIONS = UNARY_MODIFICATION_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Minus Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_MINUS_FEATURE_COUNT = UNARY_MODIFICATION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.NegateImpl <em>Negate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.NegateImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getNegate()
   * @generated
   */
  int NEGATE = 34;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATE__LAYOUT_INFORMATIONS = UNARY_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Negate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATE_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.PlusPlusImpl <em>Plus Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.PlusPlusImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getPlusPlus()
   * @generated
   */
  int PLUS_PLUS = 35;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_PLUS__LAYOUT_INFORMATIONS = UNARY_MODIFICATION_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Plus Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_PLUS_FEATURE_COUNT = UNARY_MODIFICATION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.LeftShiftImpl <em>Left Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.LeftShiftImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getLeftShift()
   * @generated
   */
  int LEFT_SHIFT = 36;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_SHIFT__LAYOUT_INFORMATIONS = SHIFT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Left Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.RightShiftImpl <em>Right Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.RightShiftImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getRightShift()
   * @generated
   */
  int RIGHT_SHIFT = 37;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SHIFT__LAYOUT_INFORMATIONS = SHIFT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Right Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.operators.impl.UnsignedRightShiftImpl <em>Unsigned Right Shift</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.operators.impl.UnsignedRightShiftImpl
   * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getUnsignedRightShift()
   * @generated
   */
  int UNSIGNED_RIGHT_SHIFT = 38;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_RIGHT_SHIFT__LAYOUT_INFORMATIONS = SHIFT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Unsigned Right Shift</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSIGNED_RIGHT_SHIFT_FEATURE_COUNT = SHIFT_OPERATOR_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see org.emftext.language.java.operators.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AdditiveOperator <em>Additive Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Operator</em>'.
   * @see org.emftext.language.java.operators.AdditiveOperator
   * @generated
   */
  EClass getAdditiveOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentOperator <em>Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Operator</em>'.
   * @see org.emftext.language.java.operators.AssignmentOperator
   * @generated
   */
  EClass getAssignmentOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.EqualityOperator <em>Equality Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Operator</em>'.
   * @see org.emftext.language.java.operators.EqualityOperator
   * @generated
   */
  EClass getEqualityOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Operator</em>'.
   * @see org.emftext.language.java.operators.MultiplicativeOperator
   * @generated
   */
  EClass getMultiplicativeOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.RelationOperator <em>Relation Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Operator</em>'.
   * @see org.emftext.language.java.operators.RelationOperator
   * @generated
   */
  EClass getRelationOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.ShiftOperator <em>Shift Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Operator</em>'.
   * @see org.emftext.language.java.operators.ShiftOperator
   * @generated
   */
  EClass getShiftOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.UnaryOperator <em>Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Operator</em>'.
   * @see org.emftext.language.java.operators.UnaryOperator
   * @generated
   */
  EClass getUnaryOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.UnaryModificationOperator <em>Unary Modification Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Modification Operator</em>'.
   * @see org.emftext.language.java.operators.UnaryModificationOperator
   * @generated
   */
  EClass getUnaryModificationOperator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.emftext.language.java.operators.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentAnd <em>Assignment And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment And</em>'.
   * @see org.emftext.language.java.operators.AssignmentAnd
   * @generated
   */
  EClass getAssignmentAnd();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentDivision <em>Assignment Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Division</em>'.
   * @see org.emftext.language.java.operators.AssignmentDivision
   * @generated
   */
  EClass getAssignmentDivision();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentExclusiveOr <em>Assignment Exclusive Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Exclusive Or</em>'.
   * @see org.emftext.language.java.operators.AssignmentExclusiveOr
   * @generated
   */
  EClass getAssignmentExclusiveOr();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentMinus <em>Assignment Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Minus</em>'.
   * @see org.emftext.language.java.operators.AssignmentMinus
   * @generated
   */
  EClass getAssignmentMinus();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentModulo <em>Assignment Modulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Modulo</em>'.
   * @see org.emftext.language.java.operators.AssignmentModulo
   * @generated
   */
  EClass getAssignmentModulo();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentMultiplication <em>Assignment Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Multiplication</em>'.
   * @see org.emftext.language.java.operators.AssignmentMultiplication
   * @generated
   */
  EClass getAssignmentMultiplication();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentLeftShift <em>Assignment Left Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Left Shift</em>'.
   * @see org.emftext.language.java.operators.AssignmentLeftShift
   * @generated
   */
  EClass getAssignmentLeftShift();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentOr <em>Assignment Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Or</em>'.
   * @see org.emftext.language.java.operators.AssignmentOr
   * @generated
   */
  EClass getAssignmentOr();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentPlus <em>Assignment Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Plus</em>'.
   * @see org.emftext.language.java.operators.AssignmentPlus
   * @generated
   */
  EClass getAssignmentPlus();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentRightShift <em>Assignment Right Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Right Shift</em>'.
   * @see org.emftext.language.java.operators.AssignmentRightShift
   * @generated
   */
  EClass getAssignmentRightShift();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.AssignmentUnsignedRightShift <em>Assignment Unsigned Right Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Unsigned Right Shift</em>'.
   * @see org.emftext.language.java.operators.AssignmentUnsignedRightShift
   * @generated
   */
  EClass getAssignmentUnsignedRightShift();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Equal <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal</em>'.
   * @see org.emftext.language.java.operators.Equal
   * @generated
   */
  EClass getEqual();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.NotEqual <em>Not Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equal</em>'.
   * @see org.emftext.language.java.operators.NotEqual
   * @generated
   */
  EClass getNotEqual();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.GreaterThan <em>Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Than</em>'.
   * @see org.emftext.language.java.operators.GreaterThan
   * @generated
   */
  EClass getGreaterThan();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Than Or Equal</em>'.
   * @see org.emftext.language.java.operators.GreaterThanOrEqual
   * @generated
   */
  EClass getGreaterThanOrEqual();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.LessThan <em>Less Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Than</em>'.
   * @see org.emftext.language.java.operators.LessThan
   * @generated
   */
  EClass getLessThan();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.LessThanOrEqual <em>Less Than Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Than Or Equal</em>'.
   * @see org.emftext.language.java.operators.LessThanOrEqual
   * @generated
   */
  EClass getLessThanOrEqual();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see org.emftext.language.java.operators.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Subtraction <em>Subtraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtraction</em>'.
   * @see org.emftext.language.java.operators.Subtraction
   * @generated
   */
  EClass getSubtraction();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see org.emftext.language.java.operators.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see org.emftext.language.java.operators.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Remainder <em>Remainder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remainder</em>'.
   * @see org.emftext.language.java.operators.Remainder
   * @generated
   */
  EClass getRemainder();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Complement <em>Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complement</em>'.
   * @see org.emftext.language.java.operators.Complement
   * @generated
   */
  EClass getComplement();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.MinusMinus <em>Minus Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Minus</em>'.
   * @see org.emftext.language.java.operators.MinusMinus
   * @generated
   */
  EClass getMinusMinus();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.Negate <em>Negate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negate</em>'.
   * @see org.emftext.language.java.operators.Negate
   * @generated
   */
  EClass getNegate();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.PlusPlus <em>Plus Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Plus</em>'.
   * @see org.emftext.language.java.operators.PlusPlus
   * @generated
   */
  EClass getPlusPlus();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.LeftShift <em>Left Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Shift</em>'.
   * @see org.emftext.language.java.operators.LeftShift
   * @generated
   */
  EClass getLeftShift();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.RightShift <em>Right Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Shift</em>'.
   * @see org.emftext.language.java.operators.RightShift
   * @generated
   */
  EClass getRightShift();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.operators.UnsignedRightShift <em>Unsigned Right Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unsigned Right Shift</em>'.
   * @see org.emftext.language.java.operators.UnsignedRightShift
   * @generated
   */
  EClass getUnsignedRightShift();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OperatorsFactory getOperatorsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.OperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AdditiveOperatorImpl <em>Additive Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AdditiveOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAdditiveOperator()
     * @generated
     */
    EClass ADDITIVE_OPERATOR = eINSTANCE.getAdditiveOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentOperatorImpl <em>Assignment Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentOperator()
     * @generated
     */
    EClass ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.EqualityOperatorImpl <em>Equality Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.EqualityOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getEqualityOperator()
     * @generated
     */
    EClass EQUALITY_OPERATOR = eINSTANCE.getEqualityOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.MultiplicativeOperatorImpl <em>Multiplicative Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.MultiplicativeOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getMultiplicativeOperator()
     * @generated
     */
    EClass MULTIPLICATIVE_OPERATOR = eINSTANCE.getMultiplicativeOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.RelationOperatorImpl <em>Relation Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.RelationOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getRelationOperator()
     * @generated
     */
    EClass RELATION_OPERATOR = eINSTANCE.getRelationOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.ShiftOperatorImpl <em>Shift Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.ShiftOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getShiftOperator()
     * @generated
     */
    EClass SHIFT_OPERATOR = eINSTANCE.getShiftOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.UnaryOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getUnaryOperator()
     * @generated
     */
    EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.UnaryModificationOperatorImpl <em>Unary Modification Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.UnaryModificationOperatorImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getUnaryModificationOperator()
     * @generated
     */
    EClass UNARY_MODIFICATION_OPERATOR = eINSTANCE.getUnaryModificationOperator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentAndImpl <em>Assignment And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentAndImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentAnd()
     * @generated
     */
    EClass ASSIGNMENT_AND = eINSTANCE.getAssignmentAnd();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentDivisionImpl <em>Assignment Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentDivisionImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentDivision()
     * @generated
     */
    EClass ASSIGNMENT_DIVISION = eINSTANCE.getAssignmentDivision();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentExclusiveOrImpl <em>Assignment Exclusive Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentExclusiveOrImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentExclusiveOr()
     * @generated
     */
    EClass ASSIGNMENT_EXCLUSIVE_OR = eINSTANCE.getAssignmentExclusiveOr();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentMinusImpl <em>Assignment Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentMinusImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentMinus()
     * @generated
     */
    EClass ASSIGNMENT_MINUS = eINSTANCE.getAssignmentMinus();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentModuloImpl <em>Assignment Modulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentModuloImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentModulo()
     * @generated
     */
    EClass ASSIGNMENT_MODULO = eINSTANCE.getAssignmentModulo();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentMultiplicationImpl <em>Assignment Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentMultiplicationImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentMultiplication()
     * @generated
     */
    EClass ASSIGNMENT_MULTIPLICATION = eINSTANCE.getAssignmentMultiplication();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentLeftShiftImpl <em>Assignment Left Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentLeftShiftImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentLeftShift()
     * @generated
     */
    EClass ASSIGNMENT_LEFT_SHIFT = eINSTANCE.getAssignmentLeftShift();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentOrImpl <em>Assignment Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentOrImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentOr()
     * @generated
     */
    EClass ASSIGNMENT_OR = eINSTANCE.getAssignmentOr();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentPlusImpl <em>Assignment Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentPlusImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentPlus()
     * @generated
     */
    EClass ASSIGNMENT_PLUS = eINSTANCE.getAssignmentPlus();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentRightShiftImpl <em>Assignment Right Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentRightShiftImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentRightShift()
     * @generated
     */
    EClass ASSIGNMENT_RIGHT_SHIFT = eINSTANCE.getAssignmentRightShift();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AssignmentUnsignedRightShiftImpl <em>Assignment Unsigned Right Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AssignmentUnsignedRightShiftImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAssignmentUnsignedRightShift()
     * @generated
     */
    EClass ASSIGNMENT_UNSIGNED_RIGHT_SHIFT = eINSTANCE.getAssignmentUnsignedRightShift();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.EqualImpl <em>Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.EqualImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getEqual()
     * @generated
     */
    EClass EQUAL = eINSTANCE.getEqual();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.NotEqualImpl <em>Not Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.NotEqualImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getNotEqual()
     * @generated
     */
    EClass NOT_EQUAL = eINSTANCE.getNotEqual();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.GreaterThanImpl <em>Greater Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.GreaterThanImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getGreaterThan()
     * @generated
     */
    EClass GREATER_THAN = eINSTANCE.getGreaterThan();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.GreaterThanOrEqualImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getGreaterThanOrEqual()
     * @generated
     */
    EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.LessThanImpl <em>Less Than</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.LessThanImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getLessThan()
     * @generated
     */
    EClass LESS_THAN = eINSTANCE.getLessThan();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.LessThanOrEqualImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getLessThanOrEqual()
     * @generated
     */
    EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.AdditionImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.SubtractionImpl <em>Subtraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.SubtractionImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getSubtraction()
     * @generated
     */
    EClass SUBTRACTION = eINSTANCE.getSubtraction();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.DivisionImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.MultiplicationImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.RemainderImpl <em>Remainder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.RemainderImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getRemainder()
     * @generated
     */
    EClass REMAINDER = eINSTANCE.getRemainder();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.ComplementImpl <em>Complement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.ComplementImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getComplement()
     * @generated
     */
    EClass COMPLEMENT = eINSTANCE.getComplement();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.MinusMinusImpl <em>Minus Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.MinusMinusImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getMinusMinus()
     * @generated
     */
    EClass MINUS_MINUS = eINSTANCE.getMinusMinus();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.NegateImpl <em>Negate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.NegateImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getNegate()
     * @generated
     */
    EClass NEGATE = eINSTANCE.getNegate();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.PlusPlusImpl <em>Plus Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.PlusPlusImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getPlusPlus()
     * @generated
     */
    EClass PLUS_PLUS = eINSTANCE.getPlusPlus();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.LeftShiftImpl <em>Left Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.LeftShiftImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getLeftShift()
     * @generated
     */
    EClass LEFT_SHIFT = eINSTANCE.getLeftShift();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.RightShiftImpl <em>Right Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.RightShiftImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getRightShift()
     * @generated
     */
    EClass RIGHT_SHIFT = eINSTANCE.getRightShift();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.operators.impl.UnsignedRightShiftImpl <em>Unsigned Right Shift</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.operators.impl.UnsignedRightShiftImpl
     * @see org.emftext.language.java.operators.impl.OperatorsPackageImpl#getUnsignedRightShift()
     * @generated
     */
    EClass UNSIGNED_RIGHT_SHIFT = eINSTANCE.getUnsignedRightShift();

  }

} //OperatorsPackage
