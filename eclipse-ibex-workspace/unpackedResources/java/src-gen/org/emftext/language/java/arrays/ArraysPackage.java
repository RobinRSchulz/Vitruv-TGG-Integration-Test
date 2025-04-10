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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.emftext.language.java.arrays.ArraysFactory
 * @model kind="package"
 * @generated
 */
public interface ArraysPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "arrays";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/arrays";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "arrays";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArraysPackage eINSTANCE = org.emftext.language.java.arrays.impl.ArraysPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayTypeableImpl <em>Array Typeable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayTypeableImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayTypeable()
   * @generated
   */
  int ARRAY_TYPEABLE = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPEABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Typeable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPEABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayDimensionImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayDimension()
   * @generated
   */
  int ARRAY_DIMENSION = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_DIMENSION__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Array Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_DIMENSION_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayInitializationValueImpl <em>Array Initialization Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayInitializationValueImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInitializationValue()
   * @generated
   */
  int ARRAY_INITIALIZATION_VALUE = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZATION_VALUE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Array Initialization Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayInitializerImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInitializer()
   * @generated
   */
  int ARRAY_INITIALIZER = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__LAYOUT_INFORMATIONS = ARRAY_INITIALIZATION_VALUE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Initial Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__INITIAL_VALUES = ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER_FEATURE_COUNT = ARRAY_INITIALIZATION_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationImpl <em>Array Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayInstantiationImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiation()
   * @generated
   */
  int ARRAY_INSTANTIATION = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION__LAYOUT_INFORMATIONS = ExpressionsPackage.EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION__TYPE_ARGUMENTS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION__NEXT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION__ARRAY_SELECTORS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Array Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationBySizeImpl <em>Array Instantiation By Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayInstantiationBySizeImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationBySize()
   * @generated
   */
  int ARRAY_INSTANTIATION_BY_SIZE = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__LAYOUT_INFORMATIONS = ARRAY_INSTANTIATION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__TYPE_ARGUMENTS = ARRAY_INSTANTIATION__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__NEXT = ARRAY_INSTANTIATION__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__ARRAY_SELECTORS = ARRAY_INSTANTIATION__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__TYPE_REFERENCE = ARRAY_INSTANTIATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_BEFORE = ARRAY_INSTANTIATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_AFTER = ARRAY_INSTANTIATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sizes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE__SIZES = ARRAY_INSTANTIATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Array Instantiation By Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_SIZE_FEATURE_COUNT = ARRAY_INSTANTIATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesImpl <em>Array Instantiation By Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValues()
   * @generated
   */
  int ARRAY_INSTANTIATION_BY_VALUES = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES__LAYOUT_INFORMATIONS = ARRAY_INSTANTIATION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES__TYPE_ARGUMENTS = ARRAY_INSTANTIATION__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES__NEXT = ARRAY_INSTANTIATION__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES__ARRAY_SELECTORS = ARRAY_INSTANTIATION__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Array Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER = ARRAY_INSTANTIATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Instantiation By Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT = ARRAY_INSTANTIATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesUntypedImpl <em>Array Instantiation By Values Untyped</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesUntypedImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesUntyped()
   * @generated
   */
  int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__LAYOUT_INFORMATIONS = ARRAY_INSTANTIATION_BY_VALUES__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__TYPE_ARGUMENTS = ARRAY_INSTANTIATION_BY_VALUES__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__NEXT = ARRAY_INSTANTIATION_BY_VALUES__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_SELECTORS = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Array Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_INITIALIZER = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER;

  /**
   * The number of structural features of the '<em>Array Instantiation By Values Untyped</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_UNTYPED_FEATURE_COUNT = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesTypedImpl <em>Array Instantiation By Values Typed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesTypedImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesTyped()
   * @generated
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__LAYOUT_INFORMATIONS = ARRAY_INSTANTIATION_BY_VALUES__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_ARGUMENTS = ARRAY_INSTANTIATION_BY_VALUES__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__NEXT = ARRAY_INSTANTIATION_BY_VALUES__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_SELECTORS = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Array Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_INITIALIZER = ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_AFTER = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Array Instantiation By Values Typed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INSTANTIATION_BY_VALUES_TYPED_FEATURE_COUNT = ARRAY_INSTANTIATION_BY_VALUES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.arrays.impl.ArraySelectorImpl <em>Array Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.arrays.impl.ArraySelectorImpl
   * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArraySelector()
   * @generated
   */
  int ARRAY_SELECTOR = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SELECTOR__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SELECTOR__POSITION = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_SELECTOR_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayTypeable <em>Array Typeable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Typeable</em>'.
   * @see org.emftext.language.java.arrays.ArrayTypeable
   * @generated
   */
  EClass getArrayTypeable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.arrays.ArrayTypeable#getArrayDimensionsBefore <em>Array Dimensions Before</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Dimensions Before</em>'.
   * @see org.emftext.language.java.arrays.ArrayTypeable#getArrayDimensionsBefore()
   * @see #getArrayTypeable()
   * @generated
   */
  EReference getArrayTypeable_ArrayDimensionsBefore();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.arrays.ArrayTypeable#getArrayDimensionsAfter <em>Array Dimensions After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Dimensions After</em>'.
   * @see org.emftext.language.java.arrays.ArrayTypeable#getArrayDimensionsAfter()
   * @see #getArrayTypeable()
   * @generated
   */
  EReference getArrayTypeable_ArrayDimensionsAfter();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayDimension <em>Array Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Dimension</em>'.
   * @see org.emftext.language.java.arrays.ArrayDimension
   * @generated
   */
  EClass getArrayDimension();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayInitializer <em>Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Initializer</em>'.
   * @see org.emftext.language.java.arrays.ArrayInitializer
   * @generated
   */
  EClass getArrayInitializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.arrays.ArrayInitializer#getInitialValues <em>Initial Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial Values</em>'.
   * @see org.emftext.language.java.arrays.ArrayInitializer#getInitialValues()
   * @see #getArrayInitializer()
   * @generated
   */
  EReference getArrayInitializer_InitialValues();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayInitializationValue <em>Array Initialization Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Initialization Value</em>'.
   * @see org.emftext.language.java.arrays.ArrayInitializationValue
   * @generated
   */
  EClass getArrayInitializationValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayInstantiation <em>Array Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Instantiation</em>'.
   * @see org.emftext.language.java.arrays.ArrayInstantiation
   * @generated
   */
  EClass getArrayInstantiation();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayInstantiationBySize <em>Array Instantiation By Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Instantiation By Size</em>'.
   * @see org.emftext.language.java.arrays.ArrayInstantiationBySize
   * @generated
   */
  EClass getArrayInstantiationBySize();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.arrays.ArrayInstantiationBySize#getSizes <em>Sizes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sizes</em>'.
   * @see org.emftext.language.java.arrays.ArrayInstantiationBySize#getSizes()
   * @see #getArrayInstantiationBySize()
   * @generated
   */
  EReference getArrayInstantiationBySize_Sizes();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayInstantiationByValues <em>Array Instantiation By Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Instantiation By Values</em>'.
   * @see org.emftext.language.java.arrays.ArrayInstantiationByValues
   * @generated
   */
  EClass getArrayInstantiationByValues();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.arrays.ArrayInstantiationByValues#getArrayInitializer <em>Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Initializer</em>'.
   * @see org.emftext.language.java.arrays.ArrayInstantiationByValues#getArrayInitializer()
   * @see #getArrayInstantiationByValues()
   * @generated
   */
  EReference getArrayInstantiationByValues_ArrayInitializer();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped <em>Array Instantiation By Values Untyped</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Instantiation By Values Untyped</em>'.
   * @see org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped
   * @generated
   */
  EClass getArrayInstantiationByValuesUntyped();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped <em>Array Instantiation By Values Typed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Instantiation By Values Typed</em>'.
   * @see org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped
   * @generated
   */
  EClass getArrayInstantiationByValuesTyped();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.arrays.ArraySelector <em>Array Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Selector</em>'.
   * @see org.emftext.language.java.arrays.ArraySelector
   * @generated
   */
  EClass getArraySelector();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.arrays.ArraySelector#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Position</em>'.
   * @see org.emftext.language.java.arrays.ArraySelector#getPosition()
   * @see #getArraySelector()
   * @generated
   */
  EReference getArraySelector_Position();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArraysFactory getArraysFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayTypeableImpl <em>Array Typeable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayTypeableImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayTypeable()
     * @generated
     */
    EClass ARRAY_TYPEABLE = eINSTANCE.getArrayTypeable();

    /**
     * The meta object literal for the '<em><b>Array Dimensions Before</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE = eINSTANCE.getArrayTypeable_ArrayDimensionsBefore();

    /**
     * The meta object literal for the '<em><b>Array Dimensions After</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER = eINSTANCE.getArrayTypeable_ArrayDimensionsAfter();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayDimensionImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayDimension()
     * @generated
     */
    EClass ARRAY_DIMENSION = eINSTANCE.getArrayDimension();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayInitializerImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInitializer()
     * @generated
     */
    EClass ARRAY_INITIALIZER = eINSTANCE.getArrayInitializer();

    /**
     * The meta object literal for the '<em><b>Initial Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INITIALIZER__INITIAL_VALUES = eINSTANCE.getArrayInitializer_InitialValues();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayInitializationValueImpl <em>Array Initialization Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayInitializationValueImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInitializationValue()
     * @generated
     */
    EClass ARRAY_INITIALIZATION_VALUE = eINSTANCE.getArrayInitializationValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationImpl <em>Array Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayInstantiationImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiation()
     * @generated
     */
    EClass ARRAY_INSTANTIATION = eINSTANCE.getArrayInstantiation();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationBySizeImpl <em>Array Instantiation By Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayInstantiationBySizeImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationBySize()
     * @generated
     */
    EClass ARRAY_INSTANTIATION_BY_SIZE = eINSTANCE.getArrayInstantiationBySize();

    /**
     * The meta object literal for the '<em><b>Sizes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INSTANTIATION_BY_SIZE__SIZES = eINSTANCE.getArrayInstantiationBySize_Sizes();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesImpl <em>Array Instantiation By Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValues()
     * @generated
     */
    EClass ARRAY_INSTANTIATION_BY_VALUES = eINSTANCE.getArrayInstantiationByValues();

    /**
     * The meta object literal for the '<em><b>Array Initializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INSTANTIATION_BY_VALUES__ARRAY_INITIALIZER = eINSTANCE.getArrayInstantiationByValues_ArrayInitializer();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesUntypedImpl <em>Array Instantiation By Values Untyped</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesUntypedImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesUntyped()
     * @generated
     */
    EClass ARRAY_INSTANTIATION_BY_VALUES_UNTYPED = eINSTANCE.getArrayInstantiationByValuesUntyped();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesTypedImpl <em>Array Instantiation By Values Typed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArrayInstantiationByValuesTypedImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArrayInstantiationByValuesTyped()
     * @generated
     */
    EClass ARRAY_INSTANTIATION_BY_VALUES_TYPED = eINSTANCE.getArrayInstantiationByValuesTyped();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.arrays.impl.ArraySelectorImpl <em>Array Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.arrays.impl.ArraySelectorImpl
     * @see org.emftext.language.java.arrays.impl.ArraysPackageImpl#getArraySelector()
     * @generated
     */
    EClass ARRAY_SELECTOR = eINSTANCE.getArraySelector();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_SELECTOR__POSITION = eINSTANCE.getArraySelector_Position();

  }

} //ArraysPackage
