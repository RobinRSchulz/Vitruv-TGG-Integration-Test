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
package org.emftext.language.java.modifiers;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.commons.Commentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotable And Modifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.java.modifiers.AnnotableAndModifiable#getAnnotationsAndModifiers <em>Annotations And Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.java.modifiers.ModifiersPackage#getAnnotableAndModifiable()
 * @model abstract="true"
 * @generated
 */
public interface AnnotableAndModifiable extends Commentable
{
  /**
   * Returns the value of the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.modifiers.AnnotationInstanceOrModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations And Modifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations And Modifiers</em>' containment reference list.
   * @see org.emftext.language.java.modifiers.ModifiersPackage#getAnnotableAndModifiable_AnnotationsAndModifiers()
   * @model containment="true" resolveProxies="true"
   * @generated
   */
  EList<AnnotationInstanceOrModifier> getAnnotationsAndModifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.eIsProxy()) {\n\treturn false;\n}\n//all members of an interface are public by default\nif (this.eContainer() instanceof org.emftext.language.java.classifiers.Interface) {\n\treturn false;\n}\n\nif(context.eIsProxy()) {\n\tcontext = ( org.emftext.language.java.commons.Commentable) org.eclipse.emf.ecore.util.EcoreUtil.resolve(context, this);\n}\n\norg.emftext.language.java.classifiers.ConcreteClassifier contextClassifier = context.getContainingConcreteClassifier(); \nif (!(eContainer() instanceof org.emftext.language.java.commons.Commentable)) {\n\treturn true;\n}\norg.emftext.language.java.classifiers.ConcreteClassifier myClassifier = (( org.emftext.language.java.commons.Commentable) eContainer()).getParentConcreteClassifier();\n//special case: self reference to outer instance\nif(context instanceof org.emftext.language.java.references.Reference) {\n\tif ((( org.emftext.language.java.references.Reference)context).getPrevious() instanceof org.emftext.language.java.references.SelfReference) {\n\t\torg.emftext.language.java.references.SelfReference selfReference = ( org.emftext.language.java.references.SelfReference) (( org.emftext.language.java.references.Reference)context).getPrevious();\n\t\tif (selfReference.getSelf() instanceof org.emftext.language.java.literals.Self) {\n\t\t\tif(selfReference.getPrevious() != null) {\n\t\t\t\torg.emftext.language.java.types.Type type = selfReference.getPrevious().getReferencedType();\n\t\t\t\tif (type instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {\n\t\t\t\t\tcontextClassifier = ( org.emftext.language.java.classifiers.ConcreteClassifier) type;\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\n\nfor( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {\n\tif(modifier instanceof org.emftext.language.java.modifiers.Private) {\n\t\tif (myClassifier.equalsType(0, contextClassifier,0)) {\n\t\t\treturn false;\n\t\t}\n\t\treturn true;\n\t}\n\tif(modifier instanceof org.emftext.language.java.modifiers.Public) {\n\t\treturn false;\n\t}\n\tif(modifier instanceof org.emftext.language.java.modifiers.Protected) {\n\t\t//package visibility\n\t\tif (getContainingPackageName() != null && \n\t\t\t\tgetContainingPackageName().equals(context.getContainingPackageName())) {\n\t\t\treturn false;\n\t\t}\n\t\t//try outer classifiers as well \n\t\twhile(contextClassifier instanceof org.emftext.language.java.classifiers.Classifier) {\n\t\t\tif (contextClassifier.isSuperType(0, myClassifier, null)) {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t\t\n\t\t\torg.eclipse.emf.ecore.EObject container = contextClassifier.eContainer();\n\t\t\tif (container instanceof org.emftext.language.java.commons.Commentable) {\n\t\t\t\tcontextClassifier = (( org.emftext.language.java.commons.Commentable) container).getParentConcreteClassifier();\n\t\t\t} else {\n\t\t\t\tcontextClassifier = null;\n\t\t\t}\n\t\t\t\n\t\t\tif (contextClassifier != null && !contextClassifier.eIsProxy() && \n\t\t\t\t\tcontextClassifier.isSuperType(0, myClassifier, null)) {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t\t//visibility through anonymous subclass\n\t\torg.emftext.language.java.classifiers.AnonymousClass anonymousClass = context.getContainingAnonymousClass();\n\t\twhile (anonymousClass != null) {\n\t\t\tcontextClassifier = anonymousClass.getSuperClassifier();\n\t\t\tif (contextClassifier == null) {\n\t\t\t\treturn true;\n\t\t\t}\n\t\t\tif (contextClassifier.isSuperType(0, myClassifier, null)) {\n\t\t\t\treturn false;\n\t\t\t}\n\t\t\t\n\t\t\torg.eclipse.emf.ecore.EObject container = anonymousClass.eContainer();\n\t\t\tif (container instanceof org.emftext.language.java.commons.Commentable) {\n\t\t\t\tanonymousClass = (( org.emftext.language.java.commons.Commentable) container).getContainingAnonymousClass();\n\t\t\t} else {\n\t\t\t\tanonymousClass = null;\n\t\t\t}\n\t\t}\n\t\treturn true;\n\t}\n}\n//package visibility?\nif (getContainingPackageName() != null && \n\t\tgetContainingPackageName().equals(context.getContainingPackageName())) {\n\treturn false;\n}\n\nreturn true;'"
   * @generated
   */
  boolean isHidden(Commentable context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns true if this element is static (either by an explicit modifier <code>static</code>
   *  or because this element is part of an interface).
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='//all members of an interface are static by default\nif (this.eContainer() instanceof org.emftext.language.java.classifiers.Interface) {\n\treturn true;\n}\n\nfor( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : this.getAnnotationsAndModifiers()) {\n\tif(modifier instanceof org.emftext.language.java.modifiers.Static) {\n\t\treturn true;\n\t}\n}\nreturn false;'"
   * @generated
   */
  boolean isStatic();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Removes the given type of modifier from this element.
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.List< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();\njava.util.List< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> modifiersToRemove = new java.util.ArrayList< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier>();\nfor ( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {\n\tif (modifierType.isInstance(modifier)) {\n\t\tmodifiersToRemove.add(modifier);\n\t}\n}\nmodifiers.removeAll(modifiersToRemove);'"
   * @generated
   */
  void removeModifier(Class<?> modifierType);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Sets the visibility of this element to <code>public</code>.
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (isPublic()) {\n\treturn;\n}\nremoveModifier( org.emftext.language.java.modifiers.Private.class);\nremoveModifier( org.emftext.language.java.modifiers.Protected.class);\ngetAnnotationsAndModifiers().add( org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPublic());'"
   * @generated
   */
  void makePublic();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Sets the visibility of this element to <code>private</code>.
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (isPrivate()) {\n\treturn;\n}\nremoveModifier( org.emftext.language.java.modifiers.Public.class);\nremoveModifier( org.emftext.language.java.modifiers.Protected.class);\ngetAnnotationsAndModifiers().add( org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createPrivate());'"
   * @generated
   */
  void makePrivate();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Sets the visibility of this element to <code>protected</code>.
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (isProtected()) {\n\treturn;\n}\nremoveModifier( org.emftext.language.java.modifiers.Private.class);\nremoveModifier( org.emftext.language.java.modifiers.Public.class);\ngetAnnotationsAndModifiers().add( org.emftext.language.java.modifiers.ModifiersFactory.eINSTANCE.createProtected());'"
   * @generated
   */
  void makeProtected();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns an unmodifiable list of the modifiers that apply to this element.
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();\norg.eclipse.emf.common.util.EList< org.emftext.language.java.modifiers.Modifier> modifiers = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.modifiers.Modifier>(); \nfor ( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier next : elements) {\n\tif (next instanceof org.emftext.language.java.modifiers.Modifier) {\n\t\tmodifiers.add(( org.emftext.language.java.modifiers.Modifier) next);\n\t}\n}\nreturn org.eclipse.emf.common.util.ECollections.unmodifiableEList(modifiers);'"
   * @generated
   */
  EList<Modifier> getModifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Removes all modifiers from this element.
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.List< org.emftext.language.java.modifiers.Modifier> modifiers = getModifiers();\norg.eclipse.emf.common.util.EList< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> elements = getAnnotationsAndModifiers();\nelements.removeAll(modifiers);'"
   * @generated
   */
  void removeAllModifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Checks whether this element has an modifier of the given type.
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.util.List< org.emftext.language.java.modifiers.AnnotationInstanceOrModifier> modifiers = getAnnotationsAndModifiers();\nfor ( org.emftext.language.java.modifiers.AnnotationInstanceOrModifier modifier : modifiers) {\n\tif (type.isInstance(modifier)) {\n\t\treturn true;\n\t}\n}\nreturn false;'"
   * @generated
   */
  boolean hasModifier(Class<?> type);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return hasModifier( org.emftext.language.java.modifiers.Public.class);'"
   * @generated
   */
  boolean isPublic();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return hasModifier( org.emftext.language.java.modifiers.Private.class);'"
   * @generated
   */
  boolean isPrivate();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return hasModifier( org.emftext.language.java.modifiers.Protected.class);'"
   * @generated
   */
  boolean isProtected();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Adds the given type of modifier to this element. This method does not
   *  check for duplicate modifiers!
   * 
   * <!-- end-model-doc -->
   * @model newModifierRequired="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='getAnnotationsAndModifiers().add(newModifier);'"
   * @generated
   */
  void addModifier(Modifier newModifier);

} // AnnotableAndModifiable
