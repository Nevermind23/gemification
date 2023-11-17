package p341ge.bog.mobilebank.p975ui.fragments;

import a81.C30753r4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import g91.C32343x;
import ge1.C41084a;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.p975ui.activities.MainActivityViewModel$ViewModel;
import p366bk.C10328q;
import p748eu.C20292b;
import p90.C27288e4;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.fragments.i1 */
public final class C35612i1 extends C35653o0 implements C21507e {

    /* renamed from: n */
    public static final C35614b f86104n = new C35614b((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C27288e4 f86105g;

    /* renamed from: h */
    private final C41217g f86106h = C1514j0.m5374c(this, C41520a0.m120436b(MainActivityViewModel$ViewModel.class), new C35620g(this), new C35621h((C43064a) null, this), new C35622i(this));

    /* renamed from: i */
    private final C41217g f86107i = C41219i.m119470b(C35617e.f86117d);

    /* renamed from: j */
    private final C41217g f86108j = C41219i.m119470b(C35616d.f86116d);

    /* renamed from: k */
    public C41084a f86109k;

    /* renamed from: l */
    public C41084a f86110l;

    /* renamed from: m */
    public C20292b f86111m;

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$a */
    private static final class C35613a extends FragmentStateAdapter {

        /* renamed from: l */
        private final boolean f86112l;

        /* renamed from: m */
        private final C41084a f86113m;

        /* renamed from: n */
        private final C41084a f86114n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35613a(boolean z, Fragment fragment, C41084a aVar, C41084a aVar2) {
            super(fragment);
            C41536l.m120489i(fragment, "parent");
            C41536l.m120489i(aVar, "bogProductFragmentProvider");
            C41536l.m120489i(aVar2, "otherBanksFragmentProvider");
            this.f86112l = z;
            this.f86113m = aVar;
            this.f86114n = aVar2;
        }

        public int getItemCount() {
            return this.f86112l ? 2 : 1;
        }

        /* renamed from: h */
        public Fragment mo6571h(int i) {
            if (i == 0) {
                Object obj = this.f86113m.get();
                C41536l.m120488h(obj, "bogProductFragmentProvider.get()");
                return (Fragment) obj;
            } else if (i == 1) {
                Object obj2 = this.f86114n.get();
                C41536l.m120488h(obj2, "otherBanksFragmentProvider.get()");
                return (Fragment) obj2;
            } else {
                throw new IllegalStateException("Invalid fragment position".toString());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$b */
    public static final class C35614b {
        private C35614b() {
        }

        public /* synthetic */ C35614b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$c */
    static final class C35615c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35612i1 f86115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35615c(C35612i1 i1Var) {
            super(1);
            this.f86115d = i1Var;
        }

        /* renamed from: a */
        public final void mo86686a(C37223a aVar) {
            C30753r4 r4Var = (C30753r4) aVar.mo90296a();
            if (r4Var != null) {
                C35612i1 i1Var = this.f86115d;
                if (r4Var == C30753r4.BOG_PRODUCTS) {
                    i1Var.m105775u1();
                } else if (r4Var == C30753r4.OPEN_BANKING_PRODUCTS) {
                    i1Var.m105776v1();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86686a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$d */
    static final class C35616d extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C35616d f86116d = new C35616d();

        C35616d() {
            super(0);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$e */
    static final class C35617e extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C35617e f86117d = new C35617e();

        /* renamed from: ge.bog.mobilebank.ui.fragments.i1$e$a */
        public static final class C35618a extends ViewPager2.C1928i {
            C35618a() {
            }

            public void onPageSelected(int i) {
                super.onPageSelected(i);
                if (i == 1) {
                    C36546y.m108282F().mo27152s("open_banking", (String) null, "click_tab");
                }
            }
        }

        C35617e() {
            super(0);
        }

        /* renamed from: b */
        public final C35618a invoke() {
            return new C35618a();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$f */
    static final class C35619f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f86118a;

        C35619f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f86118a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f86118a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f86118a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$g */
    public static final class C35620g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f86119d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35620g(Fragment fragment) {
            super(0);
            this.f86119d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f86119d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$h */
    public static final class C35621h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f86120d;

        /* renamed from: e */
        final /* synthetic */ Fragment f86121e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35621h(C43064a aVar, Fragment fragment) {
            super(0);
            this.f86120d = aVar;
            this.f86121e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f86120d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f86121e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.i1$i */
    public static final class C35622i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f86122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35622i(Fragment fragment) {
            super(0);
            this.f86122d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f86122d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public C35612i1() {
        setViewPagerFragment(true);
    }

    /* renamed from: l1 */
    private final C27288e4 m105769l1() {
        C27288e4 e4Var = this.f86105g;
        C41536l.m120486f(e4Var);
        return e4Var;
    }

    /* renamed from: n1 */
    private final C35617e.C35618a m105770n1() {
        return (C35617e.C35618a) this.f86107i.getValue();
    }

    /* renamed from: p1 */
    private final MainActivityViewModel$ViewModel m105771p1() {
        return (MainActivityViewModel$ViewModel) this.f86106h.getValue();
    }

    /* renamed from: q1 */
    private final void m105772q1() {
        m105769l1().f68649f.setAdapter(new C35613a(m105774s1(), this, mo86683m1(), mo86684o1()));
        new C5161d(m105769l1().f68648e, m105769l1().f68649f, new C35609h1(this)).mo16990a();
        TabsView tabsView = m105769l1().f68648e;
        C41536l.m120488h(tabsView, "binding.productsTabLayout");
        C32343x.m95483r1(tabsView, m105774s1(), false, 2, (Object) null);
        m105775u1();
        m105771p1().f84959G.mo70967an().mo4819k(getViewLifecycleOwner(), new C35619f(new C35615c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m105773r1(C35612i1 i1Var, TabLayout.C5153g gVar, int i) {
        C41536l.m120489i(i1Var, "this$0");
        C41536l.m120489i(gVar, "<anonymous parameter 0>");
        i1Var.m105769l1().f68649f.setCurrentItem(i);
    }

    /* renamed from: s1 */
    private final boolean m105774s1() {
        return ((Boolean) this.f86108j.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m105775u1() {
        m105769l1().f68649f.setCurrentItem(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m105776v1() {
        if (m105774s1()) {
            m105769l1().f68649f.setCurrentItem(1);
        }
    }

    /* renamed from: b3 */
    public void mo41971b3() {
        if (m105769l1().f68649f.getAdapter() == null) {
            m105772q1();
        }
        m105769l1().f68649f.mo6603h(m105770n1());
    }

    /* renamed from: d3 */
    public void mo41972d3() {
        m105769l1().f68649f.mo6614p(m105770n1());
    }

    public String getHeaderText() {
        String string = getString(C10328q.header_text_products);
        C41536l.m120488h(string, "getString(R.string.header_text_products)");
        return string;
    }

    /* renamed from: m1 */
    public final C41084a mo86683m1() {
        C41084a aVar = this.f86110l;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("bogProductsFragment");
        return null;
    }

    /* renamed from: o1 */
    public final C41084a mo86684o1() {
        C41084a aVar = this.f86109k;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("otherBanksProductsFragment");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f86105g = C27288e4.m84454d(layoutInflater, viewGroup, false);
        LinearLayout c = m105769l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86105g = null;
    }

    /* renamed from: t1 */
    public final void mo86685t1() {
        m105769l1().f68649f.setAdapter(new C35613a(m105774s1(), this, mo86683m1(), mo86684o1()));
    }
}
