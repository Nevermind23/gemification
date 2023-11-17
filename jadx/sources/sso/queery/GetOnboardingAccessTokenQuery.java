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

public final class GetOnboardingAccessTokenQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "e405f34ea6c5aefa1d418a669f6fdc17a04406efc48e5316f2c8c32d1d5b98a6";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetOnboardingAccessTokenQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetOnboardingAccessTokenQuery($contactValue: String!, $flowKey: String!, $personalNumber: String!, $processReference: String, $xDeviceKey: String, $xUserAgent: String) {\n  registrationServices {\n    __typename\n    getOnboardingAccessToken(contactValue: $contactValue, flowKey: $flowKey, personalNumber: $personalNumber, processReference: $processReference, xDeviceKey: $xDeviceKey, xUserAgent: $xUserAgent) {\n      __typename\n      accessToken\n      operationReference\n    }\n  }\n}");
    private final String contactValue;
    private final String flowKey;
    private final String personalNumber;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;
    private final C7833e xDeviceKey;
    private final C7833e xUserAgent;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetOnboardingAccessTokenQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetOnboardingAccessTokenQuery.QUERY_DOCUMENT;
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
                return new C42669x9cf25b51();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42676x22e6a731.INSTANCE));
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
            return new GetOnboardingAccessTokenQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetOnboardingAccessTokenQuery(String str, String str2, String str3, C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(str, "contactValue");
        C41536l.m120489i(str2, "flowKey");
        C41536l.m120489i(str3, "personalNumber");
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "xDeviceKey");
        C41536l.m120489i(eVar3, "xUserAgent");
        this.contactValue = str;
        this.flowKey = str2;
        this.personalNumber = str3;
        this.processReference = eVar;
        this.xDeviceKey = eVar2;
        this.xUserAgent = eVar3;
        this.variables = new GetOnboardingAccessTokenQuery$variables$1(this);
    }

    public static /* synthetic */ GetOnboardingAccessTokenQuery copy$default(GetOnboardingAccessTokenQuery getOnboardingAccessTokenQuery, String str, String str2, String str3, C7833e eVar, C7833e eVar2, C7833e eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOnboardingAccessTokenQuery.contactValue;
        }
        if ((i & 2) != 0) {
            str2 = getOnboardingAccessTokenQuery.flowKey;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = getOnboardingAccessTokenQuery.personalNumber;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            eVar = getOnboardingAccessTokenQuery.processReference;
        }
        C7833e eVar4 = eVar;
        if ((i & 16) != 0) {
            eVar2 = getOnboardingAccessTokenQuery.xDeviceKey;
        }
        C7833e eVar5 = eVar2;
        if ((i & 32) != 0) {
            eVar3 = getOnboardingAccessTokenQuery.xUserAgent;
        }
        return getOnboardingAccessTokenQuery.copy(str, str4, str5, eVar4, eVar5, eVar3);
    }

    public final String component1() {
        return this.contactValue;
    }

    public final String component2() {
        return this.flowKey;
    }

    public final String component3() {
        return this.personalNumber;
    }

    public final C7833e component4() {
        return this.processReference;
    }

    public final C7833e component5() {
        return this.xDeviceKey;
    }

    public final C7833e component6() {
        return this.xUserAgent;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetOnboardingAccessTokenQuery copy(String str, String str2, String str3, C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(str, "contactValue");
        C41536l.m120489i(str2, "flowKey");
        C41536l.m120489i(str3, "personalNumber");
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "xDeviceKey");
        C41536l.m120489i(eVar3, "xUserAgent");
        return new GetOnboardingAccessTokenQuery(str, str2, str3, eVar, eVar2, eVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOnboardingAccessTokenQuery)) {
            return false;
        }
        GetOnboardingAccessTokenQuery getOnboardingAccessTokenQuery = (GetOnboardingAccessTokenQuery) obj;
        return C41536l.m120484d(this.contactValue, getOnboardingAccessTokenQuery.contactValue) && C41536l.m120484d(this.flowKey, getOnboardingAccessTokenQuery.flowKey) && C41536l.m120484d(this.personalNumber, getOnboardingAccessTokenQuery.personalNumber) && C41536l.m120484d(this.processReference, getOnboardingAccessTokenQuery.processReference) && C41536l.m120484d(this.xDeviceKey, getOnboardingAccessTokenQuery.xDeviceKey) && C41536l.m120484d(this.xUserAgent, getOnboardingAccessTokenQuery.xUserAgent);
    }

    public final String getContactValue() {
        return this.contactValue;
    }

    public final String getFlowKey() {
        return this.flowKey;
    }

    public final String getPersonalNumber() {
        return this.personalNumber;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public final C7833e getXDeviceKey() {
        return this.xDeviceKey;
    }

    public final C7833e getXUserAgent() {
        return this.xUserAgent;
    }

    public int hashCode() {
        return (((((((((this.contactValue.hashCode() * 31) + this.flowKey.hashCode()) * 31) + this.personalNumber.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.xDeviceKey.hashCode()) * 31) + this.xUserAgent.hashCode();
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
        return new C42674xb184bb8();
    }

    public String toString() {
        return "GetOnboardingAccessTokenQuery(contactValue=" + this.contactValue + ", flowKey=" + this.flowKey + ", personalNumber=" + this.personalNumber + ", processReference=" + this.processReference + ", xDeviceKey=" + this.xDeviceKey + ", xUserAgent=" + this.xUserAgent + ')';
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

    public static final class RegistrationServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final GetOnboardingAccessToken getOnboardingAccessToken;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42672xdc5903a4();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetOnboardingAccessToken) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42677x31e8ab2b.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getOnboardingAccessToken", "getOnboardingAccessToken", C41344r0.m119931m(C41233s.m119492a("contactValue", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactValue"))), C41233s.m119492a("flowKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "flowKey"))), C41233s.m119492a("personalNumber", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "personalNumber"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("xDeviceKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "xDeviceKey"))), C41233s.m119492a("xUserAgent", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "xUserAgent")))), true, (List) null)};
        }

        public RegistrationServices(String str, GetOnboardingAccessToken getOnboardingAccessToken2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getOnboardingAccessToken = getOnboardingAccessToken2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetOnboardingAccessToken getOnboardingAccessToken2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getOnboardingAccessToken2 = registrationServices.getOnboardingAccessToken;
            }
            return registrationServices.copy(str, getOnboardingAccessToken2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetOnboardingAccessToken component2() {
            return this.getOnboardingAccessToken;
        }

        public final RegistrationServices copy(String str, GetOnboardingAccessToken getOnboardingAccessToken2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getOnboardingAccessToken2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getOnboardingAccessToken, registrationServices.getOnboardingAccessToken);
        }

        public final GetOnboardingAccessToken getGetOnboardingAccessToken() {
            return this.getOnboardingAccessToken;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetOnboardingAccessToken getOnboardingAccessToken2 = this.getOnboardingAccessToken;
            return hashCode + (getOnboardingAccessToken2 == null ? 0 : getOnboardingAccessToken2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42673x1b5bbf86(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getOnboardingAccessToken=" + this.getOnboardingAccessToken + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetOnboardingAccessToken getOnboardingAccessToken2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getOnboardingAccessToken2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class GetOnboardingAccessToken {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String accessToken;
        private final String operationReference;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42670xf6bd1097();
            }

            public final GetOnboardingAccessToken invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetOnboardingAccessToken.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetOnboardingAccessToken(h, oVar.mo19025h(GetOnboardingAccessToken.RESPONSE_FIELDS[1]), oVar.mo19025h(GetOnboardingAccessToken.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("accessToken", "accessToken", (Map) null, true, (List) null), aVar.mo22817h("operationReference", "operationReference", (Map) null, true, (List) null)};
        }

        public GetOnboardingAccessToken(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.accessToken = str2;
            this.operationReference = str3;
        }

        public static /* synthetic */ GetOnboardingAccessToken copy$default(GetOnboardingAccessToken getOnboardingAccessToken, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getOnboardingAccessToken.__typename;
            }
            if ((i & 2) != 0) {
                str2 = getOnboardingAccessToken.accessToken;
            }
            if ((i & 4) != 0) {
                str3 = getOnboardingAccessToken.operationReference;
            }
            return getOnboardingAccessToken.copy(str, str2, str3);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.accessToken;
        }

        public final String component3() {
            return this.operationReference;
        }

        public final GetOnboardingAccessToken copy(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            return new GetOnboardingAccessToken(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetOnboardingAccessToken)) {
                return false;
            }
            GetOnboardingAccessToken getOnboardingAccessToken = (GetOnboardingAccessToken) obj;
            return C41536l.m120484d(this.__typename, getOnboardingAccessToken.__typename) && C41536l.m120484d(this.accessToken, getOnboardingAccessToken.accessToken) && C41536l.m120484d(this.operationReference, getOnboardingAccessToken.operationReference);
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final String getOperationReference() {
            return this.operationReference;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.accessToken;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.operationReference;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42671x213d3eb9(this);
        }

        public String toString() {
            return "GetOnboardingAccessToken(__typename=" + this.__typename + ", accessToken=" + this.accessToken + ", operationReference=" + this.operationReference + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetOnboardingAccessToken(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "OnboardingAccessTokenResponse" : str, str2, str3);
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetOnboardingAccessTokenQuery(String str, String str2, String str3, C7833e eVar, C7833e eVar2, C7833e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 16) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 32) != 0 ? C7833e.f22754c.mo22767a() : eVar3);
    }
}
