package tf1;

import dg1.C40664a;
import he1.C41238w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C41536l;
import of1.C41863a;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41888f;
import of1.C41890g;
import of1.C41913p;
import of1.C41917r;
import of1.C41931v;
import of1.C41944z;
import pf1.C42197d;
import uf1.C43094g;
import xf1.C43286k;

/* renamed from: tf1.e */
public final class C43002e implements C41882e {

    /* renamed from: d */
    private final C41944z f100376d;

    /* renamed from: e */
    private final C41869b0 f100377e;

    /* renamed from: f */
    private final boolean f100378f;

    /* renamed from: g */
    private final C43012g f100379g;

    /* renamed from: h */
    private final C41917r f100380h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C43005c f100381i;

    /* renamed from: j */
    private final AtomicBoolean f100382j = new AtomicBoolean();

    /* renamed from: k */
    private Object f100383k;

    /* renamed from: l */
    private C43001d f100384l;

    /* renamed from: m */
    private C43006f f100385m;

    /* renamed from: n */
    private boolean f100386n;

    /* renamed from: o */
    private C42998c f100387o;

    /* renamed from: p */
    private boolean f100388p;

    /* renamed from: q */
    private boolean f100389q;

    /* renamed from: r */
    private boolean f100390r = true;

    /* renamed from: s */
    private volatile boolean f100391s;

    /* renamed from: t */
    private volatile C42998c f100392t;

    /* renamed from: u */
    private volatile C43006f f100393u;

    /* renamed from: tf1.e$a */
    public final class C43003a implements Runnable {

        /* renamed from: d */
        private final C41888f f100394d;

        /* renamed from: e */
        private volatile AtomicInteger f100395e = new AtomicInteger(0);

        /* renamed from: f */
        final /* synthetic */ C43002e f100396f;

        public C43003a(C43002e eVar, C41888f fVar) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(fVar, "responseCallback");
            this.f100396f = eVar;
            this.f100394d = fVar;
        }

        /* renamed from: a */
        public final void mo101554a(ExecutorService executorService) {
            C41536l.m120489i(executorService, "executorService");
            C41913p o = this.f100396f.mo101541k().mo97056o();
            if (!C42197d.f99271h || !Thread.holdsLock(o)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f100396f.mo101550t(interruptedIOException);
                    this.f100394d.mo7189a(this.f100396f, interruptedIOException);
                    this.f100396f.mo101541k().mo97056o().mo96874f(this);
                } catch (Throwable th) {
                    this.f100396f.mo101541k().mo97056o().mo96874f(this);
                    throw th;
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + o);
            }
        }

        /* renamed from: b */
        public final C43002e mo101555b() {
            return this.f100396f;
        }

        /* renamed from: c */
        public final AtomicInteger mo101556c() {
            return this.f100395e;
        }

        /* renamed from: d */
        public final String mo101557d() {
            return this.f100396f.mo101546p().mo96681j().mo96954i();
        }

        /* renamed from: e */
        public final void mo101558e(C43003a aVar) {
            C41536l.m120489i(aVar, "other");
            this.f100395e = aVar.f100395e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[Catch:{ all -> 0x0058, all -> 0x0093 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[Catch:{ all -> 0x0058, all -> 0x0093 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[Catch:{ all -> 0x0058, all -> 0x0093 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                tf1.e r0 = r8.f100396f
                java.lang.String r0 = r0.mo101551u()
                java.lang.String r1 = "OkHttp "
                java.lang.String r0 = kotlin.jvm.internal.C41536l.m120497q(r1, r0)
                tf1.e r1 = r8.f100396f
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                tf1.e$c r0 = r1.f100381i     // Catch:{ all -> 0x0093 }
                r0.mo94665t()     // Catch:{ all -> 0x0093 }
                r0 = 0
                of1.d0 r0 = r1.mo101547q()     // Catch:{ IOException -> 0x005a, all -> 0x003b }
                r4 = 1
                of1.f r5 = r8.f100394d     // Catch:{ IOException -> 0x0039, all -> 0x0037 }
                r5.mo7190b(r1, r0)     // Catch:{ IOException -> 0x0039, all -> 0x0037 }
                of1.z r0 = r1.mo101541k()     // Catch:{ all -> 0x0093 }
                of1.p r0 = r0.mo97056o()     // Catch:{ all -> 0x0093 }
            L_0x0033:
                r0.mo96874f(r8)     // Catch:{ all -> 0x0093 }
                goto L_0x0083
            L_0x0037:
                r0 = move-exception
                goto L_0x003f
            L_0x0039:
                r0 = move-exception
                goto L_0x005e
            L_0x003b:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x003f:
                r1.cancel()     // Catch:{ all -> 0x0058 }
                if (r4 != 0) goto L_0x0057
                java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0058 }
                java.lang.String r5 = "canceled due to "
                java.lang.String r5 = kotlin.jvm.internal.C41536l.m120497q(r5, r0)     // Catch:{ all -> 0x0058 }
                r4.<init>(r5)     // Catch:{ all -> 0x0058 }
                he1.C41211b.m119461a(r4, r0)     // Catch:{ all -> 0x0058 }
                of1.f r5 = r8.f100394d     // Catch:{ all -> 0x0058 }
                r5.mo7189a(r1, r4)     // Catch:{ all -> 0x0058 }
            L_0x0057:
                throw r0     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r0 = move-exception
                goto L_0x0087
            L_0x005a:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x005e:
                if (r4 == 0) goto L_0x0075
                xf1.k$a r4 = xf1.C43286k.f101052a     // Catch:{ all -> 0x0058 }
                xf1.k r4 = r4.mo101988g()     // Catch:{ all -> 0x0058 }
                java.lang.String r5 = "Callback failure for "
                java.lang.String r6 = r1.m123390D()     // Catch:{ all -> 0x0058 }
                java.lang.String r5 = kotlin.jvm.internal.C41536l.m120497q(r5, r6)     // Catch:{ all -> 0x0058 }
                r6 = 4
                r4.mo101984j(r5, r6, r0)     // Catch:{ all -> 0x0058 }
                goto L_0x007a
            L_0x0075:
                of1.f r4 = r8.f100394d     // Catch:{ all -> 0x0058 }
                r4.mo7189a(r1, r0)     // Catch:{ all -> 0x0058 }
            L_0x007a:
                of1.z r0 = r1.mo101541k()     // Catch:{ all -> 0x0093 }
                of1.p r0 = r0.mo97056o()     // Catch:{ all -> 0x0093 }
                goto L_0x0033
            L_0x0083:
                r2.setName(r3)
                return
            L_0x0087:
                of1.z r1 = r1.mo101541k()     // Catch:{ all -> 0x0093 }
                of1.p r1 = r1.mo97056o()     // Catch:{ all -> 0x0093 }
                r1.mo96874f(r8)     // Catch:{ all -> 0x0093 }
                throw r0     // Catch:{ all -> 0x0093 }
            L_0x0093:
                r0 = move-exception
                r2.setName(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: tf1.C43002e.C43003a.run():void");
        }
    }

    /* renamed from: tf1.e$b */
    public static final class C43004b extends WeakReference {

        /* renamed from: a */
        private final Object f100397a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43004b(C43002e eVar, Object obj) {
            super(eVar);
            C41536l.m120489i(eVar, "referent");
            this.f100397a = obj;
        }

        /* renamed from: a */
        public final Object mo101560a() {
            return this.f100397a;
        }
    }

    /* renamed from: tf1.e$c */
    public static final class C43005c extends C40664a {

        /* renamed from: m */
        final /* synthetic */ C43002e f100398m;

        C43005c(C43002e eVar) {
            this.f100398m = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public void mo94670z() {
            this.f100398m.cancel();
        }
    }

    public C43002e(C41944z zVar, C41869b0 b0Var, boolean z) {
        C41536l.m120489i(zVar, "client");
        C41536l.m120489i(b0Var, "originalRequest");
        this.f100376d = zVar;
        this.f100377e = b0Var;
        this.f100378f = z;
        this.f100379g = zVar.mo97053l().mo96833a();
        this.f100380h = zVar.mo97058q().mo96911a(this);
        C43005c cVar = new C43005c(this);
        cVar.mo94688g((long) mo101541k().mo97049g(), TimeUnit.MILLISECONDS);
        this.f100381i = cVar;
    }

    /* renamed from: C */
    private final IOException m123389C(IOException iOException) {
        if (this.f100386n || !this.f100381i.mo94666u()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final String m123390D() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (mo96790x()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f100378f) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(mo101551u());
        return sb.toString();
    }

    /* renamed from: d */
    private final IOException m123393d(IOException iOException) {
        Socket y;
        boolean z;
        boolean z2 = C42197d.f99271h;
        if (!z2 || !Thread.holdsLock(this)) {
            C43006f fVar = this.f100385m;
            if (fVar != null) {
                if (!z2 || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        y = mo101552y();
                    }
                    if (this.f100385m == null) {
                        if (y != null) {
                            C42197d.m122548n(y);
                        }
                        this.f100380h.mo96895k(this, fVar);
                    } else {
                        if (y == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
                }
            }
            IOException C = m123389C(iOException);
            if (iOException != null) {
                C41917r rVar = this.f100380h;
                C41536l.m120486f(C);
                rVar.mo96888d(this, C);
            } else {
                this.f100380h.mo96887c(this);
            }
            return C;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: e */
    private final void m123394e() {
        this.f100383k = C43286k.f101052a.mo101988g().mo101960h("response.body().close()");
        this.f100380h.mo96889e(this);
    }

    /* renamed from: g */
    private final C41863a m123395g(C41931v vVar) {
        C41890g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.mo96955j()) {
            sSLSocketFactory = this.f100376d.mo97043L();
            hostnameVerifier = this.f100376d.mo97062u();
            gVar = this.f100376d.mo97051j();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C41863a(vVar.mo96954i(), vVar.mo96959o(), this.f100376d.mo97057p(), this.f100376d.mo97042K(), sSLSocketFactory, hostnameVerifier, gVar, this.f100376d.mo97038G(), this.f100376d.mo97037F(), this.f100376d.mo97036E(), this.f100376d.mo97054m(), this.f100376d.mo97039H());
    }

    /* renamed from: A */
    public final void mo101534A(C43006f fVar) {
        this.f100393u = fVar;
    }

    /* renamed from: B */
    public final void mo101535B() {
        if (!this.f100386n) {
            this.f100386n = true;
            this.f100381i.mo94666u();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final void mo101536c(C43006f fVar) {
        boolean z;
        C41536l.m120489i(fVar, "connection");
        if (!C42197d.f99271h || Thread.holdsLock(fVar)) {
            if (this.f100385m == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f100385m = fVar;
                fVar.mo101572o().add(new C43004b(this, this.f100383k));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    public void cancel() {
        if (!this.f100391s) {
            this.f100391s = true;
            C42998c cVar = this.f100392t;
            if (cVar != null) {
                cVar.mo101508b();
            }
            C43006f fVar = this.f100393u;
            if (fVar != null) {
                fVar.mo101569e();
            }
            this.f100380h.mo96890f(this);
        }
    }

    /* renamed from: f */
    public C43002e clone() {
        return new C43002e(this.f100376d, this.f100377e, this.f100378f);
    }

    /* renamed from: f0 */
    public void mo96787f0(C41888f fVar) {
        C41536l.m120489i(fVar, "responseCallback");
        if (this.f100382j.compareAndSet(false, true)) {
            m123394e();
            this.f100376d.mo97056o().mo96871a(new C43003a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: h */
    public final void mo101539h(C41869b0 b0Var, boolean z) {
        boolean z2;
        C41536l.m120489i(b0Var, "request");
        if (this.f100387o == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            synchronized (this) {
                if (!(!this.f100389q)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.f100388p) {
                    C41238w wVar = C41238w.f97225a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                this.f100384l = new C43001d(this.f100379g, m123395g(b0Var.mo96681j()), this, this.f100380h);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: j */
    public final void mo101540j(boolean z) {
        C42998c cVar;
        synchronized (this) {
            if (this.f100390r) {
                C41238w wVar = C41238w.f97225a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.f100392t) != null) {
            cVar.mo101510d();
        }
        this.f100387o = null;
    }

    /* renamed from: k */
    public final C41944z mo101541k() {
        return this.f100376d;
    }

    /* renamed from: l */
    public final C43006f mo101542l() {
        return this.f100385m;
    }

    /* renamed from: m */
    public final C41917r mo101543m() {
        return this.f100380h;
    }

    /* renamed from: n */
    public final boolean mo101544n() {
        return this.f100378f;
    }

    /* renamed from: o */
    public final C42998c mo101545o() {
        return this.f100387o;
    }

    /* renamed from: p */
    public final C41869b0 mo101546p() {
        return this.f100377e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final of1.C41880d0 mo101547q() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            of1.z r0 = r12.f100376d
            java.util.List r0 = r0.mo97063y()
            boolean unused = ie1.C41352v.m119965z(r2, r0)
            uf1.j r0 = new uf1.j
            of1.z r1 = r12.f100376d
            r0.<init>(r1)
            r2.add(r0)
            uf1.a r0 = new uf1.a
            of1.z r1 = r12.f100376d
            of1.n r1 = r1.mo97055n()
            r0.<init>(r1)
            r2.add(r0)
            rf1.a r0 = new rf1.a
            of1.z r1 = r12.f100376d
            r1.mo97048f()
            r9 = 0
            r0.<init>(r9)
            r2.add(r0)
            tf1.a r0 = tf1.C42996a.f100344a
            r2.add(r0)
            boolean r0 = r12.f100378f
            if (r0 != 0) goto L_0x0046
            of1.z r0 = r12.f100376d
            java.util.List r0 = r0.mo97032A()
            boolean unused = ie1.C41352v.m119965z(r2, r0)
        L_0x0046:
            uf1.b r0 = new uf1.b
            boolean r1 = r12.f100378f
            r0.<init>(r1)
            r2.add(r0)
            uf1.g r10 = new uf1.g
            r3 = 0
            r4 = 0
            of1.b0 r5 = r12.f100377e
            of1.z r0 = r12.f100376d
            int r6 = r0.mo97052k()
            of1.z r0 = r12.f100376d
            int r7 = r0.mo97040I()
            of1.z r0 = r12.f100376d
            int r8 = r0.mo97044N()
            r0 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            of1.b0 r1 = r12.f100377e     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            of1.d0 r1 = r10.mo97008a(r1)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            boolean r2 = r12.mo96790x()     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            if (r2 != 0) goto L_0x007e
            r12.mo101550t(r9)
            return r1
        L_0x007e:
            pf1.C42197d.m122547m(r1)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
            throw r1     // Catch:{ IOException -> 0x008b, all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            goto L_0x00a0
        L_0x008b:
            r0 = move-exception
            r1 = 1
            java.io.IOException r0 = r12.mo101550t(r0)     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x009b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x009c }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009b:
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
        L_0x00a0:
            if (r0 != 0) goto L_0x00a5
            r12.mo101550t(r9)
        L_0x00a5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.C43002e.mo101547q():of1.d0");
    }

    /* renamed from: r */
    public final C42998c mo101548r(C43094g gVar) {
        C41536l.m120489i(gVar, "chain");
        synchronized (this) {
            if (!this.f100390r) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.f100389q)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f100388p) {
                C41238w wVar = C41238w.f97225a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        C43001d dVar = this.f100384l;
        C41536l.m120486f(dVar);
        C42998c cVar = new C42998c(this, this.f100380h, dVar, dVar.mo101529a(this.f100376d, gVar));
        this.f100387o = cVar;
        this.f100392t = cVar;
        synchronized (this) {
            this.f100388p = true;
            this.f100389q = true;
        }
        if (!this.f100391s) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0017 }] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException mo101549s(tf1.C42998c r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            tf1.c r0 = r1.f100392t
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r0)
            if (r2 != 0) goto L_0x000e
            return r5
        L_0x000e:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0019
            boolean r0 = r1.f100388p     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            goto L_0x005a
        L_0x0019:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r1.f100389q     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0041
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            r1.f100388p = r2     // Catch:{ all -> 0x0017 }
        L_0x0023:
            if (r4 == 0) goto L_0x0027
            r1.f100389q = r2     // Catch:{ all -> 0x0017 }
        L_0x0027:
            boolean r3 = r1.f100388p     // Catch:{ all -> 0x0017 }
            r4 = 1
            if (r3 != 0) goto L_0x0032
            boolean r0 = r1.f100389q     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0032
            r0 = r4
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f100389q     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f100390r     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            r2 = r4
        L_0x003e:
            r3 = r2
            r2 = r0
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            he1.w r4 = he1.C41238w.f97225a     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0052
            r2 = 0
            r1.f100392t = r2
            tf1.f r2 = r1.f100385m
            if (r2 != 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r2.mo101577t()
        L_0x0052:
            if (r3 == 0) goto L_0x0059
            java.io.IOException r2 = r1.m123393d(r5)
            return r2
        L_0x0059:
            return r5
        L_0x005a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tf1.C43002e.mo101549s(tf1.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: t */
    public final IOException mo101550t(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f100390r) {
                this.f100390r = false;
                if (!this.f100388p && !this.f100389q) {
                    z = true;
                }
            }
            C41238w wVar = C41238w.f97225a;
        }
        if (z) {
            return m123393d(iOException);
        }
        return iOException;
    }

    /* renamed from: u */
    public final String mo101551u() {
        return this.f100377e.mo96681j().mo96962r();
    }

    /* renamed from: v */
    public C41880d0 mo96788v() {
        if (this.f100382j.compareAndSet(false, true)) {
            this.f100381i.mo94665t();
            m123394e();
            try {
                this.f100376d.mo97056o().mo96872b(this);
                return mo101547q();
            } finally {
                this.f100376d.mo97056o().mo96875g(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* renamed from: w */
    public C41869b0 mo96789w() {
        return this.f100377e;
    }

    /* renamed from: x */
    public boolean mo96790x() {
        return this.f100391s;
    }

    /* renamed from: y */
    public final Socket mo101552y() {
        C43006f fVar = this.f100385m;
        C41536l.m120486f(fVar);
        if (!C42197d.f99271h || Thread.holdsLock(fVar)) {
            List o = fVar.mo101572o();
            Iterator it = o.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C41536l.m120484d(((Reference) it.next()).get(), this)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            if (z) {
                o.remove(i);
                this.f100385m = null;
                if (o.isEmpty()) {
                    fVar.mo101563D(System.nanoTime());
                    if (this.f100379g.mo101590c(fVar)) {
                        return fVar.mo101565F();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    /* renamed from: z */
    public final boolean mo101553z() {
        C43001d dVar = this.f100384l;
        C41536l.m120486f(dVar);
        return dVar.mo101531e();
    }
}
