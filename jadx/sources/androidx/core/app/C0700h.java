package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.h */
public abstract class C0700h {

    /* renamed from: androidx.core.app.h$a */
    static class C0701a {
        /* renamed from: a */
        static IBinder m2718a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m2719b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static void m2717a(Bundle bundle, String str, IBinder iBinder) {
        C0701a.m2719b(bundle, str, iBinder);
    }
}
