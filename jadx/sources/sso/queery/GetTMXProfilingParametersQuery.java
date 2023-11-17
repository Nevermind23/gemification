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

public final class GetTMXProfilingParametersQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "ac28ea5de1b29d01f045287dd8ba287331d2b8f7bf3c8a268894d03df1fd3737";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetTMXProfilingParametersQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getTMXProfilingParameters {\n  scaServices {\n    __typename\n    getTMXProfilingParameters {\n      __typename\n      domain\n      orgId\n      sessionId\n    }\n  }\n}");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetTMXProfilingParametersQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetTMXProfilingParametersQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("scaServices", "scaServices", (Map) null, true, (List) null)};
        private final ScaServices scaServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42755x525f568e();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((ScaServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42761x36e3fc0c.INSTANCE));
            }
        }

        public Data(ScaServices scaServices2) {
            this.scaServices = scaServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, ScaServices scaServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                scaServices2 = data.scaServices;
            }
            return data.copy(scaServices2);
        }

        public final ScaServices component1() {
            return this.scaServices;
        }

        public final Data copy(ScaServices scaServices2) {
            return new Data(scaServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.scaServices, ((Data) obj).scaServices);
        }

        public final ScaServices getScaServices() {
            return this.scaServices;
        }

        public int hashCode() {
            ScaServices scaServices2 = this.scaServices;
            if (scaServices2 == null) {
                return 0;
            }
            return scaServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetTMXProfilingParametersQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(scaServices=" + this.scaServices + ')';
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
        return new C42760x4d14f235();
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

    public static final class ScaServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final GetTMXProfilingParameters getTMXProfilingParameters;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42758x86e5672f();
            }

            public final ScaServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(ScaServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new ScaServices(h, (GetTMXProfilingParameters) oVar.mo19023f(ScaServices.RESPONSE_FIELDS[1], C42762xc146ffa5.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getTMXProfilingParameters", "getTMXProfilingParameters", (Map) null, true, (List) null)};
        }

        public ScaServices(String str, GetTMXProfilingParameters getTMXProfilingParameters2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getTMXProfilingParameters = getTMXProfilingParameters2;
        }

        public static /* synthetic */ ScaServices copy$default(ScaServices scaServices, String str, GetTMXProfilingParameters getTMXProfilingParameters2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scaServices.__typename;
            }
            if ((i & 2) != 0) {
                getTMXProfilingParameters2 = scaServices.getTMXProfilingParameters;
            }
            return scaServices.copy(str, getTMXProfilingParameters2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetTMXProfilingParameters component2() {
            return this.getTMXProfilingParameters;
        }

        public final ScaServices copy(String str, GetTMXProfilingParameters getTMXProfilingParameters2) {
            C41536l.m120489i(str, "__typename");
            return new ScaServices(str, getTMXProfilingParameters2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScaServices)) {
                return false;
            }
            ScaServices scaServices = (ScaServices) obj;
            return C41536l.m120484d(this.__typename, scaServices.__typename) && C41536l.m120484d(this.getTMXProfilingParameters, scaServices.getTMXProfilingParameters);
        }

        public final GetTMXProfilingParameters getGetTMXProfilingParameters() {
            return this.getTMXProfilingParameters;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetTMXProfilingParameters getTMXProfilingParameters2 = this.getTMXProfilingParameters;
            return hashCode + (getTMXProfilingParameters2 == null ? 0 : getTMXProfilingParameters2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42759xb1b06751(this);
        }

        public String toString() {
            return "ScaServices(__typename=" + this.__typename + ", getTMXProfilingParameters=" + this.getTMXProfilingParameters + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ScaServices(String str, GetTMXProfilingParameters getTMXProfilingParameters2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ScaServices" : str, getTMXProfilingParameters2);
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

    public static final class GetTMXProfilingParameters {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String domain;
        private final String orgId;
        private final String sessionId;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42756xa85c8477();
            }

            public final GetTMXProfilingParameters invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetTMXProfilingParameters.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetTMXProfilingParameters(h, oVar.mo19025h(GetTMXProfilingParameters.RESPONSE_FIELDS[1]), oVar.mo19025h(GetTMXProfilingParameters.RESPONSE_FIELDS[2]), oVar.mo19025h(GetTMXProfilingParameters.RESPONSE_FIELDS[3]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("domain", "domain", (Map) null, true, (List) null), aVar.mo22817h("orgId", "orgId", (Map) null, true, (List) null), aVar.mo22817h("sessionId", "sessionId", (Map) null, true, (List) null)};
        }

        public GetTMXProfilingParameters(String str, String str2, String str3, String str4) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.domain = str2;
            this.orgId = str3;
            this.sessionId = str4;
        }

        public static /* synthetic */ GetTMXProfilingParameters copy$default(GetTMXProfilingParameters getTMXProfilingParameters, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getTMXProfilingParameters.__typename;
            }
            if ((i & 2) != 0) {
                str2 = getTMXProfilingParameters.domain;
            }
            if ((i & 4) != 0) {
                str3 = getTMXProfilingParameters.orgId;
            }
            if ((i & 8) != 0) {
                str4 = getTMXProfilingParameters.sessionId;
            }
            return getTMXProfilingParameters.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.domain;
        }

        public final String component3() {
            return this.orgId;
        }

        public final String component4() {
            return this.sessionId;
        }

        public final GetTMXProfilingParameters copy(String str, String str2, String str3, String str4) {
            C41536l.m120489i(str, "__typename");
            return new GetTMXProfilingParameters(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetTMXProfilingParameters)) {
                return false;
            }
            GetTMXProfilingParameters getTMXProfilingParameters = (GetTMXProfilingParameters) obj;
            return C41536l.m120484d(this.__typename, getTMXProfilingParameters.__typename) && C41536l.m120484d(this.domain, getTMXProfilingParameters.domain) && C41536l.m120484d(this.orgId, getTMXProfilingParameters.orgId) && C41536l.m120484d(this.sessionId, getTMXProfilingParameters.sessionId);
        }

        public final String getDomain() {
            return this.domain;
        }

        public final String getOrgId() {
            return this.orgId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.domain;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.orgId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sessionId;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42757x8cf91a99(this);
        }

        public String toString() {
            return "GetTMXProfilingParameters(__typename=" + this.__typename + ", domain=" + this.domain + ", orgId=" + this.orgId + ", sessionId=" + this.sessionId + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetTMXProfilingParameters(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "TmxProfilingParametersWrapper" : str, str2, str3, str4);
        }
    }
}
