package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.CurrencyWrapper */
public class CurrencyWrapper {
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("ccy")
    private String ccy;
    @C8664c("currency")
    private String currency;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        String str = this.ccy;
        return str != null ? str : getCurrency();
    }

    public String getCurrency() {
        String str = this.currency;
        return str != null ? str : getCcy();
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }
}
