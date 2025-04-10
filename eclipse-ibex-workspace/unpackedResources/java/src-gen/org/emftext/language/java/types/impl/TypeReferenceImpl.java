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
package org.emftext.language.java.types.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.java.commons.impl.CommentableImpl;

import org.emftext.language.java.references.Reference;

import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.emftext.language.java.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TypeReferenceImpl extends CommentableImpl implements TypeReference
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeReferenceImpl()
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
    return TypesPackage.Literals.TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getTarget()
  {
    return getBoundTarget(null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getBoundTarget(Reference reference)
  {
    org.emftext.language.java.types.Type type = null;
    if (this instanceof org.emftext.language.java.types.ClassifierReference || 
        this instanceof org.emftext.language.java.types.NamespaceClassifierReference) {
      org.emftext.language.java.types.ClassifierReference classifierRef = getPureClassifierReference();
      if (classifierRef != null) {
        type = classifierRef.getTarget();
      }
      
      if (reference instanceof org.emftext.language.java.references.MethodCall) {
        org.emftext.language.java.references.MethodCall potentialCloneCall = ( org.emftext.language.java.references.MethodCall) reference;
        //clone returns the type of the cloned in the case of arrays
        org.emftext.language.java.references.ReferenceableElement potentialCloneCallTarget = potentialCloneCall.getTarget();
        if (potentialCloneCallTarget != null && 
            !potentialCloneCallTarget.eIsProxy() && 
            "clone".equals(potentialCloneCallTarget.getName()))  {
          if (potentialCloneCall.getPrevious() instanceof org.emftext.language.java.references.ElementReference) {
            org.emftext.language.java.references.ElementReference prevRef = ( org.emftext.language.java.references.ElementReference) potentialCloneCall.getPrevious();
            if (prevRef.getTarget() instanceof org.emftext.language.java.arrays.ArrayTypeable && 
                (( org.emftext.language.java.arrays.ArrayTypeable)prevRef.getTarget()).getArrayDimension() > 0) {
              type = prevRef.getReferencedType();
            }
          }
        }
      }
    }
    
    else if(this instanceof org.emftext.language.java.types.PrimitiveType) {
      return ( org.emftext.language.java.types.PrimitiveType) this;
    }
    
    //resolve parameter to real type
    if (type instanceof org.emftext.language.java.generics.TypeParameter) {
      type = (( org.emftext.language.java.generics.TypeParameter) type).getBoundType(this, reference);
    }
    
    if (type != null && type.eIsProxy()) {
      //this may happen, when e.g. a super type is resolved. It is ok.
      return null;
    }
    
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierReference getPureClassifierReference()
  {
    org.emftext.language.java.types.ClassifierReference classifierReference = null;
    if (this instanceof org.emftext.language.java.types.ClassifierReference) {
      classifierReference = ( org.emftext.language.java.types.ClassifierReference) this;
    }
    if (this instanceof org.emftext.language.java.types.NamespaceClassifierReference) {
      org.emftext.language.java.types.NamespaceClassifierReference nsClassifierReference = ( org.emftext.language.java.types.NamespaceClassifierReference) this;
      if (!nsClassifierReference.getClassifierReferences().isEmpty()) {
        int lastIndex = nsClassifierReference.getClassifierReferences().size() - 1;
        classifierReference = nsClassifierReference.getClassifierReferences().get(lastIndex);
      }
    }
    return classifierReference;
  }

} //TypeReferenceImpl
