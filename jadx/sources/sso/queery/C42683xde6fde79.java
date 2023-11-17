package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.GetOnboardingAppKeysQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42683xde6fde79 implements C8106f {
    final /* synthetic */ GetOnboardingAppKeysQuery this$0;

    public C42683xde6fde79(GetOnboardingAppKeysQuery getOnboardingAppKeysQuery) {
        this.this$0 = getOnboardingAppKeysQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("deviceType", this.this$0.getDeviceType());
    }
}
