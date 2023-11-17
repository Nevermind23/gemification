package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import j40.C25326a;
import k40.C25639k;
import k40.C25640l;
import k40.C25641m;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p925vv.C29176h;
import p936wv.C29581g;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetingViewModel */
public final class BudgetingViewModel extends C21481a {

    /* renamed from: d */
    private final C29176h f58807d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25326a f58808e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f58809f = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetingViewModel$a */
    static final class C22119a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BudgetingViewModel f58810d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22119a(BudgetingViewModel budgetingViewModel) {
            super(1);
            this.f58810d = budgetingViewModel;
        }

        /* renamed from: a */
        public final void mo54922a(C41205b bVar) {
            C21484c.m69417i(this.f58810d.f58809f, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54922a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetingViewModel$b */
    static final class C22120b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BudgetingViewModel f58811d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22120b(BudgetingViewModel budgetingViewModel) {
            super(1);
            this.f58811d = budgetingViewModel;
        }

        /* renamed from: a */
        public final void mo54923a(C41224m mVar) {
            C21484c.m69418j(this.f58811d.f58809f, this.f58811d.f58808e.mo63895e(((C29581g) mVar.mo95678e()).mo69470a()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54923a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetingViewModel$c */
    static final class C22121c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BudgetingViewModel f58812d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22121c(BudgetingViewModel budgetingViewModel) {
            super(1);
            this.f58812d = budgetingViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58812d.f58809f, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BudgetingViewModel(C29176h hVar, C25326a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "budgetsAndCategoriesUseCase");
        C41536l.m120489i(aVar, "budgetingMapper");
        this.f58807d = hVar;
        this.f58808e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m71677jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m71678kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final void m71679lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: iw */
    public final void mo54920iw() {
        C41205b I = this.f58807d.mo69015b().mo95083l(new C25639k(new C22119a(this))).mo95070I(new C25640l(new C22120b(this)), new C25641m(new C22121c(this)));
        C41536l.m120488h(I, "fun getBudgetingData() {…or(it) })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: mw */
    public final LiveData mo54921mw() {
        return this.f58809f;
    }
}
