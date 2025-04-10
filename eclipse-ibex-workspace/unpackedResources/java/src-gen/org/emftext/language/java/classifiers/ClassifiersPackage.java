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
package org.emftext.language.java.classifiers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

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
 * @see org.emftext.language.java.classifiers.ClassifiersFactory
 * @model kind="package"
 * @generated
 */
public interface ClassifiersPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "classifiers";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/classifiers";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "classifiers";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ClassifiersPackage eINSTANCE = org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.ClassifierImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__LAYOUT_INFORMATIONS = TypesPackage.TYPE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__NAME = TypesPackage.TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = TypesPackage.TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl <em>Concrete Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getConcreteClassifier()
   * @generated
   */
  int CONCRETE_CLASSIFIER = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CLASSIFIER__LAYOUT_INFORMATIONS = CLASSIFIER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CLASSIFIER__NAME = CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CLASSIFIER__TYPE_PARAMETERS = CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CLASSIFIER__MEMBERS = CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CLASSIFIER__DEFAULT_MEMBERS = CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS = CLASSIFIER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Concrete Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.ImplementorImpl <em>Implementor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.ImplementorImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getImplementor()
   * @generated
   */
  int IMPLEMENTOR = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTOR__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTOR__IMPLEMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Implementor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTOR_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.ClassImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__LAYOUT_INFORMATIONS = CONCRETE_CLASSIFIER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = CONCRETE_CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IMPLEMENTS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__DEFAULT_EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.InterfaceImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__LAYOUT_INFORMATIONS = CONCRETE_CLASSIFIER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = CONCRETE_CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__DEFAULT_EXTENDS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.EnumerationImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__LAYOUT_INFORMATIONS = CONCRETE_CLASSIFIER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = CONCRETE_CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__IMPLEMENTS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__CONSTANTS = CONCRETE_CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.AnnotationImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__LAYOUT_INFORMATIONS = CONCRETE_CLASSIFIER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = CONCRETE_CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__TYPE_PARAMETERS = CONCRETE_CLASSIFIER__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__MEMBERS = CONCRETE_CLASSIFIER__MEMBERS;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__DEFAULT_MEMBERS = CONCRETE_CLASSIFIER__DEFAULT_MEMBERS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATIONS_AND_MODIFIERS = CONCRETE_CLASSIFIER__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = CONCRETE_CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.classifiers.impl.AnonymousClassImpl <em>Anonymous Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.classifiers.impl.AnonymousClassImpl
   * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getAnonymousClass()
   * @generated
   */
  int ANONYMOUS_CLASS = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_CLASS__LAYOUT_INFORMATIONS = TypesPackage.TYPE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_CLASS__MEMBERS = TypesPackage.TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_CLASS__DEFAULT_MEMBERS = TypesPackage.TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anonymous Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_CLASS_FEATURE_COUNT = TypesPackage.TYPE_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see org.emftext.language.java.classifiers.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.ConcreteClassifier <em>Concrete Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Classifier</em>'.
   * @see org.emftext.language.java.classifiers.ConcreteClassifier
   * @generated
   */
  EClass getConcreteClassifier();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.Implementor <em>Implementor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementor</em>'.
   * @see org.emftext.language.java.classifiers.Implementor
   * @generated
   */
  EClass getImplementor();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.classifiers.Implementor#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see org.emftext.language.java.classifiers.Implementor#getImplements()
   * @see #getImplementor()
   * @generated
   */
  EReference getImplementor_Implements();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.emftext.language.java.classifiers.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.classifiers.Class#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see org.emftext.language.java.classifiers.Class#getExtends()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Extends();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.classifiers.Class#getDefaultExtends <em>Default Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Extends</em>'.
   * @see org.emftext.language.java.classifiers.Class#getDefaultExtends()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_DefaultExtends();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.emftext.language.java.classifiers.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.classifiers.Interface#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see org.emftext.language.java.classifiers.Interface#getExtends()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.classifiers.Interface#getDefaultExtends <em>Default Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Default Extends</em>'.
   * @see org.emftext.language.java.classifiers.Interface#getDefaultExtends()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_DefaultExtends();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.emftext.language.java.classifiers.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.classifiers.Enumeration#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.emftext.language.java.classifiers.Enumeration#getConstants()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Constants();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.emftext.language.java.classifiers.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.classifiers.AnonymousClass <em>Anonymous Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Class</em>'.
   * @see org.emftext.language.java.classifiers.AnonymousClass
   * @generated
   */
  EClass getAnonymousClass();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ClassifiersFactory getClassifiersFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.ClassifierImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl <em>Concrete Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.ConcreteClassifierImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getConcreteClassifier()
     * @generated
     */
    EClass CONCRETE_CLASSIFIER = eINSTANCE.getConcreteClassifier();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.ImplementorImpl <em>Implementor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.ImplementorImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getImplementor()
     * @generated
     */
    EClass IMPLEMENTOR = eINSTANCE.getImplementor();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLEMENTOR__IMPLEMENTS = eINSTANCE.getImplementor_Implements();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.ClassImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

    /**
     * The meta object literal for the '<em><b>Default Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__DEFAULT_EXTENDS = eINSTANCE.getClass_DefaultExtends();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.InterfaceImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__EXTENDS = eINSTANCE.getInterface_Extends();

    /**
     * The meta object literal for the '<em><b>Default Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__DEFAULT_EXTENDS = eINSTANCE.getInterface_DefaultExtends();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.EnumerationImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__CONSTANTS = eINSTANCE.getEnumeration_Constants();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.AnnotationImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.classifiers.impl.AnonymousClassImpl <em>Anonymous Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.classifiers.impl.AnonymousClassImpl
     * @see org.emftext.language.java.classifiers.impl.ClassifiersPackageImpl#getAnonymousClass()
     * @generated
     */
    EClass ANONYMOUS_CLASS = eINSTANCE.getAnonymousClass();

  }

} //ClassifiersPackage
