package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
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

public final class ResetApplicationQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "88d997cd0f73f2178449f4b9ad24ff2f29583f3c30625c104205ec1b59775576";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new ResetApplicationQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query resetApplication {\n  deviceManagementServices {\n    __typename\n    resetApplication\n  }\n}");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return ResetApplicationQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return ResetApplicationQuery.QUERY_DOCUMENT;
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
                return new ResetApplicationQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((DeviceManagementServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42854x93d3d48e.INSTANCE));
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
            return new ResetApplicationQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(deviceManagementServices=" + this.deviceManagementServices + ')';
        }
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
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
        return new ResetApplicationQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public C7836g.C7839c variables() {
        return C7836g.f22757a;
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
        private final String resetApplication;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42852xe8627067();
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
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("resetApplication", "resetApplication", (Map) null, true, (List) null)};
        }

        public DeviceManagementServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.resetApplication = str2;
        }

        public static /* synthetic */ DeviceManagementServices copy$default(DeviceManagementServices deviceManagementServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceManagementServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = deviceManagementServices.resetApplication;
            }
            return deviceManagementServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.resetApplication;
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
            return C41536l.m120484d(this.__typename, deviceManagementServices.__typename) && C41536l.m120484d(this.resetApplication, deviceManagementServices.resetApplication);
        }

        public final String getResetApplication() {
            return this.resetApplication;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.resetApplication;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42853x131aba89(this);
        }

        public String toString() {
            return "DeviceManagementServices(__typename=" + this.__typename + ", resetApplication=" + this.resetApplication + ')';
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
