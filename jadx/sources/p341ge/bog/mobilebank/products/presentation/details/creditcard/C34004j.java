package p341ge.bog.mobilebank.products.presentation.details.creditcard;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37614q;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d;

/* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.j */
public abstract class C34004j {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final List m100022b(C34007l lVar) {
        ArrayList arrayList = new ArrayList();
        C37614q.m110615a(arrayList, lVar.mo82278n());
        C37614q.m110615a(arrayList, lVar.mo82274j());
        C37614q.m110615a(arrayList, lVar.mo82265c());
        C37614q.m110615a(arrayList, lVar.mo82270g());
        C37614q.m110615a(arrayList, lVar.mo82269f());
        C37614q.m110615a(arrayList, lVar.mo82277m());
        C37614q.m110615a(arrayList, lVar.mo82267e());
        C37614q.m110615a(arrayList, lVar.mo82266d());
        Boolean k = lVar.mo82275k();
        Boolean bool = Boolean.TRUE;
        if (C41536l.m120484d(k, bool)) {
            arrayList.add(C33950d.C33963m.f82610a);
            arrayList.add(C33950d.C33964n.f82611a);
        } else if (C41536l.m120484d(lVar.mo82276l(), bool)) {
            arrayList.add(C33950d.C33963m.f82610a);
            arrayList.add(C33950d.C33965o.f82612a);
        } else {
            Boolean k2 = lVar.mo82275k();
            Boolean bool2 = Boolean.FALSE;
            if (C41536l.m120484d(k2, bool2) && C41536l.m120484d(lVar.mo82276l(), bool2)) {
                arrayList.add(C33950d.C33963m.f82610a);
                if (lVar.mo82273i().isEmpty()) {
                    arrayList.add(C33950d.C33956f.f82587a);
                } else {
                    arrayList.addAll(lVar.mo82273i());
                    arrayList.add(C33950d.C33953c.f82579a);
                }
            }
        }
        if (!lVar.mo82271h().isEmpty()) {
            arrayList.add(C33950d.C33959i.f82593a);
            arrayList.addAll(lVar.mo82271h());
        }
        return arrayList;
    }
}
