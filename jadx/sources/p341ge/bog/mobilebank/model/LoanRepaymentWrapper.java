package p341ge.bog.mobilebank.model;

import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.LoanRepaymentWrapper */
public class LoanRepaymentWrapper {
    @C8664c("repayments")
    private LoanRepayment[] repayments;
    @C8664c("summary")
    private LoanRepaymentSummery summary;

    public LoanRepayment[] getRepayments() {
        return this.repayments;
    }

    public LoanRepaymentSummery getSummary() {
        return this.summary;
    }

    public void setSummary(LoanRepaymentSummery loanRepaymentSummery) {
        this.summary = loanRepaymentSummery;
    }
}
