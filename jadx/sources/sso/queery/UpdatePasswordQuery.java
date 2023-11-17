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

public final class UpdatePasswordQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "0200c4b0f6d93cee05474fb0b3adc9b7d95a9a3abb1ed1760b8153654a7c413a";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new UpdatePasswordQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query updatePasswordQuery($operationId: String, $operationReference: String, $password:String!, $processReference:String!, $scaAuthCode: String) {\n  loginServices {\n    __typename\n    updatePassword(request: {operationId: $operationId, operationReference: $operationReference, password: $password, processReference: $processReference, scaAuthCode: $scaAuthCode})\n  }\n}");
    private final C7833e operationId;
    private final C7833e operationReference;
    private final String password;
    private final String processReference;
    private final C7833e scaAuthCode;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return UpdatePasswordQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return UpdatePasswordQuery.QUERY_DOCUMENT;
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
                return new UpdatePasswordQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], UpdatePasswordQuery$Data$Companion$invoke$1$loginServices$1.INSTANCE));
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
            return new UpdatePasswordQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public UpdatePasswordQuery(C7833e eVar, C7833e eVar2, String str, String str2, C7833e eVar3) {
        C41536l.m120489i(eVar, "operationId");
        C41536l.m120489i(eVar2, "operationReference");
        C41536l.m120489i(str, "password");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(eVar3, "scaAuthCode");
        this.operationId = eVar;
        this.operationReference = eVar2;
        this.password = str;
        this.processReference = str2;
        this.scaAuthCode = eVar3;
        this.variables = new UpdatePasswordQuery$variables$1(this);
    }

    public static /* synthetic */ UpdatePasswordQuery copy$default(UpdatePasswordQuery updatePasswordQuery, C7833e eVar, C7833e eVar2, String str, String str2, C7833e eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = updatePasswordQuery.operationId;
        }
        if ((i & 2) != 0) {
            eVar2 = updatePasswordQuery.operationReference;
        }
        C7833e eVar4 = eVar2;
        if ((i & 4) != 0) {
            str = updatePasswordQuery.password;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = updatePasswordQuery.processReference;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            eVar3 = updatePasswordQuery.scaAuthCode;
        }
        return updatePasswordQuery.copy(eVar, eVar4, str3, str4, eVar3);
    }

    public final C7833e component1() {
        return this.operationId;
    }

    public final C7833e component2() {
        return this.operationReference;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.processReference;
    }

    public final C7833e component5() {
        return this.scaAuthCode;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final UpdatePasswordQuery copy(C7833e eVar, C7833e eVar2, String str, String str2, C7833e eVar3) {
        C41536l.m120489i(eVar, "operationId");
        C41536l.m120489i(eVar2, "operationReference");
        C41536l.m120489i(str, "password");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(eVar3, "scaAuthCode");
        return new UpdatePasswordQuery(eVar, eVar2, str, str2, eVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePasswordQuery)) {
            return false;
        }
        UpdatePasswordQuery updatePasswordQuery = (UpdatePasswordQuery) obj;
        return C41536l.m120484d(this.operationId, updatePasswordQuery.operationId) && C41536l.m120484d(this.operationReference, updatePasswordQuery.operationReference) && C41536l.m120484d(this.password, updatePasswordQuery.password) && C41536l.m120484d(this.processReference, updatePasswordQuery.processReference) && C41536l.m120484d(this.scaAuthCode, updatePasswordQuery.scaAuthCode);
    }

    public final C7833e getOperationId() {
        return this.operationId;
    }

    public final C7833e getOperationReference() {
        return this.operationReference;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final C7833e getScaAuthCode() {
        return this.scaAuthCode;
    }

    public int hashCode() {
        return (((((((this.operationId.hashCode() * 31) + this.operationReference.hashCode()) * 31) + this.password.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.scaAuthCode.hashCode();
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
        return new UpdatePasswordQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "UpdatePasswordQuery(operationId=" + this.operationId + ", operationReference=" + this.operationReference + ", password=" + this.password + ", processReference=" + this.processReference + ", scaAuthCode=" + this.scaAuthCode + ')';
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
        private final String updatePassword;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42888x46de1514();
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
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("updatePassword", "updatePassword", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("operationId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationId"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("password", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "password"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("scaAuthCode", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "scaAuthCode")))))), true, (List) null)};
        }

        public LoginServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.updatePassword = str2;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = loginServices.updatePassword;
            }
            return loginServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.updatePassword;
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
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.updatePassword, loginServices.updatePassword);
        }

        public final String getUpdatePassword() {
            return this.updatePassword;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.updatePassword;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new UpdatePasswordQuery$LoginServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", updatePassword=" + this.updatePassword + ')';
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
    public /* synthetic */ UpdatePasswordQuery(C7833e eVar, C7833e eVar2, String str, String str2, C7833e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2, str, str2, (i & 16) != 0 ? C7833e.f22754c.mo22767a() : eVar3);
    }
}
