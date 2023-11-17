package p789ir;

import com.google.gson.Gson;
import ed1.C40734b;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ld0.C25950a;
import m00.C26116a;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.data.entity.LimitLoanDecisionEntity;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p818lr.C26059a;
import p828mr.C26257a;
import p828mr.C26259c;
import p828mr.C26262f;
import p828mr.C26266i;
import p838nr.C26573a;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: ir.d */
public final class C25252d implements C26573a {

    /* renamed from: a */
    private final IRetrofitService f64844a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C26116a f64845b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C26059a f64846c;

    /* renamed from: d */
    private final C27494a f64847d;

    /* renamed from: e */
    private final Gson f64848e = new Gson();

    /* renamed from: ir.d$a */
    static final class C25253a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25252d f64849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25253a(C25252d dVar) {
            super(1);
            this.f64849d = dVar;
        }

        /* renamed from: a */
        public final C26259c invoke(LimitLoanDecisionEntity limitLoanDecisionEntity) {
            C41536l.m120489i(limitLoanDecisionEntity, "it");
            return this.f64849d.f64846c.mo64974b(limitLoanDecisionEntity);
        }
    }

    /* renamed from: ir.d$b */
    static final class C25254b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25252d f64850d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25254b(C25252d dVar) {
            super(1);
            this.f64850d = dVar;
        }

        /* renamed from: a */
        public final C26259c invoke(LimitLoanDecisionEntity limitLoanDecisionEntity) {
            C41536l.m120489i(limitLoanDecisionEntity, "it");
            return this.f64850d.f64846c.mo64974b(limitLoanDecisionEntity);
        }
    }

    /* renamed from: ir.d$c */
    static final class C25255c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25252d f64851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25255c(C25252d dVar) {
            super(1);
            this.f64851d = dVar;
        }

        /* renamed from: a */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "it");
            return this.f64851d.f64845b.mo65027a(preContractEntity);
        }
    }

    public C25252d(IRetrofitService iRetrofitService, C26116a aVar, C26059a aVar2, C27494a aVar3) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "preContractMapper");
        C41536l.m120489i(aVar2, "loanDecisionMapper");
        C41536l.m120489i(aVar3, "otpBuilder");
        this.f64844a = iRetrofitService;
        this.f64845b = aVar;
        this.f64846c = aVar2;
        this.f64847d = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C26259c m80349l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26259c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final C26259c m80350m(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26259c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final C25950a m80351n(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo63766a() {
        C40762x<BankApiResponse<Object>> identifyCreditor = this.f64844a.identifyCreditor(BankApi.SERVICE_OFFERS_IDENTIFY_CREDITOR);
        C41536l.m120488h(identifyCreditor, "service.identifyCreditor…OFFERS_IDENTIFY_CREDITOR)");
        return C19273c.m64720f(identifyCreditor);
    }

    /* renamed from: b */
    public C40762x mo63767b(String str, String str2) {
        C41536l.m120489i(str, "offerNo");
        C41536l.m120489i(str2, "operationType");
        C40762x<BankApiResponse<LimitLoanDecisionEntity>> offerLimitLoanDecision = this.f64844a.getOfferLimitLoanDecision(BankApi.OFFERS_GET_LIMIT_LOAN_DECISION, str, str2, "123");
        C41536l.m120488h(offerLimitLoanDecision, "service.getOfferLimitLoa…          \"123\"\n        )");
        C40762x A = C19273c.m64722h(offerLimitLoanDecision).mo95062A(new C25251c(new C25254b(this)));
        C41536l.m120488h(A, "override fun getOfferLim…ionMapper.transform(it) }");
        return A;
    }

    /* renamed from: c */
    public C40762x mo63768c(String str) {
        C41536l.m120489i(str, "ccy");
        C40762x<BankApiResponse<List<LoanOfferCard>>> loanOfferCards = this.f64844a.getLoanOfferCards(BankApi.CARDS_GET_CARDS_FOR_LOAN_OFFER, str);
        C41536l.m120488h(loanOfferCards, "service.getLoanOfferCard…ARDS_FOR_LOAN_OFFER, ccy)");
        return C19273c.m64722h(loanOfferCards);
    }

    /* renamed from: d */
    public C40762x mo63769d(LimitLoanDecisionDetails limitLoanDecisionDetails, C26257a aVar) {
        String str;
        String str2;
        LimitLoanDecisionDetails limitLoanDecisionDetails2 = limitLoanDecisionDetails;
        C41536l.m120489i(limitLoanDecisionDetails2, "offerDetails");
        C41536l.m120489i(aVar, "options");
        List<LimitLoanRefinanceInfo> i = aVar.mo65363i();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(i, 10));
        for (LimitLoanRefinanceInfo limitLoanRefinanceInfo : i) {
            if (limitLoanRefinanceInfo.isSelected()) {
                str2 = "Y";
            } else {
                str2 = "N";
            }
            limitLoanRefinanceInfo.setDesireRefFlag(str2);
            arrayList.add(this.f64848e.mo18181w(limitLoanRefinanceInfo));
        }
        String obj = arrayList.toString();
        IRetrofitService iRetrofitService = this.f64844a;
        long j = limitLoanDecisionDetails2.decisionNo;
        String str3 = limitLoanDecisionDetails2.decisionScheme;
        String pan2 = aVar.mo65354b().getPan2();
        String str4 = limitLoanDecisionDetails2.operationType;
        String str5 = limitLoanDecisionDetails2.loanCcy;
        String e = aVar.mo65357e();
        String h = aVar.mo65361h();
        String c = aVar.mo65355c();
        double doubleValue = aVar.mo65353a().doubleValue();
        InsuranceProviderUiModel d = aVar.mo65356d();
        if (d != null) {
            str = d.mo49826b();
        } else {
            str = null;
        }
        C40762x<BankApiResponse<LimitLoanDecisionEntity>> checkLimitLoanDecision = iRetrofitService.checkLimitLoanDecision(BankApi.OFFERS_CHECK_LIMIT_LOAN_DECISION, j, str3, pan2, str4, str5, e, h, c, obj, doubleValue, (Double) null, str, "123");
        C41536l.m120488h(checkLimitLoanDecision, "service.checkLimitLoanDe…          \"123\"\n        )");
        C40762x A = C19273c.m64722h(checkLimitLoanDecision).mo95062A(new C25250b(new C25253a(this)));
        C41536l.m120488h(A, "override fun checkLimitL…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: e */
    public C40762x mo63770e(C26262f fVar) {
        String str;
        C41536l.m120489i(fVar, "options");
        IRetrofitService iRetrofitService = this.f64844a;
        String r = fVar.mo65412r();
        String c = fVar.mo65395c();
        String d = fVar.mo65396d();
        String a = fVar.mo65393a();
        String m = fVar.mo65407m();
        String k = fVar.mo65405k();
        String l = fVar.mo65406l();
        String n = fVar.mo65408n();
        String g = fVar.mo65400g();
        List q = fVar.mo65411q();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(q, 10));
        for (Iterator it = q.iterator(); it.hasNext(); it = it) {
            LimitLoanRefinanceInfo limitLoanRefinanceInfo = (LimitLoanRefinanceInfo) it.next();
            if (limitLoanRefinanceInfo.isSelected()) {
                str = "Y";
            } else {
                str = "N";
            }
            limitLoanRefinanceInfo.setDesireRefFlag(str);
            arrayList.add(this.f64848e.mo18181w(limitLoanRefinanceInfo));
        }
        C40762x<BankApiResponse<PreContractEntity>> loanOfferPreContractTemplate = iRetrofitService.getLoanOfferPreContractTemplate(BankApi.OFFERS_GET_LND_PRE_CONTRACT_TEMPLATE, r, c, d, a, m, k, l, n, g, arrayList.toString(), fVar.mo65404j(), fVar.mo65401h(), fVar.mo65409o(), fVar.mo65403i(), fVar.mo65394b(), fVar.mo65397e(), fVar.mo65399f(), fVar.mo65410p());
        C41536l.m120488h(loanOfferPreContractTemplate, "service.getLoanOfferPreC…ions.providerId\n        )");
        C40762x A = C19273c.m64722h(loanOfferPreContractTemplate).mo95062A(new C25249a(new C25255c(this)));
        C41536l.m120488h(A, "override fun getPreContr…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: f */
    public C40734b mo63771f(C26266i iVar) {
        C41536l.m120489i(iVar, "options");
        C40762x<BankApiResponse<Map<String, String>>> registerLoan = this.f64844a.registerLoan(this.f64847d.mo66809a(iVar.mo65423a()));
        C41536l.m120488h(registerLoan, "service.registerLoan(\n  …options.params)\n        )");
        return C19273c.m64720f(registerLoan);
    }
}
