package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;
import sso.type.DeviceType;
import sso.type.Locale;

public final class RegisterDeviceQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ RegisterDeviceQuery this$0;

    public RegisterDeviceQuery$variables$1$marshaller$$inlined$invoke$1(RegisterDeviceQuery registerDeviceQuery) {
        this.this$0 = registerDeviceQuery;
    }

    public void marshal(C8108g gVar) {
        String str;
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
        String str2 = null;
        if (this.this$0.getDeviceType().f22756b) {
            DeviceType deviceType = (DeviceType) this.this$0.getDeviceType().f22755a;
            if (deviceType != null) {
                str = deviceType.getRawValue();
            } else {
                str = null;
            }
            gVar.mo23291a("deviceType", str);
        }
        if (this.this$0.getLangCode().f22756b) {
            Locale locale = (Locale) this.this$0.getLangCode().f22755a;
            if (locale != null) {
                str2 = locale.getRawValue();
            }
            gVar.mo23291a("langCode", str2);
        }
        if (this.this$0.getSoftVersion().f22756b) {
            gVar.mo23291a("softVersion", (String) this.this$0.getSoftVersion().f22755a);
        }
        if (this.this$0.getRecipientId().f22756b) {
            gVar.mo23291a("recipientId", (String) this.this$0.getRecipientId().f22755a);
        }
        if (this.this$0.getDevicePublicKey().f22756b) {
            gVar.mo23291a("devicePublicKey", (String) this.this$0.getDevicePublicKey().f22755a);
        }
        if (this.this$0.getPublicKeyAlgo().f22756b) {
            gVar.mo23291a("publicKeyAlgo", (String) this.this$0.getPublicKeyAlgo().f22755a);
        }
        if (this.this$0.getDeviceId().f22756b) {
            gVar.mo23291a("deviceId", (String) this.this$0.getDeviceId().f22755a);
        }
    }
}
