package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.LoanSummery */
public class LoanSummery {
    @C8664c("bcAmount")
    private BigDecimal amount;
    @C8664c("ccy")
    private String ccy;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }
}
