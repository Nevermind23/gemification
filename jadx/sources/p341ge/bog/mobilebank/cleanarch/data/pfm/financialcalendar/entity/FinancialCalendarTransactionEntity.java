package p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarTransactionEntity */
public final class FinancialCalendarTransactionEntity {
    private final long accId;
    private final String accType;
    private final BigDecimal amount;
    private final long catId;
    private final boolean computable;
    private final String currency;

    /* renamed from: id */
    private final long f56455id;
    private final String name;

    public FinancialCalendarTransactionEntity(long j, String str, BigDecimal bigDecimal, long j2, boolean z, String str2, long j3, String str3) {
        C41536l.m120489i(str, "accType");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str2, "currency");
        C41536l.m120489i(str3, "name");
        this.accId = j;
        this.accType = str;
        this.amount = bigDecimal;
        this.catId = j2;
        this.computable = z;
        this.currency = str2;
        this.f56455id = j3;
        this.name = str3;
    }

    public static /* synthetic */ FinancialCalendarTransactionEntity copy$default(FinancialCalendarTransactionEntity financialCalendarTransactionEntity, long j, String str, BigDecimal bigDecimal, long j2, boolean z, String str2, long j3, String str3, int i, Object obj) {
        FinancialCalendarTransactionEntity financialCalendarTransactionEntity2 = financialCalendarTransactionEntity;
        int i2 = i;
        return financialCalendarTransactionEntity.copy((i2 & 1) != 0 ? financialCalendarTransactionEntity2.accId : j, (i2 & 2) != 0 ? financialCalendarTransactionEntity2.accType : str, (i2 & 4) != 0 ? financialCalendarTransactionEntity2.amount : bigDecimal, (i2 & 8) != 0 ? financialCalendarTransactionEntity2.catId : j2, (i2 & 16) != 0 ? financialCalendarTransactionEntity2.computable : z, (i2 & 32) != 0 ? financialCalendarTransactionEntity2.currency : str2, (i2 & 64) != 0 ? financialCalendarTransactionEntity2.f56455id : j3, (i2 & 128) != 0 ? financialCalendarTransactionEntity2.name : str3);
    }

    public final long component1() {
        return this.accId;
    }

    public final String component2() {
        return this.accType;
    }

    public final BigDecimal component3() {
        return this.amount;
    }

    public final long component4() {
        return this.catId;
    }

    public final boolean component5() {
        return this.computable;
    }

    public final String component6() {
        return this.currency;
    }

    public final long component7() {
        return this.f56455id;
    }

    public final String component8() {
        return this.name;
    }

    public final FinancialCalendarTransactionEntity copy(long j, String str, BigDecimal bigDecimal, long j2, boolean z, String str2, long j3, String str3) {
        String str4 = str;
        C41536l.m120489i(str4, "accType");
        BigDecimal bigDecimal2 = bigDecimal;
        C41536l.m120489i(bigDecimal2, "amount");
        String str5 = str2;
        C41536l.m120489i(str5, "currency");
        String str6 = str3;
        C41536l.m120489i(str6, "name");
        return new FinancialCalendarTransactionEntity(j, str4, bigDecimal2, j2, z, str5, j3, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialCalendarTransactionEntity)) {
            return false;
        }
        FinancialCalendarTransactionEntity financialCalendarTransactionEntity = (FinancialCalendarTransactionEntity) obj;
        return this.accId == financialCalendarTransactionEntity.accId && C41536l.m120484d(this.accType, financialCalendarTransactionEntity.accType) && C41536l.m120484d(this.amount, financialCalendarTransactionEntity.amount) && this.catId == financialCalendarTransactionEntity.catId && this.computable == financialCalendarTransactionEntity.computable && C41536l.m120484d(this.currency, financialCalendarTransactionEntity.currency) && this.f56455id == financialCalendarTransactionEntity.f56455id && C41536l.m120484d(this.name, financialCalendarTransactionEntity.name);
    }

    public final long getAccId() {
        return this.accId;
    }

    public final String getAccType() {
        return this.accType;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final long getCatId() {
        return this.catId;
    }

    public final boolean getComputable() {
        return this.computable;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getId() {
        return this.f56455id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.accId) * 31) + this.accType.hashCode()) * 31) + this.amount.hashCode()) * 31) + C7397t.m28148a(this.catId)) * 31;
        boolean z = this.computable;
        if (z) {
            z = true;
        }
        return ((((((a + (z ? 1 : 0)) * 31) + this.currency.hashCode()) * 31) + C7397t.m28148a(this.f56455id)) * 31) + this.name.hashCode();
    }

    public String toString() {
        long j = this.accId;
        String str = this.accType;
        BigDecimal bigDecimal = this.amount;
        long j2 = this.catId;
        boolean z = this.computable;
        String str2 = this.currency;
        long j3 = this.f56455id;
        String str3 = this.name;
        return "FinancialCalendarTransactionEntity(accId=" + j + ", accType=" + str + ", amount=" + bigDecimal + ", catId=" + j2 + ", computable=" + z + ", currency=" + str2 + ", id=" + j3 + ", name=" + str3 + ")";
    }
}
