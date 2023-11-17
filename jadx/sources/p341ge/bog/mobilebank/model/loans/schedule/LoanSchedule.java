package p341ge.bog.mobilebank.model.loans.schedule;

import g91.C32319m;
import java.math.BigDecimal;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.AssetLiabListItemInterface;

/* renamed from: ge.bog.mobilebank.model.loans.schedule.LoanSchedule */
public class LoanSchedule implements AssetLiabListItemInterface {
    @C8664c("ccy")
    private String ccy;
    @C8664c("exAmt")
    public BigDecimal exAmt;
    @C8664c("feeAmt")
    private BigDecimal feeAmt;
    @C8664c("feeType")
    public String feeType;
    @C8664c("feeTypeDictionaryKey")
    public String feeTypeDictionaryKey;
    @C8664c("feeTypeDictionaryValue")
    public String feeTypeDictionaryValue;
    @C8664c("insAmt")
    private BigDecimal insAmt;
    @C8664c("intAmt")
    private BigDecimal intAmt;
    @C8664c("intAmtWithoutOffset")
    private BigDecimal intAmtWithoutOffset;
    @C8664c("loanKey")
    private long loanKey;
    @C8664c("loanNo")
    private String loanNo;
    @C8664c("nextPayAmt")
    private BigDecimal nextPayAmt;
    @C8664c("payDate")
    public long payDate;
    @C8664c("priAmt")
    private BigDecimal priAmt;
    @C8664c("primaryKey")
    public String primaryKey;
    @C8664c("rliAmt")
    private BigDecimal rliAmt;
    @C8664c("totalAmt")
    private BigDecimal totalAmt;

    public String getCcy() {
        return this.ccy;
    }

    public String getDescription() {
        return "dziritadi tanxa: " + getPriAmt() + getCcy() + " procenti: " + getIntAmt() + getCcy() + " sakomisio: " + getFeeAmt() + getCcy();
    }

    public BigDecimal getFeeAmt() {
        return this.feeAmt;
    }

    public String getFormattedPayDate() {
        return C32319m.m95314u(this.payDate);
    }

    public String getHeader() {
        return "";
    }

    public BigDecimal getInsAmt() {
        return this.insAmt;
    }

    public BigDecimal getIntAmt() {
        return this.intAmt;
    }

    public BigDecimal getIntAmtWithoutOffset() {
        return this.intAmtWithoutOffset;
    }

    public String getLeftAmount() {
        return "sul: " + getTotalAmt() + getCcy();
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public String getLoanNo() {
        return this.loanNo;
    }

    public BigDecimal getNextPayAmt() {
        return this.nextPayAmt;
    }

    public BigDecimal getPriAmt() {
        return this.priAmt;
    }

    public BigDecimal getRliAmt() {
        return this.rliAmt;
    }

    public BigDecimal getTotalAmt() {
        return this.totalAmt;
    }

    public boolean isCard() {
        return false;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }
}
