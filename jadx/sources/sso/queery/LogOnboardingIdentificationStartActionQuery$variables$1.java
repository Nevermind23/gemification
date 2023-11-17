package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class LogOnboardingIdentificationStartActionQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ LogOnboardingIdentificationStartActionQuery this$0;

    LogOnboardingIdentificationStartActionQuery$variables$1(LogOnboardingIdentificationStartActionQuery logOnboardingIdentificationStartActionQuery) {
        this.this$0 = logOnboardingIdentificationStartActionQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42811xc28b4800(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LogOnboardingIdentificationStartActionQuery logOnboardingIdentificationStartActionQuery = this.this$0;
        linkedHashMap.put("processReference", logOnboardingIdentificationStartActionQuery.getProcessReference());
        linkedHashMap.put("operationReference", logOnboardingIdentificationStartActionQuery.getOperationReference());
        return linkedHashMap;
    }
}
