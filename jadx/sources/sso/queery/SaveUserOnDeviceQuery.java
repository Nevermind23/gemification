package sso.queery;

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

public final class SaveUserOnDeviceQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "da13b80d2e2098e78dc884a6f3b941b8ae7851f7966bb38184531368d625bf5c";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new SaveUserOnDeviceQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query saveUserOnDevice($appVersion: String, $deviceInfo: String, $deviceModel: String, $extCustomerId: String, $fcmToken: String, $signature: String, $softVersion: String) {\n  commonServices {\n    __typename\n    saveUserOnDevice(request: {appVersion: $appVersion, deviceInfo: $deviceInfo, deviceModel: $deviceModel, extCustomerId: $extCustomerId, fcmToken: $fcmToken, signature: $signature, softVersion: $softVersion})\n  }\n}");
    private final C7833e appVersion;
    private final C7833e deviceInfo;
    private final C7833e deviceModel;
    private final C7833e extCustomerId;
    private final C7833e fcmToken;
    private final C7833e signature;
    private final C7833e softVersion;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return SaveUserOnDeviceQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return SaveUserOnDeviceQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("commonServices", "commonServices", (Map) null, true, (List) null)};
        private final CommonServices commonServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new SaveUserOnDeviceQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], SaveUserOnDeviceQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
            }
        }

        public Data(CommonServices commonServices2) {
            this.commonServices = commonServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, CommonServices commonServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                commonServices2 = data.commonServices;
            }
            return data.copy(commonServices2);
        }

        public final CommonServices component1() {
            return this.commonServices;
        }

        public final Data copy(CommonServices commonServices2) {
            return new Data(commonServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.commonServices, ((Data) obj).commonServices);
        }

        public final CommonServices getCommonServices() {
            return this.commonServices;
        }

        public int hashCode() {
            CommonServices commonServices2 = this.commonServices;
            if (commonServices2 == null) {
                return 0;
            }
            return commonServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new SaveUserOnDeviceQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
        }
    }

    public SaveUserOnDeviceQuery() {
        this((C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SaveUserOnDeviceQuery copy$default(SaveUserOnDeviceQuery saveUserOnDeviceQuery, C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = saveUserOnDeviceQuery.appVersion;
        }
        if ((i & 2) != 0) {
            eVar2 = saveUserOnDeviceQuery.deviceInfo;
        }
        C7833e eVar8 = eVar2;
        if ((i & 4) != 0) {
            eVar3 = saveUserOnDeviceQuery.deviceModel;
        }
        C7833e eVar9 = eVar3;
        if ((i & 8) != 0) {
            eVar4 = saveUserOnDeviceQuery.extCustomerId;
        }
        C7833e eVar10 = eVar4;
        if ((i & 16) != 0) {
            eVar5 = saveUserOnDeviceQuery.fcmToken;
        }
        C7833e eVar11 = eVar5;
        if ((i & 32) != 0) {
            eVar6 = saveUserOnDeviceQuery.signature;
        }
        C7833e eVar12 = eVar6;
        if ((i & 64) != 0) {
            eVar7 = saveUserOnDeviceQuery.softVersion;
        }
        return saveUserOnDeviceQuery.copy(eVar, eVar8, eVar9, eVar10, eVar11, eVar12, eVar7);
    }

    public final C7833e component1() {
        return this.appVersion;
    }

    public final C7833e component2() {
        return this.deviceInfo;
    }

    public final C7833e component3() {
        return this.deviceModel;
    }

    public final C7833e component4() {
        return this.extCustomerId;
    }

    public final C7833e component5() {
        return this.fcmToken;
    }

    public final C7833e component6() {
        return this.signature;
    }

    public final C7833e component7() {
        return this.softVersion;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final SaveUserOnDeviceQuery copy(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7) {
        C41536l.m120489i(eVar, "appVersion");
        C41536l.m120489i(eVar2, "deviceInfo");
        C41536l.m120489i(eVar3, "deviceModel");
        C41536l.m120489i(eVar4, "extCustomerId");
        C41536l.m120489i(eVar5, "fcmToken");
        C41536l.m120489i(eVar6, "signature");
        C7833e eVar8 = eVar7;
        C41536l.m120489i(eVar8, "softVersion");
        return new SaveUserOnDeviceQuery(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveUserOnDeviceQuery)) {
            return false;
        }
        SaveUserOnDeviceQuery saveUserOnDeviceQuery = (SaveUserOnDeviceQuery) obj;
        return C41536l.m120484d(this.appVersion, saveUserOnDeviceQuery.appVersion) && C41536l.m120484d(this.deviceInfo, saveUserOnDeviceQuery.deviceInfo) && C41536l.m120484d(this.deviceModel, saveUserOnDeviceQuery.deviceModel) && C41536l.m120484d(this.extCustomerId, saveUserOnDeviceQuery.extCustomerId) && C41536l.m120484d(this.fcmToken, saveUserOnDeviceQuery.fcmToken) && C41536l.m120484d(this.signature, saveUserOnDeviceQuery.signature) && C41536l.m120484d(this.softVersion, saveUserOnDeviceQuery.softVersion);
    }

    public final C7833e getAppVersion() {
        return this.appVersion;
    }

    public final C7833e getDeviceInfo() {
        return this.deviceInfo;
    }

    public final C7833e getDeviceModel() {
        return this.deviceModel;
    }

    public final C7833e getExtCustomerId() {
        return this.extCustomerId;
    }

    public final C7833e getFcmToken() {
        return this.fcmToken;
    }

    public final C7833e getSignature() {
        return this.signature;
    }

    public final C7833e getSoftVersion() {
        return this.softVersion;
    }

    public int hashCode() {
        return (((((((((((this.appVersion.hashCode() * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.extCustomerId.hashCode()) * 31) + this.fcmToken.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.softVersion.hashCode();
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
        return new SaveUserOnDeviceQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "SaveUserOnDeviceQuery(appVersion=" + this.appVersion + ", deviceInfo=" + this.deviceInfo + ", deviceModel=" + this.deviceModel + ", extCustomerId=" + this.extCustomerId + ", fcmToken=" + this.fcmToken + ", signature=" + this.signature + ", softVersion=" + this.softVersion + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public SaveUserOnDeviceQuery(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7) {
        C41536l.m120489i(eVar, "appVersion");
        C41536l.m120489i(eVar2, "deviceInfo");
        C41536l.m120489i(eVar3, "deviceModel");
        C41536l.m120489i(eVar4, "extCustomerId");
        C41536l.m120489i(eVar5, "fcmToken");
        C41536l.m120489i(eVar6, "signature");
        C41536l.m120489i(eVar7, "softVersion");
        this.appVersion = eVar;
        this.deviceInfo = eVar2;
        this.deviceModel = eVar3;
        this.extCustomerId = eVar4;
        this.fcmToken = eVar5;
        this.signature = eVar6;
        this.softVersion = eVar7;
        this.variables = new SaveUserOnDeviceQuery$variables$1(this);
    }

    public C40681e composeRequestBody() {
        return C8114h.m30667a(this, false, true, C7851m.f22792c);
    }

    public C7843j parse(C40681e eVar, C7851m mVar) {
        C41536l.m120489i(eVar, "byteString");
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return parse((C40679d) new C40672b().mo94717T(eVar), mVar);
    }

    public static final class CommonServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String saveUserOnDevice;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42855x772a719();
            }

            public final CommonServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CommonServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CommonServices(h, oVar.mo19025h(CommonServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("saveUserOnDevice", "saveUserOnDevice", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("appVersion", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "appVersion"))), C41233s.m119492a("deviceInfo", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceInfo"))), C41233s.m119492a("deviceModel", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceModel"))), C41233s.m119492a("extCustomerId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "extCustomerId"))), C41233s.m119492a("fcmToken", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "fcmToken"))), C41233s.m119492a("signature", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "signature"))), C41233s.m119492a("softVersion", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "softVersion")))))), true, (List) null)};
        }

        public CommonServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.saveUserOnDevice = str2;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = commonServices.saveUserOnDevice;
            }
            return commonServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.saveUserOnDevice;
        }

        public final CommonServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new CommonServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonServices)) {
                return false;
            }
            CommonServices commonServices = (CommonServices) obj;
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.saveUserOnDevice, commonServices.saveUserOnDevice);
        }

        public final String getSaveUserOnDevice() {
            return this.saveUserOnDevice;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.saveUserOnDevice;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42856xf57e5ebb(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", saveUserOnDevice=" + this.saveUserOnDevice + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CommonServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CommonServices" : str, str2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
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
    public /* synthetic */ SaveUserOnDeviceQuery(p217q2.C7833e r6, p217q2.C7833e r7, p217q2.C7833e r8, p217q2.C7833e r9, p217q2.C7833e r10, p217q2.C7833e r11, p217q2.C7833e r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x000a
            q2.e$a r6 = p217q2.C7833e.f22754c
            q2.e r6 = r6.mo22767a()
        L_0x000a:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0014
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r7 = r7.mo22767a()
        L_0x0014:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x001f
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r8 = r7.mo22767a()
        L_0x001f:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x002a
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r9 = r7.mo22767a()
        L_0x002a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0035
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r10 = r7.mo22767a()
        L_0x0035:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0040
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r11 = r7.mo22767a()
        L_0x0040:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x004b
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r12 = r7.mo22767a()
        L_0x004b:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sso.queery.SaveUserOnDeviceQuery.<init>(q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
