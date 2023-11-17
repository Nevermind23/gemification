package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class GetFlowQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ GetFlowQuery this$0;

    public GetFlowQuery$variables$1$marshaller$$inlined$invoke$1(GetFlowQuery getFlowQuery) {
        this.this$0 = getFlowQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
    }
}
