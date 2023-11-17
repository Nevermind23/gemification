package p341ge.bog.mobilebank.model.payment;

import java.math.BigDecimal;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentDetail */
public class PaymentDetail {
    private String acctNo;
    private BigDecimal amount;
    private BigDecimal amountBase;
    private String approvalCode;
    private long authDate;
    private String bonusInfo;
    private String bonusPoint;
    private String cardLast4;
    private String cashbackAmount;
    private String cashbackPersent;
    private String ccy;
    private long clientKey;
    private DeviceType deviceType;
    private long docKey;
    private String language;
    private String merchantName;
    private String nomination;
    private String nominationOriginal;
    @C8664c("operationDate")
    private Long operationDate;
    @C8664c("pfmCatId")
    public Long pfmCatId;
    @C8664c("pfmCatName")
    public String pfmCatName;
    @C8664c("pfmComputable")
    public boolean pfmComputable;
    @C8664c("pfmForecast")
    public String pfmForecast;
    @C8664c("pfmId")
    public Long pfmId;
    @C8664c("pfmParentCatId")
    public Long pfmParentCatId;
    @C8664c("pfmParentCatName")
    public String pfmParentCatName;
    @C8664c("pfmParentOpId")
    public Long pfmParentOpId;
    @C8664c("pfmRecurring")
    public String pfmRecurring;
    @C8664c("pfmSplit")
    public String pfmSplit;
    @C8664c("pfmTagId")
    public Long pfmTagId;
    @C8664c("pfmTagName")
    public String pfmTagName;
    private long postDate;

    public String getAcctNo() {
        return this.acctNo;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getAmountBase() {
        return this.amountBase;
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public long getAuthDate() {
        return this.authDate;
    }

    public String getBonusInfo() {
        return this.bonusInfo;
    }

    public String getBonusPoint() {
        return this.bonusPoint;
    }

    public String getCardLast4() {
        return this.cardLast4;
    }

    public String getCashbackAmount() {
        return this.cashbackAmount;
    }

    public String getCashbackPersent() {
        return this.cashbackPersent;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public DeviceType getDeviceType() {
        return this.deviceType;
    }

    public long getDocKey() {
        return this.docKey;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getNomination() {
        return this.nomination;
    }

    public String getNominationOriginal() {
        return this.nominationOriginal;
    }

    public Long getOperationDate() {
        return this.operationDate;
    }

    public long getPostDate() {
        return this.postDate;
    }

    public void setAcctNo(String str) {
        this.acctNo = str;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setAmountBase(BigDecimal bigDecimal) {
        this.amountBase = bigDecimal;
    }

    public void setApprovalCode(String str) {
        this.approvalCode = str;
    }

    public void setAuthDate(long j) {
        this.authDate = j;
    }

    public void setBonusInfo(String str) {
        this.bonusInfo = str;
    }

    public void setBonusPoint(String str) {
        this.bonusPoint = str;
    }

    public void setCardLast4(String str) {
        this.cardLast4 = str;
    }

    public void setCashbackAmount(String str) {
        this.cashbackAmount = str;
    }

    public void setCashbackPersent(String str) {
        this.cashbackPersent = str;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setDeviceType(DeviceType deviceType2) {
        this.deviceType = deviceType2;
    }

    public void setDocKey(long j) {
        this.docKey = j;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setNomination(String str) {
        this.nomination = str;
    }

    public void setNominationOriginal(String str) {
        this.nominationOriginal = str;
    }

    public void setPostDate(long j) {
        this.postDate = j;
    }
}
