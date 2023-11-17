package com.google.firebase.messaging;

import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.p0 */
class C5349p0 {

    /* renamed from: a */
    private final Executor f17080a;

    /* renamed from: b */
    private final Map f17081b = new ArrayMap();

    /* renamed from: com.google.firebase.messaging.p0$a */
    interface C5350a {
        Task start();
    }

    C5349p0(Executor executor) {
        this.f17080a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Task m21154c(String str, Task task) {
        synchronized (this) {
            this.f17081b.remove(str);
        }
        return task;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p337z7.Task mo17627b(java.lang.String r4, com.google.firebase.messaging.C5349p0.C5350a r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.f17081b     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0060 }
            z7.Task r0 = (p337z7.Task) r0     // Catch:{ all -> 0x0060 }
            r1 = 3
            if (r0 == 0) goto L_0x002c
            java.lang.String r5 = "FirebaseMessaging"
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x002a
            java.lang.String r5 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Joining ongoing request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r5, r4)     // Catch:{ all -> 0x0060 }
        L_0x002a:
            monitor-exit(r3)
            return r0
        L_0x002c:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Making new request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0060 }
        L_0x004a:
            z7.Task r5 = r5.start()     // Catch:{ all -> 0x0060 }
            java.util.concurrent.Executor r0 = r3.f17080a     // Catch:{ all -> 0x0060 }
            com.google.firebase.messaging.o0 r1 = new com.google.firebase.messaging.o0     // Catch:{ all -> 0x0060 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0060 }
            z7.Task r5 = r5.mo24867l(r0, r1)     // Catch:{ all -> 0x0060 }
            java.util.Map r0 = r3.f17081b     // Catch:{ all -> 0x0060 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)
            return r5
        L_0x0060:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5349p0.mo17627b(java.lang.String, com.google.firebase.messaging.p0$a):z7.Task");
    }
}
