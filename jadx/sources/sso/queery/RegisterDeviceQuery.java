package sso.queery;

import com.salesforce.marketingcloud.C11398b;
import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41233s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7833e;
import p217q2.C7836g;
import p217q2.C7841h;
import p217q2.C7842i;
import p217q2.C7843j;
import p217q2.C7846k;
import p217q2.C7851m;
import p243s2.C8114h;
import p243s2.C8118k;
import p243s2.C8120m;
import p243s2.C8122n;
import p243s2.C8124o;
import p243s2.C8137q;

public final class RegisterDeviceQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "ff5339a64bc5356d723573153156783b4fcf9603285998a1e988960d2c5bf1f7";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new RegisterDeviceQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query registerDevice($appVersion: String, $deviceInfo: String, $deviceModel: String, $deviceType: DeviceType, $langCode: Locale, $softVersion: String, $recipientId : String, $devicePublicKey: String, $publicKeyAlgo: String, $deviceId: String) {\n  deviceManagementServices {\n    __typename\n    registerDevice(request: {appVersion: $appVersion, deviceInfo: $deviceInfo, deviceModel: $deviceModel, deviceType: $deviceType, langCode: $langCode, softVersion: $softVersion, recipientId: $recipientId, devicePublicKey: $devicePublicKey, publicKeyAlgo: $publicKeyAlgo, deviceId: $deviceId}) {\n      __typename\n      extCustomerId\n      deviceId\n    }\n  }\n}");
    private final C7833e appVersion;
    private final C7833e deviceId;
    private final C7833e deviceInfo;
    private final C7833e deviceModel;
    private final C7833e devicePublicKey;
    private final C7833e deviceType;
    private final C7833e langCode;
    private final C7833e publicKeyAlgo;
    private final C7833e recipientId;
    private final C7833e softVersion;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return RegisterDeviceQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return RegisterDeviceQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("deviceManagementServices", "deviceManagementServices", (Map) null, true, (List) null)};
        private final DeviceManagementServices deviceManagementServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new RegisterDeviceQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((DeviceManagementServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42827xed4f6ee6.INSTANCE));
            }
        }

        public Data(DeviceManagementServices deviceManagementServices2) {
            this.deviceManagementServices = deviceManagementServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, DeviceManagementServices deviceManagementServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceManagementServices2 = data.deviceManagementServices;
            }
            return data.copy(deviceManagementServices2);
        }

        public final DeviceManagementServices component1() {
            return this.deviceManagementServices;
        }

        public final Data copy(DeviceManagementServices deviceManagementServices2) {
            return new Data(deviceManagementServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.deviceManagementServices, ((Data) obj).deviceManagementServices);
        }

        public final DeviceManagementServices getDeviceManagementServices() {
            return this.deviceManagementServices;
        }

        public int hashCode() {
            DeviceManagementServices deviceManagementServices2 = this.deviceManagementServices;
            if (deviceManagementServices2 == null) {
                return 0;
            }
            return deviceManagementServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new RegisterDeviceQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(deviceManagementServices=" + this.deviceManagementServices + ')';
        }
    }

    public RegisterDeviceQuery() {
        this((C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RegisterDeviceQuery copy$default(RegisterDeviceQuery registerDeviceQuery, C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, C7833e eVar8, C7833e eVar9, C7833e eVar10, int i, Object obj) {
        RegisterDeviceQuery registerDeviceQuery2 = registerDeviceQuery;
        int i2 = i;
        return registerDeviceQuery.copy((i2 & 1) != 0 ? registerDeviceQuery2.appVersion : eVar, (i2 & 2) != 0 ? registerDeviceQuery2.deviceInfo : eVar2, (i2 & 4) != 0 ? registerDeviceQuery2.deviceModel : eVar3, (i2 & 8) != 0 ? registerDeviceQuery2.deviceType : eVar4, (i2 & 16) != 0 ? registerDeviceQuery2.langCode : eVar5, (i2 & 32) != 0 ? registerDeviceQuery2.softVersion : eVar6, (i2 & 64) != 0 ? registerDeviceQuery2.recipientId : eVar7, (i2 & 128) != 0 ? registerDeviceQuery2.devicePublicKey : eVar8, (i2 & C11398b.f33139r) != 0 ? registerDeviceQuery2.publicKeyAlgo : eVar9, (i2 & C11398b.f33140s) != 0 ? registerDeviceQuery2.deviceId : eVar10);
    }

    public final C7833e component1() {
        return this.appVersion;
    }

    public final C7833e component10() {
        return this.deviceId;
    }

    public final C7833e component2() {
        return this.deviceInfo;
    }

    public final C7833e component3() {
        return this.deviceModel;
    }

    public final C7833e component4() {
        return this.deviceType;
    }

    public final C7833e component5() {
        return this.langCode;
    }

    public final C7833e component6() {
        return this.softVersion;
    }

    public final C7833e component7() {
        return this.recipientId;
    }

    public final C7833e component8() {
        return this.devicePublicKey;
    }

    public final C7833e component9() {
        return this.publicKeyAlgo;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final RegisterDeviceQuery copy(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, C7833e eVar8, C7833e eVar9, C7833e eVar10) {
        C41536l.m120489i(eVar, "appVersion");
        C41536l.m120489i(eVar2, "deviceInfo");
        C41536l.m120489i(eVar3, "deviceModel");
        C7833e eVar11 = eVar4;
        C41536l.m120489i(eVar11, "deviceType");
        C7833e eVar12 = eVar5;
        C41536l.m120489i(eVar12, "langCode");
        C7833e eVar13 = eVar6;
        C41536l.m120489i(eVar13, "softVersion");
        C7833e eVar14 = eVar7;
        C41536l.m120489i(eVar14, "recipientId");
        C7833e eVar15 = eVar8;
        C41536l.m120489i(eVar15, "devicePublicKey");
        C7833e eVar16 = eVar9;
        C41536l.m120489i(eVar16, "publicKeyAlgo");
        C7833e eVar17 = eVar10;
        C41536l.m120489i(eVar17, "deviceId");
        return new RegisterDeviceQuery(eVar, eVar2, eVar3, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterDeviceQuery)) {
            return false;
        }
        RegisterDeviceQuery registerDeviceQuery = (RegisterDeviceQuery) obj;
        return C41536l.m120484d(this.appVersion, registerDeviceQuery.appVersion) && C41536l.m120484d(this.deviceInfo, registerDeviceQuery.deviceInfo) && C41536l.m120484d(this.deviceModel, registerDeviceQuery.deviceModel) && C41536l.m120484d(this.deviceType, registerDeviceQuery.deviceType) && C41536l.m120484d(this.langCode, registerDeviceQuery.langCode) && C41536l.m120484d(this.softVersion, registerDeviceQuery.softVersion) && C41536l.m120484d(this.recipientId, registerDeviceQuery.recipientId) && C41536l.m120484d(this.devicePublicKey, registerDeviceQuery.devicePublicKey) && C41536l.m120484d(this.publicKeyAlgo, registerDeviceQuery.publicKeyAlgo) && C41536l.m120484d(this.deviceId, registerDeviceQuery.deviceId);
    }

    public final C7833e getAppVersion() {
        return this.appVersion;
    }

    public final C7833e getDeviceId() {
        return this.deviceId;
    }

    public final C7833e getDeviceInfo() {
        return this.deviceInfo;
    }

    public final C7833e getDeviceModel() {
        return this.deviceModel;
    }

    public final C7833e getDevicePublicKey() {
        return this.devicePublicKey;
    }

    public final C7833e getDeviceType() {
        return this.deviceType;
    }

    public final C7833e getLangCode() {
        return this.langCode;
    }

    public final C7833e getPublicKeyAlgo() {
        return this.publicKeyAlgo;
    }

    public final C7833e getRecipientId() {
        return this.recipientId;
    }

    public final C7833e getSoftVersion() {
        return this.softVersion;
    }

    public int hashCode() {
        return (((((((((((((((((this.appVersion.hashCode() * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.langCode.hashCode()) * 31) + this.softVersion.hashCode()) * 31) + this.recipientId.hashCode()) * 31) + this.devicePublicKey.hashCode()) * 31) + this.publicKeyAlgo.hashCode()) * 31) + this.deviceId.hashCode();
    }

    public C7841h name() {
        return OPERATION_NAME;
    }

    public String operationId() {
        return OPERATION_ID;
    }

    public C7843j parse(C40679d dVar, C7851m mVar) {
        C41536l.m120489i(dVar, "source");
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8137q.m30730a(dVar, this, mVar);
    }

    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    public C8120m responseFieldMapper() {
        C8120m.C8121a aVar = C8120m.f23272a;
        return new RegisterDeviceQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "RegisterDeviceQuery(appVersion=" + this.appVersion + ", deviceInfo=" + this.deviceInfo + ", deviceModel=" + this.deviceModel + ", deviceType=" + this.deviceType + ", langCode=" + this.langCode + ", softVersion=" + this.softVersion + ", recipientId=" + this.recipientId + ", devicePublicKey=" + this.devicePublicKey + ", publicKeyAlgo=" + this.publicKeyAlgo + ", deviceId=" + this.deviceId + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public RegisterDeviceQuery(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, C7833e eVar8, C7833e eVar9, C7833e eVar10) {
        C41536l.m120489i(eVar, "appVersion");
        C41536l.m120489i(eVar2, "deviceInfo");
        C41536l.m120489i(eVar3, "deviceModel");
        C41536l.m120489i(eVar4, "deviceType");
        C41536l.m120489i(eVar5, "langCode");
        C41536l.m120489i(eVar6, "softVersion");
        C41536l.m120489i(eVar7, "recipientId");
        C41536l.m120489i(eVar8, "devicePublicKey");
        C41536l.m120489i(eVar9, "publicKeyAlgo");
        C41536l.m120489i(eVar10, "deviceId");
        this.appVersion = eVar;
        this.deviceInfo = eVar2;
        this.deviceModel = eVar3;
        this.deviceType = eVar4;
        this.langCode = eVar5;
        this.softVersion = eVar6;
        this.recipientId = eVar7;
        this.devicePublicKey = eVar8;
        this.publicKeyAlgo = eVar9;
        this.deviceId = eVar10;
        this.variables = new RegisterDeviceQuery$variables$1(this);
    }

    public C40681e composeRequestBody() {
        return C8114h.m30667a(this, false, true, C7851m.f22792c);
    }

    public C7843j parse(C40681e eVar, C7851m mVar) {
        C41536l.m120489i(eVar, "byteString");
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return parse((C40679d) new C40672b().mo94717T(eVar), mVar);
    }

    public static final class DeviceManagementServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final RegisterDevice registerDevice;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42824x3092f90f();
            }

            public final DeviceManagementServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(DeviceManagementServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new DeviceManagementServices(h, (RegisterDevice) oVar.mo19023f(DeviceManagementServices.RESPONSE_FIELDS[1], C42828x39716515.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("registerDevice", "registerDevice", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("appVersion", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "appVersion"))), C41233s.m119492a("deviceInfo", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceInfo"))), C41233s.m119492a("deviceModel", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceModel"))), C41233s.m119492a("deviceType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceType"))), C41233s.m119492a("langCode", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "langCode"))), C41233s.m119492a("softVersion", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "softVersion"))), C41233s.m119492a("recipientId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "recipientId"))), C41233s.m119492a("devicePublicKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "devicePublicKey"))), C41233s.m119492a("publicKeyAlgo", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "publicKeyAlgo"))), C41233s.m119492a("deviceId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceId")))))), true, (List) null)};
        }

        public DeviceManagementServices(String str, RegisterDevice registerDevice2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.registerDevice = registerDevice2;
        }

        public static /* synthetic */ DeviceManagementServices copy$default(DeviceManagementServices deviceManagementServices, String str, RegisterDevice registerDevice2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceManagementServices.__typename;
            }
            if ((i & 2) != 0) {
                registerDevice2 = deviceManagementServices.registerDevice;
            }
            return deviceManagementServices.copy(str, registerDevice2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final RegisterDevice component2() {
            return this.registerDevice;
        }

        public final DeviceManagementServices copy(String str, RegisterDevice registerDevice2) {
            C41536l.m120489i(str, "__typename");
            return new DeviceManagementServices(str, registerDevice2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceManagementServices)) {
                return false;
            }
            DeviceManagementServices deviceManagementServices = (DeviceManagementServices) obj;
            return C41536l.m120484d(this.__typename, deviceManagementServices.__typename) && C41536l.m120484d(this.registerDevice, deviceManagementServices.registerDevice);
        }

        public final RegisterDevice getRegisterDevice() {
            return this.registerDevice;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            RegisterDevice registerDevice2 = this.registerDevice;
            return hashCode + (registerDevice2 == null ? 0 : registerDevice2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42825x49e8e131(this);
        }

        public String toString() {
            return "DeviceManagementServices(__typename=" + this.__typename + ", registerDevice=" + this.registerDevice + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceManagementServices(String str, RegisterDevice registerDevice2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "DeviceManagementServices" : str, registerDevice2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class RegisterDevice {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String deviceId;
        private final String extCustomerId;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42826x25bc2f6d();
            }

            public final RegisterDevice invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegisterDevice.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegisterDevice(h, oVar.mo19025h(RegisterDevice.RESPONSE_FIELDS[1]), oVar.mo19025h(RegisterDevice.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("extCustomerId", "extCustomerId", (Map) null, true, (List) null), aVar.mo22817h("deviceId", "deviceId", (Map) null, true, (List) null)};
        }

        public RegisterDevice(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.extCustomerId = str2;
            this.deviceId = str3;
        }

        public static /* synthetic */ RegisterDevice copy$default(RegisterDevice registerDevice, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registerDevice.__typename;
            }
            if ((i & 2) != 0) {
                str2 = registerDevice.extCustomerId;
            }
            if ((i & 4) != 0) {
                str3 = registerDevice.deviceId;
            }
            return registerDevice.copy(str, str2, str3);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.extCustomerId;
        }

        public final String component3() {
            return this.deviceId;
        }

        public final RegisterDevice copy(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            return new RegisterDevice(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterDevice)) {
                return false;
            }
            RegisterDevice registerDevice = (RegisterDevice) obj;
            return C41536l.m120484d(this.__typename, registerDevice.__typename) && C41536l.m120484d(this.extCustomerId, registerDevice.extCustomerId) && C41536l.m120484d(this.deviceId, registerDevice.deviceId);
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getExtCustomerId() {
            return this.extCustomerId;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.extCustomerId;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deviceId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new RegisterDeviceQuery$RegisterDevice$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "RegisterDevice(__typename=" + this.__typename + ", extCustomerId=" + this.extCustomerId + ", deviceId=" + this.deviceId + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegisterDevice(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "RegisterDeviceResponse" : str, str2, str3);
        }
    }

    public C40681e composeRequestBody(boolean z, boolean z2, C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, z, z2, mVar);
    }

    public C7843j parse(C40681e eVar) {
        C41536l.m120489i(eVar, "byteString");
        return parse(eVar, C7851m.f22792c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterDeviceQuery(p217q2.C7833e r11, p217q2.C7833e r12, p217q2.C7833e r13, p217q2.C7833e r14, p217q2.C7833e r15, p217q2.C7833e r16, p217q2.C7833e r17, p217q2.C7833e r18, p217q2.C7833e r19, p217q2.C7833e r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            goto L_0x000e
        L_0x000d:
            r1 = r11
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0019
            q2.e$a r2 = p217q2.C7833e.f22754c
            q2.e r2 = r2.mo22767a()
            goto L_0x001a
        L_0x0019:
            r2 = r12
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            q2.e$a r3 = p217q2.C7833e.f22754c
            q2.e r3 = r3.mo22767a()
            goto L_0x0026
        L_0x0025:
            r3 = r13
        L_0x0026:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0031
            q2.e$a r4 = p217q2.C7833e.f22754c
            q2.e r4 = r4.mo22767a()
            goto L_0x0032
        L_0x0031:
            r4 = r14
        L_0x0032:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x003d
            q2.e$a r5 = p217q2.C7833e.f22754c
            q2.e r5 = r5.mo22767a()
            goto L_0x003e
        L_0x003d:
            r5 = r15
        L_0x003e:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0049
            q2.e$a r6 = p217q2.C7833e.f22754c
            q2.e r6 = r6.mo22767a()
            goto L_0x004b
        L_0x0049:
            r6 = r16
        L_0x004b:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0056
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r7 = r7.mo22767a()
            goto L_0x0058
        L_0x0056:
            r7 = r17
        L_0x0058:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0063
            q2.e$a r8 = p217q2.C7833e.f22754c
            q2.e r8 = r8.mo22767a()
            goto L_0x0065
        L_0x0063:
            r8 = r18
        L_0x0065:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0070
            q2.e$a r9 = p217q2.C7833e.f22754c
            q2.e r9 = r9.mo22767a()
            goto L_0x0072
        L_0x0070:
            r9 = r19
        L_0x0072:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x007d
            q2.e$a r0 = p217q2.C7833e.f22754c
            q2.e r0 = r0.mo22767a()
            goto L_0x007f
        L_0x007d:
            r0 = r20
        L_0x007f:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sso.queery.RegisterDeviceQuery.<init>(q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
