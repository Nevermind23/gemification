package xl0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ml0.C26247a;
import ml0.C26254g;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.model.PolicyDetailsUiModel;

/* renamed from: xl0.a */
public abstract class C29817a {
    /* renamed from: a */
    public static final PolicyDetailsUiModel m90578a(C26254g gVar) {
        C41536l.m120489i(gVar, "<this>");
        long d = gVar.mo65322d();
        long b = gVar.mo65320b();
        String u = gVar.mo65342u();
        String s = gVar.mo65339s();
        String p = gVar.mo65336p();
        BigDecimal e = gVar.mo65323e();
        String f = gVar.mo65325f();
        BigDecimal g = gVar.mo65326g();
        String h = gVar.mo65327h();
        Date r = gVar.mo65338r();
        Date n = gVar.mo65334n();
        Long o = gVar.mo65335o();
        String i = gVar.mo65329i();
        String k = gVar.mo65331k();
        String j = gVar.mo65330j();
        String l = gVar.mo65332l();
        String m = gVar.mo65333m();
        Boolean a = gVar.mo65319a();
        String t = gVar.mo65340t();
        String w = gVar.mo65344w();
        String v = gVar.mo65343v();
        String q = gVar.mo65337q();
        List c = gVar.mo65321c();
        ArrayList<C26247a> arrayList = new ArrayList<>();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Long l2 = o;
            Object next = it.next();
            Iterator it2 = it;
            Date date = n;
            if (C41536l.m120484d(((C26247a) next).mo65267b(), "PHONE")) {
                arrayList.add(next);
            }
            it = it2;
            o = l2;
            n = date;
        }
        Date date2 = n;
        Long l3 = o;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26247a a2 : arrayList) {
            arrayList2.add(a2.mo65266a());
        }
        return new PolicyDetailsUiModel(d, b, u, s, p, e, f, g, h, r, date2, l3, i, k, j, l, m, a, t, w, v, q, arrayList2);
    }
}
