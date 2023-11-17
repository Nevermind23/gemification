package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.CreditCardDetail */
public class CreditCardDetail {
    private long acctKey;
    private BigDecimal atmPercent;
    public String fileId;
    public String fileUrl;
    private BigDecimal overdraftLimit;
    private BigDecimal posPercent;

    public long getAcctKey() {
        return this.acctKey;
    }

    public BigDecimal getAtmPercent() {
        return this.atmPercent;
    }

    public BigDecimal getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public BigDecimal getPosPercent() {
        return this.posPercent;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }
}
