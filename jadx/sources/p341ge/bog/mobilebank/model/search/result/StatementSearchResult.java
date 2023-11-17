package p341ge.bog.mobilebank.model.search.result;

import g91.C32303f;
import g91.C32319m;
import hd0.C24978b;
import java.math.BigDecimal;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.model.search.SearchResultObject;

/* renamed from: ge.bog.mobilebank.model.search.result.StatementSearchResult */
public class StatementSearchResult extends SearchResultObject {
    private long acctKey;
    private BigDecimal amount;
    private String benefProfilePicture;
    private String ccy;
    private long docKey;
    private long entryId;
    private String essId;
    private C24978b hasTransferBack;
    private boolean isDDSTOAlllowed;
    private boolean isPrintAllowed;
    private boolean isRepeatAllowed;
    private boolean isStatementAllowed;
    private boolean isTemplateAllowed;
    private String language;
    private String nomination;
    @C8664c("operationTitle")
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
    private long statmentId;
    private TransactionCategoryModel transactionCategory;

    public Long getAcctKey() {
        return Long.valueOf(this.acctKey);
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public int getCategoryColor() {
        TransactionCategoryModel transactionCategoryModel = this.transactionCategory;
        if (transactionCategoryModel != null) {
            return transactionCategoryModel.mo55081f();
        }
        TransactionCategoryModel transactionCategoryModel2 = this.parentCategory;
        if (transactionCategoryModel2 != null) {
            return transactionCategoryModel2.mo55081f();
        }
        return -1;
    }

    public String getCcy() {
        return this.ccy;
    }

    public Long getDocKey() {
        return Long.valueOf(this.docKey);
    }

    public Long getEntryId() {
        return Long.valueOf(this.entryId);
    }

    public String getEssId() {
        return this.essId;
    }

    public String getFooterText() {
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

    public String getHeaderText() {
        return C32319m.m95295b(this.postDate);
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLogo() {
        return this.benefProfilePicture;
    }

    public String getMiddleText() {
        return this.operationTitle;
    }

    public String getOperationTitle() {
        return this.operationTitle;
    }

    public Long getPfmCatId() {
        return this.pfmCatId;
    }

    public String getPfmCatName() {
        return this.pfmCatName;
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

    public String getRightText() {
        return C32303f.m95203n(this.amount.negate(), this.ccy);
    }

    public String getSearchResultId() {
        return String.valueOf(this.statmentId);
    }

    public boolean hasTransferBack() {
        return this.hasTransferBack == C24978b.YES;
    }

    public boolean isDDSTOAlllowed() {
        return this.isDDSTOAlllowed;
    }

    public boolean isPfmComputable() {
        return this.pfmComputable;
    }

    public boolean isPrintAllowed() {
        return this.isPrintAllowed;
    }

    public boolean isRepeatAllowed() {
        return this.isRepeatAllowed;
    }

    public boolean isStatementAllowed() {
        return this.isStatementAllowed;
    }

    public boolean isTemplateAllowed() {
        return this.isTemplateAllowed;
    }

    public void setAcctKey(Long l) {
        this.acctKey = l.longValue();
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setDocKey(Long l) {
        this.docKey = l.longValue();
    }

    public void setEntryId(Long l) {
        this.entryId = l.longValue();
    }

    public void setLanguage(String str) {
        this.language = str;
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

    public void setTransactionCategory(TransactionCategoryModel transactionCategoryModel) {
        this.transactionCategory = transactionCategoryModel;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setDocKey(long j) {
        this.docKey = j;
    }

    public void setEntryId(long j) {
        this.entryId = j;
    }
}
