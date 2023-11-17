package nr0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.data.model.LoanSchedulesApiModel;
import p341ge.bog.mobilebank.loans.data.model.ScheduleApiModel;
import p341ge.bog.mobilebank.loans.data.model.ScheduleSummaryApiModel;
import tr0.C38788i;
import tr0.C38791l;
import tr0.C38792m;

/* renamed from: nr0.d */
public final class C37455d {
    /* renamed from: b */
    private final C38791l m110351b(ScheduleApiModel scheduleApiModel) {
        return new C38791l(scheduleApiModel.getCcy(), scheduleApiModel.getExAmt(), scheduleApiModel.getFeeAmt(), scheduleApiModel.getFeeType(), scheduleApiModel.getFeeTypeDictionaryKey(), scheduleApiModel.getFeeTypeDictionaryValue(), scheduleApiModel.getForgiveFee(), scheduleApiModel.getForgiveInt(), scheduleApiModel.getForgiveOdi(), scheduleApiModel.getGraceInt(), scheduleApiModel.getInsAmt(), scheduleApiModel.getIntAmt(), scheduleApiModel.getIntAmtWithoutOffset(), scheduleApiModel.getLoanKey(), scheduleApiModel.getLoanNo(), scheduleApiModel.getNextPayAmt(), scheduleApiModel.getPayDate(), scheduleApiModel.getPriAmt(), scheduleApiModel.getPrimaryKey(), scheduleApiModel.getRliAmt(), scheduleApiModel.getTotalAmt());
    }

    /* renamed from: c */
    private final C38792m m110352c(ScheduleSummaryApiModel scheduleSummaryApiModel) {
        return new C38792m(scheduleSummaryApiModel.getCcy(), scheduleSummaryApiModel.getExAmt(), scheduleSummaryApiModel.getFeeAmt(), scheduleSummaryApiModel.getFeeType(), scheduleSummaryApiModel.getFeeTypeDictionaryKey(), scheduleSummaryApiModel.getFeeTypeDictionaryValue(), scheduleSummaryApiModel.getForgiveFee(), scheduleSummaryApiModel.getForgiveInt(), scheduleSummaryApiModel.getForgiveOdi(), scheduleSummaryApiModel.getGraceInt(), scheduleSummaryApiModel.getInitialPrincipal(), scheduleSummaryApiModel.getInsAmt(), scheduleSummaryApiModel.getIntAmt(), scheduleSummaryApiModel.getIntAmtWithoutOffset(), scheduleSummaryApiModel.getLoanNo(), scheduleSummaryApiModel.getNextPayAmt(), scheduleSummaryApiModel.getPayDate(), scheduleSummaryApiModel.getPriAmt(), scheduleSummaryApiModel.getProductDictionaryKey(), scheduleSummaryApiModel.getRliAmt(), scheduleSummaryApiModel.getTotalAmt());
    }

    /* renamed from: a */
    public final C38788i mo90587a(LoanSchedulesApiModel loanSchedulesApiModel) {
        C38792m mVar;
        C41536l.m120489i(loanSchedulesApiModel, "loanSchedulesApiModel");
        List<ScheduleApiModel> schedule = loanSchedulesApiModel.getSchedule();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(schedule, 10));
        for (ScheduleApiModel b : schedule) {
            arrayList.add(m110351b(b));
        }
        ScheduleSummaryApiModel summary = loanSchedulesApiModel.getSummary();
        if (summary != null) {
            mVar = m110352c(summary);
        } else {
            mVar = null;
        }
        return new C38788i(arrayList, mVar);
    }
}
