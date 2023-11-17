package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCountriesQuery;

public final class GetCountriesQuery$Country$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetCountriesQuery.Country this$0;

    public GetCountriesQuery$Country$marshaller$$inlined$invoke$1(GetCountriesQuery.Country country) {
        this.this$0 = country;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCountriesQuery.Country.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetCountriesQuery.Country.RESPONSE_FIELDS[1], this.this$0.getCountry());
        pVar.mo23319d(GetCountriesQuery.Country.RESPONSE_FIELDS[2], this.this$0.getDescription());
    }
}
