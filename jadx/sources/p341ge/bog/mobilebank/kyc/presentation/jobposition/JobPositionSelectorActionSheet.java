package p341ge.bog.mobilebank.kyc.presentation.jobposition;

import an0.C10105a;
import an0.C10108d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import en0.C12716b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37224b;
import mn0.C16802a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.search.SearchView;
import p642vh.C18368l;
import rn0.C17682c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet */
public final class JobPositionSelectorActionSheet extends C16802a {

    /* renamed from: G */
    private C12716b f42982G;

    /* renamed from: H */
    private final C41217g f42983H;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$a */
    static final class C14871a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17682c f42984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14871a(C17682c cVar) {
            super(1);
            this.f42984d = cVar;
        }

        /* renamed from: a */
        public final void mo41518a(String str) {
            C41536l.m120489i(str, "changed");
            this.f42984d.mo45246g(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41518a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$b */
    static final class C14872b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JobPositionSelectorActionSheet f42985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14872b(JobPositionSelectorActionSheet jobPositionSelectorActionSheet) {
            super(1);
            this.f42985d = jobPositionSelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41519a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f42985d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41519a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$c */
    static final class C14873c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17682c f42986d;

        /* renamed from: e */
        final /* synthetic */ JobPositionSelectorActionSheet f42987e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14873c(C17682c cVar, JobPositionSelectorActionSheet jobPositionSelectorActionSheet) {
            super(1);
            this.f42986d = cVar;
            this.f42987e = jobPositionSelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41520a(C41224m mVar) {
            this.f42986d.mo45251o((List) mVar.mo95675a(), (String) mVar.mo95676b());
            this.f42987e.m54634f2().f37608e.mo5425x1(this.f42986d.mo45247i());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41520a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$d */
    static final class C14874d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JobPositionSelectorActionSheet f42988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14874d(JobPositionSelectorActionSheet jobPositionSelectorActionSheet) {
            super(1);
            this.f42988d = jobPositionSelectorActionSheet;
        }

        /* renamed from: a */
        public final void mo41521a(String str) {
            C41536l.m120489i(str, "it");
            this.f42988d.m54635g2().mo41529qw().mo41524C(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41521a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$e */
    static final class C14875e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42989a;

        C14875e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42989a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42989a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42989a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$f */
    public static final class C14876f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14876f(Fragment fragment) {
            super(0);
            this.f42990d = fragment;
        }

        public final Fragment invoke() {
            return this.f42990d;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$g */
    public static final class C14877g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14877g(C43064a aVar) {
            super(0);
            this.f42991d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42991d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$h */
    public static final class C14878h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14878h(C41217g gVar) {
            super(0);
            this.f42992d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42992d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$i */
    public static final class C14879i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42993d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42994e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14879i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42993d = aVar;
            this.f42994e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42993d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42994e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.jobposition.JobPositionSelectorActionSheet$j */
    public static final class C14880j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42995d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42996e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14880j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f42995d = fragment;
            this.f42996e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f42996e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f42995d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public JobPositionSelectorActionSheet() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14877g(new C14876f(this)));
        this.f42983H = C1514j0.m5374c(this, C41520a0.m120436b(JobPositionSelectorViewModel$ViewModel.class), new C14878h(a), new C14879i((C43064a) null, a), new C14880j(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final C12716b m54634f2() {
        C12716b bVar = this.f42982G;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final JobPositionSelectorViewModel$ViewModel m54635g2() {
        return (JobPositionSelectorViewModel$ViewModel) this.f42983H.getValue();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f42982G = C12716b.m48258d(layoutInflater, viewGroup, true);
        SearchView searchView = m54634f2().f37609f;
        C41536l.m120488h(searchView, "binding.searchView");
        C32343x.m95483r1(searchView, false, false, 2, (Object) null);
        mo26369Z1(C18368l.m62762k(500));
        mo26370a2(getString(C10108d.title_action_sheet_job_position_selector));
        C17682c cVar = new C17682c();
        cVar.mo45250n(new C14874d(this));
        m54634f2().f37608e.setAdapter(cVar);
        m54634f2().f37608e.mo5351j(new C13364a(requireContext().getDrawable(C10105a.f27870a), true, false));
        m54634f2().f37609f.setOnTextChangeListener(new C14871a(cVar));
        LiveData p = m54635g2().mo41530rw().mo41528p();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(p, viewLifecycleOwner, new C14872b(this));
        m54635g2().mo41530rw().mo41526b().mo4819k(getViewLifecycleOwner(), new C14875e(new C14873c(cVar, this)));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42982G = null;
    }
}
