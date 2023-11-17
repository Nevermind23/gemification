package p819ls;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentDataEntity;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.UpcomingPaymentApiEntity;
import p821lu.C26092d;
import p831mu.C26299a;

/* renamed from: ls.c */
public final class C26064c {

    /* renamed from: a */
    private final C26092d f66167a;

    /* renamed from: b */
    private final C26065d f66168b;

    public C26064c(C26092d dVar, C26065d dVar2) {
        C41536l.m120489i(dVar, "summariesMapper");
        C41536l.m120489i(dVar2, "upcomingPaymentMapper");
        this.f66167a = dVar;
        this.f66168b = dVar2;
    }

    /* renamed from: a */
    public final C26299a mo64983a(UpcomingPaymentDataEntity upcomingPaymentDataEntity) {
        C41536l.m120489i(upcomingPaymentDataEntity, "data");
        List a = this.f66167a.mo65005a(upcomingPaymentDataEntity);
        List<UpcomingPaymentApiEntity> calendarData = upcomingPaymentDataEntity.getCalendarData();
        C26065d dVar = this.f66168b;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(calendarData, 10));
        for (UpcomingPaymentApiEntity a2 : calendarData) {
            arrayList.add(dVar.mo64984a(a2));
        }
        return new C26299a(a, arrayList);
    }
}
