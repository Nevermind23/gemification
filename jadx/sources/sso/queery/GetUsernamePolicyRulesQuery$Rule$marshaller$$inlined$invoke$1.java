package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetUsernamePolicyRulesQuery;

public final class GetUsernamePolicyRulesQuery$Rule$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetUsernamePolicyRulesQuery.Rule this$0;

    public GetUsernamePolicyRulesQuery$Rule$marshaller$$inlined$invoke$1(GetUsernamePolicyRulesQuery.Rule rule) {
        this.this$0 = rule;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetUsernamePolicyRulesQuery.Rule.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetUsernamePolicyRulesQuery.Rule.RESPONSE_FIELDS[1], this.this$0.getDescription());
        pVar.mo23320e(GetUsernamePolicyRulesQuery.Rule.RESPONSE_FIELDS[2], this.this$0.isInversiveRegEx());
        pVar.mo23319d(GetUsernamePolicyRulesQuery.Rule.RESPONSE_FIELDS[3], this.this$0.getRegEx());
        pVar.mo23319d(GetUsernamePolicyRulesQuery.Rule.RESPONSE_FIELDS[4], this.this$0.getRuleKey());
        pVar.mo23320e(GetUsernamePolicyRulesQuery.Rule.RESPONSE_FIELDS[5], this.this$0.getShowCondition());
    }
}
