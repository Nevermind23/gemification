package p027b9;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p068e9.C6063h;

/* renamed from: b9.e */
public class C2181e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6371a;

    /* renamed from: b */
    private C2183b f6372b = null;

    /* renamed from: b9.e$b */
    private class C2183b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f6373a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f6374b;

        private C2183b() {
            int r = C6063h.m24227r(C2181e.this.f6371a, "com.google.firebase.crashlytics.unity_version", "string");
            if (r != 0) {
                this.f6373a = "Unity";
                String string = C2181e.this.f6371a.getResources().getString(r);
                this.f6374b = string;
                C2184f f = C2184f.m8346f();
                f.mo7095i("Unity Editor version is: " + string);
            } else if (C2181e.this.m8339c("flutter_assets/NOTICES.Z")) {
                this.f6373a = "Flutter";
                this.f6374b = null;
                C2184f.m8346f().mo7095i("Development platform is: Flutter");
            } else {
                this.f6373a = null;
                this.f6374b = null;
            }
        }
    }

    public C2181e(Context context) {
        this.f6371a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m8339c(String str) {
        if (this.f6371a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f6371a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private C2183b m8340f() {
        if (this.f6372b == null) {
            this.f6372b = new C2183b();
        }
        return this.f6372b;
    }

    /* renamed from: d */
    public String mo7087d() {
        return m8340f().f6373a;
    }

    /* renamed from: e */
    public String mo7088e() {
        return m8340f().f6374b;
    }
}
