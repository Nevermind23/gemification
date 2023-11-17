package sso.queery;

import com.salesforce.marketingcloud.C11398b;
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

public final class ValidateOnboardingDataQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "1bdefb430bf481de3ed177e49d81755e3aa0151de3c1948cec363576db1ed74f";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new ValidateOnboardingDataQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query ValidateOnboardingDataQuery($xDeviceKey: String!, $xUserAgent: String!, $accessToken: String!, $documentBackAuditTrailImages: [String], $documentFrontAuditTrailImages: [String], $documentScan: String, $faceAuditTrailImages: [String], $faceData: String, $faceLowQualityAuditTrailImages: [String], $processReference: String, $operationReference: String) {\n  registrationServices {\n    __typename\n    validateOnboardingData(request: {XDeviceKey: $xDeviceKey, XUserAgent: $xUserAgent, accessToken: $accessToken, operationReference: $operationReference, processReference: $processReference, documentBackAuditTrailImages: $documentBackAuditTrailImages, documentFrontAuditTrailImages: $documentFrontAuditTrailImages, documentScan: $documentScan, faceAuditTrailImages: $faceAuditTrailImages, faceData: $faceData, faceLowQualityAuditTrailImages: $faceLowQualityAuditTrailImages}) {\n      __typename\n      customerId\n      customerType\n      errorCode\n      errorKey\n      clientHasActualAddress\n      scanResultBlob\n    }\n  }\n}");
    private final String accessToken;
    private final C7833e documentBackAuditTrailImages;
    private final C7833e documentFrontAuditTrailImages;
    private final C7833e documentScan;
    private final C7833e faceAuditTrailImages;
    private final C7833e faceData;
    private final C7833e faceLowQualityAuditTrailImages;
    private final C7833e operationReference;
    private final C7833e processReference;
    private final transient C7836g.C7839c variables;
    private final String xDeviceKey;
    private final String xUserAgent;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return ValidateOnboardingDataQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return ValidateOnboardingDataQuery.QUERY_DOCUMENT;
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
                return new C42902x192025ba();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((RegistrationServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], C42913x52dd04a8.INSTANCE));
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
            return new ValidateOnboardingDataQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(registrationServices=" + this.registrationServices + ')';
        }
    }

    public ValidateOnboardingDataQuery(String str, String str2, String str3, C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, C7833e eVar8) {
        C41536l.m120489i(str, "xDeviceKey");
        C41536l.m120489i(str2, "xUserAgent");
        C41536l.m120489i(str3, "accessToken");
        C41536l.m120489i(eVar, "documentBackAuditTrailImages");
        C41536l.m120489i(eVar2, "documentFrontAuditTrailImages");
        C41536l.m120489i(eVar3, "documentScan");
        C41536l.m120489i(eVar4, "faceAuditTrailImages");
        C41536l.m120489i(eVar5, "faceData");
        C41536l.m120489i(eVar6, "faceLowQualityAuditTrailImages");
        C41536l.m120489i(eVar7, "processReference");
        C41536l.m120489i(eVar8, "operationReference");
        this.xDeviceKey = str;
        this.xUserAgent = str2;
        this.accessToken = str3;
        this.documentBackAuditTrailImages = eVar;
        this.documentFrontAuditTrailImages = eVar2;
        this.documentScan = eVar3;
        this.faceAuditTrailImages = eVar4;
        this.faceData = eVar5;
        this.faceLowQualityAuditTrailImages = eVar6;
        this.processReference = eVar7;
        this.operationReference = eVar8;
        this.variables = new ValidateOnboardingDataQuery$variables$1(this);
    }

    public static /* synthetic */ ValidateOnboardingDataQuery copy$default(ValidateOnboardingDataQuery validateOnboardingDataQuery, String str, String str2, String str3, C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, C7833e eVar8, int i, Object obj) {
        ValidateOnboardingDataQuery validateOnboardingDataQuery2 = validateOnboardingDataQuery;
        int i2 = i;
        return validateOnboardingDataQuery.copy((i2 & 1) != 0 ? validateOnboardingDataQuery2.xDeviceKey : str, (i2 & 2) != 0 ? validateOnboardingDataQuery2.xUserAgent : str2, (i2 & 4) != 0 ? validateOnboardingDataQuery2.accessToken : str3, (i2 & 8) != 0 ? validateOnboardingDataQuery2.documentBackAuditTrailImages : eVar, (i2 & 16) != 0 ? validateOnboardingDataQuery2.documentFrontAuditTrailImages : eVar2, (i2 & 32) != 0 ? validateOnboardingDataQuery2.documentScan : eVar3, (i2 & 64) != 0 ? validateOnboardingDataQuery2.faceAuditTrailImages : eVar4, (i2 & 128) != 0 ? validateOnboardingDataQuery2.faceData : eVar5, (i2 & C11398b.f33139r) != 0 ? validateOnboardingDataQuery2.faceLowQualityAuditTrailImages : eVar6, (i2 & C11398b.f33140s) != 0 ? validateOnboardingDataQuery2.processReference : eVar7, (i2 & C11398b.f33141t) != 0 ? validateOnboardingDataQuery2.operationReference : eVar8);
    }

    public final String component1() {
        return this.xDeviceKey;
    }

    public final C7833e component10() {
        return this.processReference;
    }

    public final C7833e component11() {
        return this.operationReference;
    }

    public final String component2() {
        return this.xUserAgent;
    }

    public final String component3() {
        return this.accessToken;
    }

    public final C7833e component4() {
        return this.documentBackAuditTrailImages;
    }

    public final C7833e component5() {
        return this.documentFrontAuditTrailImages;
    }

    public final C7833e component6() {
        return this.documentScan;
    }

    public final C7833e component7() {
        return this.faceAuditTrailImages;
    }

    public final C7833e component8() {
        return this.faceData;
    }

    public final C7833e component9() {
        return this.faceLowQualityAuditTrailImages;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final ValidateOnboardingDataQuery copy(String str, String str2, String str3, C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, C7833e eVar8) {
        C41536l.m120489i(str, "xDeviceKey");
        C41536l.m120489i(str2, "xUserAgent");
        String str4 = str3;
        C41536l.m120489i(str4, "accessToken");
        C7833e eVar9 = eVar;
        C41536l.m120489i(eVar9, "documentBackAuditTrailImages");
        C7833e eVar10 = eVar2;
        C41536l.m120489i(eVar10, "documentFrontAuditTrailImages");
        C7833e eVar11 = eVar3;
        C41536l.m120489i(eVar11, "documentScan");
        C7833e eVar12 = eVar4;
        C41536l.m120489i(eVar12, "faceAuditTrailImages");
        C7833e eVar13 = eVar5;
        C41536l.m120489i(eVar13, "faceData");
        C7833e eVar14 = eVar6;
        C41536l.m120489i(eVar14, "faceLowQualityAuditTrailImages");
        C7833e eVar15 = eVar7;
        C41536l.m120489i(eVar15, "processReference");
        C7833e eVar16 = eVar8;
        C41536l.m120489i(eVar16, "operationReference");
        return new ValidateOnboardingDataQuery(str, str2, str4, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateOnboardingDataQuery)) {
            return false;
        }
        ValidateOnboardingDataQuery validateOnboardingDataQuery = (ValidateOnboardingDataQuery) obj;
        return C41536l.m120484d(this.xDeviceKey, validateOnboardingDataQuery.xDeviceKey) && C41536l.m120484d(this.xUserAgent, validateOnboardingDataQuery.xUserAgent) && C41536l.m120484d(this.accessToken, validateOnboardingDataQuery.accessToken) && C41536l.m120484d(this.documentBackAuditTrailImages, validateOnboardingDataQuery.documentBackAuditTrailImages) && C41536l.m120484d(this.documentFrontAuditTrailImages, validateOnboardingDataQuery.documentFrontAuditTrailImages) && C41536l.m120484d(this.documentScan, validateOnboardingDataQuery.documentScan) && C41536l.m120484d(this.faceAuditTrailImages, validateOnboardingDataQuery.faceAuditTrailImages) && C41536l.m120484d(this.faceData, validateOnboardingDataQuery.faceData) && C41536l.m120484d(this.faceLowQualityAuditTrailImages, validateOnboardingDataQuery.faceLowQualityAuditTrailImages) && C41536l.m120484d(this.processReference, validateOnboardingDataQuery.processReference) && C41536l.m120484d(this.operationReference, validateOnboardingDataQuery.operationReference);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final C7833e getDocumentBackAuditTrailImages() {
        return this.documentBackAuditTrailImages;
    }

    public final C7833e getDocumentFrontAuditTrailImages() {
        return this.documentFrontAuditTrailImages;
    }

    public final C7833e getDocumentScan() {
        return this.documentScan;
    }

    public final C7833e getFaceAuditTrailImages() {
        return this.faceAuditTrailImages;
    }

    public final C7833e getFaceData() {
        return this.faceData;
    }

    public final C7833e getFaceLowQualityAuditTrailImages() {
        return this.faceLowQualityAuditTrailImages;
    }

    public final C7833e getOperationReference() {
        return this.operationReference;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public final String getXDeviceKey() {
        return this.xDeviceKey;
    }

    public final String getXUserAgent() {
        return this.xUserAgent;
    }

    public int hashCode() {
        return (((((((((((((((((((this.xDeviceKey.hashCode() * 31) + this.xUserAgent.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.documentBackAuditTrailImages.hashCode()) * 31) + this.documentFrontAuditTrailImages.hashCode()) * 31) + this.documentScan.hashCode()) * 31) + this.faceAuditTrailImages.hashCode()) * 31) + this.faceData.hashCode()) * 31) + this.faceLowQualityAuditTrailImages.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.operationReference.hashCode();
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
        return new C42907x39d79c61();
    }

    public String toString() {
        return "ValidateOnboardingDataQuery(xDeviceKey=" + this.xDeviceKey + ", xUserAgent=" + this.xUserAgent + ", accessToken=" + this.accessToken + ", documentBackAuditTrailImages=" + this.documentBackAuditTrailImages + ", documentFrontAuditTrailImages=" + this.documentFrontAuditTrailImages + ", documentScan=" + this.documentScan + ", faceAuditTrailImages=" + this.faceAuditTrailImages + ", faceData=" + this.faceData + ", faceLowQualityAuditTrailImages=" + this.faceLowQualityAuditTrailImages + ", processReference=" + this.processReference + ", operationReference=" + this.operationReference + ')';
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
        private final ValidateOnboardingData validateOnboardingData;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42903x7d5edc0d();
            }

            public final RegistrationServices invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(RegistrationServices.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new RegistrationServices(h, (ValidateOnboardingData) oVar.mo19023f(RegistrationServices.RESPONSE_FIELDS[1], C42914xb0138099.INSTANCE));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22816g("validateOnboardingData", "validateOnboardingData", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("XDeviceKey", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "xDeviceKey"))), C41233s.m119492a("XUserAgent", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "xUserAgent"))), C41233s.m119492a("accessToken", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "accessToken"))), C41233s.m119492a("operationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "operationReference"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("documentBackAuditTrailImages", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "documentBackAuditTrailImages"))), C41233s.m119492a("documentFrontAuditTrailImages", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "documentFrontAuditTrailImages"))), C41233s.m119492a("documentScan", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "documentScan"))), C41233s.m119492a("faceAuditTrailImages", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "faceAuditTrailImages"))), C41233s.m119492a("faceData", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "faceData"))), C41233s.m119492a("faceLowQualityAuditTrailImages", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "faceLowQualityAuditTrailImages")))))), true, (List) null)};
        }

        public RegistrationServices(String str, ValidateOnboardingData validateOnboardingData2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.validateOnboardingData = validateOnboardingData2;
        }

        public static /* synthetic */ RegistrationServices copy$default(RegistrationServices registrationServices, String str, ValidateOnboardingData validateOnboardingData2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registrationServices.__typename;
            }
            if ((i & 2) != 0) {
                validateOnboardingData2 = registrationServices.validateOnboardingData;
            }
            return registrationServices.copy(str, validateOnboardingData2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final ValidateOnboardingData component2() {
            return this.validateOnboardingData;
        }

        public final RegistrationServices copy(String str, ValidateOnboardingData validateOnboardingData2) {
            C41536l.m120489i(str, "__typename");
            return new RegistrationServices(str, validateOnboardingData2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegistrationServices)) {
                return false;
            }
            RegistrationServices registrationServices = (RegistrationServices) obj;
            return C41536l.m120484d(this.__typename, registrationServices.__typename) && C41536l.m120484d(this.validateOnboardingData, registrationServices.validateOnboardingData);
        }

        public final ValidateOnboardingData getValidateOnboardingData() {
            return this.validateOnboardingData;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            ValidateOnboardingData validateOnboardingData2 = this.validateOnboardingData;
            return hashCode + (validateOnboardingData2 == null ? 0 : validateOnboardingData2.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42904x8a225aaf(this);
        }

        public String toString() {
            return "RegistrationServices(__typename=" + this.__typename + ", validateOnboardingData=" + this.validateOnboardingData + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegistrationServices(String str, ValidateOnboardingData validateOnboardingData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "GraphqlRegistrationServices" : str, validateOnboardingData2);
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

    public static final class ValidateOnboardingData {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final C7846k[] RESPONSE_FIELDS;
        private final String __typename;
        private final String clientHasActualAddress;
        private final String customerId;
        private final String customerType;
        private final Integer errorCode;
        private final String errorKey;
        private final String scanResultBlob;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42905xe4290c69();
            }

            public final ValidateOnboardingData invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                String h = oVar.mo19025h(ValidateOnboardingData.RESPONSE_FIELDS[0]);
                C41536l.m120486f(h);
                return new ValidateOnboardingData(h, oVar.mo19025h(ValidateOnboardingData.RESPONSE_FIELDS[1]), oVar.mo19025h(ValidateOnboardingData.RESPONSE_FIELDS[2]), oVar.mo19018a(ValidateOnboardingData.RESPONSE_FIELDS[3]), oVar.mo19025h(ValidateOnboardingData.RESPONSE_FIELDS[4]), oVar.mo19025h(ValidateOnboardingData.RESPONSE_FIELDS[5]), oVar.mo19025h(ValidateOnboardingData.RESPONSE_FIELDS[6]));
            }
        }

        static {
            C7846k.C7847a aVar = C7846k.f22772g;
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("customerId", "customerId", (Map) null, true, (List) null), aVar.mo22817h("customerType", "customerType", (Map) null, true, (List) null), aVar.mo22814e("errorCode", "errorCode", (Map) null, true, (List) null), aVar.mo22817h("errorKey", "errorKey", (Map) null, true, (List) null), aVar.mo22817h("clientHasActualAddress", "clientHasActualAddress", (Map) null, true, (List) null), aVar.mo22817h("scanResultBlob", "scanResultBlob", (Map) null, true, (List) null)};
        }

        public ValidateOnboardingData(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.customerId = str2;
            this.customerType = str3;
            this.errorCode = num;
            this.errorKey = str4;
            this.clientHasActualAddress = str5;
            this.scanResultBlob = str6;
        }

        public static /* synthetic */ ValidateOnboardingData copy$default(ValidateOnboardingData validateOnboardingData, String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validateOnboardingData.__typename;
            }
            if ((i & 2) != 0) {
                str2 = validateOnboardingData.customerId;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = validateOnboardingData.customerType;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                num = validateOnboardingData.errorCode;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                str4 = validateOnboardingData.errorKey;
            }
            String str9 = str4;
            if ((i & 32) != 0) {
                str5 = validateOnboardingData.clientHasActualAddress;
            }
            String str10 = str5;
            if ((i & 64) != 0) {
                str6 = validateOnboardingData.scanResultBlob;
            }
            return validateOnboardingData.copy(str, str7, str8, num2, str9, str10, str6);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.customerId;
        }

        public final String component3() {
            return this.customerType;
        }

        public final Integer component4() {
            return this.errorCode;
        }

        public final String component5() {
            return this.errorKey;
        }

        public final String component6() {
            return this.clientHasActualAddress;
        }

        public final String component7() {
            return this.scanResultBlob;
        }

        public final ValidateOnboardingData copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
            C41536l.m120489i(str, "__typename");
            return new ValidateOnboardingData(str, str2, str3, num, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidateOnboardingData)) {
                return false;
            }
            ValidateOnboardingData validateOnboardingData = (ValidateOnboardingData) obj;
            return C41536l.m120484d(this.__typename, validateOnboardingData.__typename) && C41536l.m120484d(this.customerId, validateOnboardingData.customerId) && C41536l.m120484d(this.customerType, validateOnboardingData.customerType) && C41536l.m120484d(this.errorCode, validateOnboardingData.errorCode) && C41536l.m120484d(this.errorKey, validateOnboardingData.errorKey) && C41536l.m120484d(this.clientHasActualAddress, validateOnboardingData.clientHasActualAddress) && C41536l.m120484d(this.scanResultBlob, validateOnboardingData.scanResultBlob);
        }

        public final String getClientHasActualAddress() {
            return this.clientHasActualAddress;
        }

        public final String getCustomerId() {
            return this.customerId;
        }

        public final String getCustomerType() {
            return this.customerType;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorKey() {
            return this.errorKey;
        }

        public final String getScanResultBlob() {
            return this.scanResultBlob;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.customerId;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerType;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.errorCode;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.errorKey;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.clientHasActualAddress;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.scanResultBlob;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode6 + i;
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new C42906x9eff000b(this);
        }

        public String toString() {
            return "ValidateOnboardingData(__typename=" + this.__typename + ", customerId=" + this.customerId + ", customerType=" + this.customerType + ", errorCode=" + this.errorCode + ", errorKey=" + this.errorKey + ", clientHasActualAddress=" + this.clientHasActualAddress + ", scanResultBlob=" + this.scanResultBlob + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ValidateOnboardingData(String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "ValidateOnboardingDataResponse" : str, str2, str3, num, str4, str5, str6);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ValidateOnboardingDataQuery(java.lang.String r15, java.lang.String r16, java.lang.String r17, p217q2.C7833e r18, p217q2.C7833e r19, p217q2.C7833e r20, p217q2.C7833e r21, p217q2.C7833e r22, p217q2.C7833e r23, p217q2.C7833e r24, p217q2.C7833e r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000e
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            r6 = r1
            goto L_0x0010
        L_0x000e:
            r6 = r18
        L_0x0010:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001c
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            r7 = r1
            goto L_0x001e
        L_0x001c:
            r7 = r19
        L_0x001e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002a
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            r8 = r1
            goto L_0x002c
        L_0x002a:
            r8 = r20
        L_0x002c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0038
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            r9 = r1
            goto L_0x003a
        L_0x0038:
            r9 = r21
        L_0x003a:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0046
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            r10 = r1
            goto L_0x0048
        L_0x0046:
            r10 = r22
        L_0x0048:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0054
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            r11 = r1
            goto L_0x0056
        L_0x0054:
            r11 = r23
        L_0x0056:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0062
            q2.e$a r1 = p217q2.C7833e.f22754c
            q2.e r1 = r1.mo22767a()
            r12 = r1
            goto L_0x0064
        L_0x0062:
            r12 = r24
        L_0x0064:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0070
            q2.e$a r0 = p217q2.C7833e.f22754c
            q2.e r0 = r0.mo22767a()
            r13 = r0
            goto L_0x0072
        L_0x0070:
            r13 = r25
        L_0x0072:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sso.queery.ValidateOnboardingDataQuery.<init>(java.lang.String, java.lang.String, java.lang.String, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
