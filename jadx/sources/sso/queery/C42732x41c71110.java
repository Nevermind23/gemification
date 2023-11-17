package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetResetFlowContactsQuery;

/* renamed from: sso.queery.GetResetFlowContactsQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42732x41c71110 implements C8122n {
    final /* synthetic */ GetResetFlowContactsQuery.RegistrationServices this$0;

    public C42732x41c71110(GetResetFlowContactsQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetResetFlowContactsQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetResetFlowContactsQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetResetFlowContactsQuery.GetPasswordRecoveryContacts getPasswordRecoveryContacts = this.this$0.getGetPasswordRecoveryContacts();
        if (getPasswordRecoveryContacts != null) {
            nVar = getPasswordRecoveryContacts.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
