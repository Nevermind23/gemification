package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetLegalAddressQuery;

/* renamed from: sso.queery.GetLegalAddressQuery$GetLegalAddress$marshaller$$inlined$invoke$1 */
public final class C42664x5461cc19 implements C8122n {
    final /* synthetic */ GetLegalAddressQuery.GetLegalAddress this$0;

    public C42664x5461cc19(GetLegalAddressQuery.GetLegalAddress getLegalAddress) {
        this.this$0 = getLegalAddress;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetLegalAddressQuery.GetLegalAddress.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetLegalAddressQuery.GetLegalAddress.RESPONSE_FIELDS[1], this.this$0.getCountry());
        pVar.mo23319d(GetLegalAddressQuery.GetLegalAddress.RESPONSE_FIELDS[2], this.this$0.getCountryDesc());
        pVar.mo23319d(GetLegalAddressQuery.GetLegalAddress.RESPONSE_FIELDS[3], this.this$0.getRegion());
        pVar.mo23319d(GetLegalAddressQuery.GetLegalAddress.RESPONSE_FIELDS[4], this.this$0.getRegionDesc());
        pVar.mo23319d(GetLegalAddressQuery.GetLegalAddress.RESPONSE_FIELDS[5], this.this$0.getAddressLine());
    }
}
