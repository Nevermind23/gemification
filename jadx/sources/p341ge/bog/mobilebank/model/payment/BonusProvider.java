package p341ge.bog.mobilebank.model.payment;

/* renamed from: ge.bog.mobilebank.model.payment.BonusProvider */
public class BonusProvider {
    private String dictionaryKey;
    private String payType;
    private String productType;
    private String providerCode;
    private String providerDesc;
    private String serviceCategory;
    private String serviceId;
    private String status;

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public String getProductType() {
        return this.productType;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setProductType(String str) {
        this.productType = str;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
