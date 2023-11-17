package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.TransactionsResultApiModel */
public final class TransactionsResultApiModel {
    private final TransactionAccountApiModel account;
    private final TransactionDataApiModel transactionData;

    public TransactionsResultApiModel(TransactionAccountApiModel transactionAccountApiModel, TransactionDataApiModel transactionDataApiModel) {
        C41536l.m120489i(transactionAccountApiModel, "account");
        C41536l.m120489i(transactionDataApiModel, "transactionData");
        this.account = transactionAccountApiModel;
        this.transactionData = transactionDataApiModel;
    }

    public static /* synthetic */ TransactionsResultApiModel copy$default(TransactionsResultApiModel transactionsResultApiModel, TransactionAccountApiModel transactionAccountApiModel, TransactionDataApiModel transactionDataApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionAccountApiModel = transactionsResultApiModel.account;
        }
        if ((i & 2) != 0) {
            transactionDataApiModel = transactionsResultApiModel.transactionData;
        }
        return transactionsResultApiModel.copy(transactionAccountApiModel, transactionDataApiModel);
    }

    public final TransactionAccountApiModel component1() {
        return this.account;
    }

    public final TransactionDataApiModel component2() {
        return this.transactionData;
    }

    public final TransactionsResultApiModel copy(TransactionAccountApiModel transactionAccountApiModel, TransactionDataApiModel transactionDataApiModel) {
        C41536l.m120489i(transactionAccountApiModel, "account");
        C41536l.m120489i(transactionDataApiModel, "transactionData");
        return new TransactionsResultApiModel(transactionAccountApiModel, transactionDataApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionsResultApiModel)) {
            return false;
        }
        TransactionsResultApiModel transactionsResultApiModel = (TransactionsResultApiModel) obj;
        return C41536l.m120484d(this.account, transactionsResultApiModel.account) && C41536l.m120484d(this.transactionData, transactionsResultApiModel.transactionData);
    }

    public final TransactionAccountApiModel getAccount() {
        return this.account;
    }

    public final TransactionDataApiModel getTransactionData() {
        return this.transactionData;
    }

    public int hashCode() {
        return (this.account.hashCode() * 31) + this.transactionData.hashCode();
    }

    public String toString() {
        TransactionAccountApiModel transactionAccountApiModel = this.account;
        TransactionDataApiModel transactionDataApiModel = this.transactionData;
        return "TransactionsResultApiModel(account=" + transactionAccountApiModel + ", transactionData=" + transactionDataApiModel + ")";
    }
}
