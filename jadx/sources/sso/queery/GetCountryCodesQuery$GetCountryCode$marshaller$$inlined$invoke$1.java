package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCountryCodesQuery;

public final class GetCountryCodesQuery$GetCountryCode$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetCountryCodesQuery.GetCountryCode this$0;

    public GetCountryCodesQuery$GetCountryCode$marshaller$$inlined$invoke$1(GetCountryCodesQuery.GetCountryCode getCountryCode) {
        this.this$0 = getCountryCode;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[1], this.this$0.getCallingCode());
        pVar.mo23319d(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[2], this.this$0.getCcy());
        pVar.mo23319d(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[3], this.this$0.getCode());
        pVar.mo23319d(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[4], this.this$0.getCode2());
        pVar.mo23320e(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[5], this.this$0.getCurrentCountry());
        pVar.mo23319d(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[6], this.this$0.getName());
        pVar.mo23319d(GetCountryCodesQuery.GetCountryCode.RESPONSE_FIELDS[7], this.this$0.getOrder());
    }
}
