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

public final class AddActualAddressQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "9175196c992f155f46c2dd14d0eca0293ed41525d25d217cc16df4724cd8e51b";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new AddActualAddressQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query addActualAddress($processReference: String!, $country: String!, $region: String!, $addressLine: String!, $copyToHome: String!) {\n  registrationServices {\n    __typename\n    addActualAddress(request: {processReference: $processReference, country: $country, region: $region, addressLine: $addressLine, copyToHome: $copyToHome})\n  }\n}");
    private final String addressLine;
    private final String copyToHome;
    private final String country;
    private final String processReference;
    private final String region;
    private final transient C7836g.C7839c variables = new AddActualAddressQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return AddActualAddressQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return AddActualAddressQuery.QUERY_DOCUMENT;
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
                return new AddActualAddressQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42580x50c63f2.INSTANCE));
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
            return new AddActualAddressQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public AddActualAddressQuery(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "country");
        C41536l.m120489i(str3, "region");
        C41536l.m120489i(str4, "addressLine");
        C41536l.m120489i(str5, "copyToHome");
        this.processReference = str;
        this.country = str2;
        this.region = str3;
        this.addressLine = str4;
        this.copyToHome = str5;
    }

    public static /* synthetic */ AddActualAddressQuery copy$default(AddActualAddressQuery addActualAddressQuery, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addActualAddressQuery.processReference;
        }
        if ((i & 2) != 0) {
            str2 = addActualAddressQuery.country;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = addActualAddressQuery.region;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = addActualAddressQuery.addressLine;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = addActualAddressQuery.copyToHome;
        }
        return addActualAddressQuery.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.processReference;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.region;
    }

    public final String component4() {
        return this.addressLine;
    }

    public final String component5() {
        return this.copyToHome;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final AddActualAddressQuery copy(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "processReference");
        C41536l.m120489i(str2, "country");
        C41536l.m120489i(str3, "region");
        C41536l.m120489i(str4, "addressLine");
        C41536l.m120489i(str5, "copyToHome");
        return new AddActualAddressQuery(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddActualAddressQuery)) {
            return false;
        }
        AddActualAddressQuery addActualAddressQuery = (AddActualAddressQuery) obj;
        return C41536l.m120484d(this.processReference, addActualAddressQuery.processReference) && C41536l.m120484d(this.country, addActualAddressQuery.country) && C41536l.m120484d(this.region, addActualAddressQuery.region) && C41536l.m120484d(this.addressLine, addActualAddressQuery.addressLine) && C41536l.m120484d(this.copyToHome, addActualAddressQuery.copyToHome);
    }

    public final String getAddressLine() {
        return this.addressLine;
    }

    public final String getCopyToHome() {
        return this.copyToHome;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((((((this.processReference.hashCode() * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31) + this.addressLine.hashCode()) * 31) + this.copyToHome.hashCode();
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
        return new AddActualAddressQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "AddActualAddressQuery(processReference=" + this.processReference + ", country=" + this.country + ", region=" + this.region + ", addressLine=" + this.addressLine + ", copyToHome=" + this.copyToHome + ')';
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
        private final String addActualAddress;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42578xae451003();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("addActualAddress", "addActualAddress", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("country", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "country"))), C41233s.m119492a("region", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "region"))), C41233s.m119492a("addressLine", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "addressLine"))), C41233s.m119492a("copyToHome", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "copyToHome")))))), true, (List) null)};
        }

        public RegistrationServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.addActualAddress = str2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = registrationServices.addActualAddress;
            }
            return registrationServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.addActualAddress;
        }

        public final RegistrationServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.addActualAddress, registrationServices.addActualAddress);
        }

        public final String getAddActualAddress() {
            return this.addActualAddress;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.addActualAddress;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42579x20e43f25(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", addActualAddress=" + this.addActualAddress + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, str2);
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
}
