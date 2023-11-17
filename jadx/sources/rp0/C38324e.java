package rp0;

import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import ld0.C25950a;
import m00.C26116a;
import op0.C37705a;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.LimitLoanDecisionApiModel;
import pp0.C37939a;
import qp0.C38233a;
import ue1.C43075l;
import wp0.C39632d;
import xp0.C39834a;

/* renamed from: rp0.e */
public final class C38324e implements C39834a {

    /* renamed from: a */
    private final C37705a f91839a;

    /* renamed from: b */
    private final C26116a f91840b;

    /* renamed from: c */
    private final C37939a f91841c;

    /* renamed from: d */
    private final C38233a f91842d;

    /* renamed from: rp0.e$a */
    /* synthetic */ class C38325a extends C41535k implements C43075l {
        C38325a(Object obj) {
            super(1, obj, C37939a.class, "convert", "convert(Lge/bog/mobilebank/loanactivation/data/entity/loandecision/LimitLoanDecisionApiModel;)Lge/bog/mobilebank/loanactivation/domain/model/loandecision/LimitLoanDecision;", 0);
        }

        /* renamed from: b */
        public final C39632d invoke(LimitLoanDecisionApiModel limitLoanDecisionApiModel) {
            C41536l.m120489i(limitLoanDecisionApiModel, "p0");
            return ((C37939a) this.receiver).mo91295b(limitLoanDecisionApiModel);
        }
    }

    /* renamed from: rp0.e$b */
    /* synthetic */ class C38326b extends C41535k implements C43075l {
        C38326b(Object obj) {
            super(1, obj, C26116a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/precontract/data/entity/PreContractEntity;)Lge/bog/mobilebank/domain/precontract/model/PreContract;", 0);
        }

        /* renamed from: b */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "p0");
            return ((C26116a) this.receiver).mo65027a(preContractEntity);
        }
    }

    /* renamed from: rp0.e$c */
    /* synthetic */ class C38327c extends C41535k implements C43075l {
        C38327c(Object obj) {
            super(1, obj, C37939a.class, "convert", "convert(Lge/bog/mobilebank/loanactivation/data/entity/loandecision/LimitLoanDecisionApiModel;)Lge/bog/mobilebank/loanactivation/domain/model/loandecision/LimitLoanDecision;", 0);
        }

        /* renamed from: b */
        public final C39632d invoke(LimitLoanDecisionApiModel limitLoanDecisionApiModel) {
            C41536l.m120489i(limitLoanDecisionApiModel, "p0");
            return ((C37939a) this.receiver).mo91295b(limitLoanDecisionApiModel);
        }
    }

    /* renamed from: rp0.e$d */
    /* synthetic */ class C38328d extends C41535k implements C43075l {
        C38328d(Object obj) {
            super(1, obj, C38233a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C38233a) this.receiver).mo91763a(list);
        }
    }

    public C38324e(C37705a aVar, C26116a aVar2, C37939a aVar3, C38233a aVar4) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "preContractEntityMapper");
        C41536l.m120489i(aVar3, "loanDecisionMapper");
        C41536l.m120489i(aVar4, "loanActivationMapper");
        this.f91839a = aVar;
        this.f91840b = aVar2;
        this.f91841c = aVar3;
        this.f91842d = aVar4;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C39632d m112614j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C39632d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C25950a m112615k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final C39632d m112616l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C39632d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final List m112617m(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo91866a() {
        return this.f91839a.mo90901a();
    }

    /* renamed from: b */
    public C40762x mo91867b(Double d, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Integer num3, Double d2, Double d3, String str8, String str9, Long l2) {
        C37705a aVar = this.f91839a;
        C40762x A = C37705a.C37706a.m110823a(aVar, d, str, num, num2, str2, str3, str4, str5, str6, str7, l, num3, d2, d3, str8, l2, str9, (String) null, 131072, (Object) null).mo95062A(new C38320a(new C38326b(this.f91840b)));
        C41536l.m120488h(A, "service.getApplicationPr…tEntityMapper::transform)");
        return A;
    }

    /* renamed from: c */
    public C40762x mo91868c(Long l, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, Double d, Long l2) {
        C40762x A = this.f91839a.mo90903c(l, str, str2, str3, str4, num, num2, str5, str6, str7, d, l2).mo95062A(new C38323d(new C38325a(this.f91841c)));
        C41536l.m120488h(A, "service.checkLoanDecisio…nDecisionMapper::convert)");
        return A;
    }

    /* renamed from: d */
    public C40762x mo91869d(String str) {
        C41536l.m120489i(str, "ccy");
        C40762x A = this.f91839a.mo90904d(str).mo95062A(new C38321b(new C38328d(this.f91842d)));
        C41536l.m120488h(A, "service.getLoanAccounts(…ctivationMapper::convert)");
        return A;
    }

    /* renamed from: e */
    public C40762x mo91870e(String str, String str2) {
        C40762x A = this.f91839a.mo90902b(str, str2).mo95062A(new C38322c(new C38327c(this.f91841c)));
        C41536l.m120488h(A, "service.getOfferLimitLoa…nDecisionMapper::convert)");
        return A;
    }

    public C40734b registerLoan(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.f91839a.registerLoan(hashMap);
    }
}
