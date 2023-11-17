package p341ge.bog.mobilebank.cleanarch.data.creditapplication;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m00.C26116a;
import p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p756fs.C20547a;
import p756fs.C20548b;
import p756fs.C20549c;
import p770gs.C24777a;
import p913uu.C28935a;
import p913uu.C28938d;
import p913uu.C28940f;
import p913uu.C28942h;
import p924vu.C29164a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl */
public final class CreditOfferRepositoryImpl implements C29164a {

    /* renamed from: e */
    public static final C20989a f56435e = new C20989a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f56436a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C24777a f56437b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C26116a f56438c;

    /* renamed from: d */
    private final Gson f56439d;

    @Keep
    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl$CreditApplicationParams */
    public static final class CreditApplicationParams extends OtpParams {
        private final String confirmCode;
        private final String decNo;
        private final String decisionScheme;
        private final String department;
        private final String limitId;
        private final String operationId;
        private final String operationReference;
        private final String preContractText;
        private final String scaAuthCode;
        private final String serviceId;
        private final String terminal;
        private final String tmxSessionId;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ CreditApplicationParams(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 256(0x100, float:3.59E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r12 = r2
                goto L_0x000b
            L_0x0009:
                r12 = r24
            L_0x000b:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0011
                r13 = r2
                goto L_0x0013
            L_0x0011:
                r13 = r25
            L_0x0013:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0019
                r14 = r2
                goto L_0x001b
            L_0x0019:
                r14 = r26
            L_0x001b:
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r11 = r23
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl.CreditApplicationParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getConfirmCode() {
            return this.confirmCode;
        }

        public final String getDecNo() {
            return this.decNo;
        }

        public final String getDecisionScheme() {
            return this.decisionScheme;
        }

        public final String getDepartment() {
            return this.department;
        }

        public final String getLimitId() {
            return this.limitId;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public final String getPreContractText() {
            return this.preContractText;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final String getTerminal() {
            return this.terminal;
        }

        public final String getTmxSessionId() {
            return this.tmxSessionId;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CreditApplicationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            super(str8, str10, str11, (String) null, 8, (DefaultConstructorMarker) null);
            String str12 = str2;
            String str13 = str3;
            String str14 = str4;
            String str15 = str5;
            String str16 = str8;
            C41536l.m120489i(str, "limitId");
            C41536l.m120489i(str12, "decNo");
            C41536l.m120489i(str13, "decisionScheme");
            C41536l.m120489i(str14, "confirmCode");
            C41536l.m120489i(str15, "department");
            C41536l.m120489i(str16, IRetrofitService.SERVICE_ID);
            this.limitId = str;
            this.decNo = str12;
            this.decisionScheme = str13;
            this.confirmCode = str14;
            this.department = str15;
            this.tmxSessionId = str6;
            this.preContractText = str7;
            this.serviceId = str16;
            this.operationId = str9;
            this.operationReference = str10;
            this.scaAuthCode = str11;
            this.terminal = "123";
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl$a */
    public static final class C20989a {
        private C20989a() {
        }

        public /* synthetic */ C20989a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl$b */
    static final class C20990b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferRepositoryImpl f56440d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20990b(CreditOfferRepositoryImpl creditOfferRepositoryImpl) {
            super(1);
            this.f56440d = creditOfferRepositoryImpl;
        }

        /* renamed from: a */
        public final C28935a invoke(CreditOfferDecisionEntity creditOfferDecisionEntity) {
            C41536l.m120489i(creditOfferDecisionEntity, "it");
            return this.f56440d.f56437b.mo63194e(creditOfferDecisionEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl$c */
    static final class C20991c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferRepositoryImpl f56441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20991c(CreditOfferRepositoryImpl creditOfferRepositoryImpl) {
            super(1);
            this.f56441d = creditOfferRepositoryImpl;
        }

        /* renamed from: a */
        public final C28940f invoke(CreditOfferDecisionEntity creditOfferDecisionEntity) {
            C41536l.m120489i(creditOfferDecisionEntity, "it");
            return this.f56441d.f56437b.mo63192c(creditOfferDecisionEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.CreditOfferRepositoryImpl$d */
    static final class C20992d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreditOfferRepositoryImpl f56442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20992d(CreditOfferRepositoryImpl creditOfferRepositoryImpl) {
            super(1);
            this.f56442d = creditOfferRepositoryImpl;
        }

        /* renamed from: a */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "it");
            return this.f56442d.f56438c.mo65027a(preContractEntity);
        }
    }

    public CreditOfferRepositoryImpl(IRetrofitService iRetrofitService, C24777a aVar, C26116a aVar2, Gson gson) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "decisionMapper");
        C41536l.m120489i(aVar2, "preContractEntityMapper");
        C41536l.m120489i(gson, "gson");
        this.f56436a = iRetrofitService;
        this.f56437b = aVar;
        this.f56438c = aVar2;
        this.f56439d = gson;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C28935a m67985k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28935a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C28940f m67986l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28940f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C25950a m67987m(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo50170a() {
        C40762x<BankApiResponse<Object>> identifyCreditor = this.f56436a.identifyCreditor(BankApi.SERVICE_OFFERS_IDENTIFY_CREDITOR);
        C41536l.m120488h(identifyCreditor, "service.identifyCreditor(OFFERS_IDENTIFY_CREDITOR)");
        return C19273c.m64720f(identifyCreditor);
    }

    /* renamed from: b */
    public C40734b mo50171b(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x<BankApiResponse<Object>> useOtpForActionSinglePost = this.f56436a.useOtpForActionSinglePost(hashMap);
        C41536l.m120488h(useOtpForActionSinglePost, "service.useOtpForActionSinglePost(params)");
        return C19273c.m64720f(useOtpForActionSinglePost);
    }

    /* renamed from: c */
    public C40762x mo50172c(String str, String str2) {
        C41536l.m120489i(str, "offerNo");
        C41536l.m120489i(str2, "operationType");
        C40762x<BankApiResponse<CreditOfferDecisionEntity>> creditCardOfferDecision = this.f56436a.getCreditCardOfferDecision("OFFERS_GET_LIMIT_CARD_DECISION", str, str2);
        C41536l.m120488h(creditCardOfferDecision, "service.getCreditCardOff…  operationType\n        )");
        C40762x A = C19273c.m64722h(creditCardOfferDecision).mo95062A(new C20549c(new C20991c(this)));
        C41536l.m120488h(A, "override fun getCreditCa…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: d */
    public C40762x mo50173d(C28938d dVar) {
        C41536l.m120489i(dVar, "options");
        C41536l.m120484d(dVar.mo68741e(), OfferProductCode.C21017LC.f56476f);
        C40762x<BankApiResponse<PreContractEntity>> creditCardOfferPreContractTemplate = this.f56436a.getCreditCardOfferPreContractTemplate("OFFERS_GET_CREDIT_CARD_PRE_CONTRACT_TEMPLATE", "123", Long.valueOf(dVar.mo68739c()), dVar.mo68740d(), dVar.mo68743f(), dVar.mo68737a(), dVar.mo68747i(), dVar.mo68738b(), this.f56439d.mo18181w(dVar.mo68745h()), dVar.mo68744g());
        C41536l.m120488h(creditCardOfferPreContractTemplate, "service.getCreditCardOff…ptions.prodType\n        )");
        C40762x A = C19273c.m64722h(creditCardOfferPreContractTemplate).mo95062A(new C20548b(new C20992d(this)));
        C41536l.m120488h(A, "override fun getPreContr…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: e */
    public C40762x mo50174e(C28942h hVar, String str, String str2, String str3, List list, String str4) {
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(str, "decNo");
        C41536l.m120489i(str2, "decisionScheme");
        C41536l.m120489i(str3, "cardLimit");
        C41536l.m120489i(str4, "templCode");
        if (list == null) {
            list = C41341q.m119907j();
        }
        C40762x<BankApiResponse<CreditOfferDecisionEntity>> checkCreditCardOfferDecision = this.f56436a.checkCreditCardOfferDecision("OFFERS_CHECK_LIMIT_CARD_DECISION", hVar.mo68796b(), str, str2, str3, this.f56439d.mo18181w(list), str4);
        C41536l.m120488h(checkCreditCardOfferDecision, "service.checkCreditCardO…      templCode\n        )");
        C40762x A = C19273c.m64722h(checkCreditCardOfferDecision).mo95062A(new C20547a(new C20990b(this)));
        C41536l.m120488h(A, "override fun checkCredit…CheckDecision(it) }\n    }");
        return A;
    }
}
