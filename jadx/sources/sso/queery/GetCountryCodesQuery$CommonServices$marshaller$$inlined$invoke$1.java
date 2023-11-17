package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCountryCodesQuery;

public final class GetCountryCodesQuery$CommonServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetCountryCodesQuery.CommonServices this$0;

    public GetCountryCodesQuery$CommonServices$marshaller$$inlined$invoke$1(GetCountryCodesQuery.CommonServices commonServices) {
        this.this$0 = commonServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCountryCodesQuery.CommonServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetCountryCodesQuery.CommonServices.RESPONSE_FIELDS[1], this.this$0.getGetCountryCodes(), GetCountryCodesQuery$CommonServices$marshaller$1$1.INSTANCE);
    }
}
