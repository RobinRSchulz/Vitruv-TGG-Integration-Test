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

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Typeable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.arrays.ArrayTypeable#getArrayDimensionsBefore <em>Array Dimensions Before</em>}</li>
 *   <li>{@link org.emftext.language.java.arrays.ArrayTypeable#getArrayDimensionsAfter <em>Array Dimensions After</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.arrays.ArraysPackage#getArrayTypeable()
 * @model abstract="true"
 * @generated
 */
public interface ArrayTypeable extends Commentable
{
  /**
   * Returns the value of the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.arrays.ArrayDimension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Dimensions Before</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Dimensions Before</em>' containment reference list.
   * @see org.emftext.language.java.arrays.ArraysPackage#getArrayTypeable_ArrayDimensionsBefore()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<ArrayDimension> getArrayDimensionsBefore();

  /**
   * Returns the value of the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.arrays.ArrayDimension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Dimensions After</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Dimensions After</em>' containment reference list.
   * @see org.emftext.language.java.arrays.ArraysPackage#getArrayTypeable_ArrayDimensionsAfter()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<ArrayDimension> getArrayDimensionsAfter();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   * @generated
   */
  long getArrayDimension();

} // ArrayTypeable
