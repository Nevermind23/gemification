package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class SaveUserOnDeviceQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ SaveUserOnDeviceQuery this$0;

    public SaveUserOnDeviceQuery$variables$1$marshaller$$inlined$invoke$1(SaveUserOnDeviceQuery saveUserOnDeviceQuery) {
        this.this$0 = saveUserOnDeviceQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getAppVersion().f22756b) {
            gVar.mo23291a("appVersion", (String) this.this$0.getAppVersion().f22755a);
        }
        if (this.this$0.getDeviceInfo().f22756b) {
            gVar.mo23291a("deviceInfo", (String) this.this$0.getDeviceInfo().f22755a);
        }
        if (this.this$0.getDeviceModel().f22756b) {
            gVar.mo23291a("deviceModel", (String) this.this$0.getDeviceModel().f22755a);
        }
        if (this.this$0.getExtCustomerId().f22756b) {
            gVar.mo23291a("extCustomerId", (String) this.this$0.getExtCustomerId().f22755a);
        }
        if (this.this$0.getFcmToken().f22756b) {
            gVar.mo23291a("fcmToken", (String) this.this$0.getFcmToken().f22755a);
        }
        if (this.this$0.getSignature().f22756b) {
            gVar.mo23291a("signature", (String) this.this$0.getSignature().f22755a);
        }
        if (this.this$0.getSoftVersion().f22756b) {
            gVar.mo23291a("softVersion", (String) this.this$0.getSoftVersion().f22755a);
        }
    }
}
