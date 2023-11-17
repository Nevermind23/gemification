package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3958b;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p156l6.C6931b;
import p182n6.C7266j;
import p260t6.C8400b;
import p337z7.C9219c;
import p337z7.Task;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
final class C3930u0 implements C9219c {

    /* renamed from: a */
    private final C3874c f12533a;

    /* renamed from: b */
    private final int f12534b;

    /* renamed from: c */
    private final C6931b f12535c;

    /* renamed from: d */
    private final long f12536d;

    /* renamed from: e */
    private final long f12537e;

    C3930u0(C3874c cVar, int i, C6931b bVar, long j, long j2, String str, String str2) {
        this.f12533a = cVar;
        this.f12534b = i;
        this.f12535c = bVar;
        this.f12536d = j;
        this.f12537e = j2;
    }

    /* renamed from: a */
    static C3930u0 m14925a(C3874c cVar, int i, C6931b bVar) {
        boolean z;
        long j;
        long j2;
        if (!cVar.mo12032g()) {
            return null;
        }
        RootTelemetryConfiguration a = C7266j.m27912b().mo21638a();
        if (a == null) {
            z = true;
        } else if (!a.mo12210x()) {
            return null;
        } else {
            z = a.mo12205R();
            C3918p0 x = cVar.mo12036x(bVar);
            if (x != null) {
                if (!(x.mo12140s() instanceof C3958b)) {
                    return null;
                }
                C3958b bVar2 = (C3958b) x.mo12140s();
                if (bVar2.mo12227O() && !bVar2.mo12241f()) {
                    ConnectionTelemetryConfiguration b = m14926b(x, bVar2, i);
                    if (b == null) {
                        return null;
                    }
                    x.mo12130F();
                    z = b.mo12196f0();
                }
            }
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new C3930u0(cVar, i, bVar, j, j2, (String) null, (String) null);
    }

    /* renamed from: b */
    private static ConnectionTelemetryConfiguration m14926b(C3918p0 p0Var, C3958b bVar, int i) {
        int[] w;
        int[] x;
        ConnectionTelemetryConfiguration M = bVar.mo12225M();
        if (M == null || !M.mo12195R() || ((w = M.mo12199w()) != null ? !C8400b.m31525a(w, i) : !((x = M.mo12201x()) == null || !C8400b.m31525a(x, i))) || p0Var.mo12139q() >= M.mo12198v()) {
            return null;
        }
        return M;
    }

    public final void onComplete(Task task) {
        C3918p0 x;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.f12533a.mo12032g()) {
            RootTelemetryConfiguration a = C7266j.m27912b().mo21638a();
            if ((a == null || a.mo12210x()) && (x = this.f12533a.mo12036x(this.f12535c)) != null && (x.mo12140s() instanceof C3958b)) {
                C3958b bVar = (C3958b) x.mo12140s();
                boolean z2 = true;
                int i7 = 0;
                if (this.f12536d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int E = bVar.mo12220E();
                if (a != null) {
                    boolean R = z & a.mo12205R();
                    int v = a.mo12207v();
                    int w = a.mo12208w();
                    i3 = a.mo12206f0();
                    if (bVar.mo12227O() && !bVar.mo12241f()) {
                        ConnectionTelemetryConfiguration b = m14926b(x, bVar, this.f12534b);
                        if (b != null) {
                            if (!b.mo12196f0() || this.f12536d <= 0) {
                                z2 = false;
                            }
                            w = b.mo12198v();
                            R = z2;
                        } else {
                            return;
                        }
                    }
                    i2 = v;
                    i = w;
                } else {
                    i3 = 0;
                    i = 100;
                    i2 = 5000;
                }
                C3874c cVar = this.f12533a;
                if (task.mo24873r()) {
                    i4 = 0;
                } else {
                    if (task.mo24871p()) {
                        i7 = 100;
                    } else {
                        Exception m = task.mo24868m();
                        if (m instanceof ApiException) {
                            Status a2 = ((ApiException) m).mo11886a();
                            int x2 = a2.mo11911x();
                            ConnectionResult v2 = a2.mo11908v();
                            if (v2 == null) {
                                i6 = -1;
                            } else {
                                i6 = v2.mo11858v();
                            }
                            i4 = i6;
                            i7 = x2;
                        } else {
                            i7 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z) {
                    long j3 = this.f12536d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f12537e);
                    j2 = j3;
                    j = currentTimeMillis;
                } else {
                    j2 = 0;
                    j = 0;
                    i5 = -1;
                }
                cVar.mo12026I(new MethodInvocation(this.f12534b, i7, i4, j2, j, (String) null, (String) null, E, i5), i3, (long) i2, i);
            }
        }
    }
}
