package sso.queery;

import com.salesforce.marketingcloud.C11398b;
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
import sso.type.UserContactType;

public final class GetClientInfoQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "7fe2251b1edcfccba5ca134cb37b736b6baa99dac7b7a0489d9920ac07d44dd9";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetClientInfoQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getClientInfo($processReference: String!) {\n  commonServices {\n    __typename\n    getClientInfo(processReference: $processReference) {\n      __typename\n      address\n      firstName\n      lastName\n      username\n      imageURL\n      profilePictureStatus\n      isDefaultImage\n      clientContacts {\n        __typename\n        id\n        type\n        preSelected\n        financial\n        contact\n      }\n    }\n  }\n}");
    private final String processReference;
    private final transient C7836g.C7839c variables = new GetClientInfoQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetClientInfoQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetClientInfoQuery.QUERY_DOCUMENT;
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
                return new GetClientInfoQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetClientInfoQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
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
            return new GetClientInfoQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
        }
    }

    public GetClientInfoQuery(String str) {
        C41536l.m120489i(str, "processReference");
        this.processReference = str;
    }

    public static /* synthetic */ GetClientInfoQuery copy$default(GetClientInfoQuery getClientInfoQuery, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getClientInfoQuery.processReference;
        }
        return getClientInfoQuery.copy(str);
    }

    public final String component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetClientInfoQuery copy(String str) {
        C41536l.m120489i(str, "processReference");
        return new GetClientInfoQuery(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetClientInfoQuery) && C41536l.m120484d(this.processReference, ((GetClientInfoQuery) obj).processReference);
    }

    public final String getProcessReference() {
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
        return new GetClientInfoQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetClientInfoQuery(processReference=" + this.processReference + ')';
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
        private final GetClientInfo getClientInfo;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42630xe4c90027();
            }

            public final CommonServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CommonServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CommonServices(h, (GetClientInfo) oVar.mo19023f(CommonServices.RESPONSE_FIELDS[1], C42632x6431b125.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getClientInfo", "getClientInfo", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public CommonServices(String str, GetClientInfo getClientInfo2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getClientInfo = getClientInfo2;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, GetClientInfo getClientInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                getClientInfo2 = commonServices.getClientInfo;
            }
            return commonServices.copy(str, getClientInfo2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetClientInfo component2() {
            return this.getClientInfo;
        }

        public final CommonServices copy(String str, GetClientInfo getClientInfo2) {
            C41536l.m120489i(str, "__typename");
            return new CommonServices(str, getClientInfo2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonServices)) {
                return false;
            }
            CommonServices commonServices = (CommonServices) obj;
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.getClientInfo, commonServices.getClientInfo);
        }

        public final GetClientInfo getGetClientInfo() {
            return this.getClientInfo;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetClientInfo getClientInfo2 = this.getClientInfo;
            return hashCode + (getClientInfo2 == null ? 0 : getClientInfo2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetClientInfoQuery$CommonServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", getClientInfo=" + this.getClientInfo + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CommonServices(String str, GetClientInfo getClientInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CommonServices" : str, getClientInfo2);
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

    public static final class ClientContact {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String contact;
        private final Boolean financial;

        /* renamed from: id */
        private final String f100186id;
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
                return new C42629x62f5b171();
            }

            public final ClientContact invoke(C8124o oVar) {
                UserContactType userContactType;
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(ClientContact.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                String h2 = oVar.mo19025h(ClientContact.RESPONSE_FIELDS[1]);
                String h3 = oVar.mo19025h(ClientContact.RESPONSE_FIELDS[2]);
                if (h3 != null) {
                    userContactType = UserContactType.Companion.safeValueOf(h3);
                } else {
                    userContactType = null;
                }
                return new ClientContact(h, h2, userContactType, oVar.mo19027j(ClientContact.RESPONSE_FIELDS[3]), oVar.mo19027j(ClientContact.RESPONSE_FIELDS[4]), oVar.mo19025h(ClientContact.RESPONSE_FIELDS[5]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("id", "id", (Map) null, true, (List) null), aVar.mo22812c("type", "type", (Map) null, true, (List) null), aVar.mo22810a("preSelected", "preSelected", (Map) null, true, (List) null), aVar.mo22810a("financial", "financial", (Map) null, true, (List) null), aVar.mo22817h("contact", "contact", (Map) null, true, (List) null)};
        }

        public ClientContact(String str, String str2, UserContactType userContactType, Boolean bool, Boolean bool2, String str3) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.f100186id = str2;
            this.type = userContactType;
            this.preSelected = bool;
            this.financial = bool2;
            this.contact = str3;
        }

        public static /* synthetic */ ClientContact copy$default(ClientContact clientContact, String str, String str2, UserContactType userContactType, Boolean bool, Boolean bool2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientContact.__typename;
            }
            if ((i & 2) != 0) {
                str2 = clientContact.f100186id;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                userContactType = clientContact.type;
            }
            UserContactType userContactType2 = userContactType;
            if ((i & 8) != 0) {
                bool = clientContact.preSelected;
            }
            Boolean bool3 = bool;
            if ((i & 16) != 0) {
                bool2 = clientContact.financial;
            }
            Boolean bool4 = bool2;
            if ((i & 32) != 0) {
                str3 = clientContact.contact;
            }
            return clientContact.copy(str, str4, userContactType2, bool3, bool4, str3);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.f100186id;
        }

        public final UserContactType component3() {
            return this.type;
        }

        public final Boolean component4() {
            return this.preSelected;
        }

        public final Boolean component5() {
            return this.financial;
        }

        public final String component6() {
            return this.contact;
        }

        public final ClientContact copy(String str, String str2, UserContactType userContactType, Boolean bool, Boolean bool2, String str3) {
            C41536l.m120489i(str, "__typename");
            return new ClientContact(str, str2, userContactType, bool, bool2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientContact)) {
                return false;
            }
            ClientContact clientContact = (ClientContact) obj;
            return C41536l.m120484d(this.__typename, clientContact.__typename) && C41536l.m120484d(this.f100186id, clientContact.f100186id) && this.type == clientContact.type && C41536l.m120484d(this.preSelected, clientContact.preSelected) && C41536l.m120484d(this.financial, clientContact.financial) && C41536l.m120484d(this.contact, clientContact.contact);
        }

        public final String getContact() {
            return this.contact;
        }

        public final Boolean getFinancial() {
            return this.financial;
        }

        public final String getId() {
            return this.f100186id;
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
            String str = this.f100186id;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            UserContactType userContactType = this.type;
            int hashCode3 = (hashCode2 + (userContactType == null ? 0 : userContactType.hashCode())) * 31;
            Boolean bool = this.preSelected;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.financial;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.contact;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode5 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetClientInfoQuery$ClientContact$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "ClientContact(__typename=" + this.__typename + ", id=" + this.f100186id + ", type=" + this.type + ", preSelected=" + this.preSelected + ", financial=" + this.financial + ", contact=" + this.contact + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ClientContact(String str, String str2, UserContactType userContactType, Boolean bool, Boolean bool2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "UserContact" : str, str2, userContactType, bool, bool2, str3);
        }
    }

    public static final class GetClientInfo {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String address;
        private final List<ClientContact> clientContacts;
        private final String firstName;
        private final String imageURL;
        private final Boolean isDefaultImage;
        private final String lastName;
        private final Boolean profilePictureStatus;
        private final String username;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42631xc0322df7();
            }

            public final GetClientInfo invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetClientInfo.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetClientInfo(h, oVar.mo19025h(GetClientInfo.RESPONSE_FIELDS[1]), oVar.mo19025h(GetClientInfo.RESPONSE_FIELDS[2]), oVar.mo19025h(GetClientInfo.RESPONSE_FIELDS[3]), oVar.mo19025h(GetClientInfo.RESPONSE_FIELDS[4]), oVar.mo19025h(GetClientInfo.RESPONSE_FIELDS[5]), oVar.mo19027j(GetClientInfo.RESPONSE_FIELDS[6]), oVar.mo19027j(GetClientInfo.RESPONSE_FIELDS[7]), oVar.mo19026i(GetClientInfo.RESPONSE_FIELDS[8], C42633x90221252.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("address", "address", (Map) null, true, (List) null), aVar.mo22817h("firstName", "firstName", (Map) null, true, (List) null), aVar.mo22817h("lastName", "lastName", (Map) null, true, (List) null), aVar.mo22817h("username", "username", (Map) null, true, (List) null), aVar.mo22817h("imageURL", "imageURL", (Map) null, true, (List) null), aVar.mo22810a("profilePictureStatus", "profilePictureStatus", (Map) null, true, (List) null), aVar.mo22810a("isDefaultImage", "isDefaultImage", (Map) null, true, (List) null), aVar.mo22815f("clientContacts", "clientContacts", (Map) null, true, (List) null)};
        }

        public GetClientInfo(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, List<ClientContact> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.address = str2;
            this.firstName = str3;
            this.lastName = str4;
            this.username = str5;
            this.imageURL = str6;
            this.profilePictureStatus = bool;
            this.isDefaultImage = bool2;
            this.clientContacts = list;
        }

        public static /* synthetic */ GetClientInfo copy$default(GetClientInfo getClientInfo, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, List list, int i, Object obj) {
            GetClientInfo getClientInfo2 = getClientInfo;
            int i2 = i;
            return getClientInfo.copy((i2 & 1) != 0 ? getClientInfo2.__typename : str, (i2 & 2) != 0 ? getClientInfo2.address : str2, (i2 & 4) != 0 ? getClientInfo2.firstName : str3, (i2 & 8) != 0 ? getClientInfo2.lastName : str4, (i2 & 16) != 0 ? getClientInfo2.username : str5, (i2 & 32) != 0 ? getClientInfo2.imageURL : str6, (i2 & 64) != 0 ? getClientInfo2.profilePictureStatus : bool, (i2 & 128) != 0 ? getClientInfo2.isDefaultImage : bool2, (i2 & C11398b.f33139r) != 0 ? getClientInfo2.clientContacts : list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.address;
        }

        public final String component3() {
            return this.firstName;
        }

        public final String component4() {
            return this.lastName;
        }

        public final String component5() {
            return this.username;
        }

        public final String component6() {
            return this.imageURL;
        }

        public final Boolean component7() {
            return this.profilePictureStatus;
        }

        public final Boolean component8() {
            return this.isDefaultImage;
        }

        public final List<ClientContact> component9() {
            return this.clientContacts;
        }

        public final GetClientInfo copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, List<ClientContact> list) {
            C41536l.m120489i(str, "__typename");
            return new GetClientInfo(str, str2, str3, str4, str5, str6, bool, bool2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetClientInfo)) {
                return false;
            }
            GetClientInfo getClientInfo = (GetClientInfo) obj;
            return C41536l.m120484d(this.__typename, getClientInfo.__typename) && C41536l.m120484d(this.address, getClientInfo.address) && C41536l.m120484d(this.firstName, getClientInfo.firstName) && C41536l.m120484d(this.lastName, getClientInfo.lastName) && C41536l.m120484d(this.username, getClientInfo.username) && C41536l.m120484d(this.imageURL, getClientInfo.imageURL) && C41536l.m120484d(this.profilePictureStatus, getClientInfo.profilePictureStatus) && C41536l.m120484d(this.isDefaultImage, getClientInfo.isDefaultImage) && C41536l.m120484d(this.clientContacts, getClientInfo.clientContacts);
        }

        public final String getAddress() {
            return this.address;
        }

        public final List<ClientContact> getClientContacts() {
            return this.clientContacts;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getImageURL() {
            return this.imageURL;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final Boolean getProfilePictureStatus() {
            return this.profilePictureStatus;
        }

        public final String getUsername() {
            return this.username;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.address;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.firstName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lastName;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.username;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.imageURL;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.profilePictureStatus;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isDefaultImage;
            int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            List<ClientContact> list = this.clientContacts;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode8 + i;
        }

        public final Boolean isDefaultImage() {
            return this.isDefaultImage;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetClientInfoQuery$GetClientInfo$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "GetClientInfo(__typename=" + this.__typename + ", address=" + this.address + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", username=" + this.username + ", imageURL=" + this.imageURL + ", profilePictureStatus=" + this.profilePictureStatus + ", isDefaultImage=" + this.isDefaultImage + ", clientContacts=" + this.clientContacts + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetClientInfo(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ClientInfo" : str, str2, str3, str4, str5, str6, bool, bool2, list);
        }
    }
}
