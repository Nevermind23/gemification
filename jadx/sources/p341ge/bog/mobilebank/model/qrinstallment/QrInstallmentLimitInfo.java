package p341ge.bog.mobilebank.model.qrinstallment;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.qrinstallment.QrInstallmentLimitInfo */
public class QrInstallmentLimitInfo {
    private BigDecimal limitAmount;
    private String limitCategory;
    private String limitCcy;
    private String offerNo;
    private String operType;
    private int period;

    public BigDecimal getLimitAmount() {
        return this.limitAmount;
    }

    public String getLimitCategory() {
        return this.limitCategory;
    }

    public String getLimitCcy() {
        return this.limitCcy;
    }

    public String getOfferNo() {
        return this.offerNo;
    }

    public String getOperType() {
        return this.operType;
    }

    public int getPeriod() {
        return this.period;
    }

    public void setLimitAmount(BigDecimal bigDecimal) {
        this.limitAmount = bigDecimal;
    }

    public void setLimitCategory(String str) {
        this.limitCategory = str;
    }

    public void setLimitCcy(String str) {
        this.limitCcy = str;
    }

    public void setOfferNo(String str) {
        this.offerNo = str;
    }

    public void setOperType(String str) {
        this.operType = str;
    }

    public void setPeriod(int i) {
        this.period = i;
    }

    public String toString() {
        return "QrInstallmentLimitInfo{period = '" + this.period + '\'' + ",offerNo = '" + this.offerNo + '\'' + ",limitCcy = '" + this.limitCcy + '\'' + ",limitAmount = '" + this.limitAmount + '\'' + ",limitCategory = '" + this.limitCategory + '\'' + ",operType = '" + this.operType + '\'' + "}";
    }
}
