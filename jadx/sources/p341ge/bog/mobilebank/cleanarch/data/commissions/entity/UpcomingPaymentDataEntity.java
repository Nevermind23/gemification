package p341ge.bog.mobilebank.cleanarch.data.commissions.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.UpcomingPaymentApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentDataEntity */
public final class UpcomingPaymentDataEntity {
    @C8664c("CalendarData")
    private final List<UpcomingPaymentApiEntity> calendarData;
    @C8664c("Summary")
    private final List<UpcomingPaymentSummaryEntity> summary;

    public UpcomingPaymentDataEntity(List<UpcomingPaymentSummaryEntity> list, List<UpcomingPaymentApiEntity> list2) {
        C41536l.m120489i(list, "summary");
        C41536l.m120489i(list2, "calendarData");
        this.summary = list;
        this.calendarData = list2;
    }

    public static /* synthetic */ UpcomingPaymentDataEntity copy$default(UpcomingPaymentDataEntity upcomingPaymentDataEntity, List<UpcomingPaymentSummaryEntity> list, List<UpcomingPaymentApiEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = upcomingPaymentDataEntity.summary;
        }
        if ((i & 2) != 0) {
            list2 = upcomingPaymentDataEntity.calendarData;
        }
        return upcomingPaymentDataEntity.copy(list, list2);
    }

    public final List<UpcomingPaymentSummaryEntity> component1() {
        return this.summary;
    }

    public final List<UpcomingPaymentApiEntity> component2() {
        return this.calendarData;
    }

    public final UpcomingPaymentDataEntity copy(List<UpcomingPaymentSummaryEntity> list, List<UpcomingPaymentApiEntity> list2) {
        C41536l.m120489i(list, "summary");
        C41536l.m120489i(list2, "calendarData");
        return new UpcomingPaymentDataEntity(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingPaymentDataEntity)) {
            return false;
        }
        UpcomingPaymentDataEntity upcomingPaymentDataEntity = (UpcomingPaymentDataEntity) obj;
        return C41536l.m120484d(this.summary, upcomingPaymentDataEntity.summary) && C41536l.m120484d(this.calendarData, upcomingPaymentDataEntity.calendarData);
    }

    public final List<UpcomingPaymentApiEntity> getCalendarData() {
        return this.calendarData;
    }

    public final List<UpcomingPaymentSummaryEntity> getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (this.summary.hashCode() * 31) + this.calendarData.hashCode();
    }

    public String toString() {
        List<UpcomingPaymentSummaryEntity> list = this.summary;
        List<UpcomingPaymentApiEntity> list2 = this.calendarData;
        return "UpcomingPaymentDataEntity(summary=" + list + ", calendarData=" + list2 + ")";
    }
}
