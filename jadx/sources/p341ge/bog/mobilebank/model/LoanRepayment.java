package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.LoanRepayment */
public class LoanRepayment implements AssetLiabListItemInterface {
    @C8664c("amountPaid")
    private BigDecimal amountPaid;
    @C8664c("ccy")
    private String ccy;
    @C8664c("interest")
    private BigDecimal interest;
    @C8664c("loanKey")
    private long loanKey;
    @C8664c("paymentDate")
    private String paymentDate;
    @C8664c("penalty")
    private BigDecimal penalty;
    @C8664c("principal")
    private BigDecimal principal;
    @C8664c("receiptKey")
    private long receiptKey;
    @C8664c("scheduledFee")
    private BigDecimal scheduledFee;

    public BigDecimal getAmountPaid() {
        return this.amountPaid;
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getDescription() {
        return "dziritadi tanxa: " + getPrincipal() + getCcy() + " procenti: " + getInterest() + getCcy() + " jarima: " + getPenalty() + getCcy();
    }

    public String getHeader() {
        return getPaymentDate();
    }

    public BigDecimal getInterest() {
        return this.interest;
    }

    public String getLeftAmount() {
        return "sul: " + getAmountPaid() + getCcy();
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public String getPaymentDate() {
        return this.paymentDate;
    }

    public BigDecimal getPenalty() {
        return this.penalty;
    }

    public BigDecimal getPrincipal() {
        return this.principal;
    }

    public BigDecimal getScheduledFee() {
        return this.scheduledFee;
    }

    public boolean isCard() {
        return false;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setInterest(BigDecimal bigDecimal) {
        this.interest = bigDecimal;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }
}
