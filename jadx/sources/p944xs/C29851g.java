package p944xs;

import com.google.gson.Gson;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingExpensesEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.BudgetingResponseEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.budgeting.entity.EditBudgetResponseEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p936wv.C29576b;
import p936wv.C29581g;
import p936wv.C29582h;
import p947xv.C29860a;
import p955ys.C30112a;
import ue1.C43075l;

/* renamed from: xs.g */
public final class C29851g implements C29860a {

    /* renamed from: i */
    public static final C29852a f75550i = new C29852a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f75551d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C30112a f75552e;

    /* renamed from: f */
    private final Gson f75553f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C40765a f75554g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicBoolean f75555h = new AtomicBoolean(false);

    /* renamed from: xs.g$a */
    public static final class C29852a {
        private C29852a() {
        }

        public /* synthetic */ C29852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xs.g$b */
    static final class C29853b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29851g f75556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29853b(C29851g gVar) {
            super(1);
            this.f75556d = gVar;
        }

        /* renamed from: a */
        public final C29582h invoke(EditBudgetResponseEntity editBudgetResponseEntity) {
            C41536l.m120489i(editBudgetResponseEntity, "it");
            return this.f75556d.f75552e.mo70400h(editBudgetResponseEntity);
        }
    }

    /* renamed from: xs.g$c */
    static final class C29854c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29851g f75557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29854c(C29851g gVar) {
            super(1);
            this.f75557d = gVar;
        }

        /* renamed from: a */
        public final void mo70107a(C41205b bVar) {
            this.f75557d.f75555h.set(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70107a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xs.g$d */
    static final class C29855d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29851g f75558d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29855d(C29851g gVar) {
            super(1);
            this.f75558d = gVar;
        }

        /* renamed from: a */
        public final C29581g invoke(BudgetingResponseEntity budgetingResponseEntity) {
            C41536l.m120489i(budgetingResponseEntity, "it");
            return this.f75558d.f75552e.mo70399g(budgetingResponseEntity);
        }
    }

    /* renamed from: xs.g$e */
    static final class C29856e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29851g f75559d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29856e(C29851g gVar) {
            super(1);
            this.f75559d = gVar;
        }

        /* renamed from: a */
        public final void mo70109a(C29581g gVar) {
            this.f75559d.f75554g.onNext(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70109a((C29581g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xs.g$f */
    static final class C29857f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29851g f75560d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29857f(C29851g gVar) {
            super(1);
            this.f75560d = gVar;
        }

        /* renamed from: a */
        public final List invoke(BudgetingExpensesEntity budgetingExpensesEntity) {
            C41536l.m120489i(budgetingExpensesEntity, "it");
            return this.f75560d.f75552e.mo70398a(budgetingExpensesEntity);
        }
    }

    public C29851g(IRetrofitService iRetrofitService, C30112a aVar, Gson gson) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(gson, "gson");
        this.f75551d = iRetrofitService;
        this.f75552e = aVar;
        this.f75553f = gson;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create()");
        this.f75554g = h1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final C29582h m90633i4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29582h) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m90634j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final C29581g m90635k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29581g) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final void m90636l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final void m90637m4(C29851g gVar) {
        C41536l.m120489i(gVar, "this$0");
        gVar.f75555h.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final List m90638n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: K0 */
    public C40749p mo70100K0() {
        return this.f75554g;
    }

    /* renamed from: L1 */
    public C40762x mo70101L1() {
        C40762x l = this.f75551d.getBudgetingData("PFM_BUDGET_GOALS_GET_ALL").mo95083l(new C29847c(new C29854c(this)));
        C41536l.m120488h(l, "override fun getBudgetin…alse)\n            }\n    }");
        C40762x n = C19273c.m64722h(l).mo95062A(new C29848d(new C29855d(this))).mo95084m(new C29849e(new C29856e(this))).mo95085n(new C29850f(this));
        C41536l.m120488h(n, "override fun getBudgetin…alse)\n            }\n    }");
        return n;
    }

    public void clean() {
        this.f75554g.onComplete();
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create()");
        this.f75554g = h1;
        this.f75555h = new AtomicBoolean(false);
    }

    /* renamed from: d1 */
    public C40762x mo70102d1(String str, String str2) {
        C41536l.m120489i(str, "fromDate");
        C41536l.m120489i(str2, "toDate");
        C40762x<BankApiResponse<BudgetingExpensesEntity>> budgetingHistory = this.f75551d.getBudgetingHistory("PFM_ANALYSIS_EXPENSES_GET_GROUPED_BY_MONTH_AND_CATEGORY", str, str2);
        C41536l.m120488h(budgetingHistory, "service.getBudgetingHist…         toDate\n        )");
        C40762x A = C19273c.m64722h(budgetingHistory).mo95062A(new C29846b(new C29857f(this)));
        C41536l.m120488h(A, "override fun getBudgetin…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: n2 */
    public C40762x mo70103n2(List list, List list2) {
        C41536l.m120489i(list, "updatedBudgets");
        C41536l.m120489i(list2, "budgets");
        IRetrofitService iRetrofitService = this.f75551d;
        Gson gson = this.f75553f;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C29576b) it.next()).mo69437e());
        }
        String w = gson.mo18181w(arrayList);
        Gson gson2 = this.f75553f;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C29576b) it2.next()).mo69437e());
        }
        C40762x<BankApiResponse<EditBudgetResponseEntity>> createAndUpdateBudget = iRetrofitService.createAndUpdateBudget("PFM_BUDGET_GOALS_BATCH_CREATE_AND_UPDATE", w, gson2.mo18181w(arrayList2));
        C41536l.m120488h(createAndUpdateBudget, "service.createAndUpdateB…t.toEntity() })\n        )");
        C40762x A = C19273c.m64722h(createAndUpdateBudget).mo95062A(new C29845a(new C29853b(this)));
        C41536l.m120488h(A, "override fun createUpdat…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: q2 */
    public boolean mo70104q2() {
        return this.f75554g.mo95101k1() || this.f75555h.get();
    }

    /* renamed from: t1 */
    public C40734b mo70105t1(List list) {
        C41536l.m120489i(list, "deletedBudgets");
        IRetrofitService iRetrofitService = this.f75551d;
        Gson gson = this.f75553f;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C29576b) it.next()).mo69437e());
        }
        C40762x<BankApiResponse<Object>> deleteBudget = iRetrofitService.deleteBudget("PFM_BUDGET_GOALS_BATCH_DELETE", gson.mo18181w(arrayList));
        C41536l.m120488h(deleteBudget, "service.deleteBudget(\n  …t.toEntity() })\n        )");
        return C19273c.m64720f(deleteBudget);
    }
}
