package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class GetOnboardingIdentomatSessionTokenQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ GetOnboardingIdentomatSessionTokenQuery this$0;

    GetOnboardingIdentomatSessionTokenQuery$variables$1(GetOnboardingIdentomatSessionTokenQuery getOnboardingIdentomatSessionTokenQuery) {
        this.this$0 = getOnboardingIdentomatSessionTokenQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42693xfc267e68(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GetOnboardingIdentomatSessionTokenQuery getOnboardingIdentomatSessionTokenQuery = this.this$0;
        linkedHashMap.put("operationReference", getOnboardingIdentomatSessionTokenQuery.getOperationReference());
        linkedHashMap.put("processReference", getOnboardingIdentomatSessionTokenQuery.getProcessReference());
        linkedHashMap.put("isPassport", Boolean.valueOf(getOnboardingIdentomatSessionTokenQuery.isPassport()));
        return linkedHashMap;
    }
}
