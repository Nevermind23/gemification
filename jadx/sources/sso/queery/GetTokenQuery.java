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
import sso.fragment.Token;

public final class GetTokenQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "788f5101a0c55b109d72a9097d38c23955a4435ebb08d7e4e972c3997ee8dcbe";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetTokenQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getTokenQuery($processReference:String!) {\n  loginServices {\n    __typename\n    getToken(processReference: $processReference) {\n      __typename\n      ...token\n    }\n  }\n}\nfragment token on TokenResponse {\n  __typename\n  keycloakRefreshToken\n  keycloakToken\n}");
    private final String processReference;
    private final transient C7836g.C7839c variables = new GetTokenQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetTokenQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetTokenQuery.QUERY_DOCUMENT;
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
                return new GetTokenQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetTokenQuery$Data$Companion$invoke$1$loginServices$1.INSTANCE));
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
            return new GetTokenQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public GetTokenQuery(String str) {
        C41536l.m120489i(str, "processReference");
        this.processReference = str;
    }

    public static /* synthetic */ GetTokenQuery copy$default(GetTokenQuery getTokenQuery, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTokenQuery.processReference;
        }
        return getTokenQuery.copy(str);
    }

    public final String component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetTokenQuery copy(String str) {
        C41536l.m120489i(str, "processReference");
        return new GetTokenQuery(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetTokenQuery) && C41536l.m120484d(this.processReference, ((GetTokenQuery) obj).processReference);
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
        return new GetTokenQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetTokenQuery(processReference=" + this.processReference + ')';
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

    public static final class GetToken {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final Fragments fragments;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetTokenQuery$GetToken$Companion$Mapper$$inlined$invoke$1();
            }

            public final GetToken invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetToken.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetToken(h, Fragments.Companion.invoke(oVar));
            }
        }

        public static final class Fragments {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */
            public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22813d("__typename", "__typename", (List) null)};
            private final Token token;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C8120m Mapper() {
                    C8120m.C8121a aVar = C8120m.f23272a;
                    return new C42763xa7c3f79a();
                }

                public final Fragments invoke(C8124o oVar) {
                    C41536l.m120489i(oVar, "reader");
                    Object d = oVar.mo19021d(Fragments.RESPONSE_FIELDS[0], GetTokenQuery$GetToken$Fragments$Companion$invoke$1$token$1.INSTANCE);
                    C41536l.m120486f(d);
                    return new Fragments((Token) d);
                }
            }

            public Fragments(Token token2) {
                C41536l.m120489i(token2, "token");
                this.token = token2;
            }

            public static /* synthetic */ Fragments copy$default(Fragments fragments, Token token2, int i, Object obj) {
                if ((i & 1) != 0) {
                    token2 = fragments.token;
                }
                return fragments.copy(token2);
            }

            public final Token component1() {
                return this.token;
            }

            public final Fragments copy(Token token2) {
                C41536l.m120489i(token2, "token");
                return new Fragments(token2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fragments) && C41536l.m120484d(this.token, ((Fragments) obj).token);
            }

            public final Token getToken() {
                return this.token;
            }

            public int hashCode() {
                return this.token.hashCode();
            }

            public final C8122n marshaller() {
                C8122n.C8123a aVar = C8122n.f23274a;
                return new GetTokenQuery$GetToken$Fragments$marshaller$$inlined$invoke$1(this);
            }

            public String toString() {
                return "Fragments(token=" + this.token + ')';
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null)};
        }

        public GetToken(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            this.__typename = str;
            this.fragments = fragments2;
        }

        public static /* synthetic */ GetToken copy$default(GetToken getToken, String str, Fragments fragments2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getToken.__typename;
            }
            if ((i & 2) != 0) {
                fragments2 = getToken.fragments;
            }
            return getToken.copy(str, fragments2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Fragments component2() {
            return this.fragments;
        }

        public final GetToken copy(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            return new GetToken(str, fragments2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetToken)) {
                return false;
            }
            GetToken getToken = (GetToken) obj;
            return C41536l.m120484d(this.__typename, getToken.__typename) && C41536l.m120484d(this.fragments, getToken.fragments);
        }

        public final Fragments getFragments() {
            return this.fragments;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return (this.__typename.hashCode() * 31) + this.fragments.hashCode();
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetTokenQuery$GetToken$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "GetToken(__typename=" + this.__typename + ", fragments=" + this.fragments + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetToken(String str, Fragments fragments2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "TokenResponse" : str, fragments2);
        }
    }

    public static final class LoginServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final GetToken getToken;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetTokenQuery$LoginServices$Companion$Mapper$$inlined$invoke$1();
            }

            public final LoginServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LoginServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LoginServices(h, (GetToken) oVar.mo19023f(LoginServices.RESPONSE_FIELDS[1], GetTokenQuery$LoginServices$Companion$invoke$1$getToken$1.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getToken", "getToken", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public LoginServices(String str, GetToken getToken2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getToken = getToken2;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, GetToken getToken2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                getToken2 = loginServices.getToken;
            }
            return loginServices.copy(str, getToken2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetToken component2() {
            return this.getToken;
        }

        public final LoginServices copy(String str, GetToken getToken2) {
            C41536l.m120489i(str, "__typename");
            return new LoginServices(str, getToken2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginServices)) {
                return false;
            }
            LoginServices loginServices = (LoginServices) obj;
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.getToken, loginServices.getToken);
        }

        public final GetToken getGetToken() {
            return this.getToken;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetToken getToken2 = this.getToken;
            return hashCode + (getToken2 == null ? 0 : getToken2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetTokenQuery$LoginServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", getToken=" + this.getToken + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoginServices(String str, GetToken getToken2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginServices" : str, getToken2);
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
