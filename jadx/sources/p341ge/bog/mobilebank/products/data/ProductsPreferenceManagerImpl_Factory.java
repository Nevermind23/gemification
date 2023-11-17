package p341ge.bog.mobilebank.products.data;

import android.content.SharedPreferences;
import ge1.C41084a;

/* renamed from: ge.bog.mobilebank.products.data.ProductsPreferenceManagerImpl_Factory */
public final class ProductsPreferenceManagerImpl_Factory implements C41084a {
    private final C41084a sharedPreferencesProvider;

    public ProductsPreferenceManagerImpl_Factory(C41084a aVar) {
        this.sharedPreferencesProvider = aVar;
    }

    public static ProductsPreferenceManagerImpl_Factory create(C41084a aVar) {
        return new ProductsPreferenceManagerImpl_Factory(aVar);
    }

    public static ProductsPreferenceManagerImpl newInstance(SharedPreferences sharedPreferences) {
        return new ProductsPreferenceManagerImpl(sharedPreferences);
    }

    public ProductsPreferenceManagerImpl get() {
        return newInstance((SharedPreferences) this.sharedPreferencesProvider.get());
    }
}
