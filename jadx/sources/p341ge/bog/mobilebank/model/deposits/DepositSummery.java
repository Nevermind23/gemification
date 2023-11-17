package p341ge.bog.mobilebank.model.deposits;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.deposits.DepositSummery */
public class DepositSummery {
    @C8664c("bcBalance")
    private BigDecimal bcBalance;
    @C8664c("ccy")
    private String ccy;

    public BigDecimal getAmount() {
        return this.bcBalance;
    }

    public String getCcy() {
        return this.ccy;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.bcBalance = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }
}
