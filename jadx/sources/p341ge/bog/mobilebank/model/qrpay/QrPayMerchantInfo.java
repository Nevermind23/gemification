package p341ge.bog.mobilebank.model.qrpay;

import hd0.C24978b;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.qrpay.QrPayMerchantInfo */
public class QrPayMerchantInfo {
    private String deviceId;
    private C24978b isValid;
    private String merchantName;
    @C8664c("merchantNameInt")
    private String merchantNameEn;

    public String getDeviceId() {
        return this.deviceId;
    }

    public C24978b getIsValid() {
        return this.isValid;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantNameEn() {
        return this.merchantNameEn;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setIsValid(C24978b bVar) {
        this.isValid = bVar;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setMerchantNameEn(String str) {
        this.merchantNameEn = str;
    }
}
