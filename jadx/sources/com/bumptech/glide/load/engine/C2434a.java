package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C2473o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p089g4.C6223k;
import p166m3.C7083e;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.engine.a */
final class C2434a {

    /* renamed from: a */
    private final boolean f7680a;

    /* renamed from: b */
    private final Executor f7681b;

    /* renamed from: c */
    final Map f7682c;

    /* renamed from: d */
    private final ReferenceQueue f7683d;

    /* renamed from: e */
    private C2473o.C2474a f7684e;

    /* renamed from: f */
    private volatile boolean f7685f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    class C2435a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        class C2436a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ Runnable f7686d;

            C2436a(Runnable runnable) {
                this.f7686d = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f7686d.run();
            }
        }

        C2435a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C2436a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    class C2437b implements Runnable {
        C2437b() {
        }

        public void run() {
            C2434a.this.mo7834b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    static final class C2438c extends WeakReference {

        /* renamed from: a */
        final C7083e f7689a;

        /* renamed from: b */
        final boolean f7690b;

        /* renamed from: c */
        C7430c f7691c;

        C2438c(C7083e eVar, C2473o oVar, ReferenceQueue referenceQueue, boolean z) {
            super(oVar, referenceQueue);
            C7430c cVar;
            this.f7689a = (C7083e) C6223k.m24730d(eVar);
            if (!oVar.mo7945e() || !z) {
                cVar = null;
            } else {
                cVar = (C7430c) C6223k.m24730d(oVar.mo7943c());
            }
            this.f7691c = cVar;
            this.f7690b = oVar.mo7945e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7842a() {
            this.f7691c = null;
            clear();
        }
    }

    C2434a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C2435a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7833a(C7083e eVar, C2473o oVar) {
        C2438c cVar = (C2438c) this.f7682c.put(eVar, new C2438c(eVar, oVar, this.f7683d, this.f7680a));
        if (cVar != null) {
            cVar.mo7842a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7834b() {
        while (!this.f7685f) {
            try {
                mo7835c((C2438c) this.f7683d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7835c(C2438c cVar) {
        synchronized (this) {
            this.f7682c.remove(cVar.f7689a);
            if (cVar.f7690b) {
                C7430c cVar2 = cVar.f7691c;
                if (cVar2 != null) {
                    this.f7684e.mo7904c(cVar.f7689a, new C2473o(cVar2, true, false, cVar.f7689a, this.f7684e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo7836d(C7083e eVar) {
        C2438c cVar = (C2438c) this.f7682c.remove(eVar);
        if (cVar != null) {
            cVar.mo7842a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.C2473o mo7837e(p166m3.C7083e r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.f7682c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$c r2 = (com.bumptech.glide.load.engine.C2434a.C2438c) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.o r0 = (com.bumptech.glide.load.engine.C2473o) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo7835c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2434a.mo7837e(m3.e):com.bumptech.glide.load.engine.o");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7838f(C2473o.C2474a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f7684e = aVar;
            }
        }
    }

    C2434a(boolean z, Executor executor) {
        this.f7682c = new HashMap();
        this.f7683d = new ReferenceQueue();
        this.f7680a = z;
        this.f7681b = executor;
        executor.execute(new C2437b());
    }
}
