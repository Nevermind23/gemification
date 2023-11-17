package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountOverdraftParamsApiEntity */
public final class AccountOverdraftParamsApiEntity {
    private final long acctKey;
    private final Long endDate;
    private final Double intAccruedOverdraft;
    private final Double interestRate;
    private final BigDecimal overdraftLimit;
    private final Double unusedOverdraftLimit;

    public AccountOverdraftParamsApiEntity(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l) {
        this.acctKey = j;
        this.overdraftLimit = bigDecimal;
        this.unusedOverdraftLimit = d;
        this.interestRate = d2;
        this.intAccruedOverdraft = d3;
        this.endDate = l;
    }

    public static /* synthetic */ AccountOverdraftParamsApiEntity copy$default(AccountOverdraftParamsApiEntity accountOverdraftParamsApiEntity, long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l, int i, Object obj) {
        AccountOverdraftParamsApiEntity accountOverdraftParamsApiEntity2 = accountOverdraftParamsApiEntity;
        return accountOverdraftParamsApiEntity.copy((i & 1) != 0 ? accountOverdraftParamsApiEntity2.acctKey : j, (i & 2) != 0 ? accountOverdraftParamsApiEntity2.overdraftLimit : bigDecimal, (i & 4) != 0 ? accountOverdraftParamsApiEntity2.unusedOverdraftLimit : d, (i & 8) != 0 ? accountOverdraftParamsApiEntity2.interestRate : d2, (i & 16) != 0 ? accountOverdraftParamsApiEntity2.intAccruedOverdraft : d3, (i & 32) != 0 ? accountOverdraftParamsApiEntity2.endDate : l);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final BigDecimal component2() {
        return this.overdraftLimit;
    }

    public final Double component3() {
        return this.unusedOverdraftLimit;
    }

    public final Double component4() {
        return this.interestRate;
    }

    public final Double component5() {
        return this.intAccruedOverdraft;
    }

    public final Long component6() {
        return this.endDate;
    }

    public final AccountOverdraftParamsApiEntity copy(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l) {
        return new AccountOverdraftParamsApiEntity(j, bigDecimal, d, d2, d3, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountOverdraftParamsApiEntity)) {
            return false;
        }
        AccountOverdraftParamsApiEntity accountOverdraftParamsApiEntity = (AccountOverdraftParamsApiEntity) obj;
        return this.acctKey == accountOverdraftParamsApiEntity.acctKey && C41536l.m120484d(this.overdraftLimit, accountOverdraftParamsApiEntity.overdraftLimit) && C41536l.m120484d(this.unusedOverdraftLimit, accountOverdraftParamsApiEntity.unusedOverdraftLimit) && C41536l.m120484d(this.interestRate, accountOverdraftParamsApiEntity.interestRate) && C41536l.m120484d(this.intAccruedOverdraft, accountOverdraftParamsApiEntity.intAccruedOverdraft) && C41536l.m120484d(this.endDate, accountOverdraftParamsApiEntity.endDate);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final Double getIntAccruedOverdraft() {
        return this.intAccruedOverdraft;
    }

    public final Double getInterestRate() {
        return this.interestRate;
    }

    public final BigDecimal getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public final Double getUnusedOverdraftLimit() {
        return this.unusedOverdraftLimit;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.acctKey) * 31;
        BigDecimal bigDecimal = this.overdraftLimit;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Double d = this.unusedOverdraftLimit;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.interestRate;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.intAccruedOverdraft;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l = this.endDate;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.acctKey;
        BigDecimal bigDecimal = this.overdraftLimit;
        Double d = this.unusedOverdraftLimit;
        Double d2 = this.interestRate;
        Double d3 = this.intAccruedOverdraft;
        Long l = this.endDate;
        return "AccountOverdraftParamsApiEntity(acctKey=" + j + ", overdraftLimit=" + bigDecimal + ", unusedOverdraftLimit=" + d + ", interestRate=" + d2 + ", intAccruedOverdraft=" + d3 + ", endDate=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountOverdraftParamsApiEntity(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bigDecimal, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : l);
    }
}
