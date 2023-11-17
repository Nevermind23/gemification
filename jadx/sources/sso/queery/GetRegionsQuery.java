package sso.queery;

import com.salesforce.marketingcloud.storage.p385db.C11771j;
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

public final class GetRegionsQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "15507db72f77601619cc1664450c87059bc35922dbf427a7b2659274d543bc45";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new GetRegionsQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query getRegions($processReference: String!, $country: String!) {\n  registrationServices {\n    __typename\n    getRegions(processReference: $processReference, country: $country) {\n      __typename\n      regions {\n        __typename\n        region\n        description\n      }\n    }\n  }\n}");
    private final String country;
    private final String processReference;
    private final transient C7836g.C7839c variables = new GetRegionsQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return GetRegionsQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return GetRegionsQuery.QUERY_DOCUMENT;
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
                return new GetRegionsQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], GetRegionsQuery$Data$Companion$invoke$1$registrationServices$1.INSTANCE));
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
            return new GetRegionsQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public GetRegionsQuery(String str, String str2) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "country");
        this.processReference = str;
        this.country = str2;
    }

    public static /* synthetic */ GetRegionsQuery copy$default(GetRegionsQuery getRegionsQuery, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRegionsQuery.processReference;
        }
        if ((i & 2) != 0) {
            str2 = getRegionsQuery.country;
        }
        return getRegionsQuery.copy(str, str2);
    }

    public final String component1() {
        return this.processReference;
    }

    public final String component2() {
        return this.country;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final GetRegionsQuery copy(String str, String str2) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "country");
        return new GetRegionsQuery(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRegionsQuery)) {
            return false;
        }
        GetRegionsQuery getRegionsQuery = (GetRegionsQuery) obj;
        return C41536l.m120484d(this.processReference, getRegionsQuery.processReference) && C41536l.m120484d(this.country, getRegionsQuery.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (this.processReference.hashCode() * 31) + this.country.hashCode();
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
        return new GetRegionsQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "GetRegionsQuery(processReference=" + this.processReference + ", country=" + this.country + ')';
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

    public static final class GetRegions {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final List<Region> regions;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetRegionsQuery$GetRegions$Companion$Mapper$$inlined$invoke$1();
            }

            public final GetRegions invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(GetRegions.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new GetRegions(h, oVar.mo19026i(GetRegions.RESPONSE_FIELDS[1], GetRegionsQuery$GetRegions$Companion$invoke$1$regions$1.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22815f(C11771j.f34163e, C11771j.f34163e, (Map) null, true, (List) null)};
        }

        public GetRegions(String str, List<Region> list) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.regions = list;
        }

        public static /* synthetic */ GetRegions copy$default(GetRegions getRegions, String str, List<Region> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getRegions.__typename;
            }
            if ((i & 2) != 0) {
                list = getRegions.regions;
            }
            return getRegions.copy(str, list);
        }

        public final String component1() {
            return this.__typename;
        }

        public final List<Region> component2() {
            return this.regions;
        }

        public final GetRegions copy(String str, List<Region> list) {
            C41536l.m120489i(str, "__typename");
            return new GetRegions(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetRegions)) {
                return false;
            }
            GetRegions getRegions = (GetRegions) obj;
            return C41536l.m120484d(this.__typename, getRegions.__typename) && C41536l.m120484d(this.regions, getRegions.regions);
        }

        public final List<Region> getRegions() {
            return this.regions;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            List<Region> list = this.regions;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new GetRegionsQuery$GetRegions$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "GetRegions(__typename=" + this.__typename + ", regions=" + this.regions + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetRegions(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Regions" : str, list);
        }
    }

    public static final class RegistrationServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final GetRegions getRegions;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42716x4aaff21f();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (GetRegions) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42719xd914da75.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("getRegions", "getRegions", C41344r0.m119931m(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("country", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "country")))), true, (List) null)};
        }

        public RegistrationServices(String str, GetRegions getRegions2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.getRegions = getRegions2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, GetRegions getRegions2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                getRegions2 = registrationServices.getRegions;
            }
            return registrationServices.copy(str, getRegions2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final GetRegions component2() {
            return this.getRegions;
        }

        public final RegistrationServices copy(String str, GetRegions getRegions2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, getRegions2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.getRegions, registrationServices.getRegions);
        }

        public final GetRegions getGetRegions() {
            return this.getRegions;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            GetRegions getRegions2 = this.getRegions;
            return hashCode + (getRegions2 == null ? 0 : getRegions2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42717x9739e641(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", getRegions=" + this.getRegions + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, GetRegions getRegions2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, getRegions2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class Region {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String description;
        private final String region;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new GetRegionsQuery$Region$Companion$Mapper$$inlined$invoke$1();
            }

            public final Region invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(Region.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new Region(h, oVar.mo19025h(Region.RESPONSE_FIELDS[1]), oVar.mo19025h(Region.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("region", "region", (Map) null, true, (List) null), aVar.mo22817h("description", "description", (Map) null, true, (List) null)};
        }

        public Region(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.region = str2;
            this.description = str3;
        }

        public static /* synthetic */ Region copy$default(Region region2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = region2.__typename;
            }
            if ((i & 2) != 0) {
                str2 = region2.region;
            }
            if ((i & 4) != 0) {
                str3 = region2.description;
            }
            return region2.copy(str, str2, str3);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.region;
        }

        public final String component3() {
            return this.description;
        }

        public final Region copy(String str, String str2, String str3) {
            C41536l.m120489i(str, "__typename");
            return new Region(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Region)) {
                return false;
            }
            Region region2 = (Region) obj;
            return C41536l.m120484d(this.__typename, region2.__typename) && C41536l.m120484d(this.region, region2.region) && C41536l.m120484d(this.description, region2.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getRegion() {
            return this.region;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.region;
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
            return new GetRegionsQuery$Region$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Region(__typename=" + this.__typename + ", region=" + this.region + ", description=" + this.description + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Region(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Region" : str, str2, str3);
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
