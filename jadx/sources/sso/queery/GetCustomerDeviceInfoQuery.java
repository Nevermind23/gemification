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

public final class GetCustomerDeviceInfoQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "12f333fc5c803b02080fbc6b978c3e66ad6f87213296a66fac6fb5cc5a8ab07e";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetCustomerDeviceInfoQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getCustomerDeviceInfoQuery($username: String!) {\n  deviceManagementServices {\n    __typename\n    getCustomerDeviceInfo(request: {username: $username}) {\n      __typename\n      isTrusted\n    }\n  }\n}");
    private final String username;
    private final transient C7836g.C7839c variables = new GetCustomerDeviceInfoQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetCustomerDeviceInfoQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetCustomerDeviceInfoQuery.QUERY_DOCUMENT;
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
                return new C42644x5f40df9d();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((DeviceManagementServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42650x9b60d365.INSTANCE));
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
            return new GetCustomerDeviceInfoQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(deviceManagementServices=" + this.deviceManagementServices + ')';
        }
    }

    public GetCustomerDeviceInfoQuery(String str) {
        C41536l.m120489i(str, "username");
        this.username = str;
    }

    public static /* synthetic */ GetCustomerDeviceInfoQuery copy$default(GetCustomerDeviceInfoQuery getCustomerDeviceInfoQuery, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCustomerDeviceInfoQuery.username;
        }
        return getCustomerDeviceInfoQuery.copy(str);
    }

    public final String component1() {
        return this.username;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetCustomerDeviceInfoQuery copy(String str) {
        C41536l.m120489i(str, "username");
        return new GetCustomerDeviceInfoQuery(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCustomerDeviceInfoQuery) && C41536l.m120484d(this.username, ((GetCustomerDeviceInfoQuery) obj).username);
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.username.hashCode();
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
        return new GetCustomerDeviceInfoQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetCustomerDeviceInfoQuery(username=" + this.username + ')';
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
        private final GetCustomerDeviceInfo getCustomerDeviceInfo;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42645xa6413370();
            }

            public final DeviceManagementServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(DeviceManagementServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new DeviceManagementServices(h, (GetCustomerDeviceInfo) oVar.mo19023f(DeviceManagementServices.RESPONSE_FIELDS[1], C42651xf82329b7.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getCustomerDeviceInfo", "getCustomerDeviceInfo", C41342q0.m119922g(C41233s.m119492a("request", C41342q0.m119922g(C41233s.m119492a("username", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "username")))))), true, (List) null)};
        }

        public DeviceManagementServices(String str, GetCustomerDeviceInfo getCustomerDeviceInfo2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getCustomerDeviceInfo = getCustomerDeviceInfo2;
        }

        public static /* synthetic */ DeviceManagementServices copy$default(DeviceManagementServices deviceManagementServices, String str, GetCustomerDeviceInfo getCustomerDeviceInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deviceManagementServices.__typename;
            }
            if ((i & 2) != 0) {
                getCustomerDeviceInfo2 = deviceManagementServices.getCustomerDeviceInfo;
            }
            return deviceManagementServices.copy(str, getCustomerDeviceInfo2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetCustomerDeviceInfo component2() {
            return this.getCustomerDeviceInfo;
        }

        public final DeviceManagementServices copy(String str, GetCustomerDeviceInfo getCustomerDeviceInfo2) {
            C41536l.m120489i(str, "__typename");
            return new DeviceManagementServices(str, getCustomerDeviceInfo2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceManagementServices)) {
                return false;
            }
            DeviceManagementServices deviceManagementServices = (DeviceManagementServices) obj;
            return C41536l.m120484d(this.__typename, deviceManagementServices.__typename) && C41536l.m120484d(this.getCustomerDeviceInfo, deviceManagementServices.getCustomerDeviceInfo);
        }

        public final GetCustomerDeviceInfo getGetCustomerDeviceInfo() {
            return this.getCustomerDeviceInfo;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetCustomerDeviceInfo getCustomerDeviceInfo2 = this.getCustomerDeviceInfo;
            return hashCode + (getCustomerDeviceInfo2 == null ? 0 : getCustomerDeviceInfo2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42646xc3e6b852(this);
        }

        public String toString() {
            return "DeviceManagementServices(__typename=" + this.__typename + ", getCustomerDeviceInfo=" + this.getCustomerDeviceInfo + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceManagementServices(String str, GetCustomerDeviceInfo getCustomerDeviceInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "DeviceManagementServices" : str, getCustomerDeviceInfo2);
        }
    }

    public static final class GetCustomerDeviceInfo {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String isTrusted;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42647xe342e497();
            }

            public final GetCustomerDeviceInfo invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetCustomerDeviceInfo.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetCustomerDeviceInfo(h, oVar.mo19025h(GetCustomerDeviceInfo.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("isTrusted", "isTrusted", (Map) null, true, (List) null)};
        }

        public GetCustomerDeviceInfo(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.isTrusted = str2;
        }

        public static /* synthetic */ GetCustomerDeviceInfo copy$default(GetCustomerDeviceInfo getCustomerDeviceInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getCustomerDeviceInfo.__typename;
            }
            if ((i & 2) != 0) {
                str2 = getCustomerDeviceInfo.isTrusted;
            }
            return getCustomerDeviceInfo.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.isTrusted;
        }

        public final GetCustomerDeviceInfo copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new GetCustomerDeviceInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetCustomerDeviceInfo)) {
                return false;
            }
            GetCustomerDeviceInfo getCustomerDeviceInfo = (GetCustomerDeviceInfo) obj;
            return C41536l.m120484d(this.__typename, getCustomerDeviceInfo.__typename) && C41536l.m120484d(this.isTrusted, getCustomerDeviceInfo.isTrusted);
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.isTrusted;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String isTrusted() {
            return this.isTrusted;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42648xbb212b9(this);
        }

        public String toString() {
            return "GetCustomerDeviceInfo(__typename=" + this.__typename + ", isTrusted=" + this.isTrusted + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetCustomerDeviceInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CustomerDevice" : str, str2);
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
