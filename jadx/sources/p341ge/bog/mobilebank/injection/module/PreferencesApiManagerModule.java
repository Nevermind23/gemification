package p341ge.bog.mobilebank.injection.module;

import android.content.SharedPreferences;
import jg1.C41438c;
import n41.C37350a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;

/* renamed from: ge.bog.mobilebank.injection.module.PreferencesApiManagerModule */
public class PreferencesApiManagerModule {
    /* access modifiers changed from: package-private */
    public PreferencesApiManager providePreferencesApiManager(SharedPreferences sharedPreferences, C41438c cVar, C37350a aVar, TargetEnvironment targetEnvironment) {
        return new PreferencesApiManager(sharedPreferences, cVar, aVar, targetEnvironment);
    }
}
