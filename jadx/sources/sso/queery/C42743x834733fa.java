package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetResetFlowTransactionsQuery;

/* renamed from: sso.queery.GetResetFlowTransactionsQuery$GetPasswordRecoveryTransactions$marshaller$$inlined$invoke$1 */
public final class C42743x834733fa implements C8122n {
    final /* synthetic */ GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions this$0;

    public C42743x834733fa(GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions getPasswordRecoveryTransactions) {
        this.this$0 = getPasswordRecoveryTransactions;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions.RESPONSE_FIELDS[1], this.this$0.getContacts(), C42751x3e26ebb6.INSTANCE);
        pVar.mo23322g((C7846k.C7848b) GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions.RESPONSE_FIELDS[2], this.this$0.getMaxChooseLimit());
        pVar.mo23322g((C7846k.C7848b) GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions.RESPONSE_FIELDS[3], this.this$0.getChooseTimeLimit());
    }
}
