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

public final class RequestOTPQuery implements C7842i {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OPERATION_ID = "49d18bf00c84f1d112bd898e88e403807a6342306a99112762772eda4e9568a8";
    /* access modifiers changed from: private */
    public static final C7841h OPERATION_NAME = new RequestOTPQuery$Companion$OPERATION_NAME$1();
    /* access modifiers changed from: private */
    public static final String QUERY_DOCUMENT = C8118k.m30683a("query requestOTP($contact: String, $contactId: String, $contactType: UserContactType, $processReference: String, $manuallyEnteredContact: String, $manuallyEnteredContactType: UserContactType, $scaOperationReference: String) {\n  commonServices {\n    __typename\n    requestOTP(request: {contact: $contact, contactId: $contactId, contactType: $contactType, processReference: $processReference, manuallyEnteredContact: $manuallyEnteredContact, manuallyEnteredContactType: $manuallyEnteredContactType, scaOperationReference: $scaOperationReference})\n  }\n}");
    private final C7833e contact;
    private final C7833e contactId;
    private final C7833e contactType;
    private final C7833e manuallyEnteredContact;
    private final C7833e manuallyEnteredContactType;
    private final C7833e processReference;
    private final C7833e scaOperationReference;
    private final transient C7836g.C7839c variables;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7841h getOPERATION_NAME() {
            return RequestOTPQuery.OPERATION_NAME;
        }

        public final String getQUERY_DOCUMENT() {
            return RequestOTPQuery.QUERY_DOCUMENT;
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
                return new RequestOTPQuery$Data$Companion$Mapper$$inlined$invoke$1();
            }

            public final Data invoke(C8124o oVar) {
                C41536l.m120489i(oVar, "reader");
                return new Data((CommonServices) oVar.mo19023f(Data.RESPONSE_FIELDS[0], RequestOTPQuery$Data$Companion$invoke$1$commonServices$1.INSTANCE));
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
            return new RequestOTPQuery$Data$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "Data(commonServices=" + this.commonServices + ')';
        }
    }

    public RequestOTPQuery() {
        this((C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, (C7833e) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RequestOTPQuery copy$default(RequestOTPQuery requestOTPQuery, C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = requestOTPQuery.contact;
        }
        if ((i & 2) != 0) {
            eVar2 = requestOTPQuery.contactId;
        }
        C7833e eVar8 = eVar2;
        if ((i & 4) != 0) {
            eVar3 = requestOTPQuery.contactType;
        }
        C7833e eVar9 = eVar3;
        if ((i & 8) != 0) {
            eVar4 = requestOTPQuery.processReference;
        }
        C7833e eVar10 = eVar4;
        if ((i & 16) != 0) {
            eVar5 = requestOTPQuery.manuallyEnteredContact;
        }
        C7833e eVar11 = eVar5;
        if ((i & 32) != 0) {
            eVar6 = requestOTPQuery.manuallyEnteredContactType;
        }
        C7833e eVar12 = eVar6;
        if ((i & 64) != 0) {
            eVar7 = requestOTPQuery.scaOperationReference;
        }
        return requestOTPQuery.copy(eVar, eVar8, eVar9, eVar10, eVar11, eVar12, eVar7);
    }

    public final C7833e component1() {
        return this.contact;
    }

    public final C7833e component2() {
        return this.contactId;
    }

    public final C7833e component3() {
        return this.contactType;
    }

    public final C7833e component4() {
        return this.processReference;
    }

    public final C7833e component5() {
        return this.manuallyEnteredContact;
    }

    public final C7833e component6() {
        return this.manuallyEnteredContactType;
    }

    public final C7833e component7() {
        return this.scaOperationReference;
    }

    public C40681e composeRequestBody(C7851m mVar) {
        C41536l.m120489i(mVar, "scalarTypeAdapters");
        return C8114h.m30667a(this, false, true, mVar);
    }

    public final RequestOTPQuery copy(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7) {
        C41536l.m120489i(eVar, "contact");
        C41536l.m120489i(eVar2, "contactId");
        C41536l.m120489i(eVar3, "contactType");
        C41536l.m120489i(eVar4, "processReference");
        C41536l.m120489i(eVar5, "manuallyEnteredContact");
        C41536l.m120489i(eVar6, "manuallyEnteredContactType");
        C7833e eVar8 = eVar7;
        C41536l.m120489i(eVar8, "scaOperationReference");
        return new RequestOTPQuery(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestOTPQuery)) {
            return false;
        }
        RequestOTPQuery requestOTPQuery = (RequestOTPQuery) obj;
        return C41536l.m120484d(this.contact, requestOTPQuery.contact) && C41536l.m120484d(this.contactId, requestOTPQuery.contactId) && C41536l.m120484d(this.contactType, requestOTPQuery.contactType) && C41536l.m120484d(this.processReference, requestOTPQuery.processReference) && C41536l.m120484d(this.manuallyEnteredContact, requestOTPQuery.manuallyEnteredContact) && C41536l.m120484d(this.manuallyEnteredContactType, requestOTPQuery.manuallyEnteredContactType) && C41536l.m120484d(this.scaOperationReference, requestOTPQuery.scaOperationReference);
    }

    public final C7833e getContact() {
        return this.contact;
    }

    public final C7833e getContactId() {
        return this.contactId;
    }

    public final C7833e getContactType() {
        return this.contactType;
    }

    public final C7833e getManuallyEnteredContact() {
        return this.manuallyEnteredContact;
    }

    public final C7833e getManuallyEnteredContactType() {
        return this.manuallyEnteredContactType;
    }

    public final C7833e getProcessReference() {
        return this.processReference;
    }

    public final C7833e getScaOperationReference() {
        return this.scaOperationReference;
    }

    public int hashCode() {
        return (((((((((((this.contact.hashCode() * 31) + this.contactId.hashCode()) * 31) + this.contactType.hashCode()) * 31) + this.processReference.hashCode()) * 31) + this.manuallyEnteredContact.hashCode()) * 31) + this.manuallyEnteredContactType.hashCode()) * 31) + this.scaOperationReference.hashCode();
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
        return new RequestOTPQuery$responseFieldMapper$$inlined$invoke$1();
    }

    public String toString() {
        return "RequestOTPQuery(contact=" + this.contact + ", contactId=" + this.contactId + ", contactType=" + this.contactType + ", processReference=" + this.processReference + ", manuallyEnteredContact=" + this.manuallyEnteredContact + ", manuallyEnteredContactType=" + this.manuallyEnteredContactType + ", scaOperationReference=" + this.scaOperationReference + ')';
    }

    public C7836g.C7839c variables() {
        return this.variables;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public RequestOTPQuery(C7833e eVar, C7833e eVar2, C7833e eVar3, C7833e eVar4, C7833e eVar5, C7833e eVar6, C7833e eVar7) {
        C41536l.m120489i(eVar, "contact");
        C41536l.m120489i(eVar2, "contactId");
        C41536l.m120489i(eVar3, "contactType");
        C41536l.m120489i(eVar4, "processReference");
        C41536l.m120489i(eVar5, "manuallyEnteredContact");
        C41536l.m120489i(eVar6, "manuallyEnteredContactType");
        C41536l.m120489i(eVar7, "scaOperationReference");
        this.contact = eVar;
        this.contactId = eVar2;
        this.contactType = eVar3;
        this.processReference = eVar4;
        this.manuallyEnteredContact = eVar5;
        this.manuallyEnteredContactType = eVar6;
        this.scaOperationReference = eVar7;
        this.variables = new RequestOTPQuery$variables$1(this);
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
        private final String requestOTP;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C8120m Mapper() {
                C8120m.C8121a aVar = C8120m.f23272a;
                return new C42851xb0d063a();
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
            RESPONSE_FIELDS = new C7846k[]{aVar.mo22817h("__typename", "__typename", (Map) null, false, (List) null), aVar.mo22817h("requestOTP", "requestOTP", C41342q0.m119922g(C41233s.m119492a("request", C41344r0.m119931m(C41233s.m119492a("contact", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contact"))), C41233s.m119492a("contactId", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactId"))), C41233s.m119492a("contactType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "contactType"))), C41233s.m119492a("processReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "processReference"))), C41233s.m119492a("manuallyEnteredContact", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "manuallyEnteredContact"))), C41233s.m119492a("manuallyEnteredContactType", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "manuallyEnteredContactType"))), C41233s.m119492a("scaOperationReference", C41344r0.m119931m(C41233s.m119492a("kind", "Variable"), C41233s.m119492a("variableName", "scaOperationReference")))))), true, (List) null)};
        }

        public CommonServices(String str, String str2) {
            C41536l.m120489i(str, "__typename");
            this.__typename = str;
            this.requestOTP = str2;
        }

        public static /* synthetic */ CommonServices copy$default(CommonServices commonServices, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = commonServices.__typename;
            }
            if ((i & 2) != 0) {
                str2 = commonServices.requestOTP;
            }
            return commonServices.copy(str, str2);
        }

        public final String component1() {
            return this.__typename;
        }

        public final String component2() {
            return this.requestOTP;
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
            return C41536l.m120484d(this.__typename, commonServices.__typename) && C41536l.m120484d(this.requestOTP, commonServices.requestOTP);
        }

        public final String getRequestOTP() {
            return this.requestOTP;
        }

        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int hashCode = this.__typename.hashCode() * 31;
            String str = this.requestOTP;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final C8122n marshaller() {
            C8122n.C8123a aVar = C8122n.f23274a;
            return new RequestOTPQuery$CommonServices$marshaller$$inlined$invoke$1(this);
        }

        public String toString() {
            return "CommonServices(__typename=" + this.__typename + ", requestOTP=" + this.requestOTP + ')';
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RequestOTPQuery(p217q2.C7833e r6, p217q2.C7833e r7, p217q2.C7833e r8, p217q2.C7833e r9, p217q2.C7833e r10, p217q2.C7833e r11, p217q2.C7833e r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x000a
            q2.e$a r6 = p217q2.C7833e.f22754c
            q2.e r6 = r6.mo22767a()
        L_0x000a:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0014
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r7 = r7.mo22767a()
        L_0x0014:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x001f
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r8 = r7.mo22767a()
        L_0x001f:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x002a
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r9 = r7.mo22767a()
        L_0x002a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0035
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r10 = r7.mo22767a()
        L_0x0035:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0040
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r11 = r7.mo22767a()
        L_0x0040:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x004b
            q2.e$a r7 = p217q2.C7833e.f22754c
            q2.e r12 = r7.mo22767a()
        L_0x004b:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sso.queery.RequestOTPQuery.<init>(q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, q2.e, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
