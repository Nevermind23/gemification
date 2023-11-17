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

public final class RequestFinancialContactApproveQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "754e8da400467c50508c6b3d3b3613d9c514bec252cf1fd7960792e2354b6bda";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new RequestFinancialContactApproveQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query RequestFinancialContactApproveQuery($processReference: String, $contactId: String, $contactType: String!, $contactValue: String, $personalNumber: String, $onboardingOperationReference: String) {\n  registrationServices {\n    __typename\n    requestFinancialContactApproveV1(request: {contactId: $contactId, contactType: $contactType, contactValue: $contactValue, onboardingOperationReference: $onboardingOperationReference, personalNumber: $personalNumber, processReference: $processReference}) {\n      __typename\n      contactId\n      isNewUser\n      needApproveContact\n      operationReference\n      retryCount\n      needToSetMail\n      country\n    }\n  }\n}");
    private final C7833e contactId;
    private final String contactType;
    private final C7833e contactValue;
    private final C7833e onboardingOperationReference;
    private final C7833e personalNumber;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return RequestFinancialContactApproveQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return RequestFinancialContactApproveQuery.QUERY_DOCUMENT;
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
                return new C42834x3a73bfee();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42842x2ce547f4.INSTANCE));
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
            return new C42835xe223fb50(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public RequestFinancialContactApproveQuery(C7833e eVar, C7833e eVar2, String str, C7833e eVar3, C7833e eVar4, C7833e eVar5) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "contactId");
        C41536l.m120489i(str, "contactType");
        C41536l.m120489i(eVar3, "contactValue");
        C41536l.m120489i(eVar4, "personalNumber");
        C41536l.m120489i(eVar5, "onboardingOperationReference");
        this.processReference = eVar;
        this.contactId = eVar2;
        this.contactType = str;
        this.contactValue = eVar3;
        this.personalNumber = eVar4;
        this.onboardingOperationReference = eVar5;
        this.variables = new RequestFinancialContactApproveQuery$variables$1(this);
    }

    public static /* synthetic */ RequestFinancialContactApproveQuery copy$default(RequestFinancialContactApproveQuery requestFinancialContactApproveQuery, C7833e eVar, C7833e eVar2, String str, C7833e eVar3, C7833e eVar4, C7833e eVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = requestFinancialContactApproveQuery.processReference;
        }
        if ((i & 2) != 0) {
            eVar2 = requestFinancialContactApproveQuery.contactId;
        }
        C7833e eVar6 = eVar2;
        if ((i & 4) != 0) {
            str = requestFinancialContactApproveQuery.contactType;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            eVar3 = requestFinancialContactApproveQuery.contactValue;
        }
        C7833e eVar7 = eVar3;
        if ((i & 16) != 0) {
            eVar4 = requestFinancialContactApproveQuery.personalNumber;
        }
        C7833e eVar8 = eVar4;
        if ((i & 32) != 0) {
            eVar5 = requestFinancialContactApproveQuery.onboardingOperationReference;
        }
        return requestFinancialContactApproveQuery.copy(eVar, eVar6, str2, eVar7, eVar8, eVar5);
    }

    public final C7833e component1() {
        return this.processReference;
    }

    public final C7833e component2() {
        return this.contactId;
    }

    public final String component3() {
        return this.contactType;
    }

    public final C7833e component4() {
        return this.contactValue;
    }

    public final C7833e component5() {
        return this.personalNumber;
    }

    public final C7833e component6() {
        return this.onboardingOperationReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final RequestFinancialContactApproveQuery copy(C7833e eVar, C7833e eVar2, String str, C7833e eVar3, C7833e eVar4, C7833e eVar5) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "contactId");
        C41536l.m120489i(str, "contactType");
        C41536l.m120489i(eVar3, "contactValue");
        C41536l.m120489i(eVar4, "personalNumber");
        C41536l.m120489i(eVar5, "onboardingOperationReference");
        return new RequestFinancialContactApproveQuery(eVar, eVar2, str, eVar3, eVar4, eVar5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestFinancialContactApproveQuery)) {
            return false;
        }
        RequestFinancialContactApproveQuery requestFinancialContactApproveQuery = (RequestFinancialContactApproveQuery) obj;
        return C41536l.m120484d(this.processReference, requestFinancialContactApproveQuery.processReference) && C41536l.m120484d(this.contactId, requestFinancialContactApproveQuery.contactId) && C41536l.m120484d(this.contactType, requestFinancialContactApproveQuery.contactType) && C41536l.m120484d(this.contactValue, requestFinancialContactApproveQuery.contactValue) && C41536l.m120484d(this.personalNumber, requestFinancialContactApproveQuery.personalNumber) && C41536l.m120484d(this.onboardingOperationReference, requestFinancialContactApproveQuery.onboardingOperationReference);
    }

    public final C7833e getContactId() {
        return this.contactId;
    }

    public final String getContactType() {
        return this.contactType;
    }

    public final C7833e getContactValue() {
        return this.contactValue;
    }

    public final C7833e getOnboardingOperationReference() {
        return this.onboardingOperationReference;
    }

    public final C7833e getPersonalNumber() {
        return this.personalNumber;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (((((((((this.processReference.hashCode() * 31) + this.contactId.hashCode()) * 31) + this.contactType.hashCode()) * 31) + this.contactValue.hashCode()) * 31) + this.personalNumber.hashCode()) * 31) + this.onboardingOperationReference.hashCode();
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
        return new C42840x6ff43395();
    }

    public String toString() {
        return "RequestFinancialContactApproveQuery(processReference=" + this.processReference + ", contactId=" + this.contactId + ", contactType=" + this.contactType + ", contactValue=" + this.contactValue + ", personalNumber=" + this.personalNumber + ", onboardingOperationReference=" + this.onboardingOperationReference + ')';
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
        private final RequestFinancialContactApproveV1 requestFinancialContactApproveV1;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42836x2abf8e41();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (RequestFinancialContactApproveV1) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42843x76ac10c.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("requestFinancialContactApproveV1", "requestFinancialContactApproveV1", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("contactId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactId"))), C41233s.m119492a("contactType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactType"))), C41233s.m119492a("contactValue", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactValue"))), C41233s.m119492a("onboardingOperationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "onboardingOperationReference"))), C41233s.m119492a("personalNumber", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "personalNumber"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))))), true, (List) null)};
        }

        public RegistrationServices(String str, RequestFinancialContactApproveV1 requestFinancialContactApproveV12) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.requestFinancialContactApproveV1 = requestFinancialContactApproveV12;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, RequestFinancialContactApproveV1 requestFinancialContactApproveV12, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                requestFinancialContactApproveV12 = registrationServices.requestFinancialContactApproveV1;
            }
            return registrationServices.copy(str, requestFinancialContactApproveV12);
        }

        public final String component1() {
            return this.__typename;
        }

        public final RequestFinancialContactApproveV1 component2() {
            return this.requestFinancialContactApproveV1;
        }

        public final RegistrationServices copy(String str, RequestFinancialContactApproveV1 requestFinancialContactApproveV12) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, requestFinancialContactApproveV12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.requestFinancialContactApproveV1, registrationServices.requestFinancialContactApproveV1);
        }

        public final RequestFinancialContactApproveV1 getRequestFinancialContactApproveV1() {
            return this.requestFinancialContactApproveV1;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            RequestFinancialContactApproveV1 requestFinancialContactApproveV12 = this.requestFinancialContactApproveV1;
            return hashCode + (requestFinancialContactApproveV12 == null ? 0 : requestFinancialContactApproveV12.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42837x31b1c3e3(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", requestFinancialContactApproveV1=" + this.requestFinancialContactApproveV1 + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, RequestFinancialContactApproveV1 requestFinancialContactApproveV12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, requestFinancialContactApproveV12);
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

    public static final class RequestFinancialContactApproveV1 {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String contactId;
        private final String country;
        private final Boolean isNewUser;
        private final Boolean needApproveContact;
        private final Boolean needToSetMail;
        private final String operationReference;
        private final Integer retryCount;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42838xbe021d6();
            }

            public final RequestFinancialContactApproveV1 invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RequestFinancialContactApproveV1.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RequestFinancialContactApproveV1(h, oVar.mo19025h(RequestFinancialContactApproveV1.RESPONSE_FIELDS[1]), oVar.mo19027j(RequestFinancialContactApproveV1.RESPONSE_FIELDS[2]), oVar.mo19027j(RequestFinancialContactApproveV1.RESPONSE_FIELDS[3]), oVar.mo19025h(RequestFinancialContactApproveV1.RESPONSE_FIELDS[4]), oVar.mo19018a(RequestFinancialContactApproveV1.RESPONSE_FIELDS[5]), oVar.mo19027j(RequestFinancialContactApproveV1.RESPONSE_FIELDS[6]), oVar.mo19025h(RequestFinancialContactApproveV1.RESPONSE_FIELDS[7]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("contactId", "contactId", (Map) null, true, (List) null), aVar.mo22810a("isNewUser", "isNewUser", (Map) null, true, (List) null), aVar.mo22810a("needApproveContact", "needApproveContact", (Map) null, true, (List) null), aVar.mo22817h("operationReference", "operationReference", (Map) null, true, (List) null), aVar.mo22814e("retryCount", "retryCount", (Map) null, true, (List) null), aVar.mo22810a("needToSetMail", "needToSetMail", (Map) null, true, (List) null), aVar.mo22817h("country", "country", (Map) null, true, (List) null)};
        }

        public RequestFinancialContactApproveV1(String str, String str2, Boolean bool, Boolean bool2, String str3, Integer num, Boolean bool3, String str4) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.contactId = str2;
            this.isNewUser = bool;
            this.needApproveContact = bool2;
            this.operationReference = str3;
            this.retryCount = num;
            this.needToSetMail = bool3;
            this.country = str4;
        }

        public static /* synthetic */ RequestFinancialContactApproveV1 copy$default(RequestFinancialContactApproveV1 requestFinancialContactApproveV1, String str, String str2, Boolean bool, Boolean bool2, String str3, Integer num, Boolean bool3, String str4, int i, Object obj) {
            RequestFinancialContactApproveV1 requestFinancialContactApproveV12 = requestFinancialContactApproveV1;
            int i2 = i;
            return requestFinancialContactApproveV1.copy((i2 & 1) != 0 ? requestFinancialContactApproveV12.__typename : str, (i2 & 2) != 0 ? requestFinancialContactApproveV12.contactId : str2, (i2 & 4) != 0 ? requestFinancialContactApproveV12.isNewUser : bool, (i2 & 8) != 0 ? requestFinancialContactApproveV12.needApproveContact : bool2, (i2 & 16) != 0 ? requestFinancialContactApproveV12.operationReference : str3, (i2 & 32) != 0 ? requestFinancialContactApproveV12.retryCount : num, (i2 & 64) != 0 ? requestFinancialContactApproveV12.needToSetMail : bool3, (i2 & 128) != 0 ? requestFinancialContactApproveV12.country : str4);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.contactId;
        }

        public final Boolean component3() {
            return this.isNewUser;
        }

        public final Boolean component4() {
            return this.needApproveContact;
        }

        public final String component5() {
            return this.operationReference;
        }

        public final Integer component6() {
            return this.retryCount;
        }

        public final Boolean component7() {
            return this.needToSetMail;
        }

        public final String component8() {
            return this.country;
        }

        public final RequestFinancialContactApproveV1 copy(String str, String str2, Boolean bool, Boolean bool2, String str3, Integer num, Boolean bool3, String str4) {
            C41536l.m120489i(str, "__typename");
            return new RequestFinancialContactApproveV1(str, str2, bool, bool2, str3, num, bool3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestFinancialContactApproveV1)) {
                return false;
            }
            RequestFinancialContactApproveV1 requestFinancialContactApproveV1 = (RequestFinancialContactApproveV1) obj;
            return C41536l.m120484d(this.__typename, requestFinancialContactApproveV1.__typename) && C41536l.m120484d(this.contactId, requestFinancialContactApproveV1.contactId) && C41536l.m120484d(this.isNewUser, requestFinancialContactApproveV1.isNewUser) && C41536l.m120484d(this.needApproveContact, requestFinancialContactApproveV1.needApproveContact) && C41536l.m120484d(this.operationReference, requestFinancialContactApproveV1.operationReference) && C41536l.m120484d(this.retryCount, requestFinancialContactApproveV1.retryCount) && C41536l.m120484d(this.needToSetMail, requestFinancialContactApproveV1.needToSetMail) && C41536l.m120484d(this.country, requestFinancialContactApproveV1.country);
        }

        public final String getContactId() {
            return this.contactId;
        }

        public final String getCountry() {
            return this.country;
        }

        public final Boolean getNeedApproveContact() {
            return this.needApproveContact;
        }

        public final Boolean getNeedToSetMail() {
            return this.needToSetMail;
        }

        public final String getOperationReference() {
            return this.operationReference;
        }

        public final Integer getRetryCount() {
            return this.retryCount;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.contactId;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isNewUser;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.needApproveContact;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.operationReference;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.retryCount;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool3 = this.needToSetMail;
            int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.country;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode7 + i;
        }

        public final Boolean isNewUser() {
            return this.isNewUser;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42839xcd59eb38(this);
        }

        public String toString() {
            return "RequestFinancialContactApproveV1(__typename=" + this.__typename + ", contactId=" + this.contactId + ", isNewUser=" + this.isNewUser + ", needApproveContact=" + this.needApproveContact + ", operationReference=" + this.operationReference + ", retryCount=" + this.retryCount + ", needToSetMail=" + this.needToSetMail + ", country=" + this.country + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RequestFinancialContactApproveV1(String str, String str2, Boolean bool, Boolean bool2, String str3, Integer num, Boolean bool3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "FinancialContactApproveData" : str, str2, bool, bool2, str3, num, bool3, str4);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestFinancialContactApproveQuery(C7833e eVar, C7833e eVar2, String str, C7833e eVar3, C7833e eVar4, C7833e eVar5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2, str, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar3, (i & 16) != 0 ? C7833e.f22754c.mo22767a() : eVar4, (i & 32) != 0 ? C7833e.f22754c.mo22767a() : eVar5);
    }
}
