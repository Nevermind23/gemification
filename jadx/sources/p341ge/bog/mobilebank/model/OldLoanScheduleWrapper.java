package p341ge.bog.mobilebank.model;

import p277ua.C8664c;
import p341ge.bog.mobilebank.model.loans.schedule.LoanSchedule;

/* renamed from: ge.bog.mobilebank.model.OldLoanScheduleWrapper */
public class OldLoanScheduleWrapper {
    @C8664c("schedule")
    private LoanSchedule[] schedule;
    @C8664c("summary")
    private OldLoanScheduleWrapper summary;

    public LoanSchedule[] getSchedule() {
        return this.schedule;
    }

    public OldLoanScheduleWrapper getSummary() {
        return this.summary;
    }

    public void setSchedule(LoanSchedule[] loanScheduleArr) {
        this.schedule = loanScheduleArr;
    }

    public void setSummary(OldLoanScheduleWrapper oldLoanScheduleWrapper) {
        this.summary = oldLoanScheduleWrapper;
    }
}
