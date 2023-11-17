package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.common.api.internal.c1 */
public final class C3876c1 extends C3891g1 {

    /* renamed from: b */
    protected final C3871b f12372b;

    public C3876c1(int i, C3871b bVar) {
        super(i);
        this.f12372b = (C3871b) C7264i.m27903l(bVar, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo12037a(Status status) {
        try {
            this.f12372b.mo12012v(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: b */
    public final void mo12038b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f12372b.mo12012v(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: c */
    public final void mo12039c(C3918p0 p0Var) {
        try {
            this.f12372b.mo12011t(p0Var.mo12140s());
        } catch (RuntimeException e) {
            mo12038b(e);
        }
    }

    /* renamed from: d */
    public final void mo12040d(C3908m mVar, boolean z) {
        mVar.mo12114c(this.f12372b, z);
    }
}
