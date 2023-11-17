package p853ow;

import g91.C32343x;
import hd0.C24978b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import m70.C26148a;
import m70.C26149b;
import m70.C26150c;
import m70.C26151d;
import m70.C26152e;
import m70.C26153f;
import m70.C26154g;
import m70.C26155h;
import m70.C26156i;
import o70.C26763b;
import o70.C26765d;
import o70.C26766e;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p863pw.C27623a;
import p863pw.C27624b;
import p863pw.C27625c;
import p863pw.C27626d;
import p863pw.C27627e;
import p863pw.C27628f;
import p863pw.C27629g;
import p863pw.C27630h;
import p863pw.C27631i;
import p863pw.C27632j;
import p863pw.C27635m;
import p863pw.C27636n;
import p863pw.C27637o;
import q70.C27685a;
import q70.C27686b;

/* renamed from: ow.a */
public final class C27092a {
    /* renamed from: a */
    private final C24978b m83983a(boolean z) {
        return C24978b.m79846b(Boolean.valueOf(z));
    }

    /* renamed from: c */
    private final CardExternalFile m83984c(C26763b bVar) {
        return new CardExternalFile(bVar.mo65984a(), bVar.mo65987d(), bVar.mo65986c());
    }

    /* renamed from: d */
    private final C27623a m83985d(C26148a aVar) {
        C27626d dVar;
        long b = aVar.mo65087b();
        String c = aVar.mo65088c();
        String w = aVar.mo65111w();
        BigDecimal g = aVar.mo65093g();
        BigDecimal d = aVar.mo65089d();
        String h = aVar.mo65094h();
        int m = aVar.mo65100m();
        String x = aVar.mo65112x();
        String y = aVar.mo65113y();
        String C = aVar.mo65081C();
        String i = aVar.mo65096i();
        long l = aVar.mo65099l();
        String A = aVar.mo65079A();
        long B = aVar.mo65080B();
        boolean F = aVar.mo65084F();
        boolean G = aVar.mo65085G();
        Long e = aVar.mo65090e();
        BigDecimal n = aVar.mo65101n();
        boolean D = aVar.mo65082D();
        String E = aVar.mo65083E();
        boolean k = aVar.mo65098k();
        boolean r = aVar.mo65105r();
        boolean o = aVar.mo65102o();
        boolean s = aVar.mo65106s();
        boolean p = aVar.mo65103p();
        boolean t = aVar.mo65107t();
        boolean u = aVar.mo65109u();
        boolean q = aVar.mo65104q();
        List z = aVar.mo65114z();
        String f = aVar.mo65092f();
        Long v = aVar.mo65110v();
        String j = aVar.mo65097j();
        C26150c a = aVar.mo65086a();
        String str = A;
        if (a != null) {
            dVar = m83987f(a);
        } else {
            dVar = null;
        }
        return new C27623a(b, c, w, g, d, h, m, x, y, C, i, l, str, B, F, G, e, n, D, E, k, r, o, s, p, t, u, q, z, f, v, j, dVar);
    }

    /* renamed from: e */
    private final C27624b m83986e(C26149b bVar) {
        return new C27624b(bVar.mo65115a(), bVar.mo65116b());
    }

    /* renamed from: f */
    private final C27626d m83987f(C26150c cVar) {
        String d = cVar.mo65123d();
        String c = cVar.mo65122c();
        BigDecimal n = cVar.mo65135n();
        String m = cVar.mo65134m();
        String g = cVar.mo65127g();
        String l = cVar.mo65133l();
        String a = cVar.mo65120a();
        String i = cVar.mo65130i();
        String j = cVar.mo65131j();
        boolean u = cVar.mo65143u();
        C24978b a2 = m83983a(cVar.mo65140s());
        C41536l.m120488h(a2, "isCardExpiring.asYesNo()");
        String t = cVar.mo65141t();
        List<C26153f> q = cVar.mo65138q();
        String str = t;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(q, 10));
        for (C26153f i2 : q) {
            arrayList.add(m83990i(i2));
        }
        List<C26149b> f = cVar.mo65126f();
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(f, 10));
        for (C26149b e : f) {
            arrayList3.add(m83986e(e));
        }
        List<C26149b> e2 = cVar.mo65124e();
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(C41343r.m119925u(e2, 10));
        for (C26149b e3 : e2) {
            arrayList5.add(m83986e(e3));
        }
        List<C26149b> r = cVar.mo65139r();
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(C41343r.m119925u(r, 10));
        for (C26149b e4 : r) {
            arrayList7.add(m83986e(e4));
        }
        List<C26152e> p = cVar.mo65137p();
        ArrayList arrayList8 = new ArrayList(C41343r.m119925u(p, 10));
        for (C26152e h : p) {
            arrayList8.add(m83989h(h));
        }
        ArrayList arrayList9 = arrayList4;
        ArrayList arrayList10 = arrayList7;
        String str2 = str;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList8;
        return new C27626d(d, c, n, m, g, l, a, i, j, u, a2, str2, arrayList2, arrayList9, arrayList11, arrayList10, arrayList12, cVar.mo65136o(), cVar.mo65132k(), cVar.mo65128h());
    }

    /* renamed from: g */
    private final C27627e m83988g(C26151d dVar) {
        return new C27627e(dVar.mo65144a(), C32343x.m95463l(dVar.mo65151g()), Double.valueOf(dVar.mo65152h()), Double.valueOf(dVar.mo65150f()), Double.valueOf(dVar.mo65148e()), Long.valueOf(dVar.mo65145b()));
    }

    /* renamed from: h */
    private final C27628f m83989h(C26152e eVar) {
        return new C27628f(eVar.mo65155a(), eVar.mo65156b(), Double.valueOf(eVar.mo65157c()), Double.valueOf(eVar.mo65158d()));
    }

    /* renamed from: i */
    private final C27629g m83990i(C26153f fVar) {
        C27627e eVar;
        long a = fVar.mo65165a();
        String g = fVar.mo65172g();
        BigDecimal b = fVar.mo65166b();
        BigDecimal h = fVar.mo65173h();
        String c = fVar.mo65167c();
        boolean d = fVar.mo65168d();
        Long f = fVar.mo65171f();
        C26151d e = fVar.mo65169e();
        if (e != null) {
            eVar = m83988g(e);
        } else {
            eVar = null;
        }
        return new C27629g(a, g, b, h, c, d, f, eVar);
    }

    /* renamed from: k */
    private final C27632j m83991k(C26155h hVar) {
        C27625c cVar = new C27625c(C32343x.m95463l(hVar.mo65184c().mo63386b()), hVar.mo65184c().mo63385a());
        List<C26148a> a = hVar.mo65182a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C26148a d : a) {
            arrayList.add(m83985d(d));
        }
        List<C26154g> b = hVar.mo65183b();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(b, 10));
        for (C26154g gVar : b) {
            arrayList2.add(new C27630h(gVar.mo65176a(), gVar.mo65177b(), gVar.mo65178c()));
        }
        return new C27632j(cVar, arrayList, arrayList2);
    }

    /* renamed from: m */
    private final C27636n m83992m(CardInsSecCardModel cardInsSecCardModel) {
        long d = cardInsSecCardModel.mo55706d();
        long a = cardInsSecCardModel.mo55704a();
        String e = cardInsSecCardModel.mo55708e();
        String v = cardInsSecCardModel.mo55726v();
        String q = cardInsSecCardModel.mo55720q();
        String g = cardInsSecCardModel.mo55711g();
        String k = cardInsSecCardModel.mo55716k();
        Long l = cardInsSecCardModel.mo55717l();
        String m = cardInsSecCardModel.mo55718m();
        String p = cardInsSecCardModel.mo55719p();
        C24978b a2 = m83983a(cardInsSecCardModel.mo55715j());
        C24978b bVar = a2;
        C41536l.m120488h(a2, "insAllow.asYesNo()");
        C24978b a3 = m83983a(cardInsSecCardModel.mo55723t());
        C24978b bVar2 = a3;
        C41536l.m120488h(a3, "sec3D.asYesNo()");
        String r = cardInsSecCardModel.mo55721r();
        C24978b a4 = m83983a(cardInsSecCardModel.mo55710f());
        C24978b bVar3 = a4;
        C41536l.m120488h(a4, "dgPassYN.asYesNo()");
        C24978b a5 = m83983a(cardInsSecCardModel.mo55725u());
        C24978b a6 = m83983a(cardInsSecCardModel.mo55727w());
        C24978b bVar4 = a6;
        C41536l.m120488h(a6, "isScoolcard.asYesNo()");
        String h = cardInsSecCardModel.mo55712h();
        C24978b a7 = m83983a(cardInsSecCardModel.mo55714i());
        C41536l.m120488h(a7, "digipassAllow.asYesNo()");
        return new C27636n(d, a, e, v, q, g, k, l, m, p, bVar, bVar2, r, bVar3, a5, bVar4, h, a7, cardInsSecCardModel.mo55705b(), cardInsSecCardModel.mo55722s());
    }

    /* renamed from: b */
    public final ProductType mo66372b(C27686b bVar) {
        String str;
        C41536l.m120489i(bVar, "type");
        C27685a a = bVar.mo67222a();
        if (a != null) {
            str = a.mo67221b();
        } else {
            str = null;
        }
        return new ProductType((String) null, str, bVar.mo67223b());
    }

    /* renamed from: j */
    public final C27631i mo66373j(C26156i iVar) {
        C41536l.m120489i(iVar, "accounts");
        C27632j k = m83991k(iVar.mo65188a());
        List<C26150c> b = iVar.mo65189b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C26150c f : b) {
            arrayList.add(m83987f(f));
        }
        List<C26151d> c = iVar.mo65190c();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(c, 10));
        for (C26151d g : c) {
            arrayList2.add(m83988g(g));
        }
        return new C27631i(k, arrayList, arrayList2);
    }

    /* renamed from: l */
    public final C27635m mo66374l(C26765d dVar) {
        C27636n nVar;
        CardExternalFile cardExternalFile;
        CardExternalFile cardExternalFile2;
        C41536l.m120489i(dVar, "card");
        long x = dVar.mo66045x();
        long j = dVar.mo66030j();
        long a = dVar.mo66019a();
        long q = dVar.mo66037q();
        String c = dVar.mo66021c();
        String l = dVar.mo66032l();
        String p = dVar.mo66036p();
        String F = dVar.mo66001F();
        String J = dVar.mo66005J();
        String K = dVar.mo66006K();
        String I = dVar.mo66004I();
        String z = dVar.mo66047z();
        String i = dVar.mo66029i();
        long u = dVar.mo66042u();
        String n = dVar.mo66034n();
        String g = dVar.mo66026g();
        String h = dVar.mo66027h();
        String G = dVar.mo66002G();
        C24978b a2 = m83983a(dVar.mo66014S());
        long H = dVar.mo66003H();
        long L = dVar.mo66007L();
        C24978b a3 = m83983a(dVar.mo66013R());
        C24978b a4 = m83983a(dVar.mo66016U());
        C24978b bVar = a3;
        C24978b a5 = m83983a(dVar.mo66011P());
        C24978b a6 = m83983a(dVar.mo66012Q());
        String b = dVar.mo66020b();
        String A = dVar.mo65996A();
        String B = dVar.mo65997B();
        Object k = dVar.mo66031k();
        boolean V = dVar.mo66017V();
        String t = dVar.mo66040t();
        String E = dVar.mo66000E();
        C24978b bVar2 = a6;
        CardInsSecCardModel y = dVar.mo66046y();
        if (y != null) {
            nVar = m83992m(y);
        } else {
            nVar = null;
        }
        boolean W = dVar.mo66018W();
        boolean e = dVar.mo66023e();
        String o = dVar.mo66035o();
        C26763b f = dVar.mo66025f();
        if (f != null) {
            cardExternalFile = m83984c(f);
        } else {
            cardExternalFile = null;
        }
        C26763b v = dVar.mo66043v();
        if (v != null) {
            cardExternalFile2 = m83984c(v);
        } else {
            cardExternalFile2 = null;
        }
        String d = dVar.mo66022d();
        boolean D = dVar.mo65999D();
        boolean w = dVar.mo66044w();
        String r = dVar.mo66038r();
        C24978b bVar3 = bVar;
        String str = F;
        C24978b bVar4 = a5;
        String str2 = p;
        C24978b bVar5 = bVar2;
        C41536l.m120488h(a2, "asYesNo()");
        C41536l.m120488h(bVar3, "asYesNo()");
        C41536l.m120488h(a4, "asYesNo()");
        C41536l.m120488h(bVar4, "asYesNo()");
        C41536l.m120488h(bVar5, "asYesNo()");
        return new C27635m(x, j, a, q, c, l, str2, str, J, K, r, I, z, i, u, n, g, h, G, a2, H, L, bVar3, a4, bVar4, bVar5, b, A, B, k, V, t, E, nVar, W, e, o, cardExternalFile, cardExternalFile2, d, D, w);
    }

    /* renamed from: n */
    public final C27637o mo66375n(C26766e eVar) {
        C41536l.m120489i(eVar, "cardsAndDetails");
        Map a = eVar.mo66048a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C41342q0.m119921f(a.size()));
        for (Map.Entry entry : a.entrySet()) {
            Object key = entry.getKey();
            Iterable<C26765d> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
            for (C26765d l : iterable) {
                arrayList.add(mo66374l(l));
            }
            linkedHashMap.put(key, arrayList);
        }
        return new C27637o(linkedHashMap);
    }
}
