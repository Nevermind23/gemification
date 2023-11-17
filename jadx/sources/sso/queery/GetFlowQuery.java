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
import sso.type.RecoveryProcessFlow;

public final class GetFlowQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "9d921350684238caa267e46420fa69318d5c99984619505896ed300b0ac11531";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetFlowQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetFlow($processReference: String) {\n  registrationServices {\n    __typename\n    getPasswordRecoveryFlow(processReference: $processReference) {\n      __typename\n      processFlow\n      processReference\n    }\n  }\n}");
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetFlowQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetFlowQuery.QUERY_DOCUMENT;
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
                return new GetFlowQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetFlowQuery$Data$Companion$invoke$1$registrationServices$1.INSTANCE));
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
            return new GetFlowQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetFlowQuery() {
        this((C7833e) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GetFlowQuery copy$default(GetFlowQuery getFlowQuery, C7833e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = getFlowQuery.processReference;
        }
        return getFlowQuery.copy(eVar);
    }

    public final C7833e component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetFlowQuery copy(C7833e eVar) {
        C41536l.m120489i(eVar, "processReference");
        return new GetFlowQuery(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetFlowQuery) && C41536l.m120484d(this.processReference, ((GetFlowQuery) obj).processReference);
    }

    public final C7833e getProcessReference() {
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
        return new GetFlowQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetFlowQuery(processReference=" + this.processReference + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetFlowQuery(C7833e eVar) {
        C41536l.m120489i(eVar, "processReference");
        this.processReference = eVar;
        this.variables = new GetFlowQuery$variables$1(this);
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
        private final GetPasswordRecoveryFlow getPasswordRecoveryFlow;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42661x53fef664();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetPasswordRecoveryFlow) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42662x8f7940a7.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getPasswordRecoveryFlow", "getPasswordRecoveryFlow", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public RegistrationServices(String str, GetPasswordRecoveryFlow getPasswordRecoveryFlow2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getPasswordRecoveryFlow = getPasswordRecoveryFlow2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetPasswordRecoveryFlow getPasswordRecoveryFlow2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getPasswordRecoveryFlow2 = registrationServices.getPasswordRecoveryFlow;
            }
            return registrationServices.copy(str, getPasswordRecoveryFlow2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetPasswordRecoveryFlow component2() {
            return this.getPasswordRecoveryFlow;
        }

        public final RegistrationServices copy(String str, GetPasswordRecoveryFlow getPasswordRecoveryFlow2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getPasswordRecoveryFlow2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getPasswordRecoveryFlow, registrationServices.getPasswordRecoveryFlow);
        }

        public final GetPasswordRecoveryFlow getGetPasswordRecoveryFlow() {
            return this.getPasswordRecoveryFlow;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetPasswordRecoveryFlow getPasswordRecoveryFlow2 = this.getPasswordRecoveryFlow;
            return hashCode + (getPasswordRecoveryFlow2 == null ? 0 : getPasswordRecoveryFlow2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetFlowQuery$RegistrationServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getPasswordRecoveryFlow=" + this.getPasswordRecoveryFlow + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetPasswordRecoveryFlow getPasswordRecoveryFlow2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getPasswordRecoveryFlow2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class GetPasswordRecoveryFlow {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final RecoveryProcessFlow processFlow;
        private final String processReference;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42659x88d632a7();
            }

            public final GetPasswordRecoveryFlow invoke(C8124o oVar) {
                RecoveryProcessFlow recoveryProcessFlow;
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetPasswordRecoveryFlow.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                String h2 = oVar.mo19025h(GetPasswordRecoveryFlow.RESPONSE_FIELDS[1]);
                if (h2 != null) {
                    recoveryProcessFlow = RecoveryProcessFlow.Companion.safeValueOf(h2);
                } else {
                    recoveryProcessFlow = null;
                }
                return new GetPasswordRecoveryFlow(h, recoveryProcessFlow, oVar.mo19025h(GetPasswordRecoveryFlow.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22812c("processFlow", "processFlow", (Map) null, true, (List) null), aVar.mo22817h("processReference", "processReference", (Map) null, true, (List) null)};
        }

        public GetPasswordRecoveryFlow(String str, RecoveryProcessFlow recoveryProcessFlow, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.processFlow = recoveryProcessFlow;
            this.processReference = str2;
        }

        public static /* synthetic */ GetPasswordRecoveryFlow copy$default(GetPasswordRecoveryFlow getPasswordRecoveryFlow, String str, RecoveryProcessFlow recoveryProcessFlow, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getPasswordRecoveryFlow.__typename;
            }
            if ((i & 2) != 0) {
                recoveryProcessFlow = getPasswordRecoveryFlow.processFlow;
            }
            if ((i & 4) != 0) {
                str2 = getPasswordRecoveryFlow.processReference;
            }
            return getPasswordRecoveryFlow.copy(str, recoveryProcessFlow, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final RecoveryProcessFlow component2() {
            return this.processFlow;
        }

        public final String component3() {
            return this.processReference;
        }

        public final GetPasswordRecoveryFlow copy(String str, RecoveryProcessFlow recoveryProcessFlow, String str2) {
            C41536l.m120489i(str, "__typename");
            return new GetPasswordRecoveryFlow(str, recoveryProcessFlow, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetPasswordRecoveryFlow)) {
                return false;
            }
            GetPasswordRecoveryFlow getPasswordRecoveryFlow = (GetPasswordRecoveryFlow) obj;
            return C41536l.m120484d(this.__typename, getPasswordRecoveryFlow.__typename) && this.processFlow == getPasswordRecoveryFlow.processFlow && C41536l.m120484d(this.processReference, getPasswordRecoveryFlow.processReference);
        }

        public final RecoveryProcessFlow getProcessFlow() {
            return this.processFlow;
        }

        public final String getProcessReference() {
            return this.processReference;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            RecoveryProcessFlow recoveryProcessFlow = this.processFlow;
            int i = 0;
            int hashCode2 = (hashCode + (recoveryProcessFlow == null ? 0 : recoveryProcessFlow.hashCode())) * 31;
            String str = this.processReference;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42660xfd1d2cc9(this);
        }

        public String toString() {
            return "GetPasswordRecoveryFlow(__typename=" + this.__typename + ", processFlow=" + this.processFlow + ", processReference=" + this.processReference + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetPasswordRecoveryFlow(String str, RecoveryProcessFlow recoveryProcessFlow, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "RecoveryProcessFlowResponse" : str, recoveryProcessFlow, str2);
        }
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
    public /* synthetic */ GetFlowQuery(C7833e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar);
    }
}
