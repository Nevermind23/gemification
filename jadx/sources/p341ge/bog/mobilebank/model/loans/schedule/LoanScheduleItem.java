package p341ge.bog.mobilebank.model.loans.schedule;

import g91.C32303f;
import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.loans.schedule.LoanScheduleItem */
public class LoanScheduleItem {
    private String ccy;
    private BigDecimal feeAmt;
    private String feeType;
    private String feeTypeDictionaryKey;
    private BigDecimal insAmt;
    private BigDecimal intAmt;
    private long loanKey;
    private BigDecimal nextPayAmt;
    private long payDate;
    private BigDecimal priAmt;
    private String primaryKey;
    public BigDecimal rliAmt;
    private BigDecimal totalAmt;

    public String getCcy() {
        return this.ccy;
    }

    public int getCount() {
        return 5;
    }

    public String getFeeTypeDictionaryKey() {
        return this.feeTypeDictionaryKey;
    }

    public String getFifthValue() {
        return C32303f.m95204o(this.rliAmt.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public String getFirstValue() {
        return C32303f.m95204o(this.priAmt.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public String getFourthValue() {
        return C32303f.m95204o(this.insAmt.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public BigDecimal getInsAmt() {
        return this.insAmt;
    }

    public long getLoanKey() {
        return this.loanKey;
    }

    public long getPayDate() {
        return this.payDate;
    }

    public String getSecondValue() {
        return C32303f.m95204o(this.intAmt.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public String getThirdValue() {
        return C32303f.m95204o(this.feeAmt.doubleValue()) + " " + C32303f.m95197h(getCcy());
    }

    public BigDecimal getTotalAmt() {
        return this.totalAmt;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setLoanKey(long j) {
        this.loanKey = j;
    }
}
