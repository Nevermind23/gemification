package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.TransactionAmountApiModel */
public final class TransactionAmountApiModel {
    private final double amount;
    private final String currency;

    public TransactionAmountApiModel(double d, String str) {
        C41536l.m120489i(str, "currency");
        this.amount = d;
        this.currency = str;
    }

    public static /* synthetic */ TransactionAmountApiModel copy$default(TransactionAmountApiModel transactionAmountApiModel, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = transactionAmountApiModel.amount;
        }
        if ((i & 2) != 0) {
            str = transactionAmountApiModel.currency;
        }
        return transactionAmountApiModel.copy(d, str);
    }

    public final double component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final TransactionAmountApiModel copy(double d, String str) {
        C41536l.m120489i(str, "currency");
        return new TransactionAmountApiModel(d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionAmountApiModel)) {
            return false;
        }
        TransactionAmountApiModel transactionAmountApiModel = (TransactionAmountApiModel) obj;
        return Double.compare(this.amount, transactionAmountApiModel.amount) == 0 && C41536l.m120484d(this.currency, transactionAmountApiModel.currency);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.amount) * 31) + this.currency.hashCode();
    }

    public String toString() {
        double d = this.amount;
        String str = this.currency;
        return "TransactionAmountApiModel(amount=" + d + ", currency=" + str + ")";
    }
}
