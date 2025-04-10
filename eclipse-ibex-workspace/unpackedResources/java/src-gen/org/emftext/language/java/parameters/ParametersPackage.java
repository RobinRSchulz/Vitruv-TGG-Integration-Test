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
package org.emftext.language.java.parameters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.variables.VariablesPackage;

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
 * @see org.emftext.language.java.parameters.ParametersFactory
 * @model kind="package"
 * @generated
 */
public interface ParametersPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "parameters";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/parameters";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "parameters";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ParametersPackage eINSTANCE = org.emftext.language.java.parameters.impl.ParametersPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.parameters.impl.ParameterImpl
   * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__LAYOUT_INFORMATIONS = VariablesPackage.VARIABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = VariablesPackage.VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE_REFERENCE = VariablesPackage.VARIABLE__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ARRAY_DIMENSIONS_BEFORE = VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ARRAY_DIMENSIONS_AFTER = VariablesPackage.VARIABLE__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE_ARGUMENTS = VariablesPackage.VARIABLE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS_AND_MODIFIERS = VariablesPackage.VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = VariablesPackage.VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.parameters.impl.ParametrizableImpl <em>Parametrizable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.parameters.impl.ParametrizableImpl
   * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getParametrizable()
   * @generated
   */
  int PARAMETRIZABLE = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZABLE__PARAMETERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parametrizable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIZABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.parameters.impl.OrdinaryParameterImpl <em>Ordinary Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.parameters.impl.OrdinaryParameterImpl
   * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getOrdinaryParameter()
   * @generated
   */
  int ORDINARY_PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER__LAYOUT_INFORMATIONS = PARAMETER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER__NAME = PARAMETER__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER__TYPE_REFERENCE = PARAMETER__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER__ARRAY_DIMENSIONS_BEFORE = PARAMETER__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER__ARRAY_DIMENSIONS_AFTER = PARAMETER__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER__TYPE_ARGUMENTS = PARAMETER__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER__ANNOTATIONS_AND_MODIFIERS = PARAMETER__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The number of structural features of the '<em>Ordinary Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINARY_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.parameters.impl.VariableLengthParameterImpl <em>Variable Length Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.parameters.impl.VariableLengthParameterImpl
   * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getVariableLengthParameter()
   * @generated
   */
  int VARIABLE_LENGTH_PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER__LAYOUT_INFORMATIONS = PARAMETER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER__NAME = PARAMETER__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER__TYPE_REFERENCE = PARAMETER__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER__ARRAY_DIMENSIONS_BEFORE = PARAMETER__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER__ARRAY_DIMENSIONS_AFTER = PARAMETER__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER__TYPE_ARGUMENTS = PARAMETER__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER__ANNOTATIONS_AND_MODIFIERS = PARAMETER__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The number of structural features of the '<em>Variable Length Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LENGTH_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.parameters.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.emftext.language.java.parameters.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.parameters.Parametrizable <em>Parametrizable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametrizable</em>'.
   * @see org.emftext.language.java.parameters.Parametrizable
   * @generated
   */
  EClass getParametrizable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.parameters.Parametrizable#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.emftext.language.java.parameters.Parametrizable#getParameters()
   * @see #getParametrizable()
   * @generated
   */
  EReference getParametrizable_Parameters();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.parameters.OrdinaryParameter <em>Ordinary Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordinary Parameter</em>'.
   * @see org.emftext.language.java.parameters.OrdinaryParameter
   * @generated
   */
  EClass getOrdinaryParameter();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.parameters.VariableLengthParameter <em>Variable Length Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Length Parameter</em>'.
   * @see org.emftext.language.java.parameters.VariableLengthParameter
   * @generated
   */
  EClass getVariableLengthParameter();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ParametersFactory getParametersFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.parameters.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.parameters.impl.ParameterImpl
     * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.parameters.impl.ParametrizableImpl <em>Parametrizable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.parameters.impl.ParametrizableImpl
     * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getParametrizable()
     * @generated
     */
    EClass PARAMETRIZABLE = eINSTANCE.getParametrizable();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETRIZABLE__PARAMETERS = eINSTANCE.getParametrizable_Parameters();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.parameters.impl.OrdinaryParameterImpl <em>Ordinary Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.parameters.impl.OrdinaryParameterImpl
     * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getOrdinaryParameter()
     * @generated
     */
    EClass ORDINARY_PARAMETER = eINSTANCE.getOrdinaryParameter();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.parameters.impl.VariableLengthParameterImpl <em>Variable Length Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.parameters.impl.VariableLengthParameterImpl
     * @see org.emftext.language.java.parameters.impl.ParametersPackageImpl#getVariableLengthParameter()
     * @generated
     */
    EClass VARIABLE_LENGTH_PARAMETER = eINSTANCE.getVariableLengthParameter();

  }

} //ParametersPackage
