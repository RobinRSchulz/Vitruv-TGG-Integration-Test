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
package org.emftext.language.java.statements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.statements.TryBlock#getCatcheBlocks <em>Catche Blocks</em>}</li>
 *   <li>{@link org.emftext.language.java.statements.TryBlock#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.statements.StatementsPackage#getTryBlock()
 * @model
 * @generated
 */
public interface TryBlock extends Statement, StatementListContainer
{
  /**
   * Returns the value of the '<em><b>Catche Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.statements.CatchBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catche Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catche Blocks</em>' containment reference list.
   * @see org.emftext.language.java.statements.StatementsPackage#getTryBlock_CatcheBlocks()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<CatchBlock> getCatcheBlocks();

  /**
   * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally Block</em>' containment reference.
   * @see #setFinallyBlock(Block)
   * @see org.emftext.language.java.statements.StatementsPackage#getTryBlock_FinallyBlock()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  Block getFinallyBlock();

  /**
   * Sets the value of the '{@link org.emftext.language.java.statements.TryBlock#getFinallyBlock <em>Finally Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally Block</em>' containment reference.
   * @see #getFinallyBlock()
   * @generated
   */
  void setFinallyBlock(Block value);

} // TryBlock
