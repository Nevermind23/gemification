package of1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import of1.C41928u;
import tf1.C42998c;
import uf1.C43092e;

/* renamed from: of1.d0 */
public final class C41880d0 implements Closeable {

    /* renamed from: d */
    private final C41869b0 f98309d;

    /* renamed from: e */
    private final C41864a0 f98310e;

    /* renamed from: f */
    private final String f98311f;

    /* renamed from: g */
    private final int f98312g;

    /* renamed from: h */
    private final C41924t f98313h;

    /* renamed from: i */
    private final C41928u f98314i;

    /* renamed from: j */
    private final C41884e0 f98315j;

    /* renamed from: k */
    private final C41880d0 f98316k;

    /* renamed from: l */
    private final C41880d0 f98317l;

    /* renamed from: m */
    private final C41880d0 f98318m;

    /* renamed from: n */
    private final long f98319n;

    /* renamed from: o */
    private final long f98320o;

    /* renamed from: p */
    private final C42998c f98321p;

    /* renamed from: q */
    private C41877d f98322q;

    public C41880d0(C41869b0 b0Var, C41864a0 a0Var, String str, int i, C41924t tVar, C41928u uVar, C41884e0 e0Var, C41880d0 d0Var, C41880d0 d0Var2, C41880d0 d0Var3, long j, long j2, C42998c cVar) {
        C41536l.m120489i(b0Var, "request");
        C41536l.m120489i(a0Var, "protocol");
        C41536l.m120489i(str, "message");
        C41536l.m120489i(uVar, "headers");
        this.f98309d = b0Var;
        this.f98310e = a0Var;
        this.f98311f = str;
        this.f98312g = i;
        this.f98313h = tVar;
        this.f98314i = uVar;
        this.f98315j = e0Var;
        this.f98316k = d0Var;
        this.f98317l = d0Var2;
        this.f98318m = d0Var3;
        this.f98319n = j;
        this.f98320o = j2;
        this.f98321p = cVar;
    }

    /* renamed from: v */
    public static /* synthetic */ String m121379v(C41880d0 d0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return d0Var.mo96751u(str, str2);
    }

    /* renamed from: Q */
    public final C41881a mo96736Q() {
        return new C41881a(this);
    }

    /* renamed from: R */
    public final C41880d0 mo96737R() {
        return this.f98318m;
    }

    /* renamed from: U */
    public final C41864a0 mo96738U() {
        return this.f98310e;
    }

    /* renamed from: a */
    public final C41884e0 mo96739a() {
        return this.f98315j;
    }

    /* renamed from: a0 */
    public final long mo96740a0() {
        return this.f98320o;
    }

    public void close() {
        C41884e0 e0Var = this.f98315j;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: e0 */
    public final C41869b0 mo96742e0() {
        return this.f98309d;
    }

    /* renamed from: f0 */
    public final long mo96743f0() {
        return this.f98319n;
    }

    /* renamed from: k */
    public final C41877d mo96744k() {
        C41877d dVar = this.f98322q;
        if (dVar != null) {
            return dVar;
        }
        C41877d b = C41877d.f98285n.mo96735b(this.f98314i);
        this.f98322q = b;
        return b;
    }

    /* renamed from: n */
    public final C41880d0 mo96745n() {
        return this.f98317l;
    }

    /* renamed from: o */
    public final List mo96746o() {
        String str;
        C41928u uVar = this.f98314i;
        int i = this.f98312g;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return C41341q.m119907j();
        } else {
            str = "Proxy-Authenticate";
        }
        return C43092e.m123639a(uVar, str);
    }

    /* renamed from: q */
    public final int mo96747q() {
        return this.f98312g;
    }

    /* renamed from: s */
    public final C42998c mo96748s() {
        return this.f98321p;
    }

    /* renamed from: t */
    public final C41924t mo96749t() {
        return this.f98313h;
    }

    public String toString() {
        return "Response{protocol=" + this.f98310e + ", code=" + this.f98312g + ", message=" + this.f98311f + ", url=" + this.f98309d.mo96681j() + '}';
    }

    /* renamed from: u */
    public final String mo96751u(String str, String str2) {
        C41536l.m120489i(str, "name");
        String b = this.f98314i.mo96925b(str);
        if (b == null) {
            return str2;
        }
        return b;
    }

    /* renamed from: u0 */
    public final boolean mo96752u0() {
        int i = this.f98312g;
        return 200 <= i && i < 300;
    }

    /* renamed from: w */
    public final C41928u mo96753w() {
        return this.f98314i;
    }

    /* renamed from: x */
    public final String mo96754x() {
        return this.f98311f;
    }

    /* renamed from: y */
    public final C41880d0 mo96755y() {
        return this.f98316k;
    }

    /* renamed from: of1.d0$a */
    public static class C41881a {

        /* renamed from: a */
        private C41869b0 f98323a;

        /* renamed from: b */
        private C41864a0 f98324b;

        /* renamed from: c */
        private int f98325c;

        /* renamed from: d */
        private String f98326d;

        /* renamed from: e */
        private C41924t f98327e;

        /* renamed from: f */
        private C41928u.C41929a f98328f;

        /* renamed from: g */
        private C41884e0 f98329g;

        /* renamed from: h */
        private C41880d0 f98330h;

        /* renamed from: i */
        private C41880d0 f98331i;

        /* renamed from: j */
        private C41880d0 f98332j;

        /* renamed from: k */
        private long f98333k;

        /* renamed from: l */
        private long f98334l;

        /* renamed from: m */
        private C42998c f98335m;

        public C41881a() {
            this.f98325c = -1;
            this.f98328f = new C41928u.C41929a();
        }

        /* renamed from: e */
        private final void m121398e(C41880d0 d0Var) {
            if (d0Var != null) {
                if (!(d0Var.mo96739a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        /* renamed from: f */
        private final void m121399f(String str, C41880d0 d0Var) {
            boolean z;
            boolean z2;
            boolean z3;
            if (d0Var != null) {
                boolean z4 = true;
                if (d0Var.mo96739a() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (d0Var.mo96755y() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (d0Var.mo96745n() == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (d0Var.mo96737R() != null) {
                                z4 = false;
                            }
                            if (!z4) {
                                throw new IllegalArgumentException(C41536l.m120497q(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(C41536l.m120497q(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(C41536l.m120497q(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(C41536l.m120497q(str, ".body != null").toString());
            }
        }

        /* renamed from: A */
        public final void mo96756A(C41880d0 d0Var) {
            this.f98330h = d0Var;
        }

        /* renamed from: B */
        public final void mo96757B(C41880d0 d0Var) {
            this.f98332j = d0Var;
        }

        /* renamed from: C */
        public final void mo96758C(C41864a0 a0Var) {
            this.f98324b = a0Var;
        }

        /* renamed from: D */
        public final void mo96759D(long j) {
            this.f98334l = j;
        }

        /* renamed from: E */
        public final void mo96760E(C41869b0 b0Var) {
            this.f98323a = b0Var;
        }

        /* renamed from: F */
        public final void mo96761F(long j) {
            this.f98333k = j;
        }

        /* renamed from: a */
        public C41881a mo96762a(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            mo96768i().mo96936a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C41881a mo96763b(C41884e0 e0Var) {
            mo96780u(e0Var);
            return this;
        }

        /* renamed from: c */
        public C41880d0 mo96764c() {
            boolean z;
            int i = this.f98325c;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C41869b0 b0Var = this.f98323a;
                if (b0Var != null) {
                    C41864a0 a0Var = this.f98324b;
                    if (a0Var != null) {
                        String str = this.f98326d;
                        if (str != null) {
                            return new C41880d0(b0Var, a0Var, str, i, this.f98327e, this.f98328f.mo96941f(), this.f98329g, this.f98330h, this.f98331i, this.f98332j, this.f98333k, this.f98334l, this.f98335m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(C41536l.m120497q("code < 0: ", Integer.valueOf(mo96767h())).toString());
        }

        /* renamed from: d */
        public C41881a mo96765d(C41880d0 d0Var) {
            m121399f("cacheResponse", d0Var);
            mo96781v(d0Var);
            return this;
        }

        /* renamed from: g */
        public C41881a mo96766g(int i) {
            mo96782w(i);
            return this;
        }

        /* renamed from: h */
        public final int mo96767h() {
            return this.f98325c;
        }

        /* renamed from: i */
        public final C41928u.C41929a mo96768i() {
            return this.f98328f;
        }

        /* renamed from: j */
        public C41881a mo96769j(C41924t tVar) {
            mo96783x(tVar);
            return this;
        }

        /* renamed from: k */
        public C41881a mo96770k(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            mo96768i().mo96944i(str, str2);
            return this;
        }

        /* renamed from: l */
        public C41881a mo96771l(C41928u uVar) {
            C41536l.m120489i(uVar, "headers");
            mo96784y(uVar.mo96931j());
            return this;
        }

        /* renamed from: m */
        public final void mo96772m(C42998c cVar) {
            C41536l.m120489i(cVar, "deferredTrailers");
            this.f98335m = cVar;
        }

        /* renamed from: n */
        public C41881a mo96773n(String str) {
            C41536l.m120489i(str, "message");
            mo96785z(str);
            return this;
        }

        /* renamed from: o */
        public C41881a mo96774o(C41880d0 d0Var) {
            m121399f("networkResponse", d0Var);
            mo96756A(d0Var);
            return this;
        }

        /* renamed from: p */
        public C41881a mo96775p(C41880d0 d0Var) {
            m121398e(d0Var);
            mo96757B(d0Var);
            return this;
        }

        /* renamed from: q */
        public C41881a mo96776q(C41864a0 a0Var) {
            C41536l.m120489i(a0Var, "protocol");
            mo96758C(a0Var);
            return this;
        }

        /* renamed from: r */
        public C41881a mo96777r(long j) {
            mo96759D(j);
            return this;
        }

        /* renamed from: s */
        public C41881a mo96778s(C41869b0 b0Var) {
            C41536l.m120489i(b0Var, "request");
            mo96760E(b0Var);
            return this;
        }

        /* renamed from: t */
        public C41881a mo96779t(long j) {
            mo96761F(j);
            return this;
        }

        /* renamed from: u */
        public final void mo96780u(C41884e0 e0Var) {
            this.f98329g = e0Var;
        }

        /* renamed from: v */
        public final void mo96781v(C41880d0 d0Var) {
            this.f98331i = d0Var;
        }

        /* renamed from: w */
        public final void mo96782w(int i) {
            this.f98325c = i;
        }

        /* renamed from: x */
        public final void mo96783x(C41924t tVar) {
            this.f98327e = tVar;
        }

        /* renamed from: y */
        public final void mo96784y(C41928u.C41929a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f98328f = aVar;
        }

        /* renamed from: z */
        public final void mo96785z(String str) {
            this.f98326d = str;
        }

        public C41881a(C41880d0 d0Var) {
            C41536l.m120489i(d0Var, "response");
            this.f98325c = -1;
            this.f98323a = d0Var.mo96742e0();
            this.f98324b = d0Var.mo96738U();
            this.f98325c = d0Var.mo96747q();
            this.f98326d = d0Var.mo96754x();
            this.f98327e = d0Var.mo96749t();
            this.f98328f = d0Var.mo96753w().mo96931j();
            this.f98329g = d0Var.mo96739a();
            this.f98330h = d0Var.mo96755y();
            this.f98331i = d0Var.mo96745n();
            this.f98332j = d0Var.mo96737R();
            this.f98333k = d0Var.mo96743f0();
            this.f98334l = d0Var.mo96740a0();
            this.f98335m = d0Var.mo96748s();
        }
    }
}
