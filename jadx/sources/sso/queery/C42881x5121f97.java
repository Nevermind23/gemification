package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.UpdateClientTurnoverInfoQuery;

/* renamed from: sso.queery.UpdateClientTurnoverInfoQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42881x5121f97 implements C8122n {
    final /* synthetic */ UpdateClientTurnoverInfoQuery.RegistrationServices this$0;

    public C42881x5121f97(UpdateClientTurnoverInfoQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(UpdateClientTurnoverInfoQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = UpdateClientTurnoverInfoQuery.RegistrationServices.RESPONSE_FIELDS[1];
        UpdateClientTurnoverInfoQuery.UpdateClientTurnoverInfo updateClientTurnoverInfo = this.this$0.getUpdateClientTurnoverInfo();
        if (updateClientTurnoverInfo != null) {
            nVar = updateClientTurnoverInfo.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
