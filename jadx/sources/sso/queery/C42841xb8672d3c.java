package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.RequestFinancialContactApproveQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42841xb8672d3c implements C8106f {
    final /* synthetic */ RequestFinancialContactApproveQuery this$0;

    public C42841xb8672d3c(RequestFinancialContactApproveQuery requestFinancialContactApproveQuery) {
        this.this$0 = requestFinancialContactApproveQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getContactId().f22756b) {
            gVar.mo23291a("contactId", (String) this.this$0.getContactId().f22755a);
        }
        gVar.mo23291a("contactType", this.this$0.getContactType());
        if (this.this$0.getContactValue().f22756b) {
            gVar.mo23291a("contactValue", (String) this.this$0.getContactValue().f22755a);
        }
        if (this.this$0.getPersonalNumber().f22756b) {
            gVar.mo23291a("personalNumber", (String) this.this$0.getPersonalNumber().f22755a);
        }
        if (this.this$0.getOnboardingOperationReference().f22756b) {
            gVar.mo23291a("onboardingOperationReference", (String) this.this$0.getOnboardingOperationReference().f22755a);
        }
    }
}
