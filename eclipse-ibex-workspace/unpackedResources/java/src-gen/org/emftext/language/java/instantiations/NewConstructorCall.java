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
package org.emftext.language.java.instantiations;

import org.emftext.language.java.classifiers.AnonymousClass;

import org.emftext.language.java.generics.CallTypeArgumentable;

import org.emftext.language.java.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.instantiations.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.instantiations.InstantiationsPackage#getNewConstructorCall()
 * @model
 * @generated
 */
public interface NewConstructorCall extends TypedElement, Instantiation, CallTypeArgumentable
{
  /**
   * Returns the value of the '<em><b>Anonymous Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Class</em>' containment reference.
   * @see #setAnonymousClass(AnonymousClass)
   * @see org.emftext.language.java.instantiations.InstantiationsPackage#getNewConstructorCall_AnonymousClass()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  AnonymousClass getAnonymousClass();

  /**
   * Sets the value of the '{@link org.emftext.language.java.instantiations.NewConstructorCall#getAnonymousClass <em>Anonymous Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Class</em>' containment reference.
   * @see #getAnonymousClass()
   * @generated
   */
  void setAnonymousClass(AnonymousClass value);

} // NewConstructorCall
