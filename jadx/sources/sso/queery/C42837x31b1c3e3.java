package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RequestFinancialContactApproveQuery;

/* renamed from: sso.queery.RequestFinancialContactApproveQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42837x31b1c3e3 implements C8122n {
    final /* synthetic */ RequestFinancialContactApproveQuery.RegistrationServices this$0;

    public C42837x31b1c3e3(RequestFinancialContactApproveQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(RequestFinancialContactApproveQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = RequestFinancialContactApproveQuery.RegistrationServices.RESPONSE_FIELDS[1];
        RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1 requestFinancialContactApproveV1 = this.this$0.getRequestFinancialContactApproveV1();
        if (requestFinancialContactApproveV1 != null) {
            nVar = requestFinancialContactApproveV1.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
