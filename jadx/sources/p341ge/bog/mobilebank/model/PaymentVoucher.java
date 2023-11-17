package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.PaymentVoucher */
public class PaymentVoucher {
    protected String bonusType;
    protected String providerCode;
    protected BigDecimal voucherAmount;
    protected BigDecimal voucherBonus;
    protected String voucherCcy;
    protected String voucherType;

    public String getBonusType() {
        return this.bonusType;
    }

    public BigDecimal getVoucherAmount() {
        return this.voucherAmount;
    }

    public BigDecimal getVoucherBonus() {
        return this.voucherBonus;
    }

    public String getVoucherCcy() {
        return this.voucherCcy;
    }

    public String getVoucherType() {
        return this.voucherType;
    }

    public boolean isValid() {
        return (this.voucherBonus == null || this.voucherAmount == null || this.voucherCcy == null) ? false : true;
    }

    public void setBonusType(String str) {
        this.bonusType = str;
    }

    public void setVoucherType(String str) {
        this.voucherType = str;
    }

    public String toString() {
        return getVoucherAmount() + " " + getVoucherCcy();
    }
}
