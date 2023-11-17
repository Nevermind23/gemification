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

public final class CheckResetFlowValidParametersQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "2d715e136977e29c01eb470e07e9e44da7af7dc98257534baf1ece4823562d2f";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new CheckResetFlowValidParametersQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query checkResetFlowValidParameters($processReference: String, $flowType: String, $idHashes: [String]) {\n  registrationServices {\n    __typename\n    validatePasswordRecoveryParameters(processReference: $processReference, flowType: $flowType, idHashes: $idHashes)\n  }\n}");
    private final C7833e flowType;
    private final C7833e idHashes;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return CheckResetFlowValidParametersQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return CheckResetFlowValidParametersQuery.QUERY_DOCUMENT;
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
                return new C42610xd3d8b984();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42617xdd96799e.INSTANCE));
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
            return new C42611xc2d15d66(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public CheckResetFlowValidParametersQuery() {
        this((C7833e) null, (C7833e) null, (C7833e) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CheckResetFlowValidParametersQuery copy$default(CheckResetFlowValidParametersQuery checkResetFlowValidParametersQuery, C7833e eVar, C7833e eVar2, C7833e eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = checkResetFlowValidParametersQuery.processReference;
        }
        if ((i & 2) != 0) {
            eVar2 = checkResetFlowValidParametersQuery.flowType;
        }
        if ((i & 4) != 0) {
            eVar3 = checkResetFlowValidParametersQuery.idHashes;
        }
        return checkResetFlowValidParametersQuery.copy(eVar, eVar2, eVar3);
    }

    public final C7833e component1() {
        return this.processReference;
    }

    public final C7833e component2() {
        return this.flowType;
    }

    public final C7833e component3() {
        return this.idHashes;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final CheckResetFlowValidParametersQuery copy(C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "flowType");
        C41536l.m120489i(eVar3, "idHashes");
        return new CheckResetFlowValidParametersQuery(eVar, eVar2, eVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckResetFlowValidParametersQuery)) {
            return false;
        }
        CheckResetFlowValidParametersQuery checkResetFlowValidParametersQuery = (CheckResetFlowValidParametersQuery) obj;
        return C41536l.m120484d(this.processReference, checkResetFlowValidParametersQuery.processReference) && C41536l.m120484d(this.flowType, checkResetFlowValidParametersQuery.flowType) && C41536l.m120484d(this.idHashes, checkResetFlowValidParametersQuery.idHashes);
    }

    public final C7833e getFlowType() {
        return this.flowType;
    }

    public final C7833e getIdHashes() {
        return this.idHashes;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (((this.processReference.hashCode() * 31) + this.flowType.hashCode()) * 31) + this.idHashes.hashCode();
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
        return new C42614x98569aab();
    }

    public String toString() {
        return "CheckResetFlowValidParametersQuery(processReference=" + this.processReference + ", flowType=" + this.flowType + ", idHashes=" + this.idHashes + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public CheckResetFlowValidParametersQuery(C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "flowType");
        C41536l.m120489i(eVar3, "idHashes");
        this.processReference = eVar;
        this.flowType = eVar2;
        this.idHashes = eVar3;
        this.variables = new CheckResetFlowValidParametersQuery$variables$1(this);
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
        private final Integer validatePasswordRecoveryParameters;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42612xf89a9bd7();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, oVar.mo19018a(RegistrationServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22814e("validatePasswordRecoveryParameters", "validatePasswordRecoveryParameters", C41344r0.m119931m(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("flowType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "flowType"))), C41233s.m119492a("idHashes", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "idHashes")))), true, (List) null)};
        }

        public RegistrationServices(String str, Integer num) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.validatePasswordRecoveryParameters = num;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                num = registrationServices.validatePasswordRecoveryParameters;
            }
            return registrationServices.copy(str, num);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Integer component2() {
            return this.validatePasswordRecoveryParameters;
        }

        public final RegistrationServices copy(String str, Integer num) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.validatePasswordRecoveryParameters, registrationServices.validatePasswordRecoveryParameters);
        }

        public final Integer getValidatePasswordRecoveryParameters() {
            return this.validatePasswordRecoveryParameters;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            Integer num = this.validatePasswordRecoveryParameters;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42613xdf439f9(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", validatePasswordRecoveryParameters=" + this.validatePasswordRecoveryParameters + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, num);
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
    public /* synthetic */ CheckResetFlowValidParametersQuery(C7833e eVar, C7833e eVar2, C7833e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar3);
    }
}
