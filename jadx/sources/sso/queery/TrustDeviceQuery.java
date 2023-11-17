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

public final class TrustDeviceQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "a6ec154c984b1ab58eafc9febdca4997599c247db7a90b261499261c22bf9221";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new TrustDeviceQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query trustDeviceQuery($deviceId: String!, $deviceReference: Long, $isAlreadyAuthorized: Boolean!, $operationId: String, $operationReference: String, $processReference: String!, $scaAuthCode: String) {\n  deviceManagementServices {\n    __typename\n    trustDevice(request: {deviceId: $deviceId, deviceReference: $deviceReference, isAlreadyAuthorized: $isAlreadyAuthorized, operationId: $operationId, operationReference: $operationReference, processReference: $processReference, scaAuthCode: $scaAuthCode})\n  }\n}");
    private final String deviceId;
    private final C7833e deviceReference;
    private final boolean isAlreadyAuthorized;
    private final C7833e operationId;
    private final C7833e operationReference;
    private final String processReference;
    private final C7833e scaAuthCode;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return TrustDeviceQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return TrustDeviceQuery.QUERY_DOCUMENT;
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
                return new TrustDeviceQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((DeviceManagementServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42875x3d205b9b.INSTANCE));
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
            return new TrustDeviceQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(deviceManagementServices=" + this.deviceManagementServices + ')';
        }
    }

    public TrustDeviceQuery(String str, C7833e eVar, boolean z, C7833e eVar2, C7833e eVar3, String str2, C7833e eVar4) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(eVar, "deviceReference");
        C41536l.m120489i(eVar2, "operationId");
        C41536l.m120489i(eVar3, "operationReference");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(eVar4, "scaAuthCode");
        this.deviceId = str;
        this.deviceReference = eVar;
        this.isAlreadyAuthorized = z;
        this.operationId = eVar2;
        this.operationReference = eVar3;
        this.processReference = str2;
        this.scaAuthCode = eVar4;
        this.variables = new TrustDeviceQuery$variables$1(this);
    }

    public static /* synthetic */ TrustDeviceQuery copy$default(TrustDeviceQuery trustDeviceQuery, String str, C7833e eVar, boolean z, C7833e eVar2, C7833e eVar3, String str2, C7833e eVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trustDeviceQuery.deviceId;
        }
        if ((i & 2) != 0) {
            eVar = trustDeviceQuery.deviceReference;
        }
        C7833e eVar5 = eVar;
        if ((i & 4) != 0) {
            z = trustDeviceQuery.isAlreadyAuthorized;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            eVar2 = trustDeviceQuery.operationId;
        }
        C7833e eVar6 = eVar2;
        if ((i & 16) != 0) {
            eVar3 = trustDeviceQuery.operationReference;
        }
        C7833e eVar7 = eVar3;
        if ((i & 32) != 0) {
            str2 = trustDeviceQuery.processReference;
        }
        String str3 = str2;
        if ((i & 64) != 0) {
            eVar4 = trustDeviceQuery.scaAuthCode;
        }
        return trustDeviceQuery.copy(str, eVar5, z2, eVar6, eVar7, str3, eVar4);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final C7833e component2() {
        return this.deviceReference;
    }

    public final boolean component3() {
        return this.isAlreadyAuthorized;
    }

    public final C7833e component4() {
        return this.operationId;
    }

    public final C7833e component5() {
        return this.operationReference;
    }

    public final String component6() {
        return this.processReference;
    }

    public final C7833e component7() {
        return this.scaAuthCode;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final TrustDeviceQuery copy(String str, C7833e eVar, boolean z, C7833e eVar2, C7833e eVar3, String str2, C7833e eVar4) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(eVar, "deviceReference");
        C41536l.m120489i(eVar2, "operationId");
        C41536l.m120489i(eVar3, "operationReference");
        C41536l.m120489i(str2, "processReference");
        C7833e eVar5 = eVar4;
        C41536l.m120489i(eVar5, "scaAuthCode");
        return new TrustDeviceQuery(str, eVar, z, eVar2, eVar3, str2, eVar5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustDeviceQuery)) {
            return false;
        }
        TrustDeviceQuery trustDeviceQuery = (TrustDeviceQuery) obj;
        return C41536l.m120484d(this.deviceId, trustDeviceQuery.deviceId) && C41536l.m120484d(this.deviceReference, trustDeviceQuery.deviceReference) && this.isAlreadyAuthorized == trustDeviceQuery.isAlreadyAuthorized && C41536l.m120484d(this.operationId, trustDeviceQuery.operationId) && C41536l.m120484d(this.operationReference, trustDeviceQuery.operationReference) && C41536l.m120484d(this.processReference, trustDeviceQuery.processReference) && C41536l.m120484d(this.scaAuthCode, trustDeviceQuery.scaAuthCode);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final C7833e getDeviceReference() {
        return this.deviceReference;
    }

    public final C7833e getOperationId() {
        return this.operationId;
    }

    public final C7833e getOperationReference() {
        return this.operationReference;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final C7833e getScaAuthCode() {
        return this.scaAuthCode;
    }

    public int hashCode() {
        int hashCode = ((this.deviceId.hashCode() * 31) + this.deviceReference.hashCode()) * 31;
        boolean z = this.isAlreadyAuthorized;
        if (z) {
            z = true;
        }
        return ((((((((hashCode + (z ? 1 : 0)) * 31) + this.operationId.hashCode()) * 31) + this.operationReference.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.scaAuthCode.hashCode();
    }

    public final boolean isAlreadyAuthorized() {
        return this.isAlreadyAuthorized;
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
        return new TrustDeviceQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "TrustDeviceQuery(deviceId=" + this.deviceId + ", deviceReference=" + this.deviceReference + ", isAlreadyAuthorized=" + this.isAlreadyAuthorized + ", operationId=" + this.operationId + ", operationReference=" + this.operationReference + ", processReference=" + this.processReference + ", scaAuthCode=" + this.scaAuthCode + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
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
        private final String trustDevice;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42873x16f887fa();
            }

            public final DeviceManagementServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(DeviceManagementServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new DeviceManagementServices(h, oVar.mo19025h(DeviceManagementServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("trustDevice", "trustDevice", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("deviceId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceId"))), C41233s.m119492a("deviceReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceReference"))), C41233s.m119492a("isAlreadyAuthorized", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "isAlreadyAuthorized"))), C41233s.m119492a("operationId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationId"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("scaAuthCode", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "scaAuthCode")))))), true, (List) null)};
        }

        public DeviceManagementServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.trustDevice = str2;
        }

        public static /* synthetic */ DeviceManagementServices copy$default(DeviceManagementServices deviceManagementServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceManagementServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = deviceManagementServices.trustDevice;
            }
            return deviceManagementServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.trustDevice;
        }

        public final DeviceManagementServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new DeviceManagementServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceManagementServices)) {
                return false;
            }
            DeviceManagementServices deviceManagementServices = (DeviceManagementServices) obj;
            return C41536l.m120484d(this.__typename, deviceManagementServices.__typename) && C41536l.m120484d(this.trustDevice, deviceManagementServices.trustDevice);
        }

        public final String getTrustDevice() {
            return this.trustDevice;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.trustDevice;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42874x93b2bc5c(this);
        }

        public String toString() {
            return "DeviceManagementServices(__typename=" + this.__typename + ", trustDevice=" + this.trustDevice + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceManagementServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "DeviceManagementServices" : str, str2);
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrustDeviceQuery(String str, C7833e eVar, boolean z, C7833e eVar2, C7833e eVar3, String str2, C7833e eVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar, z, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 16) != 0 ? C7833e.f22754c.mo22767a() : eVar3, str2, (i & 64) != 0 ? C7833e.f22754c.mo22767a() : eVar4);
    }
}
