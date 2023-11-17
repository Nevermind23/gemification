package p341ge.bog.mobilebank.model.account;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.account.OperationBalance */
public class OperationBalance {
    private long acctKey;
    private BigDecimal balance;
    private BigDecimal balanceBase;
    private String ccy;
    private long endDate;
    private long postDate;

    public long getAcctKey() {
        return this.acctKey;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getEndDate() {
        return this.endDate;
    }

    public long getPostDate() {
        return this.postDate;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setEndDate(long j) {
        this.endDate = j;
    }
}
