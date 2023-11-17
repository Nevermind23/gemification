package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class UntrustDeviceQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ UntrustDeviceQuery this$0;

    UntrustDeviceQuery$variables$1(UntrustDeviceQuery untrustDeviceQuery) {
        this.this$0 = untrustDeviceQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new UntrustDeviceQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UntrustDeviceQuery untrustDeviceQuery = this.this$0;
        linkedHashMap.put("deviceId", untrustDeviceQuery.getDeviceId());
        linkedHashMap.put("processReference", untrustDeviceQuery.getProcessReference());
        return linkedHashMap;
    }
}
