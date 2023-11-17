package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplScheduleHistoryItemApiEntity */
public final class BnplScheduleHistoryItemApiEntity {
    private final List<BnplRepaymentApiEntity> repayments;
    private final List<BnplScheduleApiEntity> schedules;

    public BnplScheduleHistoryItemApiEntity(List<BnplScheduleApiEntity> list, List<BnplRepaymentApiEntity> list2) {
        C41536l.m120489i(list, "schedules");
        C41536l.m120489i(list2, "repayments");
        this.schedules = list;
        this.repayments = list2;
    }

    public static /* synthetic */ BnplScheduleHistoryItemApiEntity copy$default(BnplScheduleHistoryItemApiEntity bnplScheduleHistoryItemApiEntity, List<BnplScheduleApiEntity> list, List<BnplRepaymentApiEntity> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bnplScheduleHistoryItemApiEntity.schedules;
        }
        if ((i & 2) != 0) {
            list2 = bnplScheduleHistoryItemApiEntity.repayments;
        }
        return bnplScheduleHistoryItemApiEntity.copy(list, list2);
    }

    public final List<BnplScheduleApiEntity> component1() {
        return this.schedules;
    }

    public final List<BnplRepaymentApiEntity> component2() {
        return this.repayments;
    }

    public final BnplScheduleHistoryItemApiEntity copy(List<BnplScheduleApiEntity> list, List<BnplRepaymentApiEntity> list2) {
        C41536l.m120489i(list, "schedules");
        C41536l.m120489i(list2, "repayments");
        return new BnplScheduleHistoryItemApiEntity(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplScheduleHistoryItemApiEntity)) {
            return false;
        }
        BnplScheduleHistoryItemApiEntity bnplScheduleHistoryItemApiEntity = (BnplScheduleHistoryItemApiEntity) obj;
        return C41536l.m120484d(this.schedules, bnplScheduleHistoryItemApiEntity.schedules) && C41536l.m120484d(this.repayments, bnplScheduleHistoryItemApiEntity.repayments);
    }

    public final List<BnplRepaymentApiEntity> getRepayments() {
        return this.repayments;
    }

    public final List<BnplScheduleApiEntity> getSchedules() {
        return this.schedules;
    }

    public int hashCode() {
        return (this.schedules.hashCode() * 31) + this.repayments.hashCode();
    }

    public String toString() {
        List<BnplScheduleApiEntity> list = this.schedules;
        List<BnplRepaymentApiEntity> list2 = this.repayments;
        return "BnplScheduleHistoryItemApiEntity(schedules=" + list + ", repayments=" + list2 + ")";
    }
}
