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

public final class GetCountriesQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "a2f767c9ab018946f1c27ebd3e2ad531928f14f655d92deb25e291a68ac1ddd9";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetCountriesQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getCountries($processReference: String!) {\n  registrationServices {\n    __typename\n    getCountries(processReference: $processReference) {\n      __typename\n      countries {\n        __typename\n        country\n        description\n      }\n    }\n  }\n}");
    private final String processReference;
    private final transient C7836g.C7839c variables = new GetCountriesQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetCountriesQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetCountriesQuery.QUERY_DOCUMENT;
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
                return new GetCountriesQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetCountriesQuery$Data$Companion$invoke$1$registrationServices$1.INSTANCE));
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
            return new GetCountriesQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetCountriesQuery(String str) {
        C41536l.m120489i(str, "processReference");
        this.processReference = str;
    }

    public static /* synthetic */ GetCountriesQuery copy$default(GetCountriesQuery getCountriesQuery, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCountriesQuery.processReference;
        }
        return getCountriesQuery.copy(str);
    }

    public final String component1() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetCountriesQuery copy(String str) {
        C41536l.m120489i(str, "processReference");
        return new GetCountriesQuery(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCountriesQuery) && C41536l.m120484d(this.processReference, ((GetCountriesQuery) obj).processReference);
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
        return new GetCountriesQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetCountriesQuery(processReference=" + this.processReference + ')';
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

    public static final class GetCountries {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final List<Country> countries;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42635x56ae5ee3();
            }

            public final GetCountries invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetCountries.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetCountries(h, oVar.mo19026i(GetCountries.RESPONSE_FIELDS[1], GetCountriesQuery$GetCountries$Companion$invoke$1$countries$1.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f("countries", "countries", (Map) null, true, (List) null)};
        }

        public GetCountries(String str, List<Country> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.countries = list;
        }

        public static /* synthetic */ GetCountries copy$default(GetCountries getCountries, String str, List<Country> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getCountries.__typename;
            }
            if ((i & 2) != 0) {
                list = getCountries.countries;
            }
            return getCountries.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<Country> component2() {
            return this.countries;
        }

        public final GetCountries copy(String str, List<Country> list) {
            C41536l.m120489i(str, "__typename");
            return new GetCountries(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetCountries)) {
                return false;
            }
            GetCountries getCountries = (GetCountries) obj;
            return C41536l.m120484d(this.__typename, getCountries.__typename) && C41536l.m120484d(this.countries, getCountries.countries);
        }

        public final List<Country> getCountries() {
            return this.countries;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<Country> list = this.countries;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetCountriesQuery$GetCountries$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "GetCountries(__typename=" + this.__typename + ", countries=" + this.countries + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetCountries(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Countries" : str, list);
        }
    }

    public static final class RegistrationServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final GetCountries getCountries;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42636x476a7e0a();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetCountries) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42639xd1e6e85f.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getCountries", "getCountries", C41342q0.m119922g(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))), true, (List) null)};
        }

        public RegistrationServices(String str, GetCountries getCountries2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getCountries = getCountries2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetCountries getCountries2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getCountries2 = registrationServices.getCountries;
            }
            return registrationServices.copy(str, getCountries2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetCountries component2() {
            return this.getCountries;
        }

        public final RegistrationServices copy(String str, GetCountries getCountries2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getCountries2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getCountries, registrationServices.getCountries);
        }

        public final GetCountries getGetCountries() {
            return this.getCountries;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetCountries getCountries2 = this.getCountries;
            return hashCode + (getCountries2 == null ? 0 : getCountries2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42637xa61a7e6c(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getCountries=" + this.getCountries + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetCountries getCountries2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getCountries2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class Country {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String country;
        private final String description;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetCountriesQuery$Country$Companion$Mapper$$inlined$invoke$1();
            }

            public final Country invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(Country.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new Country(h, oVar.mo19025h(Country.RESPONSE_FIELDS[1]), oVar.mo19025h(Country.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("country", "country", (Map) null, true, (List) null), aVar.mo22817h("description", "description", (Map) null, true, (List) null)};
        }

        public Country(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.country = str2;
            this.description = str3;
        }

        public static /* synthetic */ Country copy$default(Country country2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = country2.__typename;
            }
            if ((i & 2) != 0) {
                str2 = country2.country;
            }
            if ((i & 4) != 0) {
                str3 = country2.description;
            }
            return country2.copy(str, str2, str3);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.country;
        }

        public final String component3() {
            return this.description;
        }

        public final Country copy(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            return new Country(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Country)) {
                return false;
            }
            Country country2 = (Country) obj;
            return C41536l.m120484d(this.__typename, country2.__typename) && C41536l.m120484d(this.country, country2.country) && C41536l.m120484d(this.description, country2.description);
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.country;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetCountriesQuery$Country$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Country(__typename=" + this.__typename + ", country=" + this.country + ", description=" + this.description + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Country(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Country" : str, str2, str3);
        }
    }

    public C40681e composeRequestBody(boolean z, boolean z2, C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, z, z2, mVar);
    }

    public C7843j parse(C40681e eVar) {
        C41536l.m120489i(eVar, "byteString");
        return parse(eVar, C7851m.f22792c);
    }
}
