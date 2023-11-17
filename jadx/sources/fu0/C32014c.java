package fu0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.BenefitUiModel;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.StatusBenefitsUiModel;
import yt0.C40060a;
import yt0.C40062c;

/* renamed from: fu0.c */
public final class C32014c {
    /* renamed from: a */
    public final List mo72512a(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "statusBenefits");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C40062c cVar = (C40062c) it.next();
            C32012b a = C32012b.f78812g.mo72511a(cVar.mo93968c());
            String a2 = cVar.mo93966a();
            int b = cVar.mo93967b();
            int d = cVar.mo93969d();
            List<C40060a> e = cVar.mo93970e();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(e, 10));
            for (C40060a aVar : e) {
                arrayList2.add(new BenefitUiModel(aVar.mo93948d(), aVar.mo93951f(), aVar.mo93949e(), aVar.mo93947c(), C32010a.f78803h.mo72507a(aVar.mo93946b()), aVar.mo93952g(), aVar.mo93945a()));
            }
            arrayList.add(new StatusBenefitsUiModel(a, a2, b, d, arrayList2));
        }
        return arrayList;
    }
}
