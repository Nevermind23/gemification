package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p300w7.C8873a;

/* renamed from: com.google.firebase.messaging.b1 */
abstract class C5311b1 {

    /* renamed from: a */
    static final long f17025a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f17026b = new Object();

    /* renamed from: c */
    private static C8873a f17027c;

    /* renamed from: b */
    private static void m20993b(Context context) {
        if (f17027c == null) {
            C8873a aVar = new C8873a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f17027c = aVar;
            aVar.mo24299d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m20994c(Intent intent) {
        synchronized (f17026b) {
            if (f17027c != null && m20995d(intent)) {
                m20998g(intent, false);
                f17027c.mo24298c();
            }
        }
    }

    /* renamed from: d */
    static boolean m20995d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: f */
    static void m20997f(Context context, C5329g1 g1Var, Intent intent) {
        synchronized (f17026b) {
            m20993b(context);
            boolean d = m20995d(intent);
            m20998g(intent, true);
            if (!d) {
                f17027c.mo24296a(f17025a);
            }
            g1Var.mo17600c(intent).mo24858c(new C5307a1(intent));
        }
    }

    /* renamed from: g */
    private static void m20998g(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName m20999h(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f17026b
            monitor-enter(r0)
            m20993b(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m20995d(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m20998g(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            r3 = 0
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            w7.a r4 = f17027c     // Catch:{ all -> 0x0022 }
            long r1 = f17025a     // Catch:{ all -> 0x0022 }
            r4.mo24296a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5311b1.m20999h(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
