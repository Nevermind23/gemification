package sso.queery;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.CheckResetFlowValidParametersQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42615x4ba16666 implements C8106f {
    final /* synthetic */ CheckResetFlowValidParametersQuery this$0;

    public C42615x4ba16666(CheckResetFlowValidParametersQuery checkResetFlowValidParametersQuery) {
        this.this$0 = checkResetFlowValidParametersQuery;
    }

    public void marshal(C8108g gVar) {
        C42616xae9adee5 r1;
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getFlowType().f22756b) {
            gVar.mo23291a("flowType", (String) this.this$0.getFlowType().f22755a);
        }
        if (this.this$0.getIdHashes().f22756b) {
            List list = (List) this.this$0.getIdHashes().f22755a;
            if (list != null) {
                C8108g.C8112c.C8113a aVar = C8108g.C8112c.f23265a;
                r1 = new C42616xae9adee5(list);
            } else {
                r1 = null;
            }
            gVar.mo23296f("idHashes", r1);
        }
    }
}
