package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p156l6.C6974z;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
abstract class C3940z0 extends C6974z {

    /* renamed from: b */
    protected final C9227g f12553b;

    public C3940z0(int i, C9227g gVar) {
        super(i);
        this.f12553b = gVar;
    }

    /* renamed from: a */
    public final void mo12037a(Status status) {
        this.f12553b.mo24886d(new ApiException(status));
    }

    /* renamed from: b */
    public final void mo12038b(Exception exc) {
        this.f12553b.mo24886d(exc);
    }

    /* renamed from: c */
    public final void mo12039c(C3918p0 p0Var) {
        try {
            mo12053h(p0Var);
        } catch (DeadObjectException e) {
            mo12037a(C3891g1.m14748e(e));
            throw e;
        } catch (RemoteException e2) {
            mo12037a(C3891g1.m14748e(e2));
        } catch (RuntimeException e3) {
            this.f12553b.mo24886d(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo12053h(C3918p0 p0Var);
}
