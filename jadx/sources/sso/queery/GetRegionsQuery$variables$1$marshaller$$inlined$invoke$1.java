package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class GetRegionsQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ GetRegionsQuery this$0;

    public GetRegionsQuery$variables$1$marshaller$$inlined$invoke$1(GetRegionsQuery getRegionsQuery) {
        this.this$0 = getRegionsQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("country", this.this$0.getCountry());
    }
}
