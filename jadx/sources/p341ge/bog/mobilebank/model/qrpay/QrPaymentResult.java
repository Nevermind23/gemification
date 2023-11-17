package p341ge.bog.mobilebank.model.qrpay;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.qrpay.QrPaymentResult */
public class QrPaymentResult {
    String docKey;
    String printFormType;

    public String getDocKey() {
        return this.docKey;
    }

    public String getPrintFormType() {
        return this.printFormType;
    }

    public void setDocKey(String str) {
        this.docKey = str;
    }

    public void setPrintFormType(String str) {
        this.printFormType = str;
    }
}
