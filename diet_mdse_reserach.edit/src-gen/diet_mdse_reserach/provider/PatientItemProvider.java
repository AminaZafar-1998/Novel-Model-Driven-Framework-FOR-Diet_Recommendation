/**
 */
package diet_mdse_reserach.provider;

import diet_mdse_reserach.Diet_mdse_reserachPackage;
import diet_mdse_reserach.Patient;

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
 * This is the item provider adapter for a {@link diet_mdse_reserach.Patient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatientItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientItemProvider(AdapterFactory adapterFactory) {
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
			addHeightPropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addBmiPropertyDescriptor(object);
			addActivity_levelPropertyDescriptor(object);
			addGenderPropertyDescriptor(object);
			addPatient_typePropertyDescriptor(object);
			addGlucosePropertyDescriptor(object);
			addGlucose_levelPropertyDescriptor(object);
			addPaymentsPropertyDescriptor(object);
			addAppointmentsPropertyDescriptor(object);
			addDoctorsPropertyDescriptor(object);
			addMedicinesPropertyDescriptor(object);
			addNutritionistsPropertyDescriptor(object);
			addAgePropertyDescriptor(object);
			addSymptomsPropertyDescriptor(object);
			addOther_diseasesPropertyDescriptor(object);
			addAccess_topredicteddietplansPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Patient_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_name_feature", "_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_height_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_height_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__HEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_weight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_weight_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__WEIGHT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bmi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBmiPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_bmi_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_bmi_feature", "_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__BMI, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Activity level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivity_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_activity_level_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_activity_level_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__ACTIVITY_LEVEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_gender_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_gender_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__GENDER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Patient type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatient_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_patient_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_patient_type_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__PATIENT_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Glucose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlucosePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_glucose_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_glucose_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__GLUCOSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Glucose level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlucose_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_glucose_level_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_glucose_level_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__GLUCOSE_LEVEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Payments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaymentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_payments_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_payments_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__PAYMENTS, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Patient_appointments_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_appointments_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__APPOINTMENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Doctors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoctorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_doctors_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_doctors_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__DOCTORS, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Patient_medicines_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_medicines_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__MEDICINES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Nutritionists feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNutritionistsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_nutritionists_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_nutritionists_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__NUTRITIONISTS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Age feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_age_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_age_feature", "_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__AGE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_Patient_symptoms_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_symptoms_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__SYMPTOMS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Other diseases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOther_diseasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Patient_other_diseases_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Patient_other_diseases_feature",
								"_UI_Patient_type"),
						Diet_mdse_reserachPackage.Literals.PATIENT__OTHER_DISEASES, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Access topredicteddietplans feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccess_topredicteddietplansPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Patient_access_topredicteddietplans_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Patient_access_topredicteddietplans_feature",
						"_UI_Patient_type"),
				Diet_mdse_reserachPackage.Literals.PATIENT__ACCESS_TOPREDICTEDDIETPLANS, true, false, true, null, null,
				null));
	}

	/**
	 * This returns Patient.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Patient"));
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
		String label = ((Patient) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Patient_type")
				: getString("_UI_Patient_type") + " " + label;
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

		switch (notification.getFeatureID(Patient.class)) {
		case Diet_mdse_reserachPackage.PATIENT__NAME:
		case Diet_mdse_reserachPackage.PATIENT__HEIGHT:
		case Diet_mdse_reserachPackage.PATIENT__WEIGHT:
		case Diet_mdse_reserachPackage.PATIENT__BMI:
		case Diet_mdse_reserachPackage.PATIENT__ACTIVITY_LEVEL:
		case Diet_mdse_reserachPackage.PATIENT__GENDER:
		case Diet_mdse_reserachPackage.PATIENT__PATIENT_TYPE:
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE:
		case Diet_mdse_reserachPackage.PATIENT__GLUCOSE_LEVEL:
		case Diet_mdse_reserachPackage.PATIENT__AGE:
		case Diet_mdse_reserachPackage.PATIENT__OTHER_DISEASES:
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
