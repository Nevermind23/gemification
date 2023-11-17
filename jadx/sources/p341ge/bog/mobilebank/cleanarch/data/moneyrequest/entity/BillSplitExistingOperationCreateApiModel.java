package p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity;

import androidx.annotation.Keep;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.BillSplitExistingOperationCreateApiModel */
public final class BillSplitExistingOperationCreateApiModel {
    private final long docKey;
    private final long entryId;

    public BillSplitExistingOperationCreateApiModel(long j, long j2) {
        this.docKey = j;
        this.entryId = j2;
    }

    public static /* synthetic */ BillSplitExistingOperationCreateApiModel copy$default(BillSplitExistingOperationCreateApiModel billSplitExistingOperationCreateApiModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = billSplitExistingOperationCreateApiModel.docKey;
        }
        if ((i & 2) != 0) {
            j2 = billSplitExistingOperationCreateApiModel.entryId;
        }
        return billSplitExistingOperationCreateApiModel.copy(j, j2);
    }

    public final long component1() {
        return this.docKey;
    }

    public final long component2() {
        return this.entryId;
    }

    public final BillSplitExistingOperationCreateApiModel copy(long j, long j2) {
        return new BillSplitExistingOperationCreateApiModel(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillSplitExistingOperationCreateApiModel)) {
            return false;
        }
        BillSplitExistingOperationCreateApiModel billSplitExistingOperationCreateApiModel = (BillSplitExistingOperationCreateApiModel) obj;
        return this.docKey == billSplitExistingOperationCreateApiModel.docKey && this.entryId == billSplitExistingOperationCreateApiModel.entryId;
    }

    public final long getDocKey() {
        return this.docKey;
    }

    public final long getEntryId() {
        return this.entryId;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.docKey) * 31) + C7397t.m28148a(this.entryId);
    }

    public String toString() {
        long j = this.docKey;
        long j2 = this.entryId;
        return "BillSplitExistingOperationCreateApiModel(docKey=" + j + ", entryId=" + j2 + ")";
    }
}
