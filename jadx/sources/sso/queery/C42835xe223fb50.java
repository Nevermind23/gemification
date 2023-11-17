package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RequestFinancialContactApproveQuery;

/* renamed from: sso.queery.RequestFinancialContactApproveQuery$Data$marshaller$$inlined$invoke$1 */
public final class C42835xe223fb50 implements C8122n {
    final /* synthetic */ RequestFinancialContactApproveQuery.Data this$0;

    public C42835xe223fb50(RequestFinancialContactApproveQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = RequestFinancialContactApproveQuery.Data.RESPONSE_FIELDS[0];
        RequestFinancialContactApproveQuery.RegistrationServices registrationServices = this.this$0.getRegistrationServices();
        if (registrationServices != null) {
            nVar = registrationServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
