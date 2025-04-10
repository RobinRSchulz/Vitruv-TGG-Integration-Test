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
package org.emftext.language.java.types;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.references.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.emftext.language.java.types.TypesPackage#getTypeReference()
 * @model abstract="true"
 * @generated
 */
public interface TypeReference extends Commentable
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns the type referenced by this <code>TypeReference</code>
   *  considering all concrete subclasses of <code>TypeReference</code> used
   *  by the Java metamodel. 
   *  
   *  @param _this 
   *  @return the type
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getBoundTarget(null);'"
   * @generated
   */
  Type getTarget();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Returns the type referenced by this <code>TypeReference</code>
   *  considering all concrete subclasses of <code>TypeReference</code> used
   *  by the Java metamodel. If type parameters are bound in the given reference,
   *  the bound type will be returned instead of the parameter.
   *  
   *  @return the type
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.types.Type type = null;\nif (this instanceof org.emftext.language.java.types.ClassifierReference || \n\t\tthis instanceof org.emftext.language.java.types.NamespaceClassifierReference) {\n\torg.emftext.language.java.types.ClassifierReference classifierRef = getPureClassifierReference();\n\tif (classifierRef != null) {\n\t\ttype = classifierRef.getTarget();\n\t}\n\t\n\tif (reference instanceof org.emftext.language.java.references.MethodCall) {\n\t\torg.emftext.language.java.references.MethodCall potentialCloneCall = ( org.emftext.language.java.references.MethodCall) reference;\n\t\t//clone returns the type of the cloned in the case of arrays\n\t\torg.emftext.language.java.references.ReferenceableElement potentialCloneCallTarget = potentialCloneCall.getTarget();\n\t\tif (potentialCloneCallTarget != null && \n\t\t\t\t!potentialCloneCallTarget.eIsProxy() && \n\t\t\t\t\"clone\".equals(potentialCloneCallTarget.getName()))  {\n\t\t\tif (potentialCloneCall.getPrevious() instanceof org.emftext.language.java.references.ElementReference) {\n\t\t\t\torg.emftext.language.java.references.ElementReference prevRef = ( org.emftext.language.java.references.ElementReference) potentialCloneCall.getPrevious();\n\t\t\t\tif (prevRef.getTarget() instanceof org.emftext.language.java.arrays.ArrayTypeable && \n\t\t\t\t\t\t(( org.emftext.language.java.arrays.ArrayTypeable)prevRef.getTarget()).getArrayDimension() > 0) {\n\t\t\t\t\ttype = prevRef.getReferencedType();\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}\n\nelse if(this instanceof org.emftext.language.java.types.PrimitiveType) {\n\treturn ( org.emftext.language.java.types.PrimitiveType) this;\n}\n\n//resolve parameter to real type\nif (type instanceof org.emftext.language.java.generics.TypeParameter) {\n\ttype = (( org.emftext.language.java.generics.TypeParameter) type).getBoundType(this, reference);\n}\n\nif (type != null && type.eIsProxy()) {\n\t//this may happen, when e.g. a super type is resolved. It is ok.\n\treturn null;\n}\n\nreturn type;'"
   * @generated
   */
  Type getBoundTarget(Reference reference);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  Extracts the (possibly nested) classifier reference (if any) 
   *  from this type references.
   *  
   *  @return
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.types.ClassifierReference classifierReference = null;\nif (this instanceof org.emftext.language.java.types.ClassifierReference) {\n\tclassifierReference = ( org.emftext.language.java.types.ClassifierReference) this;\n}\nif (this instanceof org.emftext.language.java.types.NamespaceClassifierReference) {\n\torg.emftext.language.java.types.NamespaceClassifierReference nsClassifierReference = ( org.emftext.language.java.types.NamespaceClassifierReference) this;\n\tif (!nsClassifierReference.getClassifierReferences().isEmpty()) {\n\t\tint lastIndex = nsClassifierReference.getClassifierReferences().size() - 1;\n\t\tclassifierReference = nsClassifierReference.getClassifierReferences().get(lastIndex);\n\t}\n}\nreturn classifierReference;'"
   * @generated
   */
  ClassifierReference getPureClassifierReference();

} // TypeReference
