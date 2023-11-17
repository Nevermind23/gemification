package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41233s;
import java.math.BigDecimal;
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
import sso.type.CustomType;
import sso.type.StrongAuthMethod;

public final class GetRelatedCompaniesQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "f4e081493260ab64bf1aed13c51d2023f32b8c5872145bc42632b494953087d7";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetRelatedCompaniesQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getRelatedCompaniesQuery($processReference: String!) {\n  loginServices {\n    __typename\n    getRelatedCompanies(processReference: $processReference) {\n      __typename\n      clientKey\n      clientName\n      icon\n      isStrongAuthRequired\n      strongAuthMethod\n    }\n  }\n}");
    private final String processReference;
    private final transient C7836g.C7839c variables = new GetRelatedCompaniesQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetRelatedCompaniesQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetRelatedCompaniesQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("loginServices", "loginServices", (Map) null, true, (List) null)};
        private final LoginServices loginServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetRelatedCompaniesQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetRelatedCompaniesQuery$Data$Companion$invoke$1$loginServices$1.INSTANCE));
            }
        }

        public Data(LoginServices loginServices2) {
            this.loginServices = loginServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, LoginServices loginServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                loginServices2 = data.loginServices;
            }
            return data.copy(loginServices2);
        }

        public final LoginServices component1() {
            return this.loginServices;
        }

        public final Data copy(LoginServices loginServices2) {
            return new Data(loginServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.loginServices, ((Data) obj).loginServices);
        }

        public final LoginServices getLoginServices() {
            return this.loginServices;
        }

        public int hashCode() {
            LoginServices loginServices2 = this.loginServices;
            if (loginServices2 == null) {
                return 0;
            }
            return loginServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetRelatedCompaniesQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public GetRelatedCompaniesQuery(String str) {
        C41536l.m120489i(str, "processReference");
        this.processReference = str;
    }

    public static /* synthetic */ GetRelatedCompaniesQuery copy$default(GetRelatedCompaniesQuery getRelatedCompaniesQuery, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRelatedCompaniesQuery.processReference;
        }
        return getRelatedCompaniesQuery.copy(str);
    }

    public final String component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetRelatedCompaniesQuery copy(String str) {
        C41536l.m120489i(str, "processReference");
        return new GetRelatedCompaniesQuery(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetRelatedCompaniesQuery) && C41536l.m120484d(this.processReference, ((GetRelatedCompaniesQuery) obj).processReference);
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return this.processReference.hashCode();
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
        return new GetRelatedCompaniesQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetRelatedCompaniesQuery(processReference=" + this.processReference + ')';
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

    public static final class LoginServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final List<GetRelatedCompany> getRelatedCompanies;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42722x805236();
            }

            public final LoginServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LoginServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LoginServices(h, oVar.mo19026i(LoginServices.RESPONSE_FIELDS[1], C42725x3c628dcb.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("getRelatedCompanies", "getRelatedCompanies", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public LoginServices(String str, List<GetRelatedCompany> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getRelatedCompanies = list;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, List<GetRelatedCompany> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                list = loginServices.getRelatedCompanies;
            }
            return loginServices.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<GetRelatedCompany> component2() {
            return this.getRelatedCompanies;
        }

        public final LoginServices copy(String str, List<GetRelatedCompany> list) {
            C41536l.m120489i(str, "__typename");
            return new LoginServices(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginServices)) {
                return false;
            }
            LoginServices loginServices = (LoginServices) obj;
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.getRelatedCompanies, loginServices.getRelatedCompanies);
        }

        public final List<GetRelatedCompany> getGetRelatedCompanies() {
            return this.getRelatedCompanies;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<GetRelatedCompany> list = this.getRelatedCompanies;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42723x87de398(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", getRelatedCompanies=" + this.getRelatedCompanies + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoginServices(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginServices" : str, list);
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

    public static final class GetRelatedCompany {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final BigDecimal clientKey;
        private final String clientName;
        private final String icon;
        private final Boolean isStrongAuthRequired;
        private final StrongAuthMethod strongAuthMethod;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42720x313159b5();
            }

            public final GetRelatedCompany invoke(C8124o oVar) {
                StrongAuthMethod strongAuthMethod;
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetRelatedCompany.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                BigDecimal bigDecimal = (BigDecimal) oVar.mo19019b((C7846k.C7848b) GetRelatedCompany.RESPONSE_FIELDS[1]);
                String h2 = oVar.mo19025h(GetRelatedCompany.RESPONSE_FIELDS[2]);
                String h3 = oVar.mo19025h(GetRelatedCompany.RESPONSE_FIELDS[3]);
                Boolean j = oVar.mo19027j(GetRelatedCompany.RESPONSE_FIELDS[4]);
                String h4 = oVar.mo19025h(GetRelatedCompany.RESPONSE_FIELDS[5]);
                if (h4 != null) {
                    strongAuthMethod = StrongAuthMethod.Companion.safeValueOf(h4);
                } else {
                    strongAuthMethod = null;
                }
                return new GetRelatedCompany(h, bigDecimal, h2, h3, j, strongAuthMethod);
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22811b("clientKey", "clientKey", (Map) null, true, CustomType.LONG, (List) null), aVar.mo22817h("clientName", "clientName", (Map) null, true, (List) null), aVar.mo22817h("icon", "icon", (Map) null, true, (List) null), aVar.mo22810a("isStrongAuthRequired", "isStrongAuthRequired", (Map) null, true, (List) null), aVar.mo22812c("strongAuthMethod", "strongAuthMethod", (Map) null, true, (List) null)};
        }

        public GetRelatedCompany(String str, BigDecimal bigDecimal, String str2, String str3, Boolean bool, StrongAuthMethod strongAuthMethod2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.clientKey = bigDecimal;
            this.clientName = str2;
            this.icon = str3;
            this.isStrongAuthRequired = bool;
            this.strongAuthMethod = strongAuthMethod2;
        }

        public static /* synthetic */ GetRelatedCompany copy$default(GetRelatedCompany getRelatedCompany, String str, BigDecimal bigDecimal, String str2, String str3, Boolean bool, StrongAuthMethod strongAuthMethod2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getRelatedCompany.__typename;
            }
            if ((i & 2) != 0) {
                bigDecimal = getRelatedCompany.clientKey;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            if ((i & 4) != 0) {
                str2 = getRelatedCompany.clientName;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                str3 = getRelatedCompany.icon;
            }
            String str5 = str3;
            if ((i & 16) != 0) {
                bool = getRelatedCompany.isStrongAuthRequired;
            }
            Boolean bool2 = bool;
            if ((i & 32) != 0) {
                strongAuthMethod2 = getRelatedCompany.strongAuthMethod;
            }
            return getRelatedCompany.copy(str, bigDecimal2, str4, str5, bool2, strongAuthMethod2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final BigDecimal component2() {
            return this.clientKey;
        }

        public final String component3() {
            return this.clientName;
        }

        public final String component4() {
            return this.icon;
        }

        public final Boolean component5() {
            return this.isStrongAuthRequired;
        }

        public final StrongAuthMethod component6() {
            return this.strongAuthMethod;
        }

        public final GetRelatedCompany copy(String str, BigDecimal bigDecimal, String str2, String str3, Boolean bool, StrongAuthMethod strongAuthMethod2) {
            C41536l.m120489i(str, "__typename");
            return new GetRelatedCompany(str, bigDecimal, str2, str3, bool, strongAuthMethod2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetRelatedCompany)) {
                return false;
            }
            GetRelatedCompany getRelatedCompany = (GetRelatedCompany) obj;
            return C41536l.m120484d(this.__typename, getRelatedCompany.__typename) && C41536l.m120484d(this.clientKey, getRelatedCompany.clientKey) && C41536l.m120484d(this.clientName, getRelatedCompany.clientName) && C41536l.m120484d(this.icon, getRelatedCompany.icon) && C41536l.m120484d(this.isStrongAuthRequired, getRelatedCompany.isStrongAuthRequired) && this.strongAuthMethod == getRelatedCompany.strongAuthMethod;
        }

        public final BigDecimal getClientKey() {
            return this.clientKey;
        }

        public final String getClientName() {
            return this.clientName;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final StrongAuthMethod getStrongAuthMethod() {
            return this.strongAuthMethod;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            BigDecimal bigDecimal = this.clientKey;
            int i = 0;
            int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str = this.clientName;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.icon;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isStrongAuthRequired;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            StrongAuthMethod strongAuthMethod2 = this.strongAuthMethod;
            if (strongAuthMethod2 != null) {
                i = strongAuthMethod2.hashCode();
            }
            return hashCode5 + i;
        }

        public final Boolean isStrongAuthRequired() {
            return this.isStrongAuthRequired;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42721x366e3657(this);
        }

        public String toString() {
            return "GetRelatedCompany(__typename=" + this.__typename + ", clientKey=" + this.clientKey + ", clientName=" + this.clientName + ", icon=" + this.icon + ", isStrongAuthRequired=" + this.isStrongAuthRequired + ", strongAuthMethod=" + this.strongAuthMethod + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetRelatedCompany(String str, BigDecimal bigDecimal, String str2, String str3, Boolean bool, StrongAuthMethod strongAuthMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "RelatedCompany" : str, bigDecimal, str2, str3, bool, strongAuthMethod2);
        }
    }
}
