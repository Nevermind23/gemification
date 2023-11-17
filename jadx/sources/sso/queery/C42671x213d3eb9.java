package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetOnboardingAccessTokenQuery;

/* renamed from: sso.queery.GetOnboardingAccessTokenQuery$GetOnboardingAccessToken$marshaller$$inlined$invoke$1 */
public final class C42671x213d3eb9 implements C8122n {
    final /* synthetic */ GetOnboardingAccessTokenQuery.GetOnboardingAccessToken this$0;

    public C42671x213d3eb9(GetOnboardingAccessTokenQuery.GetOnboardingAccessToken getOnboardingAccessToken) {
        this.this$0 = getOnboardingAccessToken;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetOnboardingAccessTokenQuery.GetOnboardingAccessToken.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetOnboardingAccessTokenQuery.GetOnboardingAccessToken.RESPONSE_FIELDS[1], this.this$0.getAccessToken());
        pVar.mo23319d(GetOnboardingAccessTokenQuery.GetOnboardingAccessToken.RESPONSE_FIELDS[2], this.this$0.getOperationReference());
    }
}
