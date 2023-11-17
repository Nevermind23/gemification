package p966zs;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.cashflow.entity.CashFlowResponse;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p708at.C19276a;
import p711aw.C19279a;
import ue1.C43075l;

/* renamed from: zs.b */
public final class C30401b implements C19279a {

    /* renamed from: c */
    public static final C30402a f76382c = new C30402a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f76383a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C19276a f76384b;

    /* renamed from: zs.b$a */
    public static final class C30402a {
        private C30402a() {
        }

        public /* synthetic */ C30402a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: zs.b$b */
    static final class C30403b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30401b f76385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30403b(C30401b bVar) {
            super(1);
            this.f76385d = bVar;
        }

        /* renamed from: a */
        public final List invoke(CashFlowResponse cashFlowResponse) {
            C41536l.m120489i(cashFlowResponse, "it");
            return this.f76385d.f76384b.mo47498b(cashFlowResponse);
        }
    }

    public C30401b(IRetrofitService iRetrofitService, C19276a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f76383a = iRetrofitService;
        this.f76384b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m91699d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47504a(String str, int i, int i2, boolean z) {
        C41536l.m120489i(str, "monthOfYear");
        C40762x<BankApiResponse<CashFlowResponse>> cashFlow = this.f76383a.getCashFlow("PFM_FINANCIAL_STATEMENTS_MONTHLY_GROUPED", str, i, i2);
        C41536l.m120488h(cashFlow, "service.getCashFlow(\n   …   futureMonths\n        )");
        C40762x A = C19273c.m64722h(cashFlow).mo95062A(new C30400a(new C30403b(this)));
        C41536l.m120488h(A, "override fun getCashFlow…per.transform(it) }\n    }");
        return A;
    }
}
