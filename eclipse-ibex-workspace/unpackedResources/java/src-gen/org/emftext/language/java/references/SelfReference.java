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

import org.emftext.language.java.literals.Self;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.SelfReference#getSelf <em>Self</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.references.ReferencesPackage#getSelfReference()
 * @model
 * @generated
 */
public interface SelfReference extends Reference
{
  /**
   * Returns the value of the '<em><b>Self</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self</em>' containment reference.
   * @see #setSelf(Self)
   * @see org.emftext.language.java.references.ReferencesPackage#getSelfReference_Self()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  Self getSelf();

  /**
   * Sets the value of the '{@link org.emftext.language.java.references.SelfReference#getSelf <em>Self</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Self</em>' containment reference.
   * @see #getSelf()
   * @generated
   */
  void setSelf(Self value);

} // SelfReference
