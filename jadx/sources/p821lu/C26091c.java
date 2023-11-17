package p821lu;

import g91.C32300e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentDataEntity;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.UpcomingPaymentApiEntity;
import p819ls.C26065d;

/* renamed from: lu.c */
public final class C26091c {

    /* renamed from: a */
    private final C26065d f66204a;

    public C26091c(C26065d dVar) {
        C41536l.m120489i(dVar, "upcomingPaymentMapper");
        this.f66204a = dVar;
    }

    /* renamed from: a */
    public final List mo65004a(UpcomingPaymentDataEntity upcomingPaymentDataEntity, String str) {
        C41536l.m120489i(upcomingPaymentDataEntity, "upcomingPaymentDataEntity");
        C41536l.m120489i(str, "ccy");
        List<UpcomingPaymentApiEntity> calendarData = upcomingPaymentDataEntity.getCalendarData();
        ArrayList arrayList = new ArrayList();
        for (T next : calendarData) {
            if (C41536l.m120484d(((UpcomingPaymentApiEntity) next).getProductGroup(), "FEE")) {
                arrayList.add(next);
            }
        }
        ArrayList<UpcomingPaymentApiEntity> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            UpcomingPaymentApiEntity upcomingPaymentApiEntity = (UpcomingPaymentApiEntity) next2;
            boolean z = false;
            if (C40439w.m117115s(upcomingPaymentApiEntity.getCcy(), str, false)) {
                if (C32300e0.f79712a.mo72816a(upcomingPaymentApiEntity.getAmount(), upcomingPaymentApiEntity.getCcy(), upcomingPaymentApiEntity.getPayDate())) {
                    z = true;
                }
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (UpcomingPaymentApiEntity a : arrayList2) {
            arrayList3.add(this.f66204a.mo64984a(a));
        }
        return arrayList3;
    }
}
