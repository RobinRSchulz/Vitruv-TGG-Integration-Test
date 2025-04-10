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
package org.emftext.language.java.containers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.emftext.language.java.containers.ContainersFactory
 * @model kind="package"
 * @generated
 */
public interface ContainersPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "containers";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/containers";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "containers";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ContainersPackage eINSTANCE = org.emftext.language.java.containers.impl.ContainersPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.containers.impl.JavaRootImpl <em>Java Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.containers.impl.JavaRootImpl
   * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getJavaRoot()
   * @generated
   */
  int JAVA_ROOT = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ROOT__LAYOUT_INFORMATIONS = CommonsPackage.NAMED_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ROOT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ROOT__NAMESPACES = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ROOT__IMPORTS = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Java Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ROOT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.containers.impl.CompilationUnitImpl
   * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getCompilationUnit()
   * @generated
   */
  int COMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__LAYOUT_INFORMATIONS = JAVA_ROOT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__NAME = JAVA_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__NAMESPACES = JAVA_ROOT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__IMPORTS = JAVA_ROOT__IMPORTS;

  /**
   * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__CLASSIFIERS = JAVA_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = JAVA_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.containers.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.containers.impl.PackageImpl
   * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__LAYOUT_INFORMATIONS = JAVA_ROOT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = JAVA_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAMESPACES = JAVA_ROOT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__IMPORTS = JAVA_ROOT__IMPORTS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ANNOTATIONS = JAVA_ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__COMPILATION_UNITS = JAVA_ROOT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = JAVA_ROOT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.containers.impl.EmptyModelImpl <em>Empty Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.containers.impl.EmptyModelImpl
   * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getEmptyModel()
   * @generated
   */
  int EMPTY_MODEL = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MODEL__LAYOUT_INFORMATIONS = JAVA_ROOT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MODEL__NAME = JAVA_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MODEL__NAMESPACES = JAVA_ROOT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MODEL__IMPORTS = JAVA_ROOT__IMPORTS;

  /**
   * The number of structural features of the '<em>Empty Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MODEL_FEATURE_COUNT = JAVA_ROOT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.containers.JavaRoot <em>Java Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Root</em>'.
   * @see org.emftext.language.java.containers.JavaRoot
   * @generated
   */
  EClass getJavaRoot();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.containers.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation Unit</em>'.
   * @see org.emftext.language.java.containers.CompilationUnit
   * @generated
   */
  EClass getCompilationUnit();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.containers.CompilationUnit#getClassifiers <em>Classifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classifiers</em>'.
   * @see org.emftext.language.java.containers.CompilationUnit#getClassifiers()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_Classifiers();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.containers.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.emftext.language.java.containers.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.containers.Package#getCompilationUnits <em>Compilation Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
   * @see org.emftext.language.java.containers.Package#getCompilationUnits()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_CompilationUnits();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.containers.EmptyModel <em>Empty Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Model</em>'.
   * @see org.emftext.language.java.containers.EmptyModel
   * @generated
   */
  EClass getEmptyModel();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ContainersFactory getContainersFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.containers.impl.JavaRootImpl <em>Java Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.containers.impl.JavaRootImpl
     * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getJavaRoot()
     * @generated
     */
    EClass JAVA_ROOT = eINSTANCE.getJavaRoot();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.containers.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.containers.impl.CompilationUnitImpl
     * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getCompilationUnit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

    /**
     * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__CLASSIFIERS = eINSTANCE.getCompilationUnit_Classifiers();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.containers.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.containers.impl.PackageImpl
     * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__COMPILATION_UNITS = eINSTANCE.getPackage_CompilationUnits();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.containers.impl.EmptyModelImpl <em>Empty Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.containers.impl.EmptyModelImpl
     * @see org.emftext.language.java.containers.impl.ContainersPackageImpl#getEmptyModel()
     * @generated
     */
    EClass EMPTY_MODEL = eINSTANCE.getEmptyModel();

  }

} //ContainersPackage
