package p341ge.bog.mobilebank.loans.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loans.data.model.LoanSchedulesApiModel */
public final class LoanSchedulesApiModel {
    private final List<ScheduleApiModel> schedule;
    private final ScheduleSummaryApiModel summary;

    public LoanSchedulesApiModel(List<ScheduleApiModel> list, ScheduleSummaryApiModel scheduleSummaryApiModel) {
        C41536l.m120489i(list, "schedule");
        this.schedule = list;
        this.summary = scheduleSummaryApiModel;
    }

    public static /* synthetic */ LoanSchedulesApiModel copy$default(LoanSchedulesApiModel loanSchedulesApiModel, List<ScheduleApiModel> list, ScheduleSummaryApiModel scheduleSummaryApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = loanSchedulesApiModel.schedule;
        }
        if ((i & 2) != 0) {
            scheduleSummaryApiModel = loanSchedulesApiModel.summary;
        }
        return loanSchedulesApiModel.copy(list, scheduleSummaryApiModel);
    }

    public final List<ScheduleApiModel> component1() {
        return this.schedule;
    }

    public final ScheduleSummaryApiModel component2() {
        return this.summary;
    }

    public final LoanSchedulesApiModel copy(List<ScheduleApiModel> list, ScheduleSummaryApiModel scheduleSummaryApiModel) {
        C41536l.m120489i(list, "schedule");
        return new LoanSchedulesApiModel(list, scheduleSummaryApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanSchedulesApiModel)) {
            return false;
        }
        LoanSchedulesApiModel loanSchedulesApiModel = (LoanSchedulesApiModel) obj;
        return C41536l.m120484d(this.schedule, loanSchedulesApiModel.schedule) && C41536l.m120484d(this.summary, loanSchedulesApiModel.summary);
    }

    public final List<ScheduleApiModel> getSchedule() {
        return this.schedule;
    }

    public final ScheduleSummaryApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        int hashCode = this.schedule.hashCode() * 31;
        ScheduleSummaryApiModel scheduleSummaryApiModel = this.summary;
        return hashCode + (scheduleSummaryApiModel == null ? 0 : scheduleSummaryApiModel.hashCode());
    }

    public String toString() {
        List<ScheduleApiModel> list = this.schedule;
        ScheduleSummaryApiModel scheduleSummaryApiModel = this.summary;
        return "LoanSchedulesApiModel(schedule=" + list + ", summary=" + scheduleSummaryApiModel + ")";
    }
}
