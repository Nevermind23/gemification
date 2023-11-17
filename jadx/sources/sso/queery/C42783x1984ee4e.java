package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.GetUsernamePolicyRulesQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42783x1984ee4e implements C8106f {
    final /* synthetic */ GetUsernamePolicyRulesQuery this$0;

    public C42783x1984ee4e(GetUsernamePolicyRulesQuery getUsernamePolicyRulesQuery) {
        this.this$0 = getUsernamePolicyRulesQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
    }
}
