package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.DepositBondsSummary */
public class DepositBondsSummary {
    private BigDecimal balance;
    private String ccy;

    public BigDecimal getBalance() {
        return this.balance;
    }

    public String getCcy() {
        return this.ccy;
    }

    public void setBalance(BigDecimal bigDecimal) {
        this.balance = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }
}
