package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g40.C20682h;
import he1.C41217g;
import he1.C41238w;
import i40.C25115a;
import i40.C25118d;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetHistoryViewModel;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import z30.C30146d;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity */
public final class BudgetHistoryActivity extends C30772sa {

    /* renamed from: J */
    public static final C22070a f58717J = new C22070a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f58718F = C41219i.m119470b(new C22077h(this));

    /* renamed from: G */
    private final C41217g f58719G = C41219i.m119470b(new C22072c(this));

    /* renamed from: H */
    private final C41217g f58720H = new C1617p0(C41520a0.m120436b(BudgetHistoryViewModel.class), new C22079j(this), new C22078i(this), new C22080k((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C20682h f58721I;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$a */
    public static final class C22070a {
        private C22070a() {
        }

        public /* synthetic */ C22070a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54848a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, BudgetHistoryActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$b */
    public final class C22071b implements C20682h.C20693e {
        public C22071b() {
        }

        /* renamed from: a */
        public void mo49208a(int i) {
            C20682h E2 = BudgetHistoryActivity.this.f58721I;
            if (E2 == null) {
                C41536l.m120506z("recyclerAdapter");
                E2 = null;
            }
            E2.mo49200P(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$c */
    static final class C22072c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetHistoryActivity f58723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22072c(BudgetHistoryActivity budgetHistoryActivity) {
            super(0);
            this.f58723d = budgetHistoryActivity;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f58723d.findViewById(C10322k.f28784Qe);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$d */
    /* synthetic */ class C22073d extends C41535k implements C43075l {
        C22073d(Object obj) {
            super(1, obj, BudgetHistoryActivity.class, "onBudgetingHistoryDataLoaded", "onBudgetingHistoryDataLoaded(Lge/bog/mobilebank/cleanarch/presentation/pfm/budgeting/model/BudgetingHistoryModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo54850b(C25118d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((BudgetHistoryActivity) this.receiver).m71524M2(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54850b((C25118d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$e */
    /* synthetic */ class C22074e extends C41535k implements C43075l {
        C22074e(Object obj) {
            super(1, obj, BudgetHistoryActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54851b(boolean z) {
            ((BudgetHistoryActivity) this.receiver).m71525N2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54851b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$f */
    /* synthetic */ class C22075f extends C41535k implements C43075l {
        C22075f(Object obj) {
            super(1, obj, BudgetHistoryActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo54852b(C21503d.C21504a aVar) {
            ((BudgetHistoryActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54852b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$g */
    static final class C22076g extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ BudgetHistoryActivity f58724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22076g(BudgetHistoryActivity budgetHistoryActivity) {
            super(2);
            this.f58724d = budgetHistoryActivity;
        }

        /* renamed from: a */
        public final void mo54853a(C25115a aVar, Long l) {
            C41536l.m120489i(aVar, "budget");
            this.f58724d.m71526O2(aVar, l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo54853a((C25115a) obj, (Long) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$h */
    static final class C22077h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetHistoryActivity f58725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22077h(BudgetHistoryActivity budgetHistoryActivity) {
            super(0);
            this.f58725d = budgetHistoryActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f58725d.findViewById(C10322k.rv_budget_history);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$i */
    public static final class C22078i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22078i(ComponentActivity componentActivity) {
            super(0);
            this.f58726d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58726d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$j */
    public static final class C22079j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22079j(ComponentActivity componentActivity) {
            super(0);
            this.f58727d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58727d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity$k */
    public static final class C22080k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58728d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58729e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22080k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58728d = aVar;
            this.f58729e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58728d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58729e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: I2 */
    private final BudgetHistoryViewModel m71520I2() {
        return (BudgetHistoryViewModel) this.f58720H.getValue();
    }

    /* renamed from: J2 */
    private final LinearLayout m71521J2() {
        Object value = this.f58719G.getValue();
        C41536l.m120488h(value, "<get-loader>(...)");
        return (LinearLayout) value;
    }

    /* renamed from: K2 */
    private final RecyclerView m71522K2() {
        Object value = this.f58718F.getValue();
        C41536l.m120488h(value, "<get-rvBudgetHistory>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: L2 */
    private final void m71523L2() {
        C21484c.m69411c(m71520I2().mo54916sw(), this, new C22073d(this), new C22074e(this), new C22075f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m71524M2(C25118d dVar) {
        C20682h hVar = this.f58721I;
        if (hVar == null) {
            C41536l.m120506z("recyclerAdapter");
            hVar = null;
        }
        hVar.mo49199O(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m71525N2(boolean z) {
        m71521J2().setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m71526O2(C25115a aVar, Long l) {
        long j;
        AnalysisFragmentActivity.C22038a aVar2 = AnalysisFragmentActivity.f58644F;
        AnalysisFragmentActivity.C22039b.C22040a aVar3 = new AnalysisFragmentActivity.C22039b.C22040a(aVar.mo63629c());
        C30146d.C30148b bVar = C30146d.C30148b.EXPENSES;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        aVar2.mo54771a(this, aVar3, bVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_budget_history;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f58721I = new C20682h(new C22071b(), new C22076g(this));
        m71522K2().setLayoutManager(new LinearLayoutManager(this));
        RecyclerView K2 = m71522K2();
        C20682h hVar = this.f58721I;
        if (hVar == null) {
            C41536l.m120506z("recyclerAdapter");
            hVar = null;
        }
        K2.setAdapter(hVar);
        m71523L2();
        m71520I2().mo54915ow();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.budget_history);
        C41536l.m120488h(string, "getString(R.string.budget_history)");
        return string;
    }
}
