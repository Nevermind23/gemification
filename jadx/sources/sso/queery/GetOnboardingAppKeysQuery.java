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

public final class GetOnboardingAppKeysQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "a927167f545f5949a4886bcd5b00a57a3fffc362aa37126aa2df3d0238760a0e";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetOnboardingAppKeysQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetOnboardingAppKeysQuery($deviceType: String!) {\n  registrationServices {\n    __typename\n    getOnboardingAppKeys(request: {deviceType: $deviceType}) {\n      __typename\n      serverKey\n    }\n  }\n}");
    private final String deviceType;
    private final transient C7836g.C7839c variables = new GetOnboardingAppKeysQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetOnboardingAppKeysQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetOnboardingAppKeysQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("registrationServices", "registrationServices", (Map) null, true, (List) null)};
        private final RegistrationServices registrationServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42678xa217311();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42684x76c15771.INSTANCE));
            }
        }

        public Data(RegistrationServices registrationServices2) {
            this.registrationServices = registrationServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, RegistrationServices registrationServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                registrationServices2 = data.registrationServices;
            }
            return data.copy(registrationServices2);
        }

        public final RegistrationServices component1() {
            return this.registrationServices;
        }

        public final Data copy(RegistrationServices registrationServices2) {
            return new Data(registrationServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.registrationServices, ((Data) obj).registrationServices);
        }

        public final RegistrationServices getRegistrationServices() {
            return this.registrationServices;
        }

        public int hashCode() {
            RegistrationServices registrationServices2 = this.registrationServices;
            if (registrationServices2 == null) {
                return 0;
            }
            return registrationServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetOnboardingAppKeysQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetOnboardingAppKeysQuery(String str) {
        C41536l.m120489i(str, "deviceType");
        this.deviceType = str;
    }

    public static /* synthetic */ GetOnboardingAppKeysQuery copy$default(GetOnboardingAppKeysQuery getOnboardingAppKeysQuery, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOnboardingAppKeysQuery.deviceType;
        }
        return getOnboardingAppKeysQuery.copy(str);
    }

    public final String component1() {
        return this.deviceType;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetOnboardingAppKeysQuery copy(String str) {
        C41536l.m120489i(str, "deviceType");
        return new GetOnboardingAppKeysQuery(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetOnboardingAppKeysQuery) && C41536l.m120484d(this.deviceType, ((GetOnboardingAppKeysQuery) obj).deviceType);
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return this.deviceType.hashCode();
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
        return new GetOnboardingAppKeysQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetOnboardingAppKeysQuery(deviceType=" + this.deviceType + ')';
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

    public static final class GetOnboardingAppKeys {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String serverKey;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42679x8b7d9017();
            }

            public final GetOnboardingAppKeys invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetOnboardingAppKeys.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetOnboardingAppKeys(h, oVar.mo19025h(GetOnboardingAppKeys.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("serverKey", "serverKey", (Map) null, true, (List) null)};
        }

        public GetOnboardingAppKeys(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.serverKey = str2;
        }

        public static /* synthetic */ GetOnboardingAppKeys copy$default(GetOnboardingAppKeys getOnboardingAppKeys, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getOnboardingAppKeys.__typename;
            }
            if ((i & 2) != 0) {
                str2 = getOnboardingAppKeys.serverKey;
            }
            return getOnboardingAppKeys.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.serverKey;
        }

        public final GetOnboardingAppKeys copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new GetOnboardingAppKeys(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetOnboardingAppKeys)) {
                return false;
            }
            GetOnboardingAppKeys getOnboardingAppKeys = (GetOnboardingAppKeys) obj;
            return C41536l.m120484d(this.__typename, getOnboardingAppKeys.__typename) && C41536l.m120484d(this.serverKey, getOnboardingAppKeys.serverKey);
        }

        public final String getServerKey() {
            return this.serverKey;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.serverKey;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42680x72335e39(this);
        }

        public String toString() {
            return "GetOnboardingAppKeys(__typename=" + this.__typename + ", serverKey=" + this.serverKey + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetOnboardingAppKeys(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "OnboardingAppKeysResponse" : str, str2);
        }
    }

    public static final class RegistrationServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final GetOnboardingAppKeys getOnboardingAppKeys;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42681xcde09b64();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetOnboardingAppKeys) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42685xfd45d8ab.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getOnboardingAppKeys", "getOnboardingAppKeys", C41342q0.m119922g(C41233s.m119492a("request", C41342q0.m119922g(C41233s.m119492a("deviceType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceType")))))), true, (List) null)};
        }

        public RegistrationServices(String str, GetOnboardingAppKeys getOnboardingAppKeys2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getOnboardingAppKeys = getOnboardingAppKeys2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetOnboardingAppKeys getOnboardingAppKeys2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getOnboardingAppKeys2 = registrationServices.getOnboardingAppKeys;
            }
            return registrationServices.copy(str, getOnboardingAppKeys2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetOnboardingAppKeys component2() {
            return this.getOnboardingAppKeys;
        }

        public final RegistrationServices copy(String str, GetOnboardingAppKeys getOnboardingAppKeys2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getOnboardingAppKeys2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getOnboardingAppKeys, registrationServices.getOnboardingAppKeys);
        }

        public final GetOnboardingAppKeys getGetOnboardingAppKeys() {
            return this.getOnboardingAppKeys;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetOnboardingAppKeys getOnboardingAppKeys2 = this.getOnboardingAppKeys;
            return hashCode + (getOnboardingAppKeys2 == null ? 0 : getOnboardingAppKeys2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42682x51602746(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getOnboardingAppKeys=" + this.getOnboardingAppKeys + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetOnboardingAppKeys getOnboardingAppKeys2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getOnboardingAppKeys2);
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
