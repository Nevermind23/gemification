package p341ge.bog.mobilebank.p975ui.model.qrinstallment;

import org.parceler.Parcel;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.model.qrinstallment.QrInstallmentData */
public class QrInstallmentData {
    private String installmentAmount;
    private String merchantName;
    private String merchantTerminalId;
    private String offerNo;
    private String offerOperationType;

    public static QrInstallmentData create(OfferInfo offerInfo) {
        QrInstallmentData qrInstallmentData = new QrInstallmentData();
        qrInstallmentData.offerNo = offerInfo.getOfferNo();
        qrInstallmentData.offerOperationType = offerInfo.getOperType();
        return qrInstallmentData;
    }

    public String getInstallmentAmount() {
        return this.installmentAmount;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantTerminalId() {
        return this.merchantTerminalId;
    }

    public String getOfferNo() {
        return this.offerNo;
    }

    public String getOfferOperationType() {
        return this.offerOperationType;
    }

    public void setInstallmentAmount(String str) {
        this.installmentAmount = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setMerchantTerminalId(String str) {
        this.merchantTerminalId = str;
    }

    public void setOfferNo(String str) {
        this.offerNo = str;
    }

    public void setOfferOperationType(String str) {
        this.offerOperationType = str;
    }
}
