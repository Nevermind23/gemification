package dv0;

import hd0.C24977a;
import iv0.C36558j;
import iv0.C36559k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.openbanking.data.model.TransactionApiModel;
import p341ge.bog.mobilebank.openbanking.data.model.TransactionsResultApiModel;

/* renamed from: dv0.d */
public final class C31611d {
    /* renamed from: a */
    private final C36558j m93717a(TransactionApiModel transactionApiModel) {
        return new C36558j(new C24977a(transactionApiModel.getTransactionAmount().getAmount(), transactionApiModel.getTransactionAmount().getCurrency()), transactionApiModel.getOperationTitle(), transactionApiModel.getOperationDate());
    }

    /* renamed from: b */
    public final C36559k mo72025b(TransactionsResultApiModel transactionsResultApiModel) {
        C41536l.m120489i(transactionsResultApiModel, "transactions");
        List<TransactionApiModel> transactionItems = transactionsResultApiModel.getTransactionData().getTransactionItems();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(transactionItems, 10));
        for (TransactionApiModel a : transactionItems) {
            arrayList.add(m93717a(a));
        }
        return new C36559k(arrayList, transactionsResultApiModel.getTransactionData().getHasMoreRows());
    }
}
