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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.annotations.AnnotationParameterList#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationParameterList()
 * @model
 * @generated
 */
public interface AnnotationParameterList extends AnnotationParameter
{
  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.annotations.AnnotationAttributeSetting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference list.
   * @see org.emftext.language.java.annotations.AnnotationsPackage#getAnnotationParameterList_Settings()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<AnnotationAttributeSetting> getSettings();

} // AnnotationParameterList
