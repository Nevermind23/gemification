package rf1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41864a0;
import of1.C41869b0;
import of1.C41871c;
import of1.C41880d0;
import of1.C41882e;
import of1.C41884e0;
import of1.C41917r;
import of1.C41928u;
import of1.C41935w;
import pf1.C42197d;
import rf1.C42370b;
import tf1.C43002e;

/* renamed from: rf1.a */
public final class C42368a implements C41935w {

    /* renamed from: a */
    public static final C42369a f99610a = new C42369a((DefaultConstructorMarker) null);

    /* renamed from: rf1.a$a */
    public static final class C42369a {
        private C42369a() {
        }

        public /* synthetic */ C42369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C41928u m122885c(C41928u uVar, C41928u uVar2) {
            C41928u.C41929a aVar = new C41928u.C41929a();
            int size = uVar.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                String c = uVar.mo96926c(i2);
                String n = uVar.mo96932n(i2);
                if ((!C40439w.m117115s("Warning", c, true) || !C40439w.m117109H(n, "1", false, 2, (Object) null)) && (m122886d(c) || !m122887e(c) || uVar2.mo96925b(c) == null)) {
                    aVar.mo96939d(c, n);
                }
                i2 = i3;
            }
            int size2 = uVar2.size();
            while (i < size2) {
                int i4 = i + 1;
                String c2 = uVar2.mo96926c(i);
                if (!m122886d(c2) && m122887e(c2)) {
                    aVar.mo96939d(c2, uVar2.mo96932n(i));
                }
                i = i4;
            }
            return aVar.mo96941f();
        }

        /* renamed from: d */
        private final boolean m122886d(String str) {
            if (C40439w.m117115s("Content-Length", str, true) || C40439w.m117115s("Content-Encoding", str, true) || C40439w.m117115s("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private final boolean m122887e(String str) {
            if (C40439w.m117115s("Connection", str, true) || C40439w.m117115s("Keep-Alive", str, true) || C40439w.m117115s("Proxy-Authenticate", str, true) || C40439w.m117115s("Proxy-Authorization", str, true) || C40439w.m117115s("TE", str, true) || C40439w.m117115s("Trailers", str, true) || C40439w.m117115s("Transfer-Encoding", str, true) || C40439w.m117115s("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final C41880d0 m122888f(C41880d0 d0Var) {
            C41884e0 e0Var;
            if (d0Var == null) {
                e0Var = null;
            } else {
                e0Var = d0Var.mo96739a();
            }
            if (e0Var != null) {
                return d0Var.mo96736Q().mo96763b((C41884e0) null).mo96764c();
            }
            return d0Var;
        }
    }

    public C42368a(C41871c cVar) {
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        C43002e eVar;
        C41917r rVar;
        C41536l.m120489i(aVar, "chain");
        C41882e call = aVar.call();
        C42370b b = new C42370b.C42372b(System.currentTimeMillis(), aVar.mo97011w(), (C41880d0) null).mo97822b();
        C41869b0 b2 = b.mo97820b();
        C41880d0 a = b.mo97819a();
        if (call instanceof C43002e) {
            eVar = (C43002e) call;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            rVar = null;
        } else {
            rVar = eVar.mo101543m();
        }
        if (rVar == null) {
            rVar = C41917r.f98534b;
        }
        if (b2 == null && a == null) {
            C41880d0 c = new C41880d0.C41881a().mo96778s(aVar.mo97011w()).mo96776q(C41864a0.HTTP_1_1).mo96766g(504).mo96773n("Unsatisfiable Request (only-if-cached)").mo96763b(C42197d.f99266c).mo96779t(-1).mo96777r(System.currentTimeMillis()).mo96764c();
            rVar.mo96910z(call, c);
            return c;
        } else if (b2 == null) {
            C41536l.m120486f(a);
            C41880d0 c2 = a.mo96736Q().mo96765d(f99610a.m122888f(a)).mo96764c();
            rVar.mo96886b(call, c2);
            return c2;
        } else {
            if (a != null) {
                rVar.mo96885a(call, a);
            }
            C41880d0 a2 = aVar.mo97008a(b2);
            if (a != null) {
                boolean z = false;
                if (a2 != null && a2.mo96747q() == 304) {
                    z = true;
                }
                if (!z) {
                    C41884e0 a3 = a.mo96739a();
                    if (a3 != null) {
                        C42197d.m122547m(a3);
                    }
                } else {
                    C41880d0.C41881a Q = a.mo96736Q();
                    C42369a aVar2 = f99610a;
                    Q.mo96771l(aVar2.m122885c(a.mo96753w(), a2.mo96753w())).mo96779t(a2.mo96743f0()).mo96777r(a2.mo96740a0()).mo96765d(aVar2.m122888f(a)).mo96774o(aVar2.m122888f(a2)).mo96764c();
                    C41884e0 a4 = a2.mo96739a();
                    C41536l.m120486f(a4);
                    a4.close();
                    C41536l.m120486f((Object) null);
                    throw null;
                }
            }
            C41536l.m120486f(a2);
            C41880d0.C41881a Q2 = a2.mo96736Q();
            C42369a aVar3 = f99610a;
            return Q2.mo96765d(aVar3.m122888f(a)).mo96774o(aVar3.m122888f(a2)).mo96764c();
        }
    }
}
