package p056da;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0767a;
import p289v9.C8716c;

/* renamed from: da.a */
public class C5857a {

    /* renamed from: a */
    private final Context f18373a;

    /* renamed from: b */
    private final SharedPreferences f18374b;

    /* renamed from: c */
    private final C8716c f18375c;

    /* renamed from: d */
    private boolean f18376d = m23539c();

    public C5857a(Context context, String str, C8716c cVar) {
        Context a = m23538a(context);
        this.f18373a = a;
        this.f18374b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f18375c = cVar;
    }

    /* renamed from: a */
    private static Context m23538a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return C0767a.m2892b(context);
    }

    /* renamed from: c */
    private boolean m23539c() {
        if (this.f18374b.contains("firebase_data_collection_default_enabled")) {
            return this.f18374b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m23540d();
    }

    /* renamed from: d */
    private boolean m23540d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f18373a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f18373a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo19070b() {
        return this.f18376d;
    }
}
