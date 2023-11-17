package fm0;

import em0.C20268a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ul0.C28880g;

/* renamed from: fm0.a */
public final class C20543a {
    /* renamed from: a */
    public final List mo49065a(List list, boolean z) {
        List list2 = list;
        C41536l.m120489i(list2, "source");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28880g gVar = (C28880g) it.next();
            String h = gVar.mo68642h();
            String i = gVar.mo68644i();
            String j = gVar.mo68645j();
            double e = gVar.mo68638e();
            String f = gVar.mo68640f();
            List a = gVar.mo68634a();
            if (a == null) {
                a = C41341q.m119907j();
            }
            Iterator it2 = it;
            C20268a.C20273e eVar = r3;
            C20268a.C20273e eVar2 = new C20268a.C20273e(h, i, j, e, f, a, gVar.mo68641g(), gVar.mo68635b(), gVar.mo68646k(), gVar.mo68636c(), gVar.mo68637d(), z);
            arrayList.add(eVar);
            it = it2;
        }
        return arrayList;
    }
}
