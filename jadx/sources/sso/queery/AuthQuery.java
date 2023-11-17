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

public final class AuthQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "ce6334938ad3bb9c266d76a18cfa4d89308bb49fc5fb56f23ce0cd51d1fa58b8";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new AuthQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query auth($channel: String!, $secret: String!) {\n  auth(request: {channel: $channel, channelSecret: $secret}) {\n    __typename\n    token\n  }\n}");
    private final String channel;
    private final String secret;
    private final transient C7836g.C7839c variables = new AuthQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return AuthQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return AuthQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("auth", "auth", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("channel", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "channel"))), C41233s.m119492a("channelSecret", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "secret")))))), true, (List) null)};
        private final Auth auth;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new AuthQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((Auth) oVar.mo19023f(Data.RESPONSE_FIELDS[0], AuthQuery$Data$Companion$invoke$1$auth$1.INSTANCE));
            }
        }

        public Data(Auth auth2) {
            this.auth = auth2;
        }

        public static /* synthetic */ Data copy$default(Data data, Auth auth2, int i, Object obj) {
            if ((i & 1) != 0) {
                auth2 = data.auth;
            }
            return data.copy(auth2);
        }

        public final Auth component1() {
            return this.auth;
        }

        public final Data copy(Auth auth2) {
            return new Data(auth2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.auth, ((Data) obj).auth);
        }

        public final Auth getAuth() {
            return this.auth;
        }

        public int hashCode() {
            Auth auth2 = this.auth;
            if (auth2 == null) {
                return 0;
            }
            return auth2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new AuthQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(auth=" + this.auth + ')';
        }
    }

    public AuthQuery(String str, String str2) {
        C41536l.m120489i(str, "channel");
        C41536l.m120489i(str2, "secret");
        this.channel = str;
        this.secret = str2;
    }

    public static /* synthetic */ AuthQuery copy$default(AuthQuery authQuery, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authQuery.channel;
        }
        if ((i & 2) != 0) {
            str2 = authQuery.secret;
        }
        return authQuery.copy(str, str2);
    }

    public final String component1() {
        return this.channel;
    }

    public final String component2() {
        return this.secret;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final AuthQuery copy(String str, String str2) {
        C41536l.m120489i(str, "channel");
        C41536l.m120489i(str2, "secret");
        return new AuthQuery(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthQuery)) {
            return false;
        }
        AuthQuery authQuery = (AuthQuery) obj;
        return C41536l.m120484d(this.channel, authQuery.channel) && C41536l.m120484d(this.secret, authQuery.secret);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        return (this.channel.hashCode() * 31) + this.secret.hashCode();
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
        return new AuthQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "AuthQuery(channel=" + this.channel + ", secret=" + this.secret + ')';
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

    public static final class Auth {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String token;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new AuthQuery$Auth$Companion$Mapper$$inlined$invoke$1();
            }

            public final Auth invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(Auth.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new Auth(h, oVar.mo19025h(Auth.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("token", "token", (Map) null, true, (List) null)};
        }

        public Auth(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.token = str2;
        }

        public static /* synthetic */ Auth copy$default(Auth auth, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = auth.__typename;
            }
            if ((i & 2) != 0) {
                str2 = auth.token;
            }
            return auth.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.token;
        }

        public final Auth copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new Auth(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Auth)) {
                return false;
            }
            Auth auth = (Auth) obj;
            return C41536l.m120484d(this.__typename, auth.__typename) && C41536l.m120484d(this.token, auth.token);
        }

        public final String getToken() {
            return this.token;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.token;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new AuthQuery$Auth$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Auth(__typename=" + this.__typename + ", token=" + this.token + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Auth(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "AuthResponse" : str, str2);
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
