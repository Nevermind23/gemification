package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetPasswordPolicyRulesQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetPasswordPolicyRulesQuery this$0;

    GetPasswordPolicyRulesQuery$variables$1(GetPasswordPolicyRulesQuery getPasswordPolicyRulesQuery) {
        this.this$0 = getPasswordPolicyRulesQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42705x4104a829(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetPasswordPolicyRulesQuery getPasswordPolicyRulesQuery = this.this$0;
        if (getPasswordPolicyRulesQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", getPasswordPolicyRulesQuery.getProcessReference().f22755a);
        }
        return linkedHashMap;
    }
}
