package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetResetFlowTransactionsQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetResetFlowTransactionsQuery$GetPasswordRecoveryTransactions$Companion$invoke$1$contacts$1 */
final class C42749x9c0a41a6 extends C41537m implements C43075l {
    public static final C42749x9c0a41a6 INSTANCE = new C42749x9c0a41a6();

    C42749x9c0a41a6() {
        super(1);
    }

    public final GetResetFlowTransactionsQuery.Contact invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetResetFlowTransactionsQuery.Contact) bVar.mo19033b(C427501.INSTANCE);
    }
}
