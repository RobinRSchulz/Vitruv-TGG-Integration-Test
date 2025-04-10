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

import org.emftext.language.java.annotations.Annotable;

import org.emftext.language.java.classifiers.AnonymousClass;

import org.emftext.language.java.references.Argumentable;
import org.emftext.language.java.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.members.EnumConstant#getAnonymousClass <em>Anonymous Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.members.MembersPackage#getEnumConstant()
 * @model
 * @generated
 */
public interface EnumConstant extends ReferenceableElement, Argumentable, Annotable
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
   * @see org.emftext.language.java.members.MembersPackage#getEnumConstant_AnonymousClass()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  AnonymousClass getAnonymousClass();

  /**
   * Sets the value of the '{@link org.emftext.language.java.members.EnumConstant#getAnonymousClass <em>Anonymous Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Class</em>' containment reference.
   * @see #getAnonymousClass()
   * @generated
   */
  void setAnonymousClass(AnonymousClass value);

} // EnumConstant
