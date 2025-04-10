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
package org.emftext.language.java.references.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.java.references.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesFactoryImpl extends EFactoryImpl implements ReferencesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReferencesFactory init()
  {
    try
    {
      ReferencesFactory theReferencesFactory = (ReferencesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/java/references"); 
      if (theReferencesFactory != null)
      {
        return theReferencesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReferencesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReferencesPackage.IDENTIFIER_REFERENCE: return createIdentifierReference();
      case ReferencesPackage.METHOD_CALL: return createMethodCall();
      case ReferencesPackage.REFLECTIVE_CLASS_REFERENCE: return createReflectiveClassReference();
      case ReferencesPackage.PRIMITIVE_TYPE_REFERENCE: return createPrimitiveTypeReference();
      case ReferencesPackage.STRING_REFERENCE: return createStringReference();
      case ReferencesPackage.SELF_REFERENCE: return createSelfReference();
      case ReferencesPackage.PACKAGE_REFERENCE: return createPackageReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierReference createIdentifierReference()
  {
    IdentifierReferenceImpl identifierReference = new IdentifierReferenceImpl();
    return identifierReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall createMethodCall()
  {
    MethodCallImpl methodCall = new MethodCallImpl();
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflectiveClassReference createReflectiveClassReference()
  {
    ReflectiveClassReferenceImpl reflectiveClassReference = new ReflectiveClassReferenceImpl();
    return reflectiveClassReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTypeReference createPrimitiveTypeReference()
  {
    PrimitiveTypeReferenceImpl primitiveTypeReference = new PrimitiveTypeReferenceImpl();
    return primitiveTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringReference createStringReference()
  {
    StringReferenceImpl stringReference = new StringReferenceImpl();
    return stringReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfReference createSelfReference()
  {
    SelfReferenceImpl selfReference = new SelfReferenceImpl();
    return selfReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageReference createPackageReference()
  {
    PackageReferenceImpl packageReference = new PackageReferenceImpl();
    return packageReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencesPackage getReferencesPackage()
  {
    return (ReferencesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReferencesPackage getPackage()
  {
    return ReferencesPackage.eINSTANCE;
  }

} //ReferencesFactoryImpl
