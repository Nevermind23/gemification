package m50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l50.C25821a;
import l50.C25822b;
import l50.C25823c;
import l50.C25824d;
import l50.C25825e;
import l50.C25833m;
import l50.C25834n;
import p863pw.C27623a;
import p863pw.C27625c;
import p863pw.C27626d;
import p863pw.C27629g;
import p863pw.C27630h;
import p863pw.C27631i;
import p863pw.C27632j;
import r90.C27950a;

/* renamed from: m50.a */
public final class C26143a {
    /* renamed from: c */
    private final C25822b m81843c(C27626d dVar) {
        List<C27629g> f = dVar.mo67040f();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(f, 10));
        for (C27629g e : f) {
            arrayList.add(m81844e(e));
        }
        return new C25822b(arrayList);
    }

    /* renamed from: e */
    private final C25824d m81844e(C27629g gVar) {
        return new C25824d(gVar.mo67059a(), gVar.mo67066g(), gVar.mo67061c(), gVar.mo67065f());
    }

    /* renamed from: a */
    public final List mo65054a(List list) {
        C41536l.m120489i(list, "accounts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo65057f((C27623a) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C25821a mo65055b(C27625c cVar) {
        C41536l.m120489i(cVar, "summary");
        return new C25821a(cVar.mo67029a(), cVar.mo67030b());
    }

    /* renamed from: d */
    public final C25823c mo65056d(C27630h hVar) {
        C41536l.m120489i(hVar, "summary");
        return new C25823c(hVar.mo67069a(), hVar.mo67070b(), hVar.mo67071c());
    }

    /* renamed from: f */
    public final C25825e mo65057f(C27623a aVar) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        C25822b bVar;
        C41536l.m120489i(aVar, "account");
        long b = aVar.mo67002b();
        String c = aVar.mo67003c();
        boolean z3 = true;
        if (c == null || C40439w.m117118v(c)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = aVar.mo67003c();
        } else {
            str = C27950a.m86287d(aVar.mo67016n(), false, 2, (Object) null);
        }
        String c2 = aVar.mo67003c();
        if (c2 == null || C40439w.m117118v(c2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            str2 = aVar.mo67003c();
        } else {
            str2 = aVar.mo67014l();
        }
        String g = aVar.mo67008g();
        double doubleValue = aVar.mo67007f().doubleValue();
        boolean t = aVar.mo67022t();
        String e = aVar.mo67005e();
        String m = aVar.mo67015m();
        boolean s = aVar.mo67021s();
        String c3 = aVar.mo67003c();
        if (c3 != null && !C40439w.m117118v(c3)) {
            z3 = false;
        }
        if (z3) {
            str3 = C27950a.m86286c(aVar.mo67016n(), false);
        } else {
            str3 = aVar.mo67003c();
        }
        String str4 = str3;
        String l = aVar.mo67014l();
        String p = aVar.mo67018p();
        Long k = aVar.mo67013k();
        boolean r = aVar.mo67020r();
        List o = aVar.mo67017o();
        C27626d a = aVar.mo67001a();
        if (a != null) {
            bVar = m81843c(a);
        } else {
            bVar = null;
        }
        return new C25825e(b, str, str2, g, doubleValue, t, e, m, s, str4, l, p, k, r, o, bVar);
    }

    /* renamed from: g */
    public final C25833m mo65058g(C27632j jVar) {
        C41536l.m120489i(jVar, "accountsEntity");
        C25821a b = mo65055b(jVar.mo67083c());
        List<C27630h> b2 = jVar.mo67082b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b2, 10));
        for (C27630h d : b2) {
            arrayList.add(mo65056d(d));
        }
        List<C27623a> a = jVar.mo67081a();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a, 10));
        for (C27623a f : a) {
            arrayList2.add(mo65057f(f));
        }
        return new C25833m(b, arrayList, arrayList2);
    }

    /* renamed from: h */
    public final C25834n mo65059h(C27631i iVar) {
        C41536l.m120489i(iVar, "accountsAndDetails");
        return new C25834n(mo65058g(iVar.mo67075a()));
    }
}
