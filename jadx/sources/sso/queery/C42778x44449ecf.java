package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetUsernamePolicyRulesQuery;

/* renamed from: sso.queery.GetUsernamePolicyRulesQuery$GetUsernamePolicyRules$marshaller$$inlined$invoke$1 */
public final class C42778x44449ecf implements C8122n {
    final /* synthetic */ GetUsernamePolicyRulesQuery.GetUsernamePolicyRules this$0;

    public C42778x44449ecf(GetUsernamePolicyRulesQuery.GetUsernamePolicyRules getUsernamePolicyRules) {
        this.this$0 = getUsernamePolicyRules;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetUsernamePolicyRulesQuery.GetUsernamePolicyRules.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetUsernamePolicyRulesQuery.GetUsernamePolicyRules.RESPONSE_FIELDS[1], this.this$0.getRules(), C42787x4a9cbf4b.INSTANCE);
    }
}
