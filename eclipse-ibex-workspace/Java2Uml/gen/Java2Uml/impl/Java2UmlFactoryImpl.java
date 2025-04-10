package Java2Uml.impl;

import Java2Uml.JavaClassifierToUmlClassifier;
import Java2Uml.JavaCompilationUnitToUmlModel;
import Java2Uml.JavaPackageToUmlPackage;
import Java2Uml.JavaAttributeToUmlProperty;
import Java2Uml.JavaClassifierReferenceToUmlGeneralization;
import Java2Uml.JavaMethodToOperation;
import Java2Uml.JavaConstructorToOperation;
import Java2Uml.JavaParameterToParameter;
import Java2Uml.JavaTypeReferenceToUmlReturnParameter;
import Java2Uml.JavaClassifierReferenceToUmlInterfaceRealization;
import Java2Uml.JavaEnumConstantToUmlEnumLiteral;
import Java2Uml.ClassAbstractToAbstract__Marker;
import Java2Uml.ClassAttributeToProperty__Marker;
import Java2Uml.ClassAttributeTypeToPropertyType__Marker;
import Java2Uml.ClassConstructorToConstructor__Marker;
import Java2Uml.ClassFinalToFinal__Marker;
import Java2Uml.ClassImplementToClassImplement__Marker;
import Java2Uml.ClassMethodToMethod__Marker;
import Java2Uml.ClassPrivateToPrivate__Marker;
import Java2Uml.ClassProtectedToProtected__Marker;
import Java2Uml.ClassPublicToPublic__Marker;
import Java2Uml.ClassToUmlClass__Marker;
import Java2Uml.ConstructorClassParamTypeToParamType__Marker;
import Java2Uml.ConstructorEnumParamTypeToParamType__Marker;
import Java2Uml.ConstructorInterfaceParamTypeToParamType__Marker;
import Java2Uml.EnumAbstractToAbstract__Marker;
import Java2Uml.EnumAttributeToProperty__Marker;
import Java2Uml.EnumAttributeTypeToPropertyType__Marker;
import Java2Uml.EnumConstantToEnumConstant__Marker;
import Java2Uml.EnumFinalToFinal__Marker;
import Java2Uml.EnumPrivateToPrivate__Marker;
import Java2Uml.EnumProtectedToProtected__Marker;
import Java2Uml.EnumPublicToPublic__Marker;
import Java2Uml.EnumToUmlEnum__Marker;
import Java2Uml.ExistingClassImplementToClassImplement__Marker;
import Java2Uml.ExistingSuperClassToSuperClass__Marker;
import Java2Uml.ExistingSuperInterfaceToSuperInterface__Marker;
import Java2Uml.FieldFinalToFinal__Marker;
import Java2Uml.FieldStaticToStatic__Marker;
import Java2Uml.InterfaceAbstractToAbstract__Marker;
import Java2Uml.InterfaceAttributeTypeToPropertyType__Marker;
import Java2Uml.InterfaceConstructorToConstructor__Marker;
import Java2Uml.InterfaceFinalToFinal__Marker;
import Java2Uml.InterfaceMethodToMethod__Marker;
import Java2Uml.InterfacePrivateToPrivate__Marker;
import Java2Uml.InterfaceProtectedToProtected__Marker;
import Java2Uml.InterfacePublicToPublic__Marker;
import Java2Uml.InterfaceToUmlInterface__Marker;
import Java2Uml.JavaCompilationUnitToExistingUmlModel__Marker;
import Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker;
import Java2Uml.MethodAbstractToAbstract__Marker;
import Java2Uml.MethodClassParamTypeToParamType__Marker;
import Java2Uml.MethodClassReturnTypeToReturnType__Marker;
import Java2Uml.MethodEnumParamTypeToParamType__Marker;
import Java2Uml.MethodEnumReturnTypeToReturnType__Marker;
import Java2Uml.MethodFinalToFinal__Marker;
import Java2Uml.MethodInterfaceParamTypeToParamType__Marker;
import Java2Uml.MethodInterfaceReturnTypeToReturnType__Marker;
import Java2Uml.MethodStaticToStatic__Marker;
import Java2Uml.OrdinaryConstructorParameterToParameter__Marker;
import Java2Uml.OrdinaryMethodParameterToParameter__Marker;
import Java2Uml.RootJavaPackageToUmlPackage__Marker;
import Java2Uml.SuperClassToSuperClass__Marker;
import Java2Uml.SuperInterfaceToSuperInterface__Marker;
import Java2Uml.VariableLengthConstructorParameterToParameter__Marker;
import Java2Uml.VariableLengthMethodParameterToParameter__Marker;


import Java2Uml.Java2UmlFactory;
import Java2Uml.Java2UmlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class Java2UmlFactoryImpl extends EFactoryImpl implements Java2Uml.Java2UmlFactory {

	public static Java2Uml.Java2UmlFactory init() {
		try {
			Java2UmlFactory theJava2UmlFactory = (Java2UmlFactory) EPackage.Registry.INSTANCE
					.getEFactory(Java2UmlPackage.eNS_URI);
			if (theJava2UmlFactory != null) {
				return theJava2UmlFactory;
			}
		} catch (java.lang.Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java2UmlFactoryImpl();
	}

	public Java2UmlFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Java2UmlPackage.JAVA_CLASSIFIER_TO_UML_CLASSIFIER:
			return createJavaClassifierToUmlClassifier();
		case Java2UmlPackage.JAVA_COMPILATION_UNIT_TO_UML_MODEL:
			return createJavaCompilationUnitToUmlModel();
		case Java2UmlPackage.JAVA_PACKAGE_TO_UML_PACKAGE:
			return createJavaPackageToUmlPackage();
		case Java2UmlPackage.JAVA_ATTRIBUTE_TO_UML_PROPERTY:
			return createJavaAttributeToUmlProperty();
		case Java2UmlPackage.JAVA_CLASSIFIER_REFERENCE_TO_UML_GENERALIZATION:
			return createJavaClassifierReferenceToUmlGeneralization();
		case Java2UmlPackage.JAVA_METHOD_TO_OPERATION:
			return createJavaMethodToOperation();
		case Java2UmlPackage.JAVA_CONSTRUCTOR_TO_OPERATION:
			return createJavaConstructorToOperation();
		case Java2UmlPackage.JAVA_PARAMETER_TO_PARAMETER:
			return createJavaParameterToParameter();
		case Java2UmlPackage.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER:
			return createJavaTypeReferenceToUmlReturnParameter();
		case Java2UmlPackage.JAVA_CLASSIFIER_REFERENCE_TO_UML_INTERFACE_REALIZATION:
			return createJavaClassifierReferenceToUmlInterfaceRealization();
		case Java2UmlPackage.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL:
			return createJavaEnumConstantToUmlEnumLiteral();
		case Java2UmlPackage.CLASS_ABSTRACT_TO_ABSTRACT___MARKER:
			return createClassAbstractToAbstract__Marker();
		case Java2UmlPackage.CLASS_ATTRIBUTE_TO_PROPERTY___MARKER:
			return createClassAttributeToProperty__Marker();
		case Java2UmlPackage.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER:
			return createClassAttributeTypeToPropertyType__Marker();
		case Java2UmlPackage.CLASS_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER:
			return createClassConstructorToConstructor__Marker();
		case Java2UmlPackage.CLASS_FINAL_TO_FINAL___MARKER:
			return createClassFinalToFinal__Marker();
		case Java2UmlPackage.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER:
			return createClassImplementToClassImplement__Marker();
		case Java2UmlPackage.CLASS_METHOD_TO_METHOD___MARKER:
			return createClassMethodToMethod__Marker();
		case Java2UmlPackage.CLASS_PRIVATE_TO_PRIVATE___MARKER:
			return createClassPrivateToPrivate__Marker();
		case Java2UmlPackage.CLASS_PROTECTED_TO_PROTECTED___MARKER:
			return createClassProtectedToProtected__Marker();
		case Java2UmlPackage.CLASS_PUBLIC_TO_PUBLIC___MARKER:
			return createClassPublicToPublic__Marker();
		case Java2UmlPackage.CLASS_TO_UML_CLASS___MARKER:
			return createClassToUmlClass__Marker();
		case Java2UmlPackage.CONSTRUCTOR_CLASS_PARAM_TYPE_TO_PARAM_TYPE___MARKER:
			return createConstructorClassParamTypeToParamType__Marker();
		case Java2UmlPackage.CONSTRUCTOR_ENUM_PARAM_TYPE_TO_PARAM_TYPE___MARKER:
			return createConstructorEnumParamTypeToParamType__Marker();
		case Java2UmlPackage.CONSTRUCTOR_INTERFACE_PARAM_TYPE_TO_PARAM_TYPE___MARKER:
			return createConstructorInterfaceParamTypeToParamType__Marker();
		case Java2UmlPackage.ENUM_ABSTRACT_TO_ABSTRACT___MARKER:
			return createEnumAbstractToAbstract__Marker();
		case Java2UmlPackage.ENUM_ATTRIBUTE_TO_PROPERTY___MARKER:
			return createEnumAttributeToProperty__Marker();
		case Java2UmlPackage.ENUM_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER:
			return createEnumAttributeTypeToPropertyType__Marker();
		case Java2UmlPackage.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER:
			return createEnumConstantToEnumConstant__Marker();
		case Java2UmlPackage.ENUM_FINAL_TO_FINAL___MARKER:
			return createEnumFinalToFinal__Marker();
		case Java2UmlPackage.ENUM_PRIVATE_TO_PRIVATE___MARKER:
			return createEnumPrivateToPrivate__Marker();
		case Java2UmlPackage.ENUM_PROTECTED_TO_PROTECTED___MARKER:
			return createEnumProtectedToProtected__Marker();
		case Java2UmlPackage.ENUM_PUBLIC_TO_PUBLIC___MARKER:
			return createEnumPublicToPublic__Marker();
		case Java2UmlPackage.ENUM_TO_UML_ENUM___MARKER:
			return createEnumToUmlEnum__Marker();
		case Java2UmlPackage.EXISTING_CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER:
			return createExistingClassImplementToClassImplement__Marker();
		case Java2UmlPackage.EXISTING_SUPER_CLASS_TO_SUPER_CLASS___MARKER:
			return createExistingSuperClassToSuperClass__Marker();
		case Java2UmlPackage.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER:
			return createExistingSuperInterfaceToSuperInterface__Marker();
		case Java2UmlPackage.FIELD_FINAL_TO_FINAL___MARKER:
			return createFieldFinalToFinal__Marker();
		case Java2UmlPackage.FIELD_STATIC_TO_STATIC___MARKER:
			return createFieldStaticToStatic__Marker();
		case Java2UmlPackage.INTERFACE_ABSTRACT_TO_ABSTRACT___MARKER:
			return createInterfaceAbstractToAbstract__Marker();
		case Java2UmlPackage.INTERFACE_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER:
			return createInterfaceAttributeTypeToPropertyType__Marker();
		case Java2UmlPackage.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER:
			return createInterfaceConstructorToConstructor__Marker();
		case Java2UmlPackage.INTERFACE_FINAL_TO_FINAL___MARKER:
			return createInterfaceFinalToFinal__Marker();
		case Java2UmlPackage.INTERFACE_METHOD_TO_METHOD___MARKER:
			return createInterfaceMethodToMethod__Marker();
		case Java2UmlPackage.INTERFACE_PRIVATE_TO_PRIVATE___MARKER:
			return createInterfacePrivateToPrivate__Marker();
		case Java2UmlPackage.INTERFACE_PROTECTED_TO_PROTECTED___MARKER:
			return createInterfaceProtectedToProtected__Marker();
		case Java2UmlPackage.INTERFACE_PUBLIC_TO_PUBLIC___MARKER:
			return createInterfacePublicToPublic__Marker();
		case Java2UmlPackage.INTERFACE_TO_UML_INTERFACE___MARKER:
			return createInterfaceToUmlInterface__Marker();
		case Java2UmlPackage.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER:
			return createJavaCompilationUnitToExistingUmlModel__Marker();
		case Java2UmlPackage.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER:
			return createJavaFirstCompilationUnitToUmlModel__Marker();
		case Java2UmlPackage.METHOD_ABSTRACT_TO_ABSTRACT___MARKER:
			return createMethodAbstractToAbstract__Marker();
		case Java2UmlPackage.METHOD_CLASS_PARAM_TYPE_TO_PARAM_TYPE___MARKER:
			return createMethodClassParamTypeToParamType__Marker();
		case Java2UmlPackage.METHOD_CLASS_RETURN_TYPE_TO_RETURN_TYPE___MARKER:
			return createMethodClassReturnTypeToReturnType__Marker();
		case Java2UmlPackage.METHOD_ENUM_PARAM_TYPE_TO_PARAM_TYPE___MARKER:
			return createMethodEnumParamTypeToParamType__Marker();
		case Java2UmlPackage.METHOD_ENUM_RETURN_TYPE_TO_RETURN_TYPE___MARKER:
			return createMethodEnumReturnTypeToReturnType__Marker();
		case Java2UmlPackage.METHOD_FINAL_TO_FINAL___MARKER:
			return createMethodFinalToFinal__Marker();
		case Java2UmlPackage.METHOD_INTERFACE_PARAM_TYPE_TO_PARAM_TYPE___MARKER:
			return createMethodInterfaceParamTypeToParamType__Marker();
		case Java2UmlPackage.METHOD_INTERFACE_RETURN_TYPE_TO_RETURN_TYPE___MARKER:
			return createMethodInterfaceReturnTypeToReturnType__Marker();
		case Java2UmlPackage.METHOD_STATIC_TO_STATIC___MARKER:
			return createMethodStaticToStatic__Marker();
		case Java2UmlPackage.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER:
			return createOrdinaryConstructorParameterToParameter__Marker();
		case Java2UmlPackage.ORDINARY_METHOD_PARAMETER_TO_PARAMETER___MARKER:
			return createOrdinaryMethodParameterToParameter__Marker();
		case Java2UmlPackage.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER:
			return createRootJavaPackageToUmlPackage__Marker();
		case Java2UmlPackage.SUPER_CLASS_TO_SUPER_CLASS___MARKER:
			return createSuperClassToSuperClass__Marker();
		case Java2UmlPackage.SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER:
			return createSuperInterfaceToSuperInterface__Marker();
		case Java2UmlPackage.VARIABLE_LENGTH_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER:
			return createVariableLengthConstructorParameterToParameter__Marker();
		case Java2UmlPackage.VARIABLE_LENGTH_METHOD_PARAMETER_TO_PARAMETER___MARKER:
			return createVariableLengthMethodParameterToParameter__Marker();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
	
	@Override
	public Java2Uml.JavaClassifierToUmlClassifier createJavaClassifierToUmlClassifier() {
		JavaClassifierToUmlClassifierImpl javaClassifierToUmlClassifier = new JavaClassifierToUmlClassifierImpl();
		return javaClassifierToUmlClassifier;
	}
	@Override
	public Java2Uml.JavaCompilationUnitToUmlModel createJavaCompilationUnitToUmlModel() {
		JavaCompilationUnitToUmlModelImpl javaCompilationUnitToUmlModel = new JavaCompilationUnitToUmlModelImpl();
		return javaCompilationUnitToUmlModel;
	}
	@Override
	public Java2Uml.JavaPackageToUmlPackage createJavaPackageToUmlPackage() {
		JavaPackageToUmlPackageImpl javaPackageToUmlPackage = new JavaPackageToUmlPackageImpl();
		return javaPackageToUmlPackage;
	}
	@Override
	public Java2Uml.JavaAttributeToUmlProperty createJavaAttributeToUmlProperty() {
		JavaAttributeToUmlPropertyImpl javaAttributeToUmlProperty = new JavaAttributeToUmlPropertyImpl();
		return javaAttributeToUmlProperty;
	}
	@Override
	public Java2Uml.JavaClassifierReferenceToUmlGeneralization createJavaClassifierReferenceToUmlGeneralization() {
		JavaClassifierReferenceToUmlGeneralizationImpl javaClassifierReferenceToUmlGeneralization = new JavaClassifierReferenceToUmlGeneralizationImpl();
		return javaClassifierReferenceToUmlGeneralization;
	}
	@Override
	public Java2Uml.JavaMethodToOperation createJavaMethodToOperation() {
		JavaMethodToOperationImpl javaMethodToOperation = new JavaMethodToOperationImpl();
		return javaMethodToOperation;
	}
	@Override
	public Java2Uml.JavaConstructorToOperation createJavaConstructorToOperation() {
		JavaConstructorToOperationImpl javaConstructorToOperation = new JavaConstructorToOperationImpl();
		return javaConstructorToOperation;
	}
	@Override
	public Java2Uml.JavaParameterToParameter createJavaParameterToParameter() {
		JavaParameterToParameterImpl javaParameterToParameter = new JavaParameterToParameterImpl();
		return javaParameterToParameter;
	}
	@Override
	public Java2Uml.JavaTypeReferenceToUmlReturnParameter createJavaTypeReferenceToUmlReturnParameter() {
		JavaTypeReferenceToUmlReturnParameterImpl javaTypeReferenceToUmlReturnParameter = new JavaTypeReferenceToUmlReturnParameterImpl();
		return javaTypeReferenceToUmlReturnParameter;
	}
	@Override
	public Java2Uml.JavaClassifierReferenceToUmlInterfaceRealization createJavaClassifierReferenceToUmlInterfaceRealization() {
		JavaClassifierReferenceToUmlInterfaceRealizationImpl javaClassifierReferenceToUmlInterfaceRealization = new JavaClassifierReferenceToUmlInterfaceRealizationImpl();
		return javaClassifierReferenceToUmlInterfaceRealization;
	}
	@Override
	public Java2Uml.JavaEnumConstantToUmlEnumLiteral createJavaEnumConstantToUmlEnumLiteral() {
		JavaEnumConstantToUmlEnumLiteralImpl javaEnumConstantToUmlEnumLiteral = new JavaEnumConstantToUmlEnumLiteralImpl();
		return javaEnumConstantToUmlEnumLiteral;
	}
	@Override
	public Java2Uml.ClassAbstractToAbstract__Marker createClassAbstractToAbstract__Marker() {
		ClassAbstractToAbstract__MarkerImpl classAbstractToAbstract__Marker = new ClassAbstractToAbstract__MarkerImpl();
		return classAbstractToAbstract__Marker;
	}
	@Override
	public Java2Uml.ClassAttributeToProperty__Marker createClassAttributeToProperty__Marker() {
		ClassAttributeToProperty__MarkerImpl classAttributeToProperty__Marker = new ClassAttributeToProperty__MarkerImpl();
		return classAttributeToProperty__Marker;
	}
	@Override
	public Java2Uml.ClassAttributeTypeToPropertyType__Marker createClassAttributeTypeToPropertyType__Marker() {
		ClassAttributeTypeToPropertyType__MarkerImpl classAttributeTypeToPropertyType__Marker = new ClassAttributeTypeToPropertyType__MarkerImpl();
		return classAttributeTypeToPropertyType__Marker;
	}
	@Override
	public Java2Uml.ClassConstructorToConstructor__Marker createClassConstructorToConstructor__Marker() {
		ClassConstructorToConstructor__MarkerImpl classConstructorToConstructor__Marker = new ClassConstructorToConstructor__MarkerImpl();
		return classConstructorToConstructor__Marker;
	}
	@Override
	public Java2Uml.ClassFinalToFinal__Marker createClassFinalToFinal__Marker() {
		ClassFinalToFinal__MarkerImpl classFinalToFinal__Marker = new ClassFinalToFinal__MarkerImpl();
		return classFinalToFinal__Marker;
	}
	@Override
	public Java2Uml.ClassImplementToClassImplement__Marker createClassImplementToClassImplement__Marker() {
		ClassImplementToClassImplement__MarkerImpl classImplementToClassImplement__Marker = new ClassImplementToClassImplement__MarkerImpl();
		return classImplementToClassImplement__Marker;
	}
	@Override
	public Java2Uml.ClassMethodToMethod__Marker createClassMethodToMethod__Marker() {
		ClassMethodToMethod__MarkerImpl classMethodToMethod__Marker = new ClassMethodToMethod__MarkerImpl();
		return classMethodToMethod__Marker;
	}
	@Override
	public Java2Uml.ClassPrivateToPrivate__Marker createClassPrivateToPrivate__Marker() {
		ClassPrivateToPrivate__MarkerImpl classPrivateToPrivate__Marker = new ClassPrivateToPrivate__MarkerImpl();
		return classPrivateToPrivate__Marker;
	}
	@Override
	public Java2Uml.ClassProtectedToProtected__Marker createClassProtectedToProtected__Marker() {
		ClassProtectedToProtected__MarkerImpl classProtectedToProtected__Marker = new ClassProtectedToProtected__MarkerImpl();
		return classProtectedToProtected__Marker;
	}
	@Override
	public Java2Uml.ClassPublicToPublic__Marker createClassPublicToPublic__Marker() {
		ClassPublicToPublic__MarkerImpl classPublicToPublic__Marker = new ClassPublicToPublic__MarkerImpl();
		return classPublicToPublic__Marker;
	}
	@Override
	public Java2Uml.ClassToUmlClass__Marker createClassToUmlClass__Marker() {
		ClassToUmlClass__MarkerImpl classToUmlClass__Marker = new ClassToUmlClass__MarkerImpl();
		return classToUmlClass__Marker;
	}
	@Override
	public Java2Uml.ConstructorClassParamTypeToParamType__Marker createConstructorClassParamTypeToParamType__Marker() {
		ConstructorClassParamTypeToParamType__MarkerImpl constructorClassParamTypeToParamType__Marker = new ConstructorClassParamTypeToParamType__MarkerImpl();
		return constructorClassParamTypeToParamType__Marker;
	}
	@Override
	public Java2Uml.ConstructorEnumParamTypeToParamType__Marker createConstructorEnumParamTypeToParamType__Marker() {
		ConstructorEnumParamTypeToParamType__MarkerImpl constructorEnumParamTypeToParamType__Marker = new ConstructorEnumParamTypeToParamType__MarkerImpl();
		return constructorEnumParamTypeToParamType__Marker;
	}
	@Override
	public Java2Uml.ConstructorInterfaceParamTypeToParamType__Marker createConstructorInterfaceParamTypeToParamType__Marker() {
		ConstructorInterfaceParamTypeToParamType__MarkerImpl constructorInterfaceParamTypeToParamType__Marker = new ConstructorInterfaceParamTypeToParamType__MarkerImpl();
		return constructorInterfaceParamTypeToParamType__Marker;
	}
	@Override
	public Java2Uml.EnumAbstractToAbstract__Marker createEnumAbstractToAbstract__Marker() {
		EnumAbstractToAbstract__MarkerImpl enumAbstractToAbstract__Marker = new EnumAbstractToAbstract__MarkerImpl();
		return enumAbstractToAbstract__Marker;
	}
	@Override
	public Java2Uml.EnumAttributeToProperty__Marker createEnumAttributeToProperty__Marker() {
		EnumAttributeToProperty__MarkerImpl enumAttributeToProperty__Marker = new EnumAttributeToProperty__MarkerImpl();
		return enumAttributeToProperty__Marker;
	}
	@Override
	public Java2Uml.EnumAttributeTypeToPropertyType__Marker createEnumAttributeTypeToPropertyType__Marker() {
		EnumAttributeTypeToPropertyType__MarkerImpl enumAttributeTypeToPropertyType__Marker = new EnumAttributeTypeToPropertyType__MarkerImpl();
		return enumAttributeTypeToPropertyType__Marker;
	}
	@Override
	public Java2Uml.EnumConstantToEnumConstant__Marker createEnumConstantToEnumConstant__Marker() {
		EnumConstantToEnumConstant__MarkerImpl enumConstantToEnumConstant__Marker = new EnumConstantToEnumConstant__MarkerImpl();
		return enumConstantToEnumConstant__Marker;
	}
	@Override
	public Java2Uml.EnumFinalToFinal__Marker createEnumFinalToFinal__Marker() {
		EnumFinalToFinal__MarkerImpl enumFinalToFinal__Marker = new EnumFinalToFinal__MarkerImpl();
		return enumFinalToFinal__Marker;
	}
	@Override
	public Java2Uml.EnumPrivateToPrivate__Marker createEnumPrivateToPrivate__Marker() {
		EnumPrivateToPrivate__MarkerImpl enumPrivateToPrivate__Marker = new EnumPrivateToPrivate__MarkerImpl();
		return enumPrivateToPrivate__Marker;
	}
	@Override
	public Java2Uml.EnumProtectedToProtected__Marker createEnumProtectedToProtected__Marker() {
		EnumProtectedToProtected__MarkerImpl enumProtectedToProtected__Marker = new EnumProtectedToProtected__MarkerImpl();
		return enumProtectedToProtected__Marker;
	}
	@Override
	public Java2Uml.EnumPublicToPublic__Marker createEnumPublicToPublic__Marker() {
		EnumPublicToPublic__MarkerImpl enumPublicToPublic__Marker = new EnumPublicToPublic__MarkerImpl();
		return enumPublicToPublic__Marker;
	}
	@Override
	public Java2Uml.EnumToUmlEnum__Marker createEnumToUmlEnum__Marker() {
		EnumToUmlEnum__MarkerImpl enumToUmlEnum__Marker = new EnumToUmlEnum__MarkerImpl();
		return enumToUmlEnum__Marker;
	}
	@Override
	public Java2Uml.ExistingClassImplementToClassImplement__Marker createExistingClassImplementToClassImplement__Marker() {
		ExistingClassImplementToClassImplement__MarkerImpl existingClassImplementToClassImplement__Marker = new ExistingClassImplementToClassImplement__MarkerImpl();
		return existingClassImplementToClassImplement__Marker;
	}
	@Override
	public Java2Uml.ExistingSuperClassToSuperClass__Marker createExistingSuperClassToSuperClass__Marker() {
		ExistingSuperClassToSuperClass__MarkerImpl existingSuperClassToSuperClass__Marker = new ExistingSuperClassToSuperClass__MarkerImpl();
		return existingSuperClassToSuperClass__Marker;
	}
	@Override
	public Java2Uml.ExistingSuperInterfaceToSuperInterface__Marker createExistingSuperInterfaceToSuperInterface__Marker() {
		ExistingSuperInterfaceToSuperInterface__MarkerImpl existingSuperInterfaceToSuperInterface__Marker = new ExistingSuperInterfaceToSuperInterface__MarkerImpl();
		return existingSuperInterfaceToSuperInterface__Marker;
	}
	@Override
	public Java2Uml.FieldFinalToFinal__Marker createFieldFinalToFinal__Marker() {
		FieldFinalToFinal__MarkerImpl fieldFinalToFinal__Marker = new FieldFinalToFinal__MarkerImpl();
		return fieldFinalToFinal__Marker;
	}
	@Override
	public Java2Uml.FieldStaticToStatic__Marker createFieldStaticToStatic__Marker() {
		FieldStaticToStatic__MarkerImpl fieldStaticToStatic__Marker = new FieldStaticToStatic__MarkerImpl();
		return fieldStaticToStatic__Marker;
	}
	@Override
	public Java2Uml.InterfaceAbstractToAbstract__Marker createInterfaceAbstractToAbstract__Marker() {
		InterfaceAbstractToAbstract__MarkerImpl interfaceAbstractToAbstract__Marker = new InterfaceAbstractToAbstract__MarkerImpl();
		return interfaceAbstractToAbstract__Marker;
	}
	@Override
	public Java2Uml.InterfaceAttributeTypeToPropertyType__Marker createInterfaceAttributeTypeToPropertyType__Marker() {
		InterfaceAttributeTypeToPropertyType__MarkerImpl interfaceAttributeTypeToPropertyType__Marker = new InterfaceAttributeTypeToPropertyType__MarkerImpl();
		return interfaceAttributeTypeToPropertyType__Marker;
	}
	@Override
	public Java2Uml.InterfaceConstructorToConstructor__Marker createInterfaceConstructorToConstructor__Marker() {
		InterfaceConstructorToConstructor__MarkerImpl interfaceConstructorToConstructor__Marker = new InterfaceConstructorToConstructor__MarkerImpl();
		return interfaceConstructorToConstructor__Marker;
	}
	@Override
	public Java2Uml.InterfaceFinalToFinal__Marker createInterfaceFinalToFinal__Marker() {
		InterfaceFinalToFinal__MarkerImpl interfaceFinalToFinal__Marker = new InterfaceFinalToFinal__MarkerImpl();
		return interfaceFinalToFinal__Marker;
	}
	@Override
	public Java2Uml.InterfaceMethodToMethod__Marker createInterfaceMethodToMethod__Marker() {
		InterfaceMethodToMethod__MarkerImpl interfaceMethodToMethod__Marker = new InterfaceMethodToMethod__MarkerImpl();
		return interfaceMethodToMethod__Marker;
	}
	@Override
	public Java2Uml.InterfacePrivateToPrivate__Marker createInterfacePrivateToPrivate__Marker() {
		InterfacePrivateToPrivate__MarkerImpl interfacePrivateToPrivate__Marker = new InterfacePrivateToPrivate__MarkerImpl();
		return interfacePrivateToPrivate__Marker;
	}
	@Override
	public Java2Uml.InterfaceProtectedToProtected__Marker createInterfaceProtectedToProtected__Marker() {
		InterfaceProtectedToProtected__MarkerImpl interfaceProtectedToProtected__Marker = new InterfaceProtectedToProtected__MarkerImpl();
		return interfaceProtectedToProtected__Marker;
	}
	@Override
	public Java2Uml.InterfacePublicToPublic__Marker createInterfacePublicToPublic__Marker() {
		InterfacePublicToPublic__MarkerImpl interfacePublicToPublic__Marker = new InterfacePublicToPublic__MarkerImpl();
		return interfacePublicToPublic__Marker;
	}
	@Override
	public Java2Uml.InterfaceToUmlInterface__Marker createInterfaceToUmlInterface__Marker() {
		InterfaceToUmlInterface__MarkerImpl interfaceToUmlInterface__Marker = new InterfaceToUmlInterface__MarkerImpl();
		return interfaceToUmlInterface__Marker;
	}
	@Override
	public Java2Uml.JavaCompilationUnitToExistingUmlModel__Marker createJavaCompilationUnitToExistingUmlModel__Marker() {
		JavaCompilationUnitToExistingUmlModel__MarkerImpl javaCompilationUnitToExistingUmlModel__Marker = new JavaCompilationUnitToExistingUmlModel__MarkerImpl();
		return javaCompilationUnitToExistingUmlModel__Marker;
	}
	@Override
	public Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker createJavaFirstCompilationUnitToUmlModel__Marker() {
		JavaFirstCompilationUnitToUmlModel__MarkerImpl javaFirstCompilationUnitToUmlModel__Marker = new JavaFirstCompilationUnitToUmlModel__MarkerImpl();
		return javaFirstCompilationUnitToUmlModel__Marker;
	}
	@Override
	public Java2Uml.MethodAbstractToAbstract__Marker createMethodAbstractToAbstract__Marker() {
		MethodAbstractToAbstract__MarkerImpl methodAbstractToAbstract__Marker = new MethodAbstractToAbstract__MarkerImpl();
		return methodAbstractToAbstract__Marker;
	}
	@Override
	public Java2Uml.MethodClassParamTypeToParamType__Marker createMethodClassParamTypeToParamType__Marker() {
		MethodClassParamTypeToParamType__MarkerImpl methodClassParamTypeToParamType__Marker = new MethodClassParamTypeToParamType__MarkerImpl();
		return methodClassParamTypeToParamType__Marker;
	}
	@Override
	public Java2Uml.MethodClassReturnTypeToReturnType__Marker createMethodClassReturnTypeToReturnType__Marker() {
		MethodClassReturnTypeToReturnType__MarkerImpl methodClassReturnTypeToReturnType__Marker = new MethodClassReturnTypeToReturnType__MarkerImpl();
		return methodClassReturnTypeToReturnType__Marker;
	}
	@Override
	public Java2Uml.MethodEnumParamTypeToParamType__Marker createMethodEnumParamTypeToParamType__Marker() {
		MethodEnumParamTypeToParamType__MarkerImpl methodEnumParamTypeToParamType__Marker = new MethodEnumParamTypeToParamType__MarkerImpl();
		return methodEnumParamTypeToParamType__Marker;
	}
	@Override
	public Java2Uml.MethodEnumReturnTypeToReturnType__Marker createMethodEnumReturnTypeToReturnType__Marker() {
		MethodEnumReturnTypeToReturnType__MarkerImpl methodEnumReturnTypeToReturnType__Marker = new MethodEnumReturnTypeToReturnType__MarkerImpl();
		return methodEnumReturnTypeToReturnType__Marker;
	}
	@Override
	public Java2Uml.MethodFinalToFinal__Marker createMethodFinalToFinal__Marker() {
		MethodFinalToFinal__MarkerImpl methodFinalToFinal__Marker = new MethodFinalToFinal__MarkerImpl();
		return methodFinalToFinal__Marker;
	}
	@Override
	public Java2Uml.MethodInterfaceParamTypeToParamType__Marker createMethodInterfaceParamTypeToParamType__Marker() {
		MethodInterfaceParamTypeToParamType__MarkerImpl methodInterfaceParamTypeToParamType__Marker = new MethodInterfaceParamTypeToParamType__MarkerImpl();
		return methodInterfaceParamTypeToParamType__Marker;
	}
	@Override
	public Java2Uml.MethodInterfaceReturnTypeToReturnType__Marker createMethodInterfaceReturnTypeToReturnType__Marker() {
		MethodInterfaceReturnTypeToReturnType__MarkerImpl methodInterfaceReturnTypeToReturnType__Marker = new MethodInterfaceReturnTypeToReturnType__MarkerImpl();
		return methodInterfaceReturnTypeToReturnType__Marker;
	}
	@Override
	public Java2Uml.MethodStaticToStatic__Marker createMethodStaticToStatic__Marker() {
		MethodStaticToStatic__MarkerImpl methodStaticToStatic__Marker = new MethodStaticToStatic__MarkerImpl();
		return methodStaticToStatic__Marker;
	}
	@Override
	public Java2Uml.OrdinaryConstructorParameterToParameter__Marker createOrdinaryConstructorParameterToParameter__Marker() {
		OrdinaryConstructorParameterToParameter__MarkerImpl ordinaryConstructorParameterToParameter__Marker = new OrdinaryConstructorParameterToParameter__MarkerImpl();
		return ordinaryConstructorParameterToParameter__Marker;
	}
	@Override
	public Java2Uml.OrdinaryMethodParameterToParameter__Marker createOrdinaryMethodParameterToParameter__Marker() {
		OrdinaryMethodParameterToParameter__MarkerImpl ordinaryMethodParameterToParameter__Marker = new OrdinaryMethodParameterToParameter__MarkerImpl();
		return ordinaryMethodParameterToParameter__Marker;
	}
	@Override
	public Java2Uml.RootJavaPackageToUmlPackage__Marker createRootJavaPackageToUmlPackage__Marker() {
		RootJavaPackageToUmlPackage__MarkerImpl rootJavaPackageToUmlPackage__Marker = new RootJavaPackageToUmlPackage__MarkerImpl();
		return rootJavaPackageToUmlPackage__Marker;
	}
	@Override
	public Java2Uml.SuperClassToSuperClass__Marker createSuperClassToSuperClass__Marker() {
		SuperClassToSuperClass__MarkerImpl superClassToSuperClass__Marker = new SuperClassToSuperClass__MarkerImpl();
		return superClassToSuperClass__Marker;
	}
	@Override
	public Java2Uml.SuperInterfaceToSuperInterface__Marker createSuperInterfaceToSuperInterface__Marker() {
		SuperInterfaceToSuperInterface__MarkerImpl superInterfaceToSuperInterface__Marker = new SuperInterfaceToSuperInterface__MarkerImpl();
		return superInterfaceToSuperInterface__Marker;
	}
	@Override
	public Java2Uml.VariableLengthConstructorParameterToParameter__Marker createVariableLengthConstructorParameterToParameter__Marker() {
		VariableLengthConstructorParameterToParameter__MarkerImpl variableLengthConstructorParameterToParameter__Marker = new VariableLengthConstructorParameterToParameter__MarkerImpl();
		return variableLengthConstructorParameterToParameter__Marker;
	}
	@Override
	public Java2Uml.VariableLengthMethodParameterToParameter__Marker createVariableLengthMethodParameterToParameter__Marker() {
		VariableLengthMethodParameterToParameter__MarkerImpl variableLengthMethodParameterToParameter__Marker = new VariableLengthMethodParameterToParameter__MarkerImpl();
		return variableLengthMethodParameterToParameter__Marker;
	}
	

	@Override
	public Java2UmlPackage getJava2UmlPackage() {
	return (Java2UmlPackage) getEPackage();
	}
} 
