package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41233s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

public final class UntrustDeviceQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "aa53f41060a824cb5a541ad031b61a4c4b27896f8d306fb2187b53f015519784";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new UntrustDeviceQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query UntrustDeviceQuery($deviceId: String!, $processReference: String!) {\n  deviceManagementServices {\n    __typename\n    unTrustDeviceV1(request: {deviceId: $deviceId, processReference: $processReference})\n  }\n}");
    private final String deviceId;
    private final String processReference;
    private final transient C7836g.C7839c variables = new UntrustDeviceQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return UntrustDeviceQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return UntrustDeviceQuery.QUERY_DOCUMENT;
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
                return new UntrustDeviceQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((DeviceManagementServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42878xca6ea62.INSTANCE));
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
            return new UntrustDeviceQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(deviceManagementServices=" + this.deviceManagementServices + ')';
        }
    }

    public UntrustDeviceQuery(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "processReference");
        this.deviceId = str;
        this.processReference = str2;
    }

    public static /* synthetic */ UntrustDeviceQuery copy$default(UntrustDeviceQuery untrustDeviceQuery, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = untrustDeviceQuery.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = untrustDeviceQuery.processReference;
        }
        return untrustDeviceQuery.copy(str, str2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final UntrustDeviceQuery copy(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "processReference");
        return new UntrustDeviceQuery(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UntrustDeviceQuery)) {
            return false;
        }
        UntrustDeviceQuery untrustDeviceQuery = (UntrustDeviceQuery) obj;
        return C41536l.m120484d(this.deviceId, untrustDeviceQuery.deviceId) && C41536l.m120484d(this.processReference, untrustDeviceQuery.processReference);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (this.deviceId.hashCode() * 31) + this.processReference.hashCode();
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
        return new UntrustDeviceQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "UntrustDeviceQuery(deviceId=" + this.deviceId + ", processReference=" + this.processReference + ')';
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
        private final String unTrustDeviceV1;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42876x8a913();
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
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("unTrustDeviceV1", "unTrustDeviceV1", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("deviceId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceId"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))))), true, (List) null)};
        }

        public DeviceManagementServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.unTrustDeviceV1 = str2;
        }

        public static /* synthetic */ DeviceManagementServices copy$default(DeviceManagementServices deviceManagementServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceManagementServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = deviceManagementServices.unTrustDeviceV1;
            }
            return deviceManagementServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.unTrustDeviceV1;
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
            return C41536l.m120484d(this.__typename, deviceManagementServices.__typename) && C41536l.m120484d(this.unTrustDeviceV1, deviceManagementServices.unTrustDeviceV1);
        }

        public final String getUnTrustDeviceV1() {
            return this.unTrustDeviceV1;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.unTrustDeviceV1;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42877x8f53e435(this);
        }

        public String toString() {
            return "DeviceManagementServices(__typename=" + this.__typename + ", unTrustDeviceV1=" + this.unTrustDeviceV1 + ')';
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
}
