package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountSubAccountAmountSumsApiEntity */
public final class AccountSubAccountAmountSumsApiEntity {
    private final BigDecimal amount;
    private final String ccy;
    private final int orderNo;

    public AccountSubAccountAmountSumsApiEntity(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.amount = bigDecimal;
        this.ccy = str;
        this.orderNo = i;
    }

    public static /* synthetic */ AccountSubAccountAmountSumsApiEntity copy$default(AccountSubAccountAmountSumsApiEntity accountSubAccountAmountSumsApiEntity, BigDecimal bigDecimal, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = accountSubAccountAmountSumsApiEntity.amount;
        }
        if ((i2 & 2) != 0) {
            str = accountSubAccountAmountSumsApiEntity.ccy;
        }
        if ((i2 & 4) != 0) {
            i = accountSubAccountAmountSumsApiEntity.orderNo;
        }
        return accountSubAccountAmountSumsApiEntity.copy(bigDecimal, str, i);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final int component3() {
        return this.orderNo;
    }

    public final AccountSubAccountAmountSumsApiEntity copy(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        return new AccountSubAccountAmountSumsApiEntity(bigDecimal, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSubAccountAmountSumsApiEntity)) {
            return false;
        }
        AccountSubAccountAmountSumsApiEntity accountSubAccountAmountSumsApiEntity = (AccountSubAccountAmountSumsApiEntity) obj;
        return C41536l.m120484d(this.amount, accountSubAccountAmountSumsApiEntity.amount) && C41536l.m120484d(this.ccy, accountSubAccountAmountSumsApiEntity.ccy) && this.orderNo == accountSubAccountAmountSumsApiEntity.orderNo;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final int getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        return (((this.amount.hashCode() * 31) + this.ccy.hashCode()) * 31) + this.orderNo;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.ccy;
        int i = this.orderNo;
        return "AccountSubAccountAmountSumsApiEntity(amount=" + bigDecimal + ", ccy=" + str + ", orderNo=" + i + ")";
    }
}
