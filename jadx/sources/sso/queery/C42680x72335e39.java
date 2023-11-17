package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetOnboardingAppKeysQuery;

/* renamed from: sso.queery.GetOnboardingAppKeysQuery$GetOnboardingAppKeys$marshaller$$inlined$invoke$1 */
public final class C42680x72335e39 implements C8122n {
    final /* synthetic */ GetOnboardingAppKeysQuery.GetOnboardingAppKeys this$0;

    public C42680x72335e39(GetOnboardingAppKeysQuery.GetOnboardingAppKeys getOnboardingAppKeys) {
        this.this$0 = getOnboardingAppKeys;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetOnboardingAppKeysQuery.GetOnboardingAppKeys.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetOnboardingAppKeysQuery.GetOnboardingAppKeys.RESPONSE_FIELDS[1], this.this$0.getServerKey());
    }
}
