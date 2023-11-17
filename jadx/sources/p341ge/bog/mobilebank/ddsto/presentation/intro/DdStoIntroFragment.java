package p341ge.bog.mobilebank.ddsto.presentation.intro;

import aa0.C19217b;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ca0.C19671c;
import ca0.C19672d;
import ca0.C19673e;
import ca0.C19675g;
import ca0.C19676h;
import ca0.C19677i;
import ca0.C19679k;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actioncard.ActionCardData;
import p341ge.bog.designsystem.components.actioncard.ActionCardView;
import p341ge.bog.designsystem.components.actioncard.BadgeData;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.ddsto.presentation.intro.C22776a;
import p341ge.bog.mobilebank.ddsto.presentation.intro.C22780b;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p696zg.C19021a;
import q31.C38122f;
import q31.C38125h;
import s90.C28163a;
import ue1.C43064a;
import ue1.C43075l;
import v90.C29004b;
import x90.C29662b;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment */
public final class DdStoIntroFragment extends C22785d {

    /* renamed from: g */
    private final C41217g f60045g;

    /* renamed from: h */
    private C29004b f60046h;

    /* renamed from: i */
    private final C41217g f60047i = C41219i.m119470b(new C22759b(this));

    /* renamed from: j */
    private final C41217g f60048j = C41219i.m119470b(new C22770l(this));

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$a */
    public /* synthetic */ class C22758a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60049a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ca0.a[] r0 = ca0.C19669a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ca0.a r1 = ca0.C19669a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ca0.a r1 = ca0.C19669a.LOADING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ca0.a r1 = ca0.C19669a.ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f60049a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment.C22758a.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$b */
    static final class C22759b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DdStoIntroFragment f60050d;

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$b$a */
        /* synthetic */ class C22760a implements C22776a.C22777a, C41532h {

            /* renamed from: a */
            final /* synthetic */ DdStoIntroFragment f60051a;

            C22760a(DdStoIntroFragment ddStoIntroFragment) {
                this.f60051a = ddStoIntroFragment;
            }

            /* renamed from: a */
            public final void mo56564a(C19677i iVar) {
                C41536l.m120489i(iVar, "p0");
                this.f60051a.m73838B1(iVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C22776a.C22777a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60051a, DdStoIntroFragment.class, "onDdPressed", "onDdPressed(Lge/bog/mobilebank/ddsto/presentation/intro/DdStoIntroUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22759b(DdStoIntroFragment ddStoIntroFragment) {
            super(0);
            this.f60050d = ddStoIntroFragment;
        }

        /* renamed from: b */
        public final C22776a invoke() {
            return new C22776a(new C22760a(this.f60050d));
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$c */
    /* synthetic */ class C22761c extends C41535k implements C43075l {
        C22761c(Object obj) {
            super(1, obj, DdStoIntroFragment.class, "handleNavigationEvent", "handleNavigationEvent(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo56567b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DdStoIntroFragment) this.receiver).m73858x1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56567b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$d */
    /* synthetic */ class C22762d extends C41535k implements C43075l {
        C22762d(Object obj) {
            super(1, obj, DdStoIntroFragment.class, "handleErrorEvent", "handleErrorEvent(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo56568b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DdStoIntroFragment) this.receiver).m73857v1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56568b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$e */
    /* synthetic */ class C22763e extends C41535k implements C43075l {
        C22763e(Object obj) {
            super(1, obj, DdStoIntroFragment.class, "applyState", "applyState(Lge/bog/mobilebank/ddsto/presentation/intro/DdStoIntroState;)V", 0);
        }

        /* renamed from: b */
        public final void mo56569b(C19676h hVar) {
            C41536l.m120489i(hVar, "p0");
            ((DdStoIntroFragment) this.receiver).m73852q1(hVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56569b((C19676h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$f */
    static final class C22764f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60052a;

        C22764f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60052a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60052a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60052a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$g */
    public static final class C22765g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22765g(Fragment fragment) {
            super(0);
            this.f60053d = fragment;
        }

        public final Fragment invoke() {
            return this.f60053d;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$h */
    public static final class C22766h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22766h(C43064a aVar) {
            super(0);
            this.f60054d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f60054d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$i */
    public static final class C22767i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f60055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22767i(C41217g gVar) {
            super(0);
            this.f60055d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f60055d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$j */
    public static final class C22768j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60056d;

        /* renamed from: e */
        final /* synthetic */ C41217g f60057e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22768j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f60056d = aVar;
            this.f60057e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60056d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f60057e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$k */
    public static final class C22769k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60058d;

        /* renamed from: e */
        final /* synthetic */ C41217g f60059e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22769k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f60058d = fragment;
            this.f60059e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f60059e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f60058d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$l */
    static final class C22770l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DdStoIntroFragment f60060d;

        /* renamed from: ge.bog.mobilebank.ddsto.presentation.intro.DdStoIntroFragment$l$a */
        /* synthetic */ class C22771a implements C22776a.C22777a, C41532h {

            /* renamed from: a */
            final /* synthetic */ DdStoIntroFragment f60061a;

            C22771a(DdStoIntroFragment ddStoIntroFragment) {
                this.f60061a = ddStoIntroFragment;
            }

            /* renamed from: a */
            public final void mo56564a(C19677i iVar) {
                C41536l.m120489i(iVar, "p0");
                this.f60061a.m73839C1(iVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C22776a.C22777a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f60061a, DdStoIntroFragment.class, "onStoPressed", "onStoPressed(Lge/bog/mobilebank/ddsto/presentation/intro/DdStoIntroUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22770l(DdStoIntroFragment ddStoIntroFragment) {
            super(0);
            this.f60060d = ddStoIntroFragment;
        }

        /* renamed from: b */
        public final C22776a invoke() {
            return new C22776a(new C22771a(this.f60060d));
        }
    }

    public DdStoIntroFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C22766h(new C22765g(this)));
        this.f60045g = C1514j0.m5374c(this, C41520a0.m120436b(DdStoIntroViewModel$ViewModel.class), new C22767i(a), new C22768j((C43064a) null, a), new C22769k(this, a));
    }

    /* renamed from: A1 */
    private final void m73837A1(C29662b bVar) {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.mo91641y0(requireContext, C19675g.m65332a(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m73838B1(C19677i iVar) {
        m73856u1().mo56579sw(iVar.mo47874c());
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m73839C1(C19677i iVar) {
        m73856u1().mo56581uw(iVar.mo47874c());
    }

    /* renamed from: D1 */
    private final void m73840D1() {
        m73853r1().f73955n.setOnRefreshListener(new C19671c(this));
        C13364a aVar = new C13364a(C0767a.m2895e(requireContext(), C28163a.f71507c), true, false);
        RecyclerView recyclerView = m73853r1().f73949h;
        recyclerView.setAdapter(m73854s1());
        recyclerView.mo5351j(aVar);
        RecyclerView recyclerView2 = m73853r1().f73959r;
        recyclerView2.setAdapter(m73855t1());
        recyclerView2.mo5351j(aVar);
        ActionCardView actionCardView = m73853r1().f73947f;
        C19217b bVar = C19217b.f53431a;
        String f = C34646b.m101752f(bVar.mo47447b(), (Context) null, 1, (Object) null);
        String f2 = C34646b.m101752f(bVar.mo47446a(), (Context) null, 1, (Object) null);
        Image.Resource resource = r3;
        Image.Resource resource2 = new Image.Resource(C28163a.ddsto_intro_dd, (Boolean) null, 2, (DefaultConstructorMarker) null);
        C19021a aVar2 = C19021a.THUMBNAIL_4_3;
        actionCardView.setData(new ActionCardData(f, resource, aVar2, (Color) null, (Color) null, (Color) null, (Color) null, true, (Color) null, (BadgeData) null, f2, (String) null, (Color) null, (Color) null, (Color) null, false, (Integer) null, (String) null, (Color) null, 523128, (DefaultConstructorMarker) null));
        m73853r1().f73947f.setOnClickListener(new C19672d(this));
        ActionCardView actionCardView2 = m73853r1().f73957p;
        String f3 = C34646b.m101752f(bVar.mo47452g(), (Context) null, 1, (Object) null);
        String f4 = C34646b.m101752f(bVar.mo47451f(), (Context) null, 1, (Object) null);
        Image.Resource resource3 = r3;
        Image.Resource resource4 = new Image.Resource(C28163a.ddsto_intro_sto, (Boolean) null, 2, (DefaultConstructorMarker) null);
        actionCardView2.setData(new ActionCardData(f3, resource3, aVar2, (Color) null, (Color) null, (Color) null, (Color) null, true, (Color) null, (BadgeData) null, f4, (String) null, (Color) null, (Color) null, (Color) null, false, (Integer) null, (String) null, (Color) null, 523128, (DefaultConstructorMarker) null));
        m73853r1().f73957p.setOnClickListener(new C19673e(this));
        m73853r1().f73950i.setTitle(C34646b.m101752f(bVar.mo47448c(), (Context) null, 1, (Object) null));
        m73853r1().f73960s.setTitle(C34646b.m101752f(bVar.mo47453h(), (Context) null, 1, (Object) null));
        m73853r1().f73951j.setText(C34646b.m101752f(bVar.mo47449d(), (Context) null, 1, (Object) null));
        m73853r1().f73956o.mo53597e();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m73841E1(DdStoIntroFragment ddStoIntroFragment) {
        C41536l.m120489i(ddStoIntroFragment, "this$0");
        C21481a.onRefresh$default(ddStoIntroFragment.m73856u1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m73842F1(DdStoIntroFragment ddStoIntroFragment, View view) {
        C41536l.m120489i(ddStoIntroFragment, "this$0");
        ddStoIntroFragment.m73856u1().mo56578rw();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m73843G1(DdStoIntroFragment ddStoIntroFragment, View view) {
        C41536l.m120489i(ddStoIntroFragment, "this$0");
        ddStoIntroFragment.m73856u1().mo56580tw();
    }

    private final void observeData() {
        C19679k qw = m73856u1().mo56577qw();
        qw.mo47883me().mo4819k(getViewLifecycleOwner(), new C22764f(new C22761c(this)));
        qw.mo47884o3().mo4819k(getViewLifecycleOwner(), new C22764f(new C22762d(this)));
        qw.getState().mo4819k(getViewLifecycleOwner(), new C22764f(new C22763e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final void m73852q1(C19676h hVar) {
        int i = C22758a.f60049a[hVar.mo47865a().ordinal()];
        if (i == 1) {
            m73853r1().f73956o.mo53595c();
        } else if (i == 2) {
            m73853r1().f73956o.mo53597e();
        } else if (i == 3) {
            m73853r1().f73956o.mo53596d();
        }
        List b = hVar.mo47866b();
        LayerView layerView = m73853r1().f73948g;
        C41536l.m120488h(layerView, "binding.ddList");
        C32343x.m95483r1(layerView, !b.isEmpty(), false, 2, (Object) null);
        m73854s1().mo6029i(b);
        List d = hVar.mo47868d();
        LayerView layerView2 = m73853r1().f73958q;
        C41536l.m120488h(layerView2, "binding.stoList");
        C32343x.m95483r1(layerView2, true ^ d.isEmpty(), false, 2, (Object) null);
        m73855t1().mo6029i(d);
        LayerView layerView3 = m73853r1().f73952k;
        C41536l.m120488h(layerView3, "binding.emptyBannerContainer");
        C32343x.m95483r1(layerView3, hVar.mo47867c(), false, 2, (Object) null);
        m73853r1().f73955n.setRefreshing(false);
    }

    /* renamed from: r1 */
    private final C29004b m73853r1() {
        C29004b bVar = this.f60046h;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: s1 */
    private final C22776a m73854s1() {
        return (C22776a) this.f60047i.getValue();
    }

    /* renamed from: t1 */
    private final C22776a m73855t1() {
        return (C22776a) this.f60048j.getValue();
    }

    /* renamed from: u1 */
    private final DdStoIntroViewModel$ViewModel m73856u1() {
        return (DdStoIntroViewModel$ViewModel) this.f60045g.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m73857v1(C37223a aVar) {
        Throwable th = (Throwable) aVar.mo90296a();
        if (th != null) {
            handleError(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m73858x1(C37223a aVar) {
        C22780b bVar = (C22780b) aVar.mo90296a();
        if (bVar != null) {
            if (bVar instanceof C22780b.C22783c) {
                m73837A1(((C22780b.C22783c) bVar).mo56591a());
            } else if (bVar instanceof C22780b.C22782b) {
                m73860z1();
            } else if (bVar instanceof C22780b.C22781a) {
                m73859y1();
            }
        }
    }

    /* renamed from: y1 */
    private final void m73859y1() {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.mo91592a1(requireContext, "automatic_services", (String) null, true);
    }

    /* renamed from: z1 */
    private final void m73860z1() {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.mo91548F(requireContext);
    }

    public String getHeaderText() {
        return C34646b.m101752f(C19217b.f53431a.mo47450e(), (Context) null, 1, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f60046h = C29004b.m88742d(layoutInflater, viewGroup, false);
        SwipeRefreshLayout c = m73853r1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f60046h = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m73840D1();
        observeData();
    }
}
