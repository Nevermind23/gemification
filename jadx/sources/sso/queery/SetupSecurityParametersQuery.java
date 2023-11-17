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
import sso.fragment.SecurityParametersInfo;

public final class SetupSecurityParametersQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "323ef6c86ca7145d38d033d076ae4b6ae08c0f2a1c090e4e2a2ed348942955c0";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new SetupSecurityParametersQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query setupSecurityParametersQuery($biometricAuthRequired: Boolean!, $operationId: String, $operationReference: String, $passcode: String, $processReference: String!, $scaAuthCode: String) {\n  loginServices {\n    __typename\n    setupSecurityParameters(request: {biometricAuthRequired: $biometricAuthRequired, operationId: $operationId, operationReference: $operationReference, passcode: $passcode, processReference: $processReference, scaAuthCode: $scaAuthCode}) {\n      __typename\n      ...securityParametersInfo\n    }\n  }\n}\nfragment securityParametersInfo on SetupSecurityParametersResponse {\n  __typename\n  biometricAuthToken\n  passcodeAuthToken\n}");
    private final boolean biometricAuthRequired;
    private final C7833e operationId;
    private final C7833e operationReference;
    private final C7833e passcode;
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
            return SetupSecurityParametersQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return SetupSecurityParametersQuery.QUERY_DOCUMENT;
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
                return new C42861xb83989ee();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((LoginServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42870x3e16e8c4.INSTANCE));
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
            return new SetupSecurityParametersQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(loginServices=" + this.loginServices + ')';
        }
    }

    public SetupSecurityParametersQuery(boolean z, C7833e eVar, C7833e eVar2, C7833e eVar3, String str, C7833e eVar4) {
        C41536l.m120489i(eVar, "operationId");
        C41536l.m120489i(eVar2, "operationReference");
        C41536l.m120489i(eVar3, "passcode");
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(eVar4, "scaAuthCode");
        this.biometricAuthRequired = z;
        this.operationId = eVar;
        this.operationReference = eVar2;
        this.passcode = eVar3;
        this.processReference = str;
        this.scaAuthCode = eVar4;
        this.variables = new SetupSecurityParametersQuery$variables$1(this);
    }

    public static /* synthetic */ SetupSecurityParametersQuery copy$default(SetupSecurityParametersQuery setupSecurityParametersQuery, boolean z, C7833e eVar, C7833e eVar2, C7833e eVar3, String str, C7833e eVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setupSecurityParametersQuery.biometricAuthRequired;
        }
        if ((i & 2) != 0) {
            eVar = setupSecurityParametersQuery.operationId;
        }
        C7833e eVar5 = eVar;
        if ((i & 4) != 0) {
            eVar2 = setupSecurityParametersQuery.operationReference;
        }
        C7833e eVar6 = eVar2;
        if ((i & 8) != 0) {
            eVar3 = setupSecurityParametersQuery.passcode;
        }
        C7833e eVar7 = eVar3;
        if ((i & 16) != 0) {
            str = setupSecurityParametersQuery.processReference;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            eVar4 = setupSecurityParametersQuery.scaAuthCode;
        }
        return setupSecurityParametersQuery.copy(z, eVar5, eVar6, eVar7, str2, eVar4);
    }

    public final boolean component1() {
        return this.biometricAuthRequired;
    }

    public final C7833e component2() {
        return this.operationId;
    }

    public final C7833e component3() {
        return this.operationReference;
    }

    public final C7833e component4() {
        return this.passcode;
    }

    public final String component5() {
        return this.processReference;
    }

    public final C7833e component6() {
        return this.scaAuthCode;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final SetupSecurityParametersQuery copy(boolean z, C7833e eVar, C7833e eVar2, C7833e eVar3, String str, C7833e eVar4) {
        C41536l.m120489i(eVar, "operationId");
        C41536l.m120489i(eVar2, "operationReference");
        C41536l.m120489i(eVar3, "passcode");
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(eVar4, "scaAuthCode");
        return new SetupSecurityParametersQuery(z, eVar, eVar2, eVar3, str, eVar4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetupSecurityParametersQuery)) {
            return false;
        }
        SetupSecurityParametersQuery setupSecurityParametersQuery = (SetupSecurityParametersQuery) obj;
        return this.biometricAuthRequired == setupSecurityParametersQuery.biometricAuthRequired && C41536l.m120484d(this.operationId, setupSecurityParametersQuery.operationId) && C41536l.m120484d(this.operationReference, setupSecurityParametersQuery.operationReference) && C41536l.m120484d(this.passcode, setupSecurityParametersQuery.passcode) && C41536l.m120484d(this.processReference, setupSecurityParametersQuery.processReference) && C41536l.m120484d(this.scaAuthCode, setupSecurityParametersQuery.scaAuthCode);
    }

    public final boolean getBiometricAuthRequired() {
        return this.biometricAuthRequired;
    }

    public final C7833e getOperationId() {
        return this.operationId;
    }

    public final C7833e getOperationReference() {
        return this.operationReference;
    }

    public final C7833e getPasscode() {
        return this.passcode;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final C7833e getScaAuthCode() {
        return this.scaAuthCode;
    }

    public int hashCode() {
        boolean z = this.biometricAuthRequired;
        if (z) {
            z = true;
        }
        return ((((((((((z ? 1 : 0) * true) + this.operationId.hashCode()) * 31) + this.operationReference.hashCode()) * 31) + this.passcode.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.scaAuthCode.hashCode();
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
        return new C42868x58a47d95();
    }

    public String toString() {
        return "SetupSecurityParametersQuery(biometricAuthRequired=" + this.biometricAuthRequired + ", operationId=" + this.operationId + ", operationReference=" + this.operationReference + ", passcode=" + this.passcode + ", processReference=" + this.processReference + ", scaAuthCode=" + this.scaAuthCode + ')';
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
        private final SetupSecurityParameters setupSecurityParameters;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42862x591330b7();
            }

            public final LoginServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LoginServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LoginServices(h, (SetupSecurityParameters) oVar.mo19023f(LoginServices.RESPONSE_FIELDS[1], C42871xc697300d.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("setupSecurityParameters", "setupSecurityParameters", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("biometricAuthRequired", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "biometricAuthRequired"))), C41233s.m119492a("operationId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationId"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("passcode", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "passcode"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("scaAuthCode", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "scaAuthCode")))))), true, (List) null)};
        }

        public LoginServices(String str, SetupSecurityParameters setupSecurityParameters2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.setupSecurityParameters = setupSecurityParameters2;
        }

        public static /* synthetic */ LoginServices copy$default(LoginServices loginServices, String str, SetupSecurityParameters setupSecurityParameters2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginServices.__typename;
            }
            if ((i & 2) != 0) {
                setupSecurityParameters2 = loginServices.setupSecurityParameters;
            }
            return loginServices.copy(str, setupSecurityParameters2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final SetupSecurityParameters component2() {
            return this.setupSecurityParameters;
        }

        public final LoginServices copy(String str, SetupSecurityParameters setupSecurityParameters2) {
            C41536l.m120489i(str, "__typename");
            return new LoginServices(str, setupSecurityParameters2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginServices)) {
                return false;
            }
            LoginServices loginServices = (LoginServices) obj;
            return C41536l.m120484d(this.__typename, loginServices.__typename) && C41536l.m120484d(this.setupSecurityParameters, loginServices.setupSecurityParameters);
        }

        public final SetupSecurityParameters getSetupSecurityParameters() {
            return this.setupSecurityParameters;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            SetupSecurityParameters setupSecurityParameters2 = this.setupSecurityParameters;
            return hashCode + (setupSecurityParameters2 == null ? 0 : setupSecurityParameters2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42863x635f6d9(this);
        }

        public String toString() {
            return "LoginServices(__typename=" + this.__typename + ", setupSecurityParameters=" + this.setupSecurityParameters + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoginServices(String str, SetupSecurityParameters setupSecurityParameters2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LoginServices" : str, setupSecurityParameters2);
        }
    }

    public static final class SetupSecurityParameters {
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
                return new C42864x96b30d37();
            }

            public final SetupSecurityParameters invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(SetupSecurityParameters.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new SetupSecurityParameters(h, Fragments.Companion.invoke(oVar));
            }
        }

        public static final class Fragments {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */
            public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22813d("__typename", "__typename", (List) null)};
            private final SecurityParametersInfo securityParametersInfo;

            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C8120m Mapper() {
                    C8120m.C8121a aVar = C8120m.f23272a;
                    return new C42865x6af41578();
                }

                public final Fragments invoke(C8124o oVar) {
                    C41536l.m120489i(oVar, "reader");
                    Object d = oVar.mo19021d(Fragments.RESPONSE_FIELDS[0], C42872x6d90f24b.INSTANCE);
                    C41536l.m120486f(d);
                    return new Fragments((SecurityParametersInfo) d);
                }
            }

            public Fragments(SecurityParametersInfo securityParametersInfo2) {
                C41536l.m120489i(securityParametersInfo2, "securityParametersInfo");
                this.securityParametersInfo = securityParametersInfo2;
            }

            public static /* synthetic */ Fragments copy$default(Fragments fragments, SecurityParametersInfo securityParametersInfo2, int i, Object obj) {
                if ((i & 1) != 0) {
                    securityParametersInfo2 = fragments.securityParametersInfo;
                }
                return fragments.copy(securityParametersInfo2);
            }

            public final SecurityParametersInfo component1() {
                return this.securityParametersInfo;
            }

            public final Fragments copy(SecurityParametersInfo securityParametersInfo2) {
                C41536l.m120489i(securityParametersInfo2, "securityParametersInfo");
                return new Fragments(securityParametersInfo2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fragments) && C41536l.m120484d(this.securityParametersInfo, ((Fragments) obj).securityParametersInfo);
            }

            public final SecurityParametersInfo getSecurityParametersInfo() {
                return this.securityParametersInfo;
            }

            public int hashCode() {
                return this.securityParametersInfo.hashCode();
            }

            public final C8122n marshaller() {
                C8122n.C8123a aVar = C8122n.f23274a;
                return new C42866x38cdc05a(this);
            }

            public String toString() {
                return "Fragments(securityParametersInfo=" + this.securityParametersInfo + ')';
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null)};
        }

        public SetupSecurityParameters(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            this.__typename = str;
            this.fragments = fragments2;
        }

        public static /* synthetic */ SetupSecurityParameters copy$default(SetupSecurityParameters setupSecurityParameters, String str, Fragments fragments2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupSecurityParameters.__typename;
            }
            if ((i & 2) != 0) {
                fragments2 = setupSecurityParameters.fragments;
            }
            return setupSecurityParameters.copy(str, fragments2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Fragments component2() {
            return this.fragments;
        }

        public final SetupSecurityParameters copy(String str, Fragments fragments2) {
            C41536l.m120489i(str, "__typename");
            C41536l.m120489i(fragments2, "fragments");
            return new SetupSecurityParameters(str, fragments2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetupSecurityParameters)) {
                return false;
            }
            SetupSecurityParameters setupSecurityParameters = (SetupSecurityParameters) obj;
            return C41536l.m120484d(this.__typename, setupSecurityParameters.__typename) && C41536l.m120484d(this.fragments, setupSecurityParameters.fragments);
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
            return new C42867x7e153359(this);
        }

        public String toString() {
            return "SetupSecurityParameters(__typename=" + this.__typename + ", fragments=" + this.fragments + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SetupSecurityParameters(String str, Fragments fragments2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "SetupSecurityParametersResponse" : str, fragments2);
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
    public /* synthetic */ SetupSecurityParametersQuery(boolean z, C7833e eVar, C7833e eVar2, C7833e eVar3, String str, C7833e eVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar3, str, (i & 32) != 0 ? C7833e.f22754c.mo22767a() : eVar4);
    }
}
