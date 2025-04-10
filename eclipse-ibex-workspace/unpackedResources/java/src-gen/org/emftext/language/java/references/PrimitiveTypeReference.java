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

import org.emftext.language.java.types.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.references.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.references.ReferencesPackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends Reference
{
  /**
   * Returns the value of the '<em><b>Primitive Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Type</em>' containment reference.
   * @see #setPrimitiveType(PrimitiveType)
   * @see org.emftext.language.java.references.ReferencesPackage#getPrimitiveTypeReference_PrimitiveType()
   * @model containment="true" resolveProxies="true" required="true"
   * @generated
   */
  PrimitiveType getPrimitiveType();

  /**
   * Sets the value of the '{@link org.emftext.language.java.references.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Type</em>' containment reference.
   * @see #getPrimitiveType()
   * @generated
   */
  void setPrimitiveType(PrimitiveType value);

} // PrimitiveTypeReference
