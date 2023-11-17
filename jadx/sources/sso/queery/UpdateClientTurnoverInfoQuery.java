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

public final class UpdateClientTurnoverInfoQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "99590092289889f6884d6ee93dee4bc1725fca441d7b216da8a304ab46ac08db";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new UpdateClientTurnoverInfoQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query updateClientTurnoverInfoQuery($operationReference: String!, $processReference: String!, $turnOverFrequency: String!, $turnoverVolume: String!) {\n  registrationServices {\n    __typename\n    updateClientTurnoverInfo(request: {operationReference: $operationReference, processReference: $processReference, turnOverFrequency: $turnOverFrequency, turnoverVolume: $turnoverVolume}) {\n      __typename\n      needToSetFinancialMail\n    }\n  }\n}");
    private final String operationReference;
    private final String processReference;
    private final String turnOverFrequency;
    private final String turnoverVolume;
    private final transient C7836g.C7839c variables = new UpdateClientTurnoverInfoQuery$variables$1(this);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return UpdateClientTurnoverInfoQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return UpdateClientTurnoverInfoQuery.QUERY_DOCUMENT;
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
                return new C42879xc82d6ca2();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42886xc185a8c0.INSTANCE));
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
            return new UpdateClientTurnoverInfoQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public UpdateClientTurnoverInfoQuery(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(str3, "turnOverFrequency");
        C41536l.m120489i(str4, "turnoverVolume");
        this.operationReference = str;
        this.processReference = str2;
        this.turnOverFrequency = str3;
        this.turnoverVolume = str4;
    }

    public static /* synthetic */ UpdateClientTurnoverInfoQuery copy$default(UpdateClientTurnoverInfoQuery updateClientTurnoverInfoQuery, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateClientTurnoverInfoQuery.operationReference;
        }
        if ((i & 2) != 0) {
            str2 = updateClientTurnoverInfoQuery.processReference;
        }
        if ((i & 4) != 0) {
            str3 = updateClientTurnoverInfoQuery.turnOverFrequency;
        }
        if ((i & 8) != 0) {
            str4 = updateClientTurnoverInfoQuery.turnoverVolume;
        }
        return updateClientTurnoverInfoQuery.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.operationReference;
    }

    public final String component2() {
        return this.processReference;
    }

    public final String component3() {
        return this.turnOverFrequency;
    }

    public final String component4() {
        return this.turnoverVolume;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final UpdateClientTurnoverInfoQuery copy(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationReference");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(str3, "turnOverFrequency");
        C41536l.m120489i(str4, "turnoverVolume");
        return new UpdateClientTurnoverInfoQuery(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateClientTurnoverInfoQuery)) {
            return false;
        }
        UpdateClientTurnoverInfoQuery updateClientTurnoverInfoQuery = (UpdateClientTurnoverInfoQuery) obj;
        return C41536l.m120484d(this.operationReference, updateClientTurnoverInfoQuery.operationReference) && C41536l.m120484d(this.processReference, updateClientTurnoverInfoQuery.processReference) && C41536l.m120484d(this.turnOverFrequency, updateClientTurnoverInfoQuery.turnOverFrequency) && C41536l.m120484d(this.turnoverVolume, updateClientTurnoverInfoQuery.turnoverVolume);
    }

    public final String getOperationReference() {
        return this.operationReference;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final String getTurnOverFrequency() {
        return this.turnOverFrequency;
    }

    public final String getTurnoverVolume() {
        return this.turnoverVolume;
    }

    public int hashCode() {
        return (((((this.operationReference.hashCode() * 31) + this.processReference.hashCode()) * 31) + this.turnOverFrequency.hashCode()) * 31) + this.turnoverVolume.hashCode();
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
        return new C42884xe1d97d49();
    }

    public String toString() {
        return "UpdateClientTurnoverInfoQuery(operationReference=" + this.operationReference + ", processReference=" + this.processReference + ", turnOverFrequency=" + this.turnOverFrequency + ", turnoverVolume=" + this.turnoverVolume + ')';
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
        private final UpdateClientTurnoverInfo updateClientTurnoverInfo;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42880xff1152f5();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (UpdateClientTurnoverInfo) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42887x7ec9e289.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("updateClientTurnoverInfo", "updateClientTurnoverInfo", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("turnOverFrequency", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "turnOverFrequency"))), C41233s.m119492a("turnoverVolume", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "turnoverVolume")))))), true, (List) null)};
        }

        public RegistrationServices(String str, UpdateClientTurnoverInfo updateClientTurnoverInfo2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.updateClientTurnoverInfo = updateClientTurnoverInfo2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, UpdateClientTurnoverInfo updateClientTurnoverInfo2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                updateClientTurnoverInfo2 = registrationServices.updateClientTurnoverInfo;
            }
            return registrationServices.copy(str, updateClientTurnoverInfo2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final UpdateClientTurnoverInfo component2() {
            return this.updateClientTurnoverInfo;
        }

        public final RegistrationServices copy(String str, UpdateClientTurnoverInfo updateClientTurnoverInfo2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, updateClientTurnoverInfo2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.updateClientTurnoverInfo, registrationServices.updateClientTurnoverInfo);
        }

        public final UpdateClientTurnoverInfo getUpdateClientTurnoverInfo() {
            return this.updateClientTurnoverInfo;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            UpdateClientTurnoverInfo updateClientTurnoverInfo2 = this.updateClientTurnoverInfo;
            return hashCode + (updateClientTurnoverInfo2 == null ? 0 : updateClientTurnoverInfo2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42881x5121f97(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", updateClientTurnoverInfo=" + this.updateClientTurnoverInfo + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, UpdateClientTurnoverInfo updateClientTurnoverInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, updateClientTurnoverInfo2);
        }
    }

    public static final class UpdateClientTurnoverInfo {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final Boolean needToSetFinancialMail;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42882xbb9ba1f9();
            }

            public final UpdateClientTurnoverInfo invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(UpdateClientTurnoverInfo.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new UpdateClientTurnoverInfo(h, oVar.mo19027j(UpdateClientTurnoverInfo.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22810a("needToSetFinancialMail", "needToSetFinancialMail", (Map) null, true, (List) null)};
        }

        public UpdateClientTurnoverInfo(String str, Boolean bool) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.needToSetFinancialMail = bool;
        }

        public static /* synthetic */ UpdateClientTurnoverInfo copy$default(UpdateClientTurnoverInfo updateClientTurnoverInfo, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateClientTurnoverInfo.__typename;
            }
            if ((i & 2) != 0) {
                bool = updateClientTurnoverInfo.needToSetFinancialMail;
            }
            return updateClientTurnoverInfo.copy(str, bool);
        }

        public final String component1() {
            return this.__typename;
        }

        public final Boolean component2() {
            return this.needToSetFinancialMail;
        }

        public final UpdateClientTurnoverInfo copy(String str, Boolean bool) {
            C41536l.m120489i(str, "__typename");
            return new UpdateClientTurnoverInfo(str, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateClientTurnoverInfo)) {
                return false;
            }
            UpdateClientTurnoverInfo updateClientTurnoverInfo = (UpdateClientTurnoverInfo) obj;
            return C41536l.m120484d(this.__typename, updateClientTurnoverInfo.__typename) && C41536l.m120484d(this.needToSetFinancialMail, updateClientTurnoverInfo.needToSetFinancialMail);
        }

        public final Boolean getNeedToSetFinancialMail() {
            return this.needToSetFinancialMail;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            Boolean bool = this.needToSetFinancialMail;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42883x4f35019b(this);
        }

        public String toString() {
            return "UpdateClientTurnoverInfo(__typename=" + this.__typename + ", needToSetFinancialMail=" + this.needToSetFinancialMail + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UpdateClientTurnoverInfo(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ClientRegistrationInfo" : str, bool);
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
