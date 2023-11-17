package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.LoanHistoryEvent */
public class LoanHistoryEvent extends RootEvent {
    private LoanHistoryWrapper loanHistoryWrapper;
    private long loanKey;
    private boolean pln;

    public LoanHistoryWrapper getLoanHistoryWrapper() {
        return this.loanHistoryWrapper;
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public boolean isPln() {
        return this.pln;
    }

    public void setLoanHistoryWrapper(LoanHistoryWrapper loanHistoryWrapper2) {
        this.loanHistoryWrapper = loanHistoryWrapper2;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }

    public void setPln(boolean z) {
        this.pln = z;
    }
}
