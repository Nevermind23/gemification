package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetResetFlowTransactionsQuery;

/* renamed from: sso.queery.GetResetFlowTransactionsQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42745x9711894e implements C8122n {
    final /* synthetic */ GetResetFlowTransactionsQuery.RegistrationServices this$0;

    public C42745x9711894e(GetResetFlowTransactionsQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetResetFlowTransactionsQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetResetFlowTransactionsQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions getPasswordRecoveryTransactions = this.this$0.getGetPasswordRecoveryTransactions();
        if (getPasswordRecoveryTransactions != null) {
            nVar = getPasswordRecoveryTransactions.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
