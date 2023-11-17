package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.LogOnboardingIdentificationStartActionQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42811xc28b4800 implements C8106f {
    final /* synthetic */ LogOnboardingIdentificationStartActionQuery this$0;

    public C42811xc28b4800(LogOnboardingIdentificationStartActionQuery logOnboardingIdentificationStartActionQuery) {
        this.this$0 = logOnboardingIdentificationStartActionQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("operationReference", this.this$0.getOperationReference());
    }
}
