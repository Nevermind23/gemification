package p341ge.bog.mobilebank.model.deposits;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.deposits.DepositMaximaDetailsInfo */
public class DepositMaximaDetailsInfo {
    @C8664c("ccy")
    private String ccy;
    @C8664c("currentBalance")
    private BigDecimal currentBalance;
    @C8664c("intAccrued")
    private BigDecimal intAccrued;
    @C8664c("interestRate")
    private BigDecimal interestRate;

    public String getCcy() {
        return this.ccy;
    }

    public BigDecimal getCurrentBalance() {
        return this.currentBalance;
    }

    public BigDecimal getIntAccrued() {
        return this.intAccrued;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setInterestRate(BigDecimal bigDecimal) {
        this.interestRate = bigDecimal;
    }
}
