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
package org.emftext.language.java.instantiations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.references.ReferencesPackage;

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
 * @see org.emftext.language.java.instantiations.InstantiationsFactory
 * @model kind="package"
 * @generated
 */
public interface InstantiationsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "instantiations";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/instantiations";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "instantiations";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InstantiationsPackage eINSTANCE = org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.instantiations.impl.InitializableImpl <em>Initializable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.instantiations.impl.InitializableImpl
   * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getInitializable()
   * @generated
   */
  int INITIALIZABLE = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZABLE__INITIAL_VALUE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Initializable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.instantiations.impl.InstantiationImpl <em>Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.instantiations.impl.InstantiationImpl
   * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getInstantiation()
   * @generated
   */
  int INSTANTIATION = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__LAYOUT_INFORMATIONS = ReferencesPackage.REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__TYPE_ARGUMENTS = ReferencesPackage.REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__NEXT = ReferencesPackage.REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__ARRAY_SELECTORS = ReferencesPackage.REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION__ARGUMENTS = ReferencesPackage.REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_FEATURE_COUNT = ReferencesPackage.REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.instantiations.impl.NewConstructorCallImpl <em>New Constructor Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.instantiations.impl.NewConstructorCallImpl
   * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getNewConstructorCall()
   * @generated
   */
  int NEW_CONSTRUCTOR_CALL = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__LAYOUT_INFORMATIONS = TypesPackage.TYPED_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__TYPE_REFERENCE = TypesPackage.TYPED_ELEMENT__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__NEXT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__ARRAY_SELECTORS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__ARGUMENTS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Call Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Anonymous Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>New Constructor Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONSTRUCTOR_CALL_FEATURE_COUNT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.emftext.language.java.instantiations.impl.ExplicitConstructorCallImpl <em>Explicit Constructor Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.instantiations.impl.ExplicitConstructorCallImpl
   * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getExplicitConstructorCall()
   * @generated
   */
  int EXPLICIT_CONSTRUCTOR_CALL = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_CONSTRUCTOR_CALL__LAYOUT_INFORMATIONS = INSTANTIATION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_CONSTRUCTOR_CALL__TYPE_ARGUMENTS = INSTANTIATION__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_CONSTRUCTOR_CALL__NEXT = INSTANTIATION__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_CONSTRUCTOR_CALL__ARRAY_SELECTORS = INSTANTIATION__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_CONSTRUCTOR_CALL__ARGUMENTS = INSTANTIATION__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Call Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET = INSTANTIATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Explicit Constructor Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_CONSTRUCTOR_CALL_FEATURE_COUNT = INSTANTIATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.instantiations.Initializable <em>Initializable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initializable</em>'.
   * @see org.emftext.language.java.instantiations.Initializable
   * @generated
   */
  EClass getInitializable();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.instantiations.Initializable#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see org.emftext.language.java.instantiations.Initializable#getInitialValue()
   * @see #getInitializable()
   * @generated
   */
  EReference getInitializable_InitialValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.instantiations.Instantiation <em>Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiation</em>'.
   * @see org.emftext.language.java.instantiations.Instantiation
   * @generated
   */
  EClass getInstantiation();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.instantiations.NewConstructorCall <em>New Constructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Constructor Call</em>'.
   * @see org.emftext.language.java.instantiations.NewConstructorCall
   * @generated
   */
  EClass getNewConstructorCall();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.instantiations.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Class</em>'.
   * @see org.emftext.language.java.instantiations.NewConstructorCall#getAnonymousClass()
   * @see #getNewConstructorCall()
   * @generated
   */
  EReference getNewConstructorCall_AnonymousClass();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.instantiations.ExplicitConstructorCall <em>Explicit Constructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Constructor Call</em>'.
   * @see org.emftext.language.java.instantiations.ExplicitConstructorCall
   * @generated
   */
  EClass getExplicitConstructorCall();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call Target</em>'.
   * @see org.emftext.language.java.instantiations.ExplicitConstructorCall#getCallTarget()
   * @see #getExplicitConstructorCall()
   * @generated
   */
  EReference getExplicitConstructorCall_CallTarget();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InstantiationsFactory getInstantiationsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.instantiations.impl.InitializableImpl <em>Initializable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.instantiations.impl.InitializableImpl
     * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getInitializable()
     * @generated
     */
    EClass INITIALIZABLE = eINSTANCE.getInitializable();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZABLE__INITIAL_VALUE = eINSTANCE.getInitializable_InitialValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.instantiations.impl.InstantiationImpl <em>Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.instantiations.impl.InstantiationImpl
     * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getInstantiation()
     * @generated
     */
    EClass INSTANTIATION = eINSTANCE.getInstantiation();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.instantiations.impl.NewConstructorCallImpl <em>New Constructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.instantiations.impl.NewConstructorCallImpl
     * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getNewConstructorCall()
     * @generated
     */
    EClass NEW_CONSTRUCTOR_CALL = eINSTANCE.getNewConstructorCall();

    /**
     * The meta object literal for the '<em><b>Anonymous Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS = eINSTANCE.getNewConstructorCall_AnonymousClass();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.instantiations.impl.ExplicitConstructorCallImpl <em>Explicit Constructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.instantiations.impl.ExplicitConstructorCallImpl
     * @see org.emftext.language.java.instantiations.impl.InstantiationsPackageImpl#getExplicitConstructorCall()
     * @generated
     */
    EClass EXPLICIT_CONSTRUCTOR_CALL = eINSTANCE.getExplicitConstructorCall();

    /**
     * The meta object literal for the '<em><b>Call Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET = eINSTANCE.getExplicitConstructorCall_CallTarget();

  }

} //InstantiationsPackage
