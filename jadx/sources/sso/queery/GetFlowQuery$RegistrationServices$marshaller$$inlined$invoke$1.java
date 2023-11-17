package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetFlowQuery;

public final class GetFlowQuery$RegistrationServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetFlowQuery.RegistrationServices this$0;

    public GetFlowQuery$RegistrationServices$marshaller$$inlined$invoke$1(GetFlowQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetFlowQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetFlowQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetFlowQuery.GetPasswordRecoveryFlow getPasswordRecoveryFlow = this.this$0.getGetPasswordRecoveryFlow();
        if (getPasswordRecoveryFlow != null) {
            nVar = getPasswordRecoveryFlow.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
