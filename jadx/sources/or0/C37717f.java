package or0;

import ed1.C40734b;
import ed1.C40762x;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mr0.C37252a;
import nr0.C37452a;
import nr0.C37453b;
import nr0.C37454c;
import nr0.C37455d;
import nr0.C37456e;
import p341ge.bog.mobilebank.loans.data.model.LoanHistoryApiModel;
import p341ge.bog.mobilebank.loans.data.model.LoanPaymentEntity;
import p341ge.bog.mobilebank.loans.data.model.LoanPlnHistoryApiModel;
import p341ge.bog.mobilebank.loans.data.model.LoanSchedulesApiModel;
import p341ge.bog.mobilebank.loans.data.model.PawnLoanApiModel;
import rr0.C38333a;
import tr0.C38780a;
import tr0.C38783d;
import tr0.C38785f;
import tr0.C38788i;
import tr0.C38790k;
import ue1.C43075l;

/* renamed from: or0.f */
public final class C37717f implements C38333a {

    /* renamed from: g */
    public static final C37718a f90607g = new C37718a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C37252a f90608a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C37453b f90609b;

    /* renamed from: c */
    private final C37456e f90610c;

    /* renamed from: d */
    private final C37455d f90611d;

    /* renamed from: e */
    private final C37452a f90612e;

    /* renamed from: f */
    private final C37454c f90613f;

    /* renamed from: or0.f$a */
    public static final class C37718a {
        private C37718a() {
        }

        public /* synthetic */ C37718a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: or0.f$b */
    static final class C37719b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37717f f90614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37719b(C37717f fVar) {
            super(1);
            this.f90614d = fVar;
        }

        /* renamed from: a */
        public final C38783d invoke(LoanPaymentEntity loanPaymentEntity) {
            C41536l.m120489i(loanPaymentEntity, "loanPayment");
            return this.f90614d.f90609b.mo90585a(loanPaymentEntity);
        }
    }

    /* renamed from: or0.f$c */
    /* synthetic */ class C37720c extends C41535k implements C43075l {
        C37720c(Object obj) {
            super(1, obj, C37452a.class, "map", "map(Lge/bog/mobilebank/loans/data/model/LoanHistoryApiModel;)Lge/bog/mobilebank/loans/domain/model/LoanHistory;", 0);
        }

        /* renamed from: b */
        public final C38780a invoke(LoanHistoryApiModel loanHistoryApiModel) {
            C41536l.m120489i(loanHistoryApiModel, "p0");
            return ((C37452a) this.receiver).mo90584c(loanHistoryApiModel);
        }
    }

    /* renamed from: or0.f$d */
    /* synthetic */ class C37721d extends C41535k implements C43075l {
        C37721d(Object obj) {
            super(1, obj, C37454c.class, "map", "map(Lge/bog/mobilebank/loans/data/model/LoanPlnHistoryApiModel;)Lge/bog/mobilebank/loans/domain/model/LoanPlnHistory;", 0);
        }

        /* renamed from: b */
        public final C38785f invoke(LoanPlnHistoryApiModel loanPlnHistoryApiModel) {
            C41536l.m120489i(loanPlnHistoryApiModel, "p0");
            return ((C37454c) this.receiver).mo90586c(loanPlnHistoryApiModel);
        }
    }

    /* renamed from: or0.f$e */
    /* synthetic */ class C37722e extends C41535k implements C43075l {
        C37722e(Object obj) {
            super(1, obj, C37455d.class, "map", "map(Lge/bog/mobilebank/loans/data/model/LoanSchedulesApiModel;)Lge/bog/mobilebank/loans/domain/model/LoanSchedules;", 0);
        }

        /* renamed from: b */
        public final C38788i invoke(LoanSchedulesApiModel loanSchedulesApiModel) {
            C41536l.m120489i(loanSchedulesApiModel, "p0");
            return ((C37455d) this.receiver).mo90587a(loanSchedulesApiModel);
        }
    }

    /* renamed from: or0.f$f */
    /* synthetic */ class C37723f extends C41535k implements C43075l {
        C37723f(Object obj) {
            super(1, obj, C37456e.class, "map", "map(Lge/bog/mobilebank/loans/data/model/PawnLoanApiModel;)Lge/bog/mobilebank/loans/domain/model/PawnLoanData;", 0);
        }

        /* renamed from: b */
        public final C38790k invoke(PawnLoanApiModel pawnLoanApiModel) {
            C41536l.m120489i(pawnLoanApiModel, "p0");
            return ((C37456e) this.receiver).mo90588a(pawnLoanApiModel);
        }
    }

    public C37717f(C37252a aVar, C37453b bVar, C37456e eVar, C37455d dVar, C37452a aVar2, C37454c cVar) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(bVar, "mapper");
        C41536l.m120489i(eVar, "pawnLoanMapper");
        C41536l.m120489i(dVar, "loanScheduleMapper");
        C41536l.m120489i(aVar2, "loanHistoryMapper");
        C41536l.m120489i(cVar, "loanPlnHistoryMapper");
        this.f90608a = aVar;
        this.f90609b = bVar;
        this.f90610c = eVar;
        this.f90611d = dVar;
        this.f90612e = aVar2;
        this.f90613f = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final C38783d m110866p(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38783d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final C38780a m110867q(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38780a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final C38785f m110868r(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38785f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final C38788i m110869s(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38788i) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final C38790k m110870t(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38790k) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo90954a(String str, long j, String str2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "reversalReason");
        return this.f90608a.mo90341j("REVERSE_LOAN", str, j, str2);
    }

    /* renamed from: b */
    public C40762x mo90955b(long j) {
        C40762x A = this.f90608a.mo90333b(j).mo95062A(new C37712a(new C37720c(this.f90612e)));
        C41536l.m120488h(A, "service.getHistory(loanK…p(loanHistoryMapper::map)");
        return A;
    }

    /* renamed from: c */
    public C40762x mo90956c(long j) {
        C40762x A = this.f90608a.mo90334c(j).mo95062A(new C37715d(new C37721d(this.f90613f)));
        C41536l.m120488h(A, "service.getPlnHistory(lo…oanPlnHistoryMapper::map)");
        return A;
    }

    /* renamed from: d */
    public C40734b mo90957d(long j, String str, String str2) {
        C41536l.m120489i(str, "loanName");
        C41536l.m120489i(str2, "customerId");
        return this.f90608a.mo90335d(j, str, str2);
    }

    /* renamed from: e */
    public C40734b mo90958e(long j, String str, String str2) {
        C41536l.m120489i(str, "loanName");
        C41536l.m120489i(str2, "customerId");
        return this.f90608a.mo90336e(j, str, str2);
    }

    /* renamed from: f */
    public C40762x mo90959f(long j, String str, String str2, String str3) {
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "prodType");
        C40762x A = this.f90608a.mo90337f(j, str, str2, str3).mo95062A(new C37716e(new C37719b(this)));
        C41536l.m120488h(A, "override fun calculateLo…form(loanPayment) }\n    }");
        return A;
    }

    /* renamed from: g */
    public C40734b mo90960g(long j, String str, String str2, long j2, String str3, String str4) {
        C41536l.m120489i(str2, "ccy");
        return this.f90608a.mo90338g(j, str, str2, j2, str3, str4);
    }

    /* renamed from: h */
    public C40762x mo90961h(long j) {
        C40762x A = this.f90608a.mo90339h(j).mo95062A(new C37713b(new C37722e(this.f90611d)));
        C41536l.m120488h(A, "service.getSchedules(loa…(loanScheduleMapper::map)");
        return A;
    }

    /* renamed from: i */
    public C40762x mo90962i(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "loanKey");
        C41536l.m120489i(str4, "operationType");
        C40762x A = this.f90608a.mo90340i(str, str2, str3, str4).mo95062A(new C37714c(new C37723f(this.f90610c)));
        C41536l.m120488h(A, "service.payLoan(amount, ….map(pawnLoanMapper::map)");
        return A;
    }
}
