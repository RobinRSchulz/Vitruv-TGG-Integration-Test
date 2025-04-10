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
package org.emftext.language.java.statements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.members.MembersPackage;

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
 * @see org.emftext.language.java.statements.StatementsFactory
 * @model kind="package"
 * @generated
 */
public interface StatementsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "statements";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/statements";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "statements";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatementsPackage eINSTANCE = org.emftext.language.java.statements.impl.StatementsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.StatementContainerImpl <em>Statement Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.StatementContainerImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getStatementContainer()
   * @generated
   */
  int STATEMENT_CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CONTAINER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CONTAINER__STATEMENT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statement Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_CONTAINER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.StatementListContainerImpl <em>Statement List Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.StatementListContainerImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getStatementListContainer()
   * @generated
   */
  int STATEMENT_LIST_CONTAINER = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST_CONTAINER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST_CONTAINER__STATEMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statement List Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_LIST_CONTAINER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ConditionalImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__CONDITION = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ForLoopInitializerImpl <em>For Loop Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ForLoopInitializerImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getForLoopInitializer()
   * @generated
   */
  int FOR_LOOP_INITIALIZER = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_INITIALIZER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>For Loop Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_INITIALIZER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.StatementImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.SwitchCaseImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getSwitchCase()
   * @generated
   */
  int SWITCH_CASE = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__LAYOUT_INFORMATIONS = STATEMENT_LIST_CONTAINER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__STATEMENTS = STATEMENT_LIST_CONTAINER__STATEMENTS;

  /**
   * The number of structural features of the '<em>Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE_FEATURE_COUNT = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.AssertImpl <em>Assert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.AssertImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getAssert()
   * @generated
   */
  int ASSERT = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Error Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__ERROR_MESSAGE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.JumpImpl <em>Jump</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.JumpImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getJump()
   * @generated
   */
  int JUMP = 18;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP__TARGET = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Jump</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.BreakImpl <em>Break</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.BreakImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getBreak()
   * @generated
   */
  int BREAK = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK__LAYOUT_INFORMATIONS = JUMP__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK__TARGET = JUMP__TARGET;

  /**
   * The number of structural features of the '<em>Break</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_FEATURE_COUNT = JUMP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.BlockImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__LAYOUT_INFORMATIONS = MembersPackage.MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__NAME = MembersPackage.MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = MembersPackage.MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__MODIFIERS = MembersPackage.MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = MembersPackage.MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.CatchBlockImpl <em>Catch Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.CatchBlockImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getCatchBlock()
   * @generated
   */
  int CATCH_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_BLOCK__LAYOUT_INFORMATIONS = STATEMENT_LIST_CONTAINER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_BLOCK__STATEMENTS = STATEMENT_LIST_CONTAINER__STATEMENTS;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_BLOCK__PARAMETER = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Catch Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATCH_BLOCK_FEATURE_COUNT = STATEMENT_LIST_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ConditionImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ELSE_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ContinueImpl <em>Continue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ContinueImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getContinue()
   * @generated
   */
  int CONTINUE = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE__LAYOUT_INFORMATIONS = JUMP__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE__TARGET = JUMP__TARGET;

  /**
   * The number of structural features of the '<em>Continue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_FEATURE_COUNT = JUMP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.DefaultSwitchCaseImpl <em>Default Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.DefaultSwitchCaseImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getDefaultSwitchCase()
   * @generated
   */
  int DEFAULT_SWITCH_CASE = 12;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_SWITCH_CASE__LAYOUT_INFORMATIONS = SWITCH_CASE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_SWITCH_CASE__STATEMENTS = SWITCH_CASE__STATEMENTS;

  /**
   * The number of structural features of the '<em>Default Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_SWITCH_CASE_FEATURE_COUNT = SWITCH_CASE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.WhileLoopImpl <em>While Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.WhileLoopImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getWhileLoop()
   * @generated
   */
  int WHILE_LOOP = 27;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP__CONDITION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.DoWhileLoopImpl <em>Do While Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.DoWhileLoopImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getDoWhileLoop()
   * @generated
   */
  int DO_WHILE_LOOP = 13;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_LOOP__LAYOUT_INFORMATIONS = WHILE_LOOP__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_LOOP__STATEMENT = WHILE_LOOP__STATEMENT;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_LOOP__CONDITION = WHILE_LOOP__CONDITION;

  /**
   * The number of structural features of the '<em>Do While Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_LOOP_FEATURE_COUNT = WHILE_LOOP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.EmptyStatementImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getEmptyStatement()
   * @generated
   */
  int EMPTY_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_STATEMENT__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Empty Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ExpressionStatementImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getExpressionStatement()
   * @generated
   */
  int EXPRESSION_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ForLoopImpl <em>For Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ForLoopImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getForLoop()
   * @generated
   */
  int FOR_LOOP = 16;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__CONDITION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__INIT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__UPDATES = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ForEachLoopImpl <em>For Each Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ForEachLoopImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getForEachLoop()
   * @generated
   */
  int FOR_EACH_LOOP = 17;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_LOOP__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_LOOP__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_LOOP__NEXT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_LOOP__COLLECTION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For Each Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EACH_LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.JumpLabelImpl <em>Jump Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.JumpLabelImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getJumpLabel()
   * @generated
   */
  int JUMP_LABEL = 19;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_LABEL__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_LABEL__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_LABEL__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Jump Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_LABEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.LocalVariableStatementImpl <em>Local Variable Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.LocalVariableStatementImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getLocalVariableStatement()
   * @generated
   */
  int LOCAL_VARIABLE_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_STATEMENT__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_STATEMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Variable Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.NormalSwitchCaseImpl <em>Normal Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.NormalSwitchCaseImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getNormalSwitchCase()
   * @generated
   */
  int NORMAL_SWITCH_CASE = 21;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_SWITCH_CASE__LAYOUT_INFORMATIONS = SWITCH_CASE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_SWITCH_CASE__STATEMENTS = SWITCH_CASE__STATEMENTS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_SWITCH_CASE__CONDITION = SWITCH_CASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Normal Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_SWITCH_CASE_FEATURE_COUNT = SWITCH_CASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ReturnImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 22;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__RETURN_VALUE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.SwitchImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 23;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__CASES = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__VARIABLE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.SynchronizedBlockImpl <em>Synchronized Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.SynchronizedBlockImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getSynchronizedBlock()
   * @generated
   */
  int SYNCHRONIZED_BLOCK = 24;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED_BLOCK__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED_BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lock Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED_BLOCK__LOCK_PROVIDER = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Synchronized Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.ThrowImpl <em>Throw</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.ThrowImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getThrow()
   * @generated
   */
  int THROW = 25;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Throwable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW__THROWABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Throw</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROW_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.statements.impl.TryBlockImpl <em>Try Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.statements.impl.TryBlockImpl
   * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getTryBlock()
   * @generated
   */
  int TRY_BLOCK = 26;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_BLOCK__LAYOUT_INFORMATIONS = STATEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Catche Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_BLOCK__CATCHE_BLOCKS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Finally Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_BLOCK__FINALLY_BLOCK = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Try Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.StatementContainer <em>Statement Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Container</em>'.
   * @see org.emftext.language.java.statements.StatementContainer
   * @generated
   */
  EClass getStatementContainer();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.StatementContainer#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.emftext.language.java.statements.StatementContainer#getStatement()
   * @see #getStatementContainer()
   * @generated
   */
  EReference getStatementContainer_Statement();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.StatementListContainer <em>Statement List Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement List Container</em>'.
   * @see org.emftext.language.java.statements.StatementListContainer
   * @generated
   */
  EClass getStatementListContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.statements.StatementListContainer#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.emftext.language.java.statements.StatementListContainer#getStatements()
   * @see #getStatementListContainer()
   * @generated
   */
  EReference getStatementListContainer_Statements();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see org.emftext.language.java.statements.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.Conditional#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.emftext.language.java.statements.Conditional#getCondition()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Condition();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.ForLoopInitializer <em>For Loop Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Loop Initializer</em>'.
   * @see org.emftext.language.java.statements.ForLoopInitializer
   * @generated
   */
  EClass getForLoopInitializer();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.emftext.language.java.statements.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see org.emftext.language.java.statements.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Assert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert</em>'.
   * @see org.emftext.language.java.statements.Assert
   * @generated
   */
  EClass getAssert();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.Assert#getErrorMessage <em>Error Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error Message</em>'.
   * @see org.emftext.language.java.statements.Assert#getErrorMessage()
   * @see #getAssert()
   * @generated
   */
  EReference getAssert_ErrorMessage();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Break <em>Break</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break</em>'.
   * @see org.emftext.language.java.statements.Break
   * @generated
   */
  EClass getBreak();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.emftext.language.java.statements.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.CatchBlock <em>Catch Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Catch Block</em>'.
   * @see org.emftext.language.java.statements.CatchBlock
   * @generated
   */
  EClass getCatchBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.CatchBlock#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.emftext.language.java.statements.CatchBlock#getParameter()
   * @see #getCatchBlock()
   * @generated
   */
  EReference getCatchBlock_Parameter();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.emftext.language.java.statements.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.Condition#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see org.emftext.language.java.statements.Condition#getElseStatement()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ElseStatement();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Continue <em>Continue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continue</em>'.
   * @see org.emftext.language.java.statements.Continue
   * @generated
   */
  EClass getContinue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.DefaultSwitchCase <em>Default Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Switch Case</em>'.
   * @see org.emftext.language.java.statements.DefaultSwitchCase
   * @generated
   */
  EClass getDefaultSwitchCase();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.DoWhileLoop <em>Do While Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do While Loop</em>'.
   * @see org.emftext.language.java.statements.DoWhileLoop
   * @generated
   */
  EClass getDoWhileLoop();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.EmptyStatement <em>Empty Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Statement</em>'.
   * @see org.emftext.language.java.statements.EmptyStatement
   * @generated
   */
  EClass getEmptyStatement();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.ExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Statement</em>'.
   * @see org.emftext.language.java.statements.ExpressionStatement
   * @generated
   */
  EClass getExpressionStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.ExpressionStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.emftext.language.java.statements.ExpressionStatement#getExpression()
   * @see #getExpressionStatement()
   * @generated
   */
  EReference getExpressionStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.ForLoop <em>For Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Loop</em>'.
   * @see org.emftext.language.java.statements.ForLoop
   * @generated
   */
  EClass getForLoop();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.ForLoop#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.emftext.language.java.statements.ForLoop#getInit()
   * @see #getForLoop()
   * @generated
   */
  EReference getForLoop_Init();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.statements.ForLoop#getUpdates <em>Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Updates</em>'.
   * @see org.emftext.language.java.statements.ForLoop#getUpdates()
   * @see #getForLoop()
   * @generated
   */
  EReference getForLoop_Updates();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.ForEachLoop <em>For Each Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Each Loop</em>'.
   * @see org.emftext.language.java.statements.ForEachLoop
   * @generated
   */
  EClass getForEachLoop();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.ForEachLoop#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.emftext.language.java.statements.ForEachLoop#getNext()
   * @see #getForEachLoop()
   * @generated
   */
  EReference getForEachLoop_Next();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.ForEachLoop#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection</em>'.
   * @see org.emftext.language.java.statements.ForEachLoop#getCollection()
   * @see #getForEachLoop()
   * @generated
   */
  EReference getForEachLoop_Collection();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Jump <em>Jump</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jump</em>'.
   * @see org.emftext.language.java.statements.Jump
   * @generated
   */
  EClass getJump();

  /**
   * Returns the meta object for the reference '{@link org.emftext.language.java.statements.Jump#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.emftext.language.java.statements.Jump#getTarget()
   * @see #getJump()
   * @generated
   */
  EReference getJump_Target();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.JumpLabel <em>Jump Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jump Label</em>'.
   * @see org.emftext.language.java.statements.JumpLabel
   * @generated
   */
  EClass getJumpLabel();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.LocalVariableStatement <em>Local Variable Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable Statement</em>'.
   * @see org.emftext.language.java.statements.LocalVariableStatement
   * @generated
   */
  EClass getLocalVariableStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.LocalVariableStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.emftext.language.java.statements.LocalVariableStatement#getVariable()
   * @see #getLocalVariableStatement()
   * @generated
   */
  EReference getLocalVariableStatement_Variable();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.NormalSwitchCase <em>Normal Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Switch Case</em>'.
   * @see org.emftext.language.java.statements.NormalSwitchCase
   * @generated
   */
  EClass getNormalSwitchCase();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.emftext.language.java.statements.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.Return#getReturnValue <em>Return Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Value</em>'.
   * @see org.emftext.language.java.statements.Return#getReturnValue()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_ReturnValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see org.emftext.language.java.statements.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.statements.Switch#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.emftext.language.java.statements.Switch#getCases()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Cases();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.Switch#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.emftext.language.java.statements.Switch#getVariable()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Variable();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.SynchronizedBlock <em>Synchronized Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synchronized Block</em>'.
   * @see org.emftext.language.java.statements.SynchronizedBlock
   * @generated
   */
  EClass getSynchronizedBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.SynchronizedBlock#getLockProvider <em>Lock Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lock Provider</em>'.
   * @see org.emftext.language.java.statements.SynchronizedBlock#getLockProvider()
   * @see #getSynchronizedBlock()
   * @generated
   */
  EReference getSynchronizedBlock_LockProvider();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.Throw <em>Throw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Throw</em>'.
   * @see org.emftext.language.java.statements.Throw
   * @generated
   */
  EClass getThrow();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.Throw#getThrowable <em>Throwable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throwable</em>'.
   * @see org.emftext.language.java.statements.Throw#getThrowable()
   * @see #getThrow()
   * @generated
   */
  EReference getThrow_Throwable();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.TryBlock <em>Try Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try Block</em>'.
   * @see org.emftext.language.java.statements.TryBlock
   * @generated
   */
  EClass getTryBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.statements.TryBlock#getCatcheBlocks <em>Catche Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catche Blocks</em>'.
   * @see org.emftext.language.java.statements.TryBlock#getCatcheBlocks()
   * @see #getTryBlock()
   * @generated
   */
  EReference getTryBlock_CatcheBlocks();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.TryBlock#getFinallyBlock <em>Finally Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally Block</em>'.
   * @see org.emftext.language.java.statements.TryBlock#getFinallyBlock()
   * @see #getTryBlock()
   * @generated
   */
  EReference getTryBlock_FinallyBlock();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.statements.WhileLoop <em>While Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Loop</em>'.
   * @see org.emftext.language.java.statements.WhileLoop
   * @generated
   */
  EClass getWhileLoop();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.statements.WhileLoop#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.emftext.language.java.statements.WhileLoop#getCondition()
   * @see #getWhileLoop()
   * @generated
   */
  EReference getWhileLoop_Condition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StatementsFactory getStatementsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.StatementContainerImpl <em>Statement Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.StatementContainerImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getStatementContainer()
     * @generated
     */
    EClass STATEMENT_CONTAINER = eINSTANCE.getStatementContainer();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_CONTAINER__STATEMENT = eINSTANCE.getStatementContainer_Statement();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.StatementListContainerImpl <em>Statement List Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.StatementListContainerImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getStatementListContainer()
     * @generated
     */
    EClass STATEMENT_LIST_CONTAINER = eINSTANCE.getStatementListContainer();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_LIST_CONTAINER__STATEMENTS = eINSTANCE.getStatementListContainer_Statements();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ConditionalImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ForLoopInitializerImpl <em>For Loop Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ForLoopInitializerImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getForLoopInitializer()
     * @generated
     */
    EClass FOR_LOOP_INITIALIZER = eINSTANCE.getForLoopInitializer();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.StatementImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.SwitchCaseImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getSwitchCase()
     * @generated
     */
    EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.AssertImpl <em>Assert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.AssertImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getAssert()
     * @generated
     */
    EClass ASSERT = eINSTANCE.getAssert();

    /**
     * The meta object literal for the '<em><b>Error Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT__ERROR_MESSAGE = eINSTANCE.getAssert_ErrorMessage();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.BreakImpl <em>Break</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.BreakImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getBreak()
     * @generated
     */
    EClass BREAK = eINSTANCE.getBreak();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.BlockImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.CatchBlockImpl <em>Catch Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.CatchBlockImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getCatchBlock()
     * @generated
     */
    EClass CATCH_BLOCK = eINSTANCE.getCatchBlock();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATCH_BLOCK__PARAMETER = eINSTANCE.getCatchBlock_Parameter();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ConditionImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ELSE_STATEMENT = eINSTANCE.getCondition_ElseStatement();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ContinueImpl <em>Continue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ContinueImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getContinue()
     * @generated
     */
    EClass CONTINUE = eINSTANCE.getContinue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.DefaultSwitchCaseImpl <em>Default Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.DefaultSwitchCaseImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getDefaultSwitchCase()
     * @generated
     */
    EClass DEFAULT_SWITCH_CASE = eINSTANCE.getDefaultSwitchCase();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.DoWhileLoopImpl <em>Do While Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.DoWhileLoopImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getDoWhileLoop()
     * @generated
     */
    EClass DO_WHILE_LOOP = eINSTANCE.getDoWhileLoop();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.EmptyStatementImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getEmptyStatement()
     * @generated
     */
    EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ExpressionStatementImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getExpressionStatement()
     * @generated
     */
    EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ForLoopImpl <em>For Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ForLoopImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getForLoop()
     * @generated
     */
    EClass FOR_LOOP = eINSTANCE.getForLoop();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP__INIT = eINSTANCE.getForLoop_Init();

    /**
     * The meta object literal for the '<em><b>Updates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP__UPDATES = eINSTANCE.getForLoop_Updates();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ForEachLoopImpl <em>For Each Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ForEachLoopImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getForEachLoop()
     * @generated
     */
    EClass FOR_EACH_LOOP = eINSTANCE.getForEachLoop();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EACH_LOOP__NEXT = eINSTANCE.getForEachLoop_Next();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EACH_LOOP__COLLECTION = eINSTANCE.getForEachLoop_Collection();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.JumpImpl <em>Jump</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.JumpImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getJump()
     * @generated
     */
    EClass JUMP = eINSTANCE.getJump();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JUMP__TARGET = eINSTANCE.getJump_Target();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.JumpLabelImpl <em>Jump Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.JumpLabelImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getJumpLabel()
     * @generated
     */
    EClass JUMP_LABEL = eINSTANCE.getJumpLabel();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.LocalVariableStatementImpl <em>Local Variable Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.LocalVariableStatementImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getLocalVariableStatement()
     * @generated
     */
    EClass LOCAL_VARIABLE_STATEMENT = eINSTANCE.getLocalVariableStatement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE_STATEMENT__VARIABLE = eINSTANCE.getLocalVariableStatement_Variable();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.NormalSwitchCaseImpl <em>Normal Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.NormalSwitchCaseImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getNormalSwitchCase()
     * @generated
     */
    EClass NORMAL_SWITCH_CASE = eINSTANCE.getNormalSwitchCase();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ReturnImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__RETURN_VALUE = eINSTANCE.getReturn_ReturnValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.SwitchImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__CASES = eINSTANCE.getSwitch_Cases();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__VARIABLE = eINSTANCE.getSwitch_Variable();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.SynchronizedBlockImpl <em>Synchronized Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.SynchronizedBlockImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getSynchronizedBlock()
     * @generated
     */
    EClass SYNCHRONIZED_BLOCK = eINSTANCE.getSynchronizedBlock();

    /**
     * The meta object literal for the '<em><b>Lock Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNCHRONIZED_BLOCK__LOCK_PROVIDER = eINSTANCE.getSynchronizedBlock_LockProvider();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.ThrowImpl <em>Throw</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.ThrowImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getThrow()
     * @generated
     */
    EClass THROW = eINSTANCE.getThrow();

    /**
     * The meta object literal for the '<em><b>Throwable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THROW__THROWABLE = eINSTANCE.getThrow_Throwable();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.TryBlockImpl <em>Try Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.TryBlockImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getTryBlock()
     * @generated
     */
    EClass TRY_BLOCK = eINSTANCE.getTryBlock();

    /**
     * The meta object literal for the '<em><b>Catche Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_BLOCK__CATCHE_BLOCKS = eINSTANCE.getTryBlock_CatcheBlocks();

    /**
     * The meta object literal for the '<em><b>Finally Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_BLOCK__FINALLY_BLOCK = eINSTANCE.getTryBlock_FinallyBlock();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.statements.impl.WhileLoopImpl <em>While Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.statements.impl.WhileLoopImpl
     * @see org.emftext.language.java.statements.impl.StatementsPackageImpl#getWhileLoop()
     * @generated
     */
    EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_LOOP__CONDITION = eINSTANCE.getWhileLoop_Condition();

  }

} //StatementsPackage
