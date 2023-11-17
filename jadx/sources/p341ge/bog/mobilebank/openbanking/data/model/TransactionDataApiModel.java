package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.TransactionDataApiModel */
public final class TransactionDataApiModel {
    private final boolean hasMoreRows;
    private final List<TransactionApiModel> transactionItems;

    public TransactionDataApiModel(List<TransactionApiModel> list, boolean z) {
        C41536l.m120489i(list, "transactionItems");
        this.transactionItems = list;
        this.hasMoreRows = z;
    }

    public static /* synthetic */ TransactionDataApiModel copy$default(TransactionDataApiModel transactionDataApiModel, List<TransactionApiModel> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionDataApiModel.transactionItems;
        }
        if ((i & 2) != 0) {
            z = transactionDataApiModel.hasMoreRows;
        }
        return transactionDataApiModel.copy(list, z);
    }

    public final List<TransactionApiModel> component1() {
        return this.transactionItems;
    }

    public final boolean component2() {
        return this.hasMoreRows;
    }

    public final TransactionDataApiModel copy(List<TransactionApiModel> list, boolean z) {
        C41536l.m120489i(list, "transactionItems");
        return new TransactionDataApiModel(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionDataApiModel)) {
            return false;
        }
        TransactionDataApiModel transactionDataApiModel = (TransactionDataApiModel) obj;
        return C41536l.m120484d(this.transactionItems, transactionDataApiModel.transactionItems) && this.hasMoreRows == transactionDataApiModel.hasMoreRows;
    }

    public final boolean getHasMoreRows() {
        return this.hasMoreRows;
    }

    public final List<TransactionApiModel> getTransactionItems() {
        return this.transactionItems;
    }

    public int hashCode() {
        int hashCode = this.transactionItems.hashCode() * 31;
        boolean z = this.hasMoreRows;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        List<TransactionApiModel> list = this.transactionItems;
        boolean z = this.hasMoreRows;
        return "TransactionDataApiModel(transactionItems=" + list + ", hasMoreRows=" + z + ")";
    }
}
