package com.facetec.sdk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.mk */
public class C3426mk extends C3463ne {

    /* renamed from: a */
    static C3426mk f11249a;

    /* renamed from: d */
    private static final long f11250d;

    /* renamed from: e */
    private static final long f11251e;

    /* renamed from: f */
    private boolean f11252f;

    /* renamed from: g */
    private long f11253g;

    /* renamed from: j */
    private C3426mk f11254j;

    /* renamed from: com.facetec.sdk.mk$a */
    static final class C3429a extends Thread {
        C3429a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0015, code lost:
            r1.mo9570c();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<com.facetec.sdk.mk> r0 = com.facetec.sdk.C3426mk.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                com.facetec.sdk.mk r1 = com.facetec.sdk.C3426mk.m13641e()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                com.facetec.sdk.mk r2 = com.facetec.sdk.C3426mk.f11249a     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                com.facetec.sdk.C3426mk.f11249a = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                r1.mo9570c()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3426mk.C3429a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f11251e = millis;
        f11250d = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: b */
    public final void mo9828b() {
        if (!this.f11252f) {
            long a_ = mo9911a_();
            boolean e_ = mo9917e_();
            if (a_ != 0 || e_) {
                this.f11252f = true;
                m13638c(this, a_, e_);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9570c() {
    }

    /* renamed from: d */
    public final boolean mo9830d() {
        if (!this.f11252f) {
            return false;
        }
        this.f11252f = false;
        return m13640d(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9831e(boolean z) {
        if (mo9830d() && z) {
            throw mo9760c((IOException) null);
        }
    }

    /* renamed from: c */
    private static synchronized void m13638c(C3426mk mkVar, long j, boolean z) {
        synchronized (C3426mk.class) {
            if (f11249a == null) {
                f11249a = new C3426mk();
                new C3429a().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i != 0 && z) {
                mkVar.f11253g = Math.min(j, mkVar.mo9914b_() - nanoTime) + nanoTime;
            } else if (i != 0) {
                mkVar.f11253g = j + nanoTime;
            } else if (z) {
                mkVar.f11253g = mkVar.mo9914b_();
            } else {
                throw new AssertionError();
            }
            long d = mkVar.m13639d(nanoTime);
            C3426mk mkVar2 = f11249a;
            while (true) {
                C3426mk mkVar3 = mkVar2.f11254j;
                if (mkVar3 == null) {
                    break;
                } else if (d < mkVar3.m13639d(nanoTime)) {
                    break;
                } else {
                    mkVar2 = mkVar2.f11254j;
                }
            }
            mkVar.f11254j = mkVar2.f11254j;
            mkVar2.f11254j = mkVar;
            if (mkVar2 == f11249a) {
                C3426mk.class.notify();
            }
        }
    }

    /* renamed from: e */
    static C3426mk m13641e() {
        C3426mk mkVar = f11249a.f11254j;
        Class<C3426mk> cls = C3426mk.class;
        if (mkVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f11251e);
            if (f11249a.f11254j != null || System.nanoTime() - nanoTime < f11250d) {
                return null;
            }
            return f11249a;
        }
        long d = mkVar.m13639d(System.nanoTime());
        if (d > 0) {
            long j = d / 1000000;
            cls.wait(j, (int) (d - (1000000 * j)));
            return null;
        }
        f11249a.f11254j = mkVar.f11254j;
        mkVar.f11254j = null;
        return mkVar;
    }

    /* renamed from: d */
    private static synchronized boolean m13640d(C3426mk mkVar) {
        synchronized (C3426mk.class) {
            C3426mk mkVar2 = f11249a;
            while (mkVar2 != null) {
                C3426mk mkVar3 = mkVar2.f11254j;
                if (mkVar3 == mkVar) {
                    mkVar2.f11254j = mkVar.f11254j;
                    mkVar.f11254j = null;
                    return false;
                }
                mkVar2 = mkVar3;
            }
            return true;
        }
    }

    /* renamed from: d */
    private long m13639d(long j) {
        return this.f11253g - j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final IOException mo9829d(IOException iOException) {
        if (!mo9830d()) {
            return iOException;
        }
        return mo9760c(iOException);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public IOException mo9760c(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
