package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b41.C31128a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ie0.C25185e;
import ie0.C25190j;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.GTWatchlistDetailsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.C24015a;
import p420fh.C12902d;
import p434gh.C15278a;
import ue0.C28741n0;
import ue1.C43064a;
import ue1.C43075l;
import vg0.C29056b;
import wg0.C29372b;
import yg0.C30036e;
import zg0.C30301d;
import zg0.C30302e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b */
public final class C24019b extends C24029c implements C24015a.C24016a, C30036e.C30039c, C30036e.C30038b, C29056b.C29057a, C29372b.C29374b {

    /* renamed from: j */
    public static final C24020a f62335j = new C24020a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28741n0 f62336g;

    /* renamed from: h */
    private final C41217g f62337h;

    /* renamed from: i */
    private final C41217g f62338i = C41219i.m119470b(new C24028i(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$a */
    public static final class C24020a {
        private C24020a() {
        }

        public /* synthetic */ C24020a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24019b mo61027a() {
            return new C24019b();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$b */
    static final class C24021b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24019b f62339d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24021b(C24019b bVar) {
            super(1);
            this.f62339d = bVar;
        }

        /* renamed from: a */
        public final void mo61028a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f62339d.m77491n1().f73399i.setRefreshing(false);
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                if (((List) cVar.mo71340a()).isEmpty()) {
                    this.f62339d.m77491n1().f73398h.setVisibility(8);
                    this.f62339d.m77491n1().f73397g.setVisibility(0);
                    return;
                }
                this.f62339d.m77491n1().f73398h.setVisibility(0);
                this.f62339d.m77491n1().f73397g.setVisibility(8);
                this.f62339d.m77493p1().mo6029i((List) cVar.mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f62339d.m77491n1().f73399i.setRefreshing(false);
            } else if (aVar instanceof C31128a.C31130b) {
                this.f62339d.m77491n1().f73399i.setRefreshing(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61028a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$c */
    static final class C24022c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62340a;

        C24022c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62340a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62340a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62340a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$d */
    public static final class C24023d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24023d(Fragment fragment) {
            super(0);
            this.f62341d = fragment;
        }

        public final Fragment invoke() {
            return this.f62341d;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$e */
    public static final class C24024e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24024e(C43064a aVar) {
            super(0);
            this.f62342d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f62342d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$f */
    public static final class C24025f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f62343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24025f(C41217g gVar) {
            super(0);
            this.f62343d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f62343d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$g */
    public static final class C24026g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62344d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62345e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24026g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f62344d = aVar;
            this.f62345e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62344d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f62345e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$h */
    public static final class C24027h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62346d;

        /* renamed from: e */
        final /* synthetic */ C41217g f62347e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24027h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f62346d = fragment;
            this.f62347e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f62347e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f62346d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.list.b$i */
    static final class C24028i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24019b f62348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24028i(C24019b bVar) {
            super(0);
            this.f62348d = bVar;
        }

        /* renamed from: b */
        public final C24015a invoke() {
            C24015a aVar = new C24015a((List) null, 1, (DefaultConstructorMarker) null);
            aVar.mo61021p(this.f62348d);
            return aVar;
        }
    }

    public C24019b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24024e(new C24023d(this)));
        this.f62337h = C1514j0.m5374c(this, C41520a0.m120436b(GTWatchListViewModel$ViewModel.class), new C24025f(a), new C24026g((C43064a) null, a), new C24027h(this, a));
    }

    /* renamed from: m1 */
    private final void m77490m1(String str, C15278a aVar) {
        C12902d.C12903a aVar2 = C12902d.f38098b;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12902d.C12903a.m48771e(aVar2, requireActivity, false, 2, (Object) null).mo33652k(str, aVar, (C12902d.C12905b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final C28741n0 m77491n1() {
        C28741n0 n0Var = this.f62336g;
        C41536l.m120486f(n0Var);
        return n0Var;
    }

    /* renamed from: o1 */
    private final GTWatchListViewModel$ViewModel m77492o1() {
        return (GTWatchListViewModel$ViewModel) this.f62337h.getValue();
    }

    private final void observeData() {
        m77492o1().mo61013gw().mo61015w().mo4819k(getViewLifecycleOwner(), new C24022c(new C24021b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C24015a m77493p1() {
        return (C24015a) this.f62338i.getValue();
    }

    /* renamed from: q1 */
    private final void m77494q1() {
        C28741n0 n1 = m77491n1();
        n1.f73399i.setOnRefreshListener(new C30301d(this));
        n1.f73395e.setTitle(getString(C25190j.gt_watchlists_header_title));
        n1.f73398h.setAdapter(m77493p1());
        n1.f73398h.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C25185e.f64662u)));
        n1.f73396f.setOnClickListener(new C30302e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m77495r1(C24019b bVar) {
        C41536l.m120489i(bVar, "this$0");
        C21481a.onRefresh$default(bVar.m77492o1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m77496s1(C24019b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C29372b.f74456J.mo69226a(bVar).mo4576A1(bVar.getChildFragmentManager(), (String) null);
    }

    /* renamed from: E0 */
    public void mo60704E0(WatchList watchList, String str, C15278a aVar) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "feedbackType");
        if (watchList == null) {
            m77490m1(str, aVar);
            return;
        }
        C21481a.onRefresh$default(m77492o1(), 0, 1, (Object) null);
        mo60789K0(watchList);
    }

    /* renamed from: K0 */
    public void mo60789K0(WatchList watchList) {
        C41536l.m120489i(watchList, "watchList");
        GTWatchlistDetailsActivity.C23989a aVar = GTWatchlistDetailsActivity.f62287L;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo60988a(requireContext, watchList.mo60081a(), watchList.mo60082b());
    }

    /* renamed from: M0 */
    public void mo60790M0(WatchList watchList) {
        C41536l.m120489i(watchList, "watchList");
        C30036e.f75865M.mo70332a(watchList.mo60081a(), watchList.mo60082b(), this, this).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: W */
    public void mo61024W(String str, C15278a aVar) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "feedbackType");
        m77490m1(str, aVar);
        C21481a.onRefresh$default(m77492o1(), 0, 1, (Object) null);
    }

    /* renamed from: d0 */
    public void mo61025d0(String str, C15278a aVar) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "feedbackType");
        m77490m1(str, aVar);
        C21481a.onRefresh$default(m77492o1(), 0, 1, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62336g = C28741n0.m88090d(layoutInflater, viewGroup, false);
        SwipeRefreshLayout c = m77491n1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62336g = null;
    }

    public void onResume() {
        super.onResume();
        C21481a.onRefresh$default(m77492o1(), 0, 1, (Object) null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m77494q1();
        observeData();
    }

    /* renamed from: v0 */
    public void mo61026v0(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "watchListId");
        C41536l.m120489i(str, "watchListName");
        C29056b.f74039L.mo68920a(bigDecimal, str, this).mo4576A1(getChildFragmentManager(), (String) null);
    }
}
