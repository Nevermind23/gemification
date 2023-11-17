package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class TrustDeviceQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ TrustDeviceQuery this$0;

    TrustDeviceQuery$variables$1(TrustDeviceQuery trustDeviceQuery) {
        this.this$0 = trustDeviceQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new TrustDeviceQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TrustDeviceQuery trustDeviceQuery = this.this$0;
        linkedHashMap.put("deviceId", trustDeviceQuery.getDeviceId());
        if (trustDeviceQuery.getDeviceReference().f22756b) {
            linkedHashMap.put("deviceReference", trustDeviceQuery.getDeviceReference().f22755a);
        }
        linkedHashMap.put("isAlreadyAuthorized", Boolean.valueOf(trustDeviceQuery.isAlreadyAuthorized()));
        if (trustDeviceQuery.getOperationId().f22756b) {
            linkedHashMap.put("operationId", trustDeviceQuery.getOperationId().f22755a);
        }
        if (trustDeviceQuery.getOperationReference().f22756b) {
            linkedHashMap.put("operationReference", trustDeviceQuery.getOperationReference().f22755a);
        }
        linkedHashMap.put("processReference", trustDeviceQuery.getProcessReference());
        if (trustDeviceQuery.getScaAuthCode().f22756b) {
            linkedHashMap.put("scaAuthCode", trustDeviceQuery.getScaAuthCode().f22755a);
        }
        return linkedHashMap;
    }
}
