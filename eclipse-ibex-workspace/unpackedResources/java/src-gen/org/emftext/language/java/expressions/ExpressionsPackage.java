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
package org.emftext.language.java.expressions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.statements.StatementsPackage;

import org.emftext.language.java.types.TypesPackage;

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
 * @see org.emftext.language.java.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "expressions";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/expressions";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "expressions";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExpressionsPackage eINSTANCE = org.emftext.language.java.expressions.impl.ExpressionsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ExpressionListImpl <em>Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ExpressionListImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__LAYOUT_INFORMATIONS = StatementsPackage.FOR_LOOP_INITIALIZER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSIONS = StatementsPackage.FOR_LOOP_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = StatementsPackage.FOR_LOOP_INITIALIZER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LAYOUT_INFORMATIONS = ArraysPackage.ARRAY_INITIALIZATION_VALUE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ArraysPackage.ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.AssignmentExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAssignmentExpression()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__LAYOUT_INFORMATIONS = EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__CHILD = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assignment Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.AssignmentExpressionChildImpl <em>Assignment Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.AssignmentExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAssignmentExpressionChild()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION_CHILD = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Assignment Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ConditionalExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalExpression()
   * @generated
   */
  int CONDITIONAL_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__LAYOUT_INFORMATIONS = ASSIGNMENT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__CHILD = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION_IF = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION_ELSE = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ConditionalExpressionChildImpl <em>Conditional Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ConditionalExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalExpressionChild()
   * @generated
   */
  int CONDITIONAL_EXPRESSION_CHILD = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = ASSIGNMENT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Conditional Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT = ASSIGNMENT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ConditionalOrExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpression()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__LAYOUT_INFORMATIONS = CONDITIONAL_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__CHILDREN = CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conditional Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ConditionalOrExpressionChildImpl <em>Conditional Or Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ConditionalOrExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpressionChild()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION_CHILD = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = CONDITIONAL_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Conditional Or Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ConditionalAndExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpression()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__LAYOUT_INFORMATIONS = CONDITIONAL_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__CHILDREN = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conditional And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ConditionalAndExpressionChildImpl <em>Conditional And Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ConditionalAndExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpressionChild()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION_CHILD = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = CONDITIONAL_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Conditional And Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.InclusiveOrExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpression()
   * @generated
   */
  int INCLUSIVE_OR_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION__LAYOUT_INFORMATIONS = CONDITIONAL_AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION__CHILDREN = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inclusive Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.InclusiveOrExpressionChildImpl <em>Inclusive Or Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.InclusiveOrExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpressionChild()
   * @generated
   */
  int INCLUSIVE_OR_EXPRESSION_CHILD = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = CONDITIONAL_AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Inclusive Or Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ExclusiveOrExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpression()
   * @generated
   */
  int EXCLUSIVE_OR_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION__LAYOUT_INFORMATIONS = INCLUSIVE_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION__CHILDREN = INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ExclusiveOrExpressionChildImpl <em>Exclusive Or Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ExclusiveOrExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpressionChild()
   * @generated
   */
  int EXCLUSIVE_OR_EXPRESSION_CHILD = 13;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = INCLUSIVE_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Exclusive Or Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT = INCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.AndExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LAYOUT_INFORMATIONS = EXCLUSIVE_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__CHILDREN = EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.AndExpressionChildImpl <em>And Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.AndExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAndExpressionChild()
   * @generated
   */
  int AND_EXPRESSION_CHILD = 15;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = EXCLUSIVE_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>And Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CHILD_FEATURE_COUNT = EXCLUSIVE_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.EqualityExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__LAYOUT_INFORMATIONS = AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Equality Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__EQUALITY_OPERATORS = AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__CHILDREN = AND_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = AND_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.EqualityExpressionChildImpl <em>Equality Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.EqualityExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getEqualityExpressionChild()
   * @generated
   */
  int EQUALITY_EXPRESSION_CHILD = 17;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Equality Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_CHILD_FEATURE_COUNT = AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.InstanceOfExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpression()
   * @generated
   */
  int INSTANCE_OF_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION__LAYOUT_INFORMATIONS = ArraysPackage.ARRAY_TYPEABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION__ARRAY_DIMENSIONS_BEFORE = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION__ARRAY_DIMENSIONS_AFTER = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION__TYPE_REFERENCE = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION__CHILD = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance Of Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION_FEATURE_COUNT = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.InstanceOfExpressionChildImpl <em>Instance Of Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.InstanceOfExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpressionChild()
   * @generated
   */
  int INSTANCE_OF_EXPRESSION_CHILD = 19;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = EQUALITY_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Instance Of Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT = EQUALITY_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.RelationExpressionImpl <em>Relation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.RelationExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getRelationExpression()
   * @generated
   */
  int RELATION_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_EXPRESSION__LAYOUT_INFORMATIONS = INSTANCE_OF_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_EXPRESSION__CHILDREN = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_EXPRESSION__RELATION_OPERATORS = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_EXPRESSION_FEATURE_COUNT = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.RelationExpressionChildImpl <em>Relation Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.RelationExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getRelationExpressionChild()
   * @generated
   */
  int RELATION_EXPRESSION_CHILD = 21;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = INSTANCE_OF_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Relation Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_EXPRESSION_CHILD_FEATURE_COUNT = INSTANCE_OF_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ShiftExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getShiftExpression()
   * @generated
   */
  int SHIFT_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__LAYOUT_INFORMATIONS = RELATION_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__CHILDREN = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shift Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__SHIFT_OPERATORS = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Shift Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_FEATURE_COUNT = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.ShiftExpressionChildImpl <em>Shift Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.ShiftExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getShiftExpressionChild()
   * @generated
   */
  int SHIFT_EXPRESSION_CHILD = 23;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = RELATION_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Shift Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_CHILD_FEATURE_COUNT = RELATION_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.AdditiveExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__LAYOUT_INFORMATIONS = SHIFT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__CHILDREN = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Additive Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.AdditiveExpressionChildImpl <em>Additive Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.AdditiveExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAdditiveExpressionChild()
   * @generated
   */
  int ADDITIVE_EXPRESSION_CHILD = 25;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = SHIFT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Additive Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT = SHIFT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.MultiplicativeExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__LAYOUT_INFORMATIONS = ADDITIVE_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__CHILDREN = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiplicative Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.MultiplicativeExpressionChildImpl <em>Multiplicative Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.MultiplicativeExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpressionChild()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION_CHILD = 27;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = ADDITIVE_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Multiplicative Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT = ADDITIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.UnaryExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__LAYOUT_INFORMATIONS = MULTIPLICATIVE_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__OPERATORS = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__CHILD = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.UnaryExpressionChildImpl <em>Unary Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.UnaryExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryExpressionChild()
   * @generated
   */
  int UNARY_EXPRESSION_CHILD = 29;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = MULTIPLICATIVE_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Unary Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_CHILD_FEATURE_COUNT = MULTIPLICATIVE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.UnaryModificationExpressionImpl <em>Unary Modification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.UnaryModificationExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpression()
   * @generated
   */
  int UNARY_MODIFICATION_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_EXPRESSION__LAYOUT_INFORMATIONS = UNARY_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_EXPRESSION__CHILD = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_EXPRESSION__OPERATOR = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Modification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.PrefixUnaryModificationExpressionImpl <em>Prefix Unary Modification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.PrefixUnaryModificationExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getPrefixUnaryModificationExpression()
   * @generated
   */
  int PREFIX_UNARY_MODIFICATION_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_UNARY_MODIFICATION_EXPRESSION__LAYOUT_INFORMATIONS = UNARY_MODIFICATION_EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_UNARY_MODIFICATION_EXPRESSION__CHILD = UNARY_MODIFICATION_EXPRESSION__CHILD;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR = UNARY_MODIFICATION_EXPRESSION__OPERATOR;

  /**
   * The number of structural features of the '<em>Prefix Unary Modification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT = UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.SuffixUnaryModificationExpressionImpl <em>Suffix Unary Modification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.SuffixUnaryModificationExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getSuffixUnaryModificationExpression()
   * @generated
   */
  int SUFFIX_UNARY_MODIFICATION_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUFFIX_UNARY_MODIFICATION_EXPRESSION__LAYOUT_INFORMATIONS = UNARY_MODIFICATION_EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUFFIX_UNARY_MODIFICATION_EXPRESSION__CHILD = UNARY_MODIFICATION_EXPRESSION__CHILD;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUFFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR = UNARY_MODIFICATION_EXPRESSION__OPERATOR;

  /**
   * The number of structural features of the '<em>Suffix Unary Modification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUFFIX_UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT = UNARY_MODIFICATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.UnaryModificationExpressionChildImpl <em>Unary Modification Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.UnaryModificationExpressionChildImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpressionChild()
   * @generated
   */
  int UNARY_MODIFICATION_EXPRESSION_CHILD = 33;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = UNARY_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Unary Modification Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MODIFICATION_EXPRESSION_CHILD_FEATURE_COUNT = UNARY_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.CastExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getCastExpression()
   * @generated
   */
  int CAST_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__LAYOUT_INFORMATIONS = TypesPackage.TYPED_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE_REFERENCE = TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__ARRAY_DIMENSIONS_AFTER = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__CHILD = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.PrimaryExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__LAYOUT_INFORMATIONS = UNARY_MODIFICATION_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = UNARY_MODIFICATION_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.expressions.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.expressions.impl.NestedExpressionImpl
   * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getNestedExpression()
   * @generated
   */
  int NESTED_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__LAYOUT_INFORMATIONS = ReferencesPackage.REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__TYPE_ARGUMENTS = ReferencesPackage.REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__NEXT = ReferencesPackage.REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__ARRAY_SELECTORS = ReferencesPackage.REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__EXPRESSION = ReferencesPackage.REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION_FEATURE_COUNT = ReferencesPackage.REFERENCE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression List</em>'.
   * @see org.emftext.language.java.expressions.ExpressionList
   * @generated
   */
  EClass getExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.ExpressionList#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.emftext.language.java.expressions.ExpressionList#getExpressions()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Expressions();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.emftext.language.java.expressions.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.AssignmentExpression <em>Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression</em>'.
   * @see org.emftext.language.java.expressions.AssignmentExpression
   * @generated
   */
  EClass getAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.AssignmentExpression#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.emftext.language.java.expressions.AssignmentExpression#getChild()
   * @see #getAssignmentExpression()
   * @generated
   */
  EReference getAssignmentExpression_Child();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.AssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment Operator</em>'.
   * @see org.emftext.language.java.expressions.AssignmentExpression#getAssignmentOperator()
   * @see #getAssignmentExpression()
   * @generated
   */
  EReference getAssignmentExpression_AssignmentOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.AssignmentExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.emftext.language.java.expressions.AssignmentExpression#getValue()
   * @see #getAssignmentExpression()
   * @generated
   */
  EReference getAssignmentExpression_Value();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.AssignmentExpressionChild <em>Assignment Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression Child</em>'.
   * @see org.emftext.language.java.expressions.AssignmentExpressionChild
   * @generated
   */
  EClass getAssignmentExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expression</em>'.
   * @see org.emftext.language.java.expressions.ConditionalExpression
   * @generated
   */
  EClass getConditionalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.ConditionalExpression#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.emftext.language.java.expressions.ConditionalExpression#getChild()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Child();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.ConditionalExpression#getExpressionIf <em>Expression If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression If</em>'.
   * @see org.emftext.language.java.expressions.ConditionalExpression#getExpressionIf()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_ExpressionIf();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.ConditionalExpression#getExpressionElse <em>Expression Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression Else</em>'.
   * @see org.emftext.language.java.expressions.ConditionalExpression#getExpressionElse()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_ExpressionElse();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ConditionalExpressionChild <em>Conditional Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expression Child</em>'.
   * @see org.emftext.language.java.expressions.ConditionalExpressionChild
   * @generated
   */
  EClass getConditionalExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression</em>'.
   * @see org.emftext.language.java.expressions.ConditionalOrExpression
   * @generated
   */
  EClass getConditionalOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.ConditionalOrExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.ConditionalOrExpression#getChildren()
   * @see #getConditionalOrExpression()
   * @generated
   */
  EReference getConditionalOrExpression_Children();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression Child</em>'.
   * @see org.emftext.language.java.expressions.ConditionalOrExpressionChild
   * @generated
   */
  EClass getConditionalOrExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression</em>'.
   * @see org.emftext.language.java.expressions.ConditionalAndExpression
   * @generated
   */
  EClass getConditionalAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.ConditionalAndExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.ConditionalAndExpression#getChildren()
   * @see #getConditionalAndExpression()
   * @generated
   */
  EReference getConditionalAndExpression_Children();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression Child</em>'.
   * @see org.emftext.language.java.expressions.ConditionalAndExpressionChild
   * @generated
   */
  EClass getConditionalAndExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusive Or Expression</em>'.
   * @see org.emftext.language.java.expressions.InclusiveOrExpression
   * @generated
   */
  EClass getInclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.InclusiveOrExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.InclusiveOrExpression#getChildren()
   * @see #getInclusiveOrExpression()
   * @generated
   */
  EReference getInclusiveOrExpression_Children();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.InclusiveOrExpressionChild <em>Inclusive Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusive Or Expression Child</em>'.
   * @see org.emftext.language.java.expressions.InclusiveOrExpressionChild
   * @generated
   */
  EClass getInclusiveOrExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive Or Expression</em>'.
   * @see org.emftext.language.java.expressions.ExclusiveOrExpression
   * @generated
   */
  EClass getExclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.ExclusiveOrExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.ExclusiveOrExpression#getChildren()
   * @see #getExclusiveOrExpression()
   * @generated
   */
  EReference getExclusiveOrExpression_Children();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ExclusiveOrExpressionChild <em>Exclusive Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive Or Expression Child</em>'.
   * @see org.emftext.language.java.expressions.ExclusiveOrExpressionChild
   * @generated
   */
  EClass getExclusiveOrExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.emftext.language.java.expressions.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.AndExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.AndExpression#getChildren()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Children();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.AndExpressionChild <em>And Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression Child</em>'.
   * @see org.emftext.language.java.expressions.AndExpressionChild
   * @generated
   */
  EClass getAndExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see org.emftext.language.java.expressions.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.EqualityExpression#getEqualityOperators <em>Equality Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equality Operators</em>'.
   * @see org.emftext.language.java.expressions.EqualityExpression#getEqualityOperators()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_EqualityOperators();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.EqualityExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.EqualityExpression#getChildren()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Children();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.EqualityExpressionChild <em>Equality Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression Child</em>'.
   * @see org.emftext.language.java.expressions.EqualityExpressionChild
   * @generated
   */
  EClass getEqualityExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.InstanceOfExpression <em>Instance Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Of Expression</em>'.
   * @see org.emftext.language.java.expressions.InstanceOfExpression
   * @generated
   */
  EClass getInstanceOfExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.InstanceOfExpression#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.emftext.language.java.expressions.InstanceOfExpression#getChild()
   * @see #getInstanceOfExpression()
   * @generated
   */
  EReference getInstanceOfExpression_Child();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.InstanceOfExpressionChild <em>Instance Of Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Of Expression Child</em>'.
   * @see org.emftext.language.java.expressions.InstanceOfExpressionChild
   * @generated
   */
  EClass getInstanceOfExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.RelationExpression <em>Relation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Expression</em>'.
   * @see org.emftext.language.java.expressions.RelationExpression
   * @generated
   */
  EClass getRelationExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.RelationExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.RelationExpression#getChildren()
   * @see #getRelationExpression()
   * @generated
   */
  EReference getRelationExpression_Children();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.RelationExpression#getRelationOperators <em>Relation Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation Operators</em>'.
   * @see org.emftext.language.java.expressions.RelationExpression#getRelationOperators()
   * @see #getRelationExpression()
   * @generated
   */
  EReference getRelationExpression_RelationOperators();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.RelationExpressionChild <em>Relation Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Expression Child</em>'.
   * @see org.emftext.language.java.expressions.RelationExpressionChild
   * @generated
   */
  EClass getRelationExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expression</em>'.
   * @see org.emftext.language.java.expressions.ShiftExpression
   * @generated
   */
  EClass getShiftExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.ShiftExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.ShiftExpression#getChildren()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_Children();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.ShiftExpression#getShiftOperators <em>Shift Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shift Operators</em>'.
   * @see org.emftext.language.java.expressions.ShiftExpression#getShiftOperators()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_ShiftOperators();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.ShiftExpressionChild <em>Shift Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expression Child</em>'.
   * @see org.emftext.language.java.expressions.ShiftExpressionChild
   * @generated
   */
  EClass getShiftExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see org.emftext.language.java.expressions.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.AdditiveExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.AdditiveExpression#getChildren()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_Children();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.AdditiveExpression#getAdditiveOperators <em>Additive Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additive Operators</em>'.
   * @see org.emftext.language.java.expressions.AdditiveExpression#getAdditiveOperators()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_AdditiveOperators();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.AdditiveExpressionChild <em>Additive Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression Child</em>'.
   * @see org.emftext.language.java.expressions.AdditiveExpressionChild
   * @generated
   */
  EClass getAdditiveExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see org.emftext.language.java.expressions.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.MultiplicativeExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.java.expressions.MultiplicativeExpression#getChildren()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_Children();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.MultiplicativeExpression#getMultiplicativeOperators <em>Multiplicative Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multiplicative Operators</em>'.
   * @see org.emftext.language.java.expressions.MultiplicativeExpression#getMultiplicativeOperators()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_MultiplicativeOperators();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.MultiplicativeExpressionChild <em>Multiplicative Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression Child</em>'.
   * @see org.emftext.language.java.expressions.MultiplicativeExpressionChild
   * @generated
   */
  EClass getMultiplicativeExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.emftext.language.java.expressions.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.expressions.UnaryExpression#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operators</em>'.
   * @see org.emftext.language.java.expressions.UnaryExpression#getOperators()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Operators();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.UnaryExpression#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.emftext.language.java.expressions.UnaryExpression#getChild()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Child();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.UnaryExpressionChild <em>Unary Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression Child</em>'.
   * @see org.emftext.language.java.expressions.UnaryExpressionChild
   * @generated
   */
  EClass getUnaryExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.UnaryModificationExpression <em>Unary Modification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Modification Expression</em>'.
   * @see org.emftext.language.java.expressions.UnaryModificationExpression
   * @generated
   */
  EClass getUnaryModificationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.UnaryModificationExpression#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.emftext.language.java.expressions.UnaryModificationExpression#getChild()
   * @see #getUnaryModificationExpression()
   * @generated
   */
  EReference getUnaryModificationExpression_Child();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.UnaryModificationExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see org.emftext.language.java.expressions.UnaryModificationExpression#getOperator()
   * @see #getUnaryModificationExpression()
   * @generated
   */
  EReference getUnaryModificationExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.PrefixUnaryModificationExpression <em>Prefix Unary Modification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Unary Modification Expression</em>'.
   * @see org.emftext.language.java.expressions.PrefixUnaryModificationExpression
   * @generated
   */
  EClass getPrefixUnaryModificationExpression();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.SuffixUnaryModificationExpression <em>Suffix Unary Modification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suffix Unary Modification Expression</em>'.
   * @see org.emftext.language.java.expressions.SuffixUnaryModificationExpression
   * @generated
   */
  EClass getSuffixUnaryModificationExpression();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.UnaryModificationExpressionChild <em>Unary Modification Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Modification Expression Child</em>'.
   * @see org.emftext.language.java.expressions.UnaryModificationExpressionChild
   * @generated
   */
  EClass getUnaryModificationExpressionChild();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see org.emftext.language.java.expressions.CastExpression
   * @generated
   */
  EClass getCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.CastExpression#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.emftext.language.java.expressions.CastExpression#getChild()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Child();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.emftext.language.java.expressions.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.expressions.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Expression</em>'.
   * @see org.emftext.language.java.expressions.NestedExpression
   * @generated
   */
  EClass getNestedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.expressions.NestedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.emftext.language.java.expressions.NestedExpression#getExpression()
   * @see #getNestedExpression()
   * @generated
   */
  EReference getNestedExpression_Expression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExpressionsFactory getExpressionsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ExpressionListImpl <em>Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ExpressionListImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.AssignmentExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAssignmentExpression()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__CHILD = eINSTANCE.getAssignmentExpression_Child();

    /**
     * The meta object literal for the '<em><b>Assignment Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentExpression_AssignmentOperator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_EXPRESSION__VALUE = eINSTANCE.getAssignmentExpression_Value();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.AssignmentExpressionChildImpl <em>Assignment Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.AssignmentExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAssignmentExpressionChild()
     * @generated
     */
    EClass ASSIGNMENT_EXPRESSION_CHILD = eINSTANCE.getAssignmentExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ConditionalExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalExpression()
     * @generated
     */
    EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__CHILD = eINSTANCE.getConditionalExpression_Child();

    /**
     * The meta object literal for the '<em><b>Expression If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION_IF = eINSTANCE.getConditionalExpression_ExpressionIf();

    /**
     * The meta object literal for the '<em><b>Expression Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION_ELSE = eINSTANCE.getConditionalExpression_ExpressionElse();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ConditionalExpressionChildImpl <em>Conditional Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ConditionalExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalExpressionChild()
     * @generated
     */
    EClass CONDITIONAL_EXPRESSION_CHILD = eINSTANCE.getConditionalExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ConditionalOrExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpression()
     * @generated
     */
    EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditionalOrExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_OR_EXPRESSION__CHILDREN = eINSTANCE.getConditionalOrExpression_Children();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ConditionalOrExpressionChildImpl <em>Conditional Or Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ConditionalOrExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalOrExpressionChild()
     * @generated
     */
    EClass CONDITIONAL_OR_EXPRESSION_CHILD = eINSTANCE.getConditionalOrExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ConditionalAndExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpression()
     * @generated
     */
    EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditionalAndExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_AND_EXPRESSION__CHILDREN = eINSTANCE.getConditionalAndExpression_Children();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ConditionalAndExpressionChildImpl <em>Conditional And Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ConditionalAndExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getConditionalAndExpressionChild()
     * @generated
     */
    EClass CONDITIONAL_AND_EXPRESSION_CHILD = eINSTANCE.getConditionalAndExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.InclusiveOrExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpression()
     * @generated
     */
    EClass INCLUSIVE_OR_EXPRESSION = eINSTANCE.getInclusiveOrExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUSIVE_OR_EXPRESSION__CHILDREN = eINSTANCE.getInclusiveOrExpression_Children();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.InclusiveOrExpressionChildImpl <em>Inclusive Or Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.InclusiveOrExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInclusiveOrExpressionChild()
     * @generated
     */
    EClass INCLUSIVE_OR_EXPRESSION_CHILD = eINSTANCE.getInclusiveOrExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ExclusiveOrExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpression()
     * @generated
     */
    EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusiveOrExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSIVE_OR_EXPRESSION__CHILDREN = eINSTANCE.getExclusiveOrExpression_Children();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ExclusiveOrExpressionChildImpl <em>Exclusive Or Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ExclusiveOrExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getExclusiveOrExpressionChild()
     * @generated
     */
    EClass EXCLUSIVE_OR_EXPRESSION_CHILD = eINSTANCE.getExclusiveOrExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.AndExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__CHILDREN = eINSTANCE.getAndExpression_Children();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.AndExpressionChildImpl <em>And Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.AndExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAndExpressionChild()
     * @generated
     */
    EClass AND_EXPRESSION_CHILD = eINSTANCE.getAndExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.EqualityExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getEqualityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Equality Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__EQUALITY_OPERATORS = eINSTANCE.getEqualityExpression_EqualityOperators();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__CHILDREN = eINSTANCE.getEqualityExpression_Children();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.EqualityExpressionChildImpl <em>Equality Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.EqualityExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getEqualityExpressionChild()
     * @generated
     */
    EClass EQUALITY_EXPRESSION_CHILD = eINSTANCE.getEqualityExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.InstanceOfExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpression()
     * @generated
     */
    EClass INSTANCE_OF_EXPRESSION = eINSTANCE.getInstanceOfExpression();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OF_EXPRESSION__CHILD = eINSTANCE.getInstanceOfExpression_Child();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.InstanceOfExpressionChildImpl <em>Instance Of Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.InstanceOfExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getInstanceOfExpressionChild()
     * @generated
     */
    EClass INSTANCE_OF_EXPRESSION_CHILD = eINSTANCE.getInstanceOfExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.RelationExpressionImpl <em>Relation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.RelationExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getRelationExpression()
     * @generated
     */
    EClass RELATION_EXPRESSION = eINSTANCE.getRelationExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_EXPRESSION__CHILDREN = eINSTANCE.getRelationExpression_Children();

    /**
     * The meta object literal for the '<em><b>Relation Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_EXPRESSION__RELATION_OPERATORS = eINSTANCE.getRelationExpression_RelationOperators();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.RelationExpressionChildImpl <em>Relation Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.RelationExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getRelationExpressionChild()
     * @generated
     */
    EClass RELATION_EXPRESSION_CHILD = eINSTANCE.getRelationExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ShiftExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getShiftExpression()
     * @generated
     */
    EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPRESSION__CHILDREN = eINSTANCE.getShiftExpression_Children();

    /**
     * The meta object literal for the '<em><b>Shift Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPRESSION__SHIFT_OPERATORS = eINSTANCE.getShiftExpression_ShiftOperators();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.ShiftExpressionChildImpl <em>Shift Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.ShiftExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getShiftExpressionChild()
     * @generated
     */
    EClass SHIFT_EXPRESSION_CHILD = eINSTANCE.getShiftExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.AdditiveExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__CHILDREN = eINSTANCE.getAdditiveExpression_Children();

    /**
     * The meta object literal for the '<em><b>Additive Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS = eINSTANCE.getAdditiveExpression_AdditiveOperators();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.AdditiveExpressionChildImpl <em>Additive Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.AdditiveExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getAdditiveExpressionChild()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION_CHILD = eINSTANCE.getAdditiveExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.MultiplicativeExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__CHILDREN = eINSTANCE.getMultiplicativeExpression_Children();

    /**
     * The meta object literal for the '<em><b>Multiplicative Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS = eINSTANCE.getMultiplicativeExpression_MultiplicativeOperators();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.MultiplicativeExpressionChildImpl <em>Multiplicative Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.MultiplicativeExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getMultiplicativeExpressionChild()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION_CHILD = eINSTANCE.getMultiplicativeExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.UnaryExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__OPERATORS = eINSTANCE.getUnaryExpression_Operators();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__CHILD = eINSTANCE.getUnaryExpression_Child();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.UnaryExpressionChildImpl <em>Unary Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.UnaryExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryExpressionChild()
     * @generated
     */
    EClass UNARY_EXPRESSION_CHILD = eINSTANCE.getUnaryExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.UnaryModificationExpressionImpl <em>Unary Modification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.UnaryModificationExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpression()
     * @generated
     */
    EClass UNARY_MODIFICATION_EXPRESSION = eINSTANCE.getUnaryModificationExpression();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_MODIFICATION_EXPRESSION__CHILD = eINSTANCE.getUnaryModificationExpression_Child();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_MODIFICATION_EXPRESSION__OPERATOR = eINSTANCE.getUnaryModificationExpression_Operator();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.PrefixUnaryModificationExpressionImpl <em>Prefix Unary Modification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.PrefixUnaryModificationExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getPrefixUnaryModificationExpression()
     * @generated
     */
    EClass PREFIX_UNARY_MODIFICATION_EXPRESSION = eINSTANCE.getPrefixUnaryModificationExpression();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.SuffixUnaryModificationExpressionImpl <em>Suffix Unary Modification Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.SuffixUnaryModificationExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getSuffixUnaryModificationExpression()
     * @generated
     */
    EClass SUFFIX_UNARY_MODIFICATION_EXPRESSION = eINSTANCE.getSuffixUnaryModificationExpression();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.UnaryModificationExpressionChildImpl <em>Unary Modification Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.UnaryModificationExpressionChildImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getUnaryModificationExpressionChild()
     * @generated
     */
    EClass UNARY_MODIFICATION_EXPRESSION_CHILD = eINSTANCE.getUnaryModificationExpressionChild();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.CastExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getCastExpression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__CHILD = eINSTANCE.getCastExpression_Child();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.PrimaryExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.expressions.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.expressions.impl.NestedExpressionImpl
     * @see org.emftext.language.java.expressions.impl.ExpressionsPackageImpl#getNestedExpression()
     * @generated
     */
    EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_EXPRESSION__EXPRESSION = eINSTANCE.getNestedExpression_Expression();

  }

} //ExpressionsPackage
