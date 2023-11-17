package com.bumptech.glide.load.engine;

import androidx.core.util.C1005e;
import com.bumptech.glide.load.engine.C2446h;
import com.bumptech.glide.load.engine.C2473o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p035c4.C2257i;
import p089g4.C6212e;
import p089g4.C6223k;
import p102h4.C6427a;
import p102h4.C6436c;
import p166m3.C7079a;
import p166m3.C7083e;
import p192o3.C7430c;
import p231r3.C8049a;

/* renamed from: com.bumptech.glide.load.engine.k */
class C2464k implements C2446h.C2448b, C6427a.C6433f {

    /* renamed from: C */
    private static final C2467c f7809C = new C2467c();

    /* renamed from: A */
    private volatile boolean f7810A;

    /* renamed from: B */
    private boolean f7811B;

    /* renamed from: d */
    final C2469e f7812d;

    /* renamed from: e */
    private final C6436c f7813e;

    /* renamed from: f */
    private final C2473o.C2474a f7814f;

    /* renamed from: g */
    private final C1005e f7815g;

    /* renamed from: h */
    private final C2467c f7816h;

    /* renamed from: i */
    private final C2470l f7817i;

    /* renamed from: j */
    private final C8049a f7818j;

    /* renamed from: k */
    private final C8049a f7819k;

    /* renamed from: l */
    private final C8049a f7820l;

    /* renamed from: m */
    private final C8049a f7821m;

    /* renamed from: n */
    private final AtomicInteger f7822n;

    /* renamed from: o */
    private C7083e f7823o;

    /* renamed from: p */
    private boolean f7824p;

    /* renamed from: q */
    private boolean f7825q;

    /* renamed from: r */
    private boolean f7826r;

    /* renamed from: s */
    private boolean f7827s;

    /* renamed from: t */
    private C7430c f7828t;

    /* renamed from: u */
    C7079a f7829u;

    /* renamed from: v */
    private boolean f7830v;

    /* renamed from: w */
    GlideException f7831w;

    /* renamed from: x */
    private boolean f7832x;

    /* renamed from: y */
    C2473o f7833y;

    /* renamed from: z */
    private C2446h f7834z;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    private class C2465a implements Runnable {

        /* renamed from: d */
        private final C2257i f7835d;

        C2465a(C2257i iVar) {
            this.f7835d = iVar;
        }

        public void run() {
            synchronized (this.f7835d.mo7298h()) {
                synchronized (C2464k.this) {
                    if (C2464k.this.f7812d.mo7932c(this.f7835d)) {
                        C2464k.this.mo7915f(this.f7835d);
                    }
                    C2464k.this.mo7918i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$b */
    private class C2466b implements Runnable {

        /* renamed from: d */
        private final C2257i f7837d;

        C2466b(C2257i iVar) {
            this.f7837d = iVar;
        }

        public void run() {
            synchronized (this.f7837d.mo7298h()) {
                synchronized (C2464k.this) {
                    if (C2464k.this.f7812d.mo7932c(this.f7837d)) {
                        C2464k.this.f7833y.mo7942b();
                        C2464k.this.mo7916g(this.f7837d);
                        C2464k.this.mo7924r(this.f7837d);
                    }
                    C2464k.this.mo7918i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$c */
    static class C2467c {
        C2467c() {
        }

        /* renamed from: a */
        public C2473o mo7928a(C7430c cVar, boolean z, C7083e eVar, C2473o.C2474a aVar) {
            return new C2473o(cVar, z, true, eVar, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$d */
    static final class C2468d {

        /* renamed from: a */
        final C2257i f7839a;

        /* renamed from: b */
        final Executor f7840b;

        C2468d(C2257i iVar, Executor executor) {
            this.f7839a = iVar;
            this.f7840b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2468d) {
                return this.f7839a.equals(((C2468d) obj).f7839a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7839a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$e */
    static final class C2469e implements Iterable {

        /* renamed from: d */
        private final List f7841d;

        C2469e() {
            this(new ArrayList(2));
        }

        /* renamed from: i */
        private static C2468d m9554i(C2257i iVar) {
            return new C2468d(iVar, C6212e.m24710a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7931b(C2257i iVar, Executor executor) {
            this.f7841d.add(new C2468d(iVar, executor));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo7932c(C2257i iVar) {
            return this.f7841d.contains(m9554i(iVar));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f7841d.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C2469e mo7934g() {
            return new C2469e(new ArrayList(this.f7841d));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f7841d.isEmpty();
        }

        public Iterator iterator() {
            return this.f7841d.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo7937j(C2257i iVar) {
            this.f7841d.remove(m9554i(iVar));
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f7841d.size();
        }

        C2469e(List list) {
            this.f7841d = list;
        }
    }

    C2464k(C8049a aVar, C8049a aVar2, C8049a aVar3, C8049a aVar4, C2470l lVar, C2473o.C2474a aVar5, C1005e eVar) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, eVar, f7809C);
    }

    /* renamed from: j */
    private C8049a m9534j() {
        if (this.f7825q) {
            return this.f7820l;
        }
        if (this.f7826r) {
            return this.f7821m;
        }
        return this.f7819k;
    }

    /* renamed from: m */
    private boolean m9535m() {
        return this.f7832x || this.f7830v || this.f7810A;
    }

    /* renamed from: q */
    private synchronized void m9536q() {
        if (this.f7823o != null) {
            this.f7812d.clear();
            this.f7823o = null;
            this.f7833y = null;
            this.f7828t = null;
            this.f7832x = false;
            this.f7810A = false;
            this.f7830v = false;
            this.f7811B = false;
            this.f7834z.mo7879B(false);
            this.f7834z = null;
            this.f7831w = null;
            this.f7829u = null;
            this.f7815g.mo3439a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo7887a(C2446h hVar) {
        m9534j().execute(hVar);
    }

    /* renamed from: b */
    public void mo7888b(C7430c cVar, C7079a aVar, boolean z) {
        synchronized (this) {
            this.f7828t = cVar;
            this.f7829u = aVar;
            this.f7811B = z;
        }
        mo7922o();
    }

    /* renamed from: c */
    public C6436c mo7881c() {
        return this.f7813e;
    }

    /* renamed from: d */
    public void mo7889d(GlideException glideException) {
        synchronized (this) {
            this.f7831w = glideException;
        }
        mo7921n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo7914e(C2257i iVar, Executor executor) {
        this.f7813e.mo20310c();
        this.f7812d.mo7931b(iVar, executor);
        boolean z = true;
        if (this.f7830v) {
            mo7919k(1);
            executor.execute(new C2466b(iVar));
        } else if (this.f7832x) {
            mo7919k(1);
            executor.execute(new C2465a(iVar));
        } else {
            if (this.f7810A) {
                z = false;
            }
            C6223k.m24727a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7915f(C2257i iVar) {
        try {
            iVar.mo7297d(this.f7831w);
        } catch (Throwable th) {
            throw new C2439b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7916g(C2257i iVar) {
        try {
            iVar.mo7296b(this.f7833y, this.f7829u, this.f7811B);
        } catch (Throwable th) {
            throw new C2439b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7917h() {
        if (!m9535m()) {
            this.f7810A = true;
            this.f7834z.mo7883f();
            this.f7817i.mo7902a(this, this.f7823o);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7918i() {
        boolean z;
        C2473o oVar;
        synchronized (this) {
            this.f7813e.mo20310c();
            C6223k.m24727a(m9535m(), "Not yet complete!");
            int decrementAndGet = this.f7822n.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            C6223k.m24727a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                oVar = this.f7833y;
                m9536q();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            oVar.mo7946f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo7919k(int i) {
        C2473o oVar;
        C6223k.m24727a(m9535m(), "Not yet complete!");
        if (this.f7822n.getAndAdd(i) == 0 && (oVar = this.f7833y) != null) {
            oVar.mo7942b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C2464k mo7920l(C7083e eVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f7823o = eVar;
        this.f7824p = z;
        this.f7825q = z2;
        this.f7826r = z3;
        this.f7827s = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f7817i.mo7905d(r4, r1, (com.bumptech.glide.load.engine.C2473o) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = (com.bumptech.glide.load.engine.C2464k.C2468d) r0.next();
        r1.f7840b.execute(new com.bumptech.glide.load.engine.C2464k.C2465a(r4, r1.f7839a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo7918i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7921n() {
        /*
            r4 = this;
            monitor-enter(r4)
            h4.c r0 = r4.f7813e     // Catch:{ all -> 0x0066 }
            r0.mo20310c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f7810A     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m9536q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.k$e r0 = r4.f7812d     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f7832x     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f7832x = r0     // Catch:{ all -> 0x0066 }
            m3.e r1 = r4.f7823o     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r4.f7812d     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r2.mo7934g()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo7919k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.l r0 = r4.f7817i
            r3 = 0
            r0.mo7905d(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C2464k.C2468d) r1
            java.util.concurrent.Executor r2 = r1.f7840b
            com.bumptech.glide.load.engine.k$a r3 = new com.bumptech.glide.load.engine.k$a
            c4.i r1 = r1.f7839a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo7918i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2464k.mo7921n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f7817i.mo7905d(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = (com.bumptech.glide.load.engine.C2464k.C2468d) r0.next();
        r1.f7840b.execute(new com.bumptech.glide.load.engine.C2464k.C2466b(r5, r1.f7839a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo7918i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7922o() {
        /*
            r5 = this;
            monitor-enter(r5)
            h4.c r0 = r5.f7813e     // Catch:{ all -> 0x007c }
            r0.mo20310c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f7810A     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            o3.c r0 = r5.f7828t     // Catch:{ all -> 0x007c }
            r0.recycle()     // Catch:{ all -> 0x007c }
            r5.m9536q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.k$e r0 = r5.f7812d     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f7830v     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.engine.k$c r0 = r5.f7816h     // Catch:{ all -> 0x007c }
            o3.c r1 = r5.f7828t     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f7824p     // Catch:{ all -> 0x007c }
            m3.e r3 = r5.f7823o     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o$a r4 = r5.f7814f     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o r0 = r0.mo7928a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f7833y = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f7830v = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r5.f7812d     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r1.mo7934g()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo7919k(r2)     // Catch:{ all -> 0x007c }
            m3.e r0 = r5.f7823o     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o r2 = r5.f7833y     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.l r3 = r5.f7817i
            r3.mo7905d(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C2464k.C2468d) r1
            java.util.concurrent.Executor r2 = r1.f7840b
            com.bumptech.glide.load.engine.k$b r3 = new com.bumptech.glide.load.engine.k$b
            c4.i r1 = r1.f7839a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo7918i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2464k.mo7922o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo7923p() {
        return this.f7827s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo7924r(C2257i iVar) {
        boolean z;
        this.f7813e.mo20310c();
        this.f7812d.mo7937j(iVar);
        if (this.f7812d.isEmpty()) {
            mo7917h();
            if (!this.f7830v) {
                if (!this.f7832x) {
                    z = false;
                    if (z && this.f7822n.get() == 0) {
                        m9536q();
                    }
                }
            }
            z = true;
            m9536q();
        }
    }

    /* renamed from: s */
    public synchronized void mo7925s(C2446h hVar) {
        C8049a aVar;
        this.f7834z = hVar;
        if (hVar.mo7880I()) {
            aVar = this.f7818j;
        } else {
            aVar = m9534j();
        }
        aVar.execute(hVar);
    }

    C2464k(C8049a aVar, C8049a aVar2, C8049a aVar3, C8049a aVar4, C2470l lVar, C2473o.C2474a aVar5, C1005e eVar, C2467c cVar) {
        this.f7812d = new C2469e();
        this.f7813e = C6436c.m25531a();
        this.f7822n = new AtomicInteger();
        this.f7818j = aVar;
        this.f7819k = aVar2;
        this.f7820l = aVar3;
        this.f7821m = aVar4;
        this.f7817i = lVar;
        this.f7814f = aVar5;
        this.f7815g = eVar;
        this.f7816h = cVar;
    }
}
