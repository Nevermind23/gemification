package eu0;

import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.StarsGuideUiModel;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.SubProductUiModel;
import yt0.C40061b;
import yt0.C40064e;

/* renamed from: eu0.b */
public final class C31814b {
    /* renamed from: a */
    public final List mo72254a(List list) {
        ArrayList arrayList;
        List list2 = list;
        C41536l.m120489i(list2, "starsGuideProducts");
        int i = 10;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C40061b bVar = (C40061b) it.next();
            String e = bVar.mo93959e();
            String d = bVar.mo93958d();
            C24978b h = bVar.mo93963h();
            C31812a a = C31812a.f78434f.mo72253a(bVar.mo93957c());
            int f = bVar.mo93961f();
            C24978b b = bVar.mo93956b();
            int g = bVar.mo93962g();
            List<C40064e> a2 = bVar.mo93955a();
            if (a2 != null) {
                ArrayList arrayList3 = new ArrayList(C41343r.m119925u(a2, i));
                for (C40064e eVar : a2) {
                    arrayList3.add(new SubProductUiModel(eVar.mo93991a(), eVar.mo93992b(), eVar.mo93994d(), eVar.mo93993c()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            arrayList2.add(new StarsGuideUiModel(e, d, h, a, f, b, g, arrayList));
            i = 10;
        }
        return arrayList2;
    }
}
