package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.LogOnboardingIdentificationErrorQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42803x5f056b10 implements C8106f {
    final /* synthetic */ LogOnboardingIdentificationErrorQuery this$0;

    public C42803x5f056b10(LogOnboardingIdentificationErrorQuery logOnboardingIdentificationErrorQuery) {
        this.this$0 = logOnboardingIdentificationErrorQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("errorKey", this.this$0.getErrorKey());
        gVar.mo23291a("errorMessage", this.this$0.getErrorMessage());
        gVar.mo23291a("operationReference", this.this$0.getOperationReference());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
    }
}
