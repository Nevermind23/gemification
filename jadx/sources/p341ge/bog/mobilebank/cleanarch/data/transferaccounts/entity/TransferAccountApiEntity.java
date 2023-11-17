package p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountApiEntity */
public final class TransferAccountApiEntity {
    private final BigDecimal amountLimit;
    private final List<TransferAccountItemApiEntity> dst;
    private final List<TransferAccountItemApiEntity> src;

    public TransferAccountApiEntity() {
        this((List) null, (List) null, (BigDecimal) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TransferAccountApiEntity copy$default(TransferAccountApiEntity transferAccountApiEntity, List<TransferAccountItemApiEntity> list, List<TransferAccountItemApiEntity> list2, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transferAccountApiEntity.src;
        }
        if ((i & 2) != 0) {
            list2 = transferAccountApiEntity.dst;
        }
        if ((i & 4) != 0) {
            bigDecimal = transferAccountApiEntity.amountLimit;
        }
        return transferAccountApiEntity.copy(list, list2, bigDecimal);
    }

    public final List<TransferAccountItemApiEntity> component1() {
        return this.src;
    }

    public final List<TransferAccountItemApiEntity> component2() {
        return this.dst;
    }

    public final BigDecimal component3() {
        return this.amountLimit;
    }

    public final TransferAccountApiEntity copy(List<TransferAccountItemApiEntity> list, List<TransferAccountItemApiEntity> list2, BigDecimal bigDecimal) {
        return new TransferAccountApiEntity(list, list2, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferAccountApiEntity)) {
            return false;
        }
        TransferAccountApiEntity transferAccountApiEntity = (TransferAccountApiEntity) obj;
        return C41536l.m120484d(this.src, transferAccountApiEntity.src) && C41536l.m120484d(this.dst, transferAccountApiEntity.dst) && C41536l.m120484d(this.amountLimit, transferAccountApiEntity.amountLimit);
    }

    public final BigDecimal getAmountLimit() {
        return this.amountLimit;
    }

    public final List<TransferAccountItemApiEntity> getDst() {
        return this.dst;
    }

    public final List<TransferAccountItemApiEntity> getSrc() {
        return this.src;
    }

    public int hashCode() {
        List<TransferAccountItemApiEntity> list = this.src;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TransferAccountItemApiEntity> list2 = this.dst;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        BigDecimal bigDecimal = this.amountLimit;
        if (bigDecimal != null) {
            i = bigDecimal.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        List<TransferAccountItemApiEntity> list = this.src;
        List<TransferAccountItemApiEntity> list2 = this.dst;
        BigDecimal bigDecimal = this.amountLimit;
        return "TransferAccountApiEntity(src=" + list + ", dst=" + list2 + ", amountLimit=" + bigDecimal + ")";
    }

    public TransferAccountApiEntity(List<TransferAccountItemApiEntity> list, List<TransferAccountItemApiEntity> list2, BigDecimal bigDecimal) {
        this.src = list;
        this.dst = list2;
        this.amountLimit = bigDecimal;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferAccountApiEntity(List list, List list2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : bigDecimal);
    }
}
