package p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity;

import androidx.annotation.Keep;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MyOperationCreateApiModel */
public final class MyOperationCreateApiModel {
    private final long docKey;
    private final long entryId;

    public MyOperationCreateApiModel(long j, long j2) {
        this.docKey = j;
        this.entryId = j2;
    }

    public static /* synthetic */ MyOperationCreateApiModel copy$default(MyOperationCreateApiModel myOperationCreateApiModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = myOperationCreateApiModel.docKey;
        }
        if ((i & 2) != 0) {
            j2 = myOperationCreateApiModel.entryId;
        }
        return myOperationCreateApiModel.copy(j, j2);
    }

    public final long component1() {
        return this.docKey;
    }

    public final long component2() {
        return this.entryId;
    }

    public final MyOperationCreateApiModel copy(long j, long j2) {
        return new MyOperationCreateApiModel(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyOperationCreateApiModel)) {
            return false;
        }
        MyOperationCreateApiModel myOperationCreateApiModel = (MyOperationCreateApiModel) obj;
        return this.docKey == myOperationCreateApiModel.docKey && this.entryId == myOperationCreateApiModel.entryId;
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
        return "MyOperationCreateApiModel(docKey=" + j + ", entryId=" + j2 + ")";
    }
}
