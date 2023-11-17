package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class BiometricLoginQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ BiometricLoginQuery this$0;

    BiometricLoginQuery$variables$1(BiometricLoginQuery biometricLoginQuery) {
        this.this$0 = biometricLoginQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new BiometricLoginQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BiometricLoginQuery biometricLoginQuery = this.this$0;
        linkedHashMap.put("username", biometricLoginQuery.getUsername());
        linkedHashMap.put("authToken", biometricLoginQuery.getAuthToken());
        linkedHashMap.put("deviceId", biometricLoginQuery.getDeviceId());
        linkedHashMap.put("processReference", biometricLoginQuery.getProcessReference());
        linkedHashMap.put("tmxSessionId", biometricLoginQuery.getTmxSessionId());
        return linkedHashMap;
    }
}
