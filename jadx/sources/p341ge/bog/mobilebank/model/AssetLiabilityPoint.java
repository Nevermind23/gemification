package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.AssetLiabilityPoint */
public class AssetLiabilityPoint {
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("currencies")
    private AssetLiabilityInfoAmount[] currencies;
    @C8664c("dictionaryKey")
    private String dictionaryKey;
    @C8664c("format")
    private String format;
    @C8664c("id")

    /* renamed from: id */
    private long f81283id;
    @C8664c("orderNo")
    private long orderNo;
    private String prodType;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public AssetLiabilityInfoAmount[] getCurrencies() {
        return this.currencies;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public String getFormat() {
        return this.format;
    }

    public long getId() {
        return this.f81283id;
    }

    public String getProdType() {
        return this.prodType;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCurrencies(AssetLiabilityInfoAmount[] assetLiabilityInfoAmountArr) {
        this.currencies = assetLiabilityInfoAmountArr;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setId(long j) {
        this.f81283id = j;
    }

    public void setProdType(String str) {
        this.prodType = str;
    }
}
