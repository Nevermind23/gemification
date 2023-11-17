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

public final class RefreshTokenQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "16a1194ff38ca23a8fc2bda9da3b7870e5bb9085b8a668c74fb85a94a3150510";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new RefreshTokenQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query refreshToken($processReference:String!, $refreshToken:String!) {\n  loginServices {\n    __typename\n    refreshToken(processReference: $processReference, refreshToken: $refreshToken) {\n      __typename\n      ...token\n    }\n  }\n}\nfragment token on TokenResponse {\n  __typename\n  keycloakRefreshToken\n  keycloakToken\n}");
    private final String processReference;
    private final String refreshToken;
    private final transient C7836g.C7839c variables = new RefreshTokenQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return RefreshTokenQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return RefreshTokenQuery.QUERY_DOCUMENT;
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
                return new RefreshTokenQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], RefreshTokenQuery$Data$Companion$invoke$1$loginServices$1.INSTANCE));
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
            return new RefreshTokenQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public RefreshTokenQuery(String str, String str2) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "refreshToken");
        this.processReference = str;
        this.refreshToken = str2;
    }

    public static /* synthetic */ RefreshTokenQuery copy$default(RefreshTokenQuery refreshTokenQuery, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshTokenQuery.processReference;
        }
        if ((i & 2) != 0) {
            str2 = refreshTokenQuery.refreshToken;
        }
        return refreshTokenQuery.copy(str, str2);
    }

    public final String component1() {
        return this.processReference;
    }

    public final String component2() {
        return this.refreshToken;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final RefreshTokenQuery copy(String str, String str2) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "refreshToken");
        return new RefreshTokenQuery(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshTokenQuery)) {
            return false;
        }
        RefreshTokenQuery refreshTokenQuery = (RefreshTokenQuery) obj;
        return C41536l.m120484d(this.processReference, refreshTokenQuery.processReference) && C41536l.m120484d(this.refreshToken, refreshTokenQuery.refreshToken);
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        return (this.processReference.hashCode() * 31) + this.refreshToken.hashCode();
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
        return new RefreshTokenQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "RefreshTokenQuery(processReference=" + this.processReference + ", refreshToken=" + this.refreshToken + ')';
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
        private final RefreshToken refreshToken;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42818xf35c1eee();
            }

            public final LoginServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LoginServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LoginServices(h, (RefreshToken) oVar.mo19023f(LoginServices.RESPONSE_FIELDS[1], C42822x14e0dedb.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("refreshToken", "refreshToken", C41344r0.m119931m(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("refreshToken", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "refreshToken")))), true, (List) null)};
        }

        public LoginServices(String str, RefreshToken refreshToken2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.refreshToken = refreshToken2;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, RefreshToken refreshToken2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                refreshToken2 = loginServices.refreshToken;
            }
            return loginServices.copy(str, refreshToken2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final RefreshToken component2() {
            return this.refreshToken;
        }

        public final LoginServices copy(String str, RefreshToken refreshToken2) {
            C41536l.m120489i(str, "__typename");
            return new LoginServices(str, refreshToken2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginServices)) {
                return false;
            }
            LoginServices loginServices = (LoginServices) obj;
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.refreshToken, loginServices.refreshToken);
        }

        public final RefreshToken getRefreshToken() {
            return this.refreshToken;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            RefreshToken refreshToken2 = this.refreshToken;
            return hashCode + (refreshToken2 == null ? 0 : refreshToken2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new RefreshTokenQuery$LoginServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", refreshToken=" + this.refreshToken + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoginServices(String str, RefreshToken refreshToken2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginServices" : str, refreshToken2);
        }
    }

    public static final class RefreshToken {
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
                return new C42819x9c920723();
            }

            public final RefreshToken invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RefreshToken.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RefreshToken(h, Fragments.Companion.invoke(oVar));
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
                    return new C42820xe8049864();
                }

                public final Fragments invoke(C8124o oVar) {
                    C41536l.m120489i(oVar, "reader");
                    Object d = oVar.mo19021d(Fragments.RESPONSE_FIELDS[0], C42823x6e822fcc.INSTANCE);
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
                return new C42821xe185e446(this);
            }

            public String toString() {
                return "Fragments(token=" + this.token + ')';
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null)};
        }

        public RefreshToken(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            this.__typename = str;
            this.fragments = fragments2;
        }

        public static /* synthetic */ RefreshToken copy$default(RefreshToken refreshToken, String str, Fragments fragments2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = refreshToken.__typename;
            }
            if ((i & 2) != 0) {
                fragments2 = refreshToken.fragments;
            }
            return refreshToken.copy(str, fragments2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Fragments component2() {
            return this.fragments;
        }

        public final RefreshToken copy(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            return new RefreshToken(str, fragments2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshToken)) {
                return false;
            }
            RefreshToken refreshToken = (RefreshToken) obj;
            return C41536l.m120484d(this.__typename, refreshToken.__typename) && C41536l.m120484d(this.fragments, refreshToken.fragments);
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
            return new RefreshTokenQuery$RefreshToken$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "RefreshToken(__typename=" + this.__typename + ", fragments=" + this.fragments + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RefreshToken(String str, Fragments fragments2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "TokenResponse" : str, fragments2);
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
