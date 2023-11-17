package m50;

import g91.C32303f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import l50.C25826f;
import l50.C25827g;
import l50.C25828h;
import l50.C25829i;
import l50.C25830j;
import l50.C25831k;
import l50.C25832l;
import l50.C25835o;
import l50.C25836p;
import l50.C25837q;
import l50.C25838r;
import l50.C25840t;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p863pw.C27623a;
import p863pw.C27624b;
import p863pw.C27625c;
import p863pw.C27626d;
import p863pw.C27627e;
import p863pw.C27628f;
import p863pw.C27629g;
import p863pw.C27630h;
import p863pw.C27632j;
import p863pw.C27633k;
import p863pw.C27635m;
import r90.C27950a;

/* renamed from: m50.b */
public final class C26144b {

    /* renamed from: a */
    private final C26146d f66268a;

    public C26144b(C26146d dVar) {
        C41536l.m120489i(dVar, "cardsUIModelDataMapper");
        this.f66268a = dVar;
    }

    /* renamed from: a */
    public final C25826f mo65060a(C27625c cVar) {
        C41536l.m120489i(cVar, "summary");
        return new C25826f(cVar.mo67029a(), cVar.mo67030b());
    }

    /* renamed from: b */
    public final C25827g mo65061b(C27624b bVar) {
        C41536l.m120489i(bVar, "summary");
        return new C25827g(bVar.mo67024a(), bVar.mo67025b());
    }

    /* renamed from: c */
    public final C25828h mo65062c(C27626d dVar) {
        C41536l.m120489i(dVar, "data");
        BigDecimal d = dVar.mo67037d();
        List<C27629g> f = dVar.mo67040f();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(f, 10));
        for (C27629g j : f) {
            arrayList.add(mo65069j(j));
        }
        List<C27624b> b = dVar.mo67035b();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(b, 10));
        for (C27624b b2 : b) {
            arrayList2.add(mo65061b(b2));
        }
        List<C27628f> e = dVar.mo67038e();
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(e, 10));
        for (C27628f e2 : e) {
            arrayList3.add(mo65064e(e2));
        }
        return new C25828h(0, d, arrayList, arrayList2, arrayList3);
    }

    /* renamed from: d */
    public final C25829i mo65063d(C27627e eVar) {
        C41536l.m120489i(eVar, "data");
        return new C25829i(eVar.mo67043a(), eVar.mo67047e(), eVar.mo67049f(), eVar.mo67046d(), eVar.mo67045c(), eVar.mo67044b());
    }

    /* renamed from: e */
    public final C25830j mo65064e(C27628f fVar) {
        C41536l.m120489i(fVar, "data");
        return new C25830j(fVar.mo67052a().doubleValue(), fVar.mo67054c(), fVar.mo67055d(), fVar.mo67053b());
    }

    /* renamed from: f */
    public final C25831k mo65065f(C27630h hVar) {
        C41536l.m120489i(hVar, "summary");
        return new C25831k(hVar.mo67069a(), hVar.mo67070b(), hVar.mo67071c());
    }

    /* renamed from: g */
    public final C25832l mo65066g(C27623a aVar, Map map) {
        boolean z;
        List list;
        boolean z2;
        String str;
        String str2;
        C25828h hVar;
        C41536l.m120489i(aVar, "account");
        C41536l.m120489i(map, "cards");
        long b = aVar.mo67002b();
        long j = aVar.mo67012j();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getKey()).longValue() != aVar.mo67002b()) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List<C27635m> list2 = (List) C41358y.m120008X(linkedHashMap.values());
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
            for (C27635m k : list2) {
                arrayList.add(mo65070k(k));
            }
            list = arrayList;
        } else {
            list = C41341q.m119907j();
        }
        String c = aVar.mo67003c();
        String c2 = aVar.mo67003c();
        if (c2 == null || C40439w.m117118v(c2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            str = aVar.mo67003c();
        } else {
            str = C27950a.m86286c(aVar.mo67016n(), false);
        }
        String str3 = str;
        String c3 = aVar.mo67003c();
        if (c3 != null && !C40439w.m117118v(c3)) {
            z = false;
        }
        if (!z) {
            str2 = aVar.mo67003c();
        } else {
            str2 = C27950a.m86287d(aVar.mo67016n(), false, 2, (Object) null);
        }
        String str4 = str2;
        String l = aVar.mo67014l();
        String g = aVar.mo67008g();
        String h = aVar.mo67009h();
        double doubleValue = aVar.mo67007f().doubleValue();
        boolean s = aVar.mo67021s();
        boolean t = aVar.mo67022t();
        String e = aVar.mo67005e();
        String m = aVar.mo67015m();
        String p = aVar.mo67018p();
        List o = aVar.mo67017o();
        String n = aVar.mo67016n();
        boolean r = aVar.mo67020r();
        long q = aVar.mo67019q();
        boolean i = aVar.mo67011i();
        boolean equals = "UNIVERSAL".equals(aVar.mo67015m());
        C27626d a = aVar.mo67001a();
        if (a != null) {
            hVar = mo65062c(a);
        } else {
            hVar = null;
        }
        return new C25832l(b, j, list, c, str3, str4, l, g, h, doubleValue, s, t, e, m, p, o, n, r, q, i, equals, hVar);
    }

    /* renamed from: h */
    public final C25835o mo65067h(C27632j jVar, Map map) {
        C41536l.m120489i(jVar, "accountsEntity");
        C41536l.m120489i(map, "cards");
        C25826f a = mo65060a(jVar.mo67083c());
        List<C27630h> b = jVar.mo67082b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C27630h f : b) {
            arrayList.add(mo65065f(f));
        }
        List<C27623a> a2 = jVar.mo67081a();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(a2, 10));
        for (C27623a g : a2) {
            arrayList2.add(mo65066g(g, map));
        }
        return new C25835o(a, arrayList, arrayList2);
    }

    /* renamed from: i */
    public final C25836p mo65068i(C27633k kVar) {
        C41536l.m120489i(kVar, "accountsWithCards");
        C25836p pVar = new C25836p(mo65067h(kVar.mo67087a(), kVar.mo67088b()));
        ProductProperties.cardsAndDetailsUIModel = pVar;
        return pVar;
    }

    /* renamed from: j */
    public final C25837q mo65069j(C27629g gVar) {
        String str;
        C25829i iVar;
        C41536l.m120489i(gVar, "data");
        long a = gVar.mo67059a();
        BigDecimal g = gVar.mo67066g();
        if (gVar.mo67066g() == null) {
            str = "";
        } else {
            str = C32303f.m95204o(gVar.mo67066g().doubleValue()) + C32303f.m95198i(gVar.mo67061c(), true);
        }
        String str2 = str;
        String c = gVar.mo67061c();
        boolean d = gVar.mo67062d();
        if (gVar.mo67063e() != null) {
            iVar = mo65063d(gVar.mo67063e());
        } else {
            iVar = null;
        }
        return new C25837q(a, g, str2, c, d, iVar);
    }

    /* renamed from: k */
    public final C25838r mo65070k(C27635m mVar) {
        C41536l.m120489i(mVar, "data");
        return this.f66268a.mo65074b(mVar);
    }

    /* renamed from: l */
    public final C25840t mo65071l(C27633k kVar, boolean z, boolean z2) {
        C41536l.m120489i(kVar, "accountsWithCards");
        C25840t tVar = new C25840t(mo65067h(kVar.mo67087a(), kVar.mo67088b()), z, z2);
        ProductProperties.cardsAndDetailsUIModel = new C25836p(mo65067h(kVar.mo67087a(), kVar.mo67088b()));
        return tVar;
    }
}
