package sso.queery;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41233s;
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

public final class VerifyOTPQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "ae78ed21a250fccae98fc121e940092e49df4c971ea4635aa7070e2b7e066b8f";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new VerifyOTPQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query verifyOTP($onteTimePassword:String!, $processReference:String!, $relatedCompanyClientKey:String) {\n  commonServices {\n    __typename\n    verifyOTP(request: {oneTimePassword: $onteTimePassword, processReference: $processReference, relatedCompanyClientKey: $relatedCompanyClientKey})\n  }\n}");
    private final String onteTimePassword;
    private final String processReference;
    private final C7833e relatedCompanyClientKey;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return VerifyOTPQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return VerifyOTPQuery.QUERY_DOCUMENT;
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
                return new VerifyOTPQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], VerifyOTPQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
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
            return new VerifyOTPQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
        }
    }

    public VerifyOTPQuery(String str, String str2, C7833e eVar) {
        C41536l.m120489i(str, "onteTimePassword");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(eVar, "relatedCompanyClientKey");
        this.onteTimePassword = str;
        this.processReference = str2;
        this.relatedCompanyClientKey = eVar;
        this.variables = new VerifyOTPQuery$variables$1(this);
    }

    public static /* synthetic */ VerifyOTPQuery copy$default(VerifyOTPQuery verifyOTPQuery, String str, String str2, C7833e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyOTPQuery.onteTimePassword;
        }
        if ((i & 2) != 0) {
            str2 = verifyOTPQuery.processReference;
        }
        if ((i & 4) != 0) {
            eVar = verifyOTPQuery.relatedCompanyClientKey;
        }
        return verifyOTPQuery.copy(str, str2, eVar);
    }

    public final String component1() {
        return this.onteTimePassword;
    }

    public final String component2() {
        return this.processReference;
    }

    public final C7833e component3() {
        return this.relatedCompanyClientKey;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final VerifyOTPQuery copy(String str, String str2, C7833e eVar) {
        C41536l.m120489i(str, "onteTimePassword");
        C41536l.m120489i(str2, "processReference");
        C41536l.m120489i(eVar, "relatedCompanyClientKey");
        return new VerifyOTPQuery(str, str2, eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyOTPQuery)) {
            return false;
        }
        VerifyOTPQuery verifyOTPQuery = (VerifyOTPQuery) obj;
        return C41536l.m120484d(this.onteTimePassword, verifyOTPQuery.onteTimePassword) && C41536l.m120484d(this.processReference, verifyOTPQuery.processReference) && C41536l.m120484d(this.relatedCompanyClientKey, verifyOTPQuery.relatedCompanyClientKey);
    }

    public final String getOnteTimePassword() {
        return this.onteTimePassword;
    }

    public final String getProcessReference() {
        return this.processReference;
    }

    public final C7833e getRelatedCompanyClientKey() {
        return this.relatedCompanyClientKey;
    }

    public int hashCode() {
        return (((this.onteTimePassword.hashCode() * 31) + this.processReference.hashCode()) * 31) + this.relatedCompanyClientKey.hashCode();
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
        return new VerifyOTPQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "VerifyOTPQuery(onteTimePassword=" + this.onteTimePassword + ", processReference=" + this.processReference + ", relatedCompanyClientKey=" + this.relatedCompanyClientKey + ')';
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

    public static final class CommonServices {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String verifyOTP;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new VerifyOTPQuery$CommonServices$Companion$Mapper$$inlined$invoke$1();
            }

            public final CommonServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(CommonServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new CommonServices(h, oVar.mo19025h(CommonServices.RESPONSE_FIELDS[1]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("verifyOTP", "verifyOTP", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("oneTimePassword", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "onteTimePassword"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("relatedCompanyClientKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "relatedCompanyClientKey")))))), true, (List) null)};
        }

        public CommonServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.verifyOTP = str2;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = commonServices.verifyOTP;
            }
            return commonServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.verifyOTP;
        }

        public final CommonServices copy(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            return new CommonServices(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonServices)) {
                return false;
            }
            CommonServices commonServices = (CommonServices) obj;
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.verifyOTP, commonServices.verifyOTP);
        }

        public final String getVerifyOTP() {
            return this.verifyOTP;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.verifyOTP;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new VerifyOTPQuery$CommonServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", verifyOTP=" + this.verifyOTP + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CommonServices(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CommonServices" : str, str2);
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyOTPQuery(String str, String str2, C7833e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar);
    }
}
