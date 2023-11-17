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
import sso.type.UserContactType;

public final class GetUserContactsQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "387a3682993d7f2f3c7724bb8856a6df9c2d68a826c5e36efb1408880f3a96f9";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetUserContactsQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getUserContactsQuery($processReference: String!, $preSelectedContact: String) {\n  commonServices {\n    __typename\n    getUserContacts(preSelectedContact: $preSelectedContact, processReference:$processReference) {\n      __typename\n      preSelected\n      contact\n      financial\n      id\n      type\n    }\n  }\n}");
    private final C7833e preSelectedContact;
    private final String processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetUserContactsQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetUserContactsQuery.QUERY_DOCUMENT;
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
                return new GetUserContactsQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetUserContactsQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
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
            return new GetUserContactsQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
        }
    }

    public GetUserContactsQuery(String str, C7833e eVar) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(eVar, "preSelectedContact");
        this.processReference = str;
        this.preSelectedContact = eVar;
        this.variables = new GetUserContactsQuery$variables$1(this);
    }

    public static /* synthetic */ GetUserContactsQuery copy$default(GetUserContactsQuery getUserContactsQuery, String str, C7833e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUserContactsQuery.processReference;
        }
        if ((i & 2) != 0) {
            eVar = getUserContactsQuery.preSelectedContact;
        }
        return getUserContactsQuery.copy(str, eVar);
    }

    public final String component1() {
        return this.processReference;
    }

    public final C7833e component2() {
        return this.preSelectedContact;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetUserContactsQuery copy(String str, C7833e eVar) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(eVar, "preSelectedContact");
        return new GetUserContactsQuery(str, eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserContactsQuery)) {
            return false;
        }
        GetUserContactsQuery getUserContactsQuery = (GetUserContactsQuery) obj;
        return C41536l.m120484d(this.processReference, getUserContactsQuery.processReference) && C41536l.m120484d(this.preSelectedContact, getUserContactsQuery.preSelectedContact);
    }

    public final C7833e getPreSelectedContact() {
        return this.preSelectedContact;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (this.processReference.hashCode() * 31) + this.preSelectedContact.hashCode();
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
        return new GetUserContactsQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetUserContactsQuery(processReference=" + this.processReference + ", preSelectedContact=" + this.preSelectedContact + ')';
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
        private final List<GetUserContact> getUserContacts;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42771xbbe341e2();
            }

            public final CommonServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CommonServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CommonServices(h, oVar.mo19026i(CommonServices.RESPONSE_FIELDS[1], C42773xba574d45.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("getUserContacts", "getUserContacts", C41344r0.m119931m(C41233s.m119492a("preSelectedContact", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "preSelectedContact"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public CommonServices(String str, List<GetUserContact> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getUserContacts = list;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, List<GetUserContact> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                list = commonServices.getUserContacts;
            }
            return commonServices.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<GetUserContact> component2() {
            return this.getUserContacts;
        }

        public final CommonServices copy(String str, List<GetUserContact> list) {
            C41536l.m120489i(str, "__typename");
            return new CommonServices(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonServices)) {
                return false;
            }
            CommonServices commonServices = (CommonServices) obj;
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.getUserContacts, commonServices.getUserContacts);
        }

        public final List<GetUserContact> getGetUserContacts() {
            return this.getUserContacts;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<GetUserContact> list = this.getUserContacts;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetUserContactsQuery$CommonServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", getUserContacts=" + this.getUserContacts + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CommonServices(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CommonServices" : str, list);
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
    public /* synthetic */ GetUserContactsQuery(String str, C7833e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar);
    }

    public static final class GetUserContact {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String contact;
        private final Boolean financial;

        /* renamed from: id */
        private final String f100189id;
        private final Boolean preSelected;
        private final UserContactType type;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42772x7174bcec();
            }

            public final GetUserContact invoke(C8124o oVar) {
                UserContactType userContactType;
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetUserContact.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                Boolean j = oVar.mo19027j(GetUserContact.RESPONSE_FIELDS[1]);
                String h2 = oVar.mo19025h(GetUserContact.RESPONSE_FIELDS[2]);
                Boolean j2 = oVar.mo19027j(GetUserContact.RESPONSE_FIELDS[3]);
                String h3 = oVar.mo19025h(GetUserContact.RESPONSE_FIELDS[4]);
                String h4 = oVar.mo19025h(GetUserContact.RESPONSE_FIELDS[5]);
                if (h4 != null) {
                    userContactType = UserContactType.Companion.safeValueOf(h4);
                } else {
                    userContactType = null;
                }
                return new GetUserContact(h, j, h2, j2, h3, userContactType);
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22810a("preSelected", "preSelected", (Map) null, true, (List) null), aVar.mo22817h("contact", "contact", (Map) null, true, (List) null), aVar.mo22810a("financial", "financial", (Map) null, true, (List) null), aVar.mo22817h("id", "id", (Map) null, true, (List) null), aVar.mo22812c("type", "type", (Map) null, true, (List) null)};
        }

        public GetUserContact(String str, Boolean bool, String str2, Boolean bool2, String str3, UserContactType userContactType) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.preSelected = bool;
            this.contact = str2;
            this.financial = bool2;
            this.f100189id = str3;
            this.type = userContactType;
        }

        public static /* synthetic */ GetUserContact copy$default(GetUserContact getUserContact, String str, Boolean bool, String str2, Boolean bool2, String str3, UserContactType userContactType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getUserContact.__typename;
            }
            if ((i & 2) != 0) {
                bool = getUserContact.preSelected;
            }
            Boolean bool3 = bool;
            if ((i & 4) != 0) {
                str2 = getUserContact.contact;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                bool2 = getUserContact.financial;
            }
            Boolean bool4 = bool2;
            if ((i & 16) != 0) {
                str3 = getUserContact.f100189id;
            }
            String str5 = str3;
            if ((i & 32) != 0) {
                userContactType = getUserContact.type;
            }
            return getUserContact.copy(str, bool3, str4, bool4, str5, userContactType);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Boolean component2() {
            return this.preSelected;
        }

        public final String component3() {
            return this.contact;
        }

        public final Boolean component4() {
            return this.financial;
        }

        public final String component5() {
            return this.f100189id;
        }

        public final UserContactType component6() {
            return this.type;
        }

        public final GetUserContact copy(String str, Boolean bool, String str2, Boolean bool2, String str3, UserContactType userContactType) {
            C41536l.m120489i(str, "__typename");
            return new GetUserContact(str, bool, str2, bool2, str3, userContactType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetUserContact)) {
                return false;
            }
            GetUserContact getUserContact = (GetUserContact) obj;
            return C41536l.m120484d(this.__typename, getUserContact.__typename) && C41536l.m120484d(this.preSelected, getUserContact.preSelected) && C41536l.m120484d(this.contact, getUserContact.contact) && C41536l.m120484d(this.financial, getUserContact.financial) && C41536l.m120484d(this.f100189id, getUserContact.f100189id) && this.type == getUserContact.type;
        }

        public final String getContact() {
            return this.contact;
        }

        public final Boolean getFinancial() {
            return this.financial;
        }

        public final String getId() {
            return this.f100189id;
        }

        public final Boolean getPreSelected() {
            return this.preSelected;
        }

        public final UserContactType getType() {
            return this.type;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            Boolean bool = this.preSelected;
            int i = 0;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.contact;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.financial;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.f100189id;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UserContactType userContactType = this.type;
            if (userContactType != null) {
                i = userContactType.hashCode();
            }
            return hashCode5 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetUserContactsQuery$GetUserContact$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "GetUserContact(__typename=" + this.__typename + ", preSelected=" + this.preSelected + ", contact=" + this.contact + ", financial=" + this.financial + ", id=" + this.f100189id + ", type=" + this.type + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetUserContact(String str, Boolean bool, String str2, Boolean bool2, String str3, UserContactType userContactType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "UserContact" : str, bool, str2, bool2, str3, userContactType);
        }
    }
}
