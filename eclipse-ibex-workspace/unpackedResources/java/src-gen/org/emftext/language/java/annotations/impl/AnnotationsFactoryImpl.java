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
package org.emftext.language.java.annotations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.java.annotations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotationsFactoryImpl extends EFactoryImpl implements AnnotationsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AnnotationsFactory init()
  {
    try
    {
      AnnotationsFactory theAnnotationsFactory = (AnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/java/annotations"); 
      if (theAnnotationsFactory != null)
      {
        return theAnnotationsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AnnotationsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsFactoryImpl()
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
      case AnnotationsPackage.ANNOTATION_INSTANCE: return createAnnotationInstance();
      case AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER: return createSingleAnnotationParameter();
      case AnnotationsPackage.ANNOTATION_PARAMETER_LIST: return createAnnotationParameterList();
      case AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING: return createAnnotationAttributeSetting();
      case AnnotationsPackage.ANNOTATION_ATTRIBUTE: return createAnnotationAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationInstance createAnnotationInstance()
  {
    AnnotationInstanceImpl annotationInstance = new AnnotationInstanceImpl();
    return annotationInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleAnnotationParameter createSingleAnnotationParameter()
  {
    SingleAnnotationParameterImpl singleAnnotationParameter = new SingleAnnotationParameterImpl();
    return singleAnnotationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationParameterList createAnnotationParameterList()
  {
    AnnotationParameterListImpl annotationParameterList = new AnnotationParameterListImpl();
    return annotationParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationAttributeSetting createAnnotationAttributeSetting()
  {
    AnnotationAttributeSettingImpl annotationAttributeSetting = new AnnotationAttributeSettingImpl();
    return annotationAttributeSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationAttribute createAnnotationAttribute()
  {
    AnnotationAttributeImpl annotationAttribute = new AnnotationAttributeImpl();
    return annotationAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsPackage getAnnotationsPackage()
  {
    return (AnnotationsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AnnotationsPackage getPackage()
  {
    return AnnotationsPackage.eINSTANCE;
  }

} //AnnotationsFactoryImpl
