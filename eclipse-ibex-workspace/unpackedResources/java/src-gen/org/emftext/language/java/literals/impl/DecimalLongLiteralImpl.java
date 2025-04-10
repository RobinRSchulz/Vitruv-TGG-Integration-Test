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
package org.emftext.language.java.literals.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.java.literals.DecimalLongLiteral;
import org.emftext.language.java.literals.LiteralsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Long Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.literals.impl.DecimalLongLiteralImpl#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalLongLiteralImpl extends LongLiteralImpl implements DecimalLongLiteral
{
  /**
   * The default value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalValue()
   * @generated
   * @ordered
   */
  protected static final BigInteger DECIMAL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalValue()
   * @generated
   * @ordered
   */
  protected BigInteger decimalValue = DECIMAL_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecimalLongLiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LiteralsPackage.Literals.DECIMAL_LONG_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getDecimalValue()
  {
    return decimalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimalValue(BigInteger newDecimalValue)
  {
    BigInteger oldDecimalValue = decimalValue;
    decimalValue = newDecimalValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LiteralsPackage.DECIMAL_LONG_LITERAL__DECIMAL_VALUE, oldDecimalValue, decimalValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LiteralsPackage.DECIMAL_LONG_LITERAL__DECIMAL_VALUE:
        return getDecimalValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LiteralsPackage.DECIMAL_LONG_LITERAL__DECIMAL_VALUE:
        setDecimalValue((BigInteger)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LiteralsPackage.DECIMAL_LONG_LITERAL__DECIMAL_VALUE:
        setDecimalValue(DECIMAL_VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LiteralsPackage.DECIMAL_LONG_LITERAL__DECIMAL_VALUE:
        return DECIMAL_VALUE_EDEFAULT == null ? decimalValue != null : !DECIMAL_VALUE_EDEFAULT.equals(decimalValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (decimalValue: ");
    result.append(decimalValue);
    result.append(')');
    return result.toString();
  }

} //DecimalLongLiteralImpl
