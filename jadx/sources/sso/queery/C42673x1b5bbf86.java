package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetOnboardingAccessTokenQuery;

/* renamed from: sso.queery.GetOnboardingAccessTokenQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42673x1b5bbf86 implements C8122n {
    final /* synthetic */ GetOnboardingAccessTokenQuery.RegistrationServices this$0;

    public C42673x1b5bbf86(GetOnboardingAccessTokenQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetOnboardingAccessTokenQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetOnboardingAccessTokenQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetOnboardingAccessTokenQuery.GetOnboardingAccessToken getOnboardingAccessToken = this.this$0.getGetOnboardingAccessToken();
        if (getOnboardingAccessToken != null) {
            nVar = getOnboardingAccessToken.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
