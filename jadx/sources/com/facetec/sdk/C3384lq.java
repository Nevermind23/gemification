package com.facetec.sdk;

import com.facetec.sdk.C3362lm;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* renamed from: com.facetec.sdk.lq */
public final class C3384lq {

    /* renamed from: k */
    static final /* synthetic */ boolean f11146k = true;

    /* renamed from: n */
    public static final int f11147n = 0;

    /* renamed from: o */
    private static byte[] f11148o;

    /* renamed from: a */
    final C3364ln f11149a;
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public final Deque<C3260jr> f11150b;

    /* renamed from: c */
    long f11151c = 0;

    /* renamed from: d */
    long f11152d;

    /* renamed from: e */
    final int f11153e;

    /* renamed from: f */
    final C3387e f11154f;

    /* renamed from: g */
    final C3386c f11155g;

    /* renamed from: h */
    final C3385b f11156h;

    /* renamed from: i */
    final C3385b f11157i;

    /* renamed from: j */
    boolean f11158j;

    /* renamed from: l */
    C3361ll f11159l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3362lm.C3363d f11160m;

    /* renamed from: com.facetec.sdk.lq$b */
    class C3385b extends C3426mk {
        C3385b() {
        }

        /* renamed from: a */
        public final void mo9759a() {
            if (mo9830d()) {
                throw mo9760c((IOException) null);
            }
        }

        /* renamed from: c */
        public final void mo9570c() {
            C3384lq.this.mo9749b(C3361ll.CANCEL);
        }

        /* renamed from: c */
        public final IOException mo9760c(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    /* renamed from: com.facetec.sdk.lq$e */
    final class C3387e implements C3461nc {

        /* renamed from: d */
        private static /* synthetic */ boolean f11169d = true;

        /* renamed from: a */
        boolean f11170a;

        /* renamed from: b */
        private final C3431mm f11171b = new C3431mm();

        /* renamed from: e */
        boolean f11173e;

        C3387e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.f11157i.mo9759a();
            r11.f11172c.mo9755f();
            r9 = java.lang.Math.min(r11.f11172c.f11152d, r11.f11171b.mo9835a());
            r1 = r11.f11172c;
            r1.f11152d -= r9;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m13512d(boolean r12) {
            /*
                r11 = this;
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                monitor-enter(r0)
                com.facetec.sdk.lq r1 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x007e }
                com.facetec.sdk.lq$b r1 = r1.f11157i     // Catch:{ all -> 0x007e }
                r1.mo9828b()     // Catch:{ all -> 0x007e }
            L_0x000a:
                com.facetec.sdk.lq r1 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x0075 }
                long r2 = r1.f11152d     // Catch:{ all -> 0x0075 }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L_0x0024
                boolean r2 = r11.f11170a     // Catch:{ all -> 0x0075 }
                if (r2 != 0) goto L_0x0024
                boolean r2 = r11.f11173e     // Catch:{ all -> 0x0075 }
                if (r2 != 0) goto L_0x0024
                com.facetec.sdk.ll r2 = r1.f11159l     // Catch:{ all -> 0x0075 }
                if (r2 != 0) goto L_0x0024
                r1.mo9758j()     // Catch:{ all -> 0x0075 }
                goto L_0x000a
            L_0x0024:
                com.facetec.sdk.lq$b r1 = r1.f11157i     // Catch:{ all -> 0x007e }
                r1.mo9759a()     // Catch:{ all -> 0x007e }
                com.facetec.sdk.lq r1 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x007e }
                r1.mo9755f()     // Catch:{ all -> 0x007e }
                com.facetec.sdk.lq r1 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x007e }
                long r1 = r1.f11152d     // Catch:{ all -> 0x007e }
                com.facetec.sdk.mm r3 = r11.f11171b     // Catch:{ all -> 0x007e }
                long r3 = r3.mo9835a()     // Catch:{ all -> 0x007e }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007e }
                com.facetec.sdk.lq r1 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x007e }
                long r2 = r1.f11152d     // Catch:{ all -> 0x007e }
                long r2 = r2 - r9
                r1.f11152d = r2     // Catch:{ all -> 0x007e }
                monitor-exit(r0)     // Catch:{ all -> 0x007e }
                com.facetec.sdk.lq$b r0 = r1.f11157i
                r0.mo9828b()
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x006c }
                com.facetec.sdk.ln r5 = r0.f11149a     // Catch:{ all -> 0x006c }
                int r6 = r0.f11153e     // Catch:{ all -> 0x006c }
                if (r12 == 0) goto L_0x005d
                com.facetec.sdk.mm r12 = r11.f11171b     // Catch:{ all -> 0x006c }
                long r0 = r12.mo9835a()     // Catch:{ all -> 0x006c }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005d
                r12 = 1
                goto L_0x005e
            L_0x005d:
                r12 = 0
            L_0x005e:
                r7 = r12
                com.facetec.sdk.mm r8 = r11.f11171b     // Catch:{ all -> 0x006c }
                r5.mo9733e(r6, r7, r8, r9)     // Catch:{ all -> 0x006c }
                com.facetec.sdk.lq r12 = com.facetec.sdk.C3384lq.this
                com.facetec.sdk.lq$b r12 = r12.f11157i
                r12.mo9759a()
                return
            L_0x006c:
                r12 = move-exception
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                com.facetec.sdk.lq$b r0 = r0.f11157i
                r0.mo9759a()
                throw r12
            L_0x0075:
                r12 = move-exception
                com.facetec.sdk.lq r1 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x007e }
                com.facetec.sdk.lq$b r1 = r1.f11157i     // Catch:{ all -> 0x007e }
                r1.mo9759a()     // Catch:{ all -> 0x007e }
                throw r12     // Catch:{ all -> 0x007e }
            L_0x007e:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3384lq.C3387e.m13512d(boolean):void");
        }

        /* renamed from: b */
        public final void mo9671b(C3431mm mmVar, long j) {
            if (f11169d || !Thread.holdsLock(C3384lq.this)) {
                this.f11171b.mo9671b(mmVar, j);
                while (this.f11171b.mo9835a() >= 16384) {
                    m13512d(false);
                }
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: c */
        public final C3463ne mo9707c() {
            return C3384lq.this.f11157i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r8.f11172c.f11154f.f11170a != false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
            if (r8.f11171b.mo9835a() <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
            if (r8.f11171b.mo9835a() <= 0) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
            m13512d(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r0 = r8.f11172c;
            r0.f11149a.mo9733e(r0.f11153e, true, (com.facetec.sdk.C3431mm) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
            r0 = r8.f11172c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.f11173e = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
            r8.f11172c.f11149a.mo9721a();
            r8.f11172c.mo9757h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r8 = this;
                boolean r0 = f11169d
                if (r0 != 0) goto L_0x0013
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 != 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0013:
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                monitor-enter(r0)
                boolean r1 = r8.f11173e     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return
            L_0x001c:
                monitor-exit(r0)
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                com.facetec.sdk.lq$e r0 = r0.f11154f
                boolean r0 = r0.f11170a
                r1 = 1
                if (r0 != 0) goto L_0x004d
                com.facetec.sdk.mm r0 = r8.f11171b
                long r2 = r0.mo9835a()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
            L_0x0032:
                com.facetec.sdk.mm r0 = r8.f11171b
                long r2 = r0.mo9835a()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x004d
                r8.m13512d(r1)
                goto L_0x0032
            L_0x0040:
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                com.facetec.sdk.ln r2 = r0.f11149a
                int r3 = r0.f11153e
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo9733e(r3, r4, r5, r6)
            L_0x004d:
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                monitor-enter(r0)
                r8.f11173e = r1     // Catch:{ all -> 0x0060 }
                monitor-exit(r0)     // Catch:{ all -> 0x0060 }
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                com.facetec.sdk.ln r0 = r0.f11149a
                r0.mo9721a()
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this
                r0.mo9757h()
                return
            L_0x0060:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3384lq.C3387e.close():void");
        }

        public final void flush() {
            if (f11169d || !Thread.holdsLock(C3384lq.this)) {
                synchronized (C3384lq.this) {
                    C3384lq.this.mo9755f();
                }
                while (this.f11171b.mo9835a() > 0) {
                    m13512d(false);
                    C3384lq.this.f11149a.mo9721a();
                }
                return;
            }
            throw new AssertionError();
        }
    }

    static {
        m13491i();
    }

    C3384lq(int i, C3364ln lnVar, boolean z, boolean z2, C3260jr jrVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f11150b = arrayDeque;
        this.f11156h = new C3385b();
        this.f11157i = new C3385b();
        this.f11159l = null;
        if (lnVar != null) {
            this.f11153e = i;
            this.f11149a = lnVar;
            this.f11152d = (long) lnVar.f11077n.mo9762b();
            C3386c cVar = new C3386c((long) lnVar.f11076m.mo9762b());
            this.f11155g = cVar;
            C3387e eVar = new C3387e();
            this.f11154f = eVar;
            cVar.f11167e = z2;
            eVar.f11170a = z;
            if (jrVar != null) {
                arrayDeque.add(jrVar);
            }
            if (mo9747a() && jrVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo9747a() && jrVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: i */
    static void m13491i() {
        f11148o = new byte[]{59, -117, -56, 74, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
        f11147n = 87;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13492p(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 13
            int r6 = r6 * 12
            int r6 = 16 - r6
            byte[] r0 = f11148o
            int r7 = r7 * 7
            int r7 = 106 - r7
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0034
        L_0x001b:
            r3 = r2
        L_0x001c:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L_0x0029:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0034:
            int r7 = r7 - r8
            int r7 = r7 + 2
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3384lq.m13492p(short, int, byte, java.lang.Object[]):void");
    }

    /* renamed from: b */
    public final C3461nc mo9748b() {
        synchronized (this) {
            if (!this.f11158j) {
                if (!mo9747a()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f11154f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo9750c() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facetec.sdk.ll r0 = r3.f11159l     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            com.facetec.sdk.lq$c r0 = r3.f11155g     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f11167e     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.f11164b     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            com.facetec.sdk.lq$e r0 = r3.f11154f     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f11170a     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.f11173e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f11158j     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3384lq.mo9750c():boolean");
    }

    /* renamed from: e */
    public final int mo9753e() {
        return this.f11153e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo9755f() {
        C3387e eVar = this.f11154f;
        if (eVar.f11173e) {
            throw new IOException("stream closed");
        } else if (eVar.f11170a) {
            throw new IOException("stream finished");
        } else if (this.f11159l != null) {
            throw new C3395lw(this.f11159l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo9756g() {
        boolean c;
        if (f11146k || !Thread.holdsLock(this)) {
            synchronized (this) {
                this.f11155g.f11167e = true;
                c = mo9750c();
                notifyAll();
            }
            if (!c) {
                this.f11149a.mo9731d(this.f11153e);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo9757h() {
        boolean z;
        boolean c;
        if (f11146k || !Thread.holdsLock(this)) {
            synchronized (this) {
                C3386c cVar = this.f11155g;
                if (!cVar.f11167e && cVar.f11164b) {
                    C3387e eVar = this.f11154f;
                    if (eVar.f11170a || eVar.f11173e) {
                        z = true;
                        c = mo9750c();
                    }
                }
                z = false;
                c = mo9750c();
            }
            if (z) {
                mo9746a(C3361ll.CANCEL);
            } else if (!c) {
                this.f11149a.mo9731d(this.f11153e);
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = (byte) (f11148o[15] + 1);
        r5 = new java.lang.Object[1];
        m13492p(r0, (byte) r0, (byte) (-f11148o[15]), r5);
        r3 = java.lang.Class.forName((java.lang.String) r5[0]);
        r1 = (byte) (-f11148o[15]);
        r4 = (byte) r1;
        r2 = new java.lang.Object[1];
        m13492p(r1, r4, (byte) (r4 - 1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        ((java.lang.Thread) r3.getMethod((java.lang.String) r2[0], (java.lang.Class[]) null).invoke((java.lang.Object) null, (java.lang.Object[]) null)).interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r1 = r0.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r1 != null) goto L_0x0050;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0004 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9758j() {
        /*
            r6 = this;
            r6.wait()     // Catch:{ InterruptedException -> 0x0004 }
            return
        L_0x0004:
            byte[] r0 = f11148o     // Catch:{ all -> 0x0049 }
            r1 = 15
            byte r0 = r0[r1]     // Catch:{ all -> 0x0049 }
            r2 = 1
            int r0 = r0 + r2
            byte r0 = (byte) r0     // Catch:{ all -> 0x0049 }
            byte r3 = (byte) r0     // Catch:{ all -> 0x0049 }
            byte[] r4 = f11148o     // Catch:{ all -> 0x0049 }
            byte r4 = r4[r1]     // Catch:{ all -> 0x0049 }
            int r4 = -r4
            byte r4 = (byte) r4     // Catch:{ all -> 0x0049 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0049 }
            m13492p(r0, r3, r4, r5)     // Catch:{ all -> 0x0049 }
            r0 = 0
            r3 = r5[r0]     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0049 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0049 }
            byte[] r4 = f11148o     // Catch:{ all -> 0x0049 }
            byte r1 = r4[r1]     // Catch:{ all -> 0x0049 }
            int r1 = -r1
            byte r1 = (byte) r1     // Catch:{ all -> 0x0049 }
            byte r4 = (byte) r1     // Catch:{ all -> 0x0049 }
            int r5 = r4 + -1
            byte r5 = (byte) r5     // Catch:{ all -> 0x0049 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0049 }
            m13492p(r1, r4, r5, r2)     // Catch:{ all -> 0x0049 }
            r0 = r2[r0]     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0049 }
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch:{ all -> 0x0049 }
            java.lang.Thread r0 = (java.lang.Thread) r0     // Catch:{ all -> 0x0049 }
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0049:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0051
            throw r1
        L_0x0051:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3384lq.mo9758j():void");
    }

    /* renamed from: a */
    public final boolean mo9747a() {
        return this.f11149a.f11068e == ((this.f11153e & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.f11156h.mo9759a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facetec.sdk.C3260jr mo9751d() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facetec.sdk.lq$b r0 = r2.f11156h     // Catch:{ all -> 0x003c }
            r0.mo9828b()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<com.facetec.sdk.jr> r0 = r2.f11150b     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            com.facetec.sdk.ll r0 = r2.f11159l     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.mo9758j()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            com.facetec.sdk.lq$b r0 = r2.f11156h     // Catch:{ all -> 0x003c }
            r0.mo9759a()     // Catch:{ all -> 0x003c }
            java.util.Deque<com.facetec.sdk.jr> r0 = r2.f11150b     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<com.facetec.sdk.jr> r0 = r2.f11150b     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            com.facetec.sdk.jr r0 = (com.facetec.sdk.C3260jr) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            com.facetec.sdk.lw r0 = new com.facetec.sdk.lw     // Catch:{ all -> 0x003c }
            com.facetec.sdk.ll r1 = r2.f11159l     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            com.facetec.sdk.lq$b r1 = r2.f11156h     // Catch:{ all -> 0x003c }
            r1.mo9759a()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3384lq.mo9751d():com.facetec.sdk.jr");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo9754e(C3361ll llVar) {
        if (this.f11159l == null) {
            this.f11159l = llVar;
            notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo9746a(C3361ll llVar) {
        if (m13490d(llVar)) {
            this.f11149a.mo9728c(this.f11153e, llVar);
        }
    }

    /* renamed from: b */
    public final void mo9749b(C3361ll llVar) {
        if (m13490d(llVar)) {
            this.f11149a.mo9722a(this.f11153e, llVar);
        }
    }

    /* renamed from: d */
    private boolean m13490d(C3361ll llVar) {
        if (f11146k || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f11159l != null) {
                    return false;
                }
                if (this.f11155g.f11167e && this.f11154f.f11170a) {
                    return false;
                }
                this.f11159l = llVar;
                notifyAll();
                this.f11149a.mo9731d(this.f11153e);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9752d(long j) {
        this.f11152d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: com.facetec.sdk.lq$c */
    final class C3386c implements C3465nf {

        /* renamed from: g */
        static /* synthetic */ boolean f11162g = true;

        /* renamed from: a */
        final long f11163a;

        /* renamed from: b */
        boolean f11164b;

        /* renamed from: c */
        final C3431mm f11165c = new C3431mm();

        /* renamed from: d */
        final C3431mm f11166d = new C3431mm();

        /* renamed from: e */
        boolean f11167e;

        C3386c(long j) {
            this.f11163a = j;
        }

        /* renamed from: d */
        private void m13509d(long j) {
            if (f11162g || !Thread.holdsLock(C3384lq.this)) {
                C3384lq.this.f11149a.mo9734e(j);
                return;
            }
            throw new AssertionError();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.facetec.sdk.jr} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long mo9643c(com.facetec.sdk.C3431mm r17, long r18) {
            /*
                r16 = this;
                r1 = r16
                r2 = r18
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x00db
            L_0x000a:
                com.facetec.sdk.lq r6 = com.facetec.sdk.C3384lq.this
                monitor-enter(r6)
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00d8 }
                com.facetec.sdk.lq$b r0 = r0.f11156h     // Catch:{ all -> 0x00d8 }
                r0.mo9828b()     // Catch:{ all -> 0x00d8 }
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.ll r7 = r0.f11159l     // Catch:{ all -> 0x00cf }
                if (r7 == 0) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                r7 = 0
            L_0x001c:
                boolean r9 = r1.f11164b     // Catch:{ all -> 0x00cf }
                if (r9 != 0) goto L_0x00c7
                java.util.Deque r0 = r0.f11150b     // Catch:{ all -> 0x00cf }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00cf }
                if (r0 != 0) goto L_0x0049
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.lm$d r0 = r0.f11160m     // Catch:{ all -> 0x00cf }
                if (r0 == 0) goto L_0x0049
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                java.util.Deque r0 = r0.f11150b     // Catch:{ all -> 0x00cf }
                java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x00cf }
                r8 = r0
                com.facetec.sdk.jr r8 = (com.facetec.sdk.C3260jr) r8     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.lm$d r0 = r0.f11160m     // Catch:{ all -> 0x00cf }
                r13 = r17
                r10 = r0
                goto L_0x00a6
            L_0x0049:
                com.facetec.sdk.mm r0 = r1.f11165c     // Catch:{ all -> 0x00cf }
                long r11 = r0.mo9835a()     // Catch:{ all -> 0x00cf }
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x008d
                com.facetec.sdk.mm r0 = r1.f11165c     // Catch:{ all -> 0x00cf }
                long r11 = r0.mo9835a()     // Catch:{ all -> 0x00cf }
                long r11 = java.lang.Math.min(r2, r11)     // Catch:{ all -> 0x00cf }
                r13 = r17
                long r11 = r0.mo9643c(r13, r11)     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                long r14 = r0.f11151c     // Catch:{ all -> 0x00cf }
                long r14 = r14 + r11
                r0.f11151c = r14     // Catch:{ all -> 0x00cf }
                if (r7 != 0) goto L_0x008a
                com.facetec.sdk.ln r0 = r0.f11149a     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.lt r0 = r0.f11076m     // Catch:{ all -> 0x00cf }
                int r0 = r0.mo9762b()     // Catch:{ all -> 0x00cf }
                int r0 = r0 / 2
                long r8 = (long) r0     // Catch:{ all -> 0x00cf }
                int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                if (r0 < 0) goto L_0x008a
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.ln r8 = r0.f11149a     // Catch:{ all -> 0x00cf }
                int r9 = r0.f11153e     // Catch:{ all -> 0x00cf }
                long r14 = r0.f11151c     // Catch:{ all -> 0x00cf }
                r8.mo9732d(r9, r14)     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                r0.f11151c = r4     // Catch:{ all -> 0x00cf }
            L_0x008a:
                r8 = 0
                r10 = 0
                goto L_0x00a8
            L_0x008d:
                r13 = r17
                boolean r0 = r1.f11167e     // Catch:{ all -> 0x00cf }
                if (r0 != 0) goto L_0x00a4
                if (r7 != 0) goto L_0x00a4
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00cf }
                r0.mo9758j()     // Catch:{ all -> 0x00cf }
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00d8 }
                com.facetec.sdk.lq$b r0 = r0.f11156h     // Catch:{ all -> 0x00d8 }
                r0.mo9759a()     // Catch:{ all -> 0x00d8 }
                monitor-exit(r6)     // Catch:{ all -> 0x00d8 }
                goto L_0x000a
            L_0x00a4:
                r8 = 0
                r10 = 0
            L_0x00a6:
                r11 = -1
            L_0x00a8:
                com.facetec.sdk.lq r0 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00d8 }
                com.facetec.sdk.lq$b r0 = r0.f11156h     // Catch:{ all -> 0x00d8 }
                r0.mo9759a()     // Catch:{ all -> 0x00d8 }
                monitor-exit(r6)     // Catch:{ all -> 0x00d8 }
                if (r8 == 0) goto L_0x00b4
                if (r10 != 0) goto L_0x000a
            L_0x00b4:
                r2 = -1
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x00be
                r1.m13509d(r11)
                return r11
            L_0x00be:
                if (r7 != 0) goto L_0x00c1
                return r2
            L_0x00c1:
                com.facetec.sdk.lw r0 = new com.facetec.sdk.lw
                r0.<init>(r7)
                throw r0
            L_0x00c7:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00cf }
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch:{ all -> 0x00cf }
                throw r0     // Catch:{ all -> 0x00cf }
            L_0x00cf:
                r0 = move-exception
                com.facetec.sdk.lq r2 = com.facetec.sdk.C3384lq.this     // Catch:{ all -> 0x00d8 }
                com.facetec.sdk.lq$b r2 = r2.f11156h     // Catch:{ all -> 0x00d8 }
                r2.mo9759a()     // Catch:{ all -> 0x00d8 }
                throw r0     // Catch:{ all -> 0x00d8 }
            L_0x00d8:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L_0x00db:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "byteCount < 0: "
                java.lang.String r2 = java.lang.String.valueOf(r18)
                java.lang.String r2 = r4.concat(r2)
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3384lq.C3386c.mo9643c(com.facetec.sdk.mm, long):long");
        }

        public final void close() {
            long a;
            C3362lm.C3363d dVar;
            ArrayList<C3260jr> arrayList;
            synchronized (C3384lq.this) {
                this.f11164b = true;
                a = this.f11165c.mo9835a();
                this.f11165c.mo9888q();
                if (C3384lq.this.f11150b.isEmpty() || C3384lq.this.f11160m == null) {
                    arrayList = null;
                    dVar = null;
                } else {
                    arrayList = new ArrayList<>(C3384lq.this.f11150b);
                    C3384lq.this.f11150b.clear();
                    dVar = C3384lq.this.f11160m;
                }
                C3384lq.this.notifyAll();
            }
            if (a > 0) {
                m13509d(a);
            }
            C3384lq.this.mo9757h();
            if (dVar != null) {
                for (C3260jr jrVar : arrayList) {
                }
            }
        }

        /* renamed from: c */
        public final C3463ne mo9644c() {
            return C3384lq.this.f11156h;
        }
    }
}
