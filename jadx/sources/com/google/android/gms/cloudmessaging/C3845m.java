package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p079f7.C6168e;
import p117i6.C6578g;
import p273u6.C8638b;
import p337z7.Task;

/* renamed from: com.google.android.gms.cloudmessaging.m */
public final class C3845m {

    /* renamed from: e */
    private static C3845m f12224e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f12225a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f12226b;

    /* renamed from: c */
    private C3840h f12227c = new C3840h(this, (C6578g) null);

    /* renamed from: d */
    private int f12228d = 1;

    C3845m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f12226b = scheduledExecutorService;
        this.f12225a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C3845m m14452b(Context context) {
        C3845m mVar;
        synchronized (C3845m.class) {
            if (f12224e == null) {
                C6168e.m24579a();
                f12224e = new C3845m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C8638b("MessengerIpcClient"))));
            }
            mVar = f12224e;
        }
        return mVar;
    }

    /* renamed from: f */
    private final synchronized int m14454f() {
        int i;
        i = this.f12228d;
        this.f12228d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized Task m14455g(C3843k kVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(kVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f12227c.mo11836g(kVar)) {
            C3840h hVar = new C3840h(this, (C6578g) null);
            this.f12227c = hVar;
            hVar.mo11836g(kVar);
        }
        return kVar.f12221b.mo24883a();
    }

    /* renamed from: c */
    public final Task mo11845c(int i, Bundle bundle) {
        return m14455g(new C3842j(m14454f(), 2, bundle));
    }

    /* renamed from: d */
    public final Task mo11846d(int i, Bundle bundle) {
        return m14455g(new C3844l(m14454f(), 1, bundle));
    }
}
