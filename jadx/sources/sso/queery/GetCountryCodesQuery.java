package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
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

public final class GetCountryCodesQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "8487783eaa7e61458cecfddabc3e919d444b13826b2484c7920f459c709c1dd2";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetCountryCodesQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query GetCountryCodes {\n  commonServices {\n    __typename\n    getCountryCodes {\n      __typename\n      callingCode\n      ccy\n      code\n      code2\n      currentCountry\n      name\n      order\n    }\n  }\n}");

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetCountryCodesQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetCountryCodesQuery.QUERY_DOCUMENT;
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
                return new GetCountryCodesQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetCountryCodesQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
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
            return new GetCountryCodesQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
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
        return new GetCountryCodesQuery$responseFieldMapper$$inlined$invoke$1();
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

    public static final class CommonServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final List<GetCountryCode> getCountryCodes;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42640xfcb738b0();
            }

            public final CommonServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CommonServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CommonServices(h, oVar.mo19026i(CommonServices.RESPONSE_FIELDS[1], C42642x8f4eb505.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("getCountryCodes", "getCountryCodes", (Map) null, true, (List) null)};
        }

        public CommonServices(String str, List<GetCountryCode> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getCountryCodes = list;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, List<GetCountryCode> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                list = commonServices.getCountryCodes;
            }
            return commonServices.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<GetCountryCode> component2() {
            return this.getCountryCodes;
        }

        public final CommonServices copy(String str, List<GetCountryCode> list) {
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
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.getCountryCodes, commonServices.getCountryCodes);
        }

        public final List<GetCountryCode> getGetCountryCodes() {
            return this.getCountryCodes;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<GetCountryCode> list = this.getCountryCodes;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetCountryCodesQuery$CommonServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", getCountryCodes=" + this.getCountryCodes + ')';
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

    public static final class GetCountryCode {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String callingCode;
        private final String ccy;
        private final String code;
        private final String code2;
        private final Boolean currentCountry;
        private final String name;
        private final String order;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42641xc2f0582c();
            }

            public final GetCountryCode invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetCountryCode.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetCountryCode(h, oVar.mo19025h(GetCountryCode.RESPONSE_FIELDS[1]), oVar.mo19025h(GetCountryCode.RESPONSE_FIELDS[2]), oVar.mo19025h(GetCountryCode.RESPONSE_FIELDS[3]), oVar.mo19025h(GetCountryCode.RESPONSE_FIELDS[4]), oVar.mo19027j(GetCountryCode.RESPONSE_FIELDS[5]), oVar.mo19025h(GetCountryCode.RESPONSE_FIELDS[6]), oVar.mo19025h(GetCountryCode.RESPONSE_FIELDS[7]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("callingCode", "callingCode", (Map) null, true, (List) null), aVar.mo22817h("ccy", "ccy", (Map) null, true, (List) null), aVar.mo22817h("code", "code", (Map) null, true, (List) null), aVar.mo22817h("code2", "code2", (Map) null, true, (List) null), aVar.mo22810a("currentCountry", "currentCountry", (Map) null, true, (List) null), aVar.mo22817h("name", "name", (Map) null, true, (List) null), aVar.mo22817h("order", "order", (Map) null, true, (List) null)};
        }

        public GetCountryCode(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.callingCode = str2;
            this.ccy = str3;
            this.code = str4;
            this.code2 = str5;
            this.currentCountry = bool;
            this.name = str6;
            this.order = str7;
        }

        public static /* synthetic */ GetCountryCode copy$default(GetCountryCode getCountryCode, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, int i, Object obj) {
            GetCountryCode getCountryCode2 = getCountryCode;
            int i2 = i;
            return getCountryCode.copy((i2 & 1) != 0 ? getCountryCode2.__typename : str, (i2 & 2) != 0 ? getCountryCode2.callingCode : str2, (i2 & 4) != 0 ? getCountryCode2.ccy : str3, (i2 & 8) != 0 ? getCountryCode2.code : str4, (i2 & 16) != 0 ? getCountryCode2.code2 : str5, (i2 & 32) != 0 ? getCountryCode2.currentCountry : bool, (i2 & 64) != 0 ? getCountryCode2.name : str6, (i2 & 128) != 0 ? getCountryCode2.order : str7);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.callingCode;
        }

        public final String component3() {
            return this.ccy;
        }

        public final String component4() {
            return this.code;
        }

        public final String component5() {
            return this.code2;
        }

        public final Boolean component6() {
            return this.currentCountry;
        }

        public final String component7() {
            return this.name;
        }

        public final String component8() {
            return this.order;
        }

        public final GetCountryCode copy(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
            C41536l.m120489i(str, "__typename");
            return new GetCountryCode(str, str2, str3, str4, str5, bool, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetCountryCode)) {
                return false;
            }
            GetCountryCode getCountryCode = (GetCountryCode) obj;
            return C41536l.m120484d(this.__typename, getCountryCode.__typename) && C41536l.m120484d(this.callingCode, getCountryCode.callingCode) && C41536l.m120484d(this.ccy, getCountryCode.ccy) && C41536l.m120484d(this.code, getCountryCode.code) && C41536l.m120484d(this.code2, getCountryCode.code2) && C41536l.m120484d(this.currentCountry, getCountryCode.currentCountry) && C41536l.m120484d(this.name, getCountryCode.name) && C41536l.m120484d(this.order, getCountryCode.order);
        }

        public final String getCallingCode() {
            return this.callingCode;
        }

        public final String getCcy() {
            return this.ccy;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getCode2() {
            return this.code2;
        }

        public final Boolean getCurrentCountry() {
            return this.currentCountry;
        }

        public final String getName() {
            return this.name;
        }

        public final String getOrder() {
            return this.order;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.callingCode;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.ccy;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.code2;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.currentCountry;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str5 = this.name;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.order;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode7 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetCountryCodesQuery$GetCountryCode$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "GetCountryCode(__typename=" + this.__typename + ", callingCode=" + this.callingCode + ", ccy=" + this.ccy + ", code=" + this.code + ", code2=" + this.code2 + ", currentCountry=" + this.currentCountry + ", name=" + this.name + ", order=" + this.order + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetCountryCode(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CountryCode" : str, str2, str3, str4, str5, bool, str6, str7);
        }
    }
}
