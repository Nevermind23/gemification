package sso.queery;

import com.salesforce.marketingcloud.C11398b;
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

public final class GetResetFlowTransactionsQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "6d5dd3b4279b8e1cbe32bc3f2cb10953200aaac3fb760aa7b7cd543a35106d8b";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetResetFlowTransactionsQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetResetFlowTransactions($processReference: String) {\n  registrationServices {\n    __typename\n    getPasswordRecoveryTransactions(processReference: $processReference) {\n      __typename\n      contacts {\n        __typename\n        amount\n        ccy\n        description\n        entryGroup\n        groupNameGe\n        groupNameInt\n        idHash\n        operationDate\n        title\n      }\n      maxChooseLimit\n      chooseTimeLimit\n    }\n  }\n}");
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetResetFlowTransactionsQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetResetFlowTransactionsQuery.QUERY_DOCUMENT;
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
                return new C42741xe2bc3f19();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42748x4bb27269.INSTANCE));
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
            return new GetResetFlowTransactionsQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetResetFlowTransactionsQuery() {
        this((C7833e) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GetResetFlowTransactionsQuery copy$default(GetResetFlowTransactionsQuery getResetFlowTransactionsQuery, C7833e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = getResetFlowTransactionsQuery.processReference;
        }
        return getResetFlowTransactionsQuery.copy(eVar);
    }

    public final C7833e component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetResetFlowTransactionsQuery copy(C7833e eVar) {
        C41536l.m120489i(eVar, "processReference");
        return new GetResetFlowTransactionsQuery(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetResetFlowTransactionsQuery) && C41536l.m120484d(this.processReference, ((GetResetFlowTransactionsQuery) obj).processReference);
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
        return new C42746x90188180();
    }

    public String toString() {
        return "GetResetFlowTransactionsQuery(processReference=" + this.processReference + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetResetFlowTransactionsQuery(C7833e eVar) {
        C41536l.m120489i(eVar, "processReference");
        this.processReference = eVar;
        this.variables = new GetResetFlowTransactionsQuery$variables$1(this);
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
        private final GetPasswordRecoveryTransactions getPasswordRecoveryTransactions;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42744x14b2576c();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetPasswordRecoveryTransactions) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42752x48025e16.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getPasswordRecoveryTransactions", "getPasswordRecoveryTransactions", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public RegistrationServices(String str, GetPasswordRecoveryTransactions getPasswordRecoveryTransactions2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getPasswordRecoveryTransactions = getPasswordRecoveryTransactions2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetPasswordRecoveryTransactions getPasswordRecoveryTransactions2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getPasswordRecoveryTransactions2 = registrationServices.getPasswordRecoveryTransactions;
            }
            return registrationServices.copy(str, getPasswordRecoveryTransactions2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetPasswordRecoveryTransactions component2() {
            return this.getPasswordRecoveryTransactions;
        }

        public final RegistrationServices copy(String str, GetPasswordRecoveryTransactions getPasswordRecoveryTransactions2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getPasswordRecoveryTransactions2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getPasswordRecoveryTransactions, registrationServices.getPasswordRecoveryTransactions);
        }

        public final GetPasswordRecoveryTransactions getGetPasswordRecoveryTransactions() {
            return this.getPasswordRecoveryTransactions;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetPasswordRecoveryTransactions getPasswordRecoveryTransactions2 = this.getPasswordRecoveryTransactions;
            return hashCode + (getPasswordRecoveryTransactions2 == null ? 0 : getPasswordRecoveryTransactions2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42745x9711894e(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getPasswordRecoveryTransactions=" + this.getPasswordRecoveryTransactions + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetPasswordRecoveryTransactions getPasswordRecoveryTransactions2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getPasswordRecoveryTransactions2);
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

    public static final class GetPasswordRecoveryTransactions {
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
                return new C42742xb3305118();
            }

            public final GetPasswordRecoveryTransactions invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetPasswordRecoveryTransactions.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetPasswordRecoveryTransactions(h, oVar.mo19026i(GetPasswordRecoveryTransactions.RESPONSE_FIELDS[1], C42749x9c0a41a6.INSTANCE), (BigDecimal) oVar.mo19019b((C7846k.C7848b) GetPasswordRecoveryTransactions.RESPONSE_FIELDS[2]), (BigDecimal) oVar.mo19019b((C7846k.C7848b) GetPasswordRecoveryTransactions.RESPONSE_FIELDS[3]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            CustomType customType = CustomType.LONG;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("contacts", "contacts", (Map) null, true, (List) null), aVar.mo22811b("maxChooseLimit", "maxChooseLimit", (Map) null, true, customType, (List) null), aVar.mo22811b("chooseTimeLimit", "chooseTimeLimit", (Map) null, true, customType, (List) null)};
        }

        public GetPasswordRecoveryTransactions(String str, List<Contact> list, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.contacts = list;
            this.maxChooseLimit = bigDecimal;
            this.chooseTimeLimit = bigDecimal2;
        }

        public static /* synthetic */ GetPasswordRecoveryTransactions copy$default(GetPasswordRecoveryTransactions getPasswordRecoveryTransactions, String str, List<Contact> list, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getPasswordRecoveryTransactions.__typename;
            }
            if ((i & 2) != 0) {
                list = getPasswordRecoveryTransactions.contacts;
            }
            if ((i & 4) != 0) {
                bigDecimal = getPasswordRecoveryTransactions.maxChooseLimit;
            }
            if ((i & 8) != 0) {
                bigDecimal2 = getPasswordRecoveryTransactions.chooseTimeLimit;
            }
            return getPasswordRecoveryTransactions.copy(str, list, bigDecimal, bigDecimal2);
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

        public final GetPasswordRecoveryTransactions copy(String str, List<Contact> list, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            C41536l.m120489i(str, "__typename");
            return new GetPasswordRecoveryTransactions(str, list, bigDecimal, bigDecimal2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetPasswordRecoveryTransactions)) {
                return false;
            }
            GetPasswordRecoveryTransactions getPasswordRecoveryTransactions = (GetPasswordRecoveryTransactions) obj;
            return C41536l.m120484d(this.__typename, getPasswordRecoveryTransactions.__typename) && C41536l.m120484d(this.contacts, getPasswordRecoveryTransactions.contacts) && C41536l.m120484d(this.maxChooseLimit, getPasswordRecoveryTransactions.maxChooseLimit) && C41536l.m120484d(this.chooseTimeLimit, getPasswordRecoveryTransactions.chooseTimeLimit);
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
            return new C42743x834733fa(this);
        }

        public String toString() {
            return "GetPasswordRecoveryTransactions(__typename=" + this.__typename + ", contacts=" + this.contacts + ", maxChooseLimit=" + this.maxChooseLimit + ", chooseTimeLimit=" + this.chooseTimeLimit + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetPasswordRecoveryTransactions(String str, List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GetTransactionsResWrapper" : str, list, bigDecimal, bigDecimal2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetResetFlowTransactionsQuery(C7833e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar);
    }

    public static final class Contact {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String amount;
        private final String ccy;
        private final String description;
        private final String entryGroup;
        private final String groupNameGe;
        private final String groupNameInt;
        private final String idHash;
        private final BigDecimal operationDate;
        private final String title;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42739xb3d10213();
            }

            public final Contact invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(Contact.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new Contact(h, oVar.mo19025h(Contact.RESPONSE_FIELDS[1]), oVar.mo19025h(Contact.RESPONSE_FIELDS[2]), oVar.mo19025h(Contact.RESPONSE_FIELDS[3]), oVar.mo19025h(Contact.RESPONSE_FIELDS[4]), oVar.mo19025h(Contact.RESPONSE_FIELDS[5]), oVar.mo19025h(Contact.RESPONSE_FIELDS[6]), oVar.mo19025h(Contact.RESPONSE_FIELDS[7]), (BigDecimal) oVar.mo19019b((C7846k.C7848b) Contact.RESPONSE_FIELDS[8]), oVar.mo19025h(Contact.RESPONSE_FIELDS[9]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("amount", "amount", (Map) null, true, (List) null), aVar.mo22817h("ccy", "ccy", (Map) null, true, (List) null), aVar.mo22817h("description", "description", (Map) null, true, (List) null), aVar.mo22817h("entryGroup", "entryGroup", (Map) null, true, (List) null), aVar.mo22817h("groupNameGe", "groupNameGe", (Map) null, true, (List) null), aVar.mo22817h("groupNameInt", "groupNameInt", (Map) null, true, (List) null), aVar.mo22817h("idHash", "idHash", (Map) null, true, (List) null), aVar.mo22811b("operationDate", "operationDate", (Map) null, true, CustomType.LONG, (List) null), aVar.mo22817h("title", "title", (Map) null, true, (List) null)};
        }

        public Contact(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, String str9) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.amount = str2;
            this.ccy = str3;
            this.description = str4;
            this.entryGroup = str5;
            this.groupNameGe = str6;
            this.groupNameInt = str7;
            this.idHash = str8;
            this.operationDate = bigDecimal;
            this.title = str9;
        }

        public static /* synthetic */ Contact copy$default(Contact contact, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, String str9, int i, Object obj) {
            Contact contact2 = contact;
            int i2 = i;
            return contact.copy((i2 & 1) != 0 ? contact2.__typename : str, (i2 & 2) != 0 ? contact2.amount : str2, (i2 & 4) != 0 ? contact2.ccy : str3, (i2 & 8) != 0 ? contact2.description : str4, (i2 & 16) != 0 ? contact2.entryGroup : str5, (i2 & 32) != 0 ? contact2.groupNameGe : str6, (i2 & 64) != 0 ? contact2.groupNameInt : str7, (i2 & 128) != 0 ? contact2.idHash : str8, (i2 & C11398b.f33139r) != 0 ? contact2.operationDate : bigDecimal, (i2 & C11398b.f33140s) != 0 ? contact2.title : str9);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component10() {
            return this.title;
        }

        public final String component2() {
            return this.amount;
        }

        public final String component3() {
            return this.ccy;
        }

        public final String component4() {
            return this.description;
        }

        public final String component5() {
            return this.entryGroup;
        }

        public final String component6() {
            return this.groupNameGe;
        }

        public final String component7() {
            return this.groupNameInt;
        }

        public final String component8() {
            return this.idHash;
        }

        public final BigDecimal component9() {
            return this.operationDate;
        }

        public final Contact copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, String str9) {
            C41536l.m120489i(str, "__typename");
            return new Contact(str, str2, str3, str4, str5, str6, str7, str8, bigDecimal, str9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) obj;
            return C41536l.m120484d(this.__typename, contact.__typename) && C41536l.m120484d(this.amount, contact.amount) && C41536l.m120484d(this.ccy, contact.ccy) && C41536l.m120484d(this.description, contact.description) && C41536l.m120484d(this.entryGroup, contact.entryGroup) && C41536l.m120484d(this.groupNameGe, contact.groupNameGe) && C41536l.m120484d(this.groupNameInt, contact.groupNameInt) && C41536l.m120484d(this.idHash, contact.idHash) && C41536l.m120484d(this.operationDate, contact.operationDate) && C41536l.m120484d(this.title, contact.title);
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCcy() {
            return this.ccy;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEntryGroup() {
            return this.entryGroup;
        }

        public final String getGroupNameGe() {
            return this.groupNameGe;
        }

        public final String getGroupNameInt() {
            return this.groupNameInt;
        }

        public final String getIdHash() {
            return this.idHash;
        }

        public final BigDecimal getOperationDate() {
            return this.operationDate;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.amount;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.ccy;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.entryGroup;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.groupNameGe;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.groupNameInt;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.idHash;
            int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            BigDecimal bigDecimal = this.operationDate;
            int hashCode9 = (hashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str8 = this.title;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return hashCode9 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42740x7292fd35(this);
        }

        public String toString() {
            return "Contact(__typename=" + this.__typename + ", amount=" + this.amount + ", ccy=" + this.ccy + ", description=" + this.description + ", entryGroup=" + this.entryGroup + ", groupNameGe=" + this.groupNameGe + ", groupNameInt=" + this.groupNameInt + ", idHash=" + this.idHash + ", operationDate=" + this.operationDate + ", title=" + this.title + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Contact(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "TransactionWrap" : str, str2, str3, str4, str5, str6, str7, str8, bigDecimal, str9);
        }
    }
}
