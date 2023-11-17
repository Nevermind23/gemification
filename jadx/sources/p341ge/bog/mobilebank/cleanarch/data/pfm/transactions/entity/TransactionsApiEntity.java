package p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsApiEntity */
public final class TransactionsApiEntity {
    private final List<TransactionApiEntity> data;
    private final Long limit;
    private final String offset;
    private final Long size;
    private final Long statementId;

    public TransactionsApiEntity() {
        this((Long) null, (String) null, (Long) null, (Long) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TransactionsApiEntity copy$default(TransactionsApiEntity transactionsApiEntity, Long l, String str, Long l2, Long l3, List<TransactionApiEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = transactionsApiEntity.size;
        }
        if ((i & 2) != 0) {
            str = transactionsApiEntity.offset;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            l2 = transactionsApiEntity.limit;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            l3 = transactionsApiEntity.statementId;
        }
        Long l5 = l3;
        if ((i & 16) != 0) {
            list = transactionsApiEntity.data;
        }
        return transactionsApiEntity.copy(l, str2, l4, l5, list);
    }

    public final Long component1() {
        return this.size;
    }

    public final String component2() {
        return this.offset;
    }

    public final Long component3() {
        return this.limit;
    }

    public final Long component4() {
        return this.statementId;
    }

    public final List<TransactionApiEntity> component5() {
        return this.data;
    }

    public final TransactionsApiEntity copy(Long l, String str, Long l2, Long l3, List<TransactionApiEntity> list) {
        return new TransactionsApiEntity(l, str, l2, l3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionsApiEntity)) {
            return false;
        }
        TransactionsApiEntity transactionsApiEntity = (TransactionsApiEntity) obj;
        return C41536l.m120484d(this.size, transactionsApiEntity.size) && C41536l.m120484d(this.offset, transactionsApiEntity.offset) && C41536l.m120484d(this.limit, transactionsApiEntity.limit) && C41536l.m120484d(this.statementId, transactionsApiEntity.statementId) && C41536l.m120484d(this.data, transactionsApiEntity.data);
    }

    public final List<TransactionApiEntity> getData() {
        return this.data;
    }

    public final Long getLimit() {
        return this.limit;
    }

    public final String getOffset() {
        return this.offset;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Long getStatementId() {
        return this.statementId;
    }

    public int hashCode() {
        Long l = this.size;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.offset;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.limit;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.statementId;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List<TransactionApiEntity> list = this.data;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Long l = this.size;
        String str = this.offset;
        Long l2 = this.limit;
        Long l3 = this.statementId;
        List<TransactionApiEntity> list = this.data;
        return "TransactionsApiEntity(size=" + l + ", offset=" + str + ", limit=" + l2 + ", statementId=" + l3 + ", data=" + list + ")";
    }

    public TransactionsApiEntity(Long l, String str, Long l2, Long l3, List<TransactionApiEntity> list) {
        this.size = l;
        this.offset = str;
        this.limit = l2;
        this.statementId = l3;
        this.data = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TransactionsApiEntity(java.lang.Long r5, java.lang.String r6, java.lang.Long r7, java.lang.Long r8, java.util.List r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsApiEntity.<init>(java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
