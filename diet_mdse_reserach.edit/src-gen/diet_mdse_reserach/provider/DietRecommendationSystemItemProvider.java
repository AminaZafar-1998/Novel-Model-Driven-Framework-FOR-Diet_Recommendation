/**
 */
package diet_mdse_reserach.provider;

import diet_mdse_reserach.DietRecommendationSystem;
import diet_mdse_reserach.DietRecommendationType;
import diet_mdse_reserach.Diet_mdse_reserachFactory;
import diet_mdse_reserach.Diet_mdse_reserachPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link diet_mdse_reserach.DietRecommendationSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DietRecommendationSystemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DietRecommendationSystemItemProvider(AdapterFactory adapterFactory) {
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

			addDiet_plan_recommendationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Diet plan recommendation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiet_plan_recommendationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DietRecommendationSystem_Diet_plan_recommendation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DietRecommendationSystem_Diet_plan_recommendation_feature",
						"_UI_DietRecommendationSystem_type"),
				Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__PATIENTS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__MEDICINES);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__DOCTORS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__PAYMENTS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS);
			childrenFeatures.add(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__DATASET);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DietRecommendationSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DietRecommendationSystem"));
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
		DietRecommendationType labelValue = ((DietRecommendationSystem) object).getDiet_plan_recommendation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_DietRecommendationSystem_type")
				: getString("_UI_DietRecommendationSystem_type") + " " + label;
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

		switch (notification.getFeatureID(DietRecommendationSystem.class)) {
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DIET_PLAN_RECOMMENDATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PATIENTS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__MEDICINES:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DOCTORS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PAYMENTS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS:
		case Diet_mdse_reserachPackage.DIET_RECOMMENDATION_SYSTEM__DATASET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__PATIENTS,
						Diet_mdse_reserachFactory.eINSTANCE.createPatient()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__NUTRITIONISTS,
						Diet_mdse_reserachFactory.eINSTANCE.createNutritionist()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__MEDICINES,
						Diet_mdse_reserachFactory.eINSTANCE.createMedicine()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__DOCTORS,
						Diet_mdse_reserachFactory.eINSTANCE.createDoctor()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__APPOINTMENTS,
						Diet_mdse_reserachFactory.eINSTANCE.createAppointment()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__PAYMENTS,
						Diet_mdse_reserachFactory.eINSTANCE.createPayment()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS,
						Diet_mdse_reserachFactory.eINSTANCE.createRandomForest()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS,
						Diet_mdse_reserachFactory.eINSTANCE.createK_means()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__ML_ALGOS,
						Diet_mdse_reserachFactory.eINSTANCE.createSupportVectorMachine()));

		newChildDescriptors.add(createChildParameter(
				Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__HAS_PREDICT_DIET_PLANS,
				Diet_mdse_reserachFactory.eINSTANCE.createPredictedDietplan()));

		newChildDescriptors.add(
				createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__PERFORMANCEMETRIC,
						Diet_mdse_reserachFactory.eINSTANCE.createPerformanceMetric()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__SYMPTOMS,
						Diet_mdse_reserachFactory.eINSTANCE.createSymptoms()));

		newChildDescriptors
				.add(createChildParameter(Diet_mdse_reserachPackage.Literals.DIET_RECOMMENDATION_SYSTEM__DATASET,
						Diet_mdse_reserachFactory.eINSTANCE.createDataset()));
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
