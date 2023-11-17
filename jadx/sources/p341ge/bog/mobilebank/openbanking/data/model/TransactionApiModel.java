package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.TransactionApiModel */
public final class TransactionApiModel {
    private final long operationDate;
    private final String operationTitle;
    private final TransactionAmountApiModel transactionAmount;

    public TransactionApiModel(TransactionAmountApiModel transactionAmountApiModel, String str, long j) {
        C41536l.m120489i(transactionAmountApiModel, "transactionAmount");
        this.transactionAmount = transactionAmountApiModel;
        this.operationTitle = str;
        this.operationDate = j;
    }

    public static /* synthetic */ TransactionApiModel copy$default(TransactionApiModel transactionApiModel, TransactionAmountApiModel transactionAmountApiModel, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionAmountApiModel = transactionApiModel.transactionAmount;
        }
        if ((i & 2) != 0) {
            str = transactionApiModel.operationTitle;
        }
        if ((i & 4) != 0) {
            j = transactionApiModel.operationDate;
        }
        return transactionApiModel.copy(transactionAmountApiModel, str, j);
    }

    public final TransactionAmountApiModel component1() {
        return this.transactionAmount;
    }

    public final String component2() {
        return this.operationTitle;
    }

    public final long component3() {
        return this.operationDate;
    }

    public final TransactionApiModel copy(TransactionAmountApiModel transactionAmountApiModel, String str, long j) {
        C41536l.m120489i(transactionAmountApiModel, "transactionAmount");
        return new TransactionApiModel(transactionAmountApiModel, str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionApiModel)) {
            return false;
        }
        TransactionApiModel transactionApiModel = (TransactionApiModel) obj;
        return C41536l.m120484d(this.transactionAmount, transactionApiModel.transactionAmount) && C41536l.m120484d(this.operationTitle, transactionApiModel.operationTitle) && this.operationDate == transactionApiModel.operationDate;
    }

    public final long getOperationDate() {
        return this.operationDate;
    }

    public final String getOperationTitle() {
        return this.operationTitle;
    }

    public final TransactionAmountApiModel getTransactionAmount() {
        return this.transactionAmount;
    }

    public int hashCode() {
        int hashCode = this.transactionAmount.hashCode() * 31;
        String str = this.operationTitle;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.operationDate);
    }

    public String toString() {
        TransactionAmountApiModel transactionAmountApiModel = this.transactionAmount;
        String str = this.operationTitle;
        long j = this.operationDate;
        return "TransactionApiModel(transactionAmount=" + transactionAmountApiModel + ", operationTitle=" + str + ", operationDate=" + j + ")";
    }
}
