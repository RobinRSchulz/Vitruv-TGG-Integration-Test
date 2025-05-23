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
package org.emftext.language.java.literals.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.annotations.AnnotationValue;

import org.emftext.language.java.arrays.ArrayInitializationValue;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.expressions.AdditiveExpressionChild;
import org.emftext.language.java.expressions.AndExpressionChild;
import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalAndExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.EqualityExpressionChild;
import org.emftext.language.java.expressions.ExclusiveOrExpressionChild;
import org.emftext.language.java.expressions.Expression;
import org.emftext.language.java.expressions.InclusiveOrExpressionChild;
import org.emftext.language.java.expressions.InstanceOfExpressionChild;
import org.emftext.language.java.expressions.MultiplicativeExpressionChild;
import org.emftext.language.java.expressions.PrimaryExpression;
import org.emftext.language.java.expressions.RelationExpressionChild;
import org.emftext.language.java.expressions.ShiftExpressionChild;
import org.emftext.language.java.expressions.UnaryExpressionChild;
import org.emftext.language.java.expressions.UnaryModificationExpressionChild;

import org.emftext.language.java.literals.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.literals.LiteralsPackage
 * @generated
 */
public class LiteralsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LiteralsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LiteralsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralsSwitch<Adapter> modelSwitch =
    new LiteralsSwitch<Adapter>()
    {
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseSelf(Self object)
      {
        return createSelfAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseCharacterLiteral(CharacterLiteral object)
      {
        return createCharacterLiteralAdapter();
      }
      @Override
      public Adapter caseFloatLiteral(FloatLiteral object)
      {
        return createFloatLiteralAdapter();
      }
      @Override
      public Adapter caseDecimalFloatLiteral(DecimalFloatLiteral object)
      {
        return createDecimalFloatLiteralAdapter();
      }
      @Override
      public Adapter caseHexFloatLiteral(HexFloatLiteral object)
      {
        return createHexFloatLiteralAdapter();
      }
      @Override
      public Adapter caseDoubleLiteral(DoubleLiteral object)
      {
        return createDoubleLiteralAdapter();
      }
      @Override
      public Adapter caseDecimalDoubleLiteral(DecimalDoubleLiteral object)
      {
        return createDecimalDoubleLiteralAdapter();
      }
      @Override
      public Adapter caseHexDoubleLiteral(HexDoubleLiteral object)
      {
        return createHexDoubleLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseDecimalIntegerLiteral(DecimalIntegerLiteral object)
      {
        return createDecimalIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseHexIntegerLiteral(HexIntegerLiteral object)
      {
        return createHexIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseOctalIntegerLiteral(OctalIntegerLiteral object)
      {
        return createOctalIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseLongLiteral(LongLiteral object)
      {
        return createLongLiteralAdapter();
      }
      @Override
      public Adapter caseDecimalLongLiteral(DecimalLongLiteral object)
      {
        return createDecimalLongLiteralAdapter();
      }
      @Override
      public Adapter caseHexLongLiteral(HexLongLiteral object)
      {
        return createHexLongLiteralAdapter();
      }
      @Override
      public Adapter caseOctalLongLiteral(OctalLongLiteral object)
      {
        return createOctalLongLiteralAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter caseSuper(Super object)
      {
        return createSuperAdapter();
      }
      @Override
      public Adapter caseThis(This object)
      {
        return createThisAdapter();
      }
      @Override
      public Adapter caseCommentable(Commentable object)
      {
        return createCommentableAdapter();
      }
      @Override
      public Adapter caseArrayInitializationValue(ArrayInitializationValue object)
      {
        return createArrayInitializationValueAdapter();
      }
      @Override
      public Adapter caseAnnotationValue(AnnotationValue object)
      {
        return createAnnotationValueAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAssignmentExpressionChild(AssignmentExpressionChild object)
      {
        return createAssignmentExpressionChildAdapter();
      }
      @Override
      public Adapter caseConditionalExpressionChild(ConditionalExpressionChild object)
      {
        return createConditionalExpressionChildAdapter();
      }
      @Override
      public Adapter caseConditionalOrExpressionChild(ConditionalOrExpressionChild object)
      {
        return createConditionalOrExpressionChildAdapter();
      }
      @Override
      public Adapter caseConditionalAndExpressionChild(ConditionalAndExpressionChild object)
      {
        return createConditionalAndExpressionChildAdapter();
      }
      @Override
      public Adapter caseInclusiveOrExpressionChild(InclusiveOrExpressionChild object)
      {
        return createInclusiveOrExpressionChildAdapter();
      }
      @Override
      public Adapter caseExclusiveOrExpressionChild(ExclusiveOrExpressionChild object)
      {
        return createExclusiveOrExpressionChildAdapter();
      }
      @Override
      public Adapter caseAndExpressionChild(AndExpressionChild object)
      {
        return createAndExpressionChildAdapter();
      }
      @Override
      public Adapter caseEqualityExpressionChild(EqualityExpressionChild object)
      {
        return createEqualityExpressionChildAdapter();
      }
      @Override
      public Adapter caseInstanceOfExpressionChild(InstanceOfExpressionChild object)
      {
        return createInstanceOfExpressionChildAdapter();
      }
      @Override
      public Adapter caseRelationExpressionChild(RelationExpressionChild object)
      {
        return createRelationExpressionChildAdapter();
      }
      @Override
      public Adapter caseShiftExpressionChild(ShiftExpressionChild object)
      {
        return createShiftExpressionChildAdapter();
      }
      @Override
      public Adapter caseAdditiveExpressionChild(AdditiveExpressionChild object)
      {
        return createAdditiveExpressionChildAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpressionChild(MultiplicativeExpressionChild object)
      {
        return createMultiplicativeExpressionChildAdapter();
      }
      @Override
      public Adapter caseUnaryExpressionChild(UnaryExpressionChild object)
      {
        return createUnaryExpressionChildAdapter();
      }
      @Override
      public Adapter caseUnaryModificationExpressionChild(UnaryModificationExpressionChild object)
      {
        return createUnaryModificationExpressionChildAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.Self <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.Self
   * @generated
   */
  public Adapter createSelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.CharacterLiteral <em>Character Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.CharacterLiteral
   * @generated
   */
  public Adapter createCharacterLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.FloatLiteral
   * @generated
   */
  public Adapter createFloatLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.DecimalFloatLiteral <em>Decimal Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.DecimalFloatLiteral
   * @generated
   */
  public Adapter createDecimalFloatLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.HexFloatLiteral <em>Hex Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.HexFloatLiteral
   * @generated
   */
  public Adapter createHexFloatLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.DoubleLiteral
   * @generated
   */
  public Adapter createDoubleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.DecimalDoubleLiteral <em>Decimal Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.DecimalDoubleLiteral
   * @generated
   */
  public Adapter createDecimalDoubleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.HexDoubleLiteral <em>Hex Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.HexDoubleLiteral
   * @generated
   */
  public Adapter createHexDoubleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.DecimalIntegerLiteral <em>Decimal Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.DecimalIntegerLiteral
   * @generated
   */
  public Adapter createDecimalIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.HexIntegerLiteral <em>Hex Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.HexIntegerLiteral
   * @generated
   */
  public Adapter createHexIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.OctalIntegerLiteral <em>Octal Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.OctalIntegerLiteral
   * @generated
   */
  public Adapter createOctalIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.LongLiteral <em>Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.LongLiteral
   * @generated
   */
  public Adapter createLongLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.DecimalLongLiteral <em>Decimal Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.DecimalLongLiteral
   * @generated
   */
  public Adapter createDecimalLongLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.HexLongLiteral <em>Hex Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.HexLongLiteral
   * @generated
   */
  public Adapter createHexLongLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.OctalLongLiteral <em>Octal Long Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.OctalLongLiteral
   * @generated
   */
  public Adapter createOctalLongLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.Super <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.Super
   * @generated
   */
  public Adapter createSuperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.literals.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.literals.This
   * @generated
   */
  public Adapter createThisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.Commentable <em>Commentable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.commons.Commentable
   * @generated
   */
  public Adapter createCommentableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.arrays.ArrayInitializationValue <em>Array Initialization Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.arrays.ArrayInitializationValue
   * @generated
   */
  public Adapter createArrayInitializationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.annotations.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.annotations.AnnotationValue
   * @generated
   */
  public Adapter createAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.AssignmentExpressionChild <em>Assignment Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.AssignmentExpressionChild
   * @generated
   */
  public Adapter createAssignmentExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalExpressionChild <em>Conditional Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.ConditionalExpressionChild
   * @generated
   */
  public Adapter createConditionalExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.ConditionalOrExpressionChild
   * @generated
   */
  public Adapter createConditionalOrExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.ConditionalAndExpressionChild
   * @generated
   */
  public Adapter createConditionalAndExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.InclusiveOrExpressionChild <em>Inclusive Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.InclusiveOrExpressionChild
   * @generated
   */
  public Adapter createInclusiveOrExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ExclusiveOrExpressionChild <em>Exclusive Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.ExclusiveOrExpressionChild
   * @generated
   */
  public Adapter createExclusiveOrExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.AndExpressionChild <em>And Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.AndExpressionChild
   * @generated
   */
  public Adapter createAndExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.EqualityExpressionChild <em>Equality Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.EqualityExpressionChild
   * @generated
   */
  public Adapter createEqualityExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.InstanceOfExpressionChild <em>Instance Of Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.InstanceOfExpressionChild
   * @generated
   */
  public Adapter createInstanceOfExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.RelationExpressionChild <em>Relation Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.RelationExpressionChild
   * @generated
   */
  public Adapter createRelationExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ShiftExpressionChild <em>Shift Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.ShiftExpressionChild
   * @generated
   */
  public Adapter createShiftExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.AdditiveExpressionChild <em>Additive Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.AdditiveExpressionChild
   * @generated
   */
  public Adapter createAdditiveExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.MultiplicativeExpressionChild <em>Multiplicative Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.MultiplicativeExpressionChild
   * @generated
   */
  public Adapter createMultiplicativeExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.UnaryExpressionChild <em>Unary Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.UnaryExpressionChild
   * @generated
   */
  public Adapter createUnaryExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.UnaryModificationExpressionChild <em>Unary Modification Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.UnaryModificationExpressionChild
   * @generated
   */
  public Adapter createUnaryModificationExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LiteralsAdapterFactory
