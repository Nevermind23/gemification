package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
import p156l6.C6957n0;
import p156l6.C6973y;

/* renamed from: com.google.android.gms.common.api.internal.p1 */
final class C3919p1 implements C6973y {

    /* renamed from: a */
    final /* synthetic */ C3899j f12510a;

    /* synthetic */ C3919p1(C3899j jVar, C6957n0 n0Var) {
        this.f12510a = jVar;
    }

    /* renamed from: a */
    public final void mo12068a(Bundle bundle) {
        this.f12510a.f12453n.lock();
        try {
            C3899j.m14792v(this.f12510a, bundle);
            this.f12510a.f12450k = ConnectionResult.f12230h;
            C3899j.m14793w(this.f12510a);
        } finally {
            this.f12510a.f12453n.unlock();
        }
    }

    /* renamed from: b */
    public final void mo12069b(int i, boolean z) {
        Lock q;
        this.f12510a.f12453n.lock();
        try {
            C3899j jVar = this.f12510a;
            if (!jVar.f12452m && jVar.f12451l != null) {
                if (jVar.f12451l.mo11855f0()) {
                    this.f12510a.f12452m = true;
                    this.f12510a.f12445f.mo12107x(i);
                    q = this.f12510a.f12453n;
                    q.unlock();
                }
            }
            this.f12510a.f12452m = false;
            C3899j.m14791u(this.f12510a, i, z);
            q = this.f12510a.f12453n;
            q.unlock();
        } catch (Throwable th) {
            this.f12510a.f12453n.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo12070c(ConnectionResult connectionResult) {
        this.f12510a.f12453n.lock();
        try {
            this.f12510a.f12450k = connectionResult;
            C3899j.m14793w(this.f12510a);
        } finally {
            this.f12510a.f12453n.unlock();
        }
    }
}
