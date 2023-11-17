package tf1;

import bg1.C40370d;
import dg1.C40672b;
import dg1.C40685g;
import dg1.C40686h;
import dg1.C40691m;
import dg1.C40705x;
import dg1.C40707z;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.C41536l;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41884e0;
import of1.C41917r;
import uf1.C43091d;
import uf1.C43095h;

/* renamed from: tf1.c */
public final class C42998c {

    /* renamed from: a */
    private final C43002e f100349a;

    /* renamed from: b */
    private final C41917r f100350b;

    /* renamed from: c */
    private final C43001d f100351c;

    /* renamed from: d */
    private final C43091d f100352d;

    /* renamed from: e */
    private boolean f100353e;

    /* renamed from: f */
    private final C43006f f100354f;

    /* renamed from: tf1.c$a */
    private final class C42999a extends C40685g {

        /* renamed from: e */
        private final long f100355e;

        /* renamed from: f */
        private boolean f100356f;

        /* renamed from: g */
        private long f100357g;

        /* renamed from: h */
        private boolean f100358h;

        /* renamed from: i */
        final /* synthetic */ C42998c f100359i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42999a(C42998c cVar, C40705x xVar, long j) {
            super(xVar);
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(xVar, "delegate");
            this.f100359i = cVar;
            this.f100355e = j;
        }

        /* renamed from: a */
        private final IOException m123377a(IOException iOException) {
            if (this.f100356f) {
                return iOException;
            }
            this.f100356f = true;
            return this.f100359i.mo101507a(this.f100357g, false, true, iOException);
        }

        public void close() {
            if (!this.f100358h) {
                this.f100358h = true;
                long j = this.f100355e;
                if (j == -1 || this.f100357g == j) {
                    try {
                        super.close();
                        m123377a((IOException) null);
                    } catch (IOException e) {
                        throw m123377a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw m123377a(e);
            }
        }

        /* renamed from: x1 */
        public void mo21301x1(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "source");
            if (!this.f100358h) {
                long j2 = this.f100355e;
                if (j2 == -1 || this.f100357g + j <= j2) {
                    try {
                        super.mo21301x1(bVar, j);
                        this.f100357g += j;
                    } catch (IOException e) {
                        throw m123377a(e);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f100355e + " bytes but received " + (this.f100357g + j));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* renamed from: tf1.c$b */
    public final class C43000b extends C40686h {

        /* renamed from: e */
        private final long f100360e;

        /* renamed from: f */
        private long f100361f;

        /* renamed from: g */
        private boolean f100362g = true;

        /* renamed from: h */
        private boolean f100363h;

        /* renamed from: i */
        private boolean f100364i;

        /* renamed from: j */
        final /* synthetic */ C42998c f100365j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43000b(C42998c cVar, C40707z zVar, long j) {
            super(zVar);
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(zVar, "delegate");
            this.f100365j = cVar;
            this.f100360e = j;
            if (j == 0) {
                mo101528c((IOException) null);
            }
        }

        /* renamed from: c */
        public final IOException mo101528c(IOException iOException) {
            if (this.f100363h) {
                return iOException;
            }
            this.f100363h = true;
            if (iOException == null && this.f100362g) {
                this.f100362g = false;
                this.f100365j.mo101515i().mo96906v(this.f100365j.mo101513g());
            }
            return this.f100365j.mo101507a(this.f100361f, true, false, iOException);
        }

        public void close() {
            if (!this.f100364i) {
                this.f100364i = true;
                try {
                    super.close();
                    mo101528c((IOException) null);
                } catch (IOException e) {
                    throw mo101528c(e);
                }
            }
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            C41536l.m120489i(bVar, "sink");
            if (!this.f100364i) {
                try {
                    long g = mo94828a().mo21305g(bVar, j);
                    if (this.f100362g) {
                        this.f100362g = false;
                        this.f100365j.mo101515i().mo96906v(this.f100365j.mo101513g());
                    }
                    if (g == -1) {
                        mo101528c((IOException) null);
                        return -1;
                    }
                    long j2 = this.f100361f + g;
                    long j3 = this.f100360e;
                    if (j3 != -1) {
                        if (j2 > j3) {
                            throw new ProtocolException("expected " + this.f100360e + " bytes but received " + j2);
                        }
                    }
                    this.f100361f = j2;
                    if (j2 == j3) {
                        mo101528c((IOException) null);
                    }
                    return g;
                } catch (IOException e) {
                    throw mo101528c(e);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public C42998c(C43002e eVar, C41917r rVar, C43001d dVar, C43091d dVar2) {
        C41536l.m120489i(eVar, "call");
        C41536l.m120489i(rVar, "eventListener");
        C41536l.m120489i(dVar, "finder");
        C41536l.m120489i(dVar2, "codec");
        this.f100349a = eVar;
        this.f100350b = rVar;
        this.f100351c = dVar;
        this.f100352d = dVar2;
        this.f100354f = dVar2.mo101654c();
    }

    /* renamed from: t */
    private final void m123355t(IOException iOException) {
        this.f100351c.mo101533h(iOException);
        this.f100352d.mo101654c().mo101566I(this.f100349a, iOException);
    }

    /* renamed from: a */
    public final IOException mo101507a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m123355t(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f100350b.mo96902r(this.f100349a, iOException);
            } else {
                this.f100350b.mo96900p(this.f100349a, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f100350b.mo96907w(this.f100349a, iOException);
            } else {
                this.f100350b.mo96905u(this.f100349a, j);
            }
        }
        return this.f100349a.mo101549s(this, z2, z, iOException);
    }

    /* renamed from: b */
    public final void mo101508b() {
        this.f100352d.cancel();
    }

    /* renamed from: c */
    public final C40705x mo101509c(C41869b0 b0Var, boolean z) {
        C41536l.m120489i(b0Var, "request");
        this.f100353e = z;
        C41872c0 a = b0Var.mo96672a();
        C41536l.m120486f(a);
        long a2 = a.mo21298a();
        this.f100350b.mo96901q(this.f100349a);
        return new C42999a(this, this.f100352d.mo101653b(b0Var, a2), a2);
    }

    /* renamed from: d */
    public final void mo101510d() {
        this.f100352d.cancel();
        this.f100349a.mo101549s(this, true, true, (IOException) null);
    }

    /* renamed from: e */
    public final void mo101511e() {
        try {
            this.f100352d.mo101652a();
        } catch (IOException e) {
            this.f100350b.mo96902r(this.f100349a, e);
            m123355t(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void mo101512f() {
        try {
            this.f100352d.mo101659g();
        } catch (IOException e) {
            this.f100350b.mo96902r(this.f100349a, e);
            m123355t(e);
            throw e;
        }
    }

    /* renamed from: g */
    public final C43002e mo101513g() {
        return this.f100349a;
    }

    /* renamed from: h */
    public final C43006f mo101514h() {
        return this.f100354f;
    }

    /* renamed from: i */
    public final C41917r mo101515i() {
        return this.f100350b;
    }

    /* renamed from: j */
    public final C43001d mo101516j() {
        return this.f100351c;
    }

    /* renamed from: k */
    public final boolean mo101517k() {
        return !C41536l.m120484d(this.f100351c.mo101530d().mo96668l().mo96954i(), this.f100354f.mo101562B().mo96800a().mo96668l().mo96954i());
    }

    /* renamed from: l */
    public final boolean mo101518l() {
        return this.f100353e;
    }

    /* renamed from: m */
    public final C40370d.C40374d mo101519m() {
        this.f100349a.mo101535B();
        return this.f100352d.mo101654c().mo101583y(this);
    }

    /* renamed from: n */
    public final void mo101520n() {
        this.f100352d.mo101654c().mo101561A();
    }

    /* renamed from: o */
    public final void mo101521o() {
        this.f100349a.mo101549s(this, true, false, (IOException) null);
    }

    /* renamed from: p */
    public final C41884e0 mo101522p(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "response");
        try {
            String v = C41880d0.m121379v(d0Var, "Content-Type", (String) null, 2, (Object) null);
            long d = this.f100352d.mo101656d(d0Var);
            return new C43095h(v, d, C40691m.m117770b(new C43000b(this, this.f100352d.mo101660h(d0Var), d)));
        } catch (IOException e) {
            this.f100350b.mo96907w(this.f100349a, e);
            m123355t(e);
            throw e;
        }
    }

    /* renamed from: q */
    public final C41880d0.C41881a mo101523q(boolean z) {
        try {
            C41880d0.C41881a f = this.f100352d.mo101658f(z);
            if (f != null) {
                f.mo96772m(this);
            }
            return f;
        } catch (IOException e) {
            this.f100350b.mo96907w(this.f100349a, e);
            m123355t(e);
            throw e;
        }
    }

    /* renamed from: r */
    public final void mo101524r(C41880d0 d0Var) {
        C41536l.m120489i(d0Var, "response");
        this.f100350b.mo96908x(this.f100349a, d0Var);
    }

    /* renamed from: s */
    public final void mo101525s() {
        this.f100350b.mo96909y(this.f100349a);
    }

    /* renamed from: u */
    public final void mo101526u() {
        mo101507a(-1, true, true, (IOException) null);
    }

    /* renamed from: v */
    public final void mo101527v(C41869b0 b0Var) {
        C41536l.m120489i(b0Var, "request");
        try {
            this.f100350b.mo96904t(this.f100349a);
            this.f100352d.mo101657e(b0Var);
            this.f100350b.mo96903s(this.f100349a, b0Var);
        } catch (IOException e) {
            this.f100350b.mo96902r(this.f100349a, e);
            m123355t(e);
            throw e;
        }
    }
}
