package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.C0787k;

/* renamed from: com.google.android.gms.internal.measurement.e6 */
final class C4161e6 implements C4110b6 {

    /* renamed from: c */
    private static C4161e6 f13207c;

    /* renamed from: a */
    private final Context f13208a;

    /* renamed from: b */
    private final ContentObserver f13209b;

    private C4161e6() {
        this.f13208a = null;
        this.f13209b = null;
    }

    /* renamed from: b */
    static C4161e6 m15708b(Context context) {
        C4161e6 e6Var;
        C4161e6 e6Var2;
        synchronized (C4161e6.class) {
            if (f13207c == null) {
                if (C0787k.m2943b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    e6Var2 = new C4161e6(context);
                } else {
                    e6Var2 = new C4161e6();
                }
                f13207c = e6Var2;
            }
            e6Var = f13207c;
        }
        return e6Var;
    }

    /* renamed from: e */
    static synchronized void m15709e() {
        Context context;
        synchronized (C4161e6.class) {
            C4161e6 e6Var = f13207c;
            if (!(e6Var == null || (context = e6Var.f13208a) == null || e6Var.f13209b == null)) {
                context.getContentResolver().unregisterContentObserver(f13207c.f13209b);
            }
            f13207c = null;
        }
    }

    /* renamed from: c */
    public final String mo12910a(String str) {
        Context context = this.f13208a;
        if (context != null && !C4415t5.m16736a(context)) {
            try {
                return (String) C4514z5.m17303a(new C4127c6(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo13057d(String str) {
        return C4398s5.m16630a(this.f13208a.getContentResolver(), str, (String) null);
    }

    private C4161e6(Context context) {
        this.f13208a = context;
        C4144d6 d6Var = new C4144d6(this, (Handler) null);
        this.f13209b = d6Var;
        context.getContentResolver().registerContentObserver(C4398s5.f13655a, true, d6Var);
    }
}
