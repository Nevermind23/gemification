package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3958b;
import p182n6.C7264i;
import p247s6.C8242b;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
public final class C4630e8 implements ServiceConnection, C3958b.C3959a, C3958b.C3960b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f14316a;

    /* renamed from: b */
    private volatile C4702l3 f14317b;

    /* renamed from: c */
    final /* synthetic */ C4641f8 f14318c;

    protected C4630e8(C4641f8 f8Var) {
        this.f14318c = f8Var;
    }

    /* renamed from: b */
    public final void mo14352b(Intent intent) {
        this.f14318c.mo14554h();
        Context c = this.f14318c.f14613a.mo14550c();
        C8242b b = C8242b.m31044b();
        synchronized (this) {
            if (this.f14316a) {
                this.f14318c.f14613a.mo14551d().mo14679v().mo14615a("Connection attempt already in progress");
                return;
            }
            this.f14318c.f14613a.mo14551d().mo14679v().mo14615a("Using local app measurement service");
            this.f14316a = true;
            b.mo23425a(c, intent, this.f14318c.f14432c, 129);
        }
    }

    /* renamed from: c */
    public final void mo14353c() {
        this.f14318c.mo14554h();
        Context c = this.f14318c.f14613a.mo14550c();
        synchronized (this) {
            if (this.f14316a) {
                this.f14318c.f14613a.mo14551d().mo14679v().mo14615a("Connection attempt already in progress");
            } else if (this.f14317b == null || (!this.f14317b.mo12241f() && !this.f14317b.mo12237c())) {
                this.f14317b = new C4702l3(c, Looper.getMainLooper(), this, this);
                this.f14318c.f14613a.mo14551d().mo14679v().mo14615a("Connecting to remote service");
                this.f14316a = true;
                C7264i.m27902k(this.f14317b);
                this.f14317b.mo12252v();
            } else {
                this.f14318c.f14613a.mo14551d().mo14679v().mo14615a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: d */
    public final void mo14354d() {
        if (this.f14317b != null && (this.f14317b.mo12237c() || this.f14317b.mo12241f())) {
            this.f14317b.mo12236b();
        }
        this.f14317b = null;
    }

    /* renamed from: k */
    public final void mo12256k(Bundle bundle) {
        C7264i.m27897f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C7264i.m27902k(this.f14317b);
                this.f14318c.f14613a.mo14552f().mo14776z(new C4594b8(this, (C8252f) this.f14317b.mo12223I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f14317b = null;
                this.f14316a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f14318c.f14613a.mo14551d().mo14675r().mo14615a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            p182n6.C7264i.m27897f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f14316a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.f8 r4 = r3.f14318c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.t4 r4 = r4.f14613a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo14551d()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n3 r4 = r4.mo14675r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo14615a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof p248s7.C8252f     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            s7.f r1 = (p248s7.C8252f) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.g3 r1 = new com.google.android.gms.measurement.internal.g3     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.f8 r5 = r3.f14318c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.t4 r5 = r5.f14613a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14679v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo14615a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.f8 r5 = r3.f14318c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.t4 r5 = r5.f14613a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14675r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo14616b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.f8 r5 = r3.f14318c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.t4 r5 = r5.f14613a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14675r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo14615a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f14316a = r4     // Catch:{ all -> 0x0063 }
            s6.b r4 = p247s6.C8242b.m31044b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.f8 r5 = r3.f14318c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.t4 r5 = r5.f14613a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo14550c()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.f8 r0 = r3.f14318c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.e8 r0 = r0.f14432c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo23426c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.f8 r4 = r3.f14318c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.t4 r4 = r4.f14613a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.r4 r4 = r4.mo14552f()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.z7 r5 = new com.google.android.gms.measurement.internal.z7     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo14776z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4630e8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C7264i.m27897f("MeasurementServiceConnection.onServiceDisconnected");
        this.f14318c.f14613a.mo14551d().mo14674q().mo14615a("Service disconnected");
        this.f14318c.f14613a.mo14552f().mo14776z(new C4582a8(this, componentName));
    }

    /* renamed from: x */
    public final void mo12257x(int i) {
        C7264i.m27897f("MeasurementServiceConnection.onConnectionSuspended");
        this.f14318c.f14613a.mo14551d().mo14674q().mo14615a("Service connection suspended");
        this.f14318c.f14613a.mo14552f().mo14776z(new C4606c8(this));
    }

    /* renamed from: y */
    public final void mo12258y(ConnectionResult connectionResult) {
        C7264i.m27897f("MeasurementServiceConnection.onConnectionFailed");
        C4746p3 E = this.f14318c.f14613a.mo14848E();
        if (E != null) {
            E.mo14680w().mo14616b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f14316a = false;
            this.f14317b = null;
        }
        this.f14318c.f14613a.mo14552f().mo14776z(new C4618d8(this));
    }
}
