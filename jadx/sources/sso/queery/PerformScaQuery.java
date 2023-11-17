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
import sso.type.InputScaAuthElement;

public final class PerformScaQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "ceec0d6d42552943c3cf93228afc95e33251a66323a71b4d0893144c7ca6e0b3";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new PerformScaQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query performScaQuery($operationReference: String!, $deviceId: String!, $authElements: [InputScaAuthElement]!) {\n  scaServices {\n    __typename\n    performSca(request: {operationReference: $operationReference, deviceId: $deviceId, authElements: $authElements})\n  }\n}");
    private final List<InputScaAuthElement> authElements;
    private final String deviceId;
    private final String operationReference;
    private final transient C7836g.C7839c variables = new PerformScaQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return PerformScaQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return PerformScaQuery.QUERY_DOCUMENT;
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
                return new PerformScaQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((ScaServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], PerformScaQuery$Data$Companion$invoke$1$scaServices$1.INSTANCE));
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
            return new PerformScaQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(scaServices=" + this.scaServices + ')';
        }
    }

    public PerformScaQuery(String str, String str2, List<InputScaAuthElement> list) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(str2, "deviceId");
        C41536l.m120489i(list, "authElements");
        this.operationReference = str;
        this.deviceId = str2;
        this.authElements = list;
    }

    public static /* synthetic */ PerformScaQuery copy$default(PerformScaQuery performScaQuery, String str, String str2, List<InputScaAuthElement> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performScaQuery.operationReference;
        }
        if ((i & 2) != 0) {
            str2 = performScaQuery.deviceId;
        }
        if ((i & 4) != 0) {
            list = performScaQuery.authElements;
        }
        return performScaQuery.copy(str, str2, list);
    }

    public final String component1() {
        return this.operationReference;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final List<InputScaAuthElement> component3() {
        return this.authElements;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final PerformScaQuery copy(String str, String str2, List<InputScaAuthElement> list) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(str2, "deviceId");
        C41536l.m120489i(list, "authElements");
        return new PerformScaQuery(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformScaQuery)) {
            return false;
        }
        PerformScaQuery performScaQuery = (PerformScaQuery) obj;
        return C41536l.m120484d(this.operationReference, performScaQuery.operationReference) && C41536l.m120484d(this.deviceId, performScaQuery.deviceId) && C41536l.m120484d(this.authElements, performScaQuery.authElements);
    }

    public final List<InputScaAuthElement> getAuthElements() {
        return this.authElements;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getOperationReference() {
        return this.operationReference;
    }

    public int hashCode() {
        return (((this.operationReference.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.authElements.hashCode();
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
        return new PerformScaQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "PerformScaQuery(operationReference=" + this.operationReference + ", deviceId=" + this.deviceId + ", authElements=" + this.authElements + ')';
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
        private final String performSca;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new PerformScaQuery$ScaServices$Companion$Mapper$$inlined$invoke$1();
            }

            public final ScaServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(ScaServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new ScaServices(h, oVar.mo19025h(ScaServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("performSca", "performSca", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("deviceId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "deviceId"))), C41233s.m119492a("authElements", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "authElements")))))), true, (List) null)};
        }

        public ScaServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.performSca = str2;
        }

        public static /* synthetic */ ScaServices copy$default(ScaServices scaServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = scaServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = scaServices.performSca;
            }
            return scaServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.performSca;
        }

        public final ScaServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new ScaServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScaServices)) {
                return false;
            }
            ScaServices scaServices = (ScaServices) obj;
            return C41536l.m120484d(this.__typename, scaServices.__typename) && C41536l.m120484d(this.performSca, scaServices.performSca);
        }

        public final String getPerformSca() {
            return this.performSca;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.performSca;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new PerformScaQuery$ScaServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "ScaServices(__typename=" + this.__typename + ", performSca=" + this.performSca + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ScaServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ScaServices" : str, str2);
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
