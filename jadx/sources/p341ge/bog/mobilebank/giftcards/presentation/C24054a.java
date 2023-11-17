package p341ge.bog.mobilebank.giftcards.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.tabgroup.TabsGroupView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import q31.C38125h;
import th0.C28398f;
import ue1.C43064a;
import ue1.C43075l;
import wi0.C29424e;
import yh0.C30056a;
import yh0.C30057b;
import yh0.C30058c;
import yh0.C30065j;
import yh0.C30066k;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.a */
public final class C24054a extends C24073b implements C21507e {

    /* renamed from: l */
    public static final C24055a f62399l = new C24055a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28398f f62400g;

    /* renamed from: h */
    private C30065j f62401h;

    /* renamed from: i */
    private final C41217g f62402i = C1514j0.m5374c(this, C41520a0.m120436b(DiscoveryFragmentContainerViewModel$ViewModel.class), new C24059e(this), new C24060f((C43064a) null, this), new C24061g(this));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List f62403j = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C21507e f62404k;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.a$a */
    public static final class C24055a {
        private C24055a() {
        }

        public /* synthetic */ C24055a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24054a mo61566a(boolean z) {
            C24054a aVar = new C24054a();
            aVar.setViewPagerFragment(z);
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.a$b */
    static final class C24056b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24054a f62405d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24056b(C24054a aVar) {
            super(1);
            this.f62405d = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            TabsGroupView tabsGroupView = this.f62405d.m77588v1().f72018f;
            C41536l.m120488h(tabsGroupView, "binding.discoveryPageTabs");
            C41536l.m120488h(bool, "isVisible");
            tabsGroupView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.a$c */
    static final class C24057c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62406a;

        C24057c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62406a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62406a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62406a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.a$d */
    public static final class C24058d extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ C24054a f62407a;

        C24058d(C24054a aVar) {
            this.f62407a = aVar;
        }

        public void onPageSelected(int i) {
            C21507e n1;
            super.onPageSelected(i);
            this.f62407a.m77589x1().mo61561jw(i);
            List o1 = this.f62407a.f62403j;
            C24054a aVar = this.f62407a;
            int i2 = 0;
            for (Object next : o1) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C41341q.m119917t();
                }
                C35651n1 n1Var = (C35651n1) next;
                if (i2 == i) {
                    C41536l.m120487g(n1Var, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.ViewPagerFragment");
                    aVar.f62404k = (C21507e) n1Var;
                    if (aVar.m77589x1().mo61560iw() && (n1 = aVar.f62404k) != null) {
                        n1.mo41971b3();
                    }
                } else {
                    C41536l.m120487g(n1Var, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.ViewPagerFragment");
                    ((C21507e) n1Var).mo41972d3();
                }
                i2 = i3;
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.a$e */
    public static final class C24059e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62408d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24059e(Fragment fragment) {
            super(0);
            this.f62408d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f62408d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.a$f */
    public static final class C24060f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62409d;

        /* renamed from: e */
        final /* synthetic */ Fragment f62410e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24060f(C43064a aVar, Fragment fragment) {
            super(0);
            this.f62409d = aVar;
            this.f62410e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62409d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f62410e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.a$g */
    public static final class C24061g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f62411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24061g(Fragment fragment) {
            super(0);
            this.f62411d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f62411d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: A1 */
    private final void m77574A1() {
        ViewPager2 viewPager2 = m77588v1().f72019g;
        viewPager2.mo6603h(new C24058d(this));
        viewPager2.setUserInputEnabled(false);
        List list = this.f62403j;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C1593j lifecycle = getLifecycle();
        C41536l.m120488h(lifecycle, "lifecycle");
        C30065j jVar = new C30065j(list, childFragmentManager, lifecycle);
        this.f62401h = jVar;
        viewPager2.setAdapter(jVar);
    }

    /* renamed from: q1 */
    private final void m77583q1() {
        getParentFragmentManager().mo4367F1("REQUEST_KEY_SWITCH_ON_GIFT_CARD_TAB", getViewLifecycleOwner(), new C30056a(this));
        getParentFragmentManager().mo4367F1("REQUEST_KEY_SWITCH_ON_GIFT_CARD_PUSH_NOTIFICATION", getViewLifecycleOwner(), new C30057b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m77584r1(C24054a aVar, String str, Bundle bundle) {
        TabLayout.C5153g tabAt;
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_ON_GIFT_CARD_TAB_SWITCHED") && (tabAt = aVar.m77588v1().f72018f.getTabAt(1)) != null) {
            tabAt.mo16964m();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m77585s1(C24054a aVar, String str, Bundle bundle) {
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "<anonymous parameter 1>");
        aVar.m77588v1().f72019g.setCurrentItem(1);
    }

    /* renamed from: t1 */
    private final void m77586t1() {
        new C5161d(m77588v1().f72018f, m77588v1().f72019g, true, false, new C30058c()).mo16990a();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m77587u1(TabLayout.C5153g gVar, int i) {
        C41536l.m120489i(gVar, "tab");
        if (i == 0) {
            gVar.mo16972u(C32343x.m95388F("text.discovery.page.tab.offers", new Object[0]));
        } else if (i == 1) {
            gVar.mo16972u(C32343x.m95388F("text.discovery.page.tab.giftcard", new Object[0]));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final C28398f m77588v1() {
        C28398f fVar = this.f62400g;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final DiscoveryFragmentContainerViewModel$ViewModel m77589x1() {
        return (DiscoveryFragmentContainerViewModel$ViewModel) this.f62402i.getValue();
    }

    /* renamed from: y1 */
    private final void m77590y1() {
        m77589x1().mo61559hw().mo4819k(getViewLifecycleOwner(), new C24057c(new C24056b(this)));
    }

    /* renamed from: z1 */
    private final void m77591z1() {
        TabsGroupView tabsGroupView = m77588v1().f72018f;
        List<TabLayout.C5153g> m = C41341q.m119910m(tabsGroupView.newTab(), tabsGroupView.newTab());
        tabsGroupView.addOnTabSelectedListener((TabLayout.C5149d) new C30066k());
        for (TabLayout.C5153g addTab : m) {
            tabsGroupView.addTab(addTab, false);
        }
    }

    /* renamed from: b3 */
    public void mo41971b3() {
        m77589x1().mo61557fw().mo61564qn(true);
        C21507e eVar = this.f62404k;
        if (eVar != null) {
            eVar.mo41971b3();
        }
    }

    /* renamed from: d3 */
    public void mo41972d3() {
        m77589x1().mo61557fw().mo61564qn(false);
        C21507e eVar = this.f62404k;
        if (eVar != null) {
            eVar.mo41972d3();
        }
    }

    public String getHeaderText() {
        return C32343x.m95388F("text.discovery.page.header", new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f62400g = C28398f.m87114d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m77588v1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f62400g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        this.f62403j = C41341q.m119910m(C38125h.m112238c(requireActivity).mo91608i(isViewPagerFragment()), new C29424e());
        m77591z1();
        m77574A1();
        m77586t1();
        m77590y1();
        m77583q1();
        TabLayout.C5153g tabAt = m77588v1().f72018f.getTabAt(m77589x1().mo61558gw());
        if (tabAt != null) {
            tabAt.mo16964m();
        }
    }
}
