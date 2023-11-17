package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetOnboardingAppKeysQuery;

/* renamed from: sso.queery.GetOnboardingAppKeysQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42682x51602746 implements C8122n {
    final /* synthetic */ GetOnboardingAppKeysQuery.RegistrationServices this$0;

    public C42682x51602746(GetOnboardingAppKeysQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetOnboardingAppKeysQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetOnboardingAppKeysQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetOnboardingAppKeysQuery.GetOnboardingAppKeys getOnboardingAppKeys = this.this$0.getGetOnboardingAppKeys();
        if (getOnboardingAppKeys != null) {
            nVar = getOnboardingAppKeys.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
