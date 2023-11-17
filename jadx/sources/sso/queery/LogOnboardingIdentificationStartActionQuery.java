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

public final class LogOnboardingIdentificationStartActionQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "64443355ef3f6d6990b0d16c5b2174d05a23b800c461a8dd69d764b187da205a";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new C42812x6579ccf();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query LogOnboardingIdentificationStartActionQuery($processReference: String!, $operationReference: String!) {\n  registrationServices {\n    __typename\n    logOnboardingIdentificationStartAction(processReference: $processReference, operationReference: $operationReference)\n  }\n}");
    private final String operationReference;
    private final String processReference;
    private final transient C7836g.C7839c variables = new LogOnboardingIdentificationStartActionQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return LogOnboardingIdentificationStartActionQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return LogOnboardingIdentificationStartActionQuery.QUERY_DOCUMENT;
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
                return new C42806x19bf3caa();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42813xee533fb8.INSTANCE));
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
            return new C42807xc0ab50c(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public LogOnboardingIdentificationStartActionQuery(String str, String str2) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "operationReference");
        this.processReference = str;
        this.operationReference = str2;
    }

    public static /* synthetic */ LogOnboardingIdentificationStartActionQuery copy$default(LogOnboardingIdentificationStartActionQuery logOnboardingIdentificationStartActionQuery, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logOnboardingIdentificationStartActionQuery.processReference;
        }
        if ((i & 2) != 0) {
            str2 = logOnboardingIdentificationStartActionQuery.operationReference;
        }
        return logOnboardingIdentificationStartActionQuery.copy(str, str2);
    }

    public final String component1() {
        return this.processReference;
    }

    public final String component2() {
        return this.operationReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final LogOnboardingIdentificationStartActionQuery copy(String str, String str2) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "operationReference");
        return new LogOnboardingIdentificationStartActionQuery(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogOnboardingIdentificationStartActionQuery)) {
            return false;
        }
        LogOnboardingIdentificationStartActionQuery logOnboardingIdentificationStartActionQuery = (LogOnboardingIdentificationStartActionQuery) obj;
        return C41536l.m120484d(this.processReference, logOnboardingIdentificationStartActionQuery.processReference) && C41536l.m120484d(this.operationReference, logOnboardingIdentificationStartActionQuery.operationReference);
    }

    public final String getOperationReference() {
        return this.operationReference;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (this.processReference.hashCode() * 31) + this.operationReference.hashCode();
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
        return new C42810x702faf51();
    }

    public String toString() {
        return "LogOnboardingIdentificationStartActionQuery(processReference=" + this.processReference + ", operationReference=" + this.operationReference + ')';
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
        private final String logOnboardingIdentificationStartAction;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42808x985212fd();
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
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("logOnboardingIdentificationStartAction", "logOnboardingIdentificationStartAction", C41344r0.m119931m(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference")))), true, (List) null)};
        }

        public RegistrationServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.logOnboardingIdentificationStartAction = str2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = registrationServices.logOnboardingIdentificationStartAction;
            }
            return registrationServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.logOnboardingIdentificationStartAction;
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
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.logOnboardingIdentificationStartAction, registrationServices.logOnboardingIdentificationStartAction);
        }

        public final String getLogOnboardingIdentificationStartAction() {
            return this.logOnboardingIdentificationStartAction;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.logOnboardingIdentificationStartAction;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42809xcdc5859f(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", logOnboardingIdentificationStartAction=" + this.logOnboardingIdentificationStartAction + ')';
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
