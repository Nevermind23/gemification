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

public final class ValidateOnboardingDocumentDataQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "e3422179481f7ee56e1c337f59bfa3d6bb62365d57510c34cd64bd8acb758461";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new ValidateOnboardingDocumentDataQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query validateOnboardingDocumentDataQuery($xDeviceKey: String!, $xUserAgent: String!, $sessionToken: String!, $processReference: String, $operationReference: String) {\n  registrationServices {\n    __typename\n    validateOnboardingDocumentData(request: {XDeviceKey: $xDeviceKey, XUserAgent: $xUserAgent, sessionToken: $sessionToken, operationReference: $operationReference, processReference: $processReference}) {\n      __typename\n      customerId\n      customerType\n      errorCode\n      errorKey\n      clientHasActualAddress\n    }\n  }\n}");
    private final C7833e operationReference;
    private final C7833e processReference;
    private final String sessionToken;
    private final transient C7836g.C7839c variables;
    private final String xDeviceKey;
    private final String xUserAgent;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return ValidateOnboardingDocumentDataQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return ValidateOnboardingDocumentDataQuery.QUERY_DOCUMENT;
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
                return new C42915xe6173adf();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42923xce3fcbe3.INSTANCE));
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
            return new C42916x80f6bf01(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public ValidateOnboardingDocumentDataQuery(String str, String str2, String str3, C7833e eVar, C7833e eVar2) {
        C41536l.m120489i(str, "xDeviceKey");
        C41536l.m120489i(str2, "xUserAgent");
        C41536l.m120489i(str3, "sessionToken");
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "operationReference");
        this.xDeviceKey = str;
        this.xUserAgent = str2;
        this.sessionToken = str3;
        this.processReference = eVar;
        this.operationReference = eVar2;
        this.variables = new ValidateOnboardingDocumentDataQuery$variables$1(this);
    }

    public static /* synthetic */ ValidateOnboardingDocumentDataQuery copy$default(ValidateOnboardingDocumentDataQuery validateOnboardingDocumentDataQuery, String str, String str2, String str3, C7833e eVar, C7833e eVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOnboardingDocumentDataQuery.xDeviceKey;
        }
        if ((i & 2) != 0) {
            str2 = validateOnboardingDocumentDataQuery.xUserAgent;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = validateOnboardingDocumentDataQuery.sessionToken;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            eVar = validateOnboardingDocumentDataQuery.processReference;
        }
        C7833e eVar3 = eVar;
        if ((i & 16) != 0) {
            eVar2 = validateOnboardingDocumentDataQuery.operationReference;
        }
        return validateOnboardingDocumentDataQuery.copy(str, str4, str5, eVar3, eVar2);
    }

    public final String component1() {
        return this.xDeviceKey;
    }

    public final String component2() {
        return this.xUserAgent;
    }

    public final String component3() {
        return this.sessionToken;
    }

    public final C7833e component4() {
        return this.processReference;
    }

    public final C7833e component5() {
        return this.operationReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final ValidateOnboardingDocumentDataQuery copy(String str, String str2, String str3, C7833e eVar, C7833e eVar2) {
        C41536l.m120489i(str, "xDeviceKey");
        C41536l.m120489i(str2, "xUserAgent");
        C41536l.m120489i(str3, "sessionToken");
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "operationReference");
        return new ValidateOnboardingDocumentDataQuery(str, str2, str3, eVar, eVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateOnboardingDocumentDataQuery)) {
            return false;
        }
        ValidateOnboardingDocumentDataQuery validateOnboardingDocumentDataQuery = (ValidateOnboardingDocumentDataQuery) obj;
        return C41536l.m120484d(this.xDeviceKey, validateOnboardingDocumentDataQuery.xDeviceKey) && C41536l.m120484d(this.xUserAgent, validateOnboardingDocumentDataQuery.xUserAgent) && C41536l.m120484d(this.sessionToken, validateOnboardingDocumentDataQuery.sessionToken) && C41536l.m120484d(this.processReference, validateOnboardingDocumentDataQuery.processReference) && C41536l.m120484d(this.operationReference, validateOnboardingDocumentDataQuery.operationReference);
    }

    public final C7833e getOperationReference() {
        return this.operationReference;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getXDeviceKey() {
        return this.xDeviceKey;
    }

    public final String getXUserAgent() {
        return this.xUserAgent;
    }

    public int hashCode() {
        return (((((((this.xDeviceKey.hashCode() * 31) + this.xUserAgent.hashCode()) * 31) + this.sessionToken.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.operationReference.hashCode();
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
        return new C42921x1b6bb6c6();
    }

    public String toString() {
        return "ValidateOnboardingDocumentDataQuery(xDeviceKey=" + this.xDeviceKey + ", xUserAgent=" + this.xUserAgent + ", sessionToken=" + this.sessionToken + ", processReference=" + this.processReference + ", operationReference=" + this.operationReference + ')';
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
        private final ValidateOnboardingDocumentData validateOnboardingDocumentData;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42917x14190732();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (ValidateOnboardingDocumentData) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42924x25cf9f0f.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("validateOnboardingDocumentData", "validateOnboardingDocumentData", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("XDeviceKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "xDeviceKey"))), C41233s.m119492a("XUserAgent", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "xUserAgent"))), C41233s.m119492a("sessionToken", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "sessionToken"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))))), true, (List) null)};
        }

        public RegistrationServices(String str, ValidateOnboardingDocumentData validateOnboardingDocumentData2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.validateOnboardingDocumentData = validateOnboardingDocumentData2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, ValidateOnboardingDocumentData validateOnboardingDocumentData2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                validateOnboardingDocumentData2 = registrationServices.validateOnboardingDocumentData;
            }
            return registrationServices.copy(str, validateOnboardingDocumentData2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final ValidateOnboardingDocumentData component2() {
            return this.validateOnboardingDocumentData;
        }

        public final RegistrationServices copy(String str, ValidateOnboardingDocumentData validateOnboardingDocumentData2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, validateOnboardingDocumentData2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.validateOnboardingDocumentData, registrationServices.validateOnboardingDocumentData);
        }

        public final ValidateOnboardingDocumentData getValidateOnboardingDocumentData() {
            return this.validateOnboardingDocumentData;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            ValidateOnboardingDocumentData validateOnboardingDocumentData2 = this.validateOnboardingDocumentData;
            return hashCode + (validateOnboardingDocumentData2 == null ? 0 : validateOnboardingDocumentData2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42918x16110594(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", validateOnboardingDocumentData=" + this.validateOnboardingDocumentData + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, ValidateOnboardingDocumentData validateOnboardingDocumentData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, validateOnboardingDocumentData2);
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

    public static final class ValidateOnboardingDocumentData {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String clientHasActualAddress;
        private final String customerId;
        private final String customerType;
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
                return new C42919xc7d823b3();
            }

            public final ValidateOnboardingDocumentData invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(ValidateOnboardingDocumentData.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new ValidateOnboardingDocumentData(h, oVar.mo19025h(ValidateOnboardingDocumentData.RESPONSE_FIELDS[1]), oVar.mo19025h(ValidateOnboardingDocumentData.RESPONSE_FIELDS[2]), oVar.mo19018a(ValidateOnboardingDocumentData.RESPONSE_FIELDS[3]), oVar.mo19025h(ValidateOnboardingDocumentData.RESPONSE_FIELDS[4]), oVar.mo19025h(ValidateOnboardingDocumentData.RESPONSE_FIELDS[5]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("customerId", "customerId", (Map) null, true, (List) null), aVar.mo22817h("customerType", "customerType", (Map) null, true, (List) null), aVar.mo22814e("errorCode", "errorCode", (Map) null, true, (List) null), aVar.mo22817h("errorKey", "errorKey", (Map) null, true, (List) null), aVar.mo22817h("clientHasActualAddress", "clientHasActualAddress", (Map) null, true, (List) null)};
        }

        public ValidateOnboardingDocumentData(String str, String str2, String str3, Integer num, String str4, String str5) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.customerId = str2;
            this.customerType = str3;
            this.errorCode = num;
            this.errorKey = str4;
            this.clientHasActualAddress = str5;
        }

        public static /* synthetic */ ValidateOnboardingDocumentData copy$default(ValidateOnboardingDocumentData validateOnboardingDocumentData, String str, String str2, String str3, Integer num, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validateOnboardingDocumentData.__typename;
            }
            if ((i & 2) != 0) {
                str2 = validateOnboardingDocumentData.customerId;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = validateOnboardingDocumentData.customerType;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                num = validateOnboardingDocumentData.errorCode;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                str4 = validateOnboardingDocumentData.errorKey;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                str5 = validateOnboardingDocumentData.clientHasActualAddress;
            }
            return validateOnboardingDocumentData.copy(str, str6, str7, num2, str8, str5);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.customerId;
        }

        public final String component3() {
            return this.customerType;
        }

        public final Integer component4() {
            return this.errorCode;
        }

        public final String component5() {
            return this.errorKey;
        }

        public final String component6() {
            return this.clientHasActualAddress;
        }

        public final ValidateOnboardingDocumentData copy(String str, String str2, String str3, Integer num, String str4, String str5) {
            C41536l.m120489i(str, "__typename");
            return new ValidateOnboardingDocumentData(str, str2, str3, num, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidateOnboardingDocumentData)) {
                return false;
            }
            ValidateOnboardingDocumentData validateOnboardingDocumentData = (ValidateOnboardingDocumentData) obj;
            return C41536l.m120484d(this.__typename, validateOnboardingDocumentData.__typename) && C41536l.m120484d(this.customerId, validateOnboardingDocumentData.customerId) && C41536l.m120484d(this.customerType, validateOnboardingDocumentData.customerType) && C41536l.m120484d(this.errorCode, validateOnboardingDocumentData.errorCode) && C41536l.m120484d(this.errorKey, validateOnboardingDocumentData.errorKey) && C41536l.m120484d(this.clientHasActualAddress, validateOnboardingDocumentData.clientHasActualAddress);
        }

        public final String getClientHasActualAddress() {
            return this.clientHasActualAddress;
        }

        public final String getCustomerId() {
            return this.customerId;
        }

        public final String getCustomerType() {
            return this.customerType;
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
            String str = this.customerId;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerType;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.errorCode;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.errorKey;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.clientHasActualAddress;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode5 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42920x5c7bd6d5(this);
        }

        public String toString() {
            return "ValidateOnboardingDocumentData(__typename=" + this.__typename + ", customerId=" + this.customerId + ", customerType=" + this.customerType + ", errorCode=" + this.errorCode + ", errorKey=" + this.errorKey + ", clientHasActualAddress=" + this.clientHasActualAddress + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ValidateOnboardingDocumentData(String str, String str2, String str3, Integer num, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ValidateOnboardingDataResponse" : str, str2, str3, num, str4, str5);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ValidateOnboardingDocumentDataQuery(String str, String str2, String str3, C7833e eVar, C7833e eVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 16) != 0 ? C7833e.f22754c.mo22767a() : eVar2);
    }
}
