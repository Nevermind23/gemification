package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetRegionsQuery;

public final class GetRegionsQuery$Region$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetRegionsQuery.Region this$0;

    public GetRegionsQuery$Region$marshaller$$inlined$invoke$1(GetRegionsQuery.Region region) {
        this.this$0 = region;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetRegionsQuery.Region.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetRegionsQuery.Region.RESPONSE_FIELDS[1], this.this$0.getRegion());
        pVar.mo23319d(GetRegionsQuery.Region.RESPONSE_FIELDS[2], this.this$0.getDescription());
    }
}
