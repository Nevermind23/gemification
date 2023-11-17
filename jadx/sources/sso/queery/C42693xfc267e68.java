package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.GetOnboardingIdentomatSessionTokenQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42693xfc267e68 implements C8106f {
    final /* synthetic */ GetOnboardingIdentomatSessionTokenQuery this$0;

    public C42693xfc267e68(GetOnboardingIdentomatSessionTokenQuery getOnboardingIdentomatSessionTokenQuery) {
        this.this$0 = getOnboardingIdentomatSessionTokenQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("operationReference", this.this$0.getOperationReference());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23295e("isPassport", Boolean.valueOf(this.this$0.isPassport()));
    }
}
