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

public final class LogOnboardingIdentificationErrorQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "326c496d79f7602ed8c29ffff674f3a4ae47231b7cd61c3f236419420a6f76da";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new LogOnboardingIdentificationErrorQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query LogOnboardingIdentificationErrorQuery($errorKey: String!, $errorMessage: String!, $operationReference: String!, $processReference: String!) {\n  registrationServices {\n    __typename\n    logOnboardingIdentificationError(errorKey: $errorKey, operationReference: $operationReference, errorMessage: $errorMessage, processReference: $processReference) {\n      __typename\n      errorCode\n      errorKey\n    }\n  }\n}");
    private final String errorKey;
    private final String errorMessage;
    private final String operationReference;
    private final String processReference;
    private final transient C7836g.C7839c variables = new LogOnboardingIdentificationErrorQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return LogOnboardingIdentificationErrorQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return LogOnboardingIdentificationErrorQuery.QUERY_DOCUMENT;
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
                return new C42796xa2ec779a();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42804x8fcad6c8.INSTANCE));
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
            return new C42797x62bae3fc(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public LogOnboardingIdentificationErrorQuery(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "errorKey");
        C41536l.m120489i(str2, "errorMessage");
        C41536l.m120489i(str3, "operationReference");
        C41536l.m120489i(str4, "processReference");
        this.errorKey = str;
        this.errorMessage = str2;
        this.operationReference = str3;
        this.processReference = str4;
    }

    public static /* synthetic */ LogOnboardingIdentificationErrorQuery copy$default(LogOnboardingIdentificationErrorQuery logOnboardingIdentificationErrorQuery, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logOnboardingIdentificationErrorQuery.errorKey;
        }
        if ((i & 2) != 0) {
            str2 = logOnboardingIdentificationErrorQuery.errorMessage;
        }
        if ((i & 4) != 0) {
            str3 = logOnboardingIdentificationErrorQuery.operationReference;
        }
        if ((i & 8) != 0) {
            str4 = logOnboardingIdentificationErrorQuery.processReference;
        }
        return logOnboardingIdentificationErrorQuery.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.errorKey;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final String component3() {
        return this.operationReference;
    }

    public final String component4() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final LogOnboardingIdentificationErrorQuery copy(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "errorKey");
        C41536l.m120489i(str2, "errorMessage");
        C41536l.m120489i(str3, "operationReference");
        C41536l.m120489i(str4, "processReference");
        return new LogOnboardingIdentificationErrorQuery(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogOnboardingIdentificationErrorQuery)) {
            return false;
        }
        LogOnboardingIdentificationErrorQuery logOnboardingIdentificationErrorQuery = (LogOnboardingIdentificationErrorQuery) obj;
        return C41536l.m120484d(this.errorKey, logOnboardingIdentificationErrorQuery.errorKey) && C41536l.m120484d(this.errorMessage, logOnboardingIdentificationErrorQuery.errorMessage) && C41536l.m120484d(this.operationReference, logOnboardingIdentificationErrorQuery.operationReference) && C41536l.m120484d(this.processReference, logOnboardingIdentificationErrorQuery.processReference);
    }

    public final String getErrorKey() {
        return this.errorKey;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getOperationReference() {
        return this.operationReference;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (((((this.errorKey.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + this.operationReference.hashCode()) * 31) + this.processReference.hashCode();
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
        return new C42802x844ee641();
    }

    public String toString() {
        return "LogOnboardingIdentificationErrorQuery(errorKey=" + this.errorKey + ", errorMessage=" + this.errorMessage + ", operationReference=" + this.operationReference + ", processReference=" + this.processReference + ')';
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
        private final LogOnboardingIdentificationError logOnboardingIdentificationError;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42800x430b6ded();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (LogOnboardingIdentificationError) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42805x41dbfb99.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("logOnboardingIdentificationError", "logOnboardingIdentificationError", C41344r0.m119931m(C41233s.m119492a("errorKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "errorKey"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("errorMessage", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "errorMessage"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public RegistrationServices(String str, LogOnboardingIdentificationError logOnboardingIdentificationError2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.logOnboardingIdentificationError = logOnboardingIdentificationError2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, LogOnboardingIdentificationError logOnboardingIdentificationError2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                logOnboardingIdentificationError2 = registrationServices.logOnboardingIdentificationError;
            }
            return registrationServices.copy(str, logOnboardingIdentificationError2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final LogOnboardingIdentificationError component2() {
            return this.logOnboardingIdentificationError;
        }

        public final RegistrationServices copy(String str, LogOnboardingIdentificationError logOnboardingIdentificationError2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, logOnboardingIdentificationError2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.logOnboardingIdentificationError, registrationServices.logOnboardingIdentificationError);
        }

        public final LogOnboardingIdentificationError getLogOnboardingIdentificationError() {
            return this.logOnboardingIdentificationError;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            LogOnboardingIdentificationError logOnboardingIdentificationError2 = this.logOnboardingIdentificationError;
            return hashCode + (logOnboardingIdentificationError2 == null ? 0 : logOnboardingIdentificationError2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42801xe999d48f(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", logOnboardingIdentificationError=" + this.logOnboardingIdentificationError + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, LogOnboardingIdentificationError logOnboardingIdentificationError2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, logOnboardingIdentificationError2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class LogOnboardingIdentificationError {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final Integer errorCode;
        private final String errorKey;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42798xc62148e9();
            }

            public final LogOnboardingIdentificationError invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(LogOnboardingIdentificationError.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new LogOnboardingIdentificationError(h, oVar.mo19018a(LogOnboardingIdentificationError.RESPONSE_FIELDS[1]), oVar.mo19025h(LogOnboardingIdentificationError.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22814e("errorCode", "errorCode", (Map) null, true, (List) null), aVar.mo22817h("errorKey", "errorKey", (Map) null, true, (List) null)};
        }

        public LogOnboardingIdentificationError(String str, Integer num, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.errorCode = num;
            this.errorKey = str2;
        }

        public static /* synthetic */ LogOnboardingIdentificationError copy$default(LogOnboardingIdentificationError logOnboardingIdentificationError, String str, Integer num, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logOnboardingIdentificationError.__typename;
            }
            if ((i & 2) != 0) {
                num = logOnboardingIdentificationError.errorCode;
            }
            if ((i & 4) != 0) {
                str2 = logOnboardingIdentificationError.errorKey;
            }
            return logOnboardingIdentificationError.copy(str, num, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Integer component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.errorKey;
        }

        public final LogOnboardingIdentificationError copy(String str, Integer num, String str2) {
            C41536l.m120489i(str, "__typename");
            return new LogOnboardingIdentificationError(str, num, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogOnboardingIdentificationError)) {
                return false;
            }
            LogOnboardingIdentificationError logOnboardingIdentificationError = (LogOnboardingIdentificationError) obj;
            return C41536l.m120484d(this.__typename, logOnboardingIdentificationError.__typename) && C41536l.m120484d(this.errorCode, logOnboardingIdentificationError.errorCode) && C41536l.m120484d(this.errorKey, logOnboardingIdentificationError.errorKey);
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorKey() {
            return this.errorKey;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            Integer num = this.errorCode;
            int i = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.errorKey;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42799x7cfe9c8b(this);
        }

        public String toString() {
            return "LogOnboardingIdentificationError(__typename=" + this.__typename + ", errorCode=" + this.errorCode + ", errorKey=" + this.errorKey + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LogOnboardingIdentificationError(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LogOnboardingIdentificationErrorResponse" : str, num, str2);
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
}
