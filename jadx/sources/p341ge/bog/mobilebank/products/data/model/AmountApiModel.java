package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AmountApiModel */
public final class AmountApiModel {
    @C8664c(alternate = {"bcBalance", "bcAmount", "balance"}, value = "amount")
    private final Double amount;
    @C8664c(alternate = {"currency"}, value = "ccy")
    private final String currency;

    public AmountApiModel(Double d, String str) {
        this.amount = d;
        this.currency = str;
    }

    public static /* synthetic */ AmountApiModel copy$default(AmountApiModel amountApiModel, Double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = amountApiModel.amount;
        }
        if ((i & 2) != 0) {
            str = amountApiModel.currency;
        }
        return amountApiModel.copy(d, str);
    }

    public final Double component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final AmountApiModel copy(Double d, String str) {
        return new AmountApiModel(d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmountApiModel)) {
            return false;
        }
        AmountApiModel amountApiModel = (AmountApiModel) obj;
        return C41536l.m120484d(this.amount, amountApiModel.amount) && C41536l.m120484d(this.currency, amountApiModel.currency);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        Double d = this.amount;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.currency;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Double d = this.amount;
        String str = this.currency;
        return "AmountApiModel(amount=" + d + ", currency=" + str + ")";
    }
}
