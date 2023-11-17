package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class LogOnboardingIdentificationErrorQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ LogOnboardingIdentificationErrorQuery this$0;

    LogOnboardingIdentificationErrorQuery$variables$1(LogOnboardingIdentificationErrorQuery logOnboardingIdentificationErrorQuery) {
        this.this$0 = logOnboardingIdentificationErrorQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42803x5f056b10(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LogOnboardingIdentificationErrorQuery logOnboardingIdentificationErrorQuery = this.this$0;
        linkedHashMap.put("errorKey", logOnboardingIdentificationErrorQuery.getErrorKey());
        linkedHashMap.put("errorMessage", logOnboardingIdentificationErrorQuery.getErrorMessage());
        linkedHashMap.put("operationReference", logOnboardingIdentificationErrorQuery.getOperationReference());
        linkedHashMap.put("processReference", logOnboardingIdentificationErrorQuery.getProcessReference());
        return linkedHashMap;
    }
}
