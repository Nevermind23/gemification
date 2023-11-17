package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.TransactionAccountApiModel */
public final class TransactionAccountApiModel {
    private final String currency;
    private final String iban;

    public TransactionAccountApiModel(String str, String str2) {
        C41536l.m120489i(str2, "iban");
        this.currency = str;
        this.iban = str2;
    }

    public static /* synthetic */ TransactionAccountApiModel copy$default(TransactionAccountApiModel transactionAccountApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionAccountApiModel.currency;
        }
        if ((i & 2) != 0) {
            str2 = transactionAccountApiModel.iban;
        }
        return transactionAccountApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.currency;
    }

    public final String component2() {
        return this.iban;
    }

    public final TransactionAccountApiModel copy(String str, String str2) {
        C41536l.m120489i(str2, "iban");
        return new TransactionAccountApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionAccountApiModel)) {
            return false;
        }
        TransactionAccountApiModel transactionAccountApiModel = (TransactionAccountApiModel) obj;
        return C41536l.m120484d(this.currency, transactionAccountApiModel.currency) && C41536l.m120484d(this.iban, transactionAccountApiModel.iban);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getIban() {
        return this.iban;
    }

    public int hashCode() {
        String str = this.currency;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.iban.hashCode();
    }

    public String toString() {
        String str = this.currency;
        String str2 = this.iban;
        return "TransactionAccountApiModel(currency=" + str + ", iban=" + str2 + ")";
    }
}
