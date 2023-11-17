package p341ge.bog.mobilebank.model;

/* renamed from: ge.bog.mobilebank.model.CreditMRInsurance */
public class CreditMRInsurance {
    public long acctKey;
    public String attachmentFileBase64;
    public String cardClass;
    public String cardConditionsUrl;
    public long cardId;
    public String cardType;
    public String cardTypeName;
    public long clientKey;
    public long expDate;
    public long expDateMillis;
    public String insuranceCode;
    public String insuranceText;
    public String languageCode;
    public String lastFour;
    public String phoneNumber;
    public String productUrl;
    public String subProductCode;

    public long getAcctKey() {
        return this.acctKey;
    }

    public String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public String getCardClass() {
        return this.cardClass;
    }

    public long getCardId() {
        return this.cardId;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCardTypeName() {
        return this.cardTypeName;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public long getExpDate() {
        return this.expDate;
    }

    public String getLastFour() {
        return this.lastFour;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getProductUrl() {
        return this.productUrl;
    }

    public String getSubProductCode() {
        return this.subProductCode;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setAttachmentFileBase64(String str) {
        this.attachmentFileBase64 = str;
    }

    public void setCardClass(String str) {
        this.cardClass = str;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setExpDate(long j) {
        this.expDate = j;
    }

    public void setLastFour(String str) {
        this.lastFour = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setSubProductCode(String str) {
        this.subProductCode = str;
    }
}
