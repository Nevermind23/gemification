package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class RegisterDeviceQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ RegisterDeviceQuery this$0;

    RegisterDeviceQuery$variables$1(RegisterDeviceQuery registerDeviceQuery) {
        this.this$0 = registerDeviceQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new RegisterDeviceQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RegisterDeviceQuery registerDeviceQuery = this.this$0;
        if (registerDeviceQuery.getAppVersion().f22756b) {
            linkedHashMap.put("appVersion", registerDeviceQuery.getAppVersion().f22755a);
        }
        if (registerDeviceQuery.getDeviceInfo().f22756b) {
            linkedHashMap.put("deviceInfo", registerDeviceQuery.getDeviceInfo().f22755a);
        }
        if (registerDeviceQuery.getDeviceModel().f22756b) {
            linkedHashMap.put("deviceModel", registerDeviceQuery.getDeviceModel().f22755a);
        }
        if (registerDeviceQuery.getDeviceType().f22756b) {
            linkedHashMap.put("deviceType", registerDeviceQuery.getDeviceType().f22755a);
        }
        if (registerDeviceQuery.getLangCode().f22756b) {
            linkedHashMap.put("langCode", registerDeviceQuery.getLangCode().f22755a);
        }
        if (registerDeviceQuery.getSoftVersion().f22756b) {
            linkedHashMap.put("softVersion", registerDeviceQuery.getSoftVersion().f22755a);
        }
        if (registerDeviceQuery.getRecipientId().f22756b) {
            linkedHashMap.put("recipientId", registerDeviceQuery.getRecipientId().f22755a);
        }
        if (registerDeviceQuery.getDevicePublicKey().f22756b) {
            linkedHashMap.put("devicePublicKey", registerDeviceQuery.getDevicePublicKey().f22755a);
        }
        if (registerDeviceQuery.getPublicKeyAlgo().f22756b) {
            linkedHashMap.put("publicKeyAlgo", registerDeviceQuery.getPublicKeyAlgo().f22755a);
        }
        if (registerDeviceQuery.getDeviceId().f22756b) {
            linkedHashMap.put("deviceId", registerDeviceQuery.getDeviceId().f22755a);
        }
        return linkedHashMap;
    }
}
