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
import sso.fragment.LoginInfo;

public final class BiometricLoginQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "244b9a59e2475199877a8adc00a93e3e34fc4f3bbbb7b4e6734de575ddd41d48";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new BiometricLoginQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query biometricLoginQuery($username:String!, $authToken:String!, $deviceId:String!, $processReference: String!, $tmxSessionId: String!) {\n  loginServices {\n    __typename\n    login(request: {username: $username, authToken: $authToken, deviceId: $deviceId, processReference: $processReference, tmxSessionId: $tmxSessionId}) {\n      __typename\n      ...loginInfo\n    }\n  }\n}\nfragment loginInfo on LoginResponseContent {\n  __typename\n  isChannelActive\n  isPasswordExpired\n  isUsernameChangeRequired\n  passwordChangeRequired\n  processReference\n}");
    private final String authToken;
    private final String deviceId;
    private final String processReference;
    private final String tmxSessionId;
    private final String username;
    private final transient C7836g.C7839c variables = new BiometricLoginQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return BiometricLoginQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return BiometricLoginQuery.QUERY_DOCUMENT;
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
                return new BiometricLoginQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], BiometricLoginQuery$Data$Companion$invoke$1$loginServices$1.INSTANCE));
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
            return new BiometricLoginQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public BiometricLoginQuery(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "authToken");
        C41536l.m120489i(str3, "deviceId");
        C41536l.m120489i(str4, "processReference");
        C41536l.m120489i(str5, "tmxSessionId");
        this.username = str;
        this.authToken = str2;
        this.deviceId = str3;
        this.processReference = str4;
        this.tmxSessionId = str5;
    }

    public static /* synthetic */ BiometricLoginQuery copy$default(BiometricLoginQuery biometricLoginQuery, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = biometricLoginQuery.username;
        }
        if ((i & 2) != 0) {
            str2 = biometricLoginQuery.authToken;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = biometricLoginQuery.deviceId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = biometricLoginQuery.processReference;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = biometricLoginQuery.tmxSessionId;
        }
        return biometricLoginQuery.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.authToken;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.processReference;
    }

    public final String component5() {
        return this.tmxSessionId;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final BiometricLoginQuery copy(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "authToken");
        C41536l.m120489i(str3, "deviceId");
        C41536l.m120489i(str4, "processReference");
        C41536l.m120489i(str5, "tmxSessionId");
        return new BiometricLoginQuery(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiometricLoginQuery)) {
            return false;
        }
        BiometricLoginQuery biometricLoginQuery = (BiometricLoginQuery) obj;
        return C41536l.m120484d(this.username, biometricLoginQuery.username) && C41536l.m120484d(this.authToken, biometricLoginQuery.authToken) && C41536l.m120484d(this.deviceId, biometricLoginQuery.deviceId) && C41536l.m120484d(this.processReference, biometricLoginQuery.processReference) && C41536l.m120484d(this.tmxSessionId, biometricLoginQuery.tmxSessionId);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((((((this.username.hashCode() * 31) + this.authToken.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.tmxSessionId.hashCode();
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
        return new BiometricLoginQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "BiometricLoginQuery(username=" + this.username + ", authToken=" + this.authToken + ", deviceId=" + this.deviceId + ", processReference=" + this.processReference + ", tmxSessionId=" + this.tmxSessionId + ')';
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

    public static final class Login {
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
                return new BiometricLoginQuery$Login$Companion$Mapper$$inlined$invoke$1();
            }

            public final Login invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(Login.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new Login(h, Fragments.Companion.invoke(oVar));
            }
        }

        public static final class Fragments {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */
            public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22813d("__typename", "__typename", (List) null)};
            private final LoginInfo loginInfo;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C8120m Mapper() {
                    C8120m.C8121a aVar = C8120m.f23272a;
                    return new C42591x952defe0();
                }

                public final Fragments invoke(C8124o oVar) {
                    C41536l.m120489i(oVar, "reader");
                    Object d = oVar.mo19021d(Fragments.RESPONSE_FIELDS[0], C42593xaaa22c86.INSTANCE);
                    C41536l.m120486f(d);
                    return new Fragments((LoginInfo) d);
                }
            }

            public Fragments(LoginInfo loginInfo2) {
                C41536l.m120489i(loginInfo2, "loginInfo");
                this.loginInfo = loginInfo2;
            }

            public static /* synthetic */ Fragments copy$default(Fragments fragments, LoginInfo loginInfo2, int i, Object obj) {
                if ((i & 1) != 0) {
                    loginInfo2 = fragments.loginInfo;
                }
                return fragments.copy(loginInfo2);
            }

            public final LoginInfo component1() {
                return this.loginInfo;
            }

            public final Fragments copy(LoginInfo loginInfo2) {
                C41536l.m120489i(loginInfo2, "loginInfo");
                return new Fragments(loginInfo2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fragments) && C41536l.m120484d(this.loginInfo, ((Fragments) obj).loginInfo);
            }

            public final LoginInfo getLoginInfo() {
                return this.loginInfo;
            }

            public int hashCode() {
                return this.loginInfo.hashCode();
            }

            public final C8122n marshaller() {
                C8122n.C8123a aVar = C8122n.f23274a;
                return new BiometricLoginQuery$Login$Fragments$marshaller$$inlined$invoke$1(this);
            }

            public String toString() {
                return "Fragments(loginInfo=" + this.loginInfo + ')';
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null)};
        }

        public Login(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            this.__typename = str;
            this.fragments = fragments2;
        }

        public static /* synthetic */ Login copy$default(Login login, String str, Fragments fragments2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = login.__typename;
            }
            if ((i & 2) != 0) {
                fragments2 = login.fragments;
            }
            return login.copy(str, fragments2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Fragments component2() {
            return this.fragments;
        }

        public final Login copy(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            return new Login(str, fragments2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Login)) {
                return false;
            }
            Login login = (Login) obj;
            return C41536l.m120484d(this.__typename, login.__typename) && C41536l.m120484d(this.fragments, login.fragments);
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
            return new BiometricLoginQuery$Login$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Login(__typename=" + this.__typename + ", fragments=" + this.fragments + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Login(String str, Fragments fragments2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginResponseContent" : str, fragments2);
        }
    }

    public static final class LoginServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final Login login;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42592x518a5061();
            }

            public final LoginServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LoginServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LoginServices(h, (Login) oVar.mo19023f(LoginServices.RESPONSE_FIELDS[1], BiometricLoginQuery$LoginServices$Companion$invoke$1$login$1.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("login", "login", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("username", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "username"))), C41233s.m119492a("authToken", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "authToken"))), C41233s.m119492a("deviceId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceId"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("tmxSessionId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "tmxSessionId")))))), true, (List) null)};
        }

        public LoginServices(String str, Login login2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.login = login2;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, Login login2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                login2 = loginServices.login;
            }
            return loginServices.copy(str, login2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Login component2() {
            return this.login;
        }

        public final LoginServices copy(String str, Login login2) {
            C41536l.m120489i(str, "__typename");
            return new LoginServices(str, login2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginServices)) {
                return false;
            }
            LoginServices loginServices = (LoginServices) obj;
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.login, loginServices.login);
        }

        public final Login getLogin() {
            return this.login;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            Login login2 = this.login;
            return hashCode + (login2 == null ? 0 : login2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new BiometricLoginQuery$LoginServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", login=" + this.login + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoginServices(String str, Login login2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginServices" : str, login2);
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
