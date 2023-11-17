package p068e9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.C5270e;
import java.util.concurrent.Executor;
import p027b9.C2184f;
import p337z7.C9227g;
import p337z7.Task;

/* renamed from: e9.s */
public class C6106s {

    /* renamed from: a */
    private final SharedPreferences f18973a;

    /* renamed from: b */
    private final C5270e f18974b;

    /* renamed from: c */
    private final Object f18975c;

    /* renamed from: d */
    C9227g f18976d = new C9227g();

    /* renamed from: e */
    boolean f18977e = false;

    /* renamed from: f */
    private boolean f18978f = false;

    /* renamed from: g */
    private Boolean f18979g;

    /* renamed from: h */
    private final C9227g f18980h = new C9227g();

    public C6106s(C5270e eVar) {
        Object obj = new Object();
        this.f18975c = obj;
        Context j = eVar.mo17481j();
        this.f18974b = eVar;
        this.f18973a = C6063h.m24228s(j);
        Boolean b = m24407b();
        this.f18979g = b == null ? m24406a(j) : b;
        synchronized (obj) {
            if (mo19637d()) {
                this.f18976d.mo24887e((Object) null);
                this.f18977e = true;
            }
        }
    }

    /* renamed from: a */
    private Boolean m24406a(Context context) {
        Boolean f = m24409f(context);
        if (f == null) {
            this.f18978f = false;
            return null;
        }
        this.f18978f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    /* renamed from: b */
    private Boolean m24407b() {
        if (!this.f18973a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f18978f = false;
        return Boolean.valueOf(this.f18973a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: e */
    private void m24408e(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f18979g == null) {
            str2 = "global Firebase setting";
        } else if (this.f18978f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        C2184f.m8346f().mo7089b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str, str2}));
    }

    /* renamed from: f */
    private static Boolean m24409f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C2184f.m8346f().mo7092e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo19636c(boolean z) {
        if (z) {
            this.f18980h.mo24887e((Object) null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo19637d() {
        boolean z;
        Boolean bool = this.f18979g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f18974b.mo17485t();
        }
        m24408e(z);
        return z;
    }

    /* renamed from: g */
    public Task mo19638g() {
        Task a;
        synchronized (this.f18975c) {
            a = this.f18976d.mo24883a();
        }
        return a;
    }

    /* renamed from: h */
    public Task mo19639h(Executor executor) {
        return C6107s0.m24427n(executor, this.f18980h.mo24883a(), mo19638g());
    }
}
