package p341ge.bog.mobilebank.injection.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import iu0.C36546y;

/* renamed from: ge.bog.mobilebank.injection.module.SharedPreferencesModule */
public class SharedPreferencesModule {
    /* access modifiers changed from: package-private */
    public SharedPreferences provideSharedPreferences(C36546y yVar) {
        return PreferenceManager.getDefaultSharedPreferences(yVar);
    }
}
