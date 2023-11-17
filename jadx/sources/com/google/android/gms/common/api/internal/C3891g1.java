package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.g1 */
public abstract class C3891g1 {

    /* renamed from: a */
    public final int f12425a;

    public C3891g1(int i) {
        this.f12425a = i;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ Status m14748e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo12037a(Status status);

    /* renamed from: b */
    public abstract void mo12038b(Exception exc);

    /* renamed from: c */
    public abstract void mo12039c(C3918p0 p0Var);

    /* renamed from: d */
    public abstract void mo12040d(C3908m mVar, boolean z);
}
