package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
public final class C4105b1 extends C4207h1 {

    /* renamed from: b */
    private final AtomicReference f13153b = new AtomicReference();

    /* renamed from: c */
    private boolean f13154c;

    /* renamed from: A2 */
    public static final Object m15525A2(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* renamed from: H1 */
    public final void mo12891H1(Bundle bundle) {
        synchronized (this.f13153b) {
            try {
                this.f13153b.set(bundle);
                this.f13154c = true;
                this.f13153b.notify();
            } catch (Throwable th) {
                this.f13153b.notify();
                throw th;
            }
        }
    }

    /* renamed from: T1 */
    public final String mo12892T1(long j) {
        return (String) m15525A2(mo12893x(j), String.class);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo12893x(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f13153b
            monitor-enter(r0)
            boolean r1 = r2.f13154c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f13153b     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f13153b     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4105b1.mo12893x(long):android.os.Bundle");
    }

    /* renamed from: y */
    public final Long mo12894y(long j) {
        return (Long) m15525A2(mo12893x(j), Long.class);
    }
}
