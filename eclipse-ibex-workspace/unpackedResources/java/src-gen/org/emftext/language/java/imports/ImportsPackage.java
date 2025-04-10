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
package org.emftext.language.java.imports;

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
 * @see org.emftext.language.java.imports.ImportsFactory
 * @model kind="package"
 * @generated
 */
public interface ImportsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "imports";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/imports";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "imports";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ImportsPackage eINSTANCE = org.emftext.language.java.imports.impl.ImportsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.imports.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.imports.impl.ImportImpl
   * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__LAYOUT_INFORMATIONS = CommonsPackage.NAMESPACE_AWARE_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAMESPACES = CommonsPackage.NAMESPACE_AWARE_ELEMENT__NAMESPACES;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = CommonsPackage.NAMESPACE_AWARE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.imports.impl.ImportingElementImpl <em>Importing Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.imports.impl.ImportingElementImpl
   * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getImportingElement()
   * @generated
   */
  int IMPORTING_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTING_ELEMENT__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTING_ELEMENT__IMPORTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Importing Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTING_ELEMENT_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.imports.impl.StaticImportImpl <em>Static Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.imports.impl.StaticImportImpl
   * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getStaticImport()
   * @generated
   */
  int STATIC_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_IMPORT__LAYOUT_INFORMATIONS = IMPORT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_IMPORT__NAMESPACES = IMPORT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_IMPORT__STATIC = IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.imports.impl.ClassifierImportImpl <em>Classifier Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.imports.impl.ClassifierImportImpl
   * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getClassifierImport()
   * @generated
   */
  int CLASSIFIER_IMPORT = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_IMPORT__LAYOUT_INFORMATIONS = IMPORT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_IMPORT__NAMESPACES = IMPORT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Classifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_IMPORT__CLASSIFIER = IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Classifier Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.imports.impl.PackageImportImpl <em>Package Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.imports.impl.PackageImportImpl
   * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getPackageImport()
   * @generated
   */
  int PACKAGE_IMPORT = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__LAYOUT_INFORMATIONS = IMPORT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__NAMESPACES = IMPORT__NAMESPACES;

  /**
   * The number of structural features of the '<em>Package Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.imports.impl.StaticClassifierImportImpl <em>Static Classifier Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.imports.impl.StaticClassifierImportImpl
   * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getStaticClassifierImport()
   * @generated
   */
  int STATIC_CLASSIFIER_IMPORT = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CLASSIFIER_IMPORT__LAYOUT_INFORMATIONS = STATIC_IMPORT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CLASSIFIER_IMPORT__NAMESPACES = STATIC_IMPORT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CLASSIFIER_IMPORT__STATIC = STATIC_IMPORT__STATIC;

  /**
   * The number of structural features of the '<em>Static Classifier Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_CLASSIFIER_IMPORT_FEATURE_COUNT = STATIC_IMPORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.imports.impl.StaticMemberImportImpl <em>Static Member Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.imports.impl.StaticMemberImportImpl
   * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getStaticMemberImport()
   * @generated
   */
  int STATIC_MEMBER_IMPORT = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_MEMBER_IMPORT__LAYOUT_INFORMATIONS = STATIC_IMPORT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_MEMBER_IMPORT__NAMESPACES = STATIC_IMPORT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_MEMBER_IMPORT__STATIC = STATIC_IMPORT__STATIC;

  /**
   * The feature id for the '<em><b>Static Members</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_MEMBER_IMPORT__STATIC_MEMBERS = STATIC_IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static Member Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_MEMBER_IMPORT_FEATURE_COUNT = STATIC_IMPORT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.imports.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.emftext.language.java.imports.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.imports.ImportingElement <em>Importing Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Importing Element</em>'.
   * @see org.emftext.language.java.imports.ImportingElement
   * @generated
   */
  EClass getImportingElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.imports.ImportingElement#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.emftext.language.java.imports.ImportingElement#getImports()
   * @see #getImportingElement()
   * @generated
   */
  EReference getImportingElement_Imports();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.imports.StaticImport <em>Static Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Import</em>'.
   * @see org.emftext.language.java.imports.StaticImport
   * @generated
   */
  EClass getStaticImport();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.imports.StaticImport#getStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Static</em>'.
   * @see org.emftext.language.java.imports.StaticImport#getStatic()
   * @see #getStaticImport()
   * @generated
   */
  EReference getStaticImport_Static();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.imports.ClassifierImport <em>Classifier Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Import</em>'.
   * @see org.emftext.language.java.imports.ClassifierImport
   * @generated
   */
  EClass getClassifierImport();

  /**
   * Returns the meta object for the reference '{@link org.emftext.language.java.imports.ClassifierImport#getClassifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Classifier</em>'.
   * @see org.emftext.language.java.imports.ClassifierImport#getClassifier()
   * @see #getClassifierImport()
   * @generated
   */
  EReference getClassifierImport_Classifier();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.imports.PackageImport <em>Package Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Import</em>'.
   * @see org.emftext.language.java.imports.PackageImport
   * @generated
   */
  EClass getPackageImport();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.imports.StaticClassifierImport <em>Static Classifier Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Classifier Import</em>'.
   * @see org.emftext.language.java.imports.StaticClassifierImport
   * @generated
   */
  EClass getStaticClassifierImport();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.imports.StaticMemberImport <em>Static Member Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Member Import</em>'.
   * @see org.emftext.language.java.imports.StaticMemberImport
   * @generated
   */
  EClass getStaticMemberImport();

  /**
   * Returns the meta object for the reference list '{@link org.emftext.language.java.imports.StaticMemberImport#getStaticMembers <em>Static Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Static Members</em>'.
   * @see org.emftext.language.java.imports.StaticMemberImport#getStaticMembers()
   * @see #getStaticMemberImport()
   * @generated
   */
  EReference getStaticMemberImport_StaticMembers();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ImportsFactory getImportsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.imports.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.imports.impl.ImportImpl
     * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.imports.impl.ImportingElementImpl <em>Importing Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.imports.impl.ImportingElementImpl
     * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getImportingElement()
     * @generated
     */
    EClass IMPORTING_ELEMENT = eINSTANCE.getImportingElement();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORTING_ELEMENT__IMPORTS = eINSTANCE.getImportingElement_Imports();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.imports.impl.StaticImportImpl <em>Static Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.imports.impl.StaticImportImpl
     * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getStaticImport()
     * @generated
     */
    EClass STATIC_IMPORT = eINSTANCE.getStaticImport();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_IMPORT__STATIC = eINSTANCE.getStaticImport_Static();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.imports.impl.ClassifierImportImpl <em>Classifier Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.imports.impl.ClassifierImportImpl
     * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getClassifierImport()
     * @generated
     */
    EClass CLASSIFIER_IMPORT = eINSTANCE.getClassifierImport();

    /**
     * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_IMPORT__CLASSIFIER = eINSTANCE.getClassifierImport_Classifier();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.imports.impl.PackageImportImpl <em>Package Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.imports.impl.PackageImportImpl
     * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getPackageImport()
     * @generated
     */
    EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.imports.impl.StaticClassifierImportImpl <em>Static Classifier Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.imports.impl.StaticClassifierImportImpl
     * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getStaticClassifierImport()
     * @generated
     */
    EClass STATIC_CLASSIFIER_IMPORT = eINSTANCE.getStaticClassifierImport();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.imports.impl.StaticMemberImportImpl <em>Static Member Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.imports.impl.StaticMemberImportImpl
     * @see org.emftext.language.java.imports.impl.ImportsPackageImpl#getStaticMemberImport()
     * @generated
     */
    EClass STATIC_MEMBER_IMPORT = eINSTANCE.getStaticMemberImport();

    /**
     * The meta object literal for the '<em><b>Static Members</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_MEMBER_IMPORT__STATIC_MEMBERS = eINSTANCE.getStaticMemberImport_StaticMembers();

  }

} //ImportsPackage
