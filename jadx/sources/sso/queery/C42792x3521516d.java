package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.IdentifyProccesFlowQuery;

/* renamed from: sso.queery.IdentifyProccesFlowQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42792x3521516d implements C8122n {
    final /* synthetic */ IdentifyProccesFlowQuery.RegistrationServices this$0;

    public C42792x3521516d(IdentifyProccesFlowQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(IdentifyProccesFlowQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = IdentifyProccesFlowQuery.RegistrationServices.RESPONSE_FIELDS[1];
        IdentifyProccesFlowQuery.IdentifyProcessFlow identifyProcessFlow = this.this$0.getIdentifyProcessFlow();
        if (identifyProcessFlow != null) {
            nVar = identifyProcessFlow.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
