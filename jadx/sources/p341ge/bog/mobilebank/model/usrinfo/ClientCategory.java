package p341ge.bog.mobilebank.model.usrinfo;

/* renamed from: ge.bog.mobilebank.model.usrinfo.ClientCategory */
public enum ClientCategory {
    WEALTH_MANAGEMENT("WM"),
    SOLO("SOLO"),
    RETAIL("RB");
    
    private final String value;

    private ClientCategory(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
