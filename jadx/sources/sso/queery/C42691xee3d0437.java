package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetOnboardingIdentomatSessionTokenQuery;

/* renamed from: sso.queery.GetOnboardingIdentomatSessionTokenQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42691xee3d0437 implements C8122n {
    final /* synthetic */ GetOnboardingIdentomatSessionTokenQuery.RegistrationServices this$0;

    public C42691xee3d0437(GetOnboardingIdentomatSessionTokenQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetOnboardingIdentomatSessionTokenQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetOnboardingIdentomatSessionTokenQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetOnboardingIdentomatSessionTokenQuery.GetOnboardingIdentomatSessionToken getOnboardingIdentomatSessionToken = this.this$0.getGetOnboardingIdentomatSessionToken();
        if (getOnboardingIdentomatSessionToken != null) {
            nVar = getOnboardingIdentomatSessionToken.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
