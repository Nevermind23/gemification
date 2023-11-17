package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class ValidateOnboardingDocumentDataQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ ValidateOnboardingDocumentDataQuery this$0;

    ValidateOnboardingDocumentDataQuery$variables$1(ValidateOnboardingDocumentDataQuery validateOnboardingDocumentDataQuery) {
        this.this$0 = validateOnboardingDocumentDataQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42922x8133106b(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ValidateOnboardingDocumentDataQuery validateOnboardingDocumentDataQuery = this.this$0;
        linkedHashMap.put("xDeviceKey", validateOnboardingDocumentDataQuery.getXDeviceKey());
        linkedHashMap.put("xUserAgent", validateOnboardingDocumentDataQuery.getXUserAgent());
        linkedHashMap.put("sessionToken", validateOnboardingDocumentDataQuery.getSessionToken());
        if (validateOnboardingDocumentDataQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", validateOnboardingDocumentDataQuery.getProcessReference().f22755a);
        }
        if (validateOnboardingDocumentDataQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", validateOnboardingDocumentDataQuery.getOperationReference().f22755a);
        }
        return linkedHashMap;
    }
}
