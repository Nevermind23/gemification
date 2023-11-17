package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ValidateOnboardingDataQuery;

public final class ValidateOnboardingDataQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ ValidateOnboardingDataQuery.Data this$0;

    public ValidateOnboardingDataQuery$Data$marshaller$$inlined$invoke$1(ValidateOnboardingDataQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = ValidateOnboardingDataQuery.Data.RESPONSE_FIELDS[0];
        ValidateOnboardingDataQuery.RegistrationServices registrationServices = this.this$0.getRegistrationServices();
        if (registrationServices != null) {
            nVar = registrationServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
