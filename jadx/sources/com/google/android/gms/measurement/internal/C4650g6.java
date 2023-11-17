package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4224i1;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
final class C4650g6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4224i1 f14450d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14451e;

    C4650g6(C4793t6 t6Var, C4224i1 i1Var) {
        this.f14451e = t6Var;
        this.f14450d = i1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009a A[SYNTHETIC, Splitter:B:15:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.t6 r0 = r6.f14451e
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            com.google.android.gms.measurement.internal.v8 r0 = r0.mo14855M()
            com.google.android.gms.internal.measurement.C4305me.m16294c()
            com.google.android.gms.measurement.internal.t4 r1 = r0.f14613a
            com.google.android.gms.measurement.internal.g r1 = r1.mo14876z()
            com.google.android.gms.measurement.internal.e3 r2 = com.google.android.gms.measurement.internal.C4636f3.f14405w0
            r3 = 0
            boolean r1 = r1.mo14398B(r3, r2)
            if (r1 == 0) goto L_0x0076
            com.google.android.gms.measurement.internal.t4 r1 = r0.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            s7.b r1 = r1.mo14332q()
            s7.a r2 = p248s7.C8243a.ANALYTICS_STORAGE
            boolean r1 = r1.mo23435i(r2)
            if (r1 != 0) goto L_0x003c
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14681x()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.mo14615a(r1)
            goto L_0x0085
        L_0x003c:
            com.google.android.gms.measurement.internal.t4 r1 = r0.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.t4 r2 = r0.f14613a
            t6.f r2 = r2.mo14548a()
            long r4 = r2.mo23594a()
            boolean r1 = r1.mo14337v(r4)
            if (r1 != 0) goto L_0x0085
            com.google.android.gms.measurement.internal.t4 r1 = r0.f14613a
            com.google.android.gms.measurement.internal.d4 r1 = r1.mo14849F()
            com.google.android.gms.measurement.internal.a4 r1 = r1.f14272p
            long r1 = r1.mo14295a()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            com.google.android.gms.measurement.internal.d4 r0 = r0.mo14849F()
            com.google.android.gms.measurement.internal.a4 r0 = r0.f14272p
            long r0 = r0.mo14295a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0086
        L_0x0076:
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14681x()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.mo14615a(r1)
        L_0x0085:
            r0 = r3
        L_0x0086:
            if (r0 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.t6 r1 = r6.f14451e
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.s9 r1 = r1.mo14856N()
            com.google.android.gms.internal.measurement.i1 r2 = r6.f14450d
            long r3 = r0.longValue()
            r1.mo14802J(r2, r3)
            return
        L_0x009a:
            com.google.android.gms.internal.measurement.i1 r0 = r6.f14450d     // Catch:{ RemoteException -> 0x00a0 }
            r0.mo12891H1(r3)     // Catch:{ RemoteException -> 0x00a0 }
            return
        L_0x00a0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t6 r1 = r6.f14451e
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14675r()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.mo14616b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4650g6.run():void");
    }
}
