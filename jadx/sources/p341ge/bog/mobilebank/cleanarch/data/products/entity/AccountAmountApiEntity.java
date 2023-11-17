package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountAmountApiEntity */
public final class AccountAmountApiEntity {
    private final BigDecimal amount;
    private final String currency;

    public AccountAmountApiEntity(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.amount = bigDecimal;
        this.currency = str;
    }

    public static /* synthetic */ AccountAmountApiEntity copy$default(AccountAmountApiEntity accountAmountApiEntity, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = accountAmountApiEntity.amount;
        }
        if ((i & 2) != 0) {
            str = accountAmountApiEntity.currency;
        }
        return accountAmountApiEntity.copy(bigDecimal, str);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final AccountAmountApiEntity copy(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        return new AccountAmountApiEntity(bigDecimal, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAmountApiEntity)) {
            return false;
        }
        AccountAmountApiEntity accountAmountApiEntity = (AccountAmountApiEntity) obj;
        return C41536l.m120484d(this.amount, accountAmountApiEntity.amount) && C41536l.m120484d(this.currency, accountAmountApiEntity.currency);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        int hashCode = this.amount.hashCode() * 31;
        String str = this.currency;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.currency;
        return "AccountAmountApiEntity(amount=" + bigDecimal + ", currency=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountAmountApiEntity(BigDecimal bigDecimal, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i & 2) != 0 ? null : str);
    }
}
