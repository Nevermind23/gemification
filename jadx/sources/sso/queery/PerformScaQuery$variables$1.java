package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class PerformScaQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ PerformScaQuery this$0;

    PerformScaQuery$variables$1(PerformScaQuery performScaQuery) {
        this.this$0 = performScaQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new PerformScaQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PerformScaQuery performScaQuery = this.this$0;
        linkedHashMap.put("operationReference", performScaQuery.getOperationReference());
        linkedHashMap.put("deviceId", performScaQuery.getDeviceId());
        linkedHashMap.put("authElements", performScaQuery.getAuthElements());
        return linkedHashMap;
    }
}
