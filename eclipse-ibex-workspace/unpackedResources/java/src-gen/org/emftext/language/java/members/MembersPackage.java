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
package org.emftext.language.java.members;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

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
 * @see org.emftext.language.java.members.MembersFactory
 * @model kind="package"
 * @generated
 */
public interface MembersPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "members";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/members";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "members";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MembersPackage eINSTANCE = org.emftext.language.java.members.impl.MembersPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.ExceptionThrowerImpl <em>Exception Thrower</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.ExceptionThrowerImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getExceptionThrower()
   * @generated
   */
  int EXCEPTION_THROWER = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_THROWER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_THROWER__EXCEPTIONS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exception Thrower</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_THROWER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.MemberImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__LAYOUT_INFORMATIONS = CommonsPackage.NAMED_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.MemberContainerImpl <em>Member Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.MemberContainerImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getMemberContainer()
   * @generated
   */
  int MEMBER_CONTAINER = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CONTAINER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CONTAINER__MEMBERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CONTAINER__DEFAULT_MEMBERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Member Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CONTAINER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.AdditionalFieldImpl <em>Additional Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.AdditionalFieldImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getAdditionalField()
   * @generated
   */
  int ADDITIONAL_FIELD = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FIELD__LAYOUT_INFORMATIONS = ReferencesPackage.REFERENCEABLE_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FIELD__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FIELD__ARRAY_DIMENSIONS_BEFORE = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FIELD__ARRAY_DIMENSIONS_AFTER = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FIELD__INITIAL_VALUE = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Additional Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FIELD_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.ConstructorImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__LAYOUT_INFORMATIONS = MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__STATEMENTS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMETERS = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__EXCEPTIONS = MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS = MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.EmptyMemberImpl <em>Empty Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.EmptyMemberImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getEmptyMember()
   * @generated
   */
  int EMPTY_MEMBER = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MEMBER__LAYOUT_INFORMATIONS = MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MEMBER__NAME = MEMBER__NAME;

  /**
   * The number of structural features of the '<em>Empty Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_MEMBER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.FieldImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getField()
   * @generated
   */
  int FIELD = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LAYOUT_INFORMATIONS = MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__INITIAL_VALUE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE_REFERENCE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ARRAY_DIMENSIONS_BEFORE = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ARRAY_DIMENSIONS_AFTER = MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE_ARGUMENTS = MEMBER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATIONS_AND_MODIFIERS = MEMBER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Additional Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ADDITIONAL_FIELDS = MEMBER_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.MethodImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__LAYOUT_INFORMATIONS = MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE_REFERENCE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ARRAY_DIMENSIONS_BEFORE = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ARRAY_DIMENSIONS_AFTER = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE_PARAMETERS = MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__EXCEPTIONS = MEMBER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ANNOTATIONS_AND_MODIFIERS = MEMBER_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.InterfaceMethodImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getInterfaceMethod()
   * @generated
   */
  int INTERFACE_METHOD = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__LAYOUT_INFORMATIONS = METHOD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__NAME = METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__TYPE_REFERENCE = METHOD__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__ARRAY_DIMENSIONS_BEFORE = METHOD__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__ARRAY_DIMENSIONS_AFTER = METHOD__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__TYPE_PARAMETERS = METHOD__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__PARAMETERS = METHOD__PARAMETERS;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__EXCEPTIONS = METHOD__EXCEPTIONS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD__ANNOTATIONS_AND_MODIFIERS = METHOD__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The number of structural features of the '<em>Interface Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.ClassMethodImpl <em>Class Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.ClassMethodImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getClassMethod()
   * @generated
   */
  int CLASS_METHOD = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__LAYOUT_INFORMATIONS = METHOD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__NAME = METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__TYPE_REFERENCE = METHOD__TYPE_REFERENCE;

  /**
   * The feature id for the '<em><b>Array Dimensions Before</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__ARRAY_DIMENSIONS_BEFORE = METHOD__ARRAY_DIMENSIONS_BEFORE;

  /**
   * The feature id for the '<em><b>Array Dimensions After</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__ARRAY_DIMENSIONS_AFTER = METHOD__ARRAY_DIMENSIONS_AFTER;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__TYPE_PARAMETERS = METHOD__TYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__PARAMETERS = METHOD__PARAMETERS;

  /**
   * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__EXCEPTIONS = METHOD__EXCEPTIONS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__ANNOTATIONS_AND_MODIFIERS = METHOD__ANNOTATIONS_AND_MODIFIERS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD__STATEMENTS = METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.members.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.members.impl.EnumConstantImpl
   * @see org.emftext.language.java.members.impl.MembersPackageImpl#getEnumConstant()
   * @generated
   */
  int ENUM_CONSTANT = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTANT__LAYOUT_INFORMATIONS = ReferencesPackage.REFERENCEABLE_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTANT__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTANT__ARGUMENTS = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTANT__ANNOTATIONS = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Anonymous Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTANT__ANONYMOUS_CLASS = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONSTANT_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.ExceptionThrower <em>Exception Thrower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Thrower</em>'.
   * @see org.emftext.language.java.members.ExceptionThrower
   * @generated
   */
  EClass getExceptionThrower();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.members.ExceptionThrower#getExceptions <em>Exceptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exceptions</em>'.
   * @see org.emftext.language.java.members.ExceptionThrower#getExceptions()
   * @see #getExceptionThrower()
   * @generated
   */
  EReference getExceptionThrower_Exceptions();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see org.emftext.language.java.members.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.MemberContainer <em>Member Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Container</em>'.
   * @see org.emftext.language.java.members.MemberContainer
   * @generated
   */
  EClass getMemberContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.members.MemberContainer#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.emftext.language.java.members.MemberContainer#getMembers()
   * @see #getMemberContainer()
   * @generated
   */
  EReference getMemberContainer_Members();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.members.MemberContainer#getDefaultMembers <em>Default Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Default Members</em>'.
   * @see org.emftext.language.java.members.MemberContainer#getDefaultMembers()
   * @see #getMemberContainer()
   * @generated
   */
  EReference getMemberContainer_DefaultMembers();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.AdditionalField <em>Additional Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additional Field</em>'.
   * @see org.emftext.language.java.members.AdditionalField
   * @generated
   */
  EClass getAdditionalField();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see org.emftext.language.java.members.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.EmptyMember <em>Empty Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Member</em>'.
   * @see org.emftext.language.java.members.EmptyMember
   * @generated
   */
  EClass getEmptyMember();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.emftext.language.java.members.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.members.Field#getAdditionalFields <em>Additional Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional Fields</em>'.
   * @see org.emftext.language.java.members.Field#getAdditionalFields()
   * @see #getField()
   * @generated
   */
  EReference getField_AdditionalFields();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.emftext.language.java.members.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.InterfaceMethod <em>Interface Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Method</em>'.
   * @see org.emftext.language.java.members.InterfaceMethod
   * @generated
   */
  EClass getInterfaceMethod();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.ClassMethod <em>Class Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Method</em>'.
   * @see org.emftext.language.java.members.ClassMethod
   * @generated
   */
  EClass getClassMethod();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.members.EnumConstant <em>Enum Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Constant</em>'.
   * @see org.emftext.language.java.members.EnumConstant
   * @generated
   */
  EClass getEnumConstant();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.members.EnumConstant#getAnonymousClass <em>Anonymous Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Class</em>'.
   * @see org.emftext.language.java.members.EnumConstant#getAnonymousClass()
   * @see #getEnumConstant()
   * @generated
   */
  EReference getEnumConstant_AnonymousClass();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MembersFactory getMembersFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.ExceptionThrowerImpl <em>Exception Thrower</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.ExceptionThrowerImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getExceptionThrower()
     * @generated
     */
    EClass EXCEPTION_THROWER = eINSTANCE.getExceptionThrower();

    /**
     * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_THROWER__EXCEPTIONS = eINSTANCE.getExceptionThrower_Exceptions();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.MemberImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.MemberContainerImpl <em>Member Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.MemberContainerImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getMemberContainer()
     * @generated
     */
    EClass MEMBER_CONTAINER = eINSTANCE.getMemberContainer();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_CONTAINER__MEMBERS = eINSTANCE.getMemberContainer_Members();

    /**
     * The meta object literal for the '<em><b>Default Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_CONTAINER__DEFAULT_MEMBERS = eINSTANCE.getMemberContainer_DefaultMembers();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.AdditionalFieldImpl <em>Additional Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.AdditionalFieldImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getAdditionalField()
     * @generated
     */
    EClass ADDITIONAL_FIELD = eINSTANCE.getAdditionalField();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.ConstructorImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.EmptyMemberImpl <em>Empty Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.EmptyMemberImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getEmptyMember()
     * @generated
     */
    EClass EMPTY_MEMBER = eINSTANCE.getEmptyMember();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.FieldImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Additional Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ADDITIONAL_FIELDS = eINSTANCE.getField_AdditionalFields();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.MethodImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.InterfaceMethodImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getInterfaceMethod()
     * @generated
     */
    EClass INTERFACE_METHOD = eINSTANCE.getInterfaceMethod();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.ClassMethodImpl <em>Class Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.ClassMethodImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getClassMethod()
     * @generated
     */
    EClass CLASS_METHOD = eINSTANCE.getClassMethod();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.members.impl.EnumConstantImpl <em>Enum Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.members.impl.EnumConstantImpl
     * @see org.emftext.language.java.members.impl.MembersPackageImpl#getEnumConstant()
     * @generated
     */
    EClass ENUM_CONSTANT = eINSTANCE.getEnumConstant();

    /**
     * The meta object literal for the '<em><b>Anonymous Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_CONSTANT__ANONYMOUS_CLASS = eINSTANCE.getEnumConstant_AnonymousClass();

  }

} //MembersPackage
