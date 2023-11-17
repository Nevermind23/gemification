package p965zr;

import ed1.C40734b;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.commissions.entity.UpcomingPaymentDataEntity;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p821lu.C26091c;
import p821lu.C26092d;
import p841nu.C26607a;
import u00.C28533a;
import ue1.C43075l;

/* renamed from: zr.c */
public final class C30396c implements C26607a {

    /* renamed from: d */
    public static final C30397a f76374d = new C30397a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f76375a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C26092d f76376b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C26091c f76377c;

    /* renamed from: zr.c$a */
    public static final class C30397a {
        private C30397a() {
        }

        public /* synthetic */ C30397a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: zr.c$b */
    static final class C30398b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30396c f76378d;

        /* renamed from: e */
        final /* synthetic */ String f76379e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30398b(C30396c cVar, String str) {
            super(1);
            this.f76378d = cVar;
            this.f76379e = str;
        }

        /* renamed from: a */
        public final List invoke(UpcomingPaymentDataEntity upcomingPaymentDataEntity) {
            C41536l.m120489i(upcomingPaymentDataEntity, "it");
            return this.f76378d.f76377c.mo65004a(upcomingPaymentDataEntity, this.f76379e);
        }
    }

    /* renamed from: zr.c$c */
    static final class C30399c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C30396c f76380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30399c(C30396c cVar) {
            super(1);
            this.f76380d = cVar;
        }

        /* renamed from: a */
        public final List invoke(UpcomingPaymentDataEntity upcomingPaymentDataEntity) {
            C41536l.m120489i(upcomingPaymentDataEntity, "it");
            return this.f76380d.f76376b.mo65005a(upcomingPaymentDataEntity);
        }
    }

    public C30396c(IRetrofitService iRetrofitService, C26092d dVar, C26091c cVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(dVar, "upcomingSummariesMapper");
        C41536l.m120489i(cVar, "upcomingCommissionsMapper");
        this.f76375a = iRetrofitService;
        this.f76376b = dVar;
        this.f76377c = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final List m91689i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final List m91690j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo65860a(C28533a aVar) {
        C41536l.m120489i(aVar, "request");
        C40762x<BankApiResponse<Object>> payCommissions = this.f76375a.payCommissions(BankApi.SERVICE_FINANCES_CALENDAR_DATA_MAKE_CHARGE_FEE, aVar.mo68250b(), Long.valueOf(aVar.mo68249a()));
        C41536l.m120488h(payCommissions, "service.payCommissions(\n…request.acctKey\n        )");
        return C19273c.m64720f(payCommissions);
    }

    /* renamed from: b */
    public C40762x mo65861b() {
        C40762x<BankApiResponse<UpcomingPaymentDataEntity>> upcomingPayments = this.f76375a.getUpcomingPayments(BankApi.SERVICE_FINANCES_GET_CALENDAR_DATA_LIST, 25, "MASTER");
        C41536l.m120488h(upcomingPayments, "service.getUpcomingPayme…NTS_RECORD_TYPE\n        )");
        C40762x A = C19273c.m64722h(upcomingPayments).mo95062A(new C30394a(new C30399c(this)));
        C41536l.m120488h(A, "override fun getUpcoming…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: c */
    public C40762x mo65862c(String str, String str2) {
        C41536l.m120489i(str, "langCode");
        C41536l.m120489i(str2, "ccy");
        C40762x<BankApiResponse<List<PaymentsCard>>> commissionAccounts = this.f76375a.getCommissionAccounts(BankApi.SERVICE_FINANCES_GET_COMMISSION_ACCOUNTS_LOV, str, str2);
        C41536l.m120488h(commissionAccounts, "service.getCommissionAcc…ngCode,\n        ccy\n    )");
        return C19273c.m64722h(commissionAccounts);
    }

    /* renamed from: d */
    public C40762x mo65863d(String str) {
        C41536l.m120489i(str, "ccy");
        C40762x<BankApiResponse<UpcomingPaymentDataEntity>> upcomingPayments = this.f76375a.getUpcomingPayments(BankApi.SERVICE_FINANCES_GET_CALENDAR_DATA_LIST, 25, "MASTER");
        C41536l.m120488h(upcomingPayments, "service.getUpcomingPayme…NTS_RECORD_TYPE\n        )");
        C40762x A = C19273c.m64722h(upcomingPayments).mo95062A(new C30395b(new C30398b(this, str)));
        C41536l.m120488h(A, "override fun getCommissi…ransform(it, ccy) }\n    }");
        return A;
    }
}
