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
package org.emftext.language.java.classifiers;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.types.PrimitiveType;
import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.classifiers.Class#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.emftext.language.java.classifiers.Class#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.classifiers.ClassifiersPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends ConcreteClassifier, Implementor
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(TypeReference)
   * @see org.emftext.language.java.classifiers.ClassifiersPackage#getClass_Extends()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  TypeReference getExtends();

  /**
   * Sets the value of the '{@link org.emftext.language.java.classifiers.Class#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(TypeReference value);

  /**
   * Returns the value of the '<em><b>Default Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Extends</em>' containment reference.
   * @see #setDefaultExtends(TypeReference)
   * @see org.emftext.language.java.classifiers.ClassifiersPackage#getClass_DefaultExtends()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  TypeReference getDefaultExtends();

  /**
   * Sets the value of the '{@link org.emftext.language.java.classifiers.Class#getDefaultExtends <em>Default Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Extends</em>' containment reference.
   * @see #getDefaultExtends()
   * @generated
   */
  void setDefaultExtends(TypeReference value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Recursively collects all super types (extended classes and implemented interfaces)
   *  of the given class.
   *  
   *  @param classifierList the list for the result
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = \n\tnew org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\n\t\t\t\n//collects all superclasses first\norg.emftext.language.java.classifiers.Class superClass = this;\nwhile (superClass != null && !superClass.eIsProxy() && \n\t\t!superClass.equals(getObjectClass())) {\n\tsuperClass = superClass.getSuperClass();\n\tif (superClass != null) {\n\t\tresult.add(superClass);\n\t}\n}\n\n//collect all implemented interfaces\nfor ( org.emftext.language.java.types.TypeReference typeArg : this.getImplements()) {\n\torg.emftext.language.java.classifiers.ConcreteClassifier superInterface = ( org.emftext.language.java.classifiers.ConcreteClassifier) typeArg.getTarget();\n\tif (superInterface != null) {\n\t\tresult.add(superInterface);\n\t\tif (superInterface instanceof org.emftext.language.java.classifiers.Interface) {\n\t\t\tresult.addAll((( org.emftext.language.java.classifiers.Interface)superInterface).getAllSuperClassifiers());\n\t\t}\n\t}\n}\n\n//collect all implemented interfaces of super classes\nsuperClass = this.getSuperClass();\t\nif (superClass != null && !superClass.eIsProxy() && \n\t\t!superClass.equals(getObjectClass())) {\n\tresult.addAll(superClass.getAllSuperClassifiers());\n}\t\n\nreturn result;'"
   * @generated
   */
  EList<ConcreteClassifier> getAllSuperClassifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param this
   *  @return the direct super class
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.types.TypeReference superClassReference = this.getExtends();\nif (superClassReference == null) {\n\tsuperClassReference = this.getDefaultExtends();\n}\nif (superClassReference == null) {\n\treturn null;\n}\norg.emftext.language.java.types.Type result = superClassReference.getTarget();\nif (result instanceof org.emftext.language.java.classifiers.Class) {\n\treturn ( org.emftext.language.java.classifiers.Class) result;\n}\nreturn null;'"
   * @generated
   */
  Class getSuperClass();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param this
   *  @return primitive type, if the class can be wrapped
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getLibClass(\"Boolean\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createBoolean();\n}\nif (getLibClass(\"Byte\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createByte();\n}\nif (getLibClass(\"Character\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createChar();\n}\nif (getLibClass(\"Float\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createFloat();\n}\nif (getLibClass(\"Double\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createDouble();\n}\nif (getLibClass(\"Integer\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createInt();\n}\nif (getLibClass(\"Long\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createLong();\n}\nif (getLibClass(\"Short\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createShort();\n}\nif (getLibClass(\"Void\").equals(this)) {\n\treturn org.emftext.language.java.types.TypesFactory.eINSTANCE.createVoid();\n}\nreturn null;'"
   * @generated
   */
  PrimitiveType unWrapPrimitiveType();

} // Class
