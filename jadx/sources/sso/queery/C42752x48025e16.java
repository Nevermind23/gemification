package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetResetFlowTransactionsQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetResetFlowTransactionsQuery$RegistrationServices$Companion$invoke$1$getPasswordRecoveryTransactions$1 */
final class C42752x48025e16 extends C41537m implements C43075l {
    public static final C42752x48025e16 INSTANCE = new C42752x48025e16();

    C42752x48025e16() {
        super(1);
    }

    public final GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetResetFlowTransactionsQuery.GetPasswordRecoveryTransactions.Companion.invoke(oVar);
    }
}
