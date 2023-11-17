package sso.queery;

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

public final class GetLegalAddressQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "a12989c010f9a091c2ecb740792b79b7f2714bf3b0620014ccba2e8a1783ab18";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetLegalAddressQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getLegalAddress($processReference: String!) {\n  registrationServices {\n    __typename\n    getLegalAddress(processReference: $processReference) {\n      __typename\n      country\n      countryDesc\n      region\n      regionDesc\n      addressLine\n    }\n  }\n}");
    private final String processReference;
    private final transient C7836g.C7839c variables = new GetLegalAddressQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetLegalAddressQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetLegalAddressQuery.QUERY_DOCUMENT;
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
                return new GetLegalAddressQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42667x93fe87be.INSTANCE));
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
            return new GetLegalAddressQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetLegalAddressQuery(String str) {
        C41536l.m120489i(str, "processReference");
        this.processReference = str;
    }

    public static /* synthetic */ GetLegalAddressQuery copy$default(GetLegalAddressQuery getLegalAddressQuery, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLegalAddressQuery.processReference;
        }
        return getLegalAddressQuery.copy(str);
    }

    public final String component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetLegalAddressQuery copy(String str) {
        C41536l.m120489i(str, "processReference");
        return new GetLegalAddressQuery(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetLegalAddressQuery) && C41536l.m120484d(this.processReference, ((GetLegalAddressQuery) obj).processReference);
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
        return new GetLegalAddressQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetLegalAddressQuery(processReference=" + this.processReference + ')';
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
        private final GetLegalAddress getLegalAddress;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42665x849071b7();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetLegalAddress) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42668x781aaa57.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getLegalAddress", "getLegalAddress", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public RegistrationServices(String str, GetLegalAddress getLegalAddress2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getLegalAddress = getLegalAddress2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetLegalAddress getLegalAddress2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getLegalAddress2 = registrationServices.getLegalAddress;
            }
            return registrationServices.copy(str, getLegalAddress2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetLegalAddress component2() {
            return this.getLegalAddress;
        }

        public final RegistrationServices copy(String str, GetLegalAddress getLegalAddress2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getLegalAddress2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getLegalAddress, registrationServices.getLegalAddress);
        }

        public final GetLegalAddress getGetLegalAddress() {
            return this.getLegalAddress;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetLegalAddress getLegalAddress2 = this.getLegalAddress;
            return hashCode + (getLegalAddress2 == null ? 0 : getLegalAddress2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42666xe4f7f7d9(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getLegalAddress=" + this.getLegalAddress + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetLegalAddress getLegalAddress2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getLegalAddress2);
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

    public static final class GetLegalAddress {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String addressLine;
        private final String country;
        private final String countryDesc;
        private final String region;
        private final String regionDesc;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42663xe3da15f7();
            }

            public final GetLegalAddress invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetLegalAddress.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetLegalAddress(h, oVar.mo19025h(GetLegalAddress.RESPONSE_FIELDS[1]), oVar.mo19025h(GetLegalAddress.RESPONSE_FIELDS[2]), oVar.mo19025h(GetLegalAddress.RESPONSE_FIELDS[3]), oVar.mo19025h(GetLegalAddress.RESPONSE_FIELDS[4]), oVar.mo19025h(GetLegalAddress.RESPONSE_FIELDS[5]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("country", "country", (Map) null, true, (List) null), aVar.mo22817h("countryDesc", "countryDesc", (Map) null, true, (List) null), aVar.mo22817h("region", "region", (Map) null, true, (List) null), aVar.mo22817h("regionDesc", "regionDesc", (Map) null, true, (List) null), aVar.mo22817h("addressLine", "addressLine", (Map) null, true, (List) null)};
        }

        public GetLegalAddress(String str, String str2, String str3, String str4, String str5, String str6) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.country = str2;
            this.countryDesc = str3;
            this.region = str4;
            this.regionDesc = str5;
            this.addressLine = str6;
        }

        public static /* synthetic */ GetLegalAddress copy$default(GetLegalAddress getLegalAddress, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getLegalAddress.__typename;
            }
            if ((i & 2) != 0) {
                str2 = getLegalAddress.country;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = getLegalAddress.countryDesc;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = getLegalAddress.region;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = getLegalAddress.regionDesc;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = getLegalAddress.addressLine;
            }
            return getLegalAddress.copy(str, str7, str8, str9, str10, str6);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.country;
        }

        public final String component3() {
            return this.countryDesc;
        }

        public final String component4() {
            return this.region;
        }

        public final String component5() {
            return this.regionDesc;
        }

        public final String component6() {
            return this.addressLine;
        }

        public final GetLegalAddress copy(String str, String str2, String str3, String str4, String str5, String str6) {
            C41536l.m120489i(str, "__typename");
            return new GetLegalAddress(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetLegalAddress)) {
                return false;
            }
            GetLegalAddress getLegalAddress = (GetLegalAddress) obj;
            return C41536l.m120484d(this.__typename, getLegalAddress.__typename) && C41536l.m120484d(this.country, getLegalAddress.country) && C41536l.m120484d(this.countryDesc, getLegalAddress.countryDesc) && C41536l.m120484d(this.region, getLegalAddress.region) && C41536l.m120484d(this.regionDesc, getLegalAddress.regionDesc) && C41536l.m120484d(this.addressLine, getLegalAddress.addressLine);
        }

        public final String getAddressLine() {
            return this.addressLine;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getCountryDesc() {
            return this.countryDesc;
        }

        public final String getRegion() {
            return this.region;
        }

        public final String getRegionDesc() {
            return this.regionDesc;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.country;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.countryDesc;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.region;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.regionDesc;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.addressLine;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode5 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42664x5461cc19(this);
        }

        public String toString() {
            return "GetLegalAddress(__typename=" + this.__typename + ", country=" + this.country + ", countryDesc=" + this.countryDesc + ", region=" + this.region + ", regionDesc=" + this.regionDesc + ", addressLine=" + this.addressLine + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetLegalAddress(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "LegalAddress" : str, str2, str3, str4, str5, str6);
        }
    }
}
