package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetClientInfoQuery;

public final class GetClientInfoQuery$CommonServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetClientInfoQuery.CommonServices this$0;

    public GetClientInfoQuery$CommonServices$marshaller$$inlined$invoke$1(GetClientInfoQuery.CommonServices commonServices) {
        this.this$0 = commonServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetClientInfoQuery.CommonServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetClientInfoQuery.CommonServices.RESPONSE_FIELDS[1];
        GetClientInfoQuery.GetClientInfo getClientInfo = this.this$0.getGetClientInfo();
        if (getClientInfo != null) {
            nVar = getClientInfo.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
