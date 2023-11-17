package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.VoucherType */
public class VoucherType {
    String dictionaryKey;
    String productType;
    BigDecimal voucherAmount;
    BigDecimal voucherBonus;
    String voucherCcy;
    String voucherDesc;
    String voucherType;

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public String getProductType() {
        return this.productType;
    }

    public BigDecimal getVoucherAmount() {
        return this.voucherAmount;
    }

    public BigDecimal getVoucherBonus() {
        return this.voucherBonus;
    }

    public String getVoucherType() {
        return this.voucherType;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setProductType(String str) {
        this.productType = str;
    }

    public void setVoucherType(String str) {
        this.voucherType = str;
    }
}
