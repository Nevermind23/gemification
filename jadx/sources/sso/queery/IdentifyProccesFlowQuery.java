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
import sso.type.ProcessFlow;

public final class IdentifyProccesFlowQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "a3407f65c8292f2d30f65a9430cf36102528c76e68448ee1497fdb49eeac106c";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new IdentifyProccesFlowQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query IdentifyProccesFlow($pin: String!, $processReference: String) {\n  registrationServices {\n    __typename\n    identifyProcessFlow(pin: $pin, processReference: $processReference) {\n      __typename\n      processFlow\n      processReference\n    }\n  }\n}");
    private final String pin;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return IdentifyProccesFlowQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return IdentifyProccesFlowQuery.QUERY_DOCUMENT;
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
                return new IdentifyProccesFlowQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42794x5149b6aa.INSTANCE));
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
            return new IdentifyProccesFlowQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public IdentifyProccesFlowQuery(String str, C7833e eVar) {
        C41536l.m120489i(str, "pin");
        C41536l.m120489i(eVar, "processReference");
        this.pin = str;
        this.processReference = eVar;
        this.variables = new IdentifyProccesFlowQuery$variables$1(this);
    }

    public static /* synthetic */ IdentifyProccesFlowQuery copy$default(IdentifyProccesFlowQuery identifyProccesFlowQuery, String str, C7833e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identifyProccesFlowQuery.pin;
        }
        if ((i & 2) != 0) {
            eVar = identifyProccesFlowQuery.processReference;
        }
        return identifyProccesFlowQuery.copy(str, eVar);
    }

    public final String component1() {
        return this.pin;
    }

    public final C7833e component2() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final IdentifyProccesFlowQuery copy(String str, C7833e eVar) {
        C41536l.m120489i(str, "pin");
        C41536l.m120489i(eVar, "processReference");
        return new IdentifyProccesFlowQuery(str, eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifyProccesFlowQuery)) {
            return false;
        }
        IdentifyProccesFlowQuery identifyProccesFlowQuery = (IdentifyProccesFlowQuery) obj;
        return C41536l.m120484d(this.pin, identifyProccesFlowQuery.pin) && C41536l.m120484d(this.processReference, identifyProccesFlowQuery.processReference);
    }

    public final String getPin() {
        return this.pin;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (this.pin.hashCode() * 31) + this.processReference.hashCode();
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
        return new IdentifyProccesFlowQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "IdentifyProccesFlowQuery(pin=" + this.pin + ", processReference=" + this.processReference + ')';
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
        private final IdentifyProcessFlow identifyProcessFlow;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42791xf1ad4c4b();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (IdentifyProcessFlow) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42795xb626958b.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("identifyProcessFlow", "identifyProcessFlow", C41344r0.m119931m(C41233s.m119492a("pin", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "pin"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public RegistrationServices(String str, IdentifyProcessFlow identifyProcessFlow2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.identifyProcessFlow = identifyProcessFlow2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, IdentifyProcessFlow identifyProcessFlow2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                identifyProcessFlow2 = registrationServices.identifyProcessFlow;
            }
            return registrationServices.copy(str, identifyProcessFlow2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final IdentifyProcessFlow component2() {
            return this.identifyProcessFlow;
        }

        public final RegistrationServices copy(String str, IdentifyProcessFlow identifyProcessFlow2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, identifyProcessFlow2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.identifyProcessFlow, registrationServices.identifyProcessFlow);
        }

        public final IdentifyProcessFlow getIdentifyProcessFlow() {
            return this.identifyProcessFlow;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            IdentifyProcessFlow identifyProcessFlow2 = this.identifyProcessFlow;
            return hashCode + (identifyProcessFlow2 == null ? 0 : identifyProcessFlow2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42792x3521516d(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", identifyProcessFlow=" + this.identifyProcessFlow + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, IdentifyProcessFlow identifyProcessFlow2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, identifyProcessFlow2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class IdentifyProcessFlow {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final ProcessFlow processFlow;
        private final String processReference;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42789xf4ce9a43();
            }

            public final IdentifyProcessFlow invoke(C8124o oVar) {
                ProcessFlow processFlow;
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(IdentifyProcessFlow.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                String h2 = oVar.mo19025h(IdentifyProcessFlow.RESPONSE_FIELDS[1]);
                if (h2 != null) {
                    processFlow = ProcessFlow.Companion.safeValueOf(h2);
                } else {
                    processFlow = null;
                }
                return new IdentifyProcessFlow(h, processFlow, oVar.mo19025h(IdentifyProcessFlow.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22812c("processFlow", "processFlow", (Map) null, true, (List) null), aVar.mo22817h("processReference", "processReference", (Map) null, true, (List) null)};
        }

        public IdentifyProcessFlow(String str, ProcessFlow processFlow2, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.processFlow = processFlow2;
            this.processReference = str2;
        }

        public static /* synthetic */ IdentifyProcessFlow copy$default(IdentifyProcessFlow identifyProcessFlow, String str, ProcessFlow processFlow2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = identifyProcessFlow.__typename;
            }
            if ((i & 2) != 0) {
                processFlow2 = identifyProcessFlow.processFlow;
            }
            if ((i & 4) != 0) {
                str2 = identifyProcessFlow.processReference;
            }
            return identifyProcessFlow.copy(str, processFlow2, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final ProcessFlow component2() {
            return this.processFlow;
        }

        public final String component3() {
            return this.processReference;
        }

        public final IdentifyProcessFlow copy(String str, ProcessFlow processFlow2, String str2) {
            C41536l.m120489i(str, "__typename");
            return new IdentifyProcessFlow(str, processFlow2, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentifyProcessFlow)) {
                return false;
            }
            IdentifyProcessFlow identifyProcessFlow = (IdentifyProcessFlow) obj;
            return C41536l.m120484d(this.__typename, identifyProcessFlow.__typename) && this.processFlow == identifyProcessFlow.processFlow && C41536l.m120484d(this.processReference, identifyProcessFlow.processReference);
        }

        public final ProcessFlow getProcessFlow() {
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
            ProcessFlow processFlow2 = this.processFlow;
            int i = 0;
            int hashCode2 = (hashCode + (processFlow2 == null ? 0 : processFlow2.hashCode())) * 31;
            String str = this.processReference;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42790x46f27965(this);
        }

        public String toString() {
            return "IdentifyProcessFlow(__typename=" + this.__typename + ", processFlow=" + this.processFlow + ", processReference=" + this.processReference + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IdentifyProcessFlow(String str, ProcessFlow processFlow2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "IdentifyProcessFlowResponse" : str, processFlow2, str2);
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
    public /* synthetic */ IdentifyProccesFlowQuery(String str, C7833e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar);
    }
}
