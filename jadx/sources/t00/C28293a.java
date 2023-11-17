package t00;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.model.UpcomingCommissionUIModel;
import p739dv.C20105d;

/* renamed from: t00.a */
public final class C28293a {
    /* renamed from: a */
    public final UpcomingCommissionUIModel mo67921a(C20105d dVar) {
        C41536l.m120489i(dVar, "upcomingPayment");
        BigDecimal a = dVar.mo48526a();
        C41536l.m120486f(a);
        String b = dVar.mo48527b();
        C41536l.m120486f(b);
        String e = dVar.mo48530e();
        Long d = dVar.mo48529d();
        C41536l.m120486f(d);
        return new UpcomingCommissionUIModel(a, b, e, d.longValue());
    }

    /* renamed from: b */
    public final List mo67922b(List list) {
        C41536l.m120489i(list, "payments");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67921a((C20105d) it.next()));
        }
        return arrayList;
    }
}
