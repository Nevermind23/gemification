package p554op;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p455ho.C15555h;
import p554op.C17298c;
import p568pp.C17471a;

/* renamed from: op.t */
public final class C17329t {
    /* renamed from: a */
    public final List mo44741a(List list, List list2) {
        List list3;
        Object obj;
        C41536l.m120489i(list, "becomeSolo");
        C41536l.m120489i(list2, "packageBenefits");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List<C15555h> list4 = (List) it.next();
            if (list4 != null) {
                list3 = new ArrayList();
                for (C15555h hVar : list4) {
                    if (hVar.mo42751b() != null && hVar.mo42758h() != null && hVar.mo42760i() != null) {
                        obj = new C17298c.C17299a(hVar.mo42751b(), hVar.mo42758h(), hVar.mo42760i());
                    } else if (hVar.mo42751b() != null && hVar.mo42758h() != null && hVar.mo42753d() != null) {
                        obj = new C17298c.C17302d(hVar.mo42751b(), hVar.mo42758h(), hVar.mo42753d());
                    } else if (hVar.mo42751b() == null || (hVar.mo42758h() == null && hVar.mo42760i() == null)) {
                        obj = null;
                    } else {
                        String b = hVar.mo42751b();
                        String h = hVar.mo42758h();
                        if (h == null) {
                            h = hVar.mo42760i();
                        }
                        obj = new C17298c.C17301c(b, h);
                    }
                    if (obj != null) {
                        list3.add(obj);
                    }
                }
            } else {
                list3 = C41341q.m119907j();
            }
            arrayList2.add(new C17304d(list3, false));
        }
        arrayList.addAll(arrayList2);
        if (!list.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C17471a aVar = (C17471a) it2.next();
                arrayList3.add(new C17298c.C17300b(aVar.mo44977c(), aVar.mo44975a(), aVar.mo44976b()));
            }
            arrayList.addAll(C41339p.m119900e(new C17304d(arrayList3, true)));
        }
        return arrayList;
    }
}
