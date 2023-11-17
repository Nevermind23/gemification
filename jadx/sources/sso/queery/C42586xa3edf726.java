package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ApproveFinancialContactQuery;

/* renamed from: sso.queery.ApproveFinancialContactQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42586xa3edf726 implements C8122n {
    final /* synthetic */ ApproveFinancialContactQuery.RegistrationServices this$0;

    public C42586xa3edf726(ApproveFinancialContactQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(ApproveFinancialContactQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = ApproveFinancialContactQuery.RegistrationServices.RESPONSE_FIELDS[1];
        ApproveFinancialContactQuery.ApproveFinancialContactV1 approveFinancialContactV1 = this.this$0.getApproveFinancialContactV1();
        if (approveFinancialContactV1 != null) {
            nVar = approveFinancialContactV1.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
