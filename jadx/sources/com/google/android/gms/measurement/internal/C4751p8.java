package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4254je;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
public final /* synthetic */ class C4751p8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4762q8 f14769d;

    public /* synthetic */ C4751p8(C4762q8 q8Var) {
        this.f14769d = q8Var;
    }

    public final void run() {
        C4762q8 q8Var = this.f14769d;
        C4773r8 r8Var = q8Var.f14801f;
        long j = q8Var.f14799d;
        long j2 = q8Var.f14800e;
        r8Var.f14839b.mo14554h();
        r8Var.f14839b.f14613a.mo14551d().mo14674q().mo14615a("Application going to the background");
        r8Var.f14839b.f14613a.mo14849F().f14274r.mo14962a(true);
        if (!r8Var.f14839b.f14613a.mo14876z().mo14400D()) {
            r8Var.f14839b.f14977e.mo14918b(j2);
            r8Var.f14839b.f14977e.mo14920d(false, false, j2);
        }
        C4254je.m16183c();
        if (r8Var.f14839b.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14331D0)) {
            r8Var.f14839b.f14613a.mo14551d().mo14678u().mo14616b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
        } else {
            r8Var.f14839b.f14613a.mo14851I().mo14911v("auto", "_ab", j, new Bundle());
        }
    }
}
