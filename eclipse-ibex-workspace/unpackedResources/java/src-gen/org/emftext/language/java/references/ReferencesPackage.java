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
package org.emftext.language.java.references;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.emftext.language.java.references.ReferencesFactory
 * @model kind="package"
 * @generated
 */
public interface ReferencesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "references";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/references";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "references";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReferencesPackage eINSTANCE = org.emftext.language.java.references.impl.ReferencesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.ReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__LAYOUT_INFORMATIONS = ExpressionsPackage.PRIMARY_EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE_ARGUMENTS = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NEXT = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ARRAY_SELECTORS = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = ExpressionsPackage.PRIMARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.ArgumentableImpl <em>Argumentable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.ArgumentableImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getArgumentable()
   * @generated
   */
  int ARGUMENTABLE = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTABLE__ARGUMENTS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Argumentable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.ReferenceableElementImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getReferenceableElement()
   * @generated
   */
  int REFERENCEABLE_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_ELEMENT__LAYOUT_INFORMATIONS = CommonsPackage.NAMED_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_ELEMENT__NAME = CommonsPackage.NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Referenceable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_ELEMENT_FEATURE_COUNT = CommonsPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.ElementReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getElementReference()
   * @generated
   */
  int ELEMENT_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__LAYOUT_INFORMATIONS = REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__NEXT = REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__TARGET = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.IdentifierReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getIdentifierReference()
   * @generated
   */
  int IDENTIFIER_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REFERENCE__LAYOUT_INFORMATIONS = ELEMENT_REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REFERENCE__TYPE_ARGUMENTS = ELEMENT_REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REFERENCE__NEXT = ELEMENT_REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REFERENCE__ARRAY_SELECTORS = ELEMENT_REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REFERENCE__TARGET = ELEMENT_REFERENCE__TARGET;

  /**
   * The number of structural features of the '<em>Identifier Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_REFERENCE_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.MethodCallImpl <em>Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.MethodCallImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getMethodCall()
   * @generated
   */
  int METHOD_CALL = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__LAYOUT_INFORMATIONS = ELEMENT_REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__TYPE_ARGUMENTS = ELEMENT_REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__NEXT = ELEMENT_REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__ARRAY_SELECTORS = ELEMENT_REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__TARGET = ELEMENT_REFERENCE__TARGET;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__ARGUMENTS = ELEMENT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Call Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__CALL_TYPE_ARGUMENTS = ELEMENT_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_FEATURE_COUNT = ELEMENT_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.ReflectiveClassReferenceImpl <em>Reflective Class Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.ReflectiveClassReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getReflectiveClassReference()
   * @generated
   */
  int REFLECTIVE_CLASS_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTIVE_CLASS_REFERENCE__LAYOUT_INFORMATIONS = REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTIVE_CLASS_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTIVE_CLASS_REFERENCE__NEXT = REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTIVE_CLASS_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

  /**
   * The number of structural features of the '<em>Reflective Class Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECTIVE_CLASS_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.PrimitiveTypeReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getPrimitiveTypeReference()
   * @generated
   */
  int PRIMITIVE_TYPE_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__LAYOUT_INFORMATIONS = REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__NEXT = REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Primitive Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.StringReferenceImpl <em>String Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.StringReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getStringReference()
   * @generated
   */
  int STRING_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REFERENCE__LAYOUT_INFORMATIONS = REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REFERENCE__NEXT = REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REFERENCE__VALUE = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.SelfReferenceImpl <em>Self Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.SelfReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getSelfReference()
   * @generated
   */
  int SELF_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE__LAYOUT_INFORMATIONS = REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE__TYPE_ARGUMENTS = REFERENCE__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE__NEXT = REFERENCE__NEXT;

  /**
   * The feature id for the '<em><b>Array Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE__ARRAY_SELECTORS = REFERENCE__ARRAY_SELECTORS;

  /**
   * The feature id for the '<em><b>Self</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE__SELF = REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Self Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.references.impl.PackageReferenceImpl <em>Package Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.references.impl.PackageReferenceImpl
   * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getPackageReference()
   * @generated
   */
  int PACKAGE_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_REFERENCE__LAYOUT_INFORMATIONS = REFERENCEABLE_ELEMENT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_REFERENCE__NAME = REFERENCEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Subpackages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_REFERENCE__SUBPACKAGES = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_REFERENCE_FEATURE_COUNT = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.emftext.language.java.references.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.references.Reference#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.emftext.language.java.references.Reference#getNext()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Next();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.references.Reference#getArraySelectors <em>Array Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array Selectors</em>'.
   * @see org.emftext.language.java.references.Reference#getArraySelectors()
   * @see #getReference()
   * @generated
   */
  EReference getReference_ArraySelectors();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.Argumentable <em>Argumentable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argumentable</em>'.
   * @see org.emftext.language.java.references.Argumentable
   * @generated
   */
  EClass getArgumentable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.references.Argumentable#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.emftext.language.java.references.Argumentable#getArguments()
   * @see #getArgumentable()
   * @generated
   */
  EReference getArgumentable_Arguments();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.ReferenceableElement <em>Referenceable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenceable Element</em>'.
   * @see org.emftext.language.java.references.ReferenceableElement
   * @generated
   */
  EClass getReferenceableElement();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.ElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Reference</em>'.
   * @see org.emftext.language.java.references.ElementReference
   * @generated
   */
  EClass getElementReference();

  /**
   * Returns the meta object for the reference '{@link org.emftext.language.java.references.ElementReference#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.emftext.language.java.references.ElementReference#getTarget()
   * @see #getElementReference()
   * @generated
   */
  EReference getElementReference_Target();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.IdentifierReference <em>Identifier Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Reference</em>'.
   * @see org.emftext.language.java.references.IdentifierReference
   * @generated
   */
  EClass getIdentifierReference();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call</em>'.
   * @see org.emftext.language.java.references.MethodCall
   * @generated
   */
  EClass getMethodCall();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.ReflectiveClassReference <em>Reflective Class Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflective Class Reference</em>'.
   * @see org.emftext.language.java.references.ReflectiveClassReference
   * @generated
   */
  EClass getReflectiveClassReference();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.PrimitiveTypeReference <em>Primitive Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type Reference</em>'.
   * @see org.emftext.language.java.references.PrimitiveTypeReference
   * @generated
   */
  EClass getPrimitiveTypeReference();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.references.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primitive Type</em>'.
   * @see org.emftext.language.java.references.PrimitiveTypeReference#getPrimitiveType()
   * @see #getPrimitiveTypeReference()
   * @generated
   */
  EReference getPrimitiveTypeReference_PrimitiveType();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.StringReference <em>String Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Reference</em>'.
   * @see org.emftext.language.java.references.StringReference
   * @generated
   */
  EClass getStringReference();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.references.StringReference#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.emftext.language.java.references.StringReference#getValue()
   * @see #getStringReference()
   * @generated
   */
  EAttribute getStringReference_Value();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.SelfReference <em>Self Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Reference</em>'.
   * @see org.emftext.language.java.references.SelfReference
   * @generated
   */
  EClass getSelfReference();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.references.SelfReference#getSelf <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Self</em>'.
   * @see org.emftext.language.java.references.SelfReference#getSelf()
   * @see #getSelfReference()
   * @generated
   */
  EReference getSelfReference_Self();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.references.PackageReference <em>Package Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Reference</em>'.
   * @see org.emftext.language.java.references.PackageReference
   * @generated
   */
  EClass getPackageReference();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.references.PackageReference#getSubpackages <em>Subpackages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subpackages</em>'.
   * @see org.emftext.language.java.references.PackageReference#getSubpackages()
   * @see #getPackageReference()
   * @generated
   */
  EReference getPackageReference_Subpackages();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReferencesFactory getReferencesFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.ReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__NEXT = eINSTANCE.getReference_Next();

    /**
     * The meta object literal for the '<em><b>Array Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ARRAY_SELECTORS = eINSTANCE.getReference_ArraySelectors();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.ArgumentableImpl <em>Argumentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.ArgumentableImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getArgumentable()
     * @generated
     */
    EClass ARGUMENTABLE = eINSTANCE.getArgumentable();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTABLE__ARGUMENTS = eINSTANCE.getArgumentable_Arguments();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.ReferenceableElementImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getReferenceableElement()
     * @generated
     */
    EClass REFERENCEABLE_ELEMENT = eINSTANCE.getReferenceableElement();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.ElementReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getElementReference()
     * @generated
     */
    EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_REFERENCE__TARGET = eINSTANCE.getElementReference_Target();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.IdentifierReferenceImpl <em>Identifier Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.IdentifierReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getIdentifierReference()
     * @generated
     */
    EClass IDENTIFIER_REFERENCE = eINSTANCE.getIdentifierReference();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.MethodCallImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getMethodCall()
     * @generated
     */
    EClass METHOD_CALL = eINSTANCE.getMethodCall();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.ReflectiveClassReferenceImpl <em>Reflective Class Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.ReflectiveClassReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getReflectiveClassReference()
     * @generated
     */
    EClass REFLECTIVE_CLASS_REFERENCE = eINSTANCE.getReflectiveClassReference();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.PrimitiveTypeReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getPrimitiveTypeReference()
     * @generated
     */
    EClass PRIMITIVE_TYPE_REFERENCE = eINSTANCE.getPrimitiveTypeReference();

    /**
     * The meta object literal for the '<em><b>Primitive Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveTypeReference_PrimitiveType();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.StringReferenceImpl <em>String Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.StringReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getStringReference()
     * @generated
     */
    EClass STRING_REFERENCE = eINSTANCE.getStringReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_REFERENCE__VALUE = eINSTANCE.getStringReference_Value();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.SelfReferenceImpl <em>Self Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.SelfReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getSelfReference()
     * @generated
     */
    EClass SELF_REFERENCE = eINSTANCE.getSelfReference();

    /**
     * The meta object literal for the '<em><b>Self</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_REFERENCE__SELF = eINSTANCE.getSelfReference_Self();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.references.impl.PackageReferenceImpl <em>Package Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.references.impl.PackageReferenceImpl
     * @see org.emftext.language.java.references.impl.ReferencesPackageImpl#getPackageReference()
     * @generated
     */
    EClass PACKAGE_REFERENCE = eINSTANCE.getPackageReference();

    /**
     * The meta object literal for the '<em><b>Subpackages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_REFERENCE__SUBPACKAGES = eINSTANCE.getPackageReference_Subpackages();

  }

} //ReferencesPackage
