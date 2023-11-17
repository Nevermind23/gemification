package p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryAddResponse */
public final class TransactionCategoryAddResponse {
    private final TransactionCategoryEntity pfmData;

    public TransactionCategoryAddResponse(TransactionCategoryEntity transactionCategoryEntity) {
        C41536l.m120489i(transactionCategoryEntity, "pfmData");
        this.pfmData = transactionCategoryEntity;
    }

    public static /* synthetic */ TransactionCategoryAddResponse copy$default(TransactionCategoryAddResponse transactionCategoryAddResponse, TransactionCategoryEntity transactionCategoryEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionCategoryEntity = transactionCategoryAddResponse.pfmData;
        }
        return transactionCategoryAddResponse.copy(transactionCategoryEntity);
    }

    public final TransactionCategoryEntity component1() {
        return this.pfmData;
    }

    public final TransactionCategoryAddResponse copy(TransactionCategoryEntity transactionCategoryEntity) {
        C41536l.m120489i(transactionCategoryEntity, "pfmData");
        return new TransactionCategoryAddResponse(transactionCategoryEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransactionCategoryAddResponse) && C41536l.m120484d(this.pfmData, ((TransactionCategoryAddResponse) obj).pfmData);
    }

    public final TransactionCategoryEntity getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        return this.pfmData.hashCode();
    }

    public String toString() {
        TransactionCategoryEntity transactionCategoryEntity = this.pfmData;
        return "TransactionCategoryAddResponse(pfmData=" + transactionCategoryEntity + ")";
    }
}
