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

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.members.InterfaceMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Attribute Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.annotations.AnnotationAttributeSetting#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.emftext.language.java.annotations.AnnotationAttributeSetting#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationAttributeSetting()
 * @model
 * @generated
 */
public interface AnnotationAttributeSetting extends Commentable
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(InterfaceMethod)
   * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationAttributeSetting_Attribute()
   * @model required="true"
   * @generated
   */
  InterfaceMethod getAttribute();

  /**
   * Sets the value of the '{@link org.emftext.language.java.annotations.AnnotationAttributeSetting#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(InterfaceMethod value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AnnotationValue)
   * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationAttributeSetting_Value()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  AnnotationValue getValue();

  /**
   * Sets the value of the '{@link org.emftext.language.java.annotations.AnnotationAttributeSetting#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AnnotationValue value);

} // AnnotationAttributeSetting
