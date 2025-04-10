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
package org.emftext.language.java.commons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.emftext.language.java.commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "commons";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/java/commons";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "commons";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommonsPackage eINSTANCE = org.emftext.language.java.commons.impl.CommonsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.emftext.language.java.commons.impl.CommentableImpl <em>Commentable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.commons.impl.CommentableImpl
   * @see org.emftext.language.java.commons.impl.CommonsPackageImpl#getCommentable()
   * @generated
   */
  int COMMENTABLE = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENTABLE__LAYOUT_INFORMATIONS = 0;

  /**
   * The number of structural features of the '<em>Commentable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENTABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.commons.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.commons.impl.NamedElementImpl
   * @see org.emftext.language.java.commons.impl.CommonsPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__LAYOUT_INFORMATIONS = COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.emftext.language.java.commons.impl.NamespaceAwareElementImpl <em>Namespace Aware Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.emftext.language.java.commons.impl.NamespaceAwareElementImpl
   * @see org.emftext.language.java.commons.impl.CommonsPackageImpl#getNamespaceAwareElement()
   * @generated
   */
  int NAMESPACE_AWARE_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_AWARE_ELEMENT__LAYOUT_INFORMATIONS = COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_AWARE_ELEMENT__NAMESPACES = COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Namespace Aware Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_AWARE_ELEMENT_FEATURE_COUNT = COMMENTABLE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.emftext.language.java.commons.Commentable <em>Commentable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commentable</em>'.
   * @see org.emftext.language.java.commons.Commentable
   * @generated
   */
  EClass getCommentable();

  /**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.java.commons.Commentable#getLayoutInformations <em>Layout Informations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layout Informations</em>'.
   * @see org.emftext.language.java.commons.Commentable#getLayoutInformations()
   * @see #getCommentable()
   * @generated
   */
  EReference getCommentable_LayoutInformations();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.commons.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.emftext.language.java.commons.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.emftext.language.java.commons.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.emftext.language.java.commons.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.emftext.language.java.commons.NamespaceAwareElement <em>Namespace Aware Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Aware Element</em>'.
   * @see org.emftext.language.java.commons.NamespaceAwareElement
   * @generated
   */
  EClass getNamespaceAwareElement();

  /**
   * Returns the meta object for the attribute list '{@link org.emftext.language.java.commons.NamespaceAwareElement#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Namespaces</em>'.
   * @see org.emftext.language.java.commons.NamespaceAwareElement#getNamespaces()
   * @see #getNamespaceAwareElement()
   * @generated
   */
  EAttribute getNamespaceAwareElement_Namespaces();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CommonsFactory getCommonsFactory();

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
     * The meta object literal for the '{@link org.emftext.language.java.commons.impl.CommentableImpl <em>Commentable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.commons.impl.CommentableImpl
     * @see org.emftext.language.java.commons.impl.CommonsPackageImpl#getCommentable()
     * @generated
     */
    EClass COMMENTABLE = eINSTANCE.getCommentable();

    /**
     * The meta object literal for the '<em><b>Layout Informations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMENTABLE__LAYOUT_INFORMATIONS = eINSTANCE.getCommentable_LayoutInformations();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.commons.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.commons.impl.NamedElementImpl
     * @see org.emftext.language.java.commons.impl.CommonsPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.emftext.language.java.commons.impl.NamespaceAwareElementImpl <em>Namespace Aware Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.emftext.language.java.commons.impl.NamespaceAwareElementImpl
     * @see org.emftext.language.java.commons.impl.CommonsPackageImpl#getNamespaceAwareElement()
     * @generated
     */
    EClass NAMESPACE_AWARE_ELEMENT = eINSTANCE.getNamespaceAwareElement();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_AWARE_ELEMENT__NAMESPACES = eINSTANCE.getNamespaceAwareElement_Namespaces();

  }

} //CommonsPackage
