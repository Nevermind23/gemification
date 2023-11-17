package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetPasswordPolicyRulesQuery;

/* renamed from: sso.queery.GetPasswordPolicyRulesQuery$GetPasswordPolicyRules$marshaller$$inlined$invoke$1 */
public final class C42699x14bc06d9 implements C8122n {
    final /* synthetic */ GetPasswordPolicyRulesQuery.GetPasswordPolicyRules this$0;

    public C42699x14bc06d9(GetPasswordPolicyRulesQuery.GetPasswordPolicyRules getPasswordPolicyRules) {
        this.this$0 = getPasswordPolicyRules;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetPasswordPolicyRulesQuery.GetPasswordPolicyRules.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetPasswordPolicyRulesQuery.GetPasswordPolicyRules.RESPONSE_FIELDS[1], this.this$0.getLevels(), C42711xcd2aa0d5.INSTANCE);
        pVar.mo23316a(GetPasswordPolicyRulesQuery.GetPasswordPolicyRules.RESPONSE_FIELDS[2], this.this$0.getRules(), C42712xcd2aa0d6.INSTANCE);
    }
}
