package com.google.android.gms.common.internal;

import android.os.Looper;
import android.os.Message;
import p092g7.C6254e;

/* renamed from: com.google.android.gms.common.internal.n */
final class C3976n extends C6254e {

    /* renamed from: b */
    final /* synthetic */ C3958b f12692b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3976n(C3958b bVar, Looper looper) {
        super(looper);
        this.f12692b = bVar;
    }

    /* renamed from: a */
    private static final void m15098a(Message message) {
        C3977o oVar = (C3977o) message.obj;
        oVar.mo12271b();
        oVar.mo12281e();
    }

    /* renamed from: b */
    private static final boolean m15099b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f12650C
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m15099b(r8)
            if (r0 == 0) goto L_0x0015
            m15098a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            boolean r0 = r0.mo12254y()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            boolean r0 = r0.mo12241f()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f12676z = r1
            com.google.android.gms.common.internal.b r8 = r7.f12692b
            boolean r8 = com.google.android.gms.common.internal.C3958b.m15021m0(r8)
            if (r8 == 0) goto L_0x005f
            com.google.android.gms.common.internal.b r8 = r7.f12692b
            boolean r0 = r8.f12648A
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.m15022n0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            com.google.android.gms.common.internal.b r8 = r7.f12692b
            com.google.android.gms.common.ConnectionResult r0 = r8.f12676z
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.ConnectionResult r8 = r8.f12676z
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0071:
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            com.google.android.gms.common.internal.b$c r0 = r0.f12666p
            r0.mo12147a(r8)
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            r0.mo12229Q(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            com.google.android.gms.common.internal.b r8 = r7.f12692b
            com.google.android.gms.common.ConnectionResult r0 = r8.f12676z
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.ConnectionResult r8 = r8.f12676z
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0092:
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            com.google.android.gms.common.internal.b$c r0 = r0.f12666p
            r0.mo12147a(r8)
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            r0.mo12229Q(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            com.google.android.gms.common.internal.b r8 = r7.f12692b
            com.google.android.gms.common.internal.b$c r8 = r8.f12666p
            r8.mo12147a(r0)
            com.google.android.gms.common.internal.b r8 = r7.f12692b
            r8.mo12229Q(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            r0.m15022n0(r3, (android.os.IInterface) null)
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            com.google.android.gms.common.internal.b$a r1 = r0.f12671u
            if (r1 == 0) goto L_0x00d7
            com.google.android.gms.common.internal.b$a r0 = r0.f12671u
            int r1 = r8.arg2
            r0.mo12257x(r1)
        L_0x00d7:
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            int r8 = r8.arg2
            r0.mo12230R(r8)
            com.google.android.gms.common.internal.b r8 = r7.f12692b
            com.google.android.gms.common.internal.C3958b.m15020l0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            com.google.android.gms.common.internal.b r0 = r7.f12692b
            boolean r0 = r0.mo12237c()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            m15098a(r8)
            return
        L_0x00f4:
            boolean r0 = m15099b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.internal.o r8 = (com.google.android.gms.common.internal.C3977o) r8
            r8.mo12279c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r8, r0)
            return
        L_0x0120:
            m15098a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3976n.handleMessage(android.os.Message):void");
    }
}
