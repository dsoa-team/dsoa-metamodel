/**
 */
package DsoaAdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DsoaAdsl.DsoaAdslFactory
 * @model kind="package"
 * @generated
 */
public interface DsoaAdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DsoaAdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsoaURI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsoa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsoaAdslPackage eINSTANCE = DsoaAdsl.impl.DsoaAdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.ComponentImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRES = 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.ServiceSpecificationImpl <em>Service Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.ServiceSpecificationImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceSpecification()
	 * @generated
	 */
	int SERVICE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__DEFINES = 0;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__REALIZES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.AttributableImpl <em>Attributable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.AttributableImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getAttributable()
	 * @generated
	 */
	int ATTRIBUTABLE = 7;

	/**
	 * The number of structural features of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attributable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.ServiceInterfaceImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__HAS = ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__CLASS_NAME = ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_FEATURE_COUNT = ATTRIBUTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_OPERATION_COUNT = ATTRIBUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.NonFunctionalSpecificationImpl <em>Non Functional Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.NonFunctionalSpecificationImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getNonFunctionalSpecification()
	 * @generated
	 */
	int NON_FUNCTIONAL_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_SPECIFICATION__SPECIFIES = 0;

	/**
	 * The number of structural features of the '<em>Non Functional Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Non Functional Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.QoSOfferImpl <em>Qo SOffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.QoSOfferImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSOffer()
	 * @generated
	 */
	int QO_SOFFER = 4;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFER__SPECIFIES = NON_FUNCTIONAL_SPECIFICATION__SPECIFIES;

	/**
	 * The number of structural features of the '<em>Qo SOffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFER_FEATURE_COUNT = NON_FUNCTIONAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qo SOffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SOFFER_OPERATION_COUNT = NON_FUNCTIONAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.QoSRequestImpl <em>Qo SRequest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.QoSRequestImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSRequest()
	 * @generated
	 */
	int QO_SREQUEST = 5;

	/**
	 * The feature id for the '<em><b>Specifies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUEST__SPECIFIES = NON_FUNCTIONAL_SPECIFICATION__SPECIFIES;

	/**
	 * The number of structural features of the '<em>Qo SRequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUEST_FEATURE_COUNT = NON_FUNCTIONAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qo SRequest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SREQUEST_OPERATION_COUNT = NON_FUNCTIONAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.OperationImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ATTRIBUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ATTRIBUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = ATTRIBUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.ConstraintImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__THRESHOLD = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Is Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__IS_RELATED_TO = 3;

	/**
	 * The feature id for the '<em><b>Constrains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINS = 4;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.MetricImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DATA = 3;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.QoSAttributeImpl <em>Qo SAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.QoSAttributeImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSAttribute()
	 * @generated
	 */
	int QO_SATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Is Measured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SATTRIBUTE__IS_MEASURED_BY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SATTRIBUTE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Qo SAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Qo SAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.QoSCategoryImpl <em>Qo SCategory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.QoSCategoryImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSCategory()
	 * @generated
	 */
	int QO_SCATEGORY = 11;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY__CONTAINS = 3;

	/**
	 * The number of structural features of the '<em>Qo SCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Qo SCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SCATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.PropertyImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.ServiceComponentModelImpl <em>Service Component Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.ServiceComponentModelImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceComponentModel()
	 * @generated
	 */
	int SERVICE_COMPONENT_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_MODEL__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_MODEL__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service Component Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Component Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.QoSModelImpl <em>Qo SModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.QoSModelImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSModel()
	 * @generated
	 */
	int QO_SMODEL = 14;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SMODEL__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SMODEL__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SMODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Qo SModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SMODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Qo SModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.impl.ServiceModelImpl <em>Service Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.impl.ServiceModelImpl
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceModel()
	 * @generated
	 */
	int SERVICE_MODEL = 15;

	/**
	 * The feature id for the '<em><b>Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__REGISTERS = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL__URI = 1;

	/**
	 * The number of structural features of the '<em>Service Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DsoaAdsl.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DsoaAdsl.RelationalOperator
	 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 16;


	/**
	 * Returns the meta object for class '{@link DsoaAdsl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see DsoaAdsl.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.Component#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provides</em>'.
	 * @see DsoaAdsl.Component#getProvides()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Provides();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see DsoaAdsl.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Component#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see DsoaAdsl.Component#getClassName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ClassName();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.Component#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see DsoaAdsl.Component#getRequires()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Requires();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.ServiceSpecification <em>Service Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Specification</em>'.
	 * @see DsoaAdsl.ServiceSpecification
	 * @generated
	 */
	EClass getServiceSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link DsoaAdsl.ServiceSpecification#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defines</em>'.
	 * @see DsoaAdsl.ServiceSpecification#getDefines()
	 * @see #getServiceSpecification()
	 * @generated
	 */
	EReference getServiceSpecification_Defines();

	/**
	 * Returns the meta object for the reference '{@link DsoaAdsl.ServiceSpecification#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see DsoaAdsl.ServiceSpecification#getRealizes()
	 * @see #getServiceSpecification()
	 * @generated
	 */
	EReference getServiceSpecification_Realizes();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.ServiceSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.ServiceSpecification#getName()
	 * @see #getServiceSpecification()
	 * @generated
	 */
	EAttribute getServiceSpecification_Name();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface</em>'.
	 * @see DsoaAdsl.ServiceInterface
	 * @generated
	 */
	EClass getServiceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.ServiceInterface#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see DsoaAdsl.ServiceInterface#getHas()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Has();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.ServiceInterface#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see DsoaAdsl.ServiceInterface#getClassName()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_ClassName();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.NonFunctionalSpecification <em>Non Functional Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Functional Specification</em>'.
	 * @see DsoaAdsl.NonFunctionalSpecification
	 * @generated
	 */
	EClass getNonFunctionalSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.NonFunctionalSpecification#getSpecifies <em>Specifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifies</em>'.
	 * @see DsoaAdsl.NonFunctionalSpecification#getSpecifies()
	 * @see #getNonFunctionalSpecification()
	 * @generated
	 */
	EReference getNonFunctionalSpecification_Specifies();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.QoSOffer <em>Qo SOffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SOffer</em>'.
	 * @see DsoaAdsl.QoSOffer
	 * @generated
	 */
	EClass getQoSOffer();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.QoSRequest <em>Qo SRequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SRequest</em>'.
	 * @see DsoaAdsl.QoSRequest
	 * @generated
	 */
	EClass getQoSRequest();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see DsoaAdsl.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.Attributable <em>Attributable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributable</em>'.
	 * @see DsoaAdsl.Attributable
	 * @generated
	 */
	EClass getAttributable();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see DsoaAdsl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see DsoaAdsl.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Constraint#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see DsoaAdsl.Constraint#getThreshold()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Constraint#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see DsoaAdsl.Constraint#getWeight()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Weight();

	/**
	 * Returns the meta object for the reference '{@link DsoaAdsl.Constraint#getIsRelatedTo <em>Is Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Related To</em>'.
	 * @see DsoaAdsl.Constraint#getIsRelatedTo()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_IsRelatedTo();

	/**
	 * Returns the meta object for the reference '{@link DsoaAdsl.Constraint#getConstrains <em>Constrains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constrains</em>'.
	 * @see DsoaAdsl.Constraint#getConstrains()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Constrains();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see DsoaAdsl.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see DsoaAdsl.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.Metric#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see DsoaAdsl.Metric#getMetadata()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.Metric#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see DsoaAdsl.Metric#getData()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Data();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.QoSAttribute <em>Qo SAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SAttribute</em>'.
	 * @see DsoaAdsl.QoSAttribute
	 * @generated
	 */
	EClass getQoSAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.QoSAttribute#getIsMeasuredBy <em>Is Measured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Measured By</em>'.
	 * @see DsoaAdsl.QoSAttribute#getIsMeasuredBy()
	 * @see #getQoSAttribute()
	 * @generated
	 */
	EReference getQoSAttribute_IsMeasuredBy();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.QoSAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.QoSAttribute#getName()
	 * @see #getQoSAttribute()
	 * @generated
	 */
	EAttribute getQoSAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.QoSAttribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see DsoaAdsl.QoSAttribute#getDescription()
	 * @see #getQoSAttribute()
	 * @generated
	 */
	EAttribute getQoSAttribute_Description();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.QoSCategory <em>Qo SCategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SCategory</em>'.
	 * @see DsoaAdsl.QoSCategory
	 * @generated
	 */
	EClass getQoSCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.QoSCategory#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see DsoaAdsl.QoSCategory#getGroups()
	 * @see #getQoSCategory()
	 * @generated
	 */
	EReference getQoSCategory_Groups();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.QoSCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.QoSCategory#getName()
	 * @see #getQoSCategory()
	 * @generated
	 */
	EAttribute getQoSCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.QoSCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see DsoaAdsl.QoSCategory#getDescription()
	 * @see #getQoSCategory()
	 * @generated
	 */
	EAttribute getQoSCategory_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.QoSCategory#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see DsoaAdsl.QoSCategory#getContains()
	 * @see #getQoSCategory()
	 * @generated
	 */
	EReference getQoSCategory_Contains();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see DsoaAdsl.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DsoaAdsl.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.ServiceComponentModel <em>Service Component Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Component Model</em>'.
	 * @see DsoaAdsl.ServiceComponentModel
	 * @generated
	 */
	EClass getServiceComponentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.ServiceComponentModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see DsoaAdsl.ServiceComponentModel#getComponents()
	 * @see #getServiceComponentModel()
	 * @generated
	 */
	EReference getServiceComponentModel_Components();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.ServiceComponentModel#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see DsoaAdsl.ServiceComponentModel#getPackage()
	 * @see #getServiceComponentModel()
	 * @generated
	 */
	EAttribute getServiceComponentModel_Package();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.ServiceComponentModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.ServiceComponentModel#getName()
	 * @see #getServiceComponentModel()
	 * @generated
	 */
	EAttribute getServiceComponentModel_Name();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.QoSModel <em>Qo SModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SModel</em>'.
	 * @see DsoaAdsl.QoSModel
	 * @generated
	 */
	EClass getQoSModel();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.QoSModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see DsoaAdsl.QoSModel#getElements()
	 * @see #getQoSModel()
	 * @generated
	 */
	EReference getQoSModel_Elements();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.QoSModel#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see DsoaAdsl.QoSModel#getPackage()
	 * @see #getQoSModel()
	 * @generated
	 */
	EAttribute getQoSModel_Package();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.QoSModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DsoaAdsl.QoSModel#getName()
	 * @see #getQoSModel()
	 * @generated
	 */
	EAttribute getQoSModel_Name();

	/**
	 * Returns the meta object for class '{@link DsoaAdsl.ServiceModel <em>Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Model</em>'.
	 * @see DsoaAdsl.ServiceModel
	 * @generated
	 */
	EClass getServiceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link DsoaAdsl.ServiceModel#getRegisters <em>Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registers</em>'.
	 * @see DsoaAdsl.ServiceModel#getRegisters()
	 * @see #getServiceModel()
	 * @generated
	 */
	EReference getServiceModel_Registers();

	/**
	 * Returns the meta object for the attribute '{@link DsoaAdsl.ServiceModel#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see DsoaAdsl.ServiceModel#getUri()
	 * @see #getServiceModel()
	 * @generated
	 */
	EAttribute getServiceModel_Uri();

	/**
	 * Returns the meta object for enum '{@link DsoaAdsl.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see DsoaAdsl.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DsoaAdslFactory getDsoaAdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.ComponentImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDES = eINSTANCE.getComponent_Provides();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CLASS_NAME = eINSTANCE.getComponent_ClassName();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRES = eINSTANCE.getComponent_Requires();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.ServiceSpecificationImpl <em>Service Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.ServiceSpecificationImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceSpecification()
		 * @generated
		 */
		EClass SERVICE_SPECIFICATION = eINSTANCE.getServiceSpecification();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION__DEFINES = eINSTANCE.getServiceSpecification_Defines();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SPECIFICATION__REALIZES = eINSTANCE.getServiceSpecification_Realizes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SPECIFICATION__NAME = eINSTANCE.getServiceSpecification_Name();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.ServiceInterfaceImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceInterface()
		 * @generated
		 */
		EClass SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__HAS = eINSTANCE.getServiceInterface_Has();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__CLASS_NAME = eINSTANCE.getServiceInterface_ClassName();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.NonFunctionalSpecificationImpl <em>Non Functional Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.NonFunctionalSpecificationImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getNonFunctionalSpecification()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_SPECIFICATION = eINSTANCE.getNonFunctionalSpecification();

		/**
		 * The meta object literal for the '<em><b>Specifies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_FUNCTIONAL_SPECIFICATION__SPECIFIES = eINSTANCE.getNonFunctionalSpecification_Specifies();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.QoSOfferImpl <em>Qo SOffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.QoSOfferImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSOffer()
		 * @generated
		 */
		EClass QO_SOFFER = eINSTANCE.getQoSOffer();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.QoSRequestImpl <em>Qo SRequest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.QoSRequestImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSRequest()
		 * @generated
		 */
		EClass QO_SREQUEST = eINSTANCE.getQoSRequest();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.OperationImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.AttributableImpl <em>Attributable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.AttributableImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getAttributable()
		 * @generated
		 */
		EClass ATTRIBUTABLE = eINSTANCE.getAttributable();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.ConstraintImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__THRESHOLD = eINSTANCE.getConstraint_Threshold();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__WEIGHT = eINSTANCE.getConstraint_Weight();

		/**
		 * The meta object literal for the '<em><b>Is Related To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__IS_RELATED_TO = eINSTANCE.getConstraint_IsRelatedTo();

		/**
		 * The meta object literal for the '<em><b>Constrains</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINS = eINSTANCE.getConstraint_Constrains();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.MetricImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__METADATA = eINSTANCE.getMetric_Metadata();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__DATA = eINSTANCE.getMetric_Data();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.QoSAttributeImpl <em>Qo SAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.QoSAttributeImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSAttribute()
		 * @generated
		 */
		EClass QO_SATTRIBUTE = eINSTANCE.getQoSAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Measured By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SATTRIBUTE__IS_MEASURED_BY = eINSTANCE.getQoSAttribute_IsMeasuredBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SATTRIBUTE__NAME = eINSTANCE.getQoSAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SATTRIBUTE__DESCRIPTION = eINSTANCE.getQoSAttribute_Description();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.QoSCategoryImpl <em>Qo SCategory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.QoSCategoryImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSCategory()
		 * @generated
		 */
		EClass QO_SCATEGORY = eINSTANCE.getQoSCategory();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCATEGORY__GROUPS = eINSTANCE.getQoSCategory_Groups();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SCATEGORY__NAME = eINSTANCE.getQoSCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SCATEGORY__DESCRIPTION = eINSTANCE.getQoSCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SCATEGORY__CONTAINS = eINSTANCE.getQoSCategory_Contains();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.PropertyImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.ServiceComponentModelImpl <em>Service Component Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.ServiceComponentModelImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceComponentModel()
		 * @generated
		 */
		EClass SERVICE_COMPONENT_MODEL = eINSTANCE.getServiceComponentModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT_MODEL__COMPONENTS = eINSTANCE.getServiceComponentModel_Components();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT_MODEL__PACKAGE = eINSTANCE.getServiceComponentModel_Package();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT_MODEL__NAME = eINSTANCE.getServiceComponentModel_Name();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.QoSModelImpl <em>Qo SModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.QoSModelImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getQoSModel()
		 * @generated
		 */
		EClass QO_SMODEL = eINSTANCE.getQoSModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_SMODEL__ELEMENTS = eINSTANCE.getQoSModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SMODEL__PACKAGE = eINSTANCE.getQoSModel_Package();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SMODEL__NAME = eINSTANCE.getQoSModel_Name();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.impl.ServiceModelImpl <em>Service Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.impl.ServiceModelImpl
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getServiceModel()
		 * @generated
		 */
		EClass SERVICE_MODEL = eINSTANCE.getServiceModel();

		/**
		 * The meta object literal for the '<em><b>Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MODEL__REGISTERS = eINSTANCE.getServiceModel_Registers();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_MODEL__URI = eINSTANCE.getServiceModel_Uri();

		/**
		 * The meta object literal for the '{@link DsoaAdsl.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DsoaAdsl.RelationalOperator
		 * @see DsoaAdsl.impl.DsoaAdslPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

	}

} //DsoaAdslPackage
