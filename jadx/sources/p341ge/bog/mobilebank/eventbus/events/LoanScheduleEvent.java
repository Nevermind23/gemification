package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.loans.schedule.LoanScheduleWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.LoanScheduleEvent */
public class LoanScheduleEvent extends RootEvent {
    private long loanKey;
    private LoanScheduleWrapper loanScheduleWrapper;

    public long getLoanKey() {
        return this.loanKey;
    }

    public LoanScheduleWrapper getLoanScheduleWrapper() {
        return this.loanScheduleWrapper;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }

    public void setLoanScheduleWrapper(LoanScheduleWrapper loanScheduleWrapper2) {
        this.loanScheduleWrapper = loanScheduleWrapper2;
    }
}
