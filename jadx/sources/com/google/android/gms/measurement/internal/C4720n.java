package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.C4088a1;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.n */
abstract class C4720n {

    /* renamed from: d */
    private static volatile Handler f14651d;

    /* renamed from: a */
    private final C4737o5 f14652a;

    /* renamed from: b */
    private final Runnable f14653b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f14654c;

    C4720n(C4737o5 o5Var) {
        C7264i.m27902k(o5Var);
        this.f14652a = o5Var;
        this.f14653b = new C4709m(this, o5Var);
    }

    /* renamed from: f */
    private final Handler m17989f() {
        Handler handler;
        if (f14651d != null) {
            return f14651d;
        }
        synchronized (C4720n.class) {
            if (f14651d == null) {
                f14651d = new C4088a1(this.f14652a.mo14550c().getMainLooper());
            }
            handler = f14651d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14611b() {
        this.f14654c = 0;
        m17989f().removeCallbacks(this.f14653b);
    }

    /* renamed from: c */
    public abstract void mo14612c();

    /* renamed from: d */
    public final void mo14613d(long j) {
        mo14611b();
        if (j >= 0) {
            this.f14654c = this.f14652a.mo14548a().mo23594a();
            if (!m17989f().postDelayed(this.f14653b, j)) {
                this.f14652a.mo14551d().mo14675r().mo14616b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo14614e() {
        return this.f14654c != 0;
    }
}
