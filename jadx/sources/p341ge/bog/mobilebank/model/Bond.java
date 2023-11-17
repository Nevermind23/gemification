package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import n41.C37353c;
import p277ua.C8664c;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: ge.bog.mobilebank.model.Bond */
public class Bond {
    private ArrayList<CashAgreement> cashAgreements;
    private BigDecimal cashValue;
    @C8664c("coupon")
    private String coupon;
    @C8664c("agreementNameEn")
    private String mAgreementNameEn;
    @C8664c("agreementNameGe")
    private String mAgreementNameGe;
    @C8664c("agreementType")
    private String mAgreementType;
    @C8664c("attachmentFileBase64")
    private Object mAttachmentFileBase64;
    @C8664c("ccy")
    private String mCcy;
    @C8664c("id")
    private Long mId;
    @C8664c("isinCode")
    private String mIsinCode;
    @C8664c("marketPrice")
    private BigDecimal mMarketPrice;
    @C8664c("purchasePrice")
    private BigDecimal mPurchasePrice;
    @C8664c("quantity")
    private long mQuantity;
    @C8664c("securityNameEn")
    private String mSecurityNameEn;
    @C8664c("securityNameGe")
    private String mSecurityNameGe;
    @C8664c("tickerCode")
    private String mTickerCode;
    @C8664c("tickerNameEn")
    private String mTickerNameEn;
    @C8664c("tickerNameGe")
    private String mTickerNameGe;
    @C8664c("marketValue")
    private BigDecimal marketValue;
    @C8664c("note")
    private String note;
    @C8664c("unrealisedProfitLoss")
    private BigDecimal unrealisedProfitLoss;

    private C37353c getCurrentLang() {
        return PreferencesApiManager.getInstance().getLanguage();
    }

    public String getAgreementName() {
        if (getCurrentLang() == C37353c.KA) {
            return this.mAgreementNameGe;
        }
        return this.mAgreementNameEn;
    }

    public Object getAttachmentFileBase64() {
        return this.mAttachmentFileBase64;
    }

    public ArrayList<CashAgreement> getCashAgreements() {
        return this.cashAgreements;
    }

    public BigDecimal getCashValue() {
        BigDecimal bigDecimal = this.cashValue;
        if (bigDecimal == null) {
            return new BigDecimal(0);
        }
        return bigDecimal;
    }

    public String getCcy() {
        return this.mCcy;
    }

    public Long getId() {
        Long l = this.mId;
        if (l == null) {
            return -10L;
        }
        return l;
    }

    public BigDecimal getMarketPrice() {
        BigDecimal bigDecimal = this.mMarketPrice;
        if (bigDecimal == null) {
            return new BigDecimal(0);
        }
        return bigDecimal;
    }

    public BigDecimal getMarketValue() {
        BigDecimal bigDecimal = this.marketValue;
        if (bigDecimal == null) {
            return new BigDecimal(0);
        }
        return bigDecimal;
    }

    public BigDecimal getPurchasePrice() {
        BigDecimal bigDecimal = this.mPurchasePrice;
        if (bigDecimal == null) {
            return new BigDecimal(0);
        }
        return bigDecimal;
    }

    public long getQuantity() {
        return this.mQuantity;
    }

    public String getSecurityName() {
        if (getCurrentLang() == C37353c.KA) {
            return this.mSecurityNameGe;
        }
        return this.mSecurityNameEn;
    }

    public String getTickerName() {
        if (getCurrentLang() == C37353c.KA) {
            return this.mTickerNameGe;
        }
        return this.mTickerNameEn;
    }

    public BigDecimal getUnrealisedProfitLoss() {
        BigDecimal bigDecimal = this.unrealisedProfitLoss;
        if (bigDecimal == null) {
            return new BigDecimal(0);
        }
        return bigDecimal;
    }

    public void setAttachmentFileBase64(Object obj) {
        this.mAttachmentFileBase64 = obj;
    }

    public void setCashAgreements(ArrayList<CashAgreement> arrayList) {
        this.cashAgreements = arrayList;
    }

    public void setCashValue(BigDecimal bigDecimal) {
        this.cashValue = bigDecimal;
    }

    public void setCcy(String str) {
        this.mCcy = str;
    }

    public void setId(Long l) {
        this.mId = l;
    }

    public void setQuantity(long j) {
        this.mQuantity = j;
    }
}
