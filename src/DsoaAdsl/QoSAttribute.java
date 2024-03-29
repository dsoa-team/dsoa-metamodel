/**
 */
package DsoaAdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DsoaAdsl.QoSAttribute#getIsMeasuredBy <em>Is Measured By</em>}</li>
 *   <li>{@link DsoaAdsl.QoSAttribute#getName <em>Name</em>}</li>
 *   <li>{@link DsoaAdsl.QoSAttribute#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see DsoaAdsl.DsoaAdslPackage#getQoSAttribute()
 * @model
 * @generated
 */
public interface QoSAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Measured By</b></em>' containment reference list.
	 * The list contents are of type {@link DsoaAdsl.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Measured By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Measured By</em>' containment reference list.
	 * @see DsoaAdsl.DsoaAdslPackage#getQoSAttribute_IsMeasuredBy()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Metric> getIsMeasuredBy();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DsoaAdsl.DsoaAdslPackage#getQoSAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DsoaAdsl.QoSAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see DsoaAdsl.DsoaAdslPackage#getQoSAttribute_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link DsoaAdsl.QoSAttribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // QoSAttribute
