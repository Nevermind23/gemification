package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.c6 */
final class C4604c6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Bundle f14243d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14244e;

    C4604c6(C4793t6 t6Var, Bundle bundle) {
        this.f14244e = t6Var;
        this.f14243d = bundle;
    }

    public final void run() {
        C4793t6 t6Var = this.f14244e;
        Bundle bundle = this.f14243d;
        t6Var.mo14554h();
        t6Var.mo14922i();
        C7264i.m27902k(bundle);
        String g = C7264i.m27898g(bundle.getString("name"));
        if (!t6Var.f14613a.mo14869o()) {
            t6Var.f14613a.mo14551d().mo14679v().mo14615a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            t6Var.f14613a.mo14854L().mo14389s(new zzac(bundle.getString("app_id"), "", new zzlj(g, 0, (Object) null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzaw) null, bundle.getLong("trigger_timeout"), (zzaw) null, bundle.getLong("time_to_live"), t6Var.f14613a.mo14856N().mo14839y0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
