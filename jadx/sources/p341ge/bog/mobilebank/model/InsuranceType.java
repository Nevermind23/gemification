package p341ge.bog.mobilebank.model;

/* renamed from: ge.bog.mobilebank.model.InsuranceType */
public class InsuranceType {
    private String cardSubProductCode;
    private String detailsDictionaryKey;
    private String dictionaryKey;

    /* renamed from: id */
    private long f81290id;
    private String insuranceType;

    public String getDetailsDictionaryKey() {
        return this.detailsDictionaryKey;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public long getId() {
        return this.f81290id;
    }

    public String getInsuranceType() {
        return this.insuranceType;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setId(long j) {
        this.f81290id = j;
    }

    public void setInsuranceType(String str) {
        this.insuranceType = str;
    }

    public String toString() {
        return this.insuranceType;
    }
}
