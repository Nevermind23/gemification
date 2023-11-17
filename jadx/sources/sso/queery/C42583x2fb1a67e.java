package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ApproveFinancialContactQuery;

/* renamed from: sso.queery.ApproveFinancialContactQuery$ApproveFinancialContactV1$marshaller$$inlined$invoke$1 */
public final class C42583x2fb1a67e implements C8122n {
    final /* synthetic */ ApproveFinancialContactQuery.ApproveFinancialContactV1 this$0;

    public C42583x2fb1a67e(ApproveFinancialContactQuery.ApproveFinancialContactV1 approveFinancialContactV1) {
        this.this$0 = approveFinancialContactV1;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(ApproveFinancialContactQuery.ApproveFinancialContactV1.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23320e(ApproveFinancialContactQuery.ApproveFinancialContactV1.RESPONSE_FIELDS[1], this.this$0.getNeedToSetMail());
    }
}
