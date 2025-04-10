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
package org.emftext.language.java.modifiers;

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
 * @see org.emftext.language.java.modifiers.ModifiersFactory
 * @model kind="package"
 * @generated
 */
public interface ModifiersPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "modifiers";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/modifiers";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "modifiers";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModifiersPackage eINSTANCE = org.emftext.language.java.modifiers.impl.ModifiersPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.AnnotationInstanceOrModifierImpl <em>Annotation Instance Or Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.AnnotationInstanceOrModifierImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getAnnotationInstanceOrModifier()
   * @generated
   */
  int ANNOTATION_INSTANCE_OR_MODIFIER = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE_OR_MODIFIER__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Annotation Instance Or Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_INSTANCE_OR_MODIFIER_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.ModifierImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__LAYOUT_INFORMATIONS = ANNOTATION_INSTANCE_OR_MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = ANNOTATION_INSTANCE_OR_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.AnnotableAndModifiableImpl <em>Annotable And Modifiable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.AnnotableAndModifiableImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getAnnotableAndModifiable()
   * @generated
   */
  int ANNOTABLE_AND_MODIFIABLE = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTABLE_AND_MODIFIABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotable And Modifiable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTABLE_AND_MODIFIABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.ModifiableImpl <em>Modifiable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.ModifiableImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getModifiable()
   * @generated
   */
  int MODIFIABLE = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIABLE__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIABLE__MODIFIERS = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Modifiable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIABLE_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.AbstractImpl <em>Abstract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.AbstractImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getAbstract()
   * @generated
   */
  int ABSTRACT = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Abstract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.FinalImpl <em>Final</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.FinalImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getFinal()
   * @generated
   */
  int FINAL = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Final</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.NativeImpl <em>Native</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.NativeImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getNative()
   * @generated
   */
  int NATIVE = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Native</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.ProtectedImpl <em>Protected</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.ProtectedImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getProtected()
   * @generated
   */
  int PROTECTED = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Protected</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTECTED_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.PublicImpl <em>Public</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.PublicImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getPublic()
   * @generated
   */
  int PUBLIC = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Public</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUBLIC_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.PrivateImpl <em>Private</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.PrivateImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getPrivate()
   * @generated
   */
  int PRIVATE = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Private</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIVATE_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.StaticImpl <em>Static</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.StaticImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getStatic()
   * @generated
   */
  int STATIC = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Static</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.StrictfpImpl <em>Strictfp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.StrictfpImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getStrictfp()
   * @generated
   */
  int STRICTFP = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICTFP__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Strictfp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICTFP_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.SynchronizedImpl <em>Synchronized</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.SynchronizedImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getSynchronized()
   * @generated
   */
  int SYNCHRONIZED = 12;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Synchronized</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNCHRONIZED_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.TransientImpl <em>Transient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.TransientImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getTransient()
   * @generated
   */
  int TRANSIENT = 13;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSIENT__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Transient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSIENT_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.emftext.language.java.modifiers.impl.VolatileImpl <em>Volatile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.modifiers.impl.VolatileImpl
   * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getVolatile()
   * @generated
   */
  int VOLATILE = 14;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLATILE__LAYOUT_INFORMATIONS = MODIFIER__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Volatile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLATILE_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see org.emftext.language.java.modifiers.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.AnnotationInstanceOrModifier <em>Annotation Instance Or Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Instance Or Modifier</em>'.
   * @see org.emftext.language.java.modifiers.AnnotationInstanceOrModifier
   * @generated
   */
  EClass getAnnotationInstanceOrModifier();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable <em>Annotable And Modifiable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotable And Modifiable</em>'.
   * @see org.emftext.language.java.modifiers.AnnotableAndModifiable
   * @generated
   */
  EClass getAnnotableAndModifiable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations And Modifiers</em>'.
   * @see org.emftext.language.java.modifiers.AnnotableAndModifiable#getAnnotationsAndModifiers()
   * @see #getAnnotableAndModifiable()
   * @generated
   */
  EReference getAnnotableAndModifiable_AnnotationsAndModifiers();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Modifiable <em>Modifiable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifiable</em>'.
   * @see org.emftext.language.java.modifiers.Modifiable
   * @generated
   */
  EClass getModifiable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.modifiers.Modifiable#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.emftext.language.java.modifiers.Modifiable#getModifiers()
   * @see #getModifiable()
   * @generated
   */
  EReference getModifiable_Modifiers();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Abstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract</em>'.
   * @see org.emftext.language.java.modifiers.Abstract
   * @generated
   */
  EClass getAbstract();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Final <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final</em>'.
   * @see org.emftext.language.java.modifiers.Final
   * @generated
   */
  EClass getFinal();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Native <em>Native</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native</em>'.
   * @see org.emftext.language.java.modifiers.Native
   * @generated
   */
  EClass getNative();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Protected <em>Protected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protected</em>'.
   * @see org.emftext.language.java.modifiers.Protected
   * @generated
   */
  EClass getProtected();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Public <em>Public</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Public</em>'.
   * @see org.emftext.language.java.modifiers.Public
   * @generated
   */
  EClass getPublic();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Private <em>Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Private</em>'.
   * @see org.emftext.language.java.modifiers.Private
   * @generated
   */
  EClass getPrivate();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Static <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static</em>'.
   * @see org.emftext.language.java.modifiers.Static
   * @generated
   */
  EClass getStatic();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Strictfp <em>Strictfp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strictfp</em>'.
   * @see org.emftext.language.java.modifiers.Strictfp
   * @generated
   */
  EClass getStrictfp();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Synchronized <em>Synchronized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synchronized</em>'.
   * @see org.emftext.language.java.modifiers.Synchronized
   * @generated
   */
  EClass getSynchronized();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Transient <em>Transient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transient</em>'.
   * @see org.emftext.language.java.modifiers.Transient
   * @generated
   */
  EClass getTransient();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.modifiers.Volatile <em>Volatile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Volatile</em>'.
   * @see org.emftext.language.java.modifiers.Volatile
   * @generated
   */
  EClass getVolatile();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModifiersFactory getModifiersFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.ModifierImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.AnnotationInstanceOrModifierImpl <em>Annotation Instance Or Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.AnnotationInstanceOrModifierImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getAnnotationInstanceOrModifier()
     * @generated
     */
    EClass ANNOTATION_INSTANCE_OR_MODIFIER = eINSTANCE.getAnnotationInstanceOrModifier();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.AnnotableAndModifiableImpl <em>Annotable And Modifiable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.AnnotableAndModifiableImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getAnnotableAndModifiable()
     * @generated
     */
    EClass ANNOTABLE_AND_MODIFIABLE = eINSTANCE.getAnnotableAndModifiable();

    /**
     * The meta object literal for the '<em><b>Annotations And Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTABLE_AND_MODIFIABLE__ANNOTATIONS_AND_MODIFIERS = eINSTANCE.getAnnotableAndModifiable_AnnotationsAndModifiers();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.ModifiableImpl <em>Modifiable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.ModifiableImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getModifiable()
     * @generated
     */
    EClass MODIFIABLE = eINSTANCE.getModifiable();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFIABLE__MODIFIERS = eINSTANCE.getModifiable_Modifiers();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.AbstractImpl <em>Abstract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.AbstractImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getAbstract()
     * @generated
     */
    EClass ABSTRACT = eINSTANCE.getAbstract();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.FinalImpl <em>Final</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.FinalImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getFinal()
     * @generated
     */
    EClass FINAL = eINSTANCE.getFinal();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.NativeImpl <em>Native</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.NativeImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getNative()
     * @generated
     */
    EClass NATIVE = eINSTANCE.getNative();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.ProtectedImpl <em>Protected</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.ProtectedImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getProtected()
     * @generated
     */
    EClass PROTECTED = eINSTANCE.getProtected();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.PublicImpl <em>Public</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.PublicImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getPublic()
     * @generated
     */
    EClass PUBLIC = eINSTANCE.getPublic();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.PrivateImpl <em>Private</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.PrivateImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getPrivate()
     * @generated
     */
    EClass PRIVATE = eINSTANCE.getPrivate();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.StaticImpl <em>Static</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.StaticImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getStatic()
     * @generated
     */
    EClass STATIC = eINSTANCE.getStatic();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.StrictfpImpl <em>Strictfp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.StrictfpImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getStrictfp()
     * @generated
     */
    EClass STRICTFP = eINSTANCE.getStrictfp();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.SynchronizedImpl <em>Synchronized</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.SynchronizedImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getSynchronized()
     * @generated
     */
    EClass SYNCHRONIZED = eINSTANCE.getSynchronized();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.TransientImpl <em>Transient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.TransientImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getTransient()
     * @generated
     */
    EClass TRANSIENT = eINSTANCE.getTransient();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.modifiers.impl.VolatileImpl <em>Volatile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.modifiers.impl.VolatileImpl
     * @see org.emftext.language.java.modifiers.impl.ModifiersPackageImpl#getVolatile()
     * @generated
     */
    EClass VOLATILE = eINSTANCE.getVolatile();

  }

} //ModifiersPackage
