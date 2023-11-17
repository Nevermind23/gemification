package p341ge.bog.mobilebank.model.loans;

import g91.C32303f;
import g91.C32319m;
import java.math.BigDecimal;
import java.util.ArrayList;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.LoanInvoiceWrapper;
import p341ge.bog.mobilebank.model.RepaymentAccount;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryItem;
import p341ge.bog.mobilebank.model.loans.schedule.LoanSchedule;

/* renamed from: ge.bog.mobilebank.model.loans.LoanDetailsWrapper */
public class LoanDetailsWrapper {
    @C8664c("lndDetails")
    private LoanDetails details;
    @C8664c("invoice")
    private LoanInvoiceWrapper invoice;
    @C8664c("lndRepayment")
    private LoanHistoryItem lndRepayment;
    @C8664c("loanKey")
    private long loanKey;
    public MerchantDetails mmsDetails;
    @C8664c("plnDetails")
    private PLNDetails plnDetails;
    @C8664c("plnRepayment")
    private LoanHistoryItem plnRepayment;
    private ArrayList<RepaymentAccount> repaymentAccounts;
    @C8664c("schedule")
    private LoanSchedule schedule;
    @C8664c("totalOffsetAmount")
    private BigDecimal totalOffsetAmount;

    public String getAmount() {
        if (isPln()) {
            if (this.plnRepayment == null) {
                return "";
            }
            return C32303f.m95204o(this.plnRepayment.getAmount().doubleValue()) + C32303f.m95198i(this.plnRepayment.getCcy(), true);
        } else if (this.lndRepayment == null) {
            return "";
        } else {
            return C32303f.m95204o(this.lndRepayment.getAmountPaid().doubleValue()) + C32303f.m95198i(this.lndRepayment.getCcy(), true);
        }
    }

    public String getDate() {
        if (isPln()) {
            LoanHistoryItem loanHistoryItem = this.plnRepayment;
            if (loanHistoryItem != null) {
                return C32319m.m95314u(loanHistoryItem.getOperDate());
            }
            return "";
        }
        LoanHistoryItem loanHistoryItem2 = this.lndRepayment;
        if (loanHistoryItem2 != null) {
            return C32319m.m95314u(loanHistoryItem2.getPaymentDate());
        }
        return "";
    }

    public LoanDetails getDetails() {
        return this.details;
    }

    public LoanInvoiceWrapper getInvoice() {
        return this.invoice;
    }

    public LoanHistoryItem getLndRepayment() {
        return this.lndRepayment;
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public PLNDetails getPlnDetails() {
        return this.plnDetails;
    }

    public LoanHistoryItem getPlnRepayment() {
        return this.plnRepayment;
    }

    public ArrayList<RepaymentAccount> getRepaymentAccounts() {
        return this.repaymentAccounts;
    }

    public LoanSchedule getSchedule() {
        return this.schedule;
    }

    public String getStartAndMaturityDate() {
        String str;
        C32319m.m95314u(getDetails().getSignedDate());
        if (getDetails().getMatureDate() > 0) {
            str = " / " + C32319m.m95314u(getDetails().getMatureDate());
        } else {
            str = "";
        }
        return C32319m.m95314u(getDetails().getSignedDate()) + str;
    }

    public BigDecimal getTotalOffsetAmount() {
        return this.totalOffsetAmount;
    }

    public boolean isPln() {
        return this.details.isPln();
    }

    public void setDetails(LoanDetails loanDetails) {
        this.details = loanDetails;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }

    public void setSchedule(LoanSchedule loanSchedule) {
        this.schedule = loanSchedule;
    }
}
