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

public final class ChangeUserNameAndPasswordQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "0e00364fdc6414720fb0fc2f42c59412d71a935ec8aa3261b0bebb7c1686a2ab";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new ChangeUserNameAndPasswordQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query changeUserNameAndPasswordQuery($userName: String!, $password: String!, $processReference: String!, $tmxSessionId : String!) {\n  registrationServices {\n    __typename\n    changeUsernameAndPassword(request: {password: $password, processReference: $processReference, username: $userName, tmxSessionId: $tmxSessionId})\n  }\n}");
    private final String password;
    private final String processReference;
    private final String tmxSessionId;
    private final String userName;
    private final transient C7836g.C7839c variables = new ChangeUserNameAndPasswordQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return ChangeUserNameAndPasswordQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return ChangeUserNameAndPasswordQuery.QUERY_DOCUMENT;
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
                return new C42596xff1607c9();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42601x9f1683b9.INSTANCE));
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
            return new ChangeUserNameAndPasswordQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public ChangeUserNameAndPasswordQuery(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "userName");
        C41536l.m120489i(str2, "password");
        C41536l.m120489i(str3, "processReference");
        C41536l.m120489i(str4, "tmxSessionId");
        this.userName = str;
        this.password = str2;
        this.processReference = str3;
        this.tmxSessionId = str4;
    }

    public static /* synthetic */ ChangeUserNameAndPasswordQuery copy$default(ChangeUserNameAndPasswordQuery changeUserNameAndPasswordQuery, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeUserNameAndPasswordQuery.userName;
        }
        if ((i & 2) != 0) {
            str2 = changeUserNameAndPasswordQuery.password;
        }
        if ((i & 4) != 0) {
            str3 = changeUserNameAndPasswordQuery.processReference;
        }
        if ((i & 8) != 0) {
            str4 = changeUserNameAndPasswordQuery.tmxSessionId;
        }
        return changeUserNameAndPasswordQuery.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.processReference;
    }

    public final String component4() {
        return this.tmxSessionId;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final ChangeUserNameAndPasswordQuery copy(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "userName");
        C41536l.m120489i(str2, "password");
        C41536l.m120489i(str3, "processReference");
        C41536l.m120489i(str4, "tmxSessionId");
        return new ChangeUserNameAndPasswordQuery(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeUserNameAndPasswordQuery)) {
            return false;
        }
        ChangeUserNameAndPasswordQuery changeUserNameAndPasswordQuery = (ChangeUserNameAndPasswordQuery) obj;
        return C41536l.m120484d(this.userName, changeUserNameAndPasswordQuery.userName) && C41536l.m120484d(this.password, changeUserNameAndPasswordQuery.password) && C41536l.m120484d(this.processReference, changeUserNameAndPasswordQuery.processReference) && C41536l.m120484d(this.tmxSessionId, changeUserNameAndPasswordQuery.tmxSessionId);
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((this.userName.hashCode() * 31) + this.password.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.tmxSessionId.hashCode();
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
        return new C42599x80acb630();
    }

    public String toString() {
        return "ChangeUserNameAndPasswordQuery(userName=" + this.userName + ", password=" + this.password + ", processReference=" + this.processReference + ", tmxSessionId=" + this.tmxSessionId + ')';
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
        private final String changeUsernameAndPassword;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42597x8944c01c();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("changeUsernameAndPassword", "changeUsernameAndPassword", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("password", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "password"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("username", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "userName"))), C41233s.m119492a("tmxSessionId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "tmxSessionId")))))), true, (List) null)};
        }

        public RegistrationServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.changeUsernameAndPassword = str2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = registrationServices.changeUsernameAndPassword;
            }
            return registrationServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.changeUsernameAndPassword;
        }

        public final RegistrationServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.changeUsernameAndPassword, registrationServices.changeUsernameAndPassword);
        }

        public final String getChangeUsernameAndPassword() {
            return this.changeUsernameAndPassword;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.changeUsernameAndPassword;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42598xe10c35fe(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", changeUsernameAndPassword=" + this.changeUsernameAndPassword + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, str2);
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
