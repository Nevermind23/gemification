package wf1;

import dg1.C40664a;
import dg1.C40669a0;
import dg1.C40672b;
import dg1.C40679d;
import dg1.C40705x;
import dg1.C40707z;
import he1.C41238w;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41928u;
import okhttp3.internal.http2.StreamResetException;
import pf1.C42197d;

/* renamed from: wf1.h */
public final class C43227h {

    /* renamed from: o */
    public static final C43228a f100926o = new C43228a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f100927a;

    /* renamed from: b */
    private final C43202e f100928b;

    /* renamed from: c */
    private long f100929c;

    /* renamed from: d */
    private long f100930d;

    /* renamed from: e */
    private long f100931e;

    /* renamed from: f */
    private long f100932f;

    /* renamed from: g */
    private final ArrayDeque f100933g;

    /* renamed from: h */
    private boolean f100934h;

    /* renamed from: i */
    private final C43230c f100935i;

    /* renamed from: j */
    private final C43229b f100936j;

    /* renamed from: k */
    private final C43231d f100937k = new C43231d(this);

    /* renamed from: l */
    private final C43231d f100938l = new C43231d(this);

    /* renamed from: m */
    private C43194a f100939m;

    /* renamed from: n */
    private IOException f100940n;

    /* renamed from: wf1.h$a */
    public static final class C43228a {
        private C43228a() {
        }

        public /* synthetic */ C43228a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wf1.h$b */
    public final class C43229b implements C40705x {

        /* renamed from: d */
        private boolean f100941d;

        /* renamed from: e */
        private final C40672b f100942e = new C40672b();

        /* renamed from: f */
        private C41928u f100943f;

        /* renamed from: g */
        private boolean f100944g;

        /* renamed from: h */
        final /* synthetic */ C43227h f100945h;

        public C43229b(C43227h hVar, boolean z) {
            C41536l.m120489i(hVar, "this$0");
            this.f100945h = hVar;
            this.f100941d = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private final void m124114a(boolean z) {
            long min;
            boolean z2;
            boolean z3;
            C43227h hVar = this.f100945h;
            synchronized (hVar) {
                hVar.mo101872s().mo94665t();
                while (hVar.mo101871r() >= hVar.mo101870q() && !mo101881n() && !mo101880k() && hVar.mo101861h() == null) {
                    try {
                        hVar.mo101853F();
                    } catch (Throwable th) {
                        hVar.mo101872s().mo101891A();
                        throw th;
                    }
                }
                hVar.mo101872s().mo101891A();
                hVar.mo101857c();
                min = Math.min(hVar.mo101870q() - hVar.mo101871r(), this.f100942e.mo94709M0());
                hVar.mo101851D(hVar.mo101871r() + min);
                if (!z || min != this.f100942e.mo94709M0()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z3 = z2;
                C41238w wVar = C41238w.f97225a;
            }
            this.f100945h.mo101872s().mo94665t();
            try {
                this.f100945h.mo101860g().mo101766B1(this.f100945h.mo101863j(), z3, this.f100942e, min);
            } finally {
                this.f100945h.mo101872s().mo101891A();
            }
        }

        /* renamed from: C */
        public C40669a0 mo94673C() {
            return this.f100945h.mo101872s();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (r10.f100945h.mo101868o().f100941d != false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
            if (r10.f100942e.mo94709M0() <= 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
            if (r10.f100943f == null) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
            if (r4 == false) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
            if (r10.f100942e.mo94709M0() <= 0) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
            m124114a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
            r0 = r10.f100945h.mo101860g();
            r2 = r10.f100945h.mo101863j();
            r4 = r10.f100943f;
            kotlin.jvm.internal.C41536l.m120486f(r4);
            r0.mo101768F1(r2, r1, pf1.C42197d.m122521O(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
            if (r0 == false) goto L_0x00a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
            if (r10.f100942e.mo94709M0() <= 0) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
            m124114a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r1 == false) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
            r10.f100945h.mo101860g().mo101766B1(r10.f100945h.mo101863j(), true, (dg1.C40672b) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
            r0 = r10.f100945h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            mo101882o(true);
            r1 = he1.C41238w.f97225a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
            r10.f100945h.mo101860g().flush();
            r10.f100945h.mo101856b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                wf1.h r0 = r10.f100945h
                boolean r1 = pf1.C42197d.f99271h
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                wf1.h r0 = r10.f100945h
                monitor-enter(r0)
                boolean r1 = r10.mo101880k()     // Catch:{ all -> 0x00d6 }
                if (r1 == 0) goto L_0x003f
                monitor-exit(r0)
                return
            L_0x003f:
                wf1.a r1 = r0.mo101861h()     // Catch:{ all -> 0x00d6 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0049
                r1 = r3
                goto L_0x004a
            L_0x0049:
                r1 = r2
            L_0x004a:
                he1.w r4 = he1.C41238w.f97225a     // Catch:{ all -> 0x00d6 }
                monitor-exit(r0)
                wf1.h r0 = r10.f100945h
                wf1.h$b r0 = r0.mo101868o()
                boolean r0 = r0.f100941d
                if (r0 != 0) goto L_0x00bb
                dg1.b r0 = r10.f100942e
                long r4 = r0.mo94709M0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0065
                r0 = r3
                goto L_0x0066
            L_0x0065:
                r0 = r2
            L_0x0066:
                of1.u r4 = r10.f100943f
                if (r4 == 0) goto L_0x006c
                r4 = r3
                goto L_0x006d
            L_0x006c:
                r4 = r2
            L_0x006d:
                if (r4 == 0) goto L_0x0096
            L_0x006f:
                dg1.b r0 = r10.f100942e
                long r4 = r0.mo94709M0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x007d
                r10.m124114a(r2)
                goto L_0x006f
            L_0x007d:
                wf1.h r0 = r10.f100945h
                wf1.e r0 = r0.mo101860g()
                wf1.h r2 = r10.f100945h
                int r2 = r2.mo101863j()
                of1.u r4 = r10.f100943f
                kotlin.jvm.internal.C41536l.m120486f(r4)
                java.util.List r4 = pf1.C42197d.m122521O(r4)
                r0.mo101768F1(r2, r1, r4)
                goto L_0x00bb
            L_0x0096:
                if (r0 == 0) goto L_0x00a6
            L_0x0098:
                dg1.b r0 = r10.f100942e
                long r0 = r0.mo94709M0()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00bb
                r10.m124114a(r3)
                goto L_0x0098
            L_0x00a6:
                if (r1 == 0) goto L_0x00bb
                wf1.h r0 = r10.f100945h
                wf1.e r4 = r0.mo101860g()
                wf1.h r0 = r10.f100945h
                int r5 = r0.mo101863j()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.mo101766B1(r5, r6, r7, r8)
            L_0x00bb:
                wf1.h r0 = r10.f100945h
                monitor-enter(r0)
                r10.mo101882o(r3)     // Catch:{ all -> 0x00d3 }
                he1.w r1 = he1.C41238w.f97225a     // Catch:{ all -> 0x00d3 }
                monitor-exit(r0)
                wf1.h r0 = r10.f100945h
                wf1.e r0 = r0.mo101860g()
                r0.flush()
                wf1.h r0 = r10.f100945h
                r0.mo101856b()
                return
            L_0x00d3:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00d6:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wf1.C43227h.C43229b.close():void");
        }

        public void flush() {
            C43227h hVar = this.f100945h;
            if (!C42197d.f99271h || !Thread.holdsLock(hVar)) {
                C43227h hVar2 = this.f100945h;
                synchronized (hVar2) {
                    hVar2.mo101857c();
                    C41238w wVar = C41238w.f97225a;
                }
                while (this.f100942e.mo94709M0() > 0) {
                    m124114a(false);
                    this.f100945h.mo101860g().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
        }

        /* renamed from: k */
        public final boolean mo101880k() {
            return this.f100944g;
        }

        /* renamed from: n */
        public final boolean mo101881n() {
            return this.f100941d;
        }

        /* renamed from: o */
        public final void mo101882o(boolean z) {
            this.f100944g = z;
        }

        /* renamed from: x1 */
        public void mo21301x1(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "source");
            C43227h hVar = this.f100945h;
            if (!C42197d.f99271h || !Thread.holdsLock(hVar)) {
                this.f100942e.mo21301x1(bVar, j);
                while (this.f100942e.mo94709M0() >= 16384) {
                    m124114a(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
        }
    }

    /* renamed from: wf1.h$c */
    public final class C43230c implements C40707z {

        /* renamed from: d */
        private final long f100946d;

        /* renamed from: e */
        private boolean f100947e;

        /* renamed from: f */
        private final C40672b f100948f = new C40672b();

        /* renamed from: g */
        private final C40672b f100949g = new C40672b();

        /* renamed from: h */
        private C41928u f100950h;

        /* renamed from: i */
        private boolean f100951i;

        /* renamed from: j */
        final /* synthetic */ C43227h f100952j;

        public C43230c(C43227h hVar, long j, boolean z) {
            C41536l.m120489i(hVar, "this$0");
            this.f100952j = hVar;
            this.f100946d = j;
            this.f100947e = z;
        }

        /* renamed from: u */
        private final void m124120u(long j) {
            C43227h hVar = this.f100952j;
            if (!C42197d.f99271h || !Thread.holdsLock(hVar)) {
                this.f100952j.mo101860g().mo101802z1(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
        }

        /* renamed from: C */
        public C40669a0 mo94678C() {
            return this.f100952j.mo101866m();
        }

        /* renamed from: a */
        public final boolean mo101883a() {
            return this.f100951i;
        }

        public void close() {
            long M0;
            C43227h hVar = this.f100952j;
            synchronized (hVar) {
                mo101888q(true);
                M0 = mo101885n().mo94709M0();
                mo101885n().mo94724a();
                hVar.notifyAll();
                C41238w wVar = C41238w.f97225a;
            }
            if (M0 > 0) {
                m124120u(M0);
            }
            this.f100952j.mo101856b();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            boolean z;
            Throwable th;
            long j2;
            boolean z2;
            C40672b bVar2 = bVar;
            long j3 = j;
            C41536l.m120489i(bVar2, "sink");
            long j4 = 0;
            if (j3 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (true) {
                    C43227h hVar = this.f100952j;
                    synchronized (hVar) {
                        hVar.mo101866m().mo94665t();
                        try {
                            if (hVar.mo101861h() != null) {
                                th = hVar.mo101862i();
                                if (th == null) {
                                    C43194a h = hVar.mo101861h();
                                    C41536l.m120486f(h);
                                    th = new StreamResetException(h);
                                }
                            } else {
                                th = null;
                            }
                            if (!mo101883a()) {
                                if (mo101885n().mo94709M0() > j4) {
                                    j2 = mo101885n().mo21305g(bVar2, Math.min(j3, mo101885n().mo94709M0()));
                                    hVar.mo101850C(hVar.mo101865l() + j2);
                                    long l = hVar.mo101865l() - hVar.mo101864k();
                                    if (th == null && l >= ((long) (hVar.mo101860g().mo101792o0().mo101919c() / 2))) {
                                        hVar.mo101860g().mo101774J1(hVar.mo101863j(), l);
                                        hVar.mo101849B(hVar.mo101865l());
                                    }
                                } else if (mo101884k() || th != null) {
                                    j2 = -1;
                                } else {
                                    hVar.mo101853F();
                                    j2 = -1;
                                    z2 = true;
                                    hVar.mo101866m().mo101891A();
                                    C41238w wVar = C41238w.f97225a;
                                }
                                z2 = false;
                                hVar.mo101866m().mo101891A();
                                C41238w wVar2 = C41238w.f97225a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            hVar.mo101866m().mo101891A();
                            throw th2;
                        }
                    }
                    if (z2) {
                        j4 = 0;
                    } else if (j2 != -1) {
                        m124120u(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
            }
        }

        /* renamed from: k */
        public final boolean mo101884k() {
            return this.f100947e;
        }

        /* renamed from: n */
        public final C40672b mo101885n() {
            return this.f100949g;
        }

        /* renamed from: o */
        public final C40672b mo101886o() {
            return this.f100948f;
        }

        /* renamed from: p */
        public final void mo101887p(C40679d dVar, long j) {
            boolean k;
            boolean z;
            boolean z2;
            long j2;
            C41536l.m120489i(dVar, "source");
            C43227h hVar = this.f100952j;
            if (!C42197d.f99271h || !Thread.holdsLock(hVar)) {
                while (j > 0) {
                    synchronized (this.f100952j) {
                        k = mo101884k();
                        z = true;
                        if (mo101885n().mo94709M0() + j > this.f100946d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C41238w wVar = C41238w.f97225a;
                    }
                    if (z2) {
                        dVar.skip(j);
                        this.f100952j.mo101859f(C43194a.FLOW_CONTROL_ERROR);
                        return;
                    } else if (k) {
                        dVar.skip(j);
                        return;
                    } else {
                        long g = dVar.mo21305g(this.f100948f, j);
                        if (g != -1) {
                            j -= g;
                            C43227h hVar2 = this.f100952j;
                            synchronized (hVar2) {
                                if (mo101883a()) {
                                    j2 = mo101886o().mo94709M0();
                                    mo101886o().mo94724a();
                                } else {
                                    if (mo101885n().mo94709M0() != 0) {
                                        z = false;
                                    }
                                    mo101885n().mo94741l1(mo101886o());
                                    if (z) {
                                        hVar2.notifyAll();
                                    }
                                    j2 = 0;
                                }
                            }
                            if (j2 > 0) {
                                m124120u(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + hVar);
        }

        /* renamed from: q */
        public final void mo101888q(boolean z) {
            this.f100951i = z;
        }

        /* renamed from: s */
        public final void mo101889s(boolean z) {
            this.f100947e = z;
        }

        /* renamed from: t */
        public final void mo101890t(C41928u uVar) {
            this.f100950h = uVar;
        }
    }

    /* renamed from: wf1.h$d */
    public final class C43231d extends C40664a {

        /* renamed from: m */
        final /* synthetic */ C43227h f100953m;

        public C43231d(C43227h hVar) {
            C41536l.m120489i(hVar, "this$0");
            this.f100953m = hVar;
        }

        /* renamed from: A */
        public final void mo101891A() {
            if (mo94666u()) {
                throw mo94667v((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public IOException mo94667v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public void mo94670z() {
            this.f100953m.mo101859f(C43194a.CANCEL);
            this.f100953m.mo101860g().mo101789k1();
        }
    }

    public C43227h(int i, C43202e eVar, boolean z, boolean z2, C41928u uVar) {
        C41536l.m120489i(eVar, "connection");
        this.f100927a = i;
        this.f100928b = eVar;
        this.f100932f = (long) eVar.mo101793p0().mo101919c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f100933g = arrayDeque;
        this.f100935i = new C43230c(this, (long) eVar.mo101792o0().mo101919c(), z2);
        this.f100936j = new C43229b(this, z);
        if (uVar != null) {
            if (!mo101873t()) {
                arrayDeque.add(uVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo101873t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: e */
    private final boolean m124081e(C43194a aVar, IOException iOException) {
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (mo101861h() != null) {
                    return false;
                }
                if (mo101869p().mo101884k() && mo101868o().mo101881n()) {
                    return false;
                }
                mo101879z(aVar);
                mo101848A(iOException);
                notifyAll();
                C41238w wVar = C41238w.f97225a;
                this.f100928b.mo101788i1(this.f100927a);
                return true;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: A */
    public final void mo101848A(IOException iOException) {
        this.f100940n = iOException;
    }

    /* renamed from: B */
    public final void mo101849B(long j) {
        this.f100930d = j;
    }

    /* renamed from: C */
    public final void mo101850C(long j) {
        this.f100929c = j;
    }

    /* renamed from: D */
    public final void mo101851D(long j) {
        this.f100931e = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r2.f100937k.mo101891A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized of1.C41928u mo101852E() {
        /*
            r2 = this;
            monitor-enter(r2)
            wf1.h$d r0 = r2.f100937k     // Catch:{ all -> 0x004a }
            r0.mo94665t()     // Catch:{ all -> 0x004a }
        L_0x0006:
            java.util.ArrayDeque r0 = r2.f100933g     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0016
            wf1.a r0 = r2.f100939m     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0016
            r2.mo101853F()     // Catch:{ all -> 0x0043 }
            goto L_0x0006
        L_0x0016:
            wf1.h$d r0 = r2.f100937k     // Catch:{ all -> 0x004a }
            r0.mo101891A()     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque r0 = r2.f100933g     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque r0 = r2.f100933g     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)     // Catch:{ all -> 0x004a }
            of1.u r0 = (of1.C41928u) r0     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.f100940n     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0042
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x004a }
            wf1.a r1 = r2.f100939m     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.C41536l.m120486f(r1)     // Catch:{ all -> 0x004a }
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0043:
            r0 = move-exception
            wf1.h$d r1 = r2.f100937k     // Catch:{ all -> 0x004a }
            r1.mo101891A()     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43227h.mo101852E():of1.u");
    }

    /* renamed from: F */
    public final void mo101853F() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: G */
    public final C40669a0 mo101854G() {
        return this.f100938l;
    }

    /* renamed from: a */
    public final void mo101855a(long j) {
        this.f100932f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo101856b() {
        boolean z;
        boolean u;
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (mo101869p().mo101884k() || !mo101869p().mo101883a() || (!mo101868o().mo101881n() && !mo101868o().mo101880k())) {
                    z = false;
                } else {
                    z = true;
                }
                u = mo101874u();
                C41238w wVar = C41238w.f97225a;
            }
            if (z) {
                mo101858d(C43194a.CANCEL, (IOException) null);
            } else if (!u) {
                this.f100928b.mo101788i1(this.f100927a);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    /* renamed from: c */
    public final void mo101857c() {
        if (this.f100936j.mo101880k()) {
            throw new IOException("stream closed");
        } else if (this.f100936j.mo101881n()) {
            throw new IOException("stream finished");
        } else if (this.f100939m != null) {
            Throwable th = this.f100940n;
            if (th == null) {
                C43194a aVar = this.f100939m;
                C41536l.m120486f(aVar);
                th = new StreamResetException(aVar);
            }
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo101858d(C43194a aVar, IOException iOException) {
        C41536l.m120489i(aVar, "rstStatusCode");
        if (m124081e(aVar, iOException)) {
            this.f100928b.mo101772H1(this.f100927a, aVar);
        }
    }

    /* renamed from: f */
    public final void mo101859f(C43194a aVar) {
        C41536l.m120489i(aVar, "errorCode");
        if (m124081e(aVar, (IOException) null)) {
            this.f100928b.mo101773I1(this.f100927a, aVar);
        }
    }

    /* renamed from: g */
    public final C43202e mo101860g() {
        return this.f100928b;
    }

    /* renamed from: h */
    public final synchronized C43194a mo101861h() {
        return this.f100939m;
    }

    /* renamed from: i */
    public final IOException mo101862i() {
        return this.f100940n;
    }

    /* renamed from: j */
    public final int mo101863j() {
        return this.f100927a;
    }

    /* renamed from: k */
    public final long mo101864k() {
        return this.f100930d;
    }

    /* renamed from: l */
    public final long mo101865l() {
        return this.f100929c;
    }

    /* renamed from: m */
    public final C43231d mo101866m() {
        return this.f100937k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final dg1.C40705x mo101867n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f100934h     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.mo101873t()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            wf1.h$b r0 = r2.f100936j
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43227h.mo101867n():dg1.x");
    }

    /* renamed from: o */
    public final C43229b mo101868o() {
        return this.f100936j;
    }

    /* renamed from: p */
    public final C43230c mo101869p() {
        return this.f100935i;
    }

    /* renamed from: q */
    public final long mo101870q() {
        return this.f100932f;
    }

    /* renamed from: r */
    public final long mo101871r() {
        return this.f100931e;
    }

    /* renamed from: s */
    public final C43231d mo101872s() {
        return this.f100938l;
    }

    /* renamed from: t */
    public final boolean mo101873t() {
        boolean z;
        if ((this.f100927a & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f100928b.mo101783e0() == z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        return true;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo101874u() {
        /*
            r2 = this;
            monitor-enter(r2)
            wf1.a r0 = r2.f100939m     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            wf1.h$c r0 = r2.f100935i     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.mo101884k()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0018
            wf1.h$c r0 = r2.f100935i     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.mo101883a()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0018:
            wf1.h$b r0 = r2.f100936j     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.mo101881n()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0028
            wf1.h$b r0 = r2.f100936j     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.mo101880k()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
        L_0x0028:
            boolean r0 = r2.f100934h     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43227h.mo101874u():boolean");
    }

    /* renamed from: v */
    public final C40669a0 mo101875v() {
        return this.f100937k;
    }

    /* renamed from: w */
    public final void mo101876w(C40679d dVar, int i) {
        C41536l.m120489i(dVar, "source");
        if (!C42197d.f99271h || !Thread.holdsLock(this)) {
            this.f100935i.mo101887p(dVar, (long) i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101877x(of1.C41928u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            boolean r0 = pf1.C42197d.f99271h
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.f100934h     // Catch:{ all -> 0x006c }
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            wf1.h$c r0 = r2.mo101869p()     // Catch:{ all -> 0x006c }
            r0.mo101890t(r3)     // Catch:{ all -> 0x006c }
            goto L_0x004f
        L_0x0048:
            r2.f100934h = r1     // Catch:{ all -> 0x006c }
            java.util.ArrayDeque r0 = r2.f100933g     // Catch:{ all -> 0x006c }
            r0.add(r3)     // Catch:{ all -> 0x006c }
        L_0x004f:
            if (r4 == 0) goto L_0x0058
            wf1.h$c r3 = r2.mo101869p()     // Catch:{ all -> 0x006c }
            r3.mo101889s(r1)     // Catch:{ all -> 0x006c }
        L_0x0058:
            boolean r3 = r2.mo101874u()     // Catch:{ all -> 0x006c }
            r2.notifyAll()     // Catch:{ all -> 0x006c }
            he1.w r4 = he1.C41238w.f97225a     // Catch:{ all -> 0x006c }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006b
            wf1.e r3 = r2.f100928b
            int r4 = r2.f100927a
            r3.mo101788i1(r4)
        L_0x006b:
            return
        L_0x006c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43227h.mo101877x(of1.u, boolean):void");
    }

    /* renamed from: y */
    public final synchronized void mo101878y(C43194a aVar) {
        C41536l.m120489i(aVar, "errorCode");
        if (this.f100939m == null) {
            this.f100939m = aVar;
            notifyAll();
        }
    }

    /* renamed from: z */
    public final void mo101879z(C43194a aVar) {
        this.f100939m = aVar;
    }
}
