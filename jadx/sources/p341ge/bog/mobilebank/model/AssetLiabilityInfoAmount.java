package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.AssetLiabilityInfoAmount */
public class AssetLiabilityInfoAmount {
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("ccy")
    private String ccy;
    @C8664c("id")

    /* renamed from: id */
    private long f81282id;
    @C8664c("orderNo")
    private long orderNo;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getId() {
        return this.f81282id;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setId(long j) {
        this.f81282id = j;
    }
}
