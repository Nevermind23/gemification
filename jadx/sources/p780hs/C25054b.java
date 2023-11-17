package p780hs;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.creditapplicationdetails.entity.CreditApplicationEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p790is.C25256a;
import p946xu.C29859a;
import p957yu.C30114a;
import ue1.C43075l;

/* renamed from: hs.b */
public final class C25054b implements C30114a {

    /* renamed from: b */
    public static final C25055a f64408b = new C25055a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f64409a;

    /* renamed from: hs.b$a */
    public static final class C25055a {
        private C25055a() {
        }

        public /* synthetic */ C25055a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: hs.b$b */
    static final class C25056b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25056b f64410d = new C25056b();

        C25056b() {
            super(1);
        }

        /* renamed from: a */
        public final C29859a invoke(CreditApplicationEntity creditApplicationEntity) {
            C41536l.m120489i(creditApplicationEntity, "it");
            return C25256a.m80361a(creditApplicationEntity);
        }
    }

    public C25054b(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f64409a = iRetrofitService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C29859a m80004c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29859a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo63491a(long j) {
        C40762x<BankApiResponse<CreditApplicationEntity>> creditApplicationDetails = this.f64409a.getCreditApplicationDetails("LOANS_GET_AMM_NEW_LOAN", Long.valueOf(j));
        C41536l.m120488h(creditApplicationDetails, "service.getCreditApplica…_GET_AMM_NEW_LOAN, appId)");
        C40762x A = C19273c.m64722h(creditApplicationDetails).mo95062A(new C25053a(C25056b.f64410d));
        C41536l.m120488h(A, "service.getCreditApplica…reditApplicationModel() }");
        return A;
    }
}
