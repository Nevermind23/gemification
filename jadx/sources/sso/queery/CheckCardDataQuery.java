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

public final class CheckCardDataQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "5aa3d566499a235684ab28abb58f4df73980d333cc3a4f1c2a67a8ef7e6424f3";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new CheckCardDataQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query checkCardDataQuery($cardNo: String!, $cvv: String!, $expDate: String!, $processReference: String) {\n  registrationServices {\n    __typename\n    checkCardData(request: {cardNo: $cardNo, cvv: $cvv, expDate: $expDate, processReference: $processReference}) {\n      __typename\n      processReference\n      userId\n    }\n  }\n}");
    private final String cardNo;
    private final String cvv;
    private final String expDate;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return CheckCardDataQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return CheckCardDataQuery.QUERY_DOCUMENT;
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
                return new CheckCardDataQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42605xc9258fcf.INSTANCE));
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
            return new CheckCardDataQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public CheckCardDataQuery(String str, String str2, String str3, C7833e eVar) {
        C41536l.m120489i(str, "cardNo");
        C41536l.m120489i(str2, "cvv");
        C41536l.m120489i(str3, "expDate");
        C41536l.m120489i(eVar, "processReference");
        this.cardNo = str;
        this.cvv = str2;
        this.expDate = str3;
        this.processReference = eVar;
        this.variables = new CheckCardDataQuery$variables$1(this);
    }

    public static /* synthetic */ CheckCardDataQuery copy$default(CheckCardDataQuery checkCardDataQuery, String str, String str2, String str3, C7833e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkCardDataQuery.cardNo;
        }
        if ((i & 2) != 0) {
            str2 = checkCardDataQuery.cvv;
        }
        if ((i & 4) != 0) {
            str3 = checkCardDataQuery.expDate;
        }
        if ((i & 8) != 0) {
            eVar = checkCardDataQuery.processReference;
        }
        return checkCardDataQuery.copy(str, str2, str3, eVar);
    }

    public final String component1() {
        return this.cardNo;
    }

    public final String component2() {
        return this.cvv;
    }

    public final String component3() {
        return this.expDate;
    }

    public final C7833e component4() {
        return this.processReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final CheckCardDataQuery copy(String str, String str2, String str3, C7833e eVar) {
        C41536l.m120489i(str, "cardNo");
        C41536l.m120489i(str2, "cvv");
        C41536l.m120489i(str3, "expDate");
        C41536l.m120489i(eVar, "processReference");
        return new CheckCardDataQuery(str, str2, str3, eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckCardDataQuery)) {
            return false;
        }
        CheckCardDataQuery checkCardDataQuery = (CheckCardDataQuery) obj;
        return C41536l.m120484d(this.cardNo, checkCardDataQuery.cardNo) && C41536l.m120484d(this.cvv, checkCardDataQuery.cvv) && C41536l.m120484d(this.expDate, checkCardDataQuery.expDate) && C41536l.m120484d(this.processReference, checkCardDataQuery.processReference);
    }

    public final String getCardNo() {
        return this.cardNo;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getExpDate() {
        return this.expDate;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public int hashCode() {
        return (((((this.cardNo.hashCode() * 31) + this.cvv.hashCode()) * 31) + this.expDate.hashCode()) * 31) + this.processReference.hashCode();
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
        return new CheckCardDataQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "CheckCardDataQuery(cardNo=" + this.cardNo + ", cvv=" + this.cvv + ", expDate=" + this.expDate + ", processReference=" + this.processReference + ')';
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
        private final CheckCardData checkCardData;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42603xafb2ecc6();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (CheckCardData) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42606x88d91df7.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("checkCardData", "checkCardData", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("cardNo", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "cardNo"))), C41233s.m119492a("cvv", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "cvv"))), C41233s.m119492a("expDate", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "expDate"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference")))))), true, (List) null)};
        }

        public RegistrationServices(String str, CheckCardData checkCardData2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.checkCardData = checkCardData2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, CheckCardData checkCardData2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                checkCardData2 = registrationServices.checkCardData;
            }
            return registrationServices.copy(str, checkCardData2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final CheckCardData component2() {
            return this.checkCardData;
        }

        public final RegistrationServices copy(String str, CheckCardData checkCardData2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, checkCardData2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.checkCardData, registrationServices.checkCardData);
        }

        public final CheckCardData getCheckCardData() {
            return this.checkCardData;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            CheckCardData checkCardData2 = this.checkCardData;
            return hashCode + (checkCardData2 == null ? 0 : checkCardData2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42604x4e1baa28(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", checkCardData=" + this.checkCardData + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, CheckCardData checkCardData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, checkCardData2);
        }
    }

    public C7843j parse(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        return parse(dVar, C7851m.f22792c);
    }

    public static final class CheckCardData {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String processReference;
        private final BigDecimal userId;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42602xc2279cd7();
            }

            public final CheckCardData invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CheckCardData.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CheckCardData(h, oVar.mo19025h(CheckCardData.RESPONSE_FIELDS[1]), (BigDecimal) oVar.mo19019b((C7846k.C7848b) CheckCardData.RESPONSE_FIELDS[2]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("processReference", "processReference", (Map) null, true, (List) null), aVar.mo22811b("userId", "userId", (Map) null, true, CustomType.LONG, (List) null)};
        }

        public CheckCardData(String str, String str2, BigDecimal bigDecimal) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.processReference = str2;
            this.userId = bigDecimal;
        }

        public static /* synthetic */ CheckCardData copy$default(CheckCardData checkCardData, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkCardData.__typename;
            }
            if ((i & 2) != 0) {
                str2 = checkCardData.processReference;
            }
            if ((i & 4) != 0) {
                bigDecimal = checkCardData.userId;
            }
            return checkCardData.copy(str, str2, bigDecimal);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.processReference;
        }

        public final BigDecimal component3() {
            return this.userId;
        }

        public final CheckCardData copy(String str, String str2, BigDecimal bigDecimal) {
            C41536l.m120489i(str, "__typename");
            return new CheckCardData(str, str2, bigDecimal);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckCardData)) {
                return false;
            }
            CheckCardData checkCardData = (CheckCardData) obj;
            return C41536l.m120484d(this.__typename, checkCardData.__typename) && C41536l.m120484d(this.processReference, checkCardData.processReference) && C41536l.m120484d(this.userId, checkCardData.userId);
        }

        public final String getProcessReference() {
            return this.processReference;
        }

        public final BigDecimal getUserId() {
            return this.userId;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.processReference;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal = this.userId;
            if (bigDecimal != null) {
                i = bigDecimal.hashCode();
            }
            return hashCode2 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new CheckCardDataQuery$CheckCardData$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CheckCardData(__typename=" + this.__typename + ", processReference=" + this.processReference + ", userId=" + this.userId + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CheckCardData(String str, String str2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CheckCardResponse" : str, str2, bigDecimal);
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckCardDataQuery(String str, String str2, String str3, C7833e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? C7833e.f22754c.mo22767a() : eVar);
    }
}
