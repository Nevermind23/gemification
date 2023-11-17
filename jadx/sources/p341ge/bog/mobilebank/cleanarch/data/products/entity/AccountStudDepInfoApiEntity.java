package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountStudDepInfoApiEntity */
public final class AccountStudDepInfoApiEntity {
    private final BigDecimal amount;
    private final String ccy;
    private final Double intAccrued;
    private final Double intRate;

    public AccountStudDepInfoApiEntity(BigDecimal bigDecimal, String str, Double d, Double d2) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.amount = bigDecimal;
        this.ccy = str;
        this.intAccrued = d;
        this.intRate = d2;
    }

    public static /* synthetic */ AccountStudDepInfoApiEntity copy$default(AccountStudDepInfoApiEntity accountStudDepInfoApiEntity, BigDecimal bigDecimal, String str, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = accountStudDepInfoApiEntity.amount;
        }
        if ((i & 2) != 0) {
            str = accountStudDepInfoApiEntity.ccy;
        }
        if ((i & 4) != 0) {
            d = accountStudDepInfoApiEntity.intAccrued;
        }
        if ((i & 8) != 0) {
            d2 = accountStudDepInfoApiEntity.intRate;
        }
        return accountStudDepInfoApiEntity.copy(bigDecimal, str, d, d2);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final Double component3() {
        return this.intAccrued;
    }

    public final Double component4() {
        return this.intRate;
    }

    public final AccountStudDepInfoApiEntity copy(BigDecimal bigDecimal, String str, Double d, Double d2) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        return new AccountStudDepInfoApiEntity(bigDecimal, str, d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountStudDepInfoApiEntity)) {
            return false;
        }
        AccountStudDepInfoApiEntity accountStudDepInfoApiEntity = (AccountStudDepInfoApiEntity) obj;
        return C41536l.m120484d(this.amount, accountStudDepInfoApiEntity.amount) && C41536l.m120484d(this.ccy, accountStudDepInfoApiEntity.ccy) && C41536l.m120484d(this.intAccrued, accountStudDepInfoApiEntity.intAccrued) && C41536l.m120484d(this.intRate, accountStudDepInfoApiEntity.intRate);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Double getIntAccrued() {
        return this.intAccrued;
    }

    public final Double getIntRate() {
        return this.intRate;
    }

    public int hashCode() {
        int hashCode = ((this.amount.hashCode() * 31) + this.ccy.hashCode()) * 31;
        Double d = this.intAccrued;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.intRate;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.ccy;
        Double d = this.intAccrued;
        Double d2 = this.intRate;
        return "AccountStudDepInfoApiEntity(amount=" + bigDecimal + ", ccy=" + str + ", intAccrued=" + d + ", intRate=" + d2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountStudDepInfoApiEntity(BigDecimal bigDecimal, String str, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2);
    }
}
