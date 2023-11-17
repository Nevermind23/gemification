package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RequestFinancialContactApproveQuery;

/* renamed from: sso.queery.RequestFinancialContactApproveQuery$RequestFinancialContactApproveV1$marshaller$$inlined$invoke$1 */
public final class C42839xcd59eb38 implements C8122n {
    final /* synthetic */ RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1 this$0;

    public C42839xcd59eb38(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1 requestFinancialContactApproveV1) {
        this.this$0 = requestFinancialContactApproveV1;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[1], this.this$0.getContactId());
        pVar.mo23320e(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[2], this.this$0.isNewUser());
        pVar.mo23320e(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[3], this.this$0.getNeedApproveContact());
        pVar.mo23319d(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[4], this.this$0.getOperationReference());
        pVar.mo23318c(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[5], this.this$0.getRetryCount());
        pVar.mo23320e(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[6], this.this$0.getNeedToSetMail());
        pVar.mo23319d(RequestFinancialContactApproveQuery.RequestFinancialContactApproveV1.RESPONSE_FIELDS[7], this.this$0.getCountry());
    }
}
