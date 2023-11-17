package m50;

import g91.C32359z0;
import hd0.C24978b;
import he1.C41224m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import l50.C25838r;
import l50.C25839s;
import l50.C25841u;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p863pw.C27635m;
import p863pw.C27636n;
import p863pw.C27637o;
import r90.C27950a;

/* renamed from: m50.d */
public final class C26146d {
    /* renamed from: a */
    public final C41224m mo65073a(Map.Entry entry) {
        C41536l.m120489i(entry, "entity");
        Object key = entry.getKey();
        Iterable<C27635m> iterable = (Iterable) entry.getValue();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
        for (C27635m b : iterable) {
            arrayList.add(mo65074b(b));
        }
        return new C41224m(key, arrayList);
    }

    /* renamed from: b */
    public final C25838r mo65074b(C27635m mVar) {
        boolean z;
        String str;
        boolean z2;
        C25841u uVar;
        C41536l.m120489i(mVar, "cardsAndDetails");
        long u = mVar.mo67138u();
        long j = mVar.mo67126j();
        long a = mVar.mo67115a();
        long p = mVar.mo67132p();
        String c = mVar.mo67117c();
        String l = mVar.mo67128l();
        String l2 = mVar.mo67128l();
        if (l2 == null || C40439w.m117118v(l2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = mVar.mo67128l();
        } else {
            str = C27950a.m86287d(mVar.mo67141x(), false, 2, (Object) null);
        }
        String o = mVar.mo67131o();
        String A = mVar.mo67101A();
        String E = mVar.mo67105E();
        String F = mVar.mo67106F();
        String D = mVar.mo67104D();
        String w = mVar.mo67140w();
        String i = mVar.mo67125i();
        long r = mVar.mo67134r();
        String m = mVar.mo67129m();
        String g = mVar.mo67122g();
        String h = mVar.mo67123h();
        String B = mVar.mo67102B();
        if (mVar.mo67111K() == C24978b.YES) {
            z2 = true;
        } else {
            z2 = false;
        }
        long C = mVar.mo67103C();
        long G = mVar.mo67107G();
        C24978b J = mVar.mo67110J();
        C24978b L = mVar.mo67112L();
        C24978b H = mVar.mo67108H();
        C24978b I = mVar.mo67109I();
        String b = mVar.mo67116b();
        String x = mVar.mo67141x();
        String y = mVar.mo67142y();
        Object k = mVar.mo67127k();
        boolean M = mVar.mo67113M();
        String q = mVar.mo67133q();
        String z3 = mVar.mo67143z();
        String str2 = o;
        String Q = C32359z0.m95546Q(mVar.mo67134r(), "dd/MM/yyyy");
        C27636n v = mVar.mo67139v();
        if (v != null) {
            uVar = mo65076d(v);
        } else {
            uVar = null;
        }
        boolean N = mVar.mo67114N();
        String Q2 = C32359z0.m95546Q(mVar.mo67134r(), "MM/yy");
        boolean e = mVar.mo67119e();
        String n = mVar.mo67130n();
        CardExternalFile s = mVar.mo67135s();
        CardExternalFile f = mVar.mo67121f();
        boolean t = mVar.mo67136t();
        String d = mVar.mo67118d();
        C41536l.m120488h(Q, "getFormattedDate(\n      …_FORMAT\n                )");
        C41536l.m120488h(Q2, "getFormattedDate(\n      …T_SHORT\n                )");
        return new C25838r(u, j, a, p, c, l, str, str2, A, E, F, D, w, i, r, m, g, h, B, z2, C, G, J, L, H, I, b, x, y, k, M, q, z3, Q, uVar, N, Q2, e, n, f, s, t, d);
    }

    /* renamed from: c */
    public final C25839s mo65075c(C27637o oVar) {
        C41536l.m120489i(oVar, "cardsAndDetails");
        Set<Map.Entry> entrySet = oVar.mo67167a().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(entrySet, 10)), 16));
        for (Map.Entry a : entrySet) {
            C41224m a2 = mo65073a(a);
            linkedHashMap.put(a2.mo95678e(), a2.mo95680f());
        }
        return new C25839s(linkedHashMap);
    }

    /* renamed from: d */
    public final C25841u mo65076d(C27636n nVar) {
        C41536l.m120489i(nVar, "insSecCard");
        return new C25841u(nVar.mo67146c(), nVar.mo67144a(), nVar.mo67147d(), nVar.mo67164s(), nVar.mo67159n(), nVar.mo67150f(), nVar.mo67155j(), nVar.mo67156k(), nVar.mo67157l(), nVar.mo67158m(), nVar.mo67154i(), nVar.mo67162q(), nVar.mo67160o(), nVar.mo67148e(), nVar.mo67163r(), nVar.mo67165t(), nVar.mo67151g(), nVar.mo67152h(), nVar.mo67145b());
    }
}
