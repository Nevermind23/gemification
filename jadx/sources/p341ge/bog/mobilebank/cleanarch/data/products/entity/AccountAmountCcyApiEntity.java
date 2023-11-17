package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountAmountCcyApiEntity */
public final class AccountAmountCcyApiEntity {
    private final BigDecimal amount;
    private final String ccy;

    public AccountAmountCcyApiEntity(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.amount = bigDecimal;
        this.ccy = str;
    }

    public static /* synthetic */ AccountAmountCcyApiEntity copy$default(AccountAmountCcyApiEntity accountAmountCcyApiEntity, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = accountAmountCcyApiEntity.amount;
        }
        if ((i & 2) != 0) {
            str = accountAmountCcyApiEntity.ccy;
        }
        return accountAmountCcyApiEntity.copy(bigDecimal, str);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final AccountAmountCcyApiEntity copy(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        return new AccountAmountCcyApiEntity(bigDecimal, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAmountCcyApiEntity)) {
            return false;
        }
        AccountAmountCcyApiEntity accountAmountCcyApiEntity = (AccountAmountCcyApiEntity) obj;
        return C41536l.m120484d(this.amount, accountAmountCcyApiEntity.amount) && C41536l.m120484d(this.ccy, accountAmountCcyApiEntity.ccy);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        String str = this.ccy;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.ccy;
        return "AccountAmountCcyApiEntity(amount=" + bigDecimal + ", ccy=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountAmountCcyApiEntity(BigDecimal bigDecimal, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i & 2) != 0 ? null : str);
    }
}
