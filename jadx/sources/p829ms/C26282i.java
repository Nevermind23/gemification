package p829ms;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentDataEntity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p749ev.C20297b;
import p819ls.C26064c;
import p831mu.C26299a;
import ue1.C43075l;

/* renamed from: ms.i */
public final class C26282i implements C20297b {

    /* renamed from: c */
    public static final C26283a f66622c = new C26283a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f66623a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C26064c f66624b;

    /* renamed from: ms.i$a */
    public static final class C26283a {
        private C26283a() {
        }

        public /* synthetic */ C26283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ms.i$b */
    static final class C26284b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26282i f66625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26284b(C26282i iVar) {
            super(1);
            this.f66625d = iVar;
        }

        /* renamed from: a */
        public final C26299a invoke(UpcomingPaymentDataEntity upcomingPaymentDataEntity) {
            C41536l.m120489i(upcomingPaymentDataEntity, "upcomingPaymentDataEntity");
            return this.f66625d.f66624b.mo64983a(upcomingPaymentDataEntity);
        }
    }

    public C26282i(IRetrofitService iRetrofitService, C26064c cVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(cVar, "upcomingPaymentDataMapper");
        this.f66623a = iRetrofitService;
        this.f66624b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C26299a m82221d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26299a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo48781a(int i, String str) {
        C41536l.m120489i(str, "type");
        C40762x<BankApiResponse<UpcomingPaymentDataEntity>> upcomingPayments = this.f66623a.getUpcomingPayments(BankApi.SERVICE_FINANCES_GET_CALENDAR_DATA_LIST, i, str);
        C41536l.m120488h(upcomingPayments, "service.getUpcomingPayme…DATA_BY_TYPE, days, type)");
        C40762x A = C19273c.m64722h(upcomingPayments).mo95062A(new C26281h(new C26284b(this)));
        C41536l.m120488h(A, "override fun getUpcoming…tity)\n            }\n    }");
        return A;
    }
}
