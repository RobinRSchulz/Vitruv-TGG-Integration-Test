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
package org.emftext.language.java.annotations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.references.ReferencesPackage;

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
 * @see org.emftext.language.java.annotations.AnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotationsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "annotations";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/annotations";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "annotations";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AnnotationsPackage eINSTANCE = org.emftext.language.java.annotations.impl.AnnotationsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.AnnotableImpl <em>Annotable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.AnnotableImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotable()
   * @generated
   */
  int ANNOTABLE = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTABLE__ANNOTATIONS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl <em>Annotation Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.AnnotationInstanceImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationInstance()
   * @generated
   */
  int ANNOTATION_INSTANCE = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__LAYOUT_INFORMATIONS = ReferencesPackage.REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__TYPE_ARGUMENTS = ReferencesPackage.REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__NEXT = ReferencesPackage.REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__ARRAY_SELECTORS = ReferencesPackage.REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__NAMESPACES = ReferencesPackage.REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__ANNOTATION = ReferencesPackage.REFERENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE__PARAMETER = ReferencesPackage.REFERENCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Annotation Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE_FEATURE_COUNT = ReferencesPackage.REFERENCE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.AnnotationParameterImpl <em>Annotation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.AnnotationParameterImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationParameter()
   * @generated
   */
  int ANNOTATION_PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PARAMETER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Annotation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PARAMETER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.SingleAnnotationParameterImpl <em>Single Annotation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.SingleAnnotationParameterImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getSingleAnnotationParameter()
   * @generated
   */
  int SINGLE_ANNOTATION_PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ANNOTATION_PARAMETER__LAYOUT_INFORMATIONS = ANNOTATION_PARAMETER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ANNOTATION_PARAMETER__VALUE = ANNOTATION_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Annotation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ANNOTATION_PARAMETER_FEATURE_COUNT = ANNOTATION_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.AnnotationParameterListImpl <em>Annotation Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.AnnotationParameterListImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationParameterList()
   * @generated
   */
  int ANNOTATION_PARAMETER_LIST = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PARAMETER_LIST__LAYOUT_INFORMATIONS = ANNOTATION_PARAMETER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PARAMETER_LIST__SETTINGS = ANNOTATION_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_PARAMETER_LIST_FEATURE_COUNT = ANNOTATION_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.AnnotationAttributeSettingImpl <em>Annotation Attribute Setting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.AnnotationAttributeSettingImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationAttributeSetting()
   * @generated
   */
  int ANNOTATION_ATTRIBUTE_SETTING = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE_SETTING__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE_SETTING__VALUE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotation Attribute Setting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE_SETTING_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.AnnotationValueImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationValue()
   * @generated
   */
  int ANNOTATION_VALUE = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Annotation Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.annotations.impl.AnnotationAttributeImpl <em>Annotation Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.annotations.impl.AnnotationAttributeImpl
   * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationAttribute()
   * @generated
   */
  int ANNOTATION_ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__LAYOUT_INFORMATIONS = MembersPackage.INTERFACE_METHOD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__NAME = MembersPackage.INTERFACE_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__TYPE_REFERENCE = MembersPackage.INTERFACE_METHOD__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__ARRAY_DIMENSIONS_BEFORE = MembersPackage.INTERFACE_METHOD__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__ARRAY_DIMENSIONS_AFTER = MembersPackage.INTERFACE_METHOD__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__TYPE_PARAMETERS = MembersPackage.INTERFACE_METHOD__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__PARAMETERS = MembersPackage.INTERFACE_METHOD__PARAMETERS;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__EXCEPTIONS = MembersPackage.INTERFACE_METHOD__EXCEPTIONS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__ANNOTATIONS_AND_MODIFIERS = MembersPackage.INTERFACE_METHOD__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE__DEFAULT_VALUE = MembersPackage.INTERFACE_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ATTRIBUTE_FEATURE_COUNT = MembersPackage.INTERFACE_METHOD_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.Annotable <em>Annotable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotable</em>'.
   * @see org.emftext.language.java.annotations.Annotable
   * @generated
   */
  EClass getAnnotable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.annotations.Annotable#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.emftext.language.java.annotations.Annotable#getAnnotations()
   * @see #getAnnotable()
   * @generated
   */
  EReference getAnnotable_Annotations();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.AnnotationInstance <em>Annotation Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Instance</em>'.
   * @see org.emftext.language.java.annotations.AnnotationInstance
   * @generated
   */
  EClass getAnnotationInstance();

  /**
   * Returns the meta object for the reference '{@link org.emftext.language.java.annotations.AnnotationInstance#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Annotation</em>'.
   * @see org.emftext.language.java.annotations.AnnotationInstance#getAnnotation()
   * @see #getAnnotationInstance()
   * @generated
   */
  EReference getAnnotationInstance_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.annotations.AnnotationInstance#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.emftext.language.java.annotations.AnnotationInstance#getParameter()
   * @see #getAnnotationInstance()
   * @generated
   */
  EReference getAnnotationInstance_Parameter();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.AnnotationParameter <em>Annotation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Parameter</em>'.
   * @see org.emftext.language.java.annotations.AnnotationParameter
   * @generated
   */
  EClass getAnnotationParameter();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.SingleAnnotationParameter <em>Single Annotation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Annotation Parameter</em>'.
   * @see org.emftext.language.java.annotations.SingleAnnotationParameter
   * @generated
   */
  EClass getSingleAnnotationParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.annotations.SingleAnnotationParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.emftext.language.java.annotations.SingleAnnotationParameter#getValue()
   * @see #getSingleAnnotationParameter()
   * @generated
   */
  EReference getSingleAnnotationParameter_Value();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.AnnotationParameterList <em>Annotation Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Parameter List</em>'.
   * @see org.emftext.language.java.annotations.AnnotationParameterList
   * @generated
   */
  EClass getAnnotationParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.annotations.AnnotationParameterList#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Settings</em>'.
   * @see org.emftext.language.java.annotations.AnnotationParameterList#getSettings()
   * @see #getAnnotationParameterList()
   * @generated
   */
  EReference getAnnotationParameterList_Settings();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.AnnotationAttributeSetting <em>Annotation Attribute Setting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Attribute Setting</em>'.
   * @see org.emftext.language.java.annotations.AnnotationAttributeSetting
   * @generated
   */
  EClass getAnnotationAttributeSetting();

  /**
   * Returns the meta object for the reference '{@link org.emftext.language.java.annotations.AnnotationAttributeSetting#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.emftext.language.java.annotations.AnnotationAttributeSetting#getAttribute()
   * @see #getAnnotationAttributeSetting()
   * @generated
   */
  EReference getAnnotationAttributeSetting_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.annotations.AnnotationAttributeSetting#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.emftext.language.java.annotations.AnnotationAttributeSetting#getValue()
   * @see #getAnnotationAttributeSetting()
   * @generated
   */
  EReference getAnnotationAttributeSetting_Value();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Value</em>'.
   * @see org.emftext.language.java.annotations.AnnotationValue
   * @generated
   */
  EClass getAnnotationValue();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.annotations.AnnotationAttribute <em>Annotation Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Attribute</em>'.
   * @see org.emftext.language.java.annotations.AnnotationAttribute
   * @generated
   */
  EClass getAnnotationAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.annotations.AnnotationAttribute#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see org.emftext.language.java.annotations.AnnotationAttribute#getDefaultValue()
   * @see #getAnnotationAttribute()
   * @generated
   */
  EReference getAnnotationAttribute_DefaultValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AnnotationsFactory getAnnotationsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.AnnotableImpl <em>Annotable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.AnnotableImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotable()
     * @generated
     */
    EClass ANNOTABLE = eINSTANCE.getAnnotable();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTABLE__ANNOTATIONS = eINSTANCE.getAnnotable_Annotations();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.AnnotationInstanceImpl <em>Annotation Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.AnnotationInstanceImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationInstance()
     * @generated
     */
    EClass ANNOTATION_INSTANCE = eINSTANCE.getAnnotationInstance();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_INSTANCE__ANNOTATION = eINSTANCE.getAnnotationInstance_Annotation();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_INSTANCE__PARAMETER = eINSTANCE.getAnnotationInstance_Parameter();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.AnnotationParameterImpl <em>Annotation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.AnnotationParameterImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationParameter()
     * @generated
     */
    EClass ANNOTATION_PARAMETER = eINSTANCE.getAnnotationParameter();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.SingleAnnotationParameterImpl <em>Single Annotation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.SingleAnnotationParameterImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getSingleAnnotationParameter()
     * @generated
     */
    EClass SINGLE_ANNOTATION_PARAMETER = eINSTANCE.getSingleAnnotationParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_ANNOTATION_PARAMETER__VALUE = eINSTANCE.getSingleAnnotationParameter_Value();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.AnnotationParameterListImpl <em>Annotation Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.AnnotationParameterListImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationParameterList()
     * @generated
     */
    EClass ANNOTATION_PARAMETER_LIST = eINSTANCE.getAnnotationParameterList();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_PARAMETER_LIST__SETTINGS = eINSTANCE.getAnnotationParameterList_Settings();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.AnnotationAttributeSettingImpl <em>Annotation Attribute Setting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.AnnotationAttributeSettingImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationAttributeSetting()
     * @generated
     */
    EClass ANNOTATION_ATTRIBUTE_SETTING = eINSTANCE.getAnnotationAttributeSetting();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE = eINSTANCE.getAnnotationAttributeSetting_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ATTRIBUTE_SETTING__VALUE = eINSTANCE.getAnnotationAttributeSetting_Value();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.AnnotationValueImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationValue()
     * @generated
     */
    EClass ANNOTATION_VALUE = eINSTANCE.getAnnotationValue();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.annotations.impl.AnnotationAttributeImpl <em>Annotation Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.annotations.impl.AnnotationAttributeImpl
     * @see org.emftext.language.java.annotations.impl.AnnotationsPackageImpl#getAnnotationAttribute()
     * @generated
     */
    EClass ANNOTATION_ATTRIBUTE = eINSTANCE.getAnnotationAttribute();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAnnotationAttribute_DefaultValue();

  }

} //AnnotationsPackage
