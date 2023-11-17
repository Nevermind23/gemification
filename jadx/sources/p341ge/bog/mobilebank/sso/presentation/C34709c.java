package p341ge.bog.mobilebank.sso.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import qc1.C42216e0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.sso.presentation.c */
public final class C34709c extends C34706a {

    /* renamed from: h */
    public static final C34710a f83889h = new C34710a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private final C41217g f83890g;

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$a */
    public static final class C34710a {
        private C34710a() {
        }

        public /* synthetic */ C34710a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C34709c mo84786a() {
            C34709c cVar = new C34709c();
            cVar.setViewPagerFragment(true);
            return cVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$b */
    static final class C34711b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34711b f83891d = new C34711b();

        C34711b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo84787a(C41238w wVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84787a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$c */
    static final class C34712c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83892a;

        C34712c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83892a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83892a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83892a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$d */
    public static final class C34713d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34713d(Fragment fragment) {
            super(0);
            this.f83893d = fragment;
        }

        public final Fragment invoke() {
            return this.f83893d;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$e */
    public static final class C34714e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34714e(C43064a aVar) {
            super(0);
            this.f83894d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f83894d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$f */
    public static final class C34715f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f83895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34715f(C41217g gVar) {
            super(0);
            this.f83895d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f83895d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$g */
    public static final class C34716g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83896d;

        /* renamed from: e */
        final /* synthetic */ C41217g f83897e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34716g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f83896d = aVar;
            this.f83897e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83896d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f83897e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.c$h */
    public static final class C34717h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f83898d;

        /* renamed from: e */
        final /* synthetic */ C41217g f83899e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34717h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f83898d = fragment;
            this.f83899e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f83899e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f83898d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C34709c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C34714e(new C34713d(this)));
        this.f83890g = C1514j0.m5374c(this, C41520a0.m120436b(LoginViewModel.class), new C34715f(a), new C34716g((C43064a) null, a), new C34717h(this, a));
    }

    /* renamed from: j1 */
    private final C42216e0 m101934j1() {
        FragmentContainerView fragmentContainerView = (FragmentContainerView) findView(C10322k.sso_frg_cont);
        if (fragmentContainerView != null) {
            return (C42216e0) fragmentContainerView.getFragment();
        }
        return null;
    }

    /* renamed from: k1 */
    private final LoginViewModel m101935k1() {
        return (LoginViewModel) this.f83890g.getValue();
    }

    /* renamed from: l1 */
    public static final C34709c m101936l1() {
        return f83889h.mo84786a();
    }

    public String getHeaderText() {
        String string = getString(C10328q.navigation_title_home);
        C41536l.m120488h(string, "getString(R.string.navigation_title_home)");
        return string;
    }

    /* renamed from: i1 */
    public final void mo84785i1(boolean z) {
        C42216e0 j1 = m101934j1();
        if (j1 == null) {
            return;
        }
        if (z) {
            j1.mo97696d2();
        } else {
            j1.mo97697e2();
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_sso_login;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m101935k1().mo84776iw().mo4819k(getViewLifecycleOwner(), new C34712c(C34711b.f83891d));
        LoginViewModel k1 = m101935k1();
        int i = C10322k.sso_frg_cont;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        k1.mo84775fw(i, childFragmentManager);
    }
}
