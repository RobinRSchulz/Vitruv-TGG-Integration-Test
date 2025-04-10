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

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.references.ReferenceableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Member Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.imports.StaticMemberImport#getStaticMembers <em>Static Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.imports.ImportsPackage#getStaticMemberImport()
 * @model
 * @generated
 */
public interface StaticMemberImport extends StaticImport
{
  /**
   * Returns the value of the '<em><b>Static Members</b></em>' reference list.
   * The list contents are of type {@link org.emftext.language.java.references.ReferenceableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Members</em>' reference list.
   * @see org.emftext.language.java.imports.ImportsPackage#getStaticMemberImport_StaticMembers()
   * @model required="true"
   * @generated
   */
  EList<ReferenceableElement> getStaticMembers();

} // StaticMemberImport
