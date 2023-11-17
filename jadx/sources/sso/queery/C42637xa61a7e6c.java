package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCountriesQuery;

/* renamed from: sso.queery.GetCountriesQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42637xa61a7e6c implements C8122n {
    final /* synthetic */ GetCountriesQuery.RegistrationServices this$0;

    public C42637xa61a7e6c(GetCountriesQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCountriesQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetCountriesQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetCountriesQuery.GetCountries getCountries = this.this$0.getGetCountries();
        if (getCountries != null) {
            nVar = getCountries.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
