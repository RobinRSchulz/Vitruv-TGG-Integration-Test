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

import org.emftext.language.java.literals.Self;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.instantiations.InstantiationsPackage#getExplicitConstructorCall()
 * @model
 * @generated
 */
public interface ExplicitConstructorCall extends Instantiation
{
  /**
   * Returns the value of the '<em><b>Call Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Target</em>' containment reference.
   * @see #setCallTarget(Self)
   * @see org.emftext.language.java.instantiations.InstantiationsPackage#getExplicitConstructorCall_CallTarget()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  Self getCallTarget();

  /**
   * Sets the value of the '{@link org.emftext.language.java.instantiations.ExplicitConstructorCall#getCallTarget <em>Call Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Target</em>' containment reference.
   * @see #getCallTarget()
   * @generated
   */
  void setCallTarget(Self value);

} // ExplicitConstructorCall
