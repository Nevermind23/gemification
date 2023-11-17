package p341ge.bog.mobilebank.p975ui.model.qrpay;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.model.qrpay.QrPayData */
public class QrPayData {
    String amount;
    String merchantName;
    String merchantTerminalId;
    QrId qrId;
    String qrStandard;

    public static QrPayData create(QrId qrId2, String str, String str2) {
        QrPayData qrPayData = new QrPayData();
        qrPayData.qrId = qrId2;
        qrPayData.merchantName = str;
        qrPayData.merchantTerminalId = str2;
        return qrPayData;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantTerminalId() {
        return this.merchantTerminalId;
    }

    public QrId getQrId() {
        return this.qrId;
    }

    public String getQrStandard() {
        return this.qrStandard;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setMerchantTerminalId(String str) {
        this.merchantTerminalId = str;
    }

    public void setQrId(QrId qrId2) {
        this.qrId = qrId2;
    }

    public void setQrStandard(String str) {
        this.qrStandard = str;
    }
}
