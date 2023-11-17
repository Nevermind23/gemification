package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.BalanceAmountApiModel */
public final class BalanceAmountApiModel {
    private final double amount;
    private final String currency;

    public BalanceAmountApiModel(String str, double d) {
        C41536l.m120489i(str, "currency");
        this.currency = str;
        this.amount = d;
    }

    public static /* synthetic */ BalanceAmountApiModel copy$default(BalanceAmountApiModel balanceAmountApiModel, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = balanceAmountApiModel.currency;
        }
        if ((i & 2) != 0) {
            d = balanceAmountApiModel.amount;
        }
        return balanceAmountApiModel.copy(str, d);
    }

    public final String component1() {
        return this.currency;
    }

    public final double component2() {
        return this.amount;
    }

    public final BalanceAmountApiModel copy(String str, double d) {
        C41536l.m120489i(str, "currency");
        return new BalanceAmountApiModel(str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceAmountApiModel)) {
            return false;
        }
        BalanceAmountApiModel balanceAmountApiModel = (BalanceAmountApiModel) obj;
        return C41536l.m120484d(this.currency, balanceAmountApiModel.currency) && Double.compare(this.amount, balanceAmountApiModel.amount) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (this.currency.hashCode() * 31) + Double.doubleToLongBits(this.amount);
    }

    public String toString() {
        String str = this.currency;
        double d = this.amount;
        return "BalanceAmountApiModel(currency=" + str + ", amount=" + d + ")";
    }
}
