package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41233s;
import java.math.BigDecimal;
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
import sso.type.CustomType;

public final class GetResetFlowContactsQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "a545501766d11eb2e070430bd58bcab95fe0a4da3922a3cc771b93712b531a50";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetResetFlowContactsQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetResetFlowContacts($processReference: String, $flowType: String) {\n  registrationServices {\n    __typename\n    getPasswordRecoveryContacts(processReference: $processReference, flowType: $flowType) {\n      __typename\n      contacts {\n        __typename\n        hashId\n        firstName\n        firstNameInt\n        lastName\n        lastNameInt\n      }\n      maxChooseLimit\n      chooseTimeLimit\n    }\n  }\n}");
    private final C7833e flowType;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetResetFlowContactsQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetResetFlowContactsQuery.QUERY_DOCUMENT;
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
                return new C42728xbbc2315b();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42734xd785d1e7.INSTANCE));
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
            return new GetResetFlowContactsQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetResetFlowContactsQuery() {
        this((C7833e) null, (C7833e) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GetResetFlowContactsQuery copy$default(GetResetFlowContactsQuery getResetFlowContactsQuery, C7833e eVar, C7833e eVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = getResetFlowContactsQuery.processReference;
        }
        if ((i & 2) != 0) {
            eVar2 = getResetFlowContactsQuery.flowType;
        }
        return getResetFlowContactsQuery.copy(eVar, eVar2);
    }

    public final C7833e component1() {
        return this.processReference;
    }

    public final C7833e component2() {
        return this.flowType;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetResetFlowContactsQuery copy(C7833e eVar, C7833e eVar2) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "flowType");
        return new GetResetFlowContactsQuery(eVar, eVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetResetFlowContactsQuery)) {
            return false;
        }
        GetResetFlowContactsQuery getResetFlowContactsQuery = (GetResetFlowContactsQuery) obj;
        return C41536l.m120484d(this.processReference, getResetFlowContactsQuery.processReference) && C41536l.m120484d(this.flowType, getResetFlowContactsQuery.flowType);
    }

    public final C7833e getFlowType() {
        return this.flowType;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (this.processReference.hashCode() * 31) + this.flowType.hashCode();
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
        return new GetResetFlowContactsQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetResetFlowContactsQuery(processReference=" + this.processReference + ", flowType=" + this.flowType + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetResetFlowContactsQuery(C7833e eVar, C7833e eVar2) {
        C41536l.m120489i(eVar, "processReference");
        C41536l.m120489i(eVar2, "flowType");
        this.processReference = eVar;
        this.flowType = eVar2;
        this.variables = new GetResetFlowContactsQuery$variables$1(this);
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
        private final GetPasswordRecoveryContacts getPasswordRecoveryContacts;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42731xa35f85ae();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetPasswordRecoveryContacts) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42738x6f9d5a56.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getPasswordRecoveryContacts", "getPasswordRecoveryContacts", C41344r0.m119931m(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("flowType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "flowType")))), true, (List) null)};
        }

        public RegistrationServices(String str, GetPasswordRecoveryContacts getPasswordRecoveryContacts2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getPasswordRecoveryContacts = getPasswordRecoveryContacts2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetPasswordRecoveryContacts getPasswordRecoveryContacts2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getPasswordRecoveryContacts2 = registrationServices.getPasswordRecoveryContacts;
            }
            return registrationServices.copy(str, getPasswordRecoveryContacts2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetPasswordRecoveryContacts component2() {
            return this.getPasswordRecoveryContacts;
        }

        public final RegistrationServices copy(String str, GetPasswordRecoveryContacts getPasswordRecoveryContacts2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getPasswordRecoveryContacts2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getPasswordRecoveryContacts, registrationServices.getPasswordRecoveryContacts);
        }

        public final GetPasswordRecoveryContacts getGetPasswordRecoveryContacts() {
            return this.getPasswordRecoveryContacts;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetPasswordRecoveryContacts getPasswordRecoveryContacts2 = this.getPasswordRecoveryContacts;
            return hashCode + (getPasswordRecoveryContacts2 == null ? 0 : getPasswordRecoveryContacts2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42732x41c71110(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getPasswordRecoveryContacts=" + this.getPasswordRecoveryContacts + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetPasswordRecoveryContacts getPasswordRecoveryContacts2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getPasswordRecoveryContacts2);
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

    public static final class GetPasswordRecoveryContacts {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final BigDecimal chooseTimeLimit;
        private final List<Contact> contacts;
        private final BigDecimal maxChooseLimit;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42729x3f5dd5d8();
            }

            public final GetPasswordRecoveryContacts invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetPasswordRecoveryContacts.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetPasswordRecoveryContacts(h, oVar.mo19026i(GetPasswordRecoveryContacts.RESPONSE_FIELDS[1], C42735x6d2cc4e6.INSTANCE), (BigDecimal) oVar.mo19019b((C7846k.C7848b) GetPasswordRecoveryContacts.RESPONSE_FIELDS[2]), (BigDecimal) oVar.mo19019b((C7846k.C7848b) GetPasswordRecoveryContacts.RESPONSE_FIELDS[3]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            CustomType customType = CustomType.LONG;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("contacts", "contacts", (Map) null, true, (List) null), aVar.mo22811b("maxChooseLimit", "maxChooseLimit", (Map) null, true, customType, (List) null), aVar.mo22811b("chooseTimeLimit", "chooseTimeLimit", (Map) null, true, customType, (List) null)};
        }

        public GetPasswordRecoveryContacts(String str, List<Contact> list, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.contacts = list;
            this.maxChooseLimit = bigDecimal;
            this.chooseTimeLimit = bigDecimal2;
        }

        public static /* synthetic */ GetPasswordRecoveryContacts copy$default(GetPasswordRecoveryContacts getPasswordRecoveryContacts, String str, List<Contact> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getPasswordRecoveryContacts.__typename;
            }
            if ((i & 2) != 0) {
                list = getPasswordRecoveryContacts.contacts;
            }
            if ((i & 4) != 0) {
                bigDecimal = getPasswordRecoveryContacts.maxChooseLimit;
            }
            if ((i & 8) != 0) {
                bigDecimal2 = getPasswordRecoveryContacts.chooseTimeLimit;
            }
            return getPasswordRecoveryContacts.copy(str, list, bigDecimal, bigDecimal2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<Contact> component2() {
            return this.contacts;
        }

        public final BigDecimal component3() {
            return this.maxChooseLimit;
        }

        public final BigDecimal component4() {
            return this.chooseTimeLimit;
        }

        public final GetPasswordRecoveryContacts copy(String str, List<Contact> list, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            C41536l.m120489i(str, "__typename");
            return new GetPasswordRecoveryContacts(str, list, bigDecimal, bigDecimal2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetPasswordRecoveryContacts)) {
                return false;
            }
            GetPasswordRecoveryContacts getPasswordRecoveryContacts = (GetPasswordRecoveryContacts) obj;
            return C41536l.m120484d(this.__typename, getPasswordRecoveryContacts.__typename) && C41536l.m120484d(this.contacts, getPasswordRecoveryContacts.contacts) && C41536l.m120484d(this.maxChooseLimit, getPasswordRecoveryContacts.maxChooseLimit) && C41536l.m120484d(this.chooseTimeLimit, getPasswordRecoveryContacts.chooseTimeLimit);
        }

        public final BigDecimal getChooseTimeLimit() {
            return this.chooseTimeLimit;
        }

        public final List<Contact> getContacts() {
            return this.contacts;
        }

        public final BigDecimal getMaxChooseLimit() {
            return this.maxChooseLimit;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<Contact> list = this.contacts;
            int i = 0;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            BigDecimal bigDecimal = this.maxChooseLimit;
            int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.chooseTimeLimit;
            if (bigDecimal2 != null) {
                i = bigDecimal2.hashCode();
            }
            return hashCode3 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42730xe2748ba(this);
        }

        public String toString() {
            return "GetPasswordRecoveryContacts(__typename=" + this.__typename + ", contacts=" + this.contacts + ", maxChooseLimit=" + this.maxChooseLimit + ", chooseTimeLimit=" + this.chooseTimeLimit + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetPasswordRecoveryContacts(String str, List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "OtpGetContactsResultWrapper" : str, list, bigDecimal, bigDecimal2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetResetFlowContactsQuery(C7833e eVar, C7833e eVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2);
    }

    public static final class Contact {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String firstName;
        private final String firstNameInt;
        private final String hashId;
        private final String lastName;
        private final String lastNameInt;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42727xeecbd091();
            }

            public final Contact invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(Contact.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new Contact(h, oVar.mo19025h(Contact.RESPONSE_FIELDS[1]), oVar.mo19025h(Contact.RESPONSE_FIELDS[2]), oVar.mo19025h(Contact.RESPONSE_FIELDS[3]), oVar.mo19025h(Contact.RESPONSE_FIELDS[4]), oVar.mo19025h(Contact.RESPONSE_FIELDS[5]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("hashId", "hashId", (Map) null, true, (List) null), aVar.mo22817h("firstName", "firstName", (Map) null, true, (List) null), aVar.mo22817h("firstNameInt", "firstNameInt", (Map) null, true, (List) null), aVar.mo22817h("lastName", "lastName", (Map) null, true, (List) null), aVar.mo22817h("lastNameInt", "lastNameInt", (Map) null, true, (List) null)};
        }

        public Contact(String str, String str2, String str3, String str4, String str5, String str6) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.hashId = str2;
            this.firstName = str3;
            this.firstNameInt = str4;
            this.lastName = str5;
            this.lastNameInt = str6;
        }

        public static /* synthetic */ Contact copy$default(Contact contact, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contact.__typename;
            }
            if ((i & 2) != 0) {
                str2 = contact.hashId;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = contact.firstName;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = contact.firstNameInt;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = contact.lastName;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = contact.lastNameInt;
            }
            return contact.copy(str, str7, str8, str9, str10, str6);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.hashId;
        }

        public final String component3() {
            return this.firstName;
        }

        public final String component4() {
            return this.firstNameInt;
        }

        public final String component5() {
            return this.lastName;
        }

        public final String component6() {
            return this.lastNameInt;
        }

        public final Contact copy(String str, String str2, String str3, String str4, String str5, String str6) {
            C41536l.m120489i(str, "__typename");
            return new Contact(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) obj;
            return C41536l.m120484d(this.__typename, contact.__typename) && C41536l.m120484d(this.hashId, contact.hashId) && C41536l.m120484d(this.firstName, contact.firstName) && C41536l.m120484d(this.firstNameInt, contact.firstNameInt) && C41536l.m120484d(this.lastName, contact.lastName) && C41536l.m120484d(this.lastNameInt, contact.lastNameInt);
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getFirstNameInt() {
            return this.firstNameInt;
        }

        public final String getHashId() {
            return this.hashId;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getLastNameInt() {
            return this.lastNameInt;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.hashId;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.firstName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.firstNameInt;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.lastName;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.lastNameInt;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode5 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetResetFlowContactsQuery$Contact$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Contact(__typename=" + this.__typename + ", hashId=" + this.hashId + ", firstName=" + this.firstName + ", firstNameInt=" + this.firstNameInt + ", lastName=" + this.lastName + ", lastNameInt=" + this.lastNameInt + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Contact(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "OtpContactWrap" : str, str2, str3, str4, str5, str6);
        }
    }
}
