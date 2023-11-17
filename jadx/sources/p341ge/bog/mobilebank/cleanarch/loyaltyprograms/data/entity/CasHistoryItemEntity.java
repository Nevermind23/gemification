package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.CasHistoryItemEntity */
public final class CasHistoryItemEntity {
    private final BigDecimal amount;
    private final String ccy;
    private final String monthDictionaryKey;
    private final int operationCount;
    private final int orderNo;

    public CasHistoryItemEntity() {
        this(0, (String) null, 0, (BigDecimal) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CasHistoryItemEntity copy$default(CasHistoryItemEntity casHistoryItemEntity, int i, String str, int i2, BigDecimal bigDecimal, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = casHistoryItemEntity.orderNo;
        }
        if ((i3 & 2) != 0) {
            str = casHistoryItemEntity.monthDictionaryKey;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            i2 = casHistoryItemEntity.operationCount;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            bigDecimal = casHistoryItemEntity.amount;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i3 & 16) != 0) {
            str2 = casHistoryItemEntity.ccy;
        }
        return casHistoryItemEntity.copy(i, str3, i4, bigDecimal2, str2);
    }

    public final int component1() {
        return this.orderNo;
    }

    public final String component2() {
        return this.monthDictionaryKey;
    }

    public final int component3() {
        return this.operationCount;
    }

    public final BigDecimal component4() {
        return this.amount;
    }

    public final String component5() {
        return this.ccy;
    }

    public final CasHistoryItemEntity copy(int i, String str, int i2, BigDecimal bigDecimal, String str2) {
        return new CasHistoryItemEntity(i, str, i2, bigDecimal, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasHistoryItemEntity)) {
            return false;
        }
        CasHistoryItemEntity casHistoryItemEntity = (CasHistoryItemEntity) obj;
        return this.orderNo == casHistoryItemEntity.orderNo && C41536l.m120484d(this.monthDictionaryKey, casHistoryItemEntity.monthDictionaryKey) && this.operationCount == casHistoryItemEntity.operationCount && C41536l.m120484d(this.amount, casHistoryItemEntity.amount) && C41536l.m120484d(this.ccy, casHistoryItemEntity.ccy);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getMonthDictionaryKey() {
        return this.monthDictionaryKey;
    }

    public final int getOperationCount() {
        return this.operationCount;
    }

    public final int getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        int i = this.orderNo * 31;
        String str = this.monthDictionaryKey;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.operationCount) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.ccy;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        int i = this.orderNo;
        String str = this.monthDictionaryKey;
        int i2 = this.operationCount;
        BigDecimal bigDecimal = this.amount;
        String str2 = this.ccy;
        return "CasHistoryItemEntity(orderNo=" + i + ", monthDictionaryKey=" + str + ", operationCount=" + i2 + ", amount=" + bigDecimal + ", ccy=" + str2 + ")";
    }

    public CasHistoryItemEntity(int i, String str, int i2, BigDecimal bigDecimal, String str2) {
        this.orderNo = i;
        this.monthDictionaryKey = str;
        this.operationCount = i2;
        this.amount = bigDecimal;
        this.ccy = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CasHistoryItemEntity(int r5, java.lang.String r6, int r7, java.math.BigDecimal r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
            r1 = 0
            if (r5 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r6
        L_0x0010:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r1
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r1
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r2
            r8 = r0
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.CasHistoryItemEntity.<init>(int, java.lang.String, int, java.math.BigDecimal, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
