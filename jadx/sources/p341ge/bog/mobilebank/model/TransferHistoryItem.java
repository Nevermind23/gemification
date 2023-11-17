package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import java.util.List;
import org.parceler.Parcel;
import p277ua.C8662a;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.TransferHistoryItem */
public class TransferHistoryItem {
    @C8662a
    @C8664c("additionalInfo")
    public String additionalInfo;
    @C8662a
    @C8664c("amount")
    public BigDecimal amount;
    @C8662a
    @C8664c("benefAcctNo")
    public String benefAcctNo;
    @C8662a
    @C8664c("benefAddress")
    public String benefAddress;
    @C8664c("benefBic")
    public String benefBic;
    @C8662a
    @C8664c("benefCity")
    public String benefCity;
    @C8662a
    @C8664c("benefClientShort")
    public String benefClientShort;
    @C8662a
    @C8664c("benefCountry")
    public String benefCountry;
    @C8662a
    @C8664c("benefInn")
    public String benefInn;
    @C8662a
    @C8664c("benefName")
    public String benefName;
    @C8662a
    @C8664c("benefNameTmp")
    public String benefNameTmp;
    public String benefProfilePicture;
    @C8662a
    @C8664c("ccy")
    public String ccy;
    @C8662a
    @C8664c("clientKey")
    public long clientKey;
    @C8662a
    @C8664c("dispatchType")
    public String dispatchType;
    @C8662a
    @C8664c("docKey")
    public long docKey;
    @C8662a
    @C8664c("docNo")
    public String docNo;
    @C8662a
    @C8664c("docStatus")
    public String docStatus;
    @C8662a
    @C8664c("docType")
    public String docType;
    @C8662a
    @C8664c("dstAcctKey")
    public long dstAcctKey;
    @C8662a
    @C8664c("dstAcctName")
    public String dstAcctName;
    @C8662a
    @C8664c("dstAcctNo")
    public String dstAcctNo;
    @C8662a
    @C8664c("dstAcctTypeKey")
    public String dstAcctTypeKey;
    @C8662a
    @C8664c("entryId")
    public long entryId;
    @C8662a
    @C8664c("information")
    public String information;
    @C8662a
    @C8664c("inpSysDate")
    protected long inpSysDate;
    @C8662a
    @C8664c("intermediarName")
    public String intermediarName;
    @C8662a
    @C8664c("nomination")
    public String nomination;
    TransactionCategoryModel parentCategory;
    @C8662a
    @C8664c("payerInn")
    public String payerInn;
    @C8662a
    @C8664c("payerName")
    public String payerName;
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
    @C8664c("pfmProviderStatusId")
    public String pfmProviderStatusId;
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
    @C8662a
    @C8664c("prodGroup")
    public String prodGroup;
    @C8662a
    @C8664c("prodType")
    public String prodType;
    @C8662a
    @C8664c("rate")
    public BigDecimal rate;
    @C8662a
    @C8664c("regReportingCode")
    public String regReportingCode;
    @C8662a
    @C8664c("srcAcctKey")
    public long srcAcctKey;
    @C8662a
    @C8664c("srcAcctName")
    public String srcAcctName;
    @C8662a
    @C8664c("srcAcctNo")
    public String srcAcctNo;
    @C8662a
    @C8664c("srcAcctTypeKey")
    public String srcAcctTypeKey;
    TransactionCategoryModel transactionCategory;
    @C8662a
    @C8664c("treasureCode")
    public String treasureCode;
    @C8662a
    @C8664c("valueDate")
    public Long valueDate;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getBenefAcctNo() {
        return this.benefAcctNo;
    }

    public String getBenefAddress() {
        return this.benefAddress;
    }

    public String getBenefBic() {
        return this.benefBic;
    }

    public String getBenefCity() {
        return this.benefCity;
    }

    public String getBenefClientShort() {
        return this.benefClientShort;
    }

    public String getBenefCountry() {
        return this.benefCountry;
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

    public String getDisplayAcctNo() {
        if (getBenefAcctNo() != null) {
            return getBenefAcctNo();
        }
        return getDstAcctNo();
    }

    public String getDisplayName() {
        if (getBenefName() != null) {
            return getBenefName();
        }
        if (getBenefAcctNo() != null) {
            return getBenefAcctNo();
        }
        return getDstAcctName();
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

    public String getDstAcctName() {
        return this.dstAcctName;
    }

    public String getDstAcctNo() {
        return this.dstAcctNo;
    }

    public long getEntryId() {
        return this.entryId;
    }

    public String getFullCategoryName() {
        StringBuilder sb = new StringBuilder("");
        TransactionCategoryModel transactionCategoryModel = this.parentCategory;
        if (transactionCategoryModel != null) {
            sb.append(transactionCategoryModel.mo55082g());
        }
        if (this.transactionCategory != null) {
            sb.append(" > ");
            sb.append(this.transactionCategory.mo55082g());
        }
        return sb.toString();
    }

    public long getInpSysDate() {
        return this.inpSysDate;
    }

    public String getIntermediarName() {
        return this.intermediarName;
    }

    public String getNomination() {
        return this.nomination;
    }

    public long getOperationDate() {
        long j = this.inpSysDate;
        if (j > 0) {
            return j;
        }
        return this.valueDate.longValue();
    }

    public TransactionCategoryModel getParentCategory() {
        return this.parentCategory;
    }

    public Long getPfmCatId() {
        return this.pfmCatId;
    }

    public TransactionCategoryModel getPfmCategory() {
        TransactionCategoryModel transactionCategoryModel = this.transactionCategory;
        return transactionCategoryModel != null ? transactionCategoryModel : this.parentCategory;
    }

    public Long getPfmId() {
        return this.pfmId;
    }

    public Long getPfmParentCatId() {
        return this.pfmParentCatId;
    }

    public String getProdType() {
        return this.prodType;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public String getRegReportingCode() {
        return this.regReportingCode;
    }

    public long getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public String getSrcAcctName() {
        return this.srcAcctName;
    }

    public String getSrcAcctNo() {
        return this.srcAcctNo;
    }

    public TransactionCategoryModel getTransactionCategory() {
        return this.transactionCategory;
    }

    public String getTransferInitials() {
        String displayName = getDisplayName();
        String str = "";
        if (displayName != null && displayName.split(" ") != null) {
            int i = 0;
            for (String str2 : displayName.split(" ")) {
                i++;
                if (str2.length() > 0) {
                    str = str + str2.substring(0, 1);
                }
                if (i == 2) {
                    break;
                }
            }
        }
        return str;
    }

    public String getTreasureCode() {
        return this.treasureCode;
    }

    public Long getValueDate() {
        return this.valueDate;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setBenefAddress(String str) {
        this.benefAddress = str;
    }

    public void setBenefCity(String str) {
        this.benefCity = str;
    }

    public void setBenefClientShort(String str) {
        this.benefClientShort = str;
    }

    public void setBenefCountry(String str) {
        this.benefCountry = str;
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

    public void setDstAcctName(String str) {
        this.dstAcctName = str;
    }

    public void setInpSysDate(long j) {
        this.inpSysDate = j;
    }

    public void setParentCategory(TransactionCategoryModel transactionCategoryModel) {
        this.parentCategory = transactionCategoryModel;
    }

    public void setPfmCatId(Long l) {
        this.pfmCatId = l;
    }

    public void setPfmId(Long l) {
        this.pfmId = l;
    }

    public void setPfmParentCatId(Long l) {
        this.pfmParentCatId = l;
    }

    public void setProdType(String str) {
        this.prodType = str;
    }

    public void setRate(BigDecimal bigDecimal) {
        this.rate = bigDecimal;
    }

    public void setRegReportingCode(String str) {
        this.regReportingCode = str;
    }

    public void setTransactionCategory(TransactionCategoryModel transactionCategoryModel) {
        this.transactionCategory = transactionCategoryModel;
    }
}
