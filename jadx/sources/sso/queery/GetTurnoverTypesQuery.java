package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import java.math.BigDecimal;
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
import sso.type.CustomType;

public final class GetTurnoverTypesQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "a6a7c0e11143846a3042f71612f33c60b9d5ac42a96f53dab401f3c635fb4c23";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetTurnoverTypesQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetTurnoverTypes {\n  registrationServices {\n    __typename\n    getTurnoverTypes {\n      __typename\n      id\n      code\n      description\n      type\n    }\n  }\n}");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetTurnoverTypesQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetTurnoverTypesQuery.QUERY_DOCUMENT;
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
                return new GetTurnoverTypesQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42768x67059c7f.INSTANCE));
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
            return new GetTurnoverTypesQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
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
        return new GetTurnoverTypesQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public C7836g.C7839c variables() {
        return C7836g.f22757a;
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
        private final List<GetTurnoverType> getTurnoverTypes;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42766x119e2616();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, oVar.mo19026i(RegistrationServices.RESPONSE_FIELDS[1], C42769x2cd81a47.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("getTurnoverTypes", "getTurnoverTypes", (Map) null, true, (List) null)};
        }

        public RegistrationServices(String str, List<GetTurnoverType> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getTurnoverTypes = list;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, List<GetTurnoverType> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                list = registrationServices.getTurnoverTypes;
            }
            return registrationServices.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<GetTurnoverType> component2() {
            return this.getTurnoverTypes;
        }

        public final RegistrationServices copy(String str, List<GetTurnoverType> list) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getTurnoverTypes, registrationServices.getTurnoverTypes);
        }

        public final List<GetTurnoverType> getGetTurnoverTypes() {
            return this.getTurnoverTypes;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<GetTurnoverType> list = this.getTurnoverTypes;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42767x6a001f78(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getTurnoverTypes=" + this.getTurnoverTypes + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, list);
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

    public static final class GetTurnoverType {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String code;
        private final String description;

        /* renamed from: id */
        private final BigDecimal f100188id;
        private final String type;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42764xcbf0f988();
            }

            public final GetTurnoverType invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetTurnoverType.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetTurnoverType(h, (BigDecimal) oVar.mo19019b((C7846k.C7848b) GetTurnoverType.RESPONSE_FIELDS[1]), oVar.mo19025h(GetTurnoverType.RESPONSE_FIELDS[2]), oVar.mo19025h(GetTurnoverType.RESPONSE_FIELDS[3]), oVar.mo19025h(GetTurnoverType.RESPONSE_FIELDS[4]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22811b("id", "id", (Map) null, true, CustomType.LONG, (List) null), aVar.mo22817h("code", "code", (Map) null, true, (List) null), aVar.mo22817h("description", "description", (Map) null, true, (List) null), aVar.mo22817h("type", "type", (Map) null, true, (List) null)};
        }

        public GetTurnoverType(String str, BigDecimal bigDecimal, String str2, String str3, String str4) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.f100188id = bigDecimal;
            this.code = str2;
            this.description = str3;
            this.type = str4;
        }

        public static /* synthetic */ GetTurnoverType copy$default(GetTurnoverType getTurnoverType, String str, BigDecimal bigDecimal, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getTurnoverType.__typename;
            }
            if ((i & 2) != 0) {
                bigDecimal = getTurnoverType.f100188id;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            if ((i & 4) != 0) {
                str2 = getTurnoverType.code;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = getTurnoverType.description;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = getTurnoverType.type;
            }
            return getTurnoverType.copy(str, bigDecimal2, str5, str6, str4);
        }

        public final String component1() {
            return this.__typename;
        }

        public final BigDecimal component2() {
            return this.f100188id;
        }

        public final String component3() {
            return this.code;
        }

        public final String component4() {
            return this.description;
        }

        public final String component5() {
            return this.type;
        }

        public final GetTurnoverType copy(String str, BigDecimal bigDecimal, String str2, String str3, String str4) {
            C41536l.m120489i(str, "__typename");
            return new GetTurnoverType(str, bigDecimal, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetTurnoverType)) {
                return false;
            }
            GetTurnoverType getTurnoverType = (GetTurnoverType) obj;
            return C41536l.m120484d(this.__typename, getTurnoverType.__typename) && C41536l.m120484d(this.f100188id, getTurnoverType.f100188id) && C41536l.m120484d(this.code, getTurnoverType.code) && C41536l.m120484d(this.description, getTurnoverType.description) && C41536l.m120484d(this.type, getTurnoverType.type);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDescription() {
            return this.description;
        }

        public final BigDecimal getId() {
            return this.f100188id;
        }

        public final String getType() {
            return this.type;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            BigDecimal bigDecimal = this.f100188id;
            int i = 0;
            int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str = this.code;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.type;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode4 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42765xc20af06a(this);
        }

        public String toString() {
            return "GetTurnoverType(__typename=" + this.__typename + ", id=" + this.f100188id + ", code=" + this.code + ", description=" + this.description + ", type=" + this.type + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetTurnoverType(String str, BigDecimal bigDecimal, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "TurnoverType" : str, bigDecimal, str2, str3, str4);
        }
    }
}
