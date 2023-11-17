package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g40.C20694i;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import i40.C25115a;
import i40.C25117c;
import iu0.C36546y;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.activity.AnalysisFragmentActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetHistoryActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.BudgetingViewModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10322k;
import p366bk.C10324m;
import p380ck.C10464h;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import z30.C30146d;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment */
public final class BudgetFragment extends C35651n1 {

    /* renamed from: g */
    public static final C22098a f58767g = new C22098a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f58768d = C41219i.m119470b(new C22105h(this));

    /* renamed from: e */
    private final C20694i f58769e = new C20694i();

    /* renamed from: f */
    private final C41217g f58770f;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$a */
    public static final class C22098a {
        private C22098a() {
        }

        public /* synthetic */ C22098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$b */
    public static final class C22099b implements C20694i.C20695a {

        /* renamed from: a */
        final /* synthetic */ BudgetFragment f58771a;

        C22099b(BudgetFragment budgetFragment) {
            this.f58771a = budgetFragment;
        }

        /* renamed from: a */
        public void mo49218a(ArrayList arrayList) {
            C41536l.m120489i(arrayList, "budgetsToEdit");
            C36546y.m108282F().mo27137H("budgeting", "open_edit", "from_budget_list_page", (Bundle) null, C10464h.C10465a.FIREBASE);
            EditBudgetActivity.C22081a aVar = EditBudgetActivity.f58730R;
            C1505h requireActivity = this.f58771a.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            aVar.mo54860a(requireActivity, arrayList, true);
            this.f58771a.requireActivity().finish();
        }

        /* renamed from: b */
        public void mo49219b() {
            C36546y.m108282F().mo27137H("budgeting", "open_add", "from_budget_list_page", (Bundle) null, C10464h.C10465a.FIREBASE);
            AddBudgetActivity.C22058a aVar = AddBudgetActivity.f58698O;
            C1505h requireActivity = this.f58771a.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            aVar.mo54840b(true, requireActivity);
            this.f58771a.requireActivity().finish();
        }

        /* renamed from: c */
        public void mo49220c() {
            C36546y.m108282F().mo27137H("budgeting", "open_history", "from_budget_list_page", (Bundle) null, C10464h.C10465a.FIREBASE);
            BudgetHistoryActivity.C22070a aVar = BudgetHistoryActivity.f58717J;
            Context requireContext = this.f58771a.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo54848a(requireContext);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$c */
    static final class C22100c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetFragment f58772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22100c(BudgetFragment budgetFragment) {
            super(0);
            this.f58772d = budgetFragment;
        }

        public final void invoke() {
            this.f58772d.m71606n1().mo54920iw();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$d */
    static final class C22101d extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ BudgetFragment f58773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22101d(BudgetFragment budgetFragment) {
            super(2);
            this.f58773d = budgetFragment;
        }

        /* renamed from: a */
        public final void mo54879a(C25115a aVar, long j) {
            C41536l.m120489i(aVar, "budget");
            this.f58773d.m71612t1(aVar, Long.valueOf(j));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo54879a((C25115a) obj, ((Number) obj2).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$e */
    /* synthetic */ class C22102e extends C41535k implements C43075l {
        C22102e(Object obj) {
            super(1, obj, BudgetFragment.class, "onSuccess", "onSuccess(Lge/bog/mobilebank/cleanarch/presentation/pfm/budgeting/model/BudgetingDataResponseModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo54880b(C25117c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((BudgetFragment) this.receiver).m71611s1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54880b((C25117c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$f */
    /* synthetic */ class C22103f extends C41535k implements C43075l {
        C22103f(Object obj) {
            super(1, obj, BudgetFragment.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54881b(boolean z) {
            ((BudgetFragment) this.receiver).m71610r1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54881b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$g */
    /* synthetic */ class C22104g extends C41535k implements C43075l {
        C22104g(Object obj) {
            super(1, obj, BudgetFragment.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo54882b(C21503d.C21504a aVar) {
            ((BudgetFragment) this.receiver).handleError(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54882b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$h */
    static final class C22105h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetFragment f58774d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22105h(BudgetFragment budgetFragment) {
            super(0);
            this.f58774d = budgetFragment;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f58774d.findView(C10322k.f28709Ar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$i */
    public static final class C22106i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f58775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22106i(Fragment fragment) {
            super(0);
            this.f58775d = fragment;
        }

        public final Fragment invoke() {
            return this.f58775d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$j */
    public static final class C22107j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22107j(C43064a aVar) {
            super(0);
            this.f58776d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f58776d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$k */
    public static final class C22108k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f58777d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22108k(C41217g gVar) {
            super(0);
            this.f58777d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f58777d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$l */
    public static final class C22109l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58778d;

        /* renamed from: e */
        final /* synthetic */ C41217g f58779e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22109l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f58778d = aVar;
            this.f58779e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58778d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f58779e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.fragment.BudgetFragment$m */
    public static final class C22110m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f58780d;

        /* renamed from: e */
        final /* synthetic */ C41217g f58781e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22110m(Fragment fragment, C41217g gVar) {
            super(0);
            this.f58780d = fragment;
            this.f58781e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f58781e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f58780d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public BudgetFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C22107j(new C22106i(this)));
        this.f58770f = C1514j0.m5374c(this, C41520a0.m120436b(BudgetingViewModel.class), new C22108k(a), new C22109l((C43064a) null, a), new C22110m(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final BudgetingViewModel m71606n1() {
        return (BudgetingViewModel) this.f58770f.getValue();
    }

    /* renamed from: o1 */
    private final RecyclerView m71607o1() {
        Object value = this.f58768d.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: p1 */
    private final void m71608p1() {
        m71607o1().setLayoutManager(new LinearLayoutManager(getContext()));
        m71607o1().setAdapter(this.f58769e);
        this.f58769e.mo49212O(new C22099b(this));
        this.f58769e.mo49215R(new C22100c(this));
        this.f58769e.mo49214Q(new C22101d(this));
    }

    /* renamed from: q1 */
    private final void m71609q1() {
        LiveData mw = m71606n1().mo54921mw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C21484c.m69411c(mw, viewLifecycleOwner, new C22102e(this), new C22103f(this), new C22104g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final void m71610r1(boolean z) {
        if (z) {
            this.f58769e.mo49217T();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m71611s1(C25117c cVar) {
        this.f58769e.mo49213P(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m71612t1(C25115a aVar, Long l) {
        long j;
        AnalysisFragmentActivity.C22038a aVar2 = AnalysisFragmentActivity.f58644F;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        AnalysisFragmentActivity.C22039b.C22040a aVar3 = new AnalysisFragmentActivity.C22039b.C22040a(aVar.mo63629c());
        C30146d.C30148b bVar = C30146d.C30148b.EXPENSES;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        aVar2.mo54771a(requireContext, aVar3, bVar, j);
    }

    public void handleError(C21503d.C21504a aVar) {
        super.handleError(aVar);
        this.f58769e.mo49216S();
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_budget;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m71609q1();
        m71608p1();
        m71606n1().mo54920iw();
    }
}
