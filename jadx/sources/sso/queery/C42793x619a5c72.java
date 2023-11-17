package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.IdentifyProccesFlowQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42793x619a5c72 implements C8106f {
    final /* synthetic */ IdentifyProccesFlowQuery this$0;

    public C42793x619a5c72(IdentifyProccesFlowQuery identifyProccesFlowQuery) {
        this.this$0 = identifyProccesFlowQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("pin", this.this$0.getPin());
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
    }
}
