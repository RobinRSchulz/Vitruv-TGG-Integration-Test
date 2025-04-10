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
package org.emftext.language.java.arrays;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.arrays.ArraysPackage
 * @generated
 */
public interface ArraysFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArraysFactory eINSTANCE = org.emftext.language.java.arrays.impl.ArraysFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Array Dimension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Dimension</em>'.
   * @generated
   */
  ArrayDimension createArrayDimension();

  /**
   * Returns a new object of class '<em>Array Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Initializer</em>'.
   * @generated
   */
  ArrayInitializer createArrayInitializer();

  /**
   * Returns a new object of class '<em>Array Instantiation By Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Instantiation By Size</em>'.
   * @generated
   */
  ArrayInstantiationBySize createArrayInstantiationBySize();

  /**
   * Returns a new object of class '<em>Array Instantiation By Values Untyped</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Instantiation By Values Untyped</em>'.
   * @generated
   */
  ArrayInstantiationByValuesUntyped createArrayInstantiationByValuesUntyped();

  /**
   * Returns a new object of class '<em>Array Instantiation By Values Typed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Instantiation By Values Typed</em>'.
   * @generated
   */
  ArrayInstantiationByValuesTyped createArrayInstantiationByValuesTyped();

  /**
   * Returns a new object of class '<em>Array Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Selector</em>'.
   * @generated
   */
  ArraySelector createArraySelector();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArraysPackage getArraysPackage();

} //ArraysFactory
