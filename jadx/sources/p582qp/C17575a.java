package p582qp;

import fd0.C20463a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel;
import p469io.C15708a;
import p469io.C15709b;
import p469io.C15710c;
import p596rp.C17710a;
import p596rp.C17711b;
import p596rp.C17712c;
import p596rp.C17713d;

/* renamed from: qp.a */
public final class C17575a {
    /* renamed from: c */
    private final C17710a m61145c(C15708a aVar) {
        return new C17710a(aVar.mo43060f(), aVar.mo43061g(), aVar.mo43062h(), aVar.mo43064i(), aVar.mo43065j(), aVar.mo43066k(), aVar.mo43067l(), aVar.mo43068m(), aVar.mo43069n(), aVar.mo43070o(), Long.valueOf(aVar.mo43071p()), aVar.mo43072q(), aVar.mo43073r(), aVar.mo43074s(), aVar.mo43075t());
    }

    /* renamed from: d */
    private final C17711b m61146d(C15709b bVar) {
        C17710a aVar;
        C15708a c = bVar.mo43078c();
        if (c != null) {
            aVar = m61145c(c);
        } else {
            aVar = null;
        }
        C17710a aVar2 = aVar;
        List f = m61147f(bVar);
        long f2 = bVar.mo43082f();
        String g = bVar.mo43083g();
        Double h = bVar.mo43084h();
        String i = bVar.mo43086i();
        String j = bVar.mo43087j();
        String o = bVar.mo43092o();
        String p = bVar.mo43093p();
        C15710c q = bVar.mo43094q();
        int s = bVar.mo43096s();
        return new C17711b(aVar2, f, Long.valueOf(f2), g, h, i, j, o, p, q, bVar.mo43079d(), bVar.mo43089l(), Integer.valueOf(s), bVar.mo43080e(), bVar.mo43090m());
    }

    /* renamed from: f */
    private final List m61147f(C15709b bVar) {
        ArrayList arrayList = new ArrayList();
        String str = "";
        if (bVar.mo43089l() != null) {
            Double l = bVar.mo43089l();
            C41536l.m120486f(l);
            double doubleValue = l.doubleValue();
            String m = bVar.mo43090m();
            if (m == null) {
                m = str;
            }
            arrayList.add(new C17713d(doubleValue, m, C17712c.MONTHLY));
        }
        if (bVar.mo43079d() != null) {
            Double d = bVar.mo43079d();
            C41536l.m120486f(d);
            double doubleValue2 = d.doubleValue();
            String e = bVar.mo43080e();
            if (e != null) {
                str = e;
            }
            arrayList.add(new C17713d(doubleValue2, str, C17712c.ANNUAL));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final FinancialInfoLookupUiModel mo45107a(C20463a aVar) {
        C41536l.m120489i(aVar, "lookup");
        return new FinancialInfoLookupUiModel(aVar.mo49001a(), aVar.mo49003c());
    }

    /* renamed from: b */
    public final List mo45108b(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m61146d((C15709b) it.next()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List mo45109e(List list) {
        C41536l.m120489i(list, "lookups");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo45107a((C20463a) it.next()));
        }
        return arrayList;
    }
}
