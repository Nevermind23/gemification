package p341ge.bog.mobilebank.model.account;

import hd0.C24978b;
import java.math.BigDecimal;
import org.parceler.Parcel;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.model.payment.DeviceType;

@Parcel
/* renamed from: ge.bog.mobilebank.model.account.AccountOperation */
public class AccountOperation {
    private BigDecimal amount;
    @C8664c("hasTransferBack")
    private C24978b backTransferAllowed;
    private String benefProfilePicture;
    private BigDecimal bonusPoint;
    private String bonusPointType;
    private boolean canSplit;
    private BigDecimal cashbackAmount;
    private String ccy;
    private DeviceType deviceType;
    private long docKey;
    private String entryGroupDKey;
    @C8664c("entryId")
    private long entryId;
    private String essId;
    private String essServiceId;
    private String groupImageUrl;
    private String imageUrl;
    private boolean isDDSTOAlllowed;
    private String isPrintable;
    private boolean isRepeatAllowed;
    private boolean isReversalAvailable;
    private boolean isTemplateAllowed;
    private String merchantName;
    private String merchantNameInt;
    private String nomination;
    private long operationDate;
    private String operationTitle;
    private TransactionCategoryModel parentCategory;
    private Long pfmCatId;
    private String pfmCatName;
    private boolean pfmComputable;
    private String pfmForecast;
    private Long pfmId;
    private Long pfmParentCatId;
    private String pfmParentCatName;
    private Long pfmParentOpId;
    private String pfmRecurring;
    private String pfmSplit;
    private Long pfmTagId;
    private String pfmTagName;
    private long postDate;
    private String printFormType;
    private String status;
    private TransactionCategoryModel transactionCategory;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public C24978b getBackTransferAllowed() {
        return this.backTransferAllowed;
    }

    public String getBenefProfilePicture() {
        return this.benefProfilePicture;
    }

    public BigDecimal getBonusPoint() {
        return this.bonusPoint;
    }

    public String getBonusPointType() {
        return this.bonusPointType;
    }

    public BigDecimal getCashbackAmount() {
        return this.cashbackAmount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public DeviceType getDeviceType() {
        return this.deviceType;
    }

    public long getDocKey() {
        return this.docKey;
    }

    public String getEntryGroupDKey() {
        return this.entryGroupDKey;
    }

    public long getEntryId() {
        return this.entryId;
    }

    public String getEssId() {
        return this.essId;
    }

    public String getEssServiceId() {
        return this.essServiceId;
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

    public String getGroupImageUrl() {
        return "NOTINT";
    }

    public String getImageUrl(boolean z) {
        String str;
        if (!z || (str = this.benefProfilePicture) == null) {
            return this.imageUrl;
        }
        return str;
    }

    public String getIsPrintable() {
        return this.isPrintable;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantNameByLocale(Boolean bool) {
        return bool.booleanValue() ? this.merchantName : this.merchantNameInt;
    }

    public String getMerchantNameInt() {
        return this.merchantNameInt;
    }

    public String getNomination() {
        return this.nomination;
    }

    public long getOperationDate() {
        return this.operationDate;
    }

    public String getOperationTitle() {
        return this.operationTitle;
    }

    public TransactionCategoryModel getParentCategory() {
        return this.parentCategory;
    }

    public Long getPfmCatId() {
        return this.pfmCatId;
    }

    public String getPfmCatName() {
        return this.pfmCatName;
    }

    public TransactionCategoryModel getPfmCategory() {
        TransactionCategoryModel transactionCategoryModel = this.transactionCategory;
        return transactionCategoryModel != null ? transactionCategoryModel : this.parentCategory;
    }

    public String getPfmForecast() {
        return this.pfmForecast;
    }

    public Long getPfmId() {
        return this.pfmId;
    }

    public Long getPfmParentCatId() {
        return this.pfmParentCatId;
    }

    public String getPfmParentCatName() {
        return this.pfmParentCatName;
    }

    public Long getPfmParentOpId() {
        return this.pfmParentOpId;
    }

    public String getPfmRecurring() {
        return this.pfmRecurring;
    }

    public String getPfmSplit() {
        return this.pfmSplit;
    }

    public Long getPfmTagId() {
        return this.pfmTagId;
    }

    public String getPfmTagName() {
        return this.pfmTagName;
    }

    public long getPostDate() {
        return this.postDate;
    }

    public String getPrintFormType() {
        return this.printFormType;
    }

    public String getStatus() {
        return this.status;
    }

    public TransactionCategoryModel getTransactionCategory() {
        return this.transactionCategory;
    }

    public boolean isBackTransferAllowedBool() {
        C24978b bVar = this.backTransferAllowed;
        return bVar != null && bVar.equals(C24978b.YES);
    }

    public boolean isCanSplit() {
        return this.canSplit;
    }

    public boolean isDDSTOAlllowed() {
        return this.isDDSTOAlllowed;
    }

    public boolean isPfmComputable() {
        return this.pfmComputable;
    }

    public boolean isPrintableBool() {
        return "Y".equals(this.isPrintable);
    }

    public boolean isRepeatAllowed() {
        return this.isRepeatAllowed;
    }

    public boolean isReversalAvailable() {
        return this.isReversalAvailable;
    }

    public boolean isTemplateAllowed() {
        return this.isTemplateAllowed;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setBackTransferAllowed(C24978b bVar) {
        this.backTransferAllowed = bVar;
    }

    public void setBenefProfilePicture(String str) {
        this.benefProfilePicture = str;
    }

    public void setBonusPoint(BigDecimal bigDecimal) {
        this.bonusPoint = bigDecimal;
    }

    public void setBonusPointType(String str) {
        this.bonusPointType = str;
    }

    public void setCanSplit(boolean z) {
        this.canSplit = z;
    }

    public void setCashbackAmount(BigDecimal bigDecimal) {
        this.cashbackAmount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setDDSTOAlllowed(boolean z) {
        this.isDDSTOAlllowed = z;
    }

    public void setDeviceType(DeviceType deviceType2) {
        this.deviceType = deviceType2;
    }

    public void setDocKey(long j) {
        this.docKey = j;
    }

    public void setEntryGroupDKey(String str) {
        this.entryGroupDKey = str;
    }

    public void setEntryId(long j) {
        this.entryId = j;
    }

    public void setEssId(String str) {
        this.essId = str;
    }

    public void setEssServiceId(String str) {
        this.essServiceId = str;
    }

    public void setGroupImageUrl(String str) {
        this.groupImageUrl = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setIsDDSTOAllowed(boolean z) {
        this.isDDSTOAlllowed = z;
    }

    public void setIsPrintable(String str) {
        this.isPrintable = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setMerchantNameInt(String str) {
        this.merchantNameInt = str;
    }

    public void setNomination(String str) {
        this.nomination = str;
    }

    public void setOperationDate(long j) {
        this.operationDate = j;
    }

    public void setOperationTitle(String str) {
        this.operationTitle = str;
    }

    public void setParentCategory(TransactionCategoryModel transactionCategoryModel) {
        this.parentCategory = transactionCategoryModel;
    }

    public void setPfmCatId(Long l) {
        this.pfmCatId = l;
    }

    public void setPfmCatName(String str) {
        this.pfmCatName = str;
    }

    public void setPfmComputable(boolean z) {
        this.pfmComputable = z;
    }

    public void setPfmForecast(String str) {
        this.pfmForecast = str;
    }

    public void setPfmId(Long l) {
        this.pfmId = l;
    }

    public void setPfmParentCatId(Long l) {
        this.pfmParentCatId = l;
    }

    public void setPfmParentCatName(String str) {
        this.pfmParentCatName = str;
    }

    public void setPfmParentOpId(Long l) {
        this.pfmParentOpId = l;
    }

    public void setPfmRecurring(String str) {
        this.pfmRecurring = str;
    }

    public void setPfmSplit(String str) {
        this.pfmSplit = str;
    }

    public void setPfmTagId(Long l) {
        this.pfmTagId = l;
    }

    public void setPfmTagName(String str) {
        this.pfmTagName = str;
    }

    public void setPostDate(long j) {
        this.postDate = j;
    }

    public void setPrintFormType(String str) {
        this.printFormType = str;
    }

    public void setRepeatAllowed(boolean z) {
        this.isRepeatAllowed = z;
    }

    public void setReversalAvailable(boolean z) {
        this.isReversalAvailable = z;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTemplateAllowed(boolean z) {
        this.isTemplateAllowed = z;
    }

    public void setTransactionCategory(TransactionCategoryModel transactionCategoryModel) {
        this.transactionCategory = transactionCategoryModel;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
}
