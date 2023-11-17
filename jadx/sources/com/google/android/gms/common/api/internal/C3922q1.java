package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
import p156l6.C6959o0;
import p156l6.C6973y;

/* renamed from: com.google.android.gms.common.api.internal.q1 */
final class C3922q1 implements C6973y {

    /* renamed from: a */
    final /* synthetic */ C3899j f12515a;

    /* synthetic */ C3922q1(C3899j jVar, C6959o0 o0Var) {
        this.f12515a = jVar;
    }

    /* renamed from: a */
    public final void mo12068a(Bundle bundle) {
        this.f12515a.f12453n.lock();
        try {
            this.f12515a.f12451l = ConnectionResult.f12230h;
            C3899j.m14793w(this.f12515a);
        } finally {
            this.f12515a.f12453n.unlock();
        }
    }

    /* renamed from: b */
    public final void mo12069b(int i, boolean z) {
        Lock q;
        this.f12515a.f12453n.lock();
        try {
            C3899j jVar = this.f12515a;
            if (jVar.f12452m) {
                jVar.f12452m = false;
                C3899j.m14791u(this.f12515a, i, z);
                q = this.f12515a.f12453n;
            } else {
                jVar.f12452m = true;
                this.f12515a.f12444e.mo12107x(i);
                q = this.f12515a.f12453n;
            }
            q.unlock();
        } catch (Throwable th) {
            this.f12515a.f12453n.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo12070c(ConnectionResult connectionResult) {
        this.f12515a.f12453n.lock();
        try {
            this.f12515a.f12451l = connectionResult;
            C3899j.m14793w(this.f12515a);
        } finally {
            this.f12515a.f12453n.unlock();
        }
    }
}
