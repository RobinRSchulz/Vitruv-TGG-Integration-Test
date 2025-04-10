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
package org.emftext.language.java.generics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.classifiers.ClassifiersPackage;

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
 * @see org.emftext.language.java.generics.GenericsFactory
 * @model kind="package"
 * @generated
 */
public interface GenericsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "generics";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/generics";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "generics";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenericsPackage eINSTANCE = org.emftext.language.java.generics.impl.GenericsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.TypeArgumentImpl <em>Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.TypeArgumentImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeArgument()
   * @generated
   */
  int TYPE_ARGUMENT = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENT__LAYOUT_INFORMATIONS = ArraysPackage.ARRAY_TYPEABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = ArraysPackage.ARRAY_TYPEABLE__ARRAY_DIMENSIONS_AFTER;

  /**
   * The number of structural features of the '<em>Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENT_FEATURE_COUNT = ArraysPackage.ARRAY_TYPEABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.TypeArgumentableImpl <em>Type Argumentable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.TypeArgumentableImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeArgumentable()
   * @generated
   */
  int TYPE_ARGUMENTABLE = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTABLE__TYPE_ARGUMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Argumentable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ARGUMENTABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.CallTypeArgumentableImpl <em>Call Type Argumentable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.CallTypeArgumentableImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getCallTypeArgumentable()
   * @generated
   */
  int CALL_TYPE_ARGUMENTABLE = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_TYPE_ARGUMENTABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Call Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Call Type Argumentable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_TYPE_ARGUMENTABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.TypeParametrizableImpl <em>Type Parametrizable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.TypeParametrizableImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeParametrizable()
   * @generated
   */
  int TYPE_PARAMETRIZABLE = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETRIZABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETRIZABLE__TYPE_PARAMETERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Parametrizable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETRIZABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.ExtendsTypeArgumentImpl <em>Extends Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.ExtendsTypeArgumentImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getExtendsTypeArgument()
   * @generated
   */
  int EXTENDS_TYPE_ARGUMENT = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE_ARGUMENT__LAYOUT_INFORMATIONS = TYPE_ARGUMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Extend Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES = TYPE_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extends Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.QualifiedTypeArgumentImpl <em>Qualified Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.QualifiedTypeArgumentImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getQualifiedTypeArgument()
   * @generated
   */
  int QUALIFIED_TYPE_ARGUMENT = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_ARGUMENT__LAYOUT_INFORMATIONS = TYPE_ARGUMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE = TYPE_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qualified Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.SuperTypeArgumentImpl <em>Super Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.SuperTypeArgumentImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getSuperTypeArgument()
   * @generated
   */
  int SUPER_TYPE_ARGUMENT = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_TYPE_ARGUMENT__LAYOUT_INFORMATIONS = TYPE_ARGUMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_TYPE_ARGUMENT__SUPER_TYPE = TYPE_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Super Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.TypeParameterImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeParameter()
   * @generated
   */
  int TYPE_PARAMETER = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER__LAYOUT_INFORMATIONS = ClassifiersPackage.CLASSIFIER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER__NAME = ClassifiersPackage.CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Extend Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER__EXTEND_TYPES = ClassifiersPackage.CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER_FEATURE_COUNT = ClassifiersPackage.CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.generics.impl.UnknownTypeArgumentImpl <em>Unknown Type Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.generics.impl.UnknownTypeArgumentImpl
   * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getUnknownTypeArgument()
   * @generated
   */
  int UNKNOWN_TYPE_ARGUMENT = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_TYPE_ARGUMENT__LAYOUT_INFORMATIONS = TYPE_ARGUMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE = TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER = TYPE_ARGUMENT__ARRAY_DIMENSIONS_AFTER;

  /**
   * The number of structural features of the '<em>Unknown Type Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_TYPE_ARGUMENT_FEATURE_COUNT = TYPE_ARGUMENT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.TypeArgument <em>Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Argument</em>'.
   * @see org.emftext.language.java.generics.TypeArgument
   * @generated
   */
  EClass getTypeArgument();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.TypeArgumentable <em>Type Argumentable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Argumentable</em>'.
   * @see org.emftext.language.java.generics.TypeArgumentable
   * @generated
   */
  EClass getTypeArgumentable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.generics.TypeArgumentable#getTypeArguments <em>Type Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
   * @see org.emftext.language.java.generics.TypeArgumentable#getTypeArguments()
   * @see #getTypeArgumentable()
   * @generated
   */
  EReference getTypeArgumentable_TypeArguments();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.CallTypeArgumentable <em>Call Type Argumentable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Type Argumentable</em>'.
   * @see org.emftext.language.java.generics.CallTypeArgumentable
   * @generated
   */
  EClass getCallTypeArgumentable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.generics.CallTypeArgumentable#getCallTypeArguments <em>Call Type Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Call Type Arguments</em>'.
   * @see org.emftext.language.java.generics.CallTypeArgumentable#getCallTypeArguments()
   * @see #getCallTypeArgumentable()
   * @generated
   */
  EReference getCallTypeArgumentable_CallTypeArguments();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.TypeParametrizable <em>Type Parametrizable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Parametrizable</em>'.
   * @see org.emftext.language.java.generics.TypeParametrizable
   * @generated
   */
  EClass getTypeParametrizable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.generics.TypeParametrizable#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see org.emftext.language.java.generics.TypeParametrizable#getTypeParameters()
   * @see #getTypeParametrizable()
   * @generated
   */
  EReference getTypeParametrizable_TypeParameters();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.ExtendsTypeArgument <em>Extends Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends Type Argument</em>'.
   * @see org.emftext.language.java.generics.ExtendsTypeArgument
   * @generated
   */
  EClass getExtendsTypeArgument();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.generics.ExtendsTypeArgument#getExtendTypes <em>Extend Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extend Types</em>'.
   * @see org.emftext.language.java.generics.ExtendsTypeArgument#getExtendTypes()
   * @see #getExtendsTypeArgument()
   * @generated
   */
  EReference getExtendsTypeArgument_ExtendTypes();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.QualifiedTypeArgument <em>Qualified Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Type Argument</em>'.
   * @see org.emftext.language.java.generics.QualifiedTypeArgument
   * @generated
   */
  EClass getQualifiedTypeArgument();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.SuperTypeArgument <em>Super Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Type Argument</em>'.
   * @see org.emftext.language.java.generics.SuperTypeArgument
   * @generated
   */
  EClass getSuperTypeArgument();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.generics.SuperTypeArgument#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.emftext.language.java.generics.SuperTypeArgument#getSuperType()
   * @see #getSuperTypeArgument()
   * @generated
   */
  EReference getSuperTypeArgument_SuperType();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.TypeParameter <em>Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Parameter</em>'.
   * @see org.emftext.language.java.generics.TypeParameter
   * @generated
   */
  EClass getTypeParameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.generics.TypeParameter#getExtendTypes <em>Extend Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extend Types</em>'.
   * @see org.emftext.language.java.generics.TypeParameter#getExtendTypes()
   * @see #getTypeParameter()
   * @generated
   */
  EReference getTypeParameter_ExtendTypes();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.generics.UnknownTypeArgument <em>Unknown Type Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown Type Argument</em>'.
   * @see org.emftext.language.java.generics.UnknownTypeArgument
   * @generated
   */
  EClass getUnknownTypeArgument();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GenericsFactory getGenericsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.TypeArgumentImpl <em>Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.TypeArgumentImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeArgument()
     * @generated
     */
    EClass TYPE_ARGUMENT = eINSTANCE.getTypeArgument();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.TypeArgumentableImpl <em>Type Argumentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.TypeArgumentableImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeArgumentable()
     * @generated
     */
    EClass TYPE_ARGUMENTABLE = eINSTANCE.getTypeArgumentable();

    /**
     * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ARGUMENTABLE__TYPE_ARGUMENTS = eINSTANCE.getTypeArgumentable_TypeArguments();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.CallTypeArgumentableImpl <em>Call Type Argumentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.CallTypeArgumentableImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getCallTypeArgumentable()
     * @generated
     */
    EClass CALL_TYPE_ARGUMENTABLE = eINSTANCE.getCallTypeArgumentable();

    /**
     * The meta object literal for the '<em><b>Call Type Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_TYPE_ARGUMENTABLE__CALL_TYPE_ARGUMENTS = eINSTANCE.getCallTypeArgumentable_CallTypeArguments();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.TypeParametrizableImpl <em>Type Parametrizable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.TypeParametrizableImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeParametrizable()
     * @generated
     */
    EClass TYPE_PARAMETRIZABLE = eINSTANCE.getTypeParametrizable();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PARAMETRIZABLE__TYPE_PARAMETERS = eINSTANCE.getTypeParametrizable_TypeParameters();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.ExtendsTypeArgumentImpl <em>Extends Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.ExtendsTypeArgumentImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getExtendsTypeArgument()
     * @generated
     */
    EClass EXTENDS_TYPE_ARGUMENT = eINSTANCE.getExtendsTypeArgument();

    /**
     * The meta object literal for the '<em><b>Extend Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES = eINSTANCE.getExtendsTypeArgument_ExtendTypes();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.QualifiedTypeArgumentImpl <em>Qualified Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.QualifiedTypeArgumentImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getQualifiedTypeArgument()
     * @generated
     */
    EClass QUALIFIED_TYPE_ARGUMENT = eINSTANCE.getQualifiedTypeArgument();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.SuperTypeArgumentImpl <em>Super Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.SuperTypeArgumentImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getSuperTypeArgument()
     * @generated
     */
    EClass SUPER_TYPE_ARGUMENT = eINSTANCE.getSuperTypeArgument();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPER_TYPE_ARGUMENT__SUPER_TYPE = eINSTANCE.getSuperTypeArgument_SuperType();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.TypeParameterImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getTypeParameter()
     * @generated
     */
    EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

    /**
     * The meta object literal for the '<em><b>Extend Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PARAMETER__EXTEND_TYPES = eINSTANCE.getTypeParameter_ExtendTypes();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.generics.impl.UnknownTypeArgumentImpl <em>Unknown Type Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.generics.impl.UnknownTypeArgumentImpl
     * @see org.emftext.language.java.generics.impl.GenericsPackageImpl#getUnknownTypeArgument()
     * @generated
     */
    EClass UNKNOWN_TYPE_ARGUMENT = eINSTANCE.getUnknownTypeArgument();

  }

} //GenericsPackage
