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
package org.emftext.language.java.modifiers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.java.modifiers.ModifiersPackage
 * @generated
 */
public interface ModifiersFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModifiersFactory eINSTANCE = org.emftext.language.java.modifiers.impl.ModifiersFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Abstract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract</em>'.
   * @generated
   */
  Abstract createAbstract();

  /**
   * Returns a new object of class '<em>Final</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Final</em>'.
   * @generated
   */
  Final createFinal();

  /**
   * Returns a new object of class '<em>Native</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Native</em>'.
   * @generated
   */
  Native createNative();

  /**
   * Returns a new object of class '<em>Protected</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protected</em>'.
   * @generated
   */
  Protected createProtected();

  /**
   * Returns a new object of class '<em>Public</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Public</em>'.
   * @generated
   */
  Public createPublic();

  /**
   * Returns a new object of class '<em>Private</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Private</em>'.
   * @generated
   */
  Private createPrivate();

  /**
   * Returns a new object of class '<em>Static</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static</em>'.
   * @generated
   */
  Static createStatic();

  /**
   * Returns a new object of class '<em>Strictfp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Strictfp</em>'.
   * @generated
   */
  Strictfp createStrictfp();

  /**
   * Returns a new object of class '<em>Synchronized</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Synchronized</em>'.
   * @generated
   */
  Synchronized createSynchronized();

  /**
   * Returns a new object of class '<em>Transient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transient</em>'.
   * @generated
   */
  Transient createTransient();

  /**
   * Returns a new object of class '<em>Volatile</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Volatile</em>'.
   * @generated
   */
  Volatile createVolatile();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ModifiersPackage getModifiersPackage();

} //ModifiersFactory
