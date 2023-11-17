package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.AgreementClientInfo */
public class AgreementClientInfo {
    @C8664c("bondsValue")
    private BigDecimal mBondsValue;
    @C8664c("cashValue")
    private BigDecimal mCashValue;
    @C8664c("ccy")
    private String mCcy;
    @C8664c("clientKey")
    private Long mClientKey;
    @C8664c("insertDate")
    private Long mInsertDate;
    @C8664c("sharesValue")
    private BigDecimal mSharesValue;
    @C8664c("totalValue")
    private BigDecimal mTotalValue;

    public BigDecimal getCashValue() {
        return this.mCashValue;
    }

    public String getCcy() {
        return this.mCcy;
    }

    public Long getClientKey() {
        return this.mClientKey;
    }

    public BigDecimal getTotalValue() {
        return this.mTotalValue;
    }

    public void setCcy(String str) {
        this.mCcy = str;
    }

    public void setClientKey(Long l) {
        this.mClientKey = l;
    }
}
