package com.facetec.sdk;

import com.facetec.sdk.C3381lp;
import com.facetec.sdk.C3384lq;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.ln */
public final class C3364ln implements Closeable {

    /* renamed from: q */
    public static final int f11060q = 0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final ExecutorService f11061t = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3303ki.m13253b("OkHttp Http2Connection", true));

    /* renamed from: v */
    private static /* synthetic */ boolean f11062v = true;

    /* renamed from: x */
    private static byte[] f11063x;

    /* renamed from: a */
    int f11064a;

    /* renamed from: b */
    final String f11065b;

    /* renamed from: c */
    final Map<Integer, C3384lq> f11066c = new LinkedHashMap();

    /* renamed from: d */
    final C3371b f11067d;

    /* renamed from: e */
    final boolean f11068e;

    /* renamed from: f */
    boolean f11069f;
    /* access modifiers changed from: package-private */

    /* renamed from: g */
    public boolean f11070g;

    /* renamed from: h */
    int f11071h;

    /* renamed from: i */
    long f11072i;

    /* renamed from: j */
    final C3393lv f11073j;

    /* renamed from: k */
    boolean f11074k;

    /* renamed from: l */
    public final C3392lu f11075l;

    /* renamed from: m */
    public C3391lt f11076m = new C3391lt();

    /* renamed from: n */
    final C3391lt f11077n;

    /* renamed from: o */
    public C3373c f11078o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ScheduledExecutorService f11079p;

    /* renamed from: r */
    final Set<Integer> f11080r;

    /* renamed from: s */
    private final ExecutorService f11081s;

    /* renamed from: w */
    private long f11082w = 0;

    /* renamed from: y */
    private Socket f11083y;

    /* renamed from: com.facetec.sdk.ln$b */
    public static abstract class C3371b {

        /* renamed from: l */
        public static final C3371b f11105l = new C3371b() {
            /* renamed from: a */
            public final void mo9656a(C3384lq lqVar) {
                lqVar.mo9746a(C3361ll.REFUSED_STREAM);
            }
        };

        /* renamed from: a */
        public abstract void mo9656a(C3384lq lqVar);

        /* renamed from: c */
        public void mo9660c(C3364ln lnVar) {
        }
    }

    /* renamed from: com.facetec.sdk.ln$d */
    public static class C3377d {

        /* renamed from: a */
        public C3371b f11113a = C3371b.f11105l;

        /* renamed from: b */
        public Socket f11114b;

        /* renamed from: c */
        public C3432mn f11115c;

        /* renamed from: d */
        public String f11116d;

        /* renamed from: e */
        public C3434mp f11117e;

        /* renamed from: f */
        boolean f11118f = true;

        /* renamed from: h */
        C3393lv f11119h = C3393lv.f11194c;

        /* renamed from: j */
        public int f11120j;
    }

    /* renamed from: com.facetec.sdk.ln$e */
    final class C3378e extends C3301kg {

        /* renamed from: b */
        private int f11122b;

        /* renamed from: c */
        private boolean f11123c;

        /* renamed from: d */
        private int f11124d;

        C3378e(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C3364ln.this.f11065b, Integer.valueOf(i), Integer.valueOf(i2));
            this.f11123c = z;
            this.f11122b = i;
            this.f11124d = i2;
        }

        /* renamed from: b */
        public final void mo9571b() {
            boolean z;
            C3364ln lnVar = C3364ln.this;
            boolean z2 = this.f11123c;
            int i = this.f11122b;
            int i2 = this.f11124d;
            if (!z2) {
                synchronized (lnVar) {
                    z = lnVar.f11070g;
                    lnVar.f11070g = true;
                }
                if (z) {
                    lnVar.mo9727c();
                    return;
                }
            }
            try {
                lnVar.f11075l.mo9774d(z2, i, i2);
            } catch (IOException unused) {
                lnVar.mo9727c();
            }
        }
    }

    static {
        m13426g();
    }

    public C3364ln(C3377d dVar) {
        int i;
        C3377d dVar2 = dVar;
        C3391lt ltVar = new C3391lt();
        this.f11077n = ltVar;
        this.f11074k = false;
        this.f11080r = new LinkedHashSet();
        this.f11073j = dVar2.f11119h;
        boolean z = dVar2.f11118f;
        this.f11068e = z;
        this.f11067d = dVar2.f11113a;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f11071h = i;
        if (z) {
            this.f11071h = i + 2;
        }
        if (z) {
            this.f11076m.mo9766d(7, 16777216);
        }
        String str = dVar2.f11116d;
        this.f11065b = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C3303ki.m13253b(C3303ki.m13262d("OkHttp %s Writer", str), false));
        this.f11079p = scheduledThreadPoolExecutor;
        if (dVar2.f11120j != 0) {
            C3378e eVar = new C3378e(false, 0, 0);
            int i2 = dVar2.f11120j;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.f11081s = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C3303ki.m13253b(C3303ki.m13262d("OkHttp %s Push Observer", str), true));
        ltVar.mo9766d(7, 65535);
        ltVar.mo9766d(5, 16384);
        this.f11072i = (long) ltVar.mo9762b();
        this.f11083y = dVar2.f11114b;
        this.f11075l = new C3392lu(dVar2.f11117e, z);
        this.f11078o = new C3373c(new C3381lp(dVar2.f11115c, z));
    }

    /* renamed from: a */
    static boolean m13420a(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* renamed from: g */
    static void m13426g() {
        f11063x = new byte[]{59, -117, -56, 74, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
        f11060q = 191;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13427u(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = f11063x
            int r9 = r9 + 4
            int r8 = r8 * 7
            int r8 = 106 - r8
            int r7 = r7 * 3
            int r7 = r7 + 13
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L_0x0035
        L_0x0017:
            r3 = r2
        L_0x0018:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L_0x002c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x002c:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L_0x0035:
            int r10 = r10 - r8
            int r8 = r10 + 2
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3364ln.m13427u(byte, short, int, java.lang.Object[]):void");
    }

    public final void close() {
        mo9729c(C3361ll.NO_ERROR, C3361ll.CANCEL);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9722a(int i, C3361ll llVar) {
        try {
            final int i2 = i;
            final C3361ll llVar2 = llVar;
            this.f11079p.execute(new C3301kg("OkHttp %s stream %d", new Object[]{this.f11065b, Integer.valueOf(i)}) {
                /* renamed from: b */
                public final void mo9571b() {
                    try {
                        C3364ln.this.mo9728c(i2, llVar2);
                    } catch (IOException unused) {
                        C3364ln.this.mo9727c();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C3384lq mo9725b(int i) {
        return this.f11066c.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9728c(int i, C3361ll llVar) {
        this.f11075l.mo9770b(i, llVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized C3384lq mo9731d(int i) {
        C3384lq remove;
        remove = this.f11066c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo9734e(long j) {
        long j2 = this.f11082w + j;
        this.f11082w = j2;
        if (j2 >= ((long) (this.f11076m.mo9762b() / 2))) {
            mo9732d(0, this.f11082w);
            this.f11082w = 0;
        }
    }

    /* renamed from: a */
    public final void mo9721a() {
        this.f11075l.mo9776e();
    }

    /* renamed from: b */
    public final synchronized int mo9724b() {
        C3391lt ltVar = this.f11077n;
        if ((ltVar.f11186e & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return ltVar.f11185b[4];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9729c(C3361ll llVar, C3361ll llVar2) {
        if (f11062v || !Thread.holdsLock(this)) {
            C3384lq[] lqVarArr = null;
            try {
                m13424d(llVar);
                e = null;
            } catch (IOException e) {
                e = e;
            }
            synchronized (this) {
                if (!this.f11066c.isEmpty()) {
                    lqVarArr = (C3384lq[]) this.f11066c.values().toArray(new C3384lq[this.f11066c.size()]);
                    this.f11066c.clear();
                }
            }
            if (lqVarArr != null) {
                for (C3384lq a : lqVarArr) {
                    try {
                        a.mo9746a(llVar2);
                    } catch (IOException e2) {
                        if (e != null) {
                            e = e2;
                        }
                    }
                }
            }
            try {
                this.f11075l.close();
            } catch (IOException e3) {
                if (e == null) {
                    e = e3;
                }
            }
            try {
                this.f11083y.close();
            } catch (IOException e4) {
                e = e4;
            }
            this.f11079p.shutdown();
            this.f11081s.shutdown();
            if (e != null) {
                throw e;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo9723a(C3301kg kgVar) {
        if (!mo9735e()) {
            this.f11081s.execute(kgVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9732d(int i, long j) {
        try {
            final int i2 = i;
            final long j2 = j;
            this.f11079p.execute(new C3301kg("OkHttp Window Update %s stream %d", new Object[]{this.f11065b, Integer.valueOf(i)}) {
                /* renamed from: b */
                public final void mo9571b() {
                    try {
                        C3364ln.this.f11075l.mo9768a(i2, j2);
                    } catch (IOException unused) {
                        C3364ln.this.mo9727c();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facetec.sdk.C3384lq mo9726b(java.util.List<com.facetec.sdk.C3362lm> r11, boolean r12) {
        /*
            r10 = this;
            r6 = r12 ^ 1
            com.facetec.sdk.lu r7 = r10.f11075l
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0062 }
            int r0 = r10.f11071h     // Catch:{ all -> 0x005f }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0012
            com.facetec.sdk.ll r0 = com.facetec.sdk.C3361ll.REFUSED_STREAM     // Catch:{ all -> 0x005f }
            r10.m13424d((com.facetec.sdk.C3361ll) r0)     // Catch:{ all -> 0x005f }
        L_0x0012:
            boolean r0 = r10.f11069f     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0059
            int r8 = r10.f11071h     // Catch:{ all -> 0x005f }
            int r0 = r8 + 2
            r10.f11071h = r0     // Catch:{ all -> 0x005f }
            com.facetec.sdk.lq r9 = new com.facetec.sdk.lq     // Catch:{ all -> 0x005f }
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x005f }
            if (r12 == 0) goto L_0x003a
            long r0 = r10.f11072i     // Catch:{ all -> 0x005f }
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x003a
            long r0 = r9.f11152d     // Catch:{ all -> 0x005f }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r12 = 0
            goto L_0x003b
        L_0x003a:
            r12 = 1
        L_0x003b:
            boolean r0 = r9.mo9750c()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, com.facetec.sdk.lq> r0 = r10.f11066c     // Catch:{ all -> 0x005f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x005f }
            r0.put(r1, r9)     // Catch:{ all -> 0x005f }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x005f }
            com.facetec.sdk.lu r0 = r10.f11075l     // Catch:{ all -> 0x0062 }
            r0.mo9772c((boolean) r6, (int) r8, (java.util.List<com.facetec.sdk.C3362lm>) r11)     // Catch:{ all -> 0x0062 }
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            if (r12 == 0) goto L_0x0058
            com.facetec.sdk.lu r11 = r10.f11075l
            r11.mo9776e()
        L_0x0058:
            return r9
        L_0x0059:
            com.facetec.sdk.li r11 = new com.facetec.sdk.li     // Catch:{ all -> 0x005f }
            r11.<init>()     // Catch:{ all -> 0x005f }
            throw r11     // Catch:{ all -> 0x005f }
        L_0x005f:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0062 }
            throw r11     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3364ln.mo9726b(java.util.List, boolean):com.facetec.sdk.lq");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4 = java.lang.Math.min((int) java.lang.Math.min(r13, r4), r9.f11075l.f11189c);
        r7 = (long) r4;
        r9.f11072i -= r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10 = f11063x;
        r12 = (byte) (-r10[15]);
        r14 = new java.lang.Object[1];
        m13427u(r12, (byte) (r12 - 1), (byte) r10[16], r14);
        r10 = java.lang.Class.forName((java.lang.String) r14[0]);
        r11 = f11063x[15];
        r14 = new java.lang.Object[1];
        m13427u((byte) (r11 + 1), (byte) (-r11), (byte) r11, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        ((java.lang.Thread) r10.getMethod((java.lang.String) r14[0], (java.lang.Class[]) null).invoke((java.lang.Object) null, (java.lang.Object[]) null)).interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r11 = r10.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r11 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        throw r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0056 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9733e(int r10, boolean r11, com.facetec.sdk.C3431mm r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            com.facetec.sdk.lu r13 = r9.f11075l
            r13.mo9775d(r11, r10, r12, r3)
            return
        L_0x000d:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a5
            monitor-enter(r9)
        L_0x0012:
            r2 = 1
            long r4 = r9.f11072i     // Catch:{ InterruptedException -> 0x0056 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x0031
            java.util.Map<java.lang.Integer, com.facetec.sdk.lq> r4 = r9.f11066c     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r4 = r4.containsKey(r5)     // Catch:{ InterruptedException -> 0x0056 }
            if (r4 == 0) goto L_0x0029
            r9.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0029:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch:{ InterruptedException -> 0x0056 }
            throw r10     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0031:
            long r4 = java.lang.Math.min(r13, r4)     // Catch:{ all -> 0x0054 }
            int r4 = (int) r4     // Catch:{ all -> 0x0054 }
            com.facetec.sdk.lu r5 = r9.f11075l     // Catch:{ all -> 0x0054 }
            int r5 = r5.f11189c     // Catch:{ all -> 0x0054 }
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0054 }
            long r5 = r9.f11072i     // Catch:{ all -> 0x0054 }
            long r7 = (long) r4     // Catch:{ all -> 0x0054 }
            long r5 = r5 - r7
            r9.f11072i = r5     // Catch:{ all -> 0x0054 }
            monitor-exit(r9)     // Catch:{ all -> 0x0054 }
            long r13 = r13 - r7
            com.facetec.sdk.lu r5 = r9.f11075l
            if (r11 == 0) goto L_0x004f
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r2 = r3
        L_0x0050:
            r5.mo9775d(r2, r10, r12, r4)
            goto L_0x000d
        L_0x0054:
            r10 = move-exception
            goto L_0x00a3
        L_0x0056:
            byte[] r10 = f11063x     // Catch:{ all -> 0x009a }
            r11 = 15
            byte r12 = r10[r11]     // Catch:{ all -> 0x009a }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x009a }
            int r13 = r12 + -1
            byte r13 = (byte) r13     // Catch:{ all -> 0x009a }
            r14 = 16
            byte r10 = r10[r14]     // Catch:{ all -> 0x009a }
            byte r10 = (byte) r10     // Catch:{ all -> 0x009a }
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x009a }
            m13427u(r12, r13, r10, r14)     // Catch:{ all -> 0x009a }
            r10 = r14[r3]     // Catch:{ all -> 0x009a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x009a }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x009a }
            byte[] r12 = f11063x     // Catch:{ all -> 0x009a }
            byte r11 = r12[r11]     // Catch:{ all -> 0x009a }
            int r12 = r11 + 1
            byte r12 = (byte) r12     // Catch:{ all -> 0x009a }
            int r13 = -r11
            byte r13 = (byte) r13     // Catch:{ all -> 0x009a }
            byte r11 = (byte) r11     // Catch:{ all -> 0x009a }
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x009a }
            m13427u(r12, r13, r11, r14)     // Catch:{ all -> 0x009a }
            r11 = r14[r3]     // Catch:{ all -> 0x009a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x009a }
            r12 = 0
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch:{ all -> 0x009a }
            java.lang.Object r10 = r10.invoke(r12, r12)     // Catch:{ all -> 0x009a }
            java.lang.Thread r10 = (java.lang.Thread) r10     // Catch:{ all -> 0x009a }
            r10.interrupt()     // Catch:{ all -> 0x0054 }
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0054 }
            r10.<init>()     // Catch:{ all -> 0x0054 }
            throw r10     // Catch:{ all -> 0x0054 }
        L_0x009a:
            r10 = move-exception
            java.lang.Throwable r11 = r10.getCause()     // Catch:{ all -> 0x0054 }
            if (r11 == 0) goto L_0x00a2
            throw r11     // Catch:{ all -> 0x0054 }
        L_0x00a2:
            throw r10     // Catch:{ all -> 0x0054 }
        L_0x00a3:
            monitor-exit(r9)
            throw r10
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3364ln.mo9733e(int, boolean, com.facetec.sdk.mm, long):void");
    }

    /* renamed from: d */
    private void m13424d(C3361ll llVar) {
        synchronized (this.f11075l) {
            synchronized (this) {
                if (!this.f11069f) {
                    this.f11069f = true;
                    int i = this.f11064a;
                    this.f11075l.mo9771c(i, llVar, C3303ki.f10840b);
                }
            }
        }
    }

    /* renamed from: com.facetec.sdk.ln$c */
    class C3373c extends C3301kg implements C3381lp.C3383b {

        /* renamed from: a */
        private C3381lp f11106a;

        C3373c(C3381lp lpVar) {
            super("OkHttp %s", C3364ln.this.f11065b);
            this.f11106a = lpVar;
        }

        /* renamed from: a */
        public final void mo9737a(boolean z, int i, C3432mn mnVar, int i2) {
            boolean z2;
            boolean z3;
            int i3 = i;
            C3432mn mnVar2 = mnVar;
            int i4 = i2;
            if (C3364ln.m13420a(i)) {
                C3364ln lnVar = C3364ln.this;
                C3431mm mmVar = new C3431mm();
                long j = (long) i4;
                mnVar2.mo9863e(j);
                mnVar2.mo9643c(mmVar, j);
                if (mmVar.mo9835a() == j) {
                    lnVar.mo9723a((C3301kg) new C3301kg("OkHttp %s Push Data[%s]", new Object[]{lnVar.f11065b, Integer.valueOf(i)}, i, mmVar, i2, z) {

                        /* renamed from: a */
                        private /* synthetic */ int f11090a;

                        /* renamed from: b */
                        private /* synthetic */ int f11091b;

                        /* renamed from: c */
                        private /* synthetic */ C3431mm f11092c;

                        /* renamed from: d */
                        private /* synthetic */ boolean f11093d;

                        {
                            this.f11091b = r4;
                            this.f11092c = r5;
                            this.f11090a = r6;
                            this.f11093d = r7;
                        }

                        /* renamed from: b */
                        public final void mo9571b() {
                            try {
                                C3364ln.this.f11073j.mo9778a(this.f11092c, this.f11090a);
                                C3364ln.this.f11075l.mo9770b(this.f11091b, C3361ll.CANCEL);
                                synchronized (C3364ln.this) {
                                    C3364ln.this.f11080r.remove(Integer.valueOf(this.f11091b));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(mmVar.mo9835a());
                sb.append(" != ");
                sb.append(i4);
                throw new IOException(sb.toString());
            }
            C3384lq b = C3364ln.this.mo9725b(i3);
            if (b == null) {
                C3364ln.this.mo9722a(i3, C3361ll.PROTOCOL_ERROR);
                long j2 = (long) i4;
                C3364ln.this.mo9734e(j2);
                mnVar2.mo9880j(j2);
            } else if (C3384lq.f11146k || !Thread.holdsLock(b)) {
                C3384lq.C3386c cVar = b.f11155g;
                long j3 = (long) i4;
                if (C3384lq.C3386c.f11162g || !Thread.holdsLock(C3384lq.this)) {
                    while (true) {
                        if (j3 <= 0) {
                            break;
                        }
                        synchronized (C3384lq.this) {
                            z2 = cVar.f11167e;
                            z3 = cVar.f11165c.mo9835a() + j3 > cVar.f11163a;
                        }
                        if (z3) {
                            mnVar2.mo9880j(j3);
                            C3384lq.this.mo9749b(C3361ll.FLOW_CONTROL_ERROR);
                            break;
                        } else if (z2) {
                            mnVar2.mo9880j(j3);
                            break;
                        } else {
                            long c = mnVar2.mo9643c(cVar.f11166d, j3);
                            if (c != -1) {
                                j3 -= c;
                                synchronized (C3384lq.this) {
                                    boolean z4 = cVar.f11165c.mo9835a() == 0;
                                    cVar.f11165c.mo9850d((C3465nf) cVar.f11166d);
                                    if (z4) {
                                        C3384lq.this.notifyAll();
                                    }
                                }
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    if (z) {
                        b.mo9756g();
                        return;
                    }
                    return;
                }
                throw new AssertionError();
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|34|35) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            r0 = com.facetec.sdk.C3361ll.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r10.f11107d.mo9729c(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
            r9 = r2;
            r2 = r1;
            r1 = r9;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0072 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9571b() {
            /*
                r10 = this;
                com.facetec.sdk.ll r0 = com.facetec.sdk.C3361ll.INTERNAL_ERROR
                com.facetec.sdk.lp r1 = r10.f11106a     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                boolean r2 = r1.f11138d     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x001a
                boolean r1 = r1.mo9744c(r3, r10)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                if (r1 == 0) goto L_0x0011
                goto L_0x0048
            L_0x0011:
                java.lang.String r1 = "Required SETTINGS preface not received"
                java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                java.io.IOException r1 = com.facetec.sdk.C3388lr.m13515a(r1, r2)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                throw r1     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            L_0x001a:
                com.facetec.sdk.mn r1 = r1.f11136a     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                com.facetec.sdk.mq r2 = com.facetec.sdk.C3388lr.f11174a     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                int r5 = r2.mo9906g()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                long r5 = (long) r5     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                com.facetec.sdk.mq r1 = r1.mo9837a(r5)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                java.util.logging.Logger r5 = com.facetec.sdk.C3381lp.f11135b     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                boolean r6 = r5.isLoggable(r6)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                if (r6 == 0) goto L_0x0042
                java.lang.String r6 = "<< CONNECTION %s"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                java.lang.String r8 = r1.mo9894b()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                r7[r4] = r8     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                java.lang.String r6 = com.facetec.sdk.C3303ki.m13262d((java.lang.String) r6, (java.lang.Object[]) r7)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                r5.fine(r6)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            L_0x0042:
                boolean r2 = r2.equals(r1)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                if (r2 == 0) goto L_0x005f
            L_0x0048:
                com.facetec.sdk.lp r1 = r10.f11106a     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                boolean r1 = r1.mo9744c(r4, r10)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                if (r1 != 0) goto L_0x0048
                com.facetec.sdk.ll r1 = com.facetec.sdk.C3361ll.NO_ERROR     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                com.facetec.sdk.ll r0 = com.facetec.sdk.C3361ll.CANCEL     // Catch:{ IOException -> 0x0072 }
                com.facetec.sdk.ln r2 = com.facetec.sdk.C3364ln.this     // Catch:{ IOException -> 0x0059 }
                r2.mo9729c((com.facetec.sdk.C3361ll) r1, (com.facetec.sdk.C3361ll) r0)     // Catch:{ IOException -> 0x0059 }
            L_0x0059:
                com.facetec.sdk.lp r0 = r10.f11106a
                com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r0)
                return
            L_0x005f:
                java.lang.String r2 = "Expected a connection header but was %s"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                java.lang.String r1 = r1.mo9903e()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                r3[r4] = r1     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                java.io.IOException r1 = com.facetec.sdk.C3388lr.m13515a(r2, r3)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
                throw r1     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            L_0x006e:
                r1 = move-exception
                r2 = r0
                goto L_0x007e
            L_0x0071:
                r1 = r0
            L_0x0072:
                com.facetec.sdk.ll r0 = com.facetec.sdk.C3361ll.PROTOCOL_ERROR     // Catch:{ all -> 0x007a }
                com.facetec.sdk.ln r1 = com.facetec.sdk.C3364ln.this     // Catch:{ IOException -> 0x0059 }
                r1.mo9729c((com.facetec.sdk.C3361ll) r0, (com.facetec.sdk.C3361ll) r0)     // Catch:{ IOException -> 0x0059 }
                goto L_0x0059
            L_0x007a:
                r2 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
            L_0x007e:
                com.facetec.sdk.ln r3 = com.facetec.sdk.C3364ln.this     // Catch:{ IOException -> 0x0083 }
                r3.mo9729c((com.facetec.sdk.C3361ll) r2, (com.facetec.sdk.C3361ll) r0)     // Catch:{ IOException -> 0x0083 }
            L_0x0083:
                com.facetec.sdk.lp r0 = r10.f11106a
                com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3364ln.C3373c.mo9571b():void");
        }

        /* renamed from: d */
        public final void mo9742d(int i, long j) {
            if (i == 0) {
                synchronized (C3364ln.this) {
                    C3364ln lnVar = C3364ln.this;
                    lnVar.f11072i += j;
                    lnVar.notifyAll();
                }
                return;
            }
            C3384lq b = C3364ln.this.mo9725b(i);
            if (b != null) {
                synchronized (b) {
                    b.mo9752d(j);
                }
            }
        }

        /* JADX WARNING: type inference failed for: r12v16, types: [java.lang.Object[]] */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|(4:6|(2:8|44)(1:45)|9|4)|43|10|11|12|13|14|(1:23)(4:17|(1:19)|20|(1:22))|24|25) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9743e(final com.facetec.sdk.C3391lt r12) {
            /*
                r11 = this;
                com.facetec.sdk.ln r0 = com.facetec.sdk.C3364ln.this
                monitor-enter(r0)
                com.facetec.sdk.ln r1 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.lt r1 = r1.f11077n     // Catch:{ all -> 0x00a9 }
                int r1 = r1.mo9762b()     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.ln r2 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.lt r2 = r2.f11077n     // Catch:{ all -> 0x00a9 }
                r3 = 0
                r4 = r3
            L_0x0011:
                r5 = 10
                if (r4 >= r5) goto L_0x0025
                boolean r5 = r12.mo9764c(r4)     // Catch:{ all -> 0x00a9 }
                if (r5 == 0) goto L_0x0022
                int r5 = r12.mo9763b(r4)     // Catch:{ all -> 0x00a9 }
                r2.mo9766d(r4, r5)     // Catch:{ all -> 0x00a9 }
            L_0x0022:
                int r4 = r4 + 1
                goto L_0x0011
            L_0x0025:
                r2 = 1
                com.facetec.sdk.ln r4 = com.facetec.sdk.C3364ln.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.util.concurrent.ScheduledExecutorService r4 = r4.f11079p     // Catch:{ RejectedExecutionException -> 0x003e }
                com.facetec.sdk.ln$c$1 r5 = new com.facetec.sdk.ln$c$1     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r6 = "OkHttp %s ACK Settings"
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ RejectedExecutionException -> 0x003e }
                com.facetec.sdk.ln r8 = com.facetec.sdk.C3364ln.this     // Catch:{ RejectedExecutionException -> 0x003e }
                java.lang.String r8 = r8.f11065b     // Catch:{ RejectedExecutionException -> 0x003e }
                r7[r3] = r8     // Catch:{ RejectedExecutionException -> 0x003e }
                r5.<init>(r6, r7, r12)     // Catch:{ RejectedExecutionException -> 0x003e }
                r4.execute(r5)     // Catch:{ RejectedExecutionException -> 0x003e }
            L_0x003e:
                com.facetec.sdk.ln r12 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.lt r12 = r12.f11077n     // Catch:{ all -> 0x00a9 }
                int r12 = r12.mo9762b()     // Catch:{ all -> 0x00a9 }
                r4 = -1
                r5 = 0
                r7 = 0
                if (r12 == r4) goto L_0x007a
                if (r12 == r1) goto L_0x007a
                int r12 = r12 - r1
                long r8 = (long) r12     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.ln r12 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00a9 }
                boolean r1 = r12.f11074k     // Catch:{ all -> 0x00a9 }
                if (r1 != 0) goto L_0x0058
                r12.f11074k = r2     // Catch:{ all -> 0x00a9 }
            L_0x0058:
                java.util.Map<java.lang.Integer, com.facetec.sdk.lq> r12 = r12.f11066c     // Catch:{ all -> 0x00a9 }
                boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x00a9 }
                if (r12 != 0) goto L_0x007b
                com.facetec.sdk.ln r12 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00a9 }
                java.util.Map<java.lang.Integer, com.facetec.sdk.lq> r12 = r12.f11066c     // Catch:{ all -> 0x00a9 }
                java.util.Collection r12 = r12.values()     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.ln r1 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00a9 }
                java.util.Map<java.lang.Integer, com.facetec.sdk.lq> r1 = r1.f11066c     // Catch:{ all -> 0x00a9 }
                int r1 = r1.size()     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.lq[] r1 = new com.facetec.sdk.C3384lq[r1]     // Catch:{ all -> 0x00a9 }
                java.lang.Object[] r12 = r12.toArray(r1)     // Catch:{ all -> 0x00a9 }
                r7 = r12
                com.facetec.sdk.lq[] r7 = (com.facetec.sdk.C3384lq[]) r7     // Catch:{ all -> 0x00a9 }
                goto L_0x007b
            L_0x007a:
                r8 = r5
            L_0x007b:
                java.util.concurrent.ExecutorService r12 = com.facetec.sdk.C3364ln.f11061t     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.ln$c$3 r1 = new com.facetec.sdk.ln$c$3     // Catch:{ all -> 0x00a9 }
                java.lang.String r4 = "OkHttp %s settings"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00a9 }
                com.facetec.sdk.ln r10 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00a9 }
                java.lang.String r10 = r10.f11065b     // Catch:{ all -> 0x00a9 }
                r2[r3] = r10     // Catch:{ all -> 0x00a9 }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x00a9 }
                r12.execute(r1)     // Catch:{ all -> 0x00a9 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
                if (r7 == 0) goto L_0x00a8
                int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r12 == 0) goto L_0x00a8
                int r12 = r7.length
            L_0x0099:
                if (r3 >= r12) goto L_0x00a8
                r0 = r7[r3]
                monitor-enter(r0)
                r0.mo9752d((long) r8)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
                int r3 = r3 + 1
                goto L_0x0099
            L_0x00a5:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
            L_0x00a8:
                return
            L_0x00a9:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3364ln.C3373c.mo9743e(com.facetec.sdk.lt):void");
        }

        /* renamed from: b */
        public final void mo9739b(int i, C3361ll llVar) {
            if (C3364ln.m13420a(i)) {
                C3364ln lnVar = C3364ln.this;
                lnVar.mo9723a((C3301kg) new C3301kg("OkHttp %s Push Reset[%s]", new Object[]{lnVar.f11065b, Integer.valueOf(i)}, i, llVar) {

                    /* renamed from: a */
                    private /* synthetic */ int f11102a;

                    /* renamed from: d */
                    private /* synthetic */ C3361ll f11104d;

                    {
                        this.f11102a = r4;
                        this.f11104d = r5;
                    }

                    /* renamed from: b */
                    public final void mo9571b() {
                        C3364ln lnVar = C3364ln.this;
                        C3393lv lvVar = lnVar.f11073j;
                        synchronized (lnVar) {
                            C3364ln.this.f11080r.remove(Integer.valueOf(this.f11102a));
                        }
                    }
                });
                return;
            }
            C3384lq d = C3364ln.this.mo9731d(i);
            if (d != null) {
                d.mo9754e(llVar);
            }
        }

        /* renamed from: b */
        public final void mo9741b(boolean z, int i, int i2) {
            if (z) {
                synchronized (C3364ln.this) {
                    boolean unused = C3364ln.this.f11070g = false;
                    C3364ln.this.notifyAll();
                }
                return;
            }
            try {
                C3364ln.this.f11079p.execute(new C3378e(true, i, i2));
            } catch (RejectedExecutionException unused2) {
            }
        }

        /* renamed from: b */
        public final void mo9740b(int i, List<C3362lm> list) {
            C3364ln lnVar = C3364ln.this;
            synchronized (lnVar) {
                if (lnVar.f11080r.contains(Integer.valueOf(i))) {
                    lnVar.mo9722a(i, C3361ll.PROTOCOL_ERROR);
                    return;
                }
                lnVar.f11080r.add(Integer.valueOf(i));
                try {
                    lnVar.mo9723a((C3301kg) new C3301kg("OkHttp %s Push Request[%s]", new Object[]{lnVar.f11065b, Integer.valueOf(i)}, i, list) {

                        /* renamed from: a */
                        private /* synthetic */ int f11084a;

                        /* renamed from: d */
                        private /* synthetic */ List f11086d;

                        {
                            this.f11084a = r4;
                            this.f11086d = r5;
                        }

                        /* renamed from: b */
                        public final void mo9571b() {
                            C3364ln lnVar = C3364ln.this;
                            C3393lv lvVar = lnVar.f11073j;
                            try {
                                lnVar.f11075l.mo9770b(this.f11084a, C3361ll.CANCEL);
                                synchronized (C3364ln.this) {
                                    C3364ln.this.f11080r.remove(Integer.valueOf(this.f11084a));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
            if (com.facetec.sdk.C3384lq.f11146k != false) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
            if (java.lang.Thread.holdsLock(r4) != false) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r4.f11158j = true;
            r4.f11150b.add(com.facetec.sdk.C3303ki.m13257c(r15));
            r14 = r4.mo9750c();
            r4.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
            if (r14 != false) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
            r4.f11149a.mo9731d(r4.f11153e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
            if (r13 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
            r4.mo9756g();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9738a(boolean r13, int r14, java.util.List<com.facetec.sdk.C3362lm> r15) {
            /*
                r12 = this;
                boolean r0 = com.facetec.sdk.C3364ln.m13420a((int) r14)
                r1 = 0
                r2 = 1
                r3 = 2
                if (r0 == 0) goto L_0x0027
                com.facetec.sdk.ln r0 = com.facetec.sdk.C3364ln.this
                com.facetec.sdk.ln$5 r11 = new com.facetec.sdk.ln$5     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.String r6 = "OkHttp %s Push Headers[%s]"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.String r3 = r0.f11065b     // Catch:{ RejectedExecutionException -> 0x0026 }
                r7[r1] = r3     // Catch:{ RejectedExecutionException -> 0x0026 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ RejectedExecutionException -> 0x0026 }
                r7[r2] = r1     // Catch:{ RejectedExecutionException -> 0x0026 }
                r4 = r11
                r5 = r0
                r8 = r14
                r9 = r15
                r10 = r13
                r4.<init>(r6, r7, r8, r9, r10)     // Catch:{ RejectedExecutionException -> 0x0026 }
                r0.mo9723a((com.facetec.sdk.C3301kg) r11)     // Catch:{ RejectedExecutionException -> 0x0026 }
            L_0x0026:
                return
            L_0x0027:
                com.facetec.sdk.ln r0 = com.facetec.sdk.C3364ln.this
                monitor-enter(r0)
                com.facetec.sdk.ln r4 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00bb }
                com.facetec.sdk.lq r4 = r4.mo9725b((int) r14)     // Catch:{ all -> 0x00bb }
                if (r4 != 0) goto L_0x0083
                com.facetec.sdk.ln r4 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00bb }
                boolean r5 = r4.f11069f     // Catch:{ all -> 0x00bb }
                if (r5 == 0) goto L_0x003a
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                return
            L_0x003a:
                int r5 = r4.f11064a     // Catch:{ all -> 0x00bb }
                if (r14 > r5) goto L_0x0040
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                return
            L_0x0040:
                int r5 = r14 % 2
                int r4 = r4.f11071h     // Catch:{ all -> 0x00bb }
                int r4 = r4 % r3
                if (r5 != r4) goto L_0x0049
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                return
            L_0x0049:
                com.facetec.sdk.jr r9 = com.facetec.sdk.C3303ki.m13257c((java.util.List<com.facetec.sdk.C3362lm>) r15)     // Catch:{ all -> 0x00bb }
                com.facetec.sdk.lq r15 = new com.facetec.sdk.lq     // Catch:{ all -> 0x00bb }
                com.facetec.sdk.ln r6 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00bb }
                r7 = 0
                r4 = r15
                r5 = r14
                r8 = r13
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00bb }
                com.facetec.sdk.ln r13 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00bb }
                r13.f11064a = r14     // Catch:{ all -> 0x00bb }
                java.util.Map<java.lang.Integer, com.facetec.sdk.lq> r13 = r13.f11066c     // Catch:{ all -> 0x00bb }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00bb }
                r13.put(r4, r15)     // Catch:{ all -> 0x00bb }
                java.util.concurrent.ExecutorService r13 = com.facetec.sdk.C3364ln.f11061t     // Catch:{ all -> 0x00bb }
                com.facetec.sdk.ln$c$4 r4 = new com.facetec.sdk.ln$c$4     // Catch:{ all -> 0x00bb }
                java.lang.String r5 = "OkHttp %s stream %d"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00bb }
                com.facetec.sdk.ln r6 = com.facetec.sdk.C3364ln.this     // Catch:{ all -> 0x00bb }
                java.lang.String r6 = r6.f11065b     // Catch:{ all -> 0x00bb }
                r3[r1] = r6     // Catch:{ all -> 0x00bb }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00bb }
                r3[r2] = r14     // Catch:{ all -> 0x00bb }
                r4.<init>(r5, r3, r15)     // Catch:{ all -> 0x00bb }
                r13.execute(r4)     // Catch:{ all -> 0x00bb }
                monitor-exit(r0)     // Catch:{ all -> 0x00bb }
                return
            L_0x0083:
                monitor-exit(r0)
                boolean r14 = com.facetec.sdk.C3384lq.f11146k
                if (r14 != 0) goto L_0x0095
                boolean r14 = java.lang.Thread.holdsLock(r4)
                if (r14 != 0) goto L_0x008f
                goto L_0x0095
            L_0x008f:
                java.lang.AssertionError r13 = new java.lang.AssertionError
                r13.<init>()
                throw r13
            L_0x0095:
                monitor-enter(r4)
                r4.f11158j = r2     // Catch:{ all -> 0x00b8 }
                java.util.Deque<com.facetec.sdk.jr> r14 = r4.f11150b     // Catch:{ all -> 0x00b8 }
                com.facetec.sdk.jr r15 = com.facetec.sdk.C3303ki.m13257c((java.util.List<com.facetec.sdk.C3362lm>) r15)     // Catch:{ all -> 0x00b8 }
                r14.add(r15)     // Catch:{ all -> 0x00b8 }
                boolean r14 = r4.mo9750c()     // Catch:{ all -> 0x00b8 }
                r4.notifyAll()     // Catch:{ all -> 0x00b8 }
                monitor-exit(r4)     // Catch:{ all -> 0x00b8 }
                if (r14 != 0) goto L_0x00b2
                com.facetec.sdk.ln r14 = r4.f11149a
                int r15 = r4.f11153e
                r14.mo9731d((int) r15)
            L_0x00b2:
                if (r13 == 0) goto L_0x00b7
                r4.mo9756g()
            L_0x00b7:
                return
            L_0x00b8:
                r13 = move-exception
                monitor-exit(r4)
                throw r13
            L_0x00bb:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3364ln.C3373c.mo9738a(boolean, int, java.util.List):void");
        }

        /* renamed from: a */
        public final void mo9736a(int i, C3435mq mqVar) {
            C3384lq[] lqVarArr;
            mqVar.mo9906g();
            synchronized (C3364ln.this) {
                lqVarArr = (C3384lq[]) C3364ln.this.f11066c.values().toArray(new C3384lq[C3364ln.this.f11066c.size()]);
                C3364ln.this.f11069f = true;
            }
            for (C3384lq lqVar : lqVarArr) {
                if (lqVar.mo9753e() > i && lqVar.mo9747a()) {
                    lqVar.mo9754e(C3361ll.REFUSED_STREAM);
                    C3364ln.this.mo9731d(lqVar.mo9753e());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9727c() {
        try {
            C3361ll llVar = C3361ll.PROTOCOL_ERROR;
            mo9729c(llVar, llVar);
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo9735e() {
        return this.f11069f;
    }
}
