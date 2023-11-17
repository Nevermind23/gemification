package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p079f7.C6169f;
import p117i6.C6578g;
import p182n6.C7264i;
import p247s6.C8242b;

/* renamed from: com.google.android.gms.cloudmessaging.h */
final class C3840h implements ServiceConnection {

    /* renamed from: a */
    int f12212a = 0;

    /* renamed from: b */
    final Messenger f12213b = new Messenger(new C6169f(Looper.getMainLooper(), new C3834b(this)));

    /* renamed from: c */
    C3841i f12214c;

    /* renamed from: d */
    final Queue f12215d = new ArrayDeque();

    /* renamed from: e */
    final SparseArray f12216e = new SparseArray();

    /* renamed from: f */
    final /* synthetic */ C3845m f12217f;

    /* synthetic */ C3840h(C3845m mVar, C6578g gVar) {
        this.f12217f = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11830a(int i, String str) {
        mo11831b(i, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo11831b(int i, String str, Throwable th) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i2 = this.f12212a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f12212a = 4;
            C8242b.m31044b().mo23426c(this.f12217f.f12225a, this);
            zzq zzq = new zzq(i, str, th);
            for (C3843k c : this.f12215d) {
                c.mo11842c(zzq);
            }
            this.f12215d.clear();
            for (int i3 = 0; i3 < this.f12216e.size(); i3++) {
                ((C3843k) this.f12216e.valueAt(i3)).mo11842c(zzq);
            }
            this.f12216e.clear();
        } else if (i2 == 3) {
            this.f12212a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11832c() {
        this.f12217f.f12226b.execute(new C3836d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo11833d() {
        if (this.f12212a == 1) {
            mo11830a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo11834e(int i) {
        C3843k kVar = (C3843k) this.f12216e.get(i);
        if (kVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f12216e.remove(i);
            kVar.mo11842c(new zzq(3, "Timed out waiting for response", (Throwable) null));
            mo11835f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11835f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f12212a     // Catch:{ all -> 0x0039 }
            r1 = 2
            if (r0 != r1) goto L_0x0037
            java.util.Queue r0 = r2.f12215d     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray r0 = r2.f12216e     // Catch:{ all -> 0x0039 }
            int r0 = r0.size()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r0 = 3
            r2.f12212a = r0     // Catch:{ all -> 0x0039 }
            s6.b r0 = p247s6.C8242b.m31044b()     // Catch:{ all -> 0x0039 }
            com.google.android.gms.cloudmessaging.m r1 = r2.f12217f     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r1.f12225a     // Catch:{ all -> 0x0039 }
            r0.mo23426c(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C3840h.mo11835f():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean mo11836g(C3843k kVar) {
        boolean z;
        int i = this.f12212a;
        if (i == 0) {
            this.f12215d.add(kVar);
            if (this.f12212a == 0) {
                z = true;
            } else {
                z = false;
            }
            C7264i.m27905n(z);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f12212a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!C8242b.m31044b().mo23425a(this.f12217f.f12225a, intent, this, 1)) {
                    mo11830a(0, "Unable to bind to service");
                } else {
                    this.f12217f.f12226b.schedule(new C3837e(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo11831b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f12215d.add(kVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f12215d.add(kVar);
            mo11832c();
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f12217f.f12226b.execute(new C3838f(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f12217f.f12226b.execute(new C3835c(this));
    }
}
