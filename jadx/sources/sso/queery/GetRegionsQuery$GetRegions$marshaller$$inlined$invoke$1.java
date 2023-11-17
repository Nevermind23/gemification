package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetRegionsQuery;

public final class GetRegionsQuery$GetRegions$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetRegionsQuery.GetRegions this$0;

    public GetRegionsQuery$GetRegions$marshaller$$inlined$invoke$1(GetRegionsQuery.GetRegions getRegions) {
        this.this$0 = getRegions;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetRegionsQuery.GetRegions.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetRegionsQuery.GetRegions.RESPONSE_FIELDS[1], this.this$0.getRegions(), GetRegionsQuery$GetRegions$marshaller$1$1.INSTANCE);
    }
}
