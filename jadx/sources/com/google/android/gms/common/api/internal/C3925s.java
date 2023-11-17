package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.internal.C3958b;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.s */
final class C3925s implements C3958b.C3961c {

    /* renamed from: a */
    private final WeakReference f12519a;

    /* renamed from: b */
    private final C3847a f12520b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f12521c;

    public C3925s(C3872b0 b0Var, C3847a aVar, boolean z) {
        this.f12519a = new WeakReference(b0Var);
        this.f12520b = aVar;
        this.f12521c = z;
    }

    /* renamed from: a */
    public final void mo12147a(ConnectionResult connectionResult) {
        boolean z;
        Lock y;
        C3872b0 b0Var = (C3872b0) this.f12519a.get();
        if (b0Var != null) {
            if (Looper.myLooper() == b0Var.f12326a.f12468o.mo11955i()) {
                z = true;
            } else {
                z = false;
            }
            C7264i.m27906o(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            b0Var.f12327b.lock();
            try {
                if (!b0Var.m14618n(0)) {
                    y = b0Var.f12327b;
                } else {
                    if (!connectionResult.mo11855f0()) {
                        b0Var.m14616l(connectionResult, this.f12520b, this.f12521c);
                    }
                    if (b0Var.m14619o()) {
                        b0Var.m14617m();
                    }
                    y = b0Var.f12327b;
                }
                y.unlock();
            } catch (Throwable th) {
                b0Var.f12327b.unlock();
                throw th;
            }
        }
    }
}
