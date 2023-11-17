package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.GetResetFlowContactsQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42733x60e6e96f implements C8106f {
    final /* synthetic */ GetResetFlowContactsQuery this$0;

    public C42733x60e6e96f(GetResetFlowContactsQuery getResetFlowContactsQuery) {
        this.this$0 = getResetFlowContactsQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getFlowType().f22756b) {
            gVar.mo23291a("flowType", (String) this.this$0.getFlowType().f22755a);
        }
    }
}
