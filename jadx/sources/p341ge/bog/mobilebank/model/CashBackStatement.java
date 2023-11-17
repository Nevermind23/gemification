package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.CashBackStatement */
public class CashBackStatement {
    private BigDecimal amount;
    private BigDecimal cashbackAmount;
    private BigDecimal cashbackPercent;
    private String entryComment;
    private long postDate;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getCashbackAmount() {
        return this.cashbackAmount;
    }

    public String getEntryComment() {
        return this.entryComment;
    }

    public long getPostDate() {
        return this.postDate;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }
}
