package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.AccountStudDepInfos */
public class AccountStudDepInfos {
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("ccy")
    private String ccy;
    @C8664c("intAccrued")
    private BigDecimal intAccrued;
    @C8664c("intRate")
    private BigDecimal intRate;
    @C8664c("realAmount")
    private BigDecimal realAmount;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public BigDecimal getIntAccrued() {
        return this.intAccrued;
    }

    public BigDecimal getIntRate() {
        return this.intRate;
    }

    public BigDecimal getRealAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }
}
