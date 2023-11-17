package p341ge.bog.mobilebank.injection.module;

import android.content.SharedPreferences;
import ge1.C41084a;
import jg1.C41438c;
import n41.C37350a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.PreferencesApiManagerModule_ProvidePreferencesApiManagerFactory */
public final class PreferencesApiManagerModule_ProvidePreferencesApiManagerFactory implements C41084a {
    private final C41084a environmentProvider;
    private final C41084a eventBusProvider;
    private final C41084a languageStoreProvider;
    private final PreferencesApiManagerModule module;
    private final C41084a sharedPreferencesProvider;

    public PreferencesApiManagerModule_ProvidePreferencesApiManagerFactory(PreferencesApiManagerModule preferencesApiManagerModule, C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        this.module = preferencesApiManagerModule;
        this.sharedPreferencesProvider = aVar;
        this.eventBusProvider = aVar2;
        this.languageStoreProvider = aVar3;
        this.environmentProvider = aVar4;
    }

    public static PreferencesApiManagerModule_ProvidePreferencesApiManagerFactory create(PreferencesApiManagerModule preferencesApiManagerModule, C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        return new PreferencesApiManagerModule_ProvidePreferencesApiManagerFactory(preferencesApiManagerModule, aVar, aVar2, aVar3, aVar4);
    }

    public static PreferencesApiManager providePreferencesApiManager(PreferencesApiManagerModule preferencesApiManagerModule, SharedPreferences sharedPreferences, C41438c cVar, C37350a aVar, TargetEnvironment targetEnvironment) {
        return (PreferencesApiManager) C18329d.m62677d(preferencesApiManagerModule.providePreferencesApiManager(sharedPreferences, cVar, aVar, targetEnvironment));
    }

    public PreferencesApiManager get() {
        return providePreferencesApiManager(this.module, (SharedPreferences) this.sharedPreferencesProvider.get(), (C41438c) this.eventBusProvider.get(), (C37350a) this.languageStoreProvider.get(), (TargetEnvironment) this.environmentProvider.get());
    }
}
