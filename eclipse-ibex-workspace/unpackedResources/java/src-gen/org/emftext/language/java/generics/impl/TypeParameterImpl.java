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
package org.emftext.language.java.generics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.classifiers.impl.ClassifierImpl;

import org.emftext.language.java.commons.Commentable;

import org.emftext.language.java.generics.GenericsPackage;
import org.emftext.language.java.generics.TypeParameter;

import org.emftext.language.java.members.Member;

import org.emftext.language.java.references.Reference;

import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.java.generics.impl.TypeParameterImpl#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeParameterImpl extends ClassifierImpl implements TypeParameter
{
  /**
   * The cached value of the '{@link #getExtendTypes() <em>Extend Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendTypes()
   * @generated
   * @ordered
   */
  protected EList<TypeReference> extendTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeParameterImpl()
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
    return GenericsPackage.Literals.TYPE_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeReference> getExtendTypes()
  {
    if (extendTypes == null)
    {
      extendTypes = new EObjectContainmentEList.Resolving<TypeReference>(TypeReference.class, this, GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES);
    }
    return extendTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteClassifier> getAllSuperClassifiers()
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();
    for( org.emftext.language.java.types.TypeReference typeRef : getExtendTypes()) {
      org.emftext.language.java.types.Type type = typeRef.getTarget();
      if (type instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
        result.add(( org.emftext.language.java.classifiers.ConcreteClassifier)type);
      }
      if (type instanceof org.emftext.language.java.classifiers.Classifier) {
        result.addAll((( org.emftext.language.java.classifiers.Classifier)type).getAllSuperClassifiers());	
      }
    }		
    
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getAllMembers(Commentable context)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.members.Member> memberList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.members.Member>();
    
    org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.Type> possiblyVisibleSuperClassifier = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.Type>();
    for( org.emftext.language.java.types.TypeReference typeReference : (( org.emftext.language.java.generics.TypeParameter)this).getExtendTypes()) {
      possiblyVisibleSuperClassifier.add(typeReference.getTarget());
    }
    
    for ( org.emftext.language.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
      for( org.emftext.language.java.members.Member member : superClassifier.getMembers()) {
        if(member instanceof org.emftext.language.java.modifiers.AnnotableAndModifiable) {					
          org.emftext.language.java.modifiers.AnnotableAndModifiable modifiable = ( org.emftext.language.java.modifiers.AnnotableAndModifiable) member;
    
          if(!modifiable.isHidden(context)) {
            memberList.add(member);
          }
          else if (possiblyVisibleSuperClassifier.contains(superClassifier)) {
            memberList.add(member);
          }
        }
        else {
          memberList.add(member);
        }
      }
      memberList.addAll(superClassifier.getDefaultMembers());
    }
    return memberList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getBoundType(TypeReference typeReference, Reference reference)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> resultList = new org.eclipse.emf.common.util.BasicEList< org.emftext.language.java.types.Type>();
    org.emftext.language.java.generics.TypeParametrizable typeParameterDeclarator = ( org.emftext.language.java.generics.TypeParametrizable) this.eContainer();
    org.emftext.language.java.references.Reference parentReference = null;
    org.eclipse.emf.common.util.EList< org.emftext.language.java.types.Type> prevTypeList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.types.Type>();
    if (reference != null && 
        reference.getPrevious() instanceof org.emftext.language.java.expressions.NestedExpression) {
      org.emftext.language.java.expressions.NestedExpression nestedExpression = ( org.emftext.language.java.expressions.NestedExpression) reference.getPrevious();
      org.emftext.language.java.expressions.Expression expression = null;
      if (nestedExpression.getExpression() instanceof org.emftext.language.java.references.Reference) {
        expression = nestedExpression.getExpression();
      }
      else if (nestedExpression.getExpression() instanceof org.emftext.language.java.expressions.ConditionalExpression) {
        expression = (( org.emftext.language.java.expressions.ConditionalExpression)nestedExpression.getExpression()).getExpressionIf();
      }
    
      
      if (expression instanceof org.emftext.language.java.references.Reference) {
        org.emftext.language.java.references.Reference expressionReference = ( org.emftext.language.java.references.Reference) expression;
        //navigate down references
        while(expressionReference.getNext() != null) {
          expressionReference = expressionReference.getNext();
        }
        parentReference = expressionReference;
        org.emftext.language.java.types.Type prevType = nestedExpression.getExpression().getType();
        if(prevType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
          for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)prevType).getSuperTypes()) {
            prevTypeList.add(( org.emftext.language.java.types.Type)aType);
          }
        }
        else {
          prevTypeList.add(prevType);
        }
      }
      else if (nestedExpression.getExpression() instanceof org.emftext.language.java.expressions.CastExpression) {
        prevTypeList.add((( org.emftext.language.java.expressions.CastExpression)nestedExpression.getExpression()).getTypeReference().getTarget());
      }
    }
    else if (reference != null && reference.getPrevious() != null) {
      parentReference = reference.getPrevious();
      while (parentReference instanceof org.emftext.language.java.references.SelfReference) {
        if ((( org.emftext.language.java.references.SelfReference)parentReference).getSelf() instanceof org.emftext.language.java.literals.Super) {
          if (parentReference.eContainer() instanceof org.emftext.language.java.references.Reference) {
            parentReference = ( org.emftext.language.java.references.Reference) parentReference.eContainer();
          }
          else {
            org.emftext.language.java.classifiers.ConcreteClassifier containingClassifier = reference.getContainingConcreteClassifier();
            if (containingClassifier != null) {
              prevTypeList.add(containingClassifier);
            }
            parentReference = null;
          }
        }
        else {
          break;
        }
      }
      if (parentReference != null) {
        org.emftext.language.java.types.Type prevType = parentReference.getReferencedType();
        if(prevType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
          for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)prevType).getSuperTypes()) {
            prevTypeList.add(( org.emftext.language.java.types.Type)aType);
          }
        }
        else {
          prevTypeList.add(prevType);
        }
      }
    }
    else if (reference != null) {
      //prev type is on of the containing classes which can still bind by inheritance
      org.emftext.language.java.classifiers.ConcreteClassifier containingClassifier = reference.getContainingConcreteClassifier();
      while (containingClassifier != null) {
        prevTypeList.add(containingClassifier);
        org.eclipse.emf.ecore.EObject container = containingClassifier.eContainer();
        if (container instanceof org.emftext.language.java.commons.Commentable) {
          containingClassifier = (( org.emftext.language.java.commons.Commentable) container).getContainingConcreteClassifier();
        } else {
          containingClassifier = null;
        }
      }
    }
    
    for( org.emftext.language.java.types.Type prevType : prevTypeList) {
      int typeParameterIndex = -1;
      if (typeParameterDeclarator instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
        typeParameterIndex = typeParameterDeclarator.getTypeParameters().indexOf(this);
        if(reference != null) {
          org.emftext.language.java.types.ClassifierReference classifierReference = null;
          if(parentReference instanceof org.emftext.language.java.references.ElementReference) {
            org.emftext.language.java.references.ReferenceableElement prevReferenced = (( org.emftext.language.java.references.ElementReference) parentReference).getTarget();
            if(prevReferenced instanceof org.emftext.language.java.types.TypedElement) {
              org.emftext.language.java.types.TypeReference prevTypeReference = (( org.emftext.language.java.types.TypedElement)prevReferenced).getTypeReference ();
              if (prevTypeReference != null) {
                classifierReference = prevTypeReference.getPureClassifierReference(); 
              }
            }
          }
          if(parentReference instanceof org.emftext.language.java.types.TypedElement) {
            //e.g. New Constructor Call
            org.emftext.language.java.types.TypeReference prevParentReference = (( org.emftext.language.java.types.TypedElement)parentReference).getTypeReference ();
            if (prevParentReference != null) {
              classifierReference = prevParentReference.getPureClassifierReference(); 
            }
          }
          if (prevType instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
            //bound through inheritance?
            int idx = 0;
            for( org.emftext.language.java.types.ClassifierReference superClassifierReference : (( org.emftext.language.java.classifiers.ConcreteClassifier) prevType).getSuperTypeReferences()) {
              if (typeParameterIndex < superClassifierReference.getTypeArguments().size())  {
                //is this an argument for the correct class?
                if (typeParameterDeclarator.equals(superClassifierReference.getTarget()) ||
                    (( org.emftext.language.java.classifiers.Classifier)superClassifierReference.getTarget()).getAllSuperClassifiers().contains(
                        typeParameterDeclarator)) {					 
                  org.emftext.language.java.generics.TypeArgument arg = superClassifierReference.getTypeArguments().get(typeParameterIndex);
                  if (arg instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                    resultList.add(idx, (( org.emftext.language.java.generics.QualifiedTypeArgument) arg).getTypeReference().getTarget());
                    idx++;
                  }
                }
      
              }
            }
            org.eclipse.emf.common.util.EList< org.emftext.language.java.generics.TypeArgument> typeArgumentList;
            org.emftext.language.java.util.TemporalTypeArgumentHolder ttah = null;
            for( org.eclipse.emf.common.notify.Adapter adapter : prevType.eAdapters()) {
              if (adapter instanceof org.emftext.language.java.util.TemporalTypeArgumentHolder) {
                ttah = ( org.emftext.language.java.util.TemporalTypeArgumentHolder) adapter; 
                prevType.eAdapters().remove(ttah);
                break;
              }
            }
            if (ttah != null) {
              typeArgumentList = ttah.getTypeArguments();
            }
            else if (classifierReference != null) {
              typeArgumentList = classifierReference.getTypeArguments();
            }
            else {
              typeArgumentList = org.eclipse.emf.common.util.ECollections.emptyEList();
            }
            
            if (typeParameterIndex < typeArgumentList.size())  {
              org.emftext.language.java.generics.TypeArgument arg = typeArgumentList.get(typeParameterIndex);
              if (arg instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                org.emftext.language.java.types.ClassifierReference theTypeRef = (( org.emftext.language.java.generics.QualifiedTypeArgument) arg).getTypeReference().getPureClassifierReference();
                if (theTypeRef != null) {
                  org.emftext.language.java.types.Type theType = theTypeRef.getBoundTarget(parentReference);
                  if (theType != null) {
                    if (!theTypeRef.getTypeArguments().isEmpty()) {
                      ttah = new org.emftext.language.java.util.TemporalTypeArgumentHolder();
                      ttah.getTypeArguments().addAll(theTypeRef.getTypeArguments());
                      theType.eAdapters().add(ttah);
                    }
                    resultList.add(0, theType);
                  }
                }
              }
              if (arg instanceof org.emftext.language.java.generics.ExtendsTypeArgument) {
                for( org.emftext.language.java.types.TypeReference extendedType : (( org.emftext.language.java.generics.ExtendsTypeArgument) arg).getExtendTypes()) {
                  resultList.add(0, extendedType.getBoundTarget(parentReference));
                }
              }
            }
      
          }
          else if (prevType instanceof org.emftext.language.java.generics.TypeParameter) {
            //the prev. type parameter, although unbound, may contain type restrictions through extends 
            resultList.add(prevType);
            for( org.emftext.language.java.types.TypeReference extendedRef : (( org.emftext.language.java.generics.TypeParameter) prevType).getExtendTypes()) {
              org.emftext.language.java.classifiers.ConcreteClassifier extended = ( org.emftext.language.java.classifiers.ConcreteClassifier)extendedRef.getTarget();
              int idx = (( org.emftext.language.java.generics.TypeParametrizable)prevType.eContainer()).getTypeParameters().indexOf(prevType);
              if (extended.getTypeParameters().size() > idx) {
                //also add more precise bindings from extensions
                resultList.add(extended.getTypeParameters().get(idx));
              }
            }
          }
        }
        if(reference != null && reference.eContainer() instanceof org.emftext.language.java.references.ReflectiveClassReference) {
          if (reference.eContainer().eContainer() instanceof org.emftext.language.java.references.Reference) {
            //the ".class" instantiation implicitly binds the T parameter of java.lang.Class to the class itself
            resultList.add(0, (( org.emftext.language.java.references.Reference)reference.eContainer().eContainer()).getReferencedType());
          }
        }
      }
    }
    
    if (typeParameterDeclarator instanceof org.emftext.language.java.members.Method) {
      if (reference instanceof org.emftext.language.java.references.MethodCall) {
        org.emftext.language.java.members.Method method = ( org.emftext.language.java.members.Method) typeParameterDeclarator;
        org.emftext.language.java.references.MethodCall methodCall = ( org.emftext.language.java.references.MethodCall) reference;
        if(method.getTypeParameters().size() == methodCall.getCallTypeArguments().size()) {
          org.emftext.language.java.generics.TypeArgument typeArgument = methodCall.getCallTypeArguments().get(method.getTypeParameters().indexOf(this));
          if (typeArgument instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
            resultList.add(0, (( org.emftext.language.java.generics.QualifiedTypeArgument)typeArgument).getTypeReference().getBoundTarget(parentReference)); 
          } 
        }
    
        //class type parameter
        int idx = method.getParameters().indexOf(typeReference.eContainer());
        
        //method type parameter
        if (idx == -1) {
          for( org.emftext.language.java.parameters.Parameter parameter : method.getParameters()) {
            for ( org.emftext.language.java.generics.TypeArgument typeArgument : parameter.getTypeArguments()) {
              if(typeArgument instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                if((( org.emftext.language.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
                  idx = method.getParameters().indexOf(parameter);
                }
              }
            }
            org.emftext.language.java.types.ClassifierReference paramTypeReference = parameter.getTypeReference().getPureClassifierReference();
            if (paramTypeReference != null) {
              for ( org.emftext.language.java.generics.TypeArgument typeArgument : paramTypeReference.getTypeArguments()) {
                if(typeArgument instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                  if(this.equals((( org.emftext.language.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget())) {
                    idx = method.getParameters().indexOf(parameter);
                  }
                }
              }
            }
          }
        }
        
        if (idx < methodCall.getArguments().size() && idx >= 0) {
          org.emftext.language.java.expressions.Expression argument = methodCall.getArguments().get(idx);
          org.emftext.language.java.parameters.Parameter parameter = method.getParameters().get(idx);
          org.emftext.language.java.types.ClassifierReference parameterType = parameter.getTypeReference().getPureClassifierReference();
          if (argument instanceof org.emftext.language.java.instantiations.NewConstructorCall) {
            org.emftext.language.java.types.ClassifierReference argumentType = (( org.emftext.language.java.instantiations.NewConstructorCall)argument).getTypeReference().getPureClassifierReference();
            if (argumentType != null && parameterType.getTypeArguments().size() == argumentType.getTypeArguments().size()) {
              for( org.emftext.language.java.generics.TypeArgument typeArgument : parameterType.getTypeArguments()) {
                if(typeArgument instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                  if((( org.emftext.language.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
                    resultList.add(0, (( org.emftext.language.java.generics.QualifiedTypeArgument)argumentType.getTypeArguments().get(parameterType.getTypeArguments().indexOf(typeArgument))).getTypeReference(
                      ).getTarget());
                  }
                }
              }
            }
            if (argumentType != null && parameterType.getTarget() instanceof org.emftext.language.java.generics.TypeParameter) {
              resultList.add(0,argumentType.getTarget());
            }
          }
          else if (parameterType != null && argument instanceof org.emftext.language.java.references.Reference) {
            org.emftext.language.java.references.Reference argReference = ( org.emftext.language.java.references.Reference) argument;
            
            while (argReference.getNext() instanceof org.emftext.language.java.references.Reference &&
                !(argReference.getNext() instanceof org.emftext.language.java.references.ReflectiveClassReference) ) {
              argReference = argReference.getNext();
            }
      
            
            if (argReference instanceof org.emftext.language.java.references.ElementReference) {
              org.emftext.language.java.references.ElementReference elementReference = ( org.emftext.language.java.references.ElementReference) argReference;
              while (elementReference.getNext() instanceof org.emftext.language.java.references.ElementReference) {
                elementReference = ( org.emftext.language.java.references.ElementReference) elementReference.getNext();
              }
              if (elementReference.getTarget() instanceof org.emftext.language.java.types.TypedElement) {
                org.emftext.language.java.types.ClassifierReference argumentType = (( org.emftext.language.java.types.TypedElement)elementReference.getTarget()).getTypeReference().getPureClassifierReference();
                if (argumentType != null && parameterType.getTypeArguments().size() == argumentType.getTypeArguments().size()) {
                  for( org.emftext.language.java.generics.TypeArgument typeArgument : parameterType.getTypeArguments()) {
                    if(typeArgument instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                      if((( org.emftext.language.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
                        int idx2 = parameterType.getTypeArguments().indexOf(typeArgument);
                        if (argumentType.getTypeArguments().get(idx2) instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                          resultList.add(0, (( org.emftext.language.java.generics.QualifiedTypeArgument)argumentType.getTypeArguments().get(idx2)).getTypeReference().getTarget());
                        }
                        else if (argumentType.getTypeArguments().get(idx2) instanceof org.emftext.language.java.generics.ExtendsTypeArgument) {
                          for( org.emftext.language.java.types.TypeReference extendedType : (( org.emftext.language.java.generics.ExtendsTypeArgument) argumentType.getTypeArguments().get(idx2)).getExtendTypes()) {
                            resultList.add(0, extendedType.getTarget());
                          }
                        }
                      }
                    }
                  }
                }
                if (argumentType != null && parameterType.getTarget() instanceof org.emftext.language.java.generics.TypeParameter) {
                  resultList.add(0,argumentType.getTarget());
                }
              }
              if(elementReference.getNext() instanceof org.emftext.language.java.references.ReflectiveClassReference) {
                if (parameterType.getTypeArguments().size() == 1) {
                  for( org.emftext.language.java.generics.TypeArgument typeArgument : parameterType.getTypeArguments()) {
                    if(typeArgument instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
                      if((( org.emftext.language.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
                        resultList.add(0, elementReference.getReferencedType());
                      }
                    }
                  }
                }
              }
            }
            else {
              if (parameterType.getTarget() instanceof org.emftext.language.java.generics.TypeParameter) {
                while (argReference.getNext() instanceof org.emftext.language.java.references.Reference) {
                  argReference = argReference.getNext();
                }
                resultList.add(0, (( org.emftext.language.java.references.Reference) argReference).getReferencedType());
              }
            }
          }			
        }
        
        //return type
        if(method.equals(typeReference.eContainer())) {
          //bound by the type of a method argument?
          org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.Classifier> allSuperTypes = null;
          for( org.emftext.language.java.parameters.Parameter parameter : method.getParameters()) {
            if(this.equals(parameter.getTypeReference().getTarget())) {
              idx = method.getParameters().indexOf(parameter);
              org.emftext.language.java.classifiers.Classifier argumentType = ( org.emftext.language.java.classifiers.Classifier) methodCall.getArguments().get(idx).getType();
              if(allSuperTypes == null) {
                allSuperTypes = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.Classifier>();
                allSuperTypes.add(argumentType);
                allSuperTypes.addAll(argumentType.getAllSuperClassifiers());
              }
              else {
                allSuperTypes.add(argumentType);
                org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.Classifier> allOtherSuperTypes = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.Classifier>();
                allOtherSuperTypes.add(argumentType);
                allOtherSuperTypes.addAll(argumentType.getAllSuperClassifiers());
                org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.Classifier> temp = allSuperTypes;
                allSuperTypes = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.Classifier>();
                for( org.emftext.language.java.classifiers.Classifier st : allOtherSuperTypes) {
                  if(temp.contains(st)) {
                    allSuperTypes.add(st);
                  }
                }
              }
            }
       				}
          //all types given by all bindings
          if (allSuperTypes != null) {
            resultList.addAll(allSuperTypes);
          }
        }
      }
    }
    
    //remove nulls
    for( java.util.Iterator<?> it = resultList.iterator(); it.hasNext(); ) {
      if (it.next() == null) {
        it.remove();
      }
    }
    
    if(resultList.isEmpty() || 
        (resultList.size() == 1 && resultList.get(0).equals(this))) {
      return this;
    }
    else {
      org.emftext.language.java.util.TemporalCompositeClassifier temp = new org.emftext.language.java.util.TemporalCompositeClassifier(this);
      for( org.emftext.language.java.types.Type aResult : resultList) {
        if(aResult instanceof org.emftext.language.java.types.PrimitiveType) {
          aResult = (( org.emftext.language.java.types.PrimitiveType) aResult).wrapPrimitiveType();
        }
        
        if (aResult instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
          //flatten
          temp.getSuperTypes().addAll((( org.emftext.language.java.util.TemporalCompositeClassifier)aResult).getSuperTypes());
        }
        else {
          temp.getSuperTypes().add(( org.emftext.language.java.classifiers.Classifier) aResult);	
        }
      }
      temp.getSuperTypes().add(this);
      return temp;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
        return ((InternalEList<?>)getExtendTypes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
        return getExtendTypes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
        getExtendTypes().clear();
        getExtendTypes().addAll((Collection<? extends TypeReference>)newValue);
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
      case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
        getExtendTypes().clear();
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
      case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
        return extendTypes != null && !extendTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeParameterImpl
