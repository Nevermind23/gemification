package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.ValidateOnboardingDocumentDataQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42922x8133106b implements C8106f {
    final /* synthetic */ ValidateOnboardingDocumentDataQuery this$0;

    public C42922x8133106b(ValidateOnboardingDocumentDataQuery validateOnboardingDocumentDataQuery) {
        this.this$0 = validateOnboardingDocumentDataQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("xDeviceKey", this.this$0.getXDeviceKey());
        gVar.mo23291a("xUserAgent", this.this$0.getXUserAgent());
        gVar.mo23291a("sessionToken", this.this$0.getSessionToken());
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getOperationReference().f22756b) {
            gVar.mo23291a("operationReference", (String) this.this$0.getOperationReference().f22755a);
        }
    }
}
