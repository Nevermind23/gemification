package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetOnboardingIdentomatSessionTokenQuery;

/* renamed from: sso.queery.GetOnboardingIdentomatSessionTokenQuery$GetOnboardingIdentomatSessionToken$marshaller$$inlined$invoke$1 */
public final class C42689xcaef699b implements C8122n {
    final /* synthetic */ GetOnboardingIdentomatSessionTokenQuery.GetOnboardingIdentomatSessionToken this$0;

    public C42689xcaef699b(GetOnboardingIdentomatSessionTokenQuery.GetOnboardingIdentomatSessionToken getOnboardingIdentomatSessionToken) {
        this.this$0 = getOnboardingIdentomatSessionToken;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetOnboardingIdentomatSessionTokenQuery.GetOnboardingIdentomatSessionToken.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetOnboardingIdentomatSessionTokenQuery.GetOnboardingIdentomatSessionToken.RESPONSE_FIELDS[1], this.this$0.getSessionToken());
    }
}
