package p341ge.bog.mobilebank.categorypackages.presentation.packagelist;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.categorypackages.presentation.packagelist.C14787c;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p356ao.C10114f;
import p380ck.C10463g;
import p380ck.C10464h;
import p413eo.C12768s;
import p554op.C17294a;
import p554op.C17297b;
import p554op.C17317j;
import p554op.C17320k;
import p554op.C17321l;
import p554op.C17322m;
import p554op.C17323n;
import p554op.C17324o;
import p554op.C17325p;
import p554op.C17326q;
import p554op.C17327r;
import p568pp.C17480d;
import p610sp.C17913e;
import p642vh.C18338b0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment */
public final class PackageListFragment extends C14785a {

    /* renamed from: o */
    public static final C14761a f42796o = new C14761a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C12768s f42797g;

    /* renamed from: h */
    private final C41217g f42798h = C41219i.m119470b(new C14764d(this));

    /* renamed from: i */
    private final C41217g f42799i = C41219i.m119470b(new C14775n(this));

    /* renamed from: j */
    private boolean f42800j;

    /* renamed from: k */
    public C14787c.C14789b f42801k;

    /* renamed from: l */
    private final C41217g f42802l;

    /* renamed from: m */
    private final C41217g f42803m;

    /* renamed from: n */
    private final C41217g f42804n;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$a */
    public static final class C14761a {
        private C14761a() {
        }

        public /* synthetic */ C14761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$b */
    public static final class C14762b extends RecyclerView.C1746o {

        /* renamed from: a */
        private final int f42805a;

        public C14762b(Context context, int i) {
            C41536l.m120489i(context, "context");
            this.f42805a = (int) context.getResources().getDimension(i);
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            int i = this.f42805a;
            rect.right = i;
            rect.left = i;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$c */
    static final class C14763c extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14763c f42806d = new C14763c();

        C14763c() {
            super(0);
        }

        /* renamed from: b */
        public final C17294a invoke() {
            return new C17294a();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$d */
    static final class C14764d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageListFragment f42807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14764d(PackageListFragment packageListFragment) {
            super(0);
            this.f42807d = packageListFragment;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f42807d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("forceSoloColor", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$e */
    /* synthetic */ class C14765e extends C41535k implements C43075l {
        C14765e(Object obj) {
            super(1, obj, PackageListFragment.class, "onPackagesData", "onPackagesData(Lge/bog/mobilebank/categorypackages/presentation/shared/model/PackagePageData;)V", 0);
        }

        /* renamed from: b */
        public final void mo41201b(C17480d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((PackageListFragment) this.receiver).m54327K1(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41201b((C17480d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$f */
    /* synthetic */ class C14766f extends C41535k implements C43075l {
        C14766f(Object obj) {
            super(1, obj, PackageListFragment.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo41202b(boolean z) {
            ((PackageListFragment) this.receiver).m54326J1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41202b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$g */
    /* synthetic */ class C14767g extends C41535k implements C43075l {
        C14767g(Object obj) {
            super(1, obj, PackageListFragment.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo41203b(Throwable th) {
            C41536l.m120489i(th, "p0");
            ((PackageListFragment) this.receiver).m54325I1(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41203b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$h */
    /* synthetic */ class C14768h extends C41535k implements C43075l {
        C14768h(Object obj) {
            super(1, obj, PackageListFragment.class, "openPackageDetails", "openPackageDetails(Lge/bog/mobilebank/cleanarch/moremenu/presentation/PackageType;)V", 0);
        }

        /* renamed from: b */
        public final void mo41204b(PackageType packageType) {
            C41536l.m120489i(packageType, "p0");
            ((PackageListFragment) this.receiver).m54329M1(packageType);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41204b((PackageType) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$i */
    static final class C14769i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageListFragment f42808d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$i$a */
        /* synthetic */ class C14770a extends C41535k implements C43075l {
            C14770a(Object obj) {
                super(1, obj, PackageListFragment.class, "startSoloApplication", "startSoloApplication(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
            }

            /* renamed from: b */
            public final void mo41206b(SoloApplicationFormData soloApplicationFormData) {
                C41536l.m120489i(soloApplicationFormData, "p0");
                ((PackageListFragment) this.receiver).m54341Y1(soloApplicationFormData);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41206b((SoloApplicationFormData) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14769i(PackageListFragment packageListFragment) {
            super(1);
            this.f42808d = packageListFragment;
        }

        /* renamed from: a */
        public final void mo41205a(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "it");
            C17913e.m61723e(soloApplicationFormData, this.f42808d.m54323G1().mo41215Cw().mo41224vv(), new C14770a(this.f42808d), this.f42808d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41205a((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$j */
    /* synthetic */ class C14771j extends C41535k implements C43075l {
        C14771j(Object obj) {
            super(1, obj, PackageListFragment.class, "selectedButtonState", "selectedButtonState(Lge/bog/mobilebank/categorypackages/presentation/packagelist/ButtonState;)V", 0);
        }

        /* renamed from: b */
        public final void mo41207b(C17297b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((PackageListFragment) this.receiver).m54332P1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41207b((C17297b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$k */
    static final class C14772k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageListFragment f42809d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14772k(PackageListFragment packageListFragment) {
            super(1);
            this.f42809d = packageListFragment;
        }

        /* renamed from: a */
        public final void mo41208a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f42809d.m54342Z1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41208a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$l */
    static final class C14773l extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14773l f42810d = new C14773l();

        C14773l() {
            super(0);
        }

        /* renamed from: b */
        public final C17317j invoke() {
            return new C17317j();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$m */
    static final class C14774m implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42811a;

        C14774m(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42811a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42811a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42811a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$n */
    static final class C14775n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageListFragment f42812d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14775n(PackageListFragment packageListFragment) {
            super(0);
            this.f42812d = packageListFragment;
        }

        public final String invoke() {
            Bundle arguments = this.f42812d.getArguments();
            if (arguments != null) {
                return arguments.getString("scrollToPackage", (String) null);
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$o */
    public static final class C14776o extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ PackageListFragment f42813a;

        C14776o(PackageListFragment packageListFragment) {
            this.f42813a = packageListFragment;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f42813a.m54333Q1(i);
            this.f42813a.m54323G1().mo41215Cw().mo41223Lw(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$p */
    public static final class C14777p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14777p(Fragment fragment) {
            super(0);
            this.f42814d = fragment;
        }

        public final Fragment invoke() {
            return this.f42814d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$q */
    public static final class C14778q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14778q(C43064a aVar) {
            super(0);
            this.f42815d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42815d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$r */
    public static final class C14779r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14779r(C41217g gVar) {
            super(0);
            this.f42816d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42816d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$s */
    public static final class C14780s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42817d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42818e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14780s(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42817d = aVar;
            this.f42818e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42817d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42818e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$t */
    public static final class C14781t extends ViewPager2.C1928i {

        /* renamed from: a */
        private int f42819a;

        /* renamed from: b */
        final /* synthetic */ PackageListFragment f42820b;

        C14781t(PackageListFragment packageListFragment) {
            this.f42820b = packageListFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m54375b(PackageListFragment packageListFragment) {
            C41536l.m120489i(packageListFragment, "this$0");
            packageListFragment.m54319B1().f37855n.setCurrentItem(packageListFragment.m54319B1().f37848g.getCurrentItem());
        }

        public void onPageScrollStateChanged(int i) {
            this.f42819a = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (this.f42819a != 0 && this.f42820b.m54319B1().f37855n.getCurrentItem() != this.f42820b.m54319B1().f37848g.getCurrentItem()) {
                this.f42820b.m54319B1().f37855n.post(new C17326q(this.f42820b));
            }
        }

        public void onPageSelected(int i) {
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$u */
    public static final class C14782u extends ViewPager2.C1928i {

        /* renamed from: a */
        private int f42821a;

        /* renamed from: b */
        final /* synthetic */ PackageListFragment f42822b;

        C14782u(PackageListFragment packageListFragment) {
            this.f42822b = packageListFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m54377b(PackageListFragment packageListFragment) {
            C41536l.m120489i(packageListFragment, "this$0");
            packageListFragment.m54319B1().f37848g.setCurrentItem(packageListFragment.m54319B1().f37855n.getCurrentItem());
        }

        public void onPageScrollStateChanged(int i) {
            this.f42821a = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (this.f42821a != 0 && this.f42822b.m54319B1().f37855n.getCurrentItem() != this.f42822b.m54319B1().f37848g.getCurrentItem()) {
                this.f42822b.m54319B1().f37855n.post(new C17327r(this.f42822b));
            }
        }

        public void onPageSelected(int i) {
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$v */
    static final class C14783v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageListFragment f42823d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment$v$a */
        static final class C14784a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PackageListFragment f42824d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14784a(PackageListFragment packageListFragment) {
                super(0);
                this.f42824d = packageListFragment;
            }

            /* renamed from: b */
            public final C14787c invoke() {
                return this.f42824d.mo41198C1().mo32784a(this.f42824d.m54320D1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14783v(PackageListFragment packageListFragment) {
            super(0);
            this.f42823d = packageListFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14784a(this.f42823d));
        }
    }

    public PackageListFragment() {
        C14783v vVar = new C14783v(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14778q(new C14777p(this)));
        this.f42802l = C1514j0.m5374c(this, C41520a0.m120436b(C14787c.class), new C14779r(a), new C14780s((C43064a) null, a), vVar);
        this.f42803m = C41219i.m119470b(C14763c.f42806d);
        this.f42804n = C41219i.m119470b(C14773l.f42810d);
    }

    /* renamed from: A1 */
    private final C17294a m54318A1() {
        return (C17294a) this.f42803m.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final C12768s m54319B1() {
        C12768s sVar = this.f42797g;
        C41536l.m120486f(sVar);
        return sVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final boolean m54320D1() {
        return ((Boolean) this.f42798h.getValue()).booleanValue();
    }

    /* renamed from: E1 */
    private final C17317j m54321E1() {
        return (C17317j) this.f42804n.getValue();
    }

    /* renamed from: F1 */
    private final String m54322F1() {
        return (String) this.f42799i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public final C14787c m54323G1() {
        return (C14787c) this.f42802l.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: H1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m54324H1(java.util.List r7) {
        /*
            r6 = this;
            boolean r0 = r6.f42800j
            if (r0 != 0) goto L_0x007b
            r0 = 1
            r6.f42800j = r0
            java.lang.String r1 = r6.m54322F1()
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = r2
            goto L_0x0018
        L_0x0017:
            r1 = r0
        L_0x0018:
            r3 = -1
            if (r1 != 0) goto L_0x0049
            java.util.Iterator r7 = r7.iterator()
            r1 = r2
        L_0x0020:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r7.next()
            pp.b r4 = (p568pp.C17472b) r4
            boolean r5 = r4 instanceof p568pp.C17472b.C17474b
            if (r5 == 0) goto L_0x0042
            pp.b$b r4 = (p568pp.C17472b.C17474b) r4
            java.lang.String r4 = r4.mo44996j()
            java.lang.String r5 = r6.m54322F1()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0042
            r4 = r0
            goto L_0x0043
        L_0x0042:
            r4 = r2
        L_0x0043:
            if (r4 == 0) goto L_0x0046
            goto L_0x0071
        L_0x0046:
            int r1 = r1 + 1
            goto L_0x0020
        L_0x0049:
            java.util.Iterator r7 = r7.iterator()
            r1 = r2
        L_0x004e:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r7.next()
            pp.b r4 = (p568pp.C17472b) r4
            boolean r5 = r4 instanceof p568pp.C17472b.C17474b
            if (r5 == 0) goto L_0x006e
            pp.b$b r4 = (p568pp.C17472b.C17474b) r4
            java.lang.Boolean r4 = r4.mo44999m()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x006e
            r4 = r0
            goto L_0x006f
        L_0x006e:
            r4 = r2
        L_0x006f:
            if (r4 == 0) goto L_0x0073
        L_0x0071:
            r3 = r1
            goto L_0x0076
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x004e
        L_0x0076:
            if (r3 < 0) goto L_0x007b
            r6.m54330N1(r3)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment.m54324H1(java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m54325I1(Throwable th) {
        CoordinatorLayout coordinatorLayout = m54319B1().f37850i;
        C41536l.m120488h(coordinatorLayout, "binding.contentLayout");
        C32343x.m95455i0(coordinatorLayout);
        LoadingView loadingView = m54319B1().f37858q;
        C41536l.m120488h(loadingView, "binding.skeletonLoading");
        C32343x.m95455i0(loadingView);
        LinearLayout linearLayout = m54319B1().f37852k;
        C41536l.m120488h(linearLayout, "binding.errorView");
        C32343x.m95447f1(linearLayout);
        handleError(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m54326J1(boolean z) {
        LayerView layerView = m54319B1().f37849h;
        C41536l.m120488h(layerView, "binding.buttonContainer");
        C32343x.m95483r1(layerView, !z, false, 2, (Object) null);
        CoordinatorLayout coordinatorLayout = m54319B1().f37850i;
        C41536l.m120488h(coordinatorLayout, "binding.contentLayout");
        C32343x.m95483r1(coordinatorLayout, !z, false, 2, (Object) null);
        LoadingView loadingView = m54319B1().f37858q;
        C41536l.m120488h(loadingView, "binding.skeletonLoading");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final void m54327K1(C17480d dVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar.mo45004c() != null) {
            arrayList.addAll(dVar.mo45004c());
        }
        if (!dVar.mo45002a().mo44981a().isEmpty()) {
            arrayList.add(dVar.mo45002a());
        }
        m54319B1().f37855n.setCurrentItem(0);
        m54321E1().mo6030j(arrayList, new C17320k(this, arrayList));
        m54318A1().mo6029i(dVar.mo45003b());
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m54328L1(PackageListFragment packageListFragment, List list) {
        C41536l.m120489i(packageListFragment, "this$0");
        C41536l.m120489i(list, "$items");
        packageListFragment.m54334R1(list.size());
        packageListFragment.m54324H1(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m54329M1(PackageType packageType) {
        C8034d.m30522a(this).mo22118M(C10114f.packageDetailsFragment, C0908e.m3336b(C41233s.m119492a("package_type", packageType)));
    }

    /* renamed from: N1 */
    private final void m54330N1(int i) {
        m54319B1().f37855n.postDelayed(new C17325p(this, i), 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m54331O1(PackageListFragment packageListFragment, int i) {
        ViewPager2 viewPager2;
        C41536l.m120489i(packageListFragment, "this$0");
        C12768s sVar = packageListFragment.f42797g;
        if (sVar != null && (viewPager2 = sVar.f37855n) != null) {
            viewPager2.mo6606l(i, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final void m54332P1(C17297b bVar) {
        int i;
        int i2;
        Button button = m54319B1().f37851j;
        C41536l.m120488h(button, "binding.detailsButton");
        int i3 = 8;
        if (bVar.mo44691f()) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        Button button2 = m54319B1().f37846e;
        C41536l.m120488h(button2, "binding.activateButton");
        if (bVar.mo44688b()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        button2.setVisibility(i2);
        Button button3 = m54319B1().f37847f;
        C41536l.m120488h(button3, "binding.becomeSoloButton");
        if (bVar.mo44689c()) {
            i3 = 0;
        }
        button3.setVisibility(i3);
        m54319B1().f37851j.setButtonText(C32343x.m95388F(bVar.mo44690e(), new Object[0]));
        m54319B1().f37846e.setButtonText(C32343x.m95388F(bVar.mo44690e(), new Object[0]));
        m54319B1().f37847f.setButtonText(C32343x.m95388F(bVar.mo44690e(), new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public final void m54333Q1(int i) {
        C36546y.m108282F().mo27152s("packages_page", m54323G1().mo41218Fw(i), "package_impression");
        C10463g F = C36546y.m108282F();
        String Fw = m54323G1().mo41218Fw(i);
        F.mo27137H("packages_page_impression_" + Fw, "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
    }

    /* renamed from: R1 */
    private final void m54334R1(int i) {
        m54319B1().f37855n.setCurrentItem(0);
        if (i > 0) {
            m54319B1().f37855n.setOffscreenPageLimit(i);
            C18338b0.C18341c cVar = new C18338b0.C18341c(0, false, 3, (DefaultConstructorMarker) null);
            ViewPager2 viewPager2 = m54319B1().f37855n;
            C41536l.m120488h(viewPager2, "binding.pager");
            FrameLayout frameLayout = m54319B1().f37857p;
            C41536l.m120488h(frameLayout, "binding.scrollingIndicator");
            cVar.mo46116a(viewPager2, frameLayout);
        }
    }

    /* renamed from: S1 */
    private final void m54335S1() {
        m54319B1().f37854m.setTitle(C32343x.m95388F("text.packages.cpmpare.page.header", new Object[0]));
        m54319B1().f37854m.setText(C32343x.m95388F("text.packages.cpmpare.page.details", new Object[0]));
    }

    /* renamed from: T1 */
    private final void m54336T1() {
        ViewPager2 viewPager2 = m54319B1().f37855n;
        C41536l.m120488h(viewPager2, "setUpViews$lambda$0");
        C17913e.m61725g(viewPager2);
        viewPager2.setAdapter(m54321E1());
        viewPager2.mo6603h(new C14776o(this));
        m54319B1().f37856o.setOnClickListener(new C17321l(this));
        m54319B1().f37848g.setAdapter(m54318A1());
        m54319B1().f37846e.setOnClickListener(new C17322m(this));
        m54319B1().f37851j.setOnClickListener(new C17323n(this));
        m54319B1().f37847f.setOnClickListener(new C17324o(this));
        m54343a2();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m54337U1(PackageListFragment packageListFragment, View view) {
        C41536l.m120489i(packageListFragment, "this$0");
        LinearLayout linearLayout = packageListFragment.m54319B1().f37852k;
        C41536l.m120488h(linearLayout, "binding.errorView");
        C32343x.m95455i0(linearLayout);
        C21481a.onRefresh$default(packageListFragment.m54323G1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m54338V1(PackageListFragment packageListFragment, View view) {
        C41536l.m120489i(packageListFragment, "this$0");
        packageListFragment.m54323G1().mo41215Cw().mo41226z0(packageListFragment.m54319B1().f37855n.getCurrentItem());
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m54339W1(PackageListFragment packageListFragment, View view) {
        C41536l.m120489i(packageListFragment, "this$0");
        packageListFragment.m54323G1().mo41215Cw().mo41226z0(packageListFragment.m54319B1().f37855n.getCurrentItem());
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m54340X1(PackageListFragment packageListFragment, View view) {
        C41536l.m120489i(packageListFragment, "this$0");
        packageListFragment.m54323G1().mo41215Cw().mo41226z0(packageListFragment.m54319B1().f37855n.getCurrentItem());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m54341Y1(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.solo_application_nav_graph, ApplicationNavigatorFragment.C14458a.m53506b(ApplicationNavigatorFragment.f42261B, soloApplicationFormData, false, 2, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public final void m54342Z1() {
        C36546y.m108282F().mo27152s("packages_page", "", "see_solo_button");
        C36546y.m108282F().mo27137H("packages_page_see_solo_button", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        C7556l a = C8034d.m30522a(this);
        int i = C10114f.action_packagesListFragment_self;
        Bundle bundle = new Bundle();
        bundle.putBoolean("forceSoloColor", true);
        C41238w wVar = C41238w.f97225a;
        a.mo22118M(i, bundle);
    }

    /* renamed from: a2 */
    private final void m54343a2() {
        C14782u uVar = new C14782u(this);
        C14781t tVar = new C14781t(this);
        m54319B1().f37855n.mo6603h(uVar);
        m54319B1().f37848g.mo6603h(tVar);
    }

    private final void observeData() {
        C14787c Ew = m54323G1().mo41217Ew();
        Ew.mo41219Gw().mo4819k(getViewLifecycleOwner(), new C14774m(new C14765e(this)));
        Ew.mo41214Bw().mo4819k(getViewLifecycleOwner(), new C14774m(new C14766f(this)));
        Ew.mo41225x0().mo4819k(getViewLifecycleOwner(), new C14774m(new C14767g(this)));
        LiveData Dw = Ew.mo41216Dw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Dw, viewLifecycleOwner, new C14768h(this));
        LiveData zu = Ew.mo41227zu();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(zu, viewLifecycleOwner2, new C14769i(this));
        Ew.mo41213Aw().mo4819k(getViewLifecycleOwner(), new C14774m(new C14771j(this)));
        LiveData Hw = m54323G1().mo41220Hw();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(Hw, viewLifecycleOwner3, new C14772k(this));
    }

    /* renamed from: C1 */
    public final C14787c.C14789b mo41198C1() {
        C14787c.C14789b bVar = this.f42801k;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public String getHeaderText() {
        return C32343x.m95388F("text.packages.general.name", new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17913e.m61728j(this, m54323G1().mo41215Cw().mo41221Iw());
        this.f42797g = C12768s.m48471d(getLayoutInflater());
        ConstraintLayout c = m54319B1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42797g = null;
    }

    public void onResume() {
        super.onResume();
        C17913e.m61729k(this, m54323G1().mo41215Cw().mo41221Iw());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m54336T1();
        m54335S1();
        observeData();
    }
}
