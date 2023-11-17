package p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryResponse */
public final class TransactionCategoryResponse {
    private final long hashCode;
    private final List<TransactionCategoryEntity> pfmData;

    public TransactionCategoryResponse(long j, List<TransactionCategoryEntity> list) {
        this.hashCode = j;
        this.pfmData = list;
    }

    public static /* synthetic */ TransactionCategoryResponse copy$default(TransactionCategoryResponse transactionCategoryResponse, long j, List<TransactionCategoryEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = transactionCategoryResponse.hashCode;
        }
        if ((i & 2) != 0) {
            list = transactionCategoryResponse.pfmData;
        }
        return transactionCategoryResponse.copy(j, list);
    }

    public final long component1() {
        return this.hashCode;
    }

    public final List<TransactionCategoryEntity> component2() {
        return this.pfmData;
    }

    public final TransactionCategoryResponse copy(long j, List<TransactionCategoryEntity> list) {
        return new TransactionCategoryResponse(j, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionCategoryResponse)) {
            return false;
        }
        TransactionCategoryResponse transactionCategoryResponse = (TransactionCategoryResponse) obj;
        return this.hashCode == transactionCategoryResponse.hashCode && C41536l.m120484d(this.pfmData, transactionCategoryResponse.pfmData);
    }

    public final long getHashCode() {
        return this.hashCode;
    }

    public final List<TransactionCategoryEntity> getPfmData() {
        return this.pfmData;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.hashCode) * 31;
        List<TransactionCategoryEntity> list = this.pfmData;
        return a + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        long j = this.hashCode;
        List<TransactionCategoryEntity> list = this.pfmData;
        return "TransactionCategoryResponse(hashCode=" + j + ", pfmData=" + list + ")";
    }
}
