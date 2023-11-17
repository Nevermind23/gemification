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
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import sso.type.InputOperationProperty;

public final class CheckOperationQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "38b786c096d34d13777447d74ff02b3090959b2c99f033c7269d7deed2e34df5";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new CheckOperationQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query checkOperationQuery($operationId: String!, $serviceId: String!, $operationProperties: [InputOperationProperty]!) {\n  scaServices {\n    __typename\n    checkOperation(request: {operationId: $operationId, serviceId: $serviceId, operationProperties: $operationProperties}) {\n      __typename\n      operationReference\n      requireSCA\n      scaAuthCode\n    }\n  }\n}");
    private final String operationId;
    private final List<InputOperationProperty> operationProperties;
    private final String serviceId;
    private final transient C7836g.C7839c variables = new CheckOperationQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return CheckOperationQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return CheckOperationQuery.QUERY_DOCUMENT;
        }
    }

    public static final class Data implements C7836g.C7838b {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS = {C7846k.f22772g.mo22816g("scaServices", "scaServices", (Map) null, true, (List) null)};
        private final ScaServices scaServices;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new CheckOperationQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((ScaServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], CheckOperationQuery$Data$Companion$invoke$1$scaServices$1.INSTANCE));
            }
        }

        public Data(ScaServices scaServices2) {
            this.scaServices = scaServices2;
        }

        public static /* synthetic */ Data copy$default(Data data, ScaServices scaServices2, int i, Object obj) {
            if ((i & 1) != 0) {
                scaServices2 = data.scaServices;
            }
            return data.copy(scaServices2);
        }

        public final ScaServices component1() {
            return this.scaServices;
        }

        public final Data copy(ScaServices scaServices2) {
            return new Data(scaServices2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && C41536l.m120484d(this.scaServices, ((Data) obj).scaServices);
        }

        public final ScaServices getScaServices() {
            return this.scaServices;
        }

        public int hashCode() {
            ScaServices scaServices2 = this.scaServices;
            if (scaServices2 == null) {
                return 0;
            }
            return scaServices2.hashCode();
        }

        public C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new CheckOperationQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(scaServices=" + this.scaServices + ')';
        }
    }

    public CheckOperationQuery(String str, String str2, List<InputOperationProperty> list) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(list, "operationProperties");
        this.operationId = str;
        this.serviceId = str2;
        this.operationProperties = list;
    }

    public static /* synthetic */ CheckOperationQuery copy$default(CheckOperationQuery checkOperationQuery, String str, String str2, List<InputOperationProperty> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkOperationQuery.operationId;
        }
        if ((i & 2) != 0) {
            str2 = checkOperationQuery.serviceId;
        }
        if ((i & 4) != 0) {
            list = checkOperationQuery.operationProperties;
        }
        return checkOperationQuery.copy(str, str2, list);
    }

    public final String component1() {
        return this.operationId;
    }

    public final String component2() {
        return this.serviceId;
    }

    public final List<InputOperationProperty> component3() {
        return this.operationProperties;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final CheckOperationQuery copy(String str, String str2, List<InputOperationProperty> list) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(list, "operationProperties");
        return new CheckOperationQuery(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckOperationQuery)) {
            return false;
        }
        CheckOperationQuery checkOperationQuery = (CheckOperationQuery) obj;
        return C41536l.m120484d(this.operationId, checkOperationQuery.operationId) && C41536l.m120484d(this.serviceId, checkOperationQuery.serviceId) && C41536l.m120484d(this.operationProperties, checkOperationQuery.operationProperties);
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public final List<InputOperationProperty> getOperationProperties() {
        return this.operationProperties;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        return (((this.operationId.hashCode() * 31) + this.serviceId.hashCode()) * 31) + this.operationProperties.hashCode();
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
        return new CheckOperationQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "CheckOperationQuery(operationId=" + this.operationId + ", serviceId=" + this.serviceId + ", operationProperties=" + this.operationProperties + ')';
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

    public static final class ScaServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final CheckOperation checkOperation;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42608xfd6462a7();
            }

            public final ScaServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(ScaServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new ScaServices(h, (CheckOperation) oVar.mo19023f(ScaServices.RESPONSE_FIELDS[1], C42609x8a91f363.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("checkOperation", "checkOperation", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("operationId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationId"))), C41233s.m119492a(IRetrofitService.SERVICE_ID, C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", IRetrofitService.SERVICE_ID))), C41233s.m119492a("operationProperties", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationProperties")))))), true, (List) null)};
        }

        public ScaServices(String str, CheckOperation checkOperation2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.checkOperation = checkOperation2;
        }

        public static /* synthetic */ ScaServices copy$default(ScaServices scaServices, String str, CheckOperation checkOperation2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scaServices.__typename;
            }
            if ((i & 2) != 0) {
                checkOperation2 = scaServices.checkOperation;
            }
            return scaServices.copy(str, checkOperation2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final CheckOperation component2() {
            return this.checkOperation;
        }

        public final ScaServices copy(String str, CheckOperation checkOperation2) {
            C41536l.m120489i(str, "__typename");
            return new ScaServices(str, checkOperation2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScaServices)) {
                return false;
            }
            ScaServices scaServices = (ScaServices) obj;
            return C41536l.m120484d(this.__typename, scaServices.__typename) && C41536l.m120484d(this.checkOperation, scaServices.checkOperation);
        }

        public final CheckOperation getCheckOperation() {
            return this.checkOperation;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            CheckOperation checkOperation2 = this.checkOperation;
            return hashCode + (checkOperation2 == null ? 0 : checkOperation2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new CheckOperationQuery$ScaServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "ScaServices(__typename=" + this.__typename + ", checkOperation=" + this.checkOperation + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ScaServices(String str, CheckOperation checkOperation2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ScaServices" : str, checkOperation2);
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

    public static final class CheckOperation {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String operationReference;
        private final Boolean requireSCA;
        private final String scaAuthCode;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42607x378b9e21();
            }

            public final CheckOperation invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CheckOperation.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CheckOperation(h, oVar.mo19025h(CheckOperation.RESPONSE_FIELDS[1]), oVar.mo19027j(CheckOperation.RESPONSE_FIELDS[2]), oVar.mo19025h(CheckOperation.RESPONSE_FIELDS[3]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("operationReference", "operationReference", (Map) null, true, (List) null), aVar.mo22810a("requireSCA", "requireSCA", (Map) null, true, (List) null), aVar.mo22817h("scaAuthCode", "scaAuthCode", (Map) null, true, (List) null)};
        }

        public CheckOperation(String str, String str2, Boolean bool, String str3) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.operationReference = str2;
            this.requireSCA = bool;
            this.scaAuthCode = str3;
        }

        public static /* synthetic */ CheckOperation copy$default(CheckOperation checkOperation, String str, String str2, Boolean bool, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkOperation.__typename;
            }
            if ((i & 2) != 0) {
                str2 = checkOperation.operationReference;
            }
            if ((i & 4) != 0) {
                bool = checkOperation.requireSCA;
            }
            if ((i & 8) != 0) {
                str3 = checkOperation.scaAuthCode;
            }
            return checkOperation.copy(str, str2, bool, str3);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.operationReference;
        }

        public final Boolean component3() {
            return this.requireSCA;
        }

        public final String component4() {
            return this.scaAuthCode;
        }

        public final CheckOperation copy(String str, String str2, Boolean bool, String str3) {
            C41536l.m120489i(str, "__typename");
            return new CheckOperation(str, str2, bool, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckOperation)) {
                return false;
            }
            CheckOperation checkOperation = (CheckOperation) obj;
            return C41536l.m120484d(this.__typename, checkOperation.__typename) && C41536l.m120484d(this.operationReference, checkOperation.operationReference) && C41536l.m120484d(this.requireSCA, checkOperation.requireSCA) && C41536l.m120484d(this.scaAuthCode, checkOperation.scaAuthCode);
        }

        public final String getOperationReference() {
            return this.operationReference;
        }

        public final Boolean getRequireSCA() {
            return this.requireSCA;
        }

        public final String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.operationReference;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.requireSCA;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.scaAuthCode;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode3 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new CheckOperationQuery$CheckOperation$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CheckOperation(__typename=" + this.__typename + ", operationReference=" + this.operationReference + ", requireSCA=" + this.requireSCA + ", scaAuthCode=" + this.scaAuthCode + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CheckOperation(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ScaVerificationResponse" : str, str2, bool, str3);
        }
    }
}
