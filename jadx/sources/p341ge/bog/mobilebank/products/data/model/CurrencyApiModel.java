package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CurrencyApiModel */
public final class CurrencyApiModel {
    private final BigDecimal amount;
    private final String currency;

    public CurrencyApiModel(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "currency");
        this.amount = bigDecimal;
        this.currency = str;
    }

    public static /* synthetic */ CurrencyApiModel copy$default(CurrencyApiModel currencyApiModel, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = currencyApiModel.amount;
        }
        if ((i & 2) != 0) {
            str = currencyApiModel.currency;
        }
        return currencyApiModel.copy(bigDecimal, str);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final CurrencyApiModel copy(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "currency");
        return new CurrencyApiModel(bigDecimal, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyApiModel)) {
            return false;
        }
        CurrencyApiModel currencyApiModel = (CurrencyApiModel) obj;
        return C41536l.m120484d(this.amount, currencyApiModel.amount) && C41536l.m120484d(this.currency, currencyApiModel.currency);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (this.amount.hashCode() * 31) + this.currency.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.currency;
        return "CurrencyApiModel(amount=" + bigDecimal + ", currency=" + str + ")";
    }
}
