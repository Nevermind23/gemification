package zh1;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dg1.C40672b;
import dg1.C40679d;
import dg1.C40686h;
import dg1.C40691m;
import dg1.C40707z;
import java.io.IOException;
import java.util.Objects;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41884e0;
import of1.C41888f;
import of1.C41937x;

/* renamed from: zh1.o */
final class C43477o implements C43443b {

    /* renamed from: d */
    private final C43508u f101351d;

    /* renamed from: e */
    private final Object[] f101352e;

    /* renamed from: f */
    private final C41882e.C41883a f101353f;

    /* renamed from: g */
    private final C43455h f101354g;

    /* renamed from: h */
    private volatile boolean f101355h;

    /* renamed from: i */
    private C41882e f101356i;

    /* renamed from: j */
    private Throwable f101357j;

    /* renamed from: k */
    private boolean f101358k;

    /* renamed from: zh1.o$a */
    class C43478a implements C41888f {

        /* renamed from: a */
        final /* synthetic */ C43446d f101359a;

        C43478a(C43446d dVar) {
            this.f101359a = dVar;
        }

        /* renamed from: c */
        private void m124694c(Throwable th) {
            try {
                this.f101359a.onFailure(C43477o.this, th);
            } catch (Throwable th2) {
                C43439a0.m124631s(th2);
                th2.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo7189a(C41882e eVar, IOException iOException) {
            m124694c(iOException);
        }

        /* renamed from: b */
        public void mo7190b(C41882e eVar, C41880d0 d0Var) {
            try {
                try {
                    this.f101359a.onResponse(C43477o.this, C43477o.this.mo102180d(d0Var));
                } catch (Throwable th) {
                    C43439a0.m124631s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C43439a0.m124631s(th2);
                m124694c(th2);
            }
        }
    }

    /* renamed from: zh1.o$b */
    static final class C43479b extends C41884e0 {

        /* renamed from: f */
        private final C41884e0 f101361f;

        /* renamed from: g */
        private final C40679d f101362g;

        /* renamed from: h */
        IOException f101363h;

        /* renamed from: zh1.o$b$a */
        class C43480a extends C40686h {
            C43480a(C40707z zVar) {
                super(zVar);
            }

            /* renamed from: g */
            public long mo21305g(C40672b bVar, long j) {
                try {
                    return super.mo21305g(bVar, j);
                } catch (IOException e) {
                    C43479b.this.f101363h = e;
                    throw e;
                }
            }
        }

        C43479b(C41884e0 e0Var) {
            this.f101361f = e0Var;
            this.f101362g = C40691m.m117770b(new C43480a(e0Var.mo21304t()));
        }

        public void close() {
            this.f101361f.close();
        }

        /* renamed from: o */
        public long mo21302o() {
            return this.f101361f.mo21302o();
        }

        /* renamed from: q */
        public C41937x mo21303q() {
            return this.f101361f.mo21303q();
        }

        /* renamed from: t */
        public C40679d mo21304t() {
            return this.f101362g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo102181u() {
            IOException iOException = this.f101363h;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: zh1.o$c */
    static final class C43481c extends C41884e0 {

        /* renamed from: f */
        private final C41937x f101365f;

        /* renamed from: g */
        private final long f101366g;

        C43481c(C41937x xVar, long j) {
            this.f101365f = xVar;
            this.f101366g = j;
        }

        /* renamed from: o */
        public long mo21302o() {
            return this.f101366g;
        }

        /* renamed from: q */
        public C41937x mo21303q() {
            return this.f101365f;
        }

        /* renamed from: t */
        public C40679d mo21304t() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C43477o(C43508u uVar, Object[] objArr, C41882e.C41883a aVar, C43455h hVar) {
        this.f101351d = uVar;
        this.f101352e = objArr;
        this.f101353f = aVar;
        this.f101354g = hVar;
    }

    /* renamed from: b */
    private C41882e m124685b() {
        C41882e a = this.f101353f.mo96791a(this.f101351d.mo102212a(this.f101352e));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: c */
    private C41882e m124686c() {
        C41882e eVar = this.f101356i;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f101357j;
        if (th == null) {
            try {
                C41882e b = m124685b();
                this.f101356i = b;
                return b;
            } catch (IOException | Error | RuntimeException e) {
                C43439a0.m124631s(e);
                this.f101357j = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    /* renamed from: a */
    public C43477o mo102157f1() {
        return new C43477o(this.f101351d, this.f101352e, this.f101353f, this.f101354g);
    }

    public void cancel() {
        C41882e eVar;
        this.f101355h = true;
        synchronized (this) {
            eVar = this.f101356i;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C43510v mo102180d(C41880d0 d0Var) {
        C41884e0 a = d0Var.mo96739a();
        C41880d0 c = d0Var.mo96736Q().mo96763b(new C43481c(a.mo21303q(), a.mo21302o())).mo96764c();
        int q = c.mo96747q();
        if (q < 200 || q >= 300) {
            try {
                return C43510v.m124775c(C43439a0.m124613a(a), c);
            } finally {
                a.close();
            }
        } else if (q == 204 || q == 205) {
            a.close();
            return C43510v.m124776f((Object) null, c);
        } else {
            C43479b bVar = new C43479b(a);
            try {
                return C43510v.m124776f(this.f101354g.mo94450a(bVar), c);
            } catch (RuntimeException e) {
                bVar.mo102181u();
                throw e;
            }
        }
    }

    /* renamed from: i */
    public void mo102158i(C43446d dVar) {
        C41882e eVar;
        Throwable th;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            if (!this.f101358k) {
                this.f101358k = true;
                eVar = this.f101356i;
                th = this.f101357j;
                if (eVar == null && th == null) {
                    try {
                        C41882e b = m124685b();
                        this.f101356i = b;
                        eVar = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C43439a0.m124631s(th);
                        this.f101357j = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.f101355h) {
            eVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(eVar, new C43478a(dVar));
    }

    /* renamed from: v */
    public C43510v mo102159v() {
        C41882e c;
        synchronized (this) {
            if (!this.f101358k) {
                this.f101358k = true;
                c = m124686c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f101355h) {
            c.cancel();
        }
        return mo102180d(FirebasePerfOkHttpClient.execute(c));
    }

    /* renamed from: w */
    public synchronized C41869b0 mo102160w() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m124686c().mo96789w();
    }

    /* renamed from: x */
    public boolean mo102161x() {
        boolean z = true;
        if (this.f101355h) {
            return true;
        }
        synchronized (this) {
            C41882e eVar = this.f101356i;
            if (eVar == null || !eVar.mo96790x()) {
                z = false;
            }
        }
        return z;
    }
}
