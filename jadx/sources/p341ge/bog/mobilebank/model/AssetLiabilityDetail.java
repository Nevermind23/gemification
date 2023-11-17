package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.AssetLiabilityDetail */
public class AssetLiabilityDetail {
    private BigDecimal amountBase;
    private String dictionaryKey;
    private String productType;

    public BigDecimal getAmountBase() {
        return this.amountBase;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setProductType(String str) {
        this.productType = str;
    }
}
