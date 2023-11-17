package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import java.util.List;
import n41.C37353c;
import p277ua.C8664c;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: ge.bog.mobilebank.model.InTransferDetail */
public class InTransferDetail {
    private BigDecimal amount;
    private String benefAcctNo;
    private String benefBankNameEn;
    private String benefBankNameGe;
    private String benefBic;
    private String benefName;
    private String ccy;
    private long clientKey;
    private long docKey;
    private String docType;
    private long dstAcctKey;
    private long inpSysDate;
    private String intermediarBankBic;
    private String intermediarBankName;
    private String nomination;
    @C8664c("pfmCatId")
    public Long pfmCatId;
    @C8664c("pfmCatName")
    public String pfmCatName;
    @C8664c("pfmComputable")
    public Boolean pfmComputable;
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
    @C8664c("pmiDocGpiActions")
    public List<PMIDocGPIAction> pmiDocGPIActions;
    private long postDate;
    private String prodGroup;
    private String senderAcctNo;
    private String senderBankNameEn;
    private String senderBankNameGe;
    private String senderBic;
    private String senderName;
    private long srcAcctKey;

    private C37353c getCurrentLang() {
        return PreferencesApiManager.getInstance().getLanguage();
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getBenefAcctNo() {
        return this.benefAcctNo;
    }

    public String getBenefBankName() {
        if (getCurrentLang() == C37353c.EN) {
            return this.benefBankNameEn;
        }
        return this.benefBankNameGe;
    }

    public String getBenefBankNameEn() {
        return this.benefBankNameEn;
    }

    public String getBenefBankNameGe() {
        return this.benefBankNameGe;
    }

    public String getBenefBic() {
        return this.benefBic;
    }

    public String getBenefName() {
        return this.benefName;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public long getDocKey() {
        return this.docKey;
    }

    public String getDocType() {
        return this.docType;
    }

    public long getDstAcctKey() {
        return this.dstAcctKey;
    }

    public long getInpSysDate() {
        return this.inpSysDate;
    }

    public String getIntermediarBankBic() {
        return this.intermediarBankBic;
    }

    public String getIntermediarBankName() {
        return this.intermediarBankName;
    }

    public String getNomination() {
        return this.nomination;
    }

    public long getOperationDate() {
        long j = this.inpSysDate;
        if (j > 0) {
            return j;
        }
        return this.postDate;
    }

    public long getPostDate() {
        return this.postDate;
    }

    public String getProdGroup() {
        return this.prodGroup;
    }

    public String getSenderAcctNo() {
        return this.senderAcctNo;
    }

    public String getSenderBankName() {
        if (getCurrentLang() == C37353c.EN) {
            return this.senderBankNameEn;
        }
        return this.senderBankNameGe;
    }

    public String getSenderBankNameEn() {
        return this.senderBankNameEn;
    }

    public String getSenderBankNameGe() {
        return this.senderBankNameGe;
    }

    public String getSenderBic() {
        return this.senderBic;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public long getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setBenefAcctNo(String str) {
        this.benefAcctNo = str;
    }

    public void setBenefBankNameEn(String str) {
        this.benefBankNameEn = str;
    }

    public void setBenefBankNameGe(String str) {
        this.benefBankNameGe = str;
    }

    public void setBenefBic(String str) {
        this.benefBic = str;
    }

    public void setBenefName(String str) {
        this.benefName = str;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setDocKey(long j) {
        this.docKey = j;
    }

    public void setDocType(String str) {
        this.docType = str;
    }

    public void setDstAcctKey(long j) {
        this.dstAcctKey = j;
    }

    public void setInpSysDate(long j) {
        this.inpSysDate = j;
    }

    public void setIntermediarBankBic(String str) {
        this.intermediarBankBic = str;
    }

    public void setIntermediarBankName(String str) {
        this.intermediarBankName = str;
    }

    public void setNomination(String str) {
        this.nomination = str;
    }

    public void setPostDate(long j) {
        this.postDate = j;
    }

    public void setProdGroup(String str) {
        this.prodGroup = str;
    }

    public void setSenderAcctNo(String str) {
        this.senderAcctNo = str;
    }

    public void setSenderBankNameEn(String str) {
        this.senderBankNameEn = str;
    }

    public void setSenderBankNameGe(String str) {
        this.senderBankNameGe = str;
    }

    public void setSenderBic(String str) {
        this.senderBic = str;
    }

    public void setSenderName(String str) {
        this.senderName = str;
    }

    public void setSrcAcctKey(long j) {
        this.srcAcctKey = j;
    }
}
