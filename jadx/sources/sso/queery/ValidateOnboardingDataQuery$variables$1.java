package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class ValidateOnboardingDataQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ ValidateOnboardingDataQuery this$0;

    ValidateOnboardingDataQuery$variables$1(ValidateOnboardingDataQuery validateOnboardingDataQuery) {
        this.this$0 = validateOnboardingDataQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new C42908xaf4780f0(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ValidateOnboardingDataQuery validateOnboardingDataQuery = this.this$0;
        linkedHashMap.put("xDeviceKey", validateOnboardingDataQuery.getXDeviceKey());
        linkedHashMap.put("xUserAgent", validateOnboardingDataQuery.getXUserAgent());
        linkedHashMap.put("accessToken", validateOnboardingDataQuery.getAccessToken());
        if (validateOnboardingDataQuery.getDocumentBackAuditTrailImages().f22756b) {
            linkedHashMap.put("documentBackAuditTrailImages", validateOnboardingDataQuery.getDocumentBackAuditTrailImages().f22755a);
        }
        if (validateOnboardingDataQuery.getDocumentFrontAuditTrailImages().f22756b) {
            linkedHashMap.put("documentFrontAuditTrailImages", validateOnboardingDataQuery.getDocumentFrontAuditTrailImages().f22755a);
        }
        if (validateOnboardingDataQuery.getDocumentScan().f22756b) {
            linkedHashMap.put("documentScan", validateOnboardingDataQuery.getDocumentScan().f22755a);
        }
        if (validateOnboardingDataQuery.getFaceAuditTrailImages().f22756b) {
            linkedHashMap.put("faceAuditTrailImages", validateOnboardingDataQuery.getFaceAuditTrailImages().f22755a);
        }
        if (validateOnboardingDataQuery.getFaceData().f22756b) {
            linkedHashMap.put("faceData", validateOnboardingDataQuery.getFaceData().f22755a);
        }
        if (validateOnboardingDataQuery.getFaceLowQualityAuditTrailImages().f22756b) {
            linkedHashMap.put("faceLowQualityAuditTrailImages", validateOnboardingDataQuery.getFaceLowQualityAuditTrailImages().f22755a);
        }
        if (validateOnboardingDataQuery.getProcessReference().f22756b) {
            linkedHashMap.put("processReference", validateOnboardingDataQuery.getProcessReference().f22755a);
        }
        if (validateOnboardingDataQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", validateOnboardingDataQuery.getOperationReference().f22755a);
        }
        return linkedHashMap;
    }
}
