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
package org.emftext.language.java.imports;

import org.emftext.language.java.modifiers.Static;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.imports.StaticImport#getStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.imports.ImportsPackage#getStaticImport()
 * @model abstract="true"
 * @generated
 */
public interface StaticImport extends Import
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' containment reference.
   * @see #setStatic(Static)
   * @see org.emftext.language.java.imports.ImportsPackage#getStaticImport_Static()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  Static getStatic();

  /**
   * Sets the value of the '{@link org.emftext.language.java.imports.StaticImport#getStatic <em>Static</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' containment reference.
   * @see #getStatic()
   * @generated
   */
  void setStatic(Static value);

} // StaticImport
