package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.CardInstallment */
public class CardInstallment implements AssetLiabListItemInterface {
    private long acctKey;
    private String attachmentFileBase64;
    private long cardId;

    /* renamed from: id */
    private long f81286id;
    private BigDecimal installmentAmount;
    private String installmentCcy;
    private BigDecimal installmentLimit;
    private long merchantId;
    private String merchantName;
    private String merchantNameEn;
    private String merchantNameGe;
    private long nextPayDate;
    private BigDecimal paidPaymentAmount;
    private BigDecimal paidPaymentCount;
    private BigDecimal penaltyAmount;
    private BigDecimal regularPaymentAmount;
    private BigDecimal remainPaymentsAmount;
    private BigDecimal remainPaymentsCount;

    public long getAcctKey() {
        return this.acctKey;
    }

    public String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public long getCardId() {
        return this.cardId;
    }

    public String getDescription() {
        return "Merchant name: " + this.merchantNameEn;
    }

    public String getHeader() {
        return "Installment amount: " + this.installmentAmount + " " + this.installmentCcy;
    }

    public long getId() {
        return this.f81286id;
    }

    public String getLeftAmount() {
        return "Amount due: " + this.remainPaymentsAmount;
    }

    public boolean isCard() {
        return false;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setAttachmentFileBase64(String str) {
        this.attachmentFileBase64 = str;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setId(long j) {
        this.f81286id = j;
    }
}
