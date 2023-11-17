package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCountriesQuery;

public final class GetCountriesQuery$GetCountries$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetCountriesQuery.GetCountries this$0;

    public GetCountriesQuery$GetCountries$marshaller$$inlined$invoke$1(GetCountriesQuery.GetCountries getCountries) {
        this.this$0 = getCountries;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCountriesQuery.GetCountries.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetCountriesQuery.GetCountries.RESPONSE_FIELDS[1], this.this$0.getCountries(), GetCountriesQuery$GetCountries$marshaller$1$1.INSTANCE);
    }
}
