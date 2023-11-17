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

public final class ActivateChannelQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "7e189b1d59db7b98d67bc4ee27cf891a2090bed73854871277799a2bbfded92a";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new ActivateChannelQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query activateChannelQuery($channelId : String, $processReference:String!, $tmxSessionId : String) {\n  loginServices {\n    __typename\n    activateChannel(request: {channelId: $channelId, processReference: $processReference, tmxSessionId: $tmxSessionId})\n  }\n}");
    private final C7833e channelId;
    private final String processReference;
    private final C7833e tmxSessionId;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return ActivateChannelQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return ActivateChannelQuery.QUERY_DOCUMENT;
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
                return new ActivateChannelQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], ActivateChannelQuery$Data$Companion$invoke$1$loginServices$1.INSTANCE));
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
            return new ActivateChannelQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public ActivateChannelQuery(C7833e eVar, String str, C7833e eVar2) {
        C41536l.m120489i(eVar, "channelId");
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(eVar2, "tmxSessionId");
        this.channelId = eVar;
        this.processReference = str;
        this.tmxSessionId = eVar2;
        this.variables = new ActivateChannelQuery$variables$1(this);
    }

    public static /* synthetic */ ActivateChannelQuery copy$default(ActivateChannelQuery activateChannelQuery, C7833e eVar, String str, C7833e eVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = activateChannelQuery.channelId;
        }
        if ((i & 2) != 0) {
            str = activateChannelQuery.processReference;
        }
        if ((i & 4) != 0) {
            eVar2 = activateChannelQuery.tmxSessionId;
        }
        return activateChannelQuery.copy(eVar, str, eVar2);
    }

    public final C7833e component1() {
        return this.channelId;
    }

    public final String component2() {
        return this.processReference;
    }

    public final C7833e component3() {
        return this.tmxSessionId;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final ActivateChannelQuery copy(C7833e eVar, String str, C7833e eVar2) {
        C41536l.m120489i(eVar, "channelId");
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(eVar2, "tmxSessionId");
        return new ActivateChannelQuery(eVar, str, eVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateChannelQuery)) {
            return false;
        }
        ActivateChannelQuery activateChannelQuery = (ActivateChannelQuery) obj;
        return C41536l.m120484d(this.channelId, activateChannelQuery.channelId) && C41536l.m120484d(this.processReference, activateChannelQuery.processReference) && C41536l.m120484d(this.tmxSessionId, activateChannelQuery.tmxSessionId);
    }

    public final C7833e getChannelId() {
        return this.channelId;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final C7833e getTmxSessionId() {
        return this.tmxSessionId;
    }

    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + this.processReference.hashCode()) * 31) + this.tmxSessionId.hashCode();
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
        return new ActivateChannelQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "ActivateChannelQuery(channelId=" + this.channelId + ", processReference=" + this.processReference + ", tmxSessionId=" + this.tmxSessionId + ')';
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
        private final String activateChannel;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42577xe2d009e0();
            }

            public final LoginServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LoginServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LoginServices(h, oVar.mo19025h(LoginServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("activateChannel", "activateChannel", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("channelId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "channelId"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("tmxSessionId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "tmxSessionId")))))), true, (List) null)};
        }

        public LoginServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.activateChannel = str2;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = loginServices.activateChannel;
            }
            return loginServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.activateChannel;
        }

        public final LoginServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new LoginServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginServices)) {
                return false;
            }
            LoginServices loginServices = (LoginServices) obj;
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.activateChannel, loginServices.activateChannel);
        }

        public final String getActivateChannel() {
            return this.activateChannel;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.activateChannel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new ActivateChannelQuery$LoginServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", activateChannel=" + this.activateChannel + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoginServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginServices" : str, str2);
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivateChannelQuery(C7833e eVar, String str, C7833e eVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, str, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar2);
    }
}
