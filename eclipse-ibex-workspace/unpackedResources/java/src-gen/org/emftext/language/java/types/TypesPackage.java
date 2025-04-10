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
package org.emftext.language.java.types;

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
 * @see org.emftext.language.java.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "types";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/types";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "types";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TypesPackage eINSTANCE = org.emftext.language.java.types.impl.TypesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.TypeImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getType()
   * @generated
   */
  int TYPE = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.TypedElementImpl <em>Typed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.TypedElementImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getTypedElement()
   * @generated
   */
  int TYPED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__TYPE_REFERENCE = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.TypeReferenceImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.ClassifierReferenceImpl <em>Classifier Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.ClassifierReferenceImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getClassifierReference()
   * @generated
   */
  int CLASSIFIER_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_REFERENCE__LAYOUT_INFORMATIONS = TYPE_REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_REFERENCE__TYPE_ARGUMENTS = TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_REFERENCE__TARGET = TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Classifier Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.NamespaceClassifierReferenceImpl <em>Namespace Classifier Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.NamespaceClassifierReferenceImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getNamespaceClassifierReference()
   * @generated
   */
  int NAMESPACE_CLASSIFIER_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_CLASSIFIER_REFERENCE__LAYOUT_INFORMATIONS = TYPE_REFERENCE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES = TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Classifier References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES = TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Namespace Classifier Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_CLASSIFIER_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.PrimitiveTypeImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__LAYOUT_INFORMATIONS = TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.BooleanImpl <em>Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.BooleanImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.ByteImpl <em>Byte</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.ByteImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getByte()
   * @generated
   */
  int BYTE = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTE__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Byte</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.CharImpl <em>Char</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.CharImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getChar()
   * @generated
   */
  int CHAR = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Char</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.DoubleImpl <em>Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.DoubleImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getDouble()
   * @generated
   */
  int DOUBLE = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.FloatImpl <em>Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.FloatImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getFloat()
   * @generated
   */
  int FLOAT = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.IntImpl <em>Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.IntImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getInt()
   * @generated
   */
  int INT = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.LongImpl <em>Long</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.LongImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getLong()
   * @generated
   */
  int LONG = 12;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Long</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.ShortImpl <em>Short</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.ShortImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getShort()
   * @generated
   */
  int SHORT = 13;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Short</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.types.impl.VoidImpl <em>Void</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.types.impl.VoidImpl
   * @see org.emftext.language.java.types.impl.TypesPackageImpl#getVoid()
   * @generated
   */
  int VOID = 14;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID__LAYOUT_INFORMATIONS = PRIMITIVE_TYPE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Void</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.emftext.language.java.types.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Element</em>'.
   * @see org.emftext.language.java.types.TypedElement
   * @generated
   */
  EClass getTypedElement();

  /**
   * Returns the meta object for the containment reference '{@link org.emftext.language.java.types.TypedElement#getTypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Reference</em>'.
   * @see org.emftext.language.java.types.TypedElement#getTypeReference()
   * @see #getTypedElement()
   * @generated
   */
  EReference getTypedElement_TypeReference();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see org.emftext.language.java.types.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.ClassifierReference <em>Classifier Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Reference</em>'.
   * @see org.emftext.language.java.types.ClassifierReference
   * @generated
   */
  EClass getClassifierReference();

  /**
   * Returns the meta object for the reference '{@link org.emftext.language.java.types.ClassifierReference#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.emftext.language.java.types.ClassifierReference#getTarget()
   * @see #getClassifierReference()
   * @generated
   */
  EReference getClassifierReference_Target();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.NamespaceClassifierReference <em>Namespace Classifier Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Classifier Reference</em>'.
   * @see org.emftext.language.java.types.NamespaceClassifierReference
   * @generated
   */
  EClass getNamespaceClassifierReference();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.types.NamespaceClassifierReference#getClassifierReferences <em>Classifier References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classifier References</em>'.
   * @see org.emftext.language.java.types.NamespaceClassifierReference#getClassifierReferences()
   * @see #getNamespaceClassifierReference()
   * @generated
   */
  EReference getNamespaceClassifierReference_ClassifierReferences();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see org.emftext.language.java.types.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean</em>'.
   * @see org.emftext.language.java.types.Boolean
   * @generated
   */
  EClass getBoolean();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Byte <em>Byte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Byte</em>'.
   * @see org.emftext.language.java.types.Byte
   * @generated
   */
  EClass getByte();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Char <em>Char</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char</em>'.
   * @see org.emftext.language.java.types.Char
   * @generated
   */
  EClass getChar();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Double <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double</em>'.
   * @see org.emftext.language.java.types.Double
   * @generated
   */
  EClass getDouble();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Float <em>Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float</em>'.
   * @see org.emftext.language.java.types.Float
   * @generated
   */
  EClass getFloat();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Int <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int</em>'.
   * @see org.emftext.language.java.types.Int
   * @generated
   */
  EClass getInt();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Long <em>Long</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long</em>'.
   * @see org.emftext.language.java.types.Long
   * @generated
   */
  EClass getLong();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Short <em>Short</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short</em>'.
   * @see org.emftext.language.java.types.Short
   * @generated
   */
  EClass getShort();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.types.Void <em>Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void</em>'.
   * @see org.emftext.language.java.types.Void
   * @generated
   */
  EClass getVoid();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TypesFactory getTypesFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.TypeImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.TypedElementImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getTypedElement()
     * @generated
     */
    EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

    /**
     * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_ELEMENT__TYPE_REFERENCE = eINSTANCE.getTypedElement_TypeReference();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.TypeReferenceImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.ClassifierReferenceImpl <em>Classifier Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.ClassifierReferenceImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getClassifierReference()
     * @generated
     */
    EClass CLASSIFIER_REFERENCE = eINSTANCE.getClassifierReference();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER_REFERENCE__TARGET = eINSTANCE.getClassifierReference_Target();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.NamespaceClassifierReferenceImpl <em>Namespace Classifier Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.NamespaceClassifierReferenceImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getNamespaceClassifierReference()
     * @generated
     */
    EClass NAMESPACE_CLASSIFIER_REFERENCE = eINSTANCE.getNamespaceClassifierReference();

    /**
     * The meta object literal for the '<em><b>Classifier References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES = eINSTANCE.getNamespaceClassifierReference_ClassifierReferences();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.PrimitiveTypeImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.BooleanImpl <em>Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.BooleanImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getBoolean()
     * @generated
     */
    EClass BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.ByteImpl <em>Byte</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.ByteImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getByte()
     * @generated
     */
    EClass BYTE = eINSTANCE.getByte();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.CharImpl <em>Char</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.CharImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getChar()
     * @generated
     */
    EClass CHAR = eINSTANCE.getChar();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.DoubleImpl <em>Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.DoubleImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getDouble()
     * @generated
     */
    EClass DOUBLE = eINSTANCE.getDouble();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.FloatImpl <em>Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.FloatImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getFloat()
     * @generated
     */
    EClass FLOAT = eINSTANCE.getFloat();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.IntImpl <em>Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.IntImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getInt()
     * @generated
     */
    EClass INT = eINSTANCE.getInt();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.LongImpl <em>Long</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.LongImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getLong()
     * @generated
     */
    EClass LONG = eINSTANCE.getLong();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.ShortImpl <em>Short</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.ShortImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getShort()
     * @generated
     */
    EClass SHORT = eINSTANCE.getShort();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.types.impl.VoidImpl <em>Void</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.types.impl.VoidImpl
     * @see org.emftext.language.java.types.impl.TypesPackageImpl#getVoid()
     * @generated
     */
    EClass VOID = eINSTANCE.getVoid();

  }

} //TypesPackage
