package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import p156l6.C6952l;
import p156l6.C6974z;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
public final class C3884e1 extends C6974z {

    /* renamed from: b */
    private final C3892h f12382b;

    /* renamed from: c */
    private final C9227g f12383c;

    /* renamed from: d */
    private final C6952l f12384d;

    public C3884e1(int i, C3892h hVar, C9227g gVar, C6952l lVar) {
        super(i);
        this.f12383c = gVar;
        this.f12382b = hVar;
        this.f12384d = lVar;
        if (i == 2 && hVar.mo12074c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo12037a(Status status) {
        this.f12383c.mo24886d(this.f12384d.mo21076a(status));
    }

    /* renamed from: b */
    public final void mo12038b(Exception exc) {
        this.f12383c.mo24886d(exc);
    }

    /* renamed from: c */
    public final void mo12039c(C3918p0 p0Var) {
        try {
            this.f12382b.mo12073b(p0Var.mo12140s(), this.f12383c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo12037a(C3891g1.m14748e(e2));
        } catch (RuntimeException e3) {
            this.f12383c.mo24886d(e3);
        }
    }

    /* renamed from: d */
    public final void mo12040d(C3908m mVar, boolean z) {
        mVar.mo12115d(this.f12383c, z);
    }

    /* renamed from: f */
    public final boolean mo12051f(C3918p0 p0Var) {
        return this.f12382b.mo12074c();
    }

    /* renamed from: g */
    public final Feature[] mo12052g(C3918p0 p0Var) {
        return this.f12382b.mo12076e();
    }
}
