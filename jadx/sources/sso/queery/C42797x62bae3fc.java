package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.LogOnboardingIdentificationErrorQuery;

/* renamed from: sso.queery.LogOnboardingIdentificationErrorQuery$Data$marshaller$$inlined$invoke$1 */
public final class C42797x62bae3fc implements C8122n {
    final /* synthetic */ LogOnboardingIdentificationErrorQuery.Data this$0;

    public C42797x62bae3fc(LogOnboardingIdentificationErrorQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = LogOnboardingIdentificationErrorQuery.Data.RESPONSE_FIELDS[0];
        LogOnboardingIdentificationErrorQuery.RegistrationServices registrationServices = this.this$0.getRegistrationServices();
        if (registrationServices != null) {
            nVar = registrationServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
