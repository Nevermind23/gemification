package com.facetec.sdk;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: com.facetec.sdk.kj */
public final class C3306kj implements Closeable, Flushable {

    /* renamed from: a */
    private int f10858a;

    /* renamed from: b */
    private long f10859b;

    /* renamed from: c */
    private C3434mp f10860c;

    /* renamed from: d */
    private C3396lx f10861d;

    /* renamed from: e */
    private long f10862e;

    /* renamed from: f */
    private boolean f10863f;

    /* renamed from: g */
    private LinkedHashMap<String, C3307b> f10864g;

    /* renamed from: h */
    private boolean f10865h;

    /* renamed from: i */
    private int f10866i;

    /* renamed from: j */
    private boolean f10867j;

    /* renamed from: k */
    private final Executor f10868k;

    /* renamed from: n */
    private final Runnable f10869n;

    /* renamed from: com.facetec.sdk.kj$b */
    final class C3307b {

        /* renamed from: a */
        final String f10870a;

        /* renamed from: b */
        final long[] f10871b;

        /* renamed from: c */
        boolean f10872c;

        /* renamed from: d */
        final File[] f10873d;

        /* renamed from: e */
        final File[] f10874e;

        /* renamed from: h */
        C3308d f10875h;
    }

    /* renamed from: com.facetec.sdk.kj$d */
    public final class C3308d {

        /* renamed from: b */
        final C3307b f10876b;

        /* renamed from: c */
        boolean f10877c;

        /* renamed from: e */
        final /* synthetic */ C3306kj f10878e;
    }

    static {
        Pattern.compile("[a-z0-9_-]{1,120}");
    }

    /* renamed from: a */
    private boolean m13276a() {
        int i = this.f10866i;
        if (i < 2000 || i < this.f10864g.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m13277b(C3307b bVar) {
        C3308d dVar = bVar.f10875h;
        if (dVar != null && dVar.f10876b.f10875h == dVar) {
            int i = 0;
            while (true) {
                C3306kj kjVar = dVar.f10878e;
                if (i >= kjVar.f10858a) {
                    break;
                }
                try {
                    kjVar.f10861d.mo9779e(dVar.f10876b.f10873d[i]);
                } catch (IOException unused) {
                }
                i++;
            }
            dVar.f10876b.f10875h = null;
        }
        for (int i2 = 0; i2 < this.f10858a; i2++) {
            this.f10861d.mo9779e(bVar.f10874e[i2]);
            long j = this.f10862e;
            long[] jArr = bVar.f10871b;
            this.f10862e = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f10866i++;
        this.f10860c.mo9860e("REMOVE").mo9870g(32).mo9860e(bVar.f10870a).mo9870g(10);
        this.f10864g.remove(bVar.f10870a);
        if (m13276a()) {
            this.f10868k.execute(this.f10869n);
        }
        return true;
    }

    /* renamed from: c */
    private void m13278c() {
        while (this.f10862e > this.f10859b) {
            m13277b(this.f10864g.values().iterator().next());
        }
        this.f10867j = false;
    }

    /* renamed from: d */
    private synchronized void m13279d(C3308d dVar) {
        C3307b bVar = dVar.f10876b;
        if (bVar.f10875h == dVar) {
            for (int i = 0; i < this.f10858a; i++) {
                this.f10861d.mo9779e(bVar.f10873d[i]);
            }
            this.f10866i++;
            bVar.f10875h = null;
            if (bVar.f10872c) {
                bVar.f10872c = true;
                this.f10860c.mo9860e("CLEAN").mo9870g(32);
                this.f10860c.mo9860e(bVar.f10870a);
                C3434mp mpVar = this.f10860c;
                for (long n : bVar.f10871b) {
                    mpVar.mo9870g(32).mo9884n(n);
                }
                this.f10860c.mo9870g(10);
            } else {
                this.f10864g.remove(bVar.f10870a);
                this.f10860c.mo9860e("REMOVE").mo9870g(32);
                this.f10860c.mo9860e(bVar.f10870a);
                this.f10860c.mo9870g(10);
            }
            this.f10860c.flush();
            if (this.f10862e > this.f10859b || m13276a()) {
                this.f10868k.execute(this.f10869n);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    private synchronized void m13281e() {
        if (m13280d()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void close() {
        if (this.f10865h) {
            if (!this.f10863f) {
                for (C3307b bVar : (C3307b[]) this.f10864g.values().toArray(new C3307b[this.f10864g.size()])) {
                    C3308d dVar = bVar.f10875h;
                    if (dVar != null) {
                        synchronized (dVar.f10878e) {
                            if (!dVar.f10877c) {
                                if (dVar.f10876b.f10875h == dVar) {
                                    dVar.f10878e.m13279d(dVar);
                                }
                                dVar.f10877c = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
                m13278c();
                this.f10860c.close();
                this.f10860c = null;
                this.f10863f = true;
                return;
            }
        }
        this.f10863f = true;
    }

    public final synchronized void flush() {
        if (this.f10865h) {
            m13281e();
            m13278c();
            this.f10860c.flush();
        }
    }

    /* renamed from: d */
    private synchronized boolean m13280d() {
        return this.f10863f;
    }
}
