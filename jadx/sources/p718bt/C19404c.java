package p718bt;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.financialcalendar.entity.FinancialCalendarResponse;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p727ct.C19793a;
import p740dw.C20106a;
import ue1.C43075l;

/* renamed from: bt.c */
public final class C19404c implements C20106a {

    /* renamed from: c */
    public static final C19405a f53626c = new C19405a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f53627a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C19793a f53628b;

    /* renamed from: bt.c$a */
    public static final class C19405a {
        private C19405a() {
        }

        public /* synthetic */ C19405a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bt.c$b */
    static final class C19406b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19406b f53629d = new C19406b();

        C19406b() {
            super(1);
        }

        /* renamed from: a */
        public final FinancialCalendarEntity invoke(FinancialCalendarResponse financialCalendarResponse) {
            C41536l.m120489i(financialCalendarResponse, "it");
            return financialCalendarResponse.getPfmData();
        }
    }

    /* renamed from: bt.c$c */
    static final class C19407c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19404c f53630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19407c(C19404c cVar) {
            super(1);
            this.f53630d = cVar;
        }

        /* renamed from: a */
        public final List invoke(FinancialCalendarEntity financialCalendarEntity) {
            C41536l.m120489i(financialCalendarEntity, "it");
            return this.f53630d.f53628b.mo48082b(financialCalendarEntity);
        }
    }

    public C19404c(IRetrofitService iRetrofitService, C19793a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f53627a = iRetrofitService;
        this.f53628b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final FinancialCalendarEntity m64896e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (FinancialCalendarEntity) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final List m64897f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47629a(String str, String str2, boolean z) {
        C41536l.m120489i(str, "startStr");
        C41536l.m120489i(str2, "endStr");
        C40762x<BankApiResponse<FinancialCalendarResponse>> financialCalendar = this.f53627a.getFinancialCalendar("PFM_FINANCIALCALENDAR_GET", str, str2);
        C41536l.m120488h(financialCalendar, "service.getFinancialCale…AR_GET, startStr, endStr)");
        C40762x A = C19273c.m64722h(financialCalendar).mo95062A(new C19402a(C19406b.f53629d)).mo95062A(new C19403b(new C19407c(this)));
        C41536l.m120488h(A, "override fun getFinancia…per.transform(it) }\n    }");
        return A;
    }
}
