/**
 */
package DsoaAdsl.impl;

import DsoaAdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsoaAdslFactoryImpl extends EFactoryImpl implements DsoaAdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsoaAdslFactory init() {
		try {
			DsoaAdslFactory theDsoaAdslFactory = (DsoaAdslFactory)EPackage.Registry.INSTANCE.getEFactory(DsoaAdslPackage.eNS_URI);
			if (theDsoaAdslFactory != null) {
				return theDsoaAdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DsoaAdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsoaAdslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DsoaAdslPackage.COMPONENT: return createComponent();
			case DsoaAdslPackage.SERVICE_SPECIFICATION: return createServiceSpecification();
			case DsoaAdslPackage.SERVICE_INTERFACE: return createServiceInterface();
			case DsoaAdslPackage.NON_FUNCTIONAL_SPECIFICATION: return createNonFunctionalSpecification();
			case DsoaAdslPackage.QO_SOFFER: return createQoSOffer();
			case DsoaAdslPackage.QO_SREQUEST: return createQoSRequest();
			case DsoaAdslPackage.OPERATION: return createOperation();
			case DsoaAdslPackage.ATTRIBUTABLE: return createAttributable();
			case DsoaAdslPackage.CONSTRAINT: return createConstraint();
			case DsoaAdslPackage.METRIC: return createMetric();
			case DsoaAdslPackage.QO_SATTRIBUTE: return createQoSAttribute();
			case DsoaAdslPackage.QO_SCATEGORY: return createQoSCategory();
			case DsoaAdslPackage.PROPERTY: return createProperty();
			case DsoaAdslPackage.SERVICE_COMPONENT_MODEL: return createServiceComponentModel();
			case DsoaAdslPackage.QO_SMODEL: return createQoSModel();
			case DsoaAdslPackage.SERVICE_MODEL: return createServiceModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DsoaAdslPackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DsoaAdslPackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSpecification createServiceSpecification() {
		ServiceSpecificationImpl serviceSpecification = new ServiceSpecificationImpl();
		return serviceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalSpecification createNonFunctionalSpecification() {
		NonFunctionalSpecificationImpl nonFunctionalSpecification = new NonFunctionalSpecificationImpl();
		return nonFunctionalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSOffer createQoSOffer() {
		QoSOfferImpl qoSOffer = new QoSOfferImpl();
		return qoSOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSRequest createQoSRequest() {
		QoSRequestImpl qoSRequest = new QoSRequestImpl();
		return qoSRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributable createAttributable() {
		AttributableImpl attributable = new AttributableImpl();
		return attributable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSAttribute createQoSAttribute() {
		QoSAttributeImpl qoSAttribute = new QoSAttributeImpl();
		return qoSAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSCategory createQoSCategory() {
		QoSCategoryImpl qoSCategory = new QoSCategoryImpl();
		return qoSCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponentModel createServiceComponentModel() {
		ServiceComponentModelImpl serviceComponentModel = new ServiceComponentModelImpl();
		return serviceComponentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoSModel createQoSModel() {
		QoSModelImpl qoSModel = new QoSModelImpl();
		return qoSModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceModel createServiceModel() {
		ServiceModelImpl serviceModel = new ServiceModelImpl();
		return serviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsoaAdslPackage getDsoaAdslPackage() {
		return (DsoaAdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DsoaAdslPackage getPackage() {
		return DsoaAdslPackage.eINSTANCE;
	}

} //DsoaAdslFactoryImpl
