package p341ge.bog.mobilebank.model.foreigntransfer;

/* renamed from: ge.bog.mobilebank.model.foreigntransfer.TransferCountryCode */
public enum TransferCountryCode {
    COUNTRY_CODE_UNITED_ARAB_EMIRATES("AE");
    
    private String value;

    private TransferCountryCode(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
