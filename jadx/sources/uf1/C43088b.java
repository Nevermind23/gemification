package uf1;

import dg1.C40677c;
import dg1.C40691m;
import java.net.ProtocolException;
import kotlin.jvm.internal.C41536l;
import of1.C41869b0;
import of1.C41872c0;
import of1.C41880d0;
import of1.C41884e0;
import of1.C41935w;
import pf1.C42197d;
import tf1.C42998c;

/* renamed from: uf1.b */
public final class C43088b implements C41935w {

    /* renamed from: a */
    private final boolean f100518a;

    public C43088b(boolean z) {
        this.f100518a = z;
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        boolean z;
        C41880d0.C41881a aVar2;
        C41880d0 d0Var;
        long j;
        C41536l.m120489i(aVar, "chain");
        C43094g gVar = (C43094g) aVar;
        C42998c g = gVar.mo101666g();
        C41536l.m120486f(g);
        C41869b0 i = gVar.mo101668i();
        C41872c0 a = i.mo96672a();
        long currentTimeMillis = System.currentTimeMillis();
        g.mo101527v(i);
        Long l = null;
        if (!C43093f.m123647a(i.mo96678g()) || a == null) {
            g.mo101521o();
            z = true;
            aVar2 = null;
        } else {
            if (C40439w.m117115s("100-continue", i.mo96675d("Expect"), true)) {
                g.mo101512f();
                aVar2 = g.mo101523q(true);
                g.mo101525s();
                z = false;
            } else {
                z = true;
                aVar2 = null;
            }
            if (aVar2 != null) {
                g.mo101521o();
                if (!g.mo101514h().mo101581w()) {
                    g.mo101520n();
                }
            } else if (a.mo96707h()) {
                g.mo101512f();
                a.mo21300j(C40691m.m117769a(g.mo101509c(i, true)));
            } else {
                C40677c a2 = C40691m.m117769a(g.mo101509c(i, false));
                a.mo21300j(a2);
                a2.close();
            }
        }
        if (a == null || !a.mo96707h()) {
            g.mo101511e();
        }
        if (aVar2 == null) {
            aVar2 = g.mo101523q(false);
            C41536l.m120486f(aVar2);
            if (z) {
                g.mo101525s();
                z = false;
            }
        }
        C41880d0 c = aVar2.mo96778s(i).mo96769j(g.mo101514h().mo101576s()).mo96779t(currentTimeMillis).mo96777r(System.currentTimeMillis()).mo96764c();
        int q = c.mo96747q();
        if (q == 100) {
            C41880d0.C41881a q2 = g.mo101523q(false);
            C41536l.m120486f(q2);
            if (z) {
                g.mo101525s();
            }
            c = q2.mo96778s(i).mo96769j(g.mo101514h().mo101576s()).mo96779t(currentTimeMillis).mo96777r(System.currentTimeMillis()).mo96764c();
            q = c.mo96747q();
        }
        g.mo101524r(c);
        if (!this.f100518a || q != 101) {
            d0Var = c.mo96736Q().mo96763b(g.mo101522p(c)).mo96764c();
        } else {
            d0Var = c.mo96736Q().mo96763b(C42197d.f99266c).mo96764c();
        }
        if (C40439w.m117115s("close", d0Var.mo96742e0().mo96675d("Connection"), true) || C40439w.m117115s("close", C41880d0.m121379v(d0Var, "Connection", (String) null, 2, (Object) null), true)) {
            g.mo101520n();
        }
        if (q == 204 || q == 205) {
            C41884e0 a3 = d0Var.mo96739a();
            if (a3 == null) {
                j = -1;
            } else {
                j = a3.mo21302o();
            }
            if (j > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(q);
                sb.append(" had non-zero Content-Length: ");
                C41884e0 a4 = d0Var.mo96739a();
                if (a4 != null) {
                    l = Long.valueOf(a4.mo21302o());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return d0Var;
    }
}
