package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetOnboardingIdentomatSessionTokenQuery;

/* renamed from: sso.queery.GetOnboardingIdentomatSessionTokenQuery$Data$marshaller$$inlined$invoke$1 */
public final class C42687x20c263a4 implements C8122n {
    final /* synthetic */ GetOnboardingIdentomatSessionTokenQuery.Data this$0;

    public C42687x20c263a4(GetOnboardingIdentomatSessionTokenQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = GetOnboardingIdentomatSessionTokenQuery.Data.RESPONSE_FIELDS[0];
        GetOnboardingIdentomatSessionTokenQuery.RegistrationServices registrationServices = this.this$0.getRegistrationServices();
        if (registrationServices != null) {
            nVar = registrationServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
