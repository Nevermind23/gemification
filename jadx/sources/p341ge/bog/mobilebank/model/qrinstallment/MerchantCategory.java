package p341ge.bog.mobilebank.model.qrinstallment;

/* renamed from: ge.bog.mobilebank.model.qrinstallment.MerchantCategory */
public class MerchantCategory {
    private String groupCode;
    private String groupDescription;
    private String languageCode;
    private int orderNo;

    public String getGroupCode() {
        return this.groupCode;
    }

    public String getGroupDescription() {
        return this.groupDescription;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public int getOrderNo() {
        return this.orderNo;
    }

    public void setGroupCode(String str) {
        this.groupCode = str;
    }

    public void setGroupDescription(String str) {
        this.groupDescription = str;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public void setOrderNo(int i) {
        this.orderNo = i;
    }

    public String toString() {
        return "MerchantCategory{orderNo = '" + this.orderNo + '\'' + ",groupDescription = '" + this.groupDescription + '\'' + ",languageCode = '" + this.languageCode + '\'' + ",groupCode = '" + this.groupCode + '\'' + "}";
    }
}
