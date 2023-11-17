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

public final class ConfirmationOnTermsQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "8a56509e3026fca007b1a57c5fff68a76dfd2595f1f50795dfb65ee11683fd74";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new ConfirmationOnTermsQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query confirmationOnTermsQuery($pin: String, $processReference: String, $serviceKey: String, $documentContent: String) {\n  registrationServices {\n    __typename\n    confirmationOnTerms(request: {pin: $pin, processReference: $processReference, serviceKey: $serviceKey, documentContent: $documentContent})\n  }\n}");
    private final C7833e documentContent;
    private final C7833e pin;
    private final C7833e processReference;
    private final C7833e serviceKey;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return ConfirmationOnTermsQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return ConfirmationOnTermsQuery.QUERY_DOCUMENT;
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
                return new ConfirmationOnTermsQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42626xb39c9e40.INSTANCE));
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
            return new ConfirmationOnTermsQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public ConfirmationOnTermsQuery() {
        this((C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ConfirmationOnTermsQuery copy$default(ConfirmationOnTermsQuery confirmationOnTermsQuery, C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = confirmationOnTermsQuery.pin;
        }
        if ((i & 2) != 0) {
            eVar2 = confirmationOnTermsQuery.processReference;
        }
        if ((i & 4) != 0) {
            eVar3 = confirmationOnTermsQuery.serviceKey;
        }
        if ((i & 8) != 0) {
            eVar4 = confirmationOnTermsQuery.documentContent;
        }
        return confirmationOnTermsQuery.copy(eVar, eVar2, eVar3, eVar4);
    }

    public final C7833e component1() {
        return this.pin;
    }

    public final C7833e component2() {
        return this.processReference;
    }

    public final C7833e component3() {
        return this.serviceKey;
    }

    public final C7833e component4() {
        return this.documentContent;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final ConfirmationOnTermsQuery copy(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4) {
        C41536l.m120489i(eVar, "pin");
        C41536l.m120489i(eVar2, "processReference");
        C41536l.m120489i(eVar3, "serviceKey");
        C41536l.m120489i(eVar4, "documentContent");
        return new ConfirmationOnTermsQuery(eVar, eVar2, eVar3, eVar4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmationOnTermsQuery)) {
            return false;
        }
        ConfirmationOnTermsQuery confirmationOnTermsQuery = (ConfirmationOnTermsQuery) obj;
        return C41536l.m120484d(this.pin, confirmationOnTermsQuery.pin) && C41536l.m120484d(this.processReference, confirmationOnTermsQuery.processReference) && C41536l.m120484d(this.serviceKey, confirmationOnTermsQuery.serviceKey) && C41536l.m120484d(this.documentContent, confirmationOnTermsQuery.documentContent);
    }

    public final C7833e getDocumentContent() {
        return this.documentContent;
    }

    public final C7833e getPin() {
        return this.pin;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public final C7833e getServiceKey() {
        return this.serviceKey;
    }

    public int hashCode() {
        return (((((this.pin.hashCode() * 31) + this.processReference.hashCode()) * 31) + this.serviceKey.hashCode()) * 31) + this.documentContent.hashCode();
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
        return new ConfirmationOnTermsQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "ConfirmationOnTermsQuery(pin=" + this.pin + ", processReference=" + this.processReference + ", serviceKey=" + this.serviceKey + ", documentContent=" + this.documentContent + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public ConfirmationOnTermsQuery(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4) {
        C41536l.m120489i(eVar, "pin");
        C41536l.m120489i(eVar2, "processReference");
        C41536l.m120489i(eVar3, "serviceKey");
        C41536l.m120489i(eVar4, "documentContent");
        this.pin = eVar;
        this.processReference = eVar2;
        this.serviceKey = eVar3;
        this.documentContent = eVar4;
        this.variables = new ConfirmationOnTermsQuery$variables$1(this);
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
        private final Integer confirmationOnTerms;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42623x73b68d75();
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
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22814e("confirmationOnTerms", "confirmationOnTerms", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("pin", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "pin"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("serviceKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "serviceKey"))), C41233s.m119492a("documentContent", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "documentContent")))))), true, (List) null)};
        }

        public RegistrationServices(String str, Integer num) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.confirmationOnTerms = num;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                num = registrationServices.confirmationOnTerms;
            }
            return registrationServices.copy(str, num);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Integer component2() {
            return this.confirmationOnTerms;
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
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.confirmationOnTerms, registrationServices.confirmationOnTerms);
        }

        public final Integer getConfirmationOnTerms() {
            return this.confirmationOnTerms;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            Integer num = this.confirmationOnTerms;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42624x42d53a17(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", confirmationOnTerms=" + this.confirmationOnTerms + ')';
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
    public /* synthetic */ ConfirmationOnTermsQuery(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar3, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar4);
    }
}
