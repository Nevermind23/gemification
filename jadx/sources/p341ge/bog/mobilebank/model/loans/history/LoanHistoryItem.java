package p341ge.bog.mobilebank.model.loans.history;

import g91.C32303f;
import java.math.BigDecimal;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.model.loans.history.LoanHistoryItem */
public class LoanHistoryItem {
    private BigDecimal amount;
    private BigDecimal amountPaid;
    private String ccy;
    private BigDecimal fee;
    private String feeType;
    private String feeTypeDictionaryKey;
    private BigDecimal insAmt;
    private BigDecimal interest;
    private long loanKey;
    private long operDate;
    private String operTypeDictionaryKey;
    private long paymentDate;
    private BigDecimal penalty;
    private transient boolean pln;
    private BigDecimal principal;
    private long receiptKey;
    private BigDecimal scheduledFee;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getAmountPaid() {
        return this.amountPaid;
    }

    public String getCcy() {
        return this.ccy;
    }

    public int getCount() {
        return isPln() ? 1 : 5;
    }

    public String getFeeTypeDictionaryKey() {
        return this.feeTypeDictionaryKey;
    }

    public String getFifthValue() {
        return C32303f.m95204o(this.penalty.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public String getFirstValue() {
        if (isPln()) {
            return C27950a.m86286c(this.operTypeDictionaryKey, false);
        }
        return C32303f.m95204o(this.principal.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public String getFourthValue() {
        return C32303f.m95204o(this.insAmt.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public BigDecimal getInsAmt() {
        return this.insAmt;
    }

    public BigDecimal getInterest() {
        return this.interest;
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public long getOperDate() {
        return this.operDate;
    }

    public String getOperTypeDictionaryKey() {
        return this.operTypeDictionaryKey;
    }

    public long getPaymentDate() {
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

    public String getSecondValue() {
        return C32303f.m95204o(this.interest.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public String getThirdValue() {
        return C32303f.m95204o(this.scheduledFee.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public boolean isPln() {
        return this.pln;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
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

    public void setPln(boolean z) {
        this.pln = z;
    }
}
