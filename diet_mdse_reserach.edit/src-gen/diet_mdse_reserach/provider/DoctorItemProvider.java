/**
 */
package diet_mdse_reserach.provider;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Doctor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diet_mdse_reserach.Doctor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DoctorItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoctorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addAddressPropertyDescriptor(object);
			addPhone_noPropertyDescriptor(object);
			addClinictimingsPropertyDescriptor(object);
			addDoctor_specailizationPropertyDescriptor(object);
			addPatientsPropertyDescriptor(object);
			addMedicinesPropertyDescriptor(object);
			addFeesPropertyDescriptor(object);
			addAppointmentsPropertyDescriptor(object);
			addSymptomsPropertyDescriptor(object);
			addAccess_to_predicteddietplanPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_name_feature", "_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_address_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_address_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__ADDRESS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Phone no feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhone_noPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_phone_no_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_phone_no_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__PHONE_NO, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Clinictimings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClinictimingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_clinictimings_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_clinictimings_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__CLINICTIMINGS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Doctor specailization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoctor_specailizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_doctor_specailization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_doctor_specailization_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__DOCTOR_SPECAILIZATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Patients feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatientsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_patients_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_patients_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__PATIENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Medicines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMedicinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_medicines_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_medicines_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__MEDICINES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Fees feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_fees_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_fees_feature", "_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__FEES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Appointments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppointmentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_appointments_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_appointments_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__APPOINTMENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Symptoms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymptomsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Doctor_symptoms_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Doctor_symptoms_feature",
								"_UI_Doctor_type"),
						Diet_mdse_reserachPackage.Literals.DOCTOR__SYMPTOMS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Access to predicteddietplan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccess_to_predicteddietplanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Doctor_access_to_predicteddietplan_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Doctor_access_to_predicteddietplan_feature",
						"_UI_Doctor_type"),
				Diet_mdse_reserachPackage.Literals.DOCTOR__ACCESS_TO_PREDICTEDDIETPLAN, true, false, true, null, null,
				null));
	}

	/**
	 * This returns Doctor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Doctor"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Doctor) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Doctor_type")
				: getString("_UI_Doctor_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Doctor.class)) {
		case Diet_mdse_reserachPackage.DOCTOR__NAME:
		case Diet_mdse_reserachPackage.DOCTOR__ADDRESS:
		case Diet_mdse_reserachPackage.DOCTOR__PHONE_NO:
		case Diet_mdse_reserachPackage.DOCTOR__CLINICTIMINGS:
		case Diet_mdse_reserachPackage.DOCTOR__DOCTOR_SPECAILIZATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Diet_mdse_reserachEditPlugin.INSTANCE;
	}

}
