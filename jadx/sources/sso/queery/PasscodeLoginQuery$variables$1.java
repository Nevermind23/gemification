package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class PasscodeLoginQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ PasscodeLoginQuery this$0;

    PasscodeLoginQuery$variables$1(PasscodeLoginQuery passcodeLoginQuery) {
        this.this$0 = passcodeLoginQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new PasscodeLoginQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PasscodeLoginQuery passcodeLoginQuery = this.this$0;
        linkedHashMap.put("username", passcodeLoginQuery.getUsername());
        linkedHashMap.put("passcode", passcodeLoginQuery.getPasscode());
        linkedHashMap.put("authToken", passcodeLoginQuery.getAuthToken());
        linkedHashMap.put("deviceId", passcodeLoginQuery.getDeviceId());
        linkedHashMap.put("processReference", passcodeLoginQuery.getProcessReference());
        linkedHashMap.put("tmxSessionId", passcodeLoginQuery.getTmxSessionId());
        return linkedHashMap;
    }
}
