package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.LogOnboardingIdentificationErrorQuery;

/* renamed from: sso.queery.LogOnboardingIdentificationErrorQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42801xe999d48f implements C8122n {
    final /* synthetic */ LogOnboardingIdentificationErrorQuery.RegistrationServices this$0;

    public C42801xe999d48f(LogOnboardingIdentificationErrorQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(LogOnboardingIdentificationErrorQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = LogOnboardingIdentificationErrorQuery.RegistrationServices.RESPONSE_FIELDS[1];
        LogOnboardingIdentificationErrorQuery.LogOnboardingIdentificationError logOnboardingIdentificationError = this.this$0.getLogOnboardingIdentificationError();
        if (logOnboardingIdentificationError != null) {
            nVar = logOnboardingIdentificationError.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
