package qa1;

import ed1.C40762x;
import gb1.C32393w;
import hb1.C36175k;
import kotlin.jvm.internal.C41536l;
import p217q2.C7833e;
import p217q2.C7843j;
import p341ge.bog.sso_client.models.C35952m;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import sso.queery.GetCustomerDeviceInfoQuery;
import sso.queery.RegisterDeviceQuery;
import sso.queery.ResetApplicationQuery;
import sso.type.DeviceType;
import sso.type.Locale;
import ue1.C43075l;

/* renamed from: qa1.e */
public final class C27712e implements C27698a {

    /* renamed from: a */
    private final C36175k f70825a;

    public C27712e(C36175k kVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        this.f70825a = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final Boolean m85736g(C7843j jVar) {
        String str;
        GetCustomerDeviceInfoQuery.DeviceManagementServices deviceManagementServices;
        GetCustomerDeviceInfoQuery.GetCustomerDeviceInfo getCustomerDeviceInfo;
        C41536l.m120489i(jVar, "it");
        GetCustomerDeviceInfoQuery.Data data = (GetCustomerDeviceInfoQuery.Data) jVar.mo22784b();
        if (data == null || (deviceManagementServices = data.getDeviceManagementServices()) == null || (getCustomerDeviceInfo = deviceManagementServices.getGetCustomerDeviceInfo()) == null) {
            str = null;
        } else {
            str = getCustomerDeviceInfo.isTrusted();
        }
        if (str != null) {
            return Boolean.valueOf(C32393w.m95664e(str));
        }
        throw new IllegalArgumentException("Invalid isTrusted parameter".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final DeviceIdentifier m85737h(C7843j jVar) {
        RegisterDeviceQuery.DeviceManagementServices deviceManagementServices;
        RegisterDeviceQuery.RegisterDevice registerDevice;
        C41536l.m120489i(jVar, "it");
        RegisterDeviceQuery.Data data = (RegisterDeviceQuery.Data) jVar.mo22784b();
        Long l = null;
        if (data == null || (deviceManagementServices = data.getDeviceManagementServices()) == null || (registerDevice = deviceManagementServices.getRegisterDevice()) == null) {
            return null;
        }
        String extCustomerId = registerDevice.getExtCustomerId();
        if (extCustomerId != null) {
            String deviceId = registerDevice.getDeviceId();
            if (deviceId != null) {
                l = C40438v.m117100l(deviceId);
            }
            return new DeviceIdentifier(extCustomerId, l);
        }
        throw new IllegalArgumentException("Invalid extCustomerId".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final String m85738i(C7843j jVar) {
        String str;
        ResetApplicationQuery.DeviceManagementServices deviceManagementServices;
        C41536l.m120489i(jVar, "it");
        ResetApplicationQuery.Data data = (ResetApplicationQuery.Data) jVar.mo22784b();
        if (data == null || (deviceManagementServices = data.getDeviceManagementServices()) == null) {
            str = null;
        } else {
            str = deviceManagementServices.getResetApplication();
        }
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Invalid resetApplication parameter".toString());
    }

    /* renamed from: a */
    public C40762x mo67237a(String str) {
        C41536l.m120489i(str, "username");
        C40762x A = C36175k.m107584j(this.f70825a, new GetCustomerDeviceInfoQuery(str), false, (C43075l) null, 4, (Object) null).mo95062A(new C27704b());
        C41536l.m120488h(A, "apolloRxFactory.createSi…esNoToBoolean()\n        }");
        return A;
    }

    /* renamed from: b */
    public C40762x mo67238b(String str, String str2, String str3, DeviceType deviceType, C35952m mVar, String str4, String str5, String str6, String str7, String str8) {
        Locale locale;
        C36175k kVar = this.f70825a;
        C7833e.C7834a aVar = C7833e.f22754c;
        String str9 = str;
        C7833e c = aVar.mo22769c(str);
        C7833e c2 = aVar.mo22769c(str2);
        C7833e c3 = aVar.mo22769c(str3);
        C7833e c4 = aVar.mo22769c(deviceType);
        if (mVar != null) {
            locale = mVar.mo88524c();
        } else {
            locale = null;
        }
        C40762x A = C36175k.m107584j(kVar, new RegisterDeviceQuery(c, c2, c3, c4, aVar.mo22769c(locale), aVar.mo22769c(str4), aVar.mo22769c(str5), aVar.mo22769c(str7), aVar.mo22769c(str8), aVar.mo22769c(str6)), false, (C43075l) null, 4, (Object) null).mo95062A(new C27710d());
        C41536l.m120488h(A, "apolloRxFactory.createSi…)\n            }\n        }");
        return A;
    }

    /* renamed from: c */
    public C40762x mo67239c() {
        C40762x A = C36175k.m107584j(this.f70825a, new ResetApplicationQuery(), false, (C43075l) null, 4, (Object) null).mo95062A(new C27707c());
        C41536l.m120488h(A, "apolloRxFactory.createSi…\"\n            }\n        }");
        return A;
    }
}
