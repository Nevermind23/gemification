package p341ge.bog.mobilebank.model.payment;

import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.Parcel;
import p277ua.C8664c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.model.KeyValue;
import r90.C27954d;

@Parcel
/* renamed from: ge.bog.mobilebank.model.payment.LastOperation */
public class LastOperation {
    @C8664c("essPaymentId")
    protected String essPaymentId;
    @C8664c("logo")
    protected String logo;
    @C8664c("operationDate")
    public Long operationDate;
    @C8664c("parameters")
    protected ArrayList<KeyValue> parameters;
    TransactionCategoryModel parentCategory;
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
    @C8664c("postDate")
    protected Long postDate;
    @C8664c("serviceId")
    protected String serviceId;
    TransactionCategoryModel transactionCategory;

    public String getEssPaymentId() {
        return this.essPaymentId;
    }

    /* access modifiers changed from: package-private */
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

    public String getLogo() {
        PaymentProviderConfiguration g;
        if (this.logo != null || (g = C27954d.m86301g(getServiceId())) == null) {
            return this.logo;
        }
        return g.getLogo();
    }

    public ArrayList<KeyValue> getParameters() {
        return this.parameters;
    }

    public TransactionCategoryModel getParentCategory() {
        return this.parentCategory;
    }

    public Long getPfmCatId() {
        return this.pfmCatId;
    }

    /* access modifiers changed from: package-private */
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

    public Long getPostDate() {
        return this.postDate;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public TransactionCategoryModel getTransactionCategory() {
        return this.transactionCategory;
    }

    public String getValueByKey(String str) {
        ArrayList<KeyValue> arrayList = this.parameters;
        if (arrayList == null) {
            return null;
        }
        Iterator<KeyValue> it = arrayList.iterator();
        while (it.hasNext()) {
            KeyValue next = it.next();
            if (next.getKey() != null && next.getKey().equals(str)) {
                return next.getValue();
            }
        }
        return null;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public void setParameters(ArrayList<KeyValue> arrayList) {
        this.parameters = arrayList;
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

    public void setServiceId(String str) {
        this.serviceId = str;
    }

    public void setTransactionCategory(TransactionCategoryModel transactionCategoryModel) {
        this.transactionCategory = transactionCategoryModel;
    }
}
