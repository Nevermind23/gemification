package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetUsernamePolicyRulesQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetUsernamePolicyRulesQuery this$0;

    GetUsernamePolicyRulesQuery$variables$1(GetUsernamePolicyRulesQuery getUsernamePolicyRulesQuery) {
        this.this$0 = getUsernamePolicyRulesQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42783x1984ee4e(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetUsernamePolicyRulesQuery getUsernamePolicyRulesQuery = this.this$0;
        if (getUsernamePolicyRulesQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", getUsernamePolicyRulesQuery.getProcessReference().f22755a);
        }
        return linkedHashMap;
    }
}
