package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.y0 */
class C5370y0 {

    /* renamed from: i */
    private static final long f17130i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f17131a;

    /* renamed from: b */
    private final C5325f0 f17132b;

    /* renamed from: c */
    private final C5306a0 f17133c;

    /* renamed from: d */
    private final FirebaseMessaging f17134d;

    /* renamed from: e */
    private final Map f17135e = new ArrayMap();

    /* renamed from: f */
    private final ScheduledExecutorService f17136f;

    /* renamed from: g */
    private boolean f17137g = false;

    /* renamed from: h */
    private final C5366w0 f17138h;

    private C5370y0(FirebaseMessaging firebaseMessaging, C5325f0 f0Var, C5366w0 w0Var, C5306a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f17134d = firebaseMessaging;
        this.f17132b = f0Var;
        this.f17138h = w0Var;
        this.f17133c = a0Var;
        this.f17131a = context;
        this.f17136f = scheduledExecutorService;
    }

    /* renamed from: b */
    private static void m21201b(Task task) {
        try {
            C9231i.m34108b(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: c */
    private void m21202c(String str) {
        m21201b(this.f17133c.mo17557k(this.f17134d.mo17530i(), str));
    }

    /* renamed from: d */
    private void m21203d(String str) {
        m21201b(this.f17133c.mo17558l(this.f17134d.mo17530i(), str));
    }

    /* renamed from: e */
    static Task m21204e(FirebaseMessaging firebaseMessaging, C5325f0 f0Var, C5306a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        return C9231i.m34110d(scheduledExecutorService, new C5368x0(context, scheduledExecutorService, firebaseMessaging, f0Var, a0Var));
    }

    /* renamed from: g */
    static boolean m21205g() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C5370y0 m21206i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C5325f0 f0Var, C5306a0 a0Var) {
        return new C5370y0(firebaseMessaging, f0Var, C5366w0.m21194a(context, scheduledExecutorService), a0Var, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21207j(com.google.firebase.messaging.C5364v0 r5) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f17135e
            monitor-enter(r0)
            java.lang.String r5 = r5.mo17654e()     // Catch:{ all -> 0x0032 }
            java.util.Map r1 = r4.f17135e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map r1 = r4.f17135e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            z7.g r2 = (p337z7.C9227g) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo24885c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map r1 = r4.f17135e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5370y0.m21207j(com.google.firebase.messaging.v0):void");
    }

    /* renamed from: n */
    private void m21208n() {
        if (!mo17663h()) {
            mo17669q(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo17662f() {
        return this.f17138h.mo17658b() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized boolean mo17663h() {
        return this.f17137g;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[Catch:{ IOException -> 0x00a2 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17664k(com.google.firebase.messaging.C5364v0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.mo17652b()     // Catch:{ IOException -> 0x00a2 }
            int r3 = r2.hashCode()     // Catch:{ IOException -> 0x00a2 }
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L_0x001f
            r4 = 85
            if (r3 == r4) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException -> 0x00a2 }
            if (r2 == 0) goto L_0x0029
            r2 = r5
            goto L_0x002a
        L_0x001f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException -> 0x00a2 }
            if (r2 == 0) goto L_0x0029
            r2 = r1
            goto L_0x002a
        L_0x0029:
            r2 = -1
        L_0x002a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L_0x0079
            if (r2 == r5) goto L_0x0050
            boolean r2 = m21205g()     // Catch:{ IOException -> 0x00a2 }
            if (r2 == 0) goto L_0x00a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a2 }
            r2.<init>()     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch:{ IOException -> 0x00a2 }
            r2.append(r7)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r7 = "."
            r2.append(r7)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x00a2 }
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a1
        L_0x0050:
            java.lang.String r2 = r7.mo17653c()     // Catch:{ IOException -> 0x00a2 }
            r6.m21203d(r2)     // Catch:{ IOException -> 0x00a2 }
            boolean r2 = m21205g()     // Catch:{ IOException -> 0x00a2 }
            if (r2 == 0) goto L_0x00a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a2 }
            r2.<init>()     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r7 = r7.mo17653c()     // Catch:{ IOException -> 0x00a2 }
            r2.append(r7)     // Catch:{ IOException -> 0x00a2 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x00a2 }
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a1
        L_0x0079:
            java.lang.String r2 = r7.mo17653c()     // Catch:{ IOException -> 0x00a2 }
            r6.m21202c(r2)     // Catch:{ IOException -> 0x00a2 }
            boolean r2 = m21205g()     // Catch:{ IOException -> 0x00a2 }
            if (r2 == 0) goto L_0x00a1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a2 }
            r2.<init>()     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r7 = r7.mo17653c()     // Catch:{ IOException -> 0x00a2 }
            r2.append(r7)     // Catch:{ IOException -> 0x00a2 }
            r2.append(r3)     // Catch:{ IOException -> 0x00a2 }
            java.lang.String r7 = r2.toString()     // Catch:{ IOException -> 0x00a2 }
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x00a2 }
        L_0x00a1:
            return r5
        L_0x00a2:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00c9
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00bc
            goto L_0x00c9
        L_0x00bc:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto L_0x00c8
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        L_0x00c8:
            throw r7
        L_0x00c9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5370y0.mo17664k(com.google.firebase.messaging.v0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo17665l(Runnable runnable, long j) {
        this.f17136f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized void mo17666m(boolean z) {
        this.f17137g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo17667o() {
        if (mo17662f()) {
            m21208n();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (mo17664k(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return true;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17668p() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.w0 r0 = r2.f17138h     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.v0 r0 = r0.mo17658b()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = m21205g()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            r0 = 1
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.mo17664k(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.w0 r1 = r2.f17138h
            r1.mo17659d(r0)
            r2.m21207j(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5370y0.mo17668p():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo17669q(long j) {
        mo17665l(new C5372z0(this, this.f17131a, this.f17132b, Math.min(Math.max(30, 2 * j), f17130i)), j);
        mo17666m(true);
    }
}
