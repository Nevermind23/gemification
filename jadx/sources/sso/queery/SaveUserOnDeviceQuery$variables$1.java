package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class SaveUserOnDeviceQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ SaveUserOnDeviceQuery this$0;

    SaveUserOnDeviceQuery$variables$1(SaveUserOnDeviceQuery saveUserOnDeviceQuery) {
        this.this$0 = saveUserOnDeviceQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new SaveUserOnDeviceQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SaveUserOnDeviceQuery saveUserOnDeviceQuery = this.this$0;
        if (saveUserOnDeviceQuery.getAppVersion().f22756b) {
            linkedHashMap.put("appVersion", saveUserOnDeviceQuery.getAppVersion().f22755a);
        }
        if (saveUserOnDeviceQuery.getDeviceInfo().f22756b) {
            linkedHashMap.put("deviceInfo", saveUserOnDeviceQuery.getDeviceInfo().f22755a);
        }
        if (saveUserOnDeviceQuery.getDeviceModel().f22756b) {
            linkedHashMap.put("deviceModel", saveUserOnDeviceQuery.getDeviceModel().f22755a);
        }
        if (saveUserOnDeviceQuery.getExtCustomerId().f22756b) {
            linkedHashMap.put("extCustomerId", saveUserOnDeviceQuery.getExtCustomerId().f22755a);
        }
        if (saveUserOnDeviceQuery.getFcmToken().f22756b) {
            linkedHashMap.put("fcmToken", saveUserOnDeviceQuery.getFcmToken().f22755a);
        }
        if (saveUserOnDeviceQuery.getSignature().f22756b) {
            linkedHashMap.put("signature", saveUserOnDeviceQuery.getSignature().f22755a);
        }
        if (saveUserOnDeviceQuery.getSoftVersion().f22756b) {
            linkedHashMap.put("softVersion", saveUserOnDeviceQuery.getSoftVersion().f22755a);
        }
        return linkedHashMap;
    }
}
