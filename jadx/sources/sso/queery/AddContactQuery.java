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
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import sso.type.ContactType;

public final class AddContactQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "e54efa2092c0d1970881115158ce99b3ae71823685b48bf8fe3b653f251a48bb";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new AddContactQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query addContact($contact: String!, $contactType: ContactType!, $operationId: String, $operationReference: String, $scaAuthCode: String) {\n  commonServices {\n    __typename\n    addContact(request: {contact: $contact, contactType: $contactType, operationId: $operationId, operationReference: $operationReference, scaAuthCode: $scaAuthCode, serviceId: \"CommonServices.addContact\"})\n  }\n}");
    private final String contact;
    private final ContactType contactType;
    private final C7833e operationId;
    private final C7833e operationReference;
    private final C7833e scaAuthCode;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return AddContactQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return AddContactQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("commonServices", "commonServices", (Map) null, true, (List) null)};
        private final CommonServices commonServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new AddContactQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], AddContactQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
            }
        }

        public Data(CommonServices commonServices2) {
            this.commonServices = commonServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, CommonServices commonServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                commonServices2 = data.commonServices;
            }
            return data.copy(commonServices2);
        }

        public final CommonServices component1() {
            return this.commonServices;
        }

        public final Data copy(CommonServices commonServices2) {
            return new Data(commonServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.commonServices, ((Data) obj).commonServices);
        }

        public final CommonServices getCommonServices() {
            return this.commonServices;
        }

        public int hashCode() {
            CommonServices commonServices2 = this.commonServices;
            if (commonServices2 == null) {
                return 0;
            }
            return commonServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new AddContactQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
        }
    }

    public AddContactQuery(String str, ContactType contactType2, C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(contactType2, "contactType");
        C41536l.m120489i(eVar, "operationId");
        C41536l.m120489i(eVar2, "operationReference");
        C41536l.m120489i(eVar3, "scaAuthCode");
        this.contact = str;
        this.contactType = contactType2;
        this.operationId = eVar;
        this.operationReference = eVar2;
        this.scaAuthCode = eVar3;
        this.variables = new AddContactQuery$variables$1(this);
    }

    public static /* synthetic */ AddContactQuery copy$default(AddContactQuery addContactQuery, String str, ContactType contactType2, C7833e eVar, C7833e eVar2, C7833e eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addContactQuery.contact;
        }
        if ((i & 2) != 0) {
            contactType2 = addContactQuery.contactType;
        }
        ContactType contactType3 = contactType2;
        if ((i & 4) != 0) {
            eVar = addContactQuery.operationId;
        }
        C7833e eVar4 = eVar;
        if ((i & 8) != 0) {
            eVar2 = addContactQuery.operationReference;
        }
        C7833e eVar5 = eVar2;
        if ((i & 16) != 0) {
            eVar3 = addContactQuery.scaAuthCode;
        }
        return addContactQuery.copy(str, contactType3, eVar4, eVar5, eVar3);
    }

    public final String component1() {
        return this.contact;
    }

    public final ContactType component2() {
        return this.contactType;
    }

    public final C7833e component3() {
        return this.operationId;
    }

    public final C7833e component4() {
        return this.operationReference;
    }

    public final C7833e component5() {
        return this.scaAuthCode;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final AddContactQuery copy(String str, ContactType contactType2, C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(contactType2, "contactType");
        C41536l.m120489i(eVar, "operationId");
        C41536l.m120489i(eVar2, "operationReference");
        C41536l.m120489i(eVar3, "scaAuthCode");
        return new AddContactQuery(str, contactType2, eVar, eVar2, eVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddContactQuery)) {
            return false;
        }
        AddContactQuery addContactQuery = (AddContactQuery) obj;
        return C41536l.m120484d(this.contact, addContactQuery.contact) && this.contactType == addContactQuery.contactType && C41536l.m120484d(this.operationId, addContactQuery.operationId) && C41536l.m120484d(this.operationReference, addContactQuery.operationReference) && C41536l.m120484d(this.scaAuthCode, addContactQuery.scaAuthCode);
    }

    public final String getContact() {
        return this.contact;
    }

    public final ContactType getContactType() {
        return this.contactType;
    }

    public final C7833e getOperationId() {
        return this.operationId;
    }

    public final C7833e getOperationReference() {
        return this.operationReference;
    }

    public final C7833e getScaAuthCode() {
        return this.scaAuthCode;
    }

    public int hashCode() {
        return (((((((this.contact.hashCode() * 31) + this.contactType.hashCode()) * 31) + this.operationId.hashCode()) * 31) + this.operationReference.hashCode()) * 31) + this.scaAuthCode.hashCode();
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
        return new AddContactQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "AddContactQuery(contact=" + this.contact + ", contactType=" + this.contactType + ", operationId=" + this.operationId + ", operationReference=" + this.operationReference + ", scaAuthCode=" + this.scaAuthCode + ')';
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

    public static final class CommonServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String addContact;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42581x82faa0b7();
            }

            public final CommonServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CommonServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CommonServices(h, oVar.mo19025h(CommonServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("addContact", "addContact", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("contact", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contact"))), C41233s.m119492a("contactType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactType"))), C41233s.m119492a("operationId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationId"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("scaAuthCode", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "scaAuthCode"))), C41233s.m119492a(IRetrofitService.SERVICE_ID, "CommonServices.addContact")))), true, (List) null)};
        }

        public CommonServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.addContact = str2;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = commonServices.addContact;
            }
            return commonServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.addContact;
        }

        public final CommonServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new CommonServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonServices)) {
                return false;
            }
            CommonServices commonServices = (CommonServices) obj;
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.addContact, commonServices.addContact);
        }

        public final String getAddContact() {
            return this.addContact;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.addContact;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new AddContactQuery$CommonServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", addContact=" + this.addContact + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CommonServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CommonServices" : str, str2);
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
    public /* synthetic */ AddContactQuery(String str, ContactType contactType2, C7833e eVar, C7833e eVar2, C7833e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, contactType2, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 16) != 0 ? C7833e.f22754c.mo22767a() : eVar3);
    }
}
