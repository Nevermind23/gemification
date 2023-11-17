package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.LogOnboardingIdentificationStartActionQuery;

/* renamed from: sso.queery.LogOnboardingIdentificationStartActionQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42809xcdc5859f implements C8122n {
    final /* synthetic */ LogOnboardingIdentificationStartActionQuery.RegistrationServices this$0;

    public C42809xcdc5859f(LogOnboardingIdentificationStartActionQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(LogOnboardingIdentificationStartActionQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(LogOnboardingIdentificationStartActionQuery.RegistrationServices.RESPONSE_FIELDS[1], this.this$0.getLogOnboardingIdentificationStartAction());
    }
}
