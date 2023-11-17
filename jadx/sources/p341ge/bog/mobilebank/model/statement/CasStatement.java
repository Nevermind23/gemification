package p341ge.bog.mobilebank.model.statement;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.statement.CasStatement */
public class CasStatement {
    private BigDecimal amount;
    private String ccy;
    private long clientId;
    private long clientKey;
    private long runDate;
    private int totalCount;
    private int transactions;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public long getRunDate() {
        return this.runDate;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
