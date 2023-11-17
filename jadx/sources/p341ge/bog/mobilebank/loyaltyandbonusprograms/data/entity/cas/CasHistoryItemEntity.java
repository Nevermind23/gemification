package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasHistoryItemEntity */
public final class CasHistoryItemEntity {
    private final double amount;
    private final String ccy;
    private final String monthDictionaryKey;
    private final int operationCount;
    private final int orderNo;

    public CasHistoryItemEntity(int i, String str, int i2, double d, String str2) {
        C41536l.m120489i(str, "monthDictionaryKey");
        this.orderNo = i;
        this.monthDictionaryKey = str;
        this.operationCount = i2;
        this.amount = d;
        this.ccy = str2;
    }

    public static /* synthetic */ CasHistoryItemEntity copy$default(CasHistoryItemEntity casHistoryItemEntity, int i, String str, int i2, double d, String str2, int i3, Object obj) {
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
            d = casHistoryItemEntity.amount;
        }
        double d2 = d;
        if ((i3 & 16) != 0) {
            str2 = casHistoryItemEntity.ccy;
        }
        return casHistoryItemEntity.copy(i, str3, i4, d2, str2);
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

    public final double component4() {
        return this.amount;
    }

    public final String component5() {
        return this.ccy;
    }

    public final CasHistoryItemEntity copy(int i, String str, int i2, double d, String str2) {
        C41536l.m120489i(str, "monthDictionaryKey");
        return new CasHistoryItemEntity(i, str, i2, d, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasHistoryItemEntity)) {
            return false;
        }
        CasHistoryItemEntity casHistoryItemEntity = (CasHistoryItemEntity) obj;
        return this.orderNo == casHistoryItemEntity.orderNo && C41536l.m120484d(this.monthDictionaryKey, casHistoryItemEntity.monthDictionaryKey) && this.operationCount == casHistoryItemEntity.operationCount && Double.compare(this.amount, casHistoryItemEntity.amount) == 0 && C41536l.m120484d(this.ccy, casHistoryItemEntity.ccy);
    }

    public final double getAmount() {
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
        int hashCode = ((((((this.orderNo * 31) + this.monthDictionaryKey.hashCode()) * 31) + this.operationCount) * 31) + Double.doubleToLongBits(this.amount)) * 31;
        String str = this.ccy;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.orderNo;
        String str = this.monthDictionaryKey;
        int i2 = this.operationCount;
        double d = this.amount;
        String str2 = this.ccy;
        return "CasHistoryItemEntity(orderNo=" + i + ", monthDictionaryKey=" + str + ", operationCount=" + i2 + ", amount=" + d + ", ccy=" + str2 + ")";
    }
}
