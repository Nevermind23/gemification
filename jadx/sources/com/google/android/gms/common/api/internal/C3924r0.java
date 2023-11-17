package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3966e;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
final class C3924r0 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ ConnectionResult f12517d;

    /* renamed from: e */
    final /* synthetic */ C3926s0 f12518e;

    C3924r0(C3926s0 s0Var, ConnectionResult connectionResult) {
        this.f12518e = s0Var;
        this.f12517d = connectionResult;
    }

    public final void run() {
        C3926s0 s0Var = this.f12518e;
        C3918p0 p0Var = (C3918p0) s0Var.f12527f.f12365l.get(s0Var.f12523b);
        if (p0Var != null) {
            if (this.f12517d.mo11855f0()) {
                this.f12518e.f12526e = true;
                if (this.f12518e.f12522a.mo7052k()) {
                    this.f12518e.m14919h();
                    return;
                }
                try {
                    C3926s0 s0Var2 = this.f12518e;
                    s0Var2.f12522a.mo11927n((C3966e) null, s0Var2.f12522a.mo11926m());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f12518e.f12522a.mo11921e("Failed to get service from broker.");
                    p0Var.mo12131G(new ConnectionResult(10), (Exception) null);
                }
            } else {
                p0Var.mo12131G(this.f12517d, (Exception) null);
            }
        }
    }
}
