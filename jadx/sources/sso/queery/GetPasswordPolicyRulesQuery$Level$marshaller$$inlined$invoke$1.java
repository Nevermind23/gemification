package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetPasswordPolicyRulesQuery;

public final class GetPasswordPolicyRulesQuery$Level$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetPasswordPolicyRulesQuery.Level this$0;

    public GetPasswordPolicyRulesQuery$Level$marshaller$$inlined$invoke$1(GetPasswordPolicyRulesQuery.Level level) {
        this.this$0 = level;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetPasswordPolicyRulesQuery.Level.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetPasswordPolicyRulesQuery.Level.RESPONSE_FIELDS[1], this.this$0.getDescription());
        pVar.mo23319d(GetPasswordPolicyRulesQuery.Level.RESPONSE_FIELDS[2], this.this$0.getLevelKey());
        pVar.mo23318c(GetPasswordPolicyRulesQuery.Level.RESPONSE_FIELDS[3], this.this$0.getPriority());
        pVar.mo23316a(GetPasswordPolicyRulesQuery.Level.RESPONSE_FIELDS[4], this.this$0.getSupportedRules(), GetPasswordPolicyRulesQuery$Level$marshaller$1$1.INSTANCE);
    }
}
