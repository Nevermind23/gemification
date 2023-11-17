package p341ge.bog.mobilebank.injection.module;

import android.content.SharedPreferences;
import ge1.C41084a;
import iu0.C36546y;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.SharedPreferencesModule_ProvideSharedPreferencesFactory */
public final class SharedPreferencesModule_ProvideSharedPreferencesFactory implements C41084a {
    private final C41084a applicationProvider;
    private final SharedPreferencesModule module;

    public SharedPreferencesModule_ProvideSharedPreferencesFactory(SharedPreferencesModule sharedPreferencesModule, C41084a aVar) {
        this.module = sharedPreferencesModule;
        this.applicationProvider = aVar;
    }

    public static SharedPreferencesModule_ProvideSharedPreferencesFactory create(SharedPreferencesModule sharedPreferencesModule, C41084a aVar) {
        return new SharedPreferencesModule_ProvideSharedPreferencesFactory(sharedPreferencesModule, aVar);
    }

    public static SharedPreferences provideSharedPreferences(SharedPreferencesModule sharedPreferencesModule, C36546y yVar) {
        return (SharedPreferences) C18329d.m62677d(sharedPreferencesModule.provideSharedPreferences(yVar));
    }

    public SharedPreferences get() {
        return provideSharedPreferences(this.module, (C36546y) this.applicationProvider.get());
    }
}
