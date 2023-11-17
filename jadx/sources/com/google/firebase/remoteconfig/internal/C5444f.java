package com.google.firebase.remoteconfig.internal;

import androidx.profileinstaller.C1694g;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p337z7.C9217b;
import p337z7.C9221d;
import p337z7.C9223e;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: com.google.firebase.remoteconfig.internal.f */
public class C5444f {

    /* renamed from: d */
    private static final Map f17382d = new HashMap();

    /* renamed from: e */
    private static final Executor f17383e = new C1694g();

    /* renamed from: a */
    private final Executor f17384a;

    /* renamed from: b */
    private final C5468t f17385b;

    /* renamed from: c */
    private Task f17386c = null;

    /* renamed from: com.google.firebase.remoteconfig.internal.f$b */
    private static class C5446b implements C9223e, C9221d, C9217b {

        /* renamed from: a */
        private final CountDownLatch f17387a;

        private C5446b() {
            this.f17387a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public void mo17635a(Object obj) {
            this.f17387a.countDown();
        }

        /* renamed from: b */
        public void mo18086b() {
            this.f17387a.countDown();
        }

        /* renamed from: c */
        public boolean mo18087c(long j, TimeUnit timeUnit) {
            return this.f17387a.await(j, timeUnit);
        }

        public void onFailure(Exception exc) {
            this.f17387a.countDown();
        }
    }

    private C5444f(Executor executor, C5468t tVar) {
        this.f17384a = executor;
        this.f17385b = tVar;
    }

    /* renamed from: c */
    private static Object m21647c(Task task, long j, TimeUnit timeUnit) {
        C5446b bVar = new C5446b();
        Executor executor = f17383e;
        task.mo24863h(executor, bVar);
        task.mo24860e(executor, bVar);
        task.mo24856a(executor, bVar);
        if (!bVar.mo18087c(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.mo24873r()) {
            return task.mo24869n();
        } else {
            throw new ExecutionException(task.mo24868m());
        }
    }

    /* renamed from: h */
    public static synchronized C5444f m21648h(Executor executor, C5468t tVar) {
        C5444f fVar;
        synchronized (C5444f.class) {
            String b = tVar.mo18148b();
            Map map = f17382d;
            if (!map.containsKey(b)) {
                map.put(b, new C5444f(executor, tVar));
            }
            fVar = (C5444f) map.get(b);
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Void m21649i(C5447g gVar) {
        return this.f17385b.mo18150e(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m21650j(boolean z, C5447g gVar, Void voidR) {
        if (z) {
            m21651m(gVar);
        }
        return C9231i.m34113g(gVar);
    }

    /* renamed from: m */
    private synchronized void m21651m(C5447g gVar) {
        this.f17386c = C9231i.m34113g(gVar);
    }

    /* renamed from: d */
    public void mo18080d() {
        synchronized (this) {
            this.f17386c = C9231i.m34113g((Object) null);
        }
        this.f17385b.mo18147a();
    }

    /* renamed from: e */
    public synchronized Task mo18081e() {
        Task task = this.f17386c;
        if (task == null || (task.mo24872q() && !this.f17386c.mo24873r())) {
            Executor executor = this.f17384a;
            C5468t tVar = this.f17385b;
            Objects.requireNonNull(tVar);
            this.f17386c = C9231i.m34110d(executor, new C5441c(tVar));
        }
        return this.f17386c;
    }

    /* renamed from: f */
    public C5447g mo18082f() {
        return mo18083g(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return (com.google.firebase.remoteconfig.internal.C5447g) m21647c(mo18081e(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.C5447g mo18083g(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            z7.Task r0 = r2.f17386c     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo24873r()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            z7.Task r3 = r2.f17386c     // Catch:{ all -> 0x0031 }
            java.lang.Object r3 = r3.mo24869n()     // Catch:{ all -> 0x0031 }
            com.google.firebase.remoteconfig.internal.g r3 = (com.google.firebase.remoteconfig.internal.C5447g) r3     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return r3
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            z7.Task r0 = r2.mo18081e()     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.lang.Object r3 = m21647c(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            com.google.firebase.remoteconfig.internal.g r3 = (com.google.firebase.remoteconfig.internal.C5447g) r3     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            return r3
        L_0x0023:
            r3 = move-exception
            goto L_0x0028
        L_0x0025:
            r3 = move-exception
            goto L_0x0028
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0031:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C5444f.mo18083g(long):com.google.firebase.remoteconfig.internal.g");
    }

    /* renamed from: k */
    public Task mo18084k(C5447g gVar) {
        return mo18085l(gVar, true);
    }

    /* renamed from: l */
    public Task mo18085l(C5447g gVar, boolean z) {
        return C9231i.m34110d(this.f17384a, new C5442d(this, gVar)).mo24874s(this.f17384a, new C5443e(this, z, gVar));
    }
}
