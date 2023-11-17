package p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTTransactionHistoryApiModel */
public final class GTTransactionHistoryApiModel {
    private final List<GTTransactionApiModel> transactions;

    public GTTransactionHistoryApiModel(List<GTTransactionApiModel> list) {
        C41536l.m120489i(list, "transactions");
        this.transactions = list;
    }

    public static /* synthetic */ GTTransactionHistoryApiModel copy$default(GTTransactionHistoryApiModel gTTransactionHistoryApiModel, List<GTTransactionApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gTTransactionHistoryApiModel.transactions;
        }
        return gTTransactionHistoryApiModel.copy(list);
    }

    public final List<GTTransactionApiModel> component1() {
        return this.transactions;
    }

    public final GTTransactionHistoryApiModel copy(List<GTTransactionApiModel> list) {
        C41536l.m120489i(list, "transactions");
        return new GTTransactionHistoryApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GTTransactionHistoryApiModel) && C41536l.m120484d(this.transactions, ((GTTransactionHistoryApiModel) obj).transactions);
    }

    public final List<GTTransactionApiModel> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        return this.transactions.hashCode();
    }

    public String toString() {
        List<GTTransactionApiModel> list = this.transactions;
        return "GTTransactionHistoryApiModel(transactions=" + list + ")";
    }
}
