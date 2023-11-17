package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetResetFlowContactsQuery;

/* renamed from: sso.queery.GetResetFlowContactsQuery$GetPasswordRecoveryContacts$marshaller$$inlined$invoke$1 */
public final class C42730xe2748ba implements C8122n {
    final /* synthetic */ GetResetFlowContactsQuery.GetPasswordRecoveryContacts this$0;

    public C42730xe2748ba(GetResetFlowContactsQuery.GetPasswordRecoveryContacts getPasswordRecoveryContacts) {
        this.this$0 = getPasswordRecoveryContacts;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetResetFlowContactsQuery.GetPasswordRecoveryContacts.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetResetFlowContactsQuery.GetPasswordRecoveryContacts.RESPONSE_FIELDS[1], this.this$0.getContacts(), C42737xb5365076.INSTANCE);
        pVar.mo23322g((C7846k.C7848b) GetResetFlowContactsQuery.GetPasswordRecoveryContacts.RESPONSE_FIELDS[2], this.this$0.getMaxChooseLimit());
        pVar.mo23322g((C7846k.C7848b) GetResetFlowContactsQuery.GetPasswordRecoveryContacts.RESPONSE_FIELDS[3], this.this$0.getChooseTimeLimit());
    }
}
