package v20;

import a30.C19151a;
import g91.C32289b0;
import g91.C32343x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n20.C26359a;
import p366bk.C10320i;
import p812kv.C25779b;
import p812kv.C25780c;
import p832mv.C26305b;
import p891su.C28267d;
import w10.C29190a;
import w20.C29192a;
import y20.C29889a;
import y20.C29890b;

/* renamed from: v20.a */
public final class C28983a {
    /* renamed from: a */
    private final C29192a.C29193a m88693a(C25779b bVar) {
        return new C29192a.C29193a(bVar.mo64381a());
    }

    /* renamed from: b */
    private final List m88694b(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25780c cVar = (C25780c) it.next();
            arrayList.add(new C19151a(cVar.mo64398c(), cVar.mo64402f(), cVar.mo64397b(), cVar.mo64396a(), C32289b0.m95093e(cVar.mo64399d()), cVar.mo64400e()));
        }
        return arrayList;
    }

    /* renamed from: c */
    private final C29192a.C29197e m88695c(C25779b bVar) {
        return new C29192a.C29197e(bVar.mo64389h().size());
    }

    /* renamed from: e */
    private final C29192a.C29194b m88696e(C25779b bVar) {
        return new C29192a.C29194b(bVar.mo64382b(), bVar.mo64388g(), bVar.mo64383c(), !bVar.mo64387f().isEmpty(), bVar.mo64391i());
    }

    /* renamed from: f */
    private final C29192a.C29198f m88697f(C26305b.C26306a aVar, boolean z) {
        boolean z2;
        String str;
        String str2;
        String o = aVar.mo65477h().mo67859o();
        if (o == null || o.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str = aVar.mo65477h().mo67858n();
        } else {
            str = aVar.mo65477h().mo67859o();
        }
        String str3 = str;
        String a = aVar.mo65470a();
        String a2 = C26359a.m82388a(aVar.mo65477h());
        if (a2 == null) {
            a2 = "";
        }
        String str4 = a2;
        String b = C29190a.m89130b(aVar.mo65477h());
        int a3 = C29190a.m89129a(aVar.mo65477h());
        double c = aVar.mo65472c();
        double i = m88700i(aVar);
        C26305b.C26308c d = aVar.mo65473d();
        C28267d d2 = aVar.mo65477h().mo67846d();
        if (d2 != null) {
            str2 = d2.mo67880b();
        } else {
            str2 = null;
        }
        return new C29192a.C29198f(a, str4, str3, b, a3, c, i, z, d, C41536l.m120484d(str2, "BAGAGE22"));
    }

    /* renamed from: g */
    private final C29192a.C29198f m88698g(C26305b.C26307b bVar, boolean z) {
        return new C29192a.C29198f(bVar.mo65470a(), bVar.mo65482h(), bVar.mo65484i(), (String) null, C10320i.ic_money_request_receiver_phone, bVar.mo65472c(), m88700i(bVar), z, bVar.mo65473d(), false);
    }

    /* renamed from: h */
    private final List m88699h(C25779b bVar) {
        C29192a.C29198f fVar;
        List<C26305b> h = bVar.mo64389h();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(h, 10));
        for (C26305b bVar2 : h) {
            boolean z = true;
            if (bVar.mo64389h().size() != 1) {
                z = false;
            }
            if (bVar2 instanceof C26305b.C26306a) {
                fVar = m88697f((C26305b.C26306a) bVar2, z);
            } else if (bVar2 instanceof C26305b.C26307b) {
                fVar = m88698g((C26305b.C26307b) bVar2, z);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(fVar);
        }
        return arrayList;
    }

    /* renamed from: i */
    private final double m88700i(C26305b bVar) {
        if (bVar.mo65473d() == C26305b.C26308c.f66669f) {
            return bVar.mo65471b();
        }
        return bVar.mo65474e();
    }

    /* renamed from: d */
    public final C29890b mo68823d(C25779b bVar) {
        C41536l.m120489i(bVar, "request");
        return new C29890b(m88696e(bVar), m88694b(bVar.mo64387f()), m88695c(bVar), m88699h(bVar), m88693a(bVar), new C29889a(bVar.mo64391i(), C32343x.m95388F(bVar.mo64392j(), new Object[0]), false, 4, (DefaultConstructorMarker) null));
    }
}
