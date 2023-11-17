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

public final class ApproveFinancialContactQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "536ef743a9331eb4b2bd8309378803412a80ee09596594c7b75245739cdd108d";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new ApproveFinancialContactQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query ApproveFinancialContactQuery($contactId: String, $contactType: String!, $contactValue: String, $oneTimePassword: String!, $operationReference: String, $processReference: String, $onboardingOperationReference: String) {\n  registrationServices {\n    __typename\n    approveFinancialContactV1(request: {contactId: $contactId, contactType: $contactType, contactValue: $contactValue, onboardingOperationReference: $onboardingOperationReference, oneTimePassword: $oneTimePassword, operationReference: $operationReference, processReference: $processReference}) {\n      __typename\n      needToSetMail\n    }\n  }\n}");
    private final C7833e contactId;
    private final String contactType;
    private final C7833e contactValue;
    private final C7833e onboardingOperationReference;
    private final String oneTimePassword;
    private final C7833e operationReference;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return ApproveFinancialContactQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return ApproveFinancialContactQuery.QUERY_DOCUMENT;
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
                return new C42584xa8d79af1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42589x32289391.INSTANCE));
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
            return new ApproveFinancialContactQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public ApproveFinancialContactQuery(C7833e eVar, String str, C7833e eVar2, String str2, C7833e eVar3, C7833e eVar4, C7833e eVar5) {
        C41536l.m120489i(eVar, "contactId");
        C41536l.m120489i(str, "contactType");
        C41536l.m120489i(eVar2, "contactValue");
        C41536l.m120489i(str2, "oneTimePassword");
        C41536l.m120489i(eVar3, "operationReference");
        C41536l.m120489i(eVar4, "processReference");
        C41536l.m120489i(eVar5, "onboardingOperationReference");
        this.contactId = eVar;
        this.contactType = str;
        this.contactValue = eVar2;
        this.oneTimePassword = str2;
        this.operationReference = eVar3;
        this.processReference = eVar4;
        this.onboardingOperationReference = eVar5;
        this.variables = new ApproveFinancialContactQuery$variables$1(this);
    }

    public static /* synthetic */ ApproveFinancialContactQuery copy$default(ApproveFinancialContactQuery approveFinancialContactQuery, C7833e eVar, String str, C7833e eVar2, String str2, C7833e eVar3, C7833e eVar4, C7833e eVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = approveFinancialContactQuery.contactId;
        }
        if ((i & 2) != 0) {
            str = approveFinancialContactQuery.contactType;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            eVar2 = approveFinancialContactQuery.contactValue;
        }
        C7833e eVar6 = eVar2;
        if ((i & 8) != 0) {
            str2 = approveFinancialContactQuery.oneTimePassword;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            eVar3 = approveFinancialContactQuery.operationReference;
        }
        C7833e eVar7 = eVar3;
        if ((i & 32) != 0) {
            eVar4 = approveFinancialContactQuery.processReference;
        }
        C7833e eVar8 = eVar4;
        if ((i & 64) != 0) {
            eVar5 = approveFinancialContactQuery.onboardingOperationReference;
        }
        return approveFinancialContactQuery.copy(eVar, str3, eVar6, str4, eVar7, eVar8, eVar5);
    }

    public final C7833e component1() {
        return this.contactId;
    }

    public final String component2() {
        return this.contactType;
    }

    public final C7833e component3() {
        return this.contactValue;
    }

    public final String component4() {
        return this.oneTimePassword;
    }

    public final C7833e component5() {
        return this.operationReference;
    }

    public final C7833e component6() {
        return this.processReference;
    }

    public final C7833e component7() {
        return this.onboardingOperationReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final ApproveFinancialContactQuery copy(C7833e eVar, String str, C7833e eVar2, String str2, C7833e eVar3, C7833e eVar4, C7833e eVar5) {
        C41536l.m120489i(eVar, "contactId");
        C41536l.m120489i(str, "contactType");
        C41536l.m120489i(eVar2, "contactValue");
        C41536l.m120489i(str2, "oneTimePassword");
        C41536l.m120489i(eVar3, "operationReference");
        C41536l.m120489i(eVar4, "processReference");
        C7833e eVar6 = eVar5;
        C41536l.m120489i(eVar6, "onboardingOperationReference");
        return new ApproveFinancialContactQuery(eVar, str, eVar2, str2, eVar3, eVar4, eVar6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproveFinancialContactQuery)) {
            return false;
        }
        ApproveFinancialContactQuery approveFinancialContactQuery = (ApproveFinancialContactQuery) obj;
        return C41536l.m120484d(this.contactId, approveFinancialContactQuery.contactId) && C41536l.m120484d(this.contactType, approveFinancialContactQuery.contactType) && C41536l.m120484d(this.contactValue, approveFinancialContactQuery.contactValue) && C41536l.m120484d(this.oneTimePassword, approveFinancialContactQuery.oneTimePassword) && C41536l.m120484d(this.operationReference, approveFinancialContactQuery.operationReference) && C41536l.m120484d(this.processReference, approveFinancialContactQuery.processReference) && C41536l.m120484d(this.onboardingOperationReference, approveFinancialContactQuery.onboardingOperationReference);
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

    public final String getOneTimePassword() {
        return this.oneTimePassword;
    }

    public final C7833e getOperationReference() {
        return this.operationReference;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (((((((((((this.contactId.hashCode() * 31) + this.contactType.hashCode()) * 31) + this.contactValue.hashCode()) * 31) + this.oneTimePassword.hashCode()) * 31) + this.operationReference.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.onboardingOperationReference.hashCode();
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
        return new C42587xb088f358();
    }

    public String toString() {
        return "ApproveFinancialContactQuery(contactId=" + this.contactId + ", contactType=" + this.contactType + ", contactValue=" + this.contactValue + ", oneTimePassword=" + this.oneTimePassword + ", operationReference=" + this.operationReference + ", processReference=" + this.processReference + ", onboardingOperationReference=" + this.onboardingOperationReference + ')';
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

    public static final class ApproveFinancialContactV1 {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final Boolean needToSetMail;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42582xb533d09c();
            }

            public final ApproveFinancialContactV1 invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(ApproveFinancialContactV1.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new ApproveFinancialContactV1(h, oVar.mo19027j(ApproveFinancialContactV1.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22810a("needToSetMail", "needToSetMail", (Map) null, true, (List) null)};
        }

        public ApproveFinancialContactV1(String str, Boolean bool) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.needToSetMail = bool;
        }

        public static /* synthetic */ ApproveFinancialContactV1 copy$default(ApproveFinancialContactV1 approveFinancialContactV1, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approveFinancialContactV1.__typename;
            }
            if ((i & 2) != 0) {
                bool = approveFinancialContactV1.needToSetMail;
            }
            return approveFinancialContactV1.copy(str, bool);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Boolean component2() {
            return this.needToSetMail;
        }

        public final ApproveFinancialContactV1 copy(String str, Boolean bool) {
            C41536l.m120489i(str, "__typename");
            return new ApproveFinancialContactV1(str, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApproveFinancialContactV1)) {
                return false;
            }
            ApproveFinancialContactV1 approveFinancialContactV1 = (ApproveFinancialContactV1) obj;
            return C41536l.m120484d(this.__typename, approveFinancialContactV1.__typename) && C41536l.m120484d(this.needToSetMail, approveFinancialContactV1.needToSetMail);
        }

        public final Boolean getNeedToSetMail() {
            return this.needToSetMail;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            Boolean bool = this.needToSetMail;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42583x2fb1a67e(this);
        }

        public String toString() {
            return "ApproveFinancialContactV1(__typename=" + this.__typename + ", needToSetMail=" + this.needToSetMail + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApproveFinancialContactV1(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "FinancialContactApproveResponse" : str, bool);
        }
    }

    public static final class RegistrationServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final ApproveFinancialContactV1 approveFinancialContactV1;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42585xb60b0344();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (ApproveFinancialContactV1) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42590x3fe86a92.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("approveFinancialContactV1", "approveFinancialContactV1", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("contactId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactId"))), C41233s.m119492a("contactType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactType"))), C41233s.m119492a("contactValue", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactValue"))), C41233s.m119492a("onboardingOperationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "onboardingOperationReference"))), C41233s.m119492a("oneTimePassword", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "oneTimePassword"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))))), true, (List) null)};
        }

        public RegistrationServices(String str, ApproveFinancialContactV1 approveFinancialContactV12) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.approveFinancialContactV1 = approveFinancialContactV12;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, ApproveFinancialContactV1 approveFinancialContactV12, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                approveFinancialContactV12 = registrationServices.approveFinancialContactV1;
            }
            return registrationServices.copy(str, approveFinancialContactV12);
        }

        public final String component1() {
            return this.__typename;
        }

        public final ApproveFinancialContactV1 component2() {
            return this.approveFinancialContactV1;
        }

        public final RegistrationServices copy(String str, ApproveFinancialContactV1 approveFinancialContactV12) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, approveFinancialContactV12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.approveFinancialContactV1, registrationServices.approveFinancialContactV1);
        }

        public final ApproveFinancialContactV1 getApproveFinancialContactV1() {
            return this.approveFinancialContactV1;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            ApproveFinancialContactV1 approveFinancialContactV12 = this.approveFinancialContactV1;
            return hashCode + (approveFinancialContactV12 == null ? 0 : approveFinancialContactV12.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42586xa3edf726(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", approveFinancialContactV1=" + this.approveFinancialContactV1 + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, ApproveFinancialContactV1 approveFinancialContactV12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, approveFinancialContactV12);
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
    public /* synthetic */ ApproveFinancialContactQuery(C7833e eVar, String str, C7833e eVar2, String str2, C7833e eVar3, C7833e eVar4, C7833e eVar5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, str, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar2, str2, (i & 16) != 0 ? C7833e.f22754c.mo22767a() : eVar3, (i & 32) != 0 ? C7833e.f22754c.mo22767a() : eVar4, (i & 64) != 0 ? C7833e.f22754c.mo22767a() : eVar5);
    }
}
