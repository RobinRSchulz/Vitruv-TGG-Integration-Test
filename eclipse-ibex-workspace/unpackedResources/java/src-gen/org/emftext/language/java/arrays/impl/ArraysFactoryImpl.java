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
package org.emftext.language.java.arrays.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.java.arrays.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArraysFactoryImpl extends EFactoryImpl implements ArraysFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArraysFactory init()
  {
    try
    {
      ArraysFactory theArraysFactory = (ArraysFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/java/arrays"); 
      if (theArraysFactory != null)
      {
        return theArraysFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArraysFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArraysFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ArraysPackage.ARRAY_DIMENSION: return createArrayDimension();
      case ArraysPackage.ARRAY_INITIALIZER: return createArrayInitializer();
      case ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE: return createArrayInstantiationBySize();
      case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED: return createArrayInstantiationByValuesUntyped();
      case ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED: return createArrayInstantiationByValuesTyped();
      case ArraysPackage.ARRAY_SELECTOR: return createArraySelector();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayDimension createArrayDimension()
  {
    ArrayDimensionImpl arrayDimension = new ArrayDimensionImpl();
    return arrayDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInitializer createArrayInitializer()
  {
    ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
    return arrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInstantiationBySize createArrayInstantiationBySize()
  {
    ArrayInstantiationBySizeImpl arrayInstantiationBySize = new ArrayInstantiationBySizeImpl();
    return arrayInstantiationBySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInstantiationByValuesUntyped createArrayInstantiationByValuesUntyped()
  {
    ArrayInstantiationByValuesUntypedImpl arrayInstantiationByValuesUntyped = new ArrayInstantiationByValuesUntypedImpl();
    return arrayInstantiationByValuesUntyped;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayInstantiationByValuesTyped createArrayInstantiationByValuesTyped()
  {
    ArrayInstantiationByValuesTypedImpl arrayInstantiationByValuesTyped = new ArrayInstantiationByValuesTypedImpl();
    return arrayInstantiationByValuesTyped;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArraySelector createArraySelector()
  {
    ArraySelectorImpl arraySelector = new ArraySelectorImpl();
    return arraySelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArraysPackage getArraysPackage()
  {
    return (ArraysPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArraysPackage getPackage()
  {
    return ArraysPackage.eINSTANCE;
  }

} //ArraysFactoryImpl
